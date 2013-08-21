package com.generalseguros.seguridad;

import static com.generalseguros.comun.FactoryBO.FactoryBI;

import com.generalseguros.comun.HTMLConverter;
import com.generalseguros.dto.Permisos;
import com.generalseguros.dto.Sistema;
import com.generalseguros.dto.Usuario;
import com.google.gson.Gson;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.StaxDriver;

public class GSSeguridadWS {
	
	public String obtenTipoUsuario(String usuario){
		IObtenUsuario obtenUsuario = FactoryBI.createObtenUsuario();
		Usuario user = obtenUsuario.execute(usuario, null, false);
		return user.getTipoUsuario().getRolDescripcion();
	}
	
	public String obtenNombreUsuario(String sessionId){
		IObtenUsuario obtenUsuario = FactoryBI.createObtenUsuario();
		Usuario user = obtenUsuario.execute(null, sessionId, true);
		return user.getNombreUsuario();
	}

	public Permisos obtenPermisos(String nombreUsuario, String nombreSistema){
		IObtenPermisos obtenPermisos = FactoryBI.createObtenPermisos();
		
		Usuario usuario = new Usuario();
		usuario.setNombreUsuario(nombreUsuario);
		
		Sistema sistema = new Sistema();
		sistema.setNombre(nombreSistema);
		
		Permisos permiso = obtenPermisos.execute(usuario, sistema);
		return permiso;
	}
	
	public String obtenPermisosJSON(String nombreUsuario, String nombreSistema){
		IObtenPermisos obtenPermisos = FactoryBI.createObtenPermisos();
		
		Usuario usuario = new Usuario();
		usuario.setNombreUsuario(nombreUsuario);
		
		Sistema sistema = new Sistema();
		sistema.setNombre(nombreSistema);
		
		Permisos permiso = obtenPermisos.execute(usuario, sistema);
		String jsonResponse = new Gson().toJson(permiso);
		return jsonResponse;
	}
	
	public String obtenPermisosHTML(String nombreUsuario, String nombreSistema){
		IObtenPermisos obtenPermisos = FactoryBI.createObtenPermisos();
		
		Usuario usuario = new Usuario();
		usuario.setNombreUsuario(nombreUsuario);
		
		Sistema sistema = new Sistema();
		sistema.setNombre(nombreSistema);
		
		Permisos permiso = obtenPermisos.execute(usuario, sistema);
		
		String htmlResponse = new HTMLConverter().generateHTMLFromPermisos(permiso);
		return htmlResponse;
	}
	
	public String obtenPermisosXML(String nombreUsuario, String nombreSistema){
		IObtenPermisos obtenPermisos = FactoryBI.createObtenPermisos();
		
		Usuario usuario = new Usuario();
		usuario.setNombreUsuario(nombreUsuario);
		
		Sistema sistema = new Sistema();
		sistema.setNombre(nombreSistema);
		
		Permisos permiso = obtenPermisos.execute(usuario, sistema);
		XStream xstream = new XStream(new StaxDriver());
		return xstream.toXML(permiso);
	}
	
	
	public Usuario generarContrasena(Usuario usuario){
		IModificaContrasena modificaContrasena = FactoryBI.createModificaContrasena();
		usuario = modificaContrasena.execute(usuario);
		return usuario;
	}

}
