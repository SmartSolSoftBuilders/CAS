package com.generalseguros.seguridad;

import java.io.Serializable;

import com.generalseguros.dto.Usuario;

public interface IValidaUsuario extends Serializable {
	
	Usuario execute(String usuario, String contrasena, String sessionId);
	
	public static final String VALIDA_USUARIO_QUERY = "ValidaUsuarioQuery";
	public static final String VALIDA_USUARIO_INSERT_BITACORA = "ValidaUsuarioInsertBitacora";
	
	// TODO RCGF esto es temporal en lo que se ejecutan los scripts
	public static final String VALIDA_USUARIO_INSERT_SESSION = "ValidaUsuarioInsertSession";
	

}
