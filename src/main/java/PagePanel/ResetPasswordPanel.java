package PagePanel;

import Pages.*;
import Resource.BaseClass;
import Resource.UtilityClass;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.Set;

public class ResetPasswordPanel extends BaseClass {
    ResetPassword resetPassword = new ResetPassword();
    static JavascriptExecutor js = (JavascriptExecutor) driver;

    public ResetPasswordPanel() {
        resetPassword = PageFactory.initElements(driver, ResetPassword.class);
    }

    public static void userClicksOnEditProfileIcon() throws InterruptedException {
        Thread.sleep(2000);
        ResetPassword.editProfileIcon.isEnabled();
        System.out.println("Edit Profile Icon is Enabled");
        ResetPassword.editProfileIcon.click();
        System.out.println("Edit Profile Icon is Clicked");
    }

    public static void userClicksOnResetPassword() throws InterruptedException {
        Thread.sleep(2000);
        ResetPassword.resetPassword.isEnabled();
        ResetPassword.resetPassword.click();
        System.out.println("Clicked on Reset Password");
    }

    public static void userValidatesAllElementsAreDisplayedOnResetPassword() throws InterruptedException {
        Thread.sleep(5000);
        Assert.assertTrue(ResetPassword.resetPasswordTitle.isDisplayed());
        Assert.assertTrue(ResetPassword.resetPasswordTitle.getText().contains("Reset Your Password:"));
        System.out.println("Title of the page is " + ResetPassword.resetPasswordTitle.getText());
        Assert.assertTrue(ResetPassword.oldPasswordLabel.isDisplayed());
        Assert.assertTrue(ResetPassword.oldPasswordLabel.getText().contains("Old Password:"));
        System.out.println("Old Password Label " + ResetPassword.oldPasswordLabel.getText());
        Assert.assertTrue(ResetPassword.newPasswordLabel.isDisplayed());
        Assert.assertTrue(ResetPassword.newPasswordLabel.getText().contains("New Password:"));
        System.out.println("New Password Label " + ResetPassword.newPasswordLabel.getText());
        Assert.assertTrue(ResetPassword.confirmNewPasswordLabel.isDisplayed());
        Assert.assertTrue(ResetPassword.confirmNewPasswordLabel.getText().contains("Confirm New Password:"));
        System.out.println("Confirm Password Label " + ResetPassword.confirmNewPasswordLabel.getText());
        Assert.assertTrue(ResetPassword.oldPasswordTextBox.isDisplayed());
        System.out.println("Old Password Text Box is displayed");
        Assert.assertTrue(ResetPassword.newPasswordTextBox.isDisplayed());
        System.out.println("New Password Text Box is displayed");
        Assert.assertTrue(ResetPassword.confirmNewPasswordTextBox.isDisplayed());
        System.out.println("Confirm New Password Text Box is displayed");
        Assert.assertTrue(ResetPassword.canccelButton.isDisplayed());
        System.out.println("Cancel Button is displayed");
        System.out.println("All elements of Reset Password are displayed");
    }

    public static void userValidatesRequiredFieldValidationOnResetPassword() throws InterruptedException {
        Thread.sleep(5000);
        System.out.println("Performing required field validation");
        ResetPassword.oldPasswordTextBox.sendKeys(Keys.TAB);
        Assert.assertTrue(ResetPassword.oldPasswordRequiredError.isDisplayed());
        Assert.assertTrue(ResetPassword.oldPasswordRequiredError.getText().contains("Old Password is required"));
        System.out.println("Error displayed is " + ResetPassword.oldPasswordRequiredError.getText());
        Assert.assertEquals("rgb(244, 67, 54)", ResetPassword.oldPasswordRequiredError.getCssValue("color"));
        ResetPassword.newPasswordTextBox.sendKeys(Keys.TAB);
        Assert.assertTrue(ResetPassword.newPasswordRequiredError.isDisplayed());
        Assert.assertTrue(ResetPassword.newPasswordRequiredError.getText().contains("New Password is required"));
        Assert.assertEquals("rgb(244, 67, 54)", ResetPassword.newPasswordRequiredError.getCssValue("color"));
        System.out.println("Error displayed is " + ResetPassword.newPasswordRequiredError.getText());
        ResetPassword.confirmNewPasswordTextBox.sendKeys(Keys.TAB);
        Assert.assertTrue(ResetPassword.confirmPasswordRequiredError.isDisplayed());
        Assert.assertTrue(ResetPassword.confirmPasswordRequiredError.getText().contains("Confirm Password is required"));
        Assert.assertEquals("rgb(244, 67, 54)", ResetPassword.confirmPasswordRequiredError.getCssValue("color"));
        System.out.println("Error displayed is " + ResetPassword.confirmPasswordRequiredError.getText());
        System.out.println("Required Field Validation is successful");
        Assert.assertFalse(ResetPassword.saveButton.isEnabled());
        System.out.println("Save button is not enabled");
    }

