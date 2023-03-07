package com.intabella.step_definitions;

import com.intabella.pages.DashboardPage;
import com.intabella.pages.HowToUserPinbarPage;
import com.intabella.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.util.ArrayList;
import java.util.List;

public class US3_StepDefs {
    DashboardPage dashboardPage = new DashboardPage();

    @And("the user click on the {string} link")
    public void theUserClickOnTheLink(String str) {
        dashboardPage.waitUntilLoaderScreenDisappear();
        dashboardPage.learnHowToUseThisSpaceLink.click();
    }


    @Then("the user should see following text")
    public void theUserShouldSeeFollowingText(List<String> listOfText) {
        HowToUserPinbarPage howToUserPinbarPage = new HowToUserPinbarPage();
        String text = howToUserPinbarPage.howToUsePinbarText.getText();
        String text1 = howToUserPinbarPage.usePinIconText.getText();
        List<String> actualListOfText = new ArrayList<>();
        actualListOfText.add(text);
        actualListOfText.add(text1);
        Assert.assertEquals(listOfText, actualListOfText);

    }

    @Then("the users should see an image on the page")
    public void theUsersShouldSeeAnImageOnThePage() {
        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//img")).isDisplayed());
        //img[src='/bundles/oronavigation/images/pinbar-location.jpg']
    }
}
