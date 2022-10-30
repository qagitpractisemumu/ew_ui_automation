package StepDefinition;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.log4j.Logger;
import org.testng.Assert;

import PagePanel.ActivityLogPanel;
import PagePanel.LocationPanel;
import PagePanel.SubAdminPanel;
import PagePanel.UsersPanel;
import Resource.LoggerHelper;
import cucumber.api.java.en.Then;

public class CreateUserStep {
    UsersPanel user = new UsersPanel();
    public static Logger log = LoggerHelper.getLogger(CreateUserStep.class);

    @Then("^User clicks on users menu$")
    public void user_clicks_on_users_menu() throws InterruptedException {

        UsersPanel.clickOnUserMenu();
        log.info("Clicked on Users Menu");
        Thread.sleep(10000);
    }

    @Then("^user clicks on search \"([^\"]*)\"$")
    public void user_clicks_on_search(String firstnme) {
        UsersPanel.userSearch(firstnme);
    }

    @Then("^User selects firstname \"([^\"]*)\" and lastname\"([^\"]*)\"$")
    public void user_selects_firstname_and_lastnamesomething(String firstname, String lastname) throws Throwable {
        UsersPanel.enterFirstNameandLastname(firstname, lastname);
        Thread.sleep(2000);
    }

    @Then("^User enters firstn \"([^\"]*)\" and lastn \"([^\"]*)\"$")
    public void user_enters_firstn_and_lastn(String firstn, String lastn) throws Throwable {
        UsersPanel.enterFirstNameandLastname(firstn, lastn);

    }

    @Then("^User checks for drive$")
    public void user_checks_for_drive() throws Throwable {
        UsersPanel.searchForSharedDrive();
        log.info("search on Shared Drive tab");

    }

    @Then("^User enters firstName \"([^\"]*)\" and lastName \"([^\"]*)\" and email \"([^\"]*)\" and phone \"([^\"]*)\" and userName \"([^\"]*)\" and select location \"([^\"]*)\" and select group \"([^\"]*)\"$")
    public void user_enters_firstName_and_lastName_and_email_and_phone_and_userName_and_select_location_and_select_group(
            String firstName, String lastName, String email, String phone, String userName, String loaction,
            String group) throws InterruptedException {
        UsersPanel.enterFirstName(firstName);
        log.info("Entered FirstName " + firstName);
        UsersPanel.enterLastName(lastName);
        log.info("Entered LastName " + lastName);
        UsersPanel.enterEmail(email);
        log.info("Entered Email " + email);
        UsersPanel.enterPhone(phone);
        log.info("Entered phone " + phone);
        userName = userName + RandomStringUtils.random(5, String.valueOf(System.currentTimeMillis()));
        UsersPanel.enterUserName(userName);
        log.info("Entered UserName " + userName);
        UsersPanel.selectLoaction(loaction);
        log.info("Selected Location " + loaction);
        UsersPanel.selectGroup(group);
        log.info("selected Group " + group);

    }

    @Then("^User enters firstname \"([^\"]*)\" and lastname \"([^\"]*)\" and email \"([^\"]*)\" and phone \"([^\"]*)\"$")
    public void user_enters_firstname_and_lastname_and_email_and_phone(String firstname, String lastname, String email, String phone) throws Throwable {
        UsersPanel.enterFirstName(firstname);
        log.info("Entered FirstName " + firstname);
        UsersPanel.enterLastName(lastname);
        log.info("Entered LastName " + lastname);
        UsersPanel.enterEmail(email);
        log.info("Entered Email " + email);
        UsersPanel.enterPhone(phone);
        log.info("Entered phone " + phone);
    }


    @Then("^User enters firstnme \"([^\"]*)\" and lastnme \"([^\"]*)\" and location \"([^\"]*)\" and apart \"([^\"]*)\" and cardno \"([^\"]*)\" and country \"([^\"]*)\" and state \"([^\"]*)\" and city \"([^\"]*)\" and zip \"([^\"]*)\" and month \"([^\"]*)\" and cv \"([^\"]*)\"$")
    public void user_enters_firstnme_and_lastnme_and_location_and_apart_and_cardno_and_country_and_state_and_city_and_zip_and_month_and_cv(String firstnme, String lastnme, String location, String apart, String cardno, String country, String state, String city, String zip, String month, String cv) throws Throwable {

        UsersPanel.enterFirstnme(firstnme);
        log.info("Entered UN" + firstnme);
        UsersPanel.enterLastName(lastnme);
    }


