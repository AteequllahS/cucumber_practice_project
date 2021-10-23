package com.ateek.step_definitions;

import com.ateek.pages.*;
import com.ateek.utility.BrowserUtil;
import com.ateek.utility.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.LinkedHashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class WebOrder_SideBar_StepDef {

    WCommonArea commonArea;
    WLoginPage loginPage;
    WAllOrderPage viewAllOrders;
    WAllProductPage viewAllProducts;
    WOrderPage orderPage;

    @Given("we are at login page")
    public void weAreAtLoginPage() {

        loginPage = new WLoginPage();
        loginPage.goTo();
        String expectedTitle = "Web Orders Login";
        BrowserUtil.waitFor(2);
        assertEquals(expectedTitle, Driver.getDriver().getTitle());

    }

    @When("we provide valid user {string} and password {string}")
    public void we_provide_valid_and(String email, String password) {
        loginPage.login(email, password);

    }


    @Given("we are at web order page")
    public void we_are_at_web_order_page() {
        BrowserUtil.waitFor(2);
        assertEquals("Web Orders", Driver.getDriver().getTitle());
    }

    @When("we select any tab from sidebar {string}")
    public void we_select_any_tab_from_sidebar(String tabsName) {

        commonArea = new WCommonArea();
        switch (tabsName) {
            case "View all products":
                commonArea.viewAllProductTab.click();
                break;
            case "View all orders":
                commonArea.viewAllOrderTab.click();
                break;
            case "Order":
                commonArea.orderTab.click();
                break;
            default:
                System.out.println("No such tab existed on web order page.");

        }

    }

    @Then("we should be at each selected tab page {string}")
    public void we_should_be_at_each_selected_tab(String expectedTabTitleAPge) {

       if (commonArea.viewAllOrderTab.isSelected()){
           assertEquals(expectedTabTitleAPge ,viewAllOrders.header.getText());
       }else if(commonArea.viewAllProductTab.isSelected()){
           assertEquals(expectedTabTitleAPge ,viewAllProducts.header.getText());
       }else{
           assertEquals(expectedTabTitleAPge,orderPage.header.getText());
       }

    }


    @When("we select {string} from sidebar")
    public void we_select_from_sidebar(String string) {


    }

    @Then("we should see below {string} in Product Dropdown list")
    public void we_should_see_below_in_product_dropdown_list(String string) {


    }

}
