@WO2.1 @providerAdmin @Smoke
Feature: Test Wireless Office application for Provider Admin - Login functionality

  @paLogin @paLoginPositive
  Scenario Outline: To Test login functionality in Masterview portal
    Given Admin launching the Provider Admin Portal
    When Admin enters credentials "<email>" and "<password>"
   # Then Admin clicks on login button
   # Then Admin fetchs otp from email for "<email>"
   # Then Admin clicks on Complete button
   # Then Admin is in HomePage

    Examples: 
      | email                       | password       |
      | serviceprovider@yopmail.com | ERic7$ft@$sson |

  @signout @paSignoutPositive
  Scenario Outline: Verify signout functionality in Masterview portal
    Given Admin launching the Provider Admin Portal
    When Admin enters credentials "<email>" and "<password>"
    Then Admin clicks on login button
    Then Admin fetchs otp from email for "<email>"
    Then Admin clicks on Complete button
    Then Admin is in HomePage
    Then Admin should be able to signout

    Examples: 
      | email                       | password       |
      | serviceprovider@yopmail.com | ERic7$ft@$sson |

  @skipEmailfield
  Scenario Outline: Verify validation for Email when it is skipped
    Given Admin launching the Provider Admin Portal
    Then Admin skips credentials "<email>" to view the validation

    Examples: 
      | email                       |
      | serviceprovider@yopmail.com |

  @skipPasswordfield
  Scenario Outline: Verify validation for password when it is skipped
    Given Admin launching the Provider Admin Portal
    Then Admin skips the credentials "<password>" to view the validation

    Examples: 
      | password       |
      | ERic7$ft@$sson |

  @invalidEmailId
  Scenario Outline: Verify validation for Email when it is invalid
    Given Admin launching the Provider Admin Portal
    Then Admin enters invalid "<emailID>" to view the validation

    Examples: 
      | emailID |
      | abc@@   |

  @privacyLegallink
  Scenario: Verify privacy and legal link
    Given Admin launching the Provider Admin Portal
    Then Admin clicks on the footer privacy and legal link

  @resetButtonEnable
  Scenario Outline: To Test resend button functionality in Masterview portal
    Given Admin launching the Provider Admin Portal
    When Admin enters credentials "<email>" and "<password>"
    Then Admin clicks on login button
    Then Admin waits till two minutes to find the resend button

    Examples: 
      | email                       | password       |
      | serviceprovider@yopmail.com | ERic7$ft@$sson |

  @allElementsDisplayed
  Scenario Outline: To find all elements of login page in Masterview portal
    Given Admin launching the Provider Admin Portal
    Then Admin checks for "<validation>" in the login page

    Examples: 
      | validation                 |
      | All Elements are displayed |
      | Required validations       |

  @codeIsRequiredValidation
  Scenario Outline: To check the code validation in Masterview portal
    Given Admin launching the Provider Admin Portal
    When Admin enters credentials "<email>" and "<password>"
    Then Admin clicks on login button
    Then Admin skips the otp for the validation

    Examples: 
      | email                       | password       |
      | serviceprovider@yopmail.com | ERic7$ft@$sson |

  @focusCursorOnOTPField
  Scenario Outline: To Test the cursor on OTP field in Masterview portal
    Given Admin launching the Provider Admin Portal
    When Admin enters credentials "<email>" and "<password>"
    Then Admin clicks on login button
    Then Admin checks for active element

    Examples: 
      | email                       | password       |
      | serviceprovider@yopmail.com | ERic7$ft@$sson |
      
      
       #*/Need to comment below Negative scenarios while executing PA Login/*
  #@login-invalidusername
  #Scenario Outline: To Test login functionality in Masterview portal by passing incorrect email
    #Given Admin navigates to WirelessOffice application
    #Then Admin launching the Provider Admin Portal Url
    #When Admin enters invalid "<email>" and valid "<password>"
    #Then Admin clicks on login button
    #Then Admin fetch otp from email for "<email>"
    #Then Admin clicks on Complete button
    #Then Admin is in HomePage
#
    #Examples: 
      #| email                   | password     |
      #| serviceprov@yopmail.com | Stratus@1234 |
#
  #@login-invalidpassword
  #Scenario Outline: To Test login functionality in Masterview portal by passing incorrect password
    #Given Admin navigates to WirelessOffice application
    #Then Admin launching the Provider Admin Portal Url
    #When Admin enters valid "<email>" and invalid "<password>"
    #Then Admin clicks on login button
    #Then Admin fetch otp from email for "<email>"
    #Then Admin clicks on Complete button
    #Then Admin is in HomePage
#
    #Examples: 
      #| email                   | password |
      #| serviceprov@yopmail.com | Stratus@ |
      
