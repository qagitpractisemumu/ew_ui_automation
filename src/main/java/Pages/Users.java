package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Users {

    @FindBy(xpath = "//*[@id='app']/div/div[1]/div/ul/li[6]/a/span")
    public static WebElement usersMenu;

    @FindBy(xpath = "//input[@id='first-name']")
    public static WebElement firstName;


    @FindBy(xpath = "//input[@id='last-name']")
    public static WebElement lastName;

    @FindBy(xpath = "//input[@id='email']")
    public static WebElement email;

    @FindBy(xpath = "//input[@id='username']")
    public static WebElement userName;

    @FindBy(xpath = "//input[@id='phone-number']")
    public static WebElement phone;

    @FindBy(xpath = "//label[normalize-space()='Username']//following-sibling::div/input")
    public static WebElement userName1;


    @FindBy(xpath = "//label[normalize-space()='Location:']//following-sibling::div/select")
    public static WebElement loaction;

    @FindBy(xpath = "//button[normalize-space()='Select Country']")
    public static WebElement locationnew;

    @FindBy(xpath = "//label[normalize-space()='Group:']//following-sibling::div/select")
    public static WebElement group;

    @FindBy(xpath = "//button[normalize-space()='Next']")
    public static WebElement nextBtn;

    @FindBy(xpath = "(//button[text()=' Next '])[1]")
    public static WebElement nextBtn1;

    @FindBy(xpath = "//button[normalize-space()='Cancel']")
    public static WebElement cancelBtn;


    @FindBy(xpath = "//button[normalize-space()='Create']")
    public static WebElement CreateBtn;

    @FindBy(xpath = "//div[contains(text(),'The total cost of the user is')]")
    public static WebElement userCost;

    @FindBy(xpath = "//h2[normalize-space()='Success']")
    public static WebElement successMsg;

    @FindBy(xpath = "//button[normalize-space()='OK']")
    public static WebElement okBtn;

    @FindBy(xpath = "//span[normalize-space()='Shared Drive']")
    public static WebElement sharedDrivetab;
    //span[@class='d-sm-block d-none'][normalize-space()='Local Drive']
    @FindBy(xpath = "//span[normalize-space()='Local Drive']")
    public static WebElement localDrivetab;

    @FindBy(xpath = "//i[@class='icon icon-trashcan']")
    public static WebElement deleteUserBtn;

    @FindBy(xpath = "//i[@class='icon icon-trashcan']")
    public static WebElement Firstnamecred;

    @FindBy(xpath = "//input[@placeholder='First Name']")
    public static WebElement firstName1;

    @FindBy(xpath = "//input[@class='form-control ng-pristine ng-invalid ng-touched']")
    public static WebElement firstNme;


    @FindBy(xpath = "//div[@class='cdk-global-overlay-wrapper']//div[2]//div[1]//input[1]")
    public static WebElement lastname1;

    @FindBy(xpath = "//input[@placeholder='Search']")
    public static WebElement search1;

    @FindBy(xpath = "//i[@class='icon icon-edit']")
    public static WebElement Edit;

    //
//	@FindBy(xpath = "//span[@class='d-sm-block d-none ng-star-inserted'][normalize-space()='Local Drive']")
//	public static WebElement localDrivetab;
//
//	@FindBy(xpath = "//i[@class='icon icon-trashcan']")
//	public static WebElement deleteUserBtn;
//	
    @FindBy(xpath = "//div[@class='position-absolute new-btn button-new ng-star-inserted']")
    public static WebElement newBtn;

    @FindBy(xpath = "//div[@class='col-md-6']")
    public static WebElement locSelect;

    @FindBy(xpath = "//a[@id='ngb-tab-6']")
    public static WebElement localDrive;

    @FindBy(xpath = "//label[@class='m-0 d-flex align-items-left']")
    public static WebElement noneCheckLocalDrive;

    //	@FindBy(xpath="//a[@href='/user']")
    @FindBy(xpath = "//i[@class='icon icon-avatar'][1]")
    public static WebElement userClick;

    @FindBy(xpath = "//div[@id='swal2-content']")
    public static WebElement costPopup;

    @FindBy(xpath = "//button[@class='swal2-cancel swal2-styled']")
    public static WebElement costPopupCancel;

    @FindBy(xpath = "//button[contains(text(),'Add new user')]")
    public static WebElement creditNewBtn;

    @FindBy(xpath = "//button[@class='btn ghost']")
    public static WebElement creditNewCancelBtn;

    @FindBy(xpath = "//input[@placeholder='Search']")
    public static WebElement userSearchBox;

    @FindBy(xpath = "//i[@class='icon icon-search']")
    public static WebElement userSearchButton;

    @FindBy(xpath = "//div[@class='card-title']")
    public static WebElement particularUserSelect;

    @FindBy(xpath = "//i[@class='icon icon-edit']")
    public static WebElement userEditoption;

    @FindBy(xpath = "//button[contains(text(),'Next')]")
    public static WebElement userEditNextBtn;

    @FindBy(xpath = "//label[@for='5db0723fa402105459739b3b']")
    public static WebElement particularLocalDriveSelect;

    @FindBy(xpath = "//button[contains(text(),'Confirm')]")
    public static WebElement deleteConfirmBtn;

    @FindBy(xpath = "//button[contains(text(),'New')]")
    public static WebElement userCreateNewBtn;

    @FindBy(xpath = "//div[@class='options-list']")
    public static WebElement userCreateLocationSelect;

    @FindBy(xpath = "//div[@class='options-list']")
    public static WebElement userCreateGroupSelect;

    @FindBy(xpath = "//i[@class='icon icon-search']")
    public static WebElement userSearchBtnDelete;

    @FindBy(xpath = "//div[@class='card-title']")
    public static WebElement particularUserToDelete;

    @FindBy(xpath = "//i[@class='icon icon-trashcan']")
    public static WebElement userDeleteButton;

    @FindBy(xpath = "(//div[@class='bottom']//button)[5]")
    public static WebElement userCreateConfirmation;

    @FindBy(xpath = "//div[@id='delete-user-dialog']/div[1]/div[3]/button[2]")
    public static WebElement userDeleteConfirmation;

    @FindBy(xpath = "//small[@class='form-error-msg']")
    public static WebElement usernameAlertMsg;

    @FindBy(xpath = "//button[contains(text(),'Add multiple users')]")
    public static WebElement multipleUsersBtnClick;

    @FindBy(xpath = "//label[@for='ecaNumSelectAll']")
    public static WebElement selectAllCheckboxMultipleUser;

    @FindBy(xpath = "//input[@formcontrolname='firstName'][1]")
    public static WebElement multipleUserFirstName1;

    @FindBy(xpath = "//input[@formcontrolname='lastName'][1]")
    public static WebElement multipleUserLastName1;

    @FindBy(xpath = "//input[@formcontrolname='email'][1]")
    public static WebElement multipleUserEmail1;

    @FindBy(xpath = "//input[@formcontrolname='username'][1]")
    public static WebElement multipleUserUserName1;

    @FindBy(xpath = "//input[@formcontrolname='phone'][1]")
    public static WebElement multipleUserPhoneNumber1;

    @FindBy(xpath = "//button[contains(text(),'Select Group')]")
    public static WebElement multipleUserGroupClick;

    @FindBy(xpath = "//button[contains(text(),'Select Local Drive')]")
    public static WebElement multipleUserDriveClick;

    @FindBy(xpath = "//*[contains(text(),'Hesticides')]")
    public static WebElement groupNameSelectMultipleUser;

    @FindBy(xpath = "//button[contains(text(),'Select Location')]")
    public static WebElement multipleUserLocationClick;

    @FindBy(xpath = "//*[contains(text(),'WashingtonDC')]")
    public static WebElement locationNameSelectMultipleUser;

    @FindBy(xpath = "//div[contains(text(),'Additional Local Storage 500 GB')]")
    public static WebElement particularDriveSelectMultipleUserCreate;

    @FindBy(xpath = "//*[contains(text(),'India (91)')]")
    public static WebElement countryCodeSelectMultipleUserCreate;


}
