package com.automation.working.day8;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;



public class DemoE {

	@Test
	public void TestE(){
		
		String key2="webdriver.gecko.driver";
		String value2="./drivers/geckodriver.exe";
		System.setProperty(key2, value2);	
		FirefoxDriver driver=new FirefoxDriver();
		
		driver.get("http://localhost/login.do");
		
		String atitle=driver.getTitle();
		
		String etitle="actiTIME - Login";
		
		System.out.println("Actual   Title: "+atitle);
		System.out.println("Expected Title: "+etitle);
		
		Assert.assertEquals(atitle, etitle,"Title is not as expected");
	}
}
