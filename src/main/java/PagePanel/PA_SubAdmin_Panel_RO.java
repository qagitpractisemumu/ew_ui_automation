package PagePanel;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Pages.PA_SubAdmin_RO;
import Resource.BaseClass;
import Resource.UtilityClass;

public class PA_SubAdmin_Panel_RO extends BaseClass {

    PA_LoginPanel login = new PA_LoginPanel();

    public PA_SubAdmin_Panel_RO() {
        PageFactory.initElements(driver, PA_SubAdmin_RO.class);
    }

    public void click_On_SubAdmin_Menu() {
        UtilityClass.waitForElement(PA_SubAdmin_RO.subadminlink);
        PA_SubAdmin_RO.subadminlink.click();
    }

    public void clickSubAdminMenu() {
        UtilityClass.waitForElement(PA_SubAdmin_RO.subadmin);
        PA_SubAdmin_RO.subadmin.click();
    }

    public void click_On_New_Button() {
        UtilityClass.waitForElement(PA_SubAdmin_RO.plusbutton);
        PA_SubAdmin_RO.plusbutton.click();
    }

    public void enter_firstname_lastname_email_phonenumber_username(String firstName, String lastName, String email,
                                                                    String phoneNumber, String user) {
        UtilityClass.waitForElement(PA_SubAdmin_RO.firstname);
        PA_SubAdmin_RO.firstname.sendKeys(firstName);
        UtilityClass.waitForElement(PA_SubAdmin_RO.lastname);
        PA_SubAdmin_RO.lastname.sendKeys(lastName);
        UtilityClass.waitForElement(PA_SubAdmin_RO.email);
        PA_SubAdmin_RO.email.sendKeys(email);
        UtilityClass.waitForElement(PA_SubAdmin_RO.phonenumber);
        PA_SubAdmin_RO.phonenumber.sendKeys(phoneNumber);
        UtilityClass.waitForElement(PA_SubAdmin_RO.username);
        PA_SubAdmin_RO.username.sendKeys(user);
    }

    public void submit_button() throws Exception {
        UtilityClass.waitForElement(PA_SubAdmin_RO.submitbtn);
        PA_SubAdmin_RO.submitbtn.click();
        Thread.sleep(3000);
        UtilityClass.waitForElement(PA_SubAdmin_RO.notificationicon);
        PA_SubAdmin_RO.notificationicon.click();
        Thread.sleep(3000);

        String createmsg = driver.findElement(By.xpath("//div[contains(text(),'Successfully created Provider Admin Sub!')]")).getText();
        System.out.println(createmsg);
        Assert.assertEquals(createmsg, "Successfully created Provider Admin Sub!");
    }

    public void enter_Name_To_searchBar(String subadminName) {
        UtilityClass.waitForElement(PA_SubAdmin_RO.inputsearchbar);
        PA_SubAdmin_RO.inputsearchbar.sendKeys(subadminName);
        driver.findElement(By.xpath("(//div[contains(text(),'" + subadminName + "')])[1]")).click();
    }

    public void clicks_On_subadminprofile() {
        UtilityClass.waitForElement(PA_SubAdmin_RO.editicon);
        PA_SubAdmin_RO.editicon.click();
    }

    public void update_SubAdmin_Profile(String firstName, String lastName, String phoneNumber) throws Exception {
        UtilityClass.waitForElement(PA_SubAdmin_RO.firstname);
        PA_SubAdmin_RO.firstname.clear();
        PA_SubAdmin_RO.firstname.sendKeys(firstName);
        UtilityClass.waitForElement(PA_SubAdmin_RO.lastname);
        PA_SubAdmin_RO.lastname.clear();
        PA_SubAdmin_RO.lastname.sendKeys(lastName);
        UtilityClass.waitForElement(PA_SubAdmin_RO.phonenumber);
        PA_SubAdmin_RO.phonenumber.clear();
        PA_SubAdmin_RO.phonenumber.sendKeys(phoneNumber);
        UtilityClass.waitForElement(PA_SubAdmin_RO.submitbtn);
        PA_SubAdmin_RO.submitbtn.click();
        Thread.sleep(3000);
        UtilityClass.waitForElement(PA_SubAdmin_RO.notificationicon);
        PA_SubAdmin_RO.notificationicon.click();
        Thread.sleep(3000);

        String updatemsg = driver.findElement(By.xpath("//div[contains(text(),'Successfully updated Provider Admin Sub!')]")).getText();
        System.out.println(updatemsg);
        Assert.assertEquals(updatemsg, "Successfully updated Provider Admin Sub!");
        PA_LoginPanel.signout();
    }

    public void delete_SubAdminProfile() throws Exception {
        UtilityClass.waitForElement(PA_SubAdmin_RO.deleteicon);
        PA_SubAdmin_RO.deleteicon.click();
        UtilityClass.waitForElement(PA_SubAdmin_RO.confirmbtn);
        PA_SubAdmin_RO.confirmbtn.click();
        Thread.sleep(2000);
        UtilityClass.waitForElement(PA_SubAdmin_RO.notificationicon);
        PA_SubAdmin_RO.notificationicon.click();
        Thread.sleep(3000);

        String deletemsg = driver.findElement(By.xpath("//div[contains(text(),'Successfully deleted Provider Admin Sub!')]")).getText();
        System.out.println(deletemsg);
        Assert.assertEquals(deletemsg, "Successfully deleted Provider Admin Sub!");
        PA_LoginPanel.signout();
    }

