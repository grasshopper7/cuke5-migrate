package migrate;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/migrate/datatable.feature")
public class DataTableTest extends AbstractTestNGCucumberTests {
}