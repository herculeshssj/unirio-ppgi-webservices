package br.uniriotec.logapp.service;

public class LogServiceProxy implements br.uniriotec.logapp.service.LogService {
  private String _endpoint = null;
  private br.uniriotec.logapp.service.LogService logService = null;
  
  public LogServiceProxy() {
    _initLogServiceProxy();
  }
  
  public LogServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initLogServiceProxy();
  }
  
  private void _initLogServiceProxy() {
    try {
      logService = (new br.uniriotec.logapp.service.LogServiceServiceLocator()).getLogService();
      if (logService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)logService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)logService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (logService != null)
      ((javax.xml.rpc.Stub)logService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public br.uniriotec.logapp.service.LogService getLogService() {
    if (logService == null)
      _initLogServiceProxy();
    return logService;
  }
  
  public br.uniriotec.logapp.model.LogEffect simpleLogService(br.uniriotec.logapp.model.LogRequest logRequest) throws java.rmi.RemoteException{
    if (logService == null)
      _initLogServiceProxy();
    return logService.simpleLogService(logRequest);
  }
  
  public br.uniriotec.logapp.model.LogEffect mailAlertService(br.uniriotec.logapp.model.LogRequest logRequest) throws java.rmi.RemoteException{
    if (logService == null)
      _initLogServiceProxy();
    return logService.mailAlertService(logRequest);
  }
  
  public br.uniriotec.logapp.model.LogEffect DBLogService(br.uniriotec.logapp.model.LogRequest logRequest) throws java.rmi.RemoteException{
    if (logService == null)
      _initLogServiceProxy();
    return logService.DBLogService(logRequest);
  }
  
  
}