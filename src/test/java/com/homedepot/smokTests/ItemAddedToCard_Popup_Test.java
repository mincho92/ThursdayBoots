package com.homedepot.smokTests;

import com.homedepot.base.Base;
import com.homedepot.common.CustomWait;
import com.homedepot.pageObjects.HomeDecorAnaFurnitureTab;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ItemAddedToCard_Popup_Test extends Base {
    private HomeDecorAnaFurnitureTab homeDecorAnaFurnitureTab = new HomeDecorAnaFurnitureTab();
    private CustomWait wait = new CustomWait();
    @Test
    public void suggestedItems_RightLeft_Arrow_Button_Test()
    {
        homeDecorAnaFurnitureTab.selectItemAndAddToShopingCard(1);
        WebElement prevleftButton =library.find("prev left button",By.cssSelector("div>svg.carousel__prev-button"));
        WebElement nextrightButton =library.find("next right button",By.cssSelector("div>svg.carousel__next-button"));
        boolean clickableright = wait.isClickible(nextrightButton);
        nextrightButton.click();
        boolean clickableleft = wait.isClickible(prevleftButton);
        Assert.assertFalse(clickableleft);
        Assert.assertFalse(clickableright);
    }
}

