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
driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=155259813593&hvpone=&hvptwo=&hvadid=674893540034&hvpos=&hvnetw=g&hvrand=13605198704433241877&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9146330&hvtargid=kwd-64107830&hydadcr=14452_2316413&gad_source=1");
		
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
