package com.homedepot.base;

import com.homedepot.common.Library;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

public class Base {

    public Library library;
    public WebDriver driver;
    @Before
    public void setup(){
        library = new Library();
        driver = library.openBrowser();
    }
    @After
    public void tearDown(){
        driver.quit();
    }
}
