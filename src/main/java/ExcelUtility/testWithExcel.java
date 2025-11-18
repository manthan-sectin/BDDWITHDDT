package ExcelUtility;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class testWithExcel {

	@DataProvider(name="LoginData")
	public Object[][] getData() throws EncryptedDocumentException, FileNotFoundException, InvalidFormatException, IOException{
		String path="D:\\BDDWithDDT\\src\\main\\resources\\TestData.xlsx";
		String shhet="LoginData";
		Object[][] data=new Object[2][2];
		data[0][0]=ExcelUtils.getCellvalue(path, shhet, 1, 0);
		data[0][1]=ExcelUtils.getCellvalue(path, shhet, 1, 1);
		data[1][0]=ExcelUtils.getCellvalue(path, shhet,2, 0);
		data[1][1]=ExcelUtils.getCellvalue(path, shhet, 2, 1);
//	data[2][0]=ExcelUtils.getCellvalue(path, shhet,3, 0);
//		data[2][1]=ExcelUtils.getCellvalue(path, shhet, 3, 1);
		return data;
		
		
		
	}
	@Test(dataProvider="LoginData")
	public void LoginTest(String Username, String password) {
		System.out.println("Username: " +Username + " | Password: " +password);
	}
	
	
	
}
