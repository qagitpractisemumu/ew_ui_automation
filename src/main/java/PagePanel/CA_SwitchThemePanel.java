package PagePanel;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Pages.CA_SwitchTheme;
import Resource.BaseClass;
import Resource.UtilityClass;

public class CA_SwitchThemePanel extends BaseClass{
	
	
	CA_SwitchTheme ca_SwitchTheme = new CA_SwitchTheme();
	
	public CA_SwitchThemePanel() {
		ca_SwitchTheme = PageFactory.initElements(driver, CA_SwitchTheme.class);
    }
	
	public static void clickSwitchTheme() throws InterruptedException {
        UtilityClass.waitForElement(CA_SwitchTheme.switchthemetoogleball);
        CA_SwitchTheme.switchthemetoogleball.click();
        Thread.sleep(1000);
        
	}
	    public static void checkdarkSwitchTheme() throws InterruptedException {
	    	String switchthemedark =  CA_SwitchTheme.darkmode.getAttribute("class");
	    	System.out.println("Theme Changed to " + switchthemedark);
	    	Assert.assertEquals("dark dark-mode", switchthemedark);
	}
	    
	    public static void checklightSwitchTheme() throws InterruptedException {
	    	String switchthemelight =  CA_SwitchTheme.lightmode.getAttribute("class");
	    	System.out.println("Theme Changed to " + switchthemelight);
	    	Assert.assertEquals("light light-mode", switchthemelight);
	}
	    
	    public static void checkdefaultSwitchTheme() throws InterruptedException {
	    	String defaulttheme =  CA_SwitchTheme.defaulttheme.getAttribute("class");
	    	System.out.println("By-Default theme is in " + defaulttheme);
	    	Assert.assertEquals("light light-mode", defaulttheme);
	}
	    
}
