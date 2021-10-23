package com.ateek.step_definitions;

import com.ateek.pages.WCommonArea;
import com.ateek.pages.WLoginPage;
import com.ateek.utility.BrowserUtil;
import com.ateek.utility.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class WebOrderLogin_StepDef {

    WLoginPage loginPage;
    WCommonArea commonArea;

    @Given("we are at web order login page")
    public void weAreAtWebOrderLoginPage() {
        loginPage = new WLoginPage();
        loginPage.goTo();
        assertEquals("Web Orders Login", Driver.getDriver().getTitle());

    }

    @When("we provide valid credentials")
    public void weProvideValidCredentials() {
        BrowserUtil.waitFor(2);
        loginPage.login("Tester", "test");

    }

    @Then("we should see all order page")
    public void weShouldSeeAllOrderPage() {

        BrowserUtil.waitFor(2);
        assertTrue(Driver.getDriver().getTitle().equals("Web Orders"));

        commonArea=new WCommonArea();
        commonArea.logoutLink.click();
        BrowserUtil.waitFor(1);
    }

    @When("we provide invalid credentials")
    public void weProvideInvalidCredentials() {

        BrowserUtil.waitFor(1);
        loginPage.login("Tester01", "InvalidPassword");
        loginPage.loginButton.click();
        assertTrue(loginPage.errorMsg.isDisplayed());

    }

    @Then("we should  still be on login page")
    public void weShouldStillBeOnLoginPage() {

        BrowserUtil.waitFor(1);
        assertTrue(Driver.getDriver().getTitle().equals("Web Orders Login"));

    }

    @And("login error message should be present")
    public void loginErrorMessageShouldBePresent() {

        assertTrue(loginPage.errorMsg.isDisplayed());
        BrowserUtil.waitFor(1);
    }

    @When("user provide username {string} and password {string}")
    public void userProvideUsernameAndPassword(String username, String password) {

       loginPage.login(username, password);
    }
}
