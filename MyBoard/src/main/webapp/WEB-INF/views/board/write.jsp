<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시물 작성</title>
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
	<form method="post" autocomplete="off">
		<label>글 제목</label>
		<input type="text" id="title" name="title" /><br>
		
		<label>글 내용</label>
		<textarea id="content" name="content"> </textarea><br>
		
		<label>작성자</label>
		<input type="text" id="writer" name="writer" /><br>
	
		<button type="submit">작성</button>
	</form>
</section>

<footer>
	<%@ include file="include/footer.jsp" %>
</footer>
</div>
</body>
</html>