package br.uniriotec.logapp.model;

public class LogRequest {

	private Severity severity;
	private String message;
	
	public LogRequest() {
		
	}

	public Severity getSeverity() {
		return severity;
	}

	public void setSeverity(Severity severity) {
		this.severity = severity;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
