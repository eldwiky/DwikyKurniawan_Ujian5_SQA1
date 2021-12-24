package com.juaracoding.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.juaraccoding.locator.driver.DriverSingleton;

public class CrerateAccount {

	private WebDriver driver;
	
	public CrerateAccount() {
		WebDriver driver = DriverSingleton.getInstance().getDriver();
		PageFactory.initElements(driver, this);
		
	}
	
	
	@FindBy (css = "#header > div.nav > div > div > nav > div.header_user_info > a")
	WebElement btnSignin;
	
	@FindBy (id = "email_create")
	WebElement txtNewEmail;
	
	@FindBy (id = "SubmitCreate")
	WebElement btnSubmit;
	
	@FindBy (xpath = "//*[@class = \"radio\"]|//*[@class = \"top\"]")
	List<WebElement> radioMrMrs;
	
	@FindBy (id = "customer_firstname")
	WebElement txtcustFirsName;
	
	@FindBy (id = "customer_lastname")
	WebElement txtcustLasName;
	
	@FindBy (id = "email")
	WebElement txtEmail;
	
	@FindBy (id = "passwd")
	WebElement txtPassword;
	
	@FindBy (id = "days")
	WebElement txtDays;
	
	@FindBy (id = "months")
	WebElement txtMonths;
	
	@FindBy (id = "years")
	WebElement txtYears;
	
	@FindBy (id = "newsletter")
	WebElement cekBoxNewslatter;
	
	@FindBy (id = "optin")
	WebElement cekBoxOptin;
	
	@FindBy (id = "firstname")
	WebElement txtFirsName;
	
	@FindBy (id = "lastname")
	WebElement txtLastName;
	
	@FindBy (id = "company")
	WebElement txtCompany;
	
	@FindBy (id = "address1")
	WebElement txtAddress;
	
	@FindBy (id = "address2")
	WebElement txtAddressOption;
	
	@FindBy (id = "city")
	WebElement txtCity;
	
	@FindBy (id = "id_state")
	WebElement txtState;
	
	@FindBy (id = "postcode")
	WebElement txtPostcode;
	
	@FindBy (id = "id_country")
	WebElement txtCountry;
	
	@FindBy (id = "other")
	WebElement txtAdditionalInfo;
	
	@FindBy (id =  "phone")
	WebElement txtPhone;
	
	@FindBy (id = "phone_mobile")
	WebElement txtHP;
	
	@FindBy (id = "alias")
	WebElement txtAlias;
	
	@FindBy (id = "submitAccount")
	WebElement btnRegister;
	
	public void SignIN() {
		btnSignin.click();
	}
	
	public void NewEmail() {
		txtNewEmail.sendKeys("DwikyTesting@selenium.com");
	}
	
	public void SubmitEmail() {
		btnSubmit.click();
	}
	
	public void Forms() {
		// 0 = Mr, 1 = Mrs
		radioMrMrs.get(0).click();
		txtcustFirsName.sendKeys("Ahmad");
		txtcustLasName.sendKeys("Balmond");
		txtEmail.sendKeys(Keys.CONTROL+"a", "DwikyTesting@selenium.com");
		txtPassword.sendKeys("Balmond123");
		txtDays.click();
		txtDays.sendKeys("12", Keys.ENTER);
		txtMonths.click();
		txtMonths.sendKeys("December", Keys.ENTER);
		txtYears.click();
		txtYears.sendKeys("2012", Keys.ENTER);
		cekBoxNewslatter.click();
		cekBoxOptin.click();
		txtFirsName.sendKeys(Keys.CONTROL+"a", "Ahmad");
		txtLastName.sendKeys(Keys.CONTROL+"a", "Balmond");
		txtCompany.sendKeys("Moonton");
		txtAddress.sendKeys("Merdeka Street");
		txtAddressOption.sendKeys("Masuk Gang Mawar");
		txtCity.sendKeys("Hawaii");
		txtState.click();
		txtState.sendKeys("Hawaii", Keys.ENTER);
		txtPostcode.sendKeys("12855");
		txtCountry.sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
		txtAdditionalInfo.sendKeys("Gak ada info tambahan");
		txtPhone.sendKeys("021222222");
		txtHP.sendKeys("0888868688");
		txtAlias.sendKeys(Keys.CONTROL+"a");
		txtAlias.sendKeys("ABCD");
		btnRegister.click();
	}
	
	@FindBy (css = "#block_top_menu > ul > li:nth-child(2)")
	WebElement btnDress;
	
	@FindBy (xpath = "//*[@class=\"subcategory-image\"]")
	List<WebElement> btnCategoryDress;
	
	@FindBy (css = "#center_column > ul > li > div > div.right-block > h5 > a")
	WebElement SelectItemDress;
	
	@FindBy (css = "button[name='Submit'] span")
	WebElement btnAddToChartDress;
	
	@FindBy(css = "#layer_cart > div.clearfix > div.layer_cart_cart.col-xs-12.col-md-6 > div.button-container > span")
	WebElement btnContinueShopping;
	
	public void Dress() {
		btnDress.click();
		// 0 = CASUAL DRESSES, 1 = EVENING DRESSES, 2 = SUMMER DRESSES
		btnCategoryDress.get(0).click();
		SelectItemDress.click();
		btnAddToChartDress.click();
		btnContinueShopping.click();
	}
	
	@FindBy(css = "#block_top_menu > ul > li:nth-child(3) > a")
	WebElement btnTShirt;
	
	@FindBy(css = "#center_column > ul > li > div > div.right-block > h5 > a")
	WebElement SelectItemTshirt;
	
	@FindBy (css = "button[name='Submit'] span")
	WebElement btnAddToChartTshirt;
	
	@FindBy (css = "#layer_cart > div.clearfix > div.layer_cart_cart.col-xs-12.col-md-6 > div.button-container > a")
	WebElement btnCheckout;
	
	public void Tshirts() {
		btnTShirt.click();
		SelectItemTshirt.click();	
		btnAddToChartTshirt.click();
		btnCheckout.click();
	}
	
	
	@FindBy (css = "#center_column > p.cart_navigation.clearfix > a.button.btn.btn-default.standard-checkout.button-medium")
	WebElement btnSummary;
	
	@FindBy (css = "#ordermsg > textarea")
	WebElement txtAddressNecessary;
	
	@FindBy (css = "#center_column > form > p > button")
	WebElement btnAddress;
	
	@FindBy (css = "#form > div > p.checkbox > label")
	WebElement cekBoxTAndC;
	
	@FindBy (css = "#form > p > button")
	WebElement btnShipping;
	
	@FindBy (xpath = "//*[@class=\"col-xs-12 col-md-6\"]")
	List<WebElement> SelectPayment;
	
	@FindBy (css = "#cart_navigation > button")
	WebElement btnConfirm;
	
	public void Checkout() {
		
		btnSummary.click();
		txtAddressNecessary.sendKeys("Masuk gang yang ada tukang baksonya");
		btnAddress.click();
		cekBoxTAndC.click();
		btnShipping.click();
		// 0 = Payment Bank, 1 Payment Check
		SelectPayment.get(1).click();
		btnConfirm.click();
	}

}

