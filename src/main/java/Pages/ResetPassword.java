package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ResetPassword {

    @FindBy(xpath = "(//i[@class='icon icon-profile'])[1]")
    public static WebElement editProfileIcon;

    @FindBy(xpath = "(//div[text()='Reset Password'])")
    public static WebElement resetPassword;

    @FindBy(xpath = "(//div[text()='Reset Your Password:'])[1]")
    public static WebElement resetPasswordTitle;

    @FindBy(xpath = "(//label[text()='Old Password:'])[1]")
    public static WebElement oldPasswordLabel;

    @FindBy(xpath = "(//input[@type='password'])[1]")
    public static WebElement oldPasswordTextBox;

    @FindBy(xpath = "(//label[text()='New Password:'])[1]")
    public static WebElement newPasswordLabel;

    @FindBy(xpath = "(//input[@type='password'])[2]")
    public static WebElement newPasswordTextBox;

    @FindBy(xpath = "(//label[text()='Confirm New Password:'])[1]")
    public static WebElement confirmNewPasswordLabel;

    @FindBy(xpath = "(//input[@type='password'])[3]")
    public static WebElement confirmNewPasswordTextBox;

    @FindBy(xpath = "(//button[@class='btn ghost'])[2]")
    public static WebElement canccelButton;

    @FindBy(xpath = "(//button[@type='submit'])[2]")
    public static WebElement saveButton;

    @FindBy(xpath = "//small[text()=' Old Password is required ']")
    public static WebElement oldPasswordRequiredError;

    @FindBy(xpath = "(//small[text()=' New Password is required '])[1]")
    public static WebElement newPasswordRequiredError;

    @FindBy(xpath = "//small[text()=' New Password is required ']")
    public static WebElement newPasswordFirstLoginRequiredError;

    @FindBy(xpath = "//small[text()=' Confirm Password is required ']")
    public static WebElement confirmPasswordRequiredError;

    @FindBy(xpath = "//small[text()=' New password cannot be the same as old password. ']")
    public static WebElement newPasswordCannotBeSameValidationError;

    @FindBy(xpath = "//small[text()=' Unmatched password! ']")
    public static WebElement passwordsUnmatchedValidationError;

    @FindBy(xpath = "(//small[contains(.,'Password requirements: 9-25 characters At least one uppercase and one lowercase letter Any number from 1-9 Special character !@#$%^&*()+=<>')])[1]")
    public static WebElement oldPasswordRequirement;

    @FindBy(xpath = "(//small[contains(.,'Password requirements: 9-25 characters At least one uppercase and one lowercase letter Any number from 1-9 Special character !@#$%^&*()+=<>')])[2]")
    public static WebElement newPasswordRequirement;

    @FindBy(xpath = "//small[contains(.,'Password requirements: 9-25 characters At least one uppercase and one lowercase letter Any number from 1-9 Special character !@#$%^&*()+=<>')]")
    public static WebElement passwordLengthValidation;

    @FindBy(xpath = "//small[contains(.,'Password requirements: 9-25 characters At least one uppercase and one lowercase letter Any number from 1-9 Special characters accepted !@#$%^&*()+=<>')]")
    public static WebElement acceptedPasswordRequirement;

    @FindBy(xpath = "//div[contains(@class,'item notification-log-trigger')]")
    public static WebElement notificationIcon;

    @FindBy(xpath = "(//div[text()='Password reset successfully.'])[1]")
    public static WebElement successMessage;

    @FindBy(xpath = "//input[contains(@class,'form-control ng-dirty')]/following-sibling::small[1]")
    public static WebElement incorrectOldPasswordValidationMessage;

    @FindBy(xpath = "(//div[text()='Reset Your Password:'])[2]")
    public static WebElement resetPasswordWindow;
}
