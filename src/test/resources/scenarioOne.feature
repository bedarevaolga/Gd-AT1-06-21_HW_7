# language: en
Feature: Using the site onliner.by
  hover over the item Autobaraholcka market a submenu appears, displaying categories - division by price, by city and brand.

  Scenario: Using the item Autobaraholcka market
    When open onliner.by
    And  hover over the item Autobaraholcka market
    Then a submenu appears
      |Авто до 20 000 р.|
      |Минск|
      |BMW|