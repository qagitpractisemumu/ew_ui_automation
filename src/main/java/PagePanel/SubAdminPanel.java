package PagePanel;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import Pages.Location;
import Pages.Register;
import Pages.SubAdmins;
import Pages.Users;
import Resource.BaseClass;
import Resource.JavaScriptExecute;
import Resource.UtilityClass;

public class SubAdminPanel extends BaseClass {

    private static String subAdminsFirstName;
    SubAdmins subAdmins;
    static JavaScriptExecute js;

    public SubAdminPanel() {
        subAdmins = PageFactory.initElements(driver, SubAdmins.class);
        js = new JavaScriptExecute(driver);
    }

    public static WebElement getSubAdminProfile(String subAdmin) throws InterruptedException {
        driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys(subAdmin);
        Thread.sleep(2000);
        WebElement prof = driver
                .findElement(By.xpath("//div[@class='card-title'][normalize-space()='" + subAdmin + "']"));
        UtilityClass.waitForElement(prof);
        return prof;
    }

    public static WebElement verifyGroupname(String groupName) {
        WebElement profile1 = driver.findElement(By.xpath("//h6[normalize-space()='" + groupName + "']"));
        UtilityClass.waitForElement(profile1);
        return profile1;
    }

    public static void clickOnSubAdmin() throws InterruptedException {
        Thread.sleep(2000);
        UtilityClass.waitForElement(SubAdmins.subAdminMenu);
        SubAdmins.subAdminMenu.click();
        Thread.sleep(2000);
    }

    public static void sendFirstName(String firstName) throws InterruptedException {
        UtilityClass.waitForElement(SubAdmins.inputFirstName);
        SubAdmins.inputFirstName.clear();
        subAdminsFirstName = firstName;
        SubAdmins.inputFirstName.sendKeys(subAdminsFirstName);
        Thread.sleep(1500);
    }

    public static void sendLastName(String lastName) throws InterruptedException {
        UtilityClass.waitForElement(SubAdmins.inputLastName);
        SubAdmins.inputLastName.clear();
        SubAdmins.inputLastName.sendKeys(lastName);
        Thread.sleep(1500);
    }

    public static void sendPhone(String phone) throws InterruptedException {
        driver.findElement(By.xpath("//button[@id='countryCode']")).click();
        driver.findElement(By
                .xpath("//div[@id='add-CA-user-dialog']//div[@class='options-list']//*[contains(text(),'India (91)')]"))
                .click();
        UtilityClass.waitForElement(SubAdmins.inputPhone);

        Thread.sleep(2000);
        SubAdmins.inputPhone.sendKeys(phone);
    }

    public static void clickingPhoneCode() throws InterruptedException {
        Thread.sleep(3000);
        UtilityClass.waitForElement(Register.phoneCodeForRegister);
        Register.phoneCodeForRegister.click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[contains(text(),'United States (1)')]")).click();
        Thread.sleep(1500);
    }

    public static void clickingLoginPagePhoneCode(String mobile) throws InterruptedException {
        Thread.sleep(4000);
        UtilityClass.waitForElement(Register.loginPhoneCode);
        Register.loginPhoneCode.click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[contains(text(),'United States (1)')]")).click();
        Thread.sleep(1000);
        UtilityClass.waitForElement(Register.mobileTextBox);
        Register.mobileTextBox.sendKeys(mobile);

    }

