@customerAdmin@WO2.1@ResetPassword
Feature: Test WirelessOffice application for Customer Admin - Reset Password Functionality

  @resetPasswordValidations
  Scenario Outline:Verify that all validations are successful
    Given User navigates to Customer Admin Portal
    When User enters email "<email>" and password "<password>"
    Then User clicks on Login button
    Then User fetch otp from mail for "<email>"
    Then User clicks on Complete button
    Then User clicks on Profile icon
    Then User clicks on Reset Password
    Then User validates "<validationScenario>" on Reset Password

    Examples:
      | email                         | password      | validationScenario                           |
      | automationtesting@mailsac.com | Testing@12345 | All elements are displayed                   |
      | automationtesting@mailsac.com | Testing@12345 | Required field validation                    |
      | automationtesting@mailsac.com | Testing@12345 | Tab functionality                            |
      | automationtesting@mailsac.com | Testing@12345 | Cursor is blinking on Old Password field     |
      | automationtesting@mailsac.com | Testing@12345 | Old password and new password cannot be same |
      | automationtesting@mailsac.com | Testing@12345 | Password Unmatched                           |
      | automationtesting@mailsac.com | Testing@12345 | Password requirement                         |
      | automationtesting@mailsac.com | Testing@12345 | Length Validation                            |
      | automationtesting@mailsac.com | Testing@12345 | Incorrect Old Password                       |
      | automationtesting@mailsac.com | Testing@12345 | Cancel Functionality                         |
    @ssp
    Examples:
      | email                     | password      | validationScenario                           |
      | sspautomation@mailsac.com | Testing@12345 | All elements are displayed                   |
      | sspautomation@mailsac.com | Testing@12345 | Required field validation                    |
      | sspautomation@mailsac.com | Testing@12345 | Tab functionality                            |
      | sspautomation@mailsac.com | Testing@12345 | Cursor is blinking on Old Password field     |
      | sspautomation@mailsac.com | Testing@12345 | Old password and new password cannot be same |
      | sspautomation@mailsac.com | Testing@12345 | Password Unmatched                           |
      | sspautomation@mailsac.com | Testing@12345 | Password requirement                         |
      | sspautomation@mailsac.com | Testing@12345 | Length Validation                            |
      | sspautomation@mailsac.com | Testing@12345 | Incorrect Old Password                       |
      | sspautomation@mailsac.com | Testing@12345 | Cancel Functionality                         |

  @resetPasswordFirstTimeLogin
  Scenario Outline:Verify first time login reset password functionality
    Given User navigates to Customer Admin Portal
    When User enters email "<email>" and password "<password>"
    Then User clicks on Login button
    Then User fetch otp from mail for "<email>"
    Then User clicks on Complete button
    Then User validates "<validationScenario>" on Reset Password

    Examples:
      | email                             | password     | validationScenario |
      | resetpasswordtestacct@mailsac.com | a6fFZ&4j+jPz | First time login   |

#   Once below test case fails during pipeline, its hard to identify the current password. Commenting it out for pipeline execution
#  @resetPasswordUpdate
#  Scenario Outline:Verify that password reset is successful
#    Given User navigates to Customer Admin Portal
#    When User enters email "<email>" and password "<newPassword>"
#    Then User clicks on Login button
#    Then Admin fetch otp from email for "<email>"
#    Then User clicks on Complete button
#    Then User clicks on Profile icon
#    Then User clicks on Reset Password
#    Then User updated reset password with "<originalPassword>" "<newPassword>" "<email>"
#    Then User clicks on Profile icon
#    Then User clicks on Reset Password
#    Then User updated reset password with "<newPassword>" "<newPassword1>" "<email>"
#    Then User clicks on Profile icon
#    Then User clicks on Reset Password
#    Then User updated reset password with "<newPassword1>" "<newPassword2>" "<email>"
#    Then User clicks on Profile icon
#    Then User clicks on Reset Password
#    Then User updated reset password with "<newPassword2>" "<newPassword3>" "<email>"
#    Then User clicks on Profile icon
#    Then User clicks on Reset Password
#    Then User updated reset password with "<newPassword3>" "<newPassword4>" "<email>"
#    Then User clicks on Profile icon
#    Then User clicks on Reset Password
#    Then User updated reset password with "<newPassword4>" "<originalPassword>" "<email>"
#
#    Examples:
#      | email                            | originalPassword | newPassword   | newPassword1  | newPassword2  | newPassword3  | newPassword4  |
#      | resetpswrdemailnotif@yopmail.com | Testing@12345    | Testing@54321 | Testing@54322 | Testing@54323 | Testing@54324 | Testing@54325 |
#      | sspresetpassword@yopmail.com     | Testing@12345    | Testing@54321 | Testing@54322 | Testing@54323 | Testing@54324 | Testing@54325 |
