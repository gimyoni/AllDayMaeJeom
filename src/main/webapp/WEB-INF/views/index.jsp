<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
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
	<div id="content">
		<div id="products">
			<c:forEach var="product" items="${ list }">
				<div class="product" onclick="location.href='/detail?id=${product.id}'">
					<div class="product_img">
						<img alt="${ product.name }" src="image/product/${ product.img_src }">
					</div>
					<span class="product_name">${ product.name }</span><br> 
					<span class="product_price">${ product.price }원</span>
				</div>
			</c:forEach>
		</div>
	</div>
</body>
</html>