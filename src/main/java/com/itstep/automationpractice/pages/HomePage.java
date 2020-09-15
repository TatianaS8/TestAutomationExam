package com.itstep.automationpractice.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends AbstractPage {
    @FindBy(id = "search_query_top")
    private WebElement SearchBox;

    @FindBy(xpath = "//a[@class='login']")
    private WebElement SignInButton;

    @FindBy(xpath = "//button[@name='submit_search']")
    private WebElement SearchButton;

    public HomePage(WebDriver driver) {
        super(driver);

    }

    public WebElement getSearchButton() {
        return SearchButton;
    }

    public WebElement getSearchBox() {
        return SearchBox;
    }

    public WebElement getSignIn() {
        return SignInButton;
    }

    @Override
    public String getPageURL() {
        return "http://automationpractice.com/index.php";
    }

}
