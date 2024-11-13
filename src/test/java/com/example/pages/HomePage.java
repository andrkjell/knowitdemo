package com.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class HomePage extends BasePage {

    private static final String URL = "https://www.knowit.se/";

    @FindBy(css = "a.chakra-link.css-1qzfo27[href='/']")
    private WebElement homeLink;

    @FindBy(css = "button.chakra-button.css-4im0nw")
    private WebElement searchButton;

    @FindBy(css = "input.chakra-input.css-i8q7qq[type='search']")
    private WebElement searchBar;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void open() {
        open(URL);
    }

    public void verifyTitle() {
        String expectedTitle = "It-företag med konsulttjänster i hela Norden | Knowit";
        String actualTitle = driver.getTitle();
        assertThat(actualTitle, containsString(expectedTitle));
    }

    public void verifyHomeLink() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(homeLink));
        assertTrue(homeLink.isDisplayed(), "The home link is not displayed.");
        wait.until(ExpectedConditions.elementToBeClickable(homeLink));
        assertTrue(homeLink.isEnabled(), "The home link is not clickable.");
    }

    public void verifySearchButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(searchButton));
        assertTrue(searchButton.isDisplayed(), "The search button is not displayed.");
        wait.until(ExpectedConditions.elementToBeClickable(searchButton));
        assertTrue(searchButton.isEnabled(), "The search button is not clickable.");
    }

    public void clickSearchButton() {
        searchButton.click();
    }

    public void verifySearchBar() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(searchBar));
        assertTrue(searchBar.isDisplayed(), "The search bar is not displayed.");
    }
}
