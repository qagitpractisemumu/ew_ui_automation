@customerAdmin@WO2.1@EditBusinessInfo
Feature:Test Wireless Office application for Customer Admin - Edit Business Info Functionality

  @ca-BusinessInfo-validations
  Scenario Outline:Verify that all validations are successful
    Given User navigates to Customer Admin Portal
    When User enters email "<email>" and password "<password>"
    Then User clicks on Login button
    Then User fetch otp from mail for "<email>"
    Then User clicks on Complete button
    Then User clicks on BusinessInfo menu
    Then corresponding validation "<validationStep>" is performed

    Examples:
      | email                         | password      | validationStep                                             |
      | automationtesting@mailsac.com | Testing@12345 | All elements are present for Onboarded Customer            |
      | automationtesting@mailsac.com | Testing@12345 | Tab functionality for Onboarded Customer                   |
      | automationtesting@mailsac.com | Testing@12345 | Required field validations for Onboarded Customer          |
      | automationtesting@mailsac.com | Testing@12345 | Invalid length validations for Onboarded Customer          |
      | automationtesting@mailsac.com | Testing@12345 | Cancel functionality for Onboarded Customer                |
      | automationtesting@mailsac.com | Testing@12345 | Update Contact Number ranging between one to ten in Length |

    @ssp
    Examples:
      | email                     | password      | validationStep                                              |
      | sspautomation@mailsac.com | Testing@12345 | All elements are present for Self Service Portal Customer   |
      | sspautomation@mailsac.com | Testing@12345 | Tab functionality for Self Service Portal Customer          |
      | sspautomation@mailsac.com | Testing@12345 | Required field validations for Self Service Portal Customer |
      | sspautomation@mailsac.com | Testing@12345 | Invalid length validations for Self Service Portal Customer |
      | sspautomation@mailsac.com | Testing@12345 | Cancel functionality for Self Service Portal Customer       |
      | sspautomation@mailsac.com | Testing@12345 | Update Contact Number ranging between one to ten in Length  |

  @ca-BusinessInfo-Positive
  Scenario Outline:Verify that Business Info is successfully Updated
    Given User navigates to Customer Admin Portal
    When User enters email "<email>" and password "<password>"
    Then User clicks on Login button
    Then Admin fetch otp from email for "<email>"
    Then User clicks on Complete button
    Then User clicks on BusinessInfo menu
    Then validate "<customer>" is able to update Business Info successfully and receive email notification to "<email>"

    Examples:
      | email                             | password      | customer  |
      | automationtestaccount@yopmail.com | Testing@12345 | Onboarded |

    @ssp
    Examples:
      | email                     | password      | customer     |
      | sspautomation@yopmail.com | Testing@12345 | Self Service |

  @ca-BusinessInfo-Negative
  Scenario Outline:Verify the special character validation
    Given User navigates to Customer Admin Portal
    When User enters email "<email>" and password "<password>"
    Then User clicks on Login button
    Then User fetch otp from mail for "<email>"
    Then User clicks on Complete button
    Then User clicks on BusinessInfo menu
    Then User performs "<customer>" special character validation

    Examples:
      | email                         | password      | customer     |
      | automationtesting@mailsac.com | Testing@12345 | Onboarded    |
      | sspautomation@mailsac.com     | Testing@12345 | Self Service |

  @ca-BusinessInfo-Positive
  Scenario Outline:Verify Business Logo validations
    Given User navigates to Customer Admin Portal
    When User enters email "<email>" and password "<password>"
    Then User clicks on Login button
    Then Admin fetch otp from email for "<email>"
    Then User clicks on Complete button
    Then User clicks on BusinessInfo menu
    Then User uploads deletes Business Logo

    Examples:
      | email                             | password      |
      | automationtestaccount@yopmail.com | Testing@12345 |
