package StepDefinition;

import PagePanel.PA_appstorePanel;
import cucumber.api.java.en.Then;

public class PA_appstoresteps {

	PA_appstorePanel app = new PA_appstorePanel();

	@Then("^Admin goes to Appstore menu$")
	public void Admin_goes_to_Appstore_menu() throws InterruptedException {
		Thread.sleep(3000);
		app.click_On_Appstore_Link();
	}

	@Then("^Admin must fill the \"(.*?)\" in the searchbar$")
	public void Admin_must_fill_the_in_the_searchbar(String appName) throws Exception {
		app.typeAppName(appName);
	}

	@Then("^Admin clicks on the search box$")
	public void Admin_clicks_on_the_search_box() {
		app.click_on_the_searchbox();
	}

	@Then("^Admin can view the \"(.*?)\" applications in the right panel$")
	public void Admin_can_view_the_applications_in_the_right_panel(String software) throws Exception {
		app.enterSoftware(software);

	}

	@Then("Admin clicks on dropdown$")
	public void Admin_clicks_on_dropdown() throws Exception {
		app.clicks_On_dropdown();

	}

	@Then("^Admin selects the licenced from the dropdown$")
	public void Adminselectsthelicencedfromthedropdown() throws Exception {
		app.selectlicenced();
	}

	@Then("^Admin can view in list \"(.*?)\" application$")
	public void Admin_can_view_in_list_application(String licensedSoftware) throws Exception {
		app.viewLicensedsoftwares(licensedSoftware);

	}

	@Then("^Admin must able to click on plusbtn$")
	public void Admin_must_able_to_click_on_plusbtn() throws Exception {
		app.click_plusbtn();
	}

	@Then("^Admin will have to enter \"(.*?)\" and \"(.*?)\" and \"(.*?)\" and \"(.*?)\" and \"(.*?)\" and \"(.*?)\"$")
	public void admin_will_have_to_enter(String applicationName, String Category, String Pricing, String Features,
			String Specifications, String BriefDescription) throws Exception {
		app.creation_application(applicationName, Category, Pricing, Features, Specifications, BriefDescription);
		app.upload_image();
	}

	@Then("^Admin clicks on save button$")
	public void Admin_clicks_on_save_button() throws Exception {
		app.clickonsavebtn();
	}

	@Then("^Admin types \"(.*?)\" to the searchbox$")
	public void Admin_types(String App) throws Exception {
		app.fillappinthesearch(App);
	}

	@Then("^Admin clicks on editbtn$")
	public void Admin_click_on_editbtn() {
		app.editbutton();
	}

	@Then("^Admin will change the \"(.*?)\" and \"(.*?)\" and \"(.*?)\" and \"(.*?)\" and \"(.*?)\"$")
	public void Admin_clicks_on_editbtn_and_changethe(String category, String pricing, String features,
			String specifications, String briefDescription) throws Exception {
		app.edit_the_details(category, pricing, features, specifications, briefDescription);
		app.applicationlogoupdate();

	}

	@Then("^Admin saves the app$")
	public void Admin_saves_the_app() throws Exception {
		app.savetheupdate();

	}

	@Then("^Admin finds the deletebtn to delete the \"(.*?)\"$")
	public void Admin_finds_the_deletebtn_to_delete_the(String deleteApp) throws Exception {
		app.deletetheapp(deleteApp);

	}

	@Then("^Admin clicks on yesbtn$")
	public void Admin_clicks_on_yesbtn() throws Exception {
		app.confirm_to_deleteapp();

	}

	@Then("^Admin deselects the \"(.*?)\" application$")
	public void Admin_deselects_the_application(String mapped) throws Exception {
		app.deselectmappedapplication(mapped);
	}

	@Then("^Admin can click on newbtn and enters \"(.*?)\"$")
	public void Admin_can_click_on_newbtn_and_enter(String name) {
		app.enternameandskip(name);

	}

	@Then("^Admin leaves the field \"(.*?)\" and \"(.*?)\" and \"(.*?)\" and \"(.*?)\" as blank$")
	public void Admin_leaves_the_field_as_blank(String pricing, String features, String specifications,
			String Briefdescription) throws Exception {
		app.skip_price_features_specifications_description(pricing, features, specifications, Briefdescription);
	}

	@Then("^Admin checks if the save button is enabled$")
	public void Admin_checks_if_the_save_button_is_enabled() {
		app.checkforsavebutton();
	}

	@Then("^Admin search, select, view and deselect \"([^\"]*)\"$")
	public void adminSearchSelectViewAndDeselect(String application) throws Throwable {
		app.enterSoftware(application);
	}

	@Then("^Admin clicks on viewType to select ListView$")
	public void adminClicksOnViewTypeToSelectListView() throws InterruptedException {
	app.clickListView();
	}
}
