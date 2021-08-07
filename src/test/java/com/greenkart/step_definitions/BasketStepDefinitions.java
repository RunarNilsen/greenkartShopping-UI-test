package com.greenkart.step_definitions;

import com.greenkart.pages.BasketPage;
import com.greenkart.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.List;

public class BasketStepDefinitions {


    @When("click the add to chart button of {string}")
    public void click_the_add_to_chart_button_of(String productName) {
        BasketPage basketPage = new BasketPage();
        basketPage.clickAddButton(productName);
    }

    @Then("navigate to the chart")
    public void navigate_to_the_chart() {
        BasketPage basketPage = new BasketPage();
        basketPage.navigateToChart();
    }

    @Then("the product should be in the basket")
    public void the_product_should_be_in_the_basket(List<String> expectedProductList) {
        BasketPage basketPage = new BasketPage();
        List<WebElement> productsInChart = basketPage.productsInChart;
        List<String> actualProductList = BrowserUtils.getElementsText(productsInChart);
        Assert.assertEquals("Verify Products in the Chart: ",expectedProductList, actualProductList);
    }

    @When("delete the {string} item from the cart")
    public void delete_the_item_from_the_cart(String productName) {
        BasketPage basketPage = new BasketPage();
        basketPage.removeProductFromCart(productName);
        BrowserUtils.waitFor(1);
    }


}
