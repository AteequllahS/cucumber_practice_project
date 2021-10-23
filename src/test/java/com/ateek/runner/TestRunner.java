package com.ateek.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
            features = "classpath:features",                            // or "src/test/resources/features",
            glue = "com/ateek/step_definitions",
            publish = true,
            plugin = {"pretty",
                        "html:target/cucumber_report.html",
                        "rerun:target/failed_reports.txt",
                        "me.jvt.cucumber.report.PrettyReports:target"},
            dryRun = false
           ,tags = "@homework"
                )

public class TestRunner {
}
