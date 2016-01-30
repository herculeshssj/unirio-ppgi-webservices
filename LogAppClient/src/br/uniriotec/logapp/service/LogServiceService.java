/**
 * LogServiceService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.uniriotec.logapp.service;

public interface LogServiceService extends javax.xml.rpc.Service {
    public java.lang.String getLogServiceAddress();

    public br.uniriotec.logapp.service.LogService getLogService() throws javax.xml.rpc.ServiceException;

    public br.uniriotec.logapp.service.LogService getLogService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
