package PagePanel;

import Pages.BusinessInfo;
import Pages.PA_Login;
import Resource.BaseClass;
import Resource.RobotUtil;
import Resource.UtilityClass;
import gherkin.lexer.Th;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;
import sun.rmi.runtime.Log;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.Random;
import java.util.Set;


public class BusinessInfoPanel extends BaseClass {
    BusinessInfo businessInfo = new BusinessInfo();

    public BusinessInfoPanel() {
        businessInfo = PageFactory.initElements(driver, BusinessInfo.class);
    }

    public static void clickBusinessInfoMenu() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[text()='Business Info']")).click();
        Thread.sleep(3000);
    }

    public static void enterNameForBusinessDetails(String businessname, String contactName) throws InterruptedException {
        Thread.sleep(1500);
        UtilityClass.waitForElement(BusinessInfo.businessNameTextBox);
        BusinessInfo.businessNameTextBox.clear();
        BusinessInfo.businessNameTextBox.sendKeys(businessname);
        Thread.sleep(1000);

        UtilityClass.waitForElement(BusinessInfo.contactNameTextBox);
        BusinessInfo.contactNameTextBox.clear();
        BusinessInfo.contactNameTextBox.sendKeys(contactName);
        Thread.sleep(1000);
        System.out.println("Entered contactName");

    }

    public static void selectBusinessDomain(String businessDomain) throws InterruptedException {
        Thread.sleep(5000);
        System.out.println("Selecting Business Domain");
        driver.findElement(By.xpath("//div[@id='domainName-select']//button[1]")).click();
    }

    public static void enterEmailPhoneDetails() throws Throwable {
        Thread.sleep(2000);
        String phoneNumber = String.valueOf((long) Math.floor(Math.random() * 9_000_000_000L) + 1_000_000_000L);
        driver.findElement(By.xpath("(//label[text()='Contact Phone: ']/following::input)[1]")).clear();
        driver.findElement(By.xpath("(//label[text()='Contact Phone: ']/following::input)[1]")).sendKeys(phoneNumber);

        Thread.sleep(1000);
        String emailTxt = UtilityClass.readEmailId();
        driver.findElement(By.xpath("(//label[text()='Contact Email: ']/following::input)[1]")).clear();
        driver.findElement(By.xpath("(//label[text()='Contact Email: ']/following::input)[1]")).sendKeys(emailTxt);
        Thread.sleep(1000);
    }


    public static void validateDomainNameDropDown() {
        boolean currentState = driver.findElement(By.xpath("//div[@id='domainName-select']//button[1]")).isEnabled();
        if (currentState) {
            System.out.println("Domain name is drop down");
        } else {
            System.out.println("Domain name is not a drop down");
        }
    }

    public static void disabledSaveButton() {
        boolean currentState = driver.findElement(By.xpath("(//button[@type='button']/following-sibling::button)[1]")).isEnabled();
        if (!currentState) {
            System.out.println("Save button is disabled");
        } else {
            System.out.println("Save button is enabled");
        }
    }

    public static void updateCountryCode() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement((By.xpath("//a[@type='button']"))).click();
        driver.findElement((By.xpath("html[1]/body[1]/div[3]/div[1]/a[81]"))).click();
        Thread.sleep(2000);

        String phoneNumber = String.valueOf((long) Math.floor(Math.random() * 9_000_000_000L) + 1_000_000_000L);
        driver.findElement(By.xpath("(//label[text()='Contact Phone: ']/following::input)[1]")).clear();
        driver.findElement(By.xpath("(//label[text()='Contact Phone: ']/following::input)[1]")).sendKeys(phoneNumber);

        BusinessInfo.editBusinessInfoSaveButton.click();
        Thread.sleep(2000);

        System.out.println("Country code updated along with phone number");

        driver.findElement((By.xpath("//a[@type='button']"))).click();
        driver.findElement((By.xpath("html[1]/body[1]/div[3]/div[1]/a[184]"))).click();
        Thread.sleep(2000);

        phoneNumber = String.valueOf((long) Math.floor(Math.random() * 9_000_000_000L) + 1_000_000_000L);
        driver.findElement(By.xpath("(//label[text()='Contact Phone: ']/following::input)[1]")).clear();
        driver.findElement(By.xpath("(//label[text()='Contact Phone: ']/following::input)[1]")).sendKeys(phoneNumber);

        BusinessInfo.editBusinessInfoSaveButton.click();
        Thread.sleep(2000);

        System.out.println("Country code set back to USA along with phone number");
    }

    public static void businessInfoMandatoryFieldAsteriskValidation(String field, String fields) throws InterruptedException {
        Thread.sleep(3000);
        String temp = driver.findElement(By.xpath(fields)).getText();
        if (field.equals(temp)) {
            System.out.println(field);
        } else
            System.out.println("ERROR");
        driver.close();
    }


    public static void userEmptiesAllFieldsOfBusinessInfo() throws InterruptedException {
        BusinessInfo.businessNameTextBox.sendKeys(Keys.CONTROL, "A");
        BusinessInfo.businessNameTextBox.sendKeys(Keys.CONTROL, "X");
        BusinessInfo.businessNameTextBox.sendKeys(Keys.TAB);
        BusinessInfo.contactNameTextBox.sendKeys(Keys.CONTROL, "A");
        BusinessInfo.contactNameTextBox.sendKeys(Keys.CONTROL, "X");
        BusinessInfo.contactNameTextBox.sendKeys(Keys.TAB);
        BusinessInfo.contactNameTextBox.sendKeys(Keys.TAB);
        BusinessInfo.contactPhoneTextBox.sendKeys(Keys.CONTROL, "A");
        BusinessInfo.contactPhoneTextBox.sendKeys(Keys.CONTROL, "X");
        BusinessInfo.contactPhoneTextBox.sendKeys(Keys.TAB);
        BusinessInfo.contactEmailTextBox.sendKeys(Keys.CONTROL, "A");
        BusinessInfo.contactEmailTextBox.sendKeys(Keys.CONTROL, "X");
        BusinessInfo.contactEmailTextBox.sendKeys(Keys.TAB);
        BusinessInfo.contactEmailTextBox.sendKeys(Keys.TAB);
        BusinessInfo.contactEmailTextBox.sendKeys(Keys.TAB);
        BusinessInfo.contactEmailTextBox.sendKeys(Keys.TAB);
        BusinessInfo.addressLine1TextBox.sendKeys(Keys.CONTROL, "A");
        BusinessInfo.addressLine1TextBox.sendKeys(Keys.CONTROL, "X");
        BusinessInfo.addressLine1TextBox.sendKeys(Keys.TAB);
//        EWORX-5556
//        BusinessInfo.zipCodeTextBox.sendKeys(Keys.CONTROL, "A");
//        BusinessInfo.zipCodeTextBox.sendKeys(Keys.CONTROL, "X");
//        BusinessInfo.zipCodeTextBox.sendKeys(Keys.TAB);
        Thread.sleep(5000);
    }

    public static void requiredFieldValidationMessageIsDisplayedOnBusinessInfo() {
        String ValidationMessage = BusinessInfo.businessNameRequiredError.getText();
        System.out.println("Validation message displayed is " + ValidationMessage);
        Assert.assertEquals("Business name is required", ValidationMessage);
        ValidationMessage = BusinessInfo.contactNameRequiredError.getText();
        System.out.println("Validation message displayed is " + ValidationMessage);
        Assert.assertEquals("Contact Name is required", ValidationMessage);
        ValidationMessage = BusinessInfo.contactPhoneRequiredError.getText();
        System.out.println("Validation message displayed is " + ValidationMessage);
        Assert.assertEquals("Contact Phone is required", ValidationMessage);
        ValidationMessage = BusinessInfo.contactEmailRequiredError.getText();
        System.out.println("Validation message displayed is " + ValidationMessage);
        Assert.assertEquals("Contact Email is required", ValidationMessage);
        ValidationMessage = BusinessInfo.addressLine1RequiredError.getText();
        System.out.println("Validation message displayed is " + ValidationMessage);
        Assert.assertEquals("Street Address is required", ValidationMessage);

    }

    public static void userEntersAllFieldsOfBusinessInfoWithInvalidLength() throws InterruptedException {
        BusinessInfo.businessNameTextBox.clear();
        BusinessInfo.businessNameTextBox.sendKeys("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        BusinessInfo.businessNameTextBox.sendKeys(Keys.TAB);
        Thread.sleep(3000);
        BusinessInfo.contactNameTextBox.clear();
        BusinessInfo.contactNameTextBox.sendKeys("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        Thread.sleep(3000);
        BusinessInfo.contactPhoneTextBox.clear();
        BusinessInfo.contactPhoneTextBox.sendKeys("123456789098");
        Thread.sleep(3000);
        BusinessInfo.contactEmailTextBox.clear();
        BusinessInfo.contactEmailTextBox.sendKeys("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        BusinessInfo.zipCodeTextBox.clear();
        BusinessInfo.zipCodeTextBox.sendKeys("123456");
        BusinessInfo.addressLine1TextBox.clear();
        BusinessInfo.addressLine1TextBox.sendKeys("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        Thread.sleep(3000);
        BusinessInfo.addressLine2TextBox.clear();
        BusinessInfo.addressLine2TextBox.sendKeys("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        Thread.sleep(3000);
    }
    


    public static void validateAllElementsPresenceOnEditBusinessInfo() throws InterruptedException {
        Assert.assertTrue(BusinessInfo.businessInfoTitle.isDisplayed());
        String title = BusinessInfo.businessInfoTitle.getText();
        System.out.println("Title of the Page is Displayed     " + title);

        Thread.sleep(5000);
        System.out.println("Business Info Label Validation" + BusinessInfo.businessNameLabel.isDisplayed());
        Assert.assertTrue(BusinessInfo.businessDomainLabel.isDisplayed());
        Assert.assertTrue(BusinessInfo.contactNameLabel.isDisplayed());
        Assert.assertTrue(BusinessInfo.contactPhoneLabel.isDisplayed());
        Assert.assertTrue(BusinessInfo.contactEmailLabel.isDisplayed());
        Assert.assertTrue(BusinessInfo.businessLogoLabel.isDisplayed());
        Assert.assertTrue(BusinessInfo.businessLogoImage.isDisplayed());
        Assert.assertTrue(BusinessInfo.addressLine1Label.isDisplayed());
        Assert.assertTrue(BusinessInfo.addressLine2Label.isDisplayed());
        Assert.assertTrue(BusinessInfo.cityLabel.isDisplayed());
        Assert.assertTrue(BusinessInfo.stateLabel.isDisplayed());
        Assert.assertTrue(BusinessInfo.zipCodeLabel.isDisplayed());

        System.out.println("Business Info TextBox/Logo Validation");
        Assert.assertTrue(BusinessInfo.businessNameTextBox.isDisplayed());
        Assert.assertTrue(BusinessInfo.businessDomainDropDown.isDisplayed());
        Assert.assertTrue(BusinessInfo.contactNameTextBox.isDisplayed());
        Assert.assertTrue(BusinessInfo.countryCodeHyperlink.isDisplayed());
        Assert.assertTrue(BusinessInfo.contactPhoneTextBox.isDisplayed());
        Assert.assertTrue(BusinessInfo.contactEmailTextBox.isDisplayed());
        Assert.assertTrue(BusinessInfo.addressLine1TextBox.isDisplayed());
        Assert.assertTrue(BusinessInfo.addressLine2TextBox.isDisplayed());

        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement Country = driver.findElement(By.xpath("//label[@class='required'][contains(text(),'Country: ')]"));
        js.executeScript("arguments[0].scrollIntoView();", Country);

        Assert.assertTrue(BusinessInfo.zipCodeTextBox.isDisplayed());
        Assert.assertTrue(BusinessInfo.countryTextBox.isDisplayed());
        Assert.assertTrue(BusinessInfo.editBusinessInfoCancelButton.isDisplayed());
        Assert.assertFalse(BusinessInfo.editBusinessInfoSaveButton.isEnabled());
        WebElement googleLogo = BusinessInfo.googleLogo;
        js.executeScript("arguments[0].scrollIntoView();", googleLogo);
        Assert.assertTrue(BusinessInfo.googleLogo.isDisplayed());

        System.out.println("Business Info Asterisk Validation");
        Assert.assertTrue(BusinessInfo.businessNameAsterisk.isDisplayed());
        Assert.assertTrue(BusinessInfo.businessDomainAsterisk.isDisplayed());
        Assert.assertTrue(BusinessInfo.contactNameAsterisk.isDisplayed());
        WebElement contactPhoneAsterisk = BusinessInfo.contactPhoneAsterisk;
        js.executeScript("arguments[0].scrollIntoView();", contactPhoneAsterisk);
        Assert.assertTrue(BusinessInfo.contactPhoneAsterisk.isDisplayed());
        Assert.assertTrue(BusinessInfo.contactEmailAsterisk.isDisplayed());
        Assert.assertTrue(BusinessInfo.addressLine1Asterisk.isDisplayed());
        WebElement cityAsterisk = BusinessInfo.cityAsterisk;
        js.executeScript("arguments[0].scrollIntoView();", cityAsterisk);
        Assert.assertTrue(BusinessInfo.cityAsterisk.isDisplayed());
        Assert.assertTrue(BusinessInfo.stateAsterisk.isDisplayed());
        Assert.assertTrue(BusinessInfo.zipCodeAsterisk.isDisplayed());
        js.executeScript("arguments[0].scrollIntoView();", BusinessInfo.countryAsterisk);
        Assert.assertTrue(BusinessInfo.countryAsterisk.isDisplayed());

        Assert.assertTrue(BusinessInfo.privacyLegalOnFooter.isDisplayed());

        System.out.println("All elements are displayed");
    }

    public static void validateAllElementsPresenceOnEditSspBusinessInfo() {
        Assert.assertTrue(BusinessInfo.businessInfoTitle.isDisplayed());
        String title = BusinessInfo.businessInfoTitle.getText();
        System.out.println("Title of the Page is Displayed" + title);

        System.out.println("Business Info Label Validation");
        Assert.assertTrue(BusinessInfo.businessDomainLabel.isDisplayed());
        Assert.assertTrue(BusinessInfo.contactNameLabel.isDisplayed());
        Assert.assertTrue(BusinessInfo.contactPhoneLabel.isDisplayed());
        Assert.assertTrue(BusinessInfo.contactEmailLabel.isDisplayed());
        Assert.assertTrue(BusinessInfo.addressLine1Label.isDisplayed());
        Assert.assertTrue(BusinessInfo.addressLine2Label.isDisplayed());
        Assert.assertTrue(BusinessInfo.cityLabel.isDisplayed());
        Assert.assertTrue(BusinessInfo.stateLabel.isDisplayed());
        Assert.assertTrue(BusinessInfo.zipCodeLabel.isDisplayed());

        System.out.println("Business Info TextBox/Logo Validation");
        Assert.assertTrue(BusinessInfo.businessDomainDropDown.isDisplayed());
        Assert.assertTrue(BusinessInfo.contactNameTextBox.isDisplayed());
        Assert.assertTrue(BusinessInfo.countryCodeHyperlink.isDisplayed());
        Assert.assertTrue(BusinessInfo.contactPhoneTextBox.isDisplayed());
        Assert.assertTrue(BusinessInfo.contactEmailTextBox.isDisplayed());
        Assert.assertTrue(BusinessInfo.addressLine1TextBox.isDisplayed());
        Assert.assertTrue(BusinessInfo.addressLine2TextBox.isDisplayed());

        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement Country = driver.findElement(By.xpath("//label[@class='required'][contains(text(),'Country: ')]"));
        js.executeScript("arguments[0].scrollIntoView();", Country);

        Assert.assertTrue(BusinessInfo.zipCodeTextBox.isDisplayed());
        Assert.assertTrue(BusinessInfo.countryTextBox.isDisplayed());
        Assert.assertTrue(BusinessInfo.editBusinessInfoCancelButton.isDisplayed());
        Assert.assertFalse(BusinessInfo.editBusinessInfoSaveButton.isEnabled());

        System.out.println("Business Info Asterisk Validation");
        Assert.assertTrue(BusinessInfo.companyNameAsterisk.isDisplayed());
        Assert.assertTrue(BusinessInfo.businessDomainAsterisk.isDisplayed());
        Assert.assertTrue(BusinessInfo.contactNameAsterisk.isDisplayed());
        WebElement contactPhoneAsterisk = BusinessInfo.contactPhoneAsterisk;
        js.executeScript("arguments[0].scrollIntoView();", contactPhoneAsterisk);
        Assert.assertTrue(BusinessInfo.contactPhoneAsterisk.isDisplayed());
        Assert.assertTrue(BusinessInfo.contactEmailAsterisk.isDisplayed());
        Assert.assertTrue(BusinessInfo.addressLine1Asterisk.isDisplayed());
        WebElement cityAsterisk = BusinessInfo.cityAsterisk;
        js.executeScript("arguments[0].scrollIntoView();", cityAsterisk);
        Assert.assertTrue(BusinessInfo.cityAsterisk.isDisplayed());
        Assert.assertTrue(BusinessInfo.stateAsterisk.isDisplayed());
        Assert.assertTrue(BusinessInfo.zipCodeAsterisk.isDisplayed());
        js.executeScript("arguments[0].scrollIntoView();", BusinessInfo.countryAsterisk);
        Assert.assertTrue(BusinessInfo.countryAsterisk.isDisplayed());

        Assert.assertTrue(BusinessInfo.privacyLegalOnFooter.isDisplayed());

        System.out.println("All elements are displayed");
    }

    public static void validateTabFunctionalityOnEditBusinessInfo() throws AWTException, InterruptedException {
        driver.findElement(By.xpath("//input[@class='ng-untouched ng-pristine ng-valid'][@placeholder='Business Name']")).click();
        Robot robot = new Robot();
        for (int i = 0; i <= 9; i++) {
            robot.keyPress(KeyEvent.VK_TAB);
            Thread.sleep(2000);
        }
        String currentPosition = driver.switchTo().activeElement().getText();
        if (currentPosition.equals("Cancel")) {
            System.out.println("Tab Functionality Passed    " + currentPosition);
        } else {
            System.out.println("Tab Functionality Failed");
            driver.close();
        }
    }

    public static void validateTabFunctionalityOnEditSspBusinessInfo() throws AWTException, InterruptedException {
        BusinessInfo.contactNameTextBox.click();
        Robot robot = new Robot();
        for (int i = 0; i <= 7; i++) {
            robot.keyPress(KeyEvent.VK_TAB);
            Thread.sleep(2000);
        }
        String currentPosition = driver.switchTo().activeElement().getText();
        if (currentPosition.equals("Cancel")) {
            System.out.println("Tab Functionality Passed    " + currentPosition);
        } else {
            System.out.println("Tab Functionality Failed");
            driver.close();
        }
    }

    public static void requiredFieldValidationOnEditBusinessInfo() throws InterruptedException {
        BusinessInfo.businessNameTextBox.sendKeys(Keys.CONTROL, "A");
        BusinessInfo.businessNameTextBox.sendKeys(Keys.CONTROL, "X");
        BusinessInfo.businessNameTextBox.sendKeys(Keys.TAB);
        Thread.sleep(2000);
        String ValidationMessage = BusinessInfo.businessNameRequiredError.getText();
        System.out.println("Validation message displayed is " + ValidationMessage);
        Assert.assertEquals("Business name is required", ValidationMessage);

        BusinessInfo.contactNameTextBox.sendKeys(Keys.CONTROL, "A");
        BusinessInfo.contactNameTextBox.sendKeys(Keys.CONTROL, "X");
        BusinessInfo.contactNameTextBox.sendKeys(Keys.TAB);
        Thread.sleep(2000);
        ValidationMessage = BusinessInfo.contactNameRequiredError.getText();
        System.out.println("Validation message displayed is " + ValidationMessage);
        Assert.assertEquals("Contact Name is required", ValidationMessage);

        BusinessInfo.contactPhoneTextBox.sendKeys(Keys.CONTROL, "A");
        BusinessInfo.contactPhoneTextBox.sendKeys(Keys.CONTROL, "X");
        BusinessInfo.contactPhoneTextBox.sendKeys(Keys.TAB);
        Thread.sleep(2000);
        ValidationMessage = BusinessInfo.contactPhoneRequiredError.getText();
        System.out.println("Validation message displayed is " + ValidationMessage);
        Assert.assertEquals("Contact Phone is required", ValidationMessage);

        BusinessInfo.contactEmailTextBox.sendKeys(Keys.CONTROL, "A");
        BusinessInfo.contactEmailTextBox.sendKeys(Keys.CONTROL, "X");
        BusinessInfo.contactEmailTextBox.sendKeys(Keys.TAB);
        Thread.sleep(2000);
        ValidationMessage = BusinessInfo.contactEmailRequiredError.getText();
        System.out.println("Validation message displayed is " + ValidationMessage);
        Assert.assertEquals("Contact Email is required", ValidationMessage);

        BusinessInfo.addressLine1TextBox.sendKeys(Keys.CONTROL, "A");
        BusinessInfo.addressLine1TextBox.sendKeys(Keys.CONTROL, "X");
        BusinessInfo.addressLine1TextBox.sendKeys(Keys.TAB);
        ValidationMessage = BusinessInfo.addressLine1RequiredError.getText();
        System.out.println("Validation message displayed is " + ValidationMessage);
        Assert.assertEquals("Street Address is required", ValidationMessage);

        //        EWORX-5556
        BusinessInfo.zipCodeTextBox.sendKeys(Keys.CONTROL, "A");
        BusinessInfo.zipCodeTextBox.sendKeys(Keys.CONTROL, "X");
        BusinessInfo.zipCodeTextBox.sendKeys(Keys.TAB);
        Thread.sleep(5000);
    }

    public static void requiredFieldValidationOnEditSspBusinessInfo() throws InterruptedException {
        BusinessInfo.contactNameTextBox.sendKeys(Keys.CONTROL, "A");
        BusinessInfo.contactNameTextBox.sendKeys(Keys.CONTROL, "X");
        BusinessInfo.contactNameTextBox.sendKeys(Keys.TAB);
        Thread.sleep(2000);
        String ValidationMessage = BusinessInfo.contactNameRequiredError.getText();
        System.out.println("Validation message displayed is " + ValidationMessage);
        Assert.assertEquals("Contact Name is required", ValidationMessage);

        BusinessInfo.contactPhoneTextBox.sendKeys(Keys.CONTROL, "A");
        BusinessInfo.contactPhoneTextBox.sendKeys(Keys.CONTROL, "X");
        BusinessInfo.contactPhoneTextBox.sendKeys(Keys.TAB);
        Thread.sleep(2000);
        ValidationMessage = BusinessInfo.contactPhoneRequiredError.getText();
        System.out.println("Validation message displayed is " + ValidationMessage);
        Assert.assertEquals("Contact Phone is required", ValidationMessage);

        BusinessInfo.contactEmailTextBox.sendKeys(Keys.CONTROL, "A");
        BusinessInfo.contactEmailTextBox.sendKeys(Keys.CONTROL, "X");
        BusinessInfo.contactEmailTextBox.sendKeys(Keys.TAB);
        Thread.sleep(2000);
        ValidationMessage = BusinessInfo.contactEmailRequiredError.getText();
        System.out.println("Validation message displayed is " + ValidationMessage);
        Assert.assertEquals("Contact Email is required", ValidationMessage);


        BusinessInfo.addressLine1TextBox.sendKeys(Keys.CONTROL, "A");
        BusinessInfo.addressLine1TextBox.sendKeys(Keys.CONTROL, "X");
        BusinessInfo.addressLine1TextBox.sendKeys(Keys.TAB);
        ValidationMessage = BusinessInfo.addressLine1RequiredError.getText();
        System.out.println("Validation message displayed is " + ValidationMessage);
        Assert.assertEquals("Street Address is required", ValidationMessage);

        //        EWORX-5556
        //        BusinessInfo.zipCodeTextBox.sendKeys(Keys.CONTROL, "A");
        //        BusinessInfo.zipCodeTextBox.sendKeys(Keys.CONTROL, "X");
        //        BusinessInfo.zipCodeTextBox.sendKeys(Keys.TAB);
        Thread.sleep(5000);

    }

    public static void invalidLengthValidationOnEditBusinessInfo() throws InterruptedException {
        BusinessInfo.businessNameTextBox.clear();
        BusinessInfo.businessNameTextBox.sendKeys("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        BusinessInfo.businessNameTextBox.sendKeys(Keys.TAB);
        Thread.sleep(3000);
        String ValidationMessage = BusinessInfo.businessNameLengthValidationError.getText();
        System.out.println("Validation message displayed is " + ValidationMessage);
        Assert.assertEquals("Business name must be no more than 50 characters.", ValidationMessage);

        BusinessInfo.contactNameTextBox.clear();
        BusinessInfo.contactNameTextBox.sendKeys("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        Thread.sleep(3000);
        ValidationMessage = BusinessInfo.contactNameLengthValidationError.getText();
        System.out.println("Validation message displayed is " + ValidationMessage);
        Assert.assertEquals("Contact Name must be no more than 50 characters.", ValidationMessage);

        BusinessInfo.contactPhoneTextBox.clear();
        BusinessInfo.contactPhoneTextBox.sendKeys("123456789098");
        Thread.sleep(3000);
        System.out.println("This text is displayed " + (BusinessInfo.contactPhoneLengthValidationError.isDisplayed()));
        ValidationMessage = BusinessInfo.contactPhoneLengthValidationError.getText();
        System.out.println("Validation message displayed is " + ValidationMessage);
        Assert.assertTrue(ValidationMessage.contains("Invalid Contact Phone(max: 10 digits))"));

        BusinessInfo.contactEmailTextBox.clear();
        BusinessInfo.contactEmailTextBox.sendKeys("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        Thread.sleep(3000);
        ValidationMessage = BusinessInfo.contactEmailLengthValidationError.getText();
        System.out.println("Displayed or not " + (BusinessInfo.contactEmailLengthValidationError.isDisplayed()));
        System.out.println("Validation message displayed is " + ValidationMessage);
        Assert.assertTrue(ValidationMessage.contains("Invalid Email Id"));
        Assert.assertTrue(ValidationMessage.contains("Allowed Special Characters:"));
        Assert.assertTrue(ValidationMessage.contains("Before @ symbol are '._-'"));
        Assert.assertTrue(ValidationMessage.contains("After @ symbol are '.-'"));
        Assert.assertTrue(ValidationMessage.contains("Min length 5 Max length 60"));

        BusinessInfo.zipCodeTextBox.clear();
        BusinessInfo.zipCodeTextBox.sendKeys("123456");
        Thread.sleep(3000);
        ValidationMessage = BusinessInfo.zipCodeError.getText();
        System.out.println("Validation message displayed is " + ValidationMessage);
        Assert.assertEquals("Zip Code cannot contain any special character.", ValidationMessage);

        BusinessInfo.addressLine1TextBox.clear();
        BusinessInfo.addressLine1TextBox.sendKeys("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        Thread.sleep(3000);
        ValidationMessage = BusinessInfo.addressLine1LengthValidationError.getText();
        System.out.println("Validation message displayed is " + ValidationMessage);
        Assert.assertEquals("Street Address must be no more than 90 characters.", ValidationMessage);

        BusinessInfo.addressLine2TextBox.clear();
        BusinessInfo.addressLine2TextBox.sendKeys("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        Thread.sleep(3000);
        ValidationMessage = BusinessInfo.addressLine2LengthValidationError.getText();
        System.out.println("Validation message displayed is " + ValidationMessage);
        Assert.assertEquals("Street Address must be no more than 30 characters.", ValidationMessage);
    }

    public static void invalidLengthValidationOnEditSspBusinessInfo() throws InterruptedException {
        BusinessInfo.contactNameTextBox.sendKeys("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        BusinessInfo.contactNameTextBox.sendKeys(Keys.TAB);
        Thread.sleep(3000);
        String ValidationMessage = BusinessInfo.contactNameLengthValidationError.getText();
        System.out.println("Validation message displayed is " + ValidationMessage);
        Assert.assertEquals("Contact Name must be no more than 50 characters.", ValidationMessage);

//        BusinessInfo.contactPhoneTextBox.clear();
//        BusinessInfo.contactPhoneTextBox.sendKeys("123456789098");
//        Thread.sleep(3000);
//        System.out.println("This text is displayed " + (BusinessInfo.contactPhoneLengthValidationError.isDisplayed()));
//        ValidationMessage = BusinessInfo.contactPhoneLengthValidationError.getText();
//        System.out.println("Validation message displayed is " + ValidationMessage);
//        Assert.assertEquals("Invalid Contact Phone(max: 10 digits)", ValidationMessage);
//
//        BusinessInfo.contactEmailTextBox.clear();
//        BusinessInfo.contactEmailTextBox.sendKeys("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
//        Thread.sleep(3000);
//        ValidationMessage = BusinessInfo.contactEmailLengthValidationError.getText();
//        System.out.println("Displayed or not " + (BusinessInfo.contactEmailLengthValidationError.isDisplayed()));
//        System.out.println("Validation message displayed is " + ValidationMessage);
//        Assert.assertTrue(ValidationMessage.contains("Invalid Email Id"));
//        Assert.assertTrue(ValidationMessage.contains("Allowed Special Characters:"));
//        Assert.assertTrue(ValidationMessage.contains("Before @ symbol are '._-'"));
//        Assert.assertTrue(ValidationMessage.contains("After @ symbol are '.-'"));
//        Assert.assertTrue(ValidationMessage.contains("Min length 5 Max length 60"));

        BusinessInfo.zipCodeTextBox.clear();
        BusinessInfo.zipCodeTextBox.sendKeys("123456");
        Thread.sleep(3000);
        ValidationMessage = BusinessInfo.zipCodeError.getText();
        System.out.println("Validation message displayed is " + ValidationMessage);
        Assert.assertEquals("Zip Code cannot contain any special character.", ValidationMessage);

        BusinessInfo.addressLine1TextBox.clear();
        BusinessInfo.addressLine1TextBox.sendKeys("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        Thread.sleep(3000);
        ValidationMessage = BusinessInfo.addressLine1LengthValidationError.getText();
        System.out.println("Validation message displayed is " + ValidationMessage);
        Assert.assertEquals("Street Address must be no more than 90 characters.", ValidationMessage);

        BusinessInfo.addressLine2TextBox.clear();
        BusinessInfo.addressLine2TextBox.sendKeys("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        Thread.sleep(3000);
        ValidationMessage = BusinessInfo.addressLine2LengthValidationError.getText();
        System.out.println("Validation message displayed is " + ValidationMessage);
        Assert.assertEquals("Street Address must be no more than 30 characters.", ValidationMessage);
    }

    public static void cancelUndoneChangesOnEditBusinessInfo() throws InterruptedException {
        System.out.println("Updating Business Info");

        String businessName = BusinessInfo.businessNameTextBox.getAttribute("value");
        BusinessInfo.businessNameTextBox.sendKeys("Random BusinessName");
        String contactName = BusinessInfo.contactNameTextBox.getAttribute("value");
        BusinessInfo.contactNameTextBox.sendKeys("Dr Jose-Mose's");
        String contactPhone = BusinessInfo.contactPhoneTextBox.getAttribute("value");
        String phoneNumber = String.valueOf((long) Math.floor(Math.random() * 2_010_000_000L) + 1_000_000_000L);
        BusinessInfo.contactPhoneTextBox.sendKeys(phoneNumber);
        String contactEmail = BusinessInfo.contactEmailTextBox.getAttribute("value");
        BusinessInfo.contactEmailTextBox.sendKeys("automationtestaccount" + ((long) Math.floor(Math.random() * 9_000_0L) + 1_000_0L) + "@yopmail.com");
        String postalcode = BusinessInfo.zipCodeTextBox.getAttribute("value");
        String zipCode = String.valueOf((long) Math.floor(Math.random() * 2_000_0L) + 1_000_0L);
        BusinessInfo.zipCodeTextBox.sendKeys(zipCode);
        String streetAddressLine1 = BusinessInfo.addressLine1TextBox.getAttribute("value");
        BusinessInfo.addressLine1TextBox.sendKeys(+((long) Math.floor(Math.random() * 90L) + 100L) + " Applerock Dr");
        String streetAddressLine2 = BusinessInfo.addressLine2TextBox.getAttribute("value");
        BusinessInfo.addressLine2TextBox.sendKeys(+((long) Math.floor(Math.random() * 900L) + 1000L) + " Street");
        Thread.sleep(5000);

        System.out.println("Clicking on Cancel button");
        driver.findElement(By.xpath("//button[text()='Cancel']")).click();
        Thread.sleep(5000);

        String businessName1 = BusinessInfo.businessNameTextBox.getAttribute("value");
        String contactName1 = BusinessInfo.contactNameTextBox.getAttribute("value");
        String contactPhone1 = BusinessInfo.contactPhoneTextBox.getAttribute("value");
        String contactEmail1 = BusinessInfo.contactEmailTextBox.getAttribute("value");
        String postalcode1 = BusinessInfo.zipCodeTextBox.getAttribute("value");
        String addressLine1 = BusinessInfo.addressLine1TextBox.getAttribute("value");
        String addressLine2 = BusinessInfo.addressLine2TextBox.getAttribute("value");

        System.out.println("Comparing data before changes and after clicking on Cancel");
        Assert.assertEquals(businessName, businessName1);
        Assert.assertEquals(contactName, contactName1);
        Assert.assertEquals(contactPhone, contactPhone1);
        Assert.assertEquals(contactEmail, contactEmail1);
        Assert.assertEquals(postalcode, postalcode1);
        Assert.assertEquals(streetAddressLine1, addressLine1);
        Assert.assertEquals(streetAddressLine2, addressLine2);

        System.out.println("All changes are Undone");
    }

    public static void cancelUndoneChangesOnEditSspBusinessInfo() throws InterruptedException {
        System.out.println("Updating Business Info");

        String contactName = BusinessInfo.contactNameTextBox.getAttribute("value");
        BusinessInfo.contactNameTextBox.sendKeys("Dr Jose-Mose's");
        String contactPhone = BusinessInfo.contactPhoneTextBox.getAttribute("value");
        String phoneNumber = String.valueOf((long) Math.floor(Math.random() * 2_010_000_000L) + 1_000_000_000L);
        BusinessInfo.contactPhoneTextBox.sendKeys(phoneNumber);
        String contactEmail = BusinessInfo.contactEmailTextBox.getAttribute("value");
        BusinessInfo.contactEmailTextBox.sendKeys("automationtestaccount" + ((long) Math.floor(Math.random() * 9_000_0L) + 1_000_0L) + "@yopmail.com");
        String postalcode = BusinessInfo.zipCodeTextBox.getAttribute("value");
        String zipCode = String.valueOf((long) Math.floor(Math.random() * 2_000_0L) + 1_000_0L);
        BusinessInfo.zipCodeTextBox.sendKeys(zipCode);
        String streetAddressLine1 = BusinessInfo.addressLine1TextBox.getAttribute("value");
        BusinessInfo.addressLine1TextBox.sendKeys(+((long) Math.floor(Math.random() * 90L) + 100L) + " Applerock Dr");
        String streetAddressLine2 = BusinessInfo.addressLine2TextBox.getAttribute("value");
        BusinessInfo.addressLine2TextBox.sendKeys(+((long) Math.floor(Math.random() * 900L) + 1000L) + " Street");

        Thread.sleep(5000);
        System.out.println("Clicking on Cancel button");
        driver.findElement(By.xpath("//button[text()='Cancel']")).click();
        Thread.sleep(5000);

        String contactName1 = BusinessInfo.contactNameTextBox.getAttribute("value");
        String contactPhone1 = BusinessInfo.contactPhoneTextBox.getAttribute("value");
        String contactEmail1 = BusinessInfo.contactEmailTextBox.getAttribute("value");
        String postalcode1 = BusinessInfo.zipCodeTextBox.getAttribute("value");
        String addressLine1 = BusinessInfo.addressLine1TextBox.getAttribute("value");
        String addressLine2 = BusinessInfo.addressLine2TextBox.getAttribute("value");

        System.out.println("Comparing data before changes and after clicking on Cancel");
        Assert.assertEquals(contactName, contactName1);
        Assert.assertEquals(contactPhone, contactPhone1);
        Assert.assertEquals(contactEmail, contactEmail1);
        Assert.assertEquals(postalcode, postalcode1);
        Assert.assertEquals(streetAddressLine1, addressLine1);
        Assert.assertEquals(streetAddressLine2, addressLine2);

        System.out.println("All changes are Undone");
    }

    public static void updateContactNumberOnEditBusinessInfo() throws InterruptedException {
        BusinessInfo.contactPhoneTextBox.clear();
        BusinessInfo.contactPhoneTextBox.sendKeys("2");
        BusinessInfo.editBusinessInfoSaveButton.click();
        String contactNumber = BusinessInfo.contactPhoneTextBox.getAttribute("value");
        System.out.println("Contact Phone is updated with 1 digit " + contactNumber);
        Thread.sleep(5000);
        BusinessInfoPanel.updateBusinessInfoNotificationValidation();

        BusinessInfo.contactPhoneTextBox.clear();
        BusinessInfo.contactPhoneTextBox.sendKeys("85");
        BusinessInfo.editBusinessInfoSaveButton.click();
        contactNumber = BusinessInfo.contactPhoneTextBox.getAttribute("value");
        System.out.println("Contact Phone is updated with 2 digits " + contactNumber);
        Thread.sleep(5000);
        BusinessInfoPanel.updateBusinessInfoNotificationValidation();

        BusinessInfo.contactPhoneTextBox.clear();
        BusinessInfo.contactPhoneTextBox.sendKeys("850");
        BusinessInfo.editBusinessInfoSaveButton.click();
        contactNumber = BusinessInfo.contactPhoneTextBox.getAttribute("value");
        System.out.println("Contact Phone is updated with 3 digits " + contactNumber);
        Thread.sleep(5000);
        BusinessInfoPanel.updateBusinessInfoNotificationValidation();

        BusinessInfo.contactPhoneTextBox.clear();
        BusinessInfo.contactPhoneTextBox.sendKeys("8501");
        BusinessInfo.editBusinessInfoSaveButton.click();
        contactNumber = BusinessInfo.contactPhoneTextBox.getAttribute("value");
        System.out.println("Contact Phone is updated with 4 digits " + contactNumber);
        Thread.sleep(5000);
        BusinessInfoPanel.updateBusinessInfoNotificationValidation();

        BusinessInfo.contactPhoneTextBox.clear();
        BusinessInfo.contactPhoneTextBox.sendKeys("85012");
        BusinessInfo.editBusinessInfoSaveButton.click();
        contactNumber = BusinessInfo.contactPhoneTextBox.getAttribute("value");
        System.out.println("Contact Phone is updated with 5 digits " + contactNumber);
        Thread.sleep(5000);
        BusinessInfoPanel.updateBusinessInfoNotificationValidation();

        BusinessInfo.contactPhoneTextBox.clear();
        BusinessInfo.contactPhoneTextBox.sendKeys("850123");
        BusinessInfo.editBusinessInfoSaveButton.click();
        contactNumber = BusinessInfo.contactPhoneTextBox.getAttribute("value");
        System.out.println("Contact Phone is updated with 6 digits " + contactNumber);
        Thread.sleep(5000);
        BusinessInfoPanel.updateBusinessInfoNotificationValidation();

        BusinessInfo.contactPhoneTextBox.clear();
        BusinessInfo.contactPhoneTextBox.sendKeys("8501323");
        BusinessInfo.editBusinessInfoSaveButton.click();
        contactNumber = BusinessInfo.contactPhoneTextBox.getAttribute("value");
        System.out.println("Contact Phone is updated with 7 digits " + contactNumber);
        Thread.sleep(5000);
        BusinessInfoPanel.updateBusinessInfoNotificationValidation();

        BusinessInfo.contactPhoneTextBox.clear();
        BusinessInfo.contactPhoneTextBox.sendKeys("85013234");
        BusinessInfo.editBusinessInfoSaveButton.click();
        contactNumber = BusinessInfo.contactPhoneTextBox.getAttribute("value");
        System.out.println("Contact Phone is updated with 8 digits " + contactNumber);
        Thread.sleep(5000);
        BusinessInfoPanel.updateBusinessInfoNotificationValidation();

        BusinessInfo.contactPhoneTextBox.clear();
        BusinessInfo.contactPhoneTextBox.sendKeys("850132345");
        BusinessInfo.editBusinessInfoSaveButton.click();
        contactNumber = BusinessInfo.contactPhoneTextBox.getAttribute("value");
        System.out.println("Contact Phone is updated with 9 digits " + contactNumber);
        Thread.sleep(5000);
        BusinessInfoPanel.updateBusinessInfoNotificationValidation();

        BusinessInfo.contactPhoneTextBox.clear();
        BusinessInfo.contactPhoneTextBox.sendKeys("8501323454");
        BusinessInfo.editBusinessInfoSaveButton.click();
        contactNumber = BusinessInfo.contactPhoneTextBox.getAttribute("value");
        System.out.println("Contact Phone is updated with 10 digits " + contactNumber);
        Thread.sleep(5000);
        BusinessInfoPanel.updateBusinessInfoNotificationValidation();
    }


    public static void validateEmailWithBusinessInfoUpdates(String email) throws InterruptedException {
        System.out.println("Opening a new tab");
        Thread.sleep(2000);
        String currentHandle = driver.getWindowHandle();

        Thread.sleep(3000);
        // open a new window
        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("window.open()");

        String otpValue1 = "";
        // getting all the handles currently availabe
        Set<String> handles = driver.getWindowHandles();
        for (String actual : handles) {

            if (!actual.equalsIgnoreCase(currentHandle)) {
                // switching to the opened tab
                driver.switchTo().window(actual);
                driver.get("http://www.yopmail.com");
                driver.manage().deleteAllCookies();
                Thread.sleep(5000);
                System.out.println(driver.getTitle());
                UtilityClass.waitForElement(PA_Login.yopEmailTxtBox);
                PA_Login.yopEmailTxtBox.clear();
                PA_Login.yopEmailTxtBox.sendKeys(email);

                UtilityClass.waitForElement(PA_Login.checkYopInboxBtn);
                PA_Login.checkYopInboxBtn.click();

                Thread.sleep(5000);

                driver.switchTo().frame("ifmail");
                String emailTitle = driver.findElement(By.xpath("//div[text()='Your Wireless Office account information has changed']")).getText();
                System.out.println(emailTitle);
                Assert.assertTrue(emailTitle.contains("Your Wireless Office account information has changed"));

                String emailText = driver.findElement(By.xpath("//div[@id='mail']/div[1]")).getText();
                System.out.println(emailText);
                Assert.assertTrue(emailText.contains("This email confirms that a change was made to your Wireless Office account information, which may include your business name, contact information, and other details."));
                Assert.assertTrue(emailText.contains("If you did not make this change, or if you believe an unauthorized person made this change, please reset your password immediately and review your account information at this link"));
                Assert.assertTrue(emailText.contains("If you need assistance, please contact your IT Help Desk."));
                Assert.assertTrue(emailText.contains("Ericsson Wireless Office"));

                driver.close();
            }
        }
        driver.switchTo().window(currentHandle);
    }


    public static String generatingRandomString() {

        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 20;
        Random random = new Random();
        StringBuilder buffer = new StringBuilder(targetStringLength);
        for (int i = 0; i < targetStringLength; i++) {
            int randomLimitedInt = leftLimit + (int)
                    (random.nextFloat() * (rightLimit - leftLimit + 1));
            buffer.append((char) randomLimitedInt);
        }
        String generatedString = buffer.toString();
        return generatedString;
    }

    public static void updateBusinessInfoNotificationValidation() {
        String notification;
        notification = BusinessInfo.successMessageNotification.getText();
        System.out.println("notification says " + notification);
        Assert.assertTrue(BusinessInfo.successMessageNotification.isDisplayed());
        Assert.assertTrue(notification.contains("Business Info has been successfully updated."));
    }

    public static void validateBusinessInfoUpdateAndEmailNotification(String customer, String email) throws InterruptedException {
        //        Update Business Name
        if (customer.equals("Onboarded")) {
            System.out.println("Customer is Self Service Portal Customer");
            String businessName = BusinessInfo.businessNameTextBox.getAttribute("value");
            BusinessInfo.businessNameTextBox.clear();
            BusinessInfo.businessNameTextBox.sendKeys(BusinessInfoPanel.generatingRandomString());
            BusinessInfo.editBusinessInfoSaveButton.click();
            System.out.println("Business Name is updated");
            Thread.sleep(5000);
            BusinessInfoPanel.validateEmailWithBusinessInfoUpdates(email);
            System.out.println("Email notification is validated after Business Name is updated");

            BusinessInfo.businessNameTextBox.clear();
            BusinessInfo.businessNameTextBox.sendKeys("Automation Test Account");
            BusinessInfo.editBusinessInfoSaveButton.click();
            System.out.println("Business Name is updated to " + businessName);
            Thread.sleep(5000);
        } else {
            System.out.println("Customer is Self Service Portal Customer");
        }

        //        Update Contact Name
        String contatName = BusinessInfo.contactNameTextBox.getAttribute("value");
        BusinessInfo.contactNameTextBox.sendKeys(BusinessInfoPanel.generatingRandomString());
        BusinessInfo.editBusinessInfoSaveButton.click();
        System.out.println("Contact Name is updated ");
        BusinessInfoPanel.validateEmailWithBusinessInfoUpdates(email);
        Thread.sleep(5000);
        System.out.println("Email notification is validated after Contact Name is updated");

        BusinessInfo.contactNameTextBox.clear();
        BusinessInfo.contactNameTextBox.sendKeys(contatName);
        BusinessInfo.editBusinessInfoSaveButton.click();
        System.out.println("Contact Name is updated to " + contatName);
        Thread.sleep(3000);

        //        Update Contact Phone
        driver.findElement((By.xpath("//a[@type='button']"))).click();
        Thread.sleep(3000);
        driver.findElement(By.linkText("India (91)")).click();

        BusinessInfo.contactPhoneTextBox.clear();
        String phoneNumber = String.valueOf((long) Math.floor(Math.random() * 2_010_000_000L) + 1_000_000_000L);
        BusinessInfo.contactPhoneTextBox.sendKeys(phoneNumber);
        Thread.sleep(5000);
        BusinessInfo.editBusinessInfoSaveButton.click();
        System.out.println("Contact Phone is updated to " + phoneNumber);
        Thread.sleep(5000);
        BusinessInfoPanel.validateEmailWithBusinessInfoUpdates(email);
        System.out.println("Email notification is validated after Contact Phone is updated");

        //        //        Update Contact Email
        //        BusinessInfo.contactEmailTextBox.clear();
        //        BusinessInfo.contactEmailTextBox.sendKeys("automationtestaccount" + ((long) Math.floor(Math.random() * 9_000_0L) + 1_000_0L) + "@yopmail.com");
        //        BusinessInfo.editBusinessInfoSaveButton.click();
        //        System.out.println("Contact Email is updated");
        //        BusinessInfoPanel.validateEmailWithBusinessInfoUpdates(email);
        //        System.out.println("Email notification is validated after Contact Email is updated");


        //        Update Zip Code
        BusinessInfo.zipCodeTextBox.clear();
        String zipCode = String.valueOf((long) Math.floor(Math.random() * 2_000_0L) + 1_000_0L);
        BusinessInfo.zipCodeTextBox.sendKeys(zipCode);
        BusinessInfo.editBusinessInfoSaveButton.click();
        System.out.println("Zip code is updated to " + zipCode);
        Thread.sleep(5000);
        BusinessInfoPanel.validateEmailWithBusinessInfoUpdates(email);
        System.out.println("Email notification is validated after Zip Code is updated");

        //        Update Address Line 1
        BusinessInfo.addressLine1TextBox.clear();
        BusinessInfo.addressLine1TextBox.sendKeys(+((long) Math.floor(Math.random() * 90L) + 100L) + " Applerock Dr");
        Thread.sleep(3000);
        BusinessInfo.addressLine1TextBox.sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(5000);
        BusinessInfo.addressLine1TextBox.sendKeys(Keys.ENTER);
        Thread.sleep(5000);
        BusinessInfo.editBusinessInfoSaveButton.click();
        Thread.sleep(3000);
        System.out.println("Address Line 1 is updated");
        BusinessInfoPanel.validateEmailWithBusinessInfoUpdates(email);
        System.out.println("Email notification is validated after Address Line 1 is updated");

        //        Update Address Line 2
        BusinessInfo.addressLine2TextBox.clear();
        BusinessInfo.addressLine2TextBox.sendKeys(+((long) Math.floor(Math.random() * 900L) + 1000L) + " Street");
        BusinessInfo.editBusinessInfoSaveButton.click();
        System.out.println("Address Line 2 is updated");
        Thread.sleep(3000);
        BusinessInfoPanel.validateEmailWithBusinessInfoUpdates(email);
        System.out.println("Email notification is validated after Address Line 2 is updated");
    }

    public static void specialCharacterValidationOnEditBusinessInfo(String customer) throws InterruptedException {
        if (customer.equals("Onboarded")) {
            System.out.println("Customer is Onboarded");
            System.out.println("Customer performing special character validation on Business Name field");
            String currentBusinessName = BusinessInfo.businessNameTextBox.getAttribute("value");
            BusinessInfo.businessNameTextBox.clear();
            BusinessInfo.businessNameTextBox.sendKeys("test!");
            BusinessInfoPanel.businessNameSpecialCharacterValidation();

            BusinessInfo.businessNameTextBox.sendKeys("test`");
            BusinessInfoPanel.businessNameSpecialCharacterValidation();

            BusinessInfo.businessNameTextBox.sendKeys("test~");
            BusinessInfoPanel.businessNameSpecialCharacterValidation();

            BusinessInfo.businessNameTextBox.sendKeys("test@");
            BusinessInfoPanel.businessNameSpecialCharacterValidation();

            BusinessInfo.businessNameTextBox.sendKeys("test#");
            BusinessInfoPanel.businessNameSpecialCharacterValidation();

            BusinessInfo.businessNameTextBox.sendKeys("test$");
            BusinessInfoPanel.businessNameSpecialCharacterValidation();

            BusinessInfo.businessNameTextBox.sendKeys("test%");
            BusinessInfoPanel.businessNameSpecialCharacterValidation();

            BusinessInfo.businessNameTextBox.sendKeys("test^");
            BusinessInfoPanel.businessNameSpecialCharacterValidation();

            BusinessInfo.businessNameTextBox.sendKeys("test&");
            BusinessInfoPanel.businessNameSpecialCharacterValidation();

            BusinessInfo.businessNameTextBox.sendKeys("test*");
            BusinessInfoPanel.businessNameSpecialCharacterValidation();

            BusinessInfo.businessNameTextBox.sendKeys("test(");
            BusinessInfoPanel.businessNameSpecialCharacterValidation();

            BusinessInfo.businessNameTextBox.sendKeys("test)");
            BusinessInfoPanel.businessNameSpecialCharacterValidation();

            BusinessInfo.businessNameTextBox.sendKeys("test-");
            BusinessInfoPanel.businessNameSpecialCharacterValidation();

            BusinessInfo.businessNameTextBox.sendKeys("test_");
            BusinessInfoPanel.businessNameSpecialCharacterValidation();

            BusinessInfo.businessNameTextBox.sendKeys("test+");
            BusinessInfoPanel.businessNameSpecialCharacterValidation();

            BusinessInfo.businessNameTextBox.sendKeys("test-");
            BusinessInfoPanel.businessNameSpecialCharacterValidation();

            BusinessInfo.businessNameTextBox.sendKeys("test=");
            BusinessInfoPanel.businessNameSpecialCharacterValidation();

            BusinessInfo.businessNameTextBox.sendKeys("test{");
            BusinessInfoPanel.businessNameSpecialCharacterValidation();

            BusinessInfo.businessNameTextBox.sendKeys("test}");
            BusinessInfoPanel.businessNameSpecialCharacterValidation();

            BusinessInfo.businessNameTextBox.sendKeys("test[");
            BusinessInfoPanel.businessNameSpecialCharacterValidation();

            BusinessInfo.businessNameTextBox.sendKeys("test]");
            BusinessInfoPanel.businessNameSpecialCharacterValidation();

            BusinessInfo.businessNameTextBox.sendKeys("test'\'");
            BusinessInfoPanel.businessNameSpecialCharacterValidation();

            BusinessInfo.businessNameTextBox.sendKeys("test;");
            BusinessInfoPanel.businessNameSpecialCharacterValidation();

            BusinessInfo.businessNameTextBox.sendKeys("test:");
            BusinessInfoPanel.businessNameSpecialCharacterValidation();

            BusinessInfo.businessNameTextBox.sendKeys("test'");
            BusinessInfoPanel.businessNameSpecialCharacterValidation();

            BusinessInfo.businessNameTextBox.sendKeys("test'\"'");
            BusinessInfoPanel.businessNameSpecialCharacterValidation();

            BusinessInfo.businessNameTextBox.sendKeys("test<");
            BusinessInfoPanel.businessNameSpecialCharacterValidation();

            BusinessInfo.businessNameTextBox.sendKeys("test>");
            BusinessInfoPanel.businessNameSpecialCharacterValidation();

            BusinessInfo.businessNameTextBox.sendKeys("test,");
            BusinessInfoPanel.businessNameSpecialCharacterValidation();

            BusinessInfo.businessNameTextBox.sendKeys("test.");
            BusinessInfoPanel.businessNameSpecialCharacterValidation();

            BusinessInfo.businessNameTextBox.sendKeys("test?");
            BusinessInfoPanel.businessNameSpecialCharacterValidation();

            BusinessInfo.businessNameTextBox.sendKeys("test/");
            BusinessInfoPanel.businessNameSpecialCharacterValidation();

            BusinessInfo.businessNameTextBox.sendKeys("test0");
            BusinessInfoPanel.businessNameSpecialCharacterValidation();

            BusinessInfo.businessNameTextBox.sendKeys("test1");
            BusinessInfoPanel.businessNameSpecialCharacterValidation();

            BusinessInfo.businessNameTextBox.sendKeys("test2");
            BusinessInfoPanel.businessNameSpecialCharacterValidation();

            BusinessInfo.businessNameTextBox.sendKeys("test3");
            BusinessInfoPanel.businessNameSpecialCharacterValidation();

            BusinessInfo.businessNameTextBox.sendKeys("test4");
            BusinessInfoPanel.businessNameSpecialCharacterValidation();

            BusinessInfo.businessNameTextBox.sendKeys("test5");
            BusinessInfoPanel.businessNameSpecialCharacterValidation();

            BusinessInfo.businessNameTextBox.sendKeys("test6");
            BusinessInfoPanel.businessNameSpecialCharacterValidation();

            BusinessInfo.businessNameTextBox.sendKeys("test7");
            BusinessInfoPanel.businessNameSpecialCharacterValidation();

            BusinessInfo.businessNameTextBox.sendKeys("test8");
            BusinessInfoPanel.businessNameSpecialCharacterValidation();

            BusinessInfo.businessNameTextBox.sendKeys("test9");
            BusinessInfoPanel.businessNameSpecialCharacterValidation();

            BusinessInfo.businessNameTextBox.sendKeys(currentBusinessName);
            System.out.println("Business Name Passed: " + BusinessInfo.businessNameTextBox.getAttribute("value"));

            System.out.println("Special Character Validation on Business Name field is now complete");

        } else {
            System.out.println("Customer is Self Service");
        }

        System.out.println("Customer performing special character validation on Contact Name field");
        String currentContactName = BusinessInfo.contactNameTextBox.getAttribute("value");
        BusinessInfo.contactNameTextBox.clear();
        BusinessInfo.contactNameTextBox.sendKeys("test!");
        BusinessInfoPanel.contactNameSpecialCharacterValidation();

        BusinessInfo.contactNameTextBox.sendKeys("test`");
        BusinessInfoPanel.contactNameSpecialCharacterValidation();

        BusinessInfo.contactNameTextBox.sendKeys("test~");
        BusinessInfoPanel.contactNameSpecialCharacterValidation();

        BusinessInfo.contactNameTextBox.sendKeys("test@");
        BusinessInfoPanel.contactNameSpecialCharacterValidation();

        BusinessInfo.contactNameTextBox.sendKeys("test#");
        BusinessInfoPanel.contactNameSpecialCharacterValidation();

        BusinessInfo.contactNameTextBox.sendKeys("test$");
        BusinessInfoPanel.contactNameSpecialCharacterValidation();

        BusinessInfo.contactNameTextBox.sendKeys("test%");
        BusinessInfoPanel.contactNameSpecialCharacterValidation();

        BusinessInfo.contactNameTextBox.sendKeys("test^");
        BusinessInfoPanel.contactNameSpecialCharacterValidation();

        BusinessInfo.contactNameTextBox.sendKeys("test&");
        BusinessInfoPanel.contactNameSpecialCharacterValidation();

        BusinessInfo.contactNameTextBox.sendKeys("test*");
        BusinessInfoPanel.contactNameSpecialCharacterValidation();

        BusinessInfo.contactNameTextBox.sendKeys("test(");
        BusinessInfoPanel.contactNameSpecialCharacterValidation();

        BusinessInfo.contactNameTextBox.sendKeys("test)");
        BusinessInfoPanel.contactNameSpecialCharacterValidation();

        BusinessInfo.contactNameTextBox.sendKeys("test_");
        BusinessInfoPanel.contactNameSpecialCharacterValidation();

        BusinessInfo.contactNameTextBox.sendKeys("test+");
        BusinessInfoPanel.contactNameSpecialCharacterValidation();

        BusinessInfo.contactNameTextBox.sendKeys("test=");
        BusinessInfoPanel.contactNameSpecialCharacterValidation();

        BusinessInfo.contactNameTextBox.sendKeys("test{");
        BusinessInfoPanel.contactNameSpecialCharacterValidation();

        BusinessInfo.contactNameTextBox.sendKeys("test}");
        BusinessInfoPanel.contactNameSpecialCharacterValidation();

        BusinessInfo.contactNameTextBox.sendKeys("test[");
        BusinessInfoPanel.contactNameSpecialCharacterValidation();

        BusinessInfo.contactNameTextBox.sendKeys("test]");
        BusinessInfoPanel.contactNameSpecialCharacterValidation();

        BusinessInfo.contactNameTextBox.sendKeys("test;");
        BusinessInfoPanel.contactNameSpecialCharacterValidation();

        BusinessInfo.contactNameTextBox.sendKeys("test:");
        BusinessInfoPanel.contactNameSpecialCharacterValidation();

        BusinessInfo.contactNameTextBox.sendKeys("test<");
        BusinessInfoPanel.contactNameSpecialCharacterValidation();

        BusinessInfo.contactNameTextBox.sendKeys("test>");
        BusinessInfoPanel.contactNameSpecialCharacterValidation();

        BusinessInfo.contactNameTextBox.sendKeys("test,");
        BusinessInfoPanel.contactNameSpecialCharacterValidation();

        BusinessInfo.contactNameTextBox.sendKeys("test.");
        BusinessInfoPanel.contactNameSpecialCharacterValidation();

        BusinessInfo.contactNameTextBox.sendKeys("test?");
        BusinessInfoPanel.contactNameSpecialCharacterValidation();

        BusinessInfo.contactNameTextBox.sendKeys("test/");
        BusinessInfoPanel.contactNameSpecialCharacterValidation();

        BusinessInfo.contactNameTextBox.sendKeys("test0");
        BusinessInfoPanel.contactNameSpecialCharacterValidation();

        BusinessInfo.contactNameTextBox.sendKeys("test1");
        BusinessInfoPanel.contactNameSpecialCharacterValidation();

        BusinessInfo.contactNameTextBox.sendKeys("test2");
        BusinessInfoPanel.contactNameSpecialCharacterValidation();

        BusinessInfo.contactNameTextBox.sendKeys("test3");
        BusinessInfoPanel.contactNameSpecialCharacterValidation();

        BusinessInfo.contactNameTextBox.sendKeys("test4");
        BusinessInfoPanel.contactNameSpecialCharacterValidation();

        BusinessInfo.contactNameTextBox.sendKeys("test5");
        BusinessInfoPanel.contactNameSpecialCharacterValidation();

        BusinessInfo.contactNameTextBox.sendKeys("test6");
        BusinessInfoPanel.contactNameSpecialCharacterValidation();

        BusinessInfo.contactNameTextBox.sendKeys("test7");
        BusinessInfoPanel.contactNameSpecialCharacterValidation();

        BusinessInfo.contactNameTextBox.sendKeys("test8");
        BusinessInfoPanel.contactNameSpecialCharacterValidation();

        BusinessInfo.contactNameTextBox.sendKeys("test9");
        BusinessInfoPanel.contactNameSpecialCharacterValidation();

        BusinessInfo.contactNameTextBox.sendKeys(currentContactName);
        System.out.println("Contact Name Passed: " + BusinessInfo.contactNameTextBox.getAttribute("value"));

        System.out.println("Special Character Validation on Contact Name field is now complete");

        System.out.println("Customer performing special character validation on Contact Phone field");
        String currentContactPhone = BusinessInfo.contactPhoneTextBox.getAttribute("value");
        BusinessInfo.contactPhoneTextBox.clear();
        BusinessInfo.contactPhoneTextBox.sendKeys("201900789! ");
        BusinessInfoPanel.contactPhoneSpecialCharacterValidation();

        BusinessInfo.contactPhoneTextBox.sendKeys("2019007898`");
        BusinessInfoPanel.contactPhoneSpecialCharacterValidation();

        BusinessInfo.contactPhoneTextBox.sendKeys("2019007898~");
        BusinessInfoPanel.contactPhoneSpecialCharacterValidation();

        BusinessInfo.contactPhoneTextBox.sendKeys("2019007898@");
        BusinessInfoPanel.contactPhoneSpecialCharacterValidation();

        BusinessInfo.contactPhoneTextBox.sendKeys("2019007898#");
        BusinessInfoPanel.contactPhoneSpecialCharacterValidation();

        BusinessInfo.contactPhoneTextBox.sendKeys("2019007898$");
        BusinessInfoPanel.contactPhoneSpecialCharacterValidation();

        BusinessInfo.contactPhoneTextBox.sendKeys("2019007898%");
        BusinessInfoPanel.contactPhoneSpecialCharacterValidation();

        BusinessInfo.contactPhoneTextBox.sendKeys("2019007898^");
        BusinessInfoPanel.contactPhoneSpecialCharacterValidation();

        BusinessInfo.contactPhoneTextBox.sendKeys("2019007898&");
        BusinessInfoPanel.contactPhoneSpecialCharacterValidation();

        BusinessInfo.contactPhoneTextBox.sendKeys("2019007898*");
        BusinessInfoPanel.contactPhoneSpecialCharacterValidation();

        BusinessInfo.contactPhoneTextBox.sendKeys("2019007898(");
        BusinessInfoPanel.contactPhoneSpecialCharacterValidation();

        BusinessInfo.contactPhoneTextBox.sendKeys("2019007898)");
        BusinessInfoPanel.contactPhoneSpecialCharacterValidation();

        BusinessInfo.contactPhoneTextBox.sendKeys("2019007898-");
        BusinessInfoPanel.contactPhoneSpecialCharacterValidation();

        BusinessInfo.contactPhoneTextBox.sendKeys("2019007898_");
        BusinessInfoPanel.contactPhoneSpecialCharacterValidation();

        BusinessInfo.contactPhoneTextBox.sendKeys("2019007898+");
        BusinessInfoPanel.contactPhoneSpecialCharacterValidation();

        BusinessInfo.contactPhoneTextBox.sendKeys("2019007898=");
        BusinessInfoPanel.contactPhoneSpecialCharacterValidation();

        BusinessInfo.contactPhoneTextBox.sendKeys("2019007898{");
        BusinessInfoPanel.contactPhoneSpecialCharacterValidation();

        BusinessInfo.contactPhoneTextBox.sendKeys("2019007898}");
        BusinessInfoPanel.contactPhoneSpecialCharacterValidation();

        BusinessInfo.contactPhoneTextBox.sendKeys("2019007898[");
        BusinessInfoPanel.contactPhoneSpecialCharacterValidation();

        BusinessInfo.contactPhoneTextBox.sendKeys("2019007898]");
        BusinessInfoPanel.contactPhoneSpecialCharacterValidation();

        BusinessInfo.contactPhoneTextBox.sendKeys("2019007898'\'");
        BusinessInfoPanel.contactPhoneSpecialCharacterValidation();

        BusinessInfo.contactPhoneTextBox.sendKeys("2019007898;");
        BusinessInfoPanel.contactPhoneSpecialCharacterValidation();

        BusinessInfo.contactPhoneTextBox.sendKeys("2019007898:");
        BusinessInfoPanel.contactPhoneSpecialCharacterValidation();

        BusinessInfo.contactPhoneTextBox.sendKeys("2019007898<");
        BusinessInfoPanel.contactPhoneSpecialCharacterValidation();

        BusinessInfo.contactPhoneTextBox.sendKeys("2019007898>");
        BusinessInfoPanel.contactPhoneSpecialCharacterValidation();

        BusinessInfo.contactPhoneTextBox.sendKeys("2019007898,");
        BusinessInfoPanel.contactPhoneSpecialCharacterValidation();

        BusinessInfo.contactPhoneTextBox.sendKeys("2019007898.");
        BusinessInfoPanel.contactPhoneSpecialCharacterValidation();

        BusinessInfo.contactPhoneTextBox.sendKeys("2019007898?");
        BusinessInfoPanel.contactPhoneSpecialCharacterValidation();

        BusinessInfo.contactPhoneTextBox.sendKeys("2019007898/");
        BusinessInfoPanel.contactPhoneSpecialCharacterValidation();

        BusinessInfo.contactPhoneTextBox.sendKeys("201900789a");
        BusinessInfoPanel.contactPhoneSpecialCharacterValidation();

        BusinessInfo.contactPhoneTextBox.sendKeys("201900789b");
        BusinessInfoPanel.contactPhoneSpecialCharacterValidation();

        BusinessInfo.contactPhoneTextBox.sendKeys("201900789c");
        BusinessInfoPanel.contactPhoneSpecialCharacterValidation();

        BusinessInfo.contactPhoneTextBox.sendKeys("201900789d");
        BusinessInfoPanel.contactPhoneSpecialCharacterValidation();

        BusinessInfo.contactPhoneTextBox.sendKeys("201900789e");
        BusinessInfoPanel.contactPhoneSpecialCharacterValidation();

        BusinessInfo.contactPhoneTextBox.sendKeys("201900789f");
        BusinessInfoPanel.contactPhoneSpecialCharacterValidation();

        BusinessInfo.contactPhoneTextBox.sendKeys("201900789g");
        BusinessInfoPanel.contactPhoneSpecialCharacterValidation();

        BusinessInfo.contactPhoneTextBox.sendKeys("201900789h");
        BusinessInfoPanel.contactPhoneSpecialCharacterValidation();

        BusinessInfo.contactPhoneTextBox.sendKeys("201900789i");
        BusinessInfoPanel.contactPhoneSpecialCharacterValidation();

        BusinessInfo.contactPhoneTextBox.sendKeys("201900789j");
        BusinessInfoPanel.contactPhoneSpecialCharacterValidation();

        BusinessInfo.contactPhoneTextBox.sendKeys("201900789k");
        BusinessInfoPanel.contactPhoneSpecialCharacterValidation();

        BusinessInfo.contactPhoneTextBox.sendKeys("201900789l");
        BusinessInfoPanel.contactPhoneSpecialCharacterValidation();

        BusinessInfo.contactPhoneTextBox.sendKeys("201900789m");
        BusinessInfoPanel.contactPhoneSpecialCharacterValidation();

        BusinessInfo.contactPhoneTextBox.sendKeys("201900789n");
        BusinessInfoPanel.contactPhoneSpecialCharacterValidation();

        BusinessInfo.contactPhoneTextBox.sendKeys("201900789o");
        BusinessInfoPanel.contactPhoneSpecialCharacterValidation();

        BusinessInfo.contactPhoneTextBox.sendKeys("201900789p");
        BusinessInfoPanel.contactPhoneSpecialCharacterValidation();

        BusinessInfo.contactPhoneTextBox.sendKeys("201900789q");
        BusinessInfoPanel.contactPhoneSpecialCharacterValidation();

        BusinessInfo.contactPhoneTextBox.sendKeys("201900789r");
        BusinessInfoPanel.contactPhoneSpecialCharacterValidation();

        BusinessInfo.contactPhoneTextBox.sendKeys("201900789s");
        BusinessInfoPanel.contactPhoneSpecialCharacterValidation();

        BusinessInfo.contactPhoneTextBox.sendKeys("201900789t");
        BusinessInfoPanel.contactPhoneSpecialCharacterValidation();

        BusinessInfo.contactPhoneTextBox.sendKeys("201900789u");
        BusinessInfoPanel.contactPhoneSpecialCharacterValidation();

        BusinessInfo.contactPhoneTextBox.sendKeys("201900789v");
        BusinessInfoPanel.contactPhoneSpecialCharacterValidation();

        BusinessInfo.contactPhoneTextBox.sendKeys("201900789w");
        BusinessInfoPanel.contactPhoneSpecialCharacterValidation();

        BusinessInfo.contactPhoneTextBox.sendKeys("201900789x");
        BusinessInfoPanel.contactPhoneSpecialCharacterValidation();

        BusinessInfo.contactPhoneTextBox.sendKeys("201900789y");
        BusinessInfoPanel.contactPhoneSpecialCharacterValidation();

        BusinessInfo.contactPhoneTextBox.sendKeys("201900789z");
        BusinessInfoPanel.contactPhoneSpecialCharacterValidation();

        BusinessInfo.contactPhoneTextBox.sendKeys(currentContactPhone);
        System.out.println("Contact Phone Passed: " + BusinessInfo.contactPhoneTextBox.getAttribute("value"));

        System.out.println("Special Character Validation on Contact Phone field is now complete");

        System.out.println("Customer performing special character validation on Contact Email field");
        String currentContactEmail = BusinessInfo.contactEmailTextBox.getAttribute("value");
        BusinessInfo.contactEmailTextBox.clear();
        Thread.sleep(5000);
        BusinessInfo.contactEmailTextBox.sendKeys("test!@gmail.com");
        BusinessInfoPanel.contactEmailSpecialCharacterValidation();

        BusinessInfo.contactEmailTextBox.sendKeys("test`@gmail.com");
        BusinessInfoPanel.contactEmailSpecialCharacterValidation();

        BusinessInfo.contactEmailTextBox.sendKeys("test~@gmail.com");
        BusinessInfoPanel.contactEmailSpecialCharacterValidation();

        BusinessInfo.contactEmailTextBox.sendKeys("test@@gmail.com");
        BusinessInfoPanel.contactEmailSpecialCharacterValidation();

        BusinessInfo.contactEmailTextBox.sendKeys("test#@gmail.com");
        BusinessInfoPanel.contactEmailSpecialCharacterValidation();

        BusinessInfo.contactEmailTextBox.sendKeys("test$@gmail.com");
        BusinessInfoPanel.contactEmailSpecialCharacterValidation();

        BusinessInfo.contactEmailTextBox.sendKeys("test%@gmail.com");
        BusinessInfoPanel.contactEmailSpecialCharacterValidation();

        BusinessInfo.contactEmailTextBox.sendKeys("test^@gmail.com");
        BusinessInfoPanel.contactEmailSpecialCharacterValidation();

        BusinessInfo.contactEmailTextBox.sendKeys("test&@gmail.com");
        BusinessInfoPanel.contactEmailSpecialCharacterValidation();

        BusinessInfo.contactEmailTextBox.sendKeys("test*@gmail.com");
        BusinessInfoPanel.contactEmailSpecialCharacterValidation();

        BusinessInfo.contactEmailTextBox.sendKeys("test(@gmail.com");
        BusinessInfoPanel.contactEmailSpecialCharacterValidation();

        BusinessInfo.contactEmailTextBox.sendKeys("test)@gmail.com");
        BusinessInfoPanel.contactEmailSpecialCharacterValidation();

        BusinessInfo.contactEmailTextBox.sendKeys("test+@gmail.com");
        BusinessInfoPanel.contactEmailSpecialCharacterValidation();

        BusinessInfo.contactEmailTextBox.sendKeys("test=@gmail.com");
        BusinessInfoPanel.contactEmailSpecialCharacterValidation();

        BusinessInfo.contactEmailTextBox.sendKeys("test{@gmail.com");
        BusinessInfoPanel.contactEmailSpecialCharacterValidation();

        BusinessInfo.contactEmailTextBox.sendKeys("test}@gmail.com");
        BusinessInfoPanel.contactEmailSpecialCharacterValidation();

        BusinessInfo.contactEmailTextBox.sendKeys("test[@gmail.com");
        BusinessInfoPanel.contactEmailSpecialCharacterValidation();

        BusinessInfo.contactEmailTextBox.sendKeys("test]@gmail.com");
        BusinessInfoPanel.contactEmailSpecialCharacterValidation();

        BusinessInfo.contactEmailTextBox.sendKeys("test'\'@gmail.com");
        BusinessInfoPanel.contactEmailSpecialCharacterValidation();

        BusinessInfo.contactEmailTextBox.sendKeys("test;@gmail.com");
        BusinessInfoPanel.contactEmailSpecialCharacterValidation();

        BusinessInfo.contactEmailTextBox.sendKeys("test:@gmail.com");
        BusinessInfoPanel.contactEmailSpecialCharacterValidation();

        BusinessInfo.contactEmailTextBox.sendKeys("test'@gmail.com");
        BusinessInfoPanel.contactEmailSpecialCharacterValidation();

        BusinessInfo.contactEmailTextBox.sendKeys("test<@gmail.com");
        BusinessInfoPanel.contactEmailSpecialCharacterValidation();

        BusinessInfo.contactEmailTextBox.sendKeys("test>@gmail.com");
        BusinessInfoPanel.contactEmailSpecialCharacterValidation();

        BusinessInfo.contactEmailTextBox.sendKeys("test,@gmail.com");
        BusinessInfoPanel.contactEmailSpecialCharacterValidation();

        BusinessInfo.contactEmailTextBox.sendKeys("test?@gmail.com");
        BusinessInfoPanel.contactEmailSpecialCharacterValidation();

        BusinessInfo.contactEmailTextBox.sendKeys("test/@gmail.com");
        BusinessInfoPanel.contactEmailSpecialCharacterValidation();

        BusinessInfo.contactEmailTextBox.sendKeys("test@!gmail.com");
        BusinessInfoPanel.contactEmailSpecialCharacterValidation();

        BusinessInfo.contactEmailTextBox.sendKeys("test@`gmail.com");
        BusinessInfoPanel.contactEmailSpecialCharacterValidation();

        BusinessInfo.contactEmailTextBox.sendKeys("test@~gmail.com");
        BusinessInfoPanel.contactEmailSpecialCharacterValidation();

        BusinessInfo.contactEmailTextBox.sendKeys("test@@gmail.com");
        BusinessInfoPanel.contactEmailSpecialCharacterValidation();

        BusinessInfo.contactEmailTextBox.sendKeys("test@#gmail.com");
        BusinessInfoPanel.contactEmailSpecialCharacterValidation();

        BusinessInfo.contactEmailTextBox.sendKeys("test@$gmail.com");
        BusinessInfoPanel.contactEmailSpecialCharacterValidation();

        BusinessInfo.contactEmailTextBox.sendKeys("test@%gmail.com");
        BusinessInfoPanel.contactEmailSpecialCharacterValidation();

        BusinessInfo.contactEmailTextBox.sendKeys("test@^gmail.com");
        BusinessInfoPanel.contactEmailSpecialCharacterValidation();

        BusinessInfo.contactEmailTextBox.sendKeys("test@&gmail.com");
        BusinessInfoPanel.contactEmailSpecialCharacterValidation();

        BusinessInfo.contactEmailTextBox.sendKeys("test@*gmail.com");
        BusinessInfoPanel.contactEmailSpecialCharacterValidation();

        BusinessInfo.contactEmailTextBox.sendKeys(currentContactEmail);
        System.out.println("Contact Email Passed: " + BusinessInfo.contactEmailTextBox.getAttribute("value"));

        System.out.println("Special Character Validation on Contact Email field is now complete");

        System.out.println("Customer performing special character validation on Zip Code field");
        String currentZipCode = BusinessInfo.zipCodeTextBox.getAttribute("value");
        BusinessInfo.zipCodeTextBox.clear();
        BusinessInfo.zipCodeTextBox.sendKeys("20187!");
        BusinessInfoPanel.zipCodeSpecialCharacterValidation();

        BusinessInfo.zipCodeTextBox.sendKeys("20187`");
        BusinessInfoPanel.zipCodeSpecialCharacterValidation();

        BusinessInfo.zipCodeTextBox.sendKeys("20187~");
        BusinessInfoPanel.zipCodeSpecialCharacterValidation();

        BusinessInfo.zipCodeTextBox.sendKeys("20187@");
        BusinessInfoPanel.zipCodeSpecialCharacterValidation();

        BusinessInfo.zipCodeTextBox.sendKeys("20187#");
        BusinessInfoPanel.zipCodeSpecialCharacterValidation();

        BusinessInfo.zipCodeTextBox.sendKeys("20187$");
        BusinessInfoPanel.zipCodeSpecialCharacterValidation();

        BusinessInfo.zipCodeTextBox.sendKeys("20187%");
        BusinessInfoPanel.zipCodeSpecialCharacterValidation();

        BusinessInfo.zipCodeTextBox.sendKeys("20187^");
        BusinessInfoPanel.zipCodeSpecialCharacterValidation();

        BusinessInfo.zipCodeTextBox.sendKeys("20187&");
        BusinessInfoPanel.zipCodeSpecialCharacterValidation();

        BusinessInfo.zipCodeTextBox.sendKeys("20187*");
        BusinessInfoPanel.zipCodeSpecialCharacterValidation();

        BusinessInfo.zipCodeTextBox.sendKeys("20187(");
        BusinessInfoPanel.zipCodeSpecialCharacterValidation();

        BusinessInfo.zipCodeTextBox.sendKeys("20187)");
        BusinessInfoPanel.zipCodeSpecialCharacterValidation();

        BusinessInfo.zipCodeTextBox.sendKeys("20187-");
        BusinessInfoPanel.zipCodeSpecialCharacterValidation();

        BusinessInfo.zipCodeTextBox.sendKeys("20187_");
        BusinessInfoPanel.zipCodeSpecialCharacterValidation();

        BusinessInfo.zipCodeTextBox.sendKeys("20187+");
        BusinessInfoPanel.zipCodeSpecialCharacterValidation();

        BusinessInfo.zipCodeTextBox.sendKeys("20187=");
        BusinessInfoPanel.zipCodeSpecialCharacterValidation();

        BusinessInfo.zipCodeTextBox.sendKeys("20187{");
        BusinessInfoPanel.zipCodeSpecialCharacterValidation();

        BusinessInfo.zipCodeTextBox.sendKeys("20187}");
        BusinessInfoPanel.zipCodeSpecialCharacterValidation();

        BusinessInfo.zipCodeTextBox.sendKeys("20187[");
        BusinessInfoPanel.zipCodeSpecialCharacterValidation();

        BusinessInfo.zipCodeTextBox.sendKeys("20187]");
        BusinessInfoPanel.zipCodeSpecialCharacterValidation();

        BusinessInfo.zipCodeTextBox.sendKeys("20187'\'");
        BusinessInfoPanel.zipCodeSpecialCharacterValidation();

        BusinessInfo.zipCodeTextBox.sendKeys("20187;");
        BusinessInfoPanel.zipCodeSpecialCharacterValidation();

        BusinessInfo.zipCodeTextBox.sendKeys("20187:");
        BusinessInfoPanel.zipCodeSpecialCharacterValidation();

        BusinessInfo.zipCodeTextBox.sendKeys("20187<");
        BusinessInfoPanel.zipCodeSpecialCharacterValidation();

        BusinessInfo.zipCodeTextBox.sendKeys("20187>");
        BusinessInfoPanel.zipCodeSpecialCharacterValidation();

        BusinessInfo.zipCodeTextBox.sendKeys("20187,");
        BusinessInfoPanel.zipCodeSpecialCharacterValidation();

        BusinessInfo.zipCodeTextBox.sendKeys("20187.");
        BusinessInfoPanel.zipCodeSpecialCharacterValidation();

        BusinessInfo.zipCodeTextBox.sendKeys("20187?");
        BusinessInfoPanel.zipCodeSpecialCharacterValidation();

        BusinessInfo.zipCodeTextBox.sendKeys("20187/");
        BusinessInfoPanel.zipCodeSpecialCharacterValidation();

        BusinessInfo.zipCodeTextBox.sendKeys("20186a");
        BusinessInfoPanel.zipCodeSpecialCharacterValidation();

        BusinessInfo.zipCodeTextBox.sendKeys("20186b");
        BusinessInfoPanel.zipCodeSpecialCharacterValidation();

        BusinessInfo.zipCodeTextBox.sendKeys("20186c");
        BusinessInfoPanel.zipCodeSpecialCharacterValidation();

        BusinessInfo.zipCodeTextBox.sendKeys("20186d");
        BusinessInfoPanel.zipCodeSpecialCharacterValidation();

        BusinessInfo.zipCodeTextBox.sendKeys("20186e");
        BusinessInfoPanel.zipCodeSpecialCharacterValidation();

        BusinessInfo.zipCodeTextBox.sendKeys("20186f");
        BusinessInfoPanel.zipCodeSpecialCharacterValidation();

        BusinessInfo.zipCodeTextBox.sendKeys("20186g");
        BusinessInfoPanel.zipCodeSpecialCharacterValidation();

        BusinessInfo.zipCodeTextBox.sendKeys("20186h");
        BusinessInfoPanel.zipCodeSpecialCharacterValidation();

        BusinessInfo.zipCodeTextBox.sendKeys("20186i");
        BusinessInfoPanel.zipCodeSpecialCharacterValidation();

        BusinessInfo.zipCodeTextBox.sendKeys("20186j");
        BusinessInfoPanel.zipCodeSpecialCharacterValidation();

        BusinessInfo.zipCodeTextBox.sendKeys("20186k");
        BusinessInfoPanel.zipCodeSpecialCharacterValidation();

        BusinessInfo.zipCodeTextBox.sendKeys("20186l");
        BusinessInfoPanel.zipCodeSpecialCharacterValidation();

        BusinessInfo.zipCodeTextBox.sendKeys("20186m");
        BusinessInfoPanel.zipCodeSpecialCharacterValidation();

        BusinessInfo.zipCodeTextBox.sendKeys("20186n");
        BusinessInfoPanel.zipCodeSpecialCharacterValidation();

        BusinessInfo.zipCodeTextBox.sendKeys("20186o");
        BusinessInfoPanel.zipCodeSpecialCharacterValidation();

        BusinessInfo.zipCodeTextBox.sendKeys("20186p");
        BusinessInfoPanel.zipCodeSpecialCharacterValidation();

        BusinessInfo.zipCodeTextBox.sendKeys("20186q");
        BusinessInfoPanel.zipCodeSpecialCharacterValidation();

        BusinessInfo.zipCodeTextBox.sendKeys("20186r");
        BusinessInfoPanel.zipCodeSpecialCharacterValidation();

        BusinessInfo.zipCodeTextBox.sendKeys("20186s");
        BusinessInfoPanel.zipCodeSpecialCharacterValidation();

        BusinessInfo.zipCodeTextBox.sendKeys("20186t");
        BusinessInfoPanel.zipCodeSpecialCharacterValidation();

        BusinessInfo.zipCodeTextBox.sendKeys("20186u");
        BusinessInfoPanel.zipCodeSpecialCharacterValidation();

        BusinessInfo.zipCodeTextBox.sendKeys("20186v");
        BusinessInfoPanel.zipCodeSpecialCharacterValidation();

        BusinessInfo.zipCodeTextBox.sendKeys("20186w");
        BusinessInfoPanel.zipCodeSpecialCharacterValidation();

        BusinessInfo.zipCodeTextBox.sendKeys("20186x");
        BusinessInfoPanel.zipCodeSpecialCharacterValidation();

        BusinessInfo.zipCodeTextBox.sendKeys("20186y");
        BusinessInfoPanel.zipCodeSpecialCharacterValidation();

        BusinessInfo.zipCodeTextBox.sendKeys("20186z");
        BusinessInfoPanel.zipCodeSpecialCharacterValidation();

        BusinessInfo.zipCodeTextBox.sendKeys(currentZipCode);
        System.out.println("Zip Code Passed: " + BusinessInfo.zipCodeTextBox.getAttribute("value"));

        System.out.println("Special Character Validation on Zip Code field is now complete");
    }

    public static void businessNameSpecialCharacterValidation() throws InterruptedException {
        System.out.println("Business Name Passed: " + BusinessInfo.businessNameTextBox.getAttribute("value"));
        String ValidationMessage = BusinessInfo.businessNameSpecialCharacterValidationError.getText();
        System.out.println("Validation message displayed is " + ValidationMessage);
        Assert.assertEquals("Business name cannot contain any number or special character.", ValidationMessage);
        Thread.sleep(3000);
        BusinessInfo.businessNameTextBox.clear();
    }

    public static void contactNameSpecialCharacterValidation() throws InterruptedException {
        System.out.println("Contact Name Passed: " + BusinessInfo.contactNameTextBox.getAttribute("value"));
        String ValidationMessage = BusinessInfo.contactNameSpecialCharacterValidationError.getText();
        System.out.println("Validation message displayed is " + ValidationMessage);
        Assert.assertEquals("Contact name must not contain special and numeric characters.", ValidationMessage);
        Thread.sleep(3000);
        BusinessInfo.contactNameTextBox.clear();
    }

    public static void contactPhoneSpecialCharacterValidation() throws InterruptedException {
        System.out.println("Contact Phone Passed: " + BusinessInfo.contactPhoneTextBox.getAttribute("value"));
        String ValidationMessage = BusinessInfo.invalidContactPhoneValidationError.getText();
        System.out.println("Validation message displayed is " + ValidationMessage);
        Assert.assertEquals("Invalid Contact Phone", ValidationMessage);
        Thread.sleep(3000);
        BusinessInfo.contactPhoneTextBox.clear();
    }

    public static void contactEmailSpecialCharacterValidation() throws InterruptedException {
        System.out.println("Contact Email Passed: " + BusinessInfo.contactEmailTextBox.getAttribute("value"));
        String ValidationMessage = BusinessInfo.invalidContactEmailSpecialCharacterValidationError.getText();
        System.out.println("Validation message displayed is " + ValidationMessage);
        Assert.assertTrue(ValidationMessage.contains("Invalid Email Id"));
        Assert.assertTrue(ValidationMessage.contains("Allowed Special Characters:"));
        Assert.assertTrue(ValidationMessage.contains("Before @ symbol are '._-'"));
        Assert.assertTrue(ValidationMessage.contains("After @ symbol are '.-'"));
        Assert.assertTrue(ValidationMessage.contains("Min length 5 Max length 60"));
        Thread.sleep(3000);
        BusinessInfo.contactEmailTextBox.clear();
    }

    public static void zipCodeSpecialCharacterValidation() throws InterruptedException {
        System.out.println("Zip Code Passed: " + BusinessInfo.zipCodeTextBox.getAttribute("value"));
        String ValidationMessage = BusinessInfo.zipCodeError.getText();
        System.out.println("Validation message displayed is " + ValidationMessage);
        Assert.assertEquals("Zip Code cannot contain any special character.", ValidationMessage);
        Thread.sleep(3000);
        BusinessInfo.zipCodeTextBox.clear();
    }

    public static void uploadLogo() throws Throwable {
        Thread.sleep(3000);
        Robot robot = new Robot();
        UtilityClass.waitForElement(BusinessInfo.uploadBusinessLogo);
        BusinessInfo.uploadBusinessLogo.click();
        Thread.sleep(2000);
        String currentdir = new File("").getAbsolutePath();
        System.out.println("current path is" + currentdir);
        String imagepath = "\\files\\flower.jpg";
        System.out.println("imagepath is" + imagepath);
        String path = currentdir + imagepath;
        StringSelection str = new StringSelection(path);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
        robot.delay(3000);

        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);

        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_V);

        robot.setAutoDelay(3000);

        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

        Thread.sleep(5000);

        BusinessInfo.deleteBusinessLogo.click();
        Thread.sleep(2000);

        BusinessInfo.editBusinessInfoSaveButton.click();
        System.out.println("Flower Image updated");

        UtilityClass.waitForElement(BusinessInfo.uploadBusinessLogo);
        BusinessInfo.uploadBusinessLogo.click();
        Thread.sleep(2000);
        currentdir = new File("").getAbsolutePath();
        System.out.println("current path is" + currentdir);
        imagepath = "\\files\\FlexLogger.jpg";
        System.out.println("imagepath is" + imagepath);
        path = currentdir + imagepath;
        str = new StringSelection(path);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
        robot.delay(3000);

        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);

        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_V);

        robot.setAutoDelay(3000);

        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

        Thread.sleep(5000);

        BusinessInfo.editBusinessInfoSaveButton.click();
        Thread.sleep(2000);
        System.out.println("Flex Logger Image updated");

        BusinessInfo.deleteBusinessLogo.click();
        Thread.sleep(2000);

        UtilityClass.waitForElement(BusinessInfo.uploadBusinessLogo);
        BusinessInfo.uploadBusinessLogo.click();
        Thread.sleep(2000);
        currentdir = new File("").getAbsolutePath();
        System.out.println("current path is" + currentdir);
        imagepath = "\\files\\download.gif";
        System.out.println("imagepath is" + imagepath);
        path = currentdir + imagepath;
        str = new StringSelection(path);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
        robot.delay(3000);

        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);

        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_V);

        robot.setAutoDelay(3000);

        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

        Thread.sleep(5000);

        BusinessInfo.invalidImageFormatValidationMessage.getText();
        Assert.assertTrue(BusinessInfo.invalidImageFormatValidationMessage.isDisplayed());
        Assert.assertTrue(BusinessInfo.invalidImageFormatValidationMessage.getText().contains("The file uploaded is not supported. Only jpg, jpeg, or png files are allowed."));
        Thread.sleep(2000);
        System.out.println("Invalid image format is validated");
    }

}
