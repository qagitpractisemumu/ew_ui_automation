package StepDefinition;

import PagePanel.*;
import org.apache.log4j.Logger;

import Resource.LoggerHelper;
import cucumber.api.java.en.Then;

import java.awt.*;

public class ProfileStep {
    RegisterPanel registerPanel = new RegisterPanel();
    LoginPanel loginPanel = new LoginPanel();
    ProfilePanel profilePanel = new ProfilePanel();
    public static Logger log = LoggerHelper.getLogger(ProfileStep.class);

    @Then("^User enters profile details \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
    public void user_enters_profile_details(String firstName, String lastName, String phone, String uploadFilePath) throws Throwable {
        log.info("Entering FN");
        Thread.sleep(5000);
        ProfilePanel.enterFirstName(firstName);
        log.info("Entering LN");
        ProfilePanel.enterLastName(lastName);
        log.info("Entering Phone No");
        ProfilePanel.enterPhoneNo(phone);
        log.info("Uploading DP");
        ProfilePanel.uploadPicture(uploadFilePath);
    }

    @Then("^User uploads profile picture$")
    public void user_uploads_profile_picture() throws Throwable {
        log.info("Uploading profile picture");
        ProfilePanel.uploadPic();
        Thread.sleep(3000);
        log.info("Upload profile picture successfully");
    }
    
    @Then("^User uploads Original profile picture\"(.*?)\"$")
  	public void User_uploads_original_profile_picture(String OriginalProfileImage) throws Exception {
  		ProfilePanel.upload_OriginalProfilePicture(OriginalProfileImage);
  	}
   
    @Then("^User uploads edit profile picture\"(.*?)\"$")
  	public void User_uploads_edit_profile_picture(String ProfileImage) throws Exception {
  		ProfilePanel.upload_ProfilePicture(ProfileImage);
    }
  		
  	@Then("^User editing Original details in \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
  	   public void user_edit_original_details_firstname_lastname_mobileno(String originalfirstName, String originallastName, String originalmobileNo) throws Throwable {
  	        log.info("editing profile details");
  	        ProfilePanel.typeEditProfileDetails(originalfirstName);
  	        ProfilePanel.typeEditProfileDetailsLastName(originallastName);
  	        ProfilePanel.typeEditprofileDetailsMobileNo(originalmobileNo);
  	    }

    @Then("^User clicks on Save button$")
    public void user_clicks_on_Save_button() {
        log.info("Clicking on save button");
        ProfilePanel.clickOnProfileSaveBtn();
    }

    @Then("^User clicks on submit button to save profile page$")
    public void user_clicks_on_submit_button_to_save_profile_page() throws Throwable {        
        log.info("Clicking on Submit button on Profile page");
        ProfilePanel.clickSubmitBtnProfilePage();
    }

    @Then("^User checks email notification after profile update\"([^\"]*)\"$")
    public void user_checks_email_notification_after_profile_update (String email) throws Throwable{
    	log.info("User checking email notification after profile update");
    	RegisterPanel.loginToSacMailToVerifyEmail(email);
    }

    @Then("^User closes the success notification$")
    public void user_closes_the_success_notification() throws Throwable {
    log.info("Closing success notification");
    	ProfilePanel.closeSuccessNotification();
    Thread.sleep(1000);
         }

    @Then("^User clicks profile icon$")
    public void user_clicks_profile_icon() throws Throwable {
        Thread.sleep(3000);
        ProfilePanel.clickProfileIcon();
        Thread.sleep(2000);
    }

  @Then("^User checks updated firstname below profile icon\"([^\"]*)\"$")
  public void User_checks_updated_firstname_below_profile_icon(String firstName) throws Throwable {
   Thread.sleep(2000);
   log.info("Checking updated first name below the profile icon");
   ProfilePanel.checkUpdatedFirstNamebelowprofile(firstName);
  }


  @Then("^User checks updated firstname beside profile icon\"([^\"]*)\"$")
    public void User_checks_updated_firstname_beside_profile_icon(String firstName) throws Throwable {
       log.info("Checking updated first name");
     ProfilePanel.checkUpdatedFirstName(firstName);
  }


    @Then("^User clicks on OK button$")
    public void user_clicks_on_OK_button() throws Throwable {
        log.info("User clicked on OK button");
        Thread.sleep(4000);
        ProfilePanel.clickOKBtn();
        Thread.sleep(4000);
        log.info("User is on OK button on Dashboard");
    }

    @Then("^User clicks on Yes button$")
    public void user_clicks_on_Yes_button() throws Throwable {
        log.info("User clicked on Yes button");
        Thread.sleep(5000);
        ProfilePanel.clickYesBtn();
        Thread.sleep(5000);
        log.info("User is on YEs button on Dashboard");
    }

    @Then("^User clicks on Next button$")
    public void user_clicks_on_Next_button() {
        log.info("Clickign on Next button");
        ProfilePanel.clickNextBtn();
    }

    @Then("^User clicks on submit button$")
    public void user_clicks_on_submit_button() throws Throwable {
        log.info("Clicking on Submit button");
        ProfilePanel.clickSubmitBtn();
    }

    @Then("^User clicks edit profile option\\.$")
    public void user_clicks_edit_profile_option() throws Throwable {
        Thread.sleep(2000);
        ProfilePanel.clickProfileEdit();
        Thread.sleep(2000);
    }

    @Then("^User edit details in \"([^\"]*)\" \"([^\"]*)\"$")
    public void user_edit_details_in(String ccfirstName, String cclastName) throws Throwable {
        log.info("editing details");
        ProfilePanel.editProfileDetailsGiven(ccfirstName);
        ProfilePanel.enterCCFirstName(ccfirstName);
        Thread.sleep(2000);


    }

    @Then("^User edit details in \"([^\"]*)\"$")
    public void user_edit_details_in(String ccfirstName) throws Throwable {
        log.info("editing details");
        ProfilePanel.editProfileDetailsGiven(ccfirstName);
        ProfilePanel.enterCCFirstName(ccfirstName);
        Thread.sleep(1000);

    }

    @Then("^User clicks save button$")
    public void user_clicks_save_button() throws Throwable {
        log.info("Clicking on save button");
        ProfilePanel.editSecondSave();
    }

    @Then("^User clicks reset password option$")
    public void user_clicks_reset_password_option() throws Throwable {
        log.info("Clicking reset password option");
        ProfilePanel.clickEditPwd();
    }

    @Then("^User should enter details \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
    public void user_should_enter_details(String Oldpassword, String Newpassword, String Confirmpassword) throws Throwable {
        log.info("entering new password");
        ProfilePanel.giveOldPwd(Oldpassword);
        ProfilePanel.giveNewPwd(Newpassword);
        ProfilePanel.giveConfirmPwd(Confirmpassword);
    }

    @Then("^User editing details in \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
    public void user_edit_details_firstname_lastname_mobileno(String firstName, String lastName, String mobileNo) throws Throwable {
        log.info("editing profile details");       
        ProfilePanel.typeEditProfileDetails(firstName);
        ProfilePanel.typeEditProfileDetailsLastName(lastName);
        ProfilePanel.typeEditprofileDetailsMobileNo(mobileNo);
        Thread.sleep(2000);
    }

    @Then("^User clicking on save button after edit$")
    public void user_click_save_after_edit_details() throws Throwable {
        log.info("clicking save button");
        ProfilePanel.clickSaveAfterEdit();
    }

    @Then("^User entering profile details \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
    public void user_entering_profile_details_firstname_lastname_telephone(String firstname, String lastname, String telephone) throws Throwable {
        ProfilePanel.enterDetailsForProfile(firstname, lastname, telephone);
    }

    @Then("^User clicks submit button$")
    public void user_clicks_submit_button() throws Throwable {
        log.info("clicking submit button");
        ProfilePanel.clickPwdSubmit();
    }

    @Then("^User editing details in \"([^\"]*)\" \"([^\"]*)\"$")
    public void user_edit_firstname_mobilenumber(String firstName, String mobileNo) throws Throwable {
        log.info("editing profile details");
        ProfilePanel.typeEditProfileDetails(firstName);
        ProfilePanel.typeEditprofileDetailsMobileNo(mobileNo);
    }

    @Then("^User entering profile details \"([^\"]*)\" \"([^\"]*)\" and telephone$")
    public void user_entering_profile_details_firstname_lastname_and_telephone(String firstname, String lastname) throws Throwable {
        ProfilePanel.enterDetailsForProfile(firstname, lastname);

    }

    @Then("^User clicks on submit button on business profile page$")
    public void User_clicks_on_submit_button_on_business_profile_page() throws Throwable {
        ProfilePanel.clickOkOnBusinessProfilePage();
    }


    @Then("^User entering information \"([^\"]*)\" \"([^\"]*)\"$")
    public void user_entering_email_phone_details(String businessPhone, String contactEmail) throws Throwable {
        ProfilePanel.enterEmailPhoneForBusinessDetails(businessPhone, contactEmail);
    }

    @Then("^User selecting the country \"([^\"]*)\"$")
    public void user_selecting_the_country() throws Throwable {
        SubAdminPanel.selectingCountry();
    }

    @Then("^User clicking on the Next button$")
    public void user_clicking_on_next_btn() throws Throwable {
        ProfilePanel.enteringNextButton();
    }

    @Then("^User entering card details \"([^\"]*)\"  \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
    public void user_entering_card_details(String fullname, String ccNo, String ccMonthYear, String ccCVV, String ccZip, String ccLocation) throws Throwable {
        ProfilePanel.enterCreditFullName(fullname);
        ProfilePanel.enterNewCreditCardNo(ccNo);
        ProfilePanel.enterNewCreditExpMonth(ccMonthYear);
        ProfilePanel.enterNewCreditCVV(ccCVV);
        ProfilePanel.enterNewCreditZip(ccZip);
        ProfilePanel.enterNewCreditAddress(ccLocation);
    }

    @Then("^User clicking on credit save button$")
    public void user_clicking_credit_save_btn() throws Throwable {
        ProfilePanel.clickNewCreditSaveBtn();
    }

    @Then("^User verifying Warning Message for Profile Details when the Already Used Mobile Number is entered\\.$")
    public void user_verifying_phone_number_warning_msg() throws Throwable {
        LocationPanel.VerifyProfileExistingPhoneNumberWarningMsg();
    }

 @Then("^User verify warning messages for special and invalid data\"([^\"]*)\" \"([^\"]*)\"  \"([^\"]*)\"$")
 	public void user_verify_warning_messages_for_special_and_invalid_data(String firstname, String lastname, String MobileNo ) throws Throwable {

}


    @Then("^User entering email in text box \"([^\"]*)\"$")
    public void user_entering_email_from_feature_file(String emailid) throws Throwable {
        LoginPanel.enteringEmailFromFeatureFile(emailid);
    }

    @Then("^User entering password in textbox \"([^\"]*)\"$")
    public void user_entering_password_from_feature_file(String password) throws Throwable {
        LoginPanel.enteringPasswordFromFeatureFile(password);
    }

    @Then("^User clicking on Ok button$")
    public void user_clicking_on_ok_button() throws Throwable {
        ProfilePanel.clickProfileContactEmailWarningMsgOk();
    }

    @Then("^User verifies the warning message for new password and confirm password is different$")
    public void user_verifies_warning_msg_newpwd_confirmpwd_different() throws Throwable {
        LocationPanel.verifyingEditPwdWarningMsg();
    }

    @Then("^User clicking tab option to get warning msg$")
    public void user_clicking_tab_option_get_warning_msg() throws Throwable {
        ProfilePanel.clickingTabForEditPwd();
    }

    @Then("^User verifies the warning message as we entered wrong old password while Resetting Password$")
    public void user_verifies_warning_msg_entering_wrong_old_password() throws Throwable {
        LocationPanel.verifyingEditPwdEnteringWrongOldPwdWarningMsg();
    }

    @Then("^User enters payment page details \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
    public void user_enters_payment_details(String fullname, String ccNo, String ccMonthYear, String ccCVV, String ccZip, String ccLocation) throws Throwable {
        ProfilePanel.enterCreditFullName(fullname);
        ProfilePanel.enterNewCreditCardNo(ccNo);
        ProfilePanel.enterNewCreditExpMonth(ccMonthYear);
        ProfilePanel.enterNewCreditCVV(ccCVV);
        ProfilePanel.enterNewCreditZip(ccZip);
        ProfilePanel.enterNewCreditAddress(ccLocation);
    }

    @Then("^User enters credit card details \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
    public void user_enters_credit_card_details(String fullName, String streetAddress, String cardNumber, String expiryDate, String cVV, String zipCode) throws Throwable {
        Thread.sleep(5000);
        log.info("Entering cardNumber");
        ProfilePanel.enterCreditCardDetails(cardNumber, expiryDate, cVV, zipCode);
        System.out.println("Entered Card Number");
        Thread.sleep(3000);
        log.info("Entering Street Address");
        ProfilePanel.enterStreetAddress(streetAddress);
        System.out.println("Entered streetAddress");
        Thread.sleep(3000);
        log.info("Entering CC Full Name");
        ProfilePanel.enterFullName(fullName);
        System.out.println("Entered fullName");
        Thread.sleep(3000);
    }

    @Then("^User clicking on save button$")
    public void user_clicking_save_btn() throws Throwable {
        ProfilePanel.clickSaveBtnPaymentDetails();
    }

    @Then("^User clicking submit button with mouse over action$")
    public void user_clicking_submit_btn_mouseover_actions() throws Throwable {
        ProfilePanel.submitBtnMouseOverAction();
    }

    @Then("^User clicks on submit button on payment profile page$")
    public void User_clicks_on_submit_button_on_payment_profile_page() throws Throwable {
        Thread.sleep(5000);
        ProfilePanel.clickOkOnPaymentProfilePage();
    }

    @Then("^User completes payment profile$")
    public void userCompletesPaymentProfileE2E() throws InterruptedException, AWTException {
        Thread.sleep(5000);
        ProfilePanel.completePaymentProfileE2E();
    }

    @Then("^User completes user profile$")
    public void userCompletesUserProfileE2E() throws InterruptedException {
        ProfilePanel.UserProfileCreationE2E();
    }

    @Then("^User validates the Asterisk against all mandatory \"([^\"]*)\" of Business Info Page$")
    public void userValidatesTheAsteriskAgainstAllMandatoryOfBusinessInfoPage(String field) throws Throwable {
    }


    @Then("^User performs validation\"([^\"]*)\"$")
   public void user_performs_validation(String validationStep) throws Throwable {
    switch (validationStep) {
    case "All elements exists":
    	ProfilePanel.validateAllElementsExistence();
    	break;
    case "Invalid Special Characters":
     ProfilePanel.validateSpecialCharacters();
      break;
    case "Non editable fields":
     Thread.sleep(2000);
    ProfilePanel.validateNonEditableFields();
      break;
     case "Blank values check":
      Thread.sleep(2000);
      ProfilePanel.validateBlankValues();
          break;
      case "Invalid length check":
         Thread.sleep(2000);
          ProfilePanel.validateInvalidLength();
            break;
        case "Invalid phone number validation":
            Thread.sleep(2000);
            ProfilePanel.validateInvalidPhoneNumber();
           break;
     	}
        }


  }


