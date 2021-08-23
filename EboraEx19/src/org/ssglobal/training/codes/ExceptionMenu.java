package org.ssglobal.training.codes;
import java.text.ParseException;
import java.util.InputMismatchException;
import java.util.Scanner;


public class ExceptionMenu {

	public void askExceptionInput() {
		System.out.println("Exception: ");
		System.out.println("\tARITHMETHIC(0)");
		System.out.println("\tINDEXOUTOFBOUNDS(0)");
		System.out.println("\tNEGATIVEARRAYSIZE(2)");
		System.out.println("\tNULLPOINTER(3)");
		System.out.println("\tINPUTMISMATCH(4)");
		System.out.println("\tNUMBERFORMAT(5)");
		System.out.println("\tILLEGALARGUMENT(6)");
		System.out.println("\tPARSE EXCEPTION(7)");
		
		System.out.print("Please INPUT an integer to select the TYPE of "
				+ "EXCEPTION(0 - 7)");
		
		Scanner scan = new Scanner(System.in);
		int choice = scan.nextInt();
		try {
			displayException(choice);
		} catch (ParseException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		scan.close();
	}
	
	public void displayException(int n) throws ParseException, Exception {
		if (n == 0) {
			throw new ArithmeticException();
		}
		if (n == 1) {
			throw new IndexOutOfBoundsException();
		}
		if (n == 2) {
			throw new NegativeArraySizeException();
		}
		if (n == 3) {
			throw new NullPointerException();
		}
		if (n == 4) {
			throw new InputMismatchException();
		}
		if (n == 5) {
			throw new NumberFormatException();
		}
		if (n == 6) {
			throw new IllegalArgumentException();
		}
		if (n == 7) {
			throw new ParseException(null, n);
		}
		
	}
	
}
