package PagePanel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Pages.PA_appstore;
import Resource.BaseClass;
import Resource.RobotUtil;
import Resource.UtilityClass;

public class PA_appstorePanel extends BaseClass {

    public PA_appstorePanel() {
        appstore = PageFactory.initElements(driver, PA_appstore.class);
    }

    PA_appstore appstore = new PA_appstore();
    UtilityClass utilityclass = new UtilityClass();

    RobotUtil robotutili = new RobotUtil();

    PA_LoginPanel login = new PA_LoginPanel();

    public void click_On_Appstore_Link() {
        UtilityClass.waitForElement(appstore.appstoreLink);
        appstore.appstoreLink.click();
    }

    public void typeAppName(String appName) throws Exception {
        driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys(appName);
        Thread.sleep(4000);
        appstore.Search.sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//div[@class='action view-action selected-action']//i[@class='icon icon-view-tiles']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//i[@class='icon icon-view-list']")).click();
    }

    public void click_on_the_searchbox() {
        UtilityClass.waitForElement(appstore.Search);
        appstore.Search.click();
    }

    public void enterSoftware(String software) throws Exception {
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys(software);
        Thread.sleep(10000);
        appstore.Search.sendKeys(Keys.ENTER);
        Thread.sleep(4000);
        driver.findElement(By.xpath("//h5[contains(text(),"+ software +")]")).click();
        Thread.sleep(2000);
        WebElement element = driver.findElement(By.xpath("//div[@class='row']//div[@class='card custom-card selected']//label[@style='display: flex;']"));
        JavascriptExecutor excecutor = (JavascriptExecutor) driver;
        excecutor.executeScript("arguments[0].click();", element);
        Thread.sleep(3000);
        excecutor.executeScript("arguments[0].click();", element);
        PA_LoginPanel.signout();
    }

    public void clicks_On_dropdown() throws Exception {
        UtilityClass.waitForElement(appstore.dropdownbutton);
        Thread.sleep(4000);
        appstore.dropdownbutton.click();
    }

    public void viewLicensedsoftwares(String licensedSoftware) throws Exception {
        UtilityClass.waitForElement(appstore.Licensed);
        appstore.Licensed.click();
        Thread.sleep(3000);
        UtilityClass.waitForElement(appstore.Search);
        appstore.Search.sendKeys(licensedSoftware);
        Thread.sleep(3000);
        appstore.Search.sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//div[@class='action view-action selected-action']//i[@class='icon icon-view-tiles']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//i[@class='icon icon-view-list']")).click();
        PA_LoginPanel.signout();
    }

    public void click_plusbtn() throws Exception {
        Thread.sleep(3000);
        UtilityClass.waitForElement(appstore.plusbtn);
        appstore.plusbtn.click();

    }

    public void creation_application(String applicationName, String Category, String Pricing, String Features,
                                     String Specifications, String BriefDescription) throws Exception {
        UtilityClass.waitForElement(appstore.nameoftheapp);
        appstore.nameoftheapp.sendKeys(applicationName);
        UtilityClass.waitForElement(appstore.categorydropdown);
        appstore.categorydropdown.click();
        driver.findElement(By.xpath("(//*[@class='options-list'])[2]"));
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//*[contains(text(),'" + Category + "')])[3]")).click();
        UtilityClass.waitForElement(appstore.price);
        appstore.price.sendKeys(Pricing);
        UtilityClass.waitForElement(appstore.typeoffeatures);
        appstore.typeoffeatures.sendKeys(Features);
        UtilityClass.waitForElement(appstore.specifications);
        appstore.specifications.sendKeys(Specifications);
        UtilityClass.waitForElement(appstore.description);
        appstore.description.sendKeys(BriefDescription);
        Thread.sleep(2000);

    }

    public void upload_image() throws Exception {
        Thread.sleep(2000);
        robotutili.Upload_applicationlogo();
    }

    public void clickonsavebtn() throws Exception {
        UtilityClass.waitForElement(appstore.savebtn);
        appstore.savebtn.click();
        Thread.sleep(5000);
        UtilityClass.waitForElement(appstore.notificationicon);
        appstore.notificationicon.click();
        UtilityClass.waitForElement(appstore.notificationdescription);
        appstore.notificationdescription.click();
        String a1 = driver.findElement(By.xpath("//div[@class='description']")).getText();
        System.out.println(a1);
        Assert.assertEquals(a1, "Successfully added a new App");
        PA_LoginPanel.signout();
    }

    public void fillappinthesearch(String App) throws Exception {
        driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
        UtilityClass.waitForElement(appstore.Search);
        appstore.Search.sendKeys(App);
        Thread.sleep(5000);
        appstore.Search.sendKeys(Keys.ENTER);
        Thread.sleep(4000);
        appstore.testappclick.click();
    }

    public void editbutton() {
        UtilityClass.waitForElement(appstore.editbtn);
        appstore.editbtn.click();

    }

