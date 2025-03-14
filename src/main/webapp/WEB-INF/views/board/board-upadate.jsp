<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="POST" action="/board/board-update">
		<input type="hidden" name="uiNum" value="${user.uiNum}"> <input
			type="hidden" name="biNum" value="${board.biNum}">
	</form>
</body>
</html>