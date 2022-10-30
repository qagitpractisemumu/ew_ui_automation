package StepDefinition;

import java.awt.AWTException;

import PagePanel.PA_TrainingPanel;
import cucumber.api.java.en.Then;

public class PA_TrainingSteps {

	PA_TrainingPanel trainingpanel = new PA_TrainingPanel();

	@Then("^Admin clicks on Training Menu$")
	public void admin_clicks_on_training_menu() throws InterruptedException {
		Thread.sleep(3000);
		trainingpanel.click_On_TrainingMenu();
	}

	@Then("^Admin clicks on plus icon$")
	public void admin_clicks_on_plus_icon() {
		trainingpanel.click_on_NewButton();
	}

	@Then("^Admin enters \"(.*?)\" details$")
	public void admin_enters_details(String Modulename) {
		trainingpanel.enter_ModuleName_Details(Modulename);
	}

	@Then("^Admin enters \"(.*?)\" information$")
	public void admin_enters_information(String ModuleDescription) {
		trainingpanel.enter_ModuleDescription_Details(ModuleDescription);
	}

	@Then("^Admin click on Documentation subtab and New button$")
	public void admin_click_on_documentation_subtab_and_new_button() {
		trainingpanel.click_On_Documentation_Subtab_and_New_Button();
	}

	@Then("^Admin \"(.*?)\" the Documention file$")
	public void admin_the_documention_file(String uploads) throws Exception {
		trainingpanel.adding_Documentation(uploads);
	}

	@Then("^Admin \"(.*?)\" the Documentation tab$")
	public void admin_the_documentationtab(String uploads) throws Exception {
		trainingpanel.addingPDFtoDocmentation(uploads);
	}

	@Then("^Admin click on Training image subtab and New button$")
	public void admin_click_on_Training_image_subtab_and_New_button() {
		trainingpanel.click_On_TrainingImage_Subtab_and_New_button();
	}

	@Then("^Admin uploads \"(.*?)\"$")
	public void admin_uploads(String TrainingImage) throws Exception {
		trainingpanel.upload_TrainingImage(TrainingImage);
	}

	@Then("^Admin click on Training video subtab and New button$")
	public void admin_click_on_Training_video_subatb_and_new_button() {
		trainingpanel.click_On_TrainingVideo_Subtab_and_New_button();
	}

	@Then("^Admin \"(.*?)\" video in training video$")
	public void admin_enters(String uploadvideo) throws Exception {
		trainingpanel.upload_TrainingVideos(uploadvideo);

	}

	@Then("^Admin clicks on submitbtn$")
	public void click_On_SubmitButton() throws Exception {
		trainingpanel.click_On_Submit_Button();
	}

	@Then("^Admin enter \"(.*?)\" to searchbar$")
	public void Admin_enter_modulename_to_the_searchhbar(String modulename) throws Exception {
		trainingpanel.enter_Modulename_to_searchbar(modulename);
	}

	@Then("^Admin click on edit button$")
	public void admin_click_on_edit_button() {
		trainingpanel.click_On_Edit_Button();
	}

	@Then("^Admin update \"(.*?)\" and \"(.*?)\"$")
	public void admin_update_modulename_Moduledescription(String Modulename, String Moduledescription) {
		trainingpanel.enter_Module_Details_And_ModuleDescription(Modulename, Moduledescription);
	}

	@Then("^Admin updates \"(.*?)\" the Documention file$")
	public void Admin_updates_Documentation_files(String uploads) throws Exception {
		trainingpanel.update_Documentation(uploads);
	}

	@Then("^Admin uploads updated \"(.*?)\" in training image$")
	public void Admin_uploads_updated_trainingimage_in_training_image(String TrainingImage)
			throws AWTException, InterruptedException {
		trainingpanel.update_TrainingImage(TrainingImage);
	}

	@Then("^Admin updates \"(.*?)\" video in training video$")
	public void admin_updates_trainingvideo_in_training_videos(String uploadvideo) throws Exception {
		trainingpanel.update_Trainingvideo(uploadvideo);
	}

	@Then("^Admin clicks on submitbutton$")
	public void admin_clicks_on_submitbutton() throws Exception {
		trainingpanel.click_On_submitButton();
	}

	@Then("^Admin click on delete button$")
	public void admin_click_on_delete_button() throws Exception {
		trainingpanel.click_On_Delete_Button();
	}

	@Then("^Admin enters \"(.*?)\" in the searchbar$")
	public void admin_enters_modulename_to_searchbar(String Modulename) throws Exception {
		trainingpanel.enters_to_Searchbar(Modulename);
	}

	@Then("^Admin clicks on listview$")
	public void Admin_clicks_on_listview() {
		trainingpanel.click_On_Listview();
	}

	@Then("^Admin clicks on cancel button$")
	public void adin_clicks_on_cancel_button() {
		trainingpanel.click_On_CancelButton();
	}

