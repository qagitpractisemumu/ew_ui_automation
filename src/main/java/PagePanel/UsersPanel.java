package PagePanel;

import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Pages.Users;
import Resource.BaseClass;
import Resource.JavaScriptExecute;
import Resource.UtilityClass;

public class UsersPanel extends BaseClass {

    private static String uname;
    Users user;
    static JavaScriptExecute js;

    public UsersPanel() {
        user = PageFactory.initElements(driver, Users.class);
        js = new JavaScriptExecute(driver);
    }

    public static void clickOnUserMenu() throws InterruptedException {
        UtilityClass.waitForElement(Users.usersMenu);
        //Users.usersMenu.click();
        Thread.sleep(5000);
        Actions act = new Actions(driver);
        act.moveToElement(driver.findElement(By.linkText("Users"))).click().perform();
//		     Thread.sleep(3000);
//		     Users.firstNme.sendKeys("Test");
//				Thread.sleep(205000);
//		     
    }

    public static void enterFirstName(String firstName) {
        Users.firstName.clear();
        Users.firstName.sendKeys(firstName);
    }

    public static void userSearch(String firstnme) {
        driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys(firstnme);
    }

    public static void enterFirstnme(String firstnme) throws InterruptedException {
        Users.firstNme.sendKeys(firstnme);
        Thread.sleep(2000);

    }

    public static void enterFirstNameandLastname(String firstn, String lastn) throws InterruptedException {
        //	String fl=firstn.concat(lastn);
        String fandl = firstn.concat(" ").concat(lastn);
        Thread.sleep(3000);
        String xp = "//i[@title='" + fandl + "']";
        driver.findElement(By.xpath(xp)).click();
        Thread.sleep(2000);
    }

    public static void enterLastname(String lastname) {
        Users.lastName.clear();
        Users.lastName.sendKeys(lastname);
    }

    public static void enterLastName(String lastName) {
        Users.lastName.clear();
        Users.lastName.sendKeys(lastName);
    }

    public static void enterEmail(String email) throws InterruptedException {
        Thread.sleep(3000);
        Users.email.clear();
        Users.email.sendKeys(email);
    }

    public static void enterPhone(String phone) throws InterruptedException {
        Thread.sleep(3000);
        Users.phone.clear();
        Users.phone.sendKeys(phone);
        Thread.sleep(2000);
    }

    public static void enterUserName(String userName) throws InterruptedException {
        Thread.sleep(3000);
        //Users.userName.clear();
        Users.userName.sendKeys(userName);
    }

    public static void searchUName(String firstnme) throws InterruptedException {
        Thread.sleep(3000);
        Users.search1.sendKeys(firstnme);
        Thread.sleep(3000);
        try {
            boolean elementExist = driver.findElement(By.xpath("//i[@title='" + firstnme + "']")).isDisplayed();
            if (elementExist) {
                System.out.println("User created");
            }
        } catch (NoSuchElementException e) {
            System.out.println(e);
            System.out.println("User Not Created");
        }
    }

    public static void selectLoaction(String loaction) {
        UtilityClass.dropDownHandle(Users.loaction, loaction);
    }

    public static void selectCountry(String countrylocation) {
        Select ln = new Select(driver.findElement(By.name(countrylocation)));
        ln.selectByVisibleText("India");
    }

    public static void checkselectLoaction(String loaction) {
        UtilityClass.dropDownHandleCheck(Users.loaction, loaction);
    }

    public static void selectGroup(String group) {
        UtilityClass.dropDownHandle(Users.group, group);
    }

    public static void clickOnNext() {
        UtilityClass.waitForElement(Users.nextBtn);
        js.click(Users.nextBtn);
    }

    public static void clickOnNextUser() {
        UtilityClass.waitForElement(Users.nextBtn1);
        js.click(Users.nextBtn1);
    }

    public static void clickOnEdit() {
        UtilityClass.waitForElement(Users.Edit);
        js.click(Users.Edit);
    }

    public static void clickOnCancel() {
        UtilityClass.waitForElement(Users.cancelBtn);
        js.click(Users.cancelBtn);
    }

