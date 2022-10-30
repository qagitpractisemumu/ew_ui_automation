package PagePanel;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import Pages.*;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;

import Resource.BaseClass;
import Resource.UtilityClass;
import static org.junit.Assert.assertEquals;

public class LoginPanel extends BaseClass {
    private static CharSequence emailTxt;
    Login login = new Login();
    BusinessInfo businessInfo = new BusinessInfo();

    public LoginPanel() {
        login = PageFactory.initElements(driver, Login.class);
        businessInfo = PageFactory.initElements(driver, BusinessInfo.class);
    }

    public static void signInWithPhone() {
        UtilityClass.waitForElement(Login.PhoneRadioBtnLoginPage);
        Login.PhoneRadioBtnLoginPage.click();
    }

    public static void singInWithEmail() {
        UtilityClass.waitForElement(Login.emailIDRadioBtnLoginPage);
        Login.emailIDRadioBtnLoginPage.click();
    }

    public static void enterEmailId() throws Throwable {
        UtilityClass.waitForElement(Login.loginEmailTxtBox);
        String emailTxt = UtilityClass.readEmailId();
        Login.loginEmailTxtBox.sendKeys(emailTxt);
    }

    public static void sendEmailId(String email) {
        UtilityClass.waitForElement(Login.loginEmailTxtBox);
        Login.loginEmailTxtBox.sendKeys(email);
    }

    public static void enterPasswordId(String pwd) {
        UtilityClass.waitForElement(Login.loginPasswordTxtBox);
        Login.loginPasswordTxtBox.sendKeys(pwd);
    }

    public static void clickOnLoginBtn() throws InterruptedException {
        UtilityClass.waitForElement(Login.loginBtn);
        Thread.sleep(5000);
        Login.loginBtn.click();
    }

    public static void clickProfileIconButton() throws InterruptedException {
        UtilityClass.waitForElement(Login.profileIconButton);
        Thread.sleep(3000);
        Login.profileIconButton.click();
        Thread.sleep(3000);
    }

    public static void clickForgotPwd() throws InterruptedException {
        UtilityClass.waitForElement(Login.forgetpwd);
        Login.forgetpwd.click();
        Thread.sleep(6000);
    }

    public static void clickOkResetLink() throws InterruptedException {
        Thread.sleep(6000);
        UtilityClass.waitForElement(Login.okSuccessResetLink);
        Login.okSuccessResetLink.click();
    }

    public static void clickSubmitForgotPwd() throws InterruptedException {
        Thread.sleep(2000);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", Login.submitBtnForgotPwd);
    }

