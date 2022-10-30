package PagePanel;

import java.awt.*;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Pages.PA_customer;
import Resource.BaseClass;
import Resource.RobotUtil;
import Resource.UtilityClass;

public class PA_CustomerPanel extends BaseClass {
    public static String newBsnsDmn;
    PA_LoginPanel loginpage = new PA_LoginPanel();
    RobotUtil robot = new RobotUtil();
    String businessdmn;

    public PA_CustomerPanel() {
        PageFactory.initElements(driver, PA_customer.class);
    }

    public void clickOnAppStoreMenu() {
        UtilityClass.waitForElement(PA_customer.customer_link);
        PA_customer.customer_link.click();
    }

    public void clickOnNewButton() {
        UtilityClass.waitForElement(PA_customer.new_btn);
        PA_customer.new_btn.click();
    }

    public void enter_firstName_lastName(String firstname, String lastname) throws Exception {
        UtilityClass.waitForElement(PA_customer.firstname);
        PA_customer.firstname.sendKeys(firstname);
        UtilityClass.waitForElement(PA_customer.lastname);
        PA_customer.lastname.sendKeys(lastname);
        UtilityClass.waitForElement(PA_customer.phonenumber);
        String abc = "305" + ((long) Math.floor(Math.random() * 2_010_000L) + 1_000_000L);
        System.out.println("aaaaaaaaaaaaaaaaaaaaaaa  " + abc);
        PA_customer.phonenumber.sendKeys(abc);
        Thread.sleep(3000);
        PA_CustomerPanel.phonenumberValidation();
        PA_CustomerPanel.emailValidation("customer" + ((long) Math.floor(Math.random() * 6_0000L) + 1_000_00L) + "@yopmail.com");

    }

    public static void phonenumberValidation() {
        try {
            String errmsg = driver.findElement(By.xpath("(//*[@class='form-error-msg'])[1]")).getText();
            boolean result = false;
            if (errmsg.equalsIgnoreCase("Phone number is already in use")
                    || errmsg.equalsIgnoreCase("Invalid Phone Number (max: 15 digits)")
                    || errmsg.equalsIgnoreCase("Invalid Phone Number")) {
                result = true;
            }
            System.out.println(errmsg);
            Assert.assertFalse(result, errmsg);
        } catch (Exception e) {
            System.out.println("Phone number validation is successfull");
        }

    }

    public static void emailValidation(String Email) {
        UtilityClass.waitForElement(PA_customer.email);
        PA_customer.email.sendKeys(Email);
        try {
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            String errmsg = driver.findElement(By.xpath("(//*[@class='form-error-msg'])[2]")).getText();
            boolean result = false;
            if (errmsg.equalsIgnoreCase(" Email is already in use ")
                    || errmsg.equalsIgnoreCase(" Allowed Special Characters Before @ are '._' After @ are '.-' ")) {
                result = true;
            }
            System.out.println(errmsg);
            Assert.assertFalse(result, errmsg);
        } catch (Exception e) {
            System.out.println("Email validation is successfull");
        }

    }

    // Method for phone number uniqueness
    public void entering_Firstname_Lastname_Phonenumber_phonevalidation(String firstname, String lastname, String phone)
            throws Exception {
        UtilityClass.waitForElement(PA_customer.firstname);
        PA_customer.firstname.sendKeys(firstname);
        UtilityClass.waitForElement(PA_customer.lastname);
        PA_customer.lastname.sendKeys(lastname);
        UtilityClass.waitForElement(PA_customer.phonenumber);
        PA_customer.phonenumber.sendKeys(phone);
        Thread.sleep(2000);
        String errormsg = driver.findElement(By.xpath("(//*[@class='form-error-msg'])[1]")).getText();
        System.out.println(errormsg);
        Assert.assertEquals(errormsg, "Phone number is already in use");
        Thread.sleep(2000);
        UtilityClass.waitForElement(PA_customer.closebtn);
        PA_customer.closebtn.click();
        PA_LoginPanel.signout();

    }

