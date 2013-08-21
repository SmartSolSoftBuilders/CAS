package com.generalseguros.seguridad;

import java.io.Serializable;

import com.generalseguros.db.CommonDB;
import com.generalseguros.dto.Usuario;

public interface IModificaContrasena extends Serializable {
	
	Usuario execute(Usuario usuario);
	
	public final static String OBTENER_CORREO_QUERY= CommonDB.getPropertyValue("ObtenerCorreoQuery");
	
	public final static String CAMBIAR_CONTRASENA_QUERY= CommonDB.getPropertyValue("CambiarContrasenaQuery");

}
