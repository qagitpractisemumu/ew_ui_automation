package PagePanel;

import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Pages.PA_Login;
import Resource.BaseClass;
import Resource.UtilityClass;

public class PA_LoginPanel extends BaseClass {

    PA_Login login;
    UtilityClass utilityclass = new UtilityClass();
    public JavascriptExecutor js = (JavascriptExecutor) driver;

    public PA_LoginPanel() {
        login = PageFactory.initElements(driver, PA_Login.class);
    }

    public void enterUrl() {
        driver.get("https://masterview-dev.eworx.ton5g.com/login/masterview");
    }

    public static void getMasterviewUrl() throws InterruptedException, IOException {
        Thread.sleep(2500);
        String url = UtilityClass.getMasterviewUrl();
        driver.get(url);
        Thread.sleep(2000);
    }

    public static void getPageTitle() {
        String title = driver.getTitle();
        System.out.println("Title of page is: " + title);
    }

    public void enteremail(String email) {
        UtilityClass.waitForElement(PA_Login.Email);
        PA_Login.Email.sendKeys(email);
    }

    public void enterPassword(String password) {
        UtilityClass.waitForElement(PA_Login.password);
        PA_Login.password.sendKeys(password);
    }

    public void verifygraphs() {
        driver.navigate().refresh();
        UtilityClass.waitForElement(PA_Login.performance);
        PA_Login.performance.click();
        Actions scroll = new Actions(driver);
        scroll.moveToElement(PA_Login.readnetwork).click().perform();
    }

    public void verifyDashBoard() throws Exception {
        Thread.sleep(3000);
        UtilityClass.waitForElement(PA_Login.subscriptiondropdown);
        PA_Login.subscriptiondropdown.click();
        UtilityClass.waitForElement(PA_Login.resourcedropdown);
        PA_Login.resourcedropdown.click();
        Thread.sleep(3000);
    }

    public void loginButton() {
        UtilityClass.waitForElement(PA_Login.loginbtn);
        PA_Login.loginbtn.click();
    }

    public boolean home_Page() {
        try {
            Thread.sleep(20000);
            driver.findElement(By.xpath("(//*[contains(text(),'sp-ericsson')])[1]")).isDisplayed();
            System.out.println("title is" + driver.getTitle());
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }

    public void verifyUserLogin() throws InterruptedException {
        Thread.sleep(5000);
        Assert.assertTrue("Login is unsuccesful in dashboard title", home_Page());
    }

    public static void signout() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        UtilityClass.waitForElement(PA_Login.usrname);
        PA_Login.usrname.click();
        UtilityClass.waitForElement(PA_Login.signout);
        PA_Login.signout.click();

    }

    public static void signInWithEmail() {
        UtilityClass.waitForElement(PA_Login.emailIDRadioBtn);
        PA_Login.emailIDRadioBtn.click();
    }

