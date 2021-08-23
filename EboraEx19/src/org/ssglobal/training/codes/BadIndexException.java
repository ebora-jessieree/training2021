package org.ssglobal.training.codes;

public class BadIndexException extends Exception{

	private String message = "Bad Index";

	public BadIndexException(){
		
	}
	public BadIndexException(String newMessage) {
		message = newMessage;
	}

	@Override
	public String getMessage() {
		return message;
	}
	
	@Override
	public void printStackTrace() {
		System.err.println(message);
	}
}
