package org.ssglobal.training.codes;

import java.util.Scanner;

public class ReadFileLines {

	public void askStringInput() {
		try(Scanner scan = new Scanner(System.in);){
			System.out.print("Input message: ");
			String strInput = scan.nextLine();
			String newMessage;
			try {
				newMessage = readPerChar(strInput);
				System.out.println(newMessage);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
	}
	
	public String readPerChar(String message) throws TabSpaceException,LineTooLongException, Exception{
		char[] charMsg = message.toCharArray();
		for (int i = 0; i < charMsg.length; i++) {
			if(charMsg[i] == '\t') {
				throw new TabSpaceException();
			}
			if(i >= 81) {
				throw new LineTooLongException();
			}
		}
		
		return message;
	}
}


