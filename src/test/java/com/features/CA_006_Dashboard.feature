@customerAdmin @WO1.1 @WO2.1 @Dashboard @happyPath
Feature: Test Wireless Office application for Onboarded and Self Registered Customer Admin - Dashboard functionality 
     
    @ca-SSP-Dashboard-Positive
  Scenario Outline: Verify 4 submenus are displayed under Dashboard main menu
    Given User navigates to Customer Admin Portal
    Then User click on Login EmailID RadioButton
    Then User enter Login details like "<email>" "<password>"
    Then User clicks on Login button
    Then User fetch otp from mail for "<email>"
    Then User clicks on Complete button
    Then User will be in Dashboard menu and validate the submenus under the main dashboard menu
    Then User verifies the Dashboard MainMenu and submenus
    Then User verifies UI of Compute Utilization tab
    Then User verifies UI of Memory Utilization tab 
    Then User verifies UI of Disk Utilization tab
    Then User verifies UI of Network Read Write tab  

    Examples:
      | email                | password      |
      | autojyca@mailsac.com |Testing@12345|

    @SSP-Dashboard-Positive
    Examples:
      | email                       | password      |
      | sspautomationtr@mailsac.com | Testing@12345 |


  @ca-SSP-Dashboard-UI
  Scenario Outline: Verify 4 submenus are displayed under Dashboard main menu
    Given User navigates to Customer Admin Portal
    Then User click on Login EmailID RadioButton
    Then User enter Login details like "<email>" "<password>"
    Then User clicks on Login button
    Then User fetch otp from mail for "<email>"
    Then User clicks on Complete button
    Then User will validate dashboard UI

    Examples:
      | email                | password      |
      | autojyca@mailsac.com | Testing@12345 |

    @SSP-Dashboard-Positive
    Examples:
      | email                       | password      |
      | sspautomationtr@mailsac.com | Testing@12345 |