<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form method="POST" action="/game/update">
	<input type="hidden" name="giName" placeholder="게임명"><br>
	<input type="text" name="giName" placeholder="게임명"><br>
	<input type="checkbox" name="giGenres" value="액션" id="action"
	${fn:contains(game.giGenre,"액션")?"checked":""}><label for="action">액션</label>
	<input type="checkbox" name="giGenres" value="전략" id="strategy"
	${fn:contains(game.giGenre,"전략")?"checked":""}><label for="strategy">전략</label>
	<input type="checkbox" name="giGenres" value="아케이드" id="arcade"
	${fn:contains(game.giGenre,"아케이드")?"checked":""}><label for="arcade">아케이드</label>
	<input type="checkbox" name="giGenres" value="보드" id="board"
	${fn:contains(game.giGenre,"보드")?"checked":""}><label for="board">보드</label>
	<input type="checkbox" name="giGenres" value="스포츠" id="sports"
	${fn:contains(game.giGenre,"스포츠")?"checked":""}><label for="sports">스포츠</label>
	<textarea placeholder="게임소개" name="giDesc"></textarea><br>
	<button>등록</button> <button type = "button" onclick="location.href='/game/game-view?giNum=${game.giNum}'">돌아가기</button>
	</form>
</body>
</html>