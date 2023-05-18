package lib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class PageAction {
    public boolean isLocatorPresent(WebElement elements) {
        return elements.isDisplayed();
    }

    public String getAttributrText(WebDriver driver, By locator, String attributeName){
        return driver.findElement(locator).getAttribute(attributeName);
    }

    public void sendInput(WebDriver driver, By locator, String value) {
        driver.findElement(locator).sendKeys(value);
    }

    public void clearInput(WebDriver driver, By locator){
        driver.findElement(locator).clear();
    }

    public void clickOnElement(WebDriver driver, By locator) {
        driver.findElement(locator).click();
    }

    public void selectOptionByVisibleText(WebDriver driver, By locator, String text) {
        Select select  = new Select(driver.findElement(locator));
        select.selectByVisibleText(text);
    }
    public void selectOptionByIndex(WebDriver driver, By locator, int index) {
        Select select  = new Select(driver.findElement(locator));
        select.selectByIndex(index);
    }
    public void selectOptionByValue(WebDriver driver, By locator, String value) {
        Select select  = new Select(driver.findElement(locator));
        select.selectByValue(value);
    }

    public void moveToElement(WebDriver driver, By locator){
        Actions actions= new Actions(driver);
        actions.moveToElement(driver.findElement(locator)).build().perform();
    }
}
