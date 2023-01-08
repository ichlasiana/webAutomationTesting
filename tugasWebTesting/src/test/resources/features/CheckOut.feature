@CheckOut
Feature: CheckOut
  As a user i want to checkout item

  Scenario: Add to Cart
    Given User open the website sauce demo
    When User input "standard_user" as userName and input "secret_sauce" as password
    Then User already in landing page
    And User sort product list by name z to a
    And User pick item Sauce Labs Onesie
    And User pick item Test.allTheThings T-Shirt Red
    And User click cart
    Then Verify item is added
    And User remove item Test.allTheThings T-Shirt Red
    And User click Checkout button on Cart Page
    When User input "Kamisato" as firstName and input "Ayato" as lastName and input "333999" as zipCode
    Then System showing summary of payment
    And User click finish button
    Then System showing messages "THANK YOU FOR YOUR ORDER"
