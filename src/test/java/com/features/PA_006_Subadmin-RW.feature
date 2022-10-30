@WO1.1 @PASubAdminReadWrite @providerAdmin
Feature: Test Wireless Office application for Provider Admin - Sub Admin ReadWrite functionality

  #@createSubAdminReadWrite
  @paSubAdminRWPositive
  Scenario Outline: Creating SubAdmin in PA portal with read-write access
    Given Admin launching the Provider Admin Portal
    When Admin enters username and password
    When Admin clicks on login button
    Then Admin is in HomePage
    Then Admin clicks on SubAdmin module
    Then Admin clicks new button
    Then Admin fills "<firstName>" and "<lastName>" and "<email>" and "<phoneNumber>" and "<uName>" in subadminpage
    Then Admin changes the toggle button to readwrite
    Then Admin clicks on the submit button

    Examples: 
      | firstName | lastName | email                | phoneNumber | uName    |
      | Autosub2  | Autojs   | Autosub2@yopmail.com |  2175446647 | Autosub2 |

  #@updateSubAdminReadWrite
  @paSubAdminRWPositive
  Scenario Outline: Update SubAdmin details in PA portal
    Given Admin launching the Provider Admin Portal
    When Admin enters username and password
    When Admin clicks on login button
    Then Admin is in HomePage
    Then Admin clicks on SubAdmin module
    Then Admin searches "<subadminName>" in searchbar
    Then Admin clicks on createdsubadmin
    Then Admin updates "<firstName>" and "<lastName>" and "<phoneNumber>" in subadmin

    Examples: 
      | subadminName | firstName | lastName | phoneNumber |
      | Autosub2     | AutoJ     | Autorow  |  2151089090 |

  #@listViewReadWrite
  @paSubAdminRWPositive
  Scenario Outline: To view the subadmin details in Listview in PA portal
    Given Admin launching the Provider Admin Portal
    When Admin enters username and password
    When Admin clicks on login button
    Then Admin is in HomePage
    Then Admin clicks on SubAdmin module
    Then Admin clicks on the list view
    Then Admin enters "<subadminName>" to the Searchbar

    Examples: 
      | subadminName |
      | Autosub2     |

  #@gridViewReadWrite
  @paSubAdminRWPositive
  Scenario Outline: To view the subadmin details in Gridview in PA portal
    Given Admin launching the Provider Admin Portal
    When Admin enters username and password
    When Admin clicks on login button
    Then Admin is in HomePage
    Then Admin clicks on SubAdmin module
    Then Admin enters "<subadminName>" to the Searchbar

    Examples: 
      | subadminName |
      | Autosub2     |

  #@deleteSubAdminReadWrite
  @paSubAdminRWPositive
  Scenario Outline: Deleting SubAdmin details in PA portal
    Given Admin launching the Provider Admin Portal
    When Admin enters username and password
    When Admin clicks on login button
    Then Admin is in HomePage
    Then Admin clicks on SubAdmin module
    Then Admin enters "<subadminName>" to the Searchbar
    Then Admin clicks on the delete button

    Examples: 
      | subadminName |
      | Autosub2     |

  ############################ negative scenarios #############################################
  #@emailValidation
  @paSubAdminRWNegative
  Scenario Outline: Verify phonenumber validation in PA portal subadmin
    Given Admin launching the Provider Admin Portal
    When Admin enters username and password
    When Admin clicks on login button
    Then Admin is in HomePage
    Then Admin clicks on SubAdmin module
    Then Admin clicks on the new button
    Then Admin checks "<firstName>" and "<lastName>" and "<email>"

    Examples: 
      | firstName | lastName | email          |
      | Auto1     | Auto2    | 123@%^*123%com |

  #@phoneNumberValidation
  @paSubAdminRWNegative
  Scenario Outline: Verify phonenumber validation in PA portal subadmin
    Given Admin launching the Provider Admin Portal
    When Admin enters username and password
    When Admin clicks on login button
    Then Admin is in HomePage
    Then Admin clicks on SubAdmin module
    Then Admin clicks on the new button
    Then Admin checks the "<firstName>" and "<lastName>" and "<phoneNumber>"

    Examples: 
      | firstName | lastName | phoneNumber               |
      | Auto1     | Auto2    | 5538562865464523546222232 |

  #@cancelButtonFunctionality
  @paSubAdminRWNegative
  Scenario Outline: Verify Cancelbuttonfunctionality in PA portal subadmin
    Given Admin launching the Provider Admin Portal
    When Admin enters username and password
    When Admin clicks on login button
    Then Admin is in HomePage
    Then Admin clicks on SubAdmin module
    Then Admin clicks new button
    Then Admin fills "<firstName>" and "<lastName>" and "<email>" and "<phoneNumber>" and "<uName>" in subadminpage
    Then Admin cancels the creation of subadmin

    Examples: 
      | firstName | lastName | phoneNumber | email                | uName      |
      | Auto1     | Auto2    |  2130009984 | Autoew21@yopmail.com | Automation |

  #@submitButtonDisable
  @paSubAdminRWNegative
  Scenario Outline: Verify Submitbutton-enable/disable in PA portal subadmin
    Given Admin launching the Provider Admin Portal
    When Admin enters username and password
    When Admin clicks on login button
    Then Admin is in HomePage
    Then Admin clicks on SubAdmin module
    Then Admin clicks new button
    Then Admin fills "<firstName>" and "<lastName>" and "<email>" and "<phoneNumber>" and "<uName>" in subadminpage
    Then Admin inspects for Submit button is enabled or disabled

    Examples: 
      | firstName | lastName | email                | phoneNumber | uName |
      | Auto1     | Auto2    | Autoew21@yopmail.com |  2187763546 |       |
