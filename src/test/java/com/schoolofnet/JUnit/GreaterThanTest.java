package com.schoolofnet.JUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class GreaterThanTest {
	private GreaterThan validate;
	private Boolean exResult;
	private Integer inputNumber;
	
	public GreaterThanTest(Integer inputNumber, Boolean exResult) {
		this.inputNumber = inputNumber;
		this.exResult = exResult;
	}
	public @Before void initialize() {
		validate = new GreaterThan();
	}
	
	public @Parameters static Collection setNumbers() {
		return Arrays.asList(new Object[][] {
			{10, true},
			{50, true},
			{1, false},
			{4, false}
		});
	}
	public @Test void greaterThanTest() {
		System.out.println("Testing...");
		assertEquals(this.exResult, validate.validate(this.inputNumber));
	}
	public @After void close() {
		validate = null;
	}
}
