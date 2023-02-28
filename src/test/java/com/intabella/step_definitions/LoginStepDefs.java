package com.intabella.step_definitions;

import com.intabella.pages.DashboardPage;
import com.intabella.pages.LoginPage;
import com.intabella.utilities.BrowserUtils;
import com.intabella.utilities.ConfigurationReader;
import com.intabella.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDefs {


    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @Then("the user should be able to login")
    public void the_user_should_be_able_to_login() {
        BrowserUtils.sleep(3);
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals("Dashboard",actualTitle);
    }




    @When("the user logs in using {string} and {string}")
    public void the_user_logs_in_using_and(String username, String password) {
        LoginPage loginPage = new LoginPage();
        loginPage.login(username,password);
    }

    @Then("the title contains {string}")
    public void the_title_contains(String expectedTitle) {
        System.out.println("expectedTitle = " + expectedTitle);
        BrowserUtils.waitFor(2);
        Assert.assertTrue(Driver.getDriver().getTitle().contains(expectedTitle));

    }

    @Given("the user logged in as {string}")
    public void the_user_logged_in_as(String userType) {
        //based on input enter that user information
        String username =null;
        String password =null;

        if(userType.equalsIgnoreCase("driver")){
            username = ConfigurationReader.getProperty("driver_username");
            password = ConfigurationReader.getProperty("driver_password");
        }else if(userType.equalsIgnoreCase("sales manager")){
            username = ConfigurationReader.getProperty("sales_manager_username");
            password = ConfigurationReader.getProperty("sales_manager_password");
        }else if(userType.equalsIgnoreCase("store manager")){
            username = ConfigurationReader.getProperty("store_manager_username");
            password = ConfigurationReader.getProperty("store_manager_password");
        }
        //send username and password and login
        new LoginPage().login(username,password);
    }

    @Then("The user is on the {string} page")
    public void the_user_is_on_the_page(String expectedTitle) {
        Assert.assertEquals(expectedTitle, new DashboardPage().getPageSubTitle());


    }



}
