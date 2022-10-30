@subAdminActivityLog
Feature: Test Wireless Office application for Provider Admin - Sub Admin - Activity Log functionality

  @createSubAdminActivity
  Scenario Outline: On sub-admin,Verify the created sub admin record is logged in activity log page of PA portal
    Given Admin launching the Provider Admin Portal
    Then User click on Login EmailID RadioButton
    Then User entering valid emailid and valid password "<emailid>" "<password>"
    Then User clicks on Login button
    Then User fetch otp from mail by entering "<emailid>"
    Then User clicks on Complete button
    Then User clicks on sub admin menu
    Then User clicks on add new
    Then User Enters name "<firstName>" and lastName "<lastName>" and email "<email>" and phone "<phone>" and click on read and Write
    Then Users clicks on submit button
    Then User launches the Provider Admin Portal Url
    Then User enters the credentials for provider admin portal "<userName>" "<password1>"
    Then User clicking login button for PA portal
    Then User clicking Activity Log Menu in PA Portal
    Then User entering customer name in the search box for Activity Log Menu of PA Portal "<customername>"
    Then User clicks Search Button for Activity Log menu of PA Portal
    Then User verify record in Activity Log of PA Portal for SubAdmin create "<activitylogsubadmincreate>"

    Examples:
      | emailid          | password      | firstName | email                  | lastName | phone      | userName    | password1    | customername | activitylogsubadmincreate |
      | jb16@mailsac.com | 12345@Testing | Betesh    | beteshcetesh@email.com | Cetesh   | 9484883332 | sp-ericsson | Stratus@1234 | Erwine       | User Created Sub Admin    |

  @editSubAdminActivity
  Scenario Outline: On sub-admin,deletion sub admin record is logged in activity log page of PA portal
    Given Admin launching the Provider Admin Portal
    Then User click on Login EmailID RadioButton
    Then User entering valid emailid and valid password "<emailid>" "<password>"
    Then User clicks on Login button
    Then User fetch otp from mail by entering "<emailid>"
    Then User clicks on Complete button
    Then User clicks on sub admin menu
    Then User entering the subadmin name in the searchbox "<adminname>"
    Then User clicking on the search button
    Then User selects particular admin for deleting
    Then user clicking on the delete button
    Then user clicking on the confirm button
    Then User launches the Provider Admin Portal Url
    Then User enters the credentials for provider admin portal "<userName>" "<password1>"
    Then User clicking login button for PA portal
    Then User clicking Activity Log Menu in PA Portal
    Then User entering customer name in the search box for Activity Log Menu of PA Portal "<customername>"
    Then User clicks Search Button for Activity Log menu of PA Portal
    Then User verify record in Activity Log of PA Portal for SubAdmin Delete "<activitylogsubadmindelete>"

    Examples:
      | emailid          | password      | adminname | userName    | password1    | customername | activitylogsubadmindelete |
      | jb16@mailsac.com | 12345@Testing | Betesh    | sp-ericsson | Stratus@1234 | Erwine       | User Deleted Sub Admin    |
