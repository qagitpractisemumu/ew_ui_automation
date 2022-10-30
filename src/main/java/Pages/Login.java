package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.swing.*;

public class Login {

    @FindBy(xpath = "//*[contains(text(),'Phone')]")
    public static WebElement PhoneRadioBtnLoginPage;

    @FindBy(xpath = "//*[contains(text(),'Email')]")
    public static WebElement emailIDRadioBtnLoginPage;

    @FindBy(xpath = "//input[@placeholder= 'Email']")
    public static WebElement loginEmailTxtBox;

    @FindBy(xpath = "//input[@placeholder='Password']")
    public static WebElement loginPasswordTxtBox;

    @FindBy(xpath = "//button[@type='submit']")
    public static WebElement loginBtn;

    @FindBy(xpath = "//a[@href='/login/forgetPassword-ca']")
    public static WebElement forgetpwd;

    @FindBy(xpath = "//button[@class='swal2-confirm swal2-styled']")
    public static WebElement okSuccessResetLink;

    @FindBy(xpath = "//div[contains(@class,'item hover')]//span[1]")
    public static WebElement profileIconButton;

    @FindBy(xpath = "//button[contains(text(),'Submit')]")
    public static WebElement submitBtnForgotPwd;

    @FindBy(xpath = "//button[contains(text(),'Sign out')]")
    public static WebElement signOutButton;

    @FindBy(xpath = "//input[@id='login']")
    public static WebElement yopmailId;

    @FindBy(xpath = "//input[@class='sbut']")
    public static WebElement yopmailCheckInbox;

    @FindBy(xpath = "//a[text()='Link']")
    public static WebElement resetLink;

    @FindBy(xpath = "//input[@placeholder='Your new password']")
    public static WebElement resetnewPasswordTxtBox;

    @FindBy(xpath = "//input[@placeholder='Confirm the password']")
    public static WebElement resetConfirmPasswordTxtBox;

    @FindBy(xpath = "//div[@class='login-buttons']")
    public static WebElement resetPwdSubmit;

    @FindBy(xpath = "//button[@class='swal2-confirm swal2-styled']")
    public static WebElement resetSuccessMsgOk;

    @FindBy(xpath = "//div[contains(text(),'Invalid Credentials!')]")
    public static WebElement emailAlertMsg;

    @FindBy(xpath = "//input[contains(@class,'validation eds-login-input-custom-width')]/following-sibling::small[1]")
    public static WebElement invalidEmailMsg;

    @FindBy(xpath = "//div[contains(text(),'Already registered, please enter different email')]")
    public static WebElement alreadyRegisteredMsg;

    @FindBy(xpath = "//input[@placeholder='Enter One Time Password(OTP)']")
    public static WebElement otpTextBox;

    @FindBy(xpath = "//div[@class='alert fade show m-b-0 m-t-10 duo-content-width alert-danger']")
    public static WebElement registerInvalidOtpAlertMsg;


    @FindBy(xpath = "//input[@placeholder='Enter username']")
    public static WebElement userNamePAPortal;

    @FindBy(xpath = "//input[@placeholder='Enter password']")
    public static WebElement passwordPAPortal;

    @FindBy(xpath = "//button[contains(text(),'Login')]")
    public static WebElement loginBtnPAPortal;

    @FindBy(xpath = "//img[@src='/assets/img/logo/logo-wireless-office-white.png']")
    public static WebElement wirelessOfficeLogo;

    @FindBy(xpath = "//a[@routerlink='/plans']")
    public static WebElement plans;

    @FindBy(xpath = "//div[text()='Log In']")
    public static WebElement logInTitle;

    @FindBy(xpath = "//label[text()='Phone Number']")
    public static WebElement phoneNumberRadioButton;

    @FindBy(xpath = "//label[text()='Email']")
    public static WebElement emailRadioButton;

    @FindBy(xpath = "//input[@placeholder='Email']")
    public static WebElement emailTextBox;

    @FindBy(xpath = "//input[@placeholder='Mobile Phone']")
    public static WebElement mobilePhoneTextBox;

    @FindBy(xpath = "//div[contains(@class,'select login-select-country')]//button[1]")
    public static WebElement countryCodeLink;

    @FindBy(xpath = "//div[contains(text(),'Log In')]")
    public static WebElement logInButton;

    @FindBy(xpath = "//div/button[@disabled= '']")
    public static WebElement disabledLogInButton;

    @FindBy(xpath = "//div[text()=' Need help? ']")
    public static WebElement needHelp;

    @FindBy(xpath = "//a[@href='/login/forgetPassword-ca']")
    public static WebElement forgotPasswordLink;

    @FindBy(xpath = "//div[text()=' Not registered yet? ']")
    public static WebElement notRegisteredYet;

    @FindBy(xpath = "(//a[@href='/plans'])[2]")
    public static WebElement signUpHyperLink;

    @FindBy(xpath = "//a[@href='/legal-page']")
    public static WebElement privacyLegaLFooter;

    @FindBy(xpath = "html[1]/body[1]/app-root[1]/wireless-office-login[1]/div[1]/new-footer[1]/div[1]")
    public static WebElement loginFooter;

    @FindBy(xpath = "//div[contains(@class,'pb-3 light')]//header[1]")
    public static WebElement loginHeader;

    @FindBy(xpath = "html[1]/body[1]/app-root[1]/wireless-office-login[1]/div[1]/new-footer[1]/div[1]/div[1]")
    public static WebElement wirelessOfficeCopyRightSymbol;

    @FindBy(xpath = "//div[text()='The service is intended for use by authorized users only. You may not attempt to gain unauthorized access to any part of this service, accounts, computer systems or networks connected to any Ericsson servers or any other service.  ']")
    public static WebElement textOnLogin;

    @FindBy(xpath = "//button[text()='Resend OTP ']")
    public static WebElement resendButton;

    @FindBy(xpath = "//div[@class='options-list']")
    public static WebElement countryCodeDropDownList;

    @FindBy(xpath = "(//small[@class='form-error-msg'])[1]")
    public static WebElement invalidEmailAlertMessage;

    @FindBy(xpath = "(//div[@class='col-md-12']//div)[3]")
    public static WebElement invalidCredentialsAlert;

    @FindBy(xpath = "//small[text()=' Email is required ']")
    public static WebElement requiredEmail;

    @FindBy(xpath = "//small[text()=' Password is required ']")
    public static WebElement requiredPassword;

    @FindBy(xpath = "//small[text()=' Phone Number is required ']")
    public static WebElement requiredPhone;

    @FindBy(xpath = "//small[text()=' OTP is required ']")
    public static WebElement requiredOtp;

    @FindBy(xpath = "//button[text()=' Complete ']")
    public static WebElement completeButton;

    @FindBy(xpath = "//div[contains(@class,'alert fade')]")
    public static WebElement alert;

    @FindBy(xpath = "//button[text()=' Log In ']")
    public static WebElement reLoginButton;


    public static AbstractButton invalidOtpAlertMsg;
}
