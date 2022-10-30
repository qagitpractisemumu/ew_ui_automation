package StepDefinition;

import PagePanel.*;
import org.apache.log4j.Logger;

import Resource.LoggerHelper;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class LocationStep {
    RegisterPanel registerPanel = new RegisterPanel();
    LoginPanel loginPanel = new LoginPanel();
    ProfilePanel profilePanel = new ProfilePanel();
    LocationPanel locationPanel = new LocationPanel();
    public static Logger log = LoggerHelper.getLogger(LocationStep.class);

    @Then("^User clicks on Location menu$")
    public void UserClicksOnLocationMenu() throws Throwable {
        log.info("Navigate to Location menu page");
        LocationPanel.clickLocationMenu();
        log.info("Navigated to Location menu page");
    }

    @Then("^User clicks on usercosts$")
    public void user_clicks_on_usercosts() throws Throwable {
        LocationPanel.clickonUsercosts();
    }

    @Then("^User checks invoicedetails$")
    public void user_checks_invoicedetails() throws Throwable {
        LocationPanel.checkCostdetails();
    }

    @Then("^User Checks Services$")
    public void user_checks_services() throws Throwable {
        log.info("Click on services");
        Thread.sleep(4000);
        LocationPanel.clickOnServiceslink();
    }

    @Then("^User Checks Servicename$")
    public void user_checks_servicename() {
        LocationPanel.checkOnServiceslink();

    }

    @Then("^User clicks on Costs$")
    public void user_clicks_on_costs() throws Throwable {
        Thread.sleep(4000);
        LocationPanel.clickOnCostlink();
        Thread.sleep(4000);
    }

    @Then("^User checks cost$")
    public void user_checks_cost() throws Throwable {
        LocationPanel.checkCosts();
    }

    @Then("^User verifies HQ location availablity$")
    public void user_verifies_HQ_location_availablity() throws Throwable {
        log.info("Validate availability of HQ location");
        LocationPanel.verifyHQLocationAvailablity();
        log.info("Validated availability of HQ location");
    }

    @Then("^User select HQ location$")
    public void user_select_HQ_location() throws Throwable {
        log.info("Validate availability of HQ location");
        LocationPanel.verifyHQLocationAvailablity();
        log.info("Validated availability of HQ location");
    }

    @Then("^User verifies deleting HQ location with \"([^\"]*)\"$")
    public void user_verifies_deleting_HQ_location_with(String expectedMsg) throws Throwable {
        log.info("Select Delete icon on HQ location");
        LocationPanel.clickLocationTrashIcon();
        log.info("clickedon delete icon on HQ location");
        LocationPanel.verifyErrorMsgOnDeleteLocation(expectedMsg);
        log.info("Validating error message");
    }

    @Then("^User verifies deleting location$")
    public void user_verifies_deleting_location() {
        log.info("Select Delete icon on location");
        LocationPanel.clickLocationTrashIcon();
        log.info("clickedon delete icon on location");
    }

    @Then("^User clicks on add New Location button$")
    public void UserClicksOnAddNewLocationButton() throws Throwable {
        log.info("Select Add new location icon on HQ location");
        LocationPanel.clickLocationAddNewIcon();
    }

    @Then("^User enters new location details \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
    public void user_enters_new_location_details(String locName, String locationAddress1, String locationAddress2,
                                                 String countryLocation, String locState, String locCity, String locZip) throws Throwable {
        log.info("Enter new location details");
        LocationPanel.enterNewLoctName(locName);
        Thread.sleep(2000);
        LocationPanel.enterNewLocAddress1(locationAddress1);
        LocationPanel.enterNewLocAddress2(locationAddress2);
        Thread.sleep(2000);
        LocationPanel.clickCountry();
        Thread.sleep(2000);
        LocationPanel.enterNewLocState(locState);
        LocationPanel.enterNewLocCity(locCity);
        LocationPanel.enterNewLocZip(locZip);
        log.info("Entered all details of new location.");
        Thread.sleep(2000);
    }

    @Then("^User enters Country\"([^\"]*)\"$")
    public void user_enters_country(String countrylocation) {
        // UsersPanel.selectLoaction(countrylocation);
        UsersPanel.selectCountry(countrylocation);
    }

    @Then("^User clicks on Save Location button$")
    public void user_clicks_on_Save_Location_button() throws Throwable {
        log.info("Click on save button");
        Thread.sleep(3000);
        LocationPanel.clickSubmitBtn();
        Thread.sleep(2000);
        log.info("Clicked on save button");
    }

    @Then("^User select location \"([^\"]*)\"$")
    public void user_select_location(String typename) throws Throwable {
        LocationPanel.selectLocation(typename);
    }

    @Then("^User validate the added location \"([^\"]*)\"$")
    public void user_validate_the_added_location(String locName) throws Throwable {
        Thread.sleep(3000);
        LocationPanel.verfiyAddedLocation(locName);
        Thread.sleep(3000);
    }

    @Then("^User searches monthwise Invoice\"([^\"]*)\"$")
    public void user_searches_monthwise_invoice(String Month) throws Throwable {
        Thread.sleep(3000);
        LocationPanel.checkMonth(Month);
        Thread.sleep(4000);
    }

    @Then("^User checks added location in User \"([^\"]*)\"$")
    public void user_checks_added_location_in_user(String typename) throws Throwable {
        Thread.sleep(4000);
        log.info("Selected Location " + typename);
        UsersPanel.checkselectLoaction(typename);

    }

    @Then("^User verifies location deletion \"([^\"]*)\"$")
    public void user_verifies_location_deletion(String locName) throws Throwable {
        Thread.sleep(5000);
        LocationPanel.verifyLocationDeletion(locName);
    }

    @Then("^User clicks on Edit Location button$")
    public void user_clicks_on_Edit_Location_button() throws Throwable {
        Thread.sleep(3000);
        LocationPanel.clickEditBtn();
        Thread.sleep(4000);

    }

    @Then("^User enters new location details after edit \"([^\"]*)\"$")
    public void user_enters_new_location_details_after_edit(String locName) throws Throwable {
        LocationPanel.editDetailsGiven(locName);
        log.info("Enter new location details");
        LocationPanel.enterNewLoctName(locName);
    }

    @Then("^User enters new location details \"([^\"]*)\" \"([^\"]*)\"$")
    public void user_enters_new_location_details(String locName, String locAddress1) throws Throwable {
        log.info("Enter new location details");
        LocationPanel.enterNewLoctName(locName);
        LocationPanel.enterNewLocAddress1(locAddress1);

    }

    @Then("^User verifies location exist or not$")
    public void user_verifies_location_exist_or_not() throws Throwable {
        log.info("checking whether the location already exist or not");
        LocationPanel.assertionMsg();
    }

    @Then("^User enters new location details \"([^\"]*)\"$")
    public void user_enters_new_location_details(String locName) throws Throwable {
        log.info("Enter new location details");
        LocationPanel.enterNewLoctName(locName);

    }

    @Then("^User clicks Edit option$")
    public void user_clicks_Edit_option() throws Throwable {
        Thread.sleep(10000);
        LocationPanel.clickEditBtn();
        Thread.sleep(4000);
    }

    @Then("^User edit details \"([^\"]*)\" \"([^\"]*)\"$")
    public void user_edit_details(String locationAddress1, String locationAddress2) throws Throwable {
        log.info("Enter edit location details");
        LocationPanel.editNewLocAddress1(locationAddress1);
        LocationPanel.editNewLocAddress2(locationAddress2);
    }

    @Then("^User Clicks Save Button$")
    public void user_Clicks_Save_Button() {
        log.info("Click on save button");
        LocationPanel.clickSubmitBtn();
    }

    @Then("^User clicks the delete button$")
    public void user_clicks_the_delete_button() {
        log.info("Select Delete icon on location");
        LocationPanel.clickLocationTrashIcon();
    }

    @Then("^User verifies the Warning message displayed$")
    public void user_verifies_the_Warning_message_displayed() throws Throwable {
        log.info("verifying the warning message");
        LocationPanel.clickDeleteHeadquarters();

    }

    @Then("^User clicks on Ok button$")
    public void user_clicks_on_Ok_button() {
        log.info("clicking OK button");
        LocationPanel.clickK();
    }

    @Then("^User clicks the Services option$")
    public void user_clicks_the_Services_option() throws Throwable {
        log.info("clicking services option");
        LocationPanel.clickServicesLocation();
    }

    @Then("^User validates the submenu under Services main menu option$")
    public void user_validates_the_submenu_under_Services_main_menu_option() throws Throwable {
        log.info("verifying the submenus under Services menu");
        LocationPanel.checkSubMenuService();

    }

    @Then("^User clicks the Cost menu option$")
    public void user_clicks_the_Cost_menu_option() throws Throwable {
        log.info("clicking costs menu");
        LocationPanel.clickCostLocation();
    }

    @Then("^User validates the default service cost$")
    public void user_validates_the_default_service_cost() {
        log.info("checking the cost default value");
        LocationPanel.checkCostDefaultValue();

    }

    @Then("^User enters the added location in the searchbox \"([^\"]*)\"$")
    public void user_enters_added_location(String typeName) throws Throwable {
        log.info("entering the location name in search box");
        //LocationPanel.typeSearchLocation(typeName);
    }

    @Then("^User enters the old location in the searchbox \"([^\"]*)\"$")
    public void user_enters_old_location(String typeName) throws Throwable {
        log.info("entering the location name in search box");
        LocationPanel.typeSearchLoc(typeName);
    }

    @Then("^User clicks search button$")
    public void user_clicks_search_button() throws Throwable {
        log.info("searching the given location");
        LocationPanel.clickLocationSearchBtn();
    }

    @Then("^User selects the particular location$")
    public void user_selects_particular_location() throws Throwable {
        log.info("clicking the particular location");
        LocationPanel.clickParticularLocation();

    }

    @Then("^User clicking on the delete button$")
    public void user_clicking_on_delete_button() throws Throwable {
        log.info("clicking delete icon");
        LocationPanel.clickDeleteLocationButton();

    }

    @Then("^User verifies the message of warning$")
    public void user_verifies_warning_message() throws Throwable {
        log.info("verifying the warning message");
        LocationPanel.getWarningMsg();

    }

    @Then("^User clicking on Edit option of location details$")
    public void user_clicking_edit_option() throws Throwable {
        log.info("clicking edit option");
        LocationPanel.clickEditLocationButton();

    }

    @Then("^User giving details for edit \"([^\"]*)\" \"([^\"]*)\"$")
    public void user_giving_details_for_edit(String address1Location, String address2Location) throws Throwable {
        log.info("editing details");
        LocationPanel.typeDetailsForEdit(address1Location, address2Location);
    }

    @Then("^User clicking on add New Location button$")
    public void user_clicks_new_location_btn() throws Throwable {
        log.info("clicking new button for creating location");
        LocationPanel.clickNewLocationButton();

    }

    @Then("^User giving new location details \"([^\"]*)\"$")
    public void user_gives_new_location(String typeName) throws Throwable {
        log.info("entering the location name");
        LocationPanel.typeLocationName(typeName);
    }

    @Then("^User is entering new location details for edit \"([^\"]*)\"$")
    public void user_enters_new_location_details_for_editing(String typeName1) throws Throwable {
        log.info("editing the location name of location part");
        LocationPanel.typeEditLocationFirstName(typeName1);

    }

    @Then("^User entering New Location Details \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
    public void user_entering_newlocation_details(String locName, String Location1, String Location2) throws Throwable {
        LocationPanel.enterNewLoctName(locName);
        LocationPanel.enterNewLocAddress1(Location1);
        LocationPanel.enterNewLocAddress2(Location2);
    }

    @Then("^User entering New Location Details \"([^\"]*)\" \"([^\"]*)\"$")
    public void user_entering_newlocation_details(String locName, String Location1) throws Throwable {
        LocationPanel.enterspaceLoctName(locName);
        LocationPanel.enterNewLocAddress1(Location1);

    }

    @Then("^User enters New Location Details \"([^\"]*)\"$")
    public void UserEntersNewLocationDetails(String Location1) throws Throwable {
        LocationPanel.enterNewLocAddress1(Location1);
    }

    @Then("^User entering Location name \"([^\"]*)\"$")
    public void user_entering_location_name(String locName) throws Throwable {
        LocationPanel.enterNewLoctName(locName);


    }

    @Then("^User entering New Location Details \"([^\"]*)\"$")
    public void userEnteringTheNewLocationDetails(String locName) throws Throwable {
        LocationPanel.enterNewLoctName(locName);
    }


    @Then("^User entering new location details for edit \"([^\"]*)\" \"([^\"]*)\"$")
    public void user_enter_new_details_for_edit(String locName, String Location1new) throws Throwable {
        LocationPanel.typeNewLocationNameAfterEdit(locName);
        LocationPanel.typeNewLocationAddresslineAfterEdit(Location1new);

    }

    @Then("^User entering new location details for edit \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
    public void user_enter_new_details_for_edit(String locName, String Location1new, String Location2) throws Throwable {
        LocationPanel.typeNewLocationNameAfterEdit(locName);
        LocationPanel.typeNewLocationAddresslineAfterEdit(Location1new);
        LocationPanel.typeNewLocationAddressline2AfterEdit(Location2);

    }

    @Then("^User entering New Location Details for edit \"([^\"]*)\" \"([^\"]*)\"$")
    public void User_entering_New_Location_Details_for_edit(String Location1, String Location2) throws Throwable {

        LocationPanel.typeNewLocationAddresslineAfterEdit(Location1);
        LocationPanel.typeNewLocationAddressline2AfterEdit(Location2);
    }

    @Then("^User entering new location details for edit \"([^\"]*)\"$")
    public void user_enter_new_details_for_edit(String typeName1) throws Throwable {
        LocationPanel.typeNewLocationNameAfterEdit(typeName1);

    }

    @Then("^User entering new location addressline1 details for edit \"([^\"]*)\"$")
    public void user_enter_new_location_addressline1_for_edit(String typeName1) throws Throwable {
        LocationPanel.typeNewLocationAddresslineAfterEdit(typeName1);
    }

    @Then("^User clicked the button to delete location$")
    public void user_clicked_the_button_for_delete() throws Throwable {
        LocationPanel.clickDeleteLocationButton();
    }

    @Then("^user clicking on confirming yes button$")
    public void user_clicks_on_confirming_yes_button() throws Throwable {
        LocationPanel.clickDeleteConfirmationButton();
    }

    @Then("^User validating the submenu under Services main menu option$")
    public void user_validating_submenus_serviceoption() throws Throwable {
        LocationPanel.checkingSubMenusOfServices();
    }

    @Then("^User clicking the Cost menu option$")
    public void user_clicking_cost_menu() throws Throwable {
        LocationPanel.clickingCostMenuOfLocation();
    }

    @Then("^User clicks on Save button on tab with contains$")
    public void user_clicks_save_btn_with_contains() throws Throwable {
        LocationPanel.clickingSaveBtnWithContains();
    }

    @Then("^User clicking save button with mouseover action$")
    public void user_clicking_save_btn_mouseover_actions() throws Throwable {
        LocationPanel.clickingSaveWithActions();
    }

    @Then("^User verifying the warning msg while user entering previously used address$")
    public void user_verifying_warning_msg_entering_previously_used_address() throws Throwable {
        LocationPanel.verifyingAddressTakenWarningMsg();

    }

    @Then("^User clicking on save button with js executor$")
    public void user_clicking_save_btn_js_executor() throws Throwable {
        SubAdminPanel.clickLocationCreateSaveBtnJsExecutor();
    }

    @Then("^User clicking on cancel button with js executor$")
    public void user_clicking_cancel_btn_js_executor() throws Throwable {
        SubAdminPanel.clickLocationCreateCancelBtnJsExecutor();
    }

    @Then("^User again clicking on add new location button for creation of second location$")
    public void user_again_clicking_new_btn_second_location() throws Throwable {
        LocationPanel.clickNewLocationButton2();
    }

    @Then("^User entering details for another location \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
    public void user_entering_details_second_location(String locName1, String Location3, String Location4)
            throws Throwable {
        LocationPanel.enterNewLoctName1(locName1);
        LocationPanel.enterNewLocAddressSecondLocation(Location3);
        LocationPanel.enterNewLocAddressBuildingSecondLocation(Location4);
    }

    @Then("^User further clicking on add new button for third location$")
    public void user_further_clicking_new_btn_third_location() throws Throwable {
        LocationPanel.clickNewLocationButton3();
    }

    @Then("^User further entering details of new location \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
    public void user_entering_third_location_details(String locName2, String Location5, String Location6)
            throws Throwable {
        LocationPanel.enterNewLoctName2(locName2);
        LocationPanel.enterNewLocAddressThirdLocation(Location5);
        LocationPanel.enterNewLocAddressBuildingThirdLocation(Location6);

    }

    @Then("^User verifies the more number of locations are getting added by entering the location name \"([^\"]*)\" \"([^\"]*)\"$")
    public void user_verifying_the_location_getting_added(String typeName1, String typeName2) throws Throwable {
        LocationPanel.checkingCreationOfLocation1(typeName1);
        LocationPanel.checkingCreationOfLocation2(typeName2);
    }

    @Then("^User clicks on list view icon$")
    public void UserClicksOnListViewIcon() throws Throwable {
        log.info("User clicked on list view icon");
        LocationPanel.clicklistviewiconBtn();
        Thread.sleep(3000);
        System.out.println("User is on listview");
    }

    @Then("^user checks the default view$")
    public void UserChecksTheDefaultView() throws Throwable {
        log.info("User clicked on list view icon");
        LocationPanel.checkdefaultview();
        Thread.sleep(3000);
    }

    @Then("^User clicks on grid view icon$")
    public void UserClicksOnGridViewIcon() throws Throwable {
        log.info("User clicked on grid view icon");
        LocationPanel.clickgridviewiconBtn();
        Thread.sleep(3000);
        System.out.println("User is on gridview");
    }

    @Then("^User clicks on map view icon$")
    public void UserClicksOnMapViewIcon() throws Throwable {
        log.info("User clicked on map view icon");
        LocationPanel.clickmapviewiconBtn();
        Thread.sleep(3000);
        System.out.println("User is on mapview");
    }

    @Then("^User clicks on next arrow in the pagination$")
    public void UserClicksOnNextArrowInThePagination() throws Throwable {
        log.info("User clicked on next arrow in the pagination");
        LocationPanel.clicknextarrowBtn();
        Thread.sleep(3000);
        System.out.println("User clicked on next arrow in the pagination");
    }

    @Then("^User clicks on previous arrow in the pagination$")
    public void UserClicksOnPreviousArrowInThePagination() throws Throwable {
        log.info("User clicked on previous arrow in the pagination");
        LocationPanel.clickpreviousarrowBtn();
        Thread.sleep(3000);
        System.out.println("User clicked on previous arrow in the pagination");
    }

    @Then("^User clicks on show dropup$")
    public void UserClicksOnShowDropup() throws Throwable {
        log.info("User clicked on show dropup in the pagination");
        LocationPanel.clickshowdropup();
        Thread.sleep(3000);
        System.out.println("User clicks on the show dropup");
    }

    @Then("^User clicks on 20 entries in the dropup$")
    public void UserClicksOnSecondOptionInTheDropup() throws Throwable {
        log.info("User selected 20 entries in the show dropup");
        LocationPanel.click20entries();
        Thread.sleep(3000);

    }

    @Then("^User clicks on 30 entries in the dropup$")
    public void UserClicksOnThirdOptionInTheDropup() throws Throwable {
        log.info("User selected 30 entries in the show dropup");
        LocationPanel.click30entries();
        Thread.sleep(3000);

    }

    @Then("^User clicks on 10 entries in the dropup$")
    public void UserClicksOnFirstOptionInTheDropup() throws Throwable {
        log.info("User selected 10 entries in the show dropup");
        LocationPanel.click10entries();
        Thread.sleep(3000);

    }

    @Then("^User clicks on the cancel button$")
    public void UserClicksOnTheCancelButton() throws InterruptedException {
        Thread.sleep(2000);
        LocationPanel.clickCancel();
        Thread.sleep(2000);
    }

    @Then("^User enters the added location addressline1 in the searchbox \"([^\"]*)\"$")
    public void User_enters_the_added_location_addressline1_in_the_searchbox(String typeName) throws Throwable {
        log.info("entering the location addressline1 in search box");
        //  LocationPanel.typeSearchLocation(typeName);
        System.out.println("Displayed the locations based on the addressline1 search");
    }

    @Then("^User enters the added location country in the searchbox \"([^\"]*)\"$")
    public void User_enters_the_added_location_country_in_the_searchbox(String typeName) throws Throwable {
        log.info("entering the location country in search box");
        // LocationPanel.typeSearchLocation(typeName);
        System.out.println("Searching the locations in the search bar");
    }

    @Then("^User enters the added location state in the searchbox \"([^\"]*)\"$")
    public void user_enters_the_added_location_state_in_the_searchbox(String typeName) throws Throwable {
        log.info("entering the location state in search box");
        //  LocationPanel.typeSearchLocation(typeName);
        System.out.println("Displayed the locations based on the state search");
    }

    @Then("^User enters the added location city in the searchbox \"([^\"]*)\"$")
    public void user_enters_the_added_location_city_in_the_searchox(String typeName) throws Throwable {
        log.info("entering the location city in search box");
        //    LocationPanel.typeSearchLocation(typeName);
        System.out.println("Displayed the locations based on the city search");
    }

    @Then("^User enters the added location zipcode in the searchbox \"([^\"]*)\"$")
    public void user_enters_the_added_location_zipcode_in_the_searchbox(String typeName) throws Throwable {
        log.info("entering the location zipcode in search box");
        //.typeSearchLocation(typeName);
        //   System.out.println("Displayed the locations based on the zipcode search");
    }

    @Then("^User checks the save button is enabled or disabled$")
    public void UserChecksTheSaveButtonIsEnabledOrDisabled() throws Throwable {
        log.info("Checking the Save button is enabled or disabled");
        LocationPanel.typechecksavebutton();
    }

    @Then("^User checks the validations are displayed or not$")
    public void User_checks_the_validations_are_displayed_or_not() throws Throwable {
        log.info("Checking the validations are displayed or not");
        LocationPanel.typechecklocnamevalidation();
        LocationPanel.typechecklocaddressvalidations();
    }


//    @Then("^user checks the notification message$")
//    public void user_checks_the_notification_message() throws Throwable {
//    	log.info("Checking the notification is displayed or not");
//    	LocationPanel.typechecklocnotificationmessage(); 	
//    	Thread.sleep(2000);
//    	
//    }

    @Then("^user cancels the notification message$")
    public void user_cancels_the_notification_message() throws Throwable {
        log.info("clicking on cross to close the notification");
        LocationPanel.typecloselocnotificationmessage();
        Thread.sleep(2000);

    }

    @Then("^user checks the headquaters delete notification message$")
    public void user_checks_the_headquaters_delete_notification_message() throws Throwable {
        log.info("Checking the notification is displayed or not");
        LocationPanel.typechecklocdelheadnotificationmessage();
        Thread.sleep(2000);

    }

    @Then("^User checks the error validation$")
    public void User_checks_the_error_validation() throws Throwable {
        log.info("Checking the notification is displayed or not");
        LocationPanel.typecheckduplicatelocerrvalidation();
        LocationPanel.typechecklocerraddressvalidation();
        Thread.sleep(2000);

    }

    @Then("^User checks the locname error validation$")
    public void User_checks_the_locname_error_validation() throws Throwable {
        log.info("Checking the notification is displayed or not");
        LocationPanel.typecheckduplicatelocerrvalidation();
        Thread.sleep(2000);

    }

    @Then("^User checks the locaddress error validation$")
    public void User_checks_the_locaddress_error_validation() throws Throwable {
        log.info("Checking the notification is displayed or not");


        Thread.sleep(2000);

    }

    @Then("^User checks the error address validation$")
    public void User_checks_the_error_address_validation() throws Throwable {
        log.info("Checking the notification is displayed or not");
        LocationPanel.typechecklocerraddressvalidation();
        Thread.sleep(2000);

    }

    @Then("^User checks special characters validation \"([^\"]*)\"$")
    public void User_checks_special_characters(String locName) throws Throwable {
        log.info("Checking location name field allowing special charaters");
        LocationPanel.enterNewLoctName(locName);
//        LocationPanel.enterNewLocAddress1(locAddress1);
        Thread.sleep(2000);

    }

    @Then("^User checks the special characters validations are displayed or not$")
    public void User_checks_the_special_validations_are_displayed_or_not() throws Throwable {
        log.info("Checking the validations are displayed or not");
        LocationPanel.typechecklocnamevalidation();

    }

    @Then("^User checks that the headquaters location name field is editable or not$")
    public void User_checks_that_the_headquaters_location_name_field_is_editable_or_not() throws Throwable {
        log.info("Checking the location name field is editable or not");
        LocationPanel.typechecklocnameeditable();

    }

    @Then("^admin checks the asterisk symbols$")
    public void AdminChecksTheAsteriskSymbols() throws Throwable {
        log.info("Checking the asterisk symbols");
        LocationPanel.typecheckasteriskrequiredfields();

    }

    @Then("^user scrolls the main page scroll bar$")
    public void user_scrolls_the_main_page_scroll_bar() throws Throwable {
        log.info("user scrolling the main page scroll bar");
        LocationPanel.typescrollmainpage();
    }

//    @Then("^user scrolls the middle panel scroll bar$")
//    public void user_scrolls_the_middle_panel_scroll_bar() throws Throwable {
//    	log.info("user scrollng the middle panel scroll bar");
//    	LocationPanel.typescrollmiddlepanel();  	
//    }
//    
//    @Then("^user scrolls the right panel details scroll bar$")
//    public void user_scrolls_the_right_panel_details_scroll_bar() throws Throwable {
//    	log.info("user scrolling the right panel details scroll bar");
//    	LocationPanel.typescrollrightpanelpage();  	
//    }

    @Then("^user checks the valid page number in the pagination$")
    public void userChecksTheValidPageNumberInThePagination() throws Throwable {
        log.info("user checks the page numbers");
        LocationPanel.typecheckpagenumberone();

    }

    @Then("^user checks the valid page number in the pagination after next arrow$")
    public void userChecksTheValidPageNumberInThePaginationAfterNextArrow() throws Throwable {
        log.info("user checks the page numbers");
        LocationPanel.typecheckpagenumbertwo();

    }

    @Then("^user checks the title of the page$")
    public void user_checks_the_title_of_the_page() throws Throwable {
        log.info("user checks the title of the page");
        Thread.sleep(3000);
        RegisterPanel.getPageTitle();
    }

    @Then("^user checks the header title of the page$")
    public void user_checks_the_header_title_of_the_page() throws Throwable {
        log.info("user checks the header title of the page");
        Thread.sleep(3000);
        LocationPanel.getpageheaderTitle();
    }

    @Then("^User checks new edit delete buttons are available or not bydefault$")
    public void User_checks_new_edit_delete_buttons_are_available_or_not_bydefault() throws Throwable {
        log.info("user checks the default buttons on the page");
        Thread.sleep(3000);
        LocationPanel.checkbuttons();
    }

    @Then("^User checks the selected location right panel details headers$")
    public void User_checks_the_selected_location_right_panel_details_headers() throws Throwable {
        log.info("Checking the location details headers in the right panel");
        LocationPanel.typecheckrightpanelheaders();

    }

    @Then("^User entering New Location Details \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
    public void user_entering_newlocation_details(String locName, String Location1, String Location2, String zipcode) throws Throwable {
        LocationPanel.enterNewLoctName(locName);
        LocationPanel.enterNewLocAddress1(Location1);
        LocationPanel.enterNewLocAddress2(Location2);
//        LocationPanel.enterNewLocCountry(country);
//        LocationPanel.enterNewLocState(state);
//        LocationPanel.enterNewLocCity(city);
        LocationPanel.enterNewLocZip(zipcode);
        LocationPanel.focusCancel();
    }

    @Then("^user checks the headquaters location is available by-default or not$")
    public void user_checks_the_headquaters_location_is_available_bydefault_or_not() throws Throwable {
        log.info("user checks the headquaters location");
        LocationPanel.checkheadquaters();
    }

    @Then("^user checks the privacy legal on the footer$")
    public void userChecksThePrivacyLegalOnTheFooter() throws Throwable {
        log.info("user checking the privacy-legal on the footer");
        LocationPanel.checkfooter();

    }

    @Then("^User performs location creation and duplicate location creation and location creation other than US$")
    public void UserPerformsLocationCreationAndDuplicateLocationCreationAndLocationCreationOtherThanUS() throws Throwable {
        LocationPanel.createuser();
    }

    @Then("^User performs location updation and headquaters name updation$")
    public void UserPerformsLocationUpdationAndHeadquatersNameUpdation() throws Throwable {
        System.out.println("User updating the added location");
        LocationPanel.updateuser();
    }

    @Then("^User performs location deletion and headquaters deletion$")
    public void UserPerformsLocationDeletionAndHeadquatersDeletion() throws Throwable {
        System.out.println("User deleting the added location");
        LocationPanel.deleteuser();
    }

    @Then("^User searches the location using \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
    public void UserSearchesTheLocationUsing(String locName, String locationAddress1, String countryLocation, String locState, String locCity, String locZip) throws Throwable {
        LocationPanel.typeSearchLocationName(locName);
        LocationPanel.typeSearchLocationAddress(locationAddress1);
        LocationPanel.typeSearchLocationCountry(countryLocation);
        LocationPanel.typeSearchLocationState(locState);
        LocationPanel.typeSearchLocationCity(locCity);
        LocationPanel.typeSearchLocationZip(locZip);
    }

    @Then("^user checks the elements present on locations page$")
    public void userChecksTheElementsPresentOnLocationsPage() throws Throwable {
        System.out.println("User checking the elements present on locations page");
        Thread.sleep(2000);
        LocationPanel.checkbuttons();
        LocationPanel.typecheckrightpanelheaders();
        LocationPanel.checknewbuttonlabels();
    }

    @Then("^admin checks the Tab functionality$")
    public void adminChecksTheTabFunctionality() throws Throwable {
        System.out.println("User checking the tab functionality");
        Thread.sleep(2000);
        LocationPanel.validateTabFunctionalityOnNew();

    }

    @Then("^admin checks the required field validations$")
    public void adminChecksTheRequiredFieldValidations() throws Throwable {
        System.out.println("User checking the required field validation");
        Thread.sleep(2000);
        LocationPanel.validaterequiredfields();

    }

    @Then("^admin checks the length validations$")
    public void adminChecksTheLengthValidations() throws Throwable {
        log.info("Checking the length validations");
        LocationPanel.checklengthvalidations();
    }

    @Then("^admin checks the valid special characters$")
    public void adminChecksTheValidSpecialCharacters() throws Throwable {
        log.info("Checking the valid special characters");
        LocationPanel.checkvalidspecialcharacters();
    }

    @Then("^admin checks the invalid special characters$")
    public void adminChecksTheInValidSpecialCharacters() throws Throwable {
        log.info("Checking the invalid special characters");
        LocationPanel.checkinvalidspecialcharacters();
    }

    @Then("^admin checks the spaces trim$")
    public void adminChecksTheSpacesTrim() throws Throwable {
        log.info("Checking the spaces");
        LocationPanel.checkspacestrim();
    }

    @Then("^admin scrolls the locations page$")
    public void adminScrollsTheLocationsPage() throws Throwable {
        log.info("Scrolling the locations page");
        LocationPanel.checkscrollbar();
    }



}
