<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table width="500" border="1">
		<tr>
			<td>번호</td>
			<td>이름</td>
			<td>제목</td>
			<td>날짜</td>
			<td>조회수</td>
		</tr>
<!--  list : 모델 객체에서 보낸 key값, var= 받은 list를 dto로 쓰겠다. -->
		<c:forEach items="${list}" var="dto">
			<tr>
				<td>${dto.bid}</td>
				<td>${dto.bname}</td>
				<td>
<!-- 				contentview : 컨트롤러단 호출  -->
				<a href="contentView?bid=${dto.bid}">
				${dto.btitle}</a></td>
				<td>${dto.bdate}</td>
				<td>${dto.bhit}</td>
			</tr>
		</c:forEach>
			<tr>
				<td colspan="5">
<!-- 				write_view : 컨트롤러단 호출 -->
					<a href="write_view">글작성</a>
			</tr>
		
		
	</table>
</body>
</html>