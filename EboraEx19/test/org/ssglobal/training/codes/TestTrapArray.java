package org.ssglobal.training.codes;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestTrapArray {

	private TrapArray trapArray ;
	
	@BeforeEach
	public void setup () {
		trapArray = new TrapArray();
	}
	//2021-08-19 18:25:06,889 main ERROR Unable to move file C:\Training\Exercises\EboraEx19A\src\log\trap_array_exceptions.log to C:\Training\Exercises\EboraEx19A\src\log\trap_array_exceptions-19-08-2021-18-25-04.log: java.nio.file.FileSystemException C:\Training\Exercises\EboraEx19A\src\log\trap_array_exceptions.log -> C:\Training\Exercises\EboraEx19A\src\log\trap_array_exceptions-19-08-2021-18-25-04.log: The process cannot access the file because it is being used by another process.

	@Test
	public void testArrayTransact() {
		Assertions.assertDoesNotThrow(()->{
			Assertions.assertTrue(trapArray.arrayTransact());
		});
		
	}
	
	@AfterEach
	public void teardown() {
		trapArray = null;
	}
}
