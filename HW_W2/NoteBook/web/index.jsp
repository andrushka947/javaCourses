<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
  <head>
    <title>Index page</title>
  </head>
  <body>

      <p>qwe<c:out value="${welcome}"/></p>
      <a href="/addNote">Add note</a>

      <c:if test="${not empty welcome}">
          <p><c:out value="${welcome}"/></p>
          <a href="/addNote">Add note</a>
       </c:if>

  </body>
</html>
