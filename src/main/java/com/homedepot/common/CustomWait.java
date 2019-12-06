package com.homedepot.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class CustomWait {


    public List<WebElement> waitUntillAllPresent(By by) {
        WebDriverWait wait = new WebDriverWait(Library.driver,7);
        return wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
    }
    public WebElement waitUntilPresent(By by) {
        WebDriverWait wait = new WebDriverWait(Library.driver, 7);
        return wait.until(ExpectedConditions.presenceOfElementLocated(by));
    }

    public WebElement waitUntilClickable(By by) {
        try {
            WebDriverWait wait = new WebDriverWait(Library.driver, 7);
            return wait.until(ExpectedConditions.elementToBeClickable(by));
        } catch (Exception e) {
            return waitUntilPresent(by);

        }
    }
    public void waitUntilDisappears(By by){
        WebDriverWait wait = new WebDriverWait(Library.driver,7);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(by));
    }
    public void waitUntilClickable(Object object) {
        if (object instanceof By) {
            WebDriverWait wait = new WebDriverWait(Library.driver, 7);
            wait.until(ExpectedConditions.elementToBeClickable((By) object));
        }
        if (object instanceof WebElement) {
            WebDriverWait wait = new WebDriverWait(Library.driver, 7);
            wait.until(ExpectedConditions.elementToBeClickable((WebElement) object));
        }
    }
    public boolean isClickible(Object object) {
        boolean isClicible;
        if (object instanceof By) {
            WebDriverWait wait = new WebDriverWait(Library.driver, 7);
            wait.until(ExpectedConditions.elementToBeClickable((By) object));
            isClicible=true;
        }
       else if (object instanceof WebElement) {
            WebDriverWait wait = new WebDriverWait(Library.driver, 7);
            wait.until(ExpectedConditions.elementToBeClickable((WebElement) object));
            isClicible = true;
       }else isClicible = false;
       return isClicible;
    }
    public WebElement waitUntilVisible(By by) {
        WebDriverWait wait = new WebDriverWait(Library.driver, 7);
        return wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }
    public WebElement waitUntilVisible(WebElement element) {
        WebDriverWait wait = new WebDriverWait(Library.driver, 7);
        return wait.until(ExpectedConditions.visibilityOf(element));
    }
}
