package com.generalseguros.dto;

import java.io.Serializable;

public class Menu implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6676768459168106663L;
	
	public static final String ID="id";
	public static final String NOMBRE_MENU="nombre";
	public static final String CLAVE_MENU="clave";
	public static final String SISTEMA_MENU="Sistema";
	public static final String URL_MENU="url";
	public static final String TOOLTIP_MENU="tooltip";
	public static final String URL_IMAGENMENU="urlImagenMenu";
	public static final String MENU_PADRE="menuPadre";
	public static final String MENU_ACTIVO="activo";
	
	
	private int id;
	private String nombre;
	private String clave;
	private int sistemaId;
	private String url;
	private String urlImagen;
	private String tooltip;
	private int menuPadreId;
	private Boolean activo;
	
	private Menu[] menusHijos;
	
	public Menu(){
	}
	
	public Menu(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}
	
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public Boolean getActivo() {
		return activo;
	}
	public void setActivo(Boolean activo) {
		this.activo = activo;
	}
	public Menu[] getMenusHijos() {
		return menusHijos;
	}
	public void setMenusHijos(Menu[] menusHijos) {
		this.menusHijos = menusHijos;
	}

	public int getMenuPadreId() {
		return menuPadreId;
	}

	public void setMenuPadreId(int menuPadreId) {
		this.menuPadreId = menuPadreId;
	}

	public int getSistemaId() {
		return sistemaId;
	}

	public void setSistemaId(int sistemaId) {
		this.sistemaId = sistemaId;
	}

	public String getUrlImagen() {
		return urlImagen;
	}

	public void setUrlImagen(String urlImagen) {
		this.urlImagen = urlImagen;
	}

	public String getTooltip() {
		return tooltip;
	}

	public void setTooltip(String tooltip) {
		this.tooltip = tooltip;
	}
	

}
