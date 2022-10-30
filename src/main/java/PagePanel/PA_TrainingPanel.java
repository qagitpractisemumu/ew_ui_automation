package PagePanel;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Pages.PA_TrainingPage;
import Resource.BaseClass;
import Resource.RobotUtil;
import Resource.UtilityClass;

public class PA_TrainingPanel extends BaseClass {

	PA_LoginPanel loginpage = new PA_LoginPanel();
	RobotUtil robotutil = new RobotUtil();

	public PA_TrainingPanel() {
		PageFactory.initElements(driver, PA_TrainingPage.class);
	}

	public void click_On_TrainingMenu() {
		UtilityClass.waitForElement(PA_TrainingPage.Traininglink);
		PA_TrainingPage.Traininglink.click();
	}

	public void click_on_NewButton() {
		UtilityClass.waitForElement(PA_TrainingPage.plusbtn);
		PA_TrainingPage.plusbtn.click();
	}

	public void enter_ModuleName_Details(String Modulename) {
		UtilityClass.waitForElement(PA_TrainingPage.modulename);
		PA_TrainingPage.modulename.sendKeys(Modulename + ((long) Math.floor(Math.random() * 9_000L) + 1_000_0L));
	}

	public void enter_ModuleDescription_Details(String ModuleDescription) {
		UtilityClass.waitForElement(PA_TrainingPage.modulesdescription);
		PA_TrainingPage.modulesdescription.sendKeys(ModuleDescription);
	}

	public void click_On_Documentation_Subtab_and_New_Button() {
		UtilityClass.waitForElement(PA_TrainingPage.Documentationtab);
		PA_TrainingPage.Documentationtab.click();
		UtilityClass.waitForElement(PA_TrainingPage.newplus);
		PA_TrainingPage.newplus.click();
	}

	public void adding_Documentation(String uploads) throws Exception {
		robotutil.upload_Documentation();
	}

	public void adding_htmlDocumentation(String uploadshtml) throws Exception {
		robotutil.upload_htmlDocumentation();
	}

	public void addingPDFtoDocmentation(String uploads) throws Exception {
		robotutil.upload_DocumentationPDF();
	}

	public void click_On_TrainingImage_Subtab_and_New_button() {
		UtilityClass.waitForElement(PA_TrainingPage.TrainingImagetab);
		PA_TrainingPage.TrainingImagetab.click();
		UtilityClass.waitForElement(PA_TrainingPage.plusbtnintrainingimage);
		PA_TrainingPage.plusbtnintrainingimage.click();
	}

	public void upload_TrainingImage(String TrainingImage) throws Exception {
		robotutil.upload_Image_InTrainingImage();
		Thread.sleep(3000);
		System.out.println("Submit Button is disabled");
	}

	public void click_On_TrainingVideo_Subtab_and_New_button() {
		UtilityClass.waitForElement(PA_TrainingPage.trainingvideostab);
		PA_TrainingPage.trainingvideostab.click();
		UtilityClass.waitForElement(PA_TrainingPage.plusbtninvideo);
		PA_TrainingPage.plusbtninvideo.click();
	}

	public void upload_TrainingVideos(String uploadvideo) throws Exception {
		robotutil.upload_TrainingVideo(uploadvideo);
		Thread.sleep(5000);
		System.out.println("Submit Button is disabled");
	}

	public void click_On_Submit_Button() throws Exception {
		UtilityClass.waitForElement(PA_TrainingPage.submitbtn);
		PA_TrainingPage.submitbtn.click();
		Thread.sleep(3000);
		UtilityClass.waitForElement(PA_TrainingPage.notificationicon);
		PA_TrainingPage.notificationicon.click();
		Thread.sleep(3000);

		String createmsg = driver
				.findElement(By.xpath("//div[contains(text(),'Successfully created the training module.')]")).getText();
		System.out.println(createmsg);
		Assert.assertEquals(createmsg, "Successfully created the training module.");
	}

	public void clicksSaveTraining() throws Exception {
		UtilityClass.waitForElement(PA_TrainingPage.submitbtn);
		PA_TrainingPage.submitbtn.click();
		Thread.sleep(3000);
	}