    public static void userValidatesTabFunctionalityOnResetPassword() throws InterruptedException, AWTException {
        Thread.sleep(5000);
        ResetPassword.oldPasswordTextBox.click();
        Robot robot = new Robot();
        for (int i = 0; i <= 2; i++) {
            robot.keyPress(KeyEvent.VK_TAB);
            Thread.sleep(2000);
        }
        String currentPosition = driver.switchTo().activeElement().getText();
        if (currentPosition.equals("Cancel")) {
            Assert.assertTrue(true);
            System.out.println("Tab Functionality Passed    " + currentPosition);
        } else {
            System.out.println("Tab Functionality Failed");
            driver.close();
        }
    }

    public static void userValidatesCursorIsBlinkingOnOldPasswordFieldOnResetPassword() throws InterruptedException {
        Thread.sleep(5000);
        WebElement currentElement = driver.switchTo().activeElement();
        System.out.println("Cursor is on Otp Text Box");
        Assert.assertTrue(currentElement.equals(ResetPassword.oldPasswordTextBox));
    }

    public static void userValidatesThatOldPasswordAndNewPasswordCannotBeSameOnResetPassword() throws InterruptedException {
        Thread.sleep(5000);
        ResetPassword.oldPasswordTextBox.sendKeys("Testing@12345");
        ResetPassword.oldPasswordTextBox.sendKeys(Keys.TAB);
        ResetPassword.newPasswordTextBox.sendKeys("Testing@12345");
        ResetPassword.newPasswordTextBox.sendKeys(Keys.TAB);
        Assert.assertTrue(ResetPassword.newPasswordCannotBeSameValidationError.isDisplayed());
        Assert.assertTrue(ResetPassword.newPasswordCannotBeSameValidationError.getText().contains("New password cannot be the same as old password."));
        Assert.assertEquals("rgb(244, 67, 54)", ResetPassword.newPasswordCannotBeSameValidationError.getCssValue("color"));
        System.out.println("validation displayed is  " + ResetPassword.newPasswordCannotBeSameValidationError.getText());
        System.out.println("New Password Cannot be the same as old password validation is successful");
        Assert.assertFalse(ResetPassword.saveButton.isEnabled());
        System.out.println("Save button is not enabled");
    }

    public static void userValidatesPasswordsUnmatchedErrorOnResetPassword() throws InterruptedException {
        Thread.sleep(5000);
        ResetPassword.oldPasswordTextBox.sendKeys("Testing@12345");
        ResetPassword.oldPasswordTextBox.sendKeys(Keys.TAB);
        ResetPassword.newPasswordTextBox.sendKeys("Test@12345");
        ResetPassword.newPasswordTextBox.sendKeys(Keys.TAB);
        ResetPassword.confirmNewPasswordTextBox.sendKeys("Test@123456");
        ResetPassword.confirmNewPasswordTextBox.sendKeys(Keys.TAB);
        Assert.assertTrue(ResetPassword.passwordsUnmatchedValidationError.isDisplayed());
        Assert.assertTrue(ResetPassword.passwordsUnmatchedValidationError.getText().contains("Unmatched password!"));
        Assert.assertEquals("rgb(244, 67, 54)", ResetPassword.passwordsUnmatchedValidationError.getCssValue("color"));
        System.out.println("validation displayed is  " + ResetPassword.passwordsUnmatchedValidationError.getText());
        System.out.println("Unmatched password! validation is successful");
        Assert.assertFalse(ResetPassword.saveButton.isEnabled());
        System.out.println("Save button is not enabled");
    }

