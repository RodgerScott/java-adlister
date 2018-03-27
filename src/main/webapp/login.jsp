<%--
  Created by IntelliJ IDEA.
  User: rodgerscott
  Date: 3/27/18
  Time: 10:22 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<%-- Original not good way

<%--<%--%>
<%--String name = request.getParameter("name");--%>
<%--String password = request.getParameter("password");--%>

    <%--if (name == null) {--%>
        <%--name = "temp";--%>
    <%--}--%>

    <%--if (password == null) {--%>
        <%--password = "temp";--%>
    <%--}--%>

    <%--if (name.equals("admin") && password.equals("password")) {--%>
        <%--response.sendRedirect("/profile.jsp");--%>
    <%--}--%>

    <%--else if ((!name.equals("admin") && !password.equals("password")) && (!name.equals("temp") && !password.equals("temp"))) {--%>
        <%--response.sendRedirect("/login.jsp");--%>
    <%--}--%>
<%--%>--%>

<%-- better way via Ben H --%>

<%
    if (request.getMethod().equals("POST")) {
        String name = request.getParameter("name");
        String password = request.getParameter("password");
        if (name.equals("admin") && password.equals("password")) {
            response.sendRedirect("/profile.jsp");
        }
        else if (!name.equals("admin") || !password.equals("password")) {
            response.sendRedirect("/login.jsp");
        }
    }
%>


<html>
<head>
    <title>Title</title>
</head>
<body>
<jsp:include page="partials/header.jsp" />

<h1>Hello</h1>

<h2>Please Login Below</h2>

<form method="POST" action="login.jsp">
    <label for="name_field">Name: <input type="text" name="name" id="name_field"/></label><br>
    <label for="password_field">Password: <input type="password" name="password" id="password_field"></label><br>
    <button id="sub_button">Submit</button>
</form>


</body>
</html>