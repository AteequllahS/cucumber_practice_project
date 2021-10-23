package com.ateek.step_definitions;

import com.ateek.pages.WCommonArea;
import com.ateek.pages.WLoginPage;
import com.ateek.pages.WOrderPage;
import com.ateek.utility.BrowserUtil;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WebOrder_functionality_StepDef {


    WLoginPage loginPage = new WLoginPage();

    @Given("we are at webOrder login page")
    public void we_are_at_web_order_login_page() {

        loginPage.goTo();
        BrowserUtil.waitFor(2);
    }
    @Given("we provide valid user and password")
    public void we_provide_valid_user_and_password() {
        loginPage.login("Tester", "test");
        BrowserUtil.waitFor(2);
    }
    @When("we select {string} tab from the sidebar")
    public void we_select_tab_from_the_sidebar(String tabName) {

        WCommonArea commonArea = new WCommonArea();
        switch (tabName) {
            case "View all products" :
                commonArea.viewAllProductTab.click();
                break;
            case "View all orders" :
                commonArea.viewAllOrderTab.click();
                break;
            case "Order":
                commonArea.orderTab.click();
                break;
        }


    }
    @Then("we should see below options in product dropdown list")
    public void we_should_see_below_options_in_product_dropdown_list(List<String> expectedOptions) {
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        WOrderPage orderPage = new WOrderPage();
        List<String> actualOptions = orderPage.getAllProductDropDownOptions();
        assertEquals(expectedOptions, actualOptions);


    }
}
