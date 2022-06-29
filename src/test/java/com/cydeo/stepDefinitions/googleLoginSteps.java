package com.cydeo.stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class googleLoginSteps {
    @When("user is on Google search page")
    public void user_is_on_google_search_page() {
        System.out.println("User is on google search page");
        //throw new io.cucumber.java.PendingException();
    }
    @Then("user should see title is Google")
    public void user_should_see_title_is_google() {
        System.out.println("User should see title is google");
        //throw new io.cucumber.java.PendingException();
    }

    @Then("user types apple in the google search box and clicks enter")
    public void userTypesAppleInTheGoogleSearchBoxAndClicksEnter() {
    }

    @Then("user should see title is Steve Jobs")
    public void userShouldSeeTitleIsSteveJobs() {
    }


}
