<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
${boardDTO }
	<table border="1">
		<tr>
			<th>번호</th>
			<td>${boardDTO.biNum}</td>
		</tr>
		<tr>
			<th>제목</th>
			<td>${boardDTO.biTitle}</td>
		</tr>
		<tr>
			<th>작성자</th>
			<td>${boardDTO.uiName}</td>
		</tr>
		<tr>
			<th>내용</th>
			<td>${fn:replace(boardDTO.biContent,newLine,"<br>")}</td>
		</tr>
		<tr>
			<c:if test="${user.uiNum == boardDTO.uiNum}">
				<th colspan="2">
				<a href = "/board/board-update">${user.uiNum},${boardDTO.uiNum}
					<button>수정</button>
					<button>삭제</button>
				</th>
			</c:if>
		</tr>
	</table>
</body>
</html>