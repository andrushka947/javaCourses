<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Andrushka
  Date: 8/13/2017
  Time: 8:32 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Sublist</title>
</head>
<body>

    <a href="/">Main page</a>

    <p><c:out value="${condition}"/></p>

    <table>
        <tr>
            <td>Name</td>
            <td>Power</td>
        </tr>
        <c:forEach var="appliance" items="${appliances}">
            <tr>
                <td>
                    <c:out value="${appliance.name}"/>
                </td>
                <td>
                    <c:out value="${appliance.power}"/>
                </td>
            </tr>
        </c:forEach>
    </table>

</body>
</html>
