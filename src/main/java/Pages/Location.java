package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Location {

    @FindBy(xpath = "//*[contains(text(),'Locations')]")
    public static WebElement locationMenu;

    @FindBy(xpath = "//i[@class='icon icon-trashcan']")
    public static WebElement trashIconLocation;

    @FindBy(xpath = "//div[@class='notification live']//div[@class='description'][normalize-space()='Cannot Delete Headquarters']")
    public static WebElement cannotDeleteHQMsg;

    @FindBy(xpath = "//*[@class='card-container mat-ripple mat-card selected']")
    public static WebElement locationHQIcon;

    @FindBy(xpath = "//label[@for='cssCheckbox5db37af3a402105459739b57']")
    public static WebElement locationHQcheckbox;
    //label[@for='cssCheckbox5db37af3a402105459739b57']

    @FindBy(xpath = "//button[contains(text(),'New')]")
    public static WebElement newIcon;

    @FindBy(xpath = "//input[@placeholder='Type a name']")
    public static WebElement typeANameTxtBox;

    @FindBy(xpath = "//input[@placeholder='Enter a location']")
    public static WebElement address1Location;

    @FindBy(xpath = "//input[@placeholder='Apartment, suite, unit, building, floor, etc.']")
    public static WebElement address2Location;

    @FindBy(xpath = "//button[normalize-space()='Select Country']")
    public static WebElement countryLocationDD;

    @FindBy(xpath = "//*[@id='locationCountry']")
    public static WebElement Locationselect;

    @FindBy(xpath = "//input[@id='locationState']")
    public static WebElement stateLocation;

    @FindBy(xpath = "//input[@id='locationCity']")
    public static WebElement cityLocation;

    @FindBy(xpath = "//input[@id='locationZipCode']")
    public static WebElement zipCodeLocation;

    @FindBy(xpath = "//button[@class='btn primary']")
    public static WebElement saveLocationButton;

    @FindBy(xpath = "//span[@class='d-sm-block d-none'][normalize-space()='Services']")
    public static WebElement Services;


    @FindBy(xpath = "//div[@class='row d-flex']//div[1]//mat-card[1]//div[1]//img[1]")
    public static WebElement Servicelink;

    @FindBy(xpath = "//div[@class='titles']//div[3]")
    public static WebElement Cost;

    @FindBy(xpath = "//*[@id='ngb-tab-10-panel']/location-services-cost-details/div/div/div/table/div/tbody/tr[4]/td[4]")
    public static WebElement Costprice;

    @FindBy(xpath = "//*[contains(text(),'Invoices')]")
    public static WebElement Invoice;

    @FindBy(xpath = "//div[@class='Pending']")
    public static WebElement InvoicePDF;

    @FindBy(xpath = "//div[@class='card-title']")
    public static WebElement Invoicename;

    @FindBy(xpath = "//input[@placeholder='Search']")
    public static WebElement Searchinvoice;

    @FindBy(xpath = "//select[@class='form-control ng-pristine ng-valid ng-touched']")
    public static WebElement Locationadded;

    @FindBy(xpath = "//i[@class='icon icon-edit']")
    public static WebElement editLocationButton;

    @FindBy(xpath = "//small[contains(text(),'Location')]")
    public static WebElement validationError;

    @FindBy(xpath = "//div[contains(text(),'Cannot')]")
    public static WebElement warningMessage;

    @FindBy(xpath = "//button[contains(text(),'OK')]")
    public static WebElement buttonOk;

    @FindBy(xpath = "//span[@class='d-sm-block d-none']")
    public static WebElement locationServices;

    @FindBy(xpath = "//label[contains(text(),'Tech')]")
    public static WebElement locationServicesSubMenu1;

    @FindBy(xpath = "//label[contains(text(),'Data')]")
    public static WebElement locationServicesSubMenu2;

    @FindBy(xpath = "//a[@id='ngb-tab-2']")
    public static WebElement locationCosts;

    @FindBy(xpath = "//div[@id='ngb-tab-2-panel']")
    public static WebElement costTable;

    @FindBy(xpath = "//span[contains(text(),'Cost')]")
    public static WebElement costDashboard;

    @FindBy(xpath = "//span[contains(text(),'Ticket')]")
    public static WebElement ticketDashboard;

    @FindBy(xpath = "//span[contains(text(),'Security')]")
    public static WebElement securityDashboard;

    @FindBy(xpath = "//select[@id='countryButton']")
    public static WebElement countrySelect;

    @FindBy(xpath = "//input[@placeholder='Start typing to search']")
    public static WebElement locationSearch;

    @FindBy(xpath = "//i[@class='icon icon-search']")
    public static WebElement locationSearchBtn;

    @FindBy(xpath = "//div[@class='card-title']")
    public static WebElement particularLocationSelect;

    @FindBy(xpath = "//i[@class='icon icon-trashcan']")
    public static WebElement locationDeleteIcon;

    @FindBy(xpath = "//div[@class='notification live']")
    public static WebElement notificationMsg;

    @FindBy(xpath = "//i[@class='icon icon-edit']")
    public static WebElement locationEditBtn;

    @FindBy(xpath = "//input[@placeholder='Enter a location']")
    public static WebElement locationBox;

    @FindBy(xpath = "//input[@placeholder='Apartment, suite, unit, building, floor, etc.']")
    public static WebElement apartmentBox;

    @FindBy(xpath = "//button[contains(text(),'New')]")
    public static WebElement locationNewButton;

    @FindBy(xpath = "//input[@id='locationName']")
    public static WebElement newLocation;

    @FindBy(xpath = "//div[contains(text(),'Services')]")
    public static WebElement clickServiceLocationMenu;

    @FindBy(xpath = "//div[contains(text(),'Tech Support')]")
    public static WebElement checkSubServiceMenu;

    @FindBy(xpath = "//div[contains(text(),'Costs')]")
    public static WebElement clickCostLocationMenu;

    @FindBy(xpath = "//select[@id='countryButton']")
    public static WebElement countrySelectForLocationCreate;

    @FindBy(xpath = "(//button[@class='btn ghost'])[6]")
    public static WebElement deleteConfirmationButton;

//    @FindBy(xpath = "//button[contains(text(),'Yes')]")
//    public static WebElement deleteConfirmationButton;

    @FindBy(xpath = "//*[@id='app']/div/div[2]/div/app-billing/billing-ca/div/div/div[2]/div/div[3]/div/div[2]/div[1]/div[2]/div[1]/div/span")
    public static WebElement costdeatils;

    @FindBy(xpath = "//div[normalize-space()='User Costs']")
    public static WebElement userCoststab;

    @FindBy(xpath = "//div[@title='Tech Support']")
    public static WebElement servicesSubMenu1;

    @FindBy(xpath = "//div[@title='Data Security']")
    public static WebElement servicesSubMenu2;

    @FindBy(xpath = "//div[contains(text(),'Costs')]")
    public static WebElement locationCostMenu;

    @FindBy(xpath = "//small[@class='form-error-msg']")
    public static WebElement warningMsgAddressTaken;

    @FindBy(xpath = "//div[@id='add-new-location']//div//div//form//div//div//button[@type='submit'][normalize-space()='Save']")
    public static WebElement locationCreateSaveBtnJsExecutor;

    @FindBy(xpath = "(//div[@class='title'])[4]")
    public static WebElement titleclick;

    @FindBy(xpath = "//button[contains(text(),'Cancel')]")
    public static WebElement locationCreateCancelBtnJsExecutor;

    @FindBy(xpath = "(//button[text()='Cancel'])[1]")
    public static WebElement addNewlocationCancelBtn;

    @FindBy(xpath = "(//div[@class='action view-action'])[1]")
    public static WebElement listviewiconbutton;

    @FindBy(xpath = "(//div[@class='action view-action'])[1]")
    public static WebElement gridviewiconbutton;

    @FindBy(xpath = "(//div[@class='action view-action'])[2]")
    public static WebElement mapviewiconbutton;

    @FindBy(xpath = "//li[@class='right-arrow']")
    public static WebElement nextarrowbutton;


    @FindBy(xpath = "//li[@class='left-arrow']")
    public static WebElement previousarrowbutton;

    @FindBy(xpath = "(//button[@class='btn current-options'])[1]")
    public static WebElement showbutton;

    @FindBy(xpath = "//div[normalize-space()='10']")
    public static WebElement entriesbuttonone;

    @FindBy(xpath = "//div[normalize-space()='20']")
    public static WebElement entriesbuttontwo;

    @FindBy(xpath = "//div[normalize-space()='30']")
    public static WebElement entriesbuttonthree;

    @FindBy(xpath = "(//button[@class='btn ghost'])[3]")
    public static WebElement cancelBton;

    @FindBy(xpath = "(//i[@class='icon icon-cross close'])")
    public static WebElement closeBton;

    @FindBy(xpath = "(//small[@class='form-error-msg'])[4]")
    public static WebElement locNameValidation;

    @FindBy(xpath = "(//div[@class='value-text']")
    public static WebElement searchresult;

    @FindBy(xpath = "//li[@class='active']")
    public static WebElement paginationnum;

    @FindBy(xpath = "//button[contains(text(),'Save')]")
    public static WebElement savebtn;

    @FindBy(xpath = "//button[normalize-space()='New']")
    public static WebElement newbtntitle;

    @FindBy(xpath = "//i[@title='Delete']")
    public static WebElement deletebtntitle;

    @FindBy(xpath = "//i[@title='Edit']")
    public static WebElement editbtntitle;

    @FindBy(xpath = "//div[contains(text(),'Location Name')]")
    public static WebElement locnamelabel;

    @FindBy(xpath = "//div[contains(text(),'Address line #1')]")
    public static WebElement addressline1label;

    @FindBy(xpath = "//label[normalize-space()='Address line #2']")
    public static WebElement addressline2label;

    @FindBy(xpath = "(//div[contains(text(),'City/Region')])[1]")
    public static WebElement cityregionlabel;

    @FindBy(xpath = ("(//div[contains(text(),'State')])[2]"))
    public static WebElement statelabel;

    @FindBy(xpath = "//div[contains(text(),'Zip Code')]")
    public static WebElement zipcodelabel;

    @FindBy(xpath = "//div[normalize-space()='Country']")
    public static WebElement countrylabel;

    @FindBy(xpath = "(//small[@class='form-error-msg'])[4]")
    public static WebElement locnamefieldvalidation;

    @FindBy(xpath = "(//small[@class='form-error-msg'])[5]")
    public static WebElement locaddress1fieldvalidation;

    @FindBy(xpath = "(//small[@class='form-error-msg'])[6]")
    public static WebElement locaddress2fieldvalidation;

    @FindBy(xpath = "//div[@class='flex-0 wo-footer fixed-footer']//div//a")
    public static WebElement privacylegal;

    @FindBy(xpath = "//a[text()='Ericsson Wireless Office Subscription Terms of Service']")
    public static WebElement privacylegal1;

    @FindBy(xpath = "//a[text()='Ericsson Wireless Office Service Description']")
    public static WebElement privacylegal2;

    @FindBy(xpath = "//a[text()='Ericsson Wireless Office Service Level Agreement']")
    public static WebElement privacylegal3;

    @FindBy(xpath = "//a[text()='Ericsson Wireless Office Privacy Policy']")
    public static WebElement privacylegal4;

    @FindBy(xpath = "//*[@id='app']/div/div[2]/div/location/div/div/div[2]/div/div[3]/div/div[1]/div[2]")
    public static WebElement detailsvalue1;

    @FindBy(xpath = "//*[@id='app']/div/div[2]/div/location/div/div/div[2]/div/div[3]/div/div[2]/div[2]")
    public static WebElement detailsvalue2;

    @FindBy(xpath = "//*[@id='app']/div/div[2]/div/location/div/div/div[2]/div/div[3]/div/div[6]/div[2]")
    public static WebElement detailsvalue3;

    @FindBy(xpath = "//*[@id='app']/div/div[2]/div/location/div/div/div[2]/div/div[3]/div/div[4]/div[2]")
    public static WebElement detailsvalue4;

    @FindBy(xpath = "//*[@id='app']/div/div[2]/div/location/div/div/div[2]/div/div[3]/div/div[3]/div[2]")
    public static WebElement detailsvalue5;

    @FindBy(xpath = "//*[@id='app']/div/div[2]/div/location/div/div/div[2]/div/div[3]/div/div[5]/div[2]")
    public static WebElement detailsvalue6;

    @FindBy(xpath = "//label[normalize-space()='Show']")
    public static WebElement showscroll;

    @FindBy(xpath = "//span[@class='title-name']")
    public static WebElement pageheadertitle;

   }
