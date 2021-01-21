<%@ page pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>TopPage</title>
</head>
<body>
<c:choose>
<c:when test="${!empty sessionScope.loginId}">
</c:when>
<c:otherwise>
<form:form action="" method="post" modelAttribute="member">
<form:errors path="loginId" cssClass="error"/>
<p>ログインID：<form:input path="loginId" /></p>
<p>パスワード：<form:password path="loginPass" /></p>
<input type="submit" value="ログイン"/>
</form:form>

</c:otherwise>
</c:choose>

</body>
</html>