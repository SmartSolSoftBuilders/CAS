

/**
 * GSAutenticadorWSTest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */
    package com.generalseguros.seguridad;

import com.generalseguros.seguridad.GSAutenticadorWSStub.Usuario;



    /*
     *  GSAutenticadorWSTest Junit test case
    */

    public class GSAutenticadorWSTest extends junit.framework.TestCase{

     
    	/**
    	 * Auto generated test method
    	 */
    	public void testvalidaUsuario() throws java.lang.Exception {

    		
    		//GSSeguridadWSStub stub = new GSSeguridadWSStub("http://localhost:8080/axis2/services/GSSeguridadWS?wsdl");// the default
    				GSAutenticadorWSStub stub = new GSAutenticadorWSStub();// the default
    															// implementation
    															// should point to
    															// the right
    															// endpoint

    				GSAutenticadorWSStub.ValidaUsuario validaUsuarioWSInstance = (GSAutenticadorWSStub.ValidaUsuario) getTestObject(GSAutenticadorWSStub.ValidaUsuario.class);

    		validaUsuarioWSInstance.setUsuario("SSDeveloper");
    		validaUsuarioWSInstance.setContrasena("ABD123H");
    		validaUsuarioWSInstance.setSessionId("SessionIdTest");
    		
    		// this is the MD5 + SEED : '4ef5ac923b4045c60144c02986cd7d01'

    		Usuario response = stub.validaUsuario(validaUsuarioWSInstance)
    				.get_return();

    		assertEquals(response.getNombrePersona().trim(), "Smart");

    	}
        
        //Create an ADBBean and provide it as the test object
        public org.apache.axis2.databinding.ADBBean getTestObject(java.lang.Class type) throws java.lang.Exception{
           return (org.apache.axis2.databinding.ADBBean) type.newInstance();
        }

        
        

    }
    