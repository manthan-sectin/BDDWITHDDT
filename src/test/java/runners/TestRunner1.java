package runners;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    features = "src/test/resources/features",
    glue = {"stepdefinitions"},
    plugin = {"pretty",
              "json:target/cucumber.json"
              }
)
public class TestRunner1 extends AbstractTestNGCucumberTests {
}
