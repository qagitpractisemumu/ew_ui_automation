package StepDefinition;

import PagePanel.PA_SubAdmin_Panel_RO;
import cucumber.api.java.en.Then;

public class PA_SubAdminSteps_RO {

	PA_SubAdmin_Panel_RO subadmin = new PA_SubAdmin_Panel_RO();

	@Then("^Admin clicks on SubAdmin Menu$")
	public void admin_clicks_on_sub_admin_menu() throws InterruptedException {
		Thread.sleep(3000);
		subadmin.click_On_SubAdmin_Menu();
	}

	@Then("^Admin selects SubAdmin Menu$")
	public void adminSelectsSubAdminMenu() {
		subadmin.clickSubAdminMenu();
	}

	@Then("^Admin clicks new button$")
	public void admin_clicks_new_button() {
		subadmin.click_On_New_Button();
	}

	@Then("^Admin enter \"(.*?)\" and \"(.*?)\" and \"(.*?)\" and \"(.*?)\" and \"(.*?)\" in subadminpage$")
	public void admin_enters_and_and_and_and_in_subadminpage(String firstName, String lastName, String email,
			String phoneNumber, String UserName) {
		subadmin.enter_firstname_lastname_email_phonenumber_username(firstName, lastName, email, phoneNumber, UserName);
	}

	@Then("^Admin clicks submit button$")
	public void admin_clicks_submit_button() throws Exception {
		subadmin.submit_button();
	}

	@Then("^Admin clicks on subadminprofile$")
	public void admin_clicks_on_subadminprofile() {
		subadmin.clicks_On_subadminprofile();
	}

	@Then("^Admin updates \"(.*?)\" and \"(.*?)\" and \"(.*?)\" subadmin profile$")
	public void admin_subadmin_profile(String firstName, String lastName, String phoneNumber) throws Exception {
		subadmin.update_SubAdmin_Profile(firstName, lastName, phoneNumber);
	}

	@Then("^Admin enters  \"(.*?)\" to searchbar$")
	public void admin_enters_to_searchbar(String subadminName) {
		subadmin.enter_Name_To_searchBar(subadminName);
	}

	@Then("^Admin clicks delete button$")
	public void admin_clicks_delete_button() throws Exception {
		subadmin.delete_SubAdminProfile();
	}

	@Then("^Admin provides \"(.*?)\" and \"(.*?)\" and \"(.*?)\"$")
	public void admin_provides_firstname_lastname_phonenumber(String firstName, String lastName, String phoneNumber)
			throws Exception {
		subadmin.phonenumber_Validation(firstName, lastName, phoneNumber);
	}

	@Then("^Admin clicks on list view$")
	public void admin_clicks_on_list_view() {
		subadmin.subadmin_In_Listview();
	}

	@Then("^Admin enters \"(.*?)\" in the Searchbar$")
	public void admin_enters_subadminname_in_the_Searchbar(String subadminName) throws Exception {
		subadmin.enter_Subadminname_Searchbar_Listview(subadminName);
	}

	@Then("^Admin enters \"(.*?)\" in the Search bar$")
	public void admin_enters_subadminname_in_the_Search_bar(String subadminName) throws Exception {
		subadmin.enter_Subadminname_Searchbar(subadminName);
	}

	@Then("^Admin provide \"(.*?)\" and \"(.*?)\" and \"(.*?)\"$")
	public void admin_provide_firstname_lastname_email(String firstName, String lastName, String email)
			throws Exception {
		subadmin.email_Validation(firstName, lastName, email);
	}

	@Then("^Admin checks for save button is enabled$")
	public void admin_checks_for_save_button_is_enabled() {
		subadmin.save_Button_Enabled();
	}

	@Then("^Admin clicks on Cancel btn$")
	public void admin_clicks_on_cancel_button() throws Exception {
		subadmin.admin_clicks_on_Cancel_button();
	}

	@Then("^Admin enter \"([^\"]*)\", \"([^\"]*)\", email, phone, userName in subadminpage$")
    public void adminEnterEmailPhoneUserNameInSubadminpage(String firstName, String lastName) {
		subadmin.adminEnterSubAdminDetails(firstName, lastName);
    }

}
