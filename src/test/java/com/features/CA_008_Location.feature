@customerAdmin @WO2.1 @Ca-locations @SSPLocations
Feature: Test Wireless Office application for Customer Admin - Location functionality
		
@positivescenario      
@CaLocationsCRUD
 Scenario Outline: Verify that a CA created updated and deleted a location
    Given User navigates to Customer Admin Portal
    Then user navigate to WirelessOffice application
    Then User enter Login details like "<email>" "<password>"
    Then User clicks on Login button
    Then User fetch otp from mail for "<email>"
    Then User clicks on Complete button
    Then User clicks on Location menu
    Then user checks the title of the page
    Then user checks the header title of the page
    Then User performs location creation and duplicate location creation and location creation other than US
    Then User performs location updation and headquaters name updation
    Then User performs location deletion and headquaters deletion
  
   Examples: 
      |email                      	|password     	|
      |automationtest@mailsac.com	|Stratus@123456	|
      
@SSPLocationsCRUD    
      Examples: 
      |email                      	|password     	|
      |automationtestt@mailsac.com	|Stratus@1234	|

@positivescenario
@CaLocationsListGridMapViewSearchLocation
  Scenario Outline: Search the locations in the list,grid & map views
    Given User navigates to Customer Admin Portal
    Then user navigate to WirelessOffice application
    Then User enter Login details like "<email>" "<password>"
    Then User clicks on Login button
    Then User fetch otp from mail for "<email>"
    Then User clicks on Complete button
    Then User clicks on Location menu
    Then user checks the default view
    Then User clicks on list view icon
    Then User searches the location using "<location>" "<locAddressLine1>" "<country>" "<state>" "<city>" "<zipcode>"
    Then User clicks on grid view icon
    Then User searches the location using "<location>" "<locAddressLine1>" "<country>" "<state>" "<city>" "<zipcode>"
    Then User clicks on map view icon
    Then User searches the location using "<location>" "<locAddressLine1>" "<country>" "<state>" "<city>" "<zipcode>"
   
    Examples:
      | email                      | password     | location   	| locAddressLine1 | country       | state  		 | city     	| zipcode |
      | automationtest@mailsac.com | Stratus@123456 | Delaware	| 9 Marshel Ct    | United States | Delaware	 | Ocean View 	| 19970   |
      
@SSPLocationsListGridMapViewSearchLocation
    
    Examples: 
      |email                     	|password     	|location   |locAddressLine1  	|country       	|state     	|city        	|zipcode 	|
      |automationtestt@mailsac.com	|Stratus@1234	|Delaware	|9 Marshel Ct		|United States	|Delaware	|Ocean View		|19970		|
  

@positivescenario
@CaLocationsPagination
  Scenario Outline: Verify the pagination
    Given User navigates to Customer Admin Portal
    Then user navigate to WirelessOffice application
    Then User enter Login details like "<email>" "<password>"
    Then User clicks on Login button
    Then User fetch otp from mail for "<email>"
    Then User clicks on Complete button
    Then User clicks on Location menu 
    Then user checks the valid page number in the pagination
    Then User clicks on next arrow in the pagination
    Then user checks the valid page number in the pagination after next arrow
    Then User clicks on previous arrow in the pagination
    Then user checks the valid page number in the pagination
    Then User clicks on show dropup
    Then User clicks on 20 entries in the dropup
    Then User clicks on show dropup
    Then User clicks on 30 entries in the dropup
    Then User clicks on show dropup
    Then User clicks on 10 entries in the dropup

    Examples: 
      |email                      	|password     	|
      |automationtest@mailsac.com	|Stratus@123456	|
      
@SSPLocationsPagination

    Examples: 
      |email                      	|password     	|
      |automationtestt@mailsac.com	|Stratus@1234	|

    
@negativescenario
@CaLocationsMandatoryFiledsSaveButton
  Scenario Outline: Verify the valid entries based on the selection
    Given User navigates to Customer Admin Portal
    Then user navigate to WirelessOffice application
    Then User enter Login details like "<email>" "<password>"
    Then User clicks on Login button
    Then User fetch otp from mail for "<email>"
    Then User clicks on Complete button
    Then User clicks on Location menu
    Then User clicks on add New Location button
    Then User enters New Location Details "<Location1>"
    Then User checks the save button is enabled or disabled
    Then User clicks on the cancel button
    Then User clicks on add New Location button
    Then User entering New Location Details "<locationName>"
    Then User checks the save button is enabled or disabled
    Then User clicks on the cancel button
    

    Examples: 
      |email                     	|password    	|Location1    	|locationName	|
      |automationtest@mailsac.com	|Stratus@123456   |89 Grant Ave	|Wyoming		|
      
@SSPLocationsMandatoryFiledsSaveButton

    Examples: 
     |email                     	|password    	|Location1    	|locationName	|
     |automationtestt@mailsac.com	|Stratus@1234   |89 Grant Ave	|Wyoming		|
     
@negativescenario
@CaLocationsValidations
  Scenario Outline:Verify that all validations are successfull
    Given User navigates to Customer Admin Portal
    Then user navigate to WirelessOffice application
    Then User enter Login details like "<email>" "<password>"
    Then User clicks on Login button
    Then User fetch otp from mail for "<email>"
    Then User clicks on Complete button
    Then User clicks on Location menu
    Then user checks the elements present on locations page
    Then admin checks the Tab functionality
    Then admin checks the required field validations
    Then admin checks the length validations
    Then admin checks the asterisk symbols
    Then admin checks the spaces trim

    Examples:
      | email                      | password     |
      | automationtest@mailsac.com | Stratus@123456 |

@SSPLocationsValidations
     Examples:
      | email                      | password     |
      | automationtestt@mailsac.com | Stratus@1234 |


@negativescenario
@CaLocationsspecialcharacters
  Scenario Outline:Verify that all validations are successfull
    Given User navigates to Customer Admin Portal
    Then user navigate to WirelessOffice application
    Then User enter Login details like "<email>" "<password>"
    Then User clicks on Login button
    Then User fetch otp from mail for "<email>"
    Then User clicks on Complete button
    Then User clicks on Location menu
    Then admin checks the valid special characters
    Then admin checks the invalid special characters
    
    Examples:
      |email                        |password       |
      |automationtest@mailsac.com	|Stratus@123456	|
     

@SSPLocationsspecialcharacters
     Examples:
      | email                      | password     |
      | automationtestt@mailsac.com | Stratus@1234 |

@positivescenario
@CaLocationsPrivacyLegal
  Scenario Outline: Verify location is not created on clicking on cancel
    Given User navigates to Customer Admin Portal
    Then user navigate to WirelessOffice application
    Then User enter Login details like "<email>" "<password>"
    Then User clicks on Login button
    Then User fetch otp from mail for "<email>"
    Then User clicks on Complete button
    Then User clicks on Location menu
    Then user checks the privacy legal on the footer
    
   Examples: 
      |email                     	|password     	|
      |automationtest@mailsac.com	|Stratus@123456	|
      
@SSPLocationsPrivacyLegal
     
     Examples: 
      |email                     	|password     	|
      |automationtestt@mailsac.com	|Stratus@1234	|