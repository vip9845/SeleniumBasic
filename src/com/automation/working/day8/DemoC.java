package com.automation.working.day8;


import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoC {

	@Test
	public void registerUser()
	{
		Reporter.log("registerUser",true);
		Assert.fail();
	}
	
	@Test(dependsOnMethods={"registerUser"})
	public void deleteUser()
	{
		Reporter.log("deleteUSer",true);
	}
}
