package com.techproed.restapi01;

public class SB02HelloWorldBean {
	
	private String message;
	private int messageNumber;
	
	public SB02HelloWorldBean() {
	}
	public SB02HelloWorldBean(String message, int messageNumber) {
		this.message = message;
		this.messageNumber = messageNumber;
	}
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public int getMessageNumber() {
		return messageNumber;
	}
	public void setMessageNumber(int messageNumber) {
		this.messageNumber = messageNumber;
	}
	@Override
	public String toString() {
		return "message=" + message + ", messageNumber=" + messageNumber;
	}

}