    // Method for Email Validation
    public void entering_Firstname_Lastname_phone_email_emailvalidation(String firstname, String lastname, String phone,
                                                                        String Email) throws Exception {
        UtilityClass.waitForElement(PA_customer.firstname);
        PA_customer.firstname.sendKeys(firstname);
        UtilityClass.waitForElement(PA_customer.lastname);
        PA_customer.lastname.sendKeys(lastname);
        UtilityClass.waitForElement(PA_customer.phonenumber);
        PA_customer.phonenumber.sendKeys(phone);
        Thread.sleep(3000);
        UtilityClass.waitForElement(PA_customer.email);
        PA_customer.email.sendKeys(Email);
        String errmsg = driver.findElement(By.xpath("(//*[@class='form-error-msg'])[1]")).getText();
        System.out.println(errmsg);
        Assert.assertEquals(errmsg, "Email is already in use");
        Thread.sleep(2000);
        UtilityClass.waitForElement(PA_customer.closebtn);
        PA_customer.closebtn.click();
        PA_LoginPanel.signout();

    }

    // Method for phone number validation
    public void enter_Firstname_Lastname_Phone(String firstname, String lastname, String phone)
            throws InterruptedException {
        UtilityClass.waitForElement(PA_customer.firstname);
        PA_customer.firstname.sendKeys(firstname);
        UtilityClass.waitForElement(PA_customer.lastname);
        PA_customer.lastname.sendKeys(lastname);
        UtilityClass.waitForElement(PA_customer.phonenumber);
        PA_customer.phonenumber.sendKeys(phone);
        Thread.sleep(2000);
        String errormsg = driver.findElement(By.xpath("//*[contains(text(),'Invalid Phone Number (max: 15 digits)')]")).getText();
        System.out.println(errormsg);
        Assert.assertEquals(errormsg, "Invalid Phone Number (max: 15 digits)");
        Thread.sleep(2000);
        UtilityClass.waitForElement(PA_customer.closebtn);
        PA_customer.closebtn.click();
        PA_LoginPanel.signout();
    }

    public void clickOnManulaBilling() {
        UtilityClass.waitForElement(PA_customer.manualbillbtn);
        PA_customer.manualbillbtn.click();
    }

    public void clickOnNextButton() {
        UtilityClass.waitForElement(PA_customer.nextbtn);
        PA_customer.nextbtn.click();
    }

    public void clickOnNextButtonBasedOnBillingType(String billingType) throws InterruptedException {
        if ("manual".equals(billingType)) {
            UtilityClass.waitForElement(PA_customer.manualbillbtn);
            PA_customer.manualbillbtn.click();
            UtilityClass.waitForElement(PA_customer.nextbtn);
            PA_customer.nextbtn.click();
        } else {
            UtilityClass.waitForElement(PA_customer.nextbtn);
            PA_customer.nextbtn.click();
        }
        Thread.sleep(3000);
    }

    public void clickOnSkipButton() {
        UtilityClass.waitForElement(PA_customer.skipbutton);
        PA_customer.skipbutton.click();
    }

    public void enter_all_businessInfo(String Businessname, String ContactName, String BusinessLogo,
                                       String Addressline1, String Addressline2, String city, String zipCode, String country) throws Exception {
        UtilityClass.waitForElement(PA_customer.businessname);
        PA_customer.businessname.sendKeys(Businessname);
        UtilityClass.waitForElement(PA_customer.businessdomain);
        businessdmn = Businessname + ((long) Math.floor(Math.random() * 9_0000L) + 1_000_00L) + ".com";
        PA_customer.businessdomain.sendKeys(businessdmn);
        newBsnsDmn = businessdmn;
        UtilityClass.waitForElement(PA_customer.contactname);
        PA_customer.contactname.sendKeys(ContactName);
        PA_CustomerPanel.busiessDomainNameValidation();
        UtilityClass.waitForElement(PA_customer.contactPhoneDropDown);
        PA_customer.contactPhoneDropDown.click();
        switch (country) {
            case "Hongkong":
                Thread.sleep(2000);
                PA_customer.hongkongcountrycode.click();
                break;
            case "Sweden":
                Thread.sleep(2000);
                PA_customer.swedancountrycode.click();
                break;
            case "India":
                Thread.sleep(2000);
                PA_customer.indiacountrycode.click();
                break;
            case "United States":
                Thread.sleep(2000);
                PA_customer.usacountrycode.click();
                break;
            default:
                System.out.println("Country does not exist in the switch case");
        }
        UtilityClass.waitForElement(PA_customer.contactphone);
        switch (country) {
            case "Hongkong":
                PA_customer.contactphone.sendKeys("63506" + ((long) Math.floor(Math.random() * 9_00L) + 1_00L));
                break;
            case "Sweden":
                PA_customer.contactphone.sendKeys("73129" + ((long) Math.floor(Math.random() * 9_000_00L) + 1_000_00L));
                break;
            case "India":
                PA_customer.contactphone.sendKeys("98491" + ((long) Math.floor(Math.random() * 9_000L) + 1_000_0L));
                break;
            case "United States":
                PA_customer.contactphone.sendKeys("201658" + ((long) Math.floor(Math.random() * 9_000L) + 1_000L));
                break;
            default:
                System.out.println("Country does not exist in the switch case");
        }
        phonenumberValidation();
        UtilityClass.waitForElement(PA_customer.contactemail);
        PA_customer.contactemail.sendKeys("business_" + ((long) Math.floor(Math.random() * 9_000L) + 1_000_0L) + "@yopmail.com");
//        UtilityClass.waitForElement(PA_customer.uploadimagebtn);
//        PA_customer.uploadimagebtn.click();
//        robot.Upload_Businesslogo();
        UtilityClass.waitForElement(PA_customer.Addressline1);
        PA_customer.Addressline1.sendKeys(Addressline1);
        Thread.sleep(5000);
        PA_customer.Addressline1.sendKeys(Keys.DOWN);
        Thread.sleep(5000);
        PA_customer.Addressline1.sendKeys(Keys.ENTER);
        PA_customer.addressline2.sendKeys(Addressline2);
        UtilityClass.waitForElement(PA_customer.city);
        PA_customer.city.clear();
        PA_customer.city.sendKeys(city);
        UtilityClass.waitForElement(PA_customer.zipcode);
        PA_customer.zipcode.clear();
        PA_customer.zipcode.sendKeys(zipCode);
    }

