package com.cydeo.stepDefinitions;

import com.cydeo.Pages.GoogleSearch;
import com.cydeo.Utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class googleLoginSteps {
    GoogleSearch google = new GoogleSearch();

    @When("user is on Google search page")
    public void user_is_on_google_search_page() {
        Assert.assertEquals(Driver.get().getTitle(), "Google");
    }
    @Then("user should see title is Google")
    public void user_should_see_title_is_google() {
        System.out.println("User should see title is google");
        //throw new io.cucumber.java.PendingException();
    }

    @Then("user types {string} in the google search box and clicks enter")
    public void userTypesAppleInTheGoogleSearchBoxAndClicksEnter() {
        google.consentGoogle.click();
        google.searchBox.sendKeys("Steve Jobs" + Keys.ENTER);
    }

    @Then("user should see title is {string}")
    public void userShouldSeeTitleIsSteveJobs() {

        //Junit assertion accepts first message then second arg as expected, third arg as actual
        Assert.assertEquals(Driver.get().getTitle(), "Steve Jobs - Google Suche");
    }


}
