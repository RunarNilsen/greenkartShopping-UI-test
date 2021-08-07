$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Basket.feature");
formatter.feature({
  "name": "Basket",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Delete items in the basket",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "navigate to the homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "com.greenkart.step_definitions.ItemsStepDefinitions.navigate_to_the_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "go to \"Brocolli - 1 Kg\" item",
  "keyword": "When "
});
formatter.match({
  "location": "com.greenkart.step_definitions.ItemsStepDefinitions.go_to_item(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click the add to chart button of \"Brocolli - 1 Kg\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.greenkart.step_definitions.BasketStepDefinitions.click_the_add_to_chart_button_of(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "go to \"Cauliflower - 1 Kg\" item",
  "keyword": "When "
});
formatter.match({
  "location": "com.greenkart.step_definitions.ItemsStepDefinitions.go_to_item(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click the add to chart button of \"Cauliflower - 1 Kg\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.greenkart.step_definitions.BasketStepDefinitions.click_the_add_to_chart_button_of(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "navigate to the chart",
  "keyword": "Then "
});
formatter.match({
  "location": "com.greenkart.step_definitions.BasketStepDefinitions.navigate_to_the_chart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "delete the \"Cauliflower - 1 Kg\" item from the cart",
  "keyword": "When "
});
formatter.match({
  "location": "com.greenkart.step_definitions.BasketStepDefinitions.delete_the_item_from_the_cart(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the product should be in the basket",
  "rows": [
    {}
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "com.greenkart.step_definitions.BasketStepDefinitions.the_product_should_be_in_the_basket(java.util.List\u003cjava.lang.String\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});