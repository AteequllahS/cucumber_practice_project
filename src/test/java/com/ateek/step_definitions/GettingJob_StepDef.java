package com.ateek.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GettingJob_StepDef {
    @Given("students attend all the classes")
    public void studentsAttendAllTheClasses() {
        System.out.println("Given code goes here: students attend all the classes");

    }

    @When("student learn all the topic")
    public void studentLearnAllTheTopic() {
        System.out.println("When code goes here: student learn all the topic");
    }

    @Then("student should be ready for the job")
    public void studentShouldBeReadyForTheJob() {
        System.out.println("Then code goes here: student should be ready for the job");

    }

    @Given("student is prepared")
    public void studentIsPrepared() {
        System.out.println("Given student is prepared");

    }

    @When("student upload their resume")
    public void studentUploadTheirResume() {
        System.out.println("When student upload their resume");
    }

    @Then("student will be in the market")
    public void studentWillBeInTheMarket() {
        System.out.println("Then student will be in the market");
    }

    @Given("you are prepared for a job")
    public void youArePreparedForAJob() {
        System.out.println("Condition 1: you are prepared for a job");
    }

    @And("you are in the market")
    public void youAreInTheMarket() {
        System.out.println("Condition 2: you are in the market");
    }

    @When("you apply for {int} jobs a day")
    public void youApplyForJobsADay(int numOfJobs) {
        System.out.println("Condition 3: you apply for "+numOfJobs+" jobs a day");
    }

    @Then("you will eventually get the job")
    public void youWillEventuallyGetTheJob() {
        System.out.println("Condition 3: you will eventually get the job");

    }
}
