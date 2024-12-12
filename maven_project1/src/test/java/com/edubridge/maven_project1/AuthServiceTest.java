package com.edubridge.maven_project1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;



public class AuthServiceTest {

	private static AuthService auth;

	@BeforeAll
	public static void setup() {
		auth = new AuthService();
		System.out.println("BeforeAll");
	}
	
	@AfterAll
	public static void terup() {
		auth = null;
		System.out.println("AfterAll");
	}
	//@Disabled //used for the skipped to Test the Case
	@Test
	@DisplayName("Check wiht valid date")
	public void testAuthenticateWithValidDate() {
		boolean actual = auth.authentecate("admin", "admin123");
		assertTrue(actual);
	}

	@Test // @ is an annotation
	@DisplayName("Check wiht in-valid date")
	public void testAuthenticateWithInValidDate() {
		boolean actual = auth.authentecate("admin", "admin");
		assertFalse(actual);
	}

}
