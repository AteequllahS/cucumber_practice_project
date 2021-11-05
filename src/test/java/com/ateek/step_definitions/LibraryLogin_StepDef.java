package com.ateek.step_definitions;

import com.ateek.pages.LibLoginPage;
import com.ateek.utility.BrowserUtil;
import com.ateek.utility.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;


public class LibraryLogin_StepDef {

    LibLoginPage loginPage;

    @Given("user is at library login page")
    public void userIsAtLibraryLoginPage() {
        loginPage = new LibLoginPage();
        loginPage.goTo();
        assertEquals("Login - Library", Driver.getDriver().getTitle());
        BrowserUtil.waitFor(1);
    }

    @When("user uses username {string} and password {string}")
    public void userUsesUsernameAndPassword(String email, String password) {
        loginPage.login(email, password);
        BrowserUtil.waitFor(1);
    }

    @Then("user should be at Dashboard page")
    public void userShouldBeAtDashboardPage() {
        System.out.println("Driver.getDriver().getTitle() = " + Driver.getDriver().getTitle());
        assertEquals("Library", Driver.getDriver().getTitle());

    }


}
