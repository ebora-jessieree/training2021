package org.ssglobal.training.codes;

public class ElementCharException extends Exception{

	private String message2 = "Invalid element value: [character]";
	
	public ElementCharException(String newMessage) {
		message2 = newMessage;
	}

	public ElementCharException() {
		
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
