package com.intabella.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CalendarEventsPage extends BasePage{

    @FindBy(xpath = "//a[normalize-space()='Create Calendar event']")
    public WebElement createCalendarEventButton;

    @FindBy(xpath = "//input[starts-with(@id,\"recurrence-repeat\")]")
    public WebElement repeatCheckBox;

    @FindBy(xpath = "(//input[@value='1'])[2]")
    public WebElement repeatEveryInputBox;



}
