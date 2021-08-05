$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Items.feature");
formatter.feature({
  "name": "Items",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Select specified Items and change their amount",
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
  "name": "check the default amount of \"Brocolli - 1 Kg\" is 1 kg",
  "keyword": "Then "
});
formatter.match({
  "location": "com.greenkart.step_definitions.ItemsStepDefinitions.check_the_default_amount_of_is_kg(java.lang.String,java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "increase the \"Brocolli\" amount by 2",
  "keyword": "When "
});
formatter.match({
  "location": "com.greenkart.step_definitions.ItemsStepDefinitions.increase_the_amount_by(java.lang.String,java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "check the amount of \"Brocolli - 1 Kg\" is 3 kg",
  "keyword": "Then "
});
formatter.match({
  "location": "com.greenkart.step_definitions.ItemsStepDefinitions.check_the_amount_of_is_kg(java.lang.String,java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "decrease the \"Brocolli\" amount by 1",
  "keyword": "When "
});
formatter.match({
  "location": "com.greenkart.step_definitions.ItemsStepDefinitions.decrease_the_amount_by(java.lang.String,java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "check the amount of \"Brocolli - 1 Kg\" is 2 kg",
  "keyword": "Then "
});
formatter.match({
  "location": "com.greenkart.step_definitions.ItemsStepDefinitions.check_the_amount_of_is_kg(java.lang.String,java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});