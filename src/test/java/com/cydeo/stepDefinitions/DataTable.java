package com.cydeo.stepDefinitions;


import com.cydeo.Utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;


import java.util.List;
import java.util.Map;

public class DataTable {

    @Then("user should see fruits I like")
    public void user_should_see_fruits_i_like(Map<String, Integer> fruits) {
        for (String each: fruits.keySet()){
            System.out.println(each + " - " + fruits.get(each));
        }
    }

    @Given("User is on the dropdowns page of practice tool")
    public void userIsOnTheDropdownsPageOfPracticeTool() {
       // Assert.assertTrue(Driver.get().getTitle().contains("dropdown"));
    }

    @Then("User should see below info in month dropdown")
    public void userShouldSeeBelowInfoInMonthDropdown(List<String> months) {
        System.out.println(months);
    }

}
