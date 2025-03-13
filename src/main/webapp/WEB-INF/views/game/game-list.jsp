<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="GET" action="/game/game-list">
		<select name="search">
			<option value="giName">게임명</option>
			<option value="giPrice">가격</option>
			<option value="giGenre">장르</option>
			<option value="giDesc">설명</option>
		</select> 
		<input type="text" name="searchStr">
		<button>검색</button>
	</form>
	
	<table border="1">
		<tr>
			<th>번호</th>
			<th>게임</th>
			<th>가격</th>
		</tr>
		<c:if test="${empty games}">
			<tr>
				<th colspan="3">게임목록이 없습니다.</th>
			</tr>
		</c:if>
		<c:forEach items="${games}" var="game">
			<tr>
				<td>${game.giNum}</td>
				<td>${game.giName}</td>
				<td>${game.giPrice}</td>
				<td>${game.giGenre}</td>
				<td>${game.giDesc}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>