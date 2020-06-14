<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글 조회</title>
</head>
<body>

<div id="root">
	<header>
	<h1>게시판 조회</h1>
	</header>
<hr />
	<section id="container">
		<form role="form" method="post" autocomplete="off">
		
		<label>글 번호</label>
		<input type="text" id="bno" name="bno" value="${read.bno}" readonly="readonly" /> <br>
		
		<label>글 제목</label>
		<input type="text" id="title" name="title" value="${read.title}" readonly="readonly" /> <br>
		
		<label>글 내용</label>
		<textarea id="content" name="content" readonly="readonly">${read.content}</textarea> <br>
		
		<label>작성자</label>
		<input type="text" id="writer" name="writer" readonly="readonly" value="${read.writer }" /><br>
		
		<label>작성 날짜</label>
		<span><fmt:formatDate value="${read.regDate}" pattern="yyyy-MM-dd" /></span> <br>
		
		
		</form>
	</section>
	
</div>
</body>
</html>