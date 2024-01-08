<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script src="js/jquery.js"></script>
<title>Insert title here</title>
	<script>
	
	function sendRequest(){
	var dat ={"city":"Busan","zipcode":12345};
		$.ajax({
			url:"request_ajax.jsp"
			,type : "POST"
			,data:{"city":"Busan","zipcode":12345}
// 			dataType : 생략가능(자동으로 타입 처리)
// 			응답 성공시
// 			,datatype:"json"
			,success: function(data){
				console.log(data);
				document.getElementById("text").innerHTML = data;
			}
				,error:function(data){ // 응답 실패시
				document.getElementById("text").innerHTML = "<h3>ajax fail</h3>";
					
				}
		});
		
	}
	</script>


</head>
<body>
	<h1>POST 방식의 요청</h1>
	<button type="button" onclick="sendRequest()">POST 방식의 요청 보내기 </button>
	<p id="text"></p>
</body>
</html>