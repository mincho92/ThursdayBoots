package com.homedepot.pageObjects;
import com.homedepot.common.Library;
import com.homedepot.pageObjects.sections.HeaderSection;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;


public class HomeDecorAnaFurnitureTab {
    private HeaderSection headerSection = new HeaderSection();
    private ProductListPage productListPage = new ProductListPage();
    private Library library;
    public HomeDecorAnaFurnitureTab(){
        library = new Library();
    }

    public List<WebElement> getFrangrancesAndCandlesLinks(){
        List<WebElement> all = library.findAll("Frangrance & Candles links", By.xpath("(//div[@class='homeDecorFurnitureFlyout__bay  '])[6]/div/a"));
        return all;
    }
    public  void selectItemAndAddToShopingCard(int optionIndex){
        List<WebElement> headerTabs = headerSection.getHeaderTabs();
        library.hoverOver("Home decor & Furniture",headerTabs.get(1));
        WebElement candles = getFrangrancesAndCandlesLinks().get(2);
        candles.click();
        productListPage.hoverOverItemThenAddToCard(1);
    }
}
