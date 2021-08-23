package org.ssglobal.training.codes;

public class LineTooLongException extends Exception {
	private String message = "The strings are too long";

	public LineTooLongException(){
		
	}
	public LineTooLongException(String newMessage) {
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