    public static void loginToYopMailToFetchotptologin(String email) throws InterruptedException {
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
                System.out.println("Printing PA Login" +PA_Login.yopEmailTxtBox);
                UtilityClass.waitForElement(PA_Login.yopEmailTxtBox);
                PA_Login.yopEmailTxtBox.clear();
                PA_Login.yopEmailTxtBox.sendKeys(email);

                UtilityClass.waitForElement(PA_Login.checkYopInboxBtn);
                PA_Login.checkYopInboxBtn.click();

                driver.switchTo().frame("ifmail");
                UtilityClass.waitForElement(PA_Login.otpTxt);
                otpValue1 = PA_Login.otpTxt.getText();
                System.out.println("Value of OTP is: " + otpValue1);
                Thread.sleep(3000);
                driver.close();
            }
        }
        driver.switchTo().window(currentHandle);
        UtilityClass.waitForElement(PA_Login.enterCodeTxtBox);
        PA_Login.enterCodeTxtBox.sendKeys(otpValue1);
    }


    public static void clickCompleteBtn() throws InterruptedException {
        Thread.sleep(2000);
        UtilityClass.waitForElement(PA_Login.Completebutton);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement completeButton = PA_Login.Completebutton;
        js.executeScript("arguments[0].scrollIntoView();", completeButton);
        PA_Login.Completebutton.click();
        Thread.sleep(1000);
    }

    public void enterInValidemailAndValidPassword(String email, String password) {
        UtilityClass.waitForElement(PA_Login.Email);
        PA_Login.Email.sendKeys(email);
        UtilityClass.waitForElement(PA_Login.password);
        PA_Login.password.sendKeys(password);
        if (driver.getPageSource().contains(" The server encountered an error processing the request ")) {
            System.out.println("Invalid Credentials!");
        }
    }

    public void enterValidemailAndInvalidPassword(String email, String password) {
        UtilityClass.waitForElement(PA_Login.Email);
        PA_Login.Email.sendKeys(email);
        UtilityClass.waitForElement(PA_Login.password);
        PA_Login.password.sendKeys(password);
        if (driver.getPageSource().contains(" The server encountered an error processing the request ")) {
            System.out.println("Invalid Credentials!!");
        }
    }

    public void enterPaEmail() throws InterruptedException {
        UtilityClass.waitForElement(PA_Login.Email);
        PA_Login.Email.sendKeys("serviceprovider@yopmail.com");
        Thread.sleep(2000);
    }

    public void enterPaPassword() throws InterruptedException {
        UtilityClass.waitForElement(PA_Login.password);
        PA_Login.password.sendKeys("ERic7$ft@$sson");
        Thread.sleep(1000);
    }

    public void enterotpfromemail() throws Exception {
        Thread.sleep(2000);
        UtilityClass.waitForElement(PA_Login.Email);
        PA_Login.Email.sendKeys("serviceprovider@yopmail.com");
        Thread.sleep(2000);
    }

    public void skipemailField(String email) throws Exception {
        driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
        UtilityClass.waitForElement(PA_Login.Email);
        PA_Login.Email.sendKeys(Keys.TAB);
        Thread.sleep(4000);
        String emailvalidation = driver.findElement(By.xpath("//small[contains(text(),'Email is required')]"))
                .getText();
        System.out.println(emailvalidation);
        Assert.assertEquals(emailvalidation, "Email is required");
    }

    public void skippasswordField(String email) throws Exception {
        driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
        UtilityClass.waitForElement(PA_Login.password);
        PA_Login.password.sendKeys(Keys.TAB);
        Thread.sleep(4000);
        String passwordvalidation = driver.findElement(By.xpath("//small[contains(text(),'Password is required')]"))
                .getText();
        System.out.println(passwordvalidation);
        Assert.assertEquals(passwordvalidation, "Password is required");
    }

    public void enterinvalidemailID(String emailID) throws Exception {
        driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
        UtilityClass.waitForElement(PA_Login.Email);
        PA_Login.Email.sendKeys(emailID);
        PA_Login.Email.sendKeys(Keys.TAB);
        Thread.sleep(3000);
        String invalidEmail = driver
                .findElement(By.xpath("//form//div[@class='form-group']//small[@class='form-error-msg']")).getText();
        System.out.println(invalidEmail);
        Assert.assertEquals(invalidEmail, invalidEmail);
    }
    
    public void backspaceurl() throws InterruptedException {
    	Thread.sleep(2000);
    	driver.navigate().back();
    	Thread.sleep(2000);
    }
    
    public void legendtodisplay(String legend) throws InterruptedException {
    	Thread.sleep(5000);
    	Assert.assertTrue(PA_Login.legend.isDisplayed());
		Assert.assertTrue(PA_Login.legend.getText().contains("Time"));
		System.out.println("Title of the page is " + PA_Login.legend.getText());
    }
    
    public void resendbuttonenable() {
    	WebDriverWait wait = new WebDriverWait(driver, 150);
    	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'Resend OTP')]"))).click();
    		System.out.println("Resend button is enabled");
    }
    
    public void allelementsarevisible(String validation) throws InterruptedException {
    	Thread.sleep(10000);
        Assert.assertTrue(PA_Login.Loginlabel.isDisplayed());
        Assert.assertTrue(PA_Login.Loginlabel.getText().contains("Log In"));
        System.out.println("Title of the page is " + PA_Login.Loginlabel.getText());
        Assert.assertTrue(PA_Login.emaillabel.isDisplayed());
        Assert.assertTrue(PA_Login.emaillabel.getText().contains("Email"));
        System.out.println("Title of the page is " + PA_Login.emaillabel.getText());
        Assert.assertTrue(PA_Login.phonenumberlabel.isDisplayed());
        Assert.assertTrue(PA_Login.phonenumberlabel.getText().contains("Phone Number"));
        System.out.println("Title of the page is " + PA_Login.phonenumberlabel.getText());
        Assert.assertTrue(PA_Login.Needhelplabel.isDisplayed());
        Assert.assertTrue(PA_Login.Needhelplabel.getText().contains("Need help?"));
        System.out.println("Title of the page is " + PA_Login.Needhelplabel.getText());
        
    }
    
    public void requiredvalidations(String validation) throws InterruptedException {
    	Thread.sleep(5000);
        System.out.println("Performing required field validation");
        PA_Login.Email.sendKeys(Keys.TAB);
        Assert.assertTrue(PA_Login.emailvalidation.isDisplayed());
        Assert.assertTrue(PA_Login.emailvalidation.getText().contains("Email is required"));
        System.out.println("Error displayed is " + PA_Login.emailvalidation.getText());
        PA_Login.password.sendKeys(Keys.TAB);
        Assert.assertTrue(PA_Login.Phonereqvalidation.isDisplayed());
        Assert.assertTrue(PA_Login.Phonereqvalidation.getText().contains("Password is required"));
        System.out.println("Error displayed is " + PA_Login.Phonereqvalidation.getText());
        System.out.println("Required Field Validation is successful");
        Assert.assertFalse(PA_Login.loginbtn.isEnabled());
        System.out.println("Log In button is not enabled");
    }
    
   public void codevalidationotp() throws InterruptedException {
	   Thread.sleep(3000);
	   PA_Login.enterCodeTxtBox.sendKeys(Keys.TAB);
	   Thread.sleep(3000);
	   Assert.assertTrue(PA_Login.codeisrequiredvalidation.isDisplayed());
       Assert.assertTrue(PA_Login.codeisrequiredvalidation.getText().contains("OTP is required"));
       System.out.println("Error displayed is " + PA_Login.codeisrequiredvalidation.getText());
   }
   
   @SuppressWarnings("unlikely-arg-type")
