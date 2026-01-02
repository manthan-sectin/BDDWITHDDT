package SeleniumPrograms;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLinsAmazon {

	public static void main(String[] args) {

WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
driver.get("https://the-internet.herokuapp.com/");
driver.manage().window().maximize();

List<WebElement> links=driver.findElements(By.tagName("a"));

for(WebElement link:links) {
	String url=link.getAttribute("href");
	if(url==null || url.isEmpty()) {
		continue;
	}
	
	try {
		URL linkURL=new URL(url);
		HttpURLConnection connection=(HttpURLConnection) linkURL.openConnection();
		connection.connect();
		int resposnecode=connection.getResponseCode();
		
		if(resposnecode>=400) {
			System.out.println(url + "Broken link is" +resposnecode);
		}
		else {
			System.out.println(url + "Valid link is" +resposnecode);
		}
		
		
	}
	catch(Exception e){
		System.out.println(url + "Exception occured");
	}
}
driver.quit();


		
		
		
		
		
		
		
		// TODO Auto-generated method stub

		
	}

}
