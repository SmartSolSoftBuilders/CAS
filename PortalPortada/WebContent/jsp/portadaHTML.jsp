<%@page import="com.generalseguros.portada.Portada"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="../css/superfish.css" media="screen">
		<script type="text/javascript" src="../js/jquery-1.2.6.min.js"></script>
		<script type="text/javascript" src="../js/hoverIntent.js"></script>
		<script type="text/javascript" src="../js/superfish.js"></script>
		<script type="text/javascript">

		// initialise plugins
		jQuery(function(){
			jQuery('ul.sf-menu').superfish();
		});

		</script>
<title>Portada Test</title>
</head>
<body>
<div style="width:800px; margin:0 auto;">
<img alt="Header" src="../images/h1.png">
<br />
<table width="800px"><tr>
<td>
 Hola, Bienvenido: <%=session.getAttribute("edu.yale.its.tp.cas.client.filter.user") %> 
 </td><td align="right">
 <a href="<%= response.encodeURL( request.getContextPath() + Portada.cerrarSesionURL())%>">Cerrar tus sesiones</a>
 </td>
 </tr></table>
 <br /> 
 <%
 Object key = session.getAttribute("edu.yale.its.tp.cas.client.filter.user");
 String permisosHTML = "";
 if( key != null){ 
	 Portada portada = new Portada();
	 permisosHTML = portada.getPermisosHTML(key.toString());
 }
%>

<%=permisosHTML %>
<br /><br /><br />
<img alt="BG" src="../images/bg.jpg">
<br /><br />
<img alt="Footer" src="../images/footer.png">
</div>

</body>
</html>