package stepDefinitions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Steps {
    WebDriver driver;

    @Given("user launches HakerRank")
    public void userIsOnLoggedinToHakerRank() {
        System.setProperty("webdriver.chrome.driver","src\\main\\resources\\webDrivers\\chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.hackerrank.com/");
    }

    @And("user {string} is logged in using password {string}")
    public void userIsLoggedInUsingPassword(String userID, String passWord) {
        driver.findElement(By.xpath("//*[@id=\'menu-item-2887\']/a")).click();
        driver.findElement(By.xpath("//*[@id='post-175']/div/div/div[1]/div/div/div[2]/div[2]/div/div[4]/div/div/a/span")).click();

        driver.findElement(By.id("tab-1-item-1")).click();

        driver.findElement(By.id("input-1")).sendKeys(userID);
        driver.findElement(By.id("input-2")).sendKeys(passWord);
        driver.findElement(By.xpath("//*[@id=\'tab-1-content-1\']/div[1]/form/div[4]/button/div/span")).click();
    }


    @Then("verify user is logged in successfully")
    public void verifyUserIsLoggedInSuccessfully() {
        String usr = driver.findElement(By.xpath("//*[@id='content']/div/div/div/div/div[1]/nav/div/div[2]/ul[2]/li[3]/div/div/span")).getText();
        if(usr.equalsIgnoreCase(userID)){
            System.out.println("User is logged in sucessfully");
        }

        String tabName = driver.findElement(By.xpath("//*[@id=\'content\']/div/div/div/div/div[1]/nav/div/div[1]/ul/li[3]/a/span).get")).getText();

    }
}