package com.homedepot.smokTests;

import com.homedepot.base.Base;
import com.homedepot.common.CustomWait;
import com.homedepot.pageObjects.sections.HeaderSection;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class Header_Test extends Base {
    private HeaderSection header_task_links = new HeaderSection();


    @Test
    public void nav_header_test(){
            List<WebElement> header_tabs = library.findAll("Header tab",By.cssSelector(".ShoppingLinks>li"));
            boolean[] areVisible = new boolean[header_tabs.size() -1];

            Actions actions = new Actions(driver);

            for (int i = 0 ; i < header_tabs.size(); i++){

                actions.moveToElement(header_tabs.get(i)).build().perform();
                switch (i) {
                    case 0:
                        try {
                            library.wait.waitUntilVisible(By.cssSelector("#allDepartmentsFlyout"));
                            areVisible[i] = true;
                        } catch (Exception e) {
                            areVisible[i] = false;
                        }
                        break;
                    case 1:
                        try {
                            library.wait.waitUntilVisible(By.xpath(".homeDecorFurnitureFlyout__menu.homeDecorFurnitureFlyout__menu--open"));
                            areVisible[i] = true;
                        } catch (Exception e) {
                            areVisible[i] = false;
                        }
                        break;
                    case 2:
                        try {
                            library.wait.waitUntilVisible(By.xpath("//div[@class='col__12-12 diyFlyout__wrapper'])[1]"));
                            areVisible[i] = true;
                        } catch (Exception e) {
                            areVisible[i] = false;
                        }
                        break;
                    case 3:
                        try {
                            library.wait.waitUntilVisible(By.xpath("//div[@class='col__12-12 diyFlyout__wrapper'])[2]"));
                            areVisible[i] = true;
                        } catch (Exception e) {
                            areVisible[i] = false;
                        }
                        break;
                    case 4:
                        try {
                            library.wait.waitUntilVisible(By.cssSelector("[class='grid specialOffersFlyout__level1']"));
                            areVisible[i] = true;
                        } catch (Exception e) {
                            areVisible[i] = false;
                        }
                        break;
                }
            }
                for(boolean b : areVisible){
                    System.out.println(b);
                 //  Assert.assertTrue(b);
                }
    }

    @Test
    public void task_links_test(){
        List<WebElement> headerTaskLinks = header_task_links.getHeaderTaskLinks_test();
        Assert.assertEquals(8 ,headerTaskLinks.size());
        for (WebElement temp : headerTaskLinks) {
            String href = temp.getAttribute("href");
            System.out.println(href);
            Assert.assertNotNull(href);
        }
    }
}