package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Register {

    @FindBy(xpath = "//a[@href = '/login']")
    public static WebElement loginMenu;

    @FindBy(xpath = "//a[@href = '/register']")
    public static WebElement registerLink;

    @FindBy(xpath = "//*[contains(text(),'Email')]")
    public static WebElement emailRadioBtn;

    @FindBy(xpath = "//input[@placeholder='Phone number']")
    public static WebElement phoneNoTxtBox;

    @FindBy(xpath = "//input[@placeholder='Email']")
    public static WebElement emailTxtBox;

    @FindBy(xpath = "//input[@placeholder='Create Password']")
    public static WebElement createPasswordTxtBox;

    @FindBy(xpath = "//input[@placeholder='Confirm Password']")
    public static WebElement confirmPasswordTxtBox;

    @FindBy(xpath = "(//input[@type='checkbox']/following::label)[1]")
    public static WebElement checkBoxTOS;

    @FindBy(xpath = "//input[@id='ptoc']")
    public static WebElement checkBoxPTC;

    @FindBy(xpath = "//button[@type='submit']")
    public static WebElement registerButton;

    @FindBy(xpath = "//input[@placeholder='Enter One Time Password(OTP)']")
    public static WebElement enterCodeTxtBox;

    @FindBy(xpath = "type='submit'")
    public static WebElement completeBtn;

    @FindBy(xpath = "//button[@type='submit']")
    public static WebElement completeButton;

    @FindBy(xpath = "(//a[contains(text(),'Sign in')])[2]")
    public static WebElement signInLink;

    @FindBy(xpath = "/html/body/div/div[2]/main/div[3]/div/div[1]/div[2]/div/div/form/div/div[1]/div[2]/div/input")
    public static WebElement yopEmailTxtBox;

    @FindBy(xpath = "/html/body/div/div[2]/main/div[3]/div/div[1]/div[2]/div/div/form/div/div[1]/div[4]/button/i")
    public static WebElement checkYopInboxBtn;

    @FindBy(xpath = "//*[contains(text(),'Your Wireless Office One Time Password is: ')]/b")
    public static WebElement otpTxt;

    @FindBy(xpath = "//*[contains(text(),'link')]")
    public static WebElement sacMailForgotPwdLink;

    @FindBy(xpath = "//button[contains(text(),'OK')]")
    public static WebElement okBtn;

    @FindBy(xpath = "//button[normalize-space()='Sign out']")
    public static WebElement Signout;

    @FindBy(xpath = "//button[@class='btn btn-link country-code-btn dropdown-toggle']")
    public static WebElement phoneCodeForRegister;

    @FindBy(xpath = "//input[@placeholder='Mobile Phone']")
    public static WebElement mobileTextBox;

    @FindBy(xpath = "//i[@class='icon icon-message-double']")
    public static WebElement registerTextMeOption;

    @FindBy(xpath = "//span[@class='text']")
    public static WebElement phoneRegisterTextOption;

    @FindBy(xpath = "//span[contains(text(),'Call Me')]")
    public static WebElement phoneRegisterCallMeOption;

    @FindBy(xpath = "//div[@class='alert fade show m-b-10 alert-warning']")
    public static WebElement mobileNotRegisterWarningMsg;

    @FindBy(xpath = "//input[@placeholder='Password']")
    public static WebElement mobileLoginPassword;

    @FindBy(xpath = "//h2[@id='swal2-title']")
    public static WebElement invalidMobileNumberRegister;

    @FindBy(xpath = "//button[contains(text(),'OK')]")
    public static WebElement invalidMobileRegisterWarningMsgOkBtn;

    @FindBy(xpath = "//small[@class='form-error-msg']")
    public static WebElement passwordUnmatchedWarningMsg;

    @FindBy(xpath = "//div[contains(@class,'alert fade')]")
    public static WebElement alreadyRegisteredMobileNumberWarningMsg;

    @FindBy(xpath = "//div[@class='alert fade show m-b-10 alert-warning']")
    public static WebElement wrongPasswordLoginWarningMsgVerify;

    @FindBy(xpath = "//small[@class='form-error-msg']")
    public static WebElement invalidMobilePhoneWarningMsg;

    @FindBy(xpath = "//input[@placeholder='anything']")
    public static WebElement mailSacEmailTextBox;

    @FindBy(xpath = "//button[@class='btn btn-primary']")
    public static WebElement checkMailButtonMailSac;

    @FindBy(xpath = "//strong[@class='ng-binding']")
    public static WebElement clickingOtpContainsSacMail;

    @FindBy(xpath = "//button[@class='btn current-options login-eds-select-btn-line-hight-box-shadow']")
    public static WebElement loginPhoneCode;

    @FindBy(xpath = "//strong[@class='ng-binding']")
    public static WebElement clickingProfileUpdatesMailSac;

    @FindBy(xpath = "//td[contains(text(),'Your Wireless Office profile has been updated')]")
    public static WebElement profileUpdateEmailSubject;

    @FindBy(xpath = "//p[contains(text(),'This email confirms that a change was made to your Wireless Office profile. ')]")
    public static WebElement profileUpdateMessageInEmail;

}
