package org.ssglobal.training.codes;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.StreamTokenizer;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class MixTransaction {

	private static Logger logger = LogManager.getLogger("transactionLogger");
	
	public MixTransaction() {
		logger.info("New MixTransaction has been created");
	}
	
	public static boolean fileExists(String filename) {
		logger.info("Execute fileExist path{}", filename);
		boolean isExist = false;
		File pcos = new File(filename);
		try {
			FileReader fr = new FileReader(pcos);
			isExist = true;
			fr.close();
		} catch (FileNotFoundException e) {
			logger.fatal("Error: File not found");
		} catch (IOException e) {
			logger.fatal("Error: IO Exception");
		}
		logger.info("Exit without errors");
		return isExist;
	}
	
	public static boolean isInt(String strVal) {
		logger.info("Execute isInt", strVal);
		boolean validation;
		try {
			int val = Integer.parseInt(strVal); 
			validation = true;
		}catch(NumberFormatException e) {
			validation = false;
			logger.fatal("Error formatting ", strVal);
			throw e;
		}
		logger.info("Exit without errors isInt", validation);
		return validation;
	}
	
	public static boolean isDouble(String strVal) {
		logger.info("Execute isDouble", strVal);
		boolean validation;
		try {
			double val = Double.parseDouble(strVal); 
			validation = true;
		}catch(NumberFormatException e) {
			validation = false;
			logger.fatal("Error formatting ", strVal);
			throw e;
		}
		logger.info("Exit without errors isInt", validation);
		return validation;
		
	}
	
	public static boolean convertMatrix(String filename) throws WrongMatrixValuesException,WrongMatrixDimensionException, Exception {
		logger.info("Execute convertMatrix");
		boolean isConverted = false;
		File pcos = new File(filename);
		StreamTokenizer tokenizer = null;
		int token = 0;
		try (FileReader fr = new FileReader(pcos);){
			tokenizer = new StreamTokenizer(fr);
			token = tokenizer.nextToken();
		}catch (FileNotFoundException e) {
			logger.fatal("Cannot find file : ", filename);
			return false;
		} catch (IOException e) {
			logger.fatal("Cannot readfile : ", filename);
			return false;
		}
		
		
		int[][] arrList = new int[3][3];
		int cnt = 0;
		int cnt1 = 0;
		logger.fatal("Loop through the file content: ", filename);
		while(! (token == StreamTokenizer.TT_EOF)) {
			if(token == StreamTokenizer.TT_NUMBER) {
				arrList[cnt][cnt1] =(int) tokenizer.nval;
				cnt1++;
			}
			if(cnt1 == 3) {
				cnt1 = 0;
				cnt++;
			}
			token = tokenizer.nextToken();
		}
		logger.info("Exit without errors : convertMatrix");
		isConverted = true;
		return isConverted;
	}
	
	
}
