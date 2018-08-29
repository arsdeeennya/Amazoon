<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="./css/style.css">
<title>マイページ</title>
</head>
<body>

<jsp:include page="header.jsp" />

<div id="contents">
<h1>マイページ画面</h1>

	<s:form action="PurchaseHistoryAction">
	<table class="vertical-list-table">
		<tr>
			<th scope="row"><s:label value="ログインID:"/></th>
			<td><s:property value="#session.loginId"/></td>
		</tr>

		<tr>
			<th scope="row"><s:label value="パスワード:"/></th>
			<td><s:property value="#session.password"/></td>
		</tr>

		<tr>
			<th scope="row"><s:label value="ユーザー名:"/></th>
			<td><s:property value="#session.username"/><span>　</span><s:property value="#session.firstNameKana"/></td>
		</tr>

		<tr>
			<th scope="row"><s:label value="アカウント作成日時:"/></th>
			<td><s:property value="#session.insertDate"/><span>　</span><s:property value="#session.firstNameKana"/></td>
		</tr>

	</table>
	<div class="submit_btn_box">
	<s:submit value="購入履歴" class="submit_btn" />
	</div>
	</s:form>
</div>

	<s:include value="footer.jsp"/>
</body>
</html>