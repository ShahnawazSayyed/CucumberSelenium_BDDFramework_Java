package stepDefinitions;

import java.util.concurrent.TimeUnit;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjects.Common;
import pageObjects.Homepage;


public class Steps {

    WebDriver driver;
    Homepage home;
    Common common;

    @Given("chrome browser launched")
    public void chromeBrowserLaunched() {
        System.setProperty("webdriver.chrome.driver","src\\main\\resources\\webDrivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Then("quit browser")
    public void quitBrowser(){
        driver.quit();
    }

    @And("user launches seleniumeasy website")
    public void userLaunchSeleniumEasyWebsite() {
        home = new Homepage(driver);
        home.navigateTo_HomePage("https://www.seleniumeasy.com/test");
        home.close_launchAlert();

    }

    @And("verify user is on homepage")
    public void verifyUserIsOnHomepage() {
        common = new Common(driver);
        common.assert_title("Selenium Easy - Best Demo website to practice Selenium Webdriver Online");

    }

}