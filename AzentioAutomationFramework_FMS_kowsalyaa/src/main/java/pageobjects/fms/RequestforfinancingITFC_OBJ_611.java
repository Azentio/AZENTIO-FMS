package pageobjects.fms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RequestforfinancingITFC_OBJ_611 {
	WebDriver driver;	
	public RequestforfinancingITFC_OBJ_611(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
}
	//@468154
	@FindBy(xpath="//td[text()='Johns request']")
	private WebElement JohnsRequestMenu ;
	public WebElement JohnsRequestMenu_611() {
		return JohnsRequestMenu;
	}
	@FindBy(xpath="//td[text()='Joh reqs']")
	private WebElement JohreqsMenu ;
	public WebElement JohreqsMenu_611() {
		return JohreqsMenu;
	}
	@FindBy(xpath="//td[text()='Request For Financing']")
	private WebElement RequestforFinancing ;
	public WebElement RequestforFinancing_611() {
		return RequestforFinancing;
	}
	@FindBy(xpath="//span[text()='Maintenance']")
	private WebElement RequestforFinancing_Maintenence ;
	public WebElement RequestforFinancingmaintenance_611() {
		return RequestforFinancing_Maintenence;
	}
	@FindBy(xpath="//select[@name='requestFinancingCO.fmsRequestFinancingVO.APPLICATION_FOR']")
	private WebElement RequestforFinancing_Reasonforsubmission ; //New Request
	public WebElement RequestforFinancingreasonforsubmission_611() {
		return RequestforFinancing_Reasonforsubmission;
	}
	@FindBy(xpath="//span[text()='Source/Destination']")
	private WebElement RequestforFinancing_Sourcedestination ; 
	public WebElement RequestforFinancingSourcedestination_611() {
		return RequestforFinancing_Sourcedestination;
	}
	@FindBy(xpath="//input[@name='fmsCommonCO.memberCountriesYN']")
	private WebElement RequestforFinancing_Membercountriescheckbox ; 
	public WebElement RequestforFinancingmembercountriescheckbox_611() {
		return RequestforFinancing_Membercountriescheckbox;
	}
	@FindBy(xpath="//input[@name='fmsCommonCO.nonMemberCountriesYN']")
	private WebElement RequestforFinancing_NonMembercountriescheckbox ; 
	public WebElement RequestforFinancingnonmembercountriescheckbox_611() {
		return RequestforFinancing_NonMembercountriescheckbox;
	}
	@FindBy(xpath="//input[@id='fms_SrcDst_Member_Country_perc_333RF00MT']")
	private WebElement RequestforFinancing_Membercountriesexpectedselectbox ; 
	public WebElement RequestforFinancingMembercountriesexpectedselectbox_611() {
		return RequestforFinancing_Membercountriesexpectedselectbox;
	}
	@FindBy(xpath="//input[@id='fms_SrcDst_non_Member_Country_perc_333RF00MT']")
	private WebElement RequestforFinancing_NonMembercountriesexpectedselectbox ; 
	public WebElement RequestforFinancingNonMembercountriesexpectedselectbox_611() {
		return RequestforFinancing_NonMembercountriesexpectedselectbox;
	}
	@FindBy(xpath="//td[@id='add_fmsSpecificCountriesGrid_333RF00MT']")
	private WebElement RequestforFinancing_Specificountriesaddbutton ; 
	public WebElement RequestforFinancingspecificountriesaddbuttton_611() {
		return RequestforFinancing_Specificountriesaddbutton;
	}
	@FindBy(xpath="//td[@id='td_fmsSpecificCountriesGrid_333RF00MT_1_rn']")
	private WebElement RequestforFinancing_SpecificountriesCountrycodeclick ; 
	public WebElement RequestforFinancing_SpecificountriesCountrycodeclick_611() {
		return RequestforFinancing_SpecificountriesCountrycodeclick;
	}
	@FindBy(xpath="//input[@id='new_1695384247049_fmsSpecificDetailsVO.COUNTRY_CODE_lookuptxt_fmsSpecificCountriesGrid_333RF00MT']")
	private WebElement RequestforFinancing_SpecificountriesCountrycodeselectinputbox ; 
	public WebElement RequestforFinancing_SpecificountriesCountrycodeselectinputbox_611() {
		return RequestforFinancing_SpecificountriesCountrycodeselectinputbox;
	}
	@FindBy(xpath="//input[@id='new_1695366432417_fmsSpecificDetailsVO.EXPECTED_PERC']")
	private WebElement RequestforFinancing_Specificountriesexpectedselectbox ; 
	public WebElement RequestforFinancing_Specificountriesexpectedselectbox_611() {
		return RequestforFinancing_Specificountriesexpectedselectbox;
	}
	@FindBy(xpath="//td[@id='add_fmsSpecificSuppliersGrid_333RF00MT']")
	private WebElement RequestforFinancing_SpecificSuppliersaddbutton ; 
	public WebElement RequestforFinancing_SpecificSuppliersaddbutton_611() {
		return RequestforFinancing_SpecificSuppliersaddbutton;
	}
	@FindBy(xpath="//td[@id='td_fmsSpecificSuppliersGrid_333RF00MT_1_fmsSpecificDetailsVO.CIF_NO']")
	private WebElement RequestforFinancing_SpecificSuppliersCIFclick ; 
	public WebElement RequestforFinancing_SpecificSuppliersCIFclick_611() {
		return RequestforFinancing_SpecificSuppliersCIFclick;
	}
	@FindBy(xpath="//input[@id='new_1695384459165_fmsSpecificDetailsVO.CIF_NO_lookuptxt_fmsSpecificSuppliersGrid_333RF00MT']")
	private WebElement RequestforFinancing_SpecificSuppliersCIFselectbox ; 
	public WebElement RequestforFinancing_SpecificSuppliersCIFselectbox_611() {
		return RequestforFinancing_SpecificSuppliersCIFselectbox;
	}
	@FindBy(xpath="//input[@id='new_1695367178162_fmsSpecificDetailsVO.EXPECTED_PERC']")
	private WebElement RequestforFinancing_SpecificSuppliersexpectedselectbox ; 
	public WebElement RequestforFinancing_SpecificSuppliersexpectedselectbox_611() {
		return RequestforFinancing_SpecificSuppliersexpectedselectbox;
	}
	@FindBy(xpath="//input[@id='_popup_path_sol_ok']")
	private WebElement RequestforFinancing_Sourcedestinationokbtnpopup ; 
	public WebElement RequestforFinancing_Sourcedestinationokbtnpopup_611() {
		return RequestforFinancing_Sourcedestinationokbtnpopup;
	}
	
	//@468167
	
	@FindBy(xpath="//input[@id='lookuptxt_requestFinanacingCif_333RF00MT']")
	private WebElement RequestforFinancing_CustomerLabel ; 
	public WebElement RequestforFinancing_CustomerLabel_611() {
		return RequestforFinancing_CustomerLabel;
	}
	@FindBy(xpath="//input[@id='requestFinancingInfoCompletionDate_333RF00MT']")
	private WebElement RequestforFinancing_InfoCompletionDate ; 
	public WebElement RequestforFinancing_InfoCompletionDate_611() {
		return RequestforFinancing_InfoCompletionDate;
	}
	@FindBy(xpath="//input[@id='lookuptxt_requestFinancingFacilityType_333RF00MT']")
	private WebElement RequestforFinancing_FacilityType ; 
	public WebElement RequestforFinancing_FacilityType_611() {
		return RequestforFinancing_FacilityType;
	}
	@FindBy(xpath="//input[@id='requestFinancingFacilityTotalvalue_333RF00MT']")
	private WebElement RequestforFinancing_Totallimit ; 
	public WebElement RequestforFinancing_totallimit_611() {
		return RequestforFinancing_Totallimit;
	}
	@FindBy(xpath="//li[@id='rerquestFinancingFundLimitDetailsTabs_333RF00MT']")
	private WebElement RequestforFinancing_Funding ; 
	public WebElement RequestforFinancing_Funding_611() {
		return RequestforFinancing_Funding;
	}
	@FindBy(xpath="//td[@id='add_RequestFinancingfundlimitsLimitDetailsGrid_333RF00MT']")
	private WebElement RequestforFinancing_Fundingaddbtn ; 
	public WebElement RequestforFinancing_Fundingaddbtn_611() {
		return RequestforFinancing_Fundingaddbtn;
	}
	@FindBy(xpath="//input[@id='new_1695387750076_fmsApplFundLimitDetVO.FUND_CODE_lookuptxt_RequestFinancingfundlimitsLimitDetailsGrid_333RF00MT']")
	private WebElement RequestforFinancing_Fundcode ; 
	public WebElement RequestforFinancing_Fundcode_611() {
		return RequestforFinancing_Fundcode;
	}
	@FindBy(xpath="//td[@id='td_RequestFinancingfundlimitsLimitDetailsGrid_333RF00MT_1_fmsApplFundLimitDetVO.ALLOCATED_AMOUNT_FACILITY_CY']")
	private WebElement RequestforFinancing_Validationamtbtn ; 
	public WebElement RequestforFinancing_Validationamtbtn_611() {
		return RequestforFinancing_Validationamtbtn;
	}




	
	
	
	
}
