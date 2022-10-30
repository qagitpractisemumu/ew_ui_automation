package PagePanel;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import Pages.BusinessInfo;
import Pages.Login;
import Resource.RobotUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import Pages.Profile;
import Resource.BaseClass;
import Resource.UtilityClass;
import org.testng.Assert;
import org.openqa.selenium.support.FindBy;

public class ProfilePanel extends BaseClass {
    public static String newBsinessName;
    Login login = new Login();
    Profile profile = new Profile();
    static JavascriptExecutor js = (JavascriptExecutor) driver;
    static String businessName;

    public ProfilePanel() {
        profile = PageFactory.initElements(driver, Profile.class);
    }

    public static void enterFirstName(String firstName) {
        driver.switchTo().activeElement().sendKeys(firstName);
    }

    public static void enterLastName(String lastName) {
        UtilityClass.waitForElement(Profile.lastName.get(1));
        Profile.lastName.get(1).sendKeys(lastName);
    }

    public static void enterPhoneNo(String phone) {
        UtilityClass.waitForElement(Profile.phoneNo.get(1));
        Profile.phoneNo.get(1).sendKeys(phone);
    }

    public static void uploadPicture(String uploadFilePath) throws Throwable {
        UtilityClass.waitForElement(Profile.uploadProfilePicIcon);
        String valueFile = UtilityClass.getFilePath(uploadFilePath);
        Profile.uploadProfilePicIcon.click();
        UtilityClass.theFileUpload(valueFile);
    }

    public static void clickOnProfileSaveBtn() {
        UtilityClass.waitForElement(Profile.saveBtnOnProfile.get(2));
        Profile.saveBtnOnProfile.get(2).click();
    }

    public static void editSecondSave() throws InterruptedException {
        UtilityClass.waitForElement(Profile.editSave);
        Thread.sleep(4500);
        Profile.editSave.click();

    }

    public static void clickEditPwd() throws InterruptedException {
        UtilityClass.waitForElement(Profile.editPwd);
        Profile.editPwd.click();
        Thread.sleep(4500);

    }

    public static void giveOldPwd(String oldpassword) throws AWTException, InterruptedException {
        UtilityClass.waitForElement(Profile.oldPwd);
        Profile.oldPwd.sendKeys(oldpassword);
        UtilityClass.clickTab();
        Thread.sleep(1000);

    }

    public static void giveNewPwd(String newpassword) throws InterruptedException {
        UtilityClass.waitForElement(Profile.newPwd);
        Profile.newPwd.sendKeys(newpassword);
        Thread.sleep(2000);

    }

    public static void giveConfirmPwd(String confirmpassword) throws InterruptedException {
        UtilityClass.waitForElement(Profile.confirmNewPwd);
        Profile.confirmNewPwd.sendKeys(confirmpassword);
        Thread.sleep(2000);

    }

    public static void clickPwdSubmit() throws InterruptedException {
        Thread.sleep(10000);
        UtilityClass.waitForElement(Profile.pwdSubmit);
        Profile.pwdSubmit.click();
        Thread.sleep(4000);
    }

    public static void enterBusinessName(String businessName) {
        driver.switchTo().activeElement().sendKeys(businessName);
    }

    public static void enterBusinessPhone(String businessPhone) {
        UtilityClass.waitForElement(Profile.phoneNo.get(1));
        Profile.phoneNo.get(1).sendKeys(businessPhone);
    }

    public static void selectCountryDDValue(String str) throws Throwable {
        System.out.println("Click on country dropdown");
        Thread.sleep(1000);
        UtilityClass.waitForElement(Profile.countryDD.get(1));
        System.out.println("Clicking on country dd now");
        Thread.sleep(1000);
        System.out.println("Selecting country name from dd list");
        UtilityClass.dropDownHandle(Profile.countryDD.get(1), str);
        System.out.println("Selected the value from list of value now");
    }

    public static void clickNextBtn() {
        UtilityClass.waitForElement(Profile.nextBtn.get(1));
        Profile.nextBtn.get(1).click();
    }

    public static void clickOKBtn() throws Throwable {
        UtilityClass.waitForElement(Profile.okBtn);
        Profile.okBtn.click();
        Thread.sleep(1000);
    }

