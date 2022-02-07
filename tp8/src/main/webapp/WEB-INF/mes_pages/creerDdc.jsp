<%@page contentType="text/html"%>
<%@include file="/WEB-INF/mes_pages/include.jsp" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
	<body>
		<h2>Créer une demande de congés</h2>
		
		<a href="http://localhost:8080/tp8/ddc/home">Retour</a>
		<br/><br/>
		Nous sommes le ${now}.
		<br/><br/>
		<br/>
		
		<form:form modelAttribute="demandeConge" methode="POST" action="creerDdc">Type de congé :
		 <form:select path="type" items="${typeDdc}"/> <br/>
			<br/>
			<table>
				<tr>
					<td width="200">
						<b>Période:</b>
					</td>
					<td width="200">
						Date début: <form:input path="periode.dateDebut" />
					</td>
					<td width="200">
						Nombre de jours: <form:input path="periode.nbJours" />
					</td>
				</tr>
			</table>
			<br/>
			<table>
				<tr>
					<td width="200">
						<b>Collaborateur:</b>
					</td>
					<td width="200">
						Prénom: <form:input path="collaborateur.prenom" />
					</td>
					<td width="200">
						Nom: <form:input path="collaborateur.nom" />
					</td>
				</tr>
			</table>
			<br/>
			<input type="Submit" value="Valider"/>
		</form:form>
		
		<br/>
		<p style="color:red;">${errorMessage}</p>
		<p style="color:green;">${infoMessage}</p>
		<br/>

		<form action="<c:url value="/ddc/j_spring_security_logout" />" method="post">
		    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
		    <input type="submit" value="Logout" />
		</form>
	</body>
</html>