<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="./css/style.css">
<title>動物一覧</title>

</head>
<body>
<jsp:include page="header.jsp" />

<div id="contents">

<h1>動物一覧</h1>

<div class="animal_box">
	<div class = "animal_box_name">
		<a href='<s:url action = "RionAction"/>'><img src="./images/lion-3372731_640.jpg"  alt="代替テキスト"><br>ライオン</a>
	</div>
	<div class = "animal_box_name">
		<a href='<s:url action = "CrocoAction"/>'><img src="./images/crocodiles-3489784_640.jpg" alt="代替テキスト"><br>ワニ</a>
	</div>
	<div class = "animal_box_name">
		<a href='<s:url action = "BirdAction"/>'><img src="./images/cassowary-245192_640.jpg"  alt="代替テキスト"><br>ヒクイドリ</a>
	</div>
</div>
</div>
<jsp:include page="footer.jsp" />

</body>
</html>