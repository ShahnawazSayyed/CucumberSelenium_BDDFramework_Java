package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:features",
        glue = {"stepDefinitions"},
        plugin = {"pretty","html:test-output/cucumber-reports/cucumber-reports.html",
                "json:test-output/cucumber-reports/Cucumber.json",
                "junit:test-output/cucumber-reports/Cucumber.xml",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        monochrome = true,
        dryRun = false
)

public class TestRunner {

}
