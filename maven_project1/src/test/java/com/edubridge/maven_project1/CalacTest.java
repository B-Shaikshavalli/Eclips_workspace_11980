package com.edubridge.maven_project1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalacTest {
	private Calc c = null;
	
	@BeforeEach
	public void setup() {
		c = new Calc();
		System.out.println("BeforeEach");
	}
	@AfterEach
	public void tearup() {
		c = null;
		System.out.println("After Each");
	}
	
	@Test
	public void testFindSquare() {
		Calc c = new Calc();
		int actual = c.findSquare(10);
		int expected = 100;
		
		//Assertions.assertEquals(expected, actual);  //without using static import
		assertEquals(expected, actual); //with using static import
	}
	@Test
	public void testFindCube() {
		Calc c = new Calc();
		int actual = c.findCube(10);
		int expected = 1000;
		
		//Assertions.assertEquals(expected, actual); //without using static import
		assertEquals(expected, actual); //with using static import
	}

}
