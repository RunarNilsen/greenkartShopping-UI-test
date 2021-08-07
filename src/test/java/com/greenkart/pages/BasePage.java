package com.greenkart.pages;


import com.greenkart.utilities.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public abstract class BasePage {

    public BasePage() {

        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//img[@alt='Cart']")
    public WebElement chartIcon;


    public void clickAddButton(String productName){
        WebElement addButtonElement = Driver.get().findElement(By.xpath("//*[contains(text(), '" + productName + "')]//..//button"));
        addButtonElement.click();
    }

    public void navigateToChart(){
        chartIcon.click();
    }

    public void removeProductFromCart(String productName){
        WebElement removeButtonElement = Driver.get().findElement(By.xpath("//ul[@class='cart-items']//p[contains(text(), '" + productName +"')]//..//../a"));
        removeButtonElement.click();
    }






}