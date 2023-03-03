package com.intabella.step_definitions;


import com.intabella.pages.DashboardPage;
import com.intabella.pages.HowToUserPinbarPage;
import com.intabella.pages.OroincDocPage;
import com.intabella.utilities.BrowserUtils;
import com.intabella.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class ContactsStepDefs {

    DashboardPage dashboardPage = new DashboardPage();

    @Then("the user should see following options")
    public void the_user_should_see_following_options(List<String> menuOptions) {
        BrowserUtils.waitFor(2);
        //get the list of webelement and convert them to list of string and assert
        List<String> actualOptions = BrowserUtils.getElementsText(new DashboardPage().menuOptions);

        Assert.assertEquals(menuOptions, actualOptions);
        System.out.println("menuOptions = " + menuOptions);
        System.out.println("actualOptions = " + actualOptions);
    }


    @Then("the user click on the question icon")
    public void theUserClickOnTheQuestionIcon() {
        dashboardPage.waitUntilLoaderScreenDisappear();
        dashboardPage.questionIcon.click();

    }


    @Then("the user should see {string}")
    public void theUserShouldSee(String expectedTitle) {
        BrowserUtils.switchToWindow(expectedTitle);
//        for (String handle : Driver.getDriver().getWindowHandles()) {
//            Driver.getDriver().switchTo().window(handle);
//            if (Driver.getDriver().getTitle().equals(expectedTitle)) {
//                break;
//            }
//        }
        Assert.assertEquals(expectedTitle, new OroincDocPage().OroincTitle.getText());
    }
    @And("the user click on the {string} link")
    public void theUserClickOnTheLink(String str) {
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
