<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 컨트롤러에 매핑된 url 없으므로 404 에러 -->
<!-- WARN : org.springframework.web.servlet.PageNotFound  -->
<!-- - No mapping found for HTTP request with URI [/spring_14_1_1/student] in DispatcherServlet with name 'appServlet' -->
<!-- 	form의 action은 스프링에서 dispatcherServlet이 요청을 먼저받기때문에 Controller단으로 가장먼저 간다.  -->
	<form method="post" action="studentView"> 
	이름 : <input type="text" name="name"><br>
	나이 : <input type="text" name="age"><br>
	학년 : <input type="text" name="gradeNum"><br>
	반 : <input type="text" name="classNum"><br>
	
		<input type="submit" value="전송">
	</form>
</body>
</html>