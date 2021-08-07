package com.greenkart.pages;

import com.greenkart.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ItemsPage extends BasePage{


    @FindBy(xpath = "//h4[@class='product-name']")
    public WebElement productsList;

    @FindBy(xpath = "//h4[contains(text(), 'Cucumber')]")
    public WebElement cucumberProduct;

    @FindBy(xpath = "//*[contains(text(), 'Cucumber - 1 Kg')]//../p")
    public WebElement cucumberPrice;

    @FindBy(xpath = "//*[contains(text(), 'Cucumber - 1 Kg')]//..//input[@type='number']")
    public WebElement cucumberAmount;

    @FindBy(xpath = "//*[contains(text(), 'Cucumber - 1 Kg')]//..//a[@class='increment']")
    public WebElement cucumberIncrementSign;

    @FindBy(xpath = "//*[contains(text(), 'Cucumber - 1 Kg')]//..//a[@class='decrement']")
    public WebElement cucumberDecrementSign;





    public String  navigateToProduct(String productName){
        // It navigates to a product and get and return the name of it.
        WebElement productElement = Driver.get().findElement(By.xpath("//h4[contains(text(), '" + productName + "')]"));
        return productElement.getText();
    }

    public String getProductAmount(String productName){
        // It gets product amount and return it as a string.
        WebElement productPriceElement = Driver.get().findElement(By.xpath("//*[contains(text(), '" + productName + "')]//..//input[@type='number']"));
        return productPriceElement.getAttribute("value");

    }


    public String getProductPrice(String productName){
        // It gets product price and return it as a string.
        WebElement productPriceElement = Driver.get().findElement(By.xpath("//*[contains(text(), '" + productName + "')]//../p"));
        return productPriceElement.getText();

    }

    public void clickIncrement(String productName, int clickNumber){
        // It gets product price and return it as a string.
        WebElement productIncrementElement = Driver.get().findElement(By.xpath("//*[contains(text(), '" + productName + "')]//..//a[@class='increment']"));
        if (clickNumber<1){
            System.out.println("Please write number grater than or equal to 1");
        }else {
            for (int i = 1; i <= clickNumber; i++) {
                productIncrementElement.click();
            }
        }
    }

    public void clickDecrement(String productName, int clickNumber, int productCurrentAmount){
        // It gets product price and return it as a string.
        WebElement productDecrementElement = Driver.get().findElement(By.xpath("//*[contains(text(), '" + productName + "')]//..//a[@class='decrement']"));
        if (clickNumber<1){
            System.out.println("Please write number grater than or equal to 1");
        }else if(clickNumber>productCurrentAmount){
            System.out.println("Please write number smaller than or equal to the current amount");
        } else {
            for (int i = 1; i <= clickNumber; i++) {
                productDecrementElement.click();
            }
        }
    }







}
