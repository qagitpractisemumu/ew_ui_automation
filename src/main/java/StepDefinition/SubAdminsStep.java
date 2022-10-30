package StepDefinition;

import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.log4j.Logger;

import PagePanel.LocationPanel;
import PagePanel.SubAdminPanel;
import Resource.LoggerHelper;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SubAdminsStep {

    SubAdminPanel subAdminPanel = new SubAdminPanel();
    public static Logger log = LoggerHelper.getLogger(SubAdminsStep.class);
    String id = RandomStringUtils.random(5, String.valueOf(System.currentTimeMillis()));

    @Then("^User clicks on sub admin menu$")
    public void user_clicks_on_sub_admin_menu() throws Throwable {
        Thread.sleep(3000);
        SubAdminPanel.clickOnSubAdmin();
        log.info("clicked On Sub Admin Menu");

    }

    protected String getSaltString() {
        String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < 10) { // length of the random string.
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        return salt.toString();

    }

    @Then("^User Enters name \"([^\"]*)\" and lastName \"([^\"]*)\" and email \"([^\"]*)\" and phone \"([^\"]*)\" and click on read and Write$")
    public void user_Enters_name_and_lastName_and_email_and_phone_and_click_on_read_and_Write(String firstName,
                                                                                              String lastName, String email, String phone) throws Throwable {
        String id1 = firstName + id;
        SubAdminPanel.sendFirstName(id1);
        log.info("First Name Entered");
        Thread.sleep(2000);
        String id2 = lastName + id;
        SubAdminPanel.sendLastName(id2);
        Thread.sleep(2000);
        log.info("Last Name Entered ");
        SubAdminPanel.sendPhone("312999" + ((long) Math.floor(Math.random() * 9_000L) + 1_000L));
        Thread.sleep(2000);
        log.info("Phone Number Entered ");
        SubAdminPanel.sendEmail("SubAdm" + ((long) Math.floor(Math.random() * 9_000L) + 1_000_0L) + "@yopmail.com");
        Thread.sleep(2000);
        log.info("Email Id Entered ");
        SubAdminPanel.clickOnReadOrWrite();
        log.info("clicked on Read or Write");
    }

    @Then("^Users clicks on submit button$")
    public void users_clicks_on_submit_button() throws Throwable {
        Thread.sleep(2000);
        SubAdminPanel.clickOnSubmit();
        Thread.sleep(2000);
        log.info("Clicked on submit Button");
        Thread.sleep(9000);

    }

    @Then("^User clicks SubAdmin profile \"([^\"]*)\"$")
    public void user_clicks_SubAdmin_profile(String subAdmin) throws InterruptedException {
        SubAdminPanel.getSubAdminProfile(subAdmin).click();
        log.info("Clicked on subAdmin Profile " + subAdmin);

    }

    @Then("^User clicks edit icon$")
    public void user_clicks_edit_icon() {
        SubAdminPanel.clickOnEdit();
        log.info("clicked on edit");
    }

    @Then("^User Enters name \"([^\"]*)\" and lastName \"([^\"]*)\" and email \"([^\"]*)\"$")
    public void user_Enters_name_and_lastName_and_email(String firstName, String lastName, String email)
            throws Throwable {
        SubAdminPanel.sendFirstName(firstName);
        log.info("Enter First Name " + firstName);
        SubAdminPanel.sendLastName(lastName);
        log.info("Enters Last Name " + lastName);
        SubAdminPanel.sendEmail(email);
        log.info("Enters Email " + email);

    }

    @Then("^User Enters Phone \"([^\"]*)\" and click on read and Write$")
    public void user_enters_phone_and_read_write_option(String phone) throws Throwable {
        log.info("entering phone number");
        SubAdminPanel.sendPhone(phone);
        log.info("clicking read write button");
        SubAdminPanel.clickOnReadOrWrite();
    }

    @Then("^Users clicking on the submit button$")
    public void _user_clicking_on_the_submit_button_js() throws Throwable {
        log.info("clicking on submit button");
        SubAdminPanel.clickCreateAdminSubmitBtn();

    }

    @When("^User entering the subadmin name in the searchbox \"([^\"]*)\"$")
    public void user_entering_subadmin_name_in_search_box(String adminname) throws Throwable {
        SubAdminPanel.typeSubAdminSearchBox(adminname);
    }

    @Then("^User clicking on the search button$")
    public void user_clicking_search_btn() throws Throwable {
        SubAdminPanel.clickSubAdminSearchBtn();
    }

    @Then("^User selects particular subadmin for editing$")
    public void user_selects_particular_subadmin() throws Throwable {
        SubAdminPanel.clickParticularSubAdmin();
    }

    @Then("^User clicking on the edit icon$")
    public void user_clicking_on_the_edit_icon() throws Throwable {
        SubAdminPanel.clickSubAdminEditOption();
    }

    @Then("^User Entering the editing details name \"([^\"]*)\" and lastName \"([^\"]*)\" and email \"([^\"]*)\"$")
    public void user_editing_details_fname_lname_email(String firstName, String lastName)
            throws Throwable {
        String email = getSaltString().toLowerCase() + "@gmail.com";
        String id1 = firstName + id;
        SubAdminPanel.sendFirstName(id1);
        log.info("Enters First Name " + firstName);
        Thread.sleep(2000);
        String id2 = lastName + id;
        SubAdminPanel.sendLastName(id2);
        Thread.sleep(2000);
        log.info("Enters Last Name " + lastName);
        SubAdminPanel.sendEmail(email);
        Thread.sleep(2000);
        log.info("Enter email " + email);
    }

    @Then("^User selects particular admin for deleting$")
    public void user_selects_admin_for_delete() throws Throwable {
        SubAdminPanel.clickParticularSubAdmin();
    }

    @Then("^user clicking on the delete button$")
    public void user_clicking_on_delete_btn() throws Throwable {
        SubAdminPanel.clickAdminDeleteBtn();
    }

    @Then("^user clicking on the confirm button$")
    public void user_clicks_confirm_btn_for_admin_delete() throws Throwable {
        SubAdminPanel.clickAdminDeleteConfirmBtn();
    }

    @Then("^User entering subadmin \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
    public void user_entering_subadmin_details(String firstName, String lastName, String email) throws Throwable {
        SubAdminPanel.enteringSubAdminDetails(firstName, lastName, email);
    }

    @Then("^User verifying Warning message for subadmin creation$")
    public void user_verifying_warning_msg_subadmin_creation() throws Throwable {
        LocationPanel.verifyWarningMsgInSubAdmin();
    }

    @Then("^User clicks on submit button with js executor$")
    public void user_clicks_submit_btn_js_executor() throws Throwable {
        SubAdminPanel.clickSubAdminConfirmBtnJsExecutor();

    }

    @Then("^User Enters name \"([^\"]*)\" and \"([^\"]*)\" and email, phone and click on read and Write$")
    public void userEntersSubAdminDetails(String firstName, String lastName) throws Throwable {
        SubAdminPanel.userEntersSubAdminDetails(firstName, lastName);
        SubAdminPanel.clickOnReadOrWrite();
        log.info("clicked on Read or Write");
    }

    @Then("^User enters \"([^\"]*)\", \"([^\"]*)\", email, phone and click on read and Write$")
    public void userEntersEmailPhoneAndClickOnReadAndWrite(String firstName, String lastName) throws Throwable {
        String firstname = firstName + id;
        SubAdminPanel.sendFirstName(firstname);
        log.info("First Name Entered");
        Thread.sleep(2000);
        String id2 = lastName + id;
        SubAdminPanel.sendLastName(id2);
        Thread.sleep(2000);
        log.info("Last Name Entered ");
        SubAdminPanel.sendPhone("98491" + ((long) Math.floor(Math.random() * 9_0000L) + 1_0000L));
        Thread.sleep(2000);
        log.info("Phone Number Entered ");
        SubAdminPanel.sendEmail("SubAdm" + ((long) Math.floor(Math.random() * 9_000L) + 1_000_0L) + "@yopmail.com");
        Thread.sleep(2000);
        log.info("Email Id Entered ");
        SubAdminPanel.clickOnReadOrWrite();
        log.info("clicked on Read or Write");
    }

    @Then("^User searches the created subAdmin$")
    public void userSearchesTheCreatedSubAdmin() throws InterruptedException {
        SubAdminPanel.searchSubAdmin();
    }
}

