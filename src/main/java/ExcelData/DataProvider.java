package ExcelData;

import org.testng.annotations.Test;

public class DataProvider {

	@Test(dataProvider="DataSupplier", dataProviderClass= ExcelDataSupplier.class)
	public void GetDataFromExcel(String Username, String Password) {
		System.out.println("Username is : " +Username  +  "  Password is: " +  Password);
		
		
		
	}
	
}
