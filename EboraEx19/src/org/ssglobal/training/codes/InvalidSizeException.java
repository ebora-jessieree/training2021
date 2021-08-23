package org.ssglobal.training.codes;

public class InvalidSizeException extends Exception{
	private String message2 = "Invalid size value";
	
	public InvalidSizeException(String newMessage) {
		message2 = newMessage;
	}

	public InvalidSizeException() {
		
	}

	@Override
	public String getMessage() {
		return message2;
	}
	
	@Override
	public void printStackTrace() {
		System.err.println(message2);
	}
}
