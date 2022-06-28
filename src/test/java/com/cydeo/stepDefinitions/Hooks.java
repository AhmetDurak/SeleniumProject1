package com.cydeo.stepDefinitions;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.cydeo.Utilities.*;

// In the class we will be able to pass pre- & post- conditions to
// each scenario and each step

public class Hooks {
    Actions actions;
    WebDriverWait wait;
    @Before
    public void setUp(){
        Driver.get();
        actions = new Actions(Driver.get());
        wait = new WebDriverWait(Driver.get(), 10);
    }

    @After
    public void tearDown(){
        //Driver.closeDriver();
    }
}
