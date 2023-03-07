package com.intabella.step_definitions;

import com.intabella.pages.Filters;
import com.intabella.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

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
        filters.filterOptionsAreSelectedByDefault();
    }

    @And("filter options can be unchecked")
    public void filterOptionsCanBeUnchecked() {
        filters.filterOptionsCanBeUnselected();

    }


}
