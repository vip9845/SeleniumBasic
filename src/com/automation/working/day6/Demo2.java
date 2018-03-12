package com.automation.working.day6;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		String key2="webdriver.gecko.driver";
		String value2="./drivers/geckodriver.exe";
		System.setProperty(key2, value2);	
		FirefoxDriver driver=new FirefoxDriver();
		
		driver.get("http://localhost/login.do");
		
		LoginPage l=new LoginPage(driver);
		
		for(int i=1;i<=2;i++)
		{
			String un=Excel.getCellValue("C:\\Users\\VISHNU\\Documents\\Book1.xlsx", "sheet3", i, 0);
			String pw=Excel.getCellValue("C:\\Users\\VISHNU\\Documents\\Book1.xlsx", "sheet3", i, 1);
			
			System.out.println("Username is: "+un);
			System.out.println("Password is: "+pw);
			
			l.setUserName(un);
			l.setPassword(pw);
			Thread.sleep(2000);
			l.ClickLogin();
			Thread.sleep(2000);
			
		}
	}

}