    public static void userValidatesPasswordRequirementOnResetPassword() throws InterruptedException {

        Thread.sleep(5000);
        ResetPassword.oldPasswordTextBox.sendKeys(Keys.TAB);
        ResetPassword.newPasswordTextBox.sendKeys(Keys.TAB);
        Assert.assertTrue(ResetPassword.oldPasswordRequirement.isDisplayed());
        Assert.assertEquals("rgb(244, 67, 54)", ResetPassword.oldPasswordRequirement.getCssValue("color"));
        Assert.assertTrue(ResetPassword.oldPasswordRequirement.getText().contains("Password requirements:"));
        Assert.assertTrue(ResetPassword.oldPasswordRequirement.getText().contains("9-25 characters"));
        Assert.assertTrue(ResetPassword.oldPasswordRequirement.getText().contains("At least one uppercase and one"));
        Assert.assertTrue(ResetPassword.oldPasswordRequirement.getText().contains("lowercase letter"));
        Assert.assertTrue(ResetPassword.oldPasswordRequirement.getText().contains("Any number from 1-9"));
        Assert.assertTrue(ResetPassword.oldPasswordRequirement.getText().contains("Special character !@#$%^&*"));
        Assert.assertTrue(ResetPassword.oldPasswordRequirement.getText().contains("()+=<>"));
        System.out.println("Error displayed is " + ResetPassword.oldPasswordRequirement.getText());
        Assert.assertTrue(ResetPassword.newPasswordRequirement.isDisplayed());
        Assert.assertEquals("rgb(244, 67, 54)", ResetPassword.newPasswordRequirement.getCssValue("color"));
        Assert.assertTrue(ResetPassword.newPasswordRequirement.getText().contains("Password requirements:"));
        Assert.assertTrue(ResetPassword.newPasswordRequirement.getText().contains("9-25 characters"));
        Assert.assertTrue(ResetPassword.newPasswordRequirement.getText().contains("At least one uppercase and one"));
        Assert.assertTrue(ResetPassword.newPasswordRequirement.getText().contains("lowercase letter"));
        Assert.assertTrue(ResetPassword.newPasswordRequirement.getText().contains("Any number from 1-9"));
        Assert.assertTrue(ResetPassword.newPasswordRequirement.getText().contains("Special character !@#$%^&*"));
        Assert.assertTrue(ResetPassword.newPasswordRequirement.getText().contains("()+=<>"));
        System.out.println("Error displayed is " + ResetPassword.newPasswordRequirement.getText());
        System.out.println("Password Requirement Check is Successful");
        Assert.assertFalse(ResetPassword.saveButton.isEnabled());
        System.out.println("Save button is not enabled");
    }

