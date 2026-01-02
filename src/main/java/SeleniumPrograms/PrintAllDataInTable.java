package SeleniumPrograms;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PrintAllDataInTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
       driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Sortable Data Tables']")).click();
		List<WebElement> rows = driver.findElements(By.xpath("(//table[@class='tablesorter'])[1]//tbody/tr"));
		List<List<String>> tableData=new ArrayList<>();
		for(WebElement row:rows) {
			List<WebElement> cells=row.findElements(By.tagName("td"));
			List<String> rowData=new ArrayList<>();
			
			for(WebElement cell:cells) {
				rowData.add(cell.getText());
			}
			tableData.add(rowData);
		}
		System.out.println(tableData);
		
		
		
	}

}
