package com.intabella.step_definitions;

import com.intabella.pages.VehiclesPage;
import com.intabella.utilities.Driver;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;

public class US7_StepDefs {

    VehiclesPage vehiclesPage = new VehiclesPage();

    @Then("the all checkboxes should be unchecked")
    public void theAllCheckboxesShouldBeUnchecked() {

        List<WebElement> numRows = Driver.getDriver().findElements(By.xpath("//table/tbody/tr"));

        System.out.println("allRows.size() = " + numRows.size());
        for (int i = 1; i <= numRows.size(); i++) {
            String element = "//table/tbody/tr[" + i + "]/td[1]/input";
            WebElement checkBoxes = Driver.getDriver().findElement(By.xpath(element));
            Assert.assertFalse(checkBoxes.isSelected());
        }


    }

    @Then("the the user select all cars by click on the first check box")
    public void theTheUserSelectAllCarsByClickOnTheFirstCheckBox() {
        vehiclesPage.selectAllCheckBoxes.click();

        List<WebElement> numRows = Driver.getDriver().findElements(By.xpath("//table/tbody/tr"));

        System.out.println("allRows.size() = " + numRows.size());
        for (int i = 1; i <= numRows.size(); i++) {
            String element = "//table/tbody/tr[" + i + "]/td[1]/input";
            WebElement checkBoxes = Driver.getDriver().findElement(By.xpath(element));
            Assert.assertTrue(checkBoxes.isSelected());
        }
    }

    @Then("the the user can select any car")
    public void theTheUserCanSelectAnyCar() {

        Random random = new Random();
        int randomNum = random.nextInt(25);

        String element = "//table/tbody/tr[" + randomNum + "]/td[1]/input";
        WebElement randomCheckBox = Driver.getDriver().findElement(By.xpath(element));
        randomCheckBox.click();



    }
}
