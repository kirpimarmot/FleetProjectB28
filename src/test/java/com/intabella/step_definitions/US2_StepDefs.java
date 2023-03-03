package com.intabella.step_definitions;

import com.intabella.pages.DashboardPage;
import com.intabella.pages.OroincDocPage;
import com.intabella.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class US2_StepDefs {
    DashboardPage dashboardPage = new DashboardPage();




    @Then("the user click on the question icon")
    public void theUserClickOnTheQuestionIcon() {
        dashboardPage.waitUntilLoaderScreenDisappear();
        dashboardPage.questionIcon.click();

    }


    @Then("the user should see {string}")
    public void theUserShouldSee(String expectedTitle) {
        BrowserUtils.switchToWindow(expectedTitle);
//        for (String handle : Driver.getDriver().getWindowHandles()) {
//            Driver.getDriver().switchTo().window(handle);
//            if (Driver.getDriver().getTitle().equals(expectedTitle)) {
//                break;
//            }
//        }
        Assert.assertEquals(expectedTitle, new OroincDocPage().OroincTitle.getText());
    }
}
