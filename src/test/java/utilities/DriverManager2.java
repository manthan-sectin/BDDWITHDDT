package utilities;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class DriverManager2 {

	static WebDriver driver;
	static Capabilities capabilities;

	public static WebDriver setDriver(String browserName) throws MalformedURLException {
		if (browserName.equals("Chrome")) {

			capabilities = new ChromeOptions();
		} else {
			capabilities = new FirefoxOptions();
		}
		                                           //192.168.31.155
		driver = new RemoteWebDriver(new URL("http://192.168.31.155:4444/wd/hub"), capabilities);

		return driver;

	}

	public static WebDriver getDriver() {
		return driver;
	}
	

//	public static void quitDriver() {
	//	driver.close();
	//	}
	
	
}
