package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RequestforFinancing_Pageobjects {
	
	WebDriver driver;
	public RequestforFinancing_Pageobjects(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//td[text()='WIFAK APPLICATION']//ancestor::div[@id='_selenuimAPPLICATION']/h3/table/tbody/tr/td[2]")
	private WebElement FmsWifakappliction;
	public WebElement Fms_Wifakappliction() {
		return FmsWifakappliction;
	}
	
	@FindBy(xpath = "//td[text()='WIFAK APPLICATION']//ancestor::div[@id='_selenuimWIF']/li/a/table/tbody/tr/td[2]")
	private WebElement WifakapplictionWifakapplictionSubmenu;
	public WebElement Wifakappliction_WifakapplictionSubmenu() {
		return WifakapplictionWifakapplictionSubmenu;
	}
	
	@FindBy(xpath = "//td[text()='Application For Financial Facilities']")
	private WebElement WifakapplictionSubmenuApplicationforfinancialfacilities;
	public WebElement WifakapplictionSubmenu_Applicationforfinancialfacilities() {
		return WifakapplictionSubmenuApplicationforfinancialfacilities;
	}
	
	@FindBy(xpath = "//a[@id='WIFT001MT']//span[text()='Maintenance']")
	private WebElement WifakapplictionSubmenuApplicationforfinancialfacilitiesMaintenance;
	public WebElement WifakapplictionSubmenu_Applicationforfinancialfacilities_Maintenance() {
		return WifakapplictionSubmenuApplicationforfinancialfacilitiesMaintenance;
	}
	
	@FindBy(xpath = "//select[@id='applicationFacilityApplicationfor_WIFT001MT']")
	private WebElement ApplicationforfinancialfacilitiesMaintenanceApplicationfor;
	public WebElement Applicationforfinancialfacilities_Maintenance_Applicationfor() {
		return ApplicationforfinancialfacilitiesMaintenanceApplicationfor;
	}
	
	@FindBy(xpath = "//input[@id='lookuptxt_applicationFacilitycif_WIFT001MT']")
	private WebElement  ApplicationforfinancialfacilitiesMaintenanceCifno;
	public WebElement Applicationforfinancialfacilities_Maintenance_Cifno() {
		return  ApplicationforfinancialfacilitiesMaintenanceCifno;
	}
	
	@FindBy(xpath =  "//input[@id='lookuptxt_applicationFacilityFacilityType_WIFT001MT']")
	private WebElement ApplicationforfinancialfacilitiesMaintenanceFacilitytype;
	public WebElement Applicationforfinancialfacilities_Maintenance_Facilitytype() {
		return ApplicationforfinancialfacilitiesMaintenanceFacilitytype;
	}
	
	@FindBy(xpath =  "//input[@id='lookuptxt_applicationFacilityCountry_WIFT001MT']")
	private WebElement ApplicationforfinancialfacilitiesMaintenanceCountryoffinancing;
	public WebElement Applicationforfinancialfacilities_Maintenance_Countryoffinancing() {
		return ApplicationforfinancialfacilitiesMaintenanceCountryoffinancing;
	}
	
	@FindBy(xpath =  "//span[@id='spanLookup_applicationFacilityRating_WIFT001MT']")
	private WebElement ApplicationforfinancialfacilitiesMaintenanceFacilityRatingSearch;
	public WebElement Applicationforfinancialfacilities_Maintenance_FacilityRatingSearch() {
		return ApplicationforfinancialfacilitiesMaintenanceFacilityRatingSearch;
	}

	@FindBy(xpath =  "//td[@id='td_gridtab_applicationFacilityRating_WIFT001MT_1_LINE_NBR']")
	private WebElement ApplicationforfinancialfacilitiesMaintenanceFacilityRating;
	public WebElement Applicationforfinancialfacilities_Maintenance_FacilityRating() {
		return ApplicationforfinancialfacilitiesMaintenanceFacilityRating;
	}
	
	
	
	
	@FindBy(xpath = "//span[text()='Additional Details']")
	private WebElement ApplicationforfinancialfacilitiesMaintenanceAdditionalDetailsTab;
	public WebElement Applicationforfinancialfacilities_Maintenance_AdditionalDetailsTab() {
		return ApplicationforfinancialfacilitiesMaintenanceAdditionalDetailsTab;
	}
	
	@FindBy(xpath = "///input[@id='lookuptxt_applicationFacilitylimitcurrency_WIFT001MT']")
	private WebElement ApplicationforfinancialfacilitiesMaintenanceAdditionalDetailsTabCurrencyCode;
	public WebElement Applicationforfinancialfacilities_Maintenance_AdditionalDetailsTab_CurrencyCode() {
		return ApplicationforfinancialfacilitiesMaintenanceAdditionalDetailsTabCurrencyCode;
	}
	
	@FindBy(xpath = "//input[@id='applicationFacilitytotalvalue_WIFT001MT']")
	private WebElement ApplicationforfinancialfacilitiesMaintenanceAdditionalDetailsTabTotalValue;
	public WebElement Applicationforfinancialfacilities_Maintenance_AdditionalDetailsTab_TotalValue() {
		return ApplicationforfinancialfacilitiesMaintenanceAdditionalDetailsTabTotalValue;
	}
	
	@FindBy(xpath = "//input[@id='applicationFacilityofferexpirydate_WIFT001MT']")
	private WebElement ApplicationforfinancialfacilitiesMaintenanceAdditionalDetailsTabOfferExpiration;
	public WebElement Applicationforfinancialfacilities_Maintenance_AdditionalDetailsTab_OfferExpiration() {
		return ApplicationforfinancialfacilitiesMaintenanceAdditionalDetailsTabOfferExpiration;
	}
	
	@FindBy(xpath = "//li[@id='applicationFacilityLimitDetailsTabs_WIFT001MT']/a/span")
	private WebElement ApplicationforfinancialfacilitiesMaintenanceLimitDetailsTab;
	public WebElement Applicationforfinancialfacilities_Maintenance_LimitDetailsTab() {
		return ApplicationforfinancialfacilitiesMaintenanceLimitDetailsTab;
	}
	
	@FindBy(xpath = "")
	private WebElement ApplicationforfinancialfacilitiesMaintenanceLimitDetailsTabAddIcon;
	public WebElement Applicationforfinancialfacilities_Maintenance_LimitDetailsTab_AddIcon() {
		return ApplicationforfinancialfacilitiesMaintenanceLimitDetailsTabAddIcon;
	}
	
	@FindBy(xpath = "")
	private WebElement ApplicationforfinancialfacilitiesMaintenanceLimitDetailsTabProductClassSearch;
	public WebElement Applicationforfinancialfacilities_Maintenance_LimitDetailsTab_ProductClass_Search() {
		return ApplicationforfinancialfacilitiesMaintenanceLimitDetailsTabProductClassSearch;
	}
	
	@FindBy(xpath = "")
	private WebElement ApplicationforfinancialfacilitiesMaintenanceLimitDetailsTabProductClass;
	public WebElement Applicationforfinancialfacilities_Maintenance_LimitDetailsTab_ProductClass() {
		return ApplicationforfinancialfacilitiesMaintenanceLimitDetailsTabProductClass;
	}
	
	@FindBy(xpath = "")
	private WebElement ApplicationforfinancialfacilitiesMaintenanceLimitDetailsTabAdd;
	public WebElement Applicationforfinancialfacilities_Maintenance_LimitDetailsTab_Add() {
		return ApplicationforfinancialfacilitiesMaintenanceLimitDetailsTabAdd;
	}
	
	
	
	@FindBy(xpath = "")
	private WebElement ApplicationforfinancialfacilitiesMaintenanceDocumentDetailsTab;
	public WebElement Applicationforfinancialfacilities_Maintenance_DocumentDetailsTab() {
		return ApplicationforfinancialfacilitiesMaintenanceDocumentDetailsTab;
	}
	
	
	@FindBy(xpath = "")
	private WebElement ApplicationforfinancialfacilitiesMaintenanceDocumentDetailsTabSolicitorNameSearch;
	public WebElement Applicationforfinancialfacilities_Maintenance_DocumentDetailsTab_SolicitorName_Search() {
		return ApplicationforfinancialfacilitiesMaintenanceDocumentDetailsTabSolicitorNameSearch;
	}
	
	@FindBy(xpath = "")
	private WebElement ApplicationforfinancialfacilitiesMaintenanceDocumentDetailsTabSolicitorName;
	public WebElement Applicationforfinancialfacilities_Maintenance_DocumentDetailsTab_SolicitorName() {
		return ApplicationforfinancialfacilitiesMaintenanceDocumentDetailsTabSolicitorName;
	}
	
	@FindBy(xpath = "")
	private WebElement ApplicationforfinancialfacilitiesMaintenanceDocumentDetailsTabEstimatorNameSearch;
	public WebElement Applicationforfinancialfacilities_Maintenance_DocumentDetailsTab_EstimatorName_Search() {
		return ApplicationforfinancialfacilitiesMaintenanceDocumentDetailsTabEstimatorNameSearch;
	}
	
	@FindBy(xpath = "")
	private WebElement ApplicationforfinancialfacilitiesMaintenanceDocumentDetailsTabEstimatorName;
	public WebElement Applicationforfinancialfacilities_Maintenance_DocumentDetailsTab_EstimatorName() {
		return ApplicationforfinancialfacilitiesMaintenanceDocumentDetailsTabEstimatorName;
	}
	
	
	
	
	
	
	
	
	
	
	
	@FindBy(xpath = "//a[@id='WIFT001AP1']")
    private WebElement application_financial_facility_approve1;
    public WebElement applicationFinancialFacilityApproveLevel1() {
        return application_financial_facility_approve1;
    }
	@FindBy(xpath = "//*[@id=\"applicationFacilityGridTbl_Id_WIFT001AP1_pager_left\"]/table/tbody/tr/td[7]")
	private WebElement approve1_clear_btn;
	public WebElement approve1ClearBtn() {
		return approve1_clear_btn;
	}
	
	@FindBy(xpath = "//td[@id='td_applicationFacilityGridTbl_Id_WIFT001AP1_1_fmsApplVO.CODE']")
	private WebElement approve_level1_retrive_data;
	public WebElement approveLevel1RetriveData() {
		return approve_level1_retrive_data;
	}
	
	@FindBy(xpath = "//select[@id='applicationFacilityDecision_1_WIFT001AP1']")
	private WebElement approve_level1_select_decision;
	public WebElement approveLevel1SelectDecision() {
		return approve_level1_select_decision;
	}
	
	@FindBy(xpath = "//button[@id='applicationfacility_approvelevel1_btn_WIFT001AP1']")
	private WebElement approve_level1_submit_btn;
	public WebElement approveLevel1SubmitBtn() {
		return approve_level1_submit_btn;
	}
@FindBy(xpath = "//a[@id='WIFT001AP2']")
	private WebElement application_financial_facility_approve2;
	public WebElement applicationFinancialFacilityApproveLevel2() {
		return application_financial_facility_approve2;
	}
@FindBy(xpath = "//*[@id=\"applicationFacilityGridTbl_Id_WIFT001AP2_pager_left\"]/table/tbody/tr/td[7]")
	private WebElement approve2_clear_btn;
	public WebElement approve2ClearBtn() {
		return approve2_clear_btn;
	} 
	
	@FindBy(xpath = "//td[@id='td_applicationFacilityGridTbl_Id_WIFT001AP2_1_fmsApplVO.CODE']")
	private WebElement approve_level2_retrive_data;
	public WebElement approveLevel2RetriveData() {
		return approve_level2_retrive_data;
	}
	
	@FindBy(xpath = "//select[@id='applicationFacilityDecision2_WIFT001AP2']")
	private WebElement approve_level2_select_devision;
	public WebElement approveLevel2SelectDecision() {
		return approve_level2_select_devision;
	}
	
	@FindBy(xpath = "//button[@id='applicationfacility_approvelevel2_btn_WIFT001AP2']")
	private WebElement approve_level2_submit_btn;
	public WebElement approveLevel2SubmitBtn() {
		return approve_level2_submit_btn;
	}
	@FindBy(xpath = "//input[@id='_popup_path_sol_confirm_ok']")
	private WebElement button_confirm_ok;
	public WebElement ButtonConfirmOk1() {
		return button_confirm_ok;
	}
	
	@FindBy(xpath = "//*[@id='_popup_path_sol_ok']")
	private WebElement button_success_ok;
	public WebElement ButtonSuccessOk1() {
		return button_success_ok;
	}

@FindBy(xpath = "//a[@id='WIFT001AP3']")
	private WebElement application_financial_facility_approve3;
	public WebElement applicationFinancialFacilityApproveLevel3() {
		return application_financial_facility_approve3;
	}

@FindBy(xpath = "//*[@id=\"applicationFacilityGridTbl_Id_WIFT001AP3_pager_left\"]/table/tbody/tr/td[7]")
	private WebElement approve3_clear_btn;
	public WebElement approve3ClearBtn() {
		return approve3_clear_btn;
	}
	
	@FindBy(xpath = "//td[@id='td_applicationFacilityGridTbl_Id_WIFT001AP3_1_fmsApplVO.CODE']")
	private WebElement approve_level3_retrive_data;
	public WebElement approveLevel3RetriveData() {
		return approve_level3_retrive_data;
	}
	
	@FindBy(xpath = "//select[@id='applicationFacilityDecision3_WIFT001AP3']")
	private WebElement approve_level3_select_devision;
	public WebElement approveLevel3SelectDecision() {
		return approve_level3_select_devision;
	}
	@FindBy(xpath = "//button[@id='applicationfacility_approvelevel3_btn_WIFT001AP3']")
	private WebElement approve_level3_submit_btn;
	public WebElement approveLevel3SubmitBtn() {
		return approve_level3_submit_btn;
	}
	
	
}
