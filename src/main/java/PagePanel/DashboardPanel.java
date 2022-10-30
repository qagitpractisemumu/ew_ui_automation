package PagePanel;

import Pages.Dashboard;
import Pages.Login;
import Pages.Profile;
import Resource.BaseClass;
import Resource.UtilityClass;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

public class DashboardPanel extends BaseClass {
    Dashboard dashboard = new Dashboard();

    public DashboardPanel() {
        dashboard = PageFactory.initElements(driver, Dashboard.class);
    }


    public static void checkSubMenusDashboard() throws InterruptedException {
        Thread.sleep(2000);
        UtilityClass.validateMsg(Dashboard.performanceDashboard.getText(), "Performance");
        System.out.println("under Dashboard main menu,the submenu PERFORMANCE is present");
        Thread.sleep(1000);

        UtilityClass.validateMsg(Dashboard.subTabMemoryUtilization.getText(), "  Memory Utilization");
        System.out.println("under Dashboard main menu,the subtab Memory Utilization Label is present");
        
        UtilityClass.validateMsg(Dashboard.subTabDiskUtilization.getText(), "  Disk Utilization");
        System.out.println("under Dashboard main menu,the Disk Utilization Label is present");
        
        UtilityClass.validateMsg(Dashboard.subTabNewtworkReadWrite.getText(), "  Network Read & Write");
                System.out.println("under Dashboard main menu,the Network Read & Write Label is present");
        
    }

    public static void checkDashboardUI() throws InterruptedException {
        System.out.println("All UI elements are being verified");
        Thread.sleep(3000);
        System.out.println("Verifiying the UI elements IsDisplayed");  
        Assert.assertTrue(Dashboard.EricssonLogo.isDisplayed());    
        System.out.println("Ericsson logo on top header is displayed");
        Assert.assertTrue(Dashboard.EWOcopyRightSymbol.isDisplayed());
        System.out.println("Ericsson with Copyright symbol is dispalyed in the footer");        
        Assert.assertTrue(Login.privacyLegaLFooter.isDisplayed());
        System.out.println("Privacy and Legal link is dispalyed in teh footer");
    }
    
    public static void checkComputeUtilizationTab() throws InterruptedException { 
        //Compute Utilization tab validations
    	Thread.sleep(1000);
        System.out.println("Verifying all labels on Compute Utilization tab");
        UtilityClass.validateMsg(Dashboard.subTabComputeUtilization.getText(), "  Compute Utilization");               
        System.out.println("Under Dashboard main menu,the subtab Compute Utilization Label is present");   
        Assert.assertTrue(Dashboard.lblComputeUtilizationPercentageSymbol.isDisplayed());
        System.out.println("Under Dashboard - Compute Utilization subtab - % symbol is present");
        Assert.assertTrue(Dashboard.lblComputeUtilizationAverage.isDisplayed());
        Assert.assertTrue(Dashboard.lblComputeUtilizationHourlyChange.isDisplayed());
        System.out.println("Under Dashboard - Compute Utilization subtab - Average Hourly label is present");
        Assert.assertTrue(Dashboard.ComputeUtilizationUpDownArrow.isDisplayed());
        System.out.println("Under Dashboard - Compute Utilization subtab - Up and Down arrow for Average Hourly label is present");

        if (Dashboard.lblResourceNameOnDashboard.isDisplayed()){
        	System.out.println("ResourceName label is dispalyed");       	
            	}
        System.out.println("ResourceName label is not dispalyed");	
        
        if (Dashboard.ResourceNameDropdownOnDashboard.isDisplayed()){
        	System.out.println("ResourceName dropdown is dispalyed");       	
            	}
        System.out.println("ResourceName dropdown is not dispalyed");
    }
   
