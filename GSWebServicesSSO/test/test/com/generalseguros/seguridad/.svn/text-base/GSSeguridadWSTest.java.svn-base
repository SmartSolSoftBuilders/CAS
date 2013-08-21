

/**
 * GSSeguridadWSTest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */
    package test.com.generalseguros.seguridad;

    /*
     *  GSSeguridadWSTest Junit test case
    */

    public class GSSeguridadWSTest extends junit.framework.TestCase{

     
          /**
          * Auto generated test method
          */
          public  void testgenerarContrasena() throws java.lang.Exception{

          GSSeguridadWSStub stub =
          new GSSeguridadWSStub();//the default implementation should point to the right endpoint
          GSSeguridadWSStub.GenerarContrasena generarContrasena10=
                  (GSSeguridadWSStub.GenerarContrasena)getTestObject(GSSeguridadWSStub.GenerarContrasena.class);
                      // TODO : Fill in the generarContrasena10 here
                  

                  //There is no output to be tested!
                  stub.generarContrasena(
                  generarContrasena10);

              
          }
      
        /**
         * Auto generated test method
         */
        public  void testvalidaUsuario() throws java.lang.Exception{

        GSSeguridadWSStub stub =
                    new GSSeguridadWSStub();

           GSSeguridadWSStub.ValidaUsuario validaUsuarioWS=
                                                        (GSSeguridadWSStub.ValidaUsuario)getTestObject(GSSeguridadWSStub.ValidaUsuario.class);

                
           validaUsuarioWS.setUsuario("x");
           validaUsuarioWS.setContrasena("y");
           
           String response =  stub.validaUsuario(
           		validaUsuarioWS).get_return();
           assertNotNull(response);

        }
        
         /**
         * Auto generated test method
         */
        public  void testStartvalidaUsuario() throws java.lang.Exception{
            GSSeguridadWSStub stub = new GSSeguridadWSStub();
             GSSeguridadWSStub.ValidaUsuario validaUsuario11=
                                                        (GSSeguridadWSStub.ValidaUsuario)getTestObject(GSSeguridadWSStub.ValidaUsuario.class);
                    // TODO : Fill in the validaUsuario11 here
                

                stub.startvalidaUsuario(
                         validaUsuario11,
                    new tempCallbackN65591()
                );
              


        }

        private class tempCallbackN65591  extends test.com.generalseguros.seguridad.GSSeguridadWSCallbackHandler{
            public tempCallbackN65591(){ super(null);}

            public void receiveResultvalidaUsuario(
                         GSSeguridadWSStub.ValidaUsuarioResponse result
                            ) {
                
            }

            public void receiveErrorvalidaUsuario(java.lang.Exception e) {
                fail();
            }

        }
      
        /**
         * Auto generated test method
         */
        public  void testobtenPermisos() throws java.lang.Exception{

        GSSeguridadWSStub stub =
                    new GSSeguridadWSStub();//the default implementation should point to the right endpoint

           GSSeguridadWSStub.ObtenPermisos obtenPermisos13=
                                                        (GSSeguridadWSStub.ObtenPermisos)getTestObject(GSSeguridadWSStub.ObtenPermisos.class);
                    // TODO : Fill in the obtenPermisos13 here
                
                        assertNotNull(stub.obtenPermisos(
                        obtenPermisos13));
                  



        }
        
         /**
         * Auto generated test method
         */
        public  void testStartobtenPermisos() throws java.lang.Exception{
            GSSeguridadWSStub stub = new GSSeguridadWSStub();
             GSSeguridadWSStub.ObtenPermisos obtenPermisos13=
                                                        (GSSeguridadWSStub.ObtenPermisos)getTestObject(GSSeguridadWSStub.ObtenPermisos.class);
                    // TODO : Fill in the obtenPermisos13 here
                

                stub.startobtenPermisos(
                         obtenPermisos13,
                    new tempCallbackN65647()
                );
              


        }

        private class tempCallbackN65647  extends test.com.generalseguros.seguridad.GSSeguridadWSCallbackHandler{
            public tempCallbackN65647(){ super(null);}

            public void receiveResultobtenPermisos(
                         GSSeguridadWSStub.ObtenPermisosResponse result
                            ) {
                
            }

            public void receiveErrorobtenPermisos(java.lang.Exception e) {
                fail();
            }

        }
      
        //Create an ADBBean and provide it as the test object
        public org.apache.axis2.databinding.ADBBean getTestObject(java.lang.Class type) throws java.lang.Exception{
           return (org.apache.axis2.databinding.ADBBean) type.newInstance();
        }

        
        

    }
    