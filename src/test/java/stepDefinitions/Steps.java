package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import managers.PageObjectManager;
import managers.WebDriverManager;
import org.openqa.selenium.WebDriver;
import pageObjects.CommonFeatures;
import pageObjects.HomePage;


public class Steps {

    WebDriver driver;
    PageObjectManager objectManager;
    HomePage homePage;
    CommonFeatures common;
    WebDriverManager webDriverManager;

    @Given("launch chrome browser")
    public void launchChromeBrowser() {

        webDriverManager = new WebDriverManager();
        driver = webDriverManager.getDriver();
        objectManager = new PageObjectManager(driver);
        homePage = objectManager.getHomePage();
        common = objectManager.getCommonFeatures();
    }

    @Then("quit browser")
    public void quitBrowser(){
        driver.quit();
    }

    @And("user launches seleniumeasy website")
    public void userLaunchSeleniumEasyWebsite() {
        homePage.navigateTo_HomePage();
        homePage.close_launchAlert();

    }

    @And("verify user is on homepage")
    public void verifyUserIsOnHomepage() {

        //common.assert_title("Selenium Easy - Best Demo website to practice Selenium Webdriver Online");

    }

}