Feature: Check Login functionality on OrangeHRM
  @smoke
    Scenario: check valid username and password credential
      Given I am on OrangeHRM login page
      When user enter valid username
      When user enter valid password
      When user click on login button
