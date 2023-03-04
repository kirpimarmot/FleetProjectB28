package com.intabella.step_definitions;

import com.intabella.pages.Filters;
import com.intabella.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import org.junit.Assert;

import java.util.List;

public class US12_StepDefs {

    @And("filter options are as follows")
    public void filterOptionsAreAsFollows(List<String> filterOptions) {

        BrowserUtils.waitFor(2);

        List<String> actualOptions = BrowserUtils.getElementsText(new Filters().filterNames);

        Assert.assertEquals(filterOptions, actualOptions);

    }
}
