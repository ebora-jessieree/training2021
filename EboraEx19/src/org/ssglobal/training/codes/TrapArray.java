package org.ssglobal.training.codes;

import java.util.InputMismatchException;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TrapArray {

	private static Logger logger = LogManager.getLogger("trapLogger");
	public boolean arrayTransact() throws NegativeArraySizeException, ArithmeticException,LetterSizeException, Exception{
		logger.info("Execute arrayTransact");
		int [] arrList;
		int size = 0;
		
		try(Scanner scan = new Scanner(System.in);){
			boolean isInt = false;
			do {
				System.out.print("Enter the array size: ");
				Object arrSize = scan.next();
				isInt = checkSizeInput(arrSize);
				if(isInt == true) {
					size = (int)arrSize;
				}
			}while(isInt == false);
			return true;
		}catch(InputMismatchException e) {
			e.getMessage();
			return false;
		}catch(Exception e) {
			return false;
		}
		
		
		
		/*
		while (true) {
			System.out.print("Enter the index you want to view");
			int index = scan.nextInt();
			try {
				accessArray(index, arrList);
			}catch(Exception e) {
				throw e;
			}
			System.out.println("The value in index "+ index + " is " + arrList[index]);
		}*/
		
	}
	
	public boolean checkSizeInput(Object input) throws LetterSizeException,InvalidSizeException, Exception{
		logger.info("Execute checkSizeInput ", String.valueOf(input));
		if (input instanceof String) {
			logger.warn("Input is a String. Integer expected");
			new LetterSizeException().getMessage();
			return false;
		} else if (input instanceof Double) {
			logger.warn("Input is a Double. Integer expected");
			new InvalidSizeException();
			return false;
		} else if (input instanceof Integer) {
			logger.info("Succesfully validated input as Integer");
			return true;
		} else{
			return false;
		}
		
	}
	
	public static int accessArray(int index, int[] arrList) throws ArrayIndexOutOfBoundsException, Exception{
		int temp = 0;
		try{
			temp = arrList[index];
		}catch(ArrayIndexOutOfBoundsException e){
			throw new ArrayIndexOutOfBoundsException("Bad Index");
		}
		return temp;
		
	}

	
}
