<%--
  Created by IntelliJ IDEA.
  User: rodgerscott
  Date: 3/28/18
  Time: 11:15 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Pick a number between 1 and 100</h1>
<form action="/guess.jsp" method="POST">
    <label for="numberg">Number: <input type="text" name="numberg" id="numberg"></label><br>
    <button>Submit</button>
</form>
</body>
</html>
