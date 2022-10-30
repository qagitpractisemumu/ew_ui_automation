package PagePanel;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Pages.Reports;
import Resource.BaseClass;

public class ReportsPanel extends BaseClass{
	
	
	Reports reports = new Reports();
	
	public ReportsPanel() {
		reports = PageFactory.initElements(driver, Reports.class);
    }
	
	public static void clickReportsMenu() throws InterruptedException {
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", driver.findElement(By.linkText("Reports")));
		Thread.sleep(3000);
	}

	public static void clickcheckbox() throws InterruptedException{       
		WebElement checkBoxElement = Reports.checkbox;
		boolean isSelected = checkBoxElement.isSelected();
		if(isSelected == false) {
			checkBoxElement.click();
			System.out.println("Checkbox is Selected");
		}
		Thread.sleep(3000);
		WebElement exportbtn = Reports.exportbtn;
		if(exportbtn.isEnabled()) {
			System.out.println("Export button is Enabled");
		}else {
			System.out.println("Export button is Disabled");
		}
		
	}
	
	public static void clickuncheckbox() throws InterruptedException{
		Thread.sleep(4000);
		WebElement checkBoxElement = Reports.checkbox;
		boolean isSelected = checkBoxElement.isSelected();
		if(isSelected == false) {
			checkBoxElement.click();
			System.out.println("Checkbox is Unselected");
		}
		Thread.sleep(3000);
		WebElement exportbtn = Reports.exportbtn;
		if(exportbtn.isEnabled()) {
			System.out.println("Export button is Enabled");
		}else {
			System.out.println("Export button is Disabled");
		}
		
	}
		
		
	public static void clickdropdown() throws InterruptedException, Exception {
		{       	
			WebElement drpdown = Reports.datedropdown;
			drpdown.click();
			Thread.sleep(3000);
			WebElement drpdownoptions1 = Reports.sevendaysoption;
			drpdownoptions1.click();
			Thread.sleep(3000);
			WebElement exportbtn = Reports.exportbtn;
			exportbtn.click();
			Thread.sleep(4000);

			try   
			{
				if(Reports.popuperror.isDisplayed())
				{
					String ErrorPopupMessage = Reports.popuperror.getText();
			        System.out.println("Popup message showing as " + ErrorPopupMessage);
			        Assert.assertEquals("No data found" , ErrorPopupMessage);
					WebElement popuperror1 = Reports.popuperrorok;
					popuperror1.click();
					Thread.sleep(3000);
				    
				}
			}
			catch(Exception e) 
			{  			
		   System.out.println("Report Downloaded successfully");		
			}	
		drpdown.click();
		Thread.sleep(3000);
		WebElement drpdownoptions2 = Reports.thirtydaysoption;
		drpdownoptions2.click();
		Thread.sleep(10000);
		exportbtn.click();
		Thread.sleep(3000);
		
		try   
		{
			if(Reports.popuperror.isDisplayed())
			{
				String ErrorPopupMessage = Reports.popuperror.getText();
		        System.out.println("Popup message showing as " + ErrorPopupMessage);
		        Assert.assertEquals("No data found" , ErrorPopupMessage);
				WebElement popuperror1 = Reports.popuperrorok;
				popuperror1.click();
				Thread.sleep(5000);
			}
		}
		catch(Exception e) 
		{  
			System.out.println("Report Downloaded successfully");			
		}
		drpdown.click();
		Thread.sleep(3000);
		WebElement drpdownoptions3 = Reports.customdaysoption;
		drpdownoptions3.click();
		Thread.sleep(5000);
		exportbtn.click();
		Thread.sleep(3000);
		
		try   
		{
			if(Reports.popuperror.isDisplayed())
			{
				String ErrorPopupMessage = Reports.popuperror.getText();
		        System.out.println("Popup message showing as " + ErrorPopupMessage);
		        Assert.assertEquals("No data found" , ErrorPopupMessage);
				WebElement popuperror1 = Reports.popuperrorok;
				popuperror1.click();
				Thread.sleep(5000);
			}
		}
		catch(Exception e) 
		{  
			System.out.println("Report Downloaded successfully");		    
		}	  
		
		drpdown.click();
		Thread.sleep(3000);
		WebElement drpdownoptions4 = Reports.Todaydayoption;
		drpdownoptions4.click();
		Thread.sleep(3000);
		exportbtn.click();
		Thread.sleep(3000);
		
		try   
		{
			if(Reports.popuperror.isDisplayed())
			{
				String ErrorPopupMessage = Reports.popuperror.getText();
		        System.out.println("Popup message showing as " + ErrorPopupMessage);
		        Assert.assertEquals("No data found" , ErrorPopupMessage);
				WebElement popuperror1 = Reports.popuperrorok;
				popuperror1.click();
				Thread.sleep(5000);
			}
		}
		catch(Exception e) 
		{  
		   System.out.println("Report Downloaded successfully");
		}
		
		}			
}
	public static void checkrequiredelmnts() throws InterruptedException {
		Thread.sleep(2000);
		
		Assert.assertTrue(Reports.pagetitle.isDisplayed());
        String titlename = Reports.pagetitle.getText();
        System.out.println(titlename + " title is available");
        Assert.assertEquals("Reports" , titlename);
        
		Assert.assertTrue(Reports.searchbox.isDisplayed());
		
        Assert.assertTrue(Reports.dropdownbtn.isDisplayed());
        
        Assert.assertTrue(Reports.exportbtn.isDisplayed());
        String exportelement = Reports.exportbtn.getText();
        System.out.println(exportelement + " button is available");
        Assert.assertEquals("Export" , exportelement);
        
        Assert.assertTrue(Reports.selectheader.isDisplayed());
        String selectelement = Reports.selectheader.getText();
        System.out.println(selectelement + " header is available");
        Assert.assertEquals("Select" , selectelement);
        
        Assert.assertTrue(Reports.reportsheader.isDisplayed());
        String reportsheader = Reports.reportsheader.getText();
        System.out.println(reportsheader + " header is available");
        Assert.assertEquals("Reports" , reportsheader);
        
        Assert.assertTrue(Reports.descriptionheader.isDisplayed());
        String descriptionheader = Reports.descriptionheader.getText();
        System.out.println(descriptionheader + " header is available");
        Assert.assertEquals("Description" , descriptionheader);
            
        Assert.assertTrue(Reports.checkbox.isDisplayed());
        
        Assert.assertTrue(Reports.wrkspaceusageone.isDisplayed());
        String reportstext = Reports.wrkspaceusageone.getText();
        System.out.println(reportstext + " text is available");
        Assert.assertEquals("Workspace Usage Reports" , reportstext);
        
        Assert.assertTrue(Reports.wrkspaceusagetwo.isDisplayed());
        String descriptiontext = Reports.wrkspaceusagetwo.getText();
        System.out.println(descriptiontext + " text is available");
        Assert.assertEquals("Workspace Usage Reports" , descriptiontext);
        System.out.println("All elements are displayed");
        
        Reports.notificationicon.click();
        Thread.sleep(2000);
        String notificationicon = Reports.notificationheader.getText();
        System.out.println(notificationicon + " header is available");
        Assert.assertEquals("Notifications" , notificationicon);
      
	}
	
