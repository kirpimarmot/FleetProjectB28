package com.intabella.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HowToUserPinbarPage extends BasePage{

    @FindBy(xpath = "//h3[normalize-space()='How To Use Pinbar']")
    public WebElement howToUsePinbarText;

    @FindBy(xpath = "//p[contains(text(),'Use pin icon on the right top corner of page to cr')]")
    public WebElement usePinIconText;


}
