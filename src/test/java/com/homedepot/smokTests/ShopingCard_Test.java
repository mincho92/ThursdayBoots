package com.homedepot.smokTests;
import com.homedepot.base.Base;
import com.homedepot.pageObjects.HomeDecorAnaFurnitureTab;
import com.homedepot.pageObjects.popups.AddedToCard_PopUp;
import com.homedepot.pageObjects.popups.SaveToFavoritesPopup;
import com.homedepot.pageObjects.sections.ShopingCardPage;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.security.PublicKey;
import java.util.List;

public class ShopingCard_Test extends Base {
     private HomeDecorAnaFurnitureTab homeDecorAnaFurnitureTab = new HomeDecorAnaFurnitureTab();
     private ShopingCardPage shopingCardPage = new ShopingCardPage();
     private AddedToCard_PopUp addedToCard_popUp = new AddedToCard_PopUp();
     private SaveToFavoritesPopup saveToFavoritesPopup = new SaveToFavoritesPopup();
    @Test
    public void addItemToShopingCard(){
            homeDecorAnaFurnitureTab.selectItemAndAddToShopingCard(1);
            library.waitFor(2);
            library.switchToIframe(By.cssSelector(".thd-overlay-frame"));
            String actualResult = library.find("shoping card header",By.xpath("//span[@class='u__husky']")).getText();
            System.out.println(actualResult);
            Assert.assertEquals("1 Item Added to Cart",actualResult);
        }
    @Test
    public void increaseItemQuantity(){
        homeDecorAnaFurnitureTab.selectItemAndAddToShopingCard(2);
        addedToCard_popUp.ViewCard();
        library.switchToDefaultContent();
        By itemQuantityBox = shopingCardPage.increseItemQuantity("3");
        String value = library.find("quantitybox,",itemQuantityBox).getAttribute("value");
        Assert.assertEquals("3",value);
    }

    @Test
    public void removeItemFromShopingCardTest(){
       homeDecorAnaFurnitureTab.selectItemAndAddToShopingCard(1);
       addedToCard_popUp.ViewCard();
       shopingCardPage.removeItem();
       String actual = library.find("Shopping card mssg",By.cssSelector("[data-automation-id=\"appEmptyShoppingCartText\"]")).getText();
       Assert.assertEquals("Your shopping cart is empty.",actual);
    }
    @Test
    public void saveToFavorites_Test(){
        homeDecorAnaFurnitureTab.selectItemAndAddToShopingCard(1);
        addedToCard_popUp.ViewCard();
        shopingCardPage.saveToFavorites();
        saveToFavoritesPopup.viewFavorites();
        List<WebElement> savedFavoritesItem = library.findAll("Saved favorite items",By.cssSelector(".grid>list-item-details"));
        Assert.assertTrue(savedFavoritesItem.size()>0);
    }
    @Test
    public void addingListoFavorites(){
        homeDecorAnaFurnitureTab.selectItemAndAddToShopingCard(2);
        addedToCard_popUp.ViewCard();
        shopingCardPage.saveToFavotites1();
        shopingCardPage.createNewFavoritesList();

        String actual = library.find("Nice choice! We've saved this item to your favorites mssg",By.cssSelector(".alert-inline__message")).getText();
        Assert.assertEquals("Nice choice! We've saved this item to your favorites.",actual);
    }

    @Test
    public void deleteFromFavorites(){


    }

}

