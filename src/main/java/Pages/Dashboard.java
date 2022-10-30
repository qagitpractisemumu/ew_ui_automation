package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Dashboard {

    @FindBy(xpath = "//span[contains(text(),'Perform')]")
    public static WebElement performanceDashboard;
    
    @FindBy(xpath="html/body/app-root/app-portal-pages/div/main/div/div/div[2]/div/app-dashboard/div/div/div[2]/div/div/div[2]/div[1]/div/div[1]/div/span")
    public static WebElement subTabComputeUtilization;
    
    @FindBy(xpath="//*[@id='compute-single-line-chart']/div[3]/div/p")
    public static WebElement ComputeUtilizationChart;
    
    @FindBy(xpath = "html/body/app-root/app-portal-pages/div/main/div/div/div[2]/div/app-dashboard/div/div/div[2]/div/div/div[2]/div[1]/div/div[2]/div[2]/div/span[2]")
    public static WebElement lblComputeUtilizationPercentageSymbol;
    
    @FindBy(xpath="html/body/app-root/app-portal-pages/div/main/div/div/div[2]/div/app-dashboard/div/div/div[2]/div/div/div[2]/div[1]/div/div[2]/div[2]/div/div/div[1]")
    public static WebElement lblComputeUtilizationAverage;
    
    @FindBy(xpath="html/body/app-root/app-portal-pages/div/main/div/div/div[2]/div/app-dashboard/div/div/div[2]/div/div/div[2]/div[1]/div/div[2]/div[2]/div/div/div[2]")
    public static WebElement lblComputeUtilizationHourlyChange;
    
    @FindBy(xpath="/html/body/app-root/app-portal-pages/div/main/div/div/div[2]/div/app-dashboard/div/div/div[2]/div/div/div[2]/div[1]/div/div[2]/div[2]/div/span[3]/i")
    public static WebElement ComputeUtilizationUpDownArrow;
    
       @FindBy(xpath = "//label[text()='Resource Name']")
    public static WebElement lblResourceNameOnDashboard;

    @FindBy(xpath = "//button[@id='selectResource']")
    public static WebElement ResourceNameDropdownOnDashboard;
    
    ///////////////////////
 
    @FindBy(xpath="//*[@id='mainTabs']/div[2]/div/div/div[2]/div[2]/div/div[1]/div/span")
    public static WebElement subTabMemoryUtilization;    

    @FindBy(xpath="//*[@id='mainTabs']/div[2]/div/div/div[2]/div[2]/div/div[2]/div[2]/div/span[2]")
    public static WebElement lblMemoryUtilizationPercentageSymbol;    

    @FindBy(xpath="//*[@id='mainTabs']/div[2]/div/div/div[2]/div[2]/div/div[2]/div[2]/div/div/div[1]")
    public static WebElement lblMemoryUtilizationAverage;    

    @FindBy(xpath="//*[@id='mainTabs']/div[2]/div/div/div[2]/div[2]/div/div[2]/div[2]/div/div/div[2]")
    public static WebElement lblMemoryUtilizationHourlyChange;    

    @FindBy(xpath="//*[@id='mainTabs']/div[2]/div/div/div[2]/div[2]/div/div[2]/div[2]/div/span[3]")
    public static WebElement MemoryUtilizationUpDownArrow;
    
    //////////////////////////////
    
    @FindBy(xpath="//*[@id='mainTabs']/div[2]/div/div/div[3]/div[1]/div/div[1]/div/span")
    public static WebElement subTabDiskUtilization;    

    @FindBy(xpath = "//*[@id='mainTabs']/div[2]/div/div/div[3]/div[1]/div/div[2]/div[2]/div/span[2]")
    public static WebElement lblDiskUtilizationPercentageSymbol;
    
    @FindBy(xpath="//*[@id='mainTabs']/div[2]/div/div/div[3]/div[1]/div/div[2]/div[2]/div/div/div[1]")
    public static WebElement lblDiskUtilizationAverage;
    
    @FindBy(xpath="//*[@id='mainTabs']/div[2]/div/div/div[3]/div[1]/div/div[2]/div[2]/div/div/div[2]")
    public static WebElement lblDiskUtilizationHourlyChange;
    
    @FindBy(xpath="//*[@id='mainTabs']/div[2]/div/div/div[3]/div[1]/div/div[2]/div[2]/div/span[3]/i")
    public static WebElement DiskUtilizationUpDownArrow;
    
    /////////////////////////////////////////

    @FindBy(xpath="/html/body/app-root/app-portal-pages/div/main/div/div/div[2]/div/app-dashboard/div/div/div[2]/div/div/div[3]/div[2]/div/div[1]/div/span")    
    public static WebElement subTabNewtworkReadWrite;

    @FindBy(xpath="//*[@id='mainTabs']/div[2]/div/div/div[3]/div[2]/div/div[2]/div[2]/div[1]/div/span[2]")
    public static WebElement lblNetworkReadPercentageSymbol;
    
    @FindBy(xpath="//*[@id='mainTabs']/div[2]/div/div/div[3]/div[2]/div/div[2]/div[2]/div[1]/div/div[1]/div[1]")
    public static WebElement lblNetworkReadAverage;
    
    @FindBy(xpath="//*[@id='mainTabs']/div[2]/div/div/div[3]/div[2]/div/div[2]/div[2]/div[1]/div/div[1]/div[2]")  
    public static WebElement lblNetworkReadHourlyChange;
    
    @FindBy(xpath="//*[@id='mainTabs']/div[2]/div/div/div[3]/div[2]/div/div[2]/div[2]/div[1]/div/span[3]/i")
    public static WebElement NetworkReadUpDownArrow;
    
    
   
    @FindBy(xpath="//*[@id='mainTabs']/div[2]/div/div/div[3]/div[2]/div/div[2]/div[2]/div[2]/div/span[2]")
    public static WebElement lblNetworkWritePercentageSymbol;
    
    @FindBy(xpath="//*[@id='mainTabs']/div[2]/div/div/div[3]/div[2]/div/div[2]/div[2]/div[2]/div/div[1]/div[1]")
    public static WebElement lblNetworkWriteAverage;
    
    @FindBy(xpath="//*[@id='mainTabs']/div[2]/div/div/div[3]/div[2]/div/div[2]/div[2]/div[2]/div/div[1]/div[2]")
    public static WebElement lblNetworkWriteHourlyChange;
    
    @FindBy(xpath="//*[@id='mainTabs']/div[2]/div/div/div[3]/div[2]/div/div[2]/div[2]/div[2]/div/span[3]/i")
    public static WebElement NetworkWriteUpDownArrow;
    
        
    @FindBy(xpath = "//span[contains(text(),'Read')]")
    public static WebElement networkReadToggle;

    @FindBy(xpath = "//span[contains(text(),'Write')]")
    public static WebElement networkWritedToggle;
    
    @FindBy(xpath = "html[1]/body[1]/app-root[1]/app-portal-pages[1]/div[1]/header[1]/div[1]/div[1]/i[1]")
	public static WebElement EricssonLogo;    
    
    @FindBy(xpath = "//div[contains(text(),' © Ericsson Wireless Office, Inc. 2022 | ')]")
    public static WebElement EWOcopyRightSymbol;
}
