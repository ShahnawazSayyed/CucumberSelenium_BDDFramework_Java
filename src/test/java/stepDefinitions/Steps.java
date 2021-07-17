package stepDefinitions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Steps {

    WebDriver driver;

    @Given("user launches seleniumeasy website")
    public void userLaunchSeleniumEasyWebsite() {
        System.setProperty("webdriver.chrome.driver","src\\main\\resources\\webDrivers\\chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.seleniumeasy.com/test");
        boolean p = driver.findElement(By.id("at-cv-lightbox-close")).isDisplayed();
        if (p){
            driver.findElement(By.id("at-cv-lightbox-close")).click();
        }

    }

    @And("verify user is on homepage")
    public void verifyUserIsOnHomepage() {
        String title = "Selenium Easy - Best Demo website to practice Selenium Webdriver Online";
        String t = driver.getTitle();
        Assert.assertEquals(t, title);
    }
}