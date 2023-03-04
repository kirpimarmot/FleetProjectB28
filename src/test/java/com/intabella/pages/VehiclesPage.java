package com.intabella.pages;

import com.intabella.utilities.BrowserUtils;
import com.intabella.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class VehiclesPage extends BasePage{

    @FindBy(xpath = "(//div[@class='dropdown']//*[text()='...'])[5]")
    public WebElement threeDots;

    @FindBy(xpath = "//ul[@class='dropdown-menu dropdown-menu__action-cell launchers-dropdown-menu detach dropdown-menu__floating']//*[@class='launcher-item']//a")
    public List<WebElement> iconList;


    @FindBy(xpath = "//button[@class='btn btn-default btn-small dropdown-toggle']//input[@type='checkbox']")
    public WebElement selectAllCheckBoxes;




    public void hoverOverThreeDots(){
        Actions actions = new Actions(Driver.getDriver());
        //web element receives the mouse event in second attempt
        //we try twice
//        try {
//            for (int i = 0; i < 2; i++) {
                actions.moveToElement(threeDots).pause(100).build().perform();
                BrowserUtils.waitFor(2);
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }


    }
}