    public static void busiessDomainNameValidation() {
        try {
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            String errmsg = driver.findElement(By.xpath("(//*[@class='form-error-msg'])[1]")).getText();
            boolean result = false;
            if (errmsg.equalsIgnoreCase("Please input a valid domain name")) {
                result = true;
            }
            System.out.println(errmsg);
            Assert.assertFalse(result, errmsg);
        } catch (Exception e) {
            System.out.println("Domain name validation is successfull");
        }
    }

    public void businessDomainNameValidation_n(String Businessname, String BusinessDomain, String ContactName) {
        UtilityClass.waitForElement(PA_customer.businessname);
        PA_customer.businessname.sendKeys(Businessname);
        UtilityClass.waitForElement(PA_customer.businessdomain);
        PA_customer.businessdomain.sendKeys(BusinessDomain);
        UtilityClass.waitForElement(PA_customer.contactname);
        PA_customer.contactname.sendKeys(ContactName);
        String msg;
        msg = driver.findElement(By.xpath("(//*[@class='form-error-msg'])[1]")).getText();
        System.out.println(msg);
        Assert.assertTrue(true, "Please input a valid domain name");
    }

    public void enter_Bname_Bdomainname_ContactName_Phone1_ContactEmail_Businesslogo_incorrectImageFormat(
            String Businessname, String BusinessDomain, String ContactName, String Phone1, String ContactEmail,
            String Businesslogo) throws Exception {
        UtilityClass.waitForElement(PA_customer.businessname);
        PA_customer.businessname.sendKeys(Businessname);
        UtilityClass.waitForElement(PA_customer.businessdomain);
        PA_customer.businessdomain.sendKeys(BusinessDomain);
        UtilityClass.waitForElement(PA_customer.contactname);
        PA_customer.contactname.sendKeys(ContactName);
        PA_CustomerPanel.busiessDomainNameValidation();
        UtilityClass.waitForElement(PA_customer.contactphone);
        PA_customer.contactphone.sendKeys(Phone1);
        phonenumberValidation();
        UtilityClass.waitForElement(PA_customer.contactemail);
        PA_customer.contactemail.sendKeys(ContactEmail);
        UtilityClass.waitForElement(PA_customer.uploadimagebtn);
        PA_customer.uploadimagebtn.click();
        robot.uploadInvalidImageFormat();
        UtilityClass.waitForElement(PA_customer.cancelbtn);
        PA_customer.cancelbtn.click();
        PA_LoginPanel.signout();

    }

    public void clicksOnNextButton() {
        UtilityClass.waitForElement(PA_customer.nextbutton);
        PA_customer.nextbutton.click();
    }

    public void clickOnSubmitButton() {
        UtilityClass.waitForElement(PA_customer.submitbtn);
        PA_customer.submitbtn.click();

    }

