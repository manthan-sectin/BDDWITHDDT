package SeleniumPrograms;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTables {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method st
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.asx.com.au/");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[text()='Accept All Cookies']")).click();
		driver.findElement(By.xpath("//h5[text()='S&P ASX200 top 5']")).click();
		Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10))
;
		wait.until(ExpectedConditions.stalenessOf(driver.findElement(By.xpath("//button[text()='Accept All Cookies']"))));
		
		//js.executeScript("window.scrollBy(0, 500)");
	/*	Thread.sleep(2000);
		List<WebElement> rowNum=driver.findElements(By.xpath("//*[@id=\"home_top_five\"]/div/div[1]/div/div[1]/table/tr"));
		Thread.sleep(2000);
		List<WebElement> cellNum=driver.findElements(By.xpath("//*[@id=\"home_top_five\"]/div/div[1]/div/div[1]/table/tr/th"));
		Thread.sleep(2000);
		for(int i=1;i<rowNum.size();i++) {
			for(int j=1;j<cellNum.size();j++) {
				Thread.sleep(2000);
				System.out.print(driver.findElement(By.xpath("//*[@id=\"home_top_five\"]/div/div[1]/div/div[1]/table/tr[" + i + "]/th[" + j + "]")).getText()+ "  ");
			}
			System.out.println();
		}
		*/
		// Locate rows (tbody)
		List<WebElement> rows = driver.findElements(
		        By.xpath("//*[@id='home_top_five']//table/tbody/tr")
		);

		// Loop through rows
		for (WebElement row : rows) {

		    // Locate cells inside each row
		    List<WebElement> cells = row.findElements(By.tagName("td"));

		    for (WebElement cell : cells) {
		        System.out.print(cell.getText() + "   ");
		    }
		    System.out.println();
		}
		
		
		
		
		
		
	}

}
