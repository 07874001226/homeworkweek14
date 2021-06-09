package com.nopcommerce.demo.utility;

import com.nopcommerce.demo.basepage.BasePage;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Random;

public class Utility extends BasePage {
    public void clickOnElement(By by) {
        driver.findElement(by).click();
    }

    public void clickOnElement(WebElement element) {
        element.click();
    }

    public String getTextFromElement(By by) {
        return driver.findElement(by).getText();
    }

    public String getTextFromElement(WebElement element) {
        //String text = driver.findElement(by).getText();// another way to write next line
        return element.getText();
    }

    public void selectByValueFromDropDown(By by, String value) {
        Select select = new Select(driver.findElement(by));
        select.selectByValue(value);
    }

    public void selectByValueFromDropDown(WebElement element, String value) {
        Select select = new Select(element);
    }

    public void selectByIndex(By by, int value) {
        Select select = new Select(driver.findElement(by));
        select.selectByIndex(value);
    }

    public void selectByIndex(WebElement element, int value) {
        Select select = new Select(element);
    }

    public WebElement mouseHover(By by) {
        Actions actions = new Actions(driver);
        WebElement move = driver.findElement(by);
        actions.moveToElement(move).perform();
        return move;
    }

    public void sendTextToElement(By by, String text) {
        driver.findElement(by).sendKeys(text);
    }

    public void sendTextToElement(WebElement element, String text) {
        element.sendKeys();
    }

    public void sendTextToElement(By by, int num) {
        driver.findElement(by).sendKeys();
    }

    public void sendTextToElement(WebElement element, int num) {
        element.sendKeys();
    }

    public void clearValue(By by) {
        driver.findElement(by).clear();
    }

    public void clearValue(WebElement element) {
        element.clear();
    }

    public String getUrl() {
        String actualUrl = driver.getCurrentUrl();
        return actualUrl;
    }

    public Random randomGenerator = new Random();
    public int randomInt = randomGenerator.nextInt(1000);

    public <BY, attribute> String getAttributefromelement(By by, String value) {
        return driver.findElement(by).getAttribute("value");
    }

    // public Random randomGenerator = new Random();
    //  public int randomInt = randomGenerator.nextInt(1000);

    public WebElement waitUntilvisibilityofElementLocated(By by, int timeout) {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        return element;
    }
    public void selectByIndexFromDropDown(By by, int value) {
        Select select = new Select(driver.findElement(by));
        select.selectByIndex(value);
    }
    public void selectByIndexFromDropDown(WebElement element, int value) {
        Select select = new Select(element);
    }

    public void selectByVisibleTextFromDRopDown(By by, int value) {
        Select select = new Select(driver.findElement(by));
        select.selectByIndex(value);
    }
    public void selectByVisibleTextFromDRopDown(WebElement element, int value) {
        Select select = new Select(element);
    }
    public void clear(By by) {
        driver.findElement(by).clear();
    }
    public void clear(WebElement element) {
        element.clear();
    }
    public void alert(By by) {
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }
    public void alert(WebElement element) {
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }
    public List getListfromwebelements(By by ){
        return driver.findElements(by);
    }
}

