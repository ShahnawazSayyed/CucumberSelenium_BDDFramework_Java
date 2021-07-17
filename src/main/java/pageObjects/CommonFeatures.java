package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class CommonFeatures {

    WebDriver driver;

    public CommonFeatures(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void assert_title(String title) {
        String t = driver.getTitle();
        Assert.assertEquals(t, title);
    }
}
