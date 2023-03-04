package com.intabella.step_definitions;

import com.intabella.utilities.BrowserUtils;
import com.intabella.utilities.Driver;
import io.cucumber.java.en.And;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class US10_StepsDefs {


    @And("the user write message inside the description field")
    public void theUserWriteMessageInsideTheDescriptionField() {
        BrowserUtils.sleep(5);
        Driver.getDriver().switchTo().frame(0);
        WebElement descriptionField = Driver.getDriver().findElement(By.id("tinymce"));
        descriptionField.sendKeys("hello");
        Assert.assertEquals("hello", Driver.getDriver().findElement(By.xpath("//p[normalize-space()='hello']")).getText());


    }
}
