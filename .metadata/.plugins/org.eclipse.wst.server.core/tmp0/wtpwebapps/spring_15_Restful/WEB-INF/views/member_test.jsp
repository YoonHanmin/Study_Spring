<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%-- ${pageContext.request.contextPath}: 프로젝트명 ex) http://localhost:8181/spring_15/ --%>
<c:set var="contextPath" value="${pageContext.request.contextPath}"></c:set>
<html>
<head>
<meta charset="UTF-8">
<title>Member Test</title>
<script src="http://code.jquery.com/jquery-latest.js"></script>
<script type="text/javascript">
	$(function(){
		$("#checkJson").click(function(){
			var member={id:"777",pwd:"1234",name:"한소희",email:"sohee@gmail.com"
			};
		$.ajax({
			type:"post"
			,url:"${contextPath}/sample/info" 
			,contentType:"application/json"
			,data:JSON.stringify(member)
			,success:function(data){
				console.log(data);
			}
			,error:function(){
				alert("오류가 발생했습니다.");
			}
		});//end ajax
	})// end click function
});//end function

</script>
</head>
<body>
	<input type="button" id="checkJson" value="회원 정보 보내기">
	<div id="con">
	</div>
</body>
</html>