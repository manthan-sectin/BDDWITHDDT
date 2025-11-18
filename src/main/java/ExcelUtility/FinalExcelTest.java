package ExcelUtility;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FinalExcelTest {
    @DataProvider(name="LoginTest")
	public Object[][] getLogindata() throws EncryptedDocumentException, InvalidFormatException, IOException{
	String path="D:\\BDDWithDDT\\src\\main\\resources\\TestData.xlsx";
	return ExcelReads.getExcelData(path, "LoginData");
	}
	
    @Test(dataProvider="LoginTest")
    public void GetLoginDetails(String username , String Password, String role, String expectedResult) {
    	System.out.println("Username: " +username + "with passwords as" +Password);
    }
	
}
