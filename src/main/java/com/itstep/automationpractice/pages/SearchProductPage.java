package com.itstep.automationpractice.pages;

import org.openqa.selenium.WebDriver;

public class SearchProductPage extends AbstractPage {
    public SearchProductPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public String getPageURL() {
        return "http://automationpractice.com/index.php?controller=search&orderby=position&orderway=desc&search_query=dress&submit_search=";
    }
}
