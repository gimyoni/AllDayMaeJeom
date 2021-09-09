<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="path" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>매일매점 - 로그인</title>
<link href="css/style_login.css" rel="stylesheet"/>
</head>
<body>
	<form method="post" action="login">
		<h3>로그인</h3>
		아이디 : <input type="text" name="userid"><br>
		비밀번호 : <input type="password" name="passwd"><br>
		<button type="submit">확인</button>
	</form>
</body>
</html>