    public static void checkMemoryUtilizationTab() throws InterruptedException {     
        //Memory Utilization tab validations
        UtilityClass.validateMsg(Dashboard.subTabMemoryUtilization.getText(), "  Memory Utilization");
        System.out.println("Under Dashboard main menu, the subtab Memory Utilization Label is present");
        
        Assert.assertTrue(Dashboard.lblMemoryUtilizationPercentageSymbol.isDisplayed());
        System.out.println("Under Dashboard - Memory Utilization subtab - % symbol is present");
        Assert.assertTrue(Dashboard.lblMemoryUtilizationAverage.isDisplayed());
        Assert.assertTrue(Dashboard.lblMemoryUtilizationHourlyChange.isDisplayed());
        System.out.println("Under Dashboard - Memory Utilization subtab - Average Hourly label is present");
        Assert.assertTrue(Dashboard.MemoryUtilizationUpDownArrow.isDisplayed());
        System.out.println("Under Dashboard - Memory Utilization subtab - Up and Down arrow for Average Hourly label is present");
    }   
     
    
    public static void checkDiskUtilizationTab() throws InterruptedException {     
        //Disk Utilization tab validations        
        UtilityClass.validateMsg(Dashboard.subTabDiskUtilization.getText(), "  Disk Utilization");
        System.out.println("Under Dashboard main menu, the subtab Disk Utilization Label is present");
        
        Assert.assertTrue(Dashboard.lblDiskUtilizationPercentageSymbol.isDisplayed());
        System.out.println("Under Dashboard - Disk Utilization subtab - % symbol is present");
        Assert.assertTrue(Dashboard.lblDiskUtilizationAverage.isDisplayed());
        Assert.assertTrue(Dashboard.lblDiskUtilizationHourlyChange.isDisplayed());
        System.out.println("Under Dashboard - Disk Utilization subtab - Average Hourly label is present");
        Assert.assertTrue(Dashboard.DiskUtilizationUpDownArrow.isDisplayed());
        System.out.println("Under Dashboard - Disk Utilization subtab - Up and Down arrow for Average Hourly label is present");
    }     
    
    
    
    public static void checkNetworkReadWriteTab() throws InterruptedException {     
        //Disk Utilization tab validations        
        //NetworkReadWrite Utilization tab validations
        UtilityClass.validateMsg(Dashboard.subTabNewtworkReadWrite.getText(), "  Network Read & Write");
        System.out.println("Under Dashboard main menu, the Network Read & Write label is present");
        
        
        Assert.assertTrue(Dashboard.lblNetworkReadPercentageSymbol.isDisplayed());
        System.out.println("Under Dashboard - Network Read - % symbol is present");
        Assert.assertTrue(Dashboard.lblNetworkReadPercentageSymbol.isDisplayed());
        Assert.assertTrue(Dashboard.lblNetworkReadHourlyChange.isDisplayed());
        System.out.println("Under Dashboard - Network Read - Average Hourly label is present");
        Assert.assertTrue(Dashboard.lblNetworkReadHourlyChange.isDisplayed());
        System.out.println("Under Dashboard - Network Read Up and Down arrow for Average Hourly label is present");
        
        
        Assert.assertTrue(Dashboard.lblNetworkWritePercentageSymbol.isDisplayed());
        System.out.println("Under Dashboard - Network Write - % symbol is present");
        Assert.assertTrue(Dashboard.lblNetworkWriteAverage.isDisplayed());
        Assert.assertTrue(Dashboard.lblNetworkWriteHourlyChange.isDisplayed());
        System.out.println("Under Dashboard - Network Write - Average Hourly label is present");
        Assert.assertTrue(Dashboard.NetworkWriteUpDownArrow.isDisplayed());
        System.out.println("Under Dashboard - Network Write Up and Down arrow for Average Hourly label is present");
        
        if (Dashboard.networkReadToggle.isDisplayed()){
        	System.out.println("networkRead Toggle is dispalyed");       	
            	}
        System.out.println("networkRead Toggle is not dispalyed");	
        
        if (Dashboard.networkReadToggle.isDisplayed()){
        	System.out.println("networkWrite Toggle is dispalyed");       	
            	}
        System.out.println("networkWrite Toggle is not dispalyed");    
         
    }
}
