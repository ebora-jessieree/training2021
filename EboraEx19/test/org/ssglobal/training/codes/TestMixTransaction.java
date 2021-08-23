package org.ssglobal.training.codes;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestMixTransaction {

	
	@BeforeEach
	public void setup () {
		
	}
	
	@Test
	public void testFileExists() {
		Assertions.assertTrue(MixTransaction.fileExists("src/log/"
				+ "transactions.log"));
	}
	
	@Test
	public void testIsDouble() {
		Assertions.assertTrue(MixTransaction.isDouble("123.54"));
	}
	
	@Test
	public void testIsInt() {
		Assertions.assertTrue(MixTransaction.isInt("123"));
	}
	
	@Test
	public void testFileExistsRainy() {
		Assertions.assertFalse(MixTransaction.fileExists("test/log/"
				+ "transactions.log"));
	}
	
	@Test
	public void testIsDoubleRainy() {
		Assertions.assertDoesNotThrow(()->{
			Assertions.assertFalse(MixTransaction.isDouble("123.re"));
		});
	}
	
	@Test
	public void testIsDoubleNumberFormatExceptionsRainy() {
		Assertions.assertThrows(NumberFormatException.class, ()->{
			Assertions.assertFalse(MixTransaction.isDouble("123.re"));
		});
	}
	
	
	@Test
	public void testIsIntRainy() {
		Assertions.assertDoesNotThrow(()->{
			Assertions.assertFalse(MixTransaction.isInt("132.98"));
		});
	}
	
	@Test
	public void testIsIntNumberFormatExceptionsRainy() {
		Assertions.assertThrows(NumberFormatException.class, ()->{
			Assertions.assertFalse(MixTransaction.isDouble("132.98"));
		});
	}
	
	
	@Test
	public void testConvertMatrix() {
		Assertions.assertDoesNotThrow(()->{
			Assertions.assertTrue(MixTransaction.convertMatrix("src/files/matrix.txt"));
		});
		
	}
	
	@AfterEach
	public void teardown() {
		
	}
}