    public static void selectDrive(String drive) {
//		UtilityClass.waitForElement(
//				driver.findElement(By.xpath("//h5[normalize-space()='" + drive + "']//parent::div//child::input")));
        js.click(driver.findElement(By.xpath("//h5[normalize-space()='" + drive + "']//parent::div//child::input")));
        //return driver.findElement(By.xpath("//h5[normalize-space()='" + drive + "']//parent::div//child::input"));
    }

    public static int getUserCost() {
        UtilityClass.waitForElement(Users.userCost);

        return Integer.parseInt(Users.userCost.getText().replaceAll("[^0-9]", ""));
    }

    public static void clickOnCreate() {
        UtilityClass.waitForElement(Users.CreateBtn);
        Users.CreateBtn.click();
    }

    public static String getSuccessMsg() {
        UtilityClass.waitForElement(Users.successMsg);
        return Users.successMsg.getText();
    }

    public static void clickOnOK() throws InterruptedException {
        UtilityClass.waitForElement(Users.okBtn);
        Users.okBtn.click();
        Thread.sleep(2000);
    }

    public static void clickOnSharedDrive() {
        //UtilityClass.waitForElement(Users.sharedDrivetab);
        js.click(Users.sharedDrivetab);
    }

    //		public static void clickOnDeleteUser() {
//		UtilityClass.waitForElement(Users.deleteUserBtn);
//		Users.deleteUserBtn.click();
//	}
//	
    public static void clickOnLocalDrive() {
        js.click(Users.localDrivetab);
    }


    public static void searchForSharedDrive() throws InterruptedException {
        js.click(Users.sharedDrivetab);
        Thread.sleep(2000);
        try {

            boolean k = driver.findElement(By.xpath("//h4[normalize-space()='None']")).isDisplayed();
            if (k) {
                System.out.println("Driver is Not added");
            }
        } catch (NoSuchElementException e) {
            System.out.println(e);
            System.out.println("Driver is added");
        }
    }

    public static void clickOnDeleteUser() {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", Users.deleteUserBtn);
    }

    public static void clickNewBtn() {
        UtilityClass.waitForElement(Users.newBtn);
        Users.newBtn.click();
    }

    public static void performSelectLocation() {
        UtilityClass.selectClass("London", Users.locSelect);

    }

    public static void clickLocalDrive() throws InterruptedException {
        Thread.sleep(10000);
        UtilityClass.waitForElement(Users.localDrive);
        Users.localDrive.click();
    }

    public static void checkUsersLocalDrive() throws InterruptedException {
        Thread.sleep(10000);
        UtilityClass.checkLocalDrive(Users.noneCheckLocalDrive);
    }

    public static void clickUsersMenu() throws InterruptedException {
        Thread.sleep(15000);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", Users.userClick);
    }

    public static void clickCostPopupCancel() throws InterruptedException {
        Thread.sleep(4000);
        UtilityClass.waitForElement(Users.costPopupCancel);
        Users.costPopupCancel.click();
        System.out.println("Users is not created since we click cancel button");
    }

    public static void clickCreditNewBtn() throws InterruptedException {
        Thread.sleep(6000);
        UtilityClass.waitForElement(Users.creditNewBtn);
        Users.creditNewBtn.click();
        Thread.sleep(5000);
    }

    public static void clickCreditNewCancelBtn() {
        UtilityClass.waitForElement(Users.creditNewCancelBtn);
        Users.creditNewCancelBtn.click();
        System.out.println("credit card details not given,as we clicked cancel option");
    }

    public static void typeUserNameInSearchBox(String username) throws InterruptedException {
        Thread.sleep(2000);
        UtilityClass.waitForElement(Users.userSearchBox);
        Users.userSearchBox.sendKeys(username);
        Thread.sleep(1000);
    }

    public static void clickUserSearchBtn() throws InterruptedException {
        UtilityClass.waitForElement(Users.userSearchButton);
        Users.userSearchButton.click();
        Thread.sleep(1000);
    }

    public static void clickParticularUser() throws InterruptedException {
        UtilityClass.waitForElement(Users.particularUserSelect);
        Users.particularUserSelect.click();
        Thread.sleep(1500);
    }

