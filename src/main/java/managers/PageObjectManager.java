package managers;

import org.openqa.selenium.WebDriver;
import pageObjects.Common;
import pageObjects.HomePage;
import pageObjects.SimpleFormDemo;

public class PageObjectManager {

    private WebDriver driver;
    private Common common;
    private HomePage homePage;
    private SimpleFormDemo form;

    public PageObjectManager(WebDriver driver){
        this.driver = driver;
    }

    public Common getCommonFeatures(){
        return (common == null) ? common = new Common(driver) : common;
    }

    public HomePage getHomePage(){
        return (homePage == null) ? homePage = new HomePage(driver) : homePage;
    }

    public SimpleFormDemo getFormDemo(){
        return (form == null) ? form = new SimpleFormDemo(driver) : form;
    }
}
