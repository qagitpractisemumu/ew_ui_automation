@locationActivityLog
Feature: Test Wireless Office application for Provider Admin - Location - Activity Log functionality

  @createUpdateDeleteLocationActivity
  Scenario Outline: Verify the customer admin can create,edit and delete Location and Verify the Record with Activity Log Menu of PA Portal
    Given Admin launching the Provider Admin Portal
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
    Then User clicks on Location menu
    Then User clicks on add New Location button
    Then User entering New Location Details "<locName>" "<Location1>" "<Location2>"
    Then User clicking on save button with js executor
    Then User enters the added location in the searchbox "<typeName1>"
    Then User clicks search button
    Then User selects the particular location
    Then User clicking on Edit option of location details
    Then User entering new location details for edit "<typeName2>"
    Then User clicking on save button with js executor
    Then User enters the added location in the searchbox "<typeName3>"
    Then User clicks search button
    Then User selects the particular location
    Then User clicked the button to delete location
    Then user clicking on confirming yes button
    Then User launches the Provider Admin Portal Url
    Then User enters the credentials for provider admin portal "<username>" "<password1>"
    Then User clicking login button for PA portal
    Then User clicking Activity Log Menu in PA Portal
    Then User entering customer name in the search box for Activity Log Menu of PA Portal "<businessName>"
    Then User clicks Search Button for Activity Log menu of PA Portal
    Then User verify record in Activity Log in PA Portal for Location Create "<activityloglocationcreate>"
    Then User verify record in Activity Log in PA Portal for Location Edit "<activityloglocationedit>"
    Then User verify record in Activity Log in PA Portal for Location Delete "<activityloglocationdelete>"

    Examples:
      | createPassword | confirmPassword | firstname | lastname | businessName | contactName | address1       | address2 | fullName       | streetAddress   | cardNummber         | expiryDate | cVV | zipCode | locName | Location1   | Location2 | typeName1 | typeName2 | typeName3 | username    | password1    | businessName | activityloglocationcreate | activityloglocationedit | activityloglocationdelete |
      | 12345@Testing  | 12345@Testing   | Eric      | Auto     | sales        | Rahul       | 353 Sip Avenue | Tower2   | Steve Williams | 34 hudson yards | 4111 1111 1111 1111 | 10/22      | 217 | 63368   | Madurai | SathyaBhama | Floor 3   | Madurai   | Salem     | Salem     | sp-ericsson | Stratus@1234 |              | User Added a Location     | User Updated a Location | User Deleted a Location   |
