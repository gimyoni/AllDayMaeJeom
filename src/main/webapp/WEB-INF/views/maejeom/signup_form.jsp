<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="path" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>매일매점 - 회원가입</title>
<link href="css/style_signup_form.css" rel="stylesheet"/>
<link rel="shortcut icon" href="image/logo.ico" type="image/x-icon">
<link rel="icon" href="image/logo.ico" type="image/x-icon">
</head>
<body>
	<div class="signup_form">
		<form method="post" action="/signup">
			<p id="signup_title">회원가입</p>
			<span>아이디</span> <input type="text" name="userid"><br>
			<span>비밀번호</span> <input type="password" name="passwd"><br>
			<span>이름</span> <input type="text" name="name"><br>
			<span>학번</span> <input type="number" name="student_num"><br>
			<span>입학년도</span> <input type="number" name="enter_year"><br>
			<button type="submit" class="submit_btn">가입하기</button>
		</form>
	</div>
</body>
</html>