    public static void clickingPhoneCodeForMultipleUsers(String mobile) throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@id='countryCode0'][1]")).click();
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", Users.countryCodeSelectMultipleUserCreate);
        UtilityClass.waitForElement(Users.multipleUserPhoneNumber1);
        Users.multipleUserPhoneNumber1.sendKeys(mobile);
        Thread.sleep(1000);
    }

    public static void selectingLocationForMultipleUsers() throws InterruptedException {
        Thread.sleep(2000);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", Users.multipleUserLocationClick);
        Thread.sleep(1500);
        JavascriptExecutor executor1 = (JavascriptExecutor) driver;
        executor1.executeScript("arguments[0].click();", Users.locationNameSelectMultipleUser);
        Thread.sleep(1000);
        System.out.println("Location is clicked successfully");
    }

    public static void selectGroupForMultipleUsersCreate() throws InterruptedException {
        Thread.sleep(2000);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", Users.multipleUserGroupClick);
        Thread.sleep(2000);
        JavascriptExecutor executor1 = (JavascriptExecutor) driver;
        executor1.executeScript("arguments[0].click();", Users.groupNameSelectMultipleUser);
        Thread.sleep(1000);
        System.out.println("fertilizer group is selected");

    }

    public static void selectDriveForMultipleUsersCreate() throws InterruptedException {
        Thread.sleep(2000);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", Users.multipleUserDriveClick);
        Thread.sleep(2000);
        JavascriptExecutor executor1 = (JavascriptExecutor) driver;
        executor1.executeScript("arguments[0].click();", Users.particularDriveSelectMultipleUserCreate);
        Thread.sleep(1000);
        System.out.println("Additional Local Drive is selected");
    }

    public static void clickSubAdminConfirmBtnJsExecutor() throws InterruptedException {
        Thread.sleep(2000);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", SubAdmins.subAdminConfirmBtnJsExecutor);
        Thread.sleep(2000);
        System.out.println("Itis used for clicking Submit button in Support and SubAdmins menu");
    }

    public static void clickLocationCreateSaveBtnJsExecutor() throws InterruptedException {
        Thread.sleep(2000);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", Location.locationCreateSaveBtnJsExecutor);
        Thread.sleep(5000);
    }

    public static void clickLocationCreateCancelBtnJsExecutor() throws InterruptedException {
        Thread.sleep(2500);
        Location.locationCreateCancelBtnJsExecutor.click();
        Thread.sleep(1000);
    }

    public static void selectLocationForUserCreate(String location) throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@id='newUserLocation']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[contains(text(),'Headquarters')]")).click();
        Thread.sleep(1000);
    }

    public static void selectingCountry() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.xpath("//select[@autocomplete='business-country']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[contains(text(),'India')]")).click();
        Thread.sleep(1000);
    }

    public static void sendEmail(String email) throws InterruptedException {
        UtilityClass.waitForElement(SubAdmins.inputEmail);
        SubAdmins.inputEmail.clear();
        SubAdmins.inputEmail.sendKeys(email);
        Thread.sleep(1500);
    }

    public static void clickOnReadOrWrite() throws InterruptedException {
        js.click(SubAdmins.readOrWriteBtn);
        Thread.sleep(2000);

    }

    public static void clickOnSubmit() throws InterruptedException {
        SubAdmins.submitBtn.click();
        Thread.sleep(2000);
    }

    public static void clickOnEdit() {
        UtilityClass.waitForElement(SubAdmins.editBtn);
        SubAdmins.editBtn.click();
    }

    public static void clickCreateAdminSubmitBtn() throws InterruptedException {
        Thread.sleep(2000);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", SubAdmins.createAdminSubmitBtn);
        System.out.println("Admin is created");

    }

    public static void typeSubAdminSearchBox(String adminname) throws InterruptedException {
        Thread.sleep(2000);
        UtilityClass.waitForElement(SubAdmins.subAdminSearchBox);
        SubAdmins.subAdminSearchBox.clear();
        SubAdmins.subAdminSearchBox.sendKeys(subAdminsFirstName);
        Thread.sleep(1000);
    }

    public static void clickSubAdminSearchBtn() throws InterruptedException {
        UtilityClass.waitForElement(SubAdmins.subAdminSearchBtn);
        SubAdmins.subAdminSearchBtn.click();
        Thread.sleep(2000);
    }

    public static void clickParticularSubAdmin() throws InterruptedException {
        UtilityClass.waitForElement(SubAdmins.selectingParticularSubAdmin);
        SubAdmins.selectingParticularSubAdmin.click();
        Thread.sleep(2000);
    }

    public static void clickSubAdminEditOption() throws InterruptedException {
        UtilityClass.waitForElement(SubAdmins.editBtn);
        SubAdmins.editBtn.click();
        Thread.sleep(2000);
    }

    public static void clickAdminDeleteBtn() throws InterruptedException {
        Thread.sleep(3000);
        UtilityClass.waitForElement(SubAdmins.adminDeleteBtn);
        SubAdmins.adminDeleteBtn.click();
        Thread.sleep(5000);
        System.out.println("Successfully deleted SubAdmin");
    }

    public static void clickAdminDeleteConfirmBtn() throws InterruptedException {
        Thread.sleep(1000);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", SubAdmins.adminDeleteConfirmBtn);
        System.out.println("Admin is deleted");

    }

    public static void enteringSubAdminDetails(String firstName, String lastName, String email)
            throws InterruptedException {
        Thread.sleep(2000);
        UtilityClass.waitForElement(SubAdmins.inputFirstName);
        SubAdmins.inputFirstName.sendKeys(firstName);
        Thread.sleep(1000);
        UtilityClass.waitForElement(SubAdmins.inputLastName);
        SubAdmins.inputLastName.sendKeys(lastName);
        Thread.sleep(2000);
        UtilityClass.waitForElement(SubAdmins.inputEmail);
        SubAdmins.inputEmail.sendKeys(email);

        Thread.sleep(7000);
        SubAdmins.inputPhone.sendKeys(Keys.TAB);

    }

    public static void clickBySelectAllSoftwares() throws InterruptedException, AWTException {
        Thread.sleep(3000);
        UtilityClass.waitForElement(SubAdmins.quickBooksAdvancedMenu);
        SubAdmins.quickBooksAdvancedMenu.click();
        Thread.sleep(1000);
        UtilityClass.waitForElement(SubAdmins.quickBooksEssentialMenu);
        SubAdmins.quickBooksEssentialMenu.click();
        Thread.sleep(1000);
        UtilityClass.waitForElement(SubAdmins.autoCadMenu);
        SubAdmins.autoCadMenu.click();
        Thread.sleep(1500);
        UtilityClass.waitForElement(SubAdmins.autoCadLTMenu);
        SubAdmins.autoCadLTMenu.click();
        Thread.sleep(2000);
        UtilityClass.waitForElement(SubAdmins.adobeIllustratorMenu);
        SubAdmins.adobeIllustratorMenu.click();
        Thread.sleep(2000);
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_DOWN);
        Thread.sleep(1500);
        UtilityClass.waitForElement(SubAdmins.adobePhotoshopMenu);
        SubAdmins.adobePhotoshopMenu.click();
        Thread.sleep(1000);
        UtilityClass.waitForElement(SubAdmins.eclipseMenu);
        SubAdmins.eclipseMenu.click();
        Thread.sleep(1000);
        UtilityClass.waitForElement(SubAdmins.zipMenu);
        SubAdmins.zipMenu.click();
        Thread.sleep(1000);
        UtilityClass.waitForElement(SubAdmins.adobeReaderMenu);
        SubAdmins.adobeReaderMenu.click();
        Thread.sleep(1000);
        UtilityClass.waitForElement(SubAdmins.chromeBrowserMenu);
        SubAdmins.chromeBrowserMenu.click();
        Thread.sleep(1000);
        UtilityClass.waitForElement(SubAdmins.firefoxBrowserMenu);
        SubAdmins.firefoxBrowserMenu.click();
        Thread.sleep(2000);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_DOWN);
        Thread.sleep(1500);
        UtilityClass.waitForElement(SubAdmins.microsoftE3Menu);
        SubAdmins.microsoftE3Menu.click();
        Thread.sleep(1000);
        UtilityClass.waitForElement(SubAdmins.microsoftE5Menu);
        SubAdmins.microsoftE5Menu.click();
        Thread.sleep(1500);
    }

    public static void clickingListViewOfApps() throws InterruptedException {
        Thread.sleep(2000);
        UtilityClass.waitForElement(SubAdmins.appsInListView);
        SubAdmins.appsInListView.click();
        Thread.sleep(1000);

    }

    public static void userEntersSubAdminDetails(String firstName, String lastName) throws InterruptedException {
        UtilityClass.waitForElement(SubAdmins.subAdminFirstName);
        SubAdmins.subAdminFirstName.sendKeys(firstName);
        Thread.sleep(1500);
        UtilityClass.waitForElement(SubAdmins.subAdminLastName);
        SubAdmins.subAdminLastName.sendKeys(lastName);
        Thread.sleep(1500);
        UtilityClass.waitForElement(SubAdmins.subAdminPhone);
        SubAdmins.subAdminPhone.sendKeys("305213" + ((long) Math.floor(Math.random() * 9_000L) + 1_000L));
        Thread.sleep(2000);
        UtilityClass.waitForElement(SubAdmins.subAdminEmail);
        SubAdmins.subAdminEmail.sendKeys("customerAdminSubAdmin" + ((long) Math.floor(Math.random() * 9_000L) + 1_000_0L) + "@yopmail.com");
        Thread.sleep(2000);
    }

    public static void searchSubAdmin() throws InterruptedException {
        Thread.sleep(2000);
        UtilityClass.waitForElement(SubAdmins.subAdminSearchBox);
        SubAdmins.subAdminSearchBox.clear();
        SubAdmins.subAdminSearchBox.sendKeys(subAdminsFirstName);
        Thread.sleep(1000);

    }
}
