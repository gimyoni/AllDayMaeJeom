<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="path" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>매일매점 - 회원가입</title>
<link href="css/customer/style_sign_form.css" rel="stylesheet"/>
</head>
<body>
	<form method="post" action="/signup">
		<h3>회원가입</h3>
		아이디 : <input type="text" name="userid"><br>
		비밀번호 : <input type="password" name="passwd"><br>
		이름 : <input type="text" name="name"><br>
		학번 : <input type="number" name="student_num"><br>
		입학년도(XXXX) : <input type="number" name="enter_year"><br>
		<button type="submit">가입하기</button>
	</form>
</body>
</html>