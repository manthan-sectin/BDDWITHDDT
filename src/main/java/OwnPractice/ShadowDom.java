package OwnPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ShadowDom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
driver.get("https://letcode.in/shadow/");
driver.manage().window().maximize();

// Step 1: Locate shadow host
WebElement shadowHost = driver.findElement(By.id("open-shadow"));

// Step 2: Enter into shadow root
WebElement shadowRoot = shadowHost.getShadowRoot()
        .findElement(By.cssSelector("#fname"));

// Step 3: Send text inside the shadow DOM element
shadowRoot.sendKeys("Manthan");

// For input fields → getAttribute("value") not getText()
System.out.println(shadowRoot.getAttribute("value"));

driver.quit();
	}

}
