/**
 * LogEffect.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.uniriotec.logapp.model;

public class LogEffect  implements java.io.Serializable {
    private boolean logPersisted;

    private boolean mailSent;

    private boolean messageLogged;

    public LogEffect() {
    }

    public LogEffect(
           boolean logPersisted,
           boolean mailSent,
           boolean messageLogged) {
           this.logPersisted = logPersisted;
           this.mailSent = mailSent;
           this.messageLogged = messageLogged;
    }


    /**
     * Gets the logPersisted value for this LogEffect.
     * 
     * @return logPersisted
     */
    public boolean isLogPersisted() {
        return logPersisted;
    }


    /**
     * Sets the logPersisted value for this LogEffect.
     * 
     * @param logPersisted
     */
    public void setLogPersisted(boolean logPersisted) {
        this.logPersisted = logPersisted;
    }


    /**
     * Gets the mailSent value for this LogEffect.
     * 
     * @return mailSent
     */
    public boolean isMailSent() {
        return mailSent;
    }


    /**
     * Sets the mailSent value for this LogEffect.
     * 
     * @param mailSent
     */
    public void setMailSent(boolean mailSent) {
        this.mailSent = mailSent;
    }


    /**
     * Gets the messageLogged value for this LogEffect.
     * 
     * @return messageLogged
     */
    public boolean isMessageLogged() {
        return messageLogged;
    }


    /**
     * Sets the messageLogged value for this LogEffect.
     * 
     * @param messageLogged
     */
    public void setMessageLogged(boolean messageLogged) {
        this.messageLogged = messageLogged;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LogEffect)) return false;
        LogEffect other = (LogEffect) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.logPersisted == other.isLogPersisted() &&
            this.mailSent == other.isMailSent() &&
            this.messageLogged == other.isMessageLogged();
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
        _hashCode += (isLogPersisted() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isMailSent() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isMessageLogged() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LogEffect.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://model.logapp.uniriotec.br", "LogEffect"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("logPersisted");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.logapp.uniriotec.br", "logPersisted"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mailSent");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.logapp.uniriotec.br", "mailSent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("messageLogged");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.logapp.uniriotec.br", "messageLogged"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
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
