<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="./css/style.css">
<title>住家一覧</title>

</head>
<body>
<jsp:include page="header.jsp" />

<div id="contents">

<h1>住家一覧</h1>

<div class="animal_box">
	<div class = "animal_box_name">
		<a href='<s:url action = "BobAction"/>'><img src="./images/pool.jpg"  alt="代替テキスト"><br>プール</a>
	</div>
	<div class = "animal_box_name">
		<a href='<s:url action = "BobAction"/>'><img src="./images/water.jpg"  alt="代替テキスト"><br>水たまり</a>
	</div>
</div>

</div>
<jsp:include page="footer.jsp" />

</body>
</html>