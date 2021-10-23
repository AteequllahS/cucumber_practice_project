package com.ateek.step_definitions;

import com.ateek.pages.GoogleHomePage;
import com.ateek.utility.BrowserUtil;
import com.ateek.utility.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class GoogleSearch_StepDef {

    GoogleHomePage homePage;

    @Given("user is at home page")
    public void userIsAtHomePage() {

        homePage = new GoogleHomePage();
        homePage.goTo();

    }

    @When("user search for keyword {string}")
    public void userSearchForKeyword(String keyword) {
        BrowserUtil.waitFor(1);
        homePage.searchKeyword(keyword);

    }

    @Then("we should see result page")
    public void weShouldSeeResultPage() {
        System.out.println("I can check the title in next method");

    }

    @And("the title should start with {string}")
    public void theTitleShouldStartWith(String keyword) {

        assertTrue(Driver.getDriver().getTitle().startsWith(keyword));

    }
}
