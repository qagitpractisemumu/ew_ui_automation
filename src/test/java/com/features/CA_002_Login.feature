@customerAdmin @login @WO2.1
Feature: Test Wireless Office application for Customer Admin - Login functionality

  @caLogin
  Scenario Outline: Verify Login Functionality
    Given User navigates to Customer Admin Portal
    Then User enter Login details like "<email>" "<password>"
    Then User clicks on Login button
    Then User fetch otp from mail for "<email>"
    Then User clicks on Complete button

    Examples: 
      | email                  | password       |
      | qatesting1@mailsac.com | Ericsson@12345 |

  #@sspLogin
  #Examples:
  #| email                    | password     |
  #| septfree@mailsac.com     | Stratus@1234 |
  #| septpurchase@mailsac.com | Stratus@1234 |
  @elementsPresence
  Scenario: Verify elements presence on Login Page
    Given User navigates to Customer Admin Portal
    Then validate that all elements are present on login page

  @resendButton
  Scenario Outline: Verify resend button validations
    Given User navigates to Customer Admin Portal
    Then User enter Login details like "<email>" "<password>"
    Then User clicks on Login button
    Then User validate that cursor is autofocused on OTP field
    Then Validate that resend button is enabled after two mins
    Then User clicks on resend button of login page
    Then User validate that cursor is autofocused on OTP field
    Then User fetch otp from mail for "<email>"
    Then User clicks on Complete button

    Examples: 
      | email                | password      |
      | autojyca@mailsac.com | Testing@12345 |

    @sspLogin
    Examples: 
      | email                       | password      |
      | sspautomationtr@mailsac.com | Testing@12345 |

  @requiredField
  Scenario: Verify required field validations
    Given User navigates to Customer Admin Portal
    Then User performs required field validation on Login Page

  @invalidOtp
  Scenario Outline: Verify invalid otp validations
    Given User navigates to Customer Admin Portal
    Then User enter Login details like "<email>" "<password>"
    Then User clicks on Login button
    Then User performs invalid otp validation

    Examples: 
      | email                | password      |
      | autojyca@mailsac.com | Testing@12345 |

    @sspLogin
    Examples: 
      | email                       | password      |
      | sspautomationtr@mailsac.com | Testing@12345 |

  @disabledLoginButton
  Scenario: Verify login button is disabled
    Given User navigates to Customer Admin Portal
    Then Validates that Login button is disabled

  @loginWithSystemGeneratedPassword
  Scenario Outline: Verify Login Functionality with System Generated Password
    Given User navigates to Customer Admin Portal
    Then User enter Login details like "<email>" "<password>"
    Then User clicks on Login button
    Then User fetch otp from mail for "<email>"
    Then User clicks on Complete button

    Examples: 
      | email                             | password     |
      | resetpasswordtestacct@mailsac.com | a6fFZ&4j+jPz |

  @invalidFormatMobileLogin @ca-SignIn-Negative
  Scenario Outline: Verify invalid mobile number and verify the Warning Message
    Given User navigates to Customer Admin Portal
    Then User click on Login Phone RadioButton
    Then User will select the phone number code depends on country and entering mobile number "<mobile>"
    Then User verifying warning message for entering mobile number with alphabets in login page

    Examples: 
      | mobile     |
      | 938461753b |

  @unregisteredEmailLogin @ca-SignIn-Negative
  Scenario Outline: Verify invalid credentials
    Given User navigates to Customer Admin Portal
    Then User entering email which is not registered by giving "<emailid>" "<password>"
    Then User clicks on Login button
    Then User verifies the warning message

    Examples: 
      | emailid                         | password      |
      | jb1500norregistered@mailsac.com | 12345@Testing |

  @emailInvalidFormatLogin @ca-SignIn-Negative
  Scenario Outline: Verify invalid email id
    Given User navigates to Customer Admin Portal
    Then User entering email which is not registered by giving "<emailid>" "<password>"
    Then User verifies the warning message of invalid email format

    Examples: 
      | emailid          | password      |
      | jb1500mailsaccom | 12345@Testing |

  @verifyMobileNotRegisteredWarningMsg @ca-SignIn-Negative
  Scenario Outline: Verify mobile not registered
    Given User navigates to Customer Admin Portal
    Then User click on Login Phone RadioButton
    Then User will select the phone number code depends on country and entering mobile number "<mobile>"
    Then User entering the password for mobile number login "<password>"
    Then User clicks on Login button
    Then User verifying the warning message of mobile number not registered

    Examples: 
      | mobile     | password      |
      | 9597794090 | 12345@Testing |

  #  @invalidOtpAttempts
  #  Scenario Outline: Verify invalid otp attempts
  #    Given User navigates to Customer Admin Portal
  #    Then User enter Login details like "<email>" "<password>"
  #    Then User clicks on Login button
  #    Then User performs invalid otp attempt validation
  #
  #    Examples:
  #      | email                      | password       |
  #      | automationtest@mailsac.com | Stratus@123456 |
  #
  #    @sspLogin
  #    Examples:
  #      | email                        | password      |
  #      | sspautomationpur@yopmail.com | Testing@12345 |
  #
  #  @invalidEmailPasswordAttempts
  #  Scenario Outline: Verify invalid email password attempts
  #    Given User navigates to Customer Admin Portal
  #    Then User enter Login details like "<email>" "<password>"
  #    Then User clicks on Login button
  #    Then User performs invalid login attempt validation
  #
  #    Examples:
  #      | email                | password     |
  #      | septfree@mailsac.com | Stratus@1232 |
  #
  #  @invalidPhonePasswordAttempts
  #  Scenario Outline: Verify invalid phone password attempts
  #    Given User navigates to Customer Admin Portal
  #    Then User click on Login Phone RadioButton
  #    Then User will select the phone number code depends on country and entering mobile number "<mobile>"
  #    Then User entering the password for mobile number login "<password>"
  #    Then User clicks on Login button
  #    Then User performs invalid login attempt validation
  #
  #    Examples:
  #      | mobile     | password       |
  #      | 5135800015 | 123045@Testing |
  @countryCodePlainText
  Scenario: Verify country code is plain text
    Given User navigates to Customer Admin Portal
    Then User click on Login Phone RadioButton
    Then User validates that country code is plain text
