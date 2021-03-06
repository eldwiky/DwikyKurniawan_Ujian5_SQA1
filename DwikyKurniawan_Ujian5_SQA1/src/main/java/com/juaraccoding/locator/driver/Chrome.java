package com.juaraccoding.locator.driver;

import javax.crypto.spec.ChaCha20ParameterSpec;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Chrome implements DriverStrategy {
	
	public WebDriver setStrategy() {
		
		System.setProperty("webdriver.chrome.driver","D://Chrome Driver/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("useAutomationExtension", false);
		options.addArguments("--no-sandbox");
		
		return new ChromeDriver();
	}

}
