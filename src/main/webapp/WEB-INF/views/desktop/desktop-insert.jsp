<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<select name="ciNum">
		<c:forEach items="${cpus}" var="cpu">
			<option value="${cpu.ciNum}">${cpu.ciName}</option>
		</c:forEach>
	</select>
</body>
</html>