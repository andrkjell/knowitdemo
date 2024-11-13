package com.example;

import com.example.pages.Partners;
import org.junit.jupiter.api.Test;

public class PartnersTests extends BaseTest {

    @Test
    public void testPartnersPageHeading() {
        Partners partnersPage = new Partners(driver);
        partnersPage.open();
        partnersPage.verifyHeadingText();
    }

    @Test
    public void testMicrosoftLink() {
        Partners partnersPage = new Partners(driver);
        partnersPage.open();
        partnersPage.verifyMicrosoftLink();
    }

    @Test
    public void testAWSLink() {
        Partners partnersPage = new Partners(driver);
        partnersPage.open();
        partnersPage.verifyAWSLink();
    }

    @Test
    public void testGoogleCloudLink() {
        Partners partnersPage = new Partners(driver);
        partnersPage.open();
        partnersPage.verifyGoogleCloudLink();
    }
}