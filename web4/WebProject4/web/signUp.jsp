<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Sign up</title>
</head>
<body>

<form action="/signUp" method="POST">
    <table>
        <tr>
            <td><c:out value="${labels.login}"/></td>
            <td><input type="text" name="login"></td>
        </tr>
        <tr>
            <td><c:out value="${labels.password}"/></td>
            <td><input type="password" name="password"></td>
        </tr>
        <tr>
            <td><c:out value="${labels.name}"/></td>
            <td><input type="text" name="name"></td>
        </tr>
        <tr>
            <td><c:out value="${labels.surname}"/></td>
            <td><input type="text" name="surname"></td>
        </tr>
        <tr>
            <td><c:out value="${labels.secondName}"/></td>
            <td><input type="text" name="secondName"></td>
        </tr>
        <tr>
            <td><c:out value="${labels.certificateMark}"/></td>
            <td><input type="number" name="certificateMark"></td>
        </tr>
        <tr>
            <td><input type="button" value="${labels.signUpButton}"></td>
        </tr>
    </table>
</form>

</body>
</html>
