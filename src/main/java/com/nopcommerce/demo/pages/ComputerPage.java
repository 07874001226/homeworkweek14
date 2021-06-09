package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComputerPage extends Utility {
    By computerLink = By.linkText("Computers");
    By desktopLink = By.linkText("Desktops");
    By shortByDescending = By.xpath("//select[@id='products-orderby']");
    By productVerifyByZtoA = By.xpath("//h2[@class='product-title']");


    public void clickOnComputerlinkPage() {
        clickOnElement(computerLink);

    }

    public void clickOnDesktoplinkPage() {
        clickOnElement(desktopLink);
    }

    public void shortByDescendingOrder() {
        selectByIndex(shortByDescending, 2);
    }

    public void verifyProductArrangeZtoA() {
        List<WebElement> product;
        product = getListfromwebelements(productVerifyByZtoA);
        List<String> productList = new ArrayList<>();
        for (WebElement productname : product) {
            productList.add(productname.getText());
        }
        List<String> tempList = new ArrayList<>();
        tempList.addAll(productList);
        Collections.sort(tempList, Collections.reverseOrder());
        System.out.println(productList);
        System.out.println(tempList);
        Assert.assertEquals(productList, tempList);
    }
}
