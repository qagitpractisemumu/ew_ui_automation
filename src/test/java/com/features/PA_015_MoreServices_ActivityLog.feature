@moreServicesActivityLog
Feature: Test Wireless Office application for Provider Admin - MoreServices - Activity Log functionality

  @selectDeselectMoreServicesActivity
  Scenario Outline: Verify the user clicking DR backup options,Authentication options,TechSupport options,Data Archival options and Data Security options and verifying the record in Activity Log of PA Portal
    Given user navigate to WirelessOffice application
    Then User enters the Customer Admin Portal Url
    When User clicks on Login
    Then User click on Create Account link
    Then User select Create Accoutn with EmailID
    Then User enter registeration details like "<createPassword>" and "<confirmPassword>"
    Then User select Terms Of Services checkbox
    Then User clicks on Regsiter button
    Then User fetch otp from mail
    Then User clicks on Complete button
    Then User entering profile details "<firstname>" "<lastname>" and telephone
    Then User clicks on submit button to save profile page
    Then User entering business information "<businessName>" "<contactName>"
    Then User entering information businessPhone and contactEmail
    Then User entering address details "<address1>" "<address2>"
    Then User clicks on submit button on business profile page
    Then User enters credit card details "<fullName>" "<streetAddress>" "<cardNummber>" "<expiryDate>" "<cVV>" "<zipCode>"
    Then User clicks on submit button on payment profile page
    Then User clicks on MoreServices menu
    Then User clicks on List view
    Then User enters the added location in the searchbox "<locationname>"
    Then User clicks search button
    Then User selects the particular location
    Then User clicks on Data Archival tab
    Then User selects archival option
    Then User clicks on Save button on tab
    Then User clicks on MoreServices menu
    Then User clicks on List view
    Then User enters the added location in the searchbox "<locationname>"
    Then User clicks search button
    Then User selects the particular location
    Then User clicks on DRBackup tab
    Then user selects DRoption
    Then User clicks on Save button on tab
    Then User clicks on MoreServices menu
    Then User clicks on List view
    Then User enters the added location in the searchbox "<locationname>"
    Then User clicks search button
    Then User selects the particular location
    Then User clicks on Data security tab
    Then User clicks on data security options
    Then User clicks on Save button on tab
    Then User clicks on MoreServices menu
    Then User clicks on List view
    Then User enters the added location in the searchbox "<locationname>"
    Then User clicks search button
    Then User selects the particular location
    Then user clicks on techsupport
    Then User clicks on tech support options
    Then User clicks on Save button on tab
    Then User clicks on MoreServices menu
    Then User clicks on List view
    Then User enters the added location in the searchbox "<locationname>"
    Then User clicks search button
    Then User selects the particular location
    Then User clicks on Authentication tab
    Then User selecting the particular authentication
    Then User clicks on Save button on tab
    #Then User clicks on Activity log menu
    #Then verify record is logged in activity log with ActivityName "<ActivityName>"
    Then User launches the Provider Admin Portal Url
    Then User enters the credentials for provider admin portal "<userName>" "<password>"
    Then User clicking login button for PA portal
    Then User clicking Activity Log Menu in PA Portal
    Then User entering customer name in the search box for Activity Log Menu of PA Portal "<businessName>"
    Then User clicks Search Button for Activity Log menu of PA Portal
    Then User verify record in Activity Log of PA Portal for particular location MoreServices update "<moreservicesupdate>"

    Examples:
      | createPassword | confirmPassword | firstname | lastname | businessName | contactName | address1       | address2 | fullName       | streetAddress   | cardNummber         | expiryDate | cVV | zipCode | expectedDeletionMsg        | locationname | moreservicesupdate      | userName    | password     | businessName |
      | 12345@Testing  | 12345@Testing   | Eric      | Auto     | sales        | Regina      | 353 Sip Avenue | Tower2   | Steve Williams | 34 hudson yards | 4111 1111 1111 1111 | 10/22      | 217 | 63368   | Cannot Delete Headquarters | Headquarters | User Updated a Location | sp-ericsson | Stratus@1234 |              |
