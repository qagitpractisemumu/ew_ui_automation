@WO2.1 @smoke @paSubAdminResetPassword @providerAdmin
Feature: Test Wireless Office application for Provider Admin - SubAdmin ResetPassword functionality

  #@changePassword
  @paSubAdminResetPasswordPositive
  Scenario Outline: To change the reset password in PA subadmin portal
    Given SubAdmin goes to Wireless Office application
    When SubAdmin will enter "<email>" and "<password>"
    When SubAdmin will be clicking on login button
    Then Admin fetchs otp from email for "<email>"
    Then Admin clicks on Complete button
    Then SubAdmin is in HomePage of the portal
    Then SubAdmin clicks on profile icon button
    Then SubAdmin clicks on the resetpassword
    Then SubAdmin can change the "<oldPassword>" and "<newPassword>" and "<confirmPassword>"
    Then SubAdmin clicks on the savebtn
    Then SubAdmin clicks on profile icon button
    Then SubAdmin clicks on the resetpassword
    Then SubAdmin can change the "<newPassword>" and "<oldPassword>" and "<oldPassword>"
    Then SubAdmin clicks on the savebtn
    Then SubAdmin signs out of the portal

    Examples: 
      | email                           | password      | oldPassword   | newPassword  | confirmPassword |
      | autodemosubadminpa1@yopmail.com | Testing@12345 | Testing@12345 | Testing@1234 | Testing@1234    |

  #********************************NegativeScenario************************************
  @unmatchedPasswords @paSubAdminResetPasswordNegative
  Scenario Outline: To change the reset password ENTER CORRECT OLD; UNMATCHED NEW AND CONFIRM PASSWORD
    Given SubAdmin goes to Wireless Office application
    When SubAdmin will enter "<email>" and "<password>"
    When SubAdmin will be clicking on login button
    Then Admin fetchs otp from email for "<email>"
    Then Admin clicks on Complete button
    Then SubAdmin is in HomePage of the portal
    Then SubAdmin clicks on profile icon button
    Then SubAdmin clicks on the resetpassword
    Then SubAdmin will enter the correct "<oldPassword>" and unmatched "<newPassword>" and "<confirmPassword>"

    Examples: 
      | email                           | password      | oldPassword   | newPassword  | confirmPassword |
      | autodemosubadminpa1@yopmail.com | Testing@12345 | Testing@12345 | Testing@0987 | Testing@09      |

  @savebuttonDisable @paSubAdminResetPasswordNegative
  Scenario Outline: To change the reset password SKIP THE FIELDS AND SAVE BUTTON IS ENABLED
    Given SubAdmin goes to Wireless Office application
    When SubAdmin will enter "<email>" and "<password>"
    When SubAdmin will be clicking on login button
    Then Admin fetchs otp from email for "<email>"
    Then Admin clicks on Complete button
    Then SubAdmin is in HomePage of the portal
    Then SubAdmin clicks on profile icon button
    Then SubAdmin clicks on the resetpassword
    Then SubAdmin ignores the "<oldPassword>" and "<newPassword>" and "<confirmPassword>" fields
    Then SubAdmin clicks on the savebutton to check it is enabled

    Examples: 
      | email                           | password      | oldPassword  | newPassword | confirmPassword |
      | autodemosubadminpa1@yopmail.com | Testing@12345 | Testing@1234 |             |                 |

  @AllElementsAreDisplayed
  Scenario Outline: All the elements and validations check in reset password window
    Given SubAdmin goes to Wireless Office application
    When SubAdmin will enter "<email>" and "<password>"
    When SubAdmin will be clicking on login button
    Then Admin fetchs otp from email for "<email>"
    Then Admin clicks on Complete button
    Then SubAdmin is in HomePage of the portal
    Then SubAdmin clicks on profile icon button
    Then SubAdmin clicks on the resetpassword
    Then SubAdmin validates "<validationScenario>" on Reset Password

    Examples: 
      | email                           | password      | validationScenario                             |
      | autodemosubadminpa1@yopmail.com | Testing@12345 | All elements are displayed                     |
      | autodemosubadminpa1@yopmail.com | Testing@12345 | Required field validation                      |
      | autodemosubadminpa1@yopmail.com | Testing@12345 | Password requirement                           |
      | autodemosubadminpa1@yopmail.com | Testing@12345 | Cancel button                                  |
      | autodemosubadminpa1@yopmail.com | Testing@12345 | New password cannot be the same as oldpassword |

  @verifyEmailUpdate
  Scenario Outline: To change the reset password email update in PA subadmin portal
    Given SubAdmin goes to Wireless Office application
    When SubAdmin will enter "<email>" and "<password>"
    When SubAdmin will be clicking on login button
    Then Admin fetchs otp from email for "<email>"
    Then Admin clicks on Complete button
    Then SubAdmin is in HomePage of the portal
    Then SubAdmin clicks on profile icon button
    Then SubAdmin clicks on the resetpassword
    Then SubAdmin can change the "<oldPassword>" and "<newPassword>" and "<confirmPassword>"
    Then SubAdmin clicks on the savebtn
    Then SubAdmin clicks on profile icon button
    Then SubAdmin clicks on the resetpassword
    Then SubAdmin can change the "<newPassword>" and "<oldPassword>" and "<oldPassword>"
    Then SubAdmin clicks on the savebtn
    Then Subadmin checks for the "<email>" for the update information
    Then SubAdmin signs out of the portal

    Examples: 
      | email                           | password      | oldPassword   | newPassword  | confirmPassword |
      | autodemosubadminpa1@yopmail.com | Testing@12345 | Testing@12345 | Testing@1234 | Testing@1234    |
