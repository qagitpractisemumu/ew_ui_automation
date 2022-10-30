@customerAdmin@WO1.1
Feature: Test Wireless Office application for Customer Admin - Payment Profile Functionality

  ###@paymentProfile
  ####@createPaymentProfile@sanityTest
  @ca-Payment-Positive
  Scenario Outline: Verify the Customer is able to create profile
    Given User navigates to Customer Admin Portal
    Then User click on Create Account link
    Then User select Create Accoutn with EmailID
    Then User enter registeration details like "<createPassword>" and "<confirmPassword>"
    Then User select Terms Of Services checkbox
    Then User clicks on Regsiter button
    Then User fetch otp from mail
    Then User clicks on Complete button
    Then User entering profile details "<firstname>" "<lastname>" and telephone
    Then User uploads profile picture
    Then User clicks on submit button to save profile page
    Then User entering business information "<businessName>" "<contactName>"
    Then User entering information businessPhone and contactEmail
    Then User entering address details "<address1>" "<address2>"
    Then User uploads Business Logo
    Then User clicks on submit button on business profile page
    Then User enters credit card details "<fullName>" "<streetAddress>" "<cardNummber>" "<expiryDate>" "<cVV>" "<zipCode>"
    Then User clicks on submit button on payment profile page

    Examples:
      | createPassword | confirmPassword | firstname | lastname | businessName | contactName | address1       | address2 | fullName      | streetAddress     | cardNummber         | expiryDate | cVV | zipCode |
      | 12345@Testing  | 12345@Testing   | AutoTest  | Demo1    | Demotests1   | Ind_2       | 353 Sip Avenue | Tower2   | DemoAuto Test | Oxford University | 4111 1111 1111 1111 | 10/22      | 143 | 63368   |
