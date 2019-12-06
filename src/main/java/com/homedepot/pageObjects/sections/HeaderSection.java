package com.homedepot.pageObjects.sections;

import com.homedepot.base.Base;
import com.homedepot.common.Library;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HeaderSection extends Base {

    private Library library;
    public HeaderSection(){

        library = new Library();
    }
    public List<WebElement> getHeaderTaskLinks_test(){
        List<WebElement> header_task_links = library.findAll("header task links", By.cssSelector("#TasklinkList>li>a"));
        return header_task_links;
    }
    public List<WebElement> getHeaderTabs(){
         List<WebElement> header_tabs = library.findAll("Header Tabs",By.cssSelector(".ShoppingLinks>li"));
        return header_tabs;
    }
    public List<WebElement> getHeaderTaskLinks_test2(){
        List<WebElement> header_task_links = library.findAll("header task links", By.xpath("//div[@class='product-result__wrapped-results']/div/div"));
        return header_task_links;
    }
}
