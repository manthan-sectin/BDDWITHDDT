package SeleniumPrograms;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLinks2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.deepseek.com/en");
		driver.manage().window().maximize();

		// Capture all links
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total links found: " + links.size());

		for (WebElement link : links) {
			String url = link.getAttribute("href");

			// Check for null or empty URLs
			if (url == null || url.isEmpty()) {
				System.out.println("Skipping empty or null URL");
				continue;
			}

			// Only check HTTP/HTTPS links
			if (!url.startsWith("http")) {
				System.out.println("Skipping non-http link: " + url);
				continue;
			}

			try {
				HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
				connection.setRequestMethod("HEAD");
				connection.connect();

				int responseCode = connection.getResponseCode();

				if (responseCode >= 400) {
					System.out.println("❌ Broken link: " + url + " ---> " + responseCode);
				} else {
					System.out.println("✅ Valid link: " + url + " ---> " + responseCode);
				}

				connection.disconnect();

			} catch (Exception e) {
				System.out.println("⚠️ Error checking link: " + url + " | Exception: " + e.getMessage());
			}
		}

		driver.quit();
	}

}