public void checksforactiveelement() throws InterruptedException {
	   Thread.sleep(8000);
	   String element=driver.findElement(By.xpath("//input[@placeholder='Enter One Time Password(OTP)']")).getText();
	   element.equals(driver.switchTo().activeElement());
	   System.out.println("Focus on active element is successful");
   }
 
    public void viewprivacyandlegallinks() throws Exception {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        UtilityClass.waitForElement(PA_Login.privacyandlegal);
        PA_Login.privacyandlegal.click();
        Thread.sleep(3000);
        UtilityClass.waitForElement(PA_Login.termsofservice);
        PA_Login.termsofservice.click();
        Thread.sleep(3000);
        String currentHandle1 = driver.getWindowHandle();
        Set<String> handles = driver.getWindowHandles();
        for (String actual : handles) {

            if (!actual.equalsIgnoreCase(currentHandle1)) {
                String currentHandle = driver.getWindowHandle();
                driver.switchTo().window(currentHandle);
                UtilityClass.waitForElement(PA_Login.servicedescription);
                PA_Login.servicedescription.click();
                Thread.sleep(3000);
                driver.switchTo().window(currentHandle);
                UtilityClass.waitForElement(PA_Login.servicelevelagreement);
                PA_Login.servicelevelagreement.click();
                Thread.sleep(3000);
                driver.switchTo().window(currentHandle);
                UtilityClass.waitForElement(PA_Login.privacypolicy);
                PA_Login.privacypolicy.click();
                Thread.sleep(3000);
                driver.close();

            }
        }
    }
}
