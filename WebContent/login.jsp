<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="./css/style.css">
<title>ログイン</title>
</head>
<body>

<jsp:include page="header.jsp" />

<div id="contents">
<h1>ログイン画面</h1>

<div align = center>
			<h3>商品を購入する際にはログインをお願いします</h3>
			<s:form action="LoginAction">
			<table>
				<tr>
				<td><label>ログインID:</label></td>
				<td><s:textfield name="loginUserId" placeholder="ログインID"/></td>
				</tr>
				<tr>
				<td><label>パスワード:</label></td>
				<td><s:password name="loginPassword" placeholder="パスワード"/></td>
				</tr>
			</table>
				<s:submit value="ログイン" />
			</s:form>

			<br><br><br>
			<div id="text-link">
				<p>
					新規ユーザー登録は <a href='<s:url action = "UserCreateAction"/>'>こちら</a>
				</p>
			</div>
</div>
</div>
<jsp:include page="footer.jsp" />
</body>
</html>