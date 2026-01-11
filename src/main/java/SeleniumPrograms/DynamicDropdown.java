package SeleniumPrograms;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicDropdown {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		options.addArguments("--start-maximized");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.hdfc.bank.in/");
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions
				.refreshed(ExpectedConditions.elementToBeClickable((By.xpath("(//div[@class='select-btn'])[1]")))));

		driver.findElement(By.xpath("(//div[@class='select-btn'])[1]")).click();

		// Capture list of dropdown
		List<WebElement> list = driver.findElements(By.xpath("//ul[@class='options']//li"));
		for (WebElement li : list) {
			String text = li.getText();
			System.out.println(text);
			if (text.equalsIgnoreCase("Social Security Schemes")) {
				li.click();
				break;
			}
		}

	}

}