    public static void userValidatesLengthValidationOnResetPassword() throws InterruptedException {
        Thread.sleep(2000);
        ResetPassword.oldPasswordTextBox.sendKeys("Te@1");
        ResetPassword.oldPasswordTextBox.sendKeys(Keys.TAB);
        Thread.sleep(3000);
        Assert.assertTrue(ResetPassword.oldPasswordRequirement.isDisplayed());
        Assert.assertEquals("rgb(244, 67, 54)", ResetPassword.oldPasswordRequirement.getCssValue("color"));
        Assert.assertTrue(ResetPassword.oldPasswordRequirement.getText().contains("Password requirements:"));
        Assert.assertTrue(ResetPassword.oldPasswordRequirement.getText().contains("9-25 characters"));
        Assert.assertTrue(ResetPassword.oldPasswordRequirement.getText().contains("At least one uppercase and one"));
        Assert.assertTrue(ResetPassword.oldPasswordRequirement.getText().contains("lowercase letter"));
        Assert.assertTrue(ResetPassword.oldPasswordRequirement.getText().contains("Any number from 1-9"));
        Assert.assertTrue(ResetPassword.oldPasswordRequirement.getText().contains("Special character !@#$%^&*"));
        Assert.assertTrue(ResetPassword.oldPasswordRequirement.getText().contains("()+=<>"));
        System.out.println("Minimum length of password is validated and error displayed is " + ResetPassword.oldPasswordRequirement.getText());
        Assert.assertFalse(ResetPassword.saveButton.isEnabled());
        System.out.println("Save button is not enabled");

        ResetPassword.oldPasswordTextBox.clear();
        ResetPassword.oldPasswordTextBox.sendKeys("Testingggggggggggggggggg@12345");
        ResetPassword.oldPasswordTextBox.sendKeys(Keys.TAB);
        Thread.sleep(3000);
        Assert.assertTrue(ResetPassword.oldPasswordRequirement.isDisplayed());
        Assert.assertEquals("rgb(244, 67, 54)", ResetPassword.oldPasswordRequirement.getCssValue("color"));
        Assert.assertTrue(ResetPassword.oldPasswordRequirement.getText().contains("Password requirements:"));
        Assert.assertTrue(ResetPassword.oldPasswordRequirement.getText().contains("9-25 characters"));
        Assert.assertTrue(ResetPassword.oldPasswordRequirement.getText().contains("At least one uppercase and one"));
        Assert.assertTrue(ResetPassword.oldPasswordRequirement.getText().contains("lowercase letter"));
        Assert.assertTrue(ResetPassword.oldPasswordRequirement.getText().contains("Any number from 1-9"));
        Assert.assertTrue(ResetPassword.oldPasswordRequirement.getText().contains("Special character !@#$%^&*"));
        Assert.assertTrue(ResetPassword.oldPasswordRequirement.getText().contains("()+=<>"));
        System.out.println("Maximum length of password is validated and error displayed is " + ResetPassword.passwordLengthValidation.getText());
        Assert.assertFalse(ResetPassword.saveButton.isEnabled());
        System.out.println("Save button is not enabled");

        Thread.sleep(2000);
        ResetPassword.oldPasswordTextBox.sendKeys("Testing@12345");
        ResetPassword.newPasswordTextBox.sendKeys("Te@1");
        ResetPassword.newPasswordTextBox.sendKeys(Keys.TAB);
        Thread.sleep(3000);
        Assert.assertTrue(ResetPassword.passwordLengthValidation.isDisplayed());
        Assert.assertEquals("rgb(244, 67, 54)", ResetPassword.passwordLengthValidation.getCssValue("color"));
        Assert.assertTrue(ResetPassword.passwordLengthValidation.getText().contains("Password requirements:"));
        Assert.assertTrue(ResetPassword.passwordLengthValidation.getText().contains("9-25 characters"));
        Assert.assertTrue(ResetPassword.passwordLengthValidation.getText().contains("At least one uppercase and one"));
        Assert.assertTrue(ResetPassword.passwordLengthValidation.getText().contains("lowercase letter"));
        Assert.assertTrue(ResetPassword.passwordLengthValidation.getText().contains("Any number from 1-9"));
        Assert.assertTrue(ResetPassword.passwordLengthValidation.getText().contains("Special character !@#$%^&*"));
        Assert.assertTrue(ResetPassword.passwordLengthValidation.getText().contains("()+=<>"));
        System.out.println("Minimum length of password is validated and error displayed is " + ResetPassword.passwordLengthValidation.getText());
        Assert.assertFalse(ResetPassword.saveButton.isEnabled());
        System.out.println("Save button is not enabled");

        ResetPassword.newPasswordTextBox.clear();
        ResetPassword.newPasswordTextBox.sendKeys("Testingggggggggggggggggg@12345");
        ResetPassword.newPasswordTextBox.sendKeys(Keys.TAB);
        Thread.sleep(3000);
        Assert.assertTrue(ResetPassword.passwordLengthValidation.isDisplayed());
        Assert.assertEquals("rgb(244, 67, 54)", ResetPassword.passwordLengthValidation.getCssValue("color"));
        Assert.assertTrue(ResetPassword.passwordLengthValidation.getText().contains("Password requirements:"));
        Assert.assertTrue(ResetPassword.passwordLengthValidation.getText().contains("9-25 characters"));
        Assert.assertTrue(ResetPassword.passwordLengthValidation.getText().contains("At least one uppercase and one"));
        Assert.assertTrue(ResetPassword.passwordLengthValidation.getText().contains("lowercase letter"));
        Assert.assertTrue(ResetPassword.passwordLengthValidation.getText().contains("Any number from 1-9"));
        Assert.assertTrue(ResetPassword.passwordLengthValidation.getText().contains("Special character !@#$%^&*"));
        Assert.assertTrue(ResetPassword.passwordLengthValidation.getText().contains("()+=<>"));
        System.out.println("Maximum length of password is validated and error displayed is " + ResetPassword.passwordLengthValidation.getText());
        System.out.println("Length validation is Successful");
        Assert.assertFalse(ResetPassword.saveButton.isEnabled());
        System.out.println("Save button is not enabled");
    }

