package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RequestForFinancingObj {
	WebDriver driver;
	public RequestForFinancingObj(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="_selenuimCSM")
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
    @FindBy(xpath="//*[@id=\"rerquestFinancingMainLimitTabsContent_CSMRF00MT\"]/div/table[1]/tbody/tr/td[1]/fieldset")
	private WebElement FacIltytype_touch;
    public WebElement facilitytypetouch() {
		return FacIltytype_touch;
	}
    @FindBy(xpath="//input[@id='requestFinancingFacilityTotalvalue_CSMRF00MT']")
	private WebElement ToTal_Limit_Search_box;
    public WebElement totallimitsearchbox() {
		return ToTal_Limit_Search_box;
	}
 @FindBy(xpath="//li[@id='requestFinancingLimitDtlsTabs_CSMRF00MT']")
	private WebElement Disbursement_SUBlimit;
    public WebElement disbursementsublimit() {
		return Disbursement_SUBlimit;
	}
    @FindBy(xpath="(//span[@class='ui-icon ui-icon-plus'])[11]")
	private WebElement Disbursement_SUBlimit_aDD_Button;
    public WebElement disbursementsublimitaddbutton() {
		return Disbursement_SUBlimit_aDD_Button;
	}
    @FindBy(xpath="//input[@id=\'lookuptxt_requestFinancingLimitDetailsGeneralFacilityProductClass_CSMRF00MT\']")
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
    @FindBy(xpath="//input[@id=\'requestFinancingLimitDetailsPeriodicityNbr_CSMRF00MT\']")
	private WebElement TeNURe;
    public WebElement tenure() {
		return TeNURe;
	}
    @FindBy(xpath="//button[@id=\'limitDetails_add_btn_CSMRF00MT\']")
	private WebElement ADD_Button;
    public WebElement addbutton() {
		return ADD_Button;
	}
    @FindBy(id="requestFinancingMainTab_CSMRF00MT")
	private WebElement RequestDetailsSection;
    public WebElement RequestDetailsSection() {
		return RequestDetailsSection;
	}
    @FindBy(id="rerquestFinancingMainGroupLimitTabs_CSMRF00MT")
    private WebElement GroupLimitSection;
    public WebElement GroupLimitSection() {
    return GroupLimitSection;
    }
    @FindBy(id="add_RequestFinancingGroupLimitGridId_CSMRF00MT")
    private WebElement GroupLimit_AddButton;
    public WebElement GroupLimit_AddButton() {
    return GroupLimit_AddButton;
    }
    @FindBy(id="td_RequestFinancingGroupLimitGridId_CSMRF00MT_1_fmsapplimitdetgroupVO.GROUP_ID")
    private WebElement GroupLimit_GroupIdTextbox;
    public WebElement GroupLimit_GroupIdTextbox() {
    return GroupLimit_GroupIdTextbox;
    }
    @FindBy(xpath="//td[@tdlabel='Group ID']//input")
    private WebElement GroupLimit_GroupId;
    public WebElement GroupLimit_GroupId() {
    return GroupLimit_GroupId;
    }
    @FindBy(xpath="//td[@tdlabel='Group Limit']//input")
    private WebElement GroupLimit_GroupLimit;
    public WebElement GroupLimit_GroupLimit() {
    return GroupLimit_GroupLimit;
    }
    @FindBy(xpath="//td[@tdlabel='Group Name']//input")
    private WebElement GroupLimit_GroupName;
    public WebElement GroupLimit_GroupName() {
    return GroupLimit_GroupName;
    }
    @FindBy(xpath="//div[contains(text(),' Group Limit Exceeds Facility Value')]")
    private WebElement GroupLimit_GroupLimitExeededPopup;
    public WebElement GroupLimit_GroupLimitExeededPopup() {
    return GroupLimit_GroupLimitExeededPopup;
    }
    @FindBy(id="_popup_path_sol_ok")
	private WebElement ServerRequestNotComplete_OKButton;

	public WebElement ServerRequestNotComplete_OKButton() {
		return ServerRequestNotComplete_OKButton;
	}

}
