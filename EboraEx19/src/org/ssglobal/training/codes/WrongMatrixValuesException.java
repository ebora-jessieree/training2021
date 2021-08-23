package org.ssglobal.training.codes;

public class WrongMatrixValuesException extends Exception {

	public WrongMatrixValuesException() {
		
	}
	private String message = "Wrong matrix values";
	
	public WrongMatrixValuesException(String newMessage) {
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
