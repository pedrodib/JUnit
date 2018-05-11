package com.schoolofnet.JUnit;

import org.hamcrest.Description;
import org.hamcrest.TypeSafeDiagnosingMatcher;

public class DivisibleBy extends TypeSafeDiagnosingMatcher<Integer>{
	
	private final Integer number;
	
	public DivisibleBy(Integer number) {
		this.number = number;
	}
	public void describeTo(Description description) {
		description.appendText("The number is divisible by 2");	
	}

	@Override
	protected boolean matchesSafely(Integer number, Description description) {
		int result = number % 2;
		
		description.appendText("Number")
			.appendValue(number)
			.appendText("remain ")
			.appendValue(result);
			
		return (result == 0);
	}
	
	public static DivisibleBy divisibleBy(Integer number) {
		return new DivisibleBy(number);
	}

}
