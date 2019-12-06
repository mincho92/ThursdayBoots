package com.homedepot.pageObjects;

import com.homedepot.common.CustomWait;
import com.homedepot.common.Library;
import org.openqa.selenium.By;

public class CreateAccountPage {
    private Library library;
    private CustomWait wait;
    public CreateAccountPage(){
        library = new Library();
    }

    public void fillOut(){
    library.enter("emailaddress","g4566ggjf@abv.com", By.cssSelector("#email"));
    library.enter("password","cyram1223", By.cssSelector("#password-input-field"));
    library.enter("zipcode","60616", By.cssSelector("#zipCode"));
    library.enter("phone","5549995775", By.cssSelector("#phone"));
    library.click("create acoount button",By.cssSelector(".bttn--primary"));
    wait.waitUntilVisible(By.cssSelector(".flexbox--center-center.slideLeft-enter-done"));
    library.click("skip for  now ",By.cssSelector("[class='bttn-outline bttn-outline--primary u--marginNormal-top']>span"));
    }
}
