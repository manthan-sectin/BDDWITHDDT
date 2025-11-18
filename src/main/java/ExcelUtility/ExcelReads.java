package ExcelUtility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReads {

	public static Object[][] getExcelData(String fielpath, String sheetName)
			throws EncryptedDocumentException, InvalidFormatException, IOException {
		Object[][] data = null;
		try (FileInputStream fis = new FileInputStream(fielpath); Workbook wb = WorkbookFactory.create(fis)) {
			Sheet sheet = wb.getSheet(sheetName);
			int totalRows = sheet.getLastRowNum();
			int totalCols = sheet.getRow(0).getLastCellNum();
			data = new Object[totalRows][totalCols];
			DataFormatter formatter = new DataFormatter();
			for (int i = 1; i <= totalRows; i++) {
				Row row = sheet.getRow(i);
				for (int j = 0; j < totalCols; j++) {
					Cell cell = row.getCell(j);
					data[i - 1][j] = formatter.formatCellValue(cell);
				}
			}

		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return data;
	}

	

	

	  
	}

	
	
	

