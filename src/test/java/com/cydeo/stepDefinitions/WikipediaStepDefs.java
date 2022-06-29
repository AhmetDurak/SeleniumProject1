package com.cydeo.stepDefinitions;

import com.cydeo.Pages.Wikipedia;
import com.cydeo.Utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class WikipediaStepDefs {
    Wikipedia wikipedia = new Wikipedia();

    @When("user is on Wikipedia search page")
    public void user_is_on_wikipedia_search_page() {
    }
    @Then("user types {string} in the wikipedia search box and clicks enter")
    public void user_types_in_the_wikipedia_search_box_and_clicks_enter(String string) throws InterruptedException {
        wikipedia.searchBox.sendKeys(string);
        wikipedia.searchBtn.click();


    }
}
