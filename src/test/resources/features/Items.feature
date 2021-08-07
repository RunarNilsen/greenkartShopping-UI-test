Feature: Items


  Scenario: Select specified Items and change their amount
    Given navigate to the homepage
    When  go to "Brocolli - 1 Kg" item
    Then  check the default amount of "Brocolli - 1 Kg" is 1 kg
    When  increase the "Brocolli" amount by 2
    Then  check the amount of "Brocolli - 1 Kg" is 3 kg
    When  decrease the "Brocolli" amount by 1
    Then  check the amount of "Brocolli - 1 Kg" is 2 kg


  Scenario Outline: The default prices of products
    Given navigate to the homepage
    Then check the default price of "<Product>" is "<Price>"
    Examples:
      | Product   |  Price|
      |Brocolli   |   120 |
      |Cauliflower|    60 |
      |Cucumber   |    48 |
      |Beetroot   |    32 |
