package StepDefinition;

import cucumber.api.java.en.Then;
import PagePanel.PA_SubAdmin_RW_Panel;

public class PA_SubAdminSteps_RW {

	PA_SubAdmin_RW_Panel subadminRW = new PA_SubAdmin_RW_Panel();

	@Then("^Admin clicks on SubAdmin module$")
	public void admin_clicks_on_sub_admin_module() throws InterruptedException {
		Thread.sleep(3000);
		subadminRW.click_On_SubAdmin_module();
	}

	@Then("^Admin clicks on the new button$")
	public void admin_clicksonthe_new_button() {
		subadminRW.click_On_New_Button();
	}

	@Then("^Admin fills \"(.*?)\" and \"(.*?)\" and \"(.*?)\" and \"(.*?)\" and \"(.*?)\" in subadminpage$")
	public void admin_enters_and_and_and_and_in_subadminpage(String firstName, String lastName, String email,
			String phoneNumber, String uName) {
		subadminRW.enter_firstname_lastname_email_phonenumber_username(firstName, lastName, email, phoneNumber, uName);
	}

	@Then("^Admin changes the toggle button to readwrite$")
	public void Admin_changes_the_toggle_buttonto_readwrite() {
		subadminRW.changetoggletoreadwriteaccess();
	}

	@Then("^Admin clicks on the submit button$")
	public void admin_clicksonthe_submit_button() throws Exception {
		subadminRW.submit_button();
	}

	@Then("^Admin searches \"(.*?)\" in searchbar$")
	public void admin_searches_in_searchbar(String subadminName) throws Exception {
		subadminRW.enter_Name_To_searchBar(subadminName);
	}

	@Then("^Admin clicks on createdsubadmin$")
	public void admin_clicks_on_createdsubadmin() {
		subadminRW.clicks_On_createdsubadmin();
	}

	@Then("^Admin updates \"(.*?)\" and \"(.*?)\" and \"(.*?)\" in subadmin$")
	public void admin_update_insubadmin(String firstName, String lastName, String phoneNumber) throws Exception {
		subadminRW.update_SubAdmin(firstName, lastName, phoneNumber);
	}

	@Then("^Admin clicks on the list view$")
	public void Admin_clicks_onthe_list_view() throws Exception {
		subadminRW.clicklistview();
	}

	@Then("^Admin enters \"(.*?)\" to the Searchbar$")
	public void admin_enters_to_searchbar(String subadminName) throws Exception {
		subadminRW.enter_subadmin_totheSearchbar(subadminName);
	}

	@Then("^Admin clicks on the delete button$")
	public void admin_clicksonthe_delete_button() throws Exception {
		subadminRW.delete_SubAdminProfile();
	}

	@Then("^Admin checks the \"(.*?)\" and \"(.*?)\" and \"(.*?)\"$")
	public void adminchecksphonenumber_validation(String firstName, String lastName, String phoneNumber)
			throws Exception {
		subadminRW.adminchecksphonenumber_validation(firstName, lastName, phoneNumber);
	}

	@Then("^Admin checks \"(.*?)\" and \"(.*?)\" and \"(.*?)\"$")
	public void adminchecksemail_validation(String firstName, String lastName, String email) throws Exception {
		subadminRW.adminchecksemail_validation(firstName, lastName, email);
	}

	@Then("^Admin cancels the creation of subadmin$")
	public void Admin_cancels_the_creation_of_subadmin() {
		subadminRW.Cancelbutton_functionality();
	}

	@Then("^Admin inspects for Submit button is enabled or disabled$")
	public void Admin_inspects_for_Submit_buttonisenabled_or_disabled() {
		subadminRW.Submitbutton_Enabled_disabled();
	}
}
