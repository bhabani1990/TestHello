package com.ms.ReadJson;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import bsh.ParseException;

public class ReadJSON {

	WebDriver driver;
	String url,UserName,Password;
	JSONParser parser=new JSONParser();

	@BeforeTest
	public void setup() throws FileNotFoundException, IOException, ParseException, org.json.simple.parser.ParseException 
	{
		System.setProperty("webdriver.chrome.driver", "C:/Users/bhaba/Downloads/Driver/chromedriver.exe");

		Object obj = parser.parse(new FileReader("C:/Users/bhaba/eclipse-workspace/ReadTestData/Registration.json"));

		JSONObject jsonObject = (JSONObject) obj;

		url = (String) jsonObject.get("URL");

		UserName = (String) jsonObject.get("UserName"); 

		Password = (String) jsonObject.get("Password");

		driver = new ChromeDriver();

		driver.get(url);

	}

	@Test
	public void testSearch() throws FileNotFoundException, IOException, ParseException 
	{
		driver.findElement(By.cssSelector("#form1")).sendKeys(UserName);

		driver.findElement(By.cssSelector("#password-login")).sendKeys(Password);

		driver.findElement(By.cssSelector("#form-submit")).click();
	}


}
