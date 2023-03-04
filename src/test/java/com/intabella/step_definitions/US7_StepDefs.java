package com.intabella.step_definitions;

import com.intabella.pages.VehiclesPage;
import io.cucumber.java.en.Then;

public class US7_StepDefs {

    VehiclesPage vehiclesPage = new VehiclesPage();

    @Then("the all checkboxes should be unchecked")
    public void theAllCheckboxesShouldBeUnchecked() {
        vehiclesPage.isCheckBoxesUnselectedByDeafult();

    }

    @Then("the the user select all records by click on the first check box")
    public void theTheUserSelectAllRecordssByClickOnTheFirstCheckBox() {
        vehiclesPage.selectAllCheckBoxes.click();
        vehiclesPage.isAllCheckBoxesSelected();

    }

    @Then("the the user can select any car")
    public void theTheUserCanSelectAnyCar() {
       vehiclesPage.selectAnyCar();

    }


}
