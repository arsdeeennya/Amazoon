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
<h1>新規ユーザー登録</h1>

<!-- 最終的にはずす -->
		<div align = center>
			<s:if test="errorMessage != ''">
				<s:property value="errorMessage" escape="false" />
			</s:if>
			<s:form action="UserCreateConfirmAction">
			<table>

					<tr>
						<td><label>ログインID:</label></td>
						<td><input type="text" name="loginUserId" placeholder="ログインID" value="" /></td>
					</tr>
					<tr>
						<td><label>パスワード:</label></td>
						<td><input type="password" name="loginPassword" placeholder="パスワード" value="" /></td>
					</tr>

					<tr>
						<td><label>ユーザー名:</label></td>
						<td><input type="text" name="userName" placeholder="ユーザー名" value="" /></td>
					</tr>


			</table>
			<s:submit value="登録" />
			</s:form>
		</div>
</div>





<jsp:include page="footer.jsp" />

</body>
</html>