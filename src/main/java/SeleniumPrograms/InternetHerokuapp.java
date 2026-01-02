package SeleniumPrograms;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InternetHerokuapp {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");

		// Test script 1
		String parentWindow = driver.getWindowHandle();
		driver.findElement(By.xpath("//a[text()='Multiple Windows']")).click();
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		// Switch to child window
		for (String childWindow : driver.getWindowHandles()) {
			if (!childWindow.equals(parentWindow)) {
				driver.switchTo().window(childWindow);
				break;
			}
		}

		// Validate header in child window
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement heading = driver.findElement(By.xpath("//h3[text()='New Window']"));
		wait.until(ExpectedConditions.visibilityOf(heading));
		Assert.assertEquals(heading.getText(), "New Window");
		driver.close();

		driver.switchTo().window(parentWindow);
		System.out.println("Verify title of parent window:" + driver.getTitle());
		driver.navigate().back();

		// Test script 2
		// Hower over User 1 and click on view profile
		// Hovers>>img1>>View Profile>>Navigate back>>Navigate back
		driver.findElement(By.linkText("Hovers")).click();
		WebElement img1 = driver.findElement(By.xpath("(//img[@alt='User Avatar'])[1]"));
		Actions act = new Actions(driver);
		act.moveToElement(img1).build().perform();
		wait.until(ExpectedConditions.visibilityOf(img1));
		driver.findElement(By.xpath("(//a[text()='View profile'])[1]")).click();
		driver.navigate().back();
		driver.navigate().back();
		System.out.println("Parent window URL is : " + driver.getCurrentUrl());

		// Web Tables
		driver.findElement(By.xpath("//a[text()='Sortable Data Tables']")).click();
		List<WebElement> rows = driver.findElements(By.xpath("(//table[@class='tablesorter'])[1]//tbody/tr"));
		String targetLastName = "bach";
		String emailFound = null;
		String dueFound = null;
		for (WebElement row : rows) {
			String lastName = row.findElement(By.xpath("(//tr/td[text()='Bach'])[1]")).getText();
			if (lastName.equalsIgnoreCase(targetLastName)) {
				emailFound = row.findElement(By.xpath("(//td[text()='fbach@yahoo.com'])[1]")).getText();
				dueFound = row.findElement(By.xpath("(//td[text()='$51.00'])[1]")).getText();
				break;
			}
		}
		System.out.println("Email for " + targetLastName + ": " + emailFound);
		System.out.println("Due for " + targetLastName + ": " + dueFound);

		// Simple validation
		if (emailFound == null) {
			throw new RuntimeException("Row not found");

		}
		System.out.println("Web table scenario done");
	}

}
