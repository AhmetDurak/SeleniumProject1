package com.cydeo.stepDefinitions;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.cydeo.Utilities.*;

public class Hook {
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
