<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri ="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>리스트</title>
</head>
<body>
	<form method="GET" action="/food/food-list">
		<table border="1">
			<tr>
				<th>번호</th>
				<th>음식 이름</th>
				<th>음식 가격</th>
				<th>작성자
				<th>작성일</th>
			</tr>

			<tr>
				<c:forEach items="${selectList}" var="food">
					<tr>
						<td>${food.fiNum}</td>
						<td><a href="food/food-view">${food.fiName}</a></td>
						<td>${food.fiPrice}</td>
						<td>${food.uiName}</td>
						
						<td>
						<fmt:parseDate value="${food.credat}" var="credat" pattern="yyyyMMdd"/>
						<fmt:formatDate value="${credat}" pattern="yyyy-MM-dd"/>
						<td>
					</tr>
				</c:forEach>
		</table>
	<a href="/food/food-insert">메뉴등록</a>
	</form>
</body>
</html>