    public void Verifyusercreation() throws Exception {
        Thread.sleep(2000);
        // Assert.assertTrue("Successfully created user!", submitbutton());
        Assert.assertEquals(submitbutton(), true, "Successfully created user!");
//		loginpage.signout();

    }

    public boolean submitbutton() {
        String str = null;
        try {
            UtilityClass.waitForElement(PA_customer.notificationicon);
            PA_customer.notificationicon.click();
            Thread.sleep(9000);
            str = driver.findElement(By.xpath("//*[contains(text(),'Invalid phone number')]")).getText();
            if (str.equalsIgnoreCase("Invalid phone number")) {
                System.out.println("invalid phone number");
                return false;
            }
        } catch (Exception ignored) {
        } finally {
            if (str == null) {
                try {
                    str = driver.findElement(By.xpath("//*[contains(text(),'Customer creation failed!')]")).getText();
                    if (str.contains("Customer creation failed!")) {
                        System.out.println("Customer creation failed!");
                    }
                    return false;
                } catch (Exception e) {
                    return true;
                }

            }

        }
        return true;
    }

    public void listView() {
        UtilityClass.waitForElement(PA_customer.listicon);
        PA_customer.listicon.click();
    }

    // gridview & listview
    public void enter_Businessname_In_The_Searchbar(String Businessname) throws Exception {
        UtilityClass.waitForElement(PA_customer.inputsearchbar);
        PA_customer.inputsearchbar.sendKeys(Businessname);
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys(Keys.ENTER);
        Thread.sleep(5000);
        driver.findElement(By.xpath("(//div[contains(text(),'" + Businessname + "')])[1]")).click();
        PA_LoginPanel.signout();
    }

    // businessname-n
    public boolean enter_Businessname_Searchbar(String Businessname) throws Exception {
        UtilityClass.waitForElement(PA_customer.inputsearchbar);
        PA_customer.inputsearchbar.sendKeys(Businessname);
        Thread.sleep(3000);
        PA_customer.inputsearchbar.sendKeys(Keys.ENTER);
        Thread.sleep(5000);
        try {
            driver.findElement(By.xpath("(//div[contains(text(),'" + Businessname + "')])[1]")).isDisplayed();
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return true;
    }

    // enable & disable
    public void enter_Businessname_In_Searchbar(String Businessname) throws Exception {
    	Thread.sleep(2000);
    	UtilityClass.waitForElement(PA_customer.inputsearchbar);    	
        PA_customer.inputsearchbar.sendKeys(Businessname);
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@placeholder='Start typing to search']")).sendKeys(Keys.ENTER);
        Thread.sleep(5000);
        driver.findElement(By.xpath("(//div[contains(text(),'" + businessdmn + "')])[1]")).click();
        Thread.sleep(2000);
    }

