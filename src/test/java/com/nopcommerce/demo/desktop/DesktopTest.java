package com.nopcommerce.demo.desktop;

import com.nopcommerce.demo.pages.DesktopPage;
import com.nopcommerce.demo.testbase.TestBase;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class DesktopTest extends TestBase {
    DesktopPage desktopPage = new DesktopPage();
    @Test
    public void VerifytheProductwillAddedSuccessfully() throws InterruptedException {
        Thread.sleep(2000);
        desktopPage.clickOnComputerLink();
        Thread.sleep(2000);
        desktopPage.clickOnDesktopLink();
        Thread.sleep(2000);
        desktopPage.shortByAscendingOrder();
        Thread.sleep(2000);
        desktopPage.addToCart();
        desktopPage.verifyBuildYourOwnComputer();
        desktopPage.selectTheProcesser();
        desktopPage.setSelectRam();
        Thread.sleep(1000);
        desktopPage.clickOnHdd();
        desktopPage.clickOnOsRadio();
        desktopPage.clickOnMicrosoftOffice();
        Thread.sleep(1000);
        desktopPage.clickOnMicrosoftOffice();
        desktopPage.clickOnTotalCommender();
        desktopPage.verifyThePrice();
        Thread.sleep(1000);
        desktopPage.clickOnAddtoCartButton();
        desktopPage.verifyTopGreenBarMessage();
    }


}