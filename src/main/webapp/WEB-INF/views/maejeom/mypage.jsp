<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>매일매점 - 마이페이지</title>
<link rel="shortcut icon" href="image/logo.ico" type="image/x-icon">
<link rel="icon" href="image/logo.ico" type="image/x-icon">
</head>
<body>
	이름 <span>${dto.name }</span><br>
	아이디 <span>${dto.userid }</span><br><br>
	포인트 <span>${dto.point }</span><br><br>
	<button type="submit" onclick="location.href='';">비밀번호 변경</button>
	<button type="submit" onclick="location.href='';">내 정보 수정</button>
	<br><br>
	예약현황<br><br>
</body>
</html>