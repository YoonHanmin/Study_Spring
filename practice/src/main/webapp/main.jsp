<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script type="js/jquery.js"></script>
<title>Insert title here</title>
</head>
<body>
	<button>* 서버에서 응답 받기*</button>
 	<div id="panel"></div>

	<script>
 		$("button").click(function(){
 			$.ajax({
 				url		:"main.jsp", 
 				method	:"get",	
 				dataType:"text",	
 				error	:function(){ 
 					
 				},//error end
 				success	:function(){ 
 					
 				}//success 둥
 			});
 		})//click end
 	</script>
<form >
</form>


</body>
</html>