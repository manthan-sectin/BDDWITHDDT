package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.ConfigReader;
import utilities.DriverManager;

public class Hooks {

	@Before(order = 0)
	public void setUp() {
		ConfigReader configReader = new ConfigReader();
		DriverManager.setDriver(configReader.getBrowser());
	}

	@After(order = 0)
	public void tearDown() {
		DriverManager.quitDriver();
	}

	@After(order = 1)
	public void takeScreenshotOnFailure(Scenario scenario) {
		if (scenario.isFailed()) {
			TakesScreenshot ts = (TakesScreenshot) DriverManager.getDriver();
			byte[] screenshot = ts.getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshot, "image/png", scenario.getName());
		}
	}
}