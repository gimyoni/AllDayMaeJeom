<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="path" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>매일매점 - 로그인</title>
<link href="css/customer/style_login_form.css" rel="stylesheet"/>
</head>
<body>
	<div class="login_form">
		<form method="post" action="login">
			<p id="login_title">로그인</p>
			<span>아이디</span> <input type="text" name="userid"><br>
			<span>비밀번호</span> <input type="password" name="passwd"><br><br>
			<button type="submit" class="submit_btn">확인</button>
		</form>
	</div>
</body>
</html>