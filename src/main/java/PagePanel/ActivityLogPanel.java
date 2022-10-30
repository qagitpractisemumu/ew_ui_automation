package PagePanel;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import Pages.ActivityLog;
import Resource.BaseClass;
import Resource.UtilityClass;

public class ActivityLogPanel extends BaseClass {
	ActivityLog activityLog;

	public ActivityLogPanel() {
		activityLog = PageFactory.initElements(driver, ActivityLog.class);
	}

	public static void clickOnActivityLogMenu() throws InterruptedException {
		 Thread.sleep(2000);
		UtilityClass.waitForElement(ActivityLog.activityLogBtn);
		ActivityLog.activityLogBtn.click();
	     Thread.sleep(2000);
	}

    public static List<WebElement> getLogData() {

        return ActivityLog.tdData;
    }

    public static WebElement getLogData1() {

		return ActivityLog.tdDataSignup;

	}
	
	public static WebElement getLogData2() {

		return ActivityLog.tdDataLocEdit;
	}
	public static WebElement getLogData3() {

		return ActivityLog.tdDataLocCreate;

	}
	public static WebElement getLogData4() {

		return ActivityLog.tdDataLocDel;

	}
	public static WebElement getLogData5() {

		return ActivityLog.tdDateMoreSeriveUpdate;

	}
	public static WebElement getLogDataDomain1() {
		return ActivityLog.tdDataDomainName1;
	}
	public static WebElement getLogDataDomain2() {
		return ActivityLog.tdDataDomainName2;
	}
	public static WebElement getLogDataDomain3() {
		return ActivityLog.tdDataDomainName3;
	}

	public static void clickActivityLogMenuPAPortal() throws InterruptedException {
		Thread.sleep(3000);
		UtilityClass.waitForElement(ActivityLog.activityLogMenuPAPortal);
		ActivityLog.activityLogMenuPAPortal.click();
		Thread.sleep(2000);
	}
	public static void enterCustomerNameInSearchBoxPAPortal(String businessName) throws InterruptedException {
		Thread.sleep(3000);
		UtilityClass.waitForElement(ActivityLog.searchActivityLogMenuPAPortal);
		Thread.sleep(2000);
		ActivityLog.searchActivityLogMenuPAPortal.sendKeys(ProfilePanel.businessName);
		Thread.sleep(4000);

	}

	public static void clickSearchBtnActivityLogMenuPAPortal() throws InterruptedException {
		Thread.sleep(3000);
		UtilityClass.waitForElement(ActivityLog.searchBtnActivityLogMenuPAPortal);
		ActivityLog.searchBtnActivityLogMenuPAPortal.click();
		Thread.sleep(2000);
	}

}
