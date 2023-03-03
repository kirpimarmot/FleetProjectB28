package com.intabella.step_definitions;


import com.intabella.pages.DashboardPage;
import com.intabella.utilities.BrowserUtils;
import com.intabella.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class GeneralStepsDefs {

    DashboardPage dashboardPage = new DashboardPage();


    @And("the user navigates to {string} - {string}")
    public void theUserNavigatesToModule(String tab, String module) {
        BrowserUtils.waitFor(8);
        dashboardPage.navigateToModule(tab, module);
        BrowserUtils.waitFor(10);
    }

    @Then("the page url is {string}")
    public void thePageUrlIs(String expectedUrl) {
        Assert.assertEquals(expectedUrl, Driver.getDriver().getCurrentUrl());
    }


}