	@Then("^Admin enters \"(.*?)\" in searchbar$")
	public void admin_enters_modulename_in_searchbar(String Modulename) {
		trainingpanel.enters_Modulename_to_searchbar(Modulename);
	}

	@Then("^Admin checks submit button is disabled$")
	public void admin_checks_save_button_is_disabled() {
		trainingpanel.verify_Submit_Button_Disabled();
	}

	@Then("^Admin \"(.*?)\" incorrect image format in Trainingimage subtab$")
	public void admin_uploads_incorrect_image_format_in_Trainingimage_subtab(String uploads) throws Exception {
		trainingpanel.uploads_incorrect_ImageFormat(uploads);
	}

	@Then("^Admin \"(.*?)\" unsupported video in training video field$")
	public void admin_uploads_unsupported_video_in_training_video_field(String uploadinformatvideo) throws Exception {
		trainingpanel.uploads_Unsupported_Video_Format(uploadinformatvideo);
	}

	@Then("^Admin saves new training module$")
	public void adminSavesNewTrainingModule() throws Exception {
		trainingpanel.clicksSaveTraining();
	}

	@Then("^Admin checks the tootip of video tab$")
	public void Adminchecksthetootipofvideotab() throws InterruptedException {
		trainingpanel.checkfortooltipvideo();
	}

	@Then("^Admin checks the tootip of documentation tab$")
	public void Adminchecksthetootipofdocumentationtab() throws InterruptedException {
		trainingpanel.checkfortooltipdocumentation();
	}

	@Then("^Admin updates \"(.*?)\" the Documention subtab$")
	public void Admin_updates_Documentation_subtab(String uploadshtml) throws Exception {
		trainingpanel.adding_htmlDocumentation(uploadshtml);
	}

	@Then("^Admin clicks on next arrow in the pagination$")
	public void adminClicksOnNextArrowInThePagination() throws Throwable {
		System.out.println("Admin clicked on next arrow in the pagination");
		trainingpanel.clicknextarrowBtn();
		Thread.sleep(3000);
	}

	@Then("^Admin clicks on previous arrow in the pagination$")
	public void adminClicksOnPreviousArrowInThePagination() throws Throwable {
		System.out.println("Admin clicked on previous arrow in the pagination");
		PA_TrainingPanel.clickpreviousarrowBtn();
		Thread.sleep(3000);
		System.out.println("Admin clicked on previous arrow in the pagination");
	}

	@Then("^Admin clicks on show dropup$")
	public void adminClicksOnShowDropup() throws Throwable {
		System.out.println("Admin clicked on show dropup in the pagination");
		PA_TrainingPanel.clickshowdropup();
		Thread.sleep(3000);
		System.out.println("Admin clicks on the show dropup");
	}

	@Then("^Admin clicks on 20 entries in the dropup$")
	public void adminClicksOnSecondOptionInTheDropup() throws Throwable {
		System.out.println("Admin selected 20 entries in the show dropup");
		PA_TrainingPanel.click20entries();
		Thread.sleep(3000);

	}

	@Then("^Admin clicks on 30 entries in the dropup$")
	public void adminClicksOnThirdOptionInTheDropup() throws Throwable {
		System.out.println("Admin selected 30 entries in the show dropup");
		PA_TrainingPanel.click30entries();
		Thread.sleep(3000);

	}

	@Then("^Admin clicks on 10 entries in the dropup$")
	public void adminClicksOnFirstOptionInTheDropup() throws Throwable {
		System.out.println("Admin selected 10 entries in the show dropup");
		PA_TrainingPanel.click10entries();
		Thread.sleep(3000);

	}

	@Then("^Admin checks the valid page number in the pagination$")
	public void adminChecksTheValidPageNumberInThePagination() throws InterruptedException  {
		System.out.println("Admin checks the page numbers");
		trainingpanel.typecheckpagenumberone();

	}

	@Then("^Admin checks the valid page number in the pagination after next arrow$")
	public void adminChecksTheValidPageNumberInThePaginationAfterNextArrow() throws Throwable {
		System.out.println("Admin checks the page numbers");
		trainingpanel.typecheckpagenumbertwo();

	}
	
	@Then("^Admin enters non existing \"(.*?)\" in the searchbar$")
	public void adminentersnonexistingmodulenamefor_the_searchbar(String nonModulename) throws InterruptedException {
		trainingpanel.nonexistingmodulename(nonModulename);
	}

	@Then("^Admin checks \"(.*?)\" on training module$")
	public void adminchecksvalidationsontrainingmodule(String validations) throws InterruptedException {
		if (validations.equals("All elements are displayed")) {
			trainingpanel.adminValidatesAllElementsAreDisplayedOntrainingmodule();
		} else if (validations.equals("Required field Validations")) {
			trainingpanel.adminValidatesRequiredFieldValidationOntrainingmodule();
		}

	}
}