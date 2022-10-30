package PagePanel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import Pages.PA_Login;
import Pages.PA_Sessiontimeout;
import Resource.BaseClass;
import Resource.UtilityClass;

public class PA_SessiontimeoutPanel extends BaseClass {

	public PA_SessiontimeoutPanel() {

		timeoutPA = PageFactory.initElements(driver, PA_Sessiontimeout.class);
	}

	PA_Sessiontimeout timeoutPA = new PA_Sessiontimeout();
	UtilityClass utilityclass = new UtilityClass();

	PA_LoginPanel login = new PA_LoginPanel();

// By default, fluent wait has predefined deprecated methods

	public void stay_Loggedin() {
		Wait<WebDriver> wait = new FluentWait<>(driver)
				.withTimeout(15, TimeUnit.MINUTES)
				.pollingEvery(5, TimeUnit.SECONDS)
				.ignoring(Throwable.class);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Stay Logged In')]")))
				.click();
		System.out.println("StayloggedIn Successfully");

	}

	public void signout() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		UtilityClass.waitForElement(PA_Login.usrname);
		PA_Login.usrname.click();
		UtilityClass.waitForElement(PA_Login.signout);
		PA_Login.signout.click();

	}

	public void logout_Nowbutton() {
		Wait<WebDriver> wait = new FluentWait<>(driver)
				.withTimeout(15, TimeUnit.MINUTES)
				.pollingEvery(5, TimeUnit.SECONDS)
				.ignoring(Throwable.class);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Log Out Now')]")))
				.click();
		System.out.println("Logged out Successfully");
	}

}