    @Then("^User clicks on next button$")
    public void user_clicks_on_next_button() throws InterruptedException {
        Thread.sleep(3000);
        UsersPanel.clickOnNext();
        Thread.sleep(4500);
        log.info("Clicked on Next Button.");


    }


    @Then("^User clicks on Edit$")
    public void user_clicks_on_edit() throws Throwable {
        UsersPanel.clickOnEdit();
        Thread.sleep(4000);
        log.info("Clicked on Edit Button.");
    }


    @Then("^User clicks on cancel button$")
    public void user_clicks_on_cancel_button() throws InterruptedException {
        Thread.sleep(2000);
        UsersPanel.clickOnCancel();
        Thread.sleep(2000);
    }

    @Then("^User select required additional drive \"([^\"]*)\"$")
    public void user_select_required_additional_drive(String drive) {
        UsersPanel.selectDrive(drive);
        log.info("selected drive " + drive);

    }

    @Then("^pop display total user cost$")
    public void pop_display_total_user_cost() {
        UsersPanel.getUserCost();
        log.info("User cost is " + UsersPanel.getUserCost());

    }

    @Then("^User clicks on create button$")
    public void user_clicks_on_create_button() {
        UsersPanel.clickOnCreate();
        log.info("Clicked on Create Button");
    }

    @Then("^success message will display$")
    public void success_message_will_display() {

        Assert.assertEquals(UsersPanel.getSuccessMsg(), "Success");
        log.info("get the Msg " + UsersPanel.getSuccessMsg());
    }

    @Then("^User clicks on ok button$")
    public void user_clicks_on_ok_button() throws InterruptedException {
        UsersPanel.clickOnOK();
        log.info("Clicked on OK button");
    }


    @Then("^User clicks on actvty log menu$")
    public void user_clicks_on_actvty_log_menu() throws Throwable {
        ActivityLogPanel.clickOnActivityLogMenu();
    }


    @Then("^verify record is logged in activty log with ActivityName \"([^\"]*)\"$")
    public void verify_record_is_logged_in_activty_log_with_activityname(String ActivityName) {


        for (int i = 0; i < ActivityLogPanel.getLogData().size(); i++) {

            System.out.println(ActivityLogPanel.getLogData().get(i).getText());
            ActivityLogPanel.getLogData().get(i).getText().equalsIgnoreCase(ActivityName);
        }
        Assert.assertTrue(ActivityLogPanel.getLogData().get(1).getText().equalsIgnoreCase(ActivityName));

    }

//*******CA_010*******************************************************

    @Then("^User clicks on shared drive tab$")
    public void user_clicks_on_shared_drive_tab() {
        UsersPanel.clickOnSharedDrive();
        log.info("clicked on Shared Drive tab");
    }

    @Then("^User clicks on local drive tab$")
    public void user_clicks_on_local_drive_tab() {
        UsersPanel.clickOnLocalDrive();
        log.info("clicked on Local Drive tab");
    }

    @Then("^User clicks Users menu$")
    public void user_clicks_Users_menu() throws Throwable {
        Thread.sleep(3000);
        UsersPanel.clickUsersMenu();
        log.info("Clicked on Users Menu");
    }

    @Then("^User clicks New menu$")
    public void user_clicks_New_menu() {
        log.info("clicking New Button");
        UsersPanel.clickNewBtn();
    }

