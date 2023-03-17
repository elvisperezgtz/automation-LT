Feature: Buy an item at sauce demo

  As a user
  I want to be able to buy items in Sauce Demo
  in order to use them in my automation tests.

  Background: Elvis is logged in at sauce demo
    Given Elvis is logged in at sauce demo

  @test
  Scenario: Buy at sauce labs demo
    When he wants to buy "Sauce Labs Onesie"
    And he validates items in his shopping cart
    And he finishes the order with info
      |firstName|lastName|postalCode|
      |Elvis|Perez|50001|
    Then he should see the "Checkout: Complete!" page
