package com.intabella.step_definitions;

import com.intabella.pages.CalendarEventsPage;
import com.intabella.utilities.BrowserUtils;
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

    @When("the calendar event repeat field is cleared")
    public void theCalendarEventRepeatFieldIsCleared() {
        calendarEventsPage.repeatEveryInputBox.clear();

    }

    @Then("the user should see {string} warning")
    public void theUserShouldSeeWarning(String expectedWarningMessage) {
        BrowserUtils.sleep(2);

        String actualWarning = calendarEventsPage.warningMessage.getText();
        Assert.assertEquals(expectedWarningMessage, actualWarning);

    }
}
