package com.itstep.automationpractice.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends AbstractPage {

    @FindBy(xpath = "//span[contains(text(),'Tatiana Silivestru')]")
    private WebElement accountButton;

    @FindBy(xpath = "//h1[@class='page-heading']")
    private WebElement myAccountPage;

    @FindBy(xpath = "//a[@class='logout']")
    private WebElement SignOutButton;

    public MyAccountPage(WebDriver driver) {
        super(driver);


    }

    public WebElement getMyAccountPage() {
        return myAccountPage;
    }

    public WebElement getAccountButton() {
        return accountButton;
    }

    public WebElement getSignOut() {
        return SignOutButton;
    }

    @Override
    public String getPageURL() {
        return "http://automationpractice.com/index.php?controller=my-account";
    }
}
