
/**
 * GSSeguridadWSCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

    package com.generalseguros.seguridad;

    /**
     *  GSSeguridadWSCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class GSSeguridadWSCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public GSSeguridadWSCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public GSSeguridadWSCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for generarContrasena method
            * override this method for handling normal response from generarContrasena operation
            */
           public void receiveResultgenerarContrasena(
                    com.generalseguros.seguridad.GSSeguridadWSStub.GenerarContrasenaResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from generarContrasena operation
           */
            public void receiveErrorgenerarContrasena(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for obtenPermisosJSON method
            * override this method for handling normal response from obtenPermisosJSON operation
            */
           public void receiveResultobtenPermisosJSON(
                    com.generalseguros.seguridad.GSSeguridadWSStub.ObtenPermisosJSONResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from obtenPermisosJSON operation
           */
            public void receiveErrorobtenPermisosJSON(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for obtenPermisos method
            * override this method for handling normal response from obtenPermisos operation
            */
           public void receiveResultobtenPermisos(
                    com.generalseguros.seguridad.GSSeguridadWSStub.ObtenPermisosResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from obtenPermisos operation
           */
            public void receiveErrorobtenPermisos(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for obtenPermisosHTML method
            * override this method for handling normal response from obtenPermisosHTML operation
            */
           public void receiveResultobtenPermisosHTML(
                    com.generalseguros.seguridad.GSSeguridadWSStub.ObtenPermisosHTMLResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from obtenPermisosHTML operation
           */
            public void receiveErrorobtenPermisosHTML(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for obtenNombreUsuario method
            * override this method for handling normal response from obtenNombreUsuario operation
            */
           public void receiveResultobtenNombreUsuario(
                    com.generalseguros.seguridad.GSSeguridadWSStub.ObtenNombreUsuarioResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from obtenNombreUsuario operation
           */
            public void receiveErrorobtenNombreUsuario(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for obtenTipoUsuario method
            * override this method for handling normal response from obtenTipoUsuario operation
            */
           public void receiveResultobtenTipoUsuario(
                    com.generalseguros.seguridad.GSSeguridadWSStub.ObtenTipoUsuarioResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from obtenTipoUsuario operation
           */
            public void receiveErrorobtenTipoUsuario(java.lang.Exception e) {
            }
                


    }
    