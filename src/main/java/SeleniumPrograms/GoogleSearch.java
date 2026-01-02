package SeleniumPrograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearch {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		
		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("selenium");
		Thread.sleep(2000);
		List<WebElement> list=driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::span[text()='selenium']"));
		Thread.sleep(2000);
		System.out.println("Total number of suggestions in list boc:::====>" +list.size());
		Thread.sleep(2000);
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i).getText());
			if(list.get(i).getText().contains(" interview questions")) {
				list.get(i).click();
				break;
			}
		}
	}

}
