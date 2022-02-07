<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
	<body>
		<h2>Liste de mes demandes de congés</h2>
		
		<a href="http://localhost:8080/tp8/ddc/home">Retour</a>
	
		<ul>
			<li><a href="http://localhost:8080/tp8/ddc/detailDdc?ddcId=1">Demande n°1 du xx/yy/zzz</a>, validée le xx/yy/zzz</li>
			<li><a href="http://localhost:8080/tp8/ddc/detailDdc?ddcId=2">Demande n°2 du xx/yy/zzz</a>, refusée le xx/yy/zzz</li>
			<li><a href="http://localhost:8080/tp8/ddc/detailDdc?ddcId=3">Demande n°3 du xx/yy/zzz</a>, validée le xx/yy/zzz</li>
		</ul>
		
		<form action="<c:url value="/ddc/j_spring_security_logout" />" method="post">
		    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
		    <input type="submit" value="Logout" />
		</form>
	</body>
</html>
