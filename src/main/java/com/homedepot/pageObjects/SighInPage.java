package com.homedepot.pageObjects;

import com.homedepot.base.Base;
import com.homedepot.common.Library;
import org.openqa.selenium.By;

public class SighInPage extends Base {
    private Library library;
    public SighInPage(){
        library = new Library();
    }
    public void sighIn(String username,String password){
        library.enter(password, username, By.cssSelector("[class='form-input__field']"));
        library.enter("password", "theheartoflucifer", By.cssSelector("input[type='password']"));
        library.click("signIn", By.cssSelector("button[class='bttn--primary']"));
    }
    public CreateAccountPage clickOnCreateAccount(){
        library.click("create an account button",By.cssSelector("[class='bttn-outline bttn-outline--primary u--marginNormal-top'"));
        return new CreateAccountPage();


    }
}
