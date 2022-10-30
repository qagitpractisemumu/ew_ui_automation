
package Resource;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.io.IOException;
import java.util.Properties;

public class BaseClass {

	public static WebDriver driver;
	public static Properties prop;
    
	public WebDriver initializeDriver() throws IOException, IOException {

		/* used only for Gitlab ci/cd to initaite driver */
//		WebDriverManager.firefoxdriver().setup();
//        FirefoxOptions options=new FirefoxOptions();
//        options.setHeadless(true);
//        options.addArguments("window-size=1920,1200");
//        driver=new FirefoxDriver(options);

		/* Gitlab CI/CD for chrome driver*/
		 WebDriverManager.chromedriver().setup();
         ChromeOptions options=new ChromeOptions();
         options.setHeadless(true);
         driver=new ChromeDriver(options);

		/*Gitlab ci/cd code ends */

		/*Local Dev code starts to initiate driver*/
	// 	prop = new Properties();
	// 	FileInputStream fis = new FileInputStream(".\\src\\main\\java\\resource\\data.properties");
	// //	FileInputStream fis = new FileInputStream("data.properties");
	// 	prop.load(fis);
	// 	String browserName = prop.getProperty("browser");
	// 	String driverPath=prop.getProperty(browserName);
	// 	Boolean IsHeadlessMode= Boolean.valueOf(prop.getProperty("headless"));
	// 	System.setProperty("java.awt.headless", IsHeadlessMode.toString());
						
	// 	System.out.println(browserName);
		
	// 	if (browserName.equals("chrome")) {
			
	// 		// mention the below chrome option to solve timeout exception issue
	// 		ChromeOptions options = new ChromeOptions().setHeadless(IsHeadlessMode);
	// 		options.setPageLoadStrategy(PageLoadStrategy.NONE);
	// 		options.addArguments("--disable-infobars"); // disabling infobars
	// 		options.addArguments("--disable-extensions"); // disabling extensions
	// 		options.addArguments("--disable-dev-shm-usage"); // overcome limited resource problems
	// 		options.addArguments("--no-sandbox"); // Bypass OS security model
	// 		options.addArguments("--disable-gpu");
	// 		options.addArguments("--remote-debugging-port=9222");
	// 		System.setProperty("webdriver.chrome.driver", driverPath);
	// 		driver=new ChromeDriver(options);
			
	// 	}
	// 	else if (browserName.equals("firefox")) {
	// 		FirefoxBinary firefoxBinary = new FirefoxBinary();
	// 		if(IsHeadlessMode) {
	// 			firefoxBinary.addCommandLineOptions("--headless");
	// 		}
	// 		firefoxBinary.addCommandLineOptions("--no-sandbox");
	// 		System.setProperty("webdriver.gecko.driver", driverPath);
	// 		FirefoxOptions firefoxOptions = new FirefoxOptions();
	// 		firefoxOptions.setBinary(firefoxBinary);
    //  		driver = new FirefoxDriver(firefoxOptions);
    //  		driver = new FirefoxDriver();
	// 	}
	// 	driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
	// 	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 	driver.manage().window().maximize();
	// 	driver.manage().deleteAllCookies();

		return driver;
	}
}

