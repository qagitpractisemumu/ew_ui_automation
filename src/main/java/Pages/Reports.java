package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Reports {
	
	@FindBy(xpath = "//*[contains(text(),'Reports')]")
    public static WebElement reportsMenu;
	
	@FindBy(xpath = "//label[@for='cb1']")
    public static WebElement checkbox;
	
	@FindBy(xpath = "//button[contains(text(),'Export')]")
    public static WebElement exportbtn;
	
	@FindBy(xpath = "//button[@id='dateType']")
    public static WebElement datedropdown;
	
	@FindBy(xpath = "//div[@class='options-list']//div[normalize-space()='Last 7 Days']")
    public static WebElement sevendaysoption;
	
	@FindBy(xpath = "//div[@class='options-list']//div[normalize-space()='Last 30 Days']")
    public static WebElement thirtydaysoption;
	
	@FindBy(xpath = "//div[@class='options-list']//div[normalize-space()='Custom']")
    public static WebElement customdaysoption;
	
	@FindBy(xpath = "//div[@class='options-list']//div[normalize-space()='Today']")
    public static WebElement Todaydayoption;
		
	@FindBy(xpath = "//div[@class='options-list']//div[@class='item'][1]")
    public static WebElement Todayoption;
	
	@FindBy(xpath = "//div[@class='item active']")
    public static WebElement activeoption;
	
	@FindBy(xpath = "//button[@class='swal2-confirm swal2-styled']")
    public static WebElement popuperrorok;
	
	@FindBy(xpath = "//div[@class='swal2-html-container']")
    public static WebElement popuperror;
	
	@FindBy(xpath = "//span[@class='title-name']")
    public static WebElement pagetitle;
	
	@FindBy(xpath = "//div[@class='action search-box']")
    public static WebElement searchbox;
	
	@FindBy(xpath = "//div[@class='select closed']")
    public static WebElement dropdownbtn;
	
	@FindBy(xpath = "//th[normalize-space()='Select']")
    public static WebElement selectheader;
	
	@FindBy(xpath = "//th[normalize-space()='Reports']")
    public static WebElement reportsheader;
	
	@FindBy(xpath = "//th[normalize-space()='Description']")
    public static WebElement descriptionheader;
	
	@FindBy(xpath = "//*[@id='recordTable']/tbody/tr/td[2]")
    public static WebElement wrkspaceusageone;
	
	@FindBy(xpath = "//*[@id='recordTable']/tbody/tr/td[3]")
    public static WebElement wrkspaceusagetwo;
	
	@FindBy(xpath = "//i[@class='icon icon-notification']")
    public static WebElement notificationicon;
	
	@FindBy(xpath = "//div[@id='notification-log']//div//span")
    public static WebElement notificationheader;
	
	@FindBy(xpath = "//input[@id='myInput']")
    public static WebElement searchinput;
	
	@FindBy(xpath = "//div[@id='app']//div//div//div//app-reports//div//div//div//div//div//div//div//div//p")
    public static WebElement noresults;
	
	@FindBy(xpath = "//*[@id='pickerId']/div/div[2]/div[1]/i")
    public static WebElement calenderstartdate;
	
	@FindBy(xpath = "//div[@id='startcalendarid']//i[1]")
    public static WebElement monthleftarrow;
	
	@FindBy(xpath = "//div[@id='startcalendarid']//i[2]")
    public static WebElement monthrightarrow;
	
	@FindBy(xpath = "//*[@id='pickerId']/div/div[4]/div[1]/i")
    public static WebElement calenderenddate;
	
	@FindBy(xpath = "//*[@id='startcalendarheadid']/i[3]")
    public static WebElement yearleftarrow;
	
	@FindBy(xpath = "//div[@class='notification live']")
    public static WebElement livenotification;

}
