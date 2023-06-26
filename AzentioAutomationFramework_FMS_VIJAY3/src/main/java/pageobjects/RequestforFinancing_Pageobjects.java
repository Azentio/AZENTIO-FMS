package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.en.Given;

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
	
	@FindBy(xpath = "//div[@id='lookupid_applicationFacilitycif_WIFT001MT']/span/span")
	private WebElement  ApplicationforfinancialfacilitiesMaintenanceCifnoSearch;
	public WebElement Applicationforfinancialfacilities_Maintenance_CifnoSearch() {
		return  ApplicationforfinancialfacilitiesMaintenanceCifnoSearch;
	}
	
	@FindBy(xpath = "//input[@id='gridtab_applicationFacilitycif_WIFT001MT_gs_cifVO.CIF_NO']")
	private WebElement  ApplicationforfinancialfacilitiesMaintenanceCifno;
	public WebElement Applicationforfinancialfacilities_Maintenance_Cifno() {
		return  ApplicationforfinancialfacilitiesMaintenanceCifno;
	}
	
	
	@FindBy(xpath = "//td[@id='next_pagerid_applicationFacilitycif_WIFT001MT']/span")
	private WebElement  CifnoGridNext;
	public WebElement CifnoGridNext() {
		return  CifnoGridNext;
	}
	
	
	
	
	@FindBy(xpath =  "//span[@id='spanLookup_applicationFacilityFacilityType_WIFT001MT']/span")
	private WebElement ApplicationforfinancialfacilitiesMaintenanceFacilitytypeSearch;
	public WebElement Applicationforfinancialfacilities_Maintenance_FacilitytypeSearch() {
		return ApplicationforfinancialfacilitiesMaintenanceFacilitytypeSearch;
	}
	
	@FindBy(xpath =  "//input[@id='gridtab_applicationFacilityFacilityType_WIFT001MT_gs_CODE']")
	private WebElement ApplicationforfinancialfacilitiesMaintenanceFacilitytype;
	public WebElement Applicationforfinancialfacilities_Maintenance_Facilitytype() {
		return ApplicationforfinancialfacilitiesMaintenanceFacilitytype;
	}
	
	
	@FindBy(xpath = "//td[@id='next_pagerid_applicationFacilityFacilityType_WIFT001MT']/span")
	private WebElement  FacilityTypeGridNext;
	public WebElement FacilityTypeGridNext() {
		return  FacilityTypeGridNext;
	}
	
	
	@FindBy(xpath = "//span[@id='spanLookup_applicationFacilityCountry_WIFT001MT']/span")
	private WebElement ApplicationforfinancialfacilitiesMaintenanceCountryoffinancingSearch;
	public WebElement Applicationforfinancialfacilities_Maintenance_CountryoffinancingSearch() {
		return ApplicationforfinancialfacilitiesMaintenanceCountryoffinancingSearch;
	}
	
	@FindBy(xpath =  "//input[@name='COUNTRY_CODE']")
	private WebElement ApplicationforfinancialfacilitiesMaintenanceCountryoffinancing;
	public WebElement Applicationforfinancialfacilities_Maintenance_Countryoffinancing() {
		return ApplicationforfinancialfacilitiesMaintenanceCountryoffinancing;
	}
	
	@FindBy(xpath = "//td[@id='next_pagerid_applicationFacilityCountry_WIFT001MT']/span")
	private WebElement  CountryoffinancingGridNext;
	public WebElement CountryoffinancingGridNext() {
		return  CountryoffinancingGridNext;
	}
	/*
	@FindBy(xpath =  "//input[@name='applicationFacilityCO.fmsApplVO.FIN_COUNTRY']")
	private WebElement ApplicationforfinancialfacilitiesMaintenanceCountryoffinancing;
	public WebElement Applicationforfinancialfacilities_Maintenance_Countryoffinancing() {
		return ApplicationforfinancialfacilitiesMaintenanceCountryoffinancing;
	}
	
	@FindBy(xpath =  "//table[@id='gridtab_applicationFacilityCountry_WIFT001MT']/tbody/tr[2]/td")
	private WebElement ApplicationforfinancialfacilitiesMaintenanceCountryoffinancingSelect;
	public WebElement Applicationforfinancialfacilities_Maintenance_CountryoffinancingSelect() {
		return ApplicationforfinancialfacilitiesMaintenanceCountryoffinancingSelect;
	}
	*/
	@FindBy(xpath = "//span[@id='spanLookup_applicationFacilityRating_WIFT001MT']/span")
	private WebElement ApplicationforfinancialfacilitiesMaintenanceFacilityRatingSearch;
	public WebElement Applicationforfinancialfacilities_Maintenance_FacilityRatingSearch() {
		return ApplicationforfinancialfacilitiesMaintenanceFacilityRatingSearch;
	}

	
	
	
	//@FindBy(xpath =  "//td[@id='td_gridtab_applicationFacilityRating_WIFT001MT_1_LINE_NBR']")
	@FindBy(xpath = "//input[@id='gridtab_applicationFacilityRating_WIFT001MT_gs_FRR_RATING']")
	private WebElement ApplicationforfinancialfacilitiesMaintenanceFacilityRating;
	public WebElement Applicationforfinancialfacilities_Maintenance_FacilityRating() {
		return ApplicationforfinancialfacilitiesMaintenanceFacilityRating;
	}
	
	@FindBy(xpath = "//td[@id='next_pagerid_applicationFacilityRating_WIFT001MT']/span")
	private WebElement  FacilityRatingGridNext;
	public WebElement FacilityRatingGridNext() {
		return  FacilityRatingGridNext;
	}
	
	@FindBy(xpath =  "//span[@id='spanLookup_applicationFacilityMarketedBy_WIFT001MT']/span")
	private WebElement ApplicationforfinancialfacilitiesMaintenanceMarketedBySearch;
	public WebElement Applicationforfinancialfacilities_Maintenance_MarketedBySearch() {
		return ApplicationforfinancialfacilitiesMaintenanceMarketedBySearch;
	}
	
	@FindBy(xpath = "//input[@name='applicationFacilityCO.fmsApplVO.MARKETED_BY']")
	private WebElement ApplicationforfinancialfacilitiesMaintenanceMarketedBy;
	public WebElement Applicationforfinancialfacilities_Maintenance_MarketedBy() {
		return ApplicationforfinancialfacilitiesMaintenanceMarketedBy;
	}
	
	
	@FindBy(xpath = "//input[@id='gridtab_applicationFacilityMarketedBy_WIFT001MT_gs_USER_ID']")
	private WebElement ApplicationforfinancialfacilitiesMaintenanceMarketedByFind;
	public WebElement Applicationforfinancialfacilities_Maintenance_MarketedByFind() {
		return ApplicationforfinancialfacilitiesMaintenanceMarketedByFind;
	}
	
	@FindBy(xpath =  "//table[@id='gridtab_applicationFacilityMarketedBy_WIFT001MT']/tbody/tr[2]")
	private WebElement ApplicationforfinancialfacilitiesMaintenanceMarketedBySelect;
	public WebElement Applicationforfinancialfacilities_Maintenance_MarketedBySelect() {
		return ApplicationforfinancialfacilitiesMaintenanceMarketedBySelect;
	}
	
	@FindBy(xpath = "//li[@id='applicationFacilityAdditionDetailsTabs_WIFT001MT']/a/span[text()='Additional Details']")
	private WebElement ApplicationforfinancialfacilitiesMaintenanceAdditionalDetailsTab;
	public WebElement Applicationforfinancialfacilities_Maintenance_AdditionalDetailsTab() {
		return ApplicationforfinancialfacilitiesMaintenanceAdditionalDetailsTab;
	}
	
	@FindBy(xpath = "//span[@id='spanLookup_applicationFacilitylimitcurrency_WIFT001MT']/span")
	private WebElement ApplicationforfinancialfacilitiesMaintenanceAdditionalDetailsTabCurrencyCodeSearch;
	public WebElement Applicationforfinancialfacilities_Maintenance_AdditionalDetailsTab_CurrencyCodeSearch() {
		return ApplicationforfinancialfacilitiesMaintenanceAdditionalDetailsTabCurrencyCodeSearch;
	}
	
	@FindBy(xpath = "//input[@id='gridtab_applicationFacilitylimitcurrency_WIFT001MT_gs_CURRENCY_CODE']")
	private WebElement ApplicationforfinancialfacilitiesMaintenanceAdditionalDetailsTabCurrencyCode;
	public WebElement Applicationforfinancialfacilities_Maintenance_AdditionalDetailsTab_CurrencyCode() {
		return ApplicationforfinancialfacilitiesMaintenanceAdditionalDetailsTabCurrencyCode;
	}
	
	@FindBy(xpath = "//td[@id='next_pagerid_applicationFacilitylimitcurrency_WIFT001MT']/span")
	private WebElement  CurrencyCodeGridNext;
	public WebElement CurrencyCodeGridNext() {
		return  CurrencyCodeGridNext;
	}
	
	@FindBy(xpath = "//input[@name='applicationFacilityCO.TOTAL_AMOUNT']")
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
	
	@FindBy(xpath = "//td[@id='add_ApplicationFacilityLimitDetailsGrid_WIFT001MT']/div/span")
	private WebElement ApplicationforfinancialfacilitiesMaintenanceLimitDetailsTabAddIcon;
	public WebElement Applicationforfinancialfacilities_Maintenance_LimitDetailsTab_AddIcon() {
		return ApplicationforfinancialfacilitiesMaintenanceLimitDetailsTabAddIcon;
	}
	
	@FindBy(xpath = "//span[@id='spanLookup_applicationfacilityLimitDetailsCLASS_WIFT001MT']/span")
	private WebElement ApplicationforfinancialfacilitiesMaintenanceLimitDetailsTabProductClassSearch;
	public WebElement Applicationforfinancialfacilities_Maintenance_LimitDetailsTab_ProductClass_Search() {
		return ApplicationforfinancialfacilitiesMaintenanceLimitDetailsTabProductClassSearch;
	}
	
	@FindBy(xpath = "//input[@id='gridtab_applicationfacilityLimitDetailsCLASS_WIFT001MT_gs_CODE']")
	private WebElement ApplicationforfinancialfacilitiesMaintenanceLimitDetailsTabProductClass;
	public WebElement Applicationforfinancialfacilities_Maintenance_LimitDetailsTab_ProductClass() {
		return ApplicationforfinancialfacilitiesMaintenanceLimitDetailsTabProductClass;
	}
	
	@FindBy(xpath = "//td[@id='next_pagerid_applicationfacilityLimitDetailsCLASS_WIFT001MT']/span")
	private WebElement  ProductClassGridNext;
	public WebElement ProductClassGridNext() {
		return  ProductClassGridNext;
	}
	
	@FindBy(xpath = "//input[@name='applicationFacilityCO.fmsAppLimitDetCO.fmsAppLimitDetVO.CLEAN_FLAG']")
	private WebElement ApplicationforfinancialfacilitiesMaintenanceLimitDetailsTabClean;
	public WebElement Applicationforfinancialfacilities_Maintenance_LimitDetailsTab_Clean() {
		return ApplicationforfinancialfacilitiesMaintenanceLimitDetailsTabClean;
	}
	
	@FindBy(xpath = "//span[@id='spanLookup_applicationfacilityLimitDetailsPURPOSE_OF_FIN_WIFT001MT']/span")
	private WebElement ApplicationforfinancialfacilitiesMaintenanceLimitDetailsTabPurposeOfFinancing;
	public WebElement Applicationforfinancialfacilities_Maintenance_LimitDetailsTab_PurposeOfFinancing() {
		return ApplicationforfinancialfacilitiesMaintenanceLimitDetailsTabPurposeOfFinancing;
	}
	
	@FindBy(xpath = "//td[@id='td_gridtab_applicationfacilityLimitDetailsPURPOSE_OF_FIN_WIFT001MT_4_CODE' and text()='9827']")
	private WebElement ApplicationforfinancialfacilitiesMaintenanceLimitDetailsTabPurposeOfFinancingValue;
	public WebElement Applicationforfinancialfacilities_Maintenance_LimitDetailsTab_PurposeOfFinancingValue() {
		return ApplicationforfinancialfacilitiesMaintenanceLimitDetailsTabPurposeOfFinancingValue;
	}
	
	@FindBy(xpath = "//button[@id='limitDetails_add_btn_WIFT001MT']")
	private WebElement ApplicationforfinancialfacilitiesMaintenanceLimitDetailsTabAdd;
	public WebElement Applicationforfinancialfacilities_Maintenance_LimitDetailsTab_Add() {
		return ApplicationforfinancialfacilitiesMaintenanceLimitDetailsTabAdd;
	}
	
	
	
	@FindBy(xpath = "//span[contains(text(),'Document Details')]")
	private WebElement ApplicationforfinancialfacilitiesMaintenanceDocumentDetailsTab;
	public WebElement Applicationforfinancialfacilities_Maintenance_DocumentDetailsTab() {
		return ApplicationforfinancialfacilitiesMaintenanceDocumentDetailsTab;
	}
	
	
	@FindBy(xpath = "//span[@id='spanLookup_applicationFacilitysolicitor_WIFT001MT']/span")
	private WebElement ApplicationforfinancialfacilitiesMaintenanceDocumentDetailsTabSolicitorNameSearch;
	public WebElement Applicationforfinancialfacilities_Maintenance_DocumentDetailsTab_SolicitorName_Search() {
		return ApplicationforfinancialfacilitiesMaintenanceDocumentDetailsTabSolicitorNameSearch;
	}
	
	@FindBy(xpath = "//input[@id='gridtab_applicationFacilitysolicitor_WIFT001MT_gs_CODE']")
	private WebElement ApplicationforfinancialfacilitiesMaintenanceDocumentDetailsTabSolicitorName;
	public WebElement Applicationforfinancialfacilities_Maintenance_DocumentDetailsTab_SolicitorName() {
		return ApplicationforfinancialfacilitiesMaintenanceDocumentDetailsTabSolicitorName;
	}
	
	@FindBy(xpath = "//td[@id='next_pagerid_applicationFacilitysolicitor_WIFT001MT']/span")
	private WebElement SolicitorNameGridNext;
	public WebElement SolicitorNameGridNext() {
		return SolicitorNameGridNext;
	}
	
	@FindBy(xpath = "//span[@id='spanLookup_applicationFacilityEstimator_WIFT001MT']/span")
	private WebElement ApplicationforfinancialfacilitiesMaintenanceDocumentDetailsTabEstimatorNameSearch;
	public WebElement Applicationforfinancialfacilities_Maintenance_DocumentDetailsTab_EstimatorName_Search() {
		return ApplicationforfinancialfacilitiesMaintenanceDocumentDetailsTabEstimatorNameSearch;
	}
	
	@FindBy(xpath = "//input[@id='gridtab_applicationFacilityEstimator_WIFT001MT_gs_CODE']")
	private WebElement ApplicationforfinancialfacilitiesMaintenanceDocumentDetailsTabEstimatorName;
	public WebElement Applicationforfinancialfacilities_Maintenance_DocumentDetailsTab_EstimatorName() {
		return ApplicationforfinancialfacilitiesMaintenanceDocumentDetailsTabEstimatorName;
	}
	
	@FindBy(xpath = "//td[@id='next_pagerid_applicationFacilityEstimator_WIFT001MT']/span")
	private WebElement EstimatorNameGridNext;
	public WebElement EstimatorNameGridNext() {
		return EstimatorNameGridNext;
	}
	
	
	
	@FindBy(xpath = "//button[@id='applicationfacility_save_as_draft_btn_WIFT001MT']/span[2]")
	private WebElement save;
	public WebElement save() {
		return save;
	}
	
	@FindBy(xpath = "//span[contains(text(),' Validate ')]")
	private WebElement validate;
	public WebElement validate() {
		return validate;
	}
	
	@FindBy(xpath = "//span[contains(text(),' Dismiss ')]")
	private WebElement SendAlert;
	public WebElement SendAlert() {
		return SendAlert;
	}
	
	
	
	@FindBy(id = "_popup_path_sol_confirm_ok")
	private WebElement Confirmok;
	public WebElement Confirmok() {
		return Confirmok;
	}
	
	@FindBy(id = "_popup_path_sol_ok")
	private WebElement Ok;
	public WebElement Ok() {
		return Ok;
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
	
	//*************************862727*********************//
	
	@FindBy(xpath = "//label[text()='Mandatory Purpose of Financing ']//parent::td/input")
	private WebElement FacilityTypeUpdateAfterApproveFacilityDetailsApplicationRequirementsandDetailsMandatoryPurposeofFinancing;
	public WebElement FacilityType_UpdateAfterApprove_FacilityDetails_ApplicationRequirementsandDetails_MandatoryPurposeofFinancing() {
		return FacilityTypeUpdateAfterApproveFacilityDetailsApplicationRequirementsandDetailsMandatoryPurposeofFinancing;
	}
	
	//***********************402669***************************//
	
	@FindBy(xpath = "//span[contains(text(),' Yes ')]")
	private WebElement WifakApplicationPostApproval;
	public WebElement WifakApplication_PostApproval() {
		return WifakApplicationPostApproval;
	}
	
	@FindBy(xpath = "//td[@id= 'applicationFacilityfacilitytypesection_WIFT001MT']/table/tbody/tr[12]")
	private WebElement DemoClick;
	public WebElement Demo_Click() {
		return DemoClick;
	}
	
	
	@FindBy(xpath = "//input[@name='applicationFacilityCO.fmsApplVO.REVOLVING_VALIDITY_DAYS']")
	private WebElement ApplicationforfinancialfacilitiesMaintenanceRevolvingValidity;
	public WebElement Applicationforfinancialfacilities_Maintenance_RevolvingValidity() {
		return ApplicationforfinancialfacilitiesMaintenanceRevolvingValidity;
	}
	
	@FindBy(xpath = "//input[@name='applicationFacilityCO.fmsApplVO.MAX_REVOLVING_TIMES']")
	private WebElement ApplicationforfinancialfacilitiesMaintenanceMaxRevolvingTimes;
	public WebElement Applicationforfinancialfacilities_Maintenance_MaxRevolvingTimes() {
		return ApplicationforfinancialfacilitiesMaintenanceMaxRevolvingTimes;
	}
	
	@FindBy(xpath = "//input[@name='applicationFacilityCO.fmsApplVO.SUBJECT_FULL_REPAYMENT_YN']")
	private WebElement ApplicationforfinancialfacilitiesMaintenanceSubjectToFullRepayment;
	public WebElement Applicationforfinancialfacilities_Maintenance_SubjectToFullRepayment() {
		return ApplicationforfinancialfacilitiesMaintenanceSubjectToFullRepayment;
	}
	
	@FindBy(xpath = "//input[@id='applicationFacilityCurrentUtilization_WIFT001MT']")
	private WebElement ApplicationforfinancialfacilitiesMaintenanceCurrentUtilization;
	public WebElement Applicationforfinancialfacilities_Maintenance_CurrentUtilization() {
		return ApplicationforfinancialfacilitiesMaintenanceCurrentUtilization;
	}
	
	@FindBy(xpath = "//input[@name='applicationFacilityCO.fmsApplVO.TOTAL_APPROVALS']")
	private WebElement ApplicationforfinancialfacilitiesMaintenanceTotalApproval;
	public WebElement Applicationforfinancialfacilities_Maintenance_TotalApproval() {
		return ApplicationforfinancialfacilitiesMaintenanceTotalApproval;
	}
	
	
}
