package migrate;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/migrate/docstring.feature")
public class DocStringTest extends AbstractTestNGCucumberTests {
}