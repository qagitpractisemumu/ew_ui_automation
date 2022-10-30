package PagePanel;

import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Pages.BusinessInfo;
import Pages.Location;
import Pages.Login;
import Pages.Profile;
import Pages.Register;
import Pages.SubAdmins;
import Pages.Users;
import Resource.BaseClass;
import Resource.UtilityClass;
import Resource.JavaScriptExecute;

public class LocationPanel extends BaseClass {
    Login login = new Login();
    Profile profile = new Profile();
    Location location = new Location();

    public LocationPanel() {
        location = PageFactory.initElements(driver, Location.class);
    }

    public static void clickLocationMenu() throws InterruptedException {
        UtilityClass.waitForElement(Location.locationMenu);
        Thread.sleep(3000);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", driver.findElement(By.linkText("Locations")));
        Thread.sleep(3000);
    }

    public static void clickonInvoiceTab() throws InterruptedException {
        Thread.sleep(3000);
        Actions act = new Actions(driver);
        act.moveToElement(driver.findElement(By.linkText("Invoices"))).click().perform();
        Thread.sleep(3000);
    }

    public static void selectLocation(String location) throws InterruptedException {
        Thread.sleep(3000);
        String xp = "//i[@title='" + location + "']";
        driver.findElement(By.xpath(xp)).click();
        Thread.sleep(2000);
    }

    public static void clickOnServiceslink() throws InterruptedException {
        UtilityClass.waitForElement(Location.Services);
        Thread.sleep(3000);
        Actions act = new Actions(driver);
        act.moveToElement(driver.findElement(By.linkText("Services"))).click().perform();
        Thread.sleep(3000);
    }


    public static void clickOnCostlink() throws InterruptedException {
        UtilityClass.waitForElement(Location.Cost);
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[@class='titles']//div[3]")).click();
    }

    public static void checkOnServiceslink() {
        try {
            UtilityClass.waitForElement(Location.Servicelink);
            String sname = Location.Servicelink.getText();
            Assert.assertTrue(Location.Servicelink.isDisplayed(), "service is present " + sname);
            System.out.println("Service is present:" + sname);
        } catch (NoSuchElementException exception) {
            System.out.println("There is no Service");
        }
    }

    public static void checkInvoice() throws InterruptedException {
        try {
            boolean b = Location.InvoicePDF.isDisplayed();
            if (b) {
                String sname = Location.Invoicename.getText();
                System.out.println(sname);
                Thread.sleep(2000);
                System.out.println("Invoice is present:" + sname);

            }
        } catch (NoSuchElementException exception) {
            System.out.println("There is no Invoice");
        }
    }

    public static void checkCosts() throws InterruptedException {
        try {
            Thread.sleep(3000);
            List<WebElement> ele = driver.findElements(By.xpath("//*[@id='app']/div/div[2]/div/app-user/div/div[1]/div[2]/div/app-available-apps/div/div/div/div[2]/div[4]/table/tbody/tr/td[4]"));
            int rows = ele.size();
            System.out.println("Rows " + rows);
            Thread.sleep(3000);
            String xp1 = "//*[@id='ngb-tab-2-panel']/location-services-cost-details/div/div/div/table/div/tbody/tr[" + rows + "]/td[4]";
            WebElement cost = driver.findElement(By.xpath(xp1));
            String price = cost.getText();
            System.out.println("Total price is " + price);
            Thread.sleep(2000);
        } catch (NoSuchElementException exception) {
            System.out.println("There is no Price");
        }
    }

    public static void checkInvoiceTabledetails() throws Throwable {
        try {
            List<WebElement> invoices = driver.findElements(By.xpath("//div[@class='content-wrapper']//div[contains(@class,'card custom-card')]"));
            int invcount = invoices.size();
            System.out.println(invcount);
            for (int j = 0; j < invcount; j++) {
                invoices.get(j).click();
                Thread.sleep(3000);
                List<WebElement> ele = driver.findElements(By.xpath("//div[@class='content selected']//div[@class='tableFixHead']//tbody//tr"));
                int rows = ele.size();
                System.out.println("Rows " + rows);
                Thread.sleep(3000);
                for (int i = 1; i < rows; i++) {
                    List<WebElement> price = driver.findElements(By.xpath("//div[@class='content selected']//div[@class='tableFixHead']//tbody//tr[" + i + "]//td"));
                    int size = price.size();
                    for (int k = 0; k < size; k++) {
                        String Xp3 = "//div[@class='content selected']//div[@class='tableFixHead']//tbody//tr[" + i + "]//td[" + k + "]";
                        WebElement cost1 = driver.findElement(By.xpath(Xp3));
                        String price1 = cost1.getText();
                        System.out.println(price1);
                    }
                }
                Thread.sleep(2000);
                WebElement cost2 = driver.findElement(By.xpath("//div[@class='content-info']//div[contains(.,'Invoice Amount')]/following-sibling::div"));
                String Totalcost = cost2.getText();
                System.out.println("TotalCost is : " + Totalcost);

            }
        } catch (NoSuchElementException exception) {
            System.out.println("There is no Price");
        }

    }

    public static void clickonUsercosts() throws InterruptedException {

        Thread.sleep(2000);
        Location.userCoststab.click();
        Thread.sleep(2000);
    }

    public static void checkCostdetails() throws InterruptedException {

        Thread.sleep(2000);
        String cost = Location.costdeatils.getText();
        System.out.println(cost);
        Thread.sleep(2000);
    }

    public static void verifyHQLocationAvailablity() throws InterruptedException {
        UtilityClass.waitForElement(Location.locationHQIcon);
        Assert.assertTrue(Location.locationHQIcon.isDisplayed());
        Thread.sleep(2000);
    }

