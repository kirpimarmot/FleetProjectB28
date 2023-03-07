package com.intabella.step_definitions;

import com.intabella.pages.Filters;
import com.intabella.utilities.BrowserUtils;
import com.intabella.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class US14_StepDefs {

    Filters filters = new Filters();

    @When("the user clicks on filter button")
    public void theUserClicksOnFilterButton() {
        BrowserUtils.waitForClickablility(filters.filtersButton, 10);
        filters.filtersButton.click();
    }

    @When("the user clicks on manage filter button")
    public void theUserClicksOnManageFilterButton() {
        filters.manageFiltersButton.click();

    }

    @And("filter options are checked by default")
    public void filterOptionsAreCheckedByDefault() {

        for (int i = 0; i <= 4; i++) {
            String element = "//input[@id='ui-multiselect-0-0-option-" + i + "']";
            WebElement filterCheckBoxes = Driver.getDriver().findElement(By.xpath(element));
            Assert.assertTrue(filterCheckBoxes.isSelected());
        }

    }

    @And("filter options can be unchecked")
    public void filterOptionsCanBeUnchecked() {

//should be fixed
        for (int i = 0; i <= 4; i++) {
            String element =  "(//input[@name='multiselect_1'])["+i+"]";
            WebElement filterCheckBoxes = Driver.getDriver().findElement(By.xpath(element));
            filterCheckBoxes.click();
            Assert.assertFalse(filterCheckBoxes.isSelected());
        }

    }



}
