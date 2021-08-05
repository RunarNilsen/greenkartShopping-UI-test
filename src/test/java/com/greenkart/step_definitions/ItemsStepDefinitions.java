package com.greenkart.step_definitions;

import com.greenkart.pages.ItemsPage;
import com.greenkart.utilities.ConfigurationReader;
import com.greenkart.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ItemsStepDefinitions {
    @Given("navigate to the homepage")
    public void navigate_to_the_homepage() {
        System.out.println("I open browser and navigate to GreenKart Homepage");
        String url = ConfigurationReader.get("url");
        Driver.get().get(url); // navigating to the webpage
    }

    @When("go to {string} item")
    public void go_to_item(String item) {
        ItemsPage itemsPage = new ItemsPage();
        String actualProductName = itemsPage.navigateToProduct(item);
        System.out.println("item = " + item);
        System.out.println("actualProductName = " + actualProductName);
        Assert.assertEquals("Verify the item name",item, actualProductName);
    }

    @Then("check the default amount of {string} is {int} kg")
    public void check_the_default_amount_of_is_kg(String itemName, Integer amount) {
        ItemsPage itemsPage = new ItemsPage();
        String actualProductAmount = itemsPage.getProductAmount(itemName);
        System.out.println("item = " + amount.toString());
        System.out.println("actualProductName = " + actualProductAmount);
        Assert.assertEquals("Verify the product amount",amount.toString(), actualProductAmount);

    }

    @When("increase the {string} amount by {int}")
    public void increase_the_amount_by(String itemName, Integer numberOfClick) {
        ItemsPage itemsPage = new ItemsPage();
        itemsPage.clickIncrement(itemName, numberOfClick);

    }

    @When("decrease the {string} amount by {int}")
    public void decrease_the_amount_by(String itemName, Integer numberOfClick) {
        ItemsPage itemsPage = new ItemsPage();
        int currentProductAmount = Integer.parseInt(itemsPage.getProductAmount(itemName)); // parsing string to integer
        itemsPage.clickDecrement(itemName, numberOfClick, currentProductAmount);
    }
    @Then("check the amount of {string} is {int} kg")
    public void check_the_amount_of_is_kg(String itemName, Integer expectedAmount) {
        ItemsPage itemsPage = new ItemsPage();
        String actualProductAmount = itemsPage.getProductAmount(itemName);
        System.out.println("item = " + expectedAmount.toString());
        System.out.println("actualProductName = " + actualProductAmount);
        Assert.assertEquals("Verify the product amount",expectedAmount.toString(), actualProductAmount);

    }





}
