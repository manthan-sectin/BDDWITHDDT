package javaProgramiz;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import ExcelUtility.ExcelReader;

public class LoginTest {

    /**
     * TestNG DataProvider that uses the ExcelReader utility.
     * The name "loginDataProvider" is used by the test method.
     * @return The 2D array of data read from the Excel sheet.
     */
    @DataProvider(name = "loginDataProvider")
    public Object[][] getLoginData() {
        // Calls the static method in the utility class
        // "LoginData" is the name of the sheet in TestData.xlsx
        return ExcelReader.getTestData("LoginData");
    }

    /**
     * Data-driven test method. TestNG will execute this method
     * once for every row returned by the DataProvider.
     * @param username The value from the first column.
     * @param password The value from the second column.
     * @param expectedResult The value from the third column.
     */
    @Test(dataProvider = "loginDataProvider")
    public void testLogin(String username, String password, String expectedResult) {
        System.out.println("--- Executing Login Test ---");
        System.out.println("Testing with: Username=" + username + 
                           ", Password=" + password + 
                           ", Expected=" + expectedResult);

        // *** ACTUAL TEST LOGIC GOES HERE ***
        // e.g., driver.findElement(By.id("username")).sendKeys(username);
        // e.g., performLogin(username, password);
        
        // Assertions based on expectedResult
        // Assert.assertEquals(actualMessage, expectedResult); 
        
        System.out.println("Test Complete for this dataset.");
    }
}