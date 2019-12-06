package com.homedepot.pageObjects;

import com.homedepot.common.Library;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;


public class ProductListPage {
     private Library library;
     public ProductListPage(){
         library = new Library();
     }
     public void selectProduct(int index){
         List<WebElement> items = library.findAll("items", By.cssSelector(".product-result__wrapped-results>div<div"));
         library.scrollToElement(items.get(index));
         items.get(index).click();
         library.switchTab();
     }


     private By productList = By.cssSelector(".product-result__wrapped-results>div>div");
    public void selectProductEasy(){
        library.click("click to item",By.cssSelector("img[alt='Riemann 2-Piece Microsuede Blue Mist Sectional']"));
        library.switchTab();

    }
    public void selectProducEasy2(String elementName,By by){
        library.click(elementName,by);

    }

     public void hoverOverItemThenAddToCard(int elemetIndex)
     {
         List<WebElement> items = library.findAll("items",productList);
         library.scrollToElement(items.get(elemetIndex));
         library.hoverOver("Add to card button",items.get(elemetIndex));
         library.click("Addto card Button",By.xpath("//*[@class='product-result__wrapped-results']/div/div/div[2]/div[6]/div/div[2]/div/button/span[1]"));
     }
     public By getProductList_Locator(){
         return productList;
     }

}
