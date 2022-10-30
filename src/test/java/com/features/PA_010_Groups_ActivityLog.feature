@groupsActivityLog
Feature: Test Wireless Office application for Provider Admin - Groups - Activity Log functionality

  @createUpdateDeleteGroupsActivity
  Scenario Outline: Verify create,edit and delete Groups  and Verify Record in Activity Log of PA Portal
    Given Admin launching the Provider Admin Portal
    Then User click on Login EmailID RadioButton
    Then User entering valid emailid and valid password "<emailid>" "<password>"
    Then User clicks on Login button
    Then User fetch otp from mail by entering "<emailid>"
    Then User clicks on Complete button
    Then User clicks on App Store menu
    Then User selects any application
    Then User clicks on groups menu
    Then User clicks on add new
    Then user enter group name "<groupName>" and "<descripion>"
    Then User select required software
    Then User clicks on Save button on tab
    Then User clicks on groups menu
    Then User entering groupName in the searchbox "<groupName>"
    Then User clicks the search button for groups
    Then User selects the particular group
    Then User clicks Edit button
    Then User editing the details of a group by giving new "<groupName1>" "<description1>"
    Then User clicks on Save button on tab
    Then User entering the groupName in the searchbox to delete the particular group "<groupName2>"
    Then User clicks the search button for groups
    Then User selects the particular group
    Then user click on delete button
    Then user click on confirm button
    Then User launches the Provider Admin Portal Url
    Then User enters the credentials for provider admin portal "<username>" "<password1>"
    Then User clicking login button for PA portal
    Then User clicking Activity Log Menu in PA Portal
    Then User entering customer name in the search box for Activity Log Menu of PA Portal "<customername>"
    Then User clicks Search Button for Activity Log menu of PA Portal
    Then User verify record in Activity Log in PA Portal for Group Create "<activityloggroupcreate>"
    Then User verify record in Activity Log in PA Portal for Group Edit "<activityloggroupedit>"
    Then User verify record in Activity Log in PA Portal for Group Delete "<activityloggroupdelete>"

    Examples:
      | emailid          | groupName  | descripion          | password      | groupName1 | description1         | groupName2 | username    | password1    | activityloggroupcreate | activityloggroupedit | activityloggroupdelete | customername |
      | jb16@mailsac.com | Fertilizer | Quickbooks Advanced | 12345@Testing | Marketing  | Operations of Market | Marketing  | sp-ericsson | Stratus@1234 | User Created a Group   | User Updated a Group | User Deleted a Group   | Erwine       |
