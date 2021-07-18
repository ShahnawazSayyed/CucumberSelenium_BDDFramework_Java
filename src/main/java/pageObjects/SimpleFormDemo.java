package pageObjects;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.lang.reflect.Type;

public class SimpleFormDemo {

    WebDriver driver;

    public SimpleFormDemo(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickOnFormButton(){

        driver.findElement(By.xpath("//*[@id='basic']/div/a[1]")).click();
    }

    public void verifyHeader(String text){
        String t = driver.findElement(By.xpath("//*[@id='easycont']/div/div[2]/h3")).getText();
        if (t.equalsIgnoreCase(text)){
            System.out.println("User is on Simple Form page");
        }
        else{
            System.out.println("Simple form page not loaded or header missing");
        }
    }

    public void verifySingleInputFieldDisplayed(){

        String t = driver.findElement(By.xpath("//*[@id='easycont']/div/div[2]/div[1]/div[1]")).getText();

        if (t.equalsIgnoreCase("Single Input Field")){
            System.out.println("Single Input Field section is displayed");
        }
        else{
            System.out.println("Single Input Field section is displayed");
        }
    }

    public void enterMessageInTextbox(String text){

        driver.findElement(By.id("user-message")).sendKeys(text);
    }

    public void showMessage(){

        driver.findElement(By.xpath("//*[@id='get-input']/button")).click();
    }

    public void verifyMessage(String msg){

        String t = driver.findElement(By.id("display")).getText();
        if (t.equalsIgnoreCase(msg)){
            System.out.println("The message: " + t + " is displayed successfully");
        }
    }

    public void verifyTwoInputFieldDisplayed(){

        String t = driver.findElement(By.xpath("//*[@id='easycont']/div/div[2]/div[2]/div[1]")).getText();
        if(t.equalsIgnoreCase("Two Input Fields")){
            System.out.println("Two Input Field section is displayed");
        }
        else{
            System.out.println("Two Input Field section is displayed");
        }
    }

    public void enterNumberInTextbox(String n, String fn){

        if(fn.equalsIgnoreCase("Enter a")){

            driver.findElement(By.id("sum1")).sendKeys(n);

        }
        else if(fn.equalsIgnoreCase("Enter b")){

            driver.findElement(By.id("sum2")).sendKeys(n);

        }
    }

    public void getTotal(){

        driver.findElement(By.xpath("//*[@id='gettotal']/button")).click();
    }

    public void verifyTotal(String num1, String num2){

        double num_a = Double.parseDouble(num1);
        double num_b = Double.parseDouble(num2);
        double total = num_a + num_b;

        String t = driver.findElement(By.id("displayvalue")).getText();

        if (t.equalsIgnoreCase(String.valueOf(total))){
            System.out.println("The Total value: " + t + " is displayed successfully");
        }
    }
}
