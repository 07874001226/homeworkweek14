package com.nopcommerce.demo.computer;

import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.testbase.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComputerTest extends TestBase {

    ComputerPage computerPage = new ComputerPage();

    @Test
    public void VerifytheProductwillarrangeinAlphabeticalOrder() throws InterruptedException {
        Thread.sleep(2000);
        computerPage.clickOnComputerlinkPage();
        Thread.sleep(2000);
        computerPage.clickOnDesktoplinkPage();
        Thread.sleep(2000);
        computerPage.shortByDescendingOrder();
        Thread.sleep(2000);
        computerPage.verifyProductArrangeZtoA();
    }
}

