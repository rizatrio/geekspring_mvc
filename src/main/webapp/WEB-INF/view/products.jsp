<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>

<html>
<head>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/main.css" />
</head>

<body>
<h1>Welcome page Products</h1>

<ul>
    <c:forEach var="item" items="${all_products}">
        <li>${item.id}</li>
        <li>${item.title}</li>
        <li>${item.cost}</li>
    </c:forEach>
</ul>

</body>
</html>