package StepDefinition;

import PagePanel.*;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class LoginStep {
    RegisterPanel registerPanel = new RegisterPanel();
    LoginPanel loginPanel = new LoginPanel();


    @Then("^User click on Login Phone RadioButton$")
    public void user_click_on_Login_Phone_RadioButton() throws Throwable {
        Thread.sleep(3000);
        LoginPanel.signInWithPhone();
    }

    @Then("^User click on Login EmailID RadioButton$")
    public void user_click_on_Login_EmailID_RadioButton() throws Throwable {
        Thread.sleep(3000);
        LoginPanel.singInWithEmail();
    }

    @Then("^User enter Login details like \"([^\"]*)\"$")
    public void user_enter_Login_details_like(String pwd) throws Throwable {
        LoginPanel.enterEmailId();
        LoginPanel.enterPasswordId(pwd);
        System.out.println(pwd);
    }

    @Then("^User enter Login details like \"([^\"]*)\" \"([^\"]*)\"$")
    public void user_enter_Login_details(String email, String pwd) {
        LoginPanel.sendEmailId(email);
        LoginPanel.enterPasswordId(pwd);
        System.out.println(email);
        System.out.println(pwd);
    }

    @Then("^User enters email \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void User_enter_email_password(String email, String pwd) {
        LoginPanel.sendEmailId(email);
        LoginPanel.enterPasswordId(pwd);
        System.out.println(email);
        System.out.println(pwd);
    }

    @Then("^User clicks on Login button$")
    public void user_clicks_on_Login_button() throws Throwable {
        LoginPanel.clickOnLoginBtn();
    }

    @Then("^User clicks on OK button of successful reset email link$")
    public void user_clicks_on_OK_button_of_successful_reset_email_link() throws Throwable {
        LoginPanel.clickOkResetLink();
    }

    @Then("^User enter login EmailId$")
    public void user_enter_login_EmailId() throws Throwable {
        LoginPanel.enterEmailId();
    }

    @Then("^User enters emailId \"([^\"]*)\"$")
    public void user_enters_emailId(String email) throws Throwable {
        LoginPanel.typeLoginEmail(email);
    }

    @Then("^User clicking on the profile icon$")
    public void user_clicking_on_the_profile_icon() throws Throwable {
        LoginPanel.clickProfileIconButton();
    }

    @Then("^User clicking on submit Button$")
    public void user_clicking_on_submit_Button() throws Throwable {
        LoginPanel.clickSubmitForgotPwd();
    }

    @Then("^User creates new tab and checking the mail \"([^\"]*)\"$")
    public void user_creates_new_tab_and_checking_the_mail(String email) throws Throwable {
        Thread.sleep(3000);
        LoginPanel.newTabCreateYopMailForgotPassword(email);
    }

    @Then("^User clicks password reset link$")
    public void user_clicks_password_reset_link() {
        LoginPanel.clickResetLink();
    }

    @Then("^User enters \"([^\"]*)\"$")
    public void user_enters(String newpassword) throws Throwable {
        LoginPanel.switchWindow();
        LoginPanel.typeNewResetPwd(newpassword);
    }

    @Then("^User entering \"([^\"]*)\"$")
    public void user_entering(String confirmpassword) throws Throwable {
        LoginPanel.typeConfirmResetPwd(confirmpassword);
    }

    @Then("^User clicking on Signout option$")
    public void user_clicking_on_signout_options() throws Throwable {
        LoginPanel.clickSignOutButton();
    }

    @Then("^User clicking Ok button for successful reset$")
    public void user_clicking_Ok_button_for_successful_reset() throws Throwable {
        LoginPanel.clickResetSuccessOk();
    }

    @Then("^User clicks submit-button$")
    public void user_clicks_submit_button() throws Throwable {
        LoginPanel.clickResetSubmit();
    }

    @Then("^User entering email which is not registered by giving \"([^\"]*)\" \"([^\"]*)\"$")
    public void user_entering_email_not_registered(String emailid, String password) throws Throwable {
        LoginPanel.enterEmailAndPasswordBox(emailid, password);
    }

    @Then("^User verifies the warning message$")
    public void user_verifies_warning_message() throws Throwable {
        LoginPanel.verifyingWarningMsgForEmail();
    }

    @Then("^User verifies the warning message of invalid email format$")
    public void user_verifies_warning_msg_for_invalid_format_email() throws Throwable {
        LoginPanel.verifyingInvalidEmailMsg();
    }

    @Then("^User entering emailid \"([^\"]*)\"$")
    public void user_entering_email_wrong_format(String emailid) throws Throwable {
        LoginPanel.invalidEmailForRegistration(emailid);
    }

    @Then("^User verifying the Invalid email message for Register$")
    public void user_verifying_invalid_email_msg_for_register() throws Throwable {
        LoginPanel.verifyingInvalidEmailMsgForRegistration();
    }

    @Then("^User entering \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
    public void user_entering_email_createpwd_confirmpwd(String emailid, String createPassword, String confirmPassword) throws Throwable {
        LoginPanel.enteringDetailsForRegisterFromFeatureFile(emailid, createPassword, confirmPassword);
    }

    @Then("^User verifying the warning message for Already registered during Registration$")
    public void user_verifying_warning_for_already_registered() throws Throwable {
        LoginPanel.verifyingAlreadyRegisteredWarningMsg();
    }

    @Then("^User verifying the warning message for Invalid Otp while registering account$")
    public void user_verifying_warning_message_invalid_otp_register() throws Throwable {
        LocationPanel.verifyingRegisterInvalidOtpMsg();
    }

    @Then("^User entering email and First Invalid Password \"([^\"]*)\" \"([^\"]*)\"$")
    public void user_entering_email_first_wrong_password(String emailid, String password) throws Throwable {
        LoginPanel.enterEmailAndPasswordBox(emailid, password);
    }

    @Then("^User entering Second time Wrong password \"([^\"]*)\"$")
    public void user_entering_second_wrong_pwd(String password1) throws Throwable {
        LoginPanel.enteringInvalidPassword2(password1);
    }

    @Then("^User entering Third time Wrong password \"([^\"]*)\"$")
    public void user_entering_third_time_wrong_pwd(String password2) throws Throwable {
        LoginPanel.enteringInvalidPassword3(password2);
    }

    @Then("^User entering Wrong password for the Fourth Time \"([^\"]*)\"$")
    public void user_enters_fourth_wrong_pwd(String password3) throws Throwable {
        LoginPanel.enteringInvalidPassword4(password3);
    }

    @Then("^User entering Wrong password for Fifth Time \"([^\"]*)\"$")
    public void user_enters_fifth_wrong_pwd(String password4) throws Throwable {
        LoginPanel.enteringInvalidPassword5(password4);
    }

    @Then("^User entering valid emailid and valid password \"([^\"]*)\" \"([^\"]*)\"$")
    public void user_entering_valid_email_pwd(String emailid, String password) throws Throwable {
        LoginPanel.enterEmailAndPasswordBox(emailid, password);
    }

    @Then("^User launches the Provider Admin Portal Url$")
    public void user_launches_PA_portal_url() throws Throwable {
        RegisterPanel.loadPAPortalUrl();
    }

    @Then("^User enters the credentials for provider admin portal \"([^\"]*)\" \"([^\"]*)\"$")
    public void user_enters_credentials_for_PA_portal(String username, String password1) throws Throwable {
        LoginPanel.enteringUsernamePasswordPAPortal(username, password1);
    }

    @Then("^User clicking login button for PA portal$")
    public void user_clicking_login_btn_PA_portal() throws Throwable {
        LoginPanel.clickLoginBtnPAPortal();
    }

    @Then("^User launching the Provider Admin Portal Url$")
    public void user_launching_provider_admin_url() throws Throwable {
        RegisterPanel.launchMasterViewPortalUrl();
    }

    @Then("^Admin signout$")
    public void adminSignout() {
        PA_LoginPanel.signout();
    }

    @Then("^validate that all elements are present on login page$")
    public void validateThatAllElementsArePresentOnLoginPage() throws InterruptedException {
        LoginPanel.validateThatAllElementsArePresentOnLoginPage();
    }

    @Then("^User clicks on the backspace command function$")
    public void Userclicksonthebackspacecommandfunction() throws InterruptedException {
        LoginPanel.clickbackbuttonwhilesignout();
    }

    @Then("^Validate that resend button is enabled after two mins$")
    public void validateThatResendButtonIsEnabledAfterMins() throws InterruptedException {
        LoginPanel.validateThatResendButtonIsEnabledAfterMins();
    }

    @Then("^User clicks on resend button of login page$")
    public void userClicksOnResendButtonOfLoginPage() throws InterruptedException {
        LoginPanel.userClicksOnResendButtonOfLoginPage();
    }

    @Then("^Validate that invalid credentials message is displayed$")
    public void validateThatInvalidCredentialsMessageIsDisplayed() throws InterruptedException {
        LoginPanel.validateThatInvalidCredentialsMessageIsDisplayed();
    }

    @And("^Admin search for the locked \"([^\"]*)\" account$")
    public void adminSearchForTheLockedAccount(String email) throws Throwable {
        LoginPanel.adminSearchForTheLockedAccount(email);
    }

    @And("^enables the locked customer account$")
    public void enablesTheLockedCustomerAccount() throws InterruptedException {
        LoginPanel.enablesThelockedCustomerAccount();
    }

    @Then("^User performs required field validation on Login Page$")
    public void userPerformsRequiredFieldValidationOnLoginPage() throws InterruptedException {
        LoginPanel.userPerformsRequiredFieldValidationOnLoginPage();
    }

    @Then("^User performs invalid otp validation$")
    public void userPerformsInvalidOtpValidation() throws InterruptedException {
        LoginPanel.userPerformsInvalidOtpValidation();
    }

    @Then("^Validates that Login button is disabled$")
    public void validatesThatLoginButtonIsDisabled() throws InterruptedException {
        LoginPanel.validatesThatLoginButtonIsDisabled();
    }

    @Then("^User validate that cursor is autofocused on OTP field$")
    public void userValidateThatCursorIsAutofocusedOnOTPField() throws InterruptedException {
        LoginPanel.userValidateThatCursorIsAutofocusedOnOTPField();
    }

    @Then("^User performs invalid otp attempt validation$")
    public void userPerformsInvalidOtpAttemptValidation() throws InterruptedException {
        LoginPanel.userPerformsInvalidOtpAttemptValidation();
    }

    @Then("^User performs invalid login attempt validation$")
    public void userPerformsInvalidLoginAttemptValidation() throws InterruptedException {
        LoginPanel.userPerformsInvalidLoginAttemptValidation();
    }

    @Then("^User validates that country code is plain text$")
    public void userValidatesThatCountryCodeIsPlainText() throws InterruptedException {
        LoginPanel.userValidatesThatCountryCodeIsPlainText();
    }

    @Then("^User verifying the warning message of mobile number not registered$")
    public void user_verifying_warning_message_of_mobile_number_not_registered() throws Throwable {
        LoginPanel.verifyingMobileNumberNotRegisteredWarningMsg();
    }

}
