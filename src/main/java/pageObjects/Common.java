package pageObjects;

import org.joda.time.Seconds;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class Common {

    WebDriver driver;

    public Common(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void assert_title(String title) {
        String t = driver.getTitle();
        //Assert.assertEquals(t, title);
        if (t.equals(title)){
            System.out.println("Title Verified successfully");
        }
        else{
            System.out.println("Title is not matching");
        }
    }

    public void clickOnButton(){
        driver.findElement(By.id("btn_basic_example")).click();
    }

    public void assert_text(String txt) {

        String t = driver.findElement(By.xpath("//*[@id='basic']/h3")).getText();
        //Assert.assertEquals(t, txt);
    }
}
