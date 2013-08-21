
/**
 * GSSeguridadWSTest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */
package com.generalseguros.seguridad;

import com.generalseguros.seguridad.GSSeguridadWSStub.Sistema;
import com.generalseguros.seguridad.GSSeguridadWSStub.Usuario;

/*
 *  GSSeguridadWSTest Junit test case
 */

public class GSSeguridadWSTest extends junit.framework.TestCase {

	/**
	 * Auto generated test method
	 */
	public void testgenerarContrasena() throws java.lang.Exception {

		//GSSeguridadWSStub stub = new GSSeguridadWSStub("http://localhost:8080/axis2/services/GSSeguridadWS?wsdl");// the default
		GSSeguridadWSStub stub = new GSSeguridadWSStub();// the default
															// implementation
															// should point to
															// the right
															// endpoint
		GSSeguridadWSStub.GenerarContrasena generarContrasena10 = (GSSeguridadWSStub.GenerarContrasena) getTestObject(GSSeguridadWSStub.GenerarContrasena.class);
		
		Usuario usuario = new Usuario();
		usuario.setNombreUsuario("SSDeveloper");
		
		generarContrasena10.setUsuario(usuario);
		
		
		Usuario response = stub.generarContrasena(generarContrasena10)
				.get_return();
		assertNull( response.getMensaje() );

	}

	public void testFlujoBasico() throws Exception {
		
		//GSSeguridadWSStub stub = new GSSeguridadWSStub("http://localhost:8080/axis2/services/GSSeguridadWS?wsdl");// the default
				GSSeguridadWSStub gsSeguridadStub = new GSSeguridadWSStub();// the default
				GSAutenticadorWSStub gsAutenticadorStub = new GSAutenticadorWSStub();
		
		GSAutenticadorWSStub.ValidaUsuario validaUsuarioWSInstance = (GSAutenticadorWSStub.ValidaUsuario) getTestObject(GSAutenticadorWSStub.ValidaUsuario.class);
		
		String  nombreUsuario = "SSDeveloper";
		String nombreSistema = "Portada";
		
		validaUsuarioWSInstance.setUsuario(nombreUsuario);
		validaUsuarioWSInstance.setContrasena("ABD123H");
		validaUsuarioWSInstance.setSessionId("SessionIdTest");

		com.generalseguros.seguridad.GSAutenticadorWSStub.Usuario usuario = gsAutenticadorStub.validaUsuario(validaUsuarioWSInstance)
								.get_return();
		
		GSSeguridadWSStub.ObtenPermisosHTML obtenPermisosHtmlWSInstance = (GSSeguridadWSStub.ObtenPermisosHTML) getTestObject(GSSeguridadWSStub.ObtenPermisosHTML.class);
		
		Sistema sistema = new Sistema();
		sistema.setNombre(nombreSistema);
		
		obtenPermisosHtmlWSInstance.setNombreUsuario(nombreUsuario);
		obtenPermisosHtmlWSInstance.setNombreSistema(nombreSistema);
		
		// Debe obtener solo los siguientes 3 Menus ( Gmail, Recibidos, Destacados ) 
		//Permisos UsuarioPermiso = stub(obtenPermisosWSInstance).get_return();
		
		String UsuarioPermiso = gsSeguridadStub.obtenPermisosHTML(obtenPermisosHtmlWSInstance).get_return();
		
		assertNotNull(UsuarioPermiso);
		
		/*for(Sistema sistema : UsuarioPermiso.getSistemas() ){
			assertEquals(true, sistema.isNombreSpecified());
		}*/

	}
	/**
	 * Auto generated test method
	 */
	public void testobtenPermisosXML() throws java.lang.Exception {

		//GSSeguridadWSStub stub = new GSSeguridadWSStub("http://localhost:8080/axis2/services/GSSeguridadWS?wsdl");// the default
				GSSeguridadWSStub stub = new GSSeguridadWSStub();// the default
															// implementation
															// should point to
															// the right
															// endpoint

		GSSeguridadWSStub.ObtenPermisosXML obtenPermisos13 = (GSSeguridadWSStub.ObtenPermisosXML) getTestObject(GSSeguridadWSStub.ObtenPermisosXML.class);
		
		obtenPermisos13.setNombreUsuario("SSDeveloper");
		obtenPermisos13.setNombreSistema("Google");
		
		String UsuarioPermiso = stub.obtenPermisosXML(obtenPermisos13).get_return();

		assertNotNull(UsuarioPermiso);

	}
	
	/**
	 * Auto generated test method
	 */
	public void testobtenPermisos() throws java.lang.Exception {

		//GSSeguridadWSStub stub = new GSSeguridadWSStub("http://localhost:8080/axis2/services/GSSeguridadWS?wsdl");// the default
				GSSeguridadWSStub stub = new GSSeguridadWSStub();// the default
															// implementation
															// should point to
															// the right
															// endpoint

		GSSeguridadWSStub.ObtenPermisos obtenPermisos13 = (GSSeguridadWSStub.ObtenPermisos) getTestObject(GSSeguridadWSStub.ObtenPermisos.class);
		
		obtenPermisos13.setNombreUsuario("SSDeveloper");
		obtenPermisos13.setNombreSistema("Google");

		assertNotNull(stub.obtenPermisos(obtenPermisos13));

	}
	
	/**
	 * Auto generated test method
	 */
	public void testobtenTipoUsuario() throws java.lang.Exception {

		//GSSeguridadWSStub stub = new GSSeguridadWSStub("http://localhost:8080/axis2/services/GSSeguridadWS?wsdl");// the default
				GSSeguridadWSStub stub = new GSSeguridadWSStub();// the default
															// implementation
															// should point to
															// the right
															// endpoint

		GSSeguridadWSStub.ObtenTipoUsuario obtenTipoUsuario = (GSSeguridadWSStub.ObtenTipoUsuario) getTestObject(GSSeguridadWSStub.ObtenTipoUsuario.class);
		
		obtenTipoUsuario.setUsuario("SSDeveloper");

		String tipoUsuario = stub.obtenTipoUsuario(obtenTipoUsuario).get_return();
		
		assertEquals("Proveedor", tipoUsuario);

	}
	
	/**
	 * No necesario por ahora
	 */
	/*
	public void testobtenNombreUsuarioSession() throws java.lang.Exception {

		//GSSeguridadWSStub stub = new GSSeguridadWSStub("http://localhost:8080/axis2/services/GSSeguridadWS?wsdl");// the default
				GSSeguridadWSStub stub = new GSSeguridadWSStub();// the default
															// implementation
															// should point to
															// the right
															// endpoint

		GSSeguridadWSStub.ObtenNombreUsuario obtenNombreUsuario = (GSSeguridadWSStub.ObtenNombreUsuario) getTestObject(GSSeguridadWSStub.ObtenNombreUsuario.class);
		
		obtenNombreUsuario.setSessionId("SessionIdTest");
		
		String nombreUsuario = stub.obtenNombreUsuario(obtenNombreUsuario).get_return();
		
		assertEquals("SSDeveloper", nombreUsuario);

		

	}*/
	
	// Create an ADBBean and provide it as the test object
	public org.apache.axis2.databinding.ADBBean getTestObject(
			java.lang.Class type) throws java.lang.Exception {
		return (org.apache.axis2.databinding.ADBBean) type.newInstance();
	}

}
