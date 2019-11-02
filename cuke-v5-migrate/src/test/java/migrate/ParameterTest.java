package migrate;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/migrate/parameter.feature")
public class ParameterTest extends AbstractTestNGCucumberTests {
}