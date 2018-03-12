package com.automation.working.day3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Program20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String key2="webdriver.gecko.driver";
		String value2="./drivers/geckodriver.exe";
		System.setProperty(key2, value2);	
		FirefoxDriver driver=new FirefoxDriver();
		driver.navigate().to("file:///C:/Users/VISHNU/Tution/HTML/DemoD.html");
		
		WebElement listBox=driver.findElement(By.id("mtr"));
		Select select=new Select(listBox);
		
		List<WebElement> allOptions=select.getOptions();
		
		int found=0;
		
		for(WebElement option:allOptions)
		{
			String text=option.getText();
			if(text.equals("Idly"))
			{
				found++;
			}			
		}
		
		System.out.println(found);
	}

}
