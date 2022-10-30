package PagePanel;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import Pages.Login;
import Pages.Profile;
import Resource.BaseClass;


public class PA_SupportPanel extends BaseClass {
	Login login = new Login();
    Profile profile = new Profile();
   
public static void checksupportbtn() throws InterruptedException {
	Thread.sleep(2000);
	Assert.assertTrue(driver.findElement(By.linkText("Support")).isDisplayed());
	System.out.println("Support is available");
    Thread.sleep(2000);
}


public static void checktooltip() throws InterruptedException {
	 Actions builder = new Actions(driver);
	 builder.moveToElement(driver.findElement(By.linkText("Support"))).perform();
	 Thread.sleep(3000);
	 String tooltipmsg = (driver.findElement(By.xpath("//span[@class='message white left']//div"))).getText();
	 System.out.println("Showing tootip as: "+ tooltipmsg);
	 Assert.assertEquals("Open the Support Page to Report an Issue", tooltipmsg);
    Thread.sleep(1000);	 
}


public static void clicksupportbtn() throws InterruptedException {
	Thread.sleep(3000);
	driver.findElement(By.linkText("Support")).click();
	String strUrl = driver.findElement(By.linkText("Support")).getAttribute("href");
    Thread.sleep(1000);
    System.out.println("Current Url is:"+ strUrl);
    Assert.assertEquals("https://www.bmc.com/", strUrl);
    Thread.sleep(2000);  
    driver.get(strUrl);
    String strtitle = driver.getTitle();
    System.out.println("Title of the page is: "+ strtitle);
    Assert.assertEquals("BMC Software – Run and Reinvent", strtitle);

}



}
