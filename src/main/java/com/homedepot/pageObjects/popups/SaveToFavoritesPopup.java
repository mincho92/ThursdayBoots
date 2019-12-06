package com.homedepot.pageObjects.popups;

import com.homedepot.common.Library;
import org.openqa.selenium.By;

public class SaveToFavoritesPopup {
    private Library library;
    public SaveToFavoritesPopup(){
        library=new Library();
    }

    public void save()
    {
        library.click("Save Button", By.cssSelector("[class='bttn bttn--primary bttn--inline']"));
    }
    public void viewFavorites()
    {
        library.click("click to viewFavorites", By.xpath("//a[text()='View Favorites']"));
    }
}
