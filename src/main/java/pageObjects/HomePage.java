package pageObjects;

import managers.FileReaderManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void navigateTo_HomePage() {

        driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl());
    }

    public void close_launchAlert() {
        WebElement launchPopup = driver.findElement(By.id("at-cv-lightbox-close"));
        if (launchPopup.isEnabled()) {
            driver.findElement(By.id("at-cv-lightbox-close")).click();
        }
    }
}
