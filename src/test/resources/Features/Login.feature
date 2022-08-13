Feature: Test Login functionality

  @login
  Scenario: As a user I enter my account with my username and password
    Given I am on the login page
    When I enter my username
    When I enter my password
    And click on the login button
    Then I enter to my account correctly
    And the login button is visible