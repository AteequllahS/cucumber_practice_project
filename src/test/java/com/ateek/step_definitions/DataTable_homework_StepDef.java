package com.ateek.step_definitions;

import com.ateek.pages.WAllProductPage;
import com.ateek.pages.WCommonArea;
import com.ateek.pages.WLoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DataTable_homework_StepDef {

    @And("we provide valid credentials to login")
    public void weProvideValidCredentialsToLogin() {

        WLoginPage loginPage = new WLoginPage();
        loginPage.login("Tester", "test");
    }

    @When("we select {string} tab from sidebar")
    public void we_select_tab_from_sidebar(String tabName) {

        WCommonArea commonArea = new WCommonArea();
        switch (tabName.toLowerCase()){
            case "view all products":
                commonArea.viewAllProductTab.click();
                break;
            case "view all order":
                commonArea.viewAllOrderTab.click();
                break;
            case "order":
                commonArea.orderTab.click();
                break;
            default:
                System.out.println("No such tab exists in the page!");
        }
    }


    @Then("We should see table with below content")
    public void we_should_see_table_with_below_content(List<Map<String, String>> productInfo) {
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        WAllProductPage allProductPage = new WAllProductPage();

        Map<String, String> expectedFirstRowMap = productInfo.get(0);
        Map<String, String> actualFirstRowMap = allProductPage.getRowMapFromWebTable();

        assertEquals(expectedFirstRowMap, actualFirstRowMap);


    }


}
