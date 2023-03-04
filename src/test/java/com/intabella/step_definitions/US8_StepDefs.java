package com.intabella.step_definitions;

import com.intabella.pages.CalendarEventsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US8_StepDefs {

    CalendarEventsPage calendarEventsPage = new CalendarEventsPage();

    @And("the user click on Create Calendar Event button")
    public void theUserClickOnCreateCalendarEventButton() {
        calendarEventsPage.waitUntilLoaderScreenDisappear();
        calendarEventsPage.createCalendarEventButton.click();

    }

    @Then("the repeat number is {string}")
    public void theRepeatNumberIs(String expectedRepeatNumber) {

        Assert.assertEquals(expectedRepeatNumber, calendarEventsPage.repeatEveryInputBox.getAttribute("value"));


    }

    @And("the user click on repeat check box")
    public void theUserClickOnRepeatCheckBox() {
        calendarEventsPage.waitUntilLoaderScreenDisappear();
        calendarEventsPage.repeatCheckBox.click();
    }

    @When("the calendar event repaet field is cleared")
    public void theCalendarEventRepaetFieldIsCleared() {
        calendarEventsPage.repeatEveryInputBox.clear();

    }

    @Then("the user should see {string} warning")
    public void theUserShouldSeeWarning(String expectedWarningMessage) {

        String actualWarning = calendarEventsPage.warningMessage.getText();
        Assert.assertEquals(expectedWarningMessage, actualWarning);

    }
}
