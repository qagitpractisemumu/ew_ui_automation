@customerAdmin@WO1.1
Feature: Test Wireless Office application for Customer Admin - Sub Admin functionality

###@subAdmin
  ###@createEditDeleteSubadmin
  @ca-Subadmin-Positive
  Scenario Outline: Verify that a sub admin is created, edited and deleted
    Given User navigates to Customer Admin Portal
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
    Then User clicks on sub admin menu
    Then User clicks on add new
    Then User enters "<subAdminFirstName>", "<subAdminLastName>", "<email>", phone and click on read and Write
    Then Users clicks on submit button
    Then User searches the created subAdmin
    Then User clicking on the search button
    Then User selects particular admin for deleting
    Then user clicking on the delete button
    Then user clicking on the confirm button

    Examples:
      | createPassword | confirmPassword | email                     | firstname | lastname | businessName  | contactName | address1       | address2 | fullName     | streetAddress     | cardNummber         | expiryDate | cVV | zipCode | subAdminFirstName | subAdminLastName |
      | 12345@Testing  | 12345@Testing   | customeradm77@mailsac.com | Demoauto  | TestInd  | Demoauto_test | Testdemoind | 353 Sip Avenue | Tower2   | AutotestDemo | Oxford University | 4111 1111 1111 1111 | 10/22      | 143 | 63368   | Autodemo          | TestInd          |

  @ca-Subadmin-Negative
  Scenario Outline: Verify the warning message when a subAdmin is created with existing email id
    Given User navigates to Customer Admin Portal
    Then User click on Login EmailID RadioButton
    Then User enter Login details like "<email>" "<password>"
    Then User clicks on Login button
    Then User fetch otp from mail
    Then User clicks on Complete button
    Then User clicks on sub admin menu
    Then User clicks on add new
    Then User enters "<subAdminFirstName>", "<subAdminLastName>", "<email1>", phone and click on read and Write
    Then Users clicks on submit button
    Then User clicks on sub admin menu
    Then User clicks on add new
    Then User entering subadmin "<firstName>" "<lastName>" "<email1>"
    Then User verifying Warning message for subadmin creation

    Examples:
      | email                      | password      | firstName | email1               | lastName | subAdminFirstName | subAdminLastName |
      | Autodemo755011@mailsac.com | 12345@Testing | Autotest  | Demotest@mailsac.com | Demoind  | Autotest          | Demoind          |
