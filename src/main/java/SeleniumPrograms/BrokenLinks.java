package SeleniumPrograms;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/es/open-source");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total links are: " + links.size());

		for (WebElement link : links) {

			String url = link.getAttribute("href");
			System.out.println("All liks are : "+url);
			if  (url == null || url.isEmpty()) {
				System.out.println("Empty url");
				continue;
			}

			try {
				@SuppressWarnings("deprecation")
				HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
				connection.setRequestMethod("HEAD");
				connection.connect();
				int responsecode = connection.getResponseCode();
				if (responsecode >= 400) {
					System.out.println("Broken links: " + url + "--->" + responsecode);
				} else {
					System.out.println("Valid links: " + url + "--->" + responsecode);
				}

			}

			catch (Exception e) {
				System.out.println("Error checking links :" + url);
			}

		}

		driver.quit();

	}

}
