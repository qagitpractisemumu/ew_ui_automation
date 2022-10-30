@WO2.1 @paDashBoard @providerAdmin
Feature: Test Wireless Office application for Provider Admin - Dashboard functionality

  @PaDashboardPositive
  Scenario Outline: Verify admin can view dashboard details in Wireless Office Application
    Given Admin launching the Provider Admin Portal
    When Admin enters email and password
    Then Admin clicks on login button
    Then Admin fetchs otp from email for "<email>"
    Then Admin clicks on Complete button
    Then Admin is in HomePage
    Then Admin selects the dropdown

    Examples: 
      | email                       |
      | serviceprovider@yopmail.com |

  @privacyLinkDashboard
  Scenario: Verify privacy and legal link
    Given Admin launching the Provider Admin Portal
    Then Admin clicks on the footer privacy and legal link

  @legendCheck
  Scenario Outline: Verify admin can view legend in dashboard
    Given Admin launching the Provider Admin Portal
    When Admin enters email and password
    Then Admin clicks on login button
    Then Admin fetchs otp from email for "<email>"
    Then Admin clicks on Complete button
    Then Admin is in HomePage
    Then Admin checks for the "<legend>"

    Examples: 
      | email                       | legend |
      | serviceprovider@yopmail.com | time   |
