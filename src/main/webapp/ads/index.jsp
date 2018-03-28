<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="../partials/head.jsp">
        <jsp:param name="title" value="Welcome to my site!" />
    </jsp:include>
</head>
<body>
    <jsp:include page="../partials/navbar.jsp" />
    <div class="container">
        <h1>Welcome to the Adlister!</h1>
    </div>
    <table style="margin-left: 20px">
        <th>Item Name</th>
        <th>Description</th>
        <th>Link</th>
    <c:forEach var="ad" items="${adds}">
        <tr>
            <td style="padding-right: 20px">${ad.title}</td>
            <td style="padding-right: 20px">${ad.description}</td>
            <td><form action="/ads/show.jsp" method="POST" id=${ad.id}>
                <button>Listing</button>
            </form></td>
        </tr>
    </c:forEach>
    </table>

</body>
</html>
