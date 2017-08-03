<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/functions" prefix = "fn" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Note view</title>
</head>
<body>

    <p>Note info</p>
    <table>
        <tr>
            <td>
                Name
            </td>
            <td><c:out value="${note.name}"/></td>
        </tr>
        <tr>
            <td>
                Surname
            </td>
            <td>
                <p><c:out value="${note.surname}"/></p>
            </td>
        </tr>
        <tr>
            <td>
                Second name
            </td>
            <td>
                <p><c:out value="${note.secondName}"/></p>
            </td>
        </tr>
        <tr>
            <td>
                Nickname
            </td>
            <td>
                <p><c:out value="${note.nickName}"/></p>
            </td>
        </tr>
        <tr>
            <td>
                Group
            </td>
            <td>
                <p><c:out value="${note.group}"/></p>
            </td>
        </tr>
        <tr>
            <td>
                Home number
            </td>
            <td>
                <p><c:out value="${note.homeNumber}"/></p>
            </td>
        </tr>
        <tr>
            <td>
                Mobile number
            </td>
            <td>
                <p><c:out value="${note.mobileNumber}"/></p>
            </td>
        </tr>
        <c:if test="${fn:length(mobileNumber2) > 1}">
            <tr>
                <td>
                    Mobile number 2
                </td>
                <td>
                    <p><c:out value="${note.mobileNumber2}"/></p>
                </td>
            </tr>
        </c:if>
        <tr>
            <td>
                Email
            </td>
            <td>
                <p><c:out value="${note.email}"/></p>
            </td>
        </tr>
        <tr>
            <td>
                Skype
            </td>
            <td>
                <p><c:out value="${note.skype}"/></p>
            </td>
        </tr>
        <tr>
            <td>
                Index
            </td>
            <td>
                <p><c:out value="${note.address.index}"/></p>
            </td>
        </tr>
        <tr>
            <td>
                City
            </td>
            <td>
                <p><c:out value="${note.address.city}"/></p>
            </td>
        </tr>
        <tr>
            <td>
                Street
            </td>
            <td>
                <p><c:out value="${note.address.street}"/></p>
            </td>
        </tr>
        <tr>
            <td>
                House #
            </td>
            <td>
                <p><c:out value="${note.address.houseNumber}"/></p>
            </td>
        </tr>
        <tr>
            <td>
                Flat #
            </td>
            <td>
                <p><c:out value="${note.address.flatNumber}"/></p>
            </td>
        </tr>
    </table>
</body>
</html>
