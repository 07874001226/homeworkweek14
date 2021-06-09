package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TopMenuPage extends Utility {
    By computerLink = By.linkText("Computers");
    By verifyComputerPageNavigation = By.partialLinkText("Computers");
    By electronicsLink = By.linkText("Electronics");
    By verifyElectronicsPageNavigation = By.partialLinkText("Electronics");
    By apparelLink = By.linkText("Apparel");
    By verifyApparelPageNavigation = By.partialLinkText("Apparel");
    By digitalDownloadsLink = By.linkText("Digital downloads");
    By verifyDigitalDownloadsPageNavigation = By.partialLinkText("Digital downloads");
    By booksLink = By.linkText("Books");
    By verifyBooksPageNavigation = By.partialLinkText("Books");
    By jewelryLink = By.linkText("Jewelry");
    By verifyJewelryPageNavigation = By.partialLinkText("Jewelry");
    By giftcardsLink = By.linkText("Gift Cards");
    By verifyGiftCardsPageNavigation = By.partialLinkText("Gift Cards");


    public void selectMenu(String menu) throws InterruptedException {
        // Thread.sleep(1000);
        if (menu == "Computers") {
            clickOnElement(computerLink);
        } else if (menu == "Electronics") {
            clickOnElement(electronicsLink);
        } else if (menu == "Apparel") {
            clickOnElement(apparelLink);
        } else if (menu == "Digital downloads") {
            clickOnElement(digitalDownloadsLink);
        } else if (menu == "Books") {
            clickOnElement(booksLink);
        } else if (menu == "Jewelry") {
            clickOnElement(jewelryLink);
        } else if (menu == "Gift Cards") {
            clickOnElement(giftcardsLink);
        }
    }

    public String verifyComputerPageNavigation() {
        return getTextFromElement(verifyComputerPageNavigation);
    }

    public String verifyElectronicsPageNavigation() {
        return getTextFromElement(verifyElectronicsPageNavigation);
    }

    public String verifyApparelPageNavigation() {
        return getTextFromElement(verifyApparelPageNavigation);
    }

    public String verifyDigitalDownloadsPageNavigation() {
        return getTextFromElement(verifyDigitalDownloadsPageNavigation);
    }

    public String verifyBooksPageNavigation() {
        return getTextFromElement(verifyBooksPageNavigation);
    }

    public String verifyJewelryPageNavigation() {
        return getTextFromElement(verifyJewelryPageNavigation);
    }

    public String verifyGiftCardsPageNavigation() {
        return getTextFromElement(verifyGiftCardsPageNavigation);
    }

}
