package com.maven.test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class MaventTest {
	
	WebDriver driver;
	@Test
	public void firstTest() {
		System.out.println("This is our first Test");
		driver = new FirefoxDriver();
		
	}
	
	@AfterTest
	public void closeBrowser() {
		driver.quit();
	}
	
	
	
}
