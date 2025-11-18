package ExcelUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtils {

	public static String getCellvalue(String filepath, String sheetName, int rowNum, int colnum) throws FileNotFoundException, IOException, EncryptedDocumentException, InvalidFormatException {
		String value = "";
		try (FileInputStream fis = new FileInputStream(filepath);
				Workbook wb = WorkbookFactory.create(fis)) {
			Sheet sheet = wb.getSheet(sheetName);
			Row row = sheet.getRow(rowNum);
			Cell cell = row.getCell(colnum);
			DataFormatter formatter = new DataFormatter();
			value = formatter.formatCellValue(cell);

		}

		catch(IOException e)
		{
			e.printStackTrace();
		}
	return value;	
	}

}
