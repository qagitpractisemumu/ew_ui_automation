package StepDefinition;

import PagePanel.PA_LoginPanel;
import PagePanel.PA_SubadminResetpassword;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PA_Subadminsresetpassword {

	PA_SubadminResetpassword PAresetpasswordSub = new PA_SubadminResetpassword();

	@Given("^SubAdmin goes to Wireless Office application$")
	public void SubAdmin_goes_to_Wireless_Office_application() throws Throwable {
		PA_LoginPanel.getMasterviewUrl();
	}

	@When("^SubAdmin will enter \"(.*?)\" and \"(.*?)\"$")
	public void SubAdmin_willenter_username_and_password(String email, String password) {
		PAresetpasswordSub.enterUsername(email);
		PAresetpasswordSub.enterPassword(password);
	}

	@Then("^SubAdmin will be clicking on login button$")
	public void SubAdmin_will_beclicking_onloginbutton() {
		PAresetpasswordSub.loginButton();

	}

	@Then("^SubAdmin is in HomePage of the portal$")
	public void SubAdminisinHomePage() {
		System.out.println("Admin is in Homepage");
	}

	@Then("^SubAdmin clicks on profile icon button$")
	public void SubAdmin_clicks_on_profile_icon_button() throws InterruptedException {
		Thread.sleep(3000);
		PAresetpasswordSub.clickonprofileicon();
	}

	@Then("^SubAdmin clicks on the resetpassword$")
	public void SubAdminclicksontheresetpassword() {
		PAresetpasswordSub.clickonresetpassword();
	}


	@Then("^SubAdmin can change the \"(.*?)\" and \"(.*?)\" and \"(.*?)\"$")
	public void SubAdmin_can_changethe_oldPassword_newPassword_confirmPassword(String oldPassword, String newPassword,
			String confirmPassword) {
		PAresetpasswordSub.enteroldPassword_newPassword_confirmPassword(oldPassword, newPassword, confirmPassword);
	}

	@Then("^SubAdmin clicks on the savebtn$")
	public void SubAdmin_clicksonthe_savebtn() throws Exception {
		PAresetpasswordSub.hitssavebtn();
	}

	@Then("^SubAdmin signs out of the portal$")
	public void SubAdminsignsoutoftheportal() {
		PAresetpasswordSub.signoutbutton();

	}

	@Then("^SubAdmin will enter the correct \"(.*?)\" and unmatched \"(.*?)\" and \"(.*?)\"$")
	public void SubAdmin_changes_the_correct_oldPassword_andunmatched_newPassword_confirmPassword(String oldPassword,
			String newPassword, String confirmPassword) throws Exception {
		PAresetpasswordSub.enter_old_correct_Password_unmatched_newPassword_confirmPassword(oldPassword, newPassword,
				confirmPassword);
	}

	@Then("^SubAdmin ignores the \"(.*?)\" and \"(.*?)\" and \"(.*?)\" fields$")
	public void SubAdmin_will_skip_theoldPassword_newPassword_confirmPassword_fields(String oldPassword,
			String newPassword, String confirmPassword) throws InterruptedException {
		PAresetpasswordSub.skipthefields(oldPassword, newPassword, confirmPassword);
	
	}
	

	@Then("^SubAdmin clicks on the savebutton to check it is enabled$")
	public void SubAdminclicksonthesavebuttontocheckitisenabled() throws Exception {
		PAresetpasswordSub.savebtncheck();
	}
	
	@Then("^Subadmin checks for the \"(.*?)\" for the update information$")
	public void Subadminchecksforthefortheupdateinformation(String email) throws InterruptedException {
		PAresetpasswordSub.validateEmailResetUpdate(email);
	}
	
	
	@Then("^SubAdmin validates \"(.*?)\" on Reset Password$")
	public void SubAdminvalidatesonResetPassword(String validationScenario) throws InterruptedException {
	        if (validationScenario.equals("All elements are displayed")) {
	        	PAresetpasswordSub.AllelementsValidations();
	        } else if (validationScenario.equals("Required field validation")) {
	        	PAresetpasswordSub.allfieldvalidationsrequired();	
	        } else if (validationScenario.equals("Old password and new password cannot be same")) {
	        	PAresetpasswordSub.subadminValidatesThatOldPasswordAndNewPasswordCannotBeSameOnResetPassword();
	        } else if (validationScenario.equals("Password requirement")) {
	        	PAresetpasswordSub.subadminValidatesPasswordRequirementOnResetPassword();
	        } else if (validationScenario.equals("Cancel button")) {
	        	PAresetpasswordSub.cancelButton();
	        } else if (validationScenario.equals("Old password and new password cannot be same")) {
	        	PAresetpasswordSub.adminValidatesThatNewPasswordCannotbethesameasoldpassword();

	}
	        
	        
}}
