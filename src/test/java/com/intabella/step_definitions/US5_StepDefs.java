package com.intabella.step_definitions;

import com.intabella.pages.VehicleModelPage;
import com.intabella.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;

public class US5_StepDefs {

    @Then("the user should see following column options")
    public void theUserShouldSeeFollowingColumnOptions(List<String> columnOptions) {
        BrowserUtils.waitFor(2);
        //get the list of webelement and convert them to list of string and assert
        List<String> actualOptions = BrowserUtils.getElementsText(new VehicleModelPage().columnOptions);

        Assert.assertEquals(columnOptions, actualOptions);
        System.out.println("columnOptions = " + columnOptions);
        System.out.println("actualOptions = " + actualOptions);

    }
}
