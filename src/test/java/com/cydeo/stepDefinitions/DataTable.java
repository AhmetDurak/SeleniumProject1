package com.cydeo.stepDefinitions;


import com.cydeo.Pages.DataTableDropDown;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


import java.util.ArrayList;
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
    public void userShouldSeeBelowInfoInMonthDropdown(List<String> monthsFromFeature) {
        DataTableDropDown dropdown = new DataTableDropDown();

        //List of all ACTUAL month <options> as a web element
        Select select = new Select(dropdown.month);
        List<WebElement> actualOptions = select.getOptions();

        //List of all ACTUAL month <options> as a String
        List<String> actualOptionsAsString = new ArrayList<>();

        for (WebElement each: actualOptions){
            actualOptionsAsString.add(each.getText());
        }

        // Assert will check the size of the lists first. If it is matching it will check content 1 by 1.
        Assert.assertEquals(monthsFromFeature,actualOptionsAsString);
    }

}
