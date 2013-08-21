package com.sso.generalseguros;
/*
 * 
 * */

import java.util.ResourceBundle;

import org.jasig.cas.authentication.handler.support.AbstractUsernamePasswordAuthenticationHandler;
import org.jasig.cas.authentication.principal.UsernamePasswordCredentials;
import org.springframework.util.StringUtils;
import org.springframework.web.context.request.RequestContextHolder;

import com.generalseguros.seguridad.GSAutenticadorWSStub;
import com.generalseguros.seguridad.GSAutenticadorWSStub.Usuario;

public final class GSSeguridadAuthenticationHandler extends
    AbstractUsernamePasswordAuthenticationHandler {

    public GSSeguridadAuthenticationHandler() {
    }

    public boolean authenticateUsernamePasswordInternal(
        final UsernamePasswordCredentials credentials) {
        final String username = credentials.getUsername();
        final String password = credentials.getPassword();
        
        boolean authenticated = false;

        if (StringUtils.hasText(username) && StringUtils.hasText(password)) {
            
        	try {
        		String sessionID = RequestContextHolder.currentRequestAttributes().getSessionId();
        		
        		authenticated = performWSAuthentication(username, getPasswordEncoder().encode(password), sessionID);
        	} catch (Exception e) {
				e.printStackTrace();
			}
        }

        if( authenticated)
        	log
            .debug("User [" + username
                + "] was successfully authenticated.");
        else
        	log.debug("User [" + username + "] failed authentication");

        return authenticated;
    }
    
    private boolean performWSAuthentication(String userName, String password, String sessionId) throws Exception{
    	
    	String endPoint = ResourceBundle.getBundle("com.sso.generalseguros.GSSSOWebServiceEndPointConfig").getString("GSAutenticadorWS");
		
    	GSAutenticadorWSStub stub = new GSAutenticadorWSStub(endPoint);
    	
    	GSAutenticadorWSStub.ValidaUsuario validaUsuarioWSInstance = new GSAutenticadorWSStub.ValidaUsuario();
    		
		validaUsuarioWSInstance.setUsuario(userName);
		validaUsuarioWSInstance.setContrasena(password);
		validaUsuarioWSInstance.setSessionId(sessionId);
			
		Usuario response = stub.validaUsuario(validaUsuarioWSInstance)
			.get_return();
		
		if(response!= null && response.getMensaje()!= null){
			return false;
		}else{
			return true;
		}		
		

    }
    
    @SuppressWarnings("rawtypes")
    public org.apache.axis2.databinding.ADBBean getCallObject(
 			java.lang.Class type) throws java.lang.Exception {
 		return (org.apache.axis2.databinding.ADBBean) type.newInstance();
 	}
}
