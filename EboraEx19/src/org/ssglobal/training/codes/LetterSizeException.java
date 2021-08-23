package org.ssglobal.training.codes;

public class LetterSizeException extends Exception{
	private String message2 = "Invalid size value";
	
	public LetterSizeException(String newMessage) {
		message2 = newMessage;
	}

	public LetterSizeException() {
		
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
