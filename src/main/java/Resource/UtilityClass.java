package Resource;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class UtilityClass extends BaseClass {

    public static Logger log = LoggerHelper.getLogger(UtilityClass.class);
    Actions act = new Actions(driver);
    public static WebDriverWait wait = new WebDriverWait(driver, 20);
    static JavascriptExecutor js = (JavascriptExecutor) driver;

//***************************************************************************************
//								Wait for Element Code
//***************************************************************************************

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

    public static String getFilePath(String fileTag) throws IOException {
        FileInputStream fis = new FileInputStream(".\\src\\main\\java\\resource\\data.properties");
        prop.load(fis);
        String f = prop.getProperty(fileTag);
        System.out.println("##################################################");
        log.info("Full data property file name details: " + f);

        String currentDirectory = System.getProperty("user.dir");
        String pathNew = currentDirectory + File.separator + f;
        log.info("Real filepath will be : -------------->" + pathNew);
        System.out.println("##################################################");
        return pathNew;
    }

    public static String getUrl() throws IOException {
        FileInputStream fis = new FileInputStream(".\\src\\main\\java\\Resource\\data.properties");
        Properties prop = new Properties();
        prop.load(fis);
        String url = prop.getProperty("url");
        log.info("URL is : " + url);
        return url;
    }

    public static String getMasterviewUrl() throws IOException {
        FileInputStream fis = new FileInputStream(".\\src\\main\\java\\Resource\\data.properties");
        Properties prop = new Properties();
        prop.load(fis);
        String url = prop.getProperty("masterviewUrl");
        log.info("URL is : " + url);
        return url;
    }

    public static void theFileUpload(String path) throws Throwable {

        StringSelection strSelection = new StringSelection(path);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(strSelection, null);

        Robot robot = new Robot();

        robot.delay(300);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.delay(200);
        robot.keyRelease(KeyEvent.VK_ENTER);
    }

    public static void dropDownHandle(WebElement ele, String str) {
        //int ddSize = ele.size();
        Select s = new Select(ele);
        s.selectByVisibleText(str);
    }

    public static void editValues(String element) throws Throwable {
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_A);
        robot.keyRelease(KeyEvent.VK_A);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_DELETE);
        robot.keyRelease(KeyEvent.VK_DELETE);

    }

    public static void clickTab() throws AWTException {
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
        robot.keyPress(KeyEvent.VK_DELETE);
        robot.keyRelease(KeyEvent.VK_DELETE);
    }

    public static void dropDownHandleCheck(WebElement ele, String str) {
        //int ddSize = ele.size();

        try {
            Select s = new Select(ele);
            s.selectByVisibleText(str);
            System.out.println("Newly added location is present :" + str);
        } catch (NoSuchElementException exception) {
            System.out.println("There is no location");


        }
    }

    public static String readEmailId() throws Throwable {

        File myObj = new File("dummyEmail.txt");
        Scanner sc = new Scanner(myObj);
        String data = sc.nextLine();
        System.out.println(data);
        return data;
    }

//***************************************************************************************
//		read create email id
//***************************************************************************************

    public static void createFile() {
        try {
            File myObj = new File("dummyEmail.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
                writeFile();
            } else {
                System.out.println("File already exists.");
                writeFile();
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

//***************************************************************************************
//		write Generic email id
//***************************************************************************************

    public static void writeFile() {
        try {
            FileWriter myWriter = new FileWriter("dummyEmail.txt");
            // String userName = "Hello";
            Random randomGenerator = new Random();
            int randomInt = randomGenerator.nextInt(1000000);
            String emailValue = "Automation_ind" + randomInt + "@mailsac.com";
            myWriter.write(emailValue);
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static void waitFluentWait(WebElement element) {
        @SuppressWarnings("deprecation")
        FluentWait<WebDriver> fluentwait = new FluentWait<>(driver).withTimeout(100, TimeUnit.SECONDS).pollingEvery(20, TimeUnit.SECONDS).ignoring(Throwable.class);
        fluentwait.until(ExpectedConditions.visibilityOf(element));
    }

    public static void validateMsg(String actualmsg, String expectedmsg) {
        Assert.assertEquals(actualmsg, expectedmsg);
        //System.out.println("Location already exist,try different one");
    }

    public static void warningMsg(String actualmsg, String expectedmsg) {
        Assert.assertEquals(actualmsg, expectedmsg);
        System.out.println("Headquarters can not be deleted");

    }

    public static void fetchValueFromTable(WebElement element) {
        List<WebElement> list = element.findElements(By.tagName("tr"));
        for (int i = 0; i < list.size(); i++) {
            WebElement eachrow = list.get(i);
            List<WebElement> listdata = eachrow.findElements(By.tagName("td"));
            for (int j = 0; j < listdata.size(); j++) {
                WebElement eachdata = listdata.get(j);
                String name = eachdata.getText();
                if (name.contains("0")) {
                    System.out.println("the default value for cost is shown which is 0");
                } else {
                    System.out.println("the default value is not present");
                }

            }

        }
    }

    public static void selectClass(String countryLocation, WebElement element) {
        Select select = new Select(element);
        select.selectByVisibleText(countryLocation);

    }

    public static void checkLocalDrive(WebElement element) {
        boolean b = element.isDisplayed();
        if (b == true) {
            System.out.println("users is created without local drive,because the none message showing when clicking local drive menu");
        } else {
            System.out.println("users is created with local drive");

        }
    }

    public static void checkingSelectingAndEnabling() {
        WebElement element = driver.findElement(By.xpath("(//input[@type='checkbox']/following::label)[1]"));
        boolean b = element.isSelected();
        if (b == true) {
            System.out.println("the checkbox is clicked while entering register page");
        } else {
            System.out.println("The checkbox is not selected while Entering Register page which is Expected result");
        }
        WebElement element1 = driver.findElement(By.xpath("//button[@type='submit']"));
        boolean b1 = element1.isSelected();
        if (b1 == true) {
            System.out.println("signup button is in selectable position,as we didnot enter any credentials");
        } else {
            System.out.println("Signup button is in unselectable stage as we didnot enter any credentials which is expected");
        }

    }

}