    public void edit_the_details(String category, String pricing, String features, String specifications,
                                 String briefDescription) throws Exception {
        UtilityClass.waitForElement(appstore.categorydropdown);
        appstore.categorydropdown.click();
        driver.findElement(By.xpath("(//*[@class='options-list'])[2]"));
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//*[contains(text(),'" + category + "')])[1]")).click();
        UtilityClass.waitForElement(appstore.price);
        appstore.price.clear();
        appstore.price.sendKeys(pricing);
        Thread.sleep(3000);
        UtilityClass.waitForElement(appstore.typeoffeatures);
        appstore.typeoffeatures.sendKeys(features);
        UtilityClass.waitForElement(appstore.specifications);
        appstore.specifications.sendKeys(specifications);
        UtilityClass.waitForElement(appstore.description);
        appstore.description.sendKeys(briefDescription);

    }

    public void applicationlogoupdate() throws Exception {
        Thread.sleep(3000);
        robotutili.Upload_updateapplicationlogo();
    }

    public void savetheupdate() throws Exception {
        UtilityClass.waitForElement(appstore.savebtn);
        appstore.savebtn.click();
        Thread.sleep(4000);
        UtilityClass.waitForElement(appstore.notificationicon);
        appstore.notificationicon.click();
        UtilityClass.waitForElement(appstore.notificationdescription);
        appstore.notificationdescription.click();
        String a2 = driver.findElement(By.xpath("//div[@class='description']")).getText();
        System.out.println(a2);
        Assert.assertEquals(a2, "Successfully Updated the App");
        PA_LoginPanel.signout();

    }

    public void deletetheapp(String deleteApp) throws Exception {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        UtilityClass.waitForElement(appstore.Search);
        appstore.Search.sendKeys(deleteApp);
        appstore.Search.sendKeys(Keys.ENTER);
        Thread.sleep(4000);
        appstore.testappclick.click();
        UtilityClass.waitForElement(appstore.deletebtn);
        appstore.deletebtn.click();
    }

    public void confirm_to_deleteapp() throws Exception {
        UtilityClass.waitForElement(appstore.Yesbtn);
        appstore.Yesbtn.click();
        Thread.sleep(5000);
        UtilityClass.waitForElement(appstore.notificationicon);
        appstore.notificationicon.click();
        UtilityClass.waitForElement(appstore.notificationdescription);
        appstore.notificationdescription.click();
        String a3 = driver.findElement(By.xpath("//div[@class='description']")).getText();
        System.out.println(a3);
        Assert.assertEquals(a3, "Successfully deleted the App");
        PA_LoginPanel.signout();
    }

    public void deselectmappedapplication(String mapped) throws Exception {
        UtilityClass.waitForElement(appstore.Search);
        appstore.Search.click();
        driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys(mapped);
        Thread.sleep(3000);
        appstore.Search.sendKeys(Keys.ENTER);
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//h5[@title='M 365 Apps for Business (<300) - BYOL'])[1]")).click();
        Thread.sleep(2000);
        WebElement element3 = driver.findElement(By.xpath("//label[@for='cssCheckbox5db46f3683213613dcf48663']"));
        JavascriptExecutor excecutor3 = (JavascriptExecutor) driver;
        excecutor3.executeScript("arguments[0].click();", element3);
        Thread.sleep(3000);
        UtilityClass.waitForElement(appstore.notificationicon);
        appstore.notificationicon.click();
        UtilityClass.waitForElement(appstore.notificationdescription);
        appstore.notificationdescription.click();
        String a4 = driver.findElement(By.xpath("//div[@class='notification-log-item new']//div[contains(.,'Error')]"))
                .getText();
        System.out.println(a4);
        Assert.assertEquals(a4, "Error");
        PA_LoginPanel.signout();
    }

    public void enternameandskip(String name) {
        UtilityClass.waitForElement(appstore.plusbtn);
        appstore.plusbtn.click();
        UtilityClass.waitForElement(appstore.nameoftheapp);
        appstore.nameoftheapp.sendKeys(name);
    }

    public void skip_price_features_specifications_description(String pricing, String features, String specifications,
                                                               String Briefdescription) {
        UtilityClass.waitForElement(appstore.price);
        appstore.price.sendKeys(Keys.TAB);
        UtilityClass.waitForElement(appstore.typeoffeatures);
        appstore.typeoffeatures.sendKeys(Keys.TAB);
        UtilityClass.waitForElement(appstore.specifications);
        appstore.specifications.sendKeys(Keys.TAB);
        UtilityClass.waitForElement(appstore.description);
        appstore.description.sendKeys(Keys.TAB);
        UtilityClass.waitForElement(appstore.cancelbtn);
        appstore.cancelbtn.sendKeys(Keys.TAB);

    }

    public void checkforsavebutton() {
        if (driver.findElement(By.xpath("(//button[@type='submit'])[3]")).isEnabled()) {
            System.out.println("Savebtn is enabled");
        } else
            System.out.println("Savebtn is disabled");
        driver.findElement(By.xpath("(//i[@class='icon icon-cross'])[2]")).click();
        PA_LoginPanel.signout();
    }
    
    public void selectlicenced() throws Exception {
    	UtilityClass.waitFluentWait(appstore.Licensed);
    	Thread.sleep(4000);
    	appstore.Licensed.click();
    }
    
    public void clickListView() throws InterruptedException {
    	UtilityClass.waitForElement(appstore.listicon);
    	appstore.listicon.click();
    	Thread.sleep(3000);
    	}
}
