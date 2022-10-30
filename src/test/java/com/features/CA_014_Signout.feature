@WO2.1 @customerAdmin @smoke
Feature: Test Wireless Office application for Customer Admin - SignOut functionality

  @signoutPositive
  Scenario Outline: Verify signout Functionality
    Given User navigates to Customer Admin Portal
    When User enters email "<email>" and password "<password>"
    Then User clicks on Login button
    Then User fetch otp from mail for "<email>"
    Then User clicks on Complete button
    Then User clicking on the profile icon
    Then User clicking on Signout option

    Examples: 
      | email                         | password      |
      | automationtesting@mailsac.com | Testing@12345 |

  @negativeBackspace
  Scenario Outline: Verify signout Functionality backspace
    Given User navigates to Customer Admin Portal
    When User enters email "<email>" and password "<password>"
    Then User clicks on Login button
    Then User fetch otp from mail for "<email>"
    Then User clicks on Complete button
    Then User clicking on the profile icon
    Then User clicking on Signout option
    Then User clicks on the backspace command function

    Examples: 
      | email                         | password      |
      | automationtesting@mailsac.com | Testing@12345 |
