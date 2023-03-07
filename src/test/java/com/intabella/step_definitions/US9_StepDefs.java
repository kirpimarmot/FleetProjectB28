package com.intabella.step_definitions;

import com.intabella.pages.CalendarEventsPage;
import com.intabella.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;

public class US9_StepDefs {

    @Then("the user enter {string} to repeat checkbox")
    public void theUserEnterToRepaetCheckbox(String num) {
        new CalendarEventsPage().repeatEveryInputBox.sendKeys(num);
        BrowserUtils.waitFor(5);
    }
}
