Feature: Validating login functionality

  @RegressionFlow
  Scenario Outline: Preform with valid credential and access to the Orange HRM dashboard
    Given OrangeHRM login page launched
    When User enter UserName and password
    And Clicks on login button
    Then Should be landed in OrangeHRm dashboard
    Examples:

