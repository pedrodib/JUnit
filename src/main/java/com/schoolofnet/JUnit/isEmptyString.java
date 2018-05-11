package com.schoolofnet.JUnit;

import org.hamcrest.Description;
import org.hamcrest.TypeSafeDiagnosingMatcher;

public class isEmptyString  extends TypeSafeDiagnosingMatcher<String>{

	private final String str;
	
	public isEmptyString(String str) {
		this.str = str;
	}
	public void describeTo(Description description) {
		description.appendText("A String is Empty");
		
	}

	@Override
	protected boolean matchesSafely(String str, Description description) {
		Boolean result = (str == "");
		description.appendText("String ")
			.appendValue(str)
			.appendText(" is empty: ")
			.appendValue(result);
		
		return result;
	}
	
	public static isEmptyString isEmpty(String str){
		return new isEmptyString(str);
	}
	
}
