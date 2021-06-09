package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Assert;

public class DesktopPage extends Utility {
    By computerLink = By.linkText("Computers");
    By desktopLink = By.linkText("Desktops");
    By shortByAscending = By.xpath("//select[@id='products-orderby']");
    By addToCart = By.xpath("//div[@class='item-box'][1]//button[text()='Add to cart']");
    By buildYourOwnComputer = By.ByCssSelector.xpath("//h1[contains(text(),'Build your own computer')]");
    By selectProcesser = By.xpath("//select[@id='product_attribute_1']");
    By selectRam = By.xpath("//select[@id='product_attribute_2']");
    By hddRadio = By.xpath("//dd[@id='product_attribute_input_3']//label[text()='400 GB [+$100.00]']");
    By osRadio = By.xpath("//input[@id='product_attribute_4_9']");
    By microSoftOffice = By.xpath("//input[@id='product_attribute_5_10']");
    By totalCammandor = By.xpath("//input[@name='product_attribute_5' and @id='product_attribute_5_12']");
    By verifyPrice = By.xpath("//span[text()='$1,475.00']");
    By addCartButton = By.xpath("//button[@id='add-to-cart-button-1']");
    By verifyMessage = By.xpath("//p[text()='The product has been added to your ']");

    public void clickOnComputerLink() {
        clickOnElement(computerLink);
    }

    public void clickOnDesktopLink() {
        clickOnElement(desktopLink);
    }

    public void shortByAscendingOrder() {
        selectByIndex(shortByAscending, 1);
    }

    public void addToCart() {
        clickOnElement(addToCart);
    }

    public void verifyBuildYourOwnComputer() {
        String expectedText = "Build your own computer";
        String actualText = getTextFromElement(buildYourOwnComputer);
        Assert.assertEquals(expectedText, actualText);
    }


    public void selectTheProcesser() {
        selectByIndex(selectProcesser, 1);
    }

    public void setSelectRam() {
        selectByIndex(selectRam, 3);
    }

    public void clickOnHdd() {
        clickOnElement(hddRadio);
    }

    public void clickOnOsRadio() {
        clickOnElement(osRadio);
    }

    public void clickOnMicrosoftOffice() {
        clickOnElement(microSoftOffice);
    }

    public void clickOnTotalCommender() {
        clickOnElement(totalCammandor);
    }

    public void verifyThePrice() {
        String expectedPrice = "$1,475.00";
        String actualPrice = getTextFromElement(verifyPrice);
        Assert.assertEquals(expectedPrice, actualPrice);
    }

    public void clickOnAddtoCartButton() {
        clickOnElement(addCartButton);
    }

    public void verifyTopGreenBarMessage() {
        String expectedMessage = "The product has been added to your shopping cart";
        String actualMessage = getTextFromElement(verifyMessage);
        Assert.assertEquals(expectedMessage, actualMessage);
    }
}
