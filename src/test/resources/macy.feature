Feature: Login feature
  Scenario: Login with valid credentials
    Given I navigate to macy.com
    And I click SignIn
    When i enter Email and Password
    And I click SignIn Button
    Then I should see MyAccount
