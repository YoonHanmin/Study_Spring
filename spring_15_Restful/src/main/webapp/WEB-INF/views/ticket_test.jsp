<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%-- ${pageContext.request.contextPath}: 프로젝트명 ex) http://localhost:8181/spring_15/ --%>
<c:set var="contextPath" value="${pageContext.request.contextPath}"></c:set>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="http://code.jquery.com/jquery-latest.js"></script>
<script type="text/javascript">
	$(function(){
		$("#checkJson").click(function(){
			var member={tno:"777",owner:"홍길동",grade:"337"
			};
		$.ajax({
			type:"post"
			//프로젝트명+class @RequestMapping + method @RequestMapping => spring_15/sample/ticket
			,url:"${contextPath}/sample/ticket" 
			,contentType:"application/json"
// 			JSON.stringfy: 객체를 Json 문자열 형태로 변환해주는 메소드
			,data:JSON.stringify(member)
			,success:function(data){
				console.log(data);
				var ticket = $(data).find("TicketVO");
				if(ticket.length>0){
					var tb = $("<table/>");
					$.each(ticket,function(i,o){
						var tno = $(o).find("tno").text();
						var owner = $(o).find("owner").text();
						var grade = $(o).find("grade").text();
						var row = $("<tr/>").append(
							$("<td/>").text(tno)
							,$("<td/>").text(owner)
							,$("<td/>").text(grade)
						);
						tb.append(row);
					});
					$("#con").append(tb);
				}
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