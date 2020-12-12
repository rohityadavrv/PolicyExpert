package com.stepDefinitions;

import cucumber.api.java.en.*;
import org.openqa.selenium.WebDriver;
import com.actions.Actions;

public class DetailsPolicyExpert {

    public WebDriver driver;

    Actions actions;


    public DetailsPolicyExpert() {
        this.driver = Hooks.driver;
        actions = new Actions(driver);
    }

    @Given("^user is on the Details Policy Expert Page$")
    public void userIsOnTheDetailsPolicyExpertPage() {
        actions.openDetailsPolicyExpertPage();
    }

    @When("^user selects \"([^\"]*)\" from dropdown$")
    public void userSelectsFromDropdown(String option) throws Throwable {
        actions.selectFromDropdown(option);
    }

    @And("^user enters \"([^\"]*)\"$")
    public void userEnters(String text) throws Throwable {

    }

    @And("^user enters \"([^\"]*)\" in \"([^\"]*)\"$")
    public void userEntersIn(String text, String field) throws Throwable {
        actions.enterText(text, field);
    }

    @And("^user clicks on \"([^\"]*)\" of \"([^\"]*)\" button$")
    public void userClicksOnOfButton(String button, String type) throws Throwable {
        actions.click(button,type);
    }

}
