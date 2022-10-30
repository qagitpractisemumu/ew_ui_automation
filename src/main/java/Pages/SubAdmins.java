package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SubAdmins {

    @FindBy(xpath = "//span[normalize-space()='Sub Admins']")
    public static WebElement subAdminMenu;

    @FindBy(xpath = "//*[@id='add-CA-user-dialog']/div/form/div[2]/div[1]/div/div[1]/input")
    public static WebElement inputFirstName;

    @FindBy(xpath = "(//label[@for='first-name']/following-sibling::input)[1]")
    public static WebElement subAdminFirstName;

    @FindBy(xpath = "//*[@id='add-CA-user-dialog']/div/form/div[2]/div[1]/div/div[2]/input")
    public static WebElement inputLastName;

    @FindBy(xpath = "(//label[@for='last-name']/following-sibling::input)[1]")
    public static WebElement subAdminLastName;

    @FindBy(xpath = "//*[@id='add-CA-user-dialog']/div/form/div[2]/div[2]/div/div[1]/input")
    public static WebElement inputEmail;

    @FindBy(xpath = "(//label[@for='email']/following-sibling::input)[1]")
    public static WebElement subAdminEmail;

    @FindBy(xpath = "//*[@id='add-CA-user-dialog']/div/form/div[2]/div[2]/div/div[2]/div/input")
    public static WebElement inputPhone;

    @FindBy(xpath = "(//div[@class='input-group-prepend']//input)[1]")
    public static WebElement subAdminPhone;

    @FindBy(xpath = "//*[@id='add-CA-user-dialog']/div/form/div[2]/div[1]/div/div[3]/div/label/i")
    public static WebElement readOrWriteBtn;

    @FindBy(xpath = "//div[@id='add-CA-user-dialog']//form//div//button[contains(.,'Submit')]")
    public static WebElement submitBtn;

    @FindBy(xpath = "//i[@class='icon icon-edit']")
    public static WebElement editBtn;

    @FindBy(xpath = "//div[@id='add-CA-user-dialog']//form//div//button[contains(.,'Submit')]")
    public static WebElement createAdminSubmitBtn;

    @FindBy(xpath = "//input[@placeholder='Search']")
    public static WebElement subAdminSearchBox;

    @FindBy(xpath = "//i[@class='icon icon-search']")
    public static WebElement subAdminSearchBtn;

    @FindBy(xpath = "//div[@class='card-title']")
    public static WebElement selectingParticularSubAdmin;

    @FindBy(xpath = "//i[@class='icon icon-trashcan']")
    public static WebElement adminDeleteBtn;

    @FindBy(xpath = "//button[contains(text(),'Confirm')]")
    public static WebElement adminDeleteConfirmBtn;

    @FindBy(xpath = "//small[@class='form-error-msg']")
    public static WebElement subadminWarningMsg;

    @FindBy(xpath = "//div[@class='col-md-12']")
    public static WebElement selectAllSoftwares;

    @FindBy(xpath = "//i[@class='icon icon-view-list'][1]")
    public static WebElement appsInListView;

    @FindBy(xpath = "//label[@for='cssCheckbox5db1b7f7a402105459739b4f']")
    public static WebElement quickBooksAdvancedMenu;

    @FindBy(xpath = "//label[@for='cssCheckbox5db1b6aea402105459739b4d']")
    public static WebElement quickBooksEssentialMenu;

    @FindBy(xpath = "//label[@for='cssCheckbox5db3886fa402105459739b7f']")
    public static WebElement autoCadMenu;

    @FindBy(xpath = "//label[@for='cssCheckbox5db38900a402105459739b81']")
    public static WebElement autoCadLTMenu;

    @FindBy(xpath = "//label[@for='cssCheckbox5db42d4483213613dcf48639']")
    public static WebElement adobeIllustratorMenu;

    @FindBy(xpath = "//label[@for='cssCheckbox5db4393983213613dcf48643']")
    public static WebElement adobePhotoshopMenu;

    @FindBy(xpath = "//label[@for='cssCheckbox5da9001e25a8b752e170fee8']")
    public static WebElement eclipseMenu;

    @FindBy(xpath = "//label[@for='cssCheckbox5e8f69ad516ecd0a0e83316b']")
    public static WebElement zipMenu;

    @FindBy(xpath = "//label[@for='cssCheckbox5db4258d83213613dcf48628']")
    public static WebElement adobeReaderMenu;

    @FindBy(xpath = "//label[@for='cssCheckbox5da9004025a8b752e170fee9']")
    public static WebElement chromeBrowserMenu;

    @FindBy(xpath = "//label[@for='cssCheckbox5db4403083213613dcf48651']")
    public static WebElement firefoxBrowserMenu;

    @FindBy(xpath = "//label[@for='cssCheckbox5db4703783213613dcf48666']")
    public static WebElement microsoftE3Menu;

    @FindBy(xpath = "//label[@for='cssCheckbox5db470a583213613dcf48668']")
    public static WebElement microsoftE5Menu;

    @FindBy(xpath = "//div[@id='add-CA-user-dialog']//form//div//button[contains(.,'Submit')]")
    public static WebElement subAdminConfirmBtnJsExecutor;

}
