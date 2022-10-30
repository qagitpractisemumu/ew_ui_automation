@customerAdmin @WO1.1
Feature: Test Wireless Office application for Customer Admin - Users functionality

  ###@users
  ###@registerAndCreateUser@sanityTest
  @ca-Users-Positive
  Scenario Outline: Verify the the customer account is register and user is created
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
    Then User clicks on Location menu
    Then User clicks on add New Location button
    Then User entering New Location Details "<location>" "<locAddressLine1>" "<locAddressLine2>"
    Then User clicking on save button with js executor
    Then User clicks on App Store menu
    Then User selects any application
    Then User clicks on groups menu
    Then User clicks on add new
    Then user enter group name "<groupName>" and "<descripion>"
    Then User select required software
    Then User clicks on Save button on tab
    Then User clicks Users menu
    Then User clicking on the New menu
    Then User entering details of "<usrFirstName>" "<usrLastName>" and email
    Then User entering details of "<userName>" and Phone
    Then User clicks Next button
    Then User clicks save button
    Then user clicking on the Confirm button to create user

    Examples:
      | createPassword | confirmPassword | firstname | lastname | businessName | contactName | address1       | address2 | fullName     | streetAddress     | cardNummber         | expiryDate | cVV | zipCode | location   | locAddressLine1     | locAddressLine2 | groupName     | descripion          | usrFirstName | usrLastName | userName       |
      | 12345@Testing  | 12345@Testing   | Autotest5 | DemoInd5 | DemoTests    | Autoind     | 353 Sip Avenue | Tower2   | AutoDemo Ind | Oxford University | 4111 1111 1111 1111 | 10/22      | 143 | 63368   | Manchester | Oklahoma University | Floor 1         | DemotestGroup | Quickbooks Advanced | AutoUsername | Demotest    | AutoDemo1Uname |

  ###@createeditUser
  @ca-Users-Positive
  Scenario Outline: Verify the the User is created and deleted
    Given User navigates to Customer Admin Portal
    Then User click on Login EmailID RadioButton
    Then User enter Login details like "<email>" "<password>"
    Then User clicks on Login button
    Then User fetch otp from mail for "<email>"
    Then User clicks on Complete button
    Then User clicks on App Store menu
    Then User selects any application
    Then User clicks on groups menu
    Then User clicks on add new
    Then user enter group name "<groupName>" and "<descripion>"
    Then User select required software
    Then User clicks on Save button on tab
    Then User clicks Users menu
    Then User clicking on the New menu
    Then User entering details of "<firstName>" "<lastName>" "<emailId>"
    Then User entering details of "<userName>" "<phone>"
    Then User clicks Next button
    Then User clicks save button
    Then user clicking on the Confirm button to create user
    Then User clicks Users menu
    Then User clicking on the New menu
    Then User entering details of "<firstName1>" "<lastName1>" "<emailId1>"
    Then User entering details of "<userName1>" "<phone1>"
    Then User clicks Next button
    Then User clicks save button
    Then user clicking on the Confirm button to create user
    Then User clicks on Activity log menu
    Then verify record is logged in activity log with ActivityName "<createActivityName>"
    Then User clicks Users menu
    Then User entering the username in the searchbox "<userName>"
    Then User clicks search button for user edit
    Then User selects the particular user for editing
    Then User clicking the Edit button
    Then User entering the edit details for user firstname "<newFirstName>" and lastname "<newLastName>" and email "<newEmail>" and phone "<newPhone>"
    Then User clicks on next button
    Then User clicks on Save button on tab
    Then User clicks on Activity log menu
    Then verify record is logged in activity log with ActivityName "<activityName>"

    Examples:
      | email                    | password      | firstName | lastName | emailId           | phone      | userName    | createActivityName      | deleteActivityName      | groupName | descripion         | userName1 | firstName1   | lastName1   | emailId1            | phone1     | activityName            | newFirstName | newLastName | newEmail            | newPhone   |
      | Autodemo2345@mailsac.com | 12345@Testing | Autotest1 | Demoind1 | jb350@mailsac.com | 8599964090 | AutoindDemo | Created a Customer User | Deleted a Customer User | TestGroup | Demo Group Created | Demotest  | AtomationInd | TestInddemo | demoInd@mailsac.com | 8478889532 | Updated a Customer User | TestInd      | AutoInddemo | Demoind@mailsac.com | 8478889532 |

  ###@duplicateUserCreationWarningScenarioandDeleteUser
  @ca-Users-Negative
  Scenario Outline: Verify the User is getting Warning message while creating User with existing username
    Given User navigates to Customer Admin Portal
    Then User click on Login EmailID RadioButton
    Then User enter Login details like "<email>" "<password>"
    Then User clicks on Login button
    Then User fetch otp from mail for "<email>"
    Then User clicks on Complete button
    Then User clicks Users menu
    Then User clicking on the New menu
    Then User entering details of "<firstName>" "<lastName>" "<emailId>"
    Then User entering details of "<userName>" "<phone>"
    Then User verifying warning message for username while creating user
    Then User clicks Users menu
    Then User entering the username in the searchbox "<userName>"
    Then User clicks search button for user search and delete
    Then User selects the particular user for deleting
    Then User clicking on delete icon to delete user
    Then user clicking on the Confirm button to delete user
    Then User clicks on Activity log menu
    Then verify record is logged in activity log with ActivityName "<deleteActivityName>"

    Examples:
      | email                    | password      | userName | firstName | lastName | emailId              | phone      | deleteActivityName      |
      | Autodemo2345@mailsac.com | 12345@Testing | Testdemo | AutoInd1  | Demoauto | AutoTest@mailsac.com | 8478889532 | Deleted a Customer User |

  ###@cancelUser
  @ca-Users-Negative
  Scenario Outline: Verify the the User creation is cancelled
    Given User navigates to Customer Admin Portal
    Then User click on Login EmailID RadioButton
    Then User enter Login details like "<email>" "<password>"
    Then User clicks on Login button
    Then User fetch otp from mail for "<email>"
    Then User clicks on Complete button
    Then User clicks Users menu
    Then User clicking on the New menu
    Then User entering details of "<firstName>" "<lastName>" "<email>"
    Then User entering details of "<userName>" "<phone>"
    #Then User clicks Next button
    Then User clicks on cancel button
    Then User clicks on users menu
    Then User enters non existing username in the searchbox "<userName>"

    Examples:
      | email                    | password      | firstName | lastName | email                | phone      | userName |
      | Autodemo2345@mailsac.com | 12345@Testing | Testdemo  | AutoInd  | testdemo@mailsac.com | 8599964090 | AutoTest |
