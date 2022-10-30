package Resource;

import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * JavaScript Executor for Interaction with DOM Elements.
 * 
 */
public class JavaScriptExecute extends BaseClass {
	public static Logger log = LoggerHelper.getLogger(UtilityClass.class);
	public static String dateToSelect;
	Actions act = new Actions(driver);
	public static WebDriverWait wait = new WebDriverWait(driver, 10);
	public static String screenshotName;

	JavascriptExecutor js;

	/**
	 * Parameterize constructor
	 * 
	 * @param driver {@link ChromeDriver}
	 */
	public JavaScriptExecute(WebDriver driver) {
		js = (JavascriptExecutor) driver;
	}

	/**
	 * Click on WebElement
	 * 
	 * @param ele {@link WebElement}
	 */
	public void click(WebElement ele) {

		js.executeScript("arguments[0].click()", ele);

	}

	/**
	 * Send the value for text
	 * 
	 * @param str {@link String}
	 * @param ele {@link WebElement}
	 */
	public void sendKeys(String str, WebElement ele) {

		// js.executeScript("arguments[0].value=.click()", ele);
		js.executeScript("arguments[0].value='" + str + "';", ele);
	}

	public void scrollTilElement(WebElement target) {
		js.executeScript("arguments[0].scrollIntoView();", target);
	}
	public static void waitForElement(WebElement ele) {
		try {
			log.info("*********=-----Letting element load successfully-----*********");
			Thread.sleep(1000);
			wait.until(ExpectedConditions.visibilityOf(ele));
			log.info("wait for element ele value" + ele);
		} catch (Exception e) {
			e.printStackTrace();
			log.info(e.getMessage());
			System.out.println("Element doesn't exist verify it...!!!");
		}
	}
}
