package com.cydeo.Pages;

import com.cydeo.Utilities.ConfigurationReader;
import com.cydeo.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginScenario {
    public LoginScenario(){
        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy (css = "input[name='username']")
    public WebElement username;

    @FindBy (css = "input[name='password']")
    public WebElement password;

    @FindBy (tagName = "button")
    public WebElement login;

    @FindBy (xpath = "//button[.='Order']")
    public WebElement orderPage;


    /**
     * No parameters.
     * When we call this method, it will directly log in using
     *
     * Username: Test
     * Password: Tester
     */
    public void login(){
        this.username.sendKeys("Test");
        this.password.sendKeys("Tester");
        this.login.click();
    }

    /**
     * This method will accept two arguments and log in.
     *
     * @param username
     * @param password
     */
    public void login(String username, String password){
        this.username.sendKeys(username);
        this.password.sendKeys(password);
        this.login.click();
    }

    /**
     * This method will log in using credentials from
     * configuration.properties
     */
    public void loginWithConfig(){
        this.username.sendKeys(ConfigurationReader.get("web.table.username"));
        this.password.sendKeys(ConfigurationReader.get("web.table.password"));
        this.login.click();
    }
}
