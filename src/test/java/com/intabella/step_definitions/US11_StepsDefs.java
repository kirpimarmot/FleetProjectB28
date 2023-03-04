package com.intabella.step_definitions;

import com.intabella.pages.VehiclesPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class US11_StepsDefs {

    VehiclesPage vehiclesPage = new VehiclesPage();
    @Then("The default value of View Per Page is {string}")
    public void theDefaultValueOfViewPerPageIs(String expectedValue) {
        String actualValue = vehiclesPage.getValueViewPerPage();
        Assert.assertEquals(expectedValue,actualValue);

    }

    @And("the default page number is {string}")
    public void theDefaultPageNumberIs(String expectedPageNumber) {
        Assert.assertEquals(expectedPageNumber, vehiclesPage.pageNumber.getAttribute("value"));

    }
}
