<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판</title>
</head>
<body>
<div id="root">

	<header>
	<%@ include file="include/header.jsp" %>
	</header>
<hr>
	<nav> 
	<%@ include file="include/nav.jsp" %>
	 </nav>
<hr>
	<section id="container">
		<h2> 글 목 록 </h2>
		
		<table>
			<tr><th>글 번호</th><th>글제목</th><th>작성자</th><th>작성일자</th>
			
			<!-- 목록 -->
			<c:forEach items="${list}" var="list">
			<tr>
				<td>${list.bno}</td>
				<td>
					<a href="/board/read?bno=${list.bno}">${list.title}</a>
				</td>
				<td>${list.writer}</td>
				<td><fmt:formatDate value="${list.regDate}" pattern="yyyy-MM-dd" /></td>	
			</tr>
			</c:forEach>
			<!-- 목록 끝  -->
		</table>
		<div>
 <ul>
  <c:if test="${pageMaker.prev}">
   <li><a href="listPage?page=${pageMaker.startPage - 1}">이전</a></li>
  </c:if> 
  
  <c:forEach begin="${pageMaker.startPage}" end="${pageMaker.endPage}" var="idx">
   <li><a href="listPage?page=${idx}">${idx}</a></li>
  </c:forEach>
    
  <c:if test="${pageMaker.next && pageMaker.endPage > 0}">
   <li><a href="listPage?page=${pageMaker.endPage + 1}">다음</a></li>
  </c:if> 
 </ul>
</div>
		
	</section>
	<footer>
		<%@ include file="include/footer.jsp" %>
	</footer>

</div>

</body>
</html>