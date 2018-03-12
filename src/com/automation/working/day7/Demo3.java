package com.automation.working.day7;

import org.openqa.selenium.firefox.FirefoxDriver;

import com.automation.working.day6.LoginPage;

public class Demo3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		String key2="webdriver.gecko.driver";
		String value2="./drivers/geckodriver.exe";
		System.setProperty(key2, value2);	
		FirefoxDriver driver=new FirefoxDriver();
		
		driver.get("http://localhost/login.do");
		
		LoginPage1 l=new LoginPage1(driver);
		
		l.SetUserName("abc");
		l.SetPassword("xyz");
		Thread.sleep(2000);
		l.ClickLogin();
		
		Thread.sleep(2000);
		
		l.SetUserName("admin");
		l.SetPassword("manager");
		Thread.sleep(2000);
		l.ClickLogin();
		
		
		l.printLinkCount();
		
		driver.close();
	}

}
