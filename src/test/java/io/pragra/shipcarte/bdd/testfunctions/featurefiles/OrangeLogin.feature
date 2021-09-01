Feature: Validating login functionality

  @RegressionFlow
  Scenario: Preform with valid credential and access to the Orange HRM dashboard
    Given OrangeHRM login page launched
    When User enter valid UserName and password
    And Clicks on login button
    Then Should be landed in OrangeHRm dashboard

  @RegressionFlow
  Scenario: Preform invalid credential and verifying error message
    Given OrangeHRM login page launched
    When User enter invalid UserName and password
    And Clicks on login button
    Then Should prompt error message

