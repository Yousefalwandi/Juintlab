package jUnit123;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Test;

class testCase {

	/*@Test
	void test() {
		System.out.println("adding test");
		Calulator calculator = new Calulator();
		assertEquals(2,calculator.add(1, 1));
	}
	@Test
	void additionButFails() {
		System.out.println("adding failing test");
		Calulator calculator = new Calulator();
		assertEquals(2,calculator.add(2, 1));
		
		
	} */

	@Test
	void nummer() {
		LabbjUint nummer = new LabbjUint();
		 assertTrue(LabbjUint.nummer(6));
	     
	}
	
	@Test
	void nummer1() {
		LabbjUint nummer = new LabbjUint();
		assertFalse(LabbjUint.nummer(3));
	
	}
	

}
