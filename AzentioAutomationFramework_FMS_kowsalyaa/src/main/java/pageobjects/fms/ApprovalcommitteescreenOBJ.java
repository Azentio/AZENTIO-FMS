package pageobjects.fms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ApprovalcommitteescreenOBJ {
	WebDriver driver;
	
	public ApprovalcommitteescreenOBJ(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		}
	@FindBy(xpath="//td[text()='REQUEST FOR FINANCIN']")
	private WebElement REQUEST_FOR_FINANCIN;
    public WebElement REQUESTFORFINANCIN() {
		return REQUEST_FOR_FINANCIN;
	}
	@FindBy(xpath="//td[text()='Request For Financing']")
	private WebElement Request_For_Financing;
    public WebElement RequestForFinancing() {
		return Request_For_Financing;
	}
    @FindBy(xpath="//span[text()='Maintenance']")
	private WebElement Maintenance;
    public WebElement maintenance() {
		return Maintenance;
	}
    @FindBy(xpath="//select[@id='requestFinancingApplicationFor_CSMRF00MT']")
	private WebElement Reason_For_Submission;
    public WebElement reasonforsubmisson() {
		return Reason_For_Submission;
	}
    @FindBy(xpath="(//input[@class='path-theme-cust-input liveSearchText liveSearchCompSize ui-state-focus liveSearchInputCorner'])[5]")
	private WebElement Customer_Search_box;
    public WebElement customersearchbox() {
		return Customer_Search_box;
	}
    @FindBy(xpath="//label[@id='requestFinancingCustomer_CSMRF00MT']")
	private WebElement CUSTOMER;
    public WebElement customer() {
		return CUSTOMER;
	}
    @FindBy(xpath="//span[text()='Facility Type Details']")
	private WebElement Facility_Type_details;
    public WebElement facilitytypedetails() {
		return Facility_Type_details;
	}
    @FindBy(xpath="//input[@id='lookuptxt_requestFinancingFacilityType_CSMRF00MT']")
	private WebElement Facility_Type_details_searchbox;
    public WebElement facilitytypedetailssearchbox() {
		return Facility_Type_details_searchbox;
	}
    @FindBy(xpath="//label[@id='requestFinancingFormId_CSMRF00MT_Facility_Type_key']")
	private WebElement FacIlity_Type;
    public WebElement facilitytype() {
		return FacIlity_Type;
	}
    @FindBy(xpath="//input[@id='requestFinancingFacilityTotalvalue_CSMRF00MT']")
	private WebElement ToTal_Limit_Search_box;
    public WebElement totallimitsearchbox() {
		return ToTal_Limit_Search_box;
	}
    @FindBy(xpath="//label[@id='requestFinancingFormId_CSMRF00MT_Total_Limit_Key']")
	private WebElement ToTal_Limit;
    public WebElement totallimit() {
		return ToTal_Limit;
	}
    @FindBy(xpath="//span[text()='Disbursement/Sublimit']")
	private WebElement Disbursement_SUBlimit;
    public WebElement disbursementsublimit() {
		return Disbursement_SUBlimit;
	}
    @FindBy(xpath="(//span[@class='ui-icon ui-icon-plus'])[11]")
	private WebElement Disbursement_SUBlimit_aDD_Button;
    public WebElement disbursementsublimitaddbutton() {
		return Disbursement_SUBlimit_aDD_Button;
	}
    @FindBy(xpath="//input[@id=\"lookuptxt_requestFinancingLimitDetailsGeneralFacilityProductClass_CSMRF00MT\"]")
	private WebElement Product_class_searchbox;
    public WebElement productclasssearchbox() {
		return Product_class_searchbox;
	}
    @FindBy(xpath="//label[@id='requestfinancingLimitPopupFormId_CSMRF00MT_Product_Class_Key']")
	private WebElement Product_class;
    public WebElement productclass() {
		return Product_class;
	}
    @FindBy(xpath="(//input[@class='path-theme-cust-input textCompSize ui-state-focus ui-corner-all'])[175]")
	private WebElement MaRgin_search_box;
    public WebElement marginsearchbox() {
		return MaRgin_search_box;
	}
    @FindBy(xpath="(//label[@id='requestfinancingLimitPopupFormId_CSMRF00MT_MarignRate_key'])[1]")
	private WebElement MaRgin;
    public WebElement margin() {
		return MaRgin;
	}
    @FindBy(xpath="//input[@id=\"requestFinancingLimitDetailsPeriodicityNbr_CSMRF00MT\"]")
	private WebElement TeNURe;
    public WebElement tenure() {
		return TeNURe;
	}
    @FindBy(xpath="//button[@id=\"limitDetails_add_btn_CSMRF00MT\"]")
	private WebElement ADD_Button;
    public WebElement addbutton() {
		return ADD_Button;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
