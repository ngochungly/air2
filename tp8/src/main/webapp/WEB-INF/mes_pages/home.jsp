<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
	<body>
		<h2>Bienvenue <security:authentication property="principal.username"/> !</h2>
		<h2>${message_role}</h2>
		<h2>Page d'accueil Collaborateur</h2>
	
		<a href="http://localhost:8080/tp8/ddc/listerDdc">Lister mes demandes de cong�s</a>
		<br/>
		<a href="http://localhost:8080/tp8/ddc/creerDdc">Cr�er une demande de cong�</a>
		
		<br/><br/>
		<form action="<c:url value="/ddc/j_spring_security_logout" />" method="post">
		    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
		    <input type="submit" value="Logout" />
		</form>
	</body>
</html>
