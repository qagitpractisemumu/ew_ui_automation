package Pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Profile {

    @FindBy(xpath = "//label[contains(text(),'First Name:')]//following-sibling::div//child::input")
    public static List<WebElement> firstName;

    @FindBy(xpath = "//label[contains(text(),'Last Name:')]//following-sibling::div//child::input")
    public static List<WebElement> lastName;

    @FindBy(xpath = "//label[contains(text(),'Phone#')]//following-sibling::div//child::input")
    public static List<WebElement> phoneNo;

    @FindBy(xpath = "//i[@class='fa-1x icon icon-upload cursor-pointer']")
    public static WebElement uploadProfilePicIcon;
    
    @FindBy(xpath = "//i[@class='fa-1x icon icon-trashcan cursor-pointer']")
    public static WebElement deleteProfilePicIcon;
    
    @FindBy(xpath = "//*[@id='org-profile-popup']/div/div[2]/form/div/div[1]/div[1]/div/div[6]/div/div/i[1]")
    public static WebElement uploadBusinessLogoIcon;

    @FindBy(xpath = "//i[@class='fa-1x icon icon-trashcan']")
    public static List<WebElement> trashProfilePicIcon;

    @FindBy(xpath = "//button[@type='submit']")
    public static List<WebElement> saveBtnOnProfile;
    
    @FindBy(xpath = "//button[contains(text(),'Cancel']")
    public static List<WebElement> btnCancelonEditProfile;

    @FindBy(xpath = "//button[contains(text(),'Next')]")
    public static List<WebElement> nextBtn;

    @FindBy(xpath = "//select[@placeholder='United States of America']")
    public static List<WebElement> countryDD;

    @FindBy(xpath = "//button[contains(text(),'OK')]")
    public static WebElement okBtn;

    @FindBy(xpath = "//button[contains(text(),'Yes')]")
    public static WebElement yesBtn;

   // @FindBy(xpath = "//div[contains(@class,'item hover')]")
    @FindBy(xpath="//div[contains(@class,'item hover settings-trigger')]")
    public static WebElement profileIcon;

    @FindBy(xpath = "//div[contains(text(),'Edit')]")
    //@FindBy(xpath = "//div[contains(text(),'Edit Profile')]")
    public static WebElement profileEdit;

    @FindBy(xpath = "//input[@placeholder='text'][1]")
    public static WebElement lastNameEdit;

    @FindBy(xpath = "//button[contains(text(),'Sav')]")
    public static WebElement editSave;

    @FindBy(xpath = "//div[contains(text(),'Reset')]")
    public static WebElement editPwd;

    @FindBy(xpath = "(//input[@type='password'])[1]")
    public static WebElement oldPwd;

    @FindBy(xpath = "(//input[@type='password'])[2]")
    public static WebElement newPwd;

    @FindBy(xpath = "(//input[@type='password'])[3]")
    public static WebElement confirmNewPwd;

    @FindBy(xpath = "(//button[@type='submit'])[1]")
    public static WebElement pwdSubmit;

    @FindBy(xpath = "//button[@class='swal2-confirm swal2-styled']")
    public static WebElement resetPwdOkBtn;

    @FindBy(xpath = "//input[@type='text'][1]")
    public static WebElement editProfileFirstName;

    @FindBy(xpath="//input[@placeholder='Last Name']")
    //public static WebElement editProfileLastName;
    public static WebElement profileLastname;

    @FindBy(xpath = "//input[@placeholder='Phone Number']")
    public static WebElement editProfileMobileNo;

    @FindBy(xpath = "//button[contains(text(),'Save')]")
    public static WebElement saveAfterEdit;
    
    @FindBy(xpath = "//div[@class='username']")
    public static WebElement firstNameBelowProfile;


    @FindBy(xpath = "//input[@placeholder='First Name']")
    public static WebElement profileFirstname;

    @FindBy(xpath = "//input[@placeholder='Full Name']")
    public static WebElement newCreditFullName;

    @FindBy(xpath = "//input[@name='cardnumber']")
    public static WebElement newCreditCardNumber;

    @FindBy(xpath = "//input[@placeholder='MM / YY']")
    public static WebElement newCreditExpiryMonthYear;

    @FindBy(xpath = "//input[@placeholder='CVC']")
    public static WebElement newCreditCvvNumber;

    @FindBy(xpath = "//input[@placeholder='ZIP']")
    public static WebElement newCreditZipCode;

    @FindBy(xpath = "//input[@placeholder='Street Address']")
    public static WebElement newCreditStreetAddress;

    @FindBy(xpath = "//button[contains(text(),'Save')]")
    public static WebElement newCreditSaveButton;

    @FindBy(xpath = "//input[@placeholder='Last Name']")
    public static WebElement lastNameNew;

   
    @FindBy(xpath = "//div[@id='swal2-content']")
    public static WebElement profileContactEmailWarningMsg;

    @FindBy(xpath = "//button[contains(text(),'OK')]")
    public static WebElement profileContactEmailWarningMsgOkButton;
    
    @FindBy(xpath = "//input[@placeholder='Email']")
    public static WebElement editProfileEmail;


    @FindBy(xpath = "//small[contains(text(),'Unmatched password!')]")
    public static WebElement editPwdWarningMsg;

    @FindBy(xpath = "//div[@class='description']")
    public static WebElement editPwdWrongOldPwd;

    @FindBy(xpath = "//div[@id='org-profile-popup']//form//button[contains(@type,'submit')]")
    public static WebElement profileDetailsSubmitBtn;
    
	@FindBy(xpath="//button[@class='btn primary']")
	public static WebElement btnEditUserProfileSubmit;
	
	@FindBy(xpath="//button[contains(text(),'Save')][1]")
	public static WebElement businessDetailsSaveBtn;
	
	@FindBy(xpath = "//i[@class='fa-1x icon icon-upload cursor-pointer']")
	public static WebElement editProfilePicturePointer;

	
	@FindBy(xpath="//i[@class='icon icon-cross close']")
		public static WebElement crossOnSuccessNotification;
				
		@FindBy(xpath = "//small[text()=' Firstname can only contain alphabets, single quote (\"’\"), hyphen(“-“) and space (\" \") characters']")
	    public static WebElement firstNameSpecialCharacterValidationError;	
		
		@FindBy(xpath = "//small[text()=' Lastname can only contain alphabets, single quote (\"’\"), hyphen(“-“) and space (\" \") characters']")
	    public static WebElement lastNameSpecialCharacterValidationError;		
	   
		@FindBy(xpath = "//small[text()=' First Name is required. ']")
	    public static WebElement profileFirstNameBlankValidationError;
		
		@FindBy(xpath = "//small[text()=' Last Name is required. ']")
	    public static WebElement profileLastNameBlankValidationError;
	    
	    @FindBy(xpath = "//small[text()=' Phone Number is required. ']")
	    public static WebElement PhoneNumberBlankValidationError;
		  	     
		@FindBy(xpath = "//small[text()=' Maximum character length 50. ']")	  
		public static WebElement profileFirstNameLengthValidationError;
		 
	    @FindBy(xpath = "//small[text()=' Maximum character length 50. ']")	  
	    public static WebElement profileLastNameLengthValidationError;
	   
	    @FindBy(xpath = "//small[text()=' Phone Number not available ']")
	    public static WebElement profileExistingPhoneNumberWarningMsg;	 

	    @FindBy(xpath = "//small[text()=' Invalid Phone Number (max: 10 digits). ']")       
	    public static WebElement profilePhoneNoWarningMsg;	    	      
   
	    @FindBy(xpath = "//label[text()='First Name:']")
	    public static WebElement labelFirstName;
	    
	    @FindBy(xpath = "//label[text()='Last Name:']")
	    public static WebElement labelLastName;
	    
	    @FindBy(xpath = "//label[text()='Phone:']")
	    public static WebElement labelPhone;
	    
	    @FindBy(xpath = "//label[text()='Email:']")
	    public static WebElement labelEmail;
	    
	    @FindBy(xpath = "//label[text()='Profile Picture: ']")
	    public static WebElement labelProfilePicture;
	    	           
	    @FindBy(xpath = "//label[text()='Last Login Time:']")
	    public static WebElement labelLastLoginTime;
	    
}