	public static void searchwithvaliddata() throws InterruptedException {
		Thread.sleep(4000);
		Reports.searchinput.sendKeys("Reports");
		Thread.sleep(2000);
		String searched = Reports.searchinput.getAttribute("value");
		Thread.sleep(3000);
		System.out.println("User searched with " + searched);
		Thread.sleep(2000);
		Reports.searchinput.sendKeys(Keys.CONTROL,"A");
		Reports.searchinput.sendKeys(Keys.CONTROL,"X");
		String searchedresult = Reports.wrkspaceusageone.getText();
		System.out.println(searchedresult + " is displayed");
	    Assert.assertEquals("Workspace Usage Reports" , searchedresult);
		  
	}
	
	public static void searchwithinvaliddata() throws InterruptedException {
		Thread.sleep(2000);
		Reports.searchinput.sendKeys("Document");
		Thread.sleep(2000);
		String searched = Reports.searchinput.getAttribute("value");
		Thread.sleep(3000);
		System.out.println("User searched with " + searched);
		Thread.sleep(2000);
	    String searchedresult = Reports.noresults.getText();
		Thread.sleep(3000);
		System.out.println(searchedresult + " is displayed");
	    Assert.assertEquals("No results found." , searchedresult);
	        
	}
	
	public static void selectdatelessthanninty() throws InterruptedException {
		ReportsPanel.clickcheckbox();
		Thread.sleep(2000);
		WebElement drpdown = Reports.datedropdown;
		drpdown.click();
		Thread.sleep(2000);
		WebElement customdate = Reports.customdaysoption;
		customdate.click();
		Thread.sleep(2000);
		
		WebElement startcalendericon = Reports.calenderstartdate;
		startcalendericon.click();
		Thread.sleep(2000);
		
		int startdate = 25;
		
		Reports.monthleftarrow.click();
		Thread.sleep(2000);
		Reports.monthleftarrow.click();
		Thread.sleep(2000);
		Reports.monthrightarrow.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//table[@id='sortTable']//td[text()="+startdate+"]")).click();
		Thread.sleep(2000);
		
		WebElement endcalendericon = Reports.calenderenddate;
		endcalendericon.click();
		Thread.sleep(2000);
		
		int enddate = 8;
		
		driver.findElement(By.xpath("//div[@id='endcalendarid']//table//td[text()="+enddate+"]")).click();
		Thread.sleep(2000);
		WebElement exportbtn = Reports.exportbtn;
		exportbtn.click();
		Thread.sleep(3000);
		try   
		{
			if(Reports.popuperror.isDisplayed())
			{
				String ErrorPopupMessage = Reports.popuperror.getText();
		        System.out.println("Popup message showing as " + ErrorPopupMessage);
		        Assert.assertEquals("No data found" , ErrorPopupMessage);
				WebElement popuperror1 = Reports.popuperrorok;
				popuperror1.click();
				Thread.sleep(5000);
			}
		}
		catch(Exception e) 
		{  
			System.out.println("Report Downloaded successfully");		    
		}
	}
	