    @Then("^User enters details \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
    public void user_enters_details(String firstname, String lastname, String email, String phone, String username) throws Throwable {
        UsersPanel.enterFirstName(firstname);
        log.info("Entered FirstName " + firstname);
        UsersPanel.enterLastname(lastname);
        log.info("Entered LastName " + lastname);
        UsersPanel.enterEmail(email);
        log.info("Entered Email " + email);
        UsersPanel.enterUserName(username);
        log.info("Entered UserName " + username);
        UsersPanel.enterPhone(phone);
        log.info("Entered phone " + phone);


    }

    @Then("^User selects location and group$")
    public void user_selects_location_and_group() {
        log.info("selecting location");
        UsersPanel.performSelectLocation();
    }

    @Then("^User clicks Next button$")
    public void user_clicks_Next_button() throws Throwable {
        Thread.sleep(3000);
        UsersPanel.clickOnNext();
        log.info("Clicked on Next Button.");

    }

    @Then("^User clicks create button$")
    public void user_clicks_create_button() {
        UsersPanel.clickOnCreate();
        log.info("Clicked on Create Button");
    }

    @Then("^User clicks Ok button of success message$")
    public void user_clicks_Ok_button_of_success_message() throws Throwable {
        UsersPanel.clickOnOK();
        log.info("Clicked on OK button");
    }

    @Then("^User verify that the users created without local drive$")
    public void user_verify_that_the_users_created_without_local_drive() throws Throwable {
        log.info("verify the users created without local drive");
        UsersPanel.clickLocalDrive();
        UsersPanel.checkUsersLocalDrive();
    }

    @Then("^User verifies cost popup is displayed$")
    public void user_verifies_cost_popup_is_displayed() {
        UsersPanel.getUserCost();
        log.info("User cost is " + UsersPanel.getUserCost());
    }

    @Then("^User clicks popup Cancel  button$")
    public void user_clicks_popup_Cancel_button() throws Throwable {
        log.info("clicking cancel button");
        UsersPanel.clickCostPopupCancel();
        log.info("user is not created after clicking cancel button");
    }

    @Then("^User clicking  on add new option$")
    public void user_clicks_addNew_Button() throws Throwable {
        log.info("clicking add new option for giving credit card details");
        UsersPanel.clickCreditNewBtn();
    }

    @Then("^User clicking on cancel button$")
    public void user_clicking_cancel_button() {
        log.info("clicking Cancel Option");
        UsersPanel.clickCreditNewCancelBtn();
    }

    @Then("^User clicking on add new option$")
    public void user_clicking_addnew_option() throws Throwable {
        log.info("clicking new option");
        UsersPanel.clickCreditNewBtn();

    }

    @Then("^User entering the username in the searchbox \"([^\"]*)\"$")
    public void user_entering_username_in_searchbox(String username) throws Throwable {
        UsersPanel.typeUserNameInSearchBox(username);
    }

    @Then("^User clicks search button for user edit$")
    public void user_clicks_search_for_user_edit() throws Throwable {
        UsersPanel.clickUserSearchBtn();
    }

    @Then("^User selects the particular user for editing$")
    public void user_selects_particular_user_for_editing() throws Throwable {
        UsersPanel.clickParticularUser();
    }

    @Then("^User clicking the Edit button$")
    public void user_clicking_edit_btn() throws Throwable {
        UsersPanel.clickEditoptionForUser();
    }

    @Then("^User entering the edit details for user firstname \"([^\"]*)\" and lastname \"([^\"]*)\" and email \"([^\"]*)\" and phone \"([^\"]*)\"$")
    public void user_entering_first_last_email_phone(String firstname, String lastname, String email, String phone) throws Throwable {
        UsersPanel.enterUserEditDetails(firstname, lastname, email, phone);
    }

    @Then("^User selecting the particular local drive$")
    public void user_selecting_particular_local_drive() throws Throwable {
        UsersPanel.clickLocalDriveForUser();
    }

    @Then("^user clicking on delete icon to delete user$")
    public void user_enters_delete_icon_to_delete_user() {
        UsersPanel.clickOnDeleteUser();
    }

    @Then("^User clicking on Confirm button for delete$")
    public void user_clicking_confirmation_to_delete() throws Throwable {
        UsersPanel.clickDeleteConfirmBtn();
    }

    @Then("^User clicking on the New menu$")
    public void user_clicking_new_button() throws Throwable {
        UsersPanel.clickingNewBtn();
    }

    @Then("^User entering details of \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
    public void user_entering_details_firstname_lastname_email(String firstname, String lastname, String email) throws Throwable {
        UsersPanel.enterUserNameEmailDetails(firstname, lastname, email);
    }

    @Then("^User entering details of \"([^\"]*)\" \"([^\"]*)\" and email$")
    public void user_entering_user_details(String firstname, String lastname) throws Throwable {
        UsersPanel.enterUserDetails(firstname, lastname);
    }

    @Then("^User entering details of \"([^\"]*)\" \"([^\"]*)\"$")
    public void user_entering_details_phone_username(String username, String phone) throws Throwable {
        UsersPanel.enterUserPhoneNameDetails(username, phone);
    }

    @Then("^User entering details of existing \"([^\"]*)\" \"([^\"]*)\"$")
    public void user_entering_details_existing_phone_username(String username, String phone) throws Throwable {
        UsersPanel.enterExistingUserPhoneNameDetails(username, phone);
    }

    @Then("^User entering details of \"([^\"]*)\" and Phone$")
    public void user_entering_username_details(String username) throws Throwable {
        UsersPanel.enterUserNameDetails(username);
    }

    @Then("^User selecting \"([^\"]*)\"$")
    public void user_selecting_country_location(String location) throws Throwable {
        SubAdminPanel.selectLocationForUserCreate(location);

    }

    @Then("^User clicks search button for user search and delete$")
    public void user_clicks_search_btn_for_user() throws Throwable {
        UsersPanel.clickingUserDeleteSearchBtn();
    }

    @Then("^User selects the particular user for deleting$")
    public void user_selects_for_particular_deleting() throws Throwable {
        UsersPanel.clickParticularUserToDelete();
    }

    @Then("^User clicking on delete icon to delete user$")
    public void user_clicking_delete_icon() throws Throwable {
        UsersPanel.clickDeleteButtonForUser();
    }

    @Then("^user clicking on the Confirm button to create user$")
    public void user_clicking_confirm_button_to_create_user() throws Throwable {
        log.info("Clicking on confirm button");
        UsersPanel.clickUserCreateConfirmation();
        log.info("Cliccked on confirm button");
    }

    @Then("^user clicking on the Confirm button to delete user$")
    public void user_clicking_confirm_button_to_delete_user() throws Throwable {
        UsersPanel.clickUserDeleteConfirmation();
        Thread.sleep(5000);
    }

    @Then("^User verifying warning message for username while creating user$")
    public void user_verifying_warning_msg_for_username() throws Throwable {
        LocationPanel.verifyUserNameAlertMsg();

    }

    @Then("^User clicking on Add multiple users menu$")
    public void user_clicking_add_multiple_users() throws Throwable {
        UsersPanel.clickAddMultipleUsersBtn();
    }

    @Then("^User clicking the select all checkbox for multiple users$")
    public void user_clicking_select_all_checkbox() throws Throwable {
        UsersPanel.clickSelectAllCheckbox();
    }

    @Then("^User entering details for multiple users create \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
    public void user_entering_multiple_details(String firstname1, String lastname1, String email1, String username1) throws Throwable {
        UsersPanel.enterMultipleUserFirstName1(firstname1);
        UsersPanel.enterMultipleUserLastName1(lastname1);
        UsersPanel.enterMultipleUserEmail1(email1);
        UsersPanel.enterMultipleUserUserName1(username1);

    }

    @Then("^user selecting the phone code and entering mobile number for multiple user create \"([^\"]*)\"$")
    public void user_selects_phonecode_for_multiple_user_create(String mobile) throws Throwable {
        //SubAdminPanel.selectingCountryCodeWithSelect();
        SubAdminPanel.clickingPhoneCodeForMultipleUsers(mobile);

    }

    @Then("^User selecting the Location for multiple user create$")
    public void user_selecting_location_for_multiple_user_create() throws Throwable {
        SubAdminPanel.selectingLocationForMultipleUsers();

    }

    @Then("^User selecting the group for Multiple User create$")
    public void user_selecting_group_for_multiple_users() throws Throwable {
        SubAdminPanel.selectGroupForMultipleUsersCreate();
    }

    @Then("^User selecting the local drive for Multiple users create$")
    public void user_selecting_local_drive_for_multiple_users() throws Throwable {
        SubAdminPanel.selectDriveForMultipleUsersCreate();
    }

    @Then("^User enters non existing username in the searchbox \"([^\"]*)\"$")
    public void userEntersNonExistingUsernameInTheSearchbox(String userName) throws Throwable {
        UsersPanel.searchUName(userName);
    }

    @Then("^User selects personal drive$")
    public void userSelectsPersonalDrive() throws InterruptedException {
        UsersPanel.selectPersonalDrive();
    }

    @Then("^User clicks Next button to create second user$")
    public void userClicksNextButtonToCreateSecondUser() throws InterruptedException {
        Thread.sleep(3000);
        UsersPanel.clickOnNextUser();
        log.info("Clicked on Next Button.");
    }

    @Then("^User selects \"([^\"]*)\"$")
    public void userSelects(String groupName) throws Throwable {
        Thread.sleep(3000);
        UsersPanel.selectTheGroup(groupName);
        log.info("Clicked on Next Button.");
    }
}
