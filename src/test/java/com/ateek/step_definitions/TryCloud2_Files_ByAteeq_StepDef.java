package com.ateek.step_definitions;

import com.ateek.pages.TryCloud2_FilesPage;
import com.ateek.utility.BrowserUtil;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.ArrayList;
import java.util.List;


public class TryCloud2_Files_ByAteeq_StepDef {

    TryCloud2_FilesPage files = new TryCloud2_FilesPage();
    List<String> actualText;
    List<String> expectedText;


    @Given("I login as a user2")
    public void i_login_as_a_user() {

        files.goTo();
        BrowserUtil.waitFor(4);
        files.usernameBox.sendKeys("user2");
        files.passwordBox.sendKeys("Userpass123");
        BrowserUtil.waitFor(1);
        files.loginBtn.click();

    }

    @When("I click action-icon from any file on the page2")
    public void i_click_action_icon_from_any_file_on_the_page() {

        files.filesTab.click();
        BrowserUtil.waitFor(3);
        files.clickOnEachFileOption();



    }


    @When("choose Add to Favorite option2")
    public void choose_option() {

       BrowserUtil.waitFor(2);
        actualText = new ArrayList<>();
        files.addToFavorite_And_getTextOfAddToFav(actualText);

        System.out.println("actualText = " + actualText);

    }

    @When("click Favorites sub-module on the list side2")
    public void click_sub_module_on_the_list_side() {

        files.favoritesTab.click();
        BrowserUtil.waitFor(2);

    }

    @Then("verify the chosen file is listed on the table2")
    public void verify_the_chosen_file_is_listed_on_the_table() {

        expectedText = new ArrayList<>();
        files.addedToFavListText(expectedText);
        System.out.println("expectedText = " + expectedText);


        for (String eachFile : expectedText) {
            if( eachFile.contains( actualText.get(0) )|| eachFile.equals(actualText.get(1))) {
                System.out.println("Passed: The file successfully added to favorite list");
            }else {
                System.out.println("failed: actual text does not match expected text");
            }
        }

    }

}




