@providerAdmin @support @WO2.1
Feature: Test Wireless Office application for Customer Admin - Support functionality

@pa-Support-Positive
Scenario Outline: Verify support functionality
    Given Admin launching the Provider Admin Portal
    When Admin enters email and password
    Then Admin clicks on login button
    Then Admin fetchs otp from email for "<email>"
    Then Admin clicks on Complete button
    Then Admin is in HomePage
    Then Admin checks the support button and tootip
    Then Admin clicks on the support button and checks BMC portal

      Examples:
      | email												|
      | serviceprovider@yopmail.com	|