	public static void selectdatemorethanninty() throws InterruptedException {
		Thread.sleep(2000);
		WebElement drpdown = Reports.datedropdown;
		drpdown.click();
		Thread.sleep(2000);
		WebElement customdate = Reports.customdaysoption;
		customdate.click();
		Thread.sleep(2000);
		
		WebElement startcalendericon = Reports.calenderstartdate;
		startcalendericon.click();
		Thread.sleep(2000);
		
		int startdate = 25;
		
		Reports.monthleftarrow.click();
		Thread.sleep(2000);
		Reports.yearleftarrow.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//table[@id='sortTable']//td[text()="+startdate+"]")).click();
		Thread.sleep(2000);	
		String NotificationMessage = Reports.livenotification.getText();
        System.out.println("Notification message displayed is " + NotificationMessage);
        Assert.assertEquals("Warning" + '\n' + "Selected Date should always be less than or equal to 90days" , NotificationMessage);
        Thread.sleep(7000);
		WebElement endcalendericon = Reports.calenderenddate;
		endcalendericon.click();
		Thread.sleep(2000);
		
		int enddate = 8;

		driver.findElement(By.xpath("//div[@id='endcalendarid']//table//td[text()="+enddate+"]")).click();
		Thread.sleep(2000);
	        
	}
	
}
