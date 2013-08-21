/**
 * TipoUsuario.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.generalseguros.dto.xsd;

public class TipoUsuario  implements java.io.Serializable {
    private java.lang.String rolDescripcion;

    private com.generalseguros.dto.xsd.Sistema[] sistemas;

    public TipoUsuario() {
    }

    public TipoUsuario(
           java.lang.String rolDescripcion,
           com.generalseguros.dto.xsd.Sistema[] sistemas) {
           this.rolDescripcion = rolDescripcion;
           this.sistemas = sistemas;
    }


    /**
     * Gets the rolDescripcion value for this TipoUsuario.
     * 
     * @return rolDescripcion
     */
    public java.lang.String getRolDescripcion() {
        return rolDescripcion;
    }


    /**
     * Sets the rolDescripcion value for this TipoUsuario.
     * 
     * @param rolDescripcion
     */
    public void setRolDescripcion(java.lang.String rolDescripcion) {
        this.rolDescripcion = rolDescripcion;
    }


    /**
     * Gets the sistemas value for this TipoUsuario.
     * 
     * @return sistemas
     */
    public com.generalseguros.dto.xsd.Sistema[] getSistemas() {
        return sistemas;
    }


    /**
     * Sets the sistemas value for this TipoUsuario.
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

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TipoUsuario)) return false;
        TipoUsuario other = (TipoUsuario) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.rolDescripcion==null && other.getRolDescripcion()==null) || 
             (this.rolDescripcion!=null &&
              this.rolDescripcion.equals(other.getRolDescripcion()))) &&
            ((this.sistemas==null && other.getSistemas()==null) || 
             (this.sistemas!=null &&
              java.util.Arrays.equals(this.sistemas, other.getSistemas())));
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
        if (getRolDescripcion() != null) {
            _hashCode += getRolDescripcion().hashCode();
        }
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TipoUsuario.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dto.generalseguros.com/xsd", "TipoUsuario"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rolDescripcion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto.generalseguros.com/xsd", "rolDescripcion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sistemas");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto.generalseguros.com/xsd", "sistemas"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dto.generalseguros.com/xsd", "Sistema"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
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
