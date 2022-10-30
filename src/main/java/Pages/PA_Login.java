package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PA_Login {

	// WebElements for Login page

	//@FindBy(xpath = "//input[@placeholder='Email']")
	//public static WebElement Email;
	@FindBy(xpath = "//input[@id='userName']")
	public static WebElement Email;

	//@FindBy(xpath = "//input[@type='password']")
	//public static WebElement password;
	@FindBy(xpath = "//input[@id='userEmail']")
	public static WebElement password;

	@FindBy(xpath = "//button[@type='submit']")
	public static WebElement loginbtn;

	@FindBy(xpath = "//span[contains(text(),'sp-ericsson')]")
	public static WebElement usrname;

	@FindBy(xpath = "//button[@class='btn big']")
	public static WebElement signout;
	
	@FindBy(xpath = "//span[@class='TabTitleText']")
	public static WebElement performance;
	
	@FindBy(xpath="//button[@id='selectSubscription']")
	public static WebElement subscriptiondropdown;
	
	@FindBy(xpath="//button[@id='selectResource']")
	public static WebElement resourcedropdown;

	@FindBy(xpath = "//*[contains(text(),'Email')]")
	public static WebElement emailIDRadioBtn;

	@FindBy(xpath = "//input[@placeholder= 'Email']")	
	public static WebElement loginEmailTxtBox;
	
	@FindBy(xpath = "//input[@placeholder='Enter One Time Password(OTP)']")
	public static WebElement enterCodeTxtBox;

	@FindBy(xpath = "type='submit'")
	public static WebElement completeBtn;

	@FindBy(xpath = "//button[@type='submit']")
	public static WebElement completeButton;

	@FindBy(xpath = "(//a[contains(text(),'Sign in')])[2]")
	public static WebElement signInLink;

	@FindBy(xpath = "//input[@class='ycptinput']")		
	public static WebElement yopEmailTxtBox;

	@FindBy(xpath = "/html/body/div/div[2]/main/div[3]/div/div[1]/div[2]/div/div/form/div/div[1]/div[4]/button/i")
	public static WebElement checkYopInboxBtn;

	@FindBy(xpath = "//*[contains(text(),'Your Wireless Office One Time Password is: ')]/b")
	public static WebElement otpTxt;
	
	@FindBy(xpath="//button[@type='submit']")
	public static WebElement Completebutton;
	
	@FindBy(xpath="//small[contains(text(),'Email is required')]")
	public static WebElement Emailreqvalidation;
	
	@FindBy(xpath="//small[contains(text(),'Password is required')]")
	public static WebElement Phonereqvalidation;
	
	@FindBy(xpath="//small[contains(text(),'Invalid Email')]")
	public static WebElement Emailinvalidvalidation;
	
	@FindBy(xpath="//a[contains(text(),'Privacy and Legal')]")
	public static WebElement privacyandlegal;
	
	@FindBy(xpath="//a[contains(text(),'Ericsson Wireless Office Subscription Terms of Service')]")
	public static WebElement termsofservice;
	
	@FindBy(xpath="//a[contains(text(),'Ericsson Wireless Office Service Description')]")
	public static WebElement servicedescription;
	
	@FindBy(xpath="//a[contains(text(),'Ericsson Wireless Office Service Level Agreement')]")
	public static WebElement servicelevelagreement;
	
	@FindBy(xpath="//a[contains(text(),'Ericsson Wireless Office Privacy Policy')]")
	public static WebElement privacypolicy;
	
	@FindBy(xpath="//span[@data-key='Read']")
	public static WebElement readnetwork;
	
	@FindBy(css="g.bottom.axis > text")
	public static WebElement legend;
	
	@FindBy(xpath="//div[contains(text(),'Log In')]")
	public static WebElement Loginlabel;
	
	@FindBy(xpath="//div[contains(text(),' Need help? ')]")
	public static WebElement Needhelplabel;
	
	@FindBy(xpath="//label[@for='inlineCssRadio1']")
	public static WebElement phonenumberlabel;
	
	@FindBy(xpath="//label[@for='inlineCssRadio2']")
	public static WebElement emaillabel;
	
	@FindBy(xpath="(//small[@class='form-error-msg'])[1]")
	public static WebElement emailvalidation;
	
	@FindBy(xpath="(//small[@class='form-error-msg'])[2]")
	public static WebElement phonevalidation;
	
	@FindBy(xpath="//small[contains(text(),' OTP is required ')]")
	public static WebElement codeisrequiredvalidation;
	
	@FindBy(xpath="//span[@class='lmf']")
	public static WebElement yopmailemailtab;
	
	@FindBy(xpath="(//input[@type='checkbox'])[2]")
	public static WebElement mailselectcheck;
	
	@FindBy(xpath="//div[contains(text(),'Invalid Credentials! Login attempts remaining: 4')]")
	public static WebElement attempsfail;
}
