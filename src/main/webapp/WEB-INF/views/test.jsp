<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form method="POST" action = "/test/insert">
	<input type="text" name="name"><br>
	<input type="text" name="age"><br>
	<input type="checkbox" name="hobby" value="여행" id="h1">
	<label for="h1">여행</label>
	<input type = "checkbox" name="hobby" value="드라이브" id="h2">
	<label for ="h2">드라이브</label>
	<input type = "checkbox" name="hobby" value="음악" id ="h3">
	<label for ="h3">음악</label><br>
	<select name="trans">
	<option value="1">남</option>
	<option value="2">여</option>
	</select><br>
	<select name="dream" multiple>
		<option value="의사">의사</option>
		<option value="판사">판사</option>
		<option value="변호사">변호사</option>
		<option value="ceo">ceo</option> 
	</select><br>
	<textarea name="desc" placeholder="소개"></textarea>
	<button>추가하기</button>
</form>
</body>
</html>