package com.example;

import com.example.pages.HomePage;
import org.junit.jupiter.api.Test;

public class HomePageTests extends BaseTest {

    @Test
    public void testHomePageTitle() {
        HomePage homePage = new HomePage(driver);
        homePage.open();
        homePage.verifyTitle();
    }

    @Test
    public void testHomeLink() {
        HomePage homePage = new HomePage(driver);
        homePage.open();
        homePage.verifyHomeLink();
    }

    @Test
    public void testSearchButtonAndSearchBar() {
        HomePage homePage = new HomePage(driver);
        homePage.open();
        homePage.acceptCookies();
        homePage.verifySearchButton();
        homePage.clickSearchButton();
        homePage.verifySearchBar();
    }
}
