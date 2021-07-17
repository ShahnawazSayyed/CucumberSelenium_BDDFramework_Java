package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.junit.Assert;

import java.util.concurrent.TimeUnit;

public class Common {

    WebDriver driver;

    public Common(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    public void assert_title(String title) {
        String t = driver.getTitle();
        Assert.assertEquals(t, title);
    }
}
