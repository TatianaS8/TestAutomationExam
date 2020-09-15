package com.itstep.automationpractice.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AuthenticationPage extends AbstractPage {
    @FindBy(xpath = "//h1[@class='page-heading']")
    private WebElement authenticationForm;

    @FindBy(xpath = "//input[@id='email']")
    private WebElement email;
    @FindBy(xpath = "//input[@id='passwd']")
    private WebElement password;
    @FindBy(xpath = "//p[@class='submit']//span[1]")
    private WebElement SignInButton;
    @FindBy(xpath = "//form[@id='login_form']")
    private WebElement loginForm;

    public AuthenticationPage(WebDriver driver) {
        super(driver);

    }

    public WebElement getAuthenticationForm() {
        return authenticationForm;
    }

    public WebElement getEmail() {
        return email;
    }

    public WebElement getPassword() {
        return password;
    }

    public WebElement getSignInButton() {
        return SignInButton;
    }

    @Override
    public String getPageURL() {
        return "http://automationpractice.com/index.php?controller=authentication&back=my-account";
    }
}