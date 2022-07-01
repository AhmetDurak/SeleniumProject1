package com.cydeo.stepDefinitions;

import com.cydeo.Utilities.ConfigurationReader;
import com.cydeo.Utilities.Driver;
import com.cydeo.Pages.LoginScenarioPages;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

import java.util.Map;

public class LoginScenario {
    LoginScenarioPages login;

    @Given("User is on the login page of Web table app")
    public void user_is_on_the_login_page_of_web_table_app() {
        String expected = "Cydeo Web Table App";
        Assert.assertEquals(expected, Driver.get().getTitle());
    }
    @When("User enters below credentials")
    public void user_enters_below_credentials(Map<String,String> credentials) {
        login = new LoginScenarioPages();
        login.username.sendKeys(credentials.get("username"));
        login.password.sendKeys(credentials.get("password"));
        login.login.click();

    }
    @Then("User should see url contains orders")
    public void user_should_see_url_contains_orders() {
        Assert.assertTrue(Driver.get().getCurrentUrl().contains("order"));
    }

//----------------------------------------------------------------------------------
    //Second Scenario
    @Given("user is already logged in to web table app")
    public void user_is_already_logged_in_to_web_table_app() {
        Driver.get().get(ConfigurationReader.get("LoginScenario"));
        login = new LoginScenarioPages();

        login.loginWithConfig();
    }
    @When("user is on the “Order” page")
    public void user_is_on_the_order_page() {
        login = new LoginScenarioPages();
        login.orderPage.click();
    }
    @Then("user enters appropriate test data: {string},{string},{string},{string},{string},{string},{string},{string},{string},{string}")
    public void user_enters_appropriate_test_data(String product, String quantity, String customerName, String street, String city, String state, String zip, String cardType, String cardNo, String expiryDate) {
        login = new LoginScenarioPages();
        Select select = new Select(login.product);
        select.selectByVisibleText(product);
        login.quantity.sendKeys(quantity);
        login.customerName.sendKeys(customerName);
        login.street.sendKeys(street);
        login.city.sendKeys(city);
        login.state.sendKeys(state);
        login.zip.sendKeys(zip);
        login.selectCardType(cardType);
        login.cardNo.sendKeys(cardNo);
        login.expiryDate.sendKeys(expiryDate);
    }
    @Then("user clicks to Process Order")
    public void user_clicks_to_process_order() {
        login = new LoginScenarioPages();
        login.submit.click();
    }
    @Then("user should see new order in the table on View all orders page {string}")
    public void user_should_see_new_order_in_the_table_on_view_all_orders_page(String customerName) {
        login = new LoginScenarioPages();
        login.viewAllOrders.click();
        Assert.assertTrue(login.isNameOnList(customerName));
    }
}
