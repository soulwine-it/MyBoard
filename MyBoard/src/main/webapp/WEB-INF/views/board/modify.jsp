<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글 조회</title>

<!-- jquery -->
<script src='https://code.jquery.com/jquery-3.3.1.min.js'></script>

</head>
<body>

	<div id="root">
		<header>
			<%@ include file="include/header.jsp" %>
		</header>
		<hr />
		<nav>
			<%@ include file="include/nav.jsp" %>
		</nav>
		<section id="container">
			<form role="form" method="post" autocomplete="off">

				<label>글 번호</label> <input type="text" id="bno" name="bno"
					value="${modify.bno}" /> <br> <label>글 제목</label> <input
					type="text" id="title" name="title" value="${modify.title}" /> <br>

				<label>글 내용</label>
				<textarea id="content" name="content">${modify.content}</textarea>
				<br> <label>작성자</label> <input type="text" id="writer"
					name="writer" readonly="readonly" value="${modify.writer }" /><br>

				<label>작성 날짜</label> <span><fmt:formatDate
						value="${modify.regDate}" pattern="yyyy-MM-dd" /></span> <br>

				<button type="submit">수정</button>
				<button id="cancel_btn">취소</button>

				<script>
					// 폼을 변수에 저장
					var formObj = $("form[role='form']");

					// 취소 버튼 클릭
					$("#cancel_btn").click(
							function() {
								formObj.attr("action", "/board/read?bno="
										+ $("#bno").val());
								formObj.attr("method", "get");
								formObj.submit();
							});
				</script>
			</form>

		</section>
	<footer>
		<%@ include file="include/footer.jsp" %>
	</footer>
	</div>
</body>
</html>