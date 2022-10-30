package StepDefinition;

import PagePanel.*;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;

import Resource.BaseClass;
import Resource.LoggerHelper;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RegisterStep extends BaseClass {
    RegisterPanel loginPagePanel = new RegisterPanel();
    Hooks hooks = new Hooks();

    public static Logger log = LoggerHelper.getLogger(RegisterStep.class);

    @Given("^user navigate to WirelessOffice application$")
    public void user_navigate_to_MyMobileOperatorLogo_application() throws Throwable {
        log.info("Verify User navigated to Website page");
        RegisterPanel.getPageTitle();
        Thread.sleep(3000);
        // RegisterPanel.clickOKBtn();

    }

    @When("^User clicks on Login$")
    public void user_clicks_on_Login() throws Throwable {
        log.info("User clicks on Login link on menu");
        RegisterPanel.clickMenuLoginBtn();
        Thread.sleep(3000);
    }

    @Then("^User click on Create Account link$")
    public void user_click_on_Create_Account_link() throws Throwable {
        log.info("User clicks on Register link on login page");
        RegisterPanel.clickRegisterLink();
        Thread.sleep(3000);
        // RegisterPanel.clickOKBtn();
    }

    @Then("^User select Create Accoutn with EmailID$")
    public void user_select_Create_Accoutn_with_EmailID() throws Throwable {
        log.info("User selectt create accoutn with EmailID");
        Thread.sleep(5000);
        RegisterPanel.CreateAccountWithEmailRadioBtn();
    }

    @Then("^User enter registeration details like \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_enter_registeration_details_like_and(String pwd, String confirmPwd) throws Throwable {
        log.info("User is entering emailID, password and confirm password");
        RegisterPanel.enterEmailID();
        RegisterPanel.enterPassword(pwd);
        RegisterPanel.enterconfirmPassword(confirmPwd);
    }

    @Then("^User select Terms Of Services checkbox$")
    public void user_select_Terms_Of_Services_checkbox() {
        log.info("User is selecting Terms of service checkbox");
        RegisterPanel.selectTOSChkBox();
    }

    @Then("^USer select Product Terms and Condition checkbox$")
    public void user_select_Product_Terms_and_Condition_checkbox() {
        log.info("User is selecting Product Terms & condition checkbox");
        RegisterPanel.selectPTCChkBox();
    }

    @Then("^User clicks on Regsiter button$")
    public void user_clicks_on_Regsiter_button() {
        log.info("User clicked on Register button");
        RegisterPanel.clickRegisterBtn();
    }

    @Then("^User enter code $")
    public void user_enter_code() {
        log.info("User clicked on Register button");
        RegisterPanel.enterCode();
    }

    @Then("^User clicks on Complete button$")
    public void user_clicks_on_Complete_button() throws Throwable {
        log.info("User clicked on complete button");
        RegisterPanel.clickCompleteBtn();
        Thread.sleep(5000);
        System.out.println("Login Successful");
        log.info("User is on Dashboard");
    }

    @Then("^User fetch otp from mail$")
    public void User_fetch_otp_from_mail() throws Throwable {
        log.info("User is now fetching OTP from main");
        Thread.sleep(5000);
        // RegisterPanel.loginToYopMail();
        RegisterPanel.loginToSacMail();
    }

    @Then("^User fetch otp from mail for \"([^\"]*)\"$")
    public void User_fetch_otp_from_mail_for(String email) throws Throwable {
        log.info("User is now fetching OTP from main");
        Thread.sleep(5000);
        RegisterPanel.loginToSacMailWithEmail(email);
    }

  
    
    @Then("^User fetch otps from mails$")
    public void User_fetch_otps_from_mails() throws Throwable {
        log.info("User is now fetching OTP from main");
        Thread.sleep(5000);
        // RegisterPanel.loginToYopMail();
        RegisterPanel.loginToSacMail();
    }

    @When("^User clicks on GetStarted$")
    public void user_clicks_on_GetStarted() throws Throwable {
        log.info("User clicked on Get started option");
        RegisterPanel.clickRegisterLink();
        Thread.sleep(3000);
        log.info("user is on registration page");
    }

    @Then("^User clicks OK button$")
    public void user_clicks_OK_button() throws Throwable {
        log.info("user clicks on OK button");
        // RegisterPanel.clickOKBtn();
        Thread.sleep(2000);
        log.info("user will enter details");
    }

    @Then("^User clicks EmailID radiobutton$")
    public void user_clicks_EmailID_radiobutton() {
        log.info("user is clicking email radiobutton");
        RegisterPanel.CreateAccountWithEmailRadioBtn();

    }

    @Then("^User enter registration details like \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_enter_registration_details_like_and(String pwd, String confirmPwd) throws Throwable {
        log.info("User is entering emailID, password and confirm password");
        RegisterPanel.enterEmailID();
        RegisterPanel.enterPassword(pwd);
        RegisterPanel.enterconfirmPassword(confirmPwd);
    }

    @Then("^User clicks on Register button$")
    public void user_clicks_on_Register_button() {
        log.info("User clicked on Register button");
        RegisterPanel.clickRegisterBtn();
    }

    @Then("^User enter code \"([^\"]*)\"$")
    public void user_enter_code(String arg1) throws Throwable {
        log.info("User clicked on Register button");
        RegisterPanel.loginToYopMail();
    }

    @Then("^User clicks on profile$")
    public void user_clicks_on_profile() throws Throwable {
        driver.findElement(By.cssSelector("div[class='item hover settings-trigger'] span")).click();
        Thread.sleep(2000);
    }

    @Then("^User clicks on Signout$")
    public void user_clicks_on_signout() throws Throwable {
        RegisterPanel.signout();
    }

    @Then("^User selecting the phone number code and entering mobile number \"([^\"]*)\"$")
    public void user_selecting_phone_number_code_and_entering_mobile(String mobile) throws InterruptedException {
        SubAdminPanel.clickingPhoneCode();
        RegisterPanel.enteringMobileNumber(mobile);

    }

    @Then("^User entering credentials of \"([^\"]*)\" \"([^\"]*)\"$")
    public void user_entering_credentials_of_create_confirm_pwd(String createPassword, String confirmPassword)
            throws InterruptedException {
        RegisterPanel.enteringCreateandConfirmPwd(createPassword, confirmPassword);
    }

    @Then("^User clicking text me option$")
    public void user_clicking_textme_option() throws Throwable {
        RegisterPanel.clickingTextMeOption();
    }

    @Then("^User entering complete option$")
    public void user_entering_final_complete_option() throws Throwable {
        RegisterPanel.clickingFinalCompleteBtn();
    }

    @Then("^User verifying the options of Text me and Authentication call$")
    public void user_verifying_options_textme_callme() throws Throwable {
        LocationPanel.verifyingPhoneRegisterOtpOptions();
    }

    @Then("^User entering the password for mobile number login \"([^\"]*)\"$")
    public void user_entering_password_for_mobile_number_login(String password) throws Throwable {
        RegisterPanel.enteringPasswordMobileLogin(password);
    }

    @Then("^User will select the phone number code depends on country and entering mobile number \"([^\"]*)\"$")
    public void user_select_code_and_entering_mobile_number(String mobile) throws Throwable {
        SubAdminPanel.clickingLoginPagePhoneCode(mobile);
    }

    @Then("^User clicking call me option$")
    public void user_clicking_call_me_options() throws Throwable {
        RegisterPanel.clickingCallMeOption();
    }

    @Then("^User selecting the phone number code and entering invalid mobile number \"([^\"]*)\"$")
    public void user_selecting_code_and_entering_invalid_mobile_number(String mobile) throws Throwable {
        SubAdminPanel.clickingPhoneCode();
        RegisterPanel.enteringMobileNumber(mobile);
    }

    @Then("^User verifying the warning message for entering invalid mobile number for Registration$")
    public void user_verifying_warning_msg_for_invalid_mobile_number_register() throws Throwable {
        LocationPanel.verifyingWarningMsgInvalidMobileNumber();
    }

    @Then("^User clicking Ok button$")
    public void user_clicking_invalid_number_warning_msg_ok_btn() throws Throwable {
        RegisterPanel.clickingInvalidMobileRegisterWarningMsgOkBtn();
    }

    @Then("^User entering different create and confirm password \"([^\"]*)\" \"([^\"]*)\"$")
    public void user_entering_different_create_confirm_password(String createPassword, String confirmPassword)
            throws Throwable {
        RegisterPanel.enteringCreateandConfirmPwd(createPassword, confirmPassword);
    }

    @Then("^User verifying the warning message for giving different create and confirm password$")
    public void user_verifying_warning_msg_for_different_create_confirm_pwd() throws Throwable {
        LocationPanel.verifyingPasswordUnmatchedWarningMsg();
    }

    @Then("^User verifying the warning message of Already Registered Mobile Number$")
    public void user_verifying_warning_message_already_registered_mobile_number() throws Throwable {
        LocationPanel.verifyingAlreadyRegisteredMobileNumberWarningMsg();
    }

    @Then("^User verifying the warning message of entering Incorrect Password while Logging in\\.$")
    public void user_verifying_warning_msg_entering_incorrect_password() throws Throwable {
        LocationPanel.verifyingWarningMsgForWrongPwdWhileLogin();
    }

    @Then("^User verifying the warning message for using alphabets in mobile number which is invalid$")
    public void user_verifying_msg_for_using_mobile_no_with_alphabets() throws Throwable {
        LocationPanel.verifyingInvalidMobilePhoneWithAlphabetRegisterWarningMsg();
    }

    @Then("^User verifying warning message for entering mobile number with alphabets in login page$")
    public void user_verifying_msg_in_login_page_invalid_mobile_with_alphabets() throws Throwable {
        LocationPanel.verifyingInvalidMobileWithAlphabetsInLoginPageWarningMsg();
    }

    @Then("^User verifying the checkbox and the signup button is not in Clickable stage$")
    public void user_verifying_checkbox_signup_button_in_not_selectable_stage() throws Throwable {
        RegisterPanel.verifyingSelectingAndEnablingMenu();
    }

    @Then("^User navigates to Customer Admin Portal$")
    public void user_enters_customer_admin_url() throws Throwable {
        RegisterPanel.launchCAportalUrl();
    }

    @Then("^User fetch otp from mail by entering \"([^\"]*)\"$")
    public void user_fetch_otp_by_entering_email(String emailid) throws Throwable {
        RegisterPanel.loginToSacMailCAPAPortal(emailid);
    }

    @Then("^User enter Register Details \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
    public void user_enter_register_details(String emailid, String createpassword, String confirmpassword)
            throws Throwable {
        RegisterPanel.enteringRegisterDetails(emailid, createpassword, confirmpassword);
    }

    @Then("^User fetch otp from mail \"([^\"]*)\"$")
    public void User_fetch_otp_from_mail(String email) throws Throwable {
        log.info("User is now fetching OTP from main");
        Thread.sleep(5000);
        RegisterPanel.loginToYopMailWithEmail(email);
    }

    @Then("^User creates a new customerAdmin account$")
    public void userCreatesANewCustomerAdminAccountE2E() throws Throwable {
        log.info("User selectt create accoutn with EmailID");
        Thread.sleep(5000);
        RegisterPanel.CreateAccountWithEmailRadioBtn();
        log.info("User is entering emailID, password and confirm password");
        RegisterPanel.createEmailIDE2E();
        RegisterPanel.enterDefaultPasswordE2E();
        RegisterPanel.confirmDefaultPasswordE2E();
    }

    @Then("^User fetch otp from mail for registered account$")
    public void userFetchOtpFromMailForRegisteredAccountE2E() throws Throwable {
        log.info("User is now fetching OTP from main");
        Thread.sleep(5000);
        RegisterPanel.loginToYopMailToFetchOtpE2E();
    }

    @Then("^User Login into registered account$")
    public void userLoginIntoRegisteredAccount() {
        RegisterPanel.enteredRegisteredEmail();
        RegisterPanel.enterPasswordForRegisteredAccount();
    }
}
