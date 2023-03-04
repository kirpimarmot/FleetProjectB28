package com.intabella.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Filters extends BasePage {

    @FindBy(xpath = "//i[@class='fa-filter hide-text']")
    public WebElement filtersButton;

    @FindBy(className = "add-filter-button")
    public WebElement manageFiltersButton;
}
