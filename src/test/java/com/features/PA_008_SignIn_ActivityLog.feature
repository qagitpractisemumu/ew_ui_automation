@signInActivityLog
Feature: Test Wireless Office application for Provider Admin - Login - Activity Log functionality

  @signIn
  Scenario Outline: Verify Login Functionality
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
    Then User launches the Provider Admin Portal Url
    Then User enters the credentials for provider admin portal "<userName>" "<password1>"
    Then User clicking login button for PA portal
    Then User clicking Activity Log Menu in PA Portal
    Then User entering customer name in the search box for Activity Log Menu of PA Portal "<businessName>"
    Then User clicks Search Button for Activity Log menu of PA Portal
    Then User verify record in Activity Log of PA Portal for SignIn "<activitylogsignin>"

    Examples:
      | createPassword | confirmPassword | firstname | lastname | businessName | contactName | address1       | address2 | fullName       | streetAddress   | cardNummber         | expiryDate | cVV | zipCode | userName    | password1    | businessName | activitylogsignin |
      | 12345@Testing  | 12345@Testing   | Eric      | Auto     | sales        | Regina      | 353 Sip Avenue | Tower2   | Steve Williams | 34 hudson yards | 4111 1111 1111 1111 | 10/22      | 217 | 63368   | sp-ericsson | Stratus@1234 |              | User Signed Up    |
