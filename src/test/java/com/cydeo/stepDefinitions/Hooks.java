package com.cydeo.stepDefinitions;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.cydeo.Utilities.*;

// In the class we will be able to pass pre- & post- conditions to
// each scenario and each step

public class Hooks {
    Actions actions;
    WebDriverWait wait;

    // It is important to be sure that @Before is imported from io.cucumber.java.Before
    @Before
    public void setUp(){
        Driver.get().get(ConfigurationReader.get("url"));
        actions = new Actions(Driver.get());
        wait = new WebDriverWait(Driver.get(), 10);
    }

    @After
    public void tearDown(){
        //Driver.closeDriver();
    }
}
