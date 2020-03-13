package com.ms.ReadJson;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SampleTestData {
	
	@DataProvider
	public Object[][] getData(){

	Object[][] data = new Object[3][2];

	// 1st data set
	data[0][0]="firstSetUsername";
	data[0][1]="firstSetUserpassword";

	// 2nd data set
	data[1][0]="secondSetUsername";
	data[1][1]="secondSetUserpassword";

	// 3rd data set
	data[2][0]="thirdSetUsername";
	data[2][1]="thirdSetUserpassword";

	return data;
	}

	@Test(dataProvider="getData")
	public void LogIn(String username, String password)
	{
	System.out.println(username);
	System.out.println(password);
	}

}