	public void enter_Modulename_to_searchbar(String modulename) throws Exception {
		UtilityClass.waitForElement(PA_TrainingPage.inputSearcnbar);
		PA_TrainingPage.inputSearcnbar.sendKeys(modulename);
		Thread.sleep(3000);
		PA_TrainingPage.inputSearcnbar.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("(//*[contains(text(),'" + modulename + "')])[1]")).click();
	}

	public void click_On_Edit_Button() {
		UtilityClass.waitForElement(PA_TrainingPage.editicon);
		PA_TrainingPage.editicon.click();
	}

	public void enter_Module_Details_And_ModuleDescription(String Modulename, String Moduledescription) {
		UtilityClass.waitForElement(PA_TrainingPage.modulename);
		PA_TrainingPage.modulename.sendKeys(Modulename);
		UtilityClass.waitForElement(PA_TrainingPage.modulesdescription);
		PA_TrainingPage.modulesdescription.sendKeys(Moduledescription);

	}

	public void update_Documentation(String uploads) throws Exception {
		robotutil.upload_Documentation();
	}

	public void update_TrainingImage(String TrainingImage) throws AWTException, InterruptedException {
		driver.findElement(By.xpath("(//i[@class='icon icon-trashcan'])[3]")).click();
		robotutil.update_TrainingImage(TrainingImage);
	}

	public void update_Trainingvideo(String uploadvideo) throws Exception {
		driver.findElement(By.xpath("(//i[@class='icon icon-trashcan'])[5]")).click();
		robotutil.update_TrainingVideo(uploadvideo);

	}

	public void click_On_submitButton() throws Exception {
		UtilityClass.waitForElement(PA_TrainingPage.submitbtn);
		PA_TrainingPage.submitbtn.click();
		Thread.sleep(3000);
		UtilityClass.waitForElement(PA_TrainingPage.notificationicon);
		PA_TrainingPage.notificationicon.click();
		Thread.sleep(3000);

		String updatemsg = driver
				.findElement(By.xpath("//div[contains(text(),'Successfully updated the training module.')]")).getText();
		System.out.println(updatemsg);
		Assert.assertEquals(updatemsg, "Successfully updated the training module.");
		PA_LoginPanel.signout();

	}

	public void click_On_Delete_Button() throws Exception {
		UtilityClass.waitForElement(PA_TrainingPage.delbtn);
		PA_TrainingPage.delbtn.click();
		UtilityClass.waitForElement(PA_TrainingPage.confirmbtn);
		PA_TrainingPage.confirmbtn.click();
		UtilityClass.waitForElement(PA_TrainingPage.notificationicon);
		PA_TrainingPage.notificationicon.click();
		Thread.sleep(4000);
		String delmsg = driver.findElement(By.xpath("//div[contains(text(),'Successfully deleted training module.')]"))
				.getText();
		System.out.println(delmsg);
		Assert.assertEquals(delmsg, "Successfully deleted training module.");
		PA_LoginPanel.signout();
	}

	public void enters_to_Searchbar(String ModuleName) throws Exception {
		UtilityClass.waitForElement(PA_TrainingPage.inputSearcnbar);
		PA_TrainingPage.inputSearcnbar.sendKeys(ModuleName);
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[contains(text(),'" + ModuleName + "')])[1]")).click();
		PA_LoginPanel.signout();
	}

	public void click_On_Listview() {
		UtilityClass.waitForElement(PA_TrainingPage.listview);
		PA_TrainingPage.listview.click();
	}

	public void click_On_CancelButton() {
		UtilityClass.waitForElement(PA_TrainingPage.cancelbtn);
		PA_TrainingPage.cancelbtn.click();
	}

	public boolean enters_Modulename_to_searchbar(String Modulename) {
		UtilityClass.waitForElement(PA_TrainingPage.inputSearcnbar);
		PA_TrainingPage.inputSearcnbar.sendKeys(Modulename);
		try {
			driver.findElement(By.xpath("(//div[contains(text(),'" + Modulename + "')])[1]")).click();
			return false;
		} catch (Exception e1) {
			System.out.println(e1);
		}
		return true;
	}

	public void verify_Submit_Button_Disabled() {
		UtilityClass.waitForElement(PA_TrainingPage.submitbtn);
		if (driver.findElement(By.xpath("//div[@class='bottom']//*[contains(text(),'Submit')]")).isDisplayed()) {
			System.out.println("Submit button is disabled");
		} else {
			System.out.println("Submit button is enabled");
		}
	}

	public void uploads_incorrect_ImageFormat(String uploads) throws Exception {
		robotutil.upload_TrainingImage_incorrectformat(uploads);
		UtilityClass.waitForElement(PA_TrainingPage.cancelbtn);
		PA_TrainingPage.cancelbtn.click();
		UtilityClass.waitForElement(PA_TrainingPage.notificationicon);
		PA_TrainingPage.notificationicon.click();
		Thread.sleep(3000);
		String errormsg = driver.findElement(By.xpath("//div[contains(text(),'Not in Image Format JPG/PNG')]"))
				.getText();
		System.out.println(errormsg);
		Assert.assertEquals(errormsg, "Not in Image Format JPG/PNG");
		PA_LoginPanel.signout();
	}

	public void uploads_Unsupported_Video_Format(String uploadinformatvideo) throws Exception {
		robotutil.upload_TrainingVideo_incorrectformat(uploadinformatvideo);
		Thread.sleep(5000);
		String errormsg1 = driver
				.findElement(By.xpath("//small[contains(.,' Only MP4 and WEBM video formats are supported. ')]"))
				.getText();
		System.out.println(errormsg1);
		Assert.assertEquals(errormsg1, "Only MP4 and WEBM video formats are supported.");
		UtilityClass.waitForElement(PA_TrainingPage.cancelbtn);
		PA_TrainingPage.cancelbtn.click();
		PA_LoginPanel.signout();

	}

	public void adminValidatesAllElementsAreDisplayedOntrainingmodule() throws InterruptedException {
		Thread.sleep(5000);
		Assert.assertTrue(PA_TrainingPage.PublishTrainingModuleTitle.isDisplayed());
		Assert.assertTrue(PA_TrainingPage.PublishTrainingModuleTitle.getText().contains("Publish Training Module"));
		System.out.println("Title of the page is " + PA_TrainingPage.PublishTrainingModuleTitle.getText());
		Assert.assertTrue(PA_TrainingPage.modulenamelabel.isDisplayed());
		Assert.assertTrue(PA_TrainingPage.modulenamelabel.getText().contains("Module Name"));
		System.out.println("Title of the page is " + PA_TrainingPage.modulenamelabel.getText());
		System.out.println("All Elements and tabs are visible");

	}

	public void checkfortooltipvideo() throws InterruptedException {
		Actions builder = new Actions(driver);
		builder.moveToElement(driver.findElement(By.xpath("//span[@class='customtooltip']"))).perform();
		Thread.sleep(3000);
		String tooltipmsg = (driver.findElement(By.xpath("//span[@class='customtooltip']"))).getText();
		System.out.println("Showing tootip as: " + tooltipmsg);
		Assert.assertEquals("Supported video formats are MP4 and WEBM.", tooltipmsg);
		Thread.sleep(1000);
	}

	public void checkfortooltipdocumentation() throws InterruptedException {
		Thread.sleep(5000);
		Actions builder = new Actions(driver);
		builder.moveToElement(driver.findElement(By.xpath("//i[@class='icon icon-info ml-2 video-link']"))).perform();
		Thread.sleep(5000);
		String tooltipmsg1 = (driver.findElement(By.xpath("//i[@class='icon icon-info ml-2 video-link']")))
				.getAttribute("ngbpopover");
		System.out.println("Showing tootip as: " + tooltipmsg1);
		Assert.assertEquals("Currently, we only support plain text/PDF files and html files", tooltipmsg1);
		Thread.sleep(1000);
	}

	public void clicknextarrowBtn() throws InterruptedException {
		Thread.sleep(2000);
		UtilityClass.waitForElement(PA_TrainingPage.nextarrowbutton);
		PA_TrainingPage.nextarrowbutton.click();
		Thread.sleep(1000);
	}

	public static void clickpreviousarrowBtn() throws InterruptedException {
		Thread.sleep(2000);
		UtilityClass.waitForElement(PA_TrainingPage.previousarrowbutton);
		PA_TrainingPage.previousarrowbutton.click();
		Thread.sleep(1000);
	}

	public static void clickshowdropup() throws InterruptedException {
		Thread.sleep(2000);
		UtilityClass.waitForElement(PA_TrainingPage.showbutton);
		PA_TrainingPage.showbutton.click();
		Thread.sleep(1000);
	}

	public static void click20entries() throws InterruptedException {
		Thread.sleep(2000);
		UtilityClass.waitForElement(PA_TrainingPage.entriesbuttontwo);
		PA_TrainingPage.entriesbuttontwo.click();
		Thread.sleep(5000);
	}

	public static void click30entries() throws InterruptedException {
		Thread.sleep(2000);
		UtilityClass.waitForElement(PA_TrainingPage.entriesbuttonthree);
		PA_TrainingPage.entriesbuttonthree.click();
		Thread.sleep(3000);
	}

	public static void click10entries() throws InterruptedException {
		Thread.sleep(2000);
		UtilityClass.waitForElement(PA_TrainingPage.entriesbuttonone);
		PA_TrainingPage.entriesbuttonone.click();
		Thread.sleep(3000);
	}

	public void typecheckpagenumberone() throws InterruptedException {
		Thread.sleep(8000);
		String paginationnumber1 = PA_TrainingPage.paginationnum.getText();
		System.out.println("Admin is on page " + paginationnumber1);
		Assert.assertEquals("1", paginationnumber1);
		Thread.sleep(2000);
	}

	public void typecheckpagenumbertwo() throws InterruptedException {
		Thread.sleep(8000);
		String paginationnumber2 = PA_TrainingPage.paginationnum.getText();
		System.out.println("Admin is on page " + paginationnumber2);
		Assert.assertEquals("2", paginationnumber2);
		Thread.sleep(2000);
	}

	public void adminValidatesRequiredFieldValidationOntrainingmodule() throws InterruptedException {
		Thread.sleep(5000);
		System.out.println("Performing required field validation");
		PA_TrainingPage.modulename.sendKeys(Keys.TAB);
		Assert.assertTrue(PA_TrainingPage.modulenameisrequired.isDisplayed());
		Assert.assertTrue(PA_TrainingPage.modulenameisrequired.getText().contains("Module Name is required"));
		System.out.println("Error displayed is " + PA_TrainingPage.modulenameisrequired.getText());

	}
	
	public void nonexistingmodulename(String nonModuleName) throws InterruptedException {
		UtilityClass.waitForElement(PA_TrainingPage.inputSearcnbar);
		PA_TrainingPage.inputSearcnbar.sendKeys(nonModuleName);
		PA_TrainingPage.inputSearcnbar.sendKeys(Keys.ENTER);
		Thread.sleep(3000);	
	}
	
}
