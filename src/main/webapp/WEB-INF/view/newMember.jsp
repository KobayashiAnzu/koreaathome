<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>新規会員登録</title>
</head>
<body>
<form:form action="" method="post" modelAttribute="member">
<p>ログインID：<form:input path="loginId"/></p>
<p>パスワード：<form:password path="loginPass"/></p>
<input type="submit" value="登録" />
</form:form>
</body>
</html>