    public static void clickEditoptionForUser() throws InterruptedException {
        UtilityClass.waitForElement(Users.userEditoption);
        Users.userEditoption.click();
        Thread.sleep(2000);
    }

    public static void enterUserEditDetails(String firstname, String lastname, String email, String phone) throws InterruptedException {
        UtilityClass.waitForElement(Users.firstName);
        Users.firstName.clear();
        Users.firstName.sendKeys(firstname);
        Thread.sleep(1500);
        UtilityClass.waitForElement(Users.lastName);
        Users.lastName.clear();
        Users.lastName.sendKeys(lastname);
        Thread.sleep(1500);
        UtilityClass.waitForElement(Users.email);
        Users.email.clear();
        Users.email.sendKeys(email);
        Thread.sleep(1000);
        UtilityClass.waitForElement(Users.phone);
        Users.phone.clear();
        Users.phone.sendKeys(phone);
        Thread.sleep(1000);
    }

    public static void clickLocalDriveForUser() throws InterruptedException {
        UtilityClass.waitForElement(Users.particularLocalDriveSelect);
        Users.particularLocalDriveSelect.click();
        Thread.sleep(2000);
    }

    public static void clickDeleteConfirmBtn() throws InterruptedException {
        Thread.sleep(3000);
        UtilityClass.waitForElement(Users.deleteConfirmBtn);
        Users.deleteConfirmBtn.click();
        Thread.sleep(1000);
        System.out.println("user is deleted successfully");
    }

    public static void enterUserNameEmailDetails(String firstname, String lastname, String email) throws InterruptedException {
        Thread.sleep(1000);
        UtilityClass.waitForElement(Users.firstName);
        Users.firstName.sendKeys(firstname);
        Thread.sleep(1000);
        UtilityClass.waitForElement(Users.lastName);
        Users.lastName.sendKeys(lastname);
        Thread.sleep(1000);
        UtilityClass.waitForElement(Users.email);
        Users.email.sendKeys(email);
        Thread.sleep(1000);

    }

    public static void enterUserDetails(String firstname, String lastname) throws InterruptedException {
        Thread.sleep(1000);
        UtilityClass.waitForElement(Users.firstName);
        Users.firstName.sendKeys(firstname);
        Thread.sleep(1000);
        UtilityClass.waitForElement(Users.lastName);
        Users.lastName.sendKeys(lastname);
        Thread.sleep(1000);
        UtilityClass.waitForElement(Users.email);
        Users.email.sendKeys("customUser" + ((long) Math.floor(Math.random() * 9_000L) + 1_000_0L) + "@yopmail.com");
        Thread.sleep(1000);

    }

    public static void enterUserPhoneNameDetails(String username, String phone) throws InterruptedException {
        Thread.sleep(1000);
        UtilityClass.waitForElement(Users.userName);
        uname = username + RandomStringUtils.randomAlphanumeric(4);
        Users.userName.sendKeys(uname);
        Thread.sleep(1000);
        UtilityClass.waitForElement(Users.phone);
        Users.phone.sendKeys(phone);
        Thread.sleep(1000);
    }

    public static void enterExistingUserPhoneNameDetails(String username, String phone) throws InterruptedException {
        Thread.sleep(1000);
        UtilityClass.waitForElement(Users.userName);
        uname = username;
        Users.userName.sendKeys(uname);
        Thread.sleep(1000);
        UtilityClass.waitForElement(Users.phone);
        Users.phone.sendKeys(phone);
        Thread.sleep(1000);
    }

    public static void enterUserNameDetails(String username) throws InterruptedException {
        Thread.sleep(1000);
        UtilityClass.waitForElement(Users.userName);
        Users.userName.sendKeys(username + ((long) Math.floor(Math.random() * 9_000L) + 1_000L));
        Thread.sleep(1000);
        UtilityClass.waitForElement(Users.phone);
        Users.phone.sendKeys(String.valueOf((long) Math.floor(Math.random() * 9_000_000_000L) + 1_000_000_000L));
        Thread.sleep(1000);
    }

