<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title><c:out value="${ tilte }">Axelle JURIN</c:out></title>
</head>
<body>
	<%@ include file="menu.jsp" %>
	
	<c:choose>
		<c:when test="${ page == '' }">
			<%@ include file="pages/accueil.jsp" %>
		</c:when>
		<c:when test="${ page == 'formations' }">
			<%@ include file="pages/formations.jsp" %>
		</c:when>	
		<c:when test="${ page == 'experiences' }">
			<%@ include file="pages/experiences.jsp" %>
		</c:when>	
		<c:when test="${ page == 'competences' }">
			<%@ include file="pages/competences.jsp" %>
		</c:when>	
		<c:when test="${ page == 'contact' }">
			<%@ include file="pages/contact.jsp" %>
		</c:when>
		<c:otherwise>
			<%@ include file="pages/404.jsp" %>
		</c:otherwise>
	</c:choose>
	
	<%@ include file="footer.jsp" %>
</body>
</html>