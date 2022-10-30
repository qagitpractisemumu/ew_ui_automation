@users
Feature: Test WirelessOffice application, Verify the User is created with group but without local drive

  @addMultipleUsers
  Scenario Outline: Verify the the User is created with group without local drive
    Given User navigates to Customer Admin Portal
    Then User click on Login EmailID RadioButton
    Then User enter Login details like "<password>"
    Then User clicks on Login button
    Then User fetch otp from mail
    Then User clicks on Complete button
    Then User clicks Users menu
    Then User clicking on Add multiple users menu
    Then User clicking the select all checkbox for multiple users
    Then User entering details for multiple users create "<firstname1>" "<lastname1>" "<email1>" "<username1>"
    Then user selecting the phone code and entering mobile number for multiple user create "<mobile>"
    Then User selecting the group for Multiple User create
    Then User selecting the local drive for Multiple users create
    Then User selecting the Location for multiple user create

    Examples:
      | password      | firstname1 | lastname1 | email1         | username1 | mobile     |
      | 12345@Testing | pradeep    | karthi    | pk@yopmail.com | prakarth  | 6389617532 |
      