    public static void enterCCFirstName(String ccfirstName) throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[contains(@placeholder,'First Name')]")).sendKeys(ccfirstName);
        Thread.sleep(1000);
    }


    public static void clickSubmitBtn() throws InterruptedException {
        Profile.profileDetailsSubmitBtn.submit();
        Thread.sleep(200000);
    }

    public static void clickSaveBtnPaymentDetails() throws InterruptedException {
        Thread.sleep(5000);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", BusinessInfo.businessDetailsSaveBtn);
        Thread.sleep(2000);
    }

    public static void clickSubmitBtnProfilePage() throws InterruptedException {
        Thread.sleep(5000);       
        UtilityClass.waitForElement(Profile.btnEditUserProfileSubmit);
        Profile.btnEditUserProfileSubmit.click();
        System.out.println("profile details saved after clicking submit button");
        Thread.sleep(3000);        
    }

    public static void closeSuccessNotification() throws InterruptedException {
    	Thread.sleep(3000);
    	UtilityClass.waitForElement(Profile.crossOnSuccessNotification);
    	if (Profile.crossOnSuccessNotification.isEnabled()) {
    		Profile.crossOnSuccessNotification.click();
    		Thread.sleep(1000);
    		System.out.println("Closed Success Notification");
    	}
     }

    public static void clickYesBtn() {
        UtilityClass.waitForElement(Profile.yesBtn);
        Profile.yesBtn.click();
    }

    public static void clickProfileIcon() {
        UtilityClass.waitForElement(Profile.profileIcon);
        Profile.profileIcon.click();

    }

    public static void checkUpdatedFirstName(String firstName) {
    	UtilityClass.waitForElement(Profile.profileIcon);
    	String firstnamecheck = Profile.profileIcon.getText();
    	Assert.assertEquals(firstnamecheck, firstName);
    	 System.out.println("Updated firstname beside profile icon is " + firstnamecheck);
    }


     public static void checkUpdatedFirstNamebelowprofile(String firstName) {
    	 UtilityClass.waitForElement(Profile.firstNameBelowProfile);
    	 String firstnamecheckbelowprofile = Profile.firstNameBelowProfile.getText();
    	Assert.assertEquals(firstnamecheckbelowprofile, firstName);
    	 System.out.println("Updated firstname below profile is " + firstnamecheckbelowprofile);
    }



    public static void clickProfileEdit() {
        UtilityClass.waitForElement(Profile.profileEdit);
        Profile.profileEdit.click();

    }

    public static void editProfileDetailsGiven(String element) throws Throwable {
        UtilityClass.editValues(element);
    }

    public static void typeEditProfileDetails(String firstName) throws InterruptedException {
        Thread.sleep(4000);
        UtilityClass.waitForElement(Profile.editProfileFirstName);
        Profile.editProfileFirstName.clear();
        Profile.editProfileFirstName.sendKeys(firstName);
    }
    
    public static void typeEditProfileDetailsLastName(String lastName) throws InterruptedException {
        Thread.sleep(4000);
        UtilityClass.waitForElement(Profile.profileLastname);
        Profile.profileLastname.clear();
        Profile.profileLastname.sendKeys(lastName);
    }
    

    public static void typeEditprofileDetailsMobileNo(String mobileNo) throws InterruptedException {
        Thread.sleep(3000);
        UtilityClass.waitForElement(Profile.editProfileMobileNo);
        Profile.editProfileMobileNo.clear();
        Profile.editProfileMobileNo.sendKeys(mobileNo);
        Thread.sleep(3000);
    }
    
    public static void upload_ProfilePicture(String ProfileImage) throws Exception {
		RobotUtil.upload_Profile_Picture();
		Thread.sleep(3000);
	}

    public static void upload_OriginalProfilePicture(String OriginalProfileImage) throws Exception {
		RobotUtil.upload_OriginalProfilePicture();
		Thread.sleep(3000);
	}
    
    public static void clickSaveAfterEdit() throws InterruptedException {
        Thread.sleep(2000);
        UtilityClass.waitForElement(Profile.saveAfterEdit);
        Profile.saveAfterEdit.click();
    }

    public static void enterDetailsForProfile(String firstname, String lastname, String telephone)
            throws InterruptedException {
        Thread.sleep(5500);
        driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys(firstname);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys(lastname);
        Thread.sleep(2500);
        driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys(telephone);
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@placeholder='Last Name']")).click();

    }

    public static void enterDetailsForProfile(String firstname, String lastname) throws InterruptedException {
        Thread.sleep(1500);
        UtilityClass.waitForElement(Profile.profileFirstname);
        Profile.profileFirstname.sendKeys(firstname);
        Thread.sleep(1000);

        UtilityClass.waitForElement(Profile.profileLastname);
        Profile.profileLastname.sendKeys(lastname);

        Thread.sleep(1000);

        Thread.sleep(1500);
        String phoneNumber = String.valueOf((long) Math.floor(Math.random() * 9_000_000_000L) + 1_000_000_000L);
        driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys(phoneNumber);
        Thread.sleep(1000);
    }

    public static void enterEmailPhoneForBusinessDetails(String businessPhone, String contactEmail)
            throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@placeholder='Contact Number']")).sendKeys(businessPhone);
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//label[text()='Contact Email:']/following::input)[1]")).sendKeys(contactEmail);
        Thread.sleep(1000);
    }

    public static void enteringNextButton() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@id='org-profile-popup']//form//button[contains(@type,'submit')]")).click();
        Thread.sleep(5000);
    }

    public static void enterCreditFullName(String fullname) throws InterruptedException {
        Thread.sleep(1000);
        UtilityClass.waitForElement(Profile.newCreditFullName);
        Profile.newCreditFullName.sendKeys(fullname);
        Thread.sleep(2000);
    }

    public static void enterNewCreditCardNo(String ccNo) throws InterruptedException {
        Thread.sleep(1500);
        driver.findElement(By.xpath("//input[@name='cardnumber']")).sendKeys(ccNo);
        Thread.sleep(1000);
    }

    public static void enterNewCreditExpMonth(String ccMonthYear) throws InterruptedException {
        UtilityClass.waitForElement(Profile.newCreditExpiryMonthYear);
        Profile.newCreditExpiryMonthYear.sendKeys(ccMonthYear);
        Thread.sleep(1000);
    }

    public static void enterNewCreditCVV(String ccCVV) throws InterruptedException {
        UtilityClass.waitForElement(Profile.newCreditCvvNumber);
        Profile.newCreditCvvNumber.sendKeys(ccCVV);
        Thread.sleep(3000);
    }

    public static void enterNewCreditZip(String ccZip) throws InterruptedException {
        Thread.sleep(3000);
        UtilityClass.waitForElement(Profile.newCreditZipCode);
        Profile.newCreditZipCode.sendKeys(ccZip);
        Thread.sleep(1000);
    }

    public static void enterNewCreditAddress(String ccLocation) throws InterruptedException, AWTException {
        UtilityClass.waitForElement(Profile.newCreditStreetAddress);
        Profile.newCreditStreetAddress.sendKeys(ccLocation);
        Thread.sleep(1000);
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(5000);

    }

    public static void clickNewCreditSaveBtn() throws InterruptedException {
        UtilityClass.waitForElement(Profile.newCreditSaveButton);
        Profile.newCreditSaveButton.click();
        Thread.sleep(1000);
    }

    public static void clickProfileContactEmailWarningMsgOk() throws InterruptedException {
        Thread.sleep(2000);
        UtilityClass.waitForElement(Profile.profileContactEmailWarningMsgOkButton);
        Profile.profileContactEmailWarningMsgOkButton.click();
        Thread.sleep(1000);
    }

    public static void clickingTabForEditPwd() throws InterruptedException, AWTException {
        Thread.sleep(2000);
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
        Thread.sleep(1000);

    }

    public static void submitBtnMouseOverAction() throws InterruptedException {
        Thread.sleep(3500);
        Actions actions = new Actions(driver);
        actions.moveToElement(Profile.profileDetailsSubmitBtn).perform();
        Thread.sleep(2000);
        System.out.println("profile details submit button clicked successfully");

    }

    public static void uploadPic() throws Throwable {
        RobotUtil.upload_Profile_Picture();
        Thread.sleep(7000);
    }

    public static void clickOkOnBusinessProfilePage() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//button[@type='submit'])[4]")).click();
        Thread.sleep(3000);
        System.out.println("Business profile details are saved after clicking submit button");
    }

    public static void enterCreditCardDetails(String ccNo, String ccMonth, String ccCVV, String zipCode) throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@id='card-element']/div/iframe")).click();
        driver.findElement(By.xpath("//div[@id='card-element']/div/iframe")).sendKeys(ccNo, ccMonth, ccCVV, zipCode);
        Thread.sleep(1000);
        System.out.println("CC number is done");

    }

    public static void enterDefaultTestCreditCardDetailsE2E() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@id='card-element']/div/iframe")).click();
        driver.findElement(By.xpath("//div[@id='card-element']/div/iframe")).sendKeys("4111 1111 1111 1111", "10/22", "143", "07306");
        Thread.sleep(1000);
        System.out.println("CC number is done");

    }

    public static void enterStreetAddress(String streetAddress) throws InterruptedException, AWTException {
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@placeholder='Street Address']")).sendKeys(streetAddress);
        Thread.sleep(1000);
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_DOWN);
        Thread.sleep(1500);
    }

    public static void enterDefaultStreetAddressE2E() throws InterruptedException, AWTException {
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@placeholder='Street Address']")).sendKeys("6300 Legacy Drive");
        Thread.sleep(1000);
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_DOWN);
        Thread.sleep(1500);
    }

    public static void enterFullName(String fullName) throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@placeholder='Full Name']")).sendKeys(fullName, Keys.TAB);
        Thread.sleep(1000);
    }

    public static void clickOkOnPaymentProfilePage() throws InterruptedException {
        if (driver.findElement(By.xpath("(//button[@type='submit'])[5]")).equals(true)) {
            System.out.println("Element exists");
        } else {
            System.out.println("Element does not exist");
        }
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//button[@type='submit'])[5]")).click();
        Thread.sleep(3000);
        System.out.println("Payment profile details are saved after clicking submit button");
        Thread.sleep(3000);
    }

    public static void completePaymentProfileE2E() throws InterruptedException, AWTException {
        Thread.sleep(5000);
        System.out.println("Entering cardNumber");
        ProfilePanel.enterDefaultTestCreditCardDetailsE2E();
        System.out.println("Entered Card Number");
        Thread.sleep(3000);
        System.out.println("Entering Street Address");
        ProfilePanel.enterDefaultStreetAddressE2E();
        System.out.println("Entered streetAddress");
        Thread.sleep(3000);
        System.out.println("Entering CC Full Name");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@placeholder='Full Name']")).sendKeys("John Watkins", Keys.TAB);
        System.out.println("Entered fullName");
        Thread.sleep(3000);
        Thread.sleep(5000);
        ProfilePanel.clickOkOnPaymentProfilePage();
    }

    public static void UserProfileCreationE2E() throws InterruptedException {
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Dylan");
        System.out.println("Enter FirstName");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Smith");
        System.out.println("Enter LastName");
        Thread.sleep(1000);

        Thread.sleep(1500);
        String phoneNumber = String.valueOf((long) Math.floor(Math.random() * 9_000_000_000L) + 1_000_000_000L);
        driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys(phoneNumber);
        System.out.println("Enter PhoneNumber");
        Thread.sleep(1000);

        Thread.sleep(5000);
        System.out.println("Clicking on Submit button on Profile page");
        ProfilePanel.clickSubmitBtnProfilePage();
    }

     public static void profileFirstNameSpecialCharacterValidation() throws InterruptedException {
    	        System.out.println("Edit Profile FirstName Passed: "  +	Profile.profileFirstname.getAttribute("value"));
    	        String ValidationMessage = Profile.firstNameSpecialCharacterValidationError.getText();
    	        System.out.println("Validation message displayed for FirstName is " +  ValidationMessage);
    	        Assert.assertEquals("Firstname can only contain alphabets, single quote (\"’\"), hyphen(“-“) and space (\" \") characters", ValidationMessage);
    	        Thread.sleep(3000);
    	        Profile.profileFirstname.clear();
    	    }


    	    public static void profileLastNameSpecialCharacterValidation() throws InterruptedException {
    	        System.out.println("Edit Profile LastName Passed: " + Profile.profileLastname.getAttribute("value"));
    	        String ValidationMessage = Profile.lastNameSpecialCharacterValidationError.getText();
    	        System.out.println("Validation message displayed for LastName is " + ValidationMessage);
    	        Assert.assertEquals("Lastname can only contain alphabets, single quote (\"’\"), hyphen(“-“) and space (\" \") characters", ValidationMessage);
    	        Thread.sleep(3000);
    	        Profile.profileLastname.clear();
    	    }

    	   public static void validateSpecialCharacters() throws InterruptedException, AWTException {
    		   System.out.println("Validating special characters in FirstName field in Edit Profile");
    		   String currentFirstName = Profile.profileFirstname.getAttribute("value");
    		   Profile.profileFirstname.clear();

    		   Profile.profileFirstname.sendKeys("testFN!");
    		        Thread.sleep(2000);
    		        String ValidationMessage = Profile.firstNameSpecialCharacterValidationError.getText();
    		        System.out.println("Validation message displayed for FirstName is "+ ValidationMessage);
    		   ProfilePanel.profileFirstNameSpecialCharacterValidation();

    		   Profile.profileFirstname.sendKeys("test`");
    		   ProfilePanel.profileFirstNameSpecialCharacterValidation();

    	       Profile.profileFirstname.sendKeys("test~");
    	       ProfilePanel.profileFirstNameSpecialCharacterValidation();

    	       Profile.profileFirstname.sendKeys("test@");
    	       ProfilePanel.profileFirstNameSpecialCharacterValidation();

    	       Profile.profileFirstname.sendKeys("test#");
    	       ProfilePanel.profileFirstNameSpecialCharacterValidation();

    	       Profile.profileFirstname.sendKeys("test$");
    	       ProfilePanel.profileFirstNameSpecialCharacterValidation();

    	       Profile.profileFirstname.sendKeys("test%");
    	       ProfilePanel.profileFirstNameSpecialCharacterValidation();

    	       Profile.profileFirstname.sendKeys("test^");
    	       ProfilePanel.profileFirstNameSpecialCharacterValidation();

    	       Profile.profileFirstname.sendKeys("test&");
    	       ProfilePanel.profileFirstNameSpecialCharacterValidation();

    	       Profile.profileFirstname.sendKeys("test*");
    	       ProfilePanel.profileFirstNameSpecialCharacterValidation();

    	       Profile.profileFirstname.sendKeys("test(");
    	       ProfilePanel.profileFirstNameSpecialCharacterValidation();

    	       Profile.profileFirstname.sendKeys("test)");
    	       ProfilePanel.profileFirstNameSpecialCharacterValidation();

    	       Profile.profileFirstname.sendKeys("test=");
    	       ProfilePanel.profileFirstNameSpecialCharacterValidation();

    	       Profile.profileFirstname.sendKeys("test{");
    	       ProfilePanel.profileFirstNameSpecialCharacterValidation();

    	       Profile.profileFirstname.sendKeys("test}");
    	       ProfilePanel.profileFirstNameSpecialCharacterValidation();

    	       Profile.profileFirstname.sendKeys("test[");
    	       ProfilePanel.profileFirstNameSpecialCharacterValidation();

    	       Profile.profileFirstname.sendKeys("test]");
    	       ProfilePanel.profileFirstNameSpecialCharacterValidation();

    	       Profile.profileFirstname.sendKeys("test\"\"");
    	       ProfilePanel.profileFirstNameSpecialCharacterValidation();

    	       Profile.profileFirstname.sendKeys("test;");
    	       ProfilePanel.profileFirstNameSpecialCharacterValidation();

    	       Profile.profileFirstname.sendKeys("test:");
    	       ProfilePanel.profileFirstNameSpecialCharacterValidation();

    	       Profile.profileFirstname.sendKeys("test'\"'");
    	       ProfilePanel.profileFirstNameSpecialCharacterValidation();

    	       Profile.profileFirstname.sendKeys("test<");
    	       ProfilePanel.profileFirstNameSpecialCharacterValidation();

    	       Profile.profileFirstname.sendKeys("test>");
    	       ProfilePanel.profileFirstNameSpecialCharacterValidation();

    	       Profile.profileFirstname.sendKeys("test,");
    	       ProfilePanel.profileFirstNameSpecialCharacterValidation();

    	       Profile.profileFirstname.sendKeys("test.");
    	       ProfilePanel.profileFirstNameSpecialCharacterValidation();

    	       Profile.profileFirstname.sendKeys("test?");
    	       ProfilePanel.profileFirstNameSpecialCharacterValidation();

    	       Profile.profileFirstname.sendKeys("test/");
    	       ProfilePanel.profileFirstNameSpecialCharacterValidation();

    	       Profile.profileFirstname.sendKeys("test0");
    	       ProfilePanel.profileFirstNameSpecialCharacterValidation();

    	       Profile.profileFirstname.sendKeys("test1");
    	       ProfilePanel.profileFirstNameSpecialCharacterValidation();

    	       Profile.profileFirstname.sendKeys("test2");
    	       ProfilePanel.profileFirstNameSpecialCharacterValidation();

    	       Profile.profileFirstname.sendKeys("test3");
    	       ProfilePanel.profileFirstNameSpecialCharacterValidation();

    	       Profile.profileFirstname.sendKeys("test4");
    	       ProfilePanel.profileFirstNameSpecialCharacterValidation();

    	       Profile.profileFirstname.sendKeys("test5");
    	       ProfilePanel.profileFirstNameSpecialCharacterValidation();

    	       Profile.profileFirstname.sendKeys("test6");
    	       ProfilePanel.profileFirstNameSpecialCharacterValidation();

    	       Profile.profileFirstname.sendKeys("test7");
    	       ProfilePanel.profileFirstNameSpecialCharacterValidation();

    	       Profile.profileFirstname.sendKeys("test8");
    	       ProfilePanel.profileFirstNameSpecialCharacterValidation();

    	       Profile.profileFirstname.sendKeys("test9");
    	       ProfilePanel.profileFirstNameSpecialCharacterValidation();

    	       Profile.profileFirstname.sendKeys(currentFirstName);
    	       System.out.println("First Name in Edit Profile Passed: " + Profile.profileFirstname.getAttribute("value"));

    	       System.out.println("Special Character Validation on first name field is now complete");


    		   System.out.println("Validating special characters in LastName field in Edit Profile");
    		   String currentLastName = Profile.profileLastname.getAttribute("value");
    		   Profile.profileLastname.clear();

    		   Profile.profileLastname.sendKeys("testLastN!");
    		   Thread.sleep(2000);
    	        String LastnamespecialValidationMessage = Profile.lastNameSpecialCharacterValidationError.getText();
		        System.out.println("Validation message displayed for LaststName is "+ LastnamespecialValidationMessage);

		        ProfilePanel.profileLastNameSpecialCharacterValidation();

    		   Profile.profileLastname.sendKeys("test`");
    		   ProfilePanel.profileLastNameSpecialCharacterValidation();

    	       Profile.profileLastname.sendKeys("test~");
    	       ProfilePanel.profileLastNameSpecialCharacterValidation();

    	       Profile.profileLastname.sendKeys("test@");
    	       ProfilePanel.profileLastNameSpecialCharacterValidation();

    	       Profile.profileLastname.sendKeys("test#");
    	       ProfilePanel.profileLastNameSpecialCharacterValidation();

    	       Profile.profileLastname.sendKeys("test$");
    	       ProfilePanel.profileLastNameSpecialCharacterValidation();

    	       Profile.profileLastname.sendKeys("test%");
    	       ProfilePanel.profileLastNameSpecialCharacterValidation();

    	       Profile.profileLastname.sendKeys("test^");
    	       ProfilePanel.profileLastNameSpecialCharacterValidation();

    	       Profile.profileLastname.sendKeys("test&");
    	       ProfilePanel.profileLastNameSpecialCharacterValidation();

    	       Profile.profileLastname.sendKeys("test*");
    	       ProfilePanel.profileLastNameSpecialCharacterValidation();

    	       Profile.profileLastname.sendKeys("test(");
    	       ProfilePanel.profileLastNameSpecialCharacterValidation();

    	       Profile.profileLastname.sendKeys("test)");
    	       ProfilePanel.profileLastNameSpecialCharacterValidation();

    	       Profile.profileLastname.sendKeys("test=");
    	       ProfilePanel.profileLastNameSpecialCharacterValidation();

    	       Profile.profileLastname.sendKeys("test{");
    	       ProfilePanel.profileLastNameSpecialCharacterValidation();

    	       Profile.profileLastname.sendKeys("test}");
    	       ProfilePanel.profileLastNameSpecialCharacterValidation();

    	       Profile.profileLastname.sendKeys("test[");
    	       ProfilePanel.profileLastNameSpecialCharacterValidation();

    	       Profile.profileLastname.sendKeys("test]");
    	       ProfilePanel.profileLastNameSpecialCharacterValidation();

    	       Profile.profileLastname.sendKeys("test;");
    	       ProfilePanel.profileLastNameSpecialCharacterValidation();

    	       Profile.profileLastname.sendKeys("test:");
    	       ProfilePanel.profileLastNameSpecialCharacterValidation();

    	       Profile.profileLastname.sendKeys ("test\"\"");
    	       ProfilePanel.profileLastNameSpecialCharacterValidation();

    	       Profile.profileLastname.sendKeys("test'\"'");
    	       ProfilePanel.profileLastNameSpecialCharacterValidation();

    	       Profile.profileLastname.sendKeys("test<");
    	       ProfilePanel.profileLastNameSpecialCharacterValidation();

    	       Profile.profileLastname.sendKeys("test>");
    	       ProfilePanel.profileLastNameSpecialCharacterValidation();

    	       Profile.profileLastname.sendKeys("test,");
    	       ProfilePanel.profileLastNameSpecialCharacterValidation();

    	       Profile.profileLastname.sendKeys("test.");
    	       ProfilePanel.profileLastNameSpecialCharacterValidation();

    	       Profile.profileLastname.sendKeys("test?");
    	       ProfilePanel.profileLastNameSpecialCharacterValidation();

    	       Profile.profileLastname.sendKeys("test/");
    	       ProfilePanel.profileLastNameSpecialCharacterValidation();

    	       Profile.profileLastname.sendKeys("test0");
    	       ProfilePanel.profileLastNameSpecialCharacterValidation();

    	       Profile.profileLastname.sendKeys("test1");
    	       ProfilePanel.profileLastNameSpecialCharacterValidation();

    	       Profile.profileLastname.sendKeys("test2");
    	       ProfilePanel.profileLastNameSpecialCharacterValidation();

    	       Profile.profileLastname.sendKeys("test3");
    	       ProfilePanel.profileLastNameSpecialCharacterValidation();

    	       Profile.profileLastname.sendKeys("test4");
    	       ProfilePanel.profileLastNameSpecialCharacterValidation();

    	       Profile.profileLastname.sendKeys("test5");
    	       ProfilePanel.profileLastNameSpecialCharacterValidation();

    	       Profile.profileLastname.sendKeys("test6");
    	       ProfilePanel.profileLastNameSpecialCharacterValidation();

    	       Profile.profileLastname.sendKeys("test7");
    	       ProfilePanel.profileLastNameSpecialCharacterValidation();

    	       Profile.profileLastname.sendKeys("test8");
    	       ProfilePanel.profileLastNameSpecialCharacterValidation();

    	       Profile.profileLastname.sendKeys("test9");
    	       ProfilePanel.profileLastNameSpecialCharacterValidation();

    	       Profile.profileLastname.sendKeys(currentLastName);
    	       System.out.println("Last Name in Edit Profile Passed: " + Profile.profileLastname.getAttribute("value"));

    	       System.out.println("Special Character Validation on last name field is now complete");
    	   }

    	   public static void validateNonEditableFields() throws InterruptedException {

    		   if(Profile.editProfileEmail.isEnabled()) {
    			   System.out.println("Email field is enabled");
    		   }
    		   else {
    			   System.out.println("Email field is not enabled");
    		   }

    	   }

    	   public static void validateBlankValues() throws InterruptedException {
   		      UtilityClass.waitForElement(Profile.profileFirstname);
    		  Profile.profileFirstname.clear();
    		  Profile.profileFirstname.sendKeys(" ");
    		  Thread.sleep(2000);
    		  Profile.profileFirstname.sendKeys(Keys.TAB);
    		  Thread.sleep(4000);
    		  String ValidationMessage = Profile.profileFirstNameBlankValidationError.getText();
    		  System.out.println("Validation message displayed is " + ValidationMessage);
    		  Assert.assertEquals("First Name is required.", ValidationMessage);

    		  UtilityClass.waitForElement(Profile.profileLastname);
    		  Profile.profileLastname.clear();
    		  Profile.profileLastname.sendKeys(" ");
    		  Thread.sleep(2000);
    		  Profile.profileLastname.sendKeys(Keys.TAB);
    		  Thread.sleep(4000);
    		  String lastnameblankValidationMessage = Profile.profileLastNameBlankValidationError.getText();
    		  System.out.println("Validation message displayed is " + lastnameblankValidationMessage);
    		  Assert.assertEquals("Last Name is required.", lastnameblankValidationMessage);

    		  ///////// Will enable this code once the defect "EWORX-5740" is fixed. /////////////
//    		  UtilityClass.waitForElement(Profile.editProfileMobileNo);
//    		   Profile.editProfileMobileNo.sendKeys(Keys.CONTROL, "A");
//     		  Profile.editProfileMobileNo.sendKeys(Keys.CONTROL, "X");
//    		  Profile.editProfileMobileNo.clear();
//    		  //Profile.editProfileMobileNo.sendKeys(" ");
//    		  Profile.editProfileMobileNo.sendKeys(Keys.CLEAR);
//    		  Profile.editProfileMobileNo.sendKeys(Keys.TAB);
//    		  Thread.sleep(2000);
//    		   Profile.editProfileMobileNo.sendKeys(Keys.TAB);
//    		  Thread.sleep(2000);
//    		  String PhoneNumberblankValidationMessage = Profile.PhoneNumberBlankValidationError.getText();
//    		  System.out.println("Validation message displayed is " + PhoneNumberblankValidationMessage);
//    		  Assert.assertEquals("Phone Number is required.", PhoneNumberblankValidationMessage);


    	   }

    	   public static void validateInvalidLength() throws InterruptedException {
    		   UtilityClass.waitForElement(Profile.editProfileFirstName);
    		   String invaliddata=("abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz");
    		   Profile.editProfileFirstName.clear();
    		   Profile.editProfileFirstName.sendKeys(invaliddata);
    	       Thread.sleep(3000);
    	       Profile.editProfileFirstName.sendKeys(Keys.TAB);
    	       String ValidationMessage = Profile.profileFirstNameLengthValidationError.getText();
    	       System.out.println("FirstName length validation message displayed is " + ValidationMessage);
    	       Assert.assertEquals("Maximum character length 50.", ValidationMessage);


    	       UtilityClass.waitForElement(Profile.profileLastname);
    		   String lastnameinvaliddata=("abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz");
    		   Profile.profileLastname.clear();
    		   Profile.profileLastname.sendKeys(lastnameinvaliddata);
    	       Thread.sleep(3000);
    	       Profile.profileLastname.sendKeys(Keys.TAB);
    	       String lastnameValidationMessage = Profile.profileLastNameLengthValidationError.getText();
    	       System.out.println("LastName length validation message displayed is " + lastnameValidationMessage);
    	       Assert.assertEquals("Maximum character length 50.", lastnameValidationMessage);
    	   }

    	   public static void profilePhoneSpecialCharacterValidation() throws InterruptedException {
    		   UtilityClass.waitForElement(Profile.editProfileMobileNo);
    	       System.out.println("Profile Phone Passed: " + Profile.editProfileMobileNo.getAttribute("value"));
    	       String PhoneValidationMessage = Profile.profilePhoneNoWarningMsg.getText();
    	       System.out.println("Validation message displayed is "+  PhoneValidationMessage);
    	       Assert.assertEquals("Invalid Phone Number (max: 10 digits).", PhoneValidationMessage);
    	       Thread.sleep(3000);
    	       Profile.editProfileMobileNo.clear();
    	   }

    	   public static void validateAllElementsExistence() throws InterruptedException {

    	   System.out.println("All Labels are being verified");
           Assert.assertTrue(Profile.labelFirstName.isDisplayed());
           Assert.assertTrue(Profile.labelLastName.isDisplayed());
           Assert.assertTrue(Profile.labelPhone.isDisplayed());
           Assert.assertTrue(Profile.labelEmail.isDisplayed());
           Assert.assertTrue(Profile.labelProfilePicture.isDisplayed());
           Assert.assertTrue(Profile.labelLastLoginTime.isDisplayed());

           Thread.sleep(2000);
           System.out.println("All Text boxes and page elements are being displayed");
           Assert.assertTrue(Profile.profileFirstname.isDisplayed());
           Assert.assertTrue(Profile.profileLastname.isDisplayed());
           Assert.assertTrue(Profile.editProfileMobileNo.isDisplayed());
           Assert.assertTrue(Profile.editProfilePicturePointer.isDisplayed());
           Assert.assertTrue(Profile.deleteProfilePicIcon.isDisplayed());

           Thread.sleep(2000);
           System.out.println("Page elements Enabled or Disabled on Edit Profile");
           Assert.assertTrue(Profile.profileFirstname.isEnabled());
           Assert.assertTrue(Profile.profileLastname.isEnabled());
           Assert.assertTrue(Profile.editProfileMobileNo.isEnabled());

    	   }


    	   public static void validateInvalidPhoneNumber() throws InterruptedException {
    		   UtilityClass.waitForElement(Profile.editProfileMobileNo);

    	       String profilePhoneNumber = Profile.editProfileMobileNo.getAttribute("value");
    	       Profile.editProfileMobileNo.clear();
    	       Profile.editProfileMobileNo.sendKeys("201900789! ");
    	       Thread.sleep(4000);
    	       ProfilePanel.profilePhoneSpecialCharacterValidation();

    	       Profile.editProfileMobileNo.sendKeys("2019007898`");
    	       ProfilePanel.profilePhoneSpecialCharacterValidation();

    	       Profile.editProfileMobileNo.sendKeys("2019007898~");
    	       ProfilePanel.profilePhoneSpecialCharacterValidation();

    	       Profile.editProfileMobileNo.sendKeys("2019007898@");
    	       ProfilePanel.profilePhoneSpecialCharacterValidation();

    	       Profile.editProfileMobileNo.sendKeys("2019007898#");
    	       ProfilePanel.profilePhoneSpecialCharacterValidation();

    	       Profile.editProfileMobileNo.sendKeys("2019007898$");
    	       ProfilePanel.profilePhoneSpecialCharacterValidation();

    	       Profile.editProfileMobileNo.sendKeys("2019007898%");
    	       ProfilePanel.profilePhoneSpecialCharacterValidation();

    	       Profile.editProfileMobileNo.sendKeys("2019007898^");
    	       ProfilePanel.profilePhoneSpecialCharacterValidation();

    	       Profile.editProfileMobileNo.sendKeys("2019007898&");
    	       ProfilePanel.profilePhoneSpecialCharacterValidation();

    	       Profile.editProfileMobileNo.sendKeys("2019007898*");
    	       ProfilePanel.profilePhoneSpecialCharacterValidation();

    	       Profile.editProfileMobileNo.sendKeys("2019007898(");
    	       ProfilePanel.profilePhoneSpecialCharacterValidation();

    	       Profile.editProfileMobileNo.sendKeys("2019007898)");
    	       ProfilePanel.profilePhoneSpecialCharacterValidation();

//    	       Profile.editProfileMobileNo.sendKeys("2019007898-");
//    	       ProfilePanel.profilePhoneSpecialCharacterValidation();

    	       Profile.editProfileMobileNo.sendKeys("2019007898_");
    	       ProfilePanel.profilePhoneSpecialCharacterValidation();

    	       Profile.editProfileMobileNo.sendKeys("201900789888");
    	       ProfilePanel.profilePhoneSpecialCharacterValidation();

    	       Profile.editProfileMobileNo.sendKeys("2019007898=");
    	       ProfilePanel.profilePhoneSpecialCharacterValidation();

    	       Profile.editProfileMobileNo.sendKeys("2019007898{");
    	       ProfilePanel.profilePhoneSpecialCharacterValidation();

    	       Profile.editProfileMobileNo.sendKeys("2019007898}");
    	       ProfilePanel.profilePhoneSpecialCharacterValidation();

    	       Profile.editProfileMobileNo.sendKeys("2019007898[");
    	       ProfilePanel.profilePhoneSpecialCharacterValidation();

    	       Profile.editProfileMobileNo.sendKeys("2019007898]");
    	       ProfilePanel.profilePhoneSpecialCharacterValidation();

    	       Profile.editProfileMobileNo.sendKeys("2019007898'\'");
    	       ProfilePanel.profilePhoneSpecialCharacterValidation();

    	       Profile.editProfileMobileNo.sendKeys("2019007898;");
    	       ProfilePanel.profilePhoneSpecialCharacterValidation();

    	       Profile.editProfileMobileNo.sendKeys("2019007898:");
    	       ProfilePanel.profilePhoneSpecialCharacterValidation();

    	       Profile.editProfileMobileNo.sendKeys("2019007898<");
    	       ProfilePanel.profilePhoneSpecialCharacterValidation();

    	       Profile.editProfileMobileNo.sendKeys("2019007898>");
    	       ProfilePanel.profilePhoneSpecialCharacterValidation();

    	       Profile.editProfileMobileNo.sendKeys("2019007898,");
    	       ProfilePanel.profilePhoneSpecialCharacterValidation();

    	       Profile.editProfileMobileNo.sendKeys("2019007898.");
    	       ProfilePanel.profilePhoneSpecialCharacterValidation();

    	       Profile.editProfileMobileNo.sendKeys("2019007898?");
    	       ProfilePanel.profilePhoneSpecialCharacterValidation();

    	       Profile.editProfileMobileNo.sendKeys("2019007898/");
    	       ProfilePanel.profilePhoneSpecialCharacterValidation();

    	       Profile.editProfileMobileNo.sendKeys("201900789a");
    	       ProfilePanel.profilePhoneSpecialCharacterValidation();

    	       Profile.editProfileMobileNo.sendKeys("201900789b");
    	       ProfilePanel.profilePhoneSpecialCharacterValidation();

    	       Profile.editProfileMobileNo.sendKeys("201900789c");
    	       ProfilePanel.profilePhoneSpecialCharacterValidation();

    	       Profile.editProfileMobileNo.sendKeys("201900789d");
    	       ProfilePanel.profilePhoneSpecialCharacterValidation();

    	       Profile.editProfileMobileNo.sendKeys("201900789e");
    	       ProfilePanel.profilePhoneSpecialCharacterValidation();

    	       Profile.editProfileMobileNo.sendKeys("201900789f");
    	       ProfilePanel.profilePhoneSpecialCharacterValidation();

    	       Profile.editProfileMobileNo.sendKeys("201900789g");
    	       ProfilePanel.profilePhoneSpecialCharacterValidation();

    	       Profile.editProfileMobileNo.sendKeys("201900789h");
    	       ProfilePanel.profilePhoneSpecialCharacterValidation();

    	       Profile.editProfileMobileNo.sendKeys("201900789i");
    	       ProfilePanel.profilePhoneSpecialCharacterValidation();

    	       Profile.editProfileMobileNo.sendKeys("201900789j");
    	       ProfilePanel.profilePhoneSpecialCharacterValidation();

    	       Profile.editProfileMobileNo.sendKeys("201900789k");
    	       ProfilePanel.profilePhoneSpecialCharacterValidation();

    	       Profile.editProfileMobileNo.sendKeys("201900789l");
    	       ProfilePanel.profilePhoneSpecialCharacterValidation();

    	       Profile.editProfileMobileNo.sendKeys("201900789m");
    	       ProfilePanel.profilePhoneSpecialCharacterValidation();

    	       Profile.editProfileMobileNo.sendKeys("201900789n");
    	       ProfilePanel.profilePhoneSpecialCharacterValidation();

    	       Profile.editProfileMobileNo.sendKeys("201900789o");
    	       ProfilePanel.profilePhoneSpecialCharacterValidation();

    	       Profile.editProfileMobileNo.sendKeys("201900789p");
    	       ProfilePanel.profilePhoneSpecialCharacterValidation();

    	       Profile.editProfileMobileNo.sendKeys("201900789q");
    	       ProfilePanel.profilePhoneSpecialCharacterValidation();

    	       Profile.editProfileMobileNo.sendKeys("201900789r");
    	       ProfilePanel.profilePhoneSpecialCharacterValidation();

    	       Profile.editProfileMobileNo.sendKeys("201900789s");
    	       ProfilePanel.profilePhoneSpecialCharacterValidation();

    	       Profile.editProfileMobileNo.sendKeys("201900789t");
    	       ProfilePanel.profilePhoneSpecialCharacterValidation();

    	       Profile.editProfileMobileNo.sendKeys("201900789u");
    	       ProfilePanel.profilePhoneSpecialCharacterValidation();

    	       Profile.editProfileMobileNo.sendKeys("201900789v");
    	       ProfilePanel.profilePhoneSpecialCharacterValidation();

    	       Profile.editProfileMobileNo.sendKeys("201900789w");
    	       ProfilePanel.profilePhoneSpecialCharacterValidation();

    	       Profile.editProfileMobileNo.sendKeys("201900789x");
    	       ProfilePanel.profilePhoneSpecialCharacterValidation();

    	       Profile.editProfileMobileNo.sendKeys("201900789y");
    	       ProfilePanel.profilePhoneSpecialCharacterValidation();

    	       Profile.editProfileMobileNo.sendKeys("201900789z");
    	       ProfilePanel.profilePhoneSpecialCharacterValidation();

    	       Profile.editProfileMobileNo.sendKeys(profilePhoneNumber);
    	       System.out.println("Contact Phone Passed: " + Profile.editProfileMobileNo.getAttribute("value"));

    	       System.out.println("Special Character Validation on Contact Phone field is now complete");
    	   }



}
