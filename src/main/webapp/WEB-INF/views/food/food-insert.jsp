<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>메뉴등록</title>
</head>
<body>
<form method="POST" action="/food/insert">
	<input type="text" name="fiName" ><br>
	<input type="text" name="fiPrice" ><br>
	<input type="hidden" name="uiNum" value="${user.uiNum}"><br>
	작성자: ${user.uiName}<br>
	<button>메뉴 등록</button> <button type = "button" onclick="location.href='/food/food-list'">돌아가기</button>
</form>
</body>
</html>