package com.ateek.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

public class DataTable_StepDef {


    @Given("I read {string}")
    public void i_read(String bookType) {
        System.out.println("Books that I am interested in "+bookType);


    }
    @When("If I want to find what I read")
    public void if_i_want_to_find_what_i_read() {
        System.out.println("How I look at what I read");

    }
    @Then("I just look at their titles")
    public void i_just_look_at_their_titles() {
        System.out.println("I just read their titles");

    }

    @Given("I have read the following books")
    public void i_have_read_the_following_books(List<String> bookType) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        System.out.println("I have read the following list of books "+bookType);

    }

    @When("I want to look at their titles")
    public void i_want_to_look_at_their_titles(List<String> bookTitle) {
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        System.out.println("I can look at their titles "+bookTitle);


    }

    @Then("I could say I read the following books from their titles")
    public void i_could_say_i_read_the_following_books_from_their_titles(Map<String, String> readBooks) {
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        System.out.println("I could find what books I read by their titles "+readBooks);

    }
}
