package com.automation.working.Day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Program1 
{
	public static void main(String[] args) {
		
		String Key="webdriver.chrome.driver";
		String value="./drivers/chromedriver.exe";
		System.setProperty(Key, value);		
		ChromeDriver driver=new ChromeDriver();
		driver.navigate().to("http://www.google.com");
		System.out.println(driver.getTitle());
		//driver.close();
		CloseAnyBrowser(driver);
		
		String key1="webdriver.ie.driver";
		String value1="./drivers/IEDriverServer.exe";
		System.setProperty(key1, value1);	
		InternetExplorerDriver driver1=new InternetExplorerDriver();		
		driver1.navigate().to("http://www.google.com");
		System.out.println(driver1.getTitle());
		driver1.close();
		
		String key2="webdriver.gecko.driver";
		String value2="./drivers/geckodriver.exe";
		System.setProperty(key2, value2);	
		FirefoxDriver driver2=new FirefoxDriver();
		driver2.navigate().to("http://www.google.com");
		System.out.println(driver2.getTitle());
		driver2.close();
		
	}
	
	static void CloseAnyBrowser(WebDriver driver)
	{
		driver.quit();
	}
}
