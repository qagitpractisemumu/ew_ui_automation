package Pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ActivityLog {

	@FindBy(xpath = "//span[contains(text(),'Activity Log')]")
	public static WebElement activityLogBtn;

	@FindBy(xpath = "//tbody/tr[1]/td")
	public static List<WebElement> tdData;
	
	@FindBy(xpath="//i[@class='icon icon-flow']")
	public static WebElement activityLogMenuPAPortal;
	
	@FindBy(xpath="//div[@class='action search-box']//input")
	public static WebElement searchActivityLogMenuPAPortal;
	
	@FindBy(xpath="//i[@class='icon icon-search']")
	public static WebElement searchBtnActivityLogMenuPAPortal;
	
	@FindBy(xpath="//table//tr[5]//td[3]")
	public static WebElement tdDataSignup;
	
	@FindBy(xpath="//table//tbody//tr[1]//td[3]")
	public static WebElement tdDataLocDel;
	
	@FindBy(xpath="//table//tbody//tr[2]//td[3]")
	public static WebElement tdDataLocEdit;
	
	@FindBy(xpath="//table//tbody//tr[3]//td[3]")
	public static WebElement tdDataLocCreate;
		
	@FindBy(xpath="//tbody/tr[4]/td[3]")
	public static WebElement tdData4;
	
	@FindBy(xpath="//table//tbody//tr[1]//td[3]")
	public static WebElement tdDateMoreSeriveUpdate;

	@FindBy(xpath="//tbody/tr[1]/td[4")
	public static WebElement tdDataDomainName1;
	
	@FindBy(xpath="//tbody/tr[2]/td[4")
	public static WebElement tdDataDomainName2;
	
	@FindBy(xpath="//tbody/tr[3]/td[4")
	public static WebElement tdDataDomainName3;
	
	
}
