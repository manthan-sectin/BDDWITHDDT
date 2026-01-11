package SeleniumPrograms;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.home.saxo/en-sg/products/forex");
		driver.manage().window().maximize();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		//Accept Cookies
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()=' Accept all ']"))).click();
		Thread.sleep(1000);
		
		WebElement link = driver.findElement(By.xpath("//a[text()='See prices for FX pairs']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Actions act = new Actions(driver);
		act.moveToElement(link).click().build().perform();
		js.executeScript("window.scrollBy(0,500)");

		WebElement MyTable = driver.findElement(By.xpath("//table[@class='dynamic-pricing__table']"));
		List<WebElement> rows = driver.findElements(By.xpath("//tbody[@class='table-desktop animating']//tr"));
		int rowCount = rows.size();

		for (int i = 0; i < rowCount; i++) {
			List<WebElement> cols = rows.get(i).findElements(By.tagName("td"));
			String currencyPair = cols.get(0).getText();

			if (currencyPair.contains("EURUSD")) {
				String pipValue = cols.get(3).getText();
				if (pipValue.equalsIgnoreCase("0.5 PIPS")) {
					System.out.println("PASS: EURUSD pips are correct at " + pipValue);
				} else {
					System.out.println("FAIL: EURUSD pips expected 0.7 but found " + pipValue);
				}
				break;
			}

		}

	}

}
