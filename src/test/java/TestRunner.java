import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

        features = "src/test/resources/features",
        glue = {"Hooks, stepDefinitions"},
        monochrome = true,
        tags = "@test",
        dryRun = false)


public class TestRunner extends AbstractTestNGCucumberTests {
}
