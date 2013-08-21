package com.generalseguros.portada;

import java.io.Serializable;
import java.net.URL;
import java.util.ResourceBundle;

import com.generalseguros.dto.xsd.Permisos;
import com.generalseguros.dto.xsd.Sistema;
import com.generalseguros.dto.xsd.Usuario;
import com.generalseguros.seguridad.GSSeguridadWS;
import com.generalseguros.seguridad.GSSeguridadWSLocator;

public class Portada implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9040745506901042760L;
	
	public String transformaPermisosJson(String[] permisos)
	{
		permisos = new String[]{"a","b"};
		
		return "a , b";
		
	}
	
	public Permisos getPermisos(String nombreUsuario) throws Exception{
		String endPoint = ResourceBundle.getBundle("com.sso.generalseguros.GSSSOWebServiceEndPointConfig").getString("GSWebServicesSSO");
		String nombreSistema = ResourceBundle.getBundle("com.sso.generalseguros.GSSSOWebServiceEndPointConfig").getString("NombreSistema");
		
		Usuario usuario = new Usuario();
		usuario.setNombreUsuario(nombreUsuario);
		
		Sistema sistema = new Sistema();
		sistema.setNombre(nombreSistema);
		
		GSSeguridadWS servicio = new GSSeguridadWSLocator();
		
		Permisos permisos = servicio.getGSSeguridadWSHttpSoap11Endpoint(new URL(endPoint)).obtenPermisos(nombreUsuario, nombreSistema);
		return permisos;
	}
	
	public String getPermisosHTML(String nombreUsuario) throws Exception{
		String endPoint = ResourceBundle.getBundle("com.sso.generalseguros.GSSSOWebServiceEndPointConfig").getString("GSWebServicesSSO");
		String nombreSistema = ResourceBundle.getBundle("com.sso.generalseguros.GSSSOWebServiceEndPointConfig").getString("NombreSistema");
		
		Usuario usuario = new Usuario();
		usuario.setNombreUsuario(nombreUsuario);
		
		Sistema sistema = new Sistema();
		sistema.setNombre(nombreSistema);
		
		GSSeguridadWS servicio = new GSSeguridadWSLocator();
		
		String permisosHTML = servicio.getGSSeguridadWSHttpSoap11Endpoint(new URL(endPoint)).obtenPermisosHTML(nombreUsuario, nombreSistema);
		return permisosHTML;
	}
	
	public String getPermisosXML(String nombreUsuario) throws Exception{
		String endPoint = ResourceBundle.getBundle("com.sso.generalseguros.GSSSOWebServiceEndPointConfig").getString("GSWebServicesSSO");
		String nombreSistema = ResourceBundle.getBundle("com.sso.generalseguros.GSSSOWebServiceEndPointConfig").getString("NombreSistema");
		
		Usuario usuario = new Usuario();
		usuario.setNombreUsuario(nombreUsuario);
		
		Sistema sistema = new Sistema();
		sistema.setNombre(nombreSistema);
		
		GSSeguridadWS servicio = new GSSeguridadWSLocator();
		
		String permisosXML = servicio.getGSSeguridadWSHttpSoap11Endpoint(new URL(endPoint)).obtenPermisosXML(nombreUsuario, nombreSistema);
		return permisosXML;
	}
	
	public static String cerrarSesionURL(){
		return "/LogoutServlet";
	}

}
