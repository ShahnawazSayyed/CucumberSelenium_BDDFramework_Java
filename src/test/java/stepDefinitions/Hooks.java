package stepDefinitions;

import cucumber.TestContext;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


public class Hooks {

    TestContext testContext;

    public Hooks(TestContext context) {

        testContext = context;
    }

    @Before
    public void setUp() {
		/*What all you can perform here
			Starting a webdriver
			Setting up DB connections
			Setting up test data
			Setting up browser cookies
			Navigating to certain page
			or anything before the test
		*/
        System.out.println("Setup Step");
    }

    @After
    public void tearDown() {

        testContext.getWebDriverManager().closeDriver();
        System.out.println("Web Browser closed");
    }

    //Enable below tag if screenshot need to be captured for all steps
    //@AfterStep
    public void addStepScreenshot(Scenario scenario){

        final byte[] screenshot = ((TakesScreenshot) testContext.getWebDriverManager().getDriver()).getScreenshotAs(OutputType.BYTES);
        scenario.attach(screenshot, "image/png", "image");

    }

    //Enable below tag if screenshot need to be captured for failed steps
    @AfterStep
    public void addFailScreenshot(Scenario scenario){

        final byte[] screenshot = ((TakesScreenshot) testContext.getWebDriverManager().getDriver()).getScreenshotAs(OutputType.BYTES);
        scenario.attach(screenshot, "image/png", "image");

    }

}