    public static void firstTimeLoginValidation() throws InterruptedException {
        Thread.sleep(3000);
        Assert.assertTrue(ResetPassword.newPasswordFirstLoginRequiredError.isDisplayed());
        Assert.assertTrue(ResetPassword.newPasswordFirstLoginRequiredError.getText().contains("New Password is required"));
        Assert.assertEquals("rgb(36, 36, 36)", ResetPassword.newPasswordFirstLoginRequiredError.getCssValue("color"));
        System.out.println("Error displayed is " + ResetPassword.newPasswordFirstLoginRequiredError);
        Assert.assertTrue(ResetPassword.acceptedPasswordRequirement.isDisplayed());
        Assert.assertTrue(ResetPassword.acceptedPasswordRequirement.getText().contains("Password requirements:"));
        Assert.assertTrue(ResetPassword.acceptedPasswordRequirement.getText().contains("9-25 characters"));
        Assert.assertTrue(ResetPassword.acceptedPasswordRequirement.getText().contains("At least one uppercase and one"));
        Assert.assertTrue(ResetPassword.acceptedPasswordRequirement.getText().contains("lowercase letter"));
        Assert.assertTrue(ResetPassword.acceptedPasswordRequirement.getText().contains("Any number from 1-9"));
        Assert.assertTrue(ResetPassword.acceptedPasswordRequirement.getText().contains("Special characters accepted"));
        Assert.assertTrue(ResetPassword.acceptedPasswordRequirement.getText().contains("!@#$%^&*()+=<>"));
        Assert.assertEquals("rgb(36, 36, 36)", ResetPassword.acceptedPasswordRequirement.getCssValue("color"));
        System.out.println("Error displayed is " + ResetPassword.acceptedPasswordRequirement);
        System.out.println("First Time Login - Reset Password validation is successful");
    }

    public static void IncorrectOldPasswordValidation() throws InterruptedException {
        Thread.sleep(3000);
        ResetPassword.oldPasswordTextBox.sendKeys("Testing@54321");
        ResetPassword.newPasswordTextBox.sendKeys("Testing@321");
        ResetPassword.confirmNewPasswordTextBox.sendKeys("Testing@321");
        ResetPassword.saveButton.click();
        Thread.sleep(3000);
        Assert.assertTrue(ResetPassword.incorrectOldPasswordValidationMessage.isDisplayed());
        Assert.assertTrue(ResetPassword.incorrectOldPasswordValidationMessage.getText().contains("Incorrect Old Password."));
        Assert.assertEquals("Incorrect Old Password.", ResetPassword.incorrectOldPasswordValidationMessage.getText());
        Assert.assertEquals("rgb(244, 67, 54)", ResetPassword.incorrectOldPasswordValidationMessage.getCssValue("color"));
        System.out.println("Incorrect Old Password Validation is Successful");
        Assert.assertFalse(ResetPassword.saveButton.isEnabled());
        System.out.println("Save button is not enabled");
    }

    public static void userUpdatesResetPassword(String oldPassword, String newPassword, String email) throws InterruptedException {
        Thread.sleep(3000);
        ResetPassword.oldPasswordTextBox.sendKeys(oldPassword);
        ResetPassword.newPasswordTextBox.sendKeys(newPassword);
        ResetPassword.confirmNewPasswordTextBox.sendKeys(newPassword);
        ResetPassword.saveButton.click();
        System.out.println("Password Reset Sucessfully");
        Thread.sleep(5000);
        ResetPassword.notificationIcon.click();
        Assert.assertTrue(ResetPassword.successMessage.getText().contains("Password reset successfully."));
        System.out.println("Success message is  " + ResetPassword.successMessage.getText());
        ResetPasswordPanel.validateEmailForPasswordResetUpdate(email);
        System.out.println("Email notificcation for password reset is validated");
        Thread.sleep(5000);
    }

    public static void cancelFunctionality() throws InterruptedException {
        Thread.sleep(3000);
        ResetPassword.oldPasswordTextBox.sendKeys("oldPassword@1");
        ResetPassword.newPasswordTextBox.sendKeys("newPassword@1");
        ResetPassword.confirmNewPasswordTextBox.sendKeys("newPassword@1");
        ResetPassword.canccelButton.click();
        Thread.sleep(3000);
        Assert.assertTrue(!ResetPassword.resetPasswordWindow.isDisplayed());
        System.out.println("Cancel functionality is working as expected");
    }

    public static void validateEmailForPasswordResetUpdate(String email) throws InterruptedException {
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

                driver.close();
            }
        }
        driver.switchTo().window(currentHandle);
    }
}