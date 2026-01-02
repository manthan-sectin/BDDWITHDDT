package tests;

import org.testng.annotations.Test;

import base.BaseTest;
import javaProgramiz.ExcelUtility;
import pageObjects.SauceDemoLoginPage;

public class EndToEndAutomation extends BaseTest {

	@Test(priority = 1)
	public void LoginTest() {
		String xlPath = "D:\\BDDWithDDT\\src\\test\\resources\\testData\\ExcelReader.xlsx";
		String username = ExcelUtility.getCellValue(xlPath, "Groups", 2, 0);
		String Password = ExcelUtility.getCellValue(xlPath, "Groups", 2, 1);
		SauceDemoLoginPage login = new SauceDemoLoginPage(driver);
		logger = extent.createTest("To Verify Login with Valid inputs");
		login.SetUserName(username);
		logger.createNode("Username entered");
		login.SetPassword(Password);
		logger.createNode("Password entered");
		login.ClickOnSubmit();
		logger.createNode("Click on submit button");
	}

	@Test(priority = 2,dependsOnMethods="LoginTest")
	public void AddToCart() {
		SauceDemoLoginPage login = new SauceDemoLoginPage(driver);
		logger = extent.createTest("To Verify product is added to cart");
		login.ClickOnAddToCart();
	    logger.createNode("Sauce lab bagpack product added to cart");
		login.VerifyPageTitleOfProductPage();
		logger.createNode("Clicked on cart link");

	}
	
	@Test(priority = 3)
	public void Checkout() throws InterruptedException {
		SauceDemoLoginPage login = new SauceDemoLoginPage(driver);
		logger = extent.createTest("To Verify product checkout from Cart page");
		login.ClickOnCheckout();
		logger.createNode("Clicked on checkout button");

	}
	
	@Test(priority = 4)
	public void InputCheckoutFields() throws InterruptedException {
		SauceDemoLoginPage login = new SauceDemoLoginPage(driver);
		logger = extent.createTest("Input checkout fields");
		String xlPath = "D:\\BDDWithDDT\\src\\test\\resources\\testData\\ExcelReader.xlsx";
		String FirstName = ExcelUtility.getCellValue(xlPath, "Groups", 8, 0);
		String LastName = ExcelUtility.getCellValue(xlPath, "Groups", 9, 0);
		String Zip = ExcelUtility.getCellValue(xlPath, "Groups", 10, 0);
		login.inputCheckoutInfo(FirstName, LastName, Zip);
		logger.createNode("First name, Last Name and ZIP code submitted");
		login.ClickOnContinue();
		logger.createNode("Clicked on continue button");
		login.ClickOnFinishAndValidateText();
		logger.createNode("Finish button clicked and Thank You text validated");
	}
	
	
	
}
