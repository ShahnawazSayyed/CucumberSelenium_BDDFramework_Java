package stepDefinitions;

import cucumber.TestContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

import pageObjects.Common;
import pageObjects.HomePage;


public class HomePageSteps {

    HomePage homePage;
    Common common;
    TestContext testContext;

    public HomePageSteps(TestContext context) {
        testContext = context;
        common = testContext.getPageObjectManager().getCommonFeatures();
        homePage = testContext.getPageObjectManager().getHomePage();
    }

    @Given("user launches seleniumeasy website")
    public void userLaunchSeleniumEasyWebsite() {
        homePage.navigateTo_HomePage();
        homePage.close_launchAlert();
        System.out.println("Homepage Loaded successfully");

    }

    @And("verify user is on homepage")
    public void verifyUserIsOnHomepage() {

        common.assert_title("Selenium Easy - Best Demo website to practice Selenium Webdriver Online");

    }

}