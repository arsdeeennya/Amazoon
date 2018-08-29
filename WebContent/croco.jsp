<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="./css/style.css">
<title>ユーザー登録</title>
</head>
<body>
<jsp:include page="header.jsp" />

<div id="contents" >
<h1><s:property value="#session.crocoName" /></h1>

<main>
	<div class = "main-container">
	<div class="animal_box">
		<div class ="left"><img src="./images/crocodiles-3489784_640.jpg"  alt="代替テキスト"><br><s:property value="#session.crocoName" /></div>
		<div class ="right">
		価格:<s:property value="#session.crocoPrice" />円<br><br>
		強さ:<s:property value="#session.crocoStrong" /><br><br>
		頭数:1頭<br><br><br>
		<s:form action="BuyCrocoAction">
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