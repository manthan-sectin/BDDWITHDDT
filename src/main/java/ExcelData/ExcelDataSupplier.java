package ExcelData;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class ExcelDataSupplier {

	@DataProvider(name="DataSupplier")
	public static String[][] getData()throws IOException {
		// TODO Auto-generated method stub

		File excelFile=new File("D:\\BDDWithDDT\\src\\main\\resources\\ExcelData.xlsx");
		FileInputStream fis=new FileInputStream(excelFile);
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		int noOfRows=sheet.getPhysicalNumberOfRows();
		int noOfColumn=sheet.getRow(0).getLastCellNum();
		String[][] data=new String[noOfRows-1][noOfColumn];
		
		for(int i=0;i<noOfRows-1;i++) {
			for(int j=0;j<noOfColumn;j++) {
				DataFormatter formatter=new DataFormatter();
				data[i][j]=formatter.formatCellValue(sheet.getRow(i+1).getCell(j));
			}
			//System.out.println();
			
		}
		workbook.close();
		fis.close();
		
	//for(String[] dataArr:data)
	//	System.out.println(Arrays.toString(dataArr));
	return data;	
		
		
		
	}

}
