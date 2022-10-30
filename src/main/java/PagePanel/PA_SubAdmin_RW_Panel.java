package PagePanel;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Pages.PA_SubAdmin_RW;
import Resource.BaseClass;
import Resource.UtilityClass;

public class PA_SubAdmin_RW_Panel extends BaseClass {

	PA_LoginPanel login = new PA_LoginPanel();

	PA_SubAdmin_RW subadmin = new PA_SubAdmin_RW();

	public PA_SubAdmin_RW_Panel() {
		PageFactory.initElements(driver, PA_SubAdmin_RW.class);
	}

	public void click_On_SubAdmin_module() {
		UtilityClass.waitForElement(PA_SubAdmin_RW.subadminlink);
		PA_SubAdmin_RW.subadminlink.click();
		}

	public void click_On_New_Button() {
		UtilityClass.waitForElement(PA_SubAdmin_RW.plusbutton);
		PA_SubAdmin_RW.plusbutton.click();
	}

	public void enter_firstname_lastname_email_phonenumber_username(String firstName, String lastName, String email,
			String phoneNumber, String uName) {
		UtilityClass.waitForElement(PA_SubAdmin_RW.firstname);
		PA_SubAdmin_RW.firstname.sendKeys(firstName);
		UtilityClass.waitForElement(PA_SubAdmin_RW.lastname);
		PA_SubAdmin_RW.lastname.sendKeys(lastName);
		UtilityClass.waitForElement(PA_SubAdmin_RW.Email);
		PA_SubAdmin_RW.Email.sendKeys(email);
		UtilityClass.waitForElement(PA_SubAdmin_RW.phonenumber);
		PA_SubAdmin_RW.phonenumber.sendKeys(phoneNumber);
		UtilityClass.waitForElement(PA_SubAdmin_RW.uname);
		PA_SubAdmin_RW.uname.sendKeys(uName);
	}

	public void changetoggletoreadwriteaccess() {
		UtilityClass.waitForElement(PA_SubAdmin_RW.togglebtn);
		PA_SubAdmin_RW.togglebtn.click();

	}

	public void submit_button() throws Exception {
		UtilityClass.waitForElement(PA_SubAdmin_RW.submitbtn);
		PA_SubAdmin_RW.submitbtn.click();
		UtilityClass.waitForElement(PA_SubAdmin_RW.notificationicon);
		PA_SubAdmin_RW.notificationicon.click();
		Thread.sleep(3000);
		String createmsg = driver
				.findElement(By.xpath("//div[contains(text(),'Successfully created Provider Admin Sub!')]")).getText();
		System.out.println(createmsg);
		Assert.assertEquals(createmsg, "Successfully created Provider Admin Sub!");
		PA_LoginPanel.signout();
	}

	public void enter_Name_To_searchBar(String subadminName) throws Exception {
		UtilityClass.waitForElement(PA_SubAdmin_RW.inputsearchbar);
		PA_SubAdmin_RW.inputsearchbar.sendKeys(subadminName);
		PA_SubAdmin_RW.inputsearchbar.sendKeys(Keys.ENTER);
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//div[contains(text(),'" + subadminName + "')])[1]")).click();
	}

	public void clicks_On_createdsubadmin() {
		UtilityClass.waitForElement(PA_SubAdmin_RW.editicon);
		PA_SubAdmin_RW.editicon.click();
	}

	public void update_SubAdmin(String firstName, String lastName, String phoneNumber) throws Exception {
		UtilityClass.waitForElement(PA_SubAdmin_RW.firstname);
		PA_SubAdmin_RW.firstname.sendKeys(firstName);
		UtilityClass.waitForElement(PA_SubAdmin_RW.lastname);
		PA_SubAdmin_RW.lastname.sendKeys(lastName);
		UtilityClass.waitForElement(PA_SubAdmin_RW.phonenumber);
		PA_SubAdmin_RW.phonenumber.clear();
		PA_SubAdmin_RW.phonenumber.sendKeys(phoneNumber);
		UtilityClass.waitForElement(PA_SubAdmin_RW.submitbtn);
		PA_SubAdmin_RW.submitbtn.click();
		UtilityClass.waitForElement(PA_SubAdmin_RW.notificationicon);
		PA_SubAdmin_RW.notificationicon.click();
		Thread.sleep(3000);
		String editedmsg = driver
				.findElement(By.xpath("//div[contains(text(),'Successfully updated Provider Admin Sub!')]")).getText();
		System.out.println(editedmsg);
		Assert.assertEquals(editedmsg, "Successfully updated Provider Admin Sub!");
		PA_LoginPanel.signout();
	}

