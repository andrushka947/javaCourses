<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
    <head>
        <title>Appliances</title>
    </head>
    <body>
    <a href="/">Main page</a>
    <c:if test="${totalPower ne null}">
        <p>Total power of plugged in appliance: <c:out value="${totalPower}"/></p>
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
                <td>
                    <c:if test="${appliance.pluggedIn eq true}">
                        <c:set var="buttonValue" value="Unplug"/>
                    </c:if>
                    <c:if test="${appliance.pluggedIn eq false}">
                        <c:set var="buttonValue" value="Plug in"/>
                    </c:if>
                    <c:set var="pluggedIn" value="${appliance.pluggedIn}"/>

                    <form action="/appliances/changeState" method="POST">
                        <input type="hidden" name="id" value="${appliance.id}">
                        <input type="submit" value="${buttonValue}">
                    </form>
                </td>
            </tr>
        </c:forEach>
    </table>
    <div>
        <form action="/totalPower" method="GET">
            <input type="submit" value="Count total power of plugged in appliances">
        </form>
    </div>
    <div>
        <c:if test="${wrongValues ne null}">
            <p><c:out value="${wrongValues}"/></p>
        </c:if>
        <form action="/sublist" method="GET">
            From: <input type="number" name="powerFrom">
            To: <input type="number" name="powerTo">
            <input type="submit" value="Get appliances with power between">
        </form>
    </div>
    <br/>

    </body>
</html>
