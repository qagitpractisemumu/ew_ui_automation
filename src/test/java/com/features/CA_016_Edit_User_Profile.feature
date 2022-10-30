@customerAdmin @WO2.1 @CA-SSP-EditProfile
Feature: Test Wireless Office application for Customer Admin - Edit User Profile Functionality

#1
  @ca-ssp-editProfile-Positive
    @sanityTest
  Scenario Outline: Verify the Customer is able to edit profile
    Given User navigates to Customer Admin Portal
    Then User click on Login EmailID RadioButton
    Then User enter Login details like "<email>" "<password>"
    Then User clicks on Login button
    Then User fetch otp from mail for "<email>"
    Then User clicks on Complete button
    Then User clicks profile icon
    Then User clicks edit profile option.
    Then User editing details in "<newFirstName>" "<newLastName>" "<newMobileNo>"
    Then User uploads edit profile picture"<ProfileImage>"
    Then User clicks on submit button to save profile page
    Then User closes the success notification
    Then User checks email notification after profile update"<email>"
    Then User checks updated firstname beside profile icon"<newFirstName>"
    Then User clicks profile icon
    Then User checks updated firstname below profile icon"<newFirstName>"
    Then User clicks edit profile option.
    Then User editing Original details in "<OriginalFirstName>" "<OriginalLastName>" "<OriginalMobileNo>"
    Then User uploads Original profile picture"<OriginalProfileImage>"
    Then User clicks on submit button to save profile page


    Examples:
      | email                | password      | newFirstName      | newLastName      | newMobileNo | ProfileImage | OriginalFirstName  | OriginalLastName | OriginalMobileNo | OriginalProfileImage |
      | autojyca@mailsac.com | Testing@12345 | Testnewfirstname  | TestnewLastName  | 8127888787  | uploadimage  | TestAutomationJYCA | TestAccount      | 5135800015       | uploadimage          |
      | autojyca@mailsac.com | Testing@12345 | Testnew'firstname | Testnew'LastName | 8127888777  | uploadimage  | TestAutomationJYCA | TestAccount      | 5135800015       | uploadimage          |
      | autojyca@mailsac.com | Testing@12345 | Testnew-firstname | Testnew-LastName | 8127888777  | uploadimage  | TestAutomationJYCA | TestAccount      | 5135800015       | uploadimage          |
      | autojyca@mailsac.com | Testing@12345 | Testnew firstname | Testnew LastName | 8127888777  | uploadimage  | TestAutomationJYCA | TestAccount      | 5135800015       | uploadimage          |


    @SSP-EditUserProfile-Positive
    Examples:
      | email                       | password      | newFirstName        | newLastName        | newMobileNo | ProfileImage | OriginalFirstName     | OriginalLastName | OriginalMobileNo | OriginalProfileImage |
      | sspautomationtr@mailsac.com | Testing@12345 | sspTestnewfirstname | sspTestnewLastName | 8133833777  | uploadimage  | sspTestAutomationJYCA | ssplastnameTest  | 5135804938       | uploadimage          |
  
  
 #2
  #@ca-ssp-edit-UserProfile-Negative
  @ca-ssp-edit-UserProfile-Negative-phoneNumberAlreadyExist
  Scenario Outline: Verify the warning message while creating a user profile for existing phone number
    Given User navigates to Customer Admin Portal
    Then User click on Login EmailID RadioButton
    Then User enter Login details like "<email>" "<password>"
    Then User clicks on Login button
    Then User fetch otp from mail for "<email>"
    Then User clicks on Complete button
    Then User clicks profile icon
    Then User clicks edit profile option.
    Then User editing details in "<newFirstName>" "<newLastName>" "<newMobileNo>"
    Then User verifying Warning Message for Profile Details when the Already Used Mobile Number is entered.


    Examples:
      | email                | password      | newFirstName     | newLastName     | newMobileNo |
      | autojyca@mailsac.com | Testing@12345 | Testnewfirstname | TestnewLastName | 5135804938  |

    @SSP-EditUserProfile-ExisitngPhoneNumber-Negative
    Examples:
      | email                       | password      | newFirstName        | newLastName        | newMobileNo |
      | sspautomationtr@mailsac.com | Testing@12345 | SSPTestnewfirstname | SSPTestnewLastName | 5135800015  |


#3
  @ca-ssp-EditUserProfile-Field-Validations
    @sanityTest
  Scenario Outline: Verify the Customer is able to edit profile
    Given User navigates to Customer Admin Portal
    Then User click on Login EmailID RadioButton
    Then User enter Login details like "<email>" "<password>"
    Then User clicks on Login button
    Then User fetch otp from mail for "<email>"
    Then User clicks on Complete button
    Then User clicks profile icon
    Then User clicks edit profile option.
    Then User performs validation"<validationStep>"

    Examples:

      | email                | password      | validationStep                  |
      | autojyca@mailsac.com | Testing@12345 | All elements exists             |
      | autojyca@mailsac.com | Testing@12345 | Invalid Special Characters      |
      | autojyca@mailsac.com | Testing@12345 | Non editable fields             |
      | autojyca@mailsac.com | Testing@12345 | Blank values check              |
      | autojyca@mailsac.com | Testing@12345 | Invalid length check            |
      | autojyca@mailsac.com | Testing@12345 | Invalid phone number validation |




