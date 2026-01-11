package SeleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ShadowDOM {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://bonigarcia.dev/selenium-webdriver-java/shadow-dom.html");

		driver.manage().window().maximize();
		WebElement shadowHost=driver.findElement(By.cssSelector("#content"));
		SearchContext shadowRoot=shadowHost.getShadowRoot();
		String text = shadowRoot.findElement(By.cssSelector("p")).getText();
		System.out.println(text);
		driver.close();

	}

}
