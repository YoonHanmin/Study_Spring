<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<style type="text/css">
.div_page ul {
	display: flex;
	list-style: none;
}
</style>
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
					<a href="contentView?bid=${dto.bid}"> ${dto.btitle}</a>
				</td>
				<td>${dto.bdate}</td>
				<td>${dto.bhit}</td>
			</tr>
		</c:forEach>
		<tr>
			<td colspan="5">
				<!-- 				write_view : 컨트롤러단 호출 --> <a href="write_view">글작성</a>
		</tr>


	</table>
	<h3>${pageMaker}</h3>
	<div class="div_page">
		<ul>
			<c:if test="${pageMaker.prev}">
				<li class="paginate_button">
<!-- 				이전 버튼 누르면 = 시작페이지 -1 로 이동 -->
				<a href="${pageMaker.startpage-1}">[Previous]</a>
				</li>
			</c:if>
			<c:forEach var="num" begin="${pageMaker.startpage}"
				end="${pageMaker.endpage}">
				<%-- 		 <li>[${num}]</li> --%>
				<!-- 		현재 페이지는 배경색 노란색으로 표시 -->
<%-- 				<li ${pageMaker.cri.pageNum == num ? "style='background-color:yellow'":" "}>  --%>
					<li class="paginate_button" ${pageMaker.cri.pageNum == num?"style='background-color:yellow'":" " }>
					<a href="${num}">[${num}]
					</a></li>

			</c:forEach>
			<c:if test="${pageMaker.next}">
				<!-- 			<li>[Next]</li> -->
				<li class="paginate_button">
				<a href="${pageMaker.endpage +1}">[Next]</a>
				</li>
			</c:if>
		</ul>
<!-- 	페이지 번호 a태그를 누르면 pageMaker의 페이지넘버값을 넘김  -->
	</div>
	<form id="actionForm" action="list" method="get">
	<input type="hidden" name="pageNum" value="${pageMaker.cri.pageNum}">
	<input type="hidden" name="amount" value="${pageMaker.cri.amount}">
	</form>
	
</body>
</html>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script>
	var actionForm = $("#actionForm");
	
//	페이지번호 처리
	$(".paginate_button a").on("click", function(e) {
// 		기본 동작 막음: 페이지 링크를 통해서 이동
		e.preventDefault();
// 		console.log("click~!!!");
		console.log("@# href===>"+$(this).attr("href"));
		
		actionForm.find("input[name='pageNum']").val($(this).attr("href"));
		actionForm.submit();
	});
</script>