package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PA_customer {
    
	//xpaths for customer page
	
    @FindBy(xpath = "//a[@href='/portal-pages/customer']")
    public static WebElement customer_link;

    @FindBy(xpath = "//*[@class='icon icon-plus']")
    public static WebElement new_btn;

    @FindBy(xpath = "//input[@placeholder='First Name']")
    public static WebElement firstname;

    @FindBy(xpath = "//input[@placeholder='Last Name']")
    public static WebElement lastname;

    @FindBy(xpath = "//input[@placeholder='Phone Number']")
    public static WebElement phonenumber;

    @FindBy(xpath = "//input[@placeholder='Email']")
    public static WebElement email;

    @FindBy(xpath = "(//i[@class='ball'])[3]")
    public static WebElement manualbillbtn;

    @FindBy(xpath = "//button[@id='wizard-next']")
    public static WebElement nextbtn;

    @FindBy(xpath = "//input[@placeholder='Business Name']")
    public static WebElement businessname;

    @FindBy(xpath = "//input[@placeholder='Business Domain']")
    public static WebElement businessdomain;

    @FindBy(xpath = "//input[@placeholder='Contact Name']")
    public static WebElement contactname;

    @FindBy(xpath = "(//a[@class='mr-2 dropdown-toggle'])[2]")
    public static WebElement contactPhoneDropDown;

    @FindBy(xpath = "//input[@type='tel']")
    public static WebElement contactphone;

    @FindBy(xpath = "//input[@placeholder='Contact Email']")
    public static WebElement contactemail;

    @FindBy(xpath = "//input[@placeholder='Enter a location']")
    public static WebElement Addressline1;

    @FindBy(xpath = "//input[@placeholder='Apartment, Suite, Unit, Building, Floor, etc.']")
    public static WebElement addressline2;

    @FindBy(xpath = "//input[@placeholder='Zip Code']")
    public static WebElement zipcode;

    @FindBy(xpath = "(//input[@placeholder='City'])[1]")
    public static WebElement city;

    @FindBy(xpath = "//button[@id='wizard-next']")
    public static WebElement nextbutton;

    @FindBy(xpath = "//button[@id='wizard-skip']")
    public static WebElement skipbutton;

    @FindBy(xpath = "//button[@id='wizard-next']")
    public static WebElement submitbtn;

    @FindBy(css = "div.item.notification-log-trigger.has-notification")
    public static WebElement notificationicon;

    @FindBy(xpath = "//input[@placeholder='Start typing to search']")
    public static WebElement inputsearchbar;

    @FindBy(xpath = "//input[@name='switcher_checkbox_1']")
    public static WebElement disabletogglebtn;
    
    @FindBy(xpath = "//input[@name='switcher_checkbox_1']")
    public static WebElement enabletogglebtn;


    @FindBy(xpath = "//button[contains(text(),' Launch Dashboard ')]")
    public static WebElement LaunchDashboard;

    @FindBy(xpath = "//i[@class='icon icon-trashcan']")
    public static WebElement deleteicon;

    @FindBy(xpath = "//button[contains(text(),' Confirm ')]")
    public static WebElement confirmbtn;

    @FindBy(xpath = "//*[contains(text(),'OK')]")
    public static WebElement okbtn;

    @FindBy(xpath = "//i[@class='icon icon-cross']")
    public static WebElement closebtn;

    @FindBy(xpath = "(//i[@class='fa-1x icon icon-upload'])[1]")
    public static WebElement uploadimagebtn;

    @FindBy(xpath = "(//button[@class='btn'])[1]")
    public static WebElement cancelbtn;

    @FindBy(xpath = "//i[@class='icon icon-view-list']")
    public static WebElement listicon;
    
    @FindBy(xpath="//i[@class='icon icon-view-tiles']")
    public static WebElement gridicon;

    @FindBy(xpath = "(//a[@class='mr-2 dropdown-toggle'])[1]")
    public static WebElement phnodrpdwn;

    @FindBy(css = "div.dropdown-menu.show>a.dropdown-item:nth-child(78)")
    public static WebElement hongkongcountrycode;

    @FindBy(css = "div.dropdown-menu.show>a.dropdown-item:nth-child(170)")
    public static WebElement swedancountrycode;

    @FindBy(css = "div.dropdown-menu.show>a.dropdown-item:nth-child(81)")
    public static WebElement indiacountrycode;

    @FindBy(css = "div.dropdown-menu.show>a.dropdown-item:nth-child(184)")
    public static WebElement usacountrycode;

}