	public void clicklistview() throws Exception {
		Thread.sleep(1000);
		UtilityClass.waitForElement(PA_SubAdmin_RW.listview);
		PA_SubAdmin_RW.listview.click();
		Thread.sleep(1000);
	}

	public void enter_subadmin_totheSearchbar(String subadminName) throws Exception {
		UtilityClass.waitForElement(PA_SubAdmin_RW.inputsearchbar);
		PA_SubAdmin_RW.inputsearchbar.sendKeys(subadminName);
		PA_SubAdmin_RW.inputsearchbar.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("(//div[contains(text(),'" + subadminName + "')])[1]")).click();
		Thread.sleep(1500);
	}

	public void adminchecksphonenumber_validation(String firstName, String lastName, String phoneNumber)
			throws Exception {
		UtilityClass.waitForElement(PA_SubAdmin_RW.firstname);
		PA_SubAdmin_RW.firstname.sendKeys(firstName);
		UtilityClass.waitForElement(PA_SubAdmin_RW.lastname);
		PA_SubAdmin_RW.lastname.sendKeys(lastName);
		UtilityClass.waitForElement(PA_SubAdmin_RW.phonenumber);
		PA_SubAdmin_RW.phonenumber.sendKeys(phoneNumber);
		Thread.sleep(3500);
		String Phonevalidation = driver.findElement(By.xpath("//form//label[contains(.,'Phone')]/..//small")).getText();
		System.out.println(Phonevalidation);
		Assert.assertEquals(Phonevalidation, "Invalid Phone Number (max: 15 digits)");
	}

	public void adminchecksemail_validation(String firstName, String lastName, String email) throws Exception {
		UtilityClass.waitForElement(PA_SubAdmin_RW.firstname);
		PA_SubAdmin_RW.firstname.sendKeys(firstName);
		UtilityClass.waitForElement(PA_SubAdmin_RW.lastname);
		PA_SubAdmin_RW.lastname.sendKeys(lastName);
		UtilityClass.waitForElement(PA_SubAdmin_RW.Email);
		PA_SubAdmin_RW.Email.sendKeys(email);
		PA_SubAdmin_RW.Email.sendKeys(Keys.TAB);
		Thread.sleep(3000);
		String emailvalidation = driver.findElement(By.xpath("//form//label[contains(.,'Email')]/..//small")).getText();
		System.out.println(emailvalidation);
		Assert.assertEquals(emailvalidation, emailvalidation);
		System.out.println("emailvalidation is successful");
	}

	public void delete_SubAdminProfile() throws Exception {
		UtilityClass.waitForElement(PA_SubAdmin_RW.deleteicon);
		PA_SubAdmin_RW.deleteicon.click();
		UtilityClass.waitForElement(PA_SubAdmin_RW.confirmbtn);
		PA_SubAdmin_RW.confirmbtn.click();
		UtilityClass.waitForElement(PA_SubAdmin_RW.notificationicon);
		PA_SubAdmin_RW.notificationicon.click();
		Thread.sleep(3500);
		String deletemsg = driver
				.findElement(By.xpath("//div[contains(text(),'Successfully deleted Provider Admin Sub!')]")).getText();
		System.out.println(deletemsg);
		Assert.assertEquals(deletemsg, "Successfully deleted Provider Admin Sub!");
		PA_LoginPanel.signout();
	}

	public void Cancelbutton_functionality() {
		UtilityClass.waitForElement(PA_SubAdmin_RW.Cancelbutton);
		PA_SubAdmin_RW.Cancelbutton.click();
		PA_LoginPanel.signout();
	}

	public void Submitbutton_Enabled_disabled() {
		UtilityClass.waitForElement(PA_SubAdmin_RW.Submitbutton);
		if (driver.findElement(By.xpath("(//form//div//button[contains(.,'Submit')])[4]")).isEnabled()) {
			System.out.println("Submit button is enabled");
		} else {
			System.out.println("Submit button is disabled");
		}

	}
}
