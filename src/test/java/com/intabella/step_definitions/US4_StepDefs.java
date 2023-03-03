package com.intabella.step_definitions;

import com.intabella.pages.DashboardPage;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class US4_StepDefs {
    DashboardPage dashboardPage = new DashboardPage();
    @Then("the user should see {string} message")
    public void theUserShouldSeeMessage(String expectedMessage) {
        System.out.println(dashboardPage.errorMessage.getText());
        Assert.assertEquals(expectedMessage, dashboardPage.errorMessage.getText());

    }
}
