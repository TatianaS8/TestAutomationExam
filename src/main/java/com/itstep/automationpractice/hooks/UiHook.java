package com.itstep.automationpractice.hooks;

import com.itstep.automationpractice.selenium.Browser;
import com.itstep.automationpractice.utils.PropertyReader;
import com.itstep.automationpractice.utils.ResourceBundleReader;
import com.itstep.automationpractice.utils.ScenarioContext;
import com.itstep.automationpractice.utils.ScreenshotUtils;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.TimeUnit;

public class UiHook {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());


    @Before
    public void setUpWebDriver() {
        logger.debug("Chrome driver Set Up");
        ResourceBundleReader.getResourceBundle().getString("browser");
        PropertyReader.applicationProperties().getProperty("browser");

        WebDriver driver = Browser.getBrowser();
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.manage().window().maximize();
        logger.info("Window is maximized");
    }

    @Before
    public void setupReport(Scenario scenario) {
        System.setProperty("cucumber.reporting.config.file", "src/test/resources/cucumber-reporting.properties");
        ScreenshotUtils.setScenario(scenario);
    }

    @After(order = 100)
    public void onFail(Scenario scenario) {
        if (scenario.isFailed()) {
            ScreenshotUtils.takeScreenShot("onFail");
        }
    }

    @After
            (order = 1)
    public void tearDown() {
        Browser.quitDriver();
        ScenarioContext.clearContext();


    }
}
