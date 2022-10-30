package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PA_Subadminresetpassword {

	@FindBy(xpath = "//input[@placeholder= 'Email']")
	public WebElement username;

	@FindBy(xpath = "//input[@placeholder='Password']")
	public WebElement password;

	@FindBy(xpath = "//button[@type='submit']")
	public WebElement loginbtn;

	@FindBy(xpath = "(//i[@class='icon icon-profile'])[1]")
	public WebElement profileicon;

	@FindBy(xpath = "(//div[@class='left cursor-pointer'])[2]")
	public WebElement resetpasswrd;

	@FindBy(xpath = "(//input[@type='password'])[1]")
	public WebElement oldpassword;

	@FindBy(xpath = "(//input[@type='password'])[2]")
	public WebElement newpassword;

	@FindBy(xpath = "(//input[@type='password'])[3]")
	public WebElement confirmpassword;

	@FindBy(xpath = "//div[@id='reset-password']//button[contains(.,'Submit')]")
	public WebElement submitbtn;

	@FindBy(xpath = "//div[@id='reset-password']//button[contains(.,'Cancel')]")
	public WebElement cancelbtn;

	@FindBy(xpath = "//div[@id='reset-password']//button[contains(.,'Cancel')]")
	public WebElement cancelbutton;

	@FindBy(xpath = "//div[@class='item notification-log-trigger has-notification']")
	public WebElement notificationbtn;

	@FindBy(xpath = "//div[@class='description']")
	public WebElement notificationdescription;

	@FindBy(xpath = "//button[@class='btn big']")
	public WebElement signout;

	@FindBy(xpath = "//small[contains(.,' Unmatched password! ')]")
	public WebElement unmatchedpassword;

	@FindBy(xpath = "(//small[contains(.,'Password requirements: 9-25 characters At least one uppercase and one lowercase letter Any number from 1-9 Special character !@#$%^&*()+=<>')])[2]")
	public WebElement newPasswordRequirement;

	@FindBy(xpath = "(//small[contains(.,'Password requirements: 9-25 characters At least one uppercase and one lowercase letter Any number from 1-9 Special character !@#$%^&*()+=<>')])[1]")
	public WebElement oldPasswordRequirement;

	@FindBy(xpath = "(//label[text()='Old Password:'])[1]")
	public WebElement oldpasswordlabel;

	@FindBy(xpath = "(//div[text()='Reset Your Password:'])[1]")
	public WebElement Resetpasswordlabel;

	@FindBy(xpath = "(//label[text()='New Password:'])[1]")
	public WebElement newpasswordlabel;

	@FindBy(xpath = "(//label[text()='Confirm New Password:'])[1]")
	public WebElement confpasswordlabel;

	@FindBy(xpath = "//small[text()=' Old Password is required ']")
	public WebElement oldPasswordRequiredError;

	@FindBy(xpath = "(//small[text()=' New Password is required '])[1]")
	public WebElement newPasswordRequiredError;

	@FindBy(xpath = "//small[text()=' Confirm Password is required ']")
	public WebElement confirmPasswordRequiredError;

	@FindBy(xpath = "//small[text()=' New password cannot be the same as old password. ']")
	public WebElement newPasswordCannotBeSameValidationError;

	@FindBy(xpath = "//input[contains(@class,'form-control ng-dirty')]/following-sibling::small[1]")
	public WebElement incorrectOldPasswordValidationMessage;
	
}
