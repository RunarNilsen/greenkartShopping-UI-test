Feature: Basket


  Scenario: Add one product to the basket
    Given navigate to the homepage
    When  go to "Brocolli - 1 Kg" item
    When click the add to chart button of "Brocolli - 1 Kg"
    Then navigate to the chart
    Then the product should be in the basket
      | Brocolli - 1 Kg|


  Scenario: Add products to the basket
      Given navigate to the homepage
      When  go to "Brocolli - 1 Kg" item
      When click the add to chart button of "Brocolli - 1 Kg"
      When  go to "Cauliflower - 1 Kg" item
      When click the add to chart button of "Cauliflower - 1 Kg"
      Then navigate to the chart
      Then the product should be in the basket
        | Brocolli - 1 Kg|
        | Cauliflower - 1 Kg|

  @wip
  Scenario: Delete items in the basket
    Given navigate to the homepage
    When  go to "Brocolli - 1 Kg" item
    When click the add to chart button of "Brocolli - 1 Kg"
    When  go to "Cauliflower - 1 Kg" item
    When click the add to chart button of "Cauliflower - 1 Kg"
    Then navigate to the chart
    When delete the "Cauliflower - 1 Kg" item from the cart
    Then the product should be in the basket
      | Brocolli - 1 Kg|



  Scenario: Update items in the basket