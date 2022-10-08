package com.StepDefination;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="Features",
glue= {"com.StepDefination"},
dryRun=false,
plugin={"pretty","html:target/cucumber-reports/report.html","json:target/json-reports/report.json"},
monochrome=true,
publish=true
)
public class TestRunner {

}
