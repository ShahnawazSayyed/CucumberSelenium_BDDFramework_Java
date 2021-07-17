package pageObjects;

import dataProvider.ConfigFileReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    WebDriver driver;
    ConfigFileReader configFileReader;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        configFileReader = new ConfigFileReader();
    }

    public void navigateTo_HomePage(String url) {

        driver.get(url);
    }

    public void close_launchAlert(){
        WebElement launchPopup = driver.findElement(By.id("at-cv-lightbox-close"));
        if (launchPopup.isEnabled()){
            driver.findElement(By.id("at-cv-lightbox-close")).click();
        }

    }
}
