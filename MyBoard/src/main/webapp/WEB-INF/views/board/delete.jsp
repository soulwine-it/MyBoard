<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src='https://code.jquery.com/jquery-3.3.1.min.js'></script>
</head>
<body>

<div id="root">
	<header>
		<h1>게시판</h1>
	</header>
<hr>

<nav>
	처음화면 - 글쓰기 - 로그인
</nav>
<hr>
<section id="container">
	<form role="form" method="post">
	
		<label> 글 번호</label>
		<input type="text" id="bno" name="bno" value="${delete}" readonly="readonly"/> <br>
		
		<p>정말로 삭제하시겠습니까?</p>
		
	</form>
		<button type="submit">예, 삭제합니다.</button>
		<button id="cancel_btn">아니오, 삭제하지 않습니다.</button>
</section>
<hr>
<footer>
	<p>만든이 : soulwine
</footer>
</div>
<script>
	var formObj = $("form[role='form']");
	
	$("#cancel_btn").click(function(){
		formObj.attr("action", "/board/read?bno=" + $("#bno").val());
		formObj.attr("method", "get");
		formObj.submit();
	}
</script>
</body>
</html>