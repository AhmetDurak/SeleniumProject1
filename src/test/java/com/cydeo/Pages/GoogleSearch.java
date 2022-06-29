package com.cydeo.Pages;

import com.cydeo.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleSearch {
    public GoogleSearch(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "(//button)[4]")
    public WebElement consentGoogle;

    @FindBy (css = "input[title]")
    public WebElement searchBox;
}
