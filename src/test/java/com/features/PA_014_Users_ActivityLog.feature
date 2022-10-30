@usersActivityLog
Feature: Test Wireless Office application for Provider Admin - Users - Activity Log functionality

  @createUserActivity
  Scenario Outline: Verify the the User is created with group and verify the record in Activity Log of PA Portal
    Given user navigate to WirelessOffice application
    Then User enters the Customer Admin Portal Url
    When User clicks on Login
    Then User click on Login EmailID RadioButton
    Then User entering valid emailid and valid password "<emailid>" "<password>"
    Then User clicks on Login button
    Then User fetch otp from mail by entering "<emailid>"
    Then User clicks on Complete button
    Then User clicks on App Store menu
    Then User selects any application
    Then User clicks Group Menu
    Then User clicks New Button
    Then User enters "<group>" and "<description>"
    Then User clicks select all checkbox
    Then User clicks save button
    Then User clicks Users menu
    Then User clicking on the New menu
    Then User entering details of "<firstname>" "<lastname>" "<email>"
    Then User entering details of "<username>" "<phone>"
    Then User selecting "<location>" "<groups>"
    Then User clicks Next button
    Then User clicks save button
    Then user clicking on the confirm button
    Then User launches the Provider Admin Portal Url
    Then User enters the credentials for provider admin portal "<userName>" "<password1>"
    Then User clicking login button for PA portal
    Then User clicking Activity Log Menu in PA Portal
    Then User entering customer name in the search box for Activity Log Menu of PA Portal "<customername>"
    Then User clicks Search Button for Activity Log menu of PA Portal
    Then User verify record in Activity Log of User create "<activitylogusercreate>"

    Examples:
      | emailid          | password      | group        | description        |  firstname | lastname | email             | phone      | username  | location     | group        | userName    | password1    | customername | activitylogusercreate       |
      | jb16@mailsac.com | 12345@Testing | Verizipiocon | Telecommunications |  prakevik  | mahivein | jb550@mailsac.com | 8599967090 | cindrella | Headquarters | Verizipiocon | sp-ericsson | Stratus@1234 | Erwine       | User Created a Cutomer User |

  @editUserActivityLog
  Scenario Outline: Verify the user can edit details of user created and verify Record in Activity Log of PA Portal.
    Given user navigate to WirelessOffice application
    Then User enters the Customer Admin Portal Url
    When User clicks on Login
    Then User click on Login EmailID RadioButton
    Then User entering valid emailid and valid password "<emailid>" "<password>"
    Then User clicks on Login button
    Then User fetch otp from mail by entering "<emailid>"
    Then User clicks on Complete button
    Then User clicks on users menu
    Then User entering the username in the searchbox "<username>"
    Then User clicks search button for user edit
    Then User selects the particular user for editing
    Then User clicking the Edit button
    Then User entering the edit details for user firstname "<firstname>" and lastname "<lastname>" and email "<email>" and phone "<phone>"
    Then User clicks on next button
    Then User selecting the particular local drive
    Then User clicks on Save button on tab
    Then User launches the Provider Admin Portal Url
    Then User enters the credentials for provider admin portal "<userName>" "<password1>"
    Then User clicking login button for PA portal
    Then User clicking Activity Log Menu in PA Portal
    Then User entering customer name in the search box for Activity Log Menu of PA Portal "<customername>"
    Then User clicks Search Button for Activity Log menu of PA Portal
    Then User verify record in Activity Log of PA Portal for User Edit "<activityloguseredit>"

    Examples:
      | emailid          | firstname | password      | username | lastname | email                    | phone      |  userName    | password1    | customername | activityloguseredit         |
      | jb16@mailsac.com | vanaaaam  | 12345@Testing | efgh     | daughter | vaniaaamdaug@mailsac.com | 8479887732 |  sp-ericsson | Stratus@1234 | Erwine       | User Updated a Cutomer User |
