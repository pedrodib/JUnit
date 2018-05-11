package com.schoolofnet.JUnit;

import org.junit.FixMethodOrder;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
	SuiteCaseTest1.class,
	SuiteCaseTest2.class
})
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RunSuiteTest2 {

}
