package com.automation.working.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Program18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String key2="webdriver.gecko.driver";
		String value2="./drivers/geckodriver.exe";
		System.setProperty(key2, value2);	
		FirefoxDriver driver=new FirefoxDriver();
		driver.navigate().to("file:///C:/Users/VISHNU/Tution/HTML/DemoD.html");
		
		WebElement listBox=driver.findElement(By.id("mtr"));
		Select select=new Select(listBox);
		
		int count=select.getOptions().size();
		System.out.println(count);
		System.out.println("Selecting");
		for(int i=0;i<count;i++)
		{
			select.selectByIndex(i);
		}
		System.out.println("De-Selecting");
		for(int i=count-1;i>=0;i--)
		{
			select.deselectByIndex(i);
		}
		
	}

}
