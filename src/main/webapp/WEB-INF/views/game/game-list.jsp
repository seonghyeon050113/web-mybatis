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
			</tr>
		</c:forEach>
	</table>
	${games}
</body>
</html>