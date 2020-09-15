package com.itstep.automationpractice.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ErrorAuthenticationPage extends AbstractPage {
    @FindBy(xpath = "//p[contains(text(),'There is 1 error')]")
    private WebElement errorMessage;

    public ErrorAuthenticationPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getErrorMessage() {
        return errorMessage;
    }

    @Override
    public String getPageURL() {
        return "http://automationpractice.com/index.php?controller=authentication";
    }

}
