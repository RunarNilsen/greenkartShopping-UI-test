package com.greenkart.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.nio.file.WatchEvent;
import java.util.List;

public class BasketPage extends BasePage{

    @FindBy(xpath = "//ul//p[@class='product-name']")
    public List<WebElement> productsInChart;


}
