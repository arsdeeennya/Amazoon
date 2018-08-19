<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="./css/style.css">
<title>ライオン</title>
</head>
<body>
<jsp:include page="header.jsp" />

<div id="contents" >
<h1>ライオン</h1>

<main>
	<div class = "main-container">
	<div class="animal_box">
		<div class ="left"><img src="./images/lion-3372731_640.jpg"  alt="代替テキスト"><br>ライオン</div>
		<div class ="right">
		価格:1,000,000円<br><br>
		強さ:★★★★★<br><br>
		頭数:1頭<br><br><br>
		<s:form action="BuyRionAction">
		<s:submit value="購入する" class="submit_btn" />
		</s:form>
		</div>
	</div>
	</div>
</main>

</div>
<jsp:include page="footer.jsp" />

</body>
</html>