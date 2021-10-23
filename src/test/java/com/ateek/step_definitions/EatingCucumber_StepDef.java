package com.ateek.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;

public class EatingCucumber_StepDef {

    int actualResult;
    int total;

    @Given("Alice is hungry")
    public void aliceIsHungry() {
        System.out.println("This is @Given code alice_is_hungry");
    }

    @When("she eats {string} cucumbers")
    public void sheEatsCucumbers(String numOfCucumber) {
        System.out.println("This is @When code he_eats_cucumbers "+numOfCucumber);
    }

    @Then("she will be full")
    public void sheWillBeFull() {
        System.out.println("This is @Then he_will_be_full");
    }

    @Given("Melisa is hungry")
    public void melisaIsHungry() {
        System.out.println("@Given Melisa is hungry");
    }

    @Then("she faints")
    public void sheFaints() {
        System.out.println("@Then she faints code");
    }

    @Given("there are {int} cucumbers")
    public void there_are_cucumbers(Integer numOfCucumber) {
        System.out.println("numOfCucumber = " + numOfCucumber);
        total+=numOfCucumber;
    }

    @When("I can eat {int} cucumbers")
    public void iCanEatEatCucumbers(int ateCount) {
        System.out.println("ateCount = " + ateCount);
        actualResult = total-ateCount;
    }

    @Then("I should have {int} cucumbers")
    public void i_should_have_cucumbers(Integer numOfLeft) {

        System.out.println("numOfLeft = " + numOfLeft);
        int expectedResult= numOfLeft;
        assertEquals(expectedResult, actualResult);


    }


}
