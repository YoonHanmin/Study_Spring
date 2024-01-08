<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>
<a href="localhost:8181/board/ajax">ajax</a>
<P>  The time on the server is ${serverTime}. </P>

<form action="/mybatis" method="get">
	<input type="text" name="id">
	<input type="submit">
</form>
</body>
</html>
