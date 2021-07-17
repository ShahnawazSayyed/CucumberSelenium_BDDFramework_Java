package stepDefinitions;

import java.util.concurrent.TimeUnit;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import managers.FileReaderManager;
import managers.PageObjectManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjects.CommonFeatures;
import pageObjects.HomePage;
import dataProviders.ConfigFileReader;


public class Steps {

    ConfigFileReader properties;
    WebDriver driver;
    PageObjectManager objectManager;
    HomePage homePage;
    CommonFeatures common;

    @Given("launch chrome browser")
    public void launchChromeBrowser() {

        properties = new ConfigFileReader();
        System.setProperty("webdriver.chrome.driver",FileReaderManager.getInstance().getConfigReader().getDriverPath());
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(FileReaderManager.getInstance().getConfigReader().getImplicitlyWait(), TimeUnit.SECONDS);

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