    public void disables_Toggle_Button() throws Exception {
        UtilityClass.waitForElement(PA_customer.disabletogglebtn);
        WebElement ele = driver.findElement(By.xpath("//input[@name='switcher_checkbox_1']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", ele);
        Thread.sleep(7000);
        UtilityClass.waitForElement(PA_customer.notificationicon);
        PA_customer.notificationicon.click();
        Thread.sleep(5000);
        String sucessmsg = driver.findElement(By.xpath("//div[contains(text(),'Successfully Disabled The User!')]")).getText();
        System.out.println(sucessmsg);
        Assert.assertEquals(sucessmsg, "Successfully Disabled The User!");
        PA_LoginPanel.signout();
    }
    
    public void enables_Toggle_Button() throws Exception {
    	UtilityClass.waitForElement(PA_customer.enabletogglebtn);
    	WebElement ele = driver.findElement(By.xpath("//checkbox[@name='switcher_checkbox_1']"));
    	ele.click();
    	ele.isEnabled();
    	JavascriptExecutor js = (JavascriptExecutor) driver;
    	js.executeScript("arguments[0].click();", ele);
    	
    	Thread.sleep(7000);
    	UtilityClass.waitForElement(PA_customer.notificationicon);
    	PA_customer.notificationicon.click();
    	Thread.sleep(5000);
    	String sucessmsg = driver.findElement(By.xpath("//div[contains(text(),'Successfully Disabled The User!')]")).getText();
    	System.out.println(sucessmsg);
    	Assert.assertEquals(sucessmsg, "Successfully enabled The User!");
    	PA_LoginPanel.signout();
    	   }


    public void click_On_LaunchDashboard() throws Exception {
        UtilityClass.waitForElement(PA_customer.LaunchDashboard);
        PA_customer.LaunchDashboard.click();
        Thread.sleep(40000);
        String msg = driver.getTitle();
        System.out.println(msg);
        Assert.assertEquals(msg, "Wireless Office | Customers");
    }

    // delete
    public void enter_BusinessName_To_Searchbar(String Businessname) throws Throwable {
        UtilityClass.waitForElement(PA_customer.inputsearchbar);
        PA_customer.inputsearchbar.sendKeys(businessdmn);
        Thread.sleep(3000);
        System.out.println("businessdmn is   " + businessdmn);
        driver.findElement(By.xpath("(//div[contains(text(),'" + businessdmn + "')])[1]")).click();
    }

    public void delete_User() throws Exception {
        UtilityClass.waitForElement(PA_customer.deleteicon);
        PA_customer.deleteicon.click();
        UtilityClass.waitForElement(PA_customer.confirmbtn);
        PA_customer.confirmbtn.click();
        Thread.sleep(7000);
        UtilityClass.waitForElement(PA_customer.notificationicon);
        PA_customer.notificationicon.click();
        Thread.sleep(5000);
        String sucessmsg = driver.findElement(By.xpath("//div[contains(text(),'Customer Deletion was Successful')]")).getText();
        System.out.println(sucessmsg);
        Assert.assertEquals(sucessmsg, "Customer Deletion was Successful");
    }

    public void enter_firstname_lastname_phonenumber_of_country(String firstname, String lastname, String country) throws Exception {
        UtilityClass.waitForElement(PA_customer.firstname);
        PA_customer.firstname.sendKeys(firstname);
        UtilityClass.waitForElement(PA_customer.lastname);
        PA_customer.lastname.sendKeys(lastname);
        UtilityClass.waitForElement(PA_customer.phnodrpdwn);
        PA_customer.phnodrpdwn.click();
        switch (country) {
            case "Hongkong":
                Thread.sleep(2000);
                PA_customer.hongkongcountrycode.click();
                break;
            case "Sweden":
                Thread.sleep(2000);
                PA_customer.swedancountrycode.click();
                break;
            case "India":
                Thread.sleep(2000);
                PA_customer.indiacountrycode.click();
                break;
            case "United States":
                Thread.sleep(2000);
                PA_customer.usacountrycode.click();
                break;
            default:
                System.out.println("Country does not exist in the switch case");
        }
        UtilityClass.waitForElement(PA_customer.phonenumber);
        switch (country) {
            case "Hongkong":
                PA_customer.phonenumber.sendKeys("63506" + ((long) Math.floor(Math.random() * 9_00L) + 1_00L));
                break;
            case "Sweden":
                PA_customer.phonenumber.sendKeys("73129" + ((long) Math.floor(Math.random() * 9_000L) + 1_000L));
                break;
            case "India":
                PA_customer.phonenumber.sendKeys("98491" + ((long) Math.floor(Math.random() * 9_000L) + 1_000_0L));
                break;
            case "United States":
                PA_customer.phonenumber.sendKeys("201658" + ((long) Math.floor(Math.random() * 9_000L) + 1_000L));
                break;
            default:
                System.out.println("Country does not exist in the switch case");
        }
        PA_CustomerPanel.phonenumberValidation();
        PA_CustomerPanel.emailValidation("customer" + ((long) Math.floor(Math.random() * 9_000L) + 1_000_0L) + "@yopmail.com");
    }

    public void enter_incorrect_phone_number(String country) throws InterruptedException {
        UtilityClass.waitForElement(PA_customer.firstname);
        PA_customer.firstname.sendKeys("fn");
        UtilityClass.waitForElement(PA_customer.lastname);
        PA_customer.lastname.sendKeys("ln");
        UtilityClass.waitForElement(PA_customer.phnodrpdwn);
        PA_customer.phnodrpdwn.click();
        Thread.sleep(2000);
        switch (country) {
            case "Hongkong":
                PA_customer.hongkongcountrycode.click();
                break;
            case "Sweden":
                PA_customer.swedancountrycode.click();
                break;
            case "India":
                PA_customer.indiacountrycode.click();
                break;
            default:
                PA_customer.usacountrycode.click();
        }
        UtilityClass.waitForElement(PA_customer.phonenumber);
        PA_customer.phonenumber.sendKeys("635463563456235456456546");
        String msg = driver.findElement(By.xpath("//*[contains(text(),'Invalid Phone Number (max: 15 digits)')]")).getText();
        System.out.println(msg);
        Assert.assertEquals(msg, "Invalid Phone Number (max: 15 digits)");
        Thread.sleep(2000);
        UtilityClass.waitForElement(PA_customer.closebtn);
        PA_customer.closebtn.click();
        PA_LoginPanel.signout();
    }

    public void enter_businessInfo_along_with_domain_phone_email(String Businessname, String ContactName, String BusinessLogo,
                                                                 String Addressline1, String Addressline2) throws Exception {
        UtilityClass.waitForElement(PA_customer.businessname);
        PA_customer.businessname.sendKeys(Businessname);
        UtilityClass.waitForElement(PA_customer.businessdomain);
        PA_customer.businessdomain.sendKeys(Businessname + ((long) Math.floor(Math.random() * 9_0000L) + 1_000_00L) + ".com");
        UtilityClass.waitForElement(PA_customer.contactname);
        PA_customer.contactname.sendKeys(ContactName);
        PA_CustomerPanel.busiessDomainNameValidation();
        UtilityClass.waitForElement(PA_customer.contactphone);
        PA_customer.contactphone.sendKeys("201" + ((long) Math.floor(Math.random() * 4_090_000L) + 1_000_000L));
        phonenumberValidation();
        UtilityClass.waitForElement(PA_customer.contactemail);
        PA_customer.contactemail.sendKeys("business_" + ((long) Math.floor(Math.random() * 9_000L) + 1_000_0L) + "@yopmail.com");
        UtilityClass.waitForElement(PA_customer.uploadimagebtn);
        PA_customer.uploadimagebtn.click();
        robot.Upload_Businesslogo();
        UtilityClass.waitForElement(PA_customer.Addressline1);
        PA_customer.Addressline1.sendKeys(Addressline1);
        Thread.sleep(5000);
        PA_customer.Addressline1.sendKeys(Keys.DOWN);
        Thread.sleep(5000);
        PA_customer.Addressline1.sendKeys(Keys.ENTER);
        PA_customer.addressline2.sendKeys(Addressline2);
    }

    public void enter_Search_Value_In_The_Searchbar_In_ViewType(String businessName, String billingType) throws InterruptedException {
        if (billingType.equalsIgnoreCase("grid")) {
            System.out.println("View Type is Grid");
            UtilityClass.waitForElement(PA_customer.inputsearchbar);
            PA_customer.inputsearchbar.sendKeys(businessName);
            Thread.sleep(8000);
            driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys(Keys.ENTER);
            Thread.sleep(8000);
            driver.findElement(By.xpath("(//div[contains(text(),'" + businessName + "')])[1]")).click();
        } else {
            System.out.println("View Type is List");
            UtilityClass.waitForElement(PA_customer.listicon);
            PA_customer.listicon.click();
            UtilityClass.waitForElement(PA_customer.inputsearchbar);
            PA_customer.inputsearchbar.sendKeys(businessName);
            Thread.sleep(8000);
            driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys(Keys.ENTER);
            Thread.sleep(8000);
            driver.findElement(By.xpath("(//div[contains(@class,'content d-flex')]//div)[2]")).click();
        }
        PA_LoginPanel.signout();
    }

    public void search_the_customer() throws InterruptedException, AWTException {
        UtilityClass.waitForElement(PA_customer.inputsearchbar);
        String newBsnNam = ProfilePanel.newBsinessName;
        System.out.println("Business Name     " + newBsnNam);
        PA_customer.inputsearchbar.sendKeys(newBsnNam);
        Thread.sleep(8000);
        driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys(Keys.ENTER);
        Thread.sleep(8000);
        driver.findElement(By.xpath("//div[@title='" + newBsnNam + "']")).click();
        Thread.sleep(8000);
    }

    public void search_the_customer_admin_domain() throws InterruptedException {
        UtilityClass.waitForElement(PA_customer.inputsearchbar);
        String newBsnDmn = PA_CustomerPanel.newBsnsDmn;
        System.out.println("Business Domain     " + newBsnDmn);
        PA_customer.inputsearchbar.sendKeys(newBsnDmn);
        Thread.sleep(8000);
        driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys(Keys.ENTER);
        Thread.sleep(8000);
        driver.findElement(By.xpath("//div[text()='" + newBsnDmn + "']")).click();
        Thread.sleep(8000);
    }
}
