package managers;

import org.openqa.selenium.WebDriver;
import pageObjects.HomePage;
import pageObjects.CommonFeatures;

public class PageObjectManager {

    private WebDriver driver;
    private HomePage homePage;
    private CommonFeatures common;

    public PageObjectManager(WebDriver driver){
        this.driver = driver;
    }

    public CommonFeatures getCommonFeatures(){
        return (common == null) ? common = new CommonFeatures(driver) : common;
    }

    public HomePage getHomePage(){
        return (homePage == null) ? homePage = new HomePage(driver) : homePage;
    }
}
