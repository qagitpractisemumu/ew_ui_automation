package PagePanel;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;

import Pages.PA_Login;
import Pages.PA_Subadminresetpassword;
import Resource.BaseClass;
import Resource.UtilityClass;

public class PA_SubadminResetpassword extends BaseClass {

	public PA_SubadminResetpassword() {
		PAresetpasswordsub = PageFactory.initElements(driver, PA_Subadminresetpassword.class);
	}

	PA_Subadminresetpassword PAresetpasswordsub = new PA_Subadminresetpassword();
	UtilityClass utilityclass = new UtilityClass();
	PA_LoginPanel login = new PA_LoginPanel();

	public void enterUrl() {
		login.enterUrl();
	}

	public void enterUsername(String username) {
		UtilityClass.waitForElement(PAresetpasswordsub.username);
		PAresetpasswordsub.username.sendKeys(username);
	}

	public void enterPassword(String password) {
		UtilityClass.waitForElement(PAresetpasswordsub.password);
		PAresetpasswordsub.password.sendKeys(password);
	}

	public void loginButton() {
		UtilityClass.waitForElement(PAresetpasswordsub.loginbtn);
		PAresetpasswordsub.loginbtn.click();
	}

	public void clickonprofileicon() {
		UtilityClass.waitForElement(PAresetpasswordsub.profileicon);
		PAresetpasswordsub.profileicon.click();

	}

	public void clickonresetpassword() {
		UtilityClass.waitForElement(PAresetpasswordsub.resetpasswrd);
		PAresetpasswordsub.resetpasswrd.click();

	}

	public void enteroldPassword_newPassword_confirmPassword(String oldPassword, String newPassword,
			String confirmPassword) {
		UtilityClass.waitForElement(PAresetpasswordsub.oldpassword);
		PAresetpasswordsub.oldpassword.sendKeys(oldPassword);
		UtilityClass.waitForElement(PAresetpasswordsub.newpassword);
		PAresetpasswordsub.newpassword.sendKeys(newPassword);
		UtilityClass.waitForElement(PAresetpasswordsub.confirmpassword);
		PAresetpasswordsub.confirmpassword.sendKeys(confirmPassword);

	}

	public void hitssavebtn() throws InterruptedException {
		UtilityClass.waitForElement(PAresetpasswordsub.submitbtn);
		PAresetpasswordsub.submitbtn.click();
		Thread.sleep(5000);
		UtilityClass.waitForElement(PAresetpasswordsub.notificationbtn);
		PAresetpasswordsub.notificationbtn.click();
		String s2 = driver.findElement(By.xpath("//div[@class='description']")).getText();
		System.out.println(s2);
		Assert.assertEquals(s2, "Password reset successfully.");
	}

	public void enter_old_correct_Password_unmatched_newPassword_confirmPassword(String oldPassword, String newPassword,
			String confirmPassword) throws InterruptedException {
		UtilityClass.waitForElement(PAresetpasswordsub.oldpassword);
		PAresetpasswordsub.oldpassword.sendKeys(oldPassword);
		UtilityClass.waitForElement(PAresetpasswordsub.newpassword);
		PAresetpasswordsub.newpassword.sendKeys(newPassword);
		UtilityClass.waitForElement(PAresetpasswordsub.confirmpassword);
		PAresetpasswordsub.confirmpassword.sendKeys(confirmPassword);
		driver.findElement(By.xpath("(//input[@type='password'])[3]")).sendKeys(Keys.TAB);
		String s = driver.findElement(By.xpath("//small[contains(.,' Unmatched password! ')]")).getText();
		System.out.println(s);
		Assert.assertEquals(s, "Unmatched password!");
		Thread.sleep(2000);
		UtilityClass.waitForElement(PAresetpasswordsub.cancelbutton);
		PAresetpasswordsub.cancelbutton.click();
		UtilityClass.waitForElement(PAresetpasswordsub.profileicon);
		PAresetpasswordsub.profileicon.click();
		UtilityClass.waitForElement(PAresetpasswordsub.signout);
		PAresetpasswordsub.signout.click();
	}

