package com.homedepot.pageObjects.sections;

import com.homedepot.base.Base;
import com.homedepot.common.Library;
import org.openqa.selenium.By;

public class ProductDetailsPage extends Base {
    private Library library;
    public ProductDetailsPage(){

        library = new Library();
    }
    public void addToCard(){

        library.click("Add to card button", By.xpath("//span[text()='Add to Cart']"));
    }
    public void addtoCardEasy(String elemenName,By by){
        library.click(elemenName, by);
    }
}
