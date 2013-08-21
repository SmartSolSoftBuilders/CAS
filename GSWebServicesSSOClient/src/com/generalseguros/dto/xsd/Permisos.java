/**
 * Permisos.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.generalseguros.dto.xsd;

public class Permisos  implements java.io.Serializable {
    private com.generalseguros.dto.xsd.Sistema[] sistemas;

    private com.generalseguros.dto.xsd.Usuario usuario;

    public Permisos() {
    }

    public Permisos(
           com.generalseguros.dto.xsd.Sistema[] sistemas,
           com.generalseguros.dto.xsd.Usuario usuario) {
           this.sistemas = sistemas;
           this.usuario = usuario;
    }


    /**
     * Gets the sistemas value for this Permisos.
     * 
     * @return sistemas
     */
    public com.generalseguros.dto.xsd.Sistema[] getSistemas() {
        return sistemas;
    }


    /**
     * Sets the sistemas value for this Permisos.
     * 
     * @param sistemas
     */
    public void setSistemas(com.generalseguros.dto.xsd.Sistema[] sistemas) {
        this.sistemas = sistemas;
    }

    public com.generalseguros.dto.xsd.Sistema getSistemas(int i) {
        return this.sistemas[i];
    }

    public void setSistemas(int i, com.generalseguros.dto.xsd.Sistema _value) {
        this.sistemas[i] = _value;
    }


    /**
     * Gets the usuario value for this Permisos.
     * 
     * @return usuario
     */
    public com.generalseguros.dto.xsd.Usuario getUsuario() {
        return usuario;
    }


    /**
     * Sets the usuario value for this Permisos.
     * 
     * @param usuario
     */
    public void setUsuario(com.generalseguros.dto.xsd.Usuario usuario) {
        this.usuario = usuario;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Permisos)) return false;
        Permisos other = (Permisos) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.sistemas==null && other.getSistemas()==null) || 
             (this.sistemas!=null &&
              java.util.Arrays.equals(this.sistemas, other.getSistemas()))) &&
            ((this.usuario==null && other.getUsuario()==null) || 
             (this.usuario!=null &&
              this.usuario.equals(other.getUsuario())));
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
        if (getSistemas() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSistemas());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSistemas(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUsuario() != null) {
            _hashCode += getUsuario().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Permisos.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dto.generalseguros.com/xsd", "Permisos"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sistemas");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto.generalseguros.com/xsd", "sistemas"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dto.generalseguros.com/xsd", "Sistema"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usuario");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto.generalseguros.com/xsd", "usuario"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dto.generalseguros.com/xsd", "Usuario"));
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
