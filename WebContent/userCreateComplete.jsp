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

<h1></h1>


<div id="contents" align = center>
			<h3>ユーザーの登録が完了いたしました。</h3>
			<div>
				<a href='<s:url action="GoLoginAction"/>'>ログインへ</a>
			</div>
		</div>




<jsp:include page="footer.jsp" />

</body>
</html>