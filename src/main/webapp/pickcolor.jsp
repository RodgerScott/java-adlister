<%--
  Created by IntelliJ IDEA.
  User: rodgerscott
  Date: 3/28/18
  Time: 11:00 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <h1>Pick your favorite color</h1>

    <form action="/colorpage.jsp" method="POST">
    <label for="color">Color: <input type="text" name="color" id="color"></label>
        <button>Submit</button>
    </form>
</body>
</html>
