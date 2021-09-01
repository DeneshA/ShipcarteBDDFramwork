package io.pragra.shipcarte.bdd.testfunctions.runnersclass;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

// This functionality using TestNG - Running Scenario Level parallel execution
@CucumberOptions(features = "src/test/java/io/pragra/shipcarte/bdd/testfunctions/featurefiles",
        glue = {"src/main/java/io/pragra/shipcarte/bdd/corefunctions/stepdefinition"},
        monochrome = true,
        publish = true,
        tags = "  @RegressionFlow",
        plugin={"pretty", "html:target/cucumber-html-report.html", "json:target/cucumber.json", "junit:target/cucumber.xml", "rerun:target/rerun.txt", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
)

public class ParallelRunner extends AbstractTestNGCucumberTests {

    @DataProvider(parallel = true)
    @Override
    public Object[][] scenarios() {
        return super.scenarios();
    }



}
