package com.cydeo.Pages;

import org.openqa.selenium.support.PageFactory;
import com.cydeo.Utilities.*;

public abstract class PageBase {
    public PageBase(){
        PageFactory.initElements(Driver.get(), this);
    }

}
