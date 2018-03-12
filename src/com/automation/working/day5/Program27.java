package com.automation.working.day5;

import java.util.Set;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Program27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String key2="webdriver.gecko.driver";
		String value2="./drivers/geckodriver.exe";
		System.setProperty(key2, value2);	
		FirefoxDriver driver=new FirefoxDriver();
		
		driver.get("http://www.naukri.com");
		Set<String> b=driver.getWindowHandles();
		
		int count=b.size();
		
		System.out.println(count);
		
		for(String c:b)
		{
			driver.switchTo().window(c);
			String title=driver.getTitle();
			
			if(title.equals("Amazon"))
			{
				System.out.println(title);
				driver.close();
			}
			
		}
		
	}

}
