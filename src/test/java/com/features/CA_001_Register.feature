@customerAdmin@WO1.1
Feature: Test Wireless Office application for Customer Admin - Register functionality
#@happyPath@emailRegistration@sanityTest

  @register
  @caRegisterPositive
  Scenario Outline: Verify Register Functionality using email
    Given User navigates to Customer Admin Portal
    Then User click on Create Account link
    Then User select Create Accoutn with EmailID
    Then User enter registeration details like "<createPassword>" and "<confirmPassword>"
    Then User select Terms Of Services checkbox
    Then User clicks on Regsiter button
    Then User fetch otp from mail
    Then User clicks on Complete button

    Examples:
      | createPassword | confirmPassword |
      | 12345@Testing  | 12345@Testing   |

  #@verifyCheckboxSignupAreDisabled
  @ca-Register-Negative
  Scenario: Verify that the Checkbox and Signup button are disabled
    Given User navigates to Customer Admin Portal
    Then User click on Create Account link
    Then User verifying the checkbox and the signup button is not in Clickable stage

  #@mobileRegistration
  @ca-Register-Positive
  Scenario Outline: Verify Register functionality with Mobile Number and verifying the options to get OTP
    Given User navigates to Customer Admin Portal
    Then User click on Create Account link
    Then User selecting the phone number code and entering mobile number "<mobile>"
    Then User entering credentials of "<createPassword>" "<confirmPassword>"
    Then User select Terms Of Services checkbox
    Then User clicks on Regsiter button
    Then User verifying the options of Text me and Authentication call

    Examples:
      | mobile     | createPassword | confirmPassword |
      | 9597794090 | 12345@Testing  | 12345@Testing   |

  #@invalidMobileNumberRegistration
  @ca-Register-Negative
  Scenario Outline: Verify register functionality by entering invalid mobile number and verify the warning message
    Given User navigates to Customer Admin Portal
    Then User click on Create Account link
    Then User selecting the phone number code and entering invalid mobile number "<mobile>"
    Then User verifying the warning message for using alphabets in mobile number which is invalid

    Examples:
      | mobile     |
      | 959779409a |

  #@invalidEmailIdRegistration @Negative
  @ca-Register-Negative
  Scenario Outline: Verify register functionality by entering invalid email id and verify the warning message
    Given User navigates to Customer Admin Portal
    Then User click on Create Account link
    Then User select Create Accoutn with EmailID
    Then User entering emailid "<emailid>"
    Then User verifying the Invalid email message for Register

    Examples:
      | emailid        |
      | jb00mailsaccom |

  #@invalidOtpWhileRegistering
  @ca-Register-Negative
  Scenario Outline: Verify the warning message while registering with wrong OTP
    Given User navigates to Customer Admin Portal
    Then User click on Create Account link
    Then User select Create Accoutn with EmailID
    Then User entering "<emailId>" "<createPassword>" "<confirmPassword>"
    Then User select Terms Of Services checkbox
    Then User clicks on Regsiter button
    Then User entering Wrong Otp in Otp text box "<otpNumber>"
    Then User clicks on Complete button
    Then User verifying the warning message for Invalid Otp while registering account

    Examples:
      | emailId           | createPassword | confirmPassword | otpNumber |
      | jb133@mailsac.com | 12345@Testing  | 12345@Testing   | 000000    |

  #@registerMultipleAccounts
  @ca-Register-Positive
  Scenario Outline: Verify Register Functionality registering multiple accounts
    Given User navigates to Customer Admin Portal
    Then User click on Create Account link
    Then User select Create Accoutn with EmailID
    Then User enter registeration details like "<createPassword>" and "<confirmPassword>"
    Then User select Terms Of Services checkbox
    Then User clicks on Regsiter button
    Then User fetch otp from mail
    Then User clicks on Complete button

    Examples:
      | createPassword | confirmPassword |
      | 12345@Testing  | 12345@Testing   |
      | 12345@Testing  | 12345@Testing   |
      | 12345@Testing  | 12345@Testing   |
      | 12345@Testing  | 12345@Testing   |
      | 12345@Testing  | 12345@Testing   |
      | 12345@Testing  | 12345@Testing   |
      | 12345@Testing  | 12345@Testing   |
      | 12345@Testing  | 12345@Testing   |
      | 12345@Testing  | 12345@Testing   |
      | 12345@Testing  | 12345@Testing   |

  #@emailAccountAlreadyRegistered
  @ca-Register-Positive
  Scenario Outline: verifying the message when we use the Email for new Registration which is Already Registered
    Given User navigates to Customer Admin Portal
    Then User select Create Accoutn with EmailID
    Then User entering "<emailid>" "<createPassword>" "<confirmPassword>"
    Then User select Terms Of Services checkbox
    Then User clicks on Regsiter button
    Then User verifying the warning message for Already registered during Registration

    Examples:
      | emailid                         | createPassword | confirmPassword |
      | customeradmin134131@mailsac.com | 12345@Testing  | 12345@Testing   |

  #@mobileAccountAlreadyRegistered
  @ca-Register-Positive
  Scenario Outline: verify the warning message when we use the Mobile for new Registration which is Already Registered
    Given User navigates to Customer Admin Portal
    Then User selecting the phone number code and entering mobile number "<mobile>"
    Then User entering credentials of "<createPassword>" "<confirmPassword>"
    Then User select Terms Of Services checkbox
    Then User clicks on Regsiter button
    Then User verifying the warning message of Already Registered Mobile Number

    Examples:
      | mobile     | createPassword | confirmPassword |
      | 2016588425 | 12345@Testing  | 12345@Testing   |

  #@passwordMisMatchMobileRegistration
  @ca-Register-Negative
  Scenario Outline: Verify the warning Message for password mismatch
    Given User navigates to Customer Admin Portal
    Then User selecting the phone number code and entering mobile number "<mobile>"
    Then User entering different create and confirm password "<createPassword>" "<confirmPassword>"
    Then User verifying the warning message for giving different create and confirm password

    Examples:
      | mobile     | createPassword | confirmPassword |
      | 3156678790 | 12345@Testing  | 12344@Testing   |

  #@InvalidPhoneNumber
  @ca-Register-Negative
  Scenario Outline: Verify register Functionality by entering Invalid Mobile Number and verifying the Warning Message
    Given User navigates to Customer Admin Portal
    When User clicks on Login
    Then User click on Create Account link
    Then User selecting the phone number code and entering invalid mobile number "<mobile>"
    Then User entering credentials of "<createPassword>" "<confirmPassword>"
    Then User select Terms Of Services checkbox
    Then User clicks on Regsiter button
    Then User verifying the warning message for entering invalid mobile number for Registration
    Then User clicking Ok button

    Examples:
      | mobile    | createPassword | confirmPassword |
      | 959779409 | 12345@Testing  | 12345@Testing   |

  #@verifyTextMeOption
  @ca-Register-Positive
  Scenario Outline: Verify register Functionality with Mobile Number and verifying Text Me option to get OTP
    Given User navigates to Customer Admin Portal
    When User clicks on Login
    Then User click on Create Account link
    Then User selecting the phone number code and entering mobile number "<mobile>"
    Then User entering credentials of "<createPassword>" "<confirmPassword>"
    Then User select Terms Of Services checkbox
    Then User clicks on Regsiter button
    Then User clicking text me option

    Examples:
      | mobile     | createPassword | confirmPassword |
      | 2013320410 | 12345@Testing  | 12345@Testing   |

  #@verifyCallMeOption
  @ca-Register-Positive
  Scenario Outline: Verify register Functionality with Mobile Number and verifying Call Me option to get OTP
    Given User navigates to Customer Admin Portal
    Then User click on Create Account link
    Then User selecting the phone number code and entering mobile number "<mobile>"
    Then User entering credentials of "<createPassword>" "<confirmPassword>"
    Then User select Terms Of Services checkbox
    Then User clicks on Regsiter button
    Then User clicking call me option

    Examples:
      | mobile     | createPassword | confirmPassword |
      | 2013320410 | 12345@Testing  | 12345@Testing   |
