package com.edubridge.maven_project1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CustomerTest {
	
	
	@Test
	public void testCustomerId() {
		Customer cu = new Customer();
		cu.setCustomerId(101);
	    int actual = cu.getCustomerId();
		int expected = 101;
		
		//Assertions.assertEquals(expected, actual);  //without using static import
		assertEquals(expected, actual); //with using static import
		
	}
	
	@Test
	public void testCustomerName() {
		Customer cu = new Customer();
		cu.setCustomerName("wills");
	    String actual = cu.getCustomerName();
		String expected = "wills";
		
		//Assertions.assertEquals(expected, actual);
		assertEquals(expected, actual);
		
	}
	
	
	
	
	
	
}
