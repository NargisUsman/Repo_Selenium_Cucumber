Feature: Login

  #to write the testCases we use Gherkin keywords
  #Login file will contains all the testCases/scenarios that related to login functionality

  Scenario: User gets invalid credentials error
    Given I am on landing page
    When I enter "abcd@test.com" in username
      And I enter "invalid1" in password
      And I click login button
    Then I see the error msg