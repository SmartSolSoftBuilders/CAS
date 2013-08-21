/**
 * Sistema.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.generalseguros.dto.xsd;

public class Sistema  implements java.io.Serializable {
    private java.lang.String hashValue;

    private java.lang.Integer id;

    private com.generalseguros.dto.xsd.Menu[] menus;

    private java.lang.String nombre;

    private java.lang.String url;

    public Sistema() {
    }

    public Sistema(
           java.lang.String hashValue,
           java.lang.Integer id,
           com.generalseguros.dto.xsd.Menu[] menus,
           java.lang.String nombre,
           java.lang.String url) {
           this.hashValue = hashValue;
           this.id = id;
           this.menus = menus;
           this.nombre = nombre;
           this.url = url;
    }


    /**
     * Gets the hashValue value for this Sistema.
     * 
     * @return hashValue
     */
    public java.lang.String getHashValue() {
        return hashValue;
    }


    /**
     * Sets the hashValue value for this Sistema.
     * 
     * @param hashValue
     */
    public void setHashValue(java.lang.String hashValue) {
        this.hashValue = hashValue;
    }


    /**
     * Gets the id value for this Sistema.
     * 
     * @return id
     */
    public java.lang.Integer getId() {
        return id;
    }


    /**
     * Sets the id value for this Sistema.
     * 
     * @param id
     */
    public void setId(java.lang.Integer id) {
        this.id = id;
    }


    /**
     * Gets the menus value for this Sistema.
     * 
     * @return menus
     */
    public com.generalseguros.dto.xsd.Menu[] getMenus() {
        return menus;
    }


    /**
     * Sets the menus value for this Sistema.
     * 
     * @param menus
     */
    public void setMenus(com.generalseguros.dto.xsd.Menu[] menus) {
        this.menus = menus;
    }

    public com.generalseguros.dto.xsd.Menu getMenus(int i) {
        return this.menus[i];
    }

    public void setMenus(int i, com.generalseguros.dto.xsd.Menu _value) {
        this.menus[i] = _value;
    }


    /**
     * Gets the nombre value for this Sistema.
     * 
     * @return nombre
     */
    public java.lang.String getNombre() {
        return nombre;
    }


    /**
     * Sets the nombre value for this Sistema.
     * 
     * @param nombre
     */
    public void setNombre(java.lang.String nombre) {
        this.nombre = nombre;
    }


    /**
     * Gets the url value for this Sistema.
     * 
     * @return url
     */
    public java.lang.String getUrl() {
        return url;
    }


    /**
     * Sets the url value for this Sistema.
     * 
     * @param url
     */
    public void setUrl(java.lang.String url) {
        this.url = url;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Sistema)) return false;
        Sistema other = (Sistema) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.hashValue==null && other.getHashValue()==null) || 
             (this.hashValue!=null &&
              this.hashValue.equals(other.getHashValue()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.menus==null && other.getMenus()==null) || 
             (this.menus!=null &&
              java.util.Arrays.equals(this.menus, other.getMenus()))) &&
            ((this.nombre==null && other.getNombre()==null) || 
             (this.nombre!=null &&
              this.nombre.equals(other.getNombre()))) &&
            ((this.url==null && other.getUrl()==null) || 
             (this.url!=null &&
              this.url.equals(other.getUrl())));
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
        if (getHashValue() != null) {
            _hashCode += getHashValue().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getMenus() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMenus());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMenus(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNombre() != null) {
            _hashCode += getNombre().hashCode();
        }
        if (getUrl() != null) {
            _hashCode += getUrl().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Sistema.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dto.generalseguros.com/xsd", "Sistema"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hashValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto.generalseguros.com/xsd", "hashValue"));
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
        elemField.setFieldName("menus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto.generalseguros.com/xsd", "menus"));
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
        elemField.setFieldName("url");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto.generalseguros.com/xsd", "url"));
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
