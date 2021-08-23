package org.ssglobal.training.codes;

public class ElementDecimalException extends Exception{
	private String message2 = "Invalid element value: [floating-point]";
	
	public ElementDecimalException(String newMessage) {
		message2 = newMessage;
	}

	public ElementDecimalException() {
		
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
