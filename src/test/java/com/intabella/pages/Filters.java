package com.intabella.pages;

import com.intabella.utilities.BrowserUtils;
import com.intabella.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class Filters extends BasePage {

    @FindBy(xpath = "//i[@class='fa-filter hide-text']")
    public WebElement filtersButton;

    @FindBy(className = "add-filter-button")
    public WebElement manageFiltersButton;

    @FindBy(xpath = "(//div[@class='ui-multiselect-menu ui-corner-all select-filter-widget dropdown-menu']//ul)[2]//li")
    public List<WebElement> filterNames;

    public void filterOptionsAreSelectedByDefault(){
        for (int i = 0; i <= 4; i++) {
            String element = "//input[@id='ui-multiselect-0-0-option-" + i + "']";
            WebElement filterCheckBoxes = Driver.getDriver().findElement(By.xpath(element));
            Assert.assertTrue(filterCheckBoxes.isSelected());
        }
    }

    public void filterOptionsCanBeUnselected(){
        for (int i = 1; i <= 5; i++) {
            String element = "(//input[starts-with(@name,\"multiselect\")])[" + i + "]";
            WebElement filterCheckBoxes = Driver.getDriver().findElement(By.xpath(element));
            filterCheckBoxes.click();
            BrowserUtils.sleep(1);
            filterCheckBoxes = Driver.getDriver().findElement(By.xpath(element));//not to get stale element reference exception
            Assert.assertFalse(filterCheckBoxes.isSelected());
        }
    }

}
