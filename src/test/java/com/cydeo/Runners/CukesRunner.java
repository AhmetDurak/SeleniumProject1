package com.cydeo.Runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                //"html:target/cucumber-report.html",
                //"pretty",
                "rerun:target/rerun.txt",
                "me.jvt.cucumber.report.PrettyReports:target/cucumber",
                "json:target/cucumber.json"
        },
        features = "src/test/resources/features",
        glue = "com/cydeo/stepDefinitions",
        dryRun = false,
        tags = "@DataTableTask",
        publish = true

)

// Runner class is the class where we control/trigger our whole framework.
public class CukesRunner {
}
