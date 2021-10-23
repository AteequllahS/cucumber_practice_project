package com.ateek.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
            features = "@target/failed_tests.txt",
            glue = "com/ateek/step_definitions",
            plugin = "@ui"
)

public class FailedTestRunner {
}
