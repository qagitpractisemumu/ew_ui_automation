package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BusinessInfo {

    public static WebElement businessDetailsSaveBtn;

    @FindBy(xpath = "//small[text()=' Business name must be no more than 50 characters. ']")
    public static WebElement businessNameLengthValidationError;

    @FindBy(xpath = "//small[text()=' Contact Name must be no more than 50 characters.']")
    public static WebElement contactNameLengthValidationError;

    @FindBy(xpath = "//small[text()='Contact name must not contain special characters.']")
    public static WebElement contactNameValidationError;

    @FindBy(xpath = "//small[text()=' //small[text() = ' Invalid Contact Phone(max: 10 digits) '] ")
    public static WebElement contactPhoneLengthValidationError;

    @FindBy(xpath = "//small[text()=' Invalid Contact Phone ']")
    public static WebElement invalidContactPhoneValidationError;

    @FindBy(xpath = "(//small[@class='form-error-msg'])[3]")
    public static WebElement contactEmailValidationError;

    @FindBy(xpath = "//small[text()=' Street Address is required ']")
    public static WebElement addressLine1RequiredError;

    @FindBy(xpath = "((//small[@class='form-error-msg']/following-sibling::small)[3]")
    public static WebElement InvalidEmailError;

    @FindBy(xpath = "//small[text()=' Street Address must be no more than 90 characters. ']")
    public static WebElement addressLine1LengthValidationError;

    @FindBy(xpath = "//small[text()=' Street Address must be no more than 30 characters. ']")
    public static WebElement addressLine2LengthValidationError;

    @FindBy(xpath = "(//span[text()='Business Info'])[1]")
    public static WebElement businessInfoTitle;

    @FindBy(xpath = "//label[text()='Business Name: ']")
    public static WebElement businessNameLabel;

    @FindBy(xpath = "//label[text()='Business Domain: ']")
    public static WebElement businessDomainLabel;

    @FindBy(xpath = "//label[text()='Contact Name: ']")
    public static WebElement contactNameLabel;

    @FindBy(xpath = "//label[text()='Contact Phone: ']")
    public static WebElement contactPhoneLabel;

    @FindBy(xpath = "//label[text()='Contact Email: ']")
    public static WebElement contactEmailLabel;

    @FindBy(xpath = "//label[text()='Business Logo: ']")
    public static WebElement businessLogoLabel;

    @FindBy(xpath = "//label[text()='Business Logo: ']/following-sibling::img")
    public static WebElement businessLogoImage;

    @FindBy(xpath = "//label[text()='Address Line #1: ']")
    public static WebElement addressLine1Label;

    @FindBy(xpath = "//label[text()='Address Line #2: ']")
    public static WebElement addressLine2Label;

    @FindBy(xpath = "//label[text()='City/Region: ']")
    public static WebElement cityLabel;

    @FindBy(xpath = "//label[text()='State: ']")
    public static WebElement stateLabel;

    @FindBy(xpath = "//label[text()='Zip Code: ']")
    public static WebElement zipCodeLabel;

    @FindBy(xpath = "//input[@placeholder='Business Name']")
    public static WebElement businessNameTextBox;

    @FindBy(xpath = "//div[@id='domainName-select']//button[1]")
    public static WebElement businessDomainDropDown;

    @FindBy(xpath = "//input[@placeholder='Contact Name']")
    public static WebElement contactNameTextBox;

    @FindBy(xpath = "//a[@type='button']")
    public static WebElement countryCodeHyperlink;

    @FindBy(xpath = "(//input[@placeholder='Phone Number'])[2]")
    public static WebElement contactNumberTextBox;

    @FindBy(xpath = "//input[@placeholder='Contact Email']")
    public static WebElement contactEmailTextBox;

    @FindBy(xpath = "//input[@placeholder='Enter a location']")
    public static WebElement addressLine1TextBox;

    @FindBy(xpath = "//input[@placeholder='Apartment, Suite, Unit, Building, Floor, etc.']")
    public static WebElement addressLine2TextBox;

    @FindBy(xpath = "//label[text()='Country: ']")
    public static WebElement countryTextBox;

    @FindBy(xpath = "//input[@placeholder='Zip Code']")
    public static WebElement zipCodeTextBox;

    @FindBy(xpath = "//button[text()='Cancel']")
    public static WebElement editBusinessInfoCancelButton;

    @FindBy(xpath = "//button[text()='Save']")
    public static WebElement editBusinessInfoSaveButton;

    @FindBy(xpath = "//img[@alt='Google']")
    public static WebElement googleLogo;

    @FindBy(xpath = "//label[@class='required'][contains(text(),'Business Name: ')]")
    public static WebElement businessNameAsterisk;

    @FindBy(xpath = "//label[@class='required'][contains(text(),'Business Domain: ')]")
    public static WebElement businessDomainAsterisk;

    @FindBy(xpath = "//label[@class='required'][contains(text(),'Company Name: ')]")
    public static WebElement companyNameAsterisk;

    @FindBy(xpath = "//label[@class='required'][contains(text(),'Contact Name: ')]")
    public static WebElement contactNameAsterisk;

    @FindBy(xpath = "//label[@class='required'][contains(text(),'Contact Phone: ')]")
    public static WebElement contactPhoneAsterisk;

    @FindBy(xpath = "//label[@class='required'][contains(text(),'Contact Email: ')]")
    public static WebElement contactEmailAsterisk;

    @FindBy(xpath = "//label[@class='required'][contains(text(),'Address Line #1: ')]")
    public static WebElement addressLine1Asterisk;

    @FindBy(xpath = "//label[@class='required'][contains(text(),'City/Region: ')]")
    public static WebElement cityAsterisk;

    @FindBy(xpath = "//label[@class='required'][contains(text(),'State: ')]")
    public static WebElement stateAsterisk;

    @FindBy(xpath = "//label[@class='required'][contains(text(),'Zip Code: ')]")
    public static WebElement zipCodeAsterisk;

    @FindBy(xpath = "//label[@class='required'][contains(text(),'Country: ')]")
    public static WebElement countryAsterisk;

    @FindBy(xpath = "//small[text()=' Business name is required ']")
    public static WebElement businessNameRequiredError;

    @FindBy(xpath = "//small[text()=' Contact Name is required ']")
    public static WebElement contactNameRequiredError;

    @FindBy(xpath = "(//input[@placeholder='Phone Number'])[2]")
    public static WebElement contactPhoneTextBox;

    @FindBy(xpath = "//small[text()=' Contact Phone is required ']")
    public static WebElement contactPhoneRequiredError;

    @FindBy(xpath = "//small[text()=' Contact Email is required ']")
    public static WebElement contactEmailRequiredError;

    @FindBy(xpath = "//small[text() = ' Invalid Email Id ']")
    public static WebElement contactEmailLengthValidationError;

    @FindBy(xpath = "//small[text()=' Zip Code cannot contain any special character. ']")
    public static WebElement zipCodeError;

    @FindBy(xpath = "(//div[@class='notification live'])[1]")
    public static WebElement successMessageNotification;

    @FindBy(xpath = "//small[text()=' Business name cannot contain any number or special character.']")
    public static WebElement businessNameSpecialCharacterValidationError;

    @FindBy(xpath = "//small[text()='Contact name must not contain special and numeric characters.']")
    public static WebElement contactNameSpecialCharacterValidationError;

    @FindBy(xpath = "(//div[contains(@class,'contents tab-contents')])")
    public static WebElement invalidContactEmailSpecialCharacterValidationError;

    @FindBy(xpath = "(//i[contains(@class,'fa-1x icon')])[3]")
    public static WebElement uploadBusinessLogo;

    @FindBy(xpath = "(//i[contains(@class,'fa-1x icon')])[4]")
    public static WebElement deleteBusinessLogo;

    @FindBy(xpath = "//a[@href='/legal-page']")
    public static WebElement privacyLegalOnFooter;

    @FindBy(xpath = "//small[text()=' The file uploaded is not supported. Only jpg, jpeg, or png files are allowed. ']")
    public static WebElement invalidImageFormatValidationMessage;
}
