package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import cucumber.TestContext;
import org.openqa.selenium.WebDriver;
import pageObjects.Common;

public class CommonSteps {

    Common common;
    TestContext testContext;
    WebDriver driver;

    public CommonSteps(TestContext context) {
        testContext = context;
        common = testContext.getPageObjectManager().getCommonFeatures();
    }

    @Given("launch browser")
    public void launchBrowser() {

        driver = testContext.getWebDriverManager().getDriver();
    }

    @Then("quit browser")
    public void quitBrowser(){

        driver.quit();
    }

    @When("user click on {string} button")
    public void userClickOnButton(String btnName) {

        common.clickOnButton();
    }

    @Then("verify basic examples displayed on homepage")
    public void verifyBasicExamplesDisplayedOnHomepage() {

        common.assert_text("BASIC EXAMPLES TO START WITH SELENIUM");
    }
}
