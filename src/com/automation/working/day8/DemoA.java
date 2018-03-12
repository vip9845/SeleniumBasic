package com.automation.working.day8;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoA extends BaseTest{
	
	@Test(invocationCount=3)
	public void TestA1()
	{
		Reporter.log("TestA1-------",true);
	}
	
	@Test
	public void TestA2()
	{
		Reporter.log("TestA2-------",true);
	}
}
