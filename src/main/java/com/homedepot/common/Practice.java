package com.homedepot.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Practice {

    private By productList = By.cssSelector(".product-result__wrapped-results>div>div");
    private Library library;
    public Practice(){
        library = new Library();
    }
    public void hoverOverItemThenAddToCard(int elemetIndex)
    {
        List<WebElement> items = library.findAll("items",productList);
        library.scrollToElement(items.get(elemetIndex));
        library.hoverOver("Add to card button",items.get(elemetIndex));
        library.click("Addto card Button", By.xpath("//*[@class='product-result__wrapped-results']/div/div/div[2]/div[6]/div/div[2]/div/button/span[1]"));
        library.switchToIframe(By.cssSelector(".thd-overlay__content.col__12-12.loading iframe"));
    }
}
