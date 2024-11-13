package com.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Partners extends BasePage {

    private static final String URL = "https://www.knowit.se/om-knowit/partners/";

    @FindBy(css = "h1.chakra-heading.css-13y4oq7")
    private WebElement heading;

    @FindBy(css = "a.chakra-linkbox__overlay.css-1hnz6hu[href='/om-knowit/partners/microsoft/']")
    private WebElement microsoftLink;

    @FindBy(css = "a.chakra-linkbox__overlay.css-1hnz6hu[href='/om-knowit/partners/amazon-web-services/']")
    private WebElement awsLink;

    @FindBy(xpath = "//*[@id='main-content']/div/div[3]/section[2]/div/div/div/div/div[3]/h3/a")
    private WebElement specificElement;

    public Partners(WebDriver driver) {
        super(driver);
    }

    public void open() {
        open(URL);
    }

    public void verifyHeadingText() {
        String expectedHeading = "Vi samarbetar med ledande partners";
        String actualHeading = heading.getText();
        assertEquals(expectedHeading, actualHeading);
    }

    public void verifyMicrosoftLink() {
        assertTrue(microsoftLink.isDisplayed(), "Microsoft link is not displayed.");
        assertEquals("Microsoft", microsoftLink.getText(), "Microsoft link text does not match.");
    }

    public void verifyAWSLink() {
        assertTrue(awsLink.isDisplayed(), "AWS link is not displayed.");
        assertEquals("AWS", awsLink.getText(), "AWS link text does not match.");
    }
    //using xpath to locate the google cloud link only for demonstration as css is better in this scenario.
    public void verifyGoogleCloudLink() {
        assertTrue(specificElement.isDisplayed(), "Google cloud link text does not match.");
    }
}