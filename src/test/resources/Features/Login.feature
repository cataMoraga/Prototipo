Feature: Test Login functionality

  @login
  Scenario: As a user I enter my account with my username and password
    Given I am on the login page
    When I enter my username
    When I enter my password
    And click on the login button
    Then I enter to my account correctly
    And the login button is visible

  @WrongLogin
  Scenario: As a user I enter wrong my credentials
    Given Im on the login page
    When I enter my user
    When I enter wrong my password
    And click on login button
    And I can see an incorrect login message