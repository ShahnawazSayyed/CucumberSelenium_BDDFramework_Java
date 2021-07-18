package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:features",
        glue = {"stepDefinitions"},
        plugin = {"pretty","html:Reports/cucumber-reports/cucumber-reports.html",
                "json:Reports/cucumber-reports/Cucumber.json",
                "junit:Reports/cucumber-reports/Cucumber.xml",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        monochrome = true,
        dryRun = false
)

public class TestRunner {

}
