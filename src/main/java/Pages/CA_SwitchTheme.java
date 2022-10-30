package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CA_SwitchTheme {
	
	@FindBy(xpath = "(//label[@class='switch'])//i[1]")
    public static WebElement switchthemetoogleball;
	
	@FindBy(xpath = "//div[@class='dark dark-mode']")
    public static WebElement darkmode;
	
	@FindBy(xpath = "//div[@class='light light-mode']")
    public static WebElement lightmode;
	
	@FindBy(xpath = "//div[@class='light light-mode']")
    public static WebElement defaulttheme;

}
