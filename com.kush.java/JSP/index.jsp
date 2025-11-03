<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" import="java.sql.*"%>
<%--<%@ taglib prefix="c" uri="http" %>--%>
<%--<%@ taglib prefix="sql" uri="http://jakarta.sun.com/jsp/jstl/sql" %>--%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="sql" uri="jakarta.tags.sql" %>
<!doctype html>
<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>Profile</title>
</head>
<body>
101 <br>
Kush <br>
    <sql:setDataSource var="myDB"
    driver="com.mysql.jdbc.Driver"
    url="jdbc:mysql://localhost:3306/dqm"
    user="root" password="Kush123@25RAC2"/>
    <sql:query dataSource="${myDB}" var="result">
        SELECT * FROM log
    </sql:query>
    <c:forEach var="row" items="${result.rows}">
        ${row.id} ${row.attributes} ${row.comission_rate} ${row.filename} ${row.omission_rate} ${row.upload_date_time} <br>
    </c:forEach>

<%--<%--%>
<%--    try {--%>
<%--        Class.forName("com.mysql.jdbc.Driver");--%>
<%--        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dqm", "root", "Kush123@25RAC2");--%>
<%--        Statement stmt = con.createStatement();--%>
<%--        ResultSet rs = stmt.executeQuery("SELECT * FROM log");--%>
<%--        while (rs.next()) {--%>
<%--            out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getDouble(3) + " " + rs.getString(4) + " " + rs.getDouble(5) + " " + rs.getTimestamp(6) + "<br>");--%>
<%--        }--%>
<%--        rs.close();--%>
<%--        stmt.close();--%>
<%--        con.close();--%>
<%--        System.out.println("Connection closed");--%>
<%--    }--%>
<%--    catch (Exception e){--%>
<%--        System.out.println("Error: " + e.getMessage());--%>
<%--        out.println("Error: " + e.getMessage());--%>
<%--    }--%>
<%--%>--%>
</body>
</html>