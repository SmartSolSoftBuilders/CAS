package com.generalseguros.dto;

import java.io.Serializable;
import java.util.Date;

import static com.generalseguros.db.CommonDB.getPropertyValue;

public class Usuario implements Serializable {

	public Usuario(){
	}
	
	public Usuario(int id){
		this.id = id;
	}
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -508271385044551810L;
	
	public static final String ID=getPropertyValue("Usuario.id");
	public static final String NOMBRE_USUARIO=getPropertyValue("Usuario.nombreUsuario");
	public static final String CONTRASENA=getPropertyValue("Usuario.password");
	public static final String FECHA_PASSWORD=getPropertyValue("Usuario.fechaPassword");
	public static final String NOMBRE_PERSONA=getPropertyValue("Usuario.nombrePersona");
	public static final String CORREO_ELECTRONICO=getPropertyValue("Usuario.correoElectronico");
	public static final String NO_CLIENTE=getPropertyValue("Usuario.noCliente");
	public static final String AP_PATERNO=getPropertyValue("Usuario.apellidoPaterno");
	public static final String AP_MATERNO=getPropertyValue("Usuario.apellidoMaterno");
	public static final String CVE_AREA=getPropertyValue("Usuario.claveArea");
	public static final String CVE_DEPTO=getPropertyValue("Usuario.claveDepartamento");
	public static final String ACTIVO=getPropertyValue("Usuario.activo");
	public static final String FECHA_REGISTRO=getPropertyValue("Usuario.fechaRegistro");
	public static final String USUARIO_REGISTRO=getPropertyValue("Usuario.UsuarioRegistro");
	
	
	private int id;
	private String nombreUsuario;
	private String contrasena;
	private Date fechaPassword;
	private String nombrePersona;
	private String correoElectronico;
	private String noCliente;
	private String apellidoPaterno;
	private String apellidoMaterno;
	private String claveArea;
	private String claveDepartamento;
	private boolean activo;
	private Date fechaRegistro;
	private Usuario usuarioRegistro;
	private TipoUsuario tipoUsuario;
	
	/**
	 * Esta variable mensaje sera usada para enviar mensajes al usuario.
	 * En caso que haya intentos fallidos.
	 * 
	 */
	private String mensaje;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombreUsuario() {
		return nombreUsuario;
	}
	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}
	public String getContrasena() {
		return contrasena;
	}
	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}
	public Date getFechaPassword() {
		return fechaPassword;
	}
	public void setFechaPassword(Date fechaPassword) {
		this.fechaPassword = fechaPassword;
	}
	public String getNombrePersona() {
		return nombrePersona;
	}
	public void setNombrePersona(String nombrePersona) {
		this.nombrePersona = nombrePersona;
	}
	public String getCorreoElectronico() {
		return correoElectronico;
	}
	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}
	public String getNoCliente() {
		return noCliente;
	}
	public void setNoCliente(String noCliente) {
		this.noCliente = noCliente;
	}
	public String getApellidoPaterno() {
		return apellidoPaterno;
	}
	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}
	public String getApellidoMaterno() {
		return apellidoMaterno;
	}
	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}
	public String getClaveArea() {
		return claveArea;
	}
	public void setClaveArea(String claveArea) {
		this.claveArea = claveArea;
	}
	public String getClaveDepartamento() {
		return claveDepartamento;
	}
	public void setClaveDepartamento(String claveDepartamento) {
		this.claveDepartamento = claveDepartamento;
	}
	public boolean isActivo() {
		return activo;
	}
	public void setActivo(boolean activo) {
		this.activo = activo;
	}
	public Date getFechaRegistro() {
		return fechaRegistro;
	}
	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}
	public Usuario getUsuarioRegistro() {
		return usuarioRegistro;
	}
	public void setUsuarioRegistro(Usuario usuarioRegistro) {
		this.usuarioRegistro = usuarioRegistro;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public TipoUsuario getTipoUsuario() {
		return tipoUsuario;
	}

	public void setTipoUsuario(TipoUsuario tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}

}
