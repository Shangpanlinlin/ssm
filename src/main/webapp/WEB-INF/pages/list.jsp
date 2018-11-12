<%--
  Created by IntelliJ IDEA.
  User: panlinlin
  Date: 18/11/10
  Time: 下午7:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
${list}

<c:forEach items="${list}" var="account">
    ${account.name}, ${account.id} , ${account.money}<br>
</c:forEach>
<% System.out.println("this is list page");%>

</body>
</html>
