package managers;

import org.openqa.selenium.WebDriver;
import pageObjects.Common;
import pageObjects.HomePage;

public class PageObjectManager {

    private WebDriver driver;
    private HomePage homePage;
    private Common common;

    public PageObjectManager(WebDriver driver){
        this.driver = driver;
    }

    public Common getCommon(){
        return (common == null) ? common = new Common(driver) : common;
    }

    public HomePage getHomePage(){
        return (homePage == null) ? homePage = new HomePage(driver) : homePage;
    }
}
