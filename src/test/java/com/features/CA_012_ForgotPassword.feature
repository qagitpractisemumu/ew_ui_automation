@customerAdmin@WO1.1
Feature: Test Wireless Office application for Customer Admin - Forgot Password Functionality
#@forgotPassword
  ###@sanityTest
  @ca-ForgotPassword-Positive
  Scenario Outline: Verify the User is able to change password using Forgot Password Functionality
    Given User navigates to Customer Admin Portal
    Then User click on Forgot Password option
    Then User click on Login EmailID RadioButton
    Then User enters emailId "<email>"
    Then User clicking on submit Button
    Then User clicks on OK button of successful reset email link
    Then User creates new tab and checking the mail "<email>"
    Then User clicks password reset link
    Then User enters "<newpassword>"
    Then User entering "<confirmpassword>"
    Then User clicks submit-button
    Then User clicking Ok button for successful reset

    Examples:
      | email                      | newpassword   | confirmpassword |
      | Autodemo409068@yopmail.com | 12345@Testing | 12345@Testing   |