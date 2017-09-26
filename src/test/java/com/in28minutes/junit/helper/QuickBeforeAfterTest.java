package com.in28minutes.junit.helper;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class QuickBeforeAfterTest {

	@BeforeClass
	public static void beforeClass() {
		System.out.println("Before Class");
		
		//e.g: database connection is needed once
	}
	@Before
	public void setup() {
		System.out.println("Before Test");
	}

	@Test
	public void test1() {
		System.out.println("test1 executed");
	}

	@Test
	public void test2() {
		System.out.println("test2 executed");
	}

	@After
	public void teardown() {
		System.out.println("After Test");
		// for example if wee need to discard the database connection after every test
		// we need @After
	}
	@AfterClass
	public static void afterClass() {
		System.out.println("After Class");
		
	}
		

}