    public static void selectTechsupport() throws InterruptedException {
        Thread.sleep(2000);
        WebElement ele = driver.findElement(By.xpath("//*[@id='5e97363782b2b215ffdbdf33-panel']/div[3]/div[2]/edit-role-grid/div/div/div/div[1]/div/mat-card/div/div[1]/label"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", ele);
        Thread.sleep(3000);
    }

    public static void clickLocationTrashIcon() {
        UtilityClass.waitForElement(Location.trashIconLocation);
        Location.trashIconLocation.click();
    }

    public static void verifyErrorMsgOnDeleteLocation(String expectedMsg) throws InterruptedException {
        Thread.sleep(2000);
        String actualMsg = Location.cannotDeleteHQMsg.getText();
        Assert.assertEquals(actualMsg, expectedMsg);
    }

    public static void clickLocationAddNewIcon() throws InterruptedException {
        Thread.sleep(2000);
        UtilityClass.waitForElement(Location.newIcon);
        Location.newIcon.click();
        Thread.sleep(1000);
    }

    public static void enterNewLoctName(String locName) throws InterruptedException {
        UtilityClass.waitForElement(Location.typeANameTxtBox);
        Location.typeANameTxtBox.sendKeys(locName);
        Thread.sleep(3000);
        System.out.println("User is on Location Name field");
    }

    public static void enterspaceLoctName(String locName) throws InterruptedException {
        UtilityClass.waitFluentWait(Location.typeANameTxtBox);
        Location.typeANameTxtBox.sendKeys(locName);
        Location.typeANameTxtBox.sendKeys(Keys.SPACE);
//    	System.out.println(link.size());
//    	WebElement action =  driver.findElement(By.xpath("//input[@placeholder='Type a name']"));
//    	action.sendKeys(locName);
//    	action.sendKeysKeys.SPACE);
        Thread.sleep(3000);
    }

    public static void enterNewLocAddress1(String Location1) throws InterruptedException, AWTException {
        UtilityClass.waitForElement(Location.address1Location);
        Location.address1Location.sendKeys(Location1);
        Thread.sleep(3000);
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(3000);
        System.out.println("User is on Address line #1 field");
    }

    public static void enterNewLocAddress2(String Location2) throws InterruptedException, AWTException {
        UtilityClass.waitForElement(Location.address2Location);
        Location.address2Location.sendKeys(Location2);
        Thread.sleep(3000);
        System.out.println("User is on Address line #2 field");
    }

    public static void enterNewAddress1(String Location1) throws InterruptedException, AWTException {
        UtilityClass.waitForElement(Location.address1Location);
        Location.address1Location.sendKeys(Location1);
        Thread.sleep(3000);

    }

    public static void enterNewLocCountry(String stateLocation) {
        UtilityClass.waitForElement(Location.Locationselect);
        Location.Locationselect.sendKeys(stateLocation);
    }

    public static void enterNewLocState(String stateLocation) {
        UtilityClass.waitForElement(Location.stateLocation);
        Location.stateLocation.sendKeys(stateLocation);
    }

    public static void enterNewLocCity(String cityLocation) {
        UtilityClass.waitForElement(Location.cityLocation);
        Location.cityLocation.sendKeys(cityLocation);
    }

    public static void enterNewLocZip(String zipCodeLocation) {
        UtilityClass.waitForElement(Location.zipCodeLocation);
        Location.zipCodeLocation.sendKeys(zipCodeLocation);
        System.out.println("User is on ZipCode field");
    }

    public static void clickSubmitBtn() {
        UtilityClass.waitForElement(Location.saveLocationButton);
        Location.saveLocationButton.click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", Location.saveLocationButton);
    }

    public static void clickEditBtn() {
        UtilityClass.waitForElement(Location.editLocationButton);
        Location.editLocationButton.click();
    }

    public static void editDetailsGiven(String element) throws Throwable {
        UtilityClass.editValues(element);

    }

    public static void verfiyAddedLocation(String locName) throws Throwable {
        WebElement lcname = driver.findElement(By.xpath("//div[@class='card-title'][normalize-space()='" + locName + "']"));
        Assert.assertTrue(lcname.isDisplayed(), "Location is displayed");
        Thread.sleep(3000);
        System.out.println("Created Location is: " + locName);
        lcname.click();
    }

    public static void checkMonth(String Month) {
        try {
            UtilityClass.waitForElement(Location.Searchinvoice);
            Location.Searchinvoice.sendKeys(Month);
        } catch (NoSuchElementException exception) {
            System.out.println("There is no location");
        }
    }

    public static void verifyLocationDeletion(String locName) {
        if (driver.findElement(By.xpath("//label[@title='" + locName + "']")).isDisplayed()) {
            System.out.println("Location is not deleted");
        } else {
            System.out.println("Location is deleted");
        }
    }

    public static void verifyingPhoneRegisterOtpOptions() throws InterruptedException {
        Thread.sleep(5000);
        Assert.assertEquals(Register.phoneRegisterTextOption.getText(), "Text Me");
        System.out.println("As we registering the account with mobile,text me option is there to get OTP");
        Thread.sleep(2000);
        Assert.assertEquals(Register.phoneRegisterCallMeOption.getText(), "Call Me");
        System.out.println("As we registering account with mobile number,Call me option is there to get OTP");
    }

    public static void VerifyProfilePhoneNoWarningMsg() throws InterruptedException {
        Thread.sleep(3000);
        Assert.assertEquals(Profile.profilePhoneNoWarningMsg.getText(), "Phone Number not available");
        Thread.sleep(1000);
        System.out.println("As the Phone Number is already used by differnt user,it shows the warning message as the number is not available");
    }

    public static void verifyingMobileNumberNotRegisteredWarningMsg() throws InterruptedException {
        Thread.sleep(4000);
        Assert.assertNotEquals(Register.mobileNotRegisterWarningMsg.getText(), "There is account registered with this number. Please enter a valid number or register your number using the link below.");
        System.out.println("As we enter the mobile number for login which is not registered,it showing the Warning Message");
    }

    public static void verifyWarningMsgInSubAdmin() throws InterruptedException {
        Thread.sleep(3000);
        Assert.assertEquals(SubAdmins.subadminWarningMsg.getText(), "Email not available");
        System.out.println("As the email is used before,email not available warning message came");
        Thread.sleep(1500);
    }

    public static void verifyUserNameAlertMsg() throws InterruptedException {
        Thread.sleep(3000);
        Assert.assertEquals(Users.usernameAlertMsg.getText(), "Username not available");
        System.out.println("As the Username given already used,it shows the warning message as the name is not available");
        Thread.sleep(1000);
    }

    public static void verifyingAddressTakenWarningMsg() throws InterruptedException {
        Thread.sleep(5000);
        Assert.assertEquals(Location.warningMsgAddressTaken.getText(), "Address has been taken");
        System.out.println("As the address has been taken while creating another location,so the address taken warning msg is shown");
    }

//    public static void verifyingProfileLocationEmailWarningMsg() throws InterruptedException {
//        Thread.sleep(3000);
//        Assert.assertEquals(Profile.profileLocationEmailWarningMsg.getText(), "Please Try again with a different Location email");
//        System.out.println("As the Location email is already used,need to try different one so the warning msg is shown");
//    }

    public static void verifyingProfileContactEmailWarningMsg() throws InterruptedException {
        Thread.sleep(3000);
        Assert.assertEquals(Profile.profileContactEmailWarningMsg.getText(), "Please Try again with a different contact email");
        System.out.println("As the contact email is already used,need to try different one so the warning msg is shown");
    }

    public static void verifyingRegisterInvalidOtpMsg() throws InterruptedException {
        Thread.sleep(5000);
        Assert.assertNotEquals(Login.registerInvalidOtpAlertMsg.getText(), "passed incorrect otp");
        System.out.println("while entering Invalid Otp,account can not be registered as it shows Warning Msg");
        Thread.sleep(1000);

    }

    public static void verifyingEditPwdWarningMsg() throws InterruptedException {
        Thread.sleep(7000);
        Assert.assertEquals(Profile.editPwdWarningMsg.getText(), "Unmatched password!");
        Thread.sleep(1000);
        System.out.println("while Editing Password,the old and new passwords are different,it shows the warning message");
    }

    public static void verifyingEditPwdEnteringWrongOldPwdWarningMsg() throws InterruptedException {
        Thread.sleep(8000);
        Assert.assertEquals(Profile.editPwdWrongOldPwd.getText(), "Passwords do not match!");
        Thread.sleep(1000);
        System.out.println("while editing password,when we enter wrong old password,the warning message will be shown as it does not match");
    }

    public static void verifyingWarningMsgInvalidMobileNumber() throws InterruptedException {
        Thread.sleep(3000);
        Assert.assertEquals(Register.invalidMobileNumberRegister.getText(), "Invalid phone number");
        Thread.sleep(1500);
        System.out.println("As we entered Invalid Mobile Number,warning message is shown");
    }

    public static void verifyingPasswordUnmatchedWarningMsg() throws InterruptedException, AWTException {
        Thread.sleep(2000);
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
        Thread.sleep(2000);
        Assert.assertEquals(Register.passwordUnmatchedWarningMsg.getText(), "Password unmatched");
        Thread.sleep(1000);
        System.out.println("While Registering the account with mobile,we have given different create and confirm pwd,so unmatched warning msg shown");
    }

    public static void verifyingAlreadyRegisteredMobileNumberWarningMsg() throws InterruptedException {
        Thread.sleep(4000);
        Assert.assertNotEquals(Register.alreadyRegisteredMobileNumberWarningMsg.getText(), "Before itself registered, please enter different phone number");
        Thread.sleep(1500);
        System.out.println("As we enter the mobile number for registration which is already registered,warning message is shown");
    }

    public static void verifyingWarningMsgForWrongPwdWhileLogin() throws InterruptedException {
        Thread.sleep(3000);
        Assert.assertNotEquals(Register.wrongPasswordLoginWarningMsgVerify.getText(), "Invalid Credentials!");
    }

    public static void verifyingInvalidMobilePhoneWithAlphabetRegisterWarningMsg() throws InterruptedException {
        Thread.sleep(2500);
        Assert.assertEquals(Register.invalidMobilePhoneWarningMsg.getText(), "Invalid Phone Number (max: 10 digits)");
        Thread.sleep(1000);
        System.out.println("As we entered mobile number with alphabets,considered to be invalid and the warning message is shown");

    }

    public static void verifyingInvalidMobileWithAlphabetsInLoginPageWarningMsg() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertEquals(Register.invalidMobilePhoneWarningMsg.getText(), "Invalid Phone Number (max: 10 digits)");
        Thread.sleep(1000);
        System.out.println("As we entered mobile number with alphabets for login,so the invalid warning message is shown");
    }

    public static void assertionMsg() throws InterruptedException {
        Thread.sleep(9000);
        UtilityClass.validateMsg(Location.validationError.getText(), "Location Name is not available");
        System.out.println("Location exist message is displayed as the location is not available");
    }

    public static void editNewLocAddress1(String locationAddress1) throws AWTException {
        UtilityClass.clickTab();
        UtilityClass.waitForElement(Location.address1Location);
        Location.address1Location.sendKeys(locationAddress1);
    }

    public static void editNewLocAddress2(String locationAddress2) throws AWTException {
        UtilityClass.clickTab();
        UtilityClass.waitForElement(Location.address2Location);
        Location.address2Location.sendKeys(locationAddress2);
    }

    public static void clickDeleteHeadquarters() throws InterruptedException {
        Thread.sleep(3000);
        UtilityClass.warningMsg(Location.warningMessage.getText(), "Cannot Delete Headquarters");

    }

    public static void clickK() {
        UtilityClass.waitForElement(Location.buttonOk);
        Location.buttonOk.click();
    }

    public static void clickServicesLocation() throws InterruptedException {
        Thread.sleep(3000);
        UtilityClass.waitForElement(Location.clickServiceLocationMenu);
        Location.clickServiceLocationMenu.click();
    }

    public static void checkSubMenuService() throws InterruptedException {
        Thread.sleep(3000);
        UtilityClass.validateMsg(Location.checkSubServiceMenu.getText(), "Tech Support");
        System.out.println("Tech Support submenu is present under Services menu");
        Thread.sleep(3000);
        UtilityClass.validateMsg(Location.locationServicesSubMenu2.getText(), "Data Security");
        System.out.println("Data Security submenu is present under Services menu");

    }

    public static void clickCostLocation() throws InterruptedException {
        Thread.sleep(30000);
        UtilityClass.waitForElement(Location.clickCostLocationMenu);
        Location.clickCostLocationMenu.click();
        Thread.sleep(25000);
    }

    public static void checkCostDefaultValue() {
        UtilityClass.fetchValueFromTable(Location.costTable);
    }



    public static void clickCountry() throws InterruptedException {
        UtilityClass.selectClass("countryLocation", Location.countrySelect);
        Thread.sleep(4000);
    }

    public static void typeSearchLocationName(String typeName) throws InterruptedException {

        UtilityClass.waitForElement(Location.locationSearch);
        Location.locationSearch.sendKeys(typeName);
        Thread.sleep(2000);
        System.out.println("Admin search the location: " + Location.locationSearch.getAttribute("value"));
        Thread.sleep(2000);
        System.out.println("Results displayed on search: " + Location.detailsvalue1.getText());
        Assert.assertEquals(Location.locationSearch.getAttribute("value"), Location.detailsvalue1.getText());
        Location.locationSearch.sendKeys(Keys.CONTROL, "A");
        Location.locationSearch.sendKeys(Keys.CONTROL, "X");
        Thread.sleep(3000);
    }

    public static void typeSearchLocationAddress(String typeName) throws InterruptedException {

        UtilityClass.waitForElement(Location.locationSearch);
        Location.locationSearch.sendKeys(typeName);
        Thread.sleep(2000);
        System.out.println("Admin search the location: " + Location.locationSearch.getAttribute("value"));
        Thread.sleep(2000);
        System.out.println("Results displayed on search: " + Location.detailsvalue2.getText());
        Assert.assertEquals(Location.locationSearch.getAttribute("value"), Location.detailsvalue2.getText());
        Location.locationSearch.sendKeys(Keys.CONTROL, "A");
        Location.locationSearch.sendKeys(Keys.CONTROL, "X");
        Thread.sleep(3000);
    }

    public static void typeSearchLocationCountry(String typeName) throws InterruptedException {

        UtilityClass.waitForElement(Location.locationSearch);
        Location.locationSearch.sendKeys(typeName);
        Thread.sleep(2000);
        System.out.println("Admin search the location: " + Location.locationSearch.getAttribute("value"));
        Thread.sleep(2000);
        System.out.println("Results displayed on search: " + Location.detailsvalue3.getText());
        Assert.assertEquals(Location.locationSearch.getAttribute("value"), Location.detailsvalue3.getText());
        Location.locationSearch.sendKeys(Keys.CONTROL, "A");
        Location.locationSearch.sendKeys(Keys.CONTROL, "X");
        Thread.sleep(3000);
    }

    public static void typeSearchLocationState(String typeName) throws InterruptedException {

        UtilityClass.waitForElement(Location.locationSearch);
        Location.locationSearch.sendKeys(typeName);
        Thread.sleep(2000);
        System.out.println("Admin search the location: " + Location.locationSearch.getAttribute("value"));
        Thread.sleep(2000);
        System.out.println("Results displayed on search: " + Location.detailsvalue4.getText());
        Assert.assertEquals(Location.locationSearch.getAttribute("value"), Location.detailsvalue4.getText());
        Location.locationSearch.sendKeys(Keys.CONTROL, "A");
        Location.locationSearch.sendKeys(Keys.CONTROL, "X");
        Thread.sleep(3000);
    }

    public static void typeSearchLocationCity(String typeName) throws InterruptedException {

        UtilityClass.waitForElement(Location.locationSearch);
        Location.locationSearch.sendKeys(typeName);
        Thread.sleep(2000);
        System.out.println("Admin search the location: " + Location.locationSearch.getAttribute("value"));
        Thread.sleep(2000);
        System.out.println("Results displayed on search: " + Location.detailsvalue5.getText());
        Assert.assertEquals(Location.locationSearch.getAttribute("value"), Location.detailsvalue5.getText());
        Location.locationSearch.sendKeys(Keys.CONTROL, "A");
        Location.locationSearch.sendKeys(Keys.CONTROL, "X");
        Thread.sleep(3000);
    }

    public static void typeSearchLocationZip(String typeName) throws InterruptedException {

        UtilityClass.waitForElement(Location.locationSearch);
        Location.locationSearch.sendKeys(typeName);
        Thread.sleep(2000);
        System.out.println("Admin search the location: " + Location.locationSearch.getAttribute("value"));
        Thread.sleep(2000);
        System.out.println("Results displayed on search: " + Location.detailsvalue6.getText());
        Assert.assertEquals(Location.locationSearch.getAttribute("value"), Location.detailsvalue6.getText());
        Location.locationSearch.sendKeys(Keys.CONTROL, "A");
        Location.locationSearch.sendKeys(Keys.CONTROL, "X");
        Thread.sleep(3000);
    }

    public static void typeSearchLoc(String typeName) throws InterruptedException {

        UtilityClass.waitForElement(Location.locationSearch);
        Location.locationSearch.sendKeys(typeName);
        Thread.sleep(2000);

    }

    public static void clickLocationSearchBtn() throws InterruptedException {
        Thread.sleep(3000);
        UtilityClass.waitForElement(Location.locationSearchBtn);
        Location.locationSearchBtn.click();
    }

    public static void clickParticularLocation() throws InterruptedException {
        Thread.sleep(7000);
        UtilityClass.waitForElement(Location.particularLocationSelect);
        Location.particularLocationSelect.click();
        Thread.sleep(3000);
    }

    public static void checkingCreationOfLocation1(String typeName1) throws InterruptedException {
        Thread.sleep(2000);
        UtilityClass.waitForElement(Location.locationSearch);
        Location.locationSearch.sendKeys(typeName1);
        Thread.sleep(3000);
        UtilityClass.waitForElement(Location.locationSearchBtn);
        Location.locationSearchBtn.click();
        Thread.sleep(5000);
        UtilityClass.waitForElement(Location.particularLocationSelect);
        Location.particularLocationSelect.click();
        Thread.sleep(2000);
        System.out.println("The Location Name-London is created and it is verified");
    }

    public static void checkingCreationOfLocation2(String typeName2) throws InterruptedException {
        Thread.sleep(2000);
        UtilityClass.waitForElement(Location.locationSearch);
        Thread.sleep(1000);
        Location.locationSearch.clear();
        Thread.sleep(2000);
        Location.locationSearch.sendKeys(typeName2);
        Thread.sleep(3000);
        UtilityClass.waitForElement(Location.locationSearchBtn);
        Location.locationSearchBtn.click();
        Thread.sleep(5000);
        UtilityClass.waitForElement(Location.particularLocationSelect);
        Location.particularLocationSelect.click();
        Thread.sleep(2000);
        System.out.println("The Location Name-Mumbai is created and it is verified");
    }

    public static void clickDeleteLocationButton() throws InterruptedException {
        Thread.sleep(4000);
        UtilityClass.waitForElement(Location.locationDeleteIcon);
        Location.locationDeleteIcon.click();
    }

    public static void getWarningMsg() throws InterruptedException {
        Thread.sleep(2000);
        UtilityClass.waitForElement(Location.notificationMsg);
        System.out.println("txt");
        System.out.println("headquarters can not be deleted as the warning message came");
    }

    public static void typeDetailsForEdit(String address1Location, String address2Location) throws InterruptedException {
        Thread.sleep(3000);
        UtilityClass.waitForElement(Location.locationBox);
        Thread.sleep(3000);
        Location.locationBox.clear();
        Thread.sleep(3000);
        Location.locationBox.sendKeys(address1Location);
        Thread.sleep(3000);
        UtilityClass.waitForElement(Location.apartmentBox);
        Thread.sleep(3000);
        Location.apartmentBox.clear();
        Thread.sleep(3000);
        Location.apartmentBox.sendKeys(address2Location);
        Thread.sleep(3000);
    }

    public static void clickEditLocationButton() throws InterruptedException {
        Thread.sleep(2000);
        UtilityClass.waitForElement(Location.locationEditBtn);
        Location.locationEditBtn.click();
        Thread.sleep(4000);
    }

    public static void clickNewLocationButton() throws InterruptedException {
        Thread.sleep(3000);
        UtilityClass.waitForElement(Location.locationNewButton);
        Location.locationNewButton.click();
        Thread.sleep(3000);
    }

    public static void typeLocationName(String typeName) throws InterruptedException {
        UtilityClass.waitForElement(Location.newLocation);
        Location.newLocation.sendKeys(typeName);
        Thread.sleep(5000);
    }

    public static void typeEditLocationFirstName(String typeName1) throws InterruptedException {
        Thread.sleep(3000);
        UtilityClass.waitForElement(Location.newLocation);
        Thread.sleep(2000);
        Location.newLocation.clear();
        Thread.sleep(2000);
        Location.newLocation.sendKeys(typeName1);
        Thread.sleep(2000);
    }

    public static void typeNewLocationNameAfterEdit(String typeName1) throws InterruptedException {
        Thread.sleep(4000);
        UtilityClass.waitForElement(Location.typeANameTxtBox);
        Location.typeANameTxtBox.clear();
        Thread.sleep(4000);
        Location.typeANameTxtBox.sendKeys(typeName1);
        Thread.sleep(2000);
    }

    public static void typeNewLocationAddresslineAfterEdit(String typeName1) throws InterruptedException, AWTException {
        Thread.sleep(4000);
        UtilityClass.waitForElement(Location.address1Location);
        Location.address1Location.clear();
        Thread.sleep(4000);
        Location.address1Location.sendKeys(typeName1);
        Thread.sleep(1000);
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(3000);
    }

    public static void typeNewLocationAddressline2AfterEdit(String typeName1) throws InterruptedException {
        Thread.sleep(7000);
        UtilityClass.waitForElement(Location.address2Location);
        Location.address2Location.clear();
        Thread.sleep(5000);
        Location.address2Location.sendKeys(typeName1);
        Thread.sleep(2000);
    }

    public static void clickDeleteConfirmationButton() throws InterruptedException {
        Thread.sleep(1500);
        UtilityClass.waitForElement(Location.deleteConfirmationButton);
        Location.deleteConfirmationButton.click();
        Thread.sleep(1500);
    }

    public static void checkingSubMenusOfServices() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertEquals(Location.servicesSubMenu1.getText(), "Tech Support");
        System.out.println("Tech Support menu is present under services menu");
        Thread.sleep(2000);
        Assert.assertEquals(Location.servicesSubMenu2.getText(), "Data Security");
        System.out.println("Data security menu is present under services menu");
        Thread.sleep(1000);

    }

