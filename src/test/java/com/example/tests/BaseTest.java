package com.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class BaseTest {

    protected WebDriver driver;

    @BeforeEach
    public void setUp() {
        // Chromedriver
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(chromeOptions);

        //FireFoxDriver
        // System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
        // FirefoxOptions firefoxOptions = new FirefoxOptions();
        // firefoxOptions.setCapability("marionette", true);
        // driver = new FirefoxDriver(firefoxOptions);
    }

    @AfterEach
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
