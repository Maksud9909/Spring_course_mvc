<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: maksudrustamov
  Date: 29/12/23
  Time: 14:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

</head>
<body>
<h2>Dear Employee you are welcome</h2>
<br>
<%--Your name: ${param.EmployeeName}--%>
Your Name: ${employee.name}
<br><br>
Your Surname: ${employee.surname}
<br><br>
Your Salary: ${employee.salary}
<br><br>
Your Department: ${employee.department}
<br><br>
Your car: ${employee.carBrand}
<br><br>
Language(s):
<ul>
    <c:forEach var="lang" items="${employee.languages}">
        <li>
            ${lang}
        </li>
    </c:forEach>
</ul>
<br><br>
Phone Number: ${employee.phoneNumber}
<br><br>
Email: ${employee.email}
</body>
</html>
