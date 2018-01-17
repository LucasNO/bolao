<%@ tag language="java" pageEncoding="UTF-8"%>
<%@ attribute name="titulo" required="true"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec" %>

<!doctype html>
<html lang="pt_BR">
<head>
<spring:url value="/resources/css/bootstrap.min.css" var="bootstrap" />
<spring:url value="/resources/js/bootstrap.min.js" var="bootstrapjs" />
<spring:url value="/resources/js/jquery-3.2.1.slim.min.js" var="jquery" />
<spring:url value="/resources/js/popper.min.js" var="popper" />
<spring:url value="/resources/js/fontawesome-all.min.js" var="fonteawesome" />


<title>Bolão do Mau - ${titulo }</title>

<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link href="${bootstrap}" rel="stylesheet" />
</head>
<body>
	
	<jsp:doBody />  	

	<!-- Optional JavaScript -->
	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
	<script src="${jquery}"></script>
	<script src="${popper}"></script>
	<script src="${bootstrapjs}"></script>
	<script src="${fonteawesome}"></script>
</body>
</html>