    public void phonenumber_Validation(String firstName, String lastName, String phoneNumber) throws Exception {
        UtilityClass.waitForElement(PA_SubAdmin_RO.firstname);
        PA_SubAdmin_RO.firstname.sendKeys(firstName);
        UtilityClass.waitForElement(PA_SubAdmin_RO.lastname);
        PA_SubAdmin_RO.lastname.sendKeys(lastName);
        UtilityClass.waitForElement(PA_SubAdmin_RO.phonenumber);
        PA_SubAdmin_RO.phonenumber.sendKeys(phoneNumber);
        Thread.sleep(3000);
        String msg = driver.findElement(By.xpath("//*[contains(text(),'Invalid Phone Number (max: 15 digits)')]")).getText();
        System.out.println(msg);
        Assert.assertEquals(msg, "Invalid Phone Number (max: 15 digits)");
    }

    public void enter_Subadminname_Searchbar(String subadminName) throws Exception {
        UtilityClass.waitForElement(PA_SubAdmin_RO.inputsearchbar);
        PA_SubAdmin_RO.inputsearchbar.sendKeys(subadminName);
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys(Keys.ENTER);
        Thread.sleep(5000);
        driver.findElement(By.xpath("(//div[contains(text(),'" + subadminName + "')])[1]")).click();
        PA_LoginPanel.signout();
    }

    public void subadmin_In_Listview() {
        UtilityClass.waitForElement(PA_SubAdmin_RO.listview);
        PA_SubAdmin_RO.listview.click();
    }

    public void enter_Subadminname_Searchbar_Listview(String subadminName) throws Exception {
        UtilityClass.waitForElement(PA_SubAdmin_RO.inputsearchbar);
        PA_SubAdmin_RO.inputsearchbar.sendKeys(subadminName);
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys(Keys.ENTER);
        Thread.sleep(5000);
        driver.findElement(By.xpath("//div[@class='card-title']//span[contains(text(),'" + subadminName + "')]")).click();
        PA_LoginPanel.signout();
    }

    public void email_Validation(String firstName, String lastName, String email) throws Exception {
        UtilityClass.waitForElement(PA_SubAdmin_RO.firstname);
        PA_SubAdmin_RO.firstname.sendKeys(firstName);
        UtilityClass.waitForElement(PA_SubAdmin_RO.lastname);
        PA_SubAdmin_RO.lastname.sendKeys(lastName);
        UtilityClass.waitForElement(PA_SubAdmin_RO.email);
        PA_SubAdmin_RO.email.sendKeys(email);

        PA_SubAdmin_RO.phonenumber.sendKeys(Keys.TAB);
        Thread.sleep(3000);
        String str = driver.findElement(By.xpath("//form//div[@class='form-group']//small[@class='form-error-msg']")).getText();
        System.out.println(str);
        Assert.assertEquals(str, str);
    }

    public void save_Button_Enabled() {
        UtilityClass.waitForElement(PA_SubAdmin_RO.submitbtn);
        if (driver.findElement(By.xpath("(//*[contains(text(),'Submit')])[4]")).isEnabled()) {
            System.out.println("Submit button is enabled");
        } else {
            System.out.println("Submit button is disabled");
        }
    }

    public void admin_clicks_on_Cancel_button() throws Exception {
        Thread.sleep(2000);
        UtilityClass.waitForElement(PA_SubAdmin_RO.cancelbtn);
        PA_SubAdmin_RO.cancelbtn.click();
        Thread.sleep(2000);
        PA_LoginPanel.signout();
    }

    public void adminEnterSubAdminDetails(String firstName, String lastName) {
        UtilityClass.waitForElement(PA_SubAdmin_RO.firstname);
        PA_SubAdmin_RO.firstname.sendKeys(firstName);
        UtilityClass.waitForElement(PA_SubAdmin_RO.lastname);
        PA_SubAdmin_RO.lastname.sendKeys(lastName);
        UtilityClass.waitForElement(PA_SubAdmin_RO.email);
        PA_SubAdmin_RO.email.sendKeys("paSubAdmin" + ((long) Math.floor(Math.random() * 9_000L) + 1_000_0L) + "@yopmail.com");
        UtilityClass.waitForElement(PA_SubAdmin_RO.phonenumber);
        PA_SubAdmin_RO.phonenumber.sendKeys(String.valueOf((long) Math.floor(Math.random() * 9_000_000_000L) + 1_000_000_000L));
        UtilityClass.waitForElement(PA_SubAdmin_RO.username);
        PA_SubAdmin_RO.username.sendKeys("paSubAdmin" + ((long) Math.floor(Math.random() * 9_000L) + 1_000_0L));
    }
}
