<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게임등록</title>
</head>
<body>
<form method="POST" action="/game/insert">
	<input type="text" name="giName" placeholder="게임명"><br>
	<input type="text" name="giName" placeholder="게임명"><br>
	<input type="checkbox" name="giGenres" value="액션" id="action"><label for="action">액션</label>
	<input type="checkbox" name="giGenres" value="전략" id="strategy"><label for="strategy">전략</label>
	<input type="checkbox" name="giGenres" value="아케이드" id="arcade"><label for="arcade">아케이드</label>
	<input type="checkbox" name="giGenres" value="보드" id="board"><label for="board">보드</label>
	<input type="checkbox" name="giGenres" value="스포츠" id="sports"><label for="sports">스포츠</label>
	<textarea placeholder="게임소개" name="giDesc"></textarea><br>
	<button>등록</button> <button type = "button" onclick="location.href='/game/game-list'">돌아가기</button>
</form>
</body>
</html>