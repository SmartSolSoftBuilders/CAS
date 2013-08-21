package com.generalseguros.dto;

import static com.generalseguros.db.CommonDB.getPropertyValue;

import java.io.Serializable;

public class Permisos implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2973498220947028869L;
	
	public static final String ID_USUARIO=getPropertyValue("Permisos.IdUsuario");
	public static final String MENU_ID=getPropertyValue("Permisos.MenuId");
	public static final String MENU_PADRE=getPropertyValue("Permisos.MenuPadre");
	public static final String MENU_NOMBRE=getPropertyValue("Permisos.MenuNombre");
	public static final String MENU_IMAGEN=getPropertyValue("Permisos.MenuImagen");
	public static final String MENU_CLAVE=getPropertyValue("Permisos.MenuClave");
	public static final String MENU_URL=getPropertyValue("Permisos.MenuURL");
	public static final String MENU_TOOLTIP=getPropertyValue("Permisos.MenuTooltip");
	public static final String SISTEMA_NOMBRE=getPropertyValue("Permisos.SistemaNombre");
	public static final String SISTEMA_URL=getPropertyValue("Permisos.SistemaURL");
	public static final String SISTEMA_HASHVALUE=getPropertyValue("Permisos.SistemaHashValue");
	public static final String SISTEMA_ID=getPropertyValue("Permisos.SistemaId");
	public static final String TIPO_USUARIO=getPropertyValue("Permisos.TipoUsuario");
	
	
	private Usuario usuario;
	private Sistema[] sistemas;
	
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public Sistema[] getSistemas() {
		return sistemas;
	}
	public void setSistemas(Sistema[] sistemas) {
		this.sistemas = sistemas;
	}
}
