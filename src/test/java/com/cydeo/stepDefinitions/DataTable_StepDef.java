package com.cydeo.stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

public class DataTable_StepDef {

    @Then("user should see fruits I like")
    public void user_should_see_fruits_i_like(List<String> fruits) {
        System.out.println(fruits);
    }

    @Given("I have the following books in the store by list")
    public void iHaveTheFollowingBooksInTheStoreByList(Map<String, String> table) {
        for (String each: table.keySet()){
            System.out.println(each + " - " + table.get(each));
        }
    }

    @When("I search for books by author Erik Larson")
    public void iSearchForBooksByAuthorErikLarson() {
        System.out.println("");
    }

    @Then("I find {int} books")
    public void iFindBooks(int arg0) {
        System.out.println();
    }
}
