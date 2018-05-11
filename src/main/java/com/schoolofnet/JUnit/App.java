package com.schoolofnet.JUnit;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        /*System.out.println(new StringUtils().concatenate("Hello", " World"));*/
    	
    	Result result = JUnitCore.runClasses(GreaterThanTest.class);
    	
    	for(Failure failure: result.getFailures()) {
    		System.out.println(failure.toString());
    	}
    	
    	System.out.println(result.wasSuccessful());
    }
}
