package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PA_TrainingPage {

	@FindBy(xpath = "//a[@href='/portal-pages/training']")
	public static WebElement Traininglink;

	@FindBy(xpath = "//div[@class='right']//button[@class='btn primary']")
	public static WebElement plusbtn;

	@FindBy(xpath = "//input[@id='name']")
	public static WebElement modulename;

	@FindBy(xpath = "//textarea[@id='description-module']")
	public static WebElement modulesdescription;

	@FindBy(xpath = "//div[@class='bottom']//*[contains(text(),'Submit')]")
	public static WebElement submitbtn;

	@FindBy(css="div.item.notification-log-trigger.has-notification")
	public static WebElement notificationicon;

	@FindBy(xpath = "//input[@placeholder='Start typing to search']")
	public static WebElement inputSearcnbar;

	@FindBy(xpath = "(//button[@class='btn primary'])[3]")
	public static WebElement Plusbutton;

	@FindBy(xpath = "//i[@class='icon icon-edit']")
	public static WebElement editicon;

	@FindBy(xpath = "(//i[@class='icon icon-trashcan'])[2]")
	public static WebElement delete;

	@FindBy(xpath = "(//i[@class='icon icon-trashcan'])[1]")
	public static WebElement deleteicon;

	@FindBy(xpath = "//div[@id='training-publish-tabs']//div[contains(text(),'Documentation')]")
	public static WebElement Documentationtab;
	
	@FindBy(xpath = "//div[@class='content selected']//button[@class='btn btn-primary mt-4 align-self-start primary']")
	public static WebElement newplus;

	@FindBy(xpath = "//button[@class='btn primary align-self-start text-center ml-2']")
	public static WebElement uploadicon;

	@FindBy(xpath = "//div[contains(text(),'Training Images')]")
	public static WebElement TrainingImagetab;

	@FindBy(xpath = "//div[@class='content selected']//button[@class='btn btn-primary mt-4 align-self-start primary']")
	public static WebElement plusbtnintrainingimage;

	@FindBy(xpath = "//i[@class='icon icon-upload']")
	public static WebElement uploadiconintrainingimage;

	@FindBy(xpath = "(//div[@class='action']//i[@class='icon icon-trashcan'])[3]")
	public static WebElement deleteiconbtn;

	@FindBy(xpath = "//div[contains(text(),'Training Videos')]")
	public static WebElement trainingvideostab;

	@FindBy(xpath = "//div[@class='content selected']//i[@class='icon icon-plus']")
	public static WebElement plusbtninvideo;
	
	@FindBy(xpath="(//i[@title='Upload'])[2]")
	public static WebElement trainingvideouploadicon;
	
	@FindBy(xpath="(//i[@class='icon icon-upload'])[3]")
	public static WebElement trainingvideouploadicon2;
	
	@FindBy(xpath="(//i[@class='icon icon-upload'])[4]")
	public static WebElement trainingvideouploadicon3;
	
	@FindBy(xpath="(//div[@class='action']//i[@class='icon icon-trashcan'])[2]")
	public static WebElement deleteiconvideo;
	
	@FindBy(xpath="//i[@class='icon icon-view-list']")
	public static WebElement listview;
	
	@FindBy(xpath="(//div[@class='bottom']//button[contains(text(),'Cancel')])[1]")
	public static WebElement cancelbtn;
	
	@FindBy(xpath="(//i[@class='icon icon-trashcan'])[1]")
    public static WebElement delbtn;
	
	@FindBy(xpath="//*[contains(text(),' Confirm ')]")
    public static WebElement confirmbtn;
	
	@FindBy(xpath = "//div[text()='Publish Training Module']")
    public static WebElement PublishTrainingModuleTitle;
	
	@FindBy(xpath="//label[@for='name']")
	public static WebElement modulenamelabel;
	
	@FindBy(xpath="//small[text()=' Module Name is required']")
	public static WebElement modulenameisrequired;
	
	@FindBy(xpath="(//i[@class='icon icon-info'])[2]")
	public static WebElement tooltipvideo;
	
	@FindBy(xpath = "//li[@class='right-arrow']")
    public static WebElement nextarrowbutton;
    
    @FindBy(xpath = "//li[@class='left-arrow']")
    public static WebElement previousarrowbutton;
    
    @FindBy(xpath = "(//button[@class='btn current-options'])[1]")
    public static WebElement showbutton;
    
    @FindBy(xpath = "//div[normalize-space()='10']")
    public static WebElement entriesbuttonone;
    
    @FindBy(xpath = "//div[normalize-space()='20']")
    public static WebElement entriesbuttontwo;
    
    @FindBy(xpath = "//div[normalize-space()='30']")
    public static WebElement entriesbuttonthree;
    
    @FindBy(xpath = "//li[@class='active']")
    public static WebElement paginationnum;
}
