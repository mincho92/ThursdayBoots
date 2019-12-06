package com.homedepot.pageObjects.sections;
import com.homedepot.base.Base;
import com.homedepot.common.Library;
import com.homedepot.pageObjects.HomeDecorAnaFurnitureTab;
import com.homedepot.pageObjects.ProductListPage;
import com.homedepot.pageObjects.popups.AddedToCard_PopUp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;


public class HomePage extends Base {
    private HeaderSection headerSection = new HeaderSection();
    private HomeDecorAnaFurnitureTab homeDecorAnaFurnitureTab = new HomeDecorAnaFurnitureTab();
    private ProductListPage productListPage = new ProductListPage();
    private Library library;

    public HomePage(){

        library = new Library();
    }

    public void goToSighInPage(){
        library.click("My account button", By.cssSelector("div[class='headerMyAccountTitle MyAccount__status hide show--sm']"));
        library.click("sign in button", By.cssSelector("[class='bttn bttn--primary']"));
    }


        public void searchForItem(String itemName){
        library.enter("search box",itemName,By.cssSelector("#headerSearch"));
        library.click("search click button",By.cssSelector("#headerSearchButton"));
        }

        public void clickonItemCard(){
        library.click("Item card",By.cssSelector(".MyCart"));
        }

}
