package StepDefinition;


import PagePanel.BusinessInfoPanel;
import PagePanel.PA_LoginPanel;
import cucumber.api.PendingException;
import cucumber.api.java.en.Then;

import static Resource.UtilityClass.log;

public class BusinessInfoStep {
    @Then("^User clicks on BusinessInfo menu$")
    public void userClicksOnBusinessInfoMenu() throws InterruptedException {
        BusinessInfoPanel.clickBusinessInfoMenu();
    }

    @Then("^User entering business information \"([^\"]*)\" \"([^\"]*)\"$")
    public void user_entering_business_information(String businessName, String contactName) throws Throwable {
        BusinessInfoPanel.enterNameForBusinessDetails(businessName, contactName);
    }

    @Then("^User selects the \"([^\"]*)\"$")
    public void userSelectsTheBusinessDomain(String businessDomain) throws Throwable {
        BusinessInfoPanel.selectBusinessDomain(businessDomain);
    }

    @Then("^User entering information businessPhone and contactEmail$")
    public void user_entering_information_businessPhone_and_contactEmail() throws Throwable {
        BusinessInfoPanel.enterEmailPhoneDetails();
    }

    @Then("^User validates the required \"([^\"]*)\" validation of Business Info Page for all \"([^\"]*)\"$")
    public void userValidatesTheRequiredValidationOfBusinessInfoPageForAll(String field, String fields) throws Throwable {
        BusinessInfoPanel.businessInfoMandatoryFieldAsteriskValidation(field, fields);
    }

    @Then("^User validates that domain name is a dropdown$")
    public void userValidatesThatDomainNameIsADropdown() {
        BusinessInfoPanel.validateDomainNameDropDown();
    }

    @Then("^User validates that save button is disabled by default$")
    public void userValidatesThatSaveButtonIsDisabledByDefault() {
        BusinessInfoPanel.disabledSaveButton();
    }

    @Then("^User updates the country code of the phone number$")
    public void userUpdatesTheCountryCodeOfThePhoneNumber() throws InterruptedException {
        BusinessInfoPanel.updateCountryCode();
    }

    @Then("^corresponding validation \"([^\"]*)\" is performed$")
    public void correspondingValidation(String validationStep) throws Throwable {

        switch (validationStep) {
            case "All elements are present for Onboarded Customer":
                Thread.sleep(2000);
                BusinessInfoPanel.validateAllElementsPresenceOnEditBusinessInfo();
                break;
            case "All elements are present for Self Service Portal Customer":
                Thread.sleep(2000);
                BusinessInfoPanel.validateAllElementsPresenceOnEditSspBusinessInfo();
                break;
            case "Tab functionality for Onboarded Customer":
                Thread.sleep(2000);
                BusinessInfoPanel.validateTabFunctionalityOnEditBusinessInfo();
                break;
            case "Tab functionality for Self Service Portal Customer":
                Thread.sleep(2000);
                BusinessInfoPanel.validateTabFunctionalityOnEditSspBusinessInfo();
                break;
            case "Required field validations for Onboarded Customer":
                Thread.sleep(2000);
                BusinessInfoPanel.requiredFieldValidationOnEditBusinessInfo();
                break;
            case "Required field validations for Self Service Portal Customer":
                Thread.sleep(2000);
                BusinessInfoPanel.requiredFieldValidationOnEditSspBusinessInfo();
                break;
            case "Invalid length validations for Onboarded Customer":
                Thread.sleep(2000);
                BusinessInfoPanel.invalidLengthValidationOnEditBusinessInfo();
                break;
            case "Invalid length validations for Self Service Portal Customer":
                Thread.sleep(2000);
                BusinessInfoPanel.invalidLengthValidationOnEditSspBusinessInfo();
                break;
            case "Cancel functionality for Onboarded Customer":
                Thread.sleep(2000);
                BusinessInfoPanel.cancelUndoneChangesOnEditBusinessInfo();
                break;
            case "Cancel functionality for Self Service Portal Customer":
                Thread.sleep(2000);
                BusinessInfoPanel.cancelUndoneChangesOnEditSspBusinessInfo();
                break;
            case "Update Contact Number ranging between one to ten in Length":
                Thread.sleep(2000);
                BusinessInfoPanel.updateContactNumberOnEditBusinessInfo();
                break;
            default:
                System.out.println("Validation Implementation Does not Exist");
        }
    }

    @Then("^validate \"([^\"]*)\" is able to update Business Info successfully and receive email notification to \"([^\"]*)\"$")
    public void validateBusinessInfoUpdateAndEmailNotification(String customer, String email) throws Throwable {
        BusinessInfoPanel.validateBusinessInfoUpdateAndEmailNotification(customer, email);
    }

    @Then("^User entering address details \"([^\"]*)\" \"([^\"]*)\"$")
    public void userEnteringAddressDetails(String arg0, String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^User performs \"([^\"]*)\" special character validation$")
    public void userPerformsSpecialCharacterValidation(String customer) throws Throwable {
        BusinessInfoPanel.specialCharacterValidationOnEditBusinessInfo(customer);
    }

    @Then("^Admin fetch otp from email for \"([^\"]*)\"$")
    public void adminFetchOtpFromEmailFor(String email) throws Throwable {
        PA_LoginPanel.loginToYopMailToFetchotptologin(email);
    }

    @Then("^User uploads deletes Business Logo$")
    public void user_uploads_businessLogo() throws Throwable {
        log.info("Uploading Business Logo");
        BusinessInfoPanel.uploadLogo();
    }
}
