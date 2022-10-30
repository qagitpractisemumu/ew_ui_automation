package Pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PA_appstore {

	@FindBy(xpath = "//a[@href='/portal-pages/store']")
	public WebElement appstoreLink;

	@FindBy(xpath = "//input[@id='filter']")
	public WebElement Search;

	@FindBy(xpath = "//input[starts-with(@id,'cssCheckbox')")
	public List<WebElement> selectSoftwarecheckBox;

	@FindBy(xpath = "(//button[@class='btn current-options form-button-dropdown'])[1]")
	public WebElement dropdownbutton;

	@FindBy(xpath = "//div[@title='BYOL']")
	public WebElement BYOL;

	@FindBy(xpath = "//div[@title='Licensed']")
	public WebElement Licensed;

	@FindBy(xpath = "//div[@class='right']//button[@class='btn primary']")
	public WebElement plusbtn;

	@FindBy(xpath = "//div[@id='add-new-app']//input[@id='addAppName']")
	public WebElement nameoftheapp;

	@FindBy(xpath = "//button[@id='serviceButton']")
	public WebElement categorydropdown;

	@FindBy(xpath = "//div[@class='select open']//div[@class='options-list']")
	public WebElement drpdwnlist;

	@FindBy(xpath = "//input[@id='pricing']")
	public WebElement price;

	@FindBy(xpath = "//textarea[@id='features']")
	public WebElement typeoffeatures;

	@FindBy(xpath = "//textarea[@placeholder='Type a specifications']")
	public WebElement specifications;

	@FindBy(xpath = "//textarea[@placeholder='Type a description']")
	public WebElement description;

	@FindBy(xpath = "//*[@id='addLogo']")
	public WebElement uploadlogo;

	@FindBy(xpath = "//div[@id='add-new-app']//button[@type='submit']")
	public WebElement savebtn;

	@FindBy(xpath = "//h5[@title='FlexLogger']")
	public WebElement testappclick;

	@FindBy(xpath = "//i[@class='icon icon-edit']")
	public WebElement editbtn;

	@FindBy(xpath = "//i[@class='icon icon-trashcan']")
	public WebElement deletebtn;

	@FindBy(xpath = "//div[@class='bottom']//button[@class='btn ghost']")
	public WebElement Yesbtn;

	@FindBy(xpath = "//button[@class='btn warning']")
	public WebElement Nobtn;

	@FindBy(xpath = "//div[@class='item notification-log-trigger has-notification']")
	public WebElement notificationicon;

	@FindBy(xpath = "//div[@class='description']")
	public WebElement notificationdescription;
	
	@FindBy(xpath = "//mat-card/div/div[1]/label[contains(@for,'cssCheckbox5db4703783213613dcf48666')]")
	public WebElement deselectcheckbox;
	
	@FindBy(xpath = "(//button[@type='submit'])[3]")
	public WebElement disablesavebtn;
	
	@FindBy(xpath ="(//button[@type='button'])[5]")
	public WebElement cancelbtn;

	@FindBy(xpath ="//i[@class='icon icon-view-list']")
    public WebElement listicon;
}
