/**
 * Menu.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.generalseguros.dto.xsd;

public class Menu  implements java.io.Serializable {
    private java.lang.Boolean activo;

    private java.lang.String clave;

    private java.lang.Integer id;

    private java.lang.Integer menuPadreId;

    private com.generalseguros.dto.xsd.Menu[] menusHijos;

    private java.lang.String nombre;

    private java.lang.Integer sistemaId;

    private java.lang.String tooltip;

    private java.lang.String url;

    private java.lang.String urlImagen;

    public Menu() {
    }

    public Menu(
           java.lang.Boolean activo,
           java.lang.String clave,
           java.lang.Integer id,
           java.lang.Integer menuPadreId,
           com.generalseguros.dto.xsd.Menu[] menusHijos,
           java.lang.String nombre,
           java.lang.Integer sistemaId,
           java.lang.String tooltip,
           java.lang.String url,
           java.lang.String urlImagen) {
           this.activo = activo;
           this.clave = clave;
           this.id = id;
           this.menuPadreId = menuPadreId;
           this.menusHijos = menusHijos;
           this.nombre = nombre;
           this.sistemaId = sistemaId;
           this.tooltip = tooltip;
           this.url = url;
           this.urlImagen = urlImagen;
    }


    /**
     * Gets the activo value for this Menu.
     * 
     * @return activo
     */
    public java.lang.Boolean getActivo() {
        return activo;
    }


    /**
     * Sets the activo value for this Menu.
     * 
     * @param activo
     */
    public void setActivo(java.lang.Boolean activo) {
        this.activo = activo;
    }


    /**
     * Gets the clave value for this Menu.
     * 
     * @return clave
     */
    public java.lang.String getClave() {
        return clave;
    }


    /**
     * Sets the clave value for this Menu.
     * 
     * @param clave
     */
    public void setClave(java.lang.String clave) {
        this.clave = clave;
    }


    /**
     * Gets the id value for this Menu.
     * 
     * @return id
     */
    public java.lang.Integer getId() {
        return id;
    }


    /**
     * Sets the id value for this Menu.
     * 
     * @param id
     */
    public void setId(java.lang.Integer id) {
        this.id = id;
    }


    /**
     * Gets the menuPadreId value for this Menu.
     * 
     * @return menuPadreId
     */
    public java.lang.Integer getMenuPadreId() {
        return menuPadreId;
    }


    /**
     * Sets the menuPadreId value for this Menu.
     * 
     * @param menuPadreId
     */
    public void setMenuPadreId(java.lang.Integer menuPadreId) {
        this.menuPadreId = menuPadreId;
    }


    /**
     * Gets the menusHijos value for this Menu.
     * 
     * @return menusHijos
     */
    public com.generalseguros.dto.xsd.Menu[] getMenusHijos() {
        return menusHijos;
    }


    /**
     * Sets the menusHijos value for this Menu.
     * 
     * @param menusHijos
     */
    public void setMenusHijos(com.generalseguros.dto.xsd.Menu[] menusHijos) {
        this.menusHijos = menusHijos;
    }

    public com.generalseguros.dto.xsd.Menu getMenusHijos(int i) {
        return this.menusHijos[i];
    }

    public void setMenusHijos(int i, com.generalseguros.dto.xsd.Menu _value) {
        this.menusHijos[i] = _value;
    }


    /**
     * Gets the nombre value for this Menu.
     * 
     * @return nombre
     */
    public java.lang.String getNombre() {
        return nombre;
    }


    /**
     * Sets the nombre value for this Menu.
     * 
     * @param nombre
     */
    public void setNombre(java.lang.String nombre) {
        this.nombre = nombre;
    }


    /**
     * Gets the sistemaId value for this Menu.
     * 
     * @return sistemaId
     */
    public java.lang.Integer getSistemaId() {
        return sistemaId;
    }


    /**
     * Sets the sistemaId value for this Menu.
     * 
     * @param sistemaId
     */
    public void setSistemaId(java.lang.Integer sistemaId) {
        this.sistemaId = sistemaId;
    }


    /**
     * Gets the tooltip value for this Menu.
     * 
     * @return tooltip
     */
    public java.lang.String getTooltip() {
        return tooltip;
    }


    /**
     * Sets the tooltip value for this Menu.
     * 
     * @param tooltip
     */
    public void setTooltip(java.lang.String tooltip) {
        this.tooltip = tooltip;
    }


    /**
     * Gets the url value for this Menu.
     * 
     * @return url
     */
    public java.lang.String getUrl() {
        return url;
    }


    /**
     * Sets the url value for this Menu.
     * 
     * @param url
     */
    public void setUrl(java.lang.String url) {
        this.url = url;
    }


    /**
     * Gets the urlImagen value for this Menu.
     * 
     * @return urlImagen
     */
    public java.lang.String getUrlImagen() {
        return urlImagen;
    }


    /**
     * Sets the urlImagen value for this Menu.
     * 
     * @param urlImagen
     */
    public void setUrlImagen(java.lang.String urlImagen) {
        this.urlImagen = urlImagen;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Menu)) return false;
        Menu other = (Menu) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.activo==null && other.getActivo()==null) || 
             (this.activo!=null &&
              this.activo.equals(other.getActivo()))) &&
            ((this.clave==null && other.getClave()==null) || 
             (this.clave!=null &&
              this.clave.equals(other.getClave()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.menuPadreId==null && other.getMenuPadreId()==null) || 
             (this.menuPadreId!=null &&
              this.menuPadreId.equals(other.getMenuPadreId()))) &&
            ((this.menusHijos==null && other.getMenusHijos()==null) || 
             (this.menusHijos!=null &&
              java.util.Arrays.equals(this.menusHijos, other.getMenusHijos()))) &&
            ((this.nombre==null && other.getNombre()==null) || 
             (this.nombre!=null &&
              this.nombre.equals(other.getNombre()))) &&
            ((this.sistemaId==null && other.getSistemaId()==null) || 
             (this.sistemaId!=null &&
              this.sistemaId.equals(other.getSistemaId()))) &&
            ((this.tooltip==null && other.getTooltip()==null) || 
             (this.tooltip!=null &&
              this.tooltip.equals(other.getTooltip()))) &&
            ((this.url==null && other.getUrl()==null) || 
             (this.url!=null &&
              this.url.equals(other.getUrl()))) &&
            ((this.urlImagen==null && other.getUrlImagen()==null) || 
             (this.urlImagen!=null &&
              this.urlImagen.equals(other.getUrlImagen())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getActivo() != null) {
            _hashCode += getActivo().hashCode();
        }
        if (getClave() != null) {
            _hashCode += getClave().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getMenuPadreId() != null) {
            _hashCode += getMenuPadreId().hashCode();
        }
        if (getMenusHijos() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMenusHijos());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMenusHijos(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNombre() != null) {
            _hashCode += getNombre().hashCode();
        }
        if (getSistemaId() != null) {
            _hashCode += getSistemaId().hashCode();
        }
        if (getTooltip() != null) {
            _hashCode += getTooltip().hashCode();
        }
        if (getUrl() != null) {
            _hashCode += getUrl().hashCode();
        }
        if (getUrlImagen() != null) {
            _hashCode += getUrlImagen().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Menu.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dto.generalseguros.com/xsd", "Menu"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto.generalseguros.com/xsd", "activo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clave");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto.generalseguros.com/xsd", "clave"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto.generalseguros.com/xsd", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("menuPadreId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto.generalseguros.com/xsd", "menuPadreId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("menusHijos");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto.generalseguros.com/xsd", "menusHijos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dto.generalseguros.com/xsd", "Menu"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nombre");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto.generalseguros.com/xsd", "nombre"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sistemaId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto.generalseguros.com/xsd", "sistemaId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tooltip");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto.generalseguros.com/xsd", "tooltip"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("url");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto.generalseguros.com/xsd", "url"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("urlImagen");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto.generalseguros.com/xsd", "urlImagen"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
