package StepDefinition;

import PagePanel.PA_CustomerPanel;
import PagePanel.PA_LoginPanel;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

import java.awt.*;

public class PA_CustomerStep {

    PA_CustomerPanel customerpanel = new PA_CustomerPanel();
    PA_LoginPanel loginpanel = new PA_LoginPanel();

    @Then("^Admin clicks on Customer Menu$")
    public void admin_clicks_on_customer_link() throws InterruptedException {
        Thread.sleep(3000);
        customerpanel.clickOnAppStoreMenu();

    }

    @Then("^Admin clicks on New+ button$")
    public void admin_clicks_on_new_button() {
        customerpanel.clickOnNewButton();
    }

    @Then("^Admin selects manual billing toggle button$")
    public void Admin_selects_manual_billing_toggle_button() {
        customerpanel.clickOnManulaBilling();
    }

    @Then("^Admin enter \"(.*?)\" and \"(.*?)\" and \"(.*?)\"$")
    public void Admin_entering_firstname_lastname_phone(String firstname, String lastname, String phone)
            throws Exception {
        customerpanel.entering_Firstname_Lastname_Phonenumber_phonevalidation(firstname, lastname, phone);
    }

    @Then("^Admin must enter \"(.*?)\" and \"(.*?)\" and \"(.*?)\" and \"(.*?)\"$")
    public void enter_firstname_lastname_phone_email(String firstname, String lastname, String phone, String Email)
            throws Exception {
        customerpanel.entering_Firstname_Lastname_phone_email_emailvalidation(firstname, lastname, phone, Email);
    }

    @Then("^Admin gives \"(.*?)\" and \"(.*?)\" and \"(.*?)\"$")
    public void Admin_gives_firstname_lastname_phone(String firstname, String lastname, String phone)
            throws InterruptedException {
        customerpanel.enter_Firstname_Lastname_Phone(firstname, lastname, phone);
    }

    @Then("^Admin clicks on Next button$")
    public void admin_clicks_on_next_button() {
        customerpanel.clickOnNextButton();
    }

    @Then("^Admin clicks on Next button based on \"(.*?)\"$")
    public void admin_clicks_on_next_button_based_on_billing_type(String billingType) throws InterruptedException {
        customerpanel.clickOnNextButtonBasedOnBillingType(billingType);
    }

    @Then("^Admin clicks on skip button$")
    public void clicks_on_skip_button() {
        customerpanel.clickOnSkipButton();
    }

    @Then("^Admin enters business info  \"(.*?)\" and \"(.*?)\" and \"(.*?)\" and \"(.*?)\" and \"(.*?)\"  and uploads incorrect image format \"(.*?)\"$")
    public void Admin_enters_business_info_Businessname_BusinessDomain_ContactName_Phone1_ContactEmail_BusinessLogo(
            String Businessname, String BusinessDomain, String ContactName, String Phone1, String ContactEmail,
            String Businesslogo) throws Exception {
        customerpanel.enter_Bname_Bdomainname_ContactName_Phone1_ContactEmail_Businesslogo_incorrectImageFormat(
                Businessname, BusinessDomain, ContactName, Phone1, ContactEmail, Businesslogo);
    }

    @Then("^Admin clicks on Next button2$")
    public void admin_clicks_on_next_button2() {
        customerpanel.clicksOnNextButton();

    }

    @Then("^Admin clicks on submit button$")
    public void admin_clicks_on_submit_button() throws Exception {
        customerpanel.clickOnSubmitButton();
        customerpanel.Verifyusercreation();
    }

    @Then("^Admin enter \"(.*?)\" in the searchbar$")
    public void Admin_enter_Businessname_in_the_searchbar(String Businessname) throws Exception {
        customerpanel.enter_Businessname_In_The_Searchbar(Businessname);
    }

    @Then("^Admin clicks on List icon$")
    public void Admin_clicks_on_List_icon() {
        customerpanel.listView();
    }

    @Then("^Admin enter \"(.*?)\" in Searchbar$")
    public void Admin_enter_Businessname_in_Searchbar(String Businessname) throws Exception {
        customerpanel.enter_Businessname_Searchbar(Businessname);
    }

