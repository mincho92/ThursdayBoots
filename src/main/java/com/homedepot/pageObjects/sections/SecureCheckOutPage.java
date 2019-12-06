package com.homedepot.pageObjects.sections;

import com.homedepot.common.CustomWait;
import com.homedepot.common.Library;
import org.openqa.selenium.By;

public class SecureCheckOutPage {

    private Library library;
    public SecureCheckOutPage() {
        library = new Library();
    }
    public void placeOrder()
    {
       fillOutShippingInfo();
       fillOutPaymenetInfo();
        library.click("Place order", By.cssSelector("[class='bttn__content']"));
    }

    private void fillOutShippingInfo(){
        library.enter("First name","Cyram", By.cssSelector("input[class='form-input__field form-control no-input-field-icons'][name='firstName']"));
        library.enter("last name","Solution", By.cssSelector("input[class='form-input__field form-control no-input-field-icons'][name='lastName']"));
        library.enter("email ","Cyram32@res.com", By.cssSelector("input[class='form-input__field form-control no-input-field-icons'][name='email']"));
        library.enter("tel ","5082235454", By.cssSelector("input[class='form-input__field form-control no-input-field-icons'][name='phone']"));
        library.enter("address","5222 N reserve avenue", By.cssSelector("input[class='form-input__field form-control no-input-field-icons'][name='line1']"));
        library.enter("zipcode","60656", By.cssSelector("input[class='form-input__field form-control no-input-field-icons'][name='zipCodeField']"));
        library.click("click on continue button",By.xpath("//span[text()='Continue']"));
        library.wait.waitUntilDisappears(By.cssSelector(".ReactModal__Content.ReactModal__Content--after-open"));
    }
    private void fillOutPaymenetInfo(){
        library.enter("card number","5105 1051 0510 5100", By.cssSelector("input[name=\"cardNumber\"]"));
        library.selectDropdownByValue(By.cssSelector("[name='cardExpiryMonth']"),"12");
        library.selectDropdownByValue(By.cssSelector("[name='cardExpiryYear']"),"2026");
        library.enter("CVV field","121",By.cssSelector("[name='cvvField']"));

    }
}
