<%@page import="com.generalseguros.dto.xsd.Usuario"%>
<%@page import="com.generalseguros.dto.xsd.Menu"%>
<%@page import="com.generalseguros.dto.xsd.Sistema"%>
<%@page import="com.generalseguros.dto.xsd.Permisos"%>
<%@page import="com.generalseguros.portada.Portada"%>
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
 <%
 Object key = session.getAttribute("edu.yale.its.tp.cas.client.filter.user");
 
 if( key != null){ 
	 Portada portada = new Portada();
	 Permisos permisos = portada.getPermisos(key.toString());
%>
<table width="100%"><tr>
<td>
 Hola, Bienvenido: <%=session.getAttribute("edu.yale.its.tp.cas.client.filter.user") %>.
 </td>
 <td align="center"> <%=permisos.getUsuario().getTipoUsuario().getRolDescripcion()%>
 
</td>
<td align="right">
 <a href="<%= response.encodeURL( request.getContextPath() + Portada.cerrarSesionURL())%>">Cerrar tus sesiones</a>
 </td>
   </tr></table>
 <br /> 
<ul class="sf-menu">
<%
    for ( Sistema sistema : permisos.getSistemas() ) {
        %>
        <li class="current">
				<a href="<%= sistema.getUrl() %>"><%= sistema.getNombre() %></a>
				<% 
				int i = 0;
				for (Menu menuNivel1: sistema.getMenus()){ 
				%>
				<ul>
					<li <%=i==0?"class='current'":"" %>>
						<a href="<%=menuNivel1.getUrl()%>"><%=menuNivel1.getNombre() %></a>
						<% 
						if( menuNivel1.getMenusHijos() != null){
						   for (Menu menuNivel2: menuNivel1.getMenusHijos()){ 
						   if(menuNivel2 != null){ %>
						   
						<ul>
							<li class="current">
								<a href="<%=menuNivel2.getUrl()%>"><%=menuNivel2.getNombre() %></a>
							</li>
						</ul>
						<%
						   }// end if menuNivel2
						  } // end for
						} // end if
						%>
					</li>
				</ul>
				<%
				}
				%>
        </li>
        <% i++;
    } // for Sistemas
%>
</ul>
  <%
    } // if Key
%>
<br /><br /><br />
<img alt="BG" src="../images/bg.jpg">
<br /><br />
<img alt="Footer" src="../images/footer.png">
</div>
</body>
</html>