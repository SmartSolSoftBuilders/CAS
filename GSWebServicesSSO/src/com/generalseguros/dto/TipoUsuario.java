package com.generalseguros.dto;

import java.io.Serializable;

public class TipoUsuario implements Serializable {

	public TipoUsuario(){
	}
	
	public TipoUsuario(String rolDescripcion){
		this.rolDescripcion = rolDescripcion;
	}
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6899005673228801097L;
	
	private String rolDescripcion;
	private Sistema[] sistemas;
	
	public Sistema[] getSistemas() {
		return sistemas;
	}
	public void setSistemas(Sistema[] sistemas) {
		this.sistemas = sistemas;
	}
	public String getRolDescripcion() {
		return rolDescripcion;
	}
	public void setRolDescripcion(String rolDescripcion) {
		this.rolDescripcion = rolDescripcion;
	}

}
