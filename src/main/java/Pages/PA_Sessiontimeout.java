package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PA_Sessiontimeout {

	@FindBy(xpath = "//button[@class='swal2-confirm swal2-styled']")
	public WebElement stayloggedin;
	
	@FindBy(xpath = "//span[contains(text(),'sp-ericsson')]")
	public static WebElement usrname;

	@FindBy(xpath = "//button[@class='btn big']")
	public static WebElement signout;

	@FindBy(xpath = "//button[@class='swal2-cancel swal2-styled']")
	public WebElement logoutnowbtn;

}
