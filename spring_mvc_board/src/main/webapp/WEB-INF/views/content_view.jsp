<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table width="500px" border="1">
	
		<tr>
			<td>번호</td>
			<td>${content_view.bid}</td>
		</tr>
		<tr>
			<td>조회수</td>
			<td>${content_view.bhit}</td>
		</tr>
		<tr>
		
		<td>이름</td>
		<td>${content_view.bname}</td>
		</tr>
		<tr>
		<td>제목</td>
		<td>${content_view.btitle}</td>
		</tr>
		<tr>
		<td>내용</td>
		<td style="width:400px;height:300px;">${content_view.bcontent}</td>
		</tr>
		<tr>
		<td colspan="2">
			<button onclick="location.href='list'"  style="width:70px;height:30px;">목록</button>
		</td>
		</tr>

	</table>
</body>
</html>