package com.ateek.step_definitions;

import com.ateek.pages.WLoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

public class DataTable_a_login_example {

    WLoginPage loginPage = new WLoginPage();

    @Given("we are web order login page_for datatable example")
    public void we_are_web_order_login_page_for_datatable_example() {

        loginPage.goTo();


    }
    @When("we provide the following table data_for datatable example")
    public void we_provide_the_following_table_data_for_datatable_example(Map<String, String> credentials) {
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        String usernameFromTable = credentials.get("username");
        String passwordFromTable = credentials.get("password");

        loginPage.login(usernameFromTable, passwordFromTable);


    }
    @Then("we should see all order page_for datable example")
    public void we_should_see_all_order_page_for_datable_example() {
        System.out.println(" this need no codes");

    }

    @Given("this the products reference with header")
    public void this_the_products_reference_with_header(List<Map<String, Object>> productInfoWithTitle) {
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,

//      | Product     | Price | Discount |
//      | MyMoney     | 100   | 0.08     |
//      | FamilyAlbum | 80    | 0.15     |
//      | ScreenSaver | 20    | 0.1      |

        Map<String, Object> thirdRow = productInfoWithTitle.get(2); // if we want to get the whole 3rd row
        System.out.println("Printing the whole 3rd row = "+ thirdRow); // {Product=ScreenSaver, Price=20, Discount=0.1}
        System.out.println("Printing the price cell from the 3rd row = " + thirdRow.get("Price"));// prints 20
        //or
        System.out.println("Or we can get the whole row by = " + productInfoWithTitle.get(1)); // {Product=FamilyAlbum, Price=80, Discount=0.15}
        System.out.println("Or we can have access to each cell by = " + productInfoWithTitle.get(1).get("Discount")); // 0.15


    }

    @Then("I also provide that table with no header")
    public void i_also_provide_that_table_with_no_header(List<List<String>> productInfoNoTitle) {
        System.out.println("========================================================================================");
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,

        List<String> thirdRow = productInfoNoTitle.get(2);
        System.out.println("The whole 3rd row "+thirdRow);
        System.out.println("thirdRow.get(1) = " + thirdRow.get(1));
        System.out.println("productInfoNoTitle.get(1).get(2) = " + productInfoNoTitle.get(1).get(1));


    }
}
