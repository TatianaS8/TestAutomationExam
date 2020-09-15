package com.itstep.automationpractice.steps;

import com.itstep.automationpractice.pages.AbstractPage;
import com.itstep.automationpractice.selenium.Browser;
import com.itstep.automationpractice.utils.ReflectionUtils;
import com.itstep.automationpractice.utils.ScenarioContext;
import com.itstep.automationpractice.utils.ScenarioDataKey;
import com.itstep.automationpractice.utils.ScreenshotUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.hamcrest.MatcherAssert;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.InvocationTargetException;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;

public class LoginFunctionality {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());


    @Given("user goes on  {string}")
    public void userGoesOnHomePage(String pageName) {
        Browser.getBrowser().navigate().to("http://automationpractice.com/index.php");
        logger.info("user navigate to {}", pageName.toUpperCase());
    }

    @And("user clicks {string} on {string}")
    public void userClicksSignInButtonOnHomePage(String buttonName, String pageName) throws IllegalAccessException {
        WebElement button = ReflectionUtils.getWebElement(buttonName);
        ScreenshotUtils.takeScreenshotOfElement(buttonName, button);
        button.click();
        logger.info("User clicks {} on {}", buttonName.toUpperCase(), pageName.toUpperCase());
    }

    @And("user adds valid input in {string} field on {string}")
    public void userAddsValidInputInEmailFieldOnAuthenticationPage(String fieldName, String pageName) throws IllegalAccessException {
        WebElement emailField = ReflectionUtils.getWebElement(fieldName);
        emailField.sendKeys("test@getnada.com");
        logger.info("user adds valid input in {} field on {}", fieldName.toUpperCase(), pageName.toUpperCase());
    }

    @And("user adds valid input in {string} and {string} field on {string}")
    public void userAddsValidInputInEmailAndPasswordFieldOnAuthenticationPage(String mailField, String passwordField, String pageName) throws IllegalAccessException {
        WebElement email = ReflectionUtils.getWebElement(mailField);
        email.sendKeys("test@getnada.com");
        WebElement password = ReflectionUtils.getWebElement(passwordField);
        password.sendKeys("12345");
        ScreenshotUtils.takeScreenshotOfElement(mailField, email);
        ScreenshotUtils.takeScreenshotOfElement(passwordField, password);
        logger.info("user adds valid input in {} and {} field on {}", mailField.toUpperCase(), passwordField.toUpperCase(), pageName.toUpperCase());

    }

    @When("user adds invalid input in {string} and {string} field on {string}")
    public void userAddsInvalidInputInEmailAndPasswordFieldOnAuthenticationPage(String mailField, String passwordField, String pageName) throws IllegalAccessException {
        WebElement email = ReflectionUtils.getWebElement(mailField);
        email.sendKeys("test@getnada.com");
        WebElement password = ReflectionUtils.getWebElement(passwordField);
        password.sendKeys("1234");
        ScreenshotUtils.takeScreenshotOfElement(mailField, email);
        ScreenshotUtils.takeScreenshotOfElement(passwordField, password);
        logger.info("user adds valid input in {} and {} field on {}", mailField.toUpperCase(), passwordField.toUpperCase(), pageName.toUpperCase());
    }

    @Then("{string} is displayed")
    public void myAccountPageIsDisplayed(String pageName) throws InvocationTargetException, NoSuchMethodException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        AbstractPage page = ReflectionUtils.getPageObject(pageName);
        MatcherAssert.assertThat(Browser.getBrowser().getCurrentUrl(), containsString(page.getPageURL()));
        ScenarioContext.setContext(ScenarioDataKey.CURRENT_PAGE.name(), page);
        ScreenshotUtils.takeScreenShot(pageName);
        logger.info("{}  is displayed", pageName.toUpperCase());
    }

    @Then("{string} is displayed on {string} page")
    public void anErrorMessageIsDisplayedOnAuthenticationPage(String errorMessage, String pageName) throws IllegalAccessException {
        WebElement error = ReflectionUtils.getWebElement(errorMessage);
        MatcherAssert.assertThat(error.isDisplayed(), is(true));
        ScreenshotUtils.takeScreenshotOfElement(errorMessage, error);
        logger.info("{}  is displayed on {} page", errorMessage.toUpperCase(), pageName.toUpperCase());
    }

    @And("{string} is displayed on {string}")
    public void signInButtonIsDisplayedOnHomePage(String buttonName, String pageName) throws IllegalAccessException {
        WebElement button = ReflectionUtils.getWebElement(buttonName);
        MatcherAssert.assertThat(button.isDisplayed(), is(true));
        ScreenshotUtils.takeScreenshotOfElement(buttonName, button);
        logger.info("{} button is displayed on the {}", buttonName.toUpperCase(), pageName.toUpperCase());

    }

    @And("{string} field is displayed on {string}")
    public void searchFieldIsDisplayedOnHomePage(String fieldName, String pageName) throws IllegalAccessException {
        WebElement element = ReflectionUtils.getWebElement(fieldName);
        logger.info("{} field is displayed on {}", fieldName.toUpperCase(), pageName.toUpperCase());
    }

    @And("{string} button is displayed on{string}")
    public void searchButtonIsDisplayedOnHomePage(String buttonName, String pageName) throws IllegalAccessException {
        WebElement element = ReflectionUtils.getWebElement(buttonName);
        logger.info("{} button is displayed on{}", buttonName.toUpperCase(), pageName.toUpperCase());
    }

    @When("user adds {string} in {string} on {string}")
    public void userAddsProductInSearchBoxOnHomePage(String productName, String fieldName, String pageName) throws IllegalAccessException {
        WebElement element = ReflectionUtils.getWebElement(fieldName);
        element.sendKeys("dress");
        ScreenshotUtils.takeScreenshotOfElement(productName, element);
        logger.info("user adds {} in {} field on {}", productName.toUpperCase(), fieldName.toUpperCase(), pageName.toUpperCase());

    }
}


