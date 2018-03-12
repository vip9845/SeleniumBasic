package com.automation.working.day6;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		String un=Excel.getCellValue("C:\\Users\\VISHNU\\Documents\\Book1.xlsx", "sheet2", 1, 0);
		String pw=Excel.getCellValue("C:\\Users\\VISHNU\\Documents\\Book1.xlsx", "sheet2", 1, 1);
		
		System.out.println("Username is: "+un);
		System.out.println("Password is: "+pw);
		
		String key2="webdriver.gecko.driver";
		String value2="./drivers/geckodriver.exe";
		System.setProperty(key2, value2);	
		FirefoxDriver driver=new FirefoxDriver();
		
		driver.get("http://localhost/login.do");
		
		LoginPage l=new LoginPage(driver);
		
		l.setUserName(un);
		l.setPassword(pw);
		
		Thread.sleep(10000);
		
		l.ClickLogin();
	}

}
