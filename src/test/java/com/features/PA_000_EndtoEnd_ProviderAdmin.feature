@endToEndProviderAdmin@demo
Feature: Test Wireless Office application for Provider Admin - End to End Functionality

  Scenario Outline: Verify PA End to End Provider Admin Functionality
    Given Admin launching the Provider Admin Portal
    When Admin enters username and password
    When Admin clicks on login button
    Then Admin is in HomePage
    And Admin clicks on Customer Menu
    And Admin clicks on New button
    And Admin enters "<firstname>" and "<lastname>" and phone and email of "<Country>" in profile info
    And Admin clicks on Next button based on "<billingType>"
    And Admin enters business info  "<Businessname>", domainName, "<ContactName>", phone, ContactEmail, "<BusinessLogo>", "<Addressline1>", "<Addressline2>", "<city>", "<zipCode>", "<Country>"
    And Admin clicks on Next button2
    And Admin clicks on submit button
    Then Admin goes to Appstore menu
    Then Admin must fill the "<application>" in the searchbar
    Then Admin clicks on Support Menu
    Then Admin clicks on viewType to select ListView
    Then Admin clicks on Training Menu
    Then Admin clicks on plus icon
    Then Admin enters "<Modulename>" details
    Then Admin enters "<ModuleDescription>" information
    Then Admin click on FAQ subtab and New button
    Then Admin enters FAQ "<Questions>" and "<Answers>"
    Then Admin saves new training module
    Then Admin selects SubAdmin Menu
    Then Admin clicks new button
    Then Admin enter "<subAdminFirstName>", "<subAdminLastName>", email, phone, userName in subadminpage
    Then Admin clicks submit button
    Then Admin signout

    Examples:
      | firstname | lastname | Businessname | ContactName | BusinessLogo   | Addressline1 | Addressline2 | city     | Country       | zipCode | billingType | application | Modulename | ModuleDescription | Questions                               | Answers | subAdminFirstName | subAdminLastName |
      | Sneha     | Sarma    | TestUser     | Sneha       | profilePicture | Hudson Yards | New York     | New York | United States | 10001   | automatic   | Notepad++   | Demo       | This is Demo      | Mail will be sent to registered emailid | Demo    | Saanvi            | Bahl             |
