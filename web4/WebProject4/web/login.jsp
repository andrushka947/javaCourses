<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Login</title>
</head>
<body>

    <form action="/login" method="POST">
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
                <td><input type="button" value="${labels.loginButton}"></td>
            </tr>
        </table>
    </form>

</body>
</html>
