package com.ninjastore.automation.runner;


import org.junit.runner.RunWith;
import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

import java.io.File;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/FeatureFiles"},
        glue = {"classpath:com.ninjastore.automation.stepdef"},
        //plugin = {"html:target/cucumber_html_report"},
        plugin = { "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"},
        tags = {"@Search"}
)
public class Runner {

    public static void writeExtentReport() {
        Reporter.loadXMLConfig(new File("ConfigurationFile/extent-config.xml"));
    }


}
