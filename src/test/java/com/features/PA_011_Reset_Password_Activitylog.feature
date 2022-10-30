Feature: Test WirelessOffice application for Editing Password Functionality 

@CAresetpassword-PAActivitylog
Scenario Outline:
Verify the user can change the password using Reset password Functionality
	Given Admin launching the Provider Admin Portal
	Then User click on Login EmailID RadioButton 
	Then User entering valid emailid and valid password "<emailid>" "<password>" 
	Then User clicks on Login button 
	Then User fetch otp from mail by entering "<emailid>" 
	Then User clicks on Complete button 
	Then User clicks profile icon 
	Then User clicks reset password option 
	Then User should enter details "<oldpassword>" "<newpassword>" "<confirmpassword>" 
	Then User clicks submit button 
	Then User launches the Provider Admin Portal Url 
	Then User enters the credentials for provider admin portal "<userName>" "<password1>" 
	Then User clicking login button for PA portal 
	Then User clicking Activity Log Menu in PA Portal 
	Then User entering customer name in the search box for Activity Log Menu of PA Portal "<customername>" 
	Then User clicks Search Button for Activity Log menu of PA Portal 
	Then User verify record in Activity Log of PA Portal for Reset Password "<activitylogresetpassword>" 
	
	Examples: 
		|emailid           | password     |oldpassword   |newpassword   |confirmpassword |userName   |password1   |customername|activitylogresetpassword     |
		|rstpsswrdactivitylog@mailsac.com |Testing@1234|Testing@1234 |Testing@12345 |Testing@12345   |sp-ericsson|Stratus@1234|Deleteac      |User Password Reset for Admin|
		
		
		
		