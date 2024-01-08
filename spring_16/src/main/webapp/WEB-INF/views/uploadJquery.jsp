<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	.uploadResult{
		width : 100%;
		background-color: gray;
	}
	.uploadResult ul{
		display : flex;
		flex-flow : row;
		justify-content : center;
		align-items : center;
	}
	.uploadResult ul li{
		list-style : none;
		padding : 10px;
		
	}
	.uploadResult ul li img{
		width : 50px;
	}
</style>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
	
	
	
<!-- jquery를 통해 파일 업로드할때 클라이언트단에서 업로드된 파일의 정보를 읽어 Ajax 방식으로 서버에 전송한다. -->
	<script type="text/javascript">
// 		ready : HTML 요소가 다 읽어지면 실행
		$(document).ready(function(){
// 			파일을 담기위한 객체 생성
// 			확장자가 exe,sh,js인 파일 업로드를 금지하기위한 정규식
			var regex = new RegExp("(.*?)\.(exe|sh|js)$")
			var maxSize = 5242880; // 5MB
			
// 			업로드할 파일이 들어있는 formdata안에 모든 키를 삭제하는 메소드 선언(초기화를 위해)
			function clearFormData(formData) {
			    // 모든 키를 순회하면서 삭제
//			for of 문 : 모든 원소를 순회하면서 각각의 원소를 가지고 반복문 실행 
			    for (var key of formData.keys()) { 
			        formData.delete(key);
			    }
			}
			
			function checkExtension(fileName,fileSize){
				if (fileSize>maxSize) {
					alert("파일 사이즈 초과");
					return false;		
				}
				if(regex.test(fileName)){
					alert("해당 종류의 파일은 업로드할 수 없습니다.");
					return false;
				}
				return true;
			}
			var formData = new FormData();
// 			업로드 하기전, 초기 HTML 상태의 uploadDiv요소를 복제해놓음 (업로드후 HTML요소 초기화를 위해)
			var cloneObj = $(".uploadDiv").clone();
			console.log("@#@CloneObj ===> "+cloneObj);
			
			$("#uploadBtn").on("click",function(){
// 				uploadFile이름의 input 속성을 변수로 받음
			var inputFile = $("input[name='uploadFile']");
// 			files : 파일 정보 속성
			var files = inputFile[0].files;
			console.log("files ==>"+files);
			
// 			files.length : 파일 갯수
			for (var i = 0; i < files.length; i++) {
// 				파일 크기와 종류가 false면 return(종료)
				if(!checkExtension(files[i].name,files[i].size)){
					return;
				}
// 				append(이름,파일): 파일 정보를 formData에 추가
				formData.append("uploadFile",files[i])
			}
			
// 			업로드한 파일에 대한 정보를 읽어 변수에 담았으니, ajax를 통해 서버에 전송 
			$.ajax({
// 				매핑된 Controll단 호출
// 				result로 파일 목록을 보내기 위해서 json 방식 사용
				url :"uploadAjaxAction.json"
// 				processData : true : 기본 key/value를 쿼리스트링으로 전송, false는 반대
				,processData : false
// 				contentType : 기본값- application/x-www-form-urlencoded; charset=UTF-8,
// 								첨부파일은 false : multipart/form-data로 전송됨
				,contentType : false
				,data : formData
				,type : "post"
				,success:function(result){
					alert("Uploaded");
					console.log("@@result ==>"+result);
// 					result 파일을 파라미터로 파일 목록을 출력하는 함수 실행
//					서버가 보낸 result는 List<AttachFileDTO>타입으로 json방식으로 받아야함 
					showUploadedFile(result);
// 					업로드후, 초기상태를 복제해놓은 cloneObj로 바꿔줌으로써 화면상의 초기화 
					$(".uploadDiv").html(cloneObj.html());
// 					업로드후, formData에 쌓인 업로드 데이터를 비우기위해 선언해놓은 초기화 메소드 실행
					clearFormData(formData);
					
				} // end of success
			}); // end of ajax
			
		}); // end of btn onclick
		
// 		<span>x 눌렀을 경우 삭제하는 메소드 생성
		$(".uploadResult").on("click","span",function(){
			
			var targetFile = $(this).data("file"); //<span data-file>값
			var type = $(this).data("type");
			var uploadResultItem = $(this).closest("li"); // 해당 span태그의 가장 가까운 <li>태그
			
			console.log("@# targetFile ==>> "+targetFile);
			console.log("@# type ==>> "+type);
			console.log("@# uploadResultItem ==>> "+uploadResultItem);
			
			$.ajax({
				url:"deleteFile"
				,data:{fileName: targetFile,type:type}
				,dataType:"text"
				,type:"post"
				,sucess: function(result){
					uploadResultItem.remove();
					alert(result);
					// 브라우저에서 해당 썸네일이나 첨부파일 이미지 제거
				}
			});
		}); // end of span function
			var uploadResult = $(".uploadResult ul");
		
// 		업로드 파일 목록 처리하는 function
		function showUploadedFile(uploadResultArr){
		
			console.log("@# uploadResultArr ==> "+uploadResultArr);
			var str = "";
// 			업로드 파일 갯수만큼 반복
			$(uploadResultArr).each(function(i,obj){
// 				
			
				if(!obj.image){ // 이미지 파일이 아닌경우 파일모양의 이미지 출력
// 					
					var fileCallPath=encodeURIComponent(obj.uploadPath+"/"+obj.uuid+"_"+obj.fileName);
// 					파일 다운로드하기위해 <a>태그에 컨트롤러 /download 메소드에 fileCallpath 넣어 호출
// 					str += "<li><div><a href='./download?filename="+fileCallPath+"'>"
// 							+"<img src='./resources/image/attach.png'>"+obj.fileName+"</a>"
// 							+"<span data-file=\'"+fileCallPath+"\' data-type='file'>x</span></div></li>";
					str += "<li><div><a href='./download?fileName="+fileCallPath+"'>"
					  +"<img src='./resources/img/attach.png'>"+obj.fileName+"</a>"
					  +"<span data-file=\'"+fileCallPath+"\' data-type='file'>x</span></div></li>";
						
							
							
				}else {	// 이미지 파일인 경우 썸네일 출력	
// 					썸네일 파일 경로 + 이름
					var fileCallPath=encodeURIComponent(obj.uploadPath+"/s_"+obj.uuid+"_"+obj.fileName);
				
					var originPath = obj.uploadPath+"\\"+obj.uuid+"_"+obj.fileName
// 					정규식 : 백슬래시(\)를 모두 슬래시(/)로 변경 
					originPath = originPath.replace(new RegExp(/\\/g),"/");
					console.log("@#@# originPath ===>"+originPath);
// 				obj.fileName : 업로드 파일 이름
// 				str += "<li>"+obj.fileName+"</li>";
//				<img>태그의 src에 컨트롤러의 /display경로의 getFile()메소드 호출 
// 				str += "<li><img src='./display?fileName="+fileCallPath+"'></li>";
					str += "<li><a href=\"javascript:showImage(\'"+originPath+"\')\"><img src='./display?fileName="
					+fileCallPath+"'></a><span data-file=\'"+fileCallPath+"\' data-type='image'>x</span></li>";
				
				
				}


			}); // end of each function
// 			div class에 파일 목록 추가
			uploadResult.append(str);
		} // end of showUploadedFile
		$(".bigPictureWrapper").on("click",function(){
			setTimeout(function(){ // 원본 이미지 클릭시 hide(1초)로 사라짐.
				$(".bigPictureWrapper").hide();
			},1000); // end of setTimeout
			}); //end of .bigPictureWrapper Click
		
	}); // end of ready function
		
// 	이미지를 보여주는 함수
	function showImage(fileCallPath){
// 		alert(fileCallPath);
		$(".bigPictureWrapper").css("display","flex").show();
		console.log("##@#@# fileCallpath : "+fileCallPath);
// 		bigPicture클래스의 div의 html요소에 컨트롤러 메소드 호출하여 원본 이미지 파일을 출력하는 img태그를 삽입한다. 
		$(".bigPicture").html("<img src='./display?fileName="+encodeURI(fileCallPath)+"'>")
		.animate({width:"100%",height:"100%"},1000);
	}
	
	
	</script>
</head>
<body>
	<h1>Upload with Jquery</h1>
	
	<div class="bigPictureWrapper">
		<div class="bigPicture">
		
		</div>
	</div>
	<div class="uploadDiv">
		<input type="file" name="uploadFile" multiple>
	</div>
	
	<div class="uploadResult">
		<ul>
			
		</ul>
	</div>
	<button id="uploadBtn">Upload</button>
	
	
</body>
</html>