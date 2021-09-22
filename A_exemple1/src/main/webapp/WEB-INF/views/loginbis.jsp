<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!-- la taglib pour afficher entre autres les messages d'erreur...) -->

<html>
<head>
    <title>Identification</title>
</head>
<body>
<h1>IDENTIFICATION</h1>
<!-- on utilise form:form qui vient de spring mvc et on précise le modelAttribute. Sinon les messages d'erreur ne sont pas traités -->
<form method="post" action="${pageContext.request.contextPath}/bis/login">
    <p><label>login</label><input type="text" name="login"/>
    </p>
    <p><label>mot de passe</label><input type="password" name="password"/></p>
    <p><button type="submit">Envoyer</button></p>
</form>


<c:import url="session.jsp"></c:import>

</body>
</html>