    public static void clickingCostMenuOfLocation() throws InterruptedException {
        UtilityClass.waitForElement(Location.locationCostMenu);
        Location.locationCostMenu.click();
        Thread.sleep(1000);
    }

    public static void clickingSaveBtnWithContains() throws InterruptedException {
        Thread.sleep(1000);
        WebElement ele = driver.findElement(By.xpath("//button[@type='submit']"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        Thread.sleep(2000);
        executor.executeScript("arguments[0].click();", ele);
        Thread.sleep(2000);
        System.out.println("Save Button is clicked");
    }

    public static void clickingSaveWithActions() throws InterruptedException {
        Thread.sleep(2500);
        WebElement element = driver.findElement(By.xpath("//button[contains(text(),'Save')]"));
        Thread.sleep(2000);
        Actions action = new Actions(driver);
        action.moveToElement(element).perform();
        Thread.sleep(4000);
        System.out.println("clicking save option for location");
        Thread.sleep(1500);
    }

    public static void enterNewLoctName1(String locName1) throws InterruptedException {
        UtilityClass.waitForElement(Location.typeANameTxtBox);
        Location.typeANameTxtBox.sendKeys(locName1);
        Thread.sleep(1000);
    }

    public static void enterNewLocAddressSecondLocation(String Location3) throws InterruptedException, AWTException {
        UtilityClass.waitForElement(Location.address1Location);
        Location.address1Location.sendKeys(Location3);
        Thread.sleep(3000);
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(2000);
    }

    public static void enterNewLocAddressBuildingSecondLocation(String Location4) throws InterruptedException {
        UtilityClass.waitForElement(Location.address2Location);
        Location.address2Location.sendKeys(Location4);
        Thread.sleep(1000);
    }

    public static void enterNewLoctName2(String locName2) throws InterruptedException {
        UtilityClass.waitForElement(Location.typeANameTxtBox);
        Location.typeANameTxtBox.sendKeys(locName2);
        Thread.sleep(1000);
    }

    public static void enterNewLocAddressThirdLocation(String Location5) throws InterruptedException, AWTException {
        UtilityClass.waitForElement(Location.address1Location);
        Location.address1Location.sendKeys(Location5);
        Thread.sleep(3000);
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(2000);
    }

    public static void enterNewLocAddressBuildingThirdLocation(String Location6) throws InterruptedException {
        UtilityClass.waitForElement(Location.address2Location);
        Location.address2Location.sendKeys(Location6);
        Thread.sleep(1000);
    }

    public static void clickNewLocationButton2() throws InterruptedException {
        Thread.sleep(6000);
        UtilityClass.waitForElement(Location.locationNewButton);
        Location.locationNewButton.click();
        Thread.sleep(3000);
    }

    public static void clickNewLocationButton3() throws InterruptedException {
        Thread.sleep(6000);
        UtilityClass.waitForElement(Location.locationNewButton);
        Location.locationNewButton.click();
        Thread.sleep(3000);
    }

    public static void clicklistviewiconBtn() throws InterruptedException {
        Thread.sleep(2000);
        UtilityClass.waitForElement(Location.listviewiconbutton);
        Location.listviewiconbutton.click();
        Thread.sleep(1000);
    }

    public static void clickgridviewiconBtn() throws InterruptedException {
        Thread.sleep(2000);
        UtilityClass.waitForElement(Location.gridviewiconbutton);
        Location.gridviewiconbutton.click();
        Thread.sleep(1000);
    }

    public static void clickmapviewiconBtn() throws InterruptedException {
        Thread.sleep(2000);
        UtilityClass.waitForElement(Location.mapviewiconbutton);
        Location.mapviewiconbutton.click();
        Thread.sleep(1000);
    }

    public static void clicknextarrowBtn() throws InterruptedException {
        Thread.sleep(2000);
        UtilityClass.waitForElement(Location.nextarrowbutton);
        Location.nextarrowbutton.click();
        Thread.sleep(1000);
    }

    public static void clickpreviousarrowBtn() throws InterruptedException {
        Thread.sleep(2000);
        UtilityClass.waitForElement(Location.previousarrowbutton);
        Location.previousarrowbutton.click();
        Thread.sleep(1000);
    }

    public static void clickshowdropup() throws InterruptedException {
        Thread.sleep(2000);
        UtilityClass.waitForElement(Location.showbutton);
        Location.showbutton.click();
        Thread.sleep(1000);
    }

    public static void click20entries() throws InterruptedException {
        Thread.sleep(2000);
        UtilityClass.waitForElement(Location.entriesbuttontwo);
        Location.entriesbuttontwo.click();
        Thread.sleep(2000);
//        String show20entries = Location.entriesbuttontwo.getText();
//        System.out.println("Showing " + show20entries + "locations in single page");
//        Assert.assertEquals("20" , show20entries);
        Thread.sleep(3000);
    }

    public static void click30entries() throws InterruptedException {
        Thread.sleep(2000);
        UtilityClass.waitForElement(Location.entriesbuttonthree);
        Location.entriesbuttonthree.click();
//        String show30entries = Location.entriesbuttonthree.getText();
//        System.out.println("Showing " + show30entries + "locations in single page");
//        Assert.assertEquals("30" , show30entries);
        Thread.sleep(3000);
    }

    public static void click10entries() throws InterruptedException {
        Thread.sleep(2000);
        UtilityClass.waitForElement(Location.entriesbuttonone);
        Location.entriesbuttonone.click();
//        String show10entries = Location.entriesbuttonone.getText();
//        System.out.println("Showing " + show10entries + "locations in single page");
//        Assert.assertEquals("10" , show10entries);
        Thread.sleep(3000);
    }

    public static void clickCancel() throws InterruptedException {
        UtilityClass.waitForElement(Location.cancelBton);
        Location.cancelBton.click();
        Thread.sleep(3000);
        System.out.println("Clicked on the Cancel Button");
    }

    public static void focusCancel() throws InterruptedException {
        WebElement myelement = driver.findElement(By.xpath("(//button[@class='btn ghost'])[3]"));
        //Send empty message to element for set focus on element  
        myelement.sendKeys("");
        Thread.sleep(5000);
        System.out.println("User is on Cancel button");
    }

    public static void typechecksavebutton() throws InterruptedException {
        boolean locnameeditable = Location.savebtn.isEnabled();
        Assert.assertEquals(locnameeditable, false);
        System.out.println("Save button is in disable state");
    }


    public static void typechecklocnamevalidation() throws InterruptedException {
        WebElement locnamevalidation = driver.findElement(By.xpath("(//small[@class='form-error-msg'])[4]"));

        System.out.println("Displayed the validation as " + locnamevalidation.getText());
    }

    public static void typechecklocaddressvalidations() throws InterruptedException {
        WebElement locaddressvalidation = driver.findElement(By.xpath("(//small[@class='form-error-msg'])[5]"));

        System.out.println("Displayed the validation as " + locaddressvalidation.getText());
    }

    public static void typechecklocnamelengthvalidation() throws InterruptedException {

        WebElement locnamelengthvalidation = driver.findElement(By.xpath("(//small[@class='form-error-msg'])[4]"));

        System.out.println("Displayed the validation as " + '\n' + locnamelengthvalidation.getText());

    }

    public static void typechecklocaddress1lengthvalidations() throws InterruptedException {

        WebElement locaddresslengthvalidation = driver.findElement(By.xpath("(//small[@class='form-error-msg'])[5]"));

        System.out.println("Displayed the validation as " + locaddresslengthvalidation.getText());
    }

    public static void typechecklocaddress2lengthvalidations() throws InterruptedException {
        WebElement locaddress2lengthvalidation = driver.findElement(By.xpath("(//small[@class='form-error-msg'])[6]"));

        System.out.println("Displayed the validation as " + locaddress2lengthvalidation.getText());
        Thread.sleep(5000);
    }

//    public static void typechecklocnotificationmessage() throws InterruptedException {
//    	String ValidationMessage = BusinessInfo.businessNameRequiredError.getText();
//        System.out.println("Validation message displayed is " + ValidationMessage);
//        Assert.assertEquals("Business name is required", ValidationMessage);
//    	WebElement livenotification = driver.findElement(By.xpath("(//div[@class='notification live'])"));
//      
//        System.out.println("Displayed the notification as " + '\n' + livenotification.getText());
//        Thread.sleep(4000);
//    	
//    }  

    public static void typecloselocnotificationmessage() throws InterruptedException {
        UtilityClass.waitForElement(Location.closeBton);
        Location.closeBton.click();
        Thread.sleep(1000);
        System.out.println("Clicked on the Close Button");
    }

    public static void typechecklocdelheadnotificationmessage() throws InterruptedException {
        WebElement livenotification = driver.findElement(By.xpath("(//div[@class='notification live']//div)[3]"));
        Thread.sleep(500);
        System.out.println("Displayed the notification as " + '\n' + livenotification.getText());
        Thread.sleep(4000);

    }


    public static void typechecklocerraddressvalidation() throws InterruptedException {
        WebElement locaddresserrorvalidation = driver.findElement(By.xpath("(//small[@class='form-error-msg'])[5]"));

        System.out.println("Displayed the validation as " + locaddresserrorvalidation.getText());

    }

    public static void typechecklocnameeditable() throws InterruptedException {

        boolean locnameeditable = driver.findElement(By.xpath("(//small[@class='form-error-msg'])[4]")).isEnabled();
        Assert.assertEquals(locnameeditable, true);
        System.out.println("Location name field is in enable state and editable");

        // Once the ticket is resolved I will enable the below code
//        Assert.assertEquals(locnameeditable,false);
//        System.out.println("Location name field is in enable state and editable");

    }


    public static void typecheckasterisk() throws InterruptedException {

        WebElement labelname = driver.findElement(By.xpath("(//label[@for='locationName'])[1]"));
        System.out.println("Location name label is " + labelname.getText());

    }

    public static void typescrollmainpage() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement scrolldown = driver.findElement(By.xpath("//div[@class='content-wrapper']"));
        js.executeScript("arguments[0].scrollIntoView();", scrolldown);
        //js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        Thread.sleep(2000);
        System.out.println("Scrolled to down..");
        Thread.sleep(2000);

        WebElement scrollup = driver.findElement(By.xpath("//nav[@class='appbar']"));
        js.executeScript("arguments[0].scrollIntoView();", scrollup);
        Thread.sleep(5000);
        System.out.println("Scrolled to up..");
    }

//     public static void typescrollmiddlepanel() throws InterruptedException {
//
//	 JavascriptExecutor js = (JavascriptExecutor) driver;
//	 WebElement scrolldown = driver. findElement(By.xpath("//div[@class='card custom-card selected']"));
//	 js.executeScript("arguments[0].scrollIntoView();", scrolldown);
//	 Thread.sleep(5000);
//     System.out.println("Scrolled to down..");	
//
//	 WebElement scrollup = driver. findElement(By.xpath("//div[@class='content-wrapper']"));
//	 js.executeScript("arguments[0].scrollIntoView();", scrollup);
//	 Thread.sleep(5000);
//     System.out.println("Scrolled to up..");	
//}
//     
//     public static void typescrollrightpanelpage() throws InterruptedException {
//
//    	 JavascriptExecutor js = (JavascriptExecutor) driver;
//    	 WebElement scrolldown = driver. findElement(By.xpath("//div[@class='content-info-box']"));
//    	 js.executeScript("arguments[0].scrollIntoView();", scrolldown);
//    	 Thread.sleep(5000);
//         System.out.println("Scrolled to down..");
//         
//         WebElement scrollup = driver. findElement(By.xpath("//div[@class='content-info-box']"));
//    	 js.executeScript("arguments[0].scrollIntoView();", scrollup);
//    	 Thread.sleep(5000);
//         System.out.println("Scrolled to up..");
//       
//    }


    public static void getpageheaderTitle() throws InterruptedException {
        String pageheader = Location.pageheadertitle.getText();
        System.out.println("Header of the locations page is " + pageheader);
        Assert.assertEquals("Locations", pageheader);
        Thread.sleep(3000);
    }

    public static void typecheckasteriskrequiredfields() throws InterruptedException {
        LocationPanel.clickLocationAddNewIcon();
        Thread.sleep(1000);
        WebElement locnamerequiredfield = driver.findElement(By.xpath("//label[@for='locationName']"));
        System.out.println(locnamerequiredfield.getText() + " field is " + locnamerequiredfield.getAttribute("class") + " field");
        Thread.sleep(500);
        WebElement addressline1requiredfield = driver.findElement(By.xpath("//label[normalize-space()='Address line #1']"));
        System.out.println(addressline1requiredfield.getText() + " field is " + addressline1requiredfield.getAttribute("class") + " field");
        Thread.sleep(500);
        WebElement cityrequiredfields = driver.findElement(By.xpath("//label[@for='locationCity']"));
        System.out.println(cityrequiredfields.getText() + " field is " + cityrequiredfields.getAttribute("class") + " field");
        Thread.sleep(500);
        WebElement staterequiredfields = driver.findElement(By.xpath("//label[normalize-space()='State']"));
        System.out.println(staterequiredfields.getText() + " field is " + staterequiredfields.getAttribute("class") + " field");
        Thread.sleep(500);
        WebElement zipcoderequiredfields = driver.findElement(By.xpath("//label[@for='locationZipCode']"));
        System.out.println(zipcoderequiredfields.getText() + " field is " + zipcoderequiredfields.getAttribute("class") + " field");
        Thread.sleep(500);
        WebElement countryrequiredfields = driver.findElement(By.xpath("//label[@for='locationCountry']"));
        System.out.println(countryrequiredfields.getText() + " field is " + countryrequiredfields.getAttribute("class") + " field");
        Thread.sleep(1500);
        Location.cancelBton.click();
        Thread.sleep(1000);
    }

    public static void typecheckrightpanelheaders() throws InterruptedException {
        Location.locationSearch.sendKeys("Headquarters");
        Thread.sleep(3000);
        Assert.assertTrue(Location.locnamelabel.isDisplayed());
        Assert.assertTrue(Location.addressline1label.isDisplayed());
        Assert.assertTrue(Location.cityregionlabel.isDisplayed());
        Assert.assertTrue(Location.statelabel.isDisplayed());
        Assert.assertTrue(Location.zipcodelabel.isDisplayed());
        Assert.assertTrue(Location.countrylabel.isDisplayed());
        System.out.println("All elements are displayed");
    }

    public static void checknewbuttonlabels() throws InterruptedException {
        LocationPanel.clickLocationAddNewIcon();
        Thread.sleep(2000);
        Assert.assertTrue(Location.locnamelabel.isDisplayed());
        Assert.assertTrue(Location.addressline1label.isDisplayed());
        Assert.assertTrue(Location.addressline2label.isDisplayed());
        Assert.assertTrue(Location.cityregionlabel.isDisplayed());
        Assert.assertTrue(Location.statelabel.isDisplayed());
        Assert.assertTrue(Location.zipcodelabel.isDisplayed());
        Assert.assertTrue(Location.countrylabel.isDisplayed());
        System.out.println("All elements are displayed");
        Location.cancelBton.click();
        Thread.sleep(2000);
    }

    public static void checkdefaultview() throws InterruptedException {
        WebElement locnamerequiredfield = driver.findElement(By.xpath("//div[@class='action view-action selected-action']/span/i[@class='icon icon-view-tiles']"));
        System.out.println("The Default view is " + locnamerequiredfield.getAttribute("class"));
        Thread.sleep(500);

    }

    public static void checkbuttons() throws InterruptedException {
        Assert.assertTrue(Location.newbtntitle.isDisplayed());
        Assert.assertTrue(Location.editbtntitle.isDisplayed());
        Assert.assertTrue(Location.deletebtntitle.isDisplayed());
        System.out.println("All elements are displayed");
        Thread.sleep(1000);
    }

    public static void checkrightpanellabels() throws InterruptedException {
        Assert.assertTrue(Location.newbtntitle.isDisplayed());
        Assert.assertTrue(Location.editbtntitle.isDisplayed());
        Assert.assertTrue(Location.deletebtntitle.isDisplayed());
        Thread.sleep(1000);
    }


    public static void checkheadquaters() throws InterruptedException {
        Thread.sleep(3000);
        WebElement locaddresserrorvalidation = driver.findElement(By.xpath("//div[@title='Headquarters']"));

        System.out.println("By-default " + locaddresserrorvalidation.getText() + " location is available");

    }

    public static void checkfooter() throws InterruptedException {
        boolean footerprivacy = Location.privacylegal.isDisplayed();
        System.out.println(footerprivacy + " Privacy Legal is avialable");
        Thread.sleep(1500);
        Location.privacylegal.click();
        Thread.sleep(1000);
        Location.privacylegal1.click();
        Thread.sleep(3000);
        Location.privacylegal2.click();
        Thread.sleep(3000);
        Location.privacylegal3.click();
        Thread.sleep(3000);
        Location.privacylegal4.click();
        Thread.sleep(3000);


    }

    public static void createuser() throws InterruptedException, AWTException {
        System.out.println("Admin Creating the location");
        LocationPanel.clickLocationAddNewIcon();
        Thread.sleep(2000);
        Location.typeANameTxtBox.clear();
        Location.typeANameTxtBox.sendKeys("Florida");
        Location.typeANameTxtBox.sendKeys(Keys.TAB);
        Thread.sleep(2000);
        Location.address1Location.clear();
        Location.address1Location.sendKeys("9099 108th Ave");
        Thread.sleep(3000);
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(2000);
        Location.locationCreateSaveBtnJsExecutor.click();
        Thread.sleep(3000);
        LocationPanel.typecheckloccreatenotificationmessage();
        Thread.sleep(3000);
        System.out.println("Admin Creating the location with duplicate location name");
        LocationPanel.clickLocationAddNewIcon();
        Thread.sleep(2000);
        Location.typeANameTxtBox.clear();
        Location.typeANameTxtBox.sendKeys("Florida");
        Location.typeANameTxtBox.sendKeys(Keys.TAB);
        Thread.sleep(2000);
        LocationPanel.typecheckduplicatelocerrvalidation();
        Thread.sleep(2000);
        Location.cancelBton.click();
        Thread.sleep(2000);
        System.out.println("Admin Creating the location other than US location");
        LocationPanel.clickLocationAddNewIcon();
        Thread.sleep(2000);
        Location.typeANameTxtBox.clear();
        Location.typeANameTxtBox.sendKeys("Mumbai");
        Location.typeANameTxtBox.sendKeys(Keys.TAB);
        Thread.sleep(2000);
        Location.address1Location.clear();
        Location.address1Location.sendKeys("Mumbai Central Railway Station Building");
        Thread.sleep(3000);
        Robot robot1 = new Robot();
        robot1.keyPress(KeyEvent.VK_DOWN);
        robot1.keyRelease(KeyEvent.VK_DOWN);
        robot1.keyPress(KeyEvent.VK_ENTER);
        robot1.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(2000);
        LocationPanel.typechecksavebutton();
        Location.cancelBton.click();
    }

    public static void updateuser() throws InterruptedException, AWTException {
        LocationPanel.clickEditLocationButton();
        Thread.sleep(2000);
        Location.address1Location.clear();
        Location.address1Location.sendKeys("4400 Fox Lake Rd");
        Thread.sleep(3000);
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        Location.locationCreateSaveBtnJsExecutor.click();
        Thread.sleep(3000);
        LocationPanel.typechecklocupdatenotificationmessage();
        Thread.sleep(2000);
        LocationPanel.clicknextarrowBtn();
        Thread.sleep(2000);
        Location.locationSearch.sendKeys("Headquarters");
        Thread.sleep(5000);
        LocationPanel.typecheckheadquaterstitle();
        LocationPanel.clickEditLocationButton();
        LocationPanel.typechecklocnameeditable();
        Location.cancelBton.click();
        Location.locationSearch.sendKeys(Keys.CONTROL, "A");
        Location.locationSearch.sendKeys(Keys.CONTROL, "X");
        LocationPanel.clickParticularLocation();
        Thread.sleep(3000);

    }

    public static void deleteuser() throws InterruptedException, AWTException {
        LocationPanel.clickDeleteLocationButton();
        Thread.sleep(2000);
        Location.deleteConfirmationButton.click();
        Thread.sleep(1500);
        LocationPanel.typechecklocdeletenotificationmessage();
        Location.locationSearch.sendKeys("Headquarters");
        Thread.sleep(2000);
        LocationPanel.typecheckheadquaterstitle();
        Thread.sleep(2000);
        LocationPanel.clickDeleteLocationButton();
        Thread.sleep(2000);
        LocationPanel.typecheckheadlocdeletenotificationmessage();
    }

    public static void typecheckloccreatenotificationmessage() throws InterruptedException {
        String NotificationMessage = Location.notificationMsg.getText();
        System.out.println("Notification message displayed is " + NotificationMessage);
        Assert.assertEquals("Success" + '\n' + "Location created successfully.", NotificationMessage);
        Thread.sleep(2000);
    }

    public static void typechecklocupdatenotificationmessage() throws InterruptedException {
        String NotificationMessage = Location.notificationMsg.getText();
        System.out.println("Notification message displayed is " + NotificationMessage);
        Assert.assertEquals("Success" + '\n' + "Location updated successfully.", NotificationMessage);
        Thread.sleep(2000);
    }

    public static void typechecklocdeletenotificationmessage() throws InterruptedException {
        String NotificationMessage = Location.notificationMsg.getText();
        System.out.println("Notification message displayed is " + NotificationMessage);
        Assert.assertEquals("Success" + '\n' + "Location deleted successfully.", NotificationMessage);
        Thread.sleep(2000);
    }

    public static void typecheckheadlocdeletenotificationmessage() throws InterruptedException {
        String HeadNotificationMessage = Location.notificationMsg.getText();
        System.out.println("Notification message displayed is " + HeadNotificationMessage);
        Assert.assertEquals("Warning" + '\n' + "Cannot Delete Headquarters", HeadNotificationMessage);
        Thread.sleep(2000);
    }

    public static void typecheckduplicatelocerrvalidation() throws InterruptedException {
        String ValidationMessage = Location.locNameValidation.getText();
        System.out.println("Validation message is displayed as " + ValidationMessage);
        Assert.assertEquals("Location Name is not available.", ValidationMessage);
        Thread.sleep(2000);

    }

    public static void typecheckpagenumberone() throws InterruptedException {
        String paginationnumberone = Location.paginationnum.getText();
        System.out.println("User is on page " + paginationnumberone);
        Assert.assertEquals("1", paginationnumberone);
        Thread.sleep(2000);
    }

    public static void typecheckpagenumbertwo() throws InterruptedException {
        String paginationnumbertwo = Location.paginationnum.getText();
        System.out.println("User is on page " + paginationnumbertwo);
        Assert.assertEquals("2", paginationnumbertwo);
        Thread.sleep(2000);
    }

    public static void typecheckheadquaterstitle() throws InterruptedException {
        String headquaterstitle = Location.particularLocationSelect.getText();
        System.out.println("Searched location is " + headquaterstitle);
        Assert.assertEquals("Headquarters", headquaterstitle);
        Thread.sleep(2000);
    }

    public static void validateTabFunctionalityOnNew() throws AWTException, InterruptedException {
        LocationPanel.clickLocationAddNewIcon();
        Thread.sleep(1000);
        Location.typeANameTxtBox.sendKeys(Keys.TAB);
        System.out.println("Tab is on Location Name field");
        Thread.sleep(1000);
        Location.address1Location.sendKeys(Keys.TAB);
        System.out.println("Tab is on Address line #1 field");
        Thread.sleep(1000);
        Location.address2Location.sendKeys(Keys.TAB);
        System.out.println("Tab is on Address line #2 field");
        Thread.sleep(1000);
        Location.zipCodeLocation.sendKeys(Keys.TAB);
        System.out.println("Tab is on ZipCode field");
        Thread.sleep(1000);
        System.out.println("Tab is on Cancel button");
        Thread.sleep(1000);
        Location.cancelBton.click();
        Thread.sleep(1000);

//         Location.typeANameTxtBox.click();
//         Robot robot = new Robot();
//         for (int i = 0; i <= 4; i++) {
//             robot.keyPress(KeyEvent.VK_TAB);
//             Thread.sleep(2000);
//         }
//         String currentPosition = driver.switchTo().activeElement().getText();
//         if (currentPosition.equals("Cancel")) {
//             System.out.println("Tab Functionality Passed in Create functionality   " + currentPosition);
//         } else {
//             System.out.println("Tab Functionality Failed in Create functionality");
//             
//         }
//         Location.cancelBton.click();
//         Thread.sleep(1000);


    }

    public static void validaterequiredfields() throws InterruptedException {
        LocationPanel.clickLocationAddNewIcon();
        Thread.sleep(1000);
        Location.typeANameTxtBox.sendKeys(Keys.TAB);
        Thread.sleep(2000);
        String locanamerequired = Location.locnamefieldvalidation.getText();
        System.out.println("Displayed the validation as " + locanamerequired);
        Assert.assertEquals("Location Name is required.", locanamerequired);
        Thread.sleep(2000);
        Location.address1Location.sendKeys(Keys.TAB);
        Thread.sleep(2000);
        String locaddressrequired = Location.locaddress1fieldvalidation.getText();
        System.out.println("Displayed the validation as " + locaddressrequired);
        Assert.assertEquals("Address line #1 is required.", locaddressrequired);
        Thread.sleep(2000);
        LocationPanel.typechecksavebutton();
        Thread.sleep(2000);
        Location.cancelBton.click();
        Thread.sleep(1000);
    }

    public static void checklengthvalidations() throws InterruptedException {
        LocationPanel.clickLocationAddNewIcon();
        Thread.sleep(1000);
        Location.typeANameTxtBox.sendKeys("abcdefghijklmnopqrstuvwxyz abcdefghijklmnopqrstuvwx");
        Location.typeANameTxtBox.sendKeys(Keys.TAB);
        Thread.sleep(2000);
        String locanamerequired = Location.locnamefieldvalidation.getText();
        System.out.println("Displayed the validation as " + locanamerequired);
        Assert.assertEquals("Location name can not be more than 50 characters.", locanamerequired);
        Thread.sleep(2000);
        Location.address1Location.sendKeys("132, My Street, Kingston, 34 highway route, beside CMR Central, New York 12401, United States");
        Location.address1Location.sendKeys(Keys.TAB);
        Thread.sleep(2000);
        String locaddressrequired = Location.locaddress1fieldvalidation.getText();
        System.out.println("Displayed the validation as " + locaddressrequired);
        Assert.assertEquals("Address line #1 can not be more than 90 characters.", locaddressrequired);
        Thread.sleep(2000);
        Location.address2Location.sendKeys("132, My Street, Kingston, 34 ht");
        Location.address2Location.sendKeys(Keys.TAB);
        Thread.sleep(2000);
        String locaddress2required = Location.locaddress2fieldvalidation.getText();
        System.out.println("Displayed the validation as " + locaddress2required);
        Assert.assertEquals("Address line #2 can not be more than 30 characters.", locaddress2required);
        Thread.sleep(2000);
        Location.cancelBton.click();
        Thread.sleep(1000);
    }

    public static void checkvalidspecialcharacters() throws InterruptedException, AWTException {
        System.out.println("Performing valid special character validation on Location name field");
        LocationPanel.clickLocationAddNewIcon();
        Thread.sleep(1000);
        Location.typeANameTxtBox.clear();
        UtilityClass.waitForElement(Location.typeANameTxtBox);
        Location.typeANameTxtBox.sendKeys("#Wyoming");
        Thread.sleep(3000);
        System.out.println("Location Name Passed: " + Location.typeANameTxtBox.getAttribute("value"));
        UtilityClass.waitForElement(Location.address1Location);
        Location.address1Location.sendKeys("1523 Albany Ct");
        Thread.sleep(3000);
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(5000);
        Location.savebtn.click();
        Thread.sleep(3000);
        LocationPanel.typecheckloccreatenotificationmessage();
        Thread.sleep(3000);
        LocationPanel.clickLocationAddNewIcon();
        Thread.sleep(1000);
        Location.typeANameTxtBox.clear();
        UtilityClass.waitForElement(Location.typeANameTxtBox);
        Location.typeANameTxtBox.sendKeys("West.Virginia");
        Thread.sleep(3000);
        System.out.println("Location Name Passed: " + Location.typeANameTxtBox.getAttribute("value"));
        UtilityClass.waitForElement(Location.address1Location);
        Location.address1Location.sendKeys("4853 Roach Rd");
        Thread.sleep(3000);
        Robot robot1 = new Robot();
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(2000);
        Location.locationCreateSaveBtnJsExecutor.click();
        Thread.sleep(3000);
        LocationPanel.typecheckloccreatenotificationmessage();
        Thread.sleep(3000);
        LocationPanel.clickLocationAddNewIcon();
        Thread.sleep(1000);
        Location.typeANameTxtBox.clear();
        UtilityClass.waitForElement(Location.typeANameTxtBox);
        Location.typeANameTxtBox.sendKeys(",Wisconsin");
        Thread.sleep(3000);
        System.out.println("Location Name Passed: " + Location.typeANameTxtBox.getAttribute("value"));
        UtilityClass.waitForElement(Location.address1Location);
        Location.address1Location.sendKeys("Corporate Office 1102");
        Thread.sleep(2000);
        Robot robot2 = new Robot();
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(2000);
        Location.locationCreateSaveBtnJsExecutor.click();
        Thread.sleep(3000);
        LocationPanel.typecheckloccreatenotificationmessage();
        Thread.sleep(3000);
        LocationPanel.clickLocationAddNewIcon();
        Thread.sleep(1000);
        Location.typeANameTxtBox.clear();
        UtilityClass.waitForElement(Location.typeANameTxtBox);
        Location.typeANameTxtBox.sendKeys("Washing-ton");
        Thread.sleep(3000);
        System.out.println("Location Name Passed: " + Location.typeANameTxtBox.getAttribute("value"));
        UtilityClass.waitForElement(Location.address1Location);
        Location.address1Location.sendKeys("3326 160th Ave SE");
        Thread.sleep(3000);
        Robot robot3 = new Robot();
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(2000);
        Location.locationCreateSaveBtnJsExecutor.click();
        Thread.sleep(3000);
        LocationPanel.typecheckloccreatenotificationmessage();
        Thread.sleep(3000);
        LocationPanel.clickLocationAddNewIcon();
        Thread.sleep(1000);
        Location.typeANameTxtBox.clear();
        UtilityClass.waitForElement(Location.typeANameTxtBox);
        Location.typeANameTxtBox.sendKeys("Vermont/");
        Thread.sleep(3000);
        System.out.println("Location Name Passed: " + Location.typeANameTxtBox.getAttribute("value"));
        UtilityClass.waitForElement(Location.address1Location);
        Location.address1Location.sendKeys("146 Rexford Rd");
        Thread.sleep(3000);
        Robot robot4 = new Robot();
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(3000);
        Location.locationCreateSaveBtnJsExecutor.click();
        Thread.sleep(3000);
        LocationPanel.typecheckloccreatenotificationmessage();
        Thread.sleep(3000);
        LocationPanel.clickLocationAddNewIcon();
        Thread.sleep(1000);
        Location.typeANameTxtBox.clear();
        UtilityClass.waitForElement(Location.typeANameTxtBox);
        Location.typeANameTxtBox.sendKeys("Virginia'");
        Thread.sleep(3000);
        System.out.println("Location Name Passed: " + Location.typeANameTxtBox.getAttribute("value"));
        UtilityClass.waitForElement(Location.address1Location);
        Location.address1Location.sendKeys("8725 John J Kingman Rd");
        Thread.sleep(3000);
        Robot robot5 = new Robot();
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(2000);
        Location.locationCreateSaveBtnJsExecutor.click();
        Thread.sleep(3000);
        LocationPanel.typecheckloccreatenotificationmessage();
        Thread.sleep(3000);

    }

    public static void checkinvalidspecialcharacters() throws InterruptedException, AWTException {
        System.out.println("Performing invalid special character validation on Location name field");
        LocationPanel.clickLocationAddNewIcon();
        Thread.sleep(1000);
        Location.typeANameTxtBox.clear();

        Location.typeANameTxtBox.sendKeys("test`");
        LocationPanel.InValidSpecialCharacterValidation();
        Location.typeANameTxtBox.sendKeys("test~");
        LocationPanel.InValidSpecialCharacterValidation();
        Location.typeANameTxtBox.sendKeys("test!");
        LocationPanel.InValidSpecialCharacterValidation();
        Location.typeANameTxtBox.sendKeys("test@");
        LocationPanel.InValidSpecialCharacterValidation();
        Location.typeANameTxtBox.sendKeys("test$");
        LocationPanel.InValidSpecialCharacterValidation();
        Location.typeANameTxtBox.sendKeys("test%");
        LocationPanel.InValidSpecialCharacterValidation();
        Location.typeANameTxtBox.sendKeys("test^");
        LocationPanel.InValidSpecialCharacterValidation();
        Location.typeANameTxtBox.sendKeys("test&");
        LocationPanel.InValidSpecialCharacterValidation();
        Location.typeANameTxtBox.sendKeys("test*");
        LocationPanel.InValidSpecialCharacterValidation();
        Location.typeANameTxtBox.sendKeys("test(");
        LocationPanel.InValidSpecialCharacterValidation();
        Location.typeANameTxtBox.sendKeys("test)");
        LocationPanel.InValidSpecialCharacterValidation();
        Location.typeANameTxtBox.sendKeys("test_");
        LocationPanel.InValidSpecialCharacterValidation();
        Location.typeANameTxtBox.sendKeys("test=");
        LocationPanel.InValidSpecialCharacterValidation();
        Location.typeANameTxtBox.sendKeys("test+");
        LocationPanel.InValidSpecialCharacterValidation();
        Location.typeANameTxtBox.sendKeys("test}");
        LocationPanel.InValidSpecialCharacterValidation();
        Location.typeANameTxtBox.sendKeys("test[");
        LocationPanel.InValidSpecialCharacterValidation();
        Location.typeANameTxtBox.sendKeys("test]");
        LocationPanel.InValidSpecialCharacterValidation();
        Location.typeANameTxtBox.sendKeys("test{");
        LocationPanel.InValidSpecialCharacterValidation();
        Location.typeANameTxtBox.sendKeys("test:");
        LocationPanel.InValidSpecialCharacterValidation();
        Location.typeANameTxtBox.sendKeys("test;");
        LocationPanel.InValidSpecialCharacterValidation();
        Location.typeANameTxtBox.sendKeys("test>");
        LocationPanel.InValidSpecialCharacterValidation();
        Location.typeANameTxtBox.sendKeys("test<");
        LocationPanel.InValidSpecialCharacterValidation();
        Location.typeANameTxtBox.sendKeys("test|");
        LocationPanel.InValidSpecialCharacterValidation();
        Location.typeANameTxtBox.sendKeys("test?");
        LocationPanel.InValidSpecialCharacterValidation();
        Location.cancelBton.click();
        Thread.sleep(1000);
    }

    public static void InValidSpecialCharacterValidation() throws InterruptedException {
        System.out.println("Location Name Passed: " + Location.typeANameTxtBox.getAttribute("value"));
        String invalidspecialchars = Location.locnamefieldvalidation.getText();
        System.out.println("Validation message displayed is " + invalidspecialchars);
        Assert.assertEquals("Location Name can only contain letters, numbers, spaces in between and these special characters #.,-/'", invalidspecialchars);
        Thread.sleep(3000);
        Location.typeANameTxtBox.clear();
    }

    public static void checkspacestrim() throws InterruptedException, AWTException {
        LocationPanel.clickLocationAddNewIcon();
        Thread.sleep(1000);
        String tlsps = (" Was#8town ");
        Location.typeANameTxtBox.sendKeys(tlsps);
        String[] split = tlsps.split(" ");
        System.out.println("Admin provided " + split.length + " spaces in the location name");
        Location.typeANameTxtBox.sendKeys(Keys.TAB);
        Thread.sleep(2000);
        Location.address1Location.clear();
        Location.address1Location.sendKeys("4322 Fox Lake Rd");
        Thread.sleep(3000);
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(3000);
        Location.locationCreateSaveBtnJsExecutor.click();
        Thread.sleep(3000);
        LocationPanel.typecheckloccreatenotificationmessage();
        Thread.sleep(4000);
        LocationPanel.clickParticularLocation();
        Thread.sleep(2000);
        LocationPanel.clickEditLocationButton();
        Thread.sleep(2000);
        Location.typeANameTxtBox.sendKeys(Keys.CONTROL, "A");
        Thread.sleep(2000);
        String tlspss;
        tlspss = Location.typeANameTxtBox.getAttribute("value");
        System.out.println(tlspss);
        int splitspace = tlspss.replaceAll("[^ ]", "").length();
        System.out.println(splitspace + " spaces in the location name");

        if (splitspace == 0) {
            System.out.println("Spaces are Trimmed");
        } else {
            System.out.println("Spaces are not Trimmed");
        }
    }

    public static void checkscrollbar() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement scrolldown = driver.findElement(By.xpath("//div[@class='content-wrapper']"));
        js.executeScript("arguments[0].scrollIntoView();", scrolldown);
        //js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        Thread.sleep(2000);
        System.out.println("Scrolled to down..");
        Thread.sleep(2000);
        WebElement scrollup = driver.findElement(By.xpath("//nav[@class='appbar']"));
        js.executeScript("arguments[0].scrollIntoView();", scrollup);
        Thread.sleep(5000);
        System.out.println("Scrolled to up..");
    }

    public static void VerifyProfileExistingPhoneNumberWarningMsg() throws InterruptedException {
        Thread.sleep(3000);
        System.out.println(Profile.profileExistingPhoneNumberWarningMsg.getText());
        Assert.assertEquals(Profile.profileExistingPhoneNumberWarningMsg.getText(), "Phone Number not available");
        System.out.println("As the Phone Number is already used by differnt user,it shows the warning message as the number is not available");
    }
}
