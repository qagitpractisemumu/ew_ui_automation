@customerAdmin@WO1.1
Feature: Test Wireless Office application for Customer Admin - User Profile Functionality

  ###@userProfile
  ###@createProfile@sanityTest
  @ca-UserProfile-Positive
  Scenario Outline: Verify the Customer is able to create profile
    Given User navigates to Customer Admin Portal
    Then User select Create Accoutn with EmailID
    Then User enter registeration details like "<createPassword>" and "<confirmPassword>"
    Then User select Terms Of Services checkbox
    Then User clicks on Regsiter button
    Then User fetch otp from mail
    Then User clicks on Complete button
    Then User entering profile details "<firstname>" "<lastname>" and telephone
    Then User uploads profile picture
    Then User clicks on submit button to save profile page

    Examples:
      | createPassword | confirmPassword | firstname | lastname      |
      | 12345@Testing  | 12345@Testing   | Ericson   | United states |

  ###@editProfile
  @ca-UserProfile-Positive
  Scenario Outline: Verify the Customer is able to edit profile
    Given User navigates to Customer Admin Portal
    When User clicks on Login
    Then User click on Login EmailID RadioButton
    Then User enter Login details like "<email>" "<password>"
    Then User clicks on Login button
    Then User fetch otp from mail for "<email>"
    Then User clicks on Complete button
    Then User clicks profile icon
    Then User clicks edit profile option.
    Then User editing details in "<oldFirstName>" "<oldMobileNo>"
    Then User clicks on submit button to save profile page
    Then User clicks edit profile option.
    Then User editing details in "<newFirstName>" "<newMobileNo>"
    Then User clicks on submit button to save profile page

    Examples:
      | email                      | password      | oldFirstName  | oldMobileNo | newFirstName     | newMobileNo |
      | Autodemo755011@mailsac.com | 12345@Testing | Testfirstname | 8478889533  | Testnewfirstname | 8125678767  |

  ###@phoneNumberAlreadyExist
  @ca-UserProfile-Negative
  Scenario Outline: Verify the warning message while creating a user profile for existing phone number
    Given User navigates to Customer Admin Portal
    Then User select Create Accoutn with EmailID
    Then User enter registeration details like "<createPassword>" and "<confirmPassword>"
    Then User select Terms Of Services checkbox
    Then User clicks on Regsiter button
    Then User fetch otp from mail
    Then User clicks on Complete button
    Then User entering profile details "<firstname>" "<lastname>" "<telephone>"
    Then User verifying Warning Message for Profile Details when the Already Used Mobile Number is entered.

    Examples:
      | createPassword | confirmPassword | firstname | lastname | telephone  |
      | 12345@Testing  | 12345@Testing   | Autotest1 | Ind1     | 2177772883 |
