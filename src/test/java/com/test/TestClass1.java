package com.test;

import org.testng.annotations.Test;

import com.utility.Log;

public class TestClass1 {
	@Test
	public void test1() 
	
	{
		//@Test
		Log.startTestCase("test1");
		Log.info("The testcase1 started");
		Log.endTestCase("test1");
	}

	@Test
	public void test2() 
	
	{
		//@Test
		Log.startTestCase("test2");
		Log.info("The testcase2 started");
		Log.endTestCase("test2");
	}
	@Test
	public void test3() 
	
	{
		//@Test
		Log.startTestCase("test3");
		Log.info("The testcase3 started");
		Log.endTestCase("test3");
	}
}
