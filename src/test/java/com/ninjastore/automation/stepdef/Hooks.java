package com.ninjastore.automation.stepdef;

import com.cucumber.listener.Reporter;
import com.google.common.io.Files;
import com.ninjastore.automation.framework.Waits;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.ninjastore.automation.base.Base;
import com.ninjastore.automation.config.PropertyFileReader;
import com.ninjastore.automation.framework.Browser;
import com.ninjastore.automation.util.PathHelper;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;

public class Hooks {
    private static Logger log = Logger.getLogger(Hooks.class);

    @Before
    public void setUp(Scenario scenario) {
        PropertyConfigurator.configure(PathHelper.getResourcePath("/src/main/resources/ConfigurationFile/log4j.properties"));
        log.info("Scenario Started: " + scenario.getName());
        Base.reader = new PropertyFileReader();
        Browser.startBrowser();
        Browser.maximize();
        Waits.setImplicitWait(30);
    }
	@After
	public void closeBrowser(Scenario scenario){
        if (scenario.isFailed()) {
            String screenshotName = scenario.getName().replaceAll(" ", "_");
            try {
                //This takes a screenshot from the driver at save it to the specified location
                TakesScreenshot ts = (TakesScreenshot) Base.driver;
                File sourcePath = ts.getScreenshotAs(OutputType.FILE);

                //Building up the destination path for the screenshot to save
                //Also make sure to create a folder 'screenshots' with in the cucumber-report folder
                File destinationPath = new File(System.getProperty("user.dir") + "/target/cucumber-reports/screenshots/" + screenshotName + ".png");

                //Copy taken screenshot from source location to destination location
                Files.copy(sourcePath, destinationPath);

                //This attach the specified screenshot to the test
                Reporter.addScreenCaptureFromPath(destinationPath.toString());
            } catch (IOException e) {
            }
        }
        /*if(scenario.isFailed()){
	scenario.embed(Browser.takeScreenshot(), "image/png");
	}*/
	log.info("Scenario Completed: "+scenario.getName());
	log.info("Scenario Status is: "+scenario.getStatus());
	Base.driver.quit();
	}

}
