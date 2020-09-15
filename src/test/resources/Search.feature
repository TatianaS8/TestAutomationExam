@SearchButtonFunctionality
Feature: Search Button Validation

  Scenario: Search button validation with valid data
    Given user goes on  'Home Page'
    And 'Home Page' is displayed
    And 'Search Box' is displayed on 'Home Page'
    And 'Search Button' is displayed on 'Home Page'
    When user adds 'Product' in 'Search Box' on 'Home Page'
    And user clicks 'Search Button' on 'Home Page'
    Then 'Search Product Page' is displayed
