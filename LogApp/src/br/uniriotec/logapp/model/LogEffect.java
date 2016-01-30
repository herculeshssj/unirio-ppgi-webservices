package br.uniriotec.logapp.model;

public class LogEffect {
	
	private boolean messageLogged = false;
	private boolean mailSent = false;
	private boolean logPersisted = false;
	
	public LogEffect() {
		
	}

	public boolean isMessageLogged() {
		return messageLogged;
	}

	public void setMessageLogged(boolean messageLogged) {
		this.messageLogged = messageLogged;
	}

	public boolean isMailSent() {
		return mailSent;
	}

	public void setMailSent(boolean mailSent) {
		this.mailSent = mailSent;
	}

	public boolean isLogPersisted() {
		return logPersisted;
	}

	public void setLogPersisted(boolean logPersisted) {
		this.logPersisted = logPersisted;
	}
}
