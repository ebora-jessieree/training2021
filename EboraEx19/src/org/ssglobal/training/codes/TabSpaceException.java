package org.ssglobal.training.codes;

public class TabSpaceException extends Exception {
	private String message2 = "Tab space detected";
	
	public TabSpaceException(String newMessage) {
		message2 = newMessage;
	}

	public TabSpaceException() {
		
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