	public void skipthefields(String oldPassword, String newPassword, String confirmPassword) {
		UtilityClass.waitForElement(PAresetpasswordsub.oldpassword);
		PAresetpasswordsub.oldpassword.sendKeys(Keys.TAB);
		UtilityClass.waitForElement(PAresetpasswordsub.newpassword);
		PAresetpasswordsub.newpassword.sendKeys(Keys.TAB);
		UtilityClass.waitForElement(PAresetpasswordsub.confirmpassword);
		PAresetpasswordsub.confirmpassword.sendKeys(Keys.TAB);
		UtilityClass.waitForElement(PAresetpasswordsub.cancelbtn);
		PAresetpasswordsub.cancelbtn.sendKeys(Keys.TAB);
	}

	public void savebtncheck() throws InterruptedException {
		if (driver.findElement(By.xpath("//div[@id='reset-password']//button[contains(.,'Submit')]")).isEnabled()) {
			System.out.println("Savebtn is enabled");
		} else
			System.out.println("Savebtn is disabled");
		Thread.sleep(2000);
		UtilityClass.waitForElement(PAresetpasswordsub.cancelbtn);
		PAresetpasswordsub.cancelbtn.click();
	}

	public void signoutbutton() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		UtilityClass.waitForElement(PAresetpasswordsub.profileicon);
		PAresetpasswordsub.profileicon.click();
		UtilityClass.waitForElement(PAresetpasswordsub.signout);
		PAresetpasswordsub.signout.click();
	}

	public void Skipfirstandsecondfields(String oldPassword, String newPassword) throws InterruptedException {
		UtilityClass.waitForElement(PAresetpasswordsub.oldpassword);
		PAresetpasswordsub.oldpassword.sendKeys(Keys.TAB);
		PAresetpasswordsub.newpassword.sendKeys(Keys.TAB);
		String s1 = driver.findElement(By.xpath("//small[contains(.,' Old Password is required')]")).getText();
		System.out.println(s1);
		Assert.assertEquals(s1, "Old Password is required");
		UtilityClass.waitForElement(PAresetpasswordsub.newpassword);
		String s2 = driver.findElement(By.xpath("//small[contains(.,' Password requirements:')]")).getText();
		System.out.println(s2);
		Assert.assertEquals(s2, "Password requirements:");
		Thread.sleep(2000);
		UtilityClass.waitForElement(PAresetpasswordsub.cancelbutton);
		PAresetpasswordsub.cancelbutton.click();
		UtilityClass.waitForElement(PAresetpasswordsub.profileicon);
		PAresetpasswordsub.profileicon.click();
		UtilityClass.waitForElement(PAresetpasswordsub.signout);
		PAresetpasswordsub.signout.click();
	}

	public void AllelementsValidations() throws InterruptedException {
		Thread.sleep(4500);
		Assert.assertTrue(PAresetpasswordsub.Resetpasswordlabel.isDisplayed());
		Assert.assertTrue(PAresetpasswordsub.Resetpasswordlabel.getText().contains("Reset Your Password:"));
		System.out.println("Title of the page is " + PAresetpasswordsub.Resetpasswordlabel.getText());
	}

	public void allfieldvalidationsrequired() throws InterruptedException {
		Thread.sleep(5000);
		System.out.println("Performing required field validation");
		PAresetpasswordsub.oldpassword.sendKeys(Keys.TAB);
		Assert.assertTrue(PAresetpasswordsub.oldPasswordRequiredError.isDisplayed());
		Assert.assertTrue(PAresetpasswordsub.oldPasswordRequiredError.getText().contains("Old Password is required"));
		System.out.println("Error displayed is " + PAresetpasswordsub.oldPasswordRequiredError.getText());
		PAresetpasswordsub.newpassword.sendKeys(Keys.TAB);
		Assert.assertTrue(PAresetpasswordsub.newPasswordRequiredError.isDisplayed());
		Assert.assertTrue(PAresetpasswordsub.newPasswordRequiredError.getText().contains("New Password is required"));
		System.out.println("Error displayed is " + PAresetpasswordsub.newPasswordRequiredError.getText());
		PAresetpasswordsub.confirmpassword.sendKeys(Keys.TAB);
		Assert.assertTrue(PAresetpasswordsub.confirmPasswordRequiredError.isDisplayed());
		Assert.assertTrue(
				PAresetpasswordsub.confirmPasswordRequiredError.getText().contains("Confirm Password is required"));
		System.out.println("Error displayed is " + PAresetpasswordsub.confirmPasswordRequiredError.getText());
		System.out.println("Required Field Validation is successful");
	}

	public void subadminValidatesThatOldPasswordAndNewPasswordCannotBeSameOnResetPassword()
			throws InterruptedException {
		Thread.sleep(5000);
		PAresetpasswordsub.oldpassword.sendKeys("Testing@12345");
		PAresetpasswordsub.oldpassword.sendKeys(Keys.TAB);
		PAresetpasswordsub.newpassword.sendKeys("Testing@12345");
		PAresetpasswordsub.newpassword.sendKeys(Keys.TAB);
		Assert.assertTrue(PAresetpasswordsub.newPasswordCannotBeSameValidationError.isDisplayed());
		Assert.assertTrue(PAresetpasswordsub.newPasswordCannotBeSameValidationError.getText()
				.contains("New password cannot be the same as old password."));
		System.out.println(
				"validation displayed is  " + PAresetpasswordsub.newPasswordCannotBeSameValidationError.getText());
		System.out.println("New Password Cannot be the same as old password validation is successful");
		Assert.assertFalse(PAresetpasswordsub.submitbtn.isDisplayed());
		System.out.println("Submit button is not enabled");
	}

	public void subadminValidatesPasswordRequirementOnResetPassword() throws InterruptedException {
		Thread.sleep(5000);
		PAresetpasswordsub.oldpassword.sendKeys(Keys.TAB);
		PAresetpasswordsub.newpassword.sendKeys(Keys.TAB);
		Assert.assertTrue(PAresetpasswordsub.oldPasswordRequirement.isDisplayed());
		Assert.assertTrue(PAresetpasswordsub.oldPasswordRequirement.getText().contains("Password requirements:"));
		Assert.assertTrue(PAresetpasswordsub.oldPasswordRequirement.getText().contains("9-25 characters"));
		Assert.assertTrue(
				PAresetpasswordsub.oldPasswordRequirement.getText().contains("At least one uppercase and one"));
		Assert.assertTrue(PAresetpasswordsub.oldPasswordRequirement.getText().contains("lowercase letter"));
		Assert.assertTrue(PAresetpasswordsub.oldPasswordRequirement.getText().contains("Any number from 1-9"));
		Assert.assertTrue(PAresetpasswordsub.oldPasswordRequirement.getText().contains("Special character !@#$%^&*"));
		Assert.assertTrue(PAresetpasswordsub.oldPasswordRequirement.getText().contains("()+=<>"));
		System.out.println("Error displayed is " + PAresetpasswordsub.oldPasswordRequirement.getText());
		Assert.assertTrue(PAresetpasswordsub.newPasswordRequirement.isDisplayed());
		Assert.assertTrue(PAresetpasswordsub.newPasswordRequirement.getText().contains("Password requirements:"));
		Assert.assertTrue(PAresetpasswordsub.newPasswordRequirement.getText().contains("9-25 characters"));
		Assert.assertTrue(
				PAresetpasswordsub.newPasswordRequirement.getText().contains("At least one uppercase and one"));
		Assert.assertTrue(PAresetpasswordsub.newPasswordRequirement.getText().contains("lowercase letter"));
		Assert.assertTrue(PAresetpasswordsub.newPasswordRequirement.getText().contains("Any number from 1-9"));
		Assert.assertTrue(PAresetpasswordsub.newPasswordRequirement.getText().contains("Special character !@#$%^&*"));
		Assert.assertTrue(PAresetpasswordsub.newPasswordRequirement.getText().contains("()+=<>"));
		System.out.println("Error displayed is " + PAresetpasswordsub.newPasswordRequirement.getText());
		System.out.println("Password Requirement Check is Successful");
		Assert.assertFalse(PAresetpasswordsub.submitbtn.isEnabled());
		System.out.println("Submit button is not enabled");
	}
	
	public void cancelButton() throws InterruptedException {
        Thread.sleep(3000);
        PAresetpasswordsub.oldpassword.sendKeys("Ericsson@1234");
        PAresetpasswordsub.newpassword.sendKeys("Ericsson@12345");
        PAresetpasswordsub.confirmpassword.sendKeys("Ericsson@12345");
        PAresetpasswordsub.cancelbtn.click();
        Thread.sleep(3000);
        System.out.println("Cancel functionality is working as expected");
    }
	
	 public void adminValidatesThatNewPasswordCannotbethesameasoldpassword() throws InterruptedException {
	        Thread.sleep(5000);
	        PAresetpasswordsub.oldpassword.sendKeys("Testing@12345");
	        PAresetpasswordsub.oldpassword.sendKeys(Keys.TAB);
	        PAresetpasswordsub.newpassword.sendKeys("Testing@12345");
	        PAresetpasswordsub.newpassword.sendKeys(Keys.TAB);
	        Assert.assertTrue(PAresetpasswordsub.newPasswordCannotBeSameValidationError.isDisplayed());
	        Assert.assertTrue(PAresetpasswordsub.newPasswordCannotBeSameValidationError.getText().contains("New password cannot be the same as old password."));
	        System.out.println("validation displayed is  " + PAresetpasswordsub.newPasswordCannotBeSameValidationError.getText());
	        System.out.println("New Password Cannot be the same as old password validation is successful");
	        Assert.assertFalse(PAresetpasswordsub.submitbtn.isEnabled());
	        System.out.println("Submit button is not enabled");
	    }
	 
	 public void validateEmailResetUpdate(String email) throws InterruptedException {
	        System.out.println("Opening a new tab");
	        Thread.sleep(2000);
	        String currentHandle = driver.getWindowHandle();

	        Thread.sleep(3000);
	        // open a new window
	        JavascriptExecutor js = (JavascriptExecutor) driver;

	        js.executeScript("window.open()");

	        String otpValue1 = "";
	        // getting all the handles currently available
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
	                Thread.sleep(1000);
	                String emailTitle = driver.findElement(By.xpath("//div[text()='Your Ericsson Wireless Office password was updated']")).getText();
	                System.out.println(emailTitle);
	                Assert.assertTrue(emailTitle.contains("Your Ericsson Wireless Office password was updated"));

	                String emailText = driver.findElement(By.xpath("//div[@id='mail']/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/table[1]")).getText();
	                System.out.println(emailText);
	                Assert.assertTrue(emailText.contains("This email confirms that a change was made to your Wireless Office password."));
	                Assert.assertTrue(emailText.contains("If you did not make this change, or if you believe an unauthorized person made this change, please reset your password immediately."));
	                Assert.assertTrue(emailText.contains("If you need assistance, please contact your IT Help Desk."));
	                Assert.assertTrue(emailText.contains("Ericsson Wireless Office"));
	                System.out.println("Email notification for password reset is validated successfully");
	    	        Thread.sleep(4000);
	                driver.close();
	            }
	        }
	        driver.switchTo().window(currentHandle);
	    }
}