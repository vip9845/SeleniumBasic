package com.automation.working.day8;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DemoD {

	@DataProvider
	
	public String[][] getData(){
		
		String[][] a=new String[2][3];
		
		a[0][0]="UserA";
		a[0][1]="UserX";
		a[0][2]="p1";
		a[1][0]="UserB";
		a[1][1]="UserY";
		a[1][2]="p2";
		
		return a;
	}
	
	@Test(dataProvider="getData")
	public void registerUser(String un,String pw,String ph)
	{
		Reporter.log(un+pw+ph,true);
	}
}
