package com.juaraccoding.locator.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox implements DriverStrategy {

	public WebDriver setStrategy() {
		System.setProperty("webdriver.gecko.driver","D://Firefox Driver/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		return driver;
	}

}
