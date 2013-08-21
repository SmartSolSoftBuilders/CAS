package com.generalseguros.seguridad;

public class GSSeguridadWSPortTypeProxy implements com.generalseguros.seguridad.GSSeguridadWSPortType {
  private String _endpoint = null;
  private com.generalseguros.seguridad.GSSeguridadWSPortType gSSeguridadWSPortType = null;
  
  public GSSeguridadWSPortTypeProxy() {
    _initGSSeguridadWSPortTypeProxy();
  }
  
  public GSSeguridadWSPortTypeProxy(String endpoint) {
    _endpoint = endpoint;
    _initGSSeguridadWSPortTypeProxy();
  }
  
  private void _initGSSeguridadWSPortTypeProxy() {
    try {
      gSSeguridadWSPortType = (new com.generalseguros.seguridad.GSSeguridadWSLocator()).getGSSeguridadWSHttpSoap11Endpoint();
      if (gSSeguridadWSPortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)gSSeguridadWSPortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)gSSeguridadWSPortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (gSSeguridadWSPortType != null)
      ((javax.xml.rpc.Stub)gSSeguridadWSPortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.generalseguros.seguridad.GSSeguridadWSPortType getGSSeguridadWSPortType() {
    if (gSSeguridadWSPortType == null)
      _initGSSeguridadWSPortTypeProxy();
    return gSSeguridadWSPortType;
  }
  
  public java.lang.String obtenPermisosHTML(java.lang.String nombreUsuario, java.lang.String nombreSistema) throws java.rmi.RemoteException{
    if (gSSeguridadWSPortType == null)
      _initGSSeguridadWSPortTypeProxy();
    return gSSeguridadWSPortType.obtenPermisosHTML(nombreUsuario, nombreSistema);
  }
  
  public com.generalseguros.dto.xsd.Usuario generarContrasena(com.generalseguros.dto.xsd.Usuario usuario) throws java.rmi.RemoteException{
    if (gSSeguridadWSPortType == null)
      _initGSSeguridadWSPortTypeProxy();
    return gSSeguridadWSPortType.generarContrasena(usuario);
  }
  
  public java.lang.String obtenPermisosJSON(java.lang.String nombreUsuario, java.lang.String nombreSistema) throws java.rmi.RemoteException{
    if (gSSeguridadWSPortType == null)
      _initGSSeguridadWSPortTypeProxy();
    return gSSeguridadWSPortType.obtenPermisosJSON(nombreUsuario, nombreSistema);
  }
  
  public java.lang.String obtenTipoUsuario(java.lang.String usuario) throws java.rmi.RemoteException{
    if (gSSeguridadWSPortType == null)
      _initGSSeguridadWSPortTypeProxy();
    return gSSeguridadWSPortType.obtenTipoUsuario(usuario);
  }
  
  public java.lang.String obtenNombreUsuario(java.lang.String sessionId) throws java.rmi.RemoteException{
    if (gSSeguridadWSPortType == null)
      _initGSSeguridadWSPortTypeProxy();
    return gSSeguridadWSPortType.obtenNombreUsuario(sessionId);
  }
  
  public java.lang.String obtenPermisosXML(java.lang.String nombreUsuario, java.lang.String nombreSistema) throws java.rmi.RemoteException{
    if (gSSeguridadWSPortType == null)
      _initGSSeguridadWSPortTypeProxy();
    return gSSeguridadWSPortType.obtenPermisosXML(nombreUsuario, nombreSistema);
  }
  
  public com.generalseguros.dto.xsd.Permisos obtenPermisos(java.lang.String nombreUsuario, java.lang.String nombreSistema) throws java.rmi.RemoteException{
    if (gSSeguridadWSPortType == null)
      _initGSSeguridadWSPortTypeProxy();
    return gSSeguridadWSPortType.obtenPermisos(nombreUsuario, nombreSistema);
  }
  
  
}