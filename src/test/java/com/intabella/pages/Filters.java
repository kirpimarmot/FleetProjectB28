package com.intabella.pages;

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


}
