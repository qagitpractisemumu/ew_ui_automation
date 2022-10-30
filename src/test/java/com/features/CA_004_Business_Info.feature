@customerAdmin@WO1.1
Feature: Test Wireless Office application for Customer Admin - Business Info Functionality

  ###@businessInfo
  ####@createBusinessInfoProfile@sanityTest
  @ca-BusinessInfo-Positive
  Scenario Outline: Verify the Customer is able to create business profile
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

    Examples:
      | createPassword | confirmPassword | firstname | lastname | businessName  | contactName | address1       | address2 |
      | 12345@Testing  | 12345@Testing   | Autotest2 | Ind2     | EricssonTests | Erriconsin  | 353 Sip Avenue | Tower2   |

  @ca-BusinessInfo-Negative
  Scenario Outline: Verify warning message when business profile is created with existing email account
    Given User navigates to Customer Admin Portal
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
    Then User entering information "<businessPhone>" "<contactEmail>"
    Then User entering address details "<address1>" "<address2>"
    Then User clicks on submit button on business profile page
    Then User verifying the warning message for same contact email which is used
    Then User clicking on Ok button

    Examples:
      | createPassword | confirmPassword | firstname | lastname | businessPhone | contactEmail               | businessName  | contactName | address1       | address2 |
      | 12345@Testing  | 12345@Testing   | Autotest3 | Ind3     | 2017653432    | Autotestdemo_1@mailsac.com | AutodemoTests | Testin      | 353 Sip Avenue | Tower2   |
