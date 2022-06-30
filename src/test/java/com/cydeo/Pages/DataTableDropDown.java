package com.cydeo.Pages;

import com.cydeo.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DataTableDropDown {
    public DataTableDropDown(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(id = "month")
    public WebElement month;
}
