package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FMSApplicationforFinancialFacilityObj {
	WebDriver driver;

	public FMSApplicationforFinancialFacilityObj(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "GLBVIEW001")
	private WebElement fms_360DegreesView;

	public WebElement fms_360DegreesView() {
		return fms_360DegreesView;
	}

	@FindBy(id = "dashboard_more_scores_btn_GLBVIEW001")
	private WebElement fmsPara_MoreScoresButton;

	public WebElement fmsPara_MoreScoresButton() {
		return fmsPara_MoreScoresButton;
	}

	@FindBy(id = "dashboard_more_scores_btn_GLBVIEW001")
	private WebElement fmsPara_MoreScoresButton_Close;

	public WebElement fmsPara_MoreScoresButton_Close() {
		return fmsPara_MoreScoresButton_Close;
	}

	@FindBy(xpath = "//td[contains(text(),'Parameters')]")
	private WebElement fmsPara_Parameters;

	public WebElement fmsPara_Parameters() {
		return fmsPara_Parameters;
	}

	@FindBy(xpath = "//td[contains(text(),'Facility Custom Fields')]")
	private WebElement fmsPara_FacilityCustomFields;

	public WebElement fmsPara_FacilityCustomFields() {
		return fmsPara_FacilityCustomFields;
	}

	@FindBy(xpath = "//td[contains(text(),'Maintain Facility Custom Fields')]")
	private WebElement fmsPara_MaintainFacilityCustomFields;

	public WebElement fmsPara_MaintainFacilityCustomFields() {
		return fmsPara_MaintainFacilityCustomFields;
	}

	@FindBy(xpath = "//a[@id='P050FLMT']")
	private WebElement fmsPara_MaintainFacilityCustomFields_Maintenance;

	public WebElement fmsPara_MaintainFacilityCustomFields_Maintenance() {
		return fmsPara_MaintainFacilityCustomFields_Maintenance;
	}

	@FindBy(xpath = "//input[@id='_popup_path_sol_confirm_ok']")
	private WebElement fmsPara_MaintainFacilityCustomFields_Maintenance_WarningPopup;

	public WebElement fmsPara_MaintainFacilityCustomFields_Maintenance_WarningPopup() {
		return fmsPara_MaintainFacilityCustomFields_Maintenance_WarningPopup;
	}//input[@id='fmsParamMaintainFacilityCustomFields_code_P050FLMT']

	@FindBy(xpath = "//table//td//div[1]//input[@id='fmsParamMaintainFacilityCustomFields_code_P050FLMT']")
	private WebElement fmsPara_MaintainFacilityCustomFields_Maintenance_Code;

	public WebElement fmsPara_MaintainFacilityCustomFields_Maintenance_Code() {
		return fmsPara_MaintainFacilityCustomFields_Maintenance_Code;
	}

	@FindBy(xpath = "//td//div[1]//input[@id='lookuptxt_fmsParamMaintainFacilityCustomFields_ProductClass_P050FLMT']")
	private WebElement fmsPara_MaintainFacilityCustomFields_Maintenance_ProductClass;

	public WebElement fmsPara_MaintainFacilityCustomFields_Maintenance_ProductClass() {
		return fmsPara_MaintainFacilityCustomFields_Maintenance_ProductClass;
	}

	@FindBy(xpath = "//td//div[1]//span[@id='spanLookup_fmsParamMaintainFacilityCustomFields_ProductClass_P050FLMT']")
	private WebElement fmsPara_MaintainFacilityCustomFields_Maintenance_ProductClassSearch;

	public WebElement fmsPara_MaintainFacilityCustomFields_Maintenance_ProductClassSearch() {
		return fmsPara_MaintainFacilityCustomFields_Maintenance_ProductClassSearch;
	}

	@FindBy(xpath = "//table//tr[1]//td[@id='add_fmsParamMaintainFacilityCustomFieldsDetListGrid_Id_P050FLMT']")
	private WebElement fmsPara_MaintainFacilityCustomFields_Maintenance_AddNewRow;

	public WebElement fmsPara_MaintainFacilityCustomFields_Maintenance_AddNewRow() {
		return fmsPara_MaintainFacilityCustomFields_Maintenance_AddNewRow;
	}

	@FindBy(xpath = "//table//tr//td[@id='td_fmsParamMaintainFacilityCustomFieldsDetListGrid_Id_P050FLMT_1_fmsFacilityCustomFieldsDetVO.NAME']")
	private WebElement fmsPara_MaintainFacilityCustomFields_Maintenance_Name;

	public WebElement fmsPara_MaintainFacilityCustomFields_Maintenance_Name() {
		return fmsPara_MaintainFacilityCustomFields_Maintenance_Name;
	}

	@FindBy(xpath = "//input[@id='new_1683775204630_fmsParaFacilityCustomFieldsDetVO.NAME_lookuptxt_fmsParaParamMaintainFacilityCustomFieldsDetListGrid_Id_P050FLMT']")
	private WebElement fmsPara_MaintainFacilityCustomFields_Maintenance_NameInput;

	public WebElement fmsPara_MaintainFacilityCustomFields_Maintenance_NameInput() {
		return fmsPara_MaintainFacilityCustomFields_Maintenance_NameInput;
	}

	@FindBy(xpath = "//input[@name='lookupTxt_fmsFacilityCustomFieldsDetVO.NAME']/following-sibling::span/span")
	private WebElement fmsPara_MaintainFacilityCustomFields_Maintenance_NameSearch;

	public WebElement fmsPara_MaintainFacilityCustomFields_Maintenance_NameSearch() {
		return fmsPara_MaintainFacilityCustomFields_Maintenance_NameSearch;
	}
	@FindBy(xpath = "//input[@name='fmsFacilityCustomAttVO.FACILITY_CUSTOM_CODE']")
	private WebElement fmsPara_MaintainFacilityCustomFields_Maintenance_FACILITY_CUSTOM_CODE;

	public WebElement fmsPara_MaintainFacilityCustomFields_Maintenance_FACILITY_CUSTOM_CODE() {
		return fmsPara_MaintainFacilityCustomFields_Maintenance_FACILITY_CUSTOM_CODE;
	}

	@FindBy(xpath = "//tr[@class='ui-widget-content jqgrow ui-row-ltr']")
	private WebElement fmsPara_MaintainFacilityCustomFields_Maintenance_FacilityCustomCode_SuggestedRecord;

	public WebElement fmsPara_MaintainFacilityCustomFields_Maintenance_FacilityCustomCode_SuggestedRecord() {
		return fmsPara_MaintainFacilityCustomFields_Maintenance_FacilityCustomCode_SuggestedRecord;
	}
	@FindBy(xpath = "//table//tr//td[6]//input[@class='editable']")
	private WebElement fmsPara_MaintainFacilityCustomFields_Maintenance_LABEL;

	public WebElement fmsPara_MaintainFacilityCustomFields_Maintenance_LABEL() {
		return fmsPara_MaintainFacilityCustomFields_Maintenance_LABEL;
	}

	@FindBy(xpath = "//table//tr//td[11]//input[@class='editable']")
	private WebElement fmsPara_MaintainFacilityCustomFields_Maintenance_LENGTH;

	public WebElement fmsPara_MaintainFacilityCustomFields_Maintenance_LENGTH() {
		return fmsPara_MaintainFacilityCustomFields_Maintenance_LENGTH;
	}

	@FindBy(xpath = "//table//tr//td[12]//input[@class='editable']")
	private WebElement fmsPara_MaintainFacilityCustomFields_Maintenance_DECIMALS;

	public WebElement fmsPara_MaintainFacilityCustomFields_Maintenance_DECIMALS() {
		return fmsPara_MaintainFacilityCustomFields_Maintenance_DECIMALS;
	}

	@FindBy(xpath = "//table//tr//td[13]//input[@class='editable']")
	private WebElement fmsPara_MaintainFacilityCustomFields_Maintenance_CATEGORY;

	public WebElement fmsPara_MaintainFacilityCustomFields_Maintenance_CATEGORY() {
		return fmsPara_MaintainFacilityCustomFields_Maintenance_CATEGORY;
	}

	@FindBy(xpath = "//table//tr//td[14]//input[@class='editable']")
	private WebElement fmsPara_MaintainFacilityCustomFields_Maintenance_MANDATORY;

	public WebElement fmsPara_MaintainFacilityCustomFields_Maintenance_MANDATORY() {
		return fmsPara_MaintainFacilityCustomFields_Maintenance_MANDATORY;
	}

	@FindBy(xpath = "//table//tr//td[15]//input[@class='editable']")
	private WebElement fmsPara_MaintainFacilityCustomFields_Maintenance_ORDERNUMBER;

	public WebElement fmsPara_MaintainFacilityCustomFields_Maintenance_ORDERNUMBER() {
		return fmsPara_MaintainFacilityCustomFields_Maintenance_ORDERNUMBER;
	}

	@FindBy(xpath = "//label[@id='fmsParamMaintainFacilityCustomFieldsFormId_P050FLMT_Save_key']")
	private WebElement fmsPara_MaintainFacilityCustomFields_Maintenance_Save;

	public WebElement fmsPara_MaintainFacilityCustomFields_Maintenance_Save() {
		return fmsPara_MaintainFacilityCustomFields_Maintenance_Save;
	}

	@FindBy(xpath = "//input[@id='_popup_path_sol_confirm_ok']")
	private WebElement fmsPara_MaintainFacilityCustomFields_Maintenance_SaveWarningPopUp;

	public WebElement fmsPara_MaintainFacilityCustomFields_Maintenance_SaveWarningPopUp() {
		return fmsPara_MaintainFacilityCustomFields_Maintenance_SaveWarningPopUp;
	}

	@FindBy(xpath = "//a[@id='P050FLP']")
	private WebElement fmsPara_MaintainFacilityCustomFields_Approve;

	public WebElement fmsPara_MaintainFacilityCustomFields_Approve() {
		return fmsPara_MaintainFacilityCustomFields_Approve;
	}

	@FindBy(xpath = "(//input[@name='CODE'])[2]")
	private WebElement fmsPara_MaintainFacilityCustomFields_Approve_CODE;

	public WebElement fmsPara_MaintainFacilityCustomFields_Approve_CODE() {
		return fmsPara_MaintainFacilityCustomFields_Approve_CODE;
	}

	@FindBy(xpath = "//td[@id='td_fmsParamMaintainFacilityCustomFieldsListGridTbl_Id_P050FLP_1_fmsFacilityCustomFieldsVO.COMP_CODE']")
	private WebElement fmsPara_MaintainFacilityCustomFields_Approve_SuggestedRecord;

	public WebElement fmsPara_MaintainFacilityCustomFields_Approve_SuggestedRecord() {
		return fmsPara_MaintainFacilityCustomFields_Approve_SuggestedRecord;
	}

	@FindBy(xpath = "//label[text()='Approve ']")
	private WebElement fmsPara_MaintainFacilityCustomFields_Approve_ApproveButton;

	public WebElement fmsPara_MaintainFacilityCustomFields_Approve_ApproveButton() {
		return fmsPara_MaintainFacilityCustomFields_Approve_ApproveButton;
	}

	@FindBy(xpath = "//input[@id='_popup_path_sol_ok']")
	private WebElement fmsPara_MaintainFacilityCustomFields_Approve_InformationPopUp;

	public WebElement fmsPara_MaintainFacilityCustomFields_Approve_InformationPopUp() {
		return fmsPara_MaintainFacilityCustomFields_Approve_InformationPopUp;
	}
	// ---------------------FMS---------------------//

	@FindBy(xpath = "//td[text()='REQUEST FOR FINANCIN']")
	private WebElement fms_REQUESTFORFINANCIN;

	public WebElement fms_REQUESTFORFINANCIN() {
		return fms_REQUESTFORFINANCIN;
	}
	@FindBy(xpath = "//td[text()='Request For Financing']")
	private WebElement fms_RequestForFinancing_SubTab;

	public WebElement fms_RequestForFinancing_SubTab() {
		return fms_RequestForFinancing_SubTab;
	}
	@FindBy(xpath = "//span[text()='Maintenance']")
	private WebElement fms_RequestForFinancing_Maintenance;

	public WebElement fms_RequestForFinancing_Maintenance() {
		return fms_RequestForFinancing_Maintenance;
	}
	@FindBy(xpath = "//center[1]//input[@id='_popup_path_sol_confirm_ok']")
	private WebElement fms_Warning_popup;

	public WebElement fms_Warning_popup() {
		return fms_Warning_popup;
	}

	@FindBy(xpath = "//select[@name='requestFinancingCO.fmsRequestFinancingVO.APPLICATION_FOR']")
	private WebElement fms_ReasonForSubmission ;

	public WebElement fms_ReasonForSubmission() {
		return fms_ReasonForSubmission;
	}
	@FindBy(xpath = "//label[text()='Customer ']/../..//div//div//input")
	private WebElement fms_RequestForFinancing_Customer ;

	public WebElement fms_RequestForFinancing_Customer() {
		return fms_RequestForFinancing_Customer;
	}
//	@FindBy(xpath = "//table//td//div//input[@name='requestFinancingCO.fmsRequestFinancingVO.LOAN_TYPE']")
	@FindBy(id = "lookuptxt_requestFinancingFacilityType_CSMRF00MT")
	private WebElement fms_RequestForFinancing_FacilityType  ;

	public WebElement fms_RequestForFinancing_FacilityType() {
		return fms_RequestForFinancing_FacilityType;
	}
	@FindBy(id = "REQUEST FOR FINANCIN / Request For Financing / Maintenance")
	private WebElement randomClick;

	public WebElement randomClick() {
		return randomClick;
	}
	@FindBy(xpath = "//table//td//div//span[@id='spanLookup_requestFinancingFacilityType_CSMRF00MT']")
	private WebElement fms_RequestForFinancing_FacilityTypeSearchIcon  ;

	public WebElement fms_RequestForFinancing_FacilityTypeSearchIcon() {
		return fms_RequestForFinancing_FacilityTypeSearchIcon;
	}
	
//	@FindBy(xpath = "//table//td//div//input[@name='requestFinancingCO.TOTAL_AMOUNT']")
	@FindBy(xpath = "//input[@name='requestFinancingCO.TOTAL_AMOUNT']")

	private WebElement fms_RequestForFinancing_TotalLimit  ;

	public WebElement fms_RequestForFinancing_TotalLimit() {
		return fms_RequestForFinancing_TotalLimit;
	}
	
	@FindBy(xpath = "//span[text()='Disbursement/Sublimit']")
	private WebElement fms_RequestForFinancing_DisbursementSublimitTab  ;

	public WebElement fms_RequestForFinancing_DisbursementSublimitTab() {
		return fms_RequestForFinancing_DisbursementSublimitTab;
	}
	
	@FindBy(xpath = "//table//tr[1]//td[@id='add_RequestFinancingLimitDetailsGridId_CSMRF00MT']")
	private WebElement fms_RequestForFinancing_ProductClass_AddNewRow ;

	public WebElement fms_RequestForFinancing_ProductClass_AddNewRow() {
		return fms_RequestForFinancing_ProductClass_AddNewRow;
	}
	
	@FindBy(xpath = "(//label[text()='Product Class ']/../..//div//div//input)[1]")
	private WebElement fms_RequestForFinancing_ProductClass  ;

	public WebElement fms_RequestForFinancing_ProductClass() {
		return fms_RequestForFinancing_ProductClass;
	}
	@FindBy(xpath = "//button[@id='limitDetails_add_btn_CSMRF00MT']")
	private WebElement fms_RequestForFinancing_ProductClass_Add  ;

	public WebElement fms_RequestForFinancing_ProductClass_Add() {
		return fms_RequestForFinancing_ProductClass_Add;
	}
	@FindBy(xpath = "//label[text()='Save ']")
	private WebElement fms_RequestForFinancing_Save  ;

	public WebElement fms_RequestForFinancing_Save() {
		return fms_RequestForFinancing_Save;
	}
	@FindBy(xpath = "(//div[text()='Confirm save as draft process']//parent::div//following-sibling::center//input)[1]")
	private WebElement fms_RequestForFinancing_Save_ConfrimationPopUp  ;

	public WebElement fms_RequestForFinancing_Save_ConfrimationPopUp() {
		return fms_RequestForFinancing_Save_ConfrimationPopUp;
	}
	@FindBy(xpath = "//label[text()='Validate ']")
	private WebElement fms_RequestForFinancing_Validate  ;

	public WebElement fms_RequestForFinancing_Validate() {
		return fms_RequestForFinancing_Validate;
	}

	@FindBy(xpath = "//td[text()='WIFAK APPLICATION']")
	private WebElement fms_WIFAKAPPLICATION;

	public WebElement fms_WIFAKAPPLICATION() {
		return fms_WIFAKAPPLICATION;
	}

	@FindBy(xpath = "(//td[text()='WIFAK APPLICATION'])[2]")
	private WebElement fms_WIFAKAPPLICATION_Tab2;

	public WebElement fms_WIFAKAPPLICATION_Tab2() {
		return fms_WIFAKAPPLICATION_Tab2;
	}

	@FindBy(xpath = "//span[text()='Application For Financial Facilites']")
	private WebElement fms_WIFAKApplication_ApplicationForFinancialFacilites;

	public WebElement fms_WIFAKApplication_ApplicationForFinancialFacilites() {
		return fms_WIFAKApplication_ApplicationForFinancialFacilites;
	}

	@FindBy(xpath = "//span[text()='Maintenance']")
	private WebElement fms_WIFAKApplication_ApplicationForFinancialFacilites_Maintenance;

	public WebElement fms_WIFAKApplication_ApplicationForFinancialFacilites_Maintenance() {
		return fms_WIFAKApplication_ApplicationForFinancialFacilites_Maintenance;
	}

	@FindBy(xpath = "//input[@id='_popup_path_sol_confirm_ok']")
	private WebElement fms_WIFAKApplication_ApplicationForFinancialFacilites_Maintenance_popup;

	public WebElement fms_WIFAKApplication_ApplicationForFinancialFacilites_Maintenance_popup() {
		return fms_WIFAKApplication_ApplicationForFinancialFacilites_Maintenance_popup;
	}

	@FindBy(xpath = "//select[@id='applicationFacilityApplicationfor_WIFT001MT']")
	private WebElement fms_ApplicationForFinancialFacilites_Maintenance_ApplicationForDropdown;

	public WebElement fms_ApplicationForFinancialFacilites_Maintenance_ApplicationForDropdown() {
		return fms_ApplicationForFinancialFacilites_Maintenance_ApplicationForDropdown;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_applicationFacilitycif_WIFT001MT']")
	private WebElement fms_ApplicationForFinancialFacilites_Maintenance_CifNo;

	public WebElement fms_ApplicationForFinancialFacilites_Maintenance_CifNo() {
		return fms_ApplicationForFinancialFacilites_Maintenance_CifNo;
	}

	@FindBy(xpath = "//span[@id='spanLookup_applicationFacilitycif_WIFT001MT']")
	private WebElement fms_ApplicationForFinancialFacilites_Maintenance_CifNoSearch;

	public WebElement fms_ApplicationForFinancialFacilites_Maintenance_CifNoSearch() {
		return fms_ApplicationForFinancialFacilites_Maintenance_CifNoSearch;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_applicationFacilityFacilityType_WIFT001MT']")
	private WebElement fms_ApplicationForFinancialFacilites_Maintenance_FacilityType;

	public WebElement fms_ApplicationForFinancialFacilites_Maintenance_FacilityType() {
		return fms_ApplicationForFinancialFacilites_Maintenance_FacilityType;
	}

	@FindBy(xpath = "//span[@id='spanLookup_applicationFacilityFacilityType_WIFT001MT']")
	private WebElement fms_ApplicationForFinancialFacilites_Maintenance_FacilityTypeSearch;

	public WebElement fms_ApplicationForFinancialFacilites_Maintenance_FacilityTypeSearch() {
		return fms_ApplicationForFinancialFacilites_Maintenance_FacilityTypeSearch;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_applicationFacilityCountry_WIFT001MT']")
	private WebElement fms_ApplicationForFinancialFacilites_Maintenance_CountryOfFinancing;

	public WebElement fms_ApplicationForFinancialFacilites_Maintenance_CountryOfFinancing() {
		return fms_ApplicationForFinancialFacilites_Maintenance_CountryOfFinancing;
	}

	@FindBy(xpath = "//span[@id='spanLookup_applicationFacilityCountry_WIFT001MT']")
	private WebElement fms_ApplicationForFinancialFacilites_Maintenance_CountryOfFinancingSearch;

	public WebElement fms_ApplicationForFinancialFacilites_Maintenance_CountryOfFinancingSearch() {
		return fms_ApplicationForFinancialFacilites_Maintenance_CountryOfFinancingSearch;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_applicationFacilityRating_WIFT001MT']")
	private WebElement fms_ApplicationForFinancialFacilites_Maintenance_FacilityRating;

	public WebElement fms_ApplicationForFinancialFacilites_Maintenance_FacilityRating() {
		return fms_ApplicationForFinancialFacilites_Maintenance_FacilityRating;
	}

	@FindBy(xpath = "//span[@id='spanLookup_applicationFacilityRating_WIFT001MT']")
	private WebElement fms_ApplicationForFinancialFacilites_Maintenance_FacilityRatingSearch;

	public WebElement fms_ApplicationForFinancialFacilites_Maintenance_FacilityRatingSearch() {
		return fms_ApplicationForFinancialFacilites_Maintenance_FacilityRatingSearch;
	}

	@FindBy(xpath = "//span[text()='Additional Details']")
	private WebElement fms_ApplicationForFinancialFacilites_Maintenance_AdditionalDetails;

	public WebElement fms_ApplicationForFinancialFacilites_Maintenance_AdditionalDetails() {
		return fms_ApplicationForFinancialFacilites_Maintenance_AdditionalDetails;
	}

	@FindBy(xpath = "//input[@id='applicationFacilitytotalvalue_WIFT001MT']")
	private WebElement fms_ApplicationForFinancialFacilites_Maintenance_TotalValue;

	public WebElement fms_ApplicationForFinancialFacilites_Maintenance_TotalValue() {
		return fms_ApplicationForFinancialFacilites_Maintenance_TotalValue;
	}

	@FindBy(xpath = "//input[@id='applicationFacilityofferexpirydate_WIFT001MT']")
	private WebElement fms_ApplicationForFinancialFacilites_Maintenance_OfferExpiryDate;

	public WebElement fms_ApplicationForFinancialFacilites_Maintenance_OfferExpiryDate() {
		return fms_ApplicationForFinancialFacilites_Maintenance_OfferExpiryDate;
	}

	@FindBy(xpath = "//span[contains(text(),'Limit Details')]")
	private WebElement fms_ApplicationForFinancialFacilites_Maintenance_LimitDetails;

	public WebElement fms_ApplicationForFinancialFacilites_Maintenance_LimitDetails() {
		return fms_ApplicationForFinancialFacilites_Maintenance_LimitDetails;
	}

	@FindBy(xpath = "//td[@id='add_ApplicationFacilityLimitDetailsGrid_WIFT001MT']")
	private WebElement fms_ApplicationForFinancialFacilites_Maintenance_AddNewRow;

	public WebElement fms_ApplicationForFinancialFacilites_Maintenance_AddNewRow() {
		return fms_ApplicationForFinancialFacilites_Maintenance_AddNewRow;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_applicationfacilityLimitDetailsCLASS_WIFT001MT']")
	private WebElement fms_ApplicationForFinancialFacilites_Maintenance_ProductClass;

	public WebElement fms_ApplicationForFinancialFacilites_Maintenance_ProductClass() {
		return fms_ApplicationForFinancialFacilites_Maintenance_ProductClass;
	}

	@FindBy(xpath = "//td[@id='add_ApplicationFacilityLimitDetailsGrid_WIFT001MT']")
	private WebElement fms_ApplicationForFinancialFacilites_Maintenance_ProductClassSearch;

	public WebElement fms_ApplicationForFinancialFacilites_Maintenance_ProductClassSearch() {
		return fms_ApplicationForFinancialFacilites_Maintenance_ProductClassSearch;
	}

	@FindBy(xpath = "//button[@id='limitDetails_add_btn_WIFT001MT']")
	private WebElement fms_ApplicationForFinancialFacilites_Maintenance_ProductClassAdd;

	public WebElement fms_ApplicationForFinancialFacilites_Maintenance_ProductClassAdd() {
		return fms_ApplicationForFinancialFacilites_Maintenance_ProductClassAdd;
	}

	@FindBy(xpath = "//span[contains(text(),'Document Details')]")
	private WebElement fms_ApplicationForFinancialFacilites_Maintenance_DocumentDetails;

	public WebElement fms_ApplicationForFinancialFacilites_Maintenance_DocumentDetails() {
		return fms_ApplicationForFinancialFacilites_Maintenance_DocumentDetails;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_applicationFacilitysolicitor_WIFT001MT']")
	private WebElement fms_ApplicationForFinancialFacilites_Maintenance_SolicitorName;

	public WebElement fms_ApplicationForFinancialFacilites_Maintenance_SolicitorName() {
		return fms_ApplicationForFinancialFacilites_Maintenance_SolicitorName;
	}

	@FindBy(xpath = "//span[@id='spanLookup_applicationFacilitysolicitor_WIFT001MT']")
	private WebElement fms_ApplicationForFinancialFacilites_Maintenance_SolicitorNameSearch;

	public WebElement fms_ApplicationForFinancialFacilites_Maintenance_SolicitorNameSearch() {
		return fms_ApplicationForFinancialFacilites_Maintenance_SolicitorNameSearch;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_applicationFacilityEstimator_WIFT001MT']")
	private WebElement fms_ApplicationForFinancialFacilites_Maintenance_EstimatorName;

	public WebElement fms_ApplicationForFinancialFacilites_Maintenance_EstimatorName() {
		return fms_ApplicationForFinancialFacilites_Maintenance_EstimatorName;
	}

	@FindBy(xpath = "//span[@id='spanLookup_applicationFacilityEstimator_WIFT001MT']")
	private WebElement fms_ApplicationForFinancialFacilites_Maintenance_EstimatorNameSearch;

	public WebElement fms_ApplicationForFinancialFacilites_Maintenance_EstimatorNameSearch() {
		return fms_ApplicationForFinancialFacilites_Maintenance_EstimatorNameSearch;
	}

	@FindBy(xpath = "//span[contains(text(),'Main Information')]")
	private WebElement fms_ApplicationForFinancialFacilites_Maintenance_MainInformation;

	public WebElement fms_ApplicationForFinancialFacilites_Maintenance_MainInformation() {
		return fms_ApplicationForFinancialFacilites_Maintenance_MainInformation;
	}

	@FindBy(xpath = "//span[contains(text(),'Save')]")
	private WebElement fms_ApplicationForFinancialFacilites_Maintenance_Save;

	public WebElement fms_ApplicationForFinancialFacilites_Maintenance_Save() {
		return fms_ApplicationForFinancialFacilites_Maintenance_Save;
	}
	
	@FindBy(xpath = "//input[@id='_popup_path_sol_confirm_ok']")
	private WebElement fms_ApplicationForFinancialFacilites_Maintenance_SaveConfrimationPopup;

	public WebElement fms_ApplicationForFinancialFacilites_Maintenance_SaveConfrimationPopup() {
		return fms_ApplicationForFinancialFacilites_Maintenance_SaveConfrimationPopup;
	}
	@FindBy(xpath = "//input[@id='_popup_path_sol_ok']")
	private WebElement fms_ApplicationForFinancialFacilites_Maintenance_SaveSuccessPopup;

	public WebElement fms_ApplicationForFinancialFacilites_Maintenance_SaveSuccessPopup() {
		return fms_ApplicationForFinancialFacilites_Maintenance_SaveSuccessPopup;
	}
	
	@FindBy(xpath = "//span[contains(text(),'Validate')]")
	private WebElement fms_ApplicationForFinancialFacilites_Maintenance_Validate;

	public WebElement fms_ApplicationForFinancialFacilites_Maintenance_Validate() {
		return fms_ApplicationForFinancialFacilites_Maintenance_Validate;
	}
	
	@FindBy(xpath = "//input[@id='_popup_path_sol_confirm_ok']")
	private WebElement fms_ApplicationForFinancialFacilites_Maintenance_ValidateConfrimationPopup;

	public WebElement fms_ApplicationForFinancialFacilites_Maintenance_ValidateConfrimationPopup() {
		return fms_ApplicationForFinancialFacilites_Maintenance_ValidateConfrimationPopup;
	}
	
	@FindBy(xpath = "//input[@id='_popup_path_sol_ok']")
	private WebElement fms_ApplicationForFinancialFacilites_Maintenance_ValidateSuccessPopup;

	public WebElement fms_ApplicationForFinancialFacilites_Maintenance_ValidateSuccessPopup() {
		return fms_ApplicationForFinancialFacilites_Maintenance_ValidateSuccessPopup;
	}
	
	@FindBy(xpath = "//a[@id='WIFT001AP1']")
	private WebElement fms_ApplicationForFinancialFacilites_Maintenance_ApproveLevel1;

	public WebElement fms_ApplicationForFinancialFacilites_Maintenance_ApproveLevel1() {
		return fms_ApplicationForFinancialFacilites_Maintenance_ApproveLevel1;
	}
	
	@FindBy(xpath = "//input[@id='_popup_path_sol_confirm_ok']")
	private WebElement fms_ApplicationForFinancialFacilites_Maintenance_ApproveLevel1WarningPopup;

	public WebElement fms_ApplicationForFinancialFacilites_Maintenance_ApproveLevel1WarningPopup() {
		return fms_ApplicationForFinancialFacilites_Maintenance_ApproveLevel1WarningPopup;
	}
	@FindBy(xpath = "(//td[text()='Clear'])[2]")
	private WebElement fms_ApplicationForFinancialFacilites_Maintenance_Clear;

	public WebElement fms_ApplicationForFinancialFacilites_Maintenance_Clear() {
		return fms_ApplicationForFinancialFacilites_Maintenance_Clear;
	}
	
	@FindBy(xpath = "//td[@id='td_applicationFacilityGridTbl_Id_WIFT001AP1_1_fmsApplVO.CODE']")
	private WebElement fms_ApplicationForFinancialFacilites_Maintenance_OpenTheRecord;

	public WebElement fms_ApplicationForFinancialFacilites_Maintenance_OpenTheRecord() {
		return fms_ApplicationForFinancialFacilites_Maintenance_OpenTheRecord;
	}
	@FindBy(xpath = "//select[@id='applicationFacilityDecision_1_WIFT001AP1']")
	private WebElement fms_ApplicationForFinancialFacilites_Maintenance_Decision;

	public WebElement fms_ApplicationForFinancialFacilites_Maintenance_Decision() {
		return fms_ApplicationForFinancialFacilites_Maintenance_Decision;
	}
	@FindBy(xpath = "//button[@id='applicationfacility_approvelevel1_btn_WIFT001AP1']")
	private WebElement fms_ApplicationForFinancialFacilites_Maintenance_Submit;

	public WebElement fms_ApplicationForFinancialFacilites_Maintenance_Submit() {
		return fms_ApplicationForFinancialFacilites_Maintenance_Submit;
	}
	@FindBy(xpath = "//input[@id='_popup_path_sol_confirm_ok']")
	private WebElement fms_ApplicationForFinancialFacilites_Maintenance_SubmitConfrimationPopup;

	public WebElement fms_ApplicationForFinancialFacilites_Maintenance_SubmitConfrimationPopup() {
		return fms_ApplicationForFinancialFacilites_Maintenance_SubmitConfrimationPopup;
	}
	
	@FindBy(xpath = "//input[@id='_popup_path_sol_ok']")
	private WebElement fms_ApplicationForFinancialFacilites_Maintenance_SubmitSuccessPopup;

	public WebElement fms_ApplicationForFinancialFacilites_Maintenance_SubmitSuccessPopup() {
		return fms_ApplicationForFinancialFacilites_Maintenance_SubmitSuccessPopup;
	}
	//-------------------IIS Param-------------------//
	@FindBy(xpath = "//td[text()='Product Class']")
	private WebElement fmsIISPara_ProductClass;
	public WebElement fmsIISPara_ProductClass() {
		return fmsIISPara_ProductClass;
	}
	
	@FindBy(xpath = "//span[text()='Maintenance']")
	private WebElement fmsIISPara_ProductClass_Maintenance;
	public WebElement fmsIISPara_ProductClass_Maintenance() {
		return fmsIISPara_ProductClass_Maintenance;
	}
	
	@FindBy(xpath = "//span//a[@id='infoBarSearchButton_M003MT']")
	private WebElement fmsIISPara_ProductClass_Maintenance_Search;
	public WebElement fmsIISPara_ProductClass_Maintenance_Search() {
		return fmsIISPara_ProductClass_Maintenance_Search;
	}
	
	@FindBy(xpath = "//div//input[@id='iISProductClassListGridTbl_Id_M003MT_gs_trsctrlclassVO.CLASS']")
	private WebElement fmsIISPara_ProductClass_SearchClass;
	public WebElement fmsIISPara_ProductClass_SearchClass() {
		return fmsIISPara_ProductClass_SearchClass;
	}
	
	@FindBy(xpath = "//tr[@id='1']")
	private WebElement fmsIISPara_ProductClass_SuggestedRecord;
	public WebElement fmsIISPara_ProductClass_SuggestedRecord() {
		return fmsIISPara_ProductClass_SuggestedRecord;
	}
	
	@FindBy(xpath = "//span[text()='Profit Calculation']")
	private WebElement fmsIISPara_ProductClass_ProfitCalculation;
	public WebElement fmsIISPara_ProductClass_ProfitCalculation() {
		return fmsIISPara_ProductClass_ProfitCalculation;
	}
	
	@FindBy(xpath = "//td//input[@id='iisProductClassFloatingRate_M003MT']")
	private WebElement fmsIISPara_ProductClass_FloatingRate;
	public WebElement fmsIISPara_ProductClass_FloatingRate() {
		return fmsIISPara_ProductClass_FloatingRate;
	}
}
