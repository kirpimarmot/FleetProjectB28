package com.intabella.pages;

import com.intabella.utilities.BrowserUtils;
import com.intabella.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.Random;

public class VehiclesPage extends BasePage{

    @FindBy(xpath = "(//div[@class='dropdown']//*[text()='...'])[5]")
    public WebElement threeDots;

    @FindBy(xpath = "//ul[@class='dropdown-menu dropdown-menu__action-cell launchers-dropdown-menu detach dropdown-menu__floating']//*[@class='launcher-item']//a")
    public List<WebElement> iconList;


    @FindBy(xpath = "//button[@class='btn btn-default btn-small dropdown-toggle']//input[@type='checkbox']")
    public WebElement selectAllCheckBoxes;

    @FindBy(css = "div.btn-group button.btn.dropdown-toggle")
    public WebElement viewPerPage;

    @FindBy(xpath = "//input[@value='1']")
    public WebElement pageNumber;



    public String getValueViewPerPage(){
        BrowserUtils.waitForVisibility(viewPerPage,5);
        return viewPerPage.getText();
    }

    public void isAllCheckBoxesSelected(){
        List<WebElement> numRows = Driver.getDriver().findElements(By.xpath("//table/tbody/tr"));

        for (int i = 1; i <= numRows.size(); i++) {
            String element = "//table/tbody/tr[" + i + "]/td[1]/input";
            WebElement checkBoxes = Driver.getDriver().findElement(By.xpath(element));
            Assert.assertTrue(checkBoxes.isSelected());
        }

    }


    public void selectAnyCar(){
        Random random = new Random();
        int randomNum = random.nextInt(25);

        String element = "//table/tbody/tr[" + randomNum + "]/td[1]/input";
        WebElement randomCheckBox = Driver.getDriver().findElement(By.xpath(element));
        randomCheckBox.click();
        Assert.assertTrue(randomCheckBox.isSelected());

    }

    public void isCheckBoxesUnselectedByDeafult(){
        List<WebElement> numRows = Driver.getDriver().findElements(By.xpath("//table/tbody/tr"));

        System.out.println("allRows.size() = " + numRows.size());
        for (int i = 1; i <= numRows.size(); i++) {
            String element = "//table/tbody/tr[" + i + "]/td[1]/input";
            WebElement checkBoxes = Driver.getDriver().findElement(By.xpath(element));
            Assert.assertFalse(checkBoxes.isSelected());
        }
    }
}
