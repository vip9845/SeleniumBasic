package com.automation.working.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Program8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String key2="webdriver.gecko.driver";
		String value2="./drivers/geckodriver.exe";
		System.setProperty(key2, value2);	
		FirefoxDriver driver=new FirefoxDriver();
		driver.navigate().to("http://localhost/login.do;jsessionid=6fqrqroa4fudh");
		
		WebElement checkbox=driver.findElement(By.id("keepLoggedInCheckBox"));
		//checkbox.click();
		
		if(checkbox.isSelected())
		{
			System.out.println("Checkbox is selected");
		}
		else
		{
			System.out.println("Checkbox is not sselected");
		}
		
		
	}

}
