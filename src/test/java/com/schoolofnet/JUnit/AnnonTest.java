package com.schoolofnet.JUnit;

import java.io.File;
import java.io.IOException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;
import static org.junit.Assert.*;

public class AnnonTest {
	
	public @Rule TemporaryFolder folder = new TemporaryFolder();
	
	public @BeforeClass static void beforeClassTest() {
		System.out.println("@BeforeClass executed");
	}
	
	public @Before void beforeTest() {
		System.out.println("@Before All");
	}
	
	@Ignore
	public @Test void testOneTest() {
		System.out.println("@Test One");
	}
	
	public @Test void testTwoTest() {
		System.out.println("@Test Two");
	}
	
	@Test(expected = ArithmeticException.class)
	public void divideIntegerByZero() {
		int number = 10 / 0;
	}
	
	public @Test void createFolderRuleTest() {
		File folder = null;
		
		try {
			folder = this.folder.newFolder();
			assertTrue(folder.exists());
		} catch (IOException e) {
			assertFalse(folder.exists());
		}
	}
	
	public @After void afterTest() {
		System.out.println("@After All");
	}
	
	public @AfterClass static void afterClassTest() {
		System.out.println("@AfterClass executed");
	}
}
