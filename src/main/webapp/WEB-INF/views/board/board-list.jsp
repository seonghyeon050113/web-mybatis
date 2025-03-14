<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>리스트</title>
</head>
<body>
	<form method="GET" action="/board/board-list">
		<table border="1">
			<tr>
				<th>번호</th>
				<th>제목</th>
				<th>작성자</th>
				<th>작성일</th>
			</tr>
			<c:forEach items="${boards}" var="board">
				<tr>
					<td>${board.biNum}</td>
					<td><a href="/board/board-view?biNum=${board.biNum}">${board.biTitle}</a></td>
					<td>${board.uiName}</td>
					<fmt:parseDate value="${board.credat}" var="credat" pattern="yyyyMMdd"/>
					<td><fmt:formatDate value="${credat}" pattern="yyyy-MM-dd"/></td>
				</tr>
			</c:forEach>
		</table>
	</form>
</body>
</html>