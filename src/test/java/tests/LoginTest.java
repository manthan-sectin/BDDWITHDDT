package tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import ExcelUtility.ExcelReader;
import base.BaseTest;
import javaProgramiz.ExcelUtility;
import pageObjects.SauceDemoLoginPage;

public class LoginTest extends BaseTest {

    
    @DataProvider(name = "loginDataProvider")
    public Object[][] getLoginData() {
        // Calls the static method in the utility class
        // "LoginData" is the name of the sheet in TestData.xlsx
        return ExcelReader.getTestData("LoginData");
    }

/*
    @Test(dataProvider = "loginDataProvider")
    public void testLogin(String username, String Password,String expected) throws InterruptedException {
    	 System.out.println("Executing login test with: Username = " + username + ", Password = " + Password);

         SauceDemoLoginPage login = new SauceDemoLoginPage(driver);
         logger=extent.createTest("To Verify Login with Valid And Invalid Inputs");
         login.SetUserName(username);
         logger.createNode("Username entered");
         login.SetPassword(Password);
         logger.createNode("Password entered");
         login.ClickOnSubmit();
         logger.createNode("Click on submit button");
         Thread.sleep(4000);
//        System.out.println("--- Executing Login Test ---");
//        System.out.println("Testing with: Username=" + username + 
//                           ", Password=" + password + 
//                           ", Expected=" + expectedResult);

         
        
        System.out.println("Test Complete for this dataset.");
    }
   */ 
    @Test(priority=1)
    public void LoginTest() {
    	String xlPath="D:\\BDDWithDDT\\src\\test\\resources\\testData\\TestData.xlsx";
		String username=ExcelUtility.getCellValue(xlPath, "Groups", 1, 0);
		String Password=ExcelUtility.getCellValue(xlPath, "Groups", 0, 2);
		   SauceDemoLoginPage login = new SauceDemoLoginPage(driver);
	         logger=extent.createTest("To Verify Login with Valid And Invalid Inputs");
	         login.SetUserName(username);
	         logger.createNode("Username entered");
	         login.SetPassword(Password);
	         logger.createNode("Password entered");
	         login.ClickOnSubmit();
	         logger.createNode("Click on submit button");
    }
}