//import com.itstep.automationpractice.pages.AbstractPage;
//import com.itstep.automationpractice.selenium.Browser;
//import com.itstep.automationpractice.utils.ReflectionUtils;
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import org.hamcrest.MatcherAssert;
//import org.openqa.selenium.WebElement;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//
//import java.lang.reflect.InvocationTargetException;
//
//import static org.hamcrest.CoreMatchers.containsString;
//import static org.hamcrest.CoreMatchers.is;
//
////package com.itstep.automationpractice.steps;
////
////import com.itstep.automationpractice.pages.AbstractPage;
////import com.itstep.automationpractice.pages.AuthenticationPage;
////import com.itstep.automationpractice.selenium.Browser;
////import com.itstep.automationpractice.utils.ReflectionUtils;
////import io.cucumber.datatable.DataTable;
////import io.cucumber.java.en.And;
////import io.cucumber.java.en.Given;
////import io.cucumber.java.en.Then;
////import io.cucumber.java.en.When;
////import org.hamcrest.MatcherAssert;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebElement;
////import org.slf4j.Logger;
////import org.slf4j.LoggerFactory;
////
////import java.lang.reflect.InvocationTargetException;
////import java.lang.reflect.Type;
////import java.util.List;
////import java.util.Map;
////
////import static org.hamcrest.CoreMatchers.containsString;
////import static org.hamcrest.CoreMatchers.is;
////
//public class MyStepdefs2 {
////    private final Logger logger = LoggerFactory.getLogger(this.getClass());
////
////    private AuthenticationPage authenticationPage = new AuthenticationPage(Browser.getBrowser());
////    //  private AccountPage accountPage = new AccountPage(Browser.getBrowser());
////
////
////    @Given("user goes on  {string}")
////    public void userGoesOnHomePage(String pageName) {
////        Browser.getBrowser().navigate().to("http://automationpractice.com/index.php");
////        logger.info("user goes on e {}", pageName.toUpperCase());
////    }
////
////    @Given("user is on the {string}")
////    public void userIsOnTheHomePage(String pageName) throws InvocationTargetException, NoSuchMethodException, ClassNotFoundException, InstantiationException, IllegalAccessException {
////        AbstractPage page = ReflectionUtils.getPageObject(pageName);
////        MatcherAssert.assertThat(Browser.getBrowser().getCurrentUrl(), containsString(page.getPageURL()));
////        logger.info("user is on the {}", pageName.toUpperCase());
////    }
////
////
////    @And("{string} button is displayed on the {string}")
////    public void signInButtonIsDisplayedOnTheHomePage(String buttonName, String pageName) throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
////        String fieldName = buttonName.replace(" ", "");
////        WebElement button = ReflectionUtils.getWebElement(fieldName, pageName);
////
////        MatcherAssert.assertThat(button.isDisplayed(), is(true));
////
////        logger.info("{} button is displayed on the {}", buttonName.toUpperCase(), pageName.toUpperCase());
////    }
////
////    @And("user clicks {string} button on {string}")
////    public void userClicksSignInButtonHomePage(String buttonName, String pageName) throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
////        String fieldName = buttonName.replace(" ", "");
////        WebElement button = ReflectionUtils.getWebElement(fieldName, pageName);
////        button.click();
////
////        logger.info("User clicks {}", buttonName.toUpperCase());
////    }
////
////
////    @Then("{string} page is displayed")
////    public void authenticationPageIsDisplayed(String pageName) throws InvocationTargetException, NoSuchMethodException, ClassNotFoundException, InstantiationException, IllegalAccessException {
////        AbstractPage page = ReflectionUtils.getPageObject(pageName);
////        MatcherAssert.assertThat(Browser.getBrowser().getCurrentUrl(), containsString(page.getPageURL()));
////
////        logger.info("{} page is displayed", pageName.toUpperCase());
////    }
////
//////    @When("user adds {string} in {string} field on {string}")
//////    public void userAddsValidInputInLoginFormFieldOnAuthenticationPage(DataTable dataTable) throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
//////        List<Map<String,String>>listOfMaps =dataTable.asMaps();
//////        for (Map<String, String> map : listOfMaps){
//////        String field =map.get("field");
//////        String value=map.get("input");
//////        String fieldName = field.replace(" ", "");
////    //   ReflectionUtils.getWebElement(field, pageName).sendKeys(value);
////    //    logger.info("user adds {} and {} in {} field on {}", email, password,fieldName, pageName );
////          //  Browser.getBrowser().findElement(id("email")).sendKeys("hgghgh");
////          //  Browser.getBrowser().findElement(By.id("passwd")).sendKeys("12345");
//////            driver.findElement(By.id("email")).sendKeys(data.get("username"));
//////            driver.findElement(By.id("pass")).sendKeys(data.get("password"));
////
//////        }
//////
//////
//////
//////    }
////
//////    @And("user adds {string} in {string} field on {string}")
//////    public void userAddsValidInputInEmailFieldOnAuthenticationPage(String input, String email, String pageName) throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
//////        String login = email.replace(" ", "");
//////        WebElement emailField = ReflectionUtils.getWebElement(login, pageName);
//////        emailField.sendKeys("test@getnada.com");
//////
//////        logger.info("user adds {} in {} on {}", input.toUpperCase(), email.toUpperCase(), pageName.toUpperCase());
//////    }
////
////
//////    @And("user adds {string} in {string} field")
//////    public void userAddsInputInPasswordField(String input, String fieldName) throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
//////        String nameField = fieldName.replace(" ", "");
//////        WebElement passwordField = ReflectionUtils.getWebElement(nameField, "AuthenticationPage");
//////        passwordField.sendKeys("12345");
//////
//////
//private final Logger logger = LoggerFactory.getLogger(this.getClass());
//
//    @Given("user goes on  {string}")
//    public void userGoesOnHomePage(String pageName) {
//        Browser.getBrowser().navigate().to("http://automationpractice.com/index.php");
//        logger.info("user goes on {}", pageName.toUpperCase());
//    }
//    @Then("{string} is displayed")
//    public void homePageIsDisplayed(String pageName) throws InvocationTargetException, NoSuchMethodException, ClassNotFoundException, InstantiationException, IllegalAccessException {
//        AbstractPage page = ReflectionUtils.getPageObject(pageName);
//        MatcherAssert.assertThat(Browser.getBrowser().getCurrentUrl(), containsString(page.getPageURL()));
//        logger.info("{}  is displayed", pageName.toUpperCase());
//    }
//
//    @And("{string} is displayed on {string}")
//    public void searchBoxIsDisplayedOnHomePage(String buttonName, String pageName) throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
//        WebElement button = ReflectionUtils.getWebElement(buttonName, pageName);
//        MatcherAssert.assertThat(button.isDisplayed(), is(true));
//        logger.info("{} button is displayed on the {}", buttonName.toUpperCase(), pageName.toUpperCase());
//    }
//
//    @When("user adds {string} in {string} field on {string}")
//    public void userAddsProductInSearchFieldOnHomePage(String productName, String fieldName, String pageName) throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
//        WebElement element = ReflectionUtils.getWebElement(fieldName, pageName);
//        element.sendKeys("dress");
//        logger.info("user adds {} in {} field on {}", productName.toUpperCase(),fieldName.toUpperCase(), pageName.toUpperCase());
//
//    }
//
//    @And("user clicks {string} on {string}")
//    public void userClicksSearchButtonOnHomePage(String buttonName, String pageName) throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
//        WebElement button = ReflectionUtils.getWebElement(buttonName, pageName);
//        button.click();
//        logger.info("User clicks {} on {}", buttonName.toUpperCase(), pageName.toUpperCase());
//    }
//}
//
