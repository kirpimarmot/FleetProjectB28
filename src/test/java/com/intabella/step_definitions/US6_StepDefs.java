package com.intabella.step_definitions;

import com.intabella.pages.VehiclesPage;
import com.intabella.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class US6_StepDefs {

    VehiclesPage vehiclesPage = new VehiclesPage();

    @When("The user hover over the three dots at the end of any row")
    public void the_user_hover_over_the_three_dots_at_the_end_of_any_row() {
        BrowserUtils.hover(vehiclesPage.threeDots);
    }


    @Then("the user see following icons")
    public void theUserSeeFollowingIcons(List<String> iconOptions) {
        BrowserUtils.waitFor(2);
        //get the list of webelement and convert them to list of string and assert
        List<String> actualOptions = BrowserUtils.getElementsTitle(vehiclesPage.iconList);
        System.out.println(vehiclesPage.iconList);

        Assert.assertEquals(iconOptions, actualOptions);
        System.out.println("iconOptions = " + iconOptions);
        System.out.println("actualOptions = " + actualOptions);
    }


}
