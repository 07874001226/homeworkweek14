package com.nopcommerce.demo.topmenutest;

import com.nopcommerce.demo.basepage.BasePage;
import com.nopcommerce.demo.pages.TopMenuPage;
import com.nopcommerce.demo.testbase.TestBase;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TopMenuTest extends TestBase {

    TopMenuPage topMenuPage = new TopMenuPage();

    @Test
    public void verifyUserShouldNavigateToTopMenuPage() throws InterruptedException {
       // Thread.sleep(3000);
        topMenuPage.selectMenu("Computers");
        String expectedPageMessage = "Computers";
        String actualPageMessage = topMenuPage.verifyComputerPageNavigation();
        Assert.assertEquals(actualPageMessage,expectedPageMessage);

        topMenuPage.selectMenu("Electronics");
        String expectedPageMessage1 = "Electronics";
        String actualPageMessage1 = topMenuPage.verifyElectronicsPageNavigation();
        Assert.assertEquals(actualPageMessage1,expectedPageMessage1);

        topMenuPage.selectMenu("Apparel");
        String expectedPageMessage2 = "Apparel";
        String actualPageMessage2 = topMenuPage.verifyApparelPageNavigation();
        Assert.assertEquals(actualPageMessage2,expectedPageMessage2);

        topMenuPage.selectMenu("Digital downloads");
        String expectedPageMessage3 = "Digital downloads";
        String actualPageMessage3 = topMenuPage.verifyDigitalDownloadsPageNavigation();
        Assert.assertEquals(actualPageMessage3,expectedPageMessage3);

        topMenuPage.selectMenu("Books");
        String expectedPageMessage4 = "Books";
        String actualPageMessage4 = topMenuPage.verifyBooksPageNavigation();
        Assert.assertEquals(actualPageMessage4,expectedPageMessage4);

        topMenuPage.selectMenu("Jewelry");
        String expectedPageMessage5 = "Jewelry";
        String actualPageMessage5 = topMenuPage.verifyJewelryPageNavigation();
        Assert.assertEquals(actualPageMessage5,expectedPageMessage5);

        topMenuPage.selectMenu("Gift Cards");
        String expectedPageMessage6 = "Gift Cards";
        String actualPageMessage6 = topMenuPage.verifyGiftCardsPageNavigation();
        Assert.assertEquals(actualPageMessage6,expectedPageMessage6);
    }

}


