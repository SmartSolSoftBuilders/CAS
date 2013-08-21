package com.sso.generalseguros;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class OlvidoPasswordServlet
 */
public class OlvidoPasswordServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String NOMBRE_USUARIO_RECUPERAR = "nombreUsuarioRecuperar";
	private static final String SERVICE = "service";
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public OlvidoPasswordServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nombreUsuarioARecuperar = request.getAttribute(NOMBRE_USUARIO_RECUPERAR) != null ? (String)request.getAttribute(NOMBRE_USUARIO_RECUPERAR):null;
		
		if(nombreUsuarioARecuperar == null || "".equals(nombreUsuarioARecuperar)){
			nombreUsuarioARecuperar = request.getParameter(NOMBRE_USUARIO_RECUPERAR);
		}
		
		OlvidoPasswordHandler handler = new OlvidoPasswordHandler();
		handler.setUsername(nombreUsuarioARecuperar);
		try {
			
			handler.generarNuevoPassword();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		String serviceURL =request.getAttribute(SERVICE) != null ? (String)request.getAttribute(SERVICE):null;
		
		if(serviceURL == null || "".equals(serviceURL)){
			serviceURL = request.getParameter(SERVICE);
		}
		response.sendRedirect(serviceURL);
	}
}
