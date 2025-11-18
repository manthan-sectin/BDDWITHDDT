package javaProgramiz;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SumOfNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.india.com/");
		driver.manage().window().maximize();
		
		List <WebElement> links=driver.findElements(By.linkText("a"));
		for(int i=0;i<links.size();i++) {
			String text=links.get(i).getText();
			System.out.println(text);
		}
		
	}

}
