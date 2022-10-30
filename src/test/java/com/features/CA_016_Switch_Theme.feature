@customerAdmin @WO2.2 @ca-switchtheme
Feature: Test Wireless Office application for Customer Admin - Switch Theme functionality

@SwitchThemePositive
  Scenario Outline: Verify the user can able to switch theme
    Given User navigates to Customer Admin Portal
    Then user navigate to WirelessOffice application
    Then User enter Login details like "<email>" "<password>"
    Then User clicks on Login button
    Then User fetch otp from mail for "<email>"
    Then User clicks on Complete button
    Then User clicking on the profile icon
    Then User checks the default theme mode
    Then User clicks on switch theme toogle button
    Then User checks the theme changed to dark or not
    Then User clicks on switch theme toogle button
    Then User checks the theme changed to light or not
    Then User clicks on switch theme toogle button
    Then User checks the theme changed to dark or not
    Then User clicking on Signout option
    Then User enter Login details like "<email>" "<password>"
    Then User clicks on Login button
    Then User fetch otp from mail for "<email>"
    Then User clicks on Complete button
    Then User clicking on the profile icon
    Then User checks the default theme mode

    Examples: 
      | email                      | password     	|
      | automationtest@mailsac.com | Stratus@123456 |
