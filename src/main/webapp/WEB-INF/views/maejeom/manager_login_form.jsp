<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="path" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>���ϸ��� - ������ �α���</title>
<link href="css/style_login_form.css" rel="stylesheet"/>
<link rel="shortcut icon" href="image/logo.ico" type="image/x-icon">
<link rel="icon" href="image/logo.ico" type="image/x-icon">
</head>
<body>
	<div class="login_form">
		<form method="post" action="manager_login">
			<p id="login_title">�α���</p>
			<span>���̵�</span> <input type="text" name="userid"><br>
			<span>��й�ȣ</span> <input type="password" name="passwd"><br><br>
			<button type="submit" class="submit_btn">Ȯ��</button>
		</form>
	</div>
</body>
</html>