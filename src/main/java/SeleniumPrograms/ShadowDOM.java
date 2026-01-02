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
		driver.get("https://the-internet.herokuapp.com/");

		driver.manage().window().maximize();
		driver.findElement(By.linkText("Shadow DOM")).click();

		// 1. To get "Let's have some different text!" (The Slotted Element)
		// This is NOT inside the shadow root. It's a child of the host in the regular
		// DOM.
		System.out.println(driver.findElement(By.xpath("//my-paragraph/span")).getText());
		WebElement slottedSpan = driver.findElement(By.cssSelector("my-paragraph > span"));
		System.out.println("Slotted Text: " + slottedSpan.getText());

		WebElement shadowHost = driver.findElement(By.cssSelector("my-paragraph"));
		SearchContext shadowRoot = shadowHost.getShadowRoot();
		Thread.sleep(2000);
		WebElement shadowElement = shadowRoot.findElement(By.cssSelector("span[slot='my-text']"));
		System.out.println(shadowElement.getText());

	}

}
