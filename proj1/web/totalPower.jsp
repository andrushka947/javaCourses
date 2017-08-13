<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Total power</title>
</head>
<body>

    <a href="/">Main page</a>
    <c:if test="${totalPower ne null}">
        <p>Total power of plugged in appliances: <c:out value="${totalPower}"/></p>
    </c:if>

    <table>
        <tr>
            <td>Name</td>
            <td>Power</td>
            <td>Plugged in</td>
        </tr>
        <c:forEach var="appliance" items="${appliances}">
            <tr>
                <td>
                    <c:out value="${appliance.name}"/>
                </td>
                <td>
                    <c:out value="${appliance.power}"/>
                </td>
                <td>
                    <c:out value="${appliance.pluggedIn}"/>
                </td>
            </tr>
        </c:forEach>
    </table>

</body>
</html>
