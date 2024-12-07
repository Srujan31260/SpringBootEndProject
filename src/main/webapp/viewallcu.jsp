<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="jakarta.tags.core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
    
    <h3 style="text-align: center;"><u>View All</u></h3>
    <table>
        <tr>
            <th>ID</th>
            <th>NAME</th>
            <th>ADDRESS</th>
            <th>CONTACT</th>
            <th>DOB</th>
        </tr>
        <c:forEach items="${culist}" var="cu">
            <tr>
                <td><c:out value="${cu.id}"/></td>
                <td><c:out value="${cu.name}"/></td>
                <td><c:out value="${cu.address}"/></td>
                <td><c:out value="${cu.phno}"/></td>
                <td><c:out value="${cu.dob}"/></td>
             
            </tr>
        </c:forEach>
    </table>
</body>
</html>
