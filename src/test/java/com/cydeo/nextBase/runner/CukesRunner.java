package com.cydeo.nextBase.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty" ,
                "html:target/cucumber-report.html",
                "json:target/cucumber.json",
                "rerun:target/rerun.txt" ,
                "me.jvt.cucumber.report.PrettyReports:target/cucumber"
        } ,
        features = "src/test/resources/features" , // from content
        glue = "com/cydeo/nextBase/step_definitions" , //from source root

        dryRun = false
        ,
        tags = "@wip"
        ,
        publish = true
)

public class CukesRunner {
}
