package PagePanel;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import Pages.Login;
import Pages.Profile;
import Resource.LoggerHelper;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Pages.Register;
import Resource.BaseClass;
import Resource.JavaScriptExecute;
import Resource.UtilityClass;

public class RegisterPanel extends BaseClass {

    Register loginPage = new Register();
    Profile profile = new Profile();
    UtilityClass utilityClass = new UtilityClass();
    public static Logger log = LoggerHelper.getLogger(Register.class);
    static JavascriptExecutor js = (JavascriptExecutor) driver;
    public static String newEmailAccount;


    public RegisterPanel() {
        loginPage = PageFactory.initElements(driver, Register.class);
    }

    public static void getPageTitle() {
        String title = driver.getTitle();
        System.out.println("Title of page is: " + title);
    }

    public static void clickMenuLoginBtn() {
        UtilityClass.waitForElement(Register.loginMenu);
        Register.loginMenu.click();
    }

    public static void clickRegisterLink() {
        UtilityClass.waitForElement(Register.registerLink);
        Register.registerLink.click();
    }

    public static void CreateAccountWithEmailRadioBtn() {
        UtilityClass.waitForElement(Register.emailRadioBtn);
        Register.emailRadioBtn.click();
    }

    public static void enterEmailID() throws Throwable {
        UtilityClass.waitForElement(Register.emailTxtBox);
        UtilityClass.createFile();
        UtilityClass.writeFile();
        String emailTxt = UtilityClass.readEmailId();
        Register.emailTxtBox.sendKeys(emailTxt);
    }

    public static void enterPassword(String pwd) {
        UtilityClass.waitForElement(Register.createPasswordTxtBox);
        Register.createPasswordTxtBox.sendKeys(pwd);
    }

    public static void enterconfirmPassword(String confirmPwd) {
        UtilityClass.waitForElement(Register.confirmPasswordTxtBox);
        Register.confirmPasswordTxtBox.sendKeys(confirmPwd);
    }

    public static void selectTOSChkBox() {
        UtilityClass.waitForElement(Register.checkBoxTOS);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        JavaScriptExecute jsec = new JavaScriptExecute(driver);
        jsec.click(Register.checkBoxTOS);
    }

    public static void selectPTCChkBox() {
        UtilityClass.waitForElement(Register.checkBoxPTC);
        //Register.checkBoxPTC.click();
        JavaScriptExecute jsec = new JavaScriptExecute(driver);
        jsec.click(Register.checkBoxPTC);
    }

    public static void clickRegisterBtn() {
        UtilityClass.waitForElement(Register.registerButton);
        Register.registerButton.click();
    }

    public static void enterCode() {
        UtilityClass.waitForElement(Register.enterCodeTxtBox);
        Register.enterCodeTxtBox.sendKeys();
    }

    public static void signout() throws InterruptedException {
        Thread.sleep(2000);
        Register.Signout.click();
        String Urldisplay = driver.getCurrentUrl();
        Assert.assertEquals("https://portal-staging.eworx.ton5g.com/", Urldisplay);
        System.out.println("Current URL is  " + Urldisplay);
    }

    public static void clickCompleteBtn() throws InterruptedException {
        Thread.sleep(2000);
        UtilityClass.waitForElement(Register.registerButton);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement registerButton = Register.registerButton;
        js.executeScript("arguments[0].scrollIntoView();", registerButton);
        Register.registerButton.click();
        Thread.sleep(1000);
    }

