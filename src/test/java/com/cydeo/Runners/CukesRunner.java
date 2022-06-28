package com.cydeo.Runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/cucumber-report.html",
            "json:target/cucumber-jvm.json"
        },
        features = "src/test/resources/features",
        glue = "com/cydeo/stepDefinitions",
        dryRun = false,
        tags = "@wip"

)

// Runner class is the class where we control/trigger our whole framework.
public class CukesRunner {
}
