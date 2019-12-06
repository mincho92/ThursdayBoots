package com.homedepot.pageObjects.sections;

import com.homedepot.common.Library;
import com.homedepot.pageObjects.HomeDecorAnaFurnitureTab;
import com.homedepot.pageObjects.popups.AddedToCard_PopUp;
import com.homedepot.pageObjects.popups.SaveToFavoritesPopup;
import org.openqa.selenium.By;

public class ShopingCardPage {

    Library library;
    private SaveToFavoritesPopup saveToFavoritesPopup = new SaveToFavoritesPopup();
    public ShopingCardPage(){
        library = new Library();
    }
    public void clickOut(){
        library.click("check out button", By.xpath("(//button[@class='bttn bttn--primary'])[3]"));
    }
    public void removeItemFromTheCard(){
        library.click("remove Item button",By.cssSelector("[class='list__link'][data-automation-id='removeItem']"));
    }
    public By increseItemQuantity(String quantity){
        By by = By.cssSelector("[type='tel']");
        library.click("quantity box",by);
        library.find("Quantitybox",by).clear();
        library.enter("quantitybox",quantity,by);
    return by;
    }
    public void removeItem(){

    library.click("removeItem",By.cssSelector("[data-automation-id='removeItem']"));
    }
    public void saveToFavorites(){
        library.click("save to favorites button",By.cssSelector("[data-automation-id='itemActionLinksSaveToFavouritesLink']"));
        saveToFavoritesPopup.save();
    }
    public void saveToFavotites1(){
        library.click("save to favorites button",By.cssSelector("[data-automation-id='itemActionLinksSaveToFavouritesLink']"));
    }
    public void createNewFavoritesList(){
        library.click("click on create new button",By.xpath("//a[text()='Create New']"));
        library.enter(" enter list name","favorites1",By.cssSelector("#twoClickListName"));
    }
}
