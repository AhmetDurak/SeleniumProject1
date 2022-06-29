package com.cydeo.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.cydeo.Utilities.*;

public abstract class PageBase {
    public PageBase(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy (xpath = "(//button)[4]")
    public WebElement consentGoogle;

    @FindBy (css = "input[title]")
    public WebElement searchBox;
}
