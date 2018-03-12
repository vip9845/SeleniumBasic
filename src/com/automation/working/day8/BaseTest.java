package com.automation.working.day8;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseTest {

	@BeforeSuite	
	public void M7()
	{
		Reporter.log("@Before Suite",true);
	}
	
	@AfterSuite
	public void M8()
	{
		Reporter.log("@After Suite",true);
	}
	
	@BeforeTest	
	public void M5()
	{
		Reporter.log("@Before Test",true);
	}
	
	@AfterTest
	public void M6()
	{
		Reporter.log("@After Test",true);
	}
	
	@BeforeClass	
	public void M3()
	{
		Reporter.log("@Before Test",true);
	}
	
	@AfterClass
	public void M4()
	{
		Reporter.log("@After Test",true);
	}
	
	@BeforeMethod
	public void M1()
	{
		Reporter.log("@Before Method",true);
	}
	
	@AfterMethod
	public void M2()
	{
		Reporter.log("@After Method",true);
	}
}
