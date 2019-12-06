package com.homedepot.smokTests;
import com.homedepot.base.Base;
import com.homedepot.pageObjects.SighInPage;
import com.homedepot.pageObjects.sections.HomePage;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

public class LoginTest extends Base {

    private HomePage headerSection = new HomePage();
    private SighInPage sighInPage = new SighInPage();
    // Correct Username and Password.Positive Test
    @Test
    public void validLoginTest(){
        headerSection.goToSighInPage();
        sighInPage.sighIn("3evelyno@komys.com","theheartoflucifer");
        String actiual_text = library.find("Logged in Header",By.cssSelector(".headerMyAccountTitle.MyAccount__status.hide.show--sm")).getText();
        Assert.assertEquals("Welcome",actiual_text);
    }
    @Test
    public void invalidLoginTest(){
    headerSection.goToSighInPage();
    sighInPage.sighIn("3evelyno@komys.com","heartoflucifer");
        String actiual_text = library.find("Logged in Header",By.xpath("//p[text()='Sign In to Your Account']")).getText();
        Assert.assertEquals("Sign In to Your Account",actiual_text);
   }

    @Test
    public void createNewAccountTest(){
        headerSection.goToSighInPage();
        sighInPage
                .clickOnCreateAccount()
                .fillOut();
        String actiual_text = library.find("Logged in Header",By.cssSelector(".headerMyAccountTitle.MyAccount__status.hide.show--sm")).getText();
        Assert.assertEquals("Welcome",actiual_text);
    }
}
//email:3evelyno@komys.com
//passworw:theheartoflucifer
