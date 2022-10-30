@ignore@endToEndCustomerAdmin@demo@customerAdmin
Feature: Test Wireless Office application for Customer Admin - End to End Functionality

  Scenario Outline: Verify CA End to End Customer Admin Functionality
    Given User navigates to Customer Admin Portal
    Then User select Create Accoutn with EmailID
    Then User creates a new customerAdmin account
    Then User select Terms Of Services checkbox
    Then User clicks on Regsiter button
    Then User fetch otp from mail for registered account
    Then User clicks on Complete button
    Then User completes user profile
    Then User completes business profile
    Then User completes payment profile
    Then User clicks on Location menu
    Then User clicks on add New Location button
    Then User entering New Location Details "<location>" "<locAddressLine1>" "<locAddressLine2>"
    Then User clicking on save button with js executor
    Then User clicks on Activity log menu
    Then verify record is logged in activity log with ActivityName "<locationActivityName>"
    Then User clicks on App Store menu
    Then User selects few applications
    Then User clicks on groups menu
    Then User clicks on add new
    Then user enter group name "<groupName>" and "<descripion>"
    Then User selects applications based on "<groupName>"
    Then User clicks on shared drive option based on "<groupName>"
    Then User selects 100GB Shared Drive based on "<groupName>"
    Then User clicks on Save button on tab
    Then User clicks on groups menu
    Then User clicks on add new
    Then user enter group name "<groupName2>" and "<descripion>"
    Then User selects applications based on "<groupName2>"
    Then User clicks on shared drive option based on "<groupName2>"
    Then User selects 100GB Shared Drive based on "<groupName2>"
    Then User clicks on Save button on tab
    Then User clicks on Activity log menu
    Then verify record is logged in activity log with ActivityName "<groupActivityName>"
    Then User clicks Users menu
    Then User clicking on the New menu
    Then User entering details of "<usrFirstName>" "<usrLastName>" and email
    Then User entering details of "<userName>" and Phone
    Then User clicks Next button
    Then User selects personal drive
    Then User clicks save button
    Then user clicking on the Confirm button to create user
    Then User clicks Users menu
    Then User clicking on the New menu
    Then User entering details of "<usrFirstName>" "<usrLastName>" and email
    Then User entering details of "<userName>" and Phone
    Then User selects "<groupName2>"
    Then User clicks Next button to create second user
    Then User selects personal drive
    Then User clicks save button
    Then user clicking on the Confirm button to create user
    Then User clicks on Activity log menu
    Then verify record is logged in activity log with ActivityName "<userActivityName>"
    Then User clicks on invoicetab and get latest invoice
    Then User searches for the latest invoice
    Then User clicks search button
    Then User clicks on Support menu
    Then User clicks on add new
    Then User Enters subject "<subject>" and description "<description>"
    Then User clicking on the submit button
    Then User clicks on Training
    Then User checks Video
    Then User searches video"<trainingName>"
    Then User clicks on sub admin menu
    Then User clicks on add new
    Then User Enters name "<subAdminFirstName>" and "<subAdminLastName>" and email, phone and click on read and Write
    Then Users clicks on submit button
    Then User clicking on the profile icon
    Then User clicking on Signout option
    Given user navigate to WirelessOffice application
    Then User launching the Provider Admin Portal Url
    When Admin enters username and password
    When Admin clicks on login button
    Then Admin is in HomePage
    And Admin clicks on Customer Menu
    And Admin searches the customer admin
    And Admin deletes the CAadmin

    Examples:
      | location   | locAddressLine1 | locAddressLine2 | groupName             | groupName2             | descripion          | usrFirstName | usrLastName | userName  | subject     | description           | trainingName | subAdminFirstName | subAdminLastName | locationActivityName | groupActivityName | userActivityName        |
      | New Jersey | Exchange Place  | Floor 1         | lowComputeSharedDrive | highComputeSharedDrive | This is a new group | Pratheek     | Jain        | prathikJn | Test Ticket | This is a test ticket | science      | Preethi           | Jain             | Added a Location     | Created a Group   | Created a Customer User |
