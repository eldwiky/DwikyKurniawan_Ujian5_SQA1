package com.juaracoding.main;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.juaraccoding.locator.driver.DriverSingleton;
import com.juaracoding.selenium.CrerateAccount;

public class MainApp {

	public static void main(String[] args) {
		WebDriver driver = DriverSingleton.getInstance().getDriver();
		
		driver.get("http://automationpractice.com/");
		
		CrerateAccount auto = new CrerateAccount();
		auto.SignIN();
		auto.NewEmail();
		auto.SubmitEmail();
		auto.Forms();
		auto.Dress();
		auto.Tshirts();
		auto.Checkout();
	}
}
