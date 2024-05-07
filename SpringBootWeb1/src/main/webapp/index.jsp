<%@page language ="java" %>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="../resources/static/index.css">
    <title>SpringBoot Web App</title>
</head>
<body>
<%--<h2>Simple Calculator</h2>--%>
<h2>
    User Management
</h2>

<%--<form action="add">--%>
<%--    <label for="num1">Enter First Number: </label>--%>
<%--    <input type="text" name="num1" id="num1"><br>--%>
<%--    <label for="num2">Enter Second Number: </label>--%>
<%--    <input type="text" name="num2" id="num2"><br>--%>
<%--    <input type="submit" value="Add">--%>
<%--</form>--%>


<form action="addUser">
    <label for="uid">Enter ID: </label>
    <input type="text" name="uid" id="uid"><br>
    <label for="uname">Enter Name: </label>
    <input type="text" name="uname" id="uname"><br>
    <input type="submit" value="Submit">
</form>


</body>
</html>
