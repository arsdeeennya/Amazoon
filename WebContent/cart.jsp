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



<table align = center border = "1" >
<thead>
<tr>
<th><s:label value="動物名"/></th>
<th><s:label value="強さ"/></th>
<th><s:label value="価格"/></th>
<th><s:label value="合計金額"/></th>
</tr>
</thead>

<tbody>
<!-- <tr> -->
<%-- 	<td><s:property value="session.rionName"/></td> --%>
<%-- 	<td><s:property value="5"/></td> --%>
<%-- 	<td><s:property value="session.rionPrice"/>円</td> --%>
<%-- 	<td><s:property value="session.rionPrice"/>円</td> --%>
<!-- </tr> -->

<s:if test="myPageList == null">
				<h3>ご購入情報はありません</h3>
			</s:if>

			<s:elseif test="message == null">
				<h3>ご購入情報は以下になります。</h3>


					<s:iterator value="myPageList">
						<tr>
							<td><s:property value="itemName" /></td>
							<td><s:property value="totalPrice" /><span>円</span></td>
							<td><s:property value="totalCount" /><span>個</span></td>
							<td><s:property value="payment" /></td>
							<td><s:property value="insert_date" /></td>
						</tr>
					</s:iterator>
				</table>


</tbody>


<br><br>
<div id = "center">
<s:form action="ThanksAction">
		<s:submit value="決済" class="submit_btn" />
		</s:form>
</div>
<s:property value="session.price" />


</div>
<jsp:include page="footer.jsp" />

</body>
</html>