/**
 * LogService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.uniriotec.logapp.service;

public interface LogService extends java.rmi.Remote {
    public br.uniriotec.logapp.model.LogEffect simpleLogService(br.uniriotec.logapp.model.LogRequest logRequest) throws java.rmi.RemoteException;
    public br.uniriotec.logapp.model.LogEffect mailAlertService(br.uniriotec.logapp.model.LogRequest logRequest) throws java.rmi.RemoteException;
    public br.uniriotec.logapp.model.LogEffect DBLogService(br.uniriotec.logapp.model.LogRequest logRequest) throws java.rmi.RemoteException;
}
