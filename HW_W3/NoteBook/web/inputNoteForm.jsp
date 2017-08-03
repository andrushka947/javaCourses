<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>InputForm</title>
    <style>
        .wrongInput{
            color: red;
        }
    </style>
</head>
<body>

    <form action="/addNote" method="POST">
        <p>Input all info please</p><hr>
        <table>
            <tr>
                <td>
                    <c:if test="${wrongName ne null}">
                        <p class="wrongInput">
                            <c:out value="${wrongName}"/>
                        </p>
                    </c:if>
                    Name
                </td>
                <td><input type="text" name="name" value="${note.name}" ></td>
            </tr>
            <tr>
                <td>
                    <c:if test="${wrongSurname ne null}">
                        <p class="wrongInput">
                            <c:out value="${wrongSurname}"/>
                        </p>
                    </c:if>
                    Surname
                </td>
                <td><input type="text" name="surname" value="${note.surname}" ></td>
            </tr>
            <tr>
                <td>
                    <c:if test="${wrongSecondName ne null}">
                        <p class="wrongInput">
                            <c:out value="${wrongSecondName}"/>
                        </p>
                    </c:if>
                    Second name
                </td>
                <td><input type="text" name="secondName" value="${note.secondName}" ></td>
            </tr>
            <tr>
                <td>
                    <c:if test="${wrongNickname ne null}">
                        <p class="wrongInput">
                            <c:out value="${wrongNickname}"/>
                        </p>
                    </c:if>
                    Nickname
                </td>
                <td><input type="text" name="nickName" value="${note.nickName}" ></td>
            </tr>
            <tr>
                <td>Group</td>
                <td>
                    <select name="group">
                        <option value="Family">Family</option>
                        <option value="Work">Work</option>
                        <option value="Friends">Friends</option>
                    </select>
                </td>
            </tr>
            <tr>
                <td>
                    <c:if test="${wrongHomePhoneNumber ne null}">
                        <p class="wrongInput">
                            <c:out value="${wrongHomePhoneNumber}"/>
                        </p>
                    </c:if>
                    Home phone number
                </td>
                <td><input type="text" name="homeNumber" value="${note.homeNumber}" ></td>
            </tr>
            <tr>
                <td>
                    <c:if test="${wrongMobileNumber ne null}">
                        <p class="wrongInput">
                            <c:out value="${wrongMobileNumber}"/>
                        </p>
                    </c:if>
                    1st Mobile phone number
                </td>
                <td><input type="text" name="mobileNumber" value="${note.mobileNumber}" ></td>
            </tr>
            <tr>
                <td>
                    <c:if test="${wrongMobileNumber2 ne null}">
                        <p class="wrongInput">
                            <c:out value="${wrongMobileNumber2}"/>
                        </p>
                    </c:if>
                    2nd Mobile phone number(optional)
                </td>
                <td><input type="text" name="mobileNumber2" value="${note.mobileNumber2}" ></td>
            </tr>
            <tr>
                <td>
                    <c:if test="${wrongEmail ne null}">
                        <p class="wrongInput">
                            <c:out value="${wrongEmail}"/>
                        </p>
                    </c:if>
                    Email
                </td>
                <td><input type="text" name="email" value="${note.email}" ></td>
            </tr>
            <tr>
                <td>
                    <c:if test="${wrongSkype ne null}">
                        <p class="wrongInput">
                            <c:out value="${wrongSkype}"/>
                        </p>
                    </c:if>
                    Skype
                </td>
                <td><input type="text" name="skype" value="${note.skype}" ></td>
            </tr>
            <tr>
                <td><p>Address</p></td>
            </tr>
            <tr>
                <td>
                    <c:if test="${wrongAddress ne null}">
                        <p class="wrongInput">
                            <c:out value="${wrongAddress}"/>
                        </p>
                    </c:if>
                    Index
                </td>
                <td><input type="number" name="index" value="${note.address.index}"></td>
            </tr>
            <tr>
                <td>
                    <c:if test="${wrongCity ne null}">
                        <p class="wrongInput">
                            <c:out value="${wrongCity}"/>
                        </p>
                    </c:if>
                    City
                </td>
                <td><input type="text" name="city" value="${note.address.city}"></td>
            </tr>
            <tr>
                <td>
                    <c:if test="${wrongStreet ne null}">
                        <p class="wrongInput">
                            <c:out value="${wrongStreet}"/>
                        </p>
                    </c:if>
                    Street
                </td>
                <td><input type="text" name="street" value="${note.address.street}"></td>
            </tr>
            <tr>
                <td>
                    <c:if test="${wrongHouseNumber ne null}">
                        <p class="wrongInput">
                            <c:out value="${wrongHouseNumber}"/>
                        </p>
                    </c:if>
                    House#
                </td>
                <td><input type="number" name="houseNumber" value="${note.address.houseNumber}"></td>
            </tr>
            <tr>
                <td>
                    <c:if test="${wrongFlatNumber ne null}">
                        <p class="wrongInput">
                            <c:out value="${wrongFlatNumber}"/>
                        </p>
                    </c:if>
                    Flat#
                </td>
                <td><input type="number" name="flatNumber" value="${note.address.flatNumber}"></td>
            </tr>
        </table>
        <input type="submit" value="Add note">
    </form>

</body>
</html>
