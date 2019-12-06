package com.thursdayBoots.smokeTests;

import com.thursdayBoots.commons.Library;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class AboutPageTest {

    private Library library;


    public AboutPageTest(){
        library=new Library();

    }

    public void testAboutPage(){
        WebDriver driver=library.openBrowser();
        WebElement aboutPageButton = driver.findElement(By.cssSelector("[class='nav-item  last   ']"));
        aboutPageButton.click();
        library.waitFor(2);
        library.passOrFail(driver.getTitle().equals("Our Story | Thursday Boot Company"));
        driver.quit();
    }

}
