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

		<h1>カート情報</h1>
<div id="center">
				<s:if test="#session.buyAnimalList == null">
					<h3>ご購入情報はありません</h3>
				</s:if>

				<s:elseif test="#session.buyAnimalList != null">
					<h3>ご購入情報は以下になります。</h3>
				</s:elseif>
</div>
		<table border="1">
			<thead>
				<tr>
					<th><s:label value="動物名" /></th>
					<th><s:label value="強さ" /></th>
					<th><s:label value="価格" /></th>
				</tr>
			</thead>

			<tbody>


				<s:iterator value="#session.buyAnimalList">
					<tr>
						<td><s:property value="animalName" /></td>
						<td><s:property value="animalStrong" /></td>
						<td><s:property value="animalPrice" />円</td>
					</tr>
				</s:iterator>

			</tbody>
		</table>





		<br>
		<br>
		<div id="center">
			<s:form action="ThanksAction">
				<s:submit value="決済" class="submit_btn" />
			</s:form>

			<s:form action="CartClearAction">
				<s:submit value="カートを空にする" class="submit_btn" />
			</s:form>
		</div>
		<s:property value="session.price" />


	</div>

	<jsp:include page="footer.jsp" />

</body>
</html>