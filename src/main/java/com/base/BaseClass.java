package com.base;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import jdk.internal.org.jline.utils.Log;

public class BaseClass {
	
	@BeforeSuite
	public void beforeSuite() 
	{
		
		DOMConfigurator.configure("log4j.xml");
		Log.info("This is before suite");
	}
     @AfterSuite
	public void afterSuite() 
	{
		Log.info("Thisis after suite");
	}
}
