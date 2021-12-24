package com.juaraccoding.locator.driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.SendKeysAction;

public class Main {
	public static void main(String[] args) {
		DriverSingleton driverSingleton = DriverSingleton.getInstance();
		WebDriver driver = DriverSingleton.getDriver();
		driver.get("https://web.facebook.com/");
		driver.findElement(By.cssSelector("#email")).sendKeys("sam.bayu@ymail.com");
		driver.findElement(By.cssSelector("#pass")).sendKeys("torres");
		driver.findElement(By.cssSelector("#u_0_j_0M")).submit();
	}

}
