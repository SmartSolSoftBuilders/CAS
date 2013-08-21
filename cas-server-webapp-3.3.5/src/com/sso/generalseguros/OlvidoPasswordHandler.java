package com.sso.generalseguros;

import java.util.ResourceBundle;

import com.generalseguros.seguridad.GSSeguridadWSStub;
import com.generalseguros.seguridad.GSSeguridadWSStub.Usuario;

/**
 * Clase que ayudara en el manejo y llamada del WebService para
 * Cambiar la contraseña automaticamente
 * ingresando solo el nombre de usuario
 * 
 * @author Smart Solutions
 *
 */
public class OlvidoPasswordHandler {
	
	private String username;
	
	public String generarNuevoPassword() throws Exception{
		Usuario usuario = new Usuario();
		
		usuario.setNombreUsuario(username);
		
		return performWSCall(usuario);
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	 private String performWSCall(Usuario usuario) throws Exception{
	    	
	    	String endPoint = ResourceBundle.getBundle("com.sso.generalseguros.GSSSOWebServiceEndPointConfig").getString("GSWebServicesSSO");
			
	    	
	    	GSSeguridadWSStub stub = new GSSeguridadWSStub(endPoint);
	    	
			GSSeguridadWSStub.GenerarContrasena generarContrasenaWSInstance = (GSSeguridadWSStub.GenerarContrasena) getCallObject(GSSeguridadWSStub.GenerarContrasena.class);
			
			
			generarContrasenaWSInstance.setUsuario(usuario);
			
			
			Usuario response = stub.generarContrasena(generarContrasenaWSInstance)
			.get_return();
			
			if(response!= null){
				return response.getMensaje();
			}
			return null;
	    }
	    
	    @SuppressWarnings("rawtypes")
	    public org.apache.axis2.databinding.ADBBean getCallObject(
	 			java.lang.Class type) throws java.lang.Exception {
	 		return (org.apache.axis2.databinding.ADBBean) type.newInstance();
	 	}

}
