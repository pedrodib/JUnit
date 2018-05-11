package com.schoolofnet.JUnit;

import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.FixMethodOrder;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SuiteCaseTest2 {
	public @Test void sub() {
		assertThat(2 - 2, is(0));
	}
	
	public @Test void mult() {
		assertThat(200 * 1254, is(250800));
	}
}
