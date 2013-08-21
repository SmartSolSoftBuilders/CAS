<%@ page contentType="text/html; charset=UTF-8" %>
<jsp:directive.include file="/WEB-INF/view/jsp/default/ui/includes/top.jsp" />
<br />
<br />
<h1> ¿Olvidaste tu contraseña? </h1>
<br />
<form action="OlvidoPasswordServlet"> 

Ingresa tu nombre de usuario para reiniciar tu password.<br />
<br /> <br />
<input type="text" name="nombreUsuarioRecuperar" size="20px"> 
<input type="hidden" name="service" value="<%=request.getParameter("service")%>"> 
<input type="submit" value="Enviar">

<br />
<br />
</form>

<jsp:directive.include file="/WEB-INF/view/jsp/default/ui/includes/bottom.jsp" />