package stepDefinitions;

import cucumber.TestContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.Common;
import pageObjects.SimpleFormDemo;

public class SimpleFormDemoSteps {

    SimpleFormDemo form;
    Common common;
    TestContext testContext;

    public SimpleFormDemoSteps(TestContext context) {
        testContext = context;
        common = testContext.getPageObjectManager().getCommonFeatures();
        form = testContext.getPageObjectManager().getFormDemo();
    }

    @When("user click on {string}")
    public void userClickOn(String btnName) {

        form.clickOnFormButton();
    }

    @Then("verify user is on Simple Form Demo section")
    public void verifyUserIsOnSimpleFormDemoSection() {

        form.verifyHeader("This would be your first example to start with Selenium.");
    }

    @Given("Single Input Field section is displayed")
    public void singleInputFieldSectionIsDisplayed() {

        form.verifySingleInputFieldDisplayed();
    }

    @And("enter {string} in Enter Message textbox")
    public void enterInEnterMessageTextbox(String text) {

        form.enterMessageInTextbox(text);
    }

    @When("click on show message")
    public void clickOnShowMessage() {

        form.showMessage();
    }

    @Then("verify {string}")
    public void verifyMessage(String text) {

        form.verifyMessage(text);
    }

    @Given("Two Input Field section is displayed")
    public void twoInputFieldSectionIsDisplayed() {

        form.verifyTwoInputFieldDisplayed();
    }

    @Then("enter {string} in {string} textbox")
    public void enterInTextbox(String num, String field) {

        form.enterNumberInTextbox(num, field);
    }

    @And("click on get total")
    public void clickOnGetTotal() {

        form.getTotal();
    }

    @Then("verify Total {string} + {string}")
    public void verifyTotal(String num1, String num2) {

        form.verifyTotal(num1, num2);
    }
}
