package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PA_SupportPage {

	@FindBy(xpath = "(//a[@href='/portal-pages/support'])")
	public static WebElement clickSupportMenu;
	
	@FindBy(xpath="(//div[@class='card custom-card'])[1]")
	public static WebElement ticketID;

	@FindBy(xpath = "//input[@placeholder='Search']")
	public static WebElement inputSearchbar;
	
	@FindBy(xpath="//i[@class='icon icon-view-list']")
	public static WebElement listView;
	

}
