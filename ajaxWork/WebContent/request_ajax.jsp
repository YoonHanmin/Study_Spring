<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>helloworld</title>
</head>
<body>
	<% // 클라이언트가 보낸 데이터값을 받는다.
	String city = request.getParameter("city");
	String zipcode = request.getParameter("zipcode");
	
	System.out.print("city : "+ city);
	System.out.print("zipcode : "+ zipcode);
	// 서버 -> 클라이언트로 응답은 out.print로 한다.
	out.print("도시 : "+city);
	out.print("우편번호 : "+zipcode);
	
	%>
</body>
</html>