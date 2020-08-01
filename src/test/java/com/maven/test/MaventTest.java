package com.maven.test;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class MaventTest {
	
	WebDriver driver;
	@Test
	public void firstTest() throws MalformedURLException {
		System.out.println("This is our first Test");
		/*System.setProperty("webdriver.gecko.driver", "/home/ubuntu/libs/geckodriver");
		driver = new FirefoxDriver();*/
		
		DesiredCapabilities cap = DesiredCapabilities.firefox();
		cap.setCapability("platFormName", "windows");
		
		URL url = new URL ("http://172.17.0.1:4444/wd/hub");
		WebDriver driver = new RemoteWebDriver(url,cap);
		
		driver.get("https://www.simplilearn.com/");
	}
	
	@AfterTest
	public void closeBrowser() {
		driver.close();
	}
	
	
	
}
