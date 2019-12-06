package com.homedepot.pageObjects.popups;
import com.homedepot.common.Library;
import org.openqa.selenium.By;

public class AddedToCard_PopUp {

    private Library library;
    public AddedToCard_PopUp(){
        library = new Library();
    }

    public void ViewCard(){
        library.switchToIframe(By.cssSelector(".thd-overlay-frame"));
        library.click("view card button",By.cssSelector(".u__default-link.bttn.bttn--primary.bttn--view-cart-link"));
    }
    public void checkout(){
        library.switchToIframe(By.cssSelector(".thd-overlay-frame"));
        library.click("checkout  button",By.xpath("//span[text()='Checkout']"));
        library.click("check out as guest button",By.xpath("//span[text()='Checkout as a Guest']"));
    }
}
