package StepDefinition;

import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;

import PagePanel.PA_LoginPanel;
import Resource.BaseClass;
import Resource.LoggerHelper;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PA_LoginStep extends BaseClass {

    PA_LoginPanel loginpanel = new PA_LoginPanel();
    public BaseClass baseclass = new BaseClass();
    public static Logger log = LoggerHelper.getLogger(PA_LoginStep.class);
    public JavascriptExecutor js = (JavascriptExecutor) driver;
    public static String newEmailAccount;

    @When("^Admin enters credentials \"(.*?)\" and \"(.*?)\"$")
    public void Admin_enterscredentials_email_and_password(String email, String password) {
        loginpanel.enteremail(email);
        loginpanel.enterPassword(password);
    }

    @When("^Admin clicks on login button$")
    public void Admin_clicks_on_login_button() {
        loginpanel.loginButton();
    }

    @Then("^Admin is in HomePage$")
    public void admin_should_be_in_HomePage() throws Exception {
        Thread.sleep(5000);
        loginpanel.verifyUserLogin();
    }

    @Then("^Admin should be able to view Performance graphs$")
    public void AdminshouldbeabletoviewPerformancegraphs() throws Exception {
        loginpanel.verifygraphs();
    }

    @Then("^Admin should be able to signout$")
    public void admin_should_signout() {
        PA_LoginPanel.signout();
    }

    @Then("^Admin fetchs otp from email for \"([^\"]*)\"$")
    public void User_fetch_otp_from_mail_for(String email) throws Throwable {
        log.info("User is now fetching OTP from main");
        Thread.sleep(5000);
        loginpanel.loginToYopMailToFetchotptologin(email);
    }

    @Then("^Admin clicks on Complete button$")
    public void Admin_clicks_on_Complete_button() throws Throwable {
        log.info("Admin clicked on complete button");
        PA_LoginPanel.clickCompleteBtn();
        Thread.sleep(10000);
        log.info("Admin is on Dashboard");
    }

    @Then("^Admin launching the Provider Admin Portal$")
    public void user_launching_provider_admin_url() throws Throwable {
        PA_LoginPanel.getMasterviewUrl();
    }

    @When("^Admin enters invalid \"(.*?)\" and valid \"(.*?)\"$")
    public void Admin_enters_invalid_email_and_valid_password(String email, String password) {
        loginpanel.enterInValidemailAndValidPassword(email, password);

    }

    @When("^Admin enters valid \"(.*?)\" and invalid \"(.*?)\"$")
    public void Admin_enters_valid_username_and_invalid_password(String email, String password) {
        loginpanel.enterValidemailAndInvalidPassword(email, password);
    }

    @When("^Admin enters email and password$")
    public void adminEntersUsernameAndPassword() throws InterruptedException {
        loginpanel.enterPaEmail();
        loginpanel.enterPaPassword();
    }

    @Then("^Admin skips credentials \"(.*?)\" to view the validation$")
    public void adminenters_credentialsemailtoviewthevalidation(String email) throws Exception {
        loginpanel.skipemailField(email);
    }

    @Then("^Admin skips the credentials \"(.*?)\" to view the validation$")
    public void adminenters_credentialspasswordtoviewthevalidation(String password) throws Exception {
        loginpanel.skippasswordField(password);
    }

    @Then("^Admin enters invalid \"(.*?)\" to view the validation$")
    public void Admin_enters_invalid_emailIDtoviewthevalidation(String emailID) throws Exception {
        loginpanel.enterinvalidemailID(emailID);
    }
    
    @Then("^Admin waits till two minutes to find the resend button$")
    public void Adminwaitstilltwominutestofindtheresendbutton() {
    	loginpanel.resendbuttonenable();
    }

    @Then("^Admin clicks on the footer privacy and legal link$")
    public void Admin_clicksonthe_footer_privacyandlegal_link() throws Exception {
        loginpanel.viewprivacyandlegallinks();
    }

    @Then("^Admin selects the dropdown$")
    public void Adminselectsthedropdown() throws Exception {
        loginpanel.verifyDashBoard();
    }
    
    @Then("^Admin should click on backspace$")
    public void Adminshouldclickonbackspace() throws InterruptedException {
    	loginpanel.backspaceurl();
    }
    
    @Then("^Admin skips the otp for the validation$")
    public void Adminskipstheotpforthevalidation() throws InterruptedException {
    	loginpanel.codevalidationotp();
    }
    
    @Then("^Admin checks for active element$")
    public void Adminchecksforactiveelement() throws InterruptedException {
    	loginpanel.checksforactiveelement();
    }
      	
    @Then("^Admin checks for \"(.*?)\" in the login page$")
    public void Adminchecksforvalidationintheloginpage(String validation) throws InterruptedException {
    	if (validation.equals("All Elements are displayed")) {
    		loginpanel.allelementsarevisible(validation);	
    	 } else if (validation.equals("Required validations")) {
    		 loginpanel.requiredvalidations(validation);
    }}
    
    @Then("^Admin checks for the \"(.*?)\"$")
    public void Adminchecksforthelegend(String legend) throws InterruptedException {
    	if (legend.equals("legend")) {
      loginpanel.legendtodisplay(legend);
    }
}}