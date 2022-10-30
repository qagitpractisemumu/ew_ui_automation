@smoke@paSessionTimeout
Feature: Test Wireless Office application for Provider Admin - Session TimeOut functionality

  @Stayloggedinbutton
  Scenario: To check for timeout session for Masterview portal
    Given Admin launching the Provider Admin Portal
    When Admin enters username and password
    When Admin clicks on login button
    Then Admin is in HomePage
    Then Admin clicks on Stay Logged In button
    Then Admin signsout of the Provider admin portal

  @Logoutnowbutton
  Scenario: To check for logout on timeout session window for Masterview portal
    Given Admin launching the Provider Admin Portal
    When Admin enters username and password
    When Admin clicks on login button
    Then Admin is in HomePage
    Then Admin clicks on Log Out Now button
