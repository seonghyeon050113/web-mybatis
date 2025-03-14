<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table border="1">
	<c:forEach items="${users}" var="user">
		<tr>
			<td>${user.uiNum}</td>
			<td>${user.uiName}</td>
			<td>${user.uiId}</td>
			<td>${user.uiPwd}</td>
			<td>${user.uiAge}</td>
			<td>${user.uiPhone}</td>
			<td>${user.uiAddress}</td>
			<td>${user.uiTrans}</td>
		</tr>
	</c:forEach>
</table>
		
</body>
</html>