    public static void loginToYopMail() throws Throwable {

        System.out.println("Opening a new tab");

        WebElement Element = driver.findElement(By.xpath("//button[normalize-space()='Resend']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", Element);
        js.executeScript("window.scrollBy(0,-350)", "");
        Thread.sleep(2000);
        String currentHandle = driver.getWindowHandle();

        Thread.sleep(3000);
        // open a new window
        js.executeScript("window.open()");

        String otpValue = "";
        //getting all the handles currently availabe
        Set<String> handles = driver.getWindowHandles();
        for (String actual : handles) {

            if (!actual.equalsIgnoreCase(currentHandle)) {
                //switching to the opened tab
                driver.switchTo().window(actual);
                driver.get("http://www.yopmail.com");
                Thread.sleep(5000);
                System.out.println(driver.getTitle());
                UtilityClass.waitForElement(Register.yopEmailTxtBox);
                String emailTxt = UtilityClass.readEmailId();
                Register.yopEmailTxtBox.sendKeys(emailTxt);

                UtilityClass.waitForElement(Register.checkYopInboxBtn);
                Register.checkYopInboxBtn.click();

                driver.switchTo().frame("ifmail");
                UtilityClass.waitForElement(Register.otpTxt);
                otpValue = Register.otpTxt.getText();
                System.out.println("Value of OTP is: " + otpValue);
                Thread.sleep(3000);
                driver.close();
            }
        }
        driver.switchTo().window(currentHandle);
        UtilityClass.waitForElement(Register.enterCodeTxtBox);
        Register.enterCodeTxtBox.sendKeys(otpValue);
    }

    public static void enteringMobileNumber(String mobile) throws InterruptedException {
        Thread.sleep(2000);
        UtilityClass.waitForElement(Register.mobileTextBox);
        Register.mobileTextBox.sendKeys(mobile);
        Thread.sleep(2000);

    }

    public static void enteringCreateandConfirmPwd(String createPassword, String confirmPassword) throws InterruptedException {
        Thread.sleep(2000);
        UtilityClass.waitForElement(Register.createPasswordTxtBox);
        Register.createPasswordTxtBox.sendKeys(createPassword);
        Thread.sleep(1000);
        UtilityClass.waitForElement(Register.confirmPasswordTxtBox);
        Register.confirmPasswordTxtBox.sendKeys(confirmPassword);
        Thread.sleep(1000);
    }

    public static void clickingTextMeOption() throws InterruptedException {
        Thread.sleep(4000);
        UtilityClass.waitForElement(Register.registerTextMeOption);
        Register.registerTextMeOption.click();
        Thread.sleep(5000);
    }

    public static void clickingFinalCompleteBtn() throws InterruptedException {
        Thread.sleep(18000);
        UtilityClass.waitForElement(Register.completeButton);
        Thread.sleep(2000);
    }

    public static void enteringPasswordMobileLogin(String password) throws InterruptedException {
        Thread.sleep(3000);
        UtilityClass.waitForElement(Register.mobileLoginPassword);
        Register.mobileLoginPassword.sendKeys(password);
        Thread.sleep(3000);

    }

    public static void clickingCallMeOption() throws InterruptedException {
        Thread.sleep(3000);
        UtilityClass.waitForElement(Register.phoneRegisterCallMeOption);
        Register.phoneRegisterCallMeOption.click();
        System.out.println("For Registering the account with mobile number,clicked call me option to get OTP");
    }

    public static void clickingInvalidMobileRegisterWarningMsgOkBtn() throws InterruptedException {
        Thread.sleep(1500);
        UtilityClass.waitForElement(Register.invalidMobileRegisterWarningMsgOkBtn);
        Register.invalidMobileRegisterWarningMsgOkBtn.click();
    }

    public static void verifyingSelectingAndEnablingMenu() throws InterruptedException {
        Thread.sleep(2000);
        UtilityClass.checkingSelectingAndEnabling();
    }

    public static void loginToYopMailWithEmail(String email) throws Throwable {

        System.out.println("Opening a new tab");

        WebElement Element = driver.findElement(By.xpath("//button[normalize-space()='Resend']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", Element);
        js.executeScript("window.scrollBy(0,-350)", "");
        Thread.sleep(2000);
        String currentHandle = driver.getWindowHandle();

        Thread.sleep(3000);
        // open a new window
        js.executeScript("window.open()");

        String otpValue = "";
        //getting all the handles currently availabe
        Set<String> handles = driver.getWindowHandles();
        for (String actual : handles) {

            if (!actual.equalsIgnoreCase(currentHandle)) {
                //switching to the opened tab
                driver.switchTo().window(actual);
                driver.get("http://www.yopmail.com");
                Thread.sleep(5000);
                System.out.println(driver.getTitle());
                UtilityClass.waitForElement(Register.yopEmailTxtBox);
                Register.yopEmailTxtBox.sendKeys(email);

                UtilityClass.waitForElement(Register.checkYopInboxBtn);
                Register.checkYopInboxBtn.click();

                driver.switchTo().frame("ifmail");
                UtilityClass.waitForElement(Register.otpTxt);
                otpValue = Register.otpTxt.getText();
                System.out.println("Value of OTP is: " + otpValue);
                Thread.sleep(3000);
                driver.close();
            }
        }
        driver.switchTo().window(currentHandle);
        UtilityClass.waitForElement(Register.enterCodeTxtBox);
        Register.enterCodeTxtBox.sendKeys(otpValue);
    }

    public static void enterDefaultPasswordE2E() {
        UtilityClass.waitForElement(Register.createPasswordTxtBox);
        Register.createPasswordTxtBox.sendKeys("12345@Testing");
    }

    public static void confirmDefaultPasswordE2E() {
        UtilityClass.waitForElement(Register.confirmPasswordTxtBox);
        Register.confirmPasswordTxtBox.sendKeys("12345@Testing");
    }

    public static void createEmailIDE2E() {
        UtilityClass.waitForElement(Register.emailTxtBox);
        newEmailAccount = "testcustomer" + ((long) Math.floor(Math.random() * 9_000_0L) + 1_000_0L) + "@yopmail.com";
        Register.emailTxtBox.sendKeys(newEmailAccount);
    }

    public static void loginToYopMailToFetchOtpE2E() throws InterruptedException {
        System.out.println("Opening a new tab");

        WebElement Element = driver.findElement(By.xpath("//button[normalize-space()='Resend']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", Element);
        js.executeScript("window.scrollBy(0,-350)", "");
        Thread.sleep(2000);
        String currentHandle = driver.getWindowHandle();

        Thread.sleep(3000);
        // open a new window
        js.executeScript("window.open()");

        String otpValue = "";
        //getting all the handles currently availabe
        Set<String> handles = driver.getWindowHandles();
        for (String actual : handles) {

            if (!actual.equalsIgnoreCase(currentHandle)) {
                //switching to the opened tab
                driver.switchTo().window(actual);
                driver.get("http://www.yopmail.com");
                Thread.sleep(5000);
                System.out.println(driver.getTitle());
                UtilityClass.waitForElement(Register.yopEmailTxtBox);
                Register.yopEmailTxtBox.clear();
                Register.yopEmailTxtBox.sendKeys(newEmailAccount);

                UtilityClass.waitForElement(Register.checkYopInboxBtn);
                Register.checkYopInboxBtn.click();

                driver.switchTo().frame("ifmail");
                UtilityClass.waitForElement(Register.otpTxt);
                otpValue = Register.otpTxt.getText();
                System.out.println("Value of OTP is: " + otpValue);
                Thread.sleep(3000);
                driver.close();
            }
        }
        driver.switchTo().window(currentHandle);
        UtilityClass.waitForElement(Register.enterCodeTxtBox);
        Register.enterCodeTxtBox.sendKeys(otpValue);
    }

    public static void enteredRegisteredEmail() {
        UtilityClass.waitForElement(Login.loginEmailTxtBox);
        Login.loginEmailTxtBox.sendKeys(newEmailAccount);
    }

    public static void enterPasswordForRegisteredAccount() {
        UtilityClass.waitForElement(Login.loginPasswordTxtBox);
        Login.loginPasswordTxtBox.sendKeys("12345@Testing");
    }


    public static void loginToSacMail() throws Throwable {

        System.out.println("Opening a new tab");

        WebElement Element = driver.findElement(By.xpath("(//div[@class='col-md-12'])"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", Element);
        js.executeScript("window.scrollBy(0,-350)", "");
        Thread.sleep(2000);
        String currentHandle = driver.getWindowHandle();

        Thread.sleep(5000);
        // open a new window
        js.executeScript("window.open()");

        String otpValue = "";
        //getting all the handles currently availabe
        Set<String> handles = driver.getWindowHandles();
        for (String actual : handles) {

            if (!actual.equalsIgnoreCase(currentHandle)) {
                //switching to the opened tab
                driver.switchTo().window(actual);
                driver.get("https://mailsac.com/");
                Thread.sleep(5000);
                System.out.println(driver.getTitle());
                UtilityClass.waitForElement(Register.mailSacEmailTextBox);
                String emailTxt = UtilityClass.readEmailId();
                Register.mailSacEmailTextBox.clear();
                Register.mailSacEmailTextBox.sendKeys(emailTxt);

                UtilityClass.waitForElement(Register.checkMailButtonMailSac);
                Register.checkMailButtonMailSac.click();

                UtilityClass.waitForElement(Register.clickingOtpContainsSacMail);
                Register.clickingOtpContainsSacMail.click();

                //	driver.switchTo().frame("ifmail");
                UtilityClass.waitForElement(Register.otpTxt);
                otpValue = Register.otpTxt.getText();
                System.out.println("Value of OTP is: " + otpValue);
                Thread.sleep(3000);
                driver.close();
            }
        }
        driver.switchTo().window(currentHandle);
        UtilityClass.waitForElement(Register.enterCodeTxtBox);
        Register.enterCodeTxtBox.sendKeys(otpValue);
    }


    public static void launchCAportalUrl() throws InterruptedException, IOException {
        Thread.sleep(2500);
        String url = UtilityClass.getUrl();
        driver.get(url);
        Thread.sleep(2000);
    }

    public static void launchCALoginportalUrl() throws InterruptedException {
        Thread.sleep(1500);
        driver.get("https://portal-staging.eworx.ton5g.com/login/");
        Thread.sleep(1000);
    }

    public static void loadPAPortalUrl() throws InterruptedException, AWTException {
        Thread.sleep(2000);
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
        String nw1 = iterator.next();
        driver.switchTo().window(nw1);
        driver.get("https://masterview-staging.eworx.ton5g.com/login/masterview");
        Thread.sleep(3000);
    }

    public static void launchMasterViewPortalUrl() throws InterruptedException {
        Thread.sleep(10000);
        driver.get("https://masterview-staging.eworx.ton5g.com/login/masterview");
        Thread.sleep(12000);

    }

    public static void loginToSacMailCAPAPortal(String emailid) throws Throwable {

        System.out.println("Opening a new tab");
        Thread.sleep(2000);
        String currentHandle = driver.getWindowHandle();

        Thread.sleep(3000);
        // open a new window
        js.executeScript("window.open()");

        String otpValue = "";
        //getting all the handles currently availabe
        Set<String> handles = driver.getWindowHandles();
        for (String actual : handles) {

            if (!actual.equalsIgnoreCase(currentHandle)) {
                //switching to the opened tab
                driver.switchTo().window(actual);
                driver.get("https://mailsac.com/");
                Thread.sleep(5000);
                System.out.println(driver.getTitle());
                UtilityClass.waitForElement(Register.mailSacEmailTextBox);
                Register.mailSacEmailTextBox.clear();
                Register.mailSacEmailTextBox.sendKeys(emailid);

                UtilityClass.waitForElement(Register.checkMailButtonMailSac);
                Register.checkMailButtonMailSac.click();

                UtilityClass.waitForElement(Register.clickingOtpContainsSacMail);
                Register.clickingOtpContainsSacMail.click();
                UtilityClass.waitForElement(Register.otpTxt);
                otpValue = Register.otpTxt.getText();
                System.out.println("Value of OTP is: " + otpValue);
                Thread.sleep(3000);
                driver.close();
            }
        }
        driver.switchTo().window(currentHandle);
        UtilityClass.waitForElement(Register.enterCodeTxtBox);
        Register.enterCodeTxtBox.sendKeys(otpValue);
    }

    public static void enteringRegisterDetails(String emailid, String createpassword, String confirmpassword) throws InterruptedException {
        Thread.sleep(2000);
        UtilityClass.waitForElement(Register.emailTxtBox);
        Register.emailTxtBox.sendKeys(emailid);
        Thread.sleep(1000);
        UtilityClass.waitForElement(Register.createPasswordTxtBox);
        Register.createPasswordTxtBox.sendKeys(createpassword);
        Thread.sleep(1000);
        UtilityClass.waitForElement(Register.confirmPasswordTxtBox);
        Register.confirmPasswordTxtBox.sendKeys(confirmpassword);
        Thread.sleep(1000);

    }

    public static void loginToSacMailWithEmail(String email) throws Throwable {

        System.out.println("Opening a new tab");

        WebElement Element = driver.findElement(By.xpath("(//div[@class='col-md-12'])"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", Element);
        js.executeScript("window.scrollBy(0,-350)", "");
        Thread.sleep(2000);
        String currentHandle = driver.getWindowHandle();

        Thread.sleep(3000);
        // open a new window
        js.executeScript("window.open()");

        String otpValue = "";
        //getting all the handles currently availabe
        Set<String> handles = driver.getWindowHandles();
        for (String actual : handles) {

            if (!actual.equalsIgnoreCase(currentHandle)) {
                //switching to the opened tab
                driver.switchTo().window(actual);
                driver.get("https://mailsac.com/");
                Thread.sleep(5000);
                System.out.println(driver.getTitle());
                UtilityClass.waitForElement(Register.mailSacEmailTextBox);
                Register.mailSacEmailTextBox.clear();
                Register.mailSacEmailTextBox.sendKeys(email);

                UtilityClass.waitForElement(Register.checkMailButtonMailSac);
                Register.checkMailButtonMailSac.click();

                UtilityClass.waitForElement(Register.clickingOtpContainsSacMail);
                Register.clickingOtpContainsSacMail.click();

                UtilityClass.waitForElement(Register.otpTxt);
                otpValue = Register.otpTxt.getText();
                System.out.println("Value of OTP is: " + otpValue);
                Thread.sleep(3000);
                driver.close();
            }
        }
        driver.switchTo().window(currentHandle);
        UtilityClass.waitForElement(Register.enterCodeTxtBox);
        Thread.sleep(2000);
        Register.enterCodeTxtBox.sendKeys(otpValue);
    }
    
        
    public static void loginToSacMailToVerifyEmail(String email) throws Throwable {
    	
        System.out.println("Opening a new tab");

        WebElement Element = driver.findElement(By.xpath("(//div[@class='col-md-12'])"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", Element);
        js.executeScript("window.scrollBy(0,-350)", "");
        Thread.sleep(4000);
        String currentHandle = driver.getWindowHandle();

        Thread.sleep(3000);
        // open a new window
        js.executeScript("window.open()");

        String emailsubject = "";
        //getting all the handles currently availabe
        Set<String> handles = driver.getWindowHandles();
        for (String actual : handles) {

            if (!actual.equalsIgnoreCase(currentHandle)) {
                //switching to the opened tab
                driver.switchTo().window(actual);
                driver.get("https://mailsac.com/");
                Thread.sleep(5000);
                System.out.println(driver.getTitle());
                UtilityClass.waitForElement(Register.mailSacEmailTextBox);
                Register.mailSacEmailTextBox.clear();
                Register.mailSacEmailTextBox.sendKeys(email);

                UtilityClass.waitForElement(Register.checkMailButtonMailSac);
                Register.checkMailButtonMailSac.click();
                Thread.sleep(3000);
                UtilityClass.waitForElement(Register.profileUpdateEmailSubject);
                Thread.sleep(2000);
                emailsubject = Register.profileUpdateEmailSubject.getText();
                Assert.assertEquals(emailsubject,"Your Wireless Office profile has been updated");
                System.out.println("User received email with subject line as "+ emailsubject );
                Register.profileUpdateEmailSubject.click();
                Thread.sleep(3000);
                       
                UtilityClass.waitForElement(Register.profileUpdateMessageInEmail);
                Thread.sleep(2000);
                String emailUpdateMessage=Register.profileUpdateMessageInEmail.getText();
                System.out.println (emailUpdateMessage);
                Assert.assertEquals(emailUpdateMessage,"This email confirms that a change was made to your Wireless Office profile.");
                System.out.println("User received email with message as "+ emailsubject );                               
                Thread.sleep(1000);
                driver.close();
            }
        }
        driver.switchTo().window(currentHandle);
        Thread.sleep(2000);
       
    }
}
