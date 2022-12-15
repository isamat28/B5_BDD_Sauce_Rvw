package com.sauce.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage extends BasePage{
    @FindBy(id = "checkout")
    public WebElement checkoutBtn;
}
