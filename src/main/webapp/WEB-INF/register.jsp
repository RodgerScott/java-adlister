<%--
  Created by IntelliJ IDEA.
  User: rodgerscott
  Date: 4/4/18
  Time: 3:26 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Register Page</title>

    <h1>Register Here</h1>
    <form action="POST" method="/register">
        <label for="username">Username: </label>
        <input type="text" id="username" name="username"><br>
        <label for="password">Password: </label>
        <input type="password" id="password" name="password"><br>
        <label for="email-address">Email: </label>
        <input type="text" id="email-address" name="email-address"><br>
        <button>Submit</button>
    </form>

</head>
<body>

</body>
</html>
