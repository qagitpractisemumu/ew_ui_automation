package StepDefinition;

import PagePanel.*;
import Resource.LoggerHelper;
import cucumber.api.java.en.Then;
import org.apache.log4j.Logger;

import java.awt.*;

public class ResetPasswordStep {
    ResetPasswordPanel resetPasswordPanel = new ResetPasswordPanel();
    public static Logger log = LoggerHelper.getLogger(ResetPasswordStep.class);

    @Then("^User clicks on Profile icon$")
    public void userClicksOnEditProfileIcon() throws InterruptedException {
        ResetPasswordPanel.userClicksOnEditProfileIcon();
    }

    @Then("^User clicks on Reset Password$")
    public void userClicksOnResetPassword() throws InterruptedException {
        ResetPasswordPanel.userClicksOnResetPassword();
    }

    @Then("^User validates \"([^\"]*)\" on Reset Password$")
    public void userValidatesOnResetPassword(String validationScenario) throws Throwable {
        if (validationScenario.equals("All elements are displayed")) {
            ResetPasswordPanel.userValidatesAllElementsAreDisplayedOnResetPassword();
        } else if (validationScenario.equals("Required field validation")) {
            ResetPasswordPanel.userValidatesRequiredFieldValidationOnResetPassword();
        } else if (validationScenario.equals("Tab functionality")) {
            ResetPasswordPanel.userValidatesTabFunctionalityOnResetPassword();
        } else if (validationScenario.equals("Cursor is blinking on Old Password field")) {
            ResetPasswordPanel.userValidatesCursorIsBlinkingOnOldPasswordFieldOnResetPassword();
        } else if (validationScenario.equals("Old password and new password cannot be same")) {
            ResetPasswordPanel.userValidatesThatOldPasswordAndNewPasswordCannotBeSameOnResetPassword();
        } else if (validationScenario.equals("Password Unmatched")) {
            ResetPasswordPanel.userValidatesPasswordsUnmatchedErrorOnResetPassword();
        } else if (validationScenario.equals("Password requirement")) {
            ResetPasswordPanel.userValidatesPasswordRequirementOnResetPassword();
        } else if (validationScenario.equals("Length Validation")) {
            ResetPasswordPanel.userValidatesLengthValidationOnResetPassword();
        } else if (validationScenario.equals("First time login")) {
            ResetPasswordPanel.firstTimeLoginValidation();
        } else if (validationScenario.equals("Incorrect Old Password")) {
            ResetPasswordPanel.IncorrectOldPasswordValidation();
        }else if (validationScenario.equals("Cancel Functionality")){
            ResetPasswordPanel.cancelFunctionality();
        }
    }

    @Then("^User updated reset password with \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
    public void userUpdatesResetPassword(String oldPassword, String newPassword, String email) throws Throwable {
        ResetPasswordPanel.userUpdatesResetPassword(oldPassword,newPassword, email);
    }
}
