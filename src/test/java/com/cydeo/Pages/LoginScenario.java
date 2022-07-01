package com.cydeo.Pages;

import com.cydeo.Utilities.ConfigurationReader;
import com.cydeo.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginScenario {
    public LoginScenario() {
        PageFactory.initElements(Driver.get(), this);
    }
    Actions actions = new Actions(Driver.get());

    @FindBy(css = "input[name='username']")
    public WebElement username;

    @FindBy(css = "input[name='password']")
    public WebElement password;

    @FindBy(tagName = "button")
    public WebElement login;

    @FindBy(xpath = "//button[.='Order']")
    public WebElement orderPage;

    @FindBy(name = "product")
    public WebElement product;

    @FindBy(name = "quantity")
    public WebElement quantity;

    @FindBy(name = "name")
    public WebElement customerName;

    @FindBy(name = "street")
    public WebElement street;

    @FindBy(name = "city")
    public WebElement city;

    @FindBy(name = "state")
    public WebElement state;

    @FindBy(name = "zip")
    public WebElement zip;

    @FindBy(xpath = "(//input[@name='card'])[1]")
    public WebElement visa;

    @FindBy(xpath = "(//input[@name='card'])[2]")
    public WebElement masterCard;

    @FindBy(xpath = "(//input[@name='card'])[3]")
    public WebElement americanExpress;

    @FindBy(css = "button[type='submit']")
    public WebElement submit;

    @FindBy(name = "cardNo")
    public WebElement cardNo;

    @FindBy(name = "cardExp")
    public WebElement expiryDate;


    /**
     * One parameter
     * When this method is called, it will select a card type according to the input
     * @param cardType
     */
    public void selectCardType(String cardType){

        switch (cardType){
            case "Visa":
                actions.click(this.visa).perform();
                break;
            case "MasterCard":
                actions.click(this.masterCard).perform();
                break;
            case "American Express":
                actions.click(this.americanExpress).perform();
                break;
            default:
                System.out.println("Card type doesn't exist!");
        }
    }


    /**
     * No parameters.
     * When we call this method, it will directly log in using
     *
     * Username: Test
     * Password: Tester
     */
    public void login() {
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
    public void login(String username, String password) {
        this.username.sendKeys(username);
        this.password.sendKeys(password);
        this.login.click();
    }

    /**
     * This method will log in using credentials from
     * configuration.properties
     */
    public void loginWithConfig() {
        this.username.sendKeys(ConfigurationReader.get("web.table.username"));
        this.password.sendKeys(ConfigurationReader.get("web.table.password"));
        this.login.click();
    }
}
