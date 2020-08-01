package com.maven.test;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class MaventTest {
	
	WebDriver driver;
	@Test
	public void firstTest() throws MalformedURLException {
		System.out.println("This is our first Test");
		System.setProperty("webdriver.gecko.driver", "/home/ubuntu/libs/geckodriver");
		driver = new FirefoxDriver();
		
		
		driver.get("https://www.simplilearn.com/");
	}
	
	@AfterTest
	public void closeBrowser() {
		driver.close();
	}
	
	
	
}
