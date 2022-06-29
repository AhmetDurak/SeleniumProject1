package com.cydeo.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.cydeo.Utilities.*;

public class Wikipedia {
    public Wikipedia(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy (name = "search")
    public WebElement searchBox;

    @FindBy(id = "firstHeading")
    public WebElement mainHeader;

}
