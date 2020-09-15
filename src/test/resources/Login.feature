@PasswordValidation
Feature: login validation

  Background: home page is displayed
    Given user goes on  'Home Page'
    And 'Home Page' is displayed
    And 'Sign In Button' is displayed on 'Home Page'
    And user clicks 'Sign In Button' on 'Home Page'
    Then 'Authentication Page' is displayed


  @ValidPassword
  Scenario: login with valid data
    When user adds valid input in 'email' and 'password' field on 'Authentication Page'
    And user clicks 'Sign In Button' on 'Authentication Page'
    Then 'My Account Page' is displayed
    And 'Sign Out Button' is displayed on 'My Account Page'
    And user clicks 'Sign Out Button' on 'My Account Page'

  @InvalidPassword
  Scenario: login with invalid data
    When user adds invalid input in 'email' and 'password' field on 'Authentication Page'
    And user clicks 'Sign In Button ' on 'Authentication Page'
    Then 'Error Authentication Page' is displayed
    Then 'error message' is displayed on 'Error Authentication Page' page












#@PasswordValidation
#Feature: login validation
#
#  Background: home page is displayed
#    Given user goes on  'Home Page'
#    And 'Home Page' is displayed
#    And 'Sign In' button is displayed on the 'Home Page'
#    And user clicks 'Sign In' button on 'Home Page'
#    Then 'Authentication Page' is displayed
#
#
#  @ValidPassword
#  Scenario Outline: login with valid data
#    When user adds <emailField> and <passwordField>
#
#
#
#    And user clicks 'Sign In' button on 'Authentication Page'
#    Then 'My Account Page' is displayed
#    And 'Sign Out' button is displayed on the 'My Account Page'
#    And user clicks 'Sign Out' button on 'My Account Page'
#    Examples:
#      | emailField | passwordField |
#      | test@get   | fdgf          |

#  @InvalidPassword
#  Scenario Outline: login with invalid data
#    When user adds 'email' and 'password'
#    Examples:
#      | email    | password |
#      | test@get | fdgf     |
#
#
#
#    And user clicks 'Sign In' button on 'Authentication Page'
#    Then 'Error Authentication Page' is displayed
#    Then 'error message' is displayed on 'Error Authentication Page' page

