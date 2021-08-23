package org.ssglobal.training.codes;

public class WrongMatrixDimensionException extends Exception {

	public WrongMatrixDimensionException() {
		
	}
	private String message = "Wrong matrix dimension";
	
	public WrongMatrixDimensionException(String newMessage) {
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
