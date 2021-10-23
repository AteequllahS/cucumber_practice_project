package com.ateek.utility;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
            features = "src/test/resources/utility",                            // or "src/test/resources/features",
            glue = "com/ateek/step_definitions",
       //     publish = true,
            plugin = {"pretty",
                    "json:target/cucumber.json",
                    "html:target/cucumber/",
                    "junit:target/junit/junit-report.xml",
                    "rerun:target/rerun.txt"}
        //    dryRun = false
           ,tags = "@smoke"
                )

public class TestRunner {
}
