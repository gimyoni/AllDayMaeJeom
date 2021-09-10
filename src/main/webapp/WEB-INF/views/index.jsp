<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="path" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Index</title>
<link href="css/style_index.css" rel="stylesheet" />
</head>
<body>
	<jsp:include page="include/menu.jsp"></jsp:include>
	<!-- 임시 고객 링크 (나중에 지울거임) -->
	<a href="/login_form">로그인 폼 이동</a>
	<br>
	<a href="/signup_form">회원가입 폼 이동</a>
	<br>
	
</body>
</html>