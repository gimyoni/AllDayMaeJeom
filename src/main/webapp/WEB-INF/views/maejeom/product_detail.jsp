<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="css/product_detail.css" rel="stylesheet" />
<link rel="shortcut icon" href="image/logo.ico" type="image/x-icon">
<link rel="icon" href="image/logo.ico" type="image/x-icon">
</head>
<body>
	<jsp:include page="../include/menu.jsp"></jsp:include>
	<div id="content">
		<div id="content_detail">
			<div id="product_img">
				<img alt="${ dto.name }" src="image/product/${ dto.img_src }">
			</div>
			<div id="product_info">
				<p id="product_name">${ dto.name }</p>
				<p id="product_description">${ dto.description }</p>
				<p id="product_price">${ dto.price }원</p>
				<div id="bottom">
					<div id="reaction">
						<div class="reaction_content" onclick="location.href='/good?id=${dto.id}'">
							<img alt="good" src="image/reaction/good.png" onmouseover="hover(this, 'good')" onmouseout="unhover(this, 'good')">
							<span>${ dto.good }</span>
						</div>
						<div class="reaction_content" onclick="location.href='/bad?id=${dto.id}'">
							<img alt="bad" src="image/reaction/bad.png" onmouseover="hover(this, 'bad')" onmouseout="unhover(this, 'bad')">
							<span>${ dto.bad }</span>
						</div>
					</div>
					<button class="order_btn">예약하기</button>
				</div>
			</div>
		</div>
	</div>
</body>
</html>
<script src="js/product_detail.js"></script>