    @Then("^Admin enter \"(.*?)\" in searchbar$")
    public void admin_enter_in_searchbar(String Businessname) throws Exception {
        customerpanel.enter_Businessname_In_Searchbar(Businessname);
    }

    @Then("^Admin disables toggle button in customer details$")
    public void admin_disables_toggle_button_in_customer_details() throws Exception {
        customerpanel.disables_Toggle_Button();
    }
    
    @Then("^Admin enables toggle button in customer details$")
   public void admin_enables_toggle_button_in_customer_details() throws Exception {
    	customerpanel.enables_Toggle_Button();
    }

    @Then("^Admin clicks on Launch Dashboard in customer details$")
    public void admin_clicks_on_launch_dashboard_in_customer_details() throws Exception {
        customerpanel.click_On_LaunchDashboard();
    }

    @Then("^Admin enters \"(.*?)\" in search bar$")
    public void admin_enters_Businessname_in_the_search_bar(String Businessname) throws Throwable {
        customerpanel.enter_BusinessName_To_Searchbar(Businessname);
    }

    @Then("^Admin deletes the CAadmin$")
    public void Admin_deleted_the_CAadmin() throws Exception {
        customerpanel.delete_User();
    }

    @Then("^Admin enters business details  \"(.*?)\" and \"(.*?)\" and \"(.*?)\"$")
    public void Admin_enters_business_details_Businessname_BusinessDomainName(String Businessname,
                                                                              String BusinessDomain, String ContactName) {
        customerpanel.businessDomainNameValidation_n(Businessname, BusinessDomain, ContactName);
    }

    @And("^Admin enters \"([^\"]*)\" and \"([^\"]*)\" and phone and email of \"([^\"]*)\" in profile info$")
    public void admin_Enters_Profile_Info(String firstname, String lastname, String country) throws Throwable {
        customerpanel.enter_firstname_lastname_phonenumber_of_country(firstname, lastname, country);
    }

    @And("^Admin enters firstName and lastName and phone of \"([^\"]*)\"$")
    public void admin_Enters_IncorrectPhoneNumber(String country) throws Throwable {
        customerpanel.enter_incorrect_phone_number(country);
    }

    @And("^Admin enters business info  \"([^\"]*)\", domainName, \"([^\"]*)\", phone, ContactEmail, \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
    public void adminEntersBusinessInfoDomainNamePhoneContactEmail(String Businessname, String ContactName,
                                                                   String BusinessLogo, String Addressline1, String Addressline2, String city, String zipCode, String country) throws Throwable {
        customerpanel.enter_all_businessInfo(
                Businessname, ContactName, BusinessLogo, Addressline1,
                Addressline2, city, zipCode, country);
    }

    @And("^Admin entering \"([^\"]*)\", \"([^\"]*)\", phone and email$")
    public void admin_Entering_FirstName_LastName(String firstname, String lastname) throws Throwable {
        customerpanel.enter_firstName_lastName(firstname, lastname);
    }

    @And("^Admin enters business info  \"([^\"]*)\", businessDomain, \"([^\"]*)\", phone, ContactEmail, \"([^\"]*)\", \"([^\"]*)\" and \"([^\"]*)\"$")
    public void admin_Enters_BusinessInfo_Along_With_DomainPhoneEmail(String Businessname, String ContactName, String BusinessLogo, String Addressline1, String Addressline2) throws Exception {
        customerpanel.enter_businessInfo_along_with_domain_phone_email(
                Businessname, ContactName, BusinessLogo, Addressline1,
                Addressline2);
    }

    @And("^Admin enter \"([^\"]*)\" in the searchbar in \"([^\"]*)\"$")
    public void adminEnterValueInSearchbarInViewType(String businessName, String billingType) throws Throwable {
        customerpanel.enter_Search_Value_In_The_Searchbar_In_ViewType(businessName, billingType);
    }

    @And("^Admin searches the customer admin$")
    public void adminSearchesTheCustomerAdmin() throws InterruptedException, AWTException {
        customerpanel.search_the_customer();
    }

    @And("^Admin searches the customer admin domain$")
    public void adminSearchesTheCustomerAdminDomain() throws InterruptedException, AWTException {
        customerpanel.search_the_customer_admin_domain();
    }
}
