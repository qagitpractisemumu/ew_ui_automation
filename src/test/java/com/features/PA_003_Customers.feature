@WO1.1 @paCustomerPage @providerAdmin
Feature: Test Wireless Office application for Provider Admin - Customers functionality

  ************************* positive scenario *****************************

  #@CreateCustomer
  @paCustomerPositive
  Scenario Outline: To Test CA admin is created in Wireless Office Application
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
    And Admin clicks on Customer Menu
    And Admin enters "<Businessname>" in search bar
    And Admin deletes the CAadmin

    Examples:
      | firstname  | lastname | Businessname  | ContactName | BusinessLogo   | Addressline1                    | Addressline2  | city      | Country       | zipCode | billingType |
      | AutoTest_1 | Ind1     | AutoTest1Eric | AutoTest_1  | profilePicture | Hudson Yards                    | New York      | New York  | United States | 10001   | automatic   |
      | AutoTest_2 | Ind2     | AutoTest2Eric | AutoTest_2  | profilePicture | Hudson Yards                    | New York      | New York  | United States | 10001   | manual      |
      | AutoTest_3 | Ind3     | AutoTest3Eric | AutoTest_3  | pic            | Dharmapuri, Forest Colony,      | Uttar Pradesh | Agra      | India         | 500045  | automatic   |
      | AutoTest_4 | Ind4     | AutoTest4Eric | AutoTest_4  | pic            | Hazel & Hershey Coffee Roasters | Central       | Central   | Hongkong      | 12115   | automatic   |
      | AutoTest_5 | Ind5     | AutoTest5Eric | AutoTest_5  | pic            | Vasa Museum                     | Stockholm     | Stockholm | Sweden        | 115021  | manual      |

  #@Searchforbusinessdomainname-List/Gridview
  @paCustomerPositive
  Scenario Outline: To Test Business name in the Search bar by Gridview
    Given Admin launching the Provider Admin Portal
    When Admin enters username and password
    When Admin clicks on login button
    Then Admin is in HomePage
    And Admin clicks on Customer Menu
    And Admin enter "<businessName>" in the searchbar in "<viewType>"

    Examples:
      | businessName | viewType |
      | DND-List.com | List     |
      | DND-Grid.com | Grid     |

  #@Activebutton-launchDashboard
  @paCustomerPositive
  Scenario Outline: Verify admin can launch CA account in WO application
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
    And Admin clicks on Customer Menu
    And Admin enter "<Businessname>" in searchbar
    And Admin clicks on Launch Dashboard in customer details

    Examples:
      | firstname  | lastname | Businessname  | ContactName | BusinessLogo   | Addressline1 | Addressline2 | city     | Country       | zipCode | billingType |
      | AutoTest_6 | Ind6     | AutoTest6Eric | AutoTest_6  | profilePicture | Hudson Yards | New York     | New York | United States | 10001   | automatic   |

  #@Inactivebutton-DisableCAaccount
  @paCustomerPositive
  Scenario Outline: Verify admin can disable the CA account in WO application
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
    And Admin clicks on Customer Menu
    And Admin enter "<Businessname>" in searchbar
    And Admin disables toggle button in customer details

    Examples:
      | firstname  | lastname | Businessname  | ContactName | BusinessLogo   | Addressline1 | Addressline2 | city     | Country       | zipCode | billingType |
      | AutoTest_7 | Ind7     | AutoTest7Eric | AutoTest_7  | profilePicture | Hudson Yards | New York     | New York | United States | 10001   | automatic   |

  #************************* Negative scenario ******************************
  #@Searchforbusinessname
  @paCustomerNegative
  Scenario Outline: To Test Business name in the Search bar
    Given Admin launching the Provider Admin Portal
    When Admin enters username and password
    When Admin clicks on login button
    Then Admin is in HomePage
    And Admin clicks on Customer Menu
    And Admin enter "<Businessname>" in Searchbar

    Examples:
      | Businessname |
      | fdhghfs      |

  #@phonenumber-validation
  @paCustomerNegative
  Scenario Outline: Verify phonenumber uniqueness in Profile info page of WO application
    Given Admin launching the Provider Admin Portal
    When Admin enters username and password
    When Admin clicks on login button
    Then Admin is in HomePage
    And Admin clicks on Customer Menu
    And Admin clicks on New button
    And Admin enter "<firstname>" and "<lastname>" and "<phone>"

    Examples:
      | firstname | lastname | phone      |
      | Auto      | IND      | 5716783451 |

  #@Email-validation
  @paCustomerNegative
  Scenario Outline: Verify Email uniqueness in Profile info page of WO application
    Given Admin launching the Provider Admin Portal
    When Admin enters username and password
    When Admin clicks on login button
    Then Admin is in HomePage
    And Admin clicks on Customer Menu
    And Admin clicks on New button
    And Admin must enter "<firstname>" and "<lastname>" and "<phone>" and "<Email>"

    Examples:
      | firstname | lastname | phone       | Email               |
      | Auto      | Ind1     | 57148838902 | dndlist@yopmail.com |

  #@Phonenumber-15digits-for-different-countries
  @paCustomerNegative
  Scenario Outline: Verify phonenumber should not exceed morethan 15 digits in WO application
    Given Admin launching the Provider Admin Portal
    When Admin enters username and password
    When Admin clicks on login button
    Then Admin is in HomePage
    And Admin clicks on Customer Menu
    And Admin clicks on New button
    And Admin enters firstName and lastName and phone of "<country>"

    Examples:
      | country       |
      | United States |
      | Hongkong      |
      | Sweden        |
      | India         |

  #@BusinessImage
  @paCustomerNegative
  Scenario Outline: Verify Admin can upload incorrect image format in WO application
    Given Admin launching the Provider Admin Portal
    When Admin enters username and password
    When Admin clicks on login button
    Then Admin is in HomePage
    And Admin clicks on Customer Menu
    And Admin clicks on New button
    And Admin entering "<firstname>", "<lastname>", phone and email
    And Admin clicks on Next button
    And Admin enters business info  "<Businessname>" and "<BusinessDomain>" and "<ContactName>" and "<Phone1>" and "<ContactEmail>"  and uploads incorrect image format "<BusinessLogo>"

    Examples:
      | firstname  | lastname | Businessname  | BusinessDomain | ContactName | Phone1      | ContactEmail              | BusinessLogo   |
      | AutoTest_8 | Ind8     | AutoTest8Eric | pop.com        | AutoTest_8  | 57148838903 | AutoTest8Eric@yopmail.com | profilePicture |

  #@BusinessDomainName-Validate
  @paCustomerNegative
  Scenario Outline: Verify Admin can validate Business Domain Name in Business Info page
    Given Admin launching the Provider Admin Portal
    When Admin enters username and password
    When Admin clicks on login button
    Then Admin is in HomePage
    And Admin clicks on Customer Menu
    And Admin clicks on New button
    And Admin entering "<firstname>", "<lastname>", phone and email
    And Admin clicks on Next button
    And Admin enters business details  "<Businessname>" and "<BusinessDomain>" and "<ContactName>"

    Examples:
      | firstname  | lastname | Businessname  | BusinessDomain | ContactName |
      | AutoTest_9 | Ind9     | AutoTest9Eric | pppppp         | AutoTest_9  |
