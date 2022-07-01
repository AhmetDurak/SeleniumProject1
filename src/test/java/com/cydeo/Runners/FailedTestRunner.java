package com.cydeo.Runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "@target/rerun.txt",
        glue = "com/cydeo/stepDefinitions"
)

/*
 * It runs only failed test
 * This plugin allows us to keep track of the FAILED scenarios.
 * It is useful when we have multiple failed test and want them to run only
 *
 * - Why do we need RERUN and FailedTestRunner?
 *
 *     - Mostly to save time when tests fails.
 *     - If we have hundreds of tests, and only few of them are failing, we don't want to execute all the hundreds of the tests again.
 *     - That's why we can just execute the failed tests that are automatically stored under the rerun.txt using our FailedTestRunner.
 *
 * - FailedTestRunner cannot change or edit the rerun.txt.
 * - Therefore even if the tests are passing, the lines will still in the rerun.txt, which is normal.
 * - We can delete rerun.txt by going Maven --> clean
 */

public class FailedTestRunner {
}
