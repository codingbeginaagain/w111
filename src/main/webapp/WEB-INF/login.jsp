<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java"
         pageEncoding="UTF-8"
%>

<html>
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>

<c:if test = "${param.result == 'error'}">
    <h1>로그인 에러</h1>
</c:if>

<form action="/login" method="post">
    <input type="text" name="mid">
    <input type="text" name="mpw">
    <input type="checkbox" name="auto">
    <button type="submit">LOGIN</button>

</form>


</body>
</html>
