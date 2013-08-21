package com.generalseguros.dto;

import java.io.Serializable;
import java.util.Date;

public class BitacoraUsuario implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2305598096004628604L;
	
	
	public static final String ID="id";
	public static final String USUARIO="usuario";
	public static final String SISTEMA="sistema";
	public static final String FECHA_ACCESO="fechaAcceso";
	public static final String MENU_USUARIO="menuUsuario";
	public static final String FECHA_SALIDA="fechaSalida";
	public static final String SESSION_ID="sessionId";
	
	
	
	private int id;
	private Usuario usuario;
	private Sistema sistema;
	private Date fechaAcceso;
	private Date fechaSalida;
	private String sessionId;
	
	private MenuUsuario menuUsuario;
	
	public BitacoraUsuario(){
	}
	
	public BitacoraUsuario(Usuario usuario, String sessionId) {
		this.usuario = usuario;
		this.sessionId = sessionId;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public Sistema getSistema() {
		return sistema;
	}
	public void setSistema(Sistema sistema) {
		this.sistema = sistema;
	}
	public Date getFechaAcceso() {
		return fechaAcceso;
	}
	public void setFechaAcceso(Date fechaAcceso) {
		this.fechaAcceso = fechaAcceso;
	}
	public Date getFechaSalida() {
		return fechaSalida;
	}
	public void setFechaSalida(Date fechaSalida) {
		this.fechaSalida = fechaSalida;
	}
	public MenuUsuario getMenuUsuario() {
		return menuUsuario;
	}
	public void setMenuUsuario(MenuUsuario menuUsuario) {
		this.menuUsuario = menuUsuario;
	}

	public String getSessionId() {
		return sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}
	
	

}
