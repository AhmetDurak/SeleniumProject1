package com.cydeo.stepDefinitions;

import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.cydeo.Utilities.*;

import java.util.concurrent.TimeUnit;

// In the class we will be able to pass pre- & post- conditions to
// each scenario and each step

public class Hooks {
    Actions actions;
    WebDriverWait wait;

    // It is important to be sure that @Before is imported from io.cucumber.java.Before
    @Before (value = "@Login",order = 0)// 0 runs before everything
    public void setUp(){
        System.out.println("This is first setup");
        Driver.get().get(ConfigurationReader.get("url"));
        actions = new Actions(Driver.get());
        wait = new WebDriverWait(Driver.get(), 10);
    }
    // We can also create setup for each specific tag
    @Before (value = "@wip2", order = 1)
    public void setUpDataTable(){
        System.out.println("------------>>> Setup");
    }

    @Before (value = "@google", order = 2)
    public void setUpGoogleTest(){
        System.out.println("This runs only for Google testing");
        Driver.get().get(ConfigurationReader.get("google"));
        actions = new Actions(Driver.get());
        wait = new WebDriverWait(Driver.get(), 10);
    }

    @Before (value = "@wikipedia", order = 2)
    public void setUpWikipedia(){
        System.out.println("This runs only for Wikipedia testing");
        Driver.get().get(ConfigurationReader.get("wikipedia"));
        Driver.get().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @Before (value = "@LoginScenario")
    public void setUpLoginScenario(){
        Driver.get().get(ConfigurationReader.get("LoginScenario"));
        Driver.get().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @Before (value = "@DataTableTask")
    public void setUpDataTableTask(){
        Driver.get().get(ConfigurationReader.get("DataTableTask"));
        Driver.get().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @After (value = "@wikipedia")
    public void tearDown(Scenario scenario){

        if (scenario.isFailed()){
            // The screenshot will be attached in to my report
            byte [] screenshot = ((TakesScreenshot) Driver.get()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());
        }


        Driver.closeDriver();
    }

    // it will be executed before each feature line
    //@BeforeStep
    //public void setUpStep(){
    //    System.out.println("------->Runs before every step");
    //}

    //@AfterStep
    //public void  afterStep(){
    //    System.out.println("-------->Runs after every step");
    //}
}
