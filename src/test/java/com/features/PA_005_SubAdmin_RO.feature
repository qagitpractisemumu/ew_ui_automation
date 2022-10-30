#@WO1.1 @SubadminReadonlyaccess
@providerAdmin
Feature: Test Wireless Office application for Provider Admin - Sub Admin ReadOnly functionality

  #@createSubadminReadOnlyAcess
  @paSubAdminROPositive
  Scenario Outline: Creating SubAdmin in MyMobileOperatorLogo
    Given Admin launching the Provider Admin Portal Url
    When Admin enters username and password
    When Admin clicks on login button
    Then Admin is in HomePage
    Then Admin clicks on SubAdmin Menu
    Then Admin clicks new button
    Then Admin enter "<firstName>" and "<lastName>" and "<email>" and "<phoneNumber>" and "<name>" in subadminpage
    Then Admin clicks submit button

    Examples:
      | firstName   | lastName | email              | phoneNumber | name  |
      | AutoTest_10 | Ind10    | Fiesta@yopmail.com | 6568562865  | Auto1 |

  #@updateSubadminReadOnlyAcess
  @paSubAdminROPositive
  Scenario Outline: Update SubAdmin details in MyMobileOperatorLogo
    Given Admin launching the Provider Admin Portal Url
    When Admin enters username and password
    When Admin clicks on login button
    Then Admin is in HomePage
    Then Admin clicks on SubAdmin Menu
    Then Admin enters "<subadminName>" in searchbar
    Then Admin clicks on subadminprofile
    Then Admin updates "<firstName>" and "<lastName>" and "<phoneNumber>" subadmin profile

    Examples:
      | subadminName | firstName   | lastName | phoneNumber |
      | AutoTest_10  | AutoTest_11 | Ind11    | 7567567865  |

  #@listView
  @paSubAdminROPositive
  Scenario Outline: To view the subadmin details in Listview
    Given Admin launching the Provider Admin Portal Url
    When Admin enters username and password
    When Admin clicks on login button
    Then Admin is in HomePage
    Then Admin clicks on SubAdmin Menu
    Then Admin clicks on list view
    Then Admin enters "<subadminName>" in the Searchbar

    Examples:
      | subadminName |
      | AutoTest_11  |

  #@gridView
  @paSubAdminROPositive
  Scenario Outline: To view the subadmin details in Gridview
    Given Admin launching the Provider Admin Portal Url
    When Admin enters username and password
    When Admin clicks on login button
    Then Admin is in HomePage
    Then Admin clicks on SubAdmin Menu
    Then Admin enters "<subadminName>" in the Search bar

    Examples:
      | subadminName |
      | AutoTest_11  |

  ############################ negative #############
  #@invalidPhoneNumberValidation
  @paSubAdminRONegative
  Scenario Outline: Verify phonenumber validation in Creation of sub-admin window
    Given Admin launching the Provider Admin Portal Url
    When Admin enters username and password
    When Admin clicks on login button
    Then Admin is in HomePage
    Then Admin clicks on SubAdmin Menu
    Then Admin clicks new button
    Then Admin provides "<firstName>" and "<lastName>" and "<phoneNumber>"

    Examples:
      | firstName | lastName | phoneNumber                  |
      | Auto1     | Auto1    | 6568562865764523546235452376 |

  #@invalidEmailValidation
  @paSubAdminRONegative
  Scenario Outline: Verify phonenumber validation in Creation of sub-admin window
    Given Admin launching the Provider Admin Portal Url
    When Admin enters username and password
    When Admin clicks on login button
    Then Admin is in HomePage
    Then Admin clicks on SubAdmin Menu
    Then Admin clicks new button
    Then Admin provide "<firstName>" and "<lastName>" and "<email>"

    Examples:
      | firstName | lastName | email              |
      | Auto2     | Auto2    | 4747$277@gmail.com |

  #@disableSaveButton
  @paSubAdminRONegative
  Scenario Outline: Verify Save button is disabled in Creation of sub-admin window
    Given Admin launching the Provider Admin Portal Url
    When Admin enters username and password
    When Admin clicks on login button
    Then Admin is in HomePage
    Then Admin clicks on SubAdmin Menu
    Then Admin clicks new button
    Then Admin enter "<firstName>" and "<lastName>" and "<email>" and "<phoneNumber>" and "<name>" in subadminpage
    Then Admin checks for save button is enabled

    Examples:
      | firstName | lastName | email               | phoneNumber | name   |
      | Auto3     | Auto3    | pratice@yopmail.com | 76767676767 | sample |

  #@enableCancelButton
  @paSubAdminRONegative
  Scenario Outline: Verify cancel button is enabled in Creation of sub-admin window
    Given Admin launching the Provider Admin Portal Url
    When Admin enters username and password
    When Admin clicks on login button
    Then Admin is in HomePage
    Then Admin clicks on SubAdmin Menu
    Then Admin clicks new button
    Then Admin enter "<firstName>" and "<lastName>" and "<email>" and "<phoneNumber>" and "<name>" in subadminpage
    Then Admin clicks on Cancel btn

    Examples:
      | firstName | lastName | email            | phoneNumber | name    |
      | Auto4     | Auto4    | vasu@yopmail.com | 7887888332  | sample1 |

  ################## positive ################
  #@deleteSubadminReadOnlyaccess
  @paSubAdminROPositive
  Scenario Outline: Deleting SubAdmin details in MyMobileOperatorLogo
    Given Admin launching the Provider Admin Portal
    When Admin enters username and password
    When Admin clicks on login button
    Then Admin is in HomePage
    Then Admin clicks on SubAdmin Menu
    Then Admin enters  "<subadmin>" to searchbar
    Then Admin clicks delete button

    Examples:
      | subadmin    |
      | AutoTest_11 |
