@customerAdmin @WO2.1 @Ca-Reports
Feature: Test Wireless Office application for Customer Admin - Location functionality
		
@positivescenario      
@CaReportsExportReport
 Scenario Outline: Verify that admin able to export the reports or not
    Given User navigates to Customer Admin Portal
    Then user navigate to WirelessOffice application
    Then User enter Login details like "<email>" "<password>"
    Then User clicks on Login button
    Then User fetch otp from mail for "<email>"
    Then User clicks on Complete button
    Then User clicks on Reports menu
    Then User selects the checkbox and checks the export button
    Then User selects the date from the dropdown and clicks on the export button
    Then User unselects the checkbox and checks the export button
    
    Examples:
      | email                      | password  	    |
      | automationtest@mailsac.com | Stratus@123456 |
      
@CaReportsRequiredElements
 Scenario Outline: Verify that Required Elements are present or not
    Given User navigates to Customer Admin Portal
    Then user navigate to WirelessOffice application
    Then User enter Login details like "<email>" "<password>"
    Then User clicks on Login button
    Then User fetch otp from mail for "<email>"
    Then User clicks on Complete button
    Then User clicks on Reports menu
    Then User checks the required elements
    
    Examples:
      | email                      | password  	    |
      | automationtest@mailsac.com | Stratus@123456 |
      
@CaReportsSearchReports
 Scenario Outline: Verify the search functionality
    Given User navigates to Customer Admin Portal
    Then user navigate to WirelessOffice application
    Then User enter Login details like "<email>" "<password>"
    Then User clicks on Login button
    Then User fetch otp from mail for "<email>"
    Then User clicks on Complete button
    Then User clicks on Reports menu
    Then User searches the reports
    
    Examples:
      | email                      | password  	    |
      | automationtest@mailsac.com | Stratus@123456 |
      
@CaReportsCustomDateSelection
 Scenario Outline: Verify the custom date selection
    Given User navigates to Customer Admin Portal
    Then user navigate to WirelessOffice application
    Then User enter Login details like "<email>" "<password>"
    Then User clicks on Login button
    Then User fetch otp from mail for "<email>"
    Then User clicks on Complete button
    Then User clicks on Reports menu
    Then User selects the date less than ninty days
    Then User selects the date more than ninty days
    Then User selects the checkbox and unselects
    
    
    Examples:
      | email                      | password  	    |
      | automationtest@mailsac.com | Stratus@123456 |

 