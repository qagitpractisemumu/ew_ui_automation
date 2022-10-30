package Resource;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.lang.reflect.Field;

import Pages.Profile;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import PagePanel.PA_LoginPanel;
import Pages.PA_TrainingPage;
import Pages.PA_customer;

public class RobotUtil extends BaseClass {

    public static Properties config = new Properties();
    public static FileInputStream fis;
    PA_LoginPanel loginpage = new PA_LoginPanel();

    public static void typeKeys(String str, Robot r) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ':') {
                typeCharacter(r, "SEMICOLON", true);
            } else if (str.charAt(i) == '\\') {
                typeCharacter(r, "BACK_SLASH", false);
                // KeyEvent.VK_BACK_SLASH
            } else if (str.charAt(i) == '.') {
                typeCharacter(r, "PERIOD", false);
                // KeyEvent.VK_PERIOD
            } else {
                char ch = str.charAt(i);
                if (Character.isUpperCase(ch)) {
                    typeCharacter(r, "" + ch, true);
                } else {
                    typeCharacter(r, "" + ch, false);
                }

            }

        }
        r.keyPress(KeyEvent.VK_ENTER);
    }

    public static void typeCharacter(Robot robot, String letter, boolean needShift) {
        try {

            String variableName = "VK_" + letter.toUpperCase();
            Class clazz = KeyEvent.class;
            Field field = clazz.getField(variableName);
            int keyCode = field.getInt(null);

            robot.delay(1000);

            if (needShift)
                robot.keyPress(KeyEvent.VK_SHIFT);

            robot.keyPress(keyCode);
            robot.keyRelease(keyCode);

            if (needShift)
                robot.keyRelease(KeyEvent.VK_SHIFT);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void Upload_applicationlogo() throws Exception {
        WebElement element1 = driver.findElement(By.xpath("(//input[@accept='image/*'])[2]"));
        JavascriptExecutor excecutor1 = (JavascriptExecutor) driver;
        excecutor1.executeScript("arguments[0].click();", element1);
        Thread.sleep(2000);
        String currentdir = new File("").getAbsolutePath();
        System.out.println("current path is" + currentdir);
        String imagepath = "\\files\\FlexLogger.jpg";
        System.out.println("imagepath is" + imagepath);
        String path = currentdir + imagepath;
        StringSelection str = new StringSelection(path);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
        Robot robot = new Robot();
        robot.delay(3000);

        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);

        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_V);

        robot.setAutoDelay(3000);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

    }

    public void Upload_updateapplicationlogo() throws Exception {
        WebElement element2 = driver.findElement(By.xpath("(//input[@accept='image/*'])[2]"));
        JavascriptExecutor excecutor2 = (JavascriptExecutor) driver;
        excecutor2.executeScript("arguments[0].click();", element2);
        Robot robot = new Robot();
        Thread.sleep(2000);
        String currentdir = new File("").getAbsolutePath();
        System.out.println("current path is" + currentdir);
        String imagepath = "\\files\\dummy app.jpg";
        System.out.println("imagepath is" + imagepath);
        String path = currentdir + imagepath;
        StringSelection str = new StringSelection(path);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
        robot.delay(3000);

        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);

        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_V);

        robot.setAutoDelay(3000);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
    }


    public void Upload_Businesslogo() throws Exception {
        Robot robot = new Robot();
        Thread.sleep(2000);
        String currentdir = new File("").getAbsolutePath();
        System.out.println("current path is" + currentdir);
        String imagepath = "\\files\\laptop.jpeg";
        System.out.println("imagepath is" + imagepath);
        String path = currentdir + imagepath;
        StringSelection str = new StringSelection(path);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
        robot.delay(3000);

        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);

        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_V);

        robot.setAutoDelay(3000);

        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        try {
            String errmsg = driver.findElement(By.xpath("//*[contains(text(),'Image size cannot exceed 2MB!')]"))
                    .getText();
            if (errmsg.equalsIgnoreCase("Image size cannot exceed 2MB!")) {
            }
            System.out.println(errmsg);
            Assert.assertEquals(false, true);
        } catch (Exception e) {
            System.out.println("Business Logo validation is successfull");
        }

    }


    public void uploadInvalidImageFormat() throws Exception {
        Robot robot = new Robot();
        Thread.sleep(2000);
        String currentdir = new File("").getAbsolutePath();
        System.out.println("current path is" + currentdir);
        String videopath = "\\files\\video_webm.webm";
        System.out.println("videopath is" + videopath);
        String path = currentdir + videopath;
        StringSelection str = new StringSelection(path);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
        robot.delay(3000);

        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);

        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_V);

        robot.setAutoDelay(3000);

        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        try {
            String errmsg = driver.findElement(By.xpath("//div[@id='swal2-content']")).getText();
            if (errmsg.equalsIgnoreCase(" Image size cannot exceed 2MB! ")) {
            }
            System.out.println(errmsg);
            UtilityClass.waitForElement(PA_customer.okbtn);
            PA_customer.okbtn.click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }


    public void upload_TrainingVideo(String uploadvideo) throws Exception {
        Robot robot = new Robot();
        WebElement ele = PA_TrainingPage.trainingvideouploadicon;
        JavascriptExecutor e = (JavascriptExecutor) driver;
        e.executeScript("arguments[0].click();", ele);
        Thread.sleep(2000);
        String currentdir = new File("").getAbsolutePath();
        System.out.println("current path is" + currentdir);
        String videopath = "\\files\\video.mp4";
        System.out.println("videopath is" + videopath);
        String path = currentdir + videopath;
        StringSelection str = new StringSelection(path);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
        robot.delay(3000);

        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);

        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_V);

        robot.setAutoDelay(3000);

        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

    }


    public void Upload_Businesslogo_png() throws Exception {
        Robot robot = new Robot();
        Thread.sleep(2000);
        String currentdir = new File("").getAbsolutePath();
        System.out.println("current path is" + currentdir);
        String imagepath = "\\files\\Matlab_Logo.png";
        System.out.println("imagepath is" + imagepath);
        String path = currentdir + imagepath;
        StringSelection str = new StringSelection(path);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
        robot.delay(3000);

        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);

        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_V);

        robot.setAutoDelay(3000);

        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        try {
            String errmsg = driver.findElement(By.xpath("//div[@id='swal2-content']")).getText();
            if (errmsg.equalsIgnoreCase(" Image size cannot exceed 2MB! ")) {
            }
            System.out.println(errmsg);
            UtilityClass.waitForElement(PA_customer.okbtn);
            PA_customer.okbtn.click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


    public void Upload_Businesslogo_gif() throws Exception {
        Robot robot = new Robot();
        Thread.sleep(2000);
        String currentdir = new File("").getAbsolutePath();
        System.out.println("current path is" + currentdir);
        String imagepath = "\\files\\gid.gif";
        System.out.println("imagepath is" + imagepath);
        String path = currentdir + imagepath;
        StringSelection str = new StringSelection(path);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
        robot.delay(3000);

        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);

        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_V);

        robot.setAutoDelay(3000);

        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        try {
            String errmsg = driver.findElement(By.xpath("//div[@id='swal2-content']")).getText();
            if (errmsg.equalsIgnoreCase(" Image size cannot exceed 2MB! ")) {
            }
            System.out.println(errmsg);
            UtilityClass.waitForElement(PA_customer.okbtn);
            PA_customer.okbtn.click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


    public void Upload_Businesslogo_jpeg() throws Exception {
        Robot robot = new Robot();
        Thread.sleep(2000);
        String currentdir = new File("").getAbsolutePath();
        System.out.println("current path is" + currentdir);
        String imagepath = "\\files\\flower.jpeg";
        System.out.println("imagepath is" + imagepath);
        String path = currentdir + imagepath;
        StringSelection str = new StringSelection(path);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
        robot.delay(3000);

        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);

        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_V);

        robot.setAutoDelay(3000);

        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        try {
            String errmsg = driver.findElement(By.xpath("//div[@id='swal2-content']")).getText();
            if (errmsg.equalsIgnoreCase(" Image size cannot exceed 2MB! ")) {
            }
            System.out.println(errmsg);
            UtilityClass.waitForElement(PA_customer.okbtn);
            PA_customer.okbtn.click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


    public void upload_Documentation() throws Exception {
        Robot robot = new Robot();
        UtilityClass.waitForElement(PA_TrainingPage.uploadicon);
        PA_TrainingPage.uploadicon.click();
        Thread.sleep(2000);
        String currentdir = new File("").getAbsolutePath();
        System.out.println("current path is" + currentdir);
        String docpath = "\\files\\Documentation.txt";
        System.out.println("Documentpath is" + docpath);
        String path = currentdir + docpath;
        StringSelection str = new StringSelection(path);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
        robot.delay(3000);

        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);

        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_V);

        robot.setAutoDelay(3000);

        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
    }
    
    public void upload_htmlDocumentation() throws Exception {
        Robot robot = new Robot();
        UtilityClass.waitForElement(PA_TrainingPage.uploadicon);
        PA_TrainingPage.uploadicon.click();
        Thread.sleep(2000);
        String currentdir = new File("").getAbsolutePath();
        System.out.println("current path is" + currentdir);
        String docpath = "\\files\\samplehtml.html";
        System.out.println("Documentpath is" + docpath);
        String path = currentdir + docpath;
        StringSelection str = new StringSelection(path);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
        robot.delay(3000);

        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);

        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_V);

        robot.setAutoDelay(3000);

        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
    }

    public void upload_Image_InTrainingImage() throws Exception {
        Robot robot = new Robot();
        UtilityClass.waitForElement(PA_TrainingPage.uploadiconintrainingimage);
        PA_TrainingPage.uploadiconintrainingimage.click();
        Thread.sleep(2000);
        String currentdir = new File("").getAbsolutePath();
        System.out.println("current path is" + currentdir);
        String imagepath = "\\files\\flower.jpg";
        System.out.println("imagepath is" + imagepath);
        String path = currentdir + imagepath;
        StringSelection str = new StringSelection(path);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
        robot.delay(3000);

        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);

        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_V);

        robot.setAutoDelay(3000);

        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
    }


    public void update_TrainingImage(String TrainingImage) throws AWTException, InterruptedException {
        Robot robot = new Robot();
        UtilityClass.waitForElement(PA_TrainingPage.uploadiconintrainingimage);
        PA_TrainingPage.uploadiconintrainingimage.click();
        Thread.sleep(2000);
        String currentdir = new File("").getAbsolutePath();
        System.out.println("current path is" + currentdir);
        String imagepath = "\\files\\fruits.png";
        System.out.println("imagepath is" + imagepath);
        String path = currentdir + imagepath;
        StringSelection str = new StringSelection(path);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
        robot.delay(3000);

        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);

        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_V);

        robot.setAutoDelay(3000);

        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
    }


    public void update_TrainingVideo(String uploadvideo) throws Exception {
        Robot robot = new Robot();
        WebElement ele = PA_TrainingPage.trainingvideouploadicon;
        JavascriptExecutor e = (JavascriptExecutor) driver;
        e.executeScript("arguments[0].click();", ele);
        Thread.sleep(2000);
        String currentdir = new File("").getAbsolutePath();
        System.out.println("current path is" + currentdir);
        String videopath = "\\files\\videoplayback.mp4";
        System.out.println("videopath is" + videopath);
        String path = currentdir + videopath;
        StringSelection str = new StringSelection(path);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
        robot.delay(3000);

        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);

        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_V);

        robot.setAutoDelay(3000);

        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

    }


    public void upload_TrainingVideo_incorrectformat(String uploadvideo) throws Exception {
        Robot robot = new Robot();
        driver.findElement(By.xpath("(//i[@class='icon icon-upload'])")).click();
        Thread.sleep(2000);
        String currentdir = new File("").getAbsolutePath();
        System.out.println("current path is" + currentdir);
        String videopath = "\\files\\video_mov.mov";
        System.out.println("videopath is" + videopath);
        String path = currentdir + videopath;
        StringSelection str = new StringSelection(path);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
        robot.delay(3000);

        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);

        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_V);

        robot.setAutoDelay(3000);

        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

    }


    public void upload_TrainingImage_incorrectformat(String uploads) throws Exception {
        Robot robot = new Robot();
        WebElement ele = PA_TrainingPage.uploadiconintrainingimage;
        JavascriptExecutor e = (JavascriptExecutor) driver;
        e.executeScript("arguments[0].click();", ele);
        Thread.sleep(2000);
        String currentdir = new File("").getAbsolutePath();
        System.out.println("current path is" + currentdir);
        String Imagepath = "\\files\\gid.gif";
        System.out.println("imagepath is" + Imagepath);
        String path = currentdir + Imagepath;
        StringSelection str = new StringSelection(path);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
        robot.delay(3000);

        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);

        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_V);

        robot.setAutoDelay(3000);

        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
    }

    public static void upload_Profile_Picture() throws Exception {
        Robot robot = new Robot();
        UtilityClass.waitForElement(Profile.uploadProfilePicIcon);
        Profile.uploadProfilePicIcon.click();
        Thread.sleep(2000);
        String currentdir = new File("").getAbsolutePath();
        System.out.println("current path is" + currentdir);
        String imagepath = "\\files\\flower.jpeg";
        System.out.println("image path is" + imagepath);
        String path = currentdir + imagepath;
        StringSelection str = new StringSelection(path);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
        robot.delay(3000);

        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);

        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_V);

        robot.setAutoDelay(3000);

        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

    }
    
    
    public static void upload_OriginalProfilePicture() throws Exception {
        Robot robot = new Robot();
        UtilityClass.waitForElement(Profile.editProfilePicturePointer);
        Profile.editProfilePicturePointer.click();
        Thread.sleep(2000);
        String currentdir = new File("").getAbsolutePath();
        System.out.println("current path is" + currentdir);
        String imagepath = "\\files\\laptop.jpeg";
        System.out.println("image path is" + imagepath);
        String path = currentdir + imagepath;
        StringSelection str = new StringSelection(path);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
        robot.delay(3000);

        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);

        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_V);

        robot.setAutoDelay(3000);

        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(2000);

    }

    public static void upload_Business_Logo() throws Exception {
        Robot robot = new Robot();
        UtilityClass.waitForElement(Profile.uploadBusinessLogoIcon);
        Profile.uploadBusinessLogoIcon.click();
        Thread.sleep(2000);
        String currentdir = new File("").getAbsolutePath();
        System.out.println("current path is" + currentdir);
        String imagepath = "\\files\\laptop.jpeg";
        System.out.println("image path is" + imagepath);
        String path = currentdir + imagepath;
        StringSelection str = new StringSelection(path);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
        robot.delay(3000);

        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);

        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_V);

        robot.setAutoDelay(3000);

        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
    }
    
    public void upload_DocumentationPDF() throws Exception {
        Robot robot = new Robot();
        UtilityClass.waitForElement(PA_TrainingPage.uploadicon);
        PA_TrainingPage.uploadicon.click();
        Thread.sleep(2000);
        String currentdir = new File("").getAbsolutePath();
        System.out.println("current path is" + currentdir);
        String docpath1 = "\\files\\Sample_EWO.pdf";
        System.out.println("Documentpath is" + docpath1);
        String path1 = currentdir + docpath1;
        StringSelection str = new StringSelection(path1);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
        robot.delay(3000);

        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);

        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_V);

        robot.setAutoDelay(3000);

        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
    }

}
