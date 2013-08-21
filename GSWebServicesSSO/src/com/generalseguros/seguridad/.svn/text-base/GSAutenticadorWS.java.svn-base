package com.generalseguros.seguridad;

import static com.generalseguros.comun.FactoryBO.FactoryBI;

import com.generalseguros.dto.Usuario;
import com.google.gson.Gson;

public class GSAutenticadorWS {

	public Usuario validaUsuario(String usuario, String contrasena, String sessionId){
		IValidaUsuario validaUsuario = FactoryBI.createValidaUsuario();
		return validaUsuario.execute(usuario, contrasena, sessionId);
	}
	
	public String validaUsuarioJSON(String usuario, String contrasena, String sessionId){
		IValidaUsuario validaUsuario = FactoryBI.createValidaUsuario();
		Usuario user = validaUsuario.execute(usuario, contrasena, sessionId);
		
		String jsonResponse = new Gson().toJson(user);
		return jsonResponse;
	}
}
