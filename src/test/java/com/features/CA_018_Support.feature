@customerAdmin @support @WO2.1
Feature: Test Wireless Office application for Customer Admin - Support functionality

@ca-Support-Positive
Scenario Outline: Verify support functionality
    Given User navigates to Customer Admin Portal
    Then user navigate to WirelessOffice application
    Then User enter Login details like "<email>" "<password>"
    Then User clicks on Login button
    Then User fetch otp from mail for "<email>"
    Then User clicks on Complete button
    Then User checks the support button and tootip
    Then User clicks on the support button and checks BMC portal

      Examples:
      | email                         | password      |
      | automationtesting@mailsac.com | Testing@12345 |
