package com.homedepot.smokTests;
import com.homedepot.base.Base;
import com.homedepot.pageObjects.ProductListPage;
import com.homedepot.pageObjects.popups.AddedToCard_PopUp;
import com.homedepot.pageObjects.sections.HomePage;
import com.homedepot.pageObjects.sections.ProductDetailsPage;
import com.homedepot.pageObjects.sections.SecureCheckOutPage;
import com.homedepot.pageObjects.sections.ShopingCardPage;
import org.junit.Test;

public class CheckOut_Test  extends Base {

    private HomePage homePage = new HomePage();
    private ProductListPage productListPage = new ProductListPage();
    private AddedToCard_PopUp addedToCard_popUp = new AddedToCard_PopUp();
    private SecureCheckOutPage secureCheckOutPage = new SecureCheckOutPage();
    private ProductDetailsPage productDetailsPage = new ProductDetailsPage();
    private ShopingCardPage shopingCardPage = new ShopingCardPage();

    @Test
    public void checkOutTest(){
        homePage.searchForItem("Couch");
        productListPage.selectProductEasy();
        productDetailsPage.addToCard();
        addedToCard_popUp.checkout();
        secureCheckOutPage.placeOrder();

    }

}
