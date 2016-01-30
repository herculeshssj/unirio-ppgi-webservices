package br.uniriotec.logapp.service;

import br.uniriotec.logapp.model.LogEffect;
import br.uniriotec.logapp.model.LogRequest;

public class LogService {

	public LogEffect simpleLogService(LogRequest logRequest) {
		System.out.println("WebMethod invoked: simpleLogService");
		System.out.println("Message logged: " + logRequest.getMessage());
		System.out.println("Severity name: " + logRequest.getSeverity().getName());
		System.out.println("Severity level: " + logRequest.getSeverity().getLevel());		
		LogEffect log = new LogEffect();
		log.setMessageLogged(true);
		System.out.println("End of WebMethod");
		return log;
	}
	
	public LogEffect mailAlertService(LogRequest logRequest) {
		System.out.println("WebMethod invoked: mailAlertService");
		System.out.println("Message logged: " + logRequest.getMessage());
		System.out.println("Severity name: " + logRequest.getSeverity().getName());
		System.out.println("Severity level: " + logRequest.getSeverity().getLevel());
		LogEffect log = new LogEffect();
		log.setMailSent(true);
		log.setMessageLogged(true);
		System.out.println("End of WebMethod");
		return log;
	}
	
	public LogEffect DBLogService(LogRequest logRequest) {
		System.out.println("WebMethod invoked: DBLogService");
		System.out.println("Message logged: " + logRequest.getMessage());
		System.out.println("Severity name: " + logRequest.getSeverity().getName());
		System.out.println("Severity level: " + logRequest.getSeverity().getLevel());
		LogEffect log = new LogEffect();
		log.setLogPersisted(true);
		log.setMessageLogged(true);
		System.out.println("End of WebMethod");
		return log;
	}
}