    public static void clickingNewBtn() throws InterruptedException {
        Thread.sleep(1000);
        UtilityClass.waitForElement(Users.userCreateNewBtn);
        Users.userCreateNewBtn.click();
        Thread.sleep(1000);
    }

    public static void clickingUserDeleteSearchBtn() throws InterruptedException {
        Thread.sleep(1000);
        UtilityClass.waitForElement(Users.userSearchBtnDelete);
        Users.userSearchBtnDelete.click();
        Thread.sleep(1000);
    }

    public static void clickParticularUserToDelete() throws InterruptedException {
        Thread.sleep(1000);
        UtilityClass.waitForElement(Users.particularUserToDelete);
        Users.particularUserToDelete.click();
        Thread.sleep(1000);
    }

    public static void clickDeleteButtonForUser() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//i[@class='icon icon-trashcan'])[2]")).click();
        Thread.sleep(1000);

    }

    public static void clickUserCreateConfirmation() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//div[@class='bottom']//button)[5]")).click();
        Thread.sleep(7000);
    }

    public static void clickUserDeleteConfirmation() throws InterruptedException {
        Thread.sleep(1000);
        UtilityClass.waitForElement(Users.userDeleteConfirmation);
        Users.userDeleteConfirmation.click();
        Thread.sleep(5000);
        System.out.println("Successfully Deleted the User");
        Thread.sleep(5000);
    }

    public static void clickAddMultipleUsersBtn() throws InterruptedException {
        Thread.sleep(1000);
        UtilityClass.waitForElement(Users.multipleUsersBtnClick);
        Users.multipleUsersBtnClick.click();
        Thread.sleep(1500);
    }

    public static void clickSelectAllCheckbox() throws InterruptedException {
        Thread.sleep(1000);
        UtilityClass.waitForElement(Users.selectAllCheckboxMultipleUser);
        Users.selectAllCheckboxMultipleUser.click();
        Thread.sleep(1000);
    }

    public static void enterMultipleUserFirstName1(String firstname1) throws InterruptedException {
        Thread.sleep(1500);
        UtilityClass.waitForElement(Users.multipleUserFirstName1);
        Users.multipleUserFirstName1.sendKeys(firstname1);
        Thread.sleep(1000);
    }

    public static void enterMultipleUserLastName1(String lastname1) throws InterruptedException {
        Thread.sleep(1000);
        UtilityClass.waitForElement(Users.multipleUserLastName1);
        Users.multipleUserLastName1.sendKeys(lastname1);
        Thread.sleep(1000);
    }

    public static void enterMultipleUserEmail1(String email1) throws InterruptedException {
        Thread.sleep(1500);
        UtilityClass.waitForElement(Users.multipleUserEmail1);
        Users.multipleUserEmail1.sendKeys(email1);
        Thread.sleep(1000);
    }

    public static void enterMultipleUserUserName1(String username1) throws InterruptedException {
        Thread.sleep(1500);
        UtilityClass.waitForElement(Users.multipleUserUserName1);
        Users.multipleUserUserName1.sendKeys(username1);
        Thread.sleep(1000);
    }

    public static void selectPersonalDrive() throws InterruptedException {
        Thread.sleep(3000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        JavaScriptExecute jsec = new JavaScriptExecute(driver);
        jsec.click(driver.findElement(By.xpath("//label[@for='5db0723fa402105459739b3b']")));
        Thread.sleep(3000);
        System.out.println("Personal Drive Selected");
    }

    public static void selectTheGroup(String groupName) throws InterruptedException {
        Thread.sleep(3000);
        if (groupName.contains("lowComputeSharedDrive")) {
            driver.findElement(By.xpath("(//button[@type='button'])[5]")).click();
            Thread.sleep(3000);
            driver.findElement(By.xpath("//div[@id='add-new-user']/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]")).click();
            System.out.println("Low Compute Group Selected");
            Thread.sleep(3000);
        } else {
            Thread.sleep(3000);
            driver.findElement(By.xpath("(//button[@type='button'])[5]")).click();
            Thread.sleep(5000);
            driver.findElement(By.xpath("//div[@id='add-new-user']/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]")).click();
            System.out.println("High Compute Group Selected");
            Thread.sleep(5000);
        }
    }
}