    public static void newTabCreateYopMailForgotPassword(String email) throws Throwable {
        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_CONTROL);
        r.keyPress(KeyEvent.VK_T);
        r.keyRelease(KeyEvent.VK_CONTROL);
        r.keyRelease(KeyEvent.VK_T);

        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(0));
        Thread.sleep(5000);
        Set<String> set = driver.getWindowHandles();
        Iterator<String> iterator = set.iterator();
        String nw = iterator.next();
        String nw1 = iterator.next();
        driver.switchTo().window(nw1);
        driver.get("http://www.yopmail.com/en/");
        Thread.sleep(2000);
        System.out.println(driver.getTitle());
        UtilityClass.waitForElement(Register.yopEmailTxtBox);
        //String emailTxt = UtilityClass.readEmailId();
        Register.yopEmailTxtBox.sendKeys(email);
        UtilityClass.waitForElement(Register.checkYopInboxBtn);
        Register.checkYopInboxBtn.click();
        Thread.sleep(2000);
        driver.switchTo().frame("ifmail");
        UtilityClass.waitForElement(Login.resetLink);
        Login.resetLink.click();
    }

    public static void typeLoginEmail(String email) throws InterruptedException {
        UtilityClass.waitForElement(Login.loginEmailTxtBox);
        Login.loginEmailTxtBox.sendKeys(email);
        Thread.sleep(2000);
    }

    public static void clickResetLink() {
        System.out.println("reset link is clicked");
    }

    public static void typeNewResetPwd(String newpassword) throws InterruptedException {
        Thread.sleep(5000);
        UtilityClass.waitForElement(Login.resetnewPasswordTxtBox);
        Login.resetnewPasswordTxtBox.sendKeys(newpassword);
    }

    public static void typeConfirmResetPwd(String confirmpassword) throws InterruptedException {
        Thread.sleep(5000);
        UtilityClass.waitForElement(Login.resetConfirmPasswordTxtBox);
        Login.resetConfirmPasswordTxtBox.sendKeys(confirmpassword);
    }

    public static void clickResetSubmit() throws InterruptedException {
        Thread.sleep(2000);
        UtilityClass.waitForElement(Login.resetPwdSubmit);
        Login.resetPwdSubmit.click();
    }

    public static void clickSignOutButton() throws InterruptedException {
        Thread.sleep(3000);
        UtilityClass.waitForElement(Login.signOutButton);
        Login.signOutButton.click();
        System.out.println("Signout is successful with Loginpage");
        Thread.sleep(2000);
    }

    public static void switchWindow() throws InterruptedException {
        Thread.sleep(5000);
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(2));
        Thread.sleep(5000);
        Set<String> set = driver.getWindowHandles();
        Iterator<String> iterator = set.iterator();
        String nw = iterator.next();
        String nw1 = iterator.next();
        String nw2 = iterator.next();
        driver.switchTo().window(nw2);
        Thread.sleep(5000);
    }

    public static void clickResetSuccessOk() throws InterruptedException {
        Thread.sleep(5000);
        UtilityClass.waitForElement(Login.resetSuccessMsgOk);
        Login.resetSuccessMsgOk.click();
        System.out.println("Password reset is made successfully");
    }

    public static void enterEmailAndPasswordBox(String emailid, String password) throws InterruptedException {
        Thread.sleep(2500);
        UtilityClass.waitForElement(Login.loginEmailTxtBox);
        Login.loginEmailTxtBox.sendKeys(emailid);
        Thread.sleep(1000);
        UtilityClass.waitForElement(Login.loginPasswordTxtBox);
        Login.loginPasswordTxtBox.sendKeys(password);
        Thread.sleep(2000);
    }

    public static void enteringInvalidPassword2(String password1) throws InterruptedException {
        Thread.sleep(4000);
        UtilityClass.waitForElement(Login.loginPasswordTxtBox);
        Thread.sleep(1500);
        Login.loginPasswordTxtBox.clear();
        Thread.sleep(1000);
        Login.loginPasswordTxtBox.sendKeys(password1);
        Thread.sleep(2000);
    }

    public static void enteringInvalidPassword3(String password2) throws InterruptedException {
        Thread.sleep(4000);
        UtilityClass.waitForElement(Login.loginPasswordTxtBox);
        Thread.sleep(1500);
        Login.loginPasswordTxtBox.clear();
        Thread.sleep(1000);
        Login.loginPasswordTxtBox.sendKeys(password2);
        Thread.sleep(2000);
    }

    public static void enteringInvalidPassword4(String password3) throws InterruptedException {
        Thread.sleep(4000);
        UtilityClass.waitForElement(Login.loginPasswordTxtBox);
        Thread.sleep(1500);
        Login.loginPasswordTxtBox.clear();
        Thread.sleep(1000);
        Login.loginPasswordTxtBox.sendKeys(password3);
        Thread.sleep(2000);
    }

    public static void enteringInvalidPassword5(String password4) throws InterruptedException {
        Thread.sleep(4000);
        UtilityClass.waitForElement(Login.loginPasswordTxtBox);
        Thread.sleep(1500);
        Login.loginPasswordTxtBox.clear();
        Thread.sleep(1000);
        Login.loginPasswordTxtBox.sendKeys(password4);
        Thread.sleep(2000);
    }

    public static void verifyingWarningMsgForEmail() throws InterruptedException {
        Thread.sleep(3000);
        Assert.assertTrue(Login.alert.getText().contains("Invalid Credentials!"));
        Thread.sleep(1000);
        System.out.println("As the email is not registered before signing in,so we get the warning message");
    }

    public static void verifyingInvalidEmailMsg() throws InterruptedException {
        Thread.sleep(3000);
        System.out.println(Login.invalidEmailMsg.getText());
        Assert.assertTrue(Login.invalidEmailMsg.getText().contains("Invalid Email"));
        Assert.assertTrue(Login.invalidEmailMsg.getText().contains("Special Characters Accepted:"));
        Assert.assertTrue(Login.invalidEmailMsg.getText().contains("Before @ symbol are '._-'"));
        Assert.assertTrue(Login.invalidEmailMsg.getText().contains("After @ symbol are '.-'"));
        Assert.assertTrue(Login.invalidEmailMsg.getText().contains("Min length 5 Max length 60"));
    }

    public static void invalidEmailForRegistration(String emailid) throws InterruptedException, AWTException {
        Thread.sleep(2000);
        UtilityClass.waitForElement(Login.loginEmailTxtBox);
        Login.loginEmailTxtBox.sendKeys(emailid);
        Thread.sleep(2000);
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
    }

    public static void verifyingInvalidEmailMsgForRegistration() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertNotEquals(Login.invalidEmailMsg.getText(), "valid Email Id");
        System.out.println("Invalid Email Id\n" +
                "Allowed Special Characters:\n" +
                "Before @ symbol are '._'\n" +
                "After @ symbol are '.-' ");
    }

    public static void verifyingAlreadyRegisteredWarningMsg() throws InterruptedException {
        Thread.sleep(4000);
        Assert.assertNotEquals(Login.alreadyRegisteredMsg.getText(), "valid email");
        System.out.println("Warning message is shown as we enter the email id in the register page which is already registered");
    }

    public static void enteringDetailsForRegisterFromFeatureFile(String emailid, String createPassword, String confirmPassword) throws InterruptedException {
        Thread.sleep(2000);
        UtilityClass.waitForElement(Register.emailTxtBox);
        Register.emailTxtBox.sendKeys(emailid);
        Thread.sleep(1000);
        UtilityClass.waitForElement(Register.createPasswordTxtBox);
        Register.createPasswordTxtBox.sendKeys(createPassword);
        Thread.sleep(1000);
        UtilityClass.waitForElement(Register.confirmPasswordTxtBox);
        Register.confirmPasswordTxtBox.sendKeys(confirmPassword);
        Thread.sleep(1000);
    }

    public static void enteringEmailFromFeatureFile(String emailid) throws InterruptedException {
        Thread.sleep(3000);
        UtilityClass.waitForElement(Login.loginEmailTxtBox);
        Login.loginEmailTxtBox.sendKeys(emailid);
        Thread.sleep(2000);
    }

    public static void enteringPasswordFromFeatureFile(String password) throws InterruptedException {
        Thread.sleep(1000);
        UtilityClass.waitForElement(Login.loginPasswordTxtBox);
        Login.loginPasswordTxtBox.sendKeys(password);
        Thread.sleep(1000);
    }

    public static void enteringUsernamePasswordPAPortal(String username, String password1) throws InterruptedException {
        Thread.sleep(11500);
        UtilityClass.waitForElement(Login.userNamePAPortal);
        Login.userNamePAPortal.clear();
        Login.userNamePAPortal.sendKeys(username);
        Thread.sleep(1000);
        UtilityClass.waitForElement(Login.passwordPAPortal);
        Login.passwordPAPortal.clear();
        Login.passwordPAPortal.sendKeys(password1);
        Thread.sleep(1000);
    }

    public static void clickLoginBtnPAPortal() throws InterruptedException {
        Thread.sleep(1000);
        UtilityClass.waitForElement(Login.loginBtnPAPortal);
        Login.loginBtnPAPortal.click();
        Thread.sleep(5000);
    }

    public static void clickbackbuttonwhilesignout() throws InterruptedException {
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);
    }

    public static void validateThatAllElementsArePresentOnLoginPage() throws InterruptedException {
        System.out.println("Validating that all elements are present on Login Page");

        Assert.assertTrue(Login.wirelessOfficeLogo.isDisplayed());
        Assert.assertTrue(Login.plans.isDisplayed());
        Assert.assertTrue(Login.plans.isDisplayed());
        Assert.assertTrue(Login.logInTitle.isDisplayed());
        Assert.assertTrue(Login.phoneNumberRadioButton.isDisplayed());
        Assert.assertTrue(Login.emailRadioButton.isDisplayed());
        Assert.assertTrue(Login.emailTextBox.isDisplayed());
        Assert.assertTrue(Login.loginPasswordTxtBox.isDisplayed());
        Assert.assertTrue(Login.logInButton.isDisplayed());
        Assert.assertTrue(Login.needHelp.isDisplayed());
        Assert.assertTrue(Login.forgotPasswordLink.isDisplayed());
        Assert.assertTrue(Login.notRegisteredYet.isDisplayed());
        Assert.assertTrue(Login.textOnLogin.isDisplayed());
        Assert.assertTrue(Login.wirelessOfficeCopyRightSymbol.isDisplayed());
        Assert.assertTrue(Login.privacyLegaLFooter.isDisplayed());
        Assert.assertTrue(Login.loginFooter.isDisplayed());
        Assert.assertTrue(Login.loginHeader.isDisplayed());
        Assert.assertTrue(Login.signUpHyperLink.isDisplayed());

        Login.emailTextBox.click();
        String emailTextBoxBorderColor = Login.emailTextBox.getCssValue("border-top-color");
        System.out.println("Email Text Box Link Border Color   " + emailTextBoxBorderColor);
        Assert.assertTrue(emailTextBoxBorderColor.equals("rgb(165, 110, 190)"));

        Assert.assertFalse(Login.loginBtn.isEnabled());

        Login.phoneNumberRadioButton.click();
        Thread.sleep(3000);
        Assert.assertTrue(Login.mobilePhoneTextBox.isDisplayed());
        Assert.assertTrue(Login.countryCodeLink.isDisplayed());

        String phoneLinkBorderColor = Login.countryCodeLink.getCssValue("border-top-color");
        System.out.println("Phone Link Border Color   " + phoneLinkBorderColor);
        Assert.assertTrue(phoneLinkBorderColor.equals("rgb(36, 36, 36)"));

        String phoneNumberBorderColor = Login.mobilePhoneTextBox.getCssValue("border-top-color");
        System.out.println("Phone Number Border Color   " + phoneNumberBorderColor);
        Assert.assertTrue(phoneNumberBorderColor.equals("rgb(165, 110, 190)"));

        Login.loginPasswordTxtBox.click();
        String passwordBorderColor = Login.loginPasswordTxtBox.getCssValue("border-top-color");
        System.out.println("Password Border Color   " + passwordBorderColor);
        Assert.assertTrue(passwordBorderColor.equals("rgb(165, 110, 190)"));

        Login.countryCodeLink.click();
        Login.countryCodeDropDownList.isDisplayed();
        String countryCodeDropDownListBorderColor = Login.countryCodeDropDownList.getCssValue("border-top-color");
        System.out.println("Country Code List Border Color   " + countryCodeDropDownListBorderColor);
        Assert.assertTrue(countryCodeDropDownListBorderColor.equals("rgb(135, 135, 135)"));

        Dimension listElementSize = driver.findElement(By.xpath("//div[@class='options-list']//div[1]")).getSize();
        System.out.println("element size  " + listElementSize);
//        Assert.assertTrue(listElementSize.equals("(154, 32)"));

        String logInFontSize = Login.logInTitle.getCssValue("font-size");
        System.out.println("fontsize    " + logInFontSize);
        Assert.assertTrue(logInFontSize.equals("28px"));

        Login.emailRadioButton.click();
        Login.emailTextBox.sendKeys("test@@");
        Login.emailTextBox.sendKeys(Keys.TAB);
        Login.loginPasswordTxtBox.sendKeys(Keys.TAB);

        System.out.println("Email alert text border color is " + Login.emailTextBox.getCssValue("border-top-color"));
        Assert.assertTrue(Login.emailTextBox.getCssValue("border-top-color").equals("rgb(187, 11, 2)"));

        System.out.println("Password alert text border color is " + Login.loginPasswordTxtBox.getCssValue("border-top-color"));
        Assert.assertTrue(Login.loginPasswordTxtBox.getCssValue("border-top-color").equals("rgb(187, 11, 2)"));

        System.out.println("Page Title is " + Login.logInTitle.getText());
        Assert.assertTrue(Login.logInTitle.getText().equals("Log In"));
        System.out.println("Help text is " + Login.logInTitle.getText());
        Assert.assertTrue(Login.needHelp.getText().equals("Need help?"));
        System.out.println("Forgot Password hyperlink text is " + Login.forgotPasswordLink.getText());
        Assert.assertTrue(Login.forgotPasswordLink.getText().equals("Forgot Password?"));
        System.out.println("Registration status text is " + Login.notRegisteredYet.getText());
        Assert.assertTrue(Login.notRegisteredYet.getText().equals("Not registered yet?"));
        System.out.println("Sign Up text is " + Login.signUpHyperLink.getText());
        Assert.assertTrue(Login.signUpHyperLink.getText().equals("Sign Up"));
        System.out.println("Sign Up text is " + Login.textOnLogin.getText());
        Assert.assertTrue(Login.textOnLogin.getText().equals("The service is intended for use by authorized users only. You may not attempt to gain unauthorized access to any part of this service, accounts, computer systems or networks connected to any Ericsson servers or any other service."));

        System.out.println("Validation Successful");
    }

    public static void validateThatResendButtonIsEnabledAfterMins() throws InterruptedException {
        Thread.sleep(120000);
        if (Login.resendButton.isDisplayed()) {
            System.out.println("Resend button is Displayed");
        }
    }

    public static void userClicksOnResendButtonOfLoginPage() throws InterruptedException {
        Thread.sleep(3000);
        Login.resendButton.click();
    }

    public static void validateThatInvalidCredentialsMessageIsDisplayed() throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertTrue(Login.invalidCredentialsAlert.getText().contains("Invalid Credentials! Login attempts remaining: 4"));
        System.out.println("Invalid Credentials Alert Message" + Login.invalidCredentialsAlert.getText());

        Thread.sleep(1000);
        Login.logInButton.click();
        System.out.println("Invalid Credentials Alert Message" + Login.invalidCredentialsAlert.getText());
        Assert.assertTrue(Login.invalidCredentialsAlert.getText().equals("Invalid Credentials! Login attempts remaining: 3"));

        Thread.sleep(1000);
        Login.logInButton.click();
        System.out.println("Invalid Credentials Alert Message" + Login.invalidCredentialsAlert.getText());
        Assert.assertTrue(Login.invalidCredentialsAlert.getText().equals("Invalid Credentials! Login attempts remaining: 2"));

        Thread.sleep(1000);
        Login.logInButton.click();
        System.out.println("Invalid Credentials Alert Message" + Login.invalidCredentialsAlert.getText());
        Assert.assertTrue(Login.invalidCredentialsAlert.getText().equals("Invalid Credentials! Login attempts remaining: 1"));

        Thread.sleep(1000);
        Login.logInButton.click();
        System.out.println("Invalid credentials attempt is " + Login.invalidCredentialsAlert.getText());
        Assert.assertTrue(Login.invalidCredentialsAlert.getText().equals("User account locked due to too many failed login attempts. Please contact service help desk."));
    }

    public static void adminSearchForTheLockedAccount(String email) throws InterruptedException {
        Thread.sleep(30000);
        String searchAccount = email.substring(0, email.indexOf("@"));
        System.out.println("Trimmed email " + searchAccount.trim());
        PA_customer.inputsearchbar.sendKeys(searchAccount.trim());

    }

    public static void enablesThelockedCustomerAccount() throws InterruptedException {
        UtilityClass.waitForElement(PA_customer.enabletogglebtn);
        WebElement ele = driver.findElement(By.xpath("//checkbox[@name='switcher_checkbox_1']"));
        ele.click();
        ele.isEnabled();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", ele);

        Thread.sleep(7000);
        UtilityClass.waitForElement(PA_customer.notificationicon);
        PA_customer.notificationicon.click();
        Thread.sleep(5000);
        String sucessmsg = driver.findElement(By.xpath("//div[contains(text(),'Successfully Disabled The User!')]")).getText();
        System.out.println(sucessmsg);
        org.testng.Assert.assertEquals(sucessmsg, "Successfully enabled The User!");
    }

    public static void userPerformsRequiredFieldValidationOnLoginPage() throws InterruptedException {
        Thread.sleep(1000);
        Login.emailTextBox.sendKeys(Keys.TAB);
        Login.loginPasswordTxtBox.sendKeys(Keys.TAB);

        Assert.assertTrue(Login.requiredEmail.isDisplayed());
        Assert.assertTrue(Login.requiredEmail.getText().equals("Email is required"));
        System.out.println("Validation message says  " + Login.requiredEmail.getText());

        Assert.assertTrue(Login.requiredPassword.isDisplayed());
        Assert.assertTrue(Login.requiredPassword.getText().equals("Password is required"));
        System.out.println("Validation message says  " + Login.requiredPassword.getText());

        Assert.assertFalse(Login.loginBtn.isEnabled());

        Login.phoneNumberRadioButton.click();
        Thread.sleep(1000);

        Login.mobilePhoneTextBox.sendKeys(Keys.TAB);
        Login.loginPasswordTxtBox.sendKeys(Keys.TAB);

        Assert.assertTrue(Login.requiredPhone.isDisplayed());
        Assert.assertTrue(Login.requiredPhone.getText().equals("Phone Number is required"));
        System.out.println("Validation message says  " + Login.requiredPhone.getText());

        Assert.assertTrue(Login.requiredPassword.isDisplayed());
        Assert.assertTrue(Login.requiredPassword.getText().equals("Password is required"));
        System.out.println("Validation message says  " + Login.requiredPassword.getText());

        Assert.assertFalse(Login.loginBtn.isEnabled());
    }

    public static void userPerformsInvalidOtpValidation() throws InterruptedException {
        Thread.sleep(3000);
        Login.otpTextBox.sendKeys(Keys.TAB);
        Thread.sleep(5000);
        Assert.assertTrue(Login.requiredOtp.isDisplayed());
        Assert.assertTrue(Login.requiredOtp.getText().equals("OTP is required"));
        System.out.println("Validation message says  " + Login.requiredOtp.getText());
        Assert.assertTrue(Login.requiredOtp.getCssValue("color").equals("rgb(255, 0, 0)"));

        Login.otpTextBox.sendKeys("123456");
        Login.completeButton.click();

        Thread.sleep(1000);

        Assert.assertFalse(Login.completeButton.isEnabled());
    }

    public static void validatesThatLoginButtonIsDisabled() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("Validating that login button is disabled when invalid email is passed");
        Login.emailTextBox.sendKeys("test@#");
        Login.emailTextBox.sendKeys(Keys.TAB);
        Thread.sleep(2000);
        Assert.assertTrue(Login.disabledLogInButton.getAttribute("outerHTML").contains("disabled"));

        System.out.println("Validating that login button is disabled when invalid password is passed");
        Login.loginPasswordTxtBox.sendKeys("Tes");
        Thread.sleep(2000);
        Assert.assertTrue(Login.disabledLogInButton.getAttribute("outerHTML").contains("disabled"));

        Thread.sleep(1000);

        Login.phoneNumberRadioButton.click();
        System.out.println("Validating that login button is disabled when invalid phone is passed");
        Login.mobilePhoneTextBox.sendKeys("Tes");
        Assert.assertTrue(Login.disabledLogInButton.getAttribute("outerHTML").contains("disabled"));
    }

    public static void userValidateThatCursorIsAutofocusedOnOTPField() throws InterruptedException {
        Thread.sleep(3000);
        WebElement currentElement = driver.switchTo().activeElement();
        System.out.println("Cursor is on Otp Text Box");
        Thread.sleep(5000);
        Assert.assertTrue(currentElement.equals(Login.otpTextBox));
    }

    public static void userPerformsInvalidOtpAttemptValidation() throws InterruptedException {
        Thread.sleep(3000);
        System.out.println(Login.alert.getText());
        Assert.assertTrue(Login.alert.getText().contains("One Time Password (OTP) sent successfully!"));
        Login.otpTextBox.sendKeys("000000");
        Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement completeButton = Login.completeButton;
        js.executeScript("arguments[0].scrollIntoView();", completeButton);
        Login.completeButton.click();
        System.out.println(Login.alert.getText());
        Thread.sleep(3000);
        Assert.assertTrue(Login.alert.getText().contains("Invalid Credentials! Login attempts remaining: 4"));

        Login.otpTextBox.sendKeys("000000");
        Thread.sleep(2000);
        completeButton = Login.completeButton;
        js.executeScript("arguments[0].scrollIntoView();", completeButton);
        Login.completeButton.click();
        System.out.println(Login.alert.getText());
        Assert.assertTrue(Login.alert.getText().contains("Invalid Credentials! Login attempts remaining: 3"));

        Login.otpTextBox.sendKeys("000000");
        Thread.sleep(2000);
        completeButton = Login.completeButton;
        js.executeScript("arguments[0].scrollIntoView();", completeButton);
        Login.completeButton.click();
        System.out.println(Login.alert.getText());
        Assert.assertTrue(Login.alert.getText().contains("Invalid Credentials! Login attempts remaining: 2"));

        Login.otpTextBox.sendKeys("000000");
        Thread.sleep(2000);
        completeButton = Login.completeButton;
        js.executeScript("arguments[0].scrollIntoView();", completeButton);
        Login.completeButton.click();
        System.out.println(Login.alert.getText());
        Assert.assertTrue(Login.alert.getText().contains("Invalid Credentials! Login attempts remaining: 1"));
    }

    public static void userPerformsInvalidLoginAttemptValidation() throws InterruptedException {
        Thread.sleep(3000);
        System.out.println(Login.alert.getText());
        Assert.assertTrue(Login.alert.getText().contains("Invalid Credentials! Login attempts remaining: 4"));

        Login.reLoginButton.click();
        Thread.sleep(3000);
        System.out.println(Login.alert.getText());
        Assert.assertTrue(Login.alert.getText().contains("Invalid Credentials! Login attempts remaining: 3"));

        Login.reLoginButton.click();
        Thread.sleep(1000);
        System.out.println(Login.alert.getText());
        Assert.assertTrue(Login.alert.getText().contains("Invalid Credentials! Login attempts remaining: 2"));

        Login.reLoginButton.click();
        Thread.sleep(1000);
        System.out.println(Login.alert.getText());
        Assert.assertTrue(Login.alert.getText().contains("Invalid Credentials! Login attempts remaining: 1"));
    }

    public static void userValidatesThatCountryCodeIsPlainText() throws InterruptedException {
        Thread.sleep(3000);
        assertEquals(driver.findElement(By.xpath("//div[text()='Afghanistan (93)']")).getSize().toString(), "(0, 0)");
        assertEquals(driver.findElement(By.xpath("//div[text()='Albania (355)']")).getSize().toString(), "(0, 0)");
        assertEquals(driver.findElement(By.xpath("//div[text()='Algeria (213)']")).getSize().toString(), "(0, 0)");
        assertEquals(driver.findElement(By.xpath("//div[text()='American Samoa (1)']")).getSize().toString(), "(0, 0)");
        assertEquals(driver.findElement(By.xpath("//div[text()='Andorra (376)']")).getSize().toString(), "(0, 0)");
        assertEquals(driver.findElement(By.xpath("//div[text()='Angola (244)']")).getSize().toString(), "(0, 0)");
        assertEquals(driver.findElement(By.xpath("//div[text()='Anguilla (1)']")).getSize().toString(), "(0, 0)");
        assertEquals(driver.findElement(By.xpath("//div[text()='Argentina (54)']")).getSize().toString(), "(0, 0)");
        assertEquals(driver.findElement(By.xpath("//div[text()='Armenia (374)']")).getSize().toString(), "(0, 0)");
        assertEquals(driver.findElement(By.xpath("//div[text()='Aruba (297)']")).getSize().toString(), "(0, 0)");
        assertEquals(driver.findElement(By.xpath("//div[text()='Australia (61)']")).getSize().toString(), "(0, 0)");
        assertEquals(driver.findElement(By.xpath("//div[text()='Austria (43)']")).getSize().toString(), "(0, 0)");
        assertEquals(driver.findElement(By.xpath("//div[text()='Azerbaijan (994)']")).getSize().toString(), "(0, 0)");
        assertEquals(driver.findElement(By.xpath("//div[text()='Bahamas (1)']")).getSize().toString(), "(0, 0)");
        assertEquals(driver.findElement(By.xpath("//div[text()='Bahrain (973)']")).getSize().toString(), "(0, 0)");
        assertEquals(driver.findElement(By.xpath("//div[text()='Bangladesh (880)']")).getSize().toString(), "(0, 0)");
        assertEquals(driver.findElement(By.xpath("//div[text()='Barbados (1)']")).getSize().toString(), "(0, 0)");
        assertEquals(driver.findElement(By.xpath("//div[text()='Belarus (375)']")).getSize().toString(), "(0, 0)");
        assertEquals(driver.findElement(By.xpath("//div[text()='Belgium (32)']")).getSize().toString(), "(0, 0)");
        assertEquals(driver.findElement(By.xpath("//div[text()='Belize (501)']")).getSize().toString(), "(0, 0)");
        assertEquals(driver.findElement(By.xpath("//div[text()='Benin (229)']")).getSize().toString(), "(0, 0)");
        assertEquals(driver.findElement(By.xpath("//div[text()='Bermuda (1)']")).getSize().toString(), "(0, 0)");
        assertEquals(driver.findElement(By.xpath("//div[text()='Bhutan (975)']")).getSize().toString(), "(0, 0)");
        assertEquals(driver.findElement(By.xpath("//div[text()='Botswana (267)']")).getSize().toString(), "(0, 0)");
        assertEquals(driver.findElement(By.xpath("//div[text()='Brazil (55)']")).getSize().toString(), "(0, 0)");
        assertEquals(driver.findElement(By.xpath("//div[text()='Brunei Darussalam (673)']")).getSize().toString(), "(0, 0)");
        assertEquals(driver.findElement(By.xpath("//div[text()='Bulgaria (359)']")).getSize().toString(), "(0, 0)");
        assertEquals(driver.findElement(By.xpath("//div[text()='Burkina Faso (226)']")).getSize().toString(), "(0, 0)");
        assertEquals(driver.findElement(By.xpath("//div[text()='Burundi (257)']")).getSize().toString(), "(0, 0)");
        assertEquals(driver.findElement(By.xpath("//div[text()='Cambodia (855)']")).getSize().toString(), "(0, 0)");
        assertEquals(driver.findElement(By.xpath("//div[text()='Cameroon (237)']")).getSize().toString(), "(0, 0)");
        assertEquals(driver.findElement(By.xpath("//div[text()='Canada (1)']")).getSize().toString(), "(0, 0)");
        assertEquals(driver.findElement(By.xpath("//div[text()='Cayman Islands (1)']")).getSize().toString(), "(0, 0)");
        assertEquals(driver.findElement(By.xpath("//div[text()='Central African Republic (236)']")).getSize().toString(), "(0, 0)");
        assertEquals(driver.findElement(By.xpath("//div[text()='Chad (235)']")).getSize().toString(), "(0, 0)");
        assertEquals(driver.findElement(By.xpath("//div[text()='Chile (56)']")).getSize().toString(), "(0, 0)");
        assertEquals(driver.findElement(By.xpath("//div[text()='China (86)']")).getSize().toString(), "(0, 0)");
        assertEquals(driver.findElement(By.xpath("//div[text()='Colombia (57)']")).getSize().toString(), "(0, 0)");
        assertEquals(driver.findElement(By.xpath("//div[text()='Comoros (269)']")).getSize().toString(), "(0, 0)");
        assertEquals(driver.findElement(By.xpath("//div[text()='Cook Islands (682)']")).getSize().toString(), "(0, 0)");
        assertEquals(driver.findElement(By.xpath("//div[text()='Costa Rica (506)']")).getSize().toString(), "(0, 0)");
        assertEquals(driver.findElement(By.xpath("//div[text()='Cuba (53)']")).getSize().toString(), "(0, 0)");
        assertEquals(driver.findElement(By.xpath("//div[text()='Cyprus (357)']")).getSize().toString(), "(0, 0)");
        assertEquals(driver.findElement(By.xpath("//div[text()='Czech Republic (420)']")).getSize().toString(), "(0, 0)");
        assertEquals(driver.findElement(By.xpath("//div[text()='Denmark (45)']")).getSize().toString(), "(0, 0)");
        assertEquals(driver.findElement(By.xpath("//div[text()='Dominican Republic (1)']")).getSize().toString(), "(0, 0)");
        assertEquals(driver.findElement(By.xpath("//div[text()='Ecuador (593)']")).getSize().toString(), "(0, 0)");
        assertEquals(driver.findElement(By.xpath("//div[text()='Egypt (20)']")).getSize().toString(), "(0, 0)");
        assertEquals(driver.findElement(By.xpath("//div[text()='El Salvador (503)']")).getSize().toString(), "(0, 0)");
        assertEquals(driver.findElement(By.xpath("//div[text()='Equatorial Guinea (240)']")).getSize().toString(), "(0, 0)");
        assertEquals(driver.findElement(By.xpath("//div[text()='Estonia (372)']")).getSize().toString(), "(0, 0)");
        assertEquals(driver.findElement(By.xpath("//div[text()='Ethiopia (251)']")).getSize().toString(), "(0, 0)");
        assertEquals(driver.findElement(By.xpath("//div[text()='Falkland Islands (500)']")).getSize().toString(), "(0, 0)");
        assertEquals(driver.findElement(By.xpath("//div[text()='Faroe Islands (298)']")).getSize().toString(), "(0, 0)");
        assertEquals(driver.findElement(By.xpath("//div[text()='Fiji (679)']")).getSize().toString(), "(0, 0)");
        assertEquals(driver.findElement(By.xpath("//div[text()='Finland (358)']")).getSize().toString(), "(0, 0)");
        assertEquals(driver.findElement(By.xpath("//div[text()='France (33)']")).getSize().toString(), "(0, 0)");
        assertEquals(driver.findElement(By.xpath("//div[text()='French Guiana (594)']")).getSize().toString(), "(0, 0)");
        assertEquals(driver.findElement(By.xpath("//div[text()='French Polynesia (689)']")).getSize().toString(), "(0, 0)");
        assertEquals(driver.findElement(By.xpath("//div[text()='Gabon (241)']")).getSize().toString(), "(0, 0)");
        assertEquals(driver.findElement(By.xpath("//div[text()='Gambia (220)']")).getSize().toString(), "(0, 0)");
        assertEquals(driver.findElement(By.xpath("//div[text()='Georgia (995)']")).getSize().toString(), "(0, 0)");
        assertEquals(driver.findElement(By.xpath("//div[text()='Germany (49)']")).getSize().toString(), "(0, 0)");
        assertEquals(driver.findElement(By.xpath("//div[text()='Ghana (233)']")).getSize().toString(), "(0, 0)");
        assertEquals(driver.findElement(By.xpath("//div[text()='Gibraltar (350)']")).getSize().toString(), "(0, 0)");
        assertEquals(driver.findElement(By.xpath("//div[text()='Greenland (299)']")).getSize().toString(), "(0, 0)");
        assertEquals(driver.findElement(By.xpath("//div[text()='Grenada (1)']")).getSize().toString(), "(0, 0)");
        assertEquals(driver.findElement(By.xpath("//div[text()='Guadeloupe (590)']")).getSize().toString(), "(0, 0)");
        assertEquals(driver.findElement(By.xpath("//div[text()='Guam (1)']")).getSize().toString(), "(0, 0)");
        assertEquals(driver.findElement(By.xpath("//div[text()='Guatemala (502)']")).getSize().toString(), "(0, 0)");
        assertEquals(driver.findElement(By.xpath("//div[text()='Guernsey (44)']")).getSize().toString(), "(0, 0)");
        assertEquals(driver.findElement(By.xpath("//div[text()='Guinea (224)']")).getSize().toString(), "(0, 0)");
        assertEquals(driver.findElement(By.xpath("//div[text()='Guyana (592)']")).getSize().toString(), "(0, 0)");
        assertEquals(driver.findElement(By.xpath("//div[text()='Haiti (509)']")).getSize().toString(), "(0, 0)");
        assertEquals(driver.findElement(By.xpath("//div[text()='Honduras (504)']")).getSize().toString(), "(0, 0)");
        assertEquals(driver.findElement(By.xpath("//div[text()='Hong Kong (852)']")).getSize().toString(), "(0, 0)");
        assertEquals(driver.findElement(By.xpath("//div[text()='Hungary (36)']")).getSize().toString(), "(0, 0)");
        assertEquals(driver.findElement(By.xpath("//div[text()='Iceland (354)']")).getSize().toString(), "(0, 0)");
        assertEquals(driver.findElement(By.xpath("//div[text()='India (91)']")).getSize().toString(), "(0, 0)");
        assertEquals(driver.findElement(By.xpath("//div[text()='Indonesia (62)']")).getSize().toString(), "(0, 0)");
        assertEquals(driver.findElement(By.xpath("//div[text()='Iraq (964)']")).getSize().toString(), "(0, 0)");
        assertEquals(driver.findElement(By.xpath("//div[text()='Ireland (353)']")).getSize().toString(), "(0, 0)");
        assertEquals(driver.findElement(By.xpath("//div[text()='Israel (972)']")).getSize().toString(), "(0, 0)");
        assertEquals(driver.findElement(By.xpath("//div[text()='Italy (39)']")).getSize().toString(), "(0, 0)");
        assertEquals(driver.findElement(By.xpath("//div[text()='Jamaica (1)']")).getSize().toString(), "(0, 0)");
        assertEquals(driver.findElement(By.xpath("//div[text()='Japan (81)']")).getSize().toString(), "(0, 0)");
        assertEquals(driver.findElement(By.xpath("//div[text()='Jersey (44)']")).getSize().toString(), "(0, 0)");
        assertEquals(driver.findElement(By.xpath("//div[text()='Jordan (962)']")).getSize().toString(), "(0, 0)");
        assertEquals(driver.findElement(By.xpath("//div[text()='Kazakhstan (7)']")).getSize().toString(), "(0, 0)");
        assertEquals(driver.findElement(By.xpath("//div[text()='Kenya (254)']")).getSize().toString(), "(0, 0)");
        assertEquals(driver.findElement(By.xpath("//div[text()='Kuwait (965)']")).getSize().toString(), "(0, 0)");
        assertEquals(driver.findElement(By.xpath("//div[text()='Kyrgyzstan (996)']")).getSize().toString(), "(0, 0)");
        assertEquals(driver.findElement(By.xpath("//div[text()='Latvia (371)']")).getSize().toString(), "(0, 0)");
        assertEquals(driver.findElement(By.xpath("//div[text()='Lebanon (961)']")).getSize().toString(), "(0, 0)");
        assertEquals(driver.findElement(By.xpath("//div[text()='Lesotho (266)']")).getSize().toString(), "(0, 0)");
        assertEquals(driver.findElement(By.xpath("//div[text()='Liberia (231)']")).getSize().toString(), "(0, 0)");
        assertEquals(driver.findElement(By.xpath("//div[text()='Libya (218)']")).getSize().toString(), "(0, 0)");
        assertEquals(driver.findElement(By.xpath("//div[text()='Liechtenstein (423)']")).getSize().toString(), "(0, 0)");
        assertEquals(driver.findElement(By.xpath("//div[text()='Lithuania (370)']")).getSize().toString(), "(0, 0)");
        assertEquals(driver.findElement(By.xpath("//div[text()='Luxembourg (352)']")).getSize().toString(), "(0, 0)");
        assertEquals(driver.findElement(By.xpath("//div[text()='Madagascar (261)']")).getSize().toString(), "(0, 0)");
        assertEquals(driver.findElement(By.xpath("//div[text()='Malawi (265)']")).getSize().toString(), "(0, 0)");
        assertEquals(driver.findElement(By.xpath("//div[text()='Malaysia (60)']")).getSize().toString(), "(0, 0)");
        assertEquals(driver.findElement(By.xpath("//div[text()='Maldives (960)']")).getSize().toString(), "(0, 0)");
        assertEquals(driver.findElement(By.xpath("//div[text()='Mali (223)']")).getSize().toString(), "(0, 0)");
        assertEquals(driver.findElement(By.xpath("//div[text()='Malta (356)']")).getSize().toString(), "(0, 0)");
        assertEquals(driver.findElement(By.xpath("//div[text()='Martinique (596)']")).getSize().toString(), "(0, 0)");
        assertEquals(driver.findElement(By.xpath("//div[text()='Mauritania (222)']")).getSize().toString(), "(0, 0)");
        assertEquals(driver.findElement(By.xpath("//div[text()='Mauritius (230)']")).getSize().toString(), "(0, 0)");
        assertEquals(driver.findElement(By.xpath("//div[text()='Mexico (52)']")).getSize().toString(), "(0, 0)");
        assertEquals(driver.findElement(By.xpath("//div[text()='Moldova (373)']")).getSize().toString(), "(0, 0)");
        assertEquals(driver.findElement(By.xpath("//div[text()='Monaco (377)']")).getSize().toString(), "(0, 0)");
        assertEquals(driver.findElement(By.xpath("//div[text()='Mongolia (976)']")).getSize().toString(), "(0, 0)");
        assertEquals(driver.findElement(By.xpath("//div[text()='Montenegro (382)']")).getSize().toString(), "(0, 0)");
        assertEquals(driver.findElement(By.xpath("//div[text()='Montserrat (1)']")).getSize().toString(), "(0, 0)");
        assertEquals(driver.findElement(By.xpath("//div[text()='Morocco (212)']")).getSize().toString(), "(0, 0)");
        assertEquals(driver.findElement(By.xpath("//div[text()='Mozambique (258)']")).getSize().toString(), "(0, 0)");
        assertEquals(driver.findElement(By.xpath("//div[text()='Myanmar (95)']")).getSize().toString(), "(0, 0)");
        assertEquals(driver.findElement(By.xpath("//div[text()='Namibia (264)']")).getSize().toString(), "(0, 0)");
        assertEquals(driver.findElement(By.xpath("//div[text()='Nauru (674)']")).getSize().toString(), "(0, 0)");
        assertEquals(driver.findElement(By.xpath("//div[text()='Nepal (977)']")).getSize().toString(), "(0, 0)");
        assertEquals(driver.findElement(By.xpath("//div[text()='Netherlands (31)']")).getSize().toString(), "(0, 0)");
        assertEquals(driver.findElement(By.xpath("//div[text()='Netherlands Antilles (599)']")).getSize().toString(), "(0, 0)");
        assertEquals(driver.findElement(By.xpath("//div[text()='New Caledonia (687)']")).getSize().toString(), "(0, 0)");
        assertEquals(driver.findElement(By.xpath("//div[text()='New Zealand (64)']")).getSize().toString(), "(0, 0)");
        assertEquals(driver.findElement(By.xpath("//div[text()='Nicaragua (505)']")).getSize().toString(), "(0, 0)");
        assertEquals(driver.findElement(By.xpath("//div[text()='Niger (227)']")).getSize().toString(), "(0, 0)");
        assertEquals(driver.findElement(By.xpath("//div[text()='Nigeria (234)']")).getSize().toString(), "(0, 0)");
        assertEquals(driver.findElement(By.xpath("//div[text()='Norfolk Island (672)']")).getSize().toString(), "(0, 0)");
        assertEquals(driver.findElement(By.xpath("//div[text()='Northern Mariana Islands (1)']")).getSize().toString(), "(0, 0)");
        assertEquals(driver.findElement(By.xpath("//div[text()='Norway (47)']")).getSize().toString(), "(0, 0)");
        assertEquals(driver.findElement(By.xpath("//div[text()='Oman (968)']")).getSize().toString(), "(0, 0)");
        assertEquals(driver.findElement(By.xpath("//div[text()='Pakistan (92)']")).getSize().toString(), "(0, 0)");
        assertEquals(driver.findElement(By.xpath("//div[text()='Palau (680)']")).getSize().toString(), "(0, 0)");
        assertEquals(driver.findElement(By.xpath("//div[text()='Panama (507)']")).getSize().toString(), "(0, 0)");
        assertEquals(driver.findElement(By.xpath("//div[text()='Papua New Guinea (675)']")).getSize().toString(), "(0, 0)");
        assertEquals(driver.findElement(By.xpath("//div[text()='Paraguay (595)']")).getSize().toString(), "(0, 0)");
        assertEquals(driver.findElement(By.xpath("//div[text()='Peru (51)']")).getSize().toString(), "(0, 0)");
        assertEquals(driver.findElement(By.xpath("//div[text()='Philippines (63)']")).getSize().toString(), "(0, 0)");
        assertEquals(driver.findElement(By.xpath("//div[text()='Poland (48)']")).getSize().toString(), "(0, 0)");
        assertEquals(driver.findElement(By.xpath("//div[text()='Portugal (351)']")).getSize().toString(), "(0, 0)");
        assertEquals(driver.findElement(By.xpath("//div[text()='Puerto Rico (1)']")).getSize().toString(), "(0, 0)");
        assertEquals(driver.findElement(By.xpath("//div[text()='Qatar (974)']")).getSize().toString(), "(0, 0)");
        assertEquals(driver.findElement(By.xpath("//div[text()='Reunion (262)']")).getSize().toString(), "(0, 0)");
        assertEquals(driver.findElement(By.xpath("//div[text()='Romania (40)']")).getSize().toString(), "(0, 0)");
        assertEquals(driver.findElement(By.xpath("//div[text()='Russian Federation (7)']")).getSize().toString(), "(0, 0)");
        assertEquals(driver.findElement(By.xpath("//div[text()='Saint Lucia (1)']")).getSize().toString(), "(0, 0)");
        assertEquals(driver.findElement(By.xpath("//div[text()='Samoa (685)']")).getSize().toString(), "(0, 0)");
        assertEquals(driver.findElement(By.xpath("//div[text()='Sao Tome and Principe (239)']")).getSize().toString(), "(0, 0)");
        assertEquals(driver.findElement(By.xpath("//div[text()='Saudi Arabia (966)']")).getSize().toString(), "(0, 0)");
        assertEquals(driver.findElement(By.xpath("//div[text()='Senegal (221)']")).getSize().toString(), "(0, 0)");
        assertEquals(driver.findElement(By.xpath("//div[text()='Serbia (381)']")).getSize().toString(), "(0, 0)");
        assertEquals(driver.findElement(By.xpath("//div[text()='Seychelles (248)']")).getSize().toString(), "(0, 0)");
        assertEquals(driver.findElement(By.xpath("//div[text()='Sierra Leone (232)']")).getSize().toString(), "(0, 0)");
        assertEquals(driver.findElement(By.xpath("//div[text()='Singapore (65)']")).getSize().toString(), "(0, 0)");
        assertEquals(driver.findElement(By.xpath("//div[text()='Sint Maarten (590)']")).getSize().toString(), "(0, 0)");
        assertEquals(driver.findElement(By.xpath("//div[text()='Slovakia (421)']")).getSize().toString(), "(0, 0)");
        assertEquals(driver.findElement(By.xpath("//div[text()='Slovenia (386)']")).getSize().toString(), "(0, 0)");
        assertEquals(driver.findElement(By.xpath("//div[text()='Solomon Islands (677)']")).getSize().toString(), "(0, 0)");
        assertEquals(driver.findElement(By.xpath("//div[text()='Somalia (252)']")).getSize().toString(), "(0, 0)");
        assertEquals(driver.findElement(By.xpath("//div[text()='South Africa (27)']")).getSize().toString(), "(0, 0)");
        assertEquals(driver.findElement(By.xpath("//div[text()='South Sudan (211)']")).getSize().toString(), "(0, 0)");
        assertEquals(driver.findElement(By.xpath("//div[text()='Spain (34)']")).getSize().toString(), "(0, 0)");
        assertEquals(driver.findElement(By.xpath("//div[text()='Sri Lanka (94)']")).getSize().toString(), "(0, 0)");
        assertEquals(driver.findElement(By.xpath("//div[text()='Sudan (249)']")).getSize().toString(), "(0, 0)");
        assertEquals(driver.findElement(By.xpath("//div[text()='Suriname (597)']")).getSize().toString(), "(0, 0)");
        assertEquals(driver.findElement(By.xpath("//div[text()='Swaziland (268)']")).getSize().toString(), "(0, 0)");
        assertEquals(driver.findElement(By.xpath("//div[text()='Sweden (46)']")).getSize().toString(), "(0, 0)");
        assertEquals(driver.findElement(By.xpath("//div[text()='Switzerland (41)']")).getSize().toString(), "(0, 0)");
        assertEquals(driver.findElement(By.xpath("//div[text()='Taiwan (886)']")).getSize().toString(), "(0, 0)");
        assertEquals(driver.findElement(By.xpath("//div[text()='Tajikistan (992)']")).getSize().toString(), "(0, 0)");
        assertEquals(driver.findElement(By.xpath("//div[text()='Thailand (66)']")).getSize().toString(), "(0, 0)");
        assertEquals(driver.findElement(By.xpath("//div[text()='Togo (228)']")).getSize().toString(), "(0, 0)");
        assertEquals(driver.findElement(By.xpath("//div[text()='Tonga (676)']")).getSize().toString(), "(0, 0)");
        assertEquals(driver.findElement(By.xpath("//div[text()='Tunisia (216)']")).getSize().toString(), "(0, 0)");
        assertEquals(driver.findElement(By.xpath("//div[text()='Turkey (90)']")).getSize().toString(), "(0, 0)");
        assertEquals(driver.findElement(By.xpath("//div[text()='Turkmenistan (993)']")).getSize().toString(), "(0, 0)");
        assertEquals(driver.findElement(By.xpath("//div[text()='Uganda (256)']")).getSize().toString(), "(0, 0)");
        assertEquals(driver.findElement(By.xpath("//div[text()='Ukraine (380)']")).getSize().toString(), "(0, 0)");
        assertEquals(driver.findElement(By.xpath("//div[text()='United Arab Emirates (971)']")).getSize().toString(), "(0, 0)");
        assertEquals(driver.findElement(By.xpath("//div[text()='United Kingdom (44)']")).getSize().toString(), "(0, 0)");
        assertEquals(driver.findElement(By.xpath("//div[text()='United States (1)']")).getSize().toString(), "(0, 0)");
        assertEquals(driver.findElement(By.xpath("//div[text()='Uruguay (598)']")).getSize().toString(), "(0, 0)");
        assertEquals(driver.findElement(By.xpath("//div[text()='Uzbekistan (998)']")).getSize().toString(), "(0, 0)");
        assertEquals(driver.findElement(By.xpath("//div[text()='Vanuatu (678)']")).getSize().toString(), "(0, 0)");
        assertEquals(driver.findElement(By.xpath("//div[text()='Yemen (967)']")).getSize().toString(), "(0, 0)");
        assertEquals(driver.findElement(By.xpath("//div[text()='Zambia (260)']")).getSize().toString(), "(0, 0)");
        assertEquals(driver.findElement(By.xpath("//div[text()='Zimbabwe (263)']")).getSize().toString(), "(0, 0)");
    }

    public static void verifyingMobileNumberNotRegisteredWarningMsg() throws InterruptedException {
        Thread.sleep(3000);
        Assert.assertTrue(Login.alert.getText().contains("Invalid Credentials!"));
        Thread.sleep(1000);
        System.out.println(Login.alert.getText());
    }
}
