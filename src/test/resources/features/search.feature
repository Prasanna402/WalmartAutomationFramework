Feature: Product functionality

Scenario: Search for product
  Given user is on Demo Web Shop homepage
  When user searches for "laptop"
  Then results page should be displayed

Scenario: Add product to cart
  Given user is on Demo Web Shop homepage
  When user selects a product
  And user clicks add to cart
  Then product should be added to cart