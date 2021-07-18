package stepDefinitions;

import cucumber.TestContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import io.cucumber.java.en.When;
import pageObjects.Common;
import pageObjects.HomePage;


public class HomepageSteps {

    HomePage homePage;
    Common common;
    TestContext testContext;

    public HomepageSteps(TestContext context) {
        testContext = context;
        common = testContext.getPageObjectManager().getCommonFeatures();
        homePage = testContext.getPageObjectManager().getHomePage();
    }

    @And("user launches seleniumeasy website")
    public void userLaunchSeleniumEasyWebsite() {
        homePage.navigateTo_HomePage();
        homePage.close_launchAlert();

    }

    @And("verify user is on homepage")
    public void verifyUserIsOnHomepage() {

        common.assert_title("Selenium Easy - Best Demo website to practice Selenium Webdriver Online");

    }

}