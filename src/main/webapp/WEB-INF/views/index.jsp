<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="path" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Index</title>
<link href="css/style_index.css" rel="stylesheet" />
<link rel="shortcut icon" href="image/logo.ico" type="image/x-icon">
<link rel="icon" href="image/logo.ico" type="image/x-icon">
<style>
	@charset "UTF-8";

	@import url('https://fonts.googleapis.com/css2?family=Gowun+Dodum&display=swap');

	* {
		text-decoration: none;
		margin: 0;
		padding: 0;
		font-family: 'Gowun Dodum', sans-serif;
	}
	
	body {
		padding-top: 75px;
	}
	
	#content {
		display: flex;
		justify-content: center;
	}
	
	#products {
		width: 1000px;
		display: flex;
		flex-wrap: wrap;
	}
	#products .product {
		width: 200px;
		text-align: center;
		border-radius: 10px;
	}
	#products .product:hover {
		box-shadow: 0 0 0 1px #52bfff inset;
	}
	#products .product .product_img {
		padding: 3px;
		width: 195px;
		height: 195px;
		overflow: hidden;
	}
	#products .product .product_img img {
		height: 200px;
	}
	#products .product .product_name {
		margin-top: 5px;
		font-size: 15px;
	}
	#products .product .product_price {
		font-size: 20px;
	}
</style>
</head>
<body>
	<jsp:include page="include/menu.jsp"></jsp:include>
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