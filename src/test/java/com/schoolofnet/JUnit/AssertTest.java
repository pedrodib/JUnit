package com.schoolofnet.JUnit;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import static com.schoolofnet.JUnit.isEmptyString.*;
import static com.schoolofnet.JUnit.DivisibleBy.*;


public class AssertTest {
	
	@Test
	public void testAssert() {
		String str1 = "jUnit";
		String str2 = "jUnit";
		Integer int1 = 1;
		Integer int2 = 1;
		String strNull = null;
		Boolean imTrue = true;
		Boolean imFalse = false;
		String strEmpty = "";
		Integer byTwo = 4;
		
		int[] array1 = {1, 2, 3, 4};
		int[] array2 = {1, 2, 3, 4};
		
		assertEquals(str1, str2);
		assertSame(str1, str2);
		assertSame(int1, int2);
		// assertNotSame(int1, int2);
		// assertNotNull(strNull);
		assertNull(strNull);
		assertTrue(imTrue);
		assertFalse(imFalse);
		assertArrayEquals(array1, array2);
		assertThat(str1, isA(String.class));
		assertThat(str1, is("jUnit"));
		// assertThat("Not equals", "1234", is("123"));
		assertThat(strEmpty, is(isEmpty(strEmpty)));
		assertThat(byTwo, is(divisibleBy(byTwo)));
		
	}
}
