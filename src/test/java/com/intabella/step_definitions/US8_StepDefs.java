package com.intabella.step_definitions;

import com.intabella.pages.CalendarEventsPage;
import com.intabella.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class US8_StepDefs {

    CalendarEventsPage calendarEventsPage = new CalendarEventsPage();

    @And("the user click on Create Calendar Event button")
    public void theUserClickOnCreateCalendarEventButton() {
        BrowserUtils.waitFor(5);

        calendarEventsPage.createCalendarEventButton.click();

    }

    @Then("the repeat number is {string}")
    public void theRepeatNumberIs(String expectedRepeatNumber) {
        BrowserUtils.waitFor(5);
        calendarEventsPage.repeatCheckBox.click();
        Assert.assertEquals(expectedRepeatNumber, calendarEventsPage.repeatEveryInputBox.getAttribute("value"));


    }
}
