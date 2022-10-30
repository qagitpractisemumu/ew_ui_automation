package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PA_SubAdmin_RO {

	@FindBy(xpath = "//a[@href='/portal-pages/sub-admin']//span[1]")
	public static WebElement subadminlink;

	@FindBy(xpath = "//a[@href='/portal-pages/sub-admin']//span[1]")
	public static WebElement subadmin;

	@FindBy(xpath = "//i[@class='icon icon-plus']")
	public static WebElement plusbutton;

	@FindBy(xpath = "(//label[@for='first-name']//following-sibling::input)[2]")
	public static WebElement firstname;

	@FindBy(xpath = "(//label[@for='last-name']//following-sibling::input)[2]")
	public static WebElement lastname;

	@FindBy(xpath = "(//label[@for='email']//following-sibling::input)[2]")
	public static WebElement email;

	@FindBy(xpath = "(//div[@class='input-group-prepend']//input[@type='text'])[2]")
	public static WebElement phonenumber;

	@FindBy(xpath = "//label[@for='user-name']//following-sibling::input")
	public static WebElement username;

	@FindBy(xpath = "(//*[contains(text(),'Submit')])[3]")
	public static WebElement submitbtn;

	@FindBy(xpath = "//span[@id='notification-log-number']")
	public static WebElement notificationicon;

	@FindBy(xpath = "//input[@placeholder='Search']")
	public static WebElement inputsearchbar;

	@FindBy(xpath = "//i[@class='icon icon-edit']")
	public static WebElement editicon;

	@FindBy(xpath = "(//i[@class='icon icon-trashcan'])[1]")
	public static WebElement deleteicon;

	@FindBy(xpath = "//button[contains(text(),' Confirm ')]")
	public static WebElement confirmbtn;

	@FindBy(xpath = "//i[@class='icon icon-view-list']")
	public static WebElement listview;

	@FindBy(xpath = "(//form//div//button[contains(.,'Cancel')])[3]")
	public static WebElement cancelbtn;

}
