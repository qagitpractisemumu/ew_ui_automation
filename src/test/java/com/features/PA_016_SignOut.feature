@WO2.1 @signout @paSignoutPositive

Feature: Test Wireless Office application for Provider Admin - Signout functionality
  Scenario Outline: Verify signout functionality in Masterview portal
    Given Admin launching the Provider Admin Portal
    When Admin enters credentials "<email>" and "<password>"
    Then Admin clicks on login button
    Then Admin fetchs otp from email for "<email>"
    Then Admin clicks on Complete button
    Then Admin is in HomePage
    Then Admin should be able to signout

    Examples: 
      | email                       | password     |
      | serviceprovider@yopmail.com | Stratus@1234 |
    
    @BackspaceCommand  
    Scenario Outline: Verify backspace functionality in Masterview portal
    Given Admin launching the Provider Admin Portal
    When Admin enters credentials "<email>" and "<password>"
    Then Admin clicks on login button
    Then Admin fetchs otp from email for "<email>"
    Then Admin clicks on Complete button
    Then Admin is in HomePage
    Then Admin should be able to signout
    Then Admin should click on backspace

    Examples: 
      | email                       | password     |
      | serviceprovider@yopmail.com | Stratus@1234 |  