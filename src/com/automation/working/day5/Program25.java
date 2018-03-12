package com.automation.working.day5;

import java.util.Set;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Program25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String key2="webdriver.gecko.driver";
		String value2="./drivers/geckodriver.exe";
		System.setProperty(key2, value2);	
		FirefoxDriver driver=new FirefoxDriver();

		String a=driver.getWindowHandle();
		
		System.out.println(a);
		
		driver.get("http://www.naukri.com");
		Set<String> b=driver.getWindowHandles();
		
		for(String c:b)
		{
			System.out.println(c);
		}
		
		
	}

}
