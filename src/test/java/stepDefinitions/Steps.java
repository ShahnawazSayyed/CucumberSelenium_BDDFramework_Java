package stepDefinitions;

import java.util.concurrent.TimeUnit;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import managers.PageObjectManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjects.Common;
import pageObjects.HomePage;


public class Steps {

    WebDriver driver;
    PageObjectManager objectManager;
    HomePage homePage;
    Common common;

    @Given("launch chrome browser")
    public void chromeBrowserLaunched() {
        System.setProperty("webdriver.chrome.driver","src\\main\\resources\\webDrivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        objectManager = new PageObjectManager(driver);
        homePage = objectManager.getHomePage();
        common = objectManager.getCommon();
    }

    @Then("quit browser")
    public void quitBrowser(){
        driver.quit();
    }

    @And("user launches seleniumeasy website")
    public void userLaunchSeleniumEasyWebsite() {
        homePage.navigateTo_HomePage("https://www.seleniumeasy.com/test");
        homePage.close_launchAlert();

    }

    @And("verify user is on homepage")
    public void verifyUserIsOnHomepage() {

        common.assert_title("Selenium Easy - Best Demo website to practice Selenium Webdriver Online");

    }

}