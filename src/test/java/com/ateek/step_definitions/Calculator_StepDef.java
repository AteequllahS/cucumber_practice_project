package com.ateek.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Calculator_StepDef {

    int actualResult;

    @Given("calculator app is open")
    public void calculatorAppIsOpen() {
        System.out.println("Calculator is open.");

    }

    @When("I add {int} with {int}")
    public void iAddWith(int num1, int num2) {

        actualResult = num1+num2;

    }

    @Then("I should get result {int} displayed")
    public void iShouldGetResultDisplayed(int expectedResult) {

        assertEquals(expectedResult, actualResult);
    }
}
