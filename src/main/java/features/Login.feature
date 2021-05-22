Feature: Login Feature
  Scenario: Login to application
    Given login page is displayed
    When user enters credentials and submit
    Then Home page should be displayed