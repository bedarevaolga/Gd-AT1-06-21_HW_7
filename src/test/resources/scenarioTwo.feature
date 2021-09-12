# language: en
Feature: Using the site onliner.by
  hover over the item Houses and Flats market a submenu appears, displaying categories - division by price, by city and brand.

  Scenario: Using the item Houses and Flats market
    When open onliner.by
    And  hover over the item Houses and Flats market
    Then a submenu appears
      |1-комнатные|
      |Брест|
      |30 000–80 000 $|