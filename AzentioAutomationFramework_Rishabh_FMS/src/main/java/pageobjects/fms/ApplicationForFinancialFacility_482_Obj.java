package pageobjects.fms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ApplicationForFinancialFacility_482_Obj {
	WebDriver driver;

	public ApplicationForFinancialFacility_482_Obj(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//td[text()='REQUEST FOR FINANCIN']/preceding-sibling::td/span/span")
	private WebElement requestForFinancingMenu;

	public WebElement requestForFinancingMenu() {
		return requestForFinancingMenu;
	}

	@FindBy(xpath = "//td[text()='Request For Financing']/preceding-sibling::td/span/span")
	private WebElement requestForFinancingSubMenu;

	public WebElement requestForFinancingSubMenu() {
		return requestForFinancingSubMenu;
	}

	@FindBy(id = "CSMRF00MT")
	private WebElement requestForFinancingMaintenanceScreen;

	public WebElement requestForFinancingMaintenanceScreen() {
		return requestForFinancingMaintenanceScreen;
	}

	@FindBy(id = "requestFinancingApplicationFor_CSMRF00MT")
	private WebElement reasonForSubmissionSelect;

	public WebElement reasonForSubmissionSelect() {
		return reasonForSubmissionSelect;
	}

	@FindBy(id = "requestFinancingNewRequestDt_CSMRF00MT")
	private WebElement requestDateValidation;

	public WebElement requestDateValidation() {
		return requestDateValidation;
	}

	@FindBy(id = "lookuptxt_requestFinanacingCif_CSMRF00MT")
	private WebElement customerCIF;

	public WebElement customerCIF() {
		return customerCIF;
	}

	@FindBy(id = "REQUEST FOR FINANCIN / Request For Financing / Maintenance")
	private WebElement randomClick;

	public WebElement randomClick() {
		return randomClick;
	}

	@FindBy(id = "lookuptxt_requestFinancingFacilityType_CSMRF00MT")
	private WebElement facilityTypeInRequestForFinancingScreen;

	public WebElement facilityTypeInRequestForFinancingScreen() {
		return facilityTypeInRequestForFinancingScreen;
	}

	@FindBy(id = "requestFinancingFacilityTypeDesc_CSMRF00MT")
	private WebElement facilityNameValidationInRequestForFinancingScreen;

	public WebElement facilityNameValidationInRequestForFinancingScreen() {
		return facilityNameValidationInRequestForFinancingScreen;
	}

	@FindBy(id = "requestFinancingCifShortNameEng_CSMRF00MT")
	private WebElement customerNameValidationInRequestForFinancingScreen;

	public WebElement customerNameValidationInRequestForFinancingScreen() {
		return customerNameValidationInRequestForFinancingScreen;
	}

	@FindBy(xpath = "//input[@name='requestFinancingCO.TOTAL_AMOUNT']")
	private WebElement totalLimitInRequestForFinancingScreen;

	public WebElement totalLimitInRequestForFinancingScreen() {
		return totalLimitInRequestForFinancingScreen;
	}
	
	
	@FindBy(xpath = "//input[@name = 'requestFinancingCO.fmsRequestFinancingVO.ACC_BR']")
	private WebElement ACC_BR_InRequestForFinancingScreen;

	public WebElement ACC_BR_InRequestForFinancingScreen() {
		return ACC_BR_InRequestForFinancingScreen;
	}
	
	
	@FindBy(xpath = "//input[@name = 'requestFinancingCO.fmsRequestFinancingVO.ACC_CY']")
	private WebElement ACC_CY_InRequestForFinancingScreen;

	public WebElement ACC_CY_InRequestForFinancingScreen() {
		return ACC_CY_InRequestForFinancingScreen;
	}
	
	@FindBy(xpath = "//input[@name = 'requestFinancingCO.fmsRequestFinancingVO.ACC_GL']")
	private WebElement ACC_GL_InRequestForFinancingScreen;

	public WebElement ACC_GL_InRequestForFinancingScreen() {
		return ACC_GL_InRequestForFinancingScreen;
	}
	
	@FindBy(xpath = "//input[@name = 'requestFinancingCO.fmsRequestFinancingVO.ACC_CIF']")
	private WebElement ACC_CIF_InRequestForFinancingScreen;

	public WebElement ACC_CIF_InRequestForFinancingScreen() {
		return ACC_CIF_InRequestForFinancingScreen;
	}
	
	@FindBy(xpath = "//input[@id = 'lookuptxt_requestFinancingFacilityTypetFinAccSlNo_CSMRF00MT']")
	private WebElement ACC_SL_InRequestForFinancingScreen;

	public WebElement ACC_SL_InRequestForFinancingScreen() {
		return ACC_SL_InRequestForFinancingScreen;
	}
	
	
	

	@FindBy(xpath = "requestFinancingCyRate_CSMRF00MT")
	private WebElement cvValueValidationInRequestForFinancingScreen;

	public WebElement cvValueValidationInRequestForFinancingScreen() {
		return cvValueValidationInRequestForFinancingScreen;
	}

	@FindBy(xpath = "//*[@id='requestFinancingLimitDtlsTabs_CSMRF00MT']")
	private WebElement disbursementOrSublimitInRequestForFinancingScreen;

	public WebElement disbursementOrSublimitInRequestForFinancingScreen() {
		return disbursementOrSublimitInRequestForFinancingScreen;
	}

	@FindBy(xpath = "//*[@id='add_RequestFinancingLimitDetailsGridId_CSMRF00MT']/div/span")
	private WebElement addIconInDisbursementOrSublimitScreen;

	public WebElement addIconInDisbursementOrSublimitScreen() {
		return addIconInDisbursementOrSublimitScreen;
	}

	@FindBy(xpath = "//input[@name='requestFinancingCO.requestFinancingLimitCO.fmsAppLimitDetVO.CLASS']")
	private WebElement productClassInLimitDetailsPopUp;

	public WebElement productClassInLimitDetailsPopUp() {
		return productClassInLimitDetailsPopUp;
	}

	@FindBy(id = "requestFinancingLimitDetailsClassDesc_CSMRF00MT")
	private WebElement productClassNameInLimitDetailsPopUp;

	public WebElement productClassNameInLimitDetailsPopUp() {
		return productClassNameInLimitDetailsPopUp;
	}

	@FindBy(xpath = "//input[@id='requestFinancingLimitDetailsRfNewMargin_CSMRF00MT']")
	private WebElement marginValueInLimitDetailsPopUp;

	public WebElement marginValueInLimitDetailsPopUp() {
		return marginValueInLimitDetailsPopUp;
	}

	@FindBy(xpath = "//button[@id='limitDetails_add_btn_CSMRF00MT']")
	private WebElement addButtonInLimitDetailsPopUp;

	public WebElement addButtonInLimitDetailsPopUp() {
		return addButtonInLimitDetailsPopUp;
	}

	@FindBy(xpath = "//button[@id='limitDetails_add_btn_WIFT001MT']")
	private WebElement addButtonInLimitDetailsPopUpWifakapplication;

	public WebElement addButtonInLimitDetailsPopUpWifakapplication() {
		return addButtonInLimitDetailsPopUpWifakapplication;
	}

	@FindBy(xpath = "//*[@id=\"requestFinancingFormId_CSMRF00MT_save_key\"]")
	private WebElement savebuttonInRequestForFinancingScreenMaintenance;

	public WebElement savebuttonInRequestForFinancingScreenMaintenance() {
		return savebuttonInRequestForFinancingScreenMaintenance;
	}

	@FindBy(id = "_popup_path_sol_confirm_ok")
	private WebElement okButtonInConfirmationPopUp;

	public WebElement okButtonInConfirmationPopUp() {
		return okButtonInConfirmationPopUp;
	}

	@FindBy(id = "_popup_path_sol_confirm_ok")
	private WebElement okButtonInWarningPopUp;

	public WebElement okButtonInWarningPopUp() {
		return okButtonInWarningPopUp;
	}

	@FindBy(xpath = "//div[text()='Success']/parent::div/following-sibling::div/div")
	private WebElement getRequestIdInRequestForFinancingScreen;

	public WebElement getRequestIdInRequestForFinancingScreen() {
		return getRequestIdInRequestForFinancingScreen;
	}

	@FindBy(id = "_popup_path_sol_ok")
	private WebElement okButtonInSucessPopUp;

	public WebElement okButtonInSucessPopUp() {
		return okButtonInSucessPopUp;
	}

	@FindBy(id = "_popup_path_sol_ok")
	private WebElement okButtonInInformationPopUp;

	public WebElement okButtonInInformationPopUp() {
		return okButtonInInformationPopUp;
	}

	@FindBy(id = "requestFinancingFormId_CSMRF00MT_Validate_key")
	private WebElement validateButtonInRequestForFinancingScreen;

	public WebElement validateButtonInRequestForFinancingScreen() {
		return validateButtonInRequestForFinancingScreen;
	}

	@FindBy(xpath = "//input[@value='Yes ']")
	private WebElement confirmDoYouWantToProceedYes;

	public WebElement confirmDoYouWantToProceedYes() {
		return confirmDoYouWantToProceedYes;
	}

	@FindBy(id = "requestForFinance_save_btn_CSMRF00MT")
	private WebElement okButtonInSucesssPopUp;

	public WebElement okButtonInSucesssPopUp() {
		return okButtonInSucesssPopUp;
	}

	@FindBy(id = "CSMRF00P1")
	private WebElement approvalLevel1InRequestForFinancingScreen;

	public WebElement approvalLevel1InRequestForFinancingScreen() {
		return approvalLevel1InRequestForFinancingScreen;
	}

	@FindBy(id = "requestFinancingGridTbl_Id_CSMRF00P1_gs_fmsRequestFinancingVO.CODE")
	private WebElement searchApprovedFacilityRecordInApprovalLevel1;

	public WebElement searchApprovedFacilityRecordInApprovalLevel1() {
		return searchApprovedFacilityRecordInApprovalLevel1;
	}

	@FindBy(id = "td_requestFinancingGridTbl_Id_CSMRF00P1_1_fmsRequestFinancingVO.CODE")
	private WebElement selectApprovedFacilityRecordInApprovalLevel1;

	public WebElement selectApprovedFacilityRecordInApprovalLevel1() {
		return selectApprovedFacilityRecordInApprovalLevel1;
	}

	@FindBy(xpath = "//li[@id='customerGradingRecommendationsTab_CSMRF00P1']//child::span")
	private WebElement customerGradingRecommendation;

	public WebElement customerGradingRecommendation() {
		return customerGradingRecommendation;
	}

	@FindBy(xpath = "//label[text()='Decision ']//parent::td//following-sibling::td//Select[@id='requestDecisionForward_1_CSMRF00P1']")
	private WebElement selectDecisionInApprovalLevel1Reccommendation;

	public WebElement selectDecisionInApprovalLevel1Reccommendation() {
		return selectDecisionInApprovalLevel1Reccommendation;
	}

	@FindBy(xpath = "//label[text()='Decision ']//parent::td//following-sibling::td//Select[@id='requestDecisionForwardP1_CSMRF00P1']")
	private WebElement selectDecisionCommitteInApprovalLevel1Reccommendation;

	public WebElement selectDecisionCommitteInApprovalLevel1Reccommendation() {
		return selectDecisionCommitteInApprovalLevel1Reccommendation;
	}

	@FindBy(id = "requestP1approvalCommitte_CSMRF00P1")
	private WebElement selectApprovalCommitteInApprovalLevel1Reccommendation;

	public WebElement selectApprovalCommitteInApprovalLevel1Reccommendation() {
		return selectApprovalCommitteInApprovalLevel1Reccommendation;
	}

	@FindBy(xpath = "//button[@id='requestForFinance_approve_btn_CSMRF00P1']")
	private WebElement approveButtonInApprovalLevel1;

	public WebElement approveButtonInApprovalLevel1() {
		return approveButtonInApprovalLevel1;
	}

	@FindBy(xpath = "//span[text()='Approval Committee Recommendations ']")
	private WebElement approvalCommitteeRecommendations;

	public WebElement approvalCommitteeRecommendations() {
		return approvalCommitteeRecommendations;
	}

	@FindBy(id = "requestFinancingGridTbl_Id_CSMRF00AC_gs_fmsRequestFinancingVO.CODE")
	private WebElement searchApprovedFacilityRecordInApprovalCommitteRecommendations;

	public WebElement searchApprovedFacilityRecordInApprovalCommitteRecommendations() {
		return searchApprovedFacilityRecordInApprovalCommitteRecommendations;
	}

	@FindBy(id = "lookuptxt_requestFinancingLimitDetailsClassType_CSMRF00MT")
	private WebElement productClassRandomClick;

	public WebElement productClassRandomClick() {
		return productClassRandomClick;
	}

	// ***********************************************market field not
	// editable***********************************************//
	@FindBy(xpath = "//td[text()='Collateral Management']")
	private WebElement fms_CollateralManagementMainMenu;

	public WebElement fms_CollateralManagementMainMenu() {
		return fms_CollateralManagementMainMenu;
	}

	@FindBy(id = "T014MT")
	private WebElement fms_MaintenanceSubMenu;

	public WebElement fms_MaintenanceSubMenu() {
		return fms_MaintenanceSubMenu;
	}

	@FindBy(id = "lookuptxt_collateralManagementCollateralType_T014MT")
	private WebElement fms_SearchCollateralTypeInMaintenanceScreen;

	public WebElement fms_SearchCollateralTypeInMaintenanceScreen() {
		return fms_SearchCollateralTypeInMaintenanceScreen;
	}

	@FindBy(id = "fmscollateralValidFrom_T014MT")
	private WebElement fms_EnterValidFromDateInMaintenanceScreen;

	public WebElement fms_EnterValidFromDateInMaintenanceScreen() {
		return fms_EnterValidFromDateInMaintenanceScreen;
	}

	@FindBy(id = "fmscollateralValidTo_T014MT")
	private WebElement fms_EnterValidToDateInMaintenanceScreen;

	public WebElement fms_EnterValidToDateInMaintenanceScreen() {
		return fms_EnterValidToDateInMaintenanceScreen;
	}

	@FindBy(id = "fmscollateralBriefNameEng_T014MT")
	private WebElement fms_EnterValueForBriefDescriptionInMaintenanceScreen;

	public WebElement fmsEnterValueForBriefDescriptionInMaintenanceScreen() {

		return fms_EnterValueForBriefDescriptionInMaintenanceScreen;

	}

	@FindBy(id = "fmscollateralLongNameEng_T014MT")
	private WebElement fms_EnterValueForLongDescriptionInMaintenanceScreen;

	public WebElement fms_EnterValueForLongDescriptionInMaintenanceScreen() {

		return fms_EnterValueForLongDescriptionInMaintenanceScreen;

	}

	@FindBy(id = "lookuptxt_fmscollateralCif_T014MT")
	private WebElement fms_SearchCIFNoInMaintenanceScreen;

	public WebElement fms_SearchCIFNoInMaintenanceScreen() {
		return fms_SearchCIFNoInMaintenanceScreen;

	}

	@FindBy(id = "_popup_path_sol_confirm_ok")
	private WebElement fms_ClickOkButtonInConfirmPopUpMenu;

	public WebElement fms_ClickOkButtonInConfirmPopUpMenu() {

		return fms_ClickOkButtonInConfirmPopUpMenu;

	}

	@FindBy(id = "lookuptxt_fmscollateralCurrency_T014MT")
	private WebElement fms_SearchCollateralCurrencyInMaintenanceScreen;

	public WebElement fms_SearchCollateralCurrencyInMaintenanceScreen() {

		return fms_SearchCollateralCurrencyInMaintenanceScreen;

	}

	@FindBy(id = "collateralManagementAdditionDetailsTabs_T014MT")
	private WebElement fms_ValidateAdditionalDetailsTabIsDisableInMaintenanceScreen;

	public WebElement fms_ValidateAdditionalDetailsTabIsDisableInMaintenanceScreen() {

		return fms_ValidateAdditionalDetailsTabIsDisableInMaintenanceScreen;

	}

//****************************************WIFAK Application******************************************************//
	@FindBy(xpath = "//td[text()='VYSAKH - RETAIL']/ancestor::h3/parent::div/following::div/h3//td[text()='WIFAK APPLICATION']")
	private WebElement fms_WifakApplicationMainMenu;

	public WebElement fmsWifakApplicationMainMenu() {
		return fms_WifakApplicationMainMenu;
	}

	@FindBy(xpath = "//td[text()='VYSAKH - RETAIL']/ancestor::h3/parent::div/following::div/ul/div//a//td[text()='WIFAK APPLICATION']")
	private WebElement fms_WifakApplicationInWifakApplication;

	public WebElement fmsWifakApplicationInWifakApplication() {
		return fms_WifakApplicationInWifakApplication;
	}

	@FindBy(xpath = "//div[@id='_selenuimWIFT001']//td[text()='Application For Financial Facilities']")
	private WebElement fms_ApplicationForFinancialFacilitiesInWifalkApplicationSubMenu;

	public WebElement fmsApplicationForFinancialFacilitiesInWifalkApplicationSubMenu() {
		return fms_ApplicationForFinancialFacilitiesInWifalkApplicationSubMenu;
	}

	@FindBy(id = "WIFT001MT")
	private WebElement fms_MaintenanceInApplicationForFinancialFacilities;

	public WebElement fmsMaintenanceInApplicationForFinancialFacilities() {
		return fms_MaintenanceInApplicationForFinancialFacilities;
	}

	@FindBy(xpath = "//select[@id='applicationFacilityApplicationfor_WIFT001MT']")
	private WebElement main_application_for_dropdown;

	public WebElement mainApplicationForDropdown() {
		return main_application_for_dropdown;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_applicationFacilitycif_WIFT001MT']")
	private WebElement main_cif_no;

	public WebElement mainCIFNo() {
		return main_cif_no;
	}

	// Touch the screen once
	@FindBy(xpath = "//label[@id='applicationfacilityFormId_WIFT001MT_CIF_No_key']")
	private WebElement cif_touch;

	public WebElement cifTouch() {
		return cif_touch;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_applicationFacilityFacilityType_WIFT001MT']")
	private WebElement main_facility_type;

	public WebElement mainFacilityType() {
		return main_facility_type;
	}

	@FindBy(xpath = "//label[@id='applicationfacilityFormId_WIFT001MT_FacilityType_key']")
	private WebElement facility_touch;

	public WebElement facilityTouch() {
		return facility_touch;
	}
	
	
	@FindBy(xpath = "//select[@id='applicationFacilityRevolvingOneoff_WIFT001MT']")
	private WebElement main_country_of_financing_RevolvingOneoff_DropDown;

	public WebElement mainCountryOfFinancingRevolvingOneoffDropDown() {
		return main_country_of_financing_RevolvingOneoff_DropDown;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_applicationFacilityCountry_WIFT001MT']")
	private WebElement main_country_of_financing;

	public WebElement mainCountryOfFinancing() {
		return main_country_of_financing;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_applicationFacilityRating_WIFT001MT']")
	private WebElement main_facility_rating;

	public WebElement mainFacilityRating() {
		return main_facility_rating;
	}

	@FindBy(xpath = "//li[@id='applicationFacilityAdditionDetailsTabs_WIFT001MT']")
	private WebElement main_additional_tab;

	public WebElement mainAdditionalTab() {
		return main_additional_tab;
	}

	@FindBy(xpath = "//label[@id='applicationfacilityFormId_WIFT001MT_total_value_key']")
	private WebElement main_additional_tab_screen;

	public WebElement mainAdditionalTabScreen() {
		return main_additional_tab_screen;
	}

	@FindBy(xpath = "//input[@id='applicationFacilitytotalvalue_WIFT001MT']")
	private WebElement main_additional_tab_total_value;

	public WebElement mainAdditionalTabTotalValue() {
		return main_additional_tab_total_value;
	}

	@FindBy(xpath = "//input[@id='applicationFacilityofferexpirydate_WIFT001MT']")
	private WebElement offerExpirationMainAdditionalTab_WIFAKApplication;

	public WebElement offerExpirationMainAdditionalTab_WIFAKApplication() {
		return offerExpirationMainAdditionalTab_WIFAKApplication;
	}

	@FindBy(xpath = "//div[text()='[1904] Value Should Be Between Facility Type Values']")
	private WebElement minValueValidation;

	public WebElement minValueValidation() {
		return minValueValidation;
	}

	@FindBy(xpath = "//div[text()='[20191] Value should be between 0.01 and 999999999999.99']")
	private WebElement maxValueValidation;

	public WebElement maxValueValidation() {
		return maxValueValidation;
	}

	@FindBy(id = "_popup_path_sol_ok")
	private WebElement okbuttonInFacilityValuePopUp;

	public WebElement okbuttonInFacilityValuePopUp() {
		return okbuttonInFacilityValuePopUp;
	}

	@FindBy(id = "applicationFacilityfinancedamount_WIFT001MT")
	private WebElement financeAmountRandomClick;

	public WebElement financeAmountRandomClick() {
		return financeAmountRandomClick;
	}

	@FindBy(id = "applicationFacilitydownpaymentperc_WIFT001MT")
	private WebElement downPaymentPercentage;

	public WebElement downPaymentPercentage() {
		return downPaymentPercentage;
	}

	@FindBy(id = "applicationFacilitydownpayment_WIFT001MT")
	private WebElement downPaymentValue;

	public WebElement downPaymentValue() {
		return downPaymentValue;
	}

	@FindBy(id = "applicationFacilityDownPaymentToVendorPerc_WIFT001MT")
	private WebElement downPaymentToVendorPercentage;

	public WebElement downPaymentToVendorPercentage() {
		return downPaymentToVendorPercentage;
	}

	@FindBy(id = "applFacilityDownPaymentToVendor_WIFT001MT")
	private WebElement downPaymentToVendorValue;

	public WebElement downPaymentToVendorValue() {
		return downPaymentToVendorValue;
	}

	@FindBy(id = "applicationFacilitychargeamount_WIFT001MT")
	private WebElement downPaymentRandomClick;

	public WebElement downPaymentRandomClick() {
		return downPaymentRandomClick;
	}

	@FindBy(id = "applFacilityTotalDownPaymentPerc_WIFT001MT")
	private WebElement totalDownPaymentPercentage;

	public WebElement totalDownPaymentPercentage() {
		return totalDownPaymentPercentage;
	}

	@FindBy(id = "applFacilityTotalDownPayment_WIFT001MT")
	private WebElement totalDownPaymentValue;

	public WebElement totalDownPaymentValue() {
		return totalDownPaymentValue;
	}

	@FindBy(xpath = "//div[contains(text(),'[20190] Down Payment cannot be greater than Total Amount.')]")
	private WebElement downPaymentGreaterThanTotalAmountValidation;

	public WebElement downPaymentGreaterThanTotalAmountValidation() {
		return downPaymentGreaterThanTotalAmountValidation;
	}

	@FindBy(id = "_popup_path_sol_ok")
	private WebElement downPaymentPopUpOk;

	public WebElement downPaymentPopUpOk() {
		return downPaymentPopUpOk;
	}
	// **********************economic and sub economic
	// code************************************************************//

	@FindBy(xpath = "//td[text()='CIF Parameters']//preceding-sibling::td")
	private WebElement CIFparameterSubMenu_CSM;

	public WebElement CIFparameterSubMenu_CSM() {
		return CIFparameterSubMenu_CSM;
	}

	@FindBy(xpath = "//td[text()='Parameters']//preceding-sibling::td")
	private WebElement parameterMainMenu_CSM;

	public WebElement parameterMainMenu_CSM() {
		return parameterMainMenu_CSM;
	}

	@FindBy(xpath = "//td[text()='Parameters']//preceding-sibling::td")
	private WebElement parameterMainMenu_FMS;

	public WebElement parameterMainMenu_FMS() {
		return parameterMainMenu_FMS;
	}

	@FindBy(xpath = "//td[text()='Economic Sector']/preceding-sibling::td")
	private WebElement economicSectorMenu_CSM;

	public WebElement economicSectorMenu_CSM() {
		return economicSectorMenu_CSM;
	}

	@FindBy(xpath = "//td[text()='Sub Economic Sector']/preceding-sibling::td")
	private WebElement subEconomicSectorMenu_CSM;

	public WebElement subEconomicSectorMenu_CSM() {
		return subEconomicSectorMenu_CSM;
	}

	@FindBy(id = "P009MT")
	private WebElement maintenanceSubEconomicSector_CSM;

	public WebElement maintenanceSubEconomicSector_CSM() {
		return maintenanceSubEconomicSector_CSM;
	}

	@FindBy(id = "P008MT")
	private WebElement maintenanceEconomicSector_CSM;

	public WebElement maintenanceEconomicSector_CSM() {
		return maintenanceEconomicSector_CSM;
	}

	@FindBy(id = "sector_code_P008MT")
	private WebElement sectorCodeEconomicSector_CSM;

	public WebElement sectorCodeEconomicSector_CSM() {
		return sectorCodeEconomicSector_CSM;
	}

	@FindBy(xpath = "//input[@id='sector_code_P008MT']")
	private WebElement searchCodeEconomicSector_CSM;

	public WebElement searchCodeEconomicSector_CSM() {
		return searchCodeEconomicSector_CSM;
	}

	@FindBy(xpath = "//input[@id='brief_desc_eng_P008MT']")
	private WebElement briefNameEconomicSector_CSM;

	public WebElement briefNameEconomicSector_CSM() {
		return briefNameEconomicSector_CSM;
	}

	@FindBy(xpath = "//input[@id='brief_desc_arab_P008MT']")
	private WebElement briefNameArabEconomicSector_CSM;

	public WebElement briefNameArabEconomicSector_CSM() {
		return briefNameArabEconomicSector_CSM;
	}

	@FindBy(xpath = "//button[@id='economicSectorMaint_Maint_save_P008MT']")
	private WebElement saveButtonEconomicSector_CSM;

	public WebElement saveButtonEconomicSector_CSM() {
		return saveButtonEconomicSector_CSM;
	}

	@FindBy(id = "_popup_path_sol_confirm_ok")
	private WebElement okButtonInConfirmEconomicSector_CSM;

	public WebElement okButtonInConfirmEconomicSector_CSM() {
		return okButtonInConfirmEconomicSector_CSM;
	}

	@FindBy(id = "_popup_path_sol_ok")
	private WebElement okButtonInSucessPopUpEconomicSector_CSM;

	public WebElement okButtonInSucessPopUpEconomicSector_CSM() {
		return okButtonInSucessPopUpEconomicSector_CSM;
	}

	@FindBy(id = "P008P")
	private WebElement approveScreenEconomicSector_CSM;

	public WebElement approveScreenEconomicSector_CSM() {
		return approveScreenEconomicSector_CSM;
	}

	@FindBy(id = "P009P")
	private WebElement approveScreenSubEconomicSector_CSM;

	public WebElement approveScreenSubEconomicSector_CSM() {
		return approveScreenSubEconomicSector_CSM;
	}

	@FindBy(id = "economicSectorList_GridTbl_Id_P008P_gs_ecoSectorsVO.SECTOR_CODE")
	private WebElement searchCodeApproveScreenEconomicSector_CSM;

	public WebElement searchCodeApproveScreenEconomicSector_CSM() {
		return searchCodeApproveScreenEconomicSector_CSM;
	}

	@FindBy(id = "td_economicSectorList_GridTbl_Id_P008P_1_ecoSectorsVO.SECTOR_CODE")
	private WebElement selectSearchedCodeApproveScreenEconomicSector_CSM;

	public WebElement selectSearchedCodeApproveScreenEconomicSector_CSM() {
		return selectSearchedCodeApproveScreenEconomicSector_CSM;
	}

	@FindBy(xpath = "//label[text()='Approve ']/parent::span/preceding-sibling::span")
	private WebElement approveButtonEconomicSector_CSM;

	public WebElement approveButtonEconomicSector_CSM() {
		return approveButtonEconomicSector_CSM;
	}

	@FindBy(xpath = "//label[text()='Approve ']/parent::span/preceding-sibling::span")
	private WebElement approveButtonSubEconomicSector_CSM;

	public WebElement approveButtonSubEconomicSector_CSM() {
		return approveButtonSubEconomicSector_CSM;
	}

	@FindBy(id = "sector_code_P009MT")
	private WebElement selectSectorKeySubEconomicSector_CSM;

	public WebElement selectSectorKeySubEconomicSector_CSM() {
		return selectSectorKeySubEconomicSector_CSM;
	}

	@FindBy(id = "sub_sector_code_P009MT")
	private WebElement subSectorCodeSubEconomicSector_CSM;

	public WebElement subSectorCodeSubEconomicSector_CSM() {
		return subSectorCodeSubEconomicSector_CSM;
	}

	@FindBy(id = "brief_desc_eng_P009MT")
	private WebElement briefNameSubEconomicSector_CSM;

	public WebElement briefNameSubEconomicSector_CSM() {
		return briefNameSubEconomicSector_CSM;
	}

	@FindBy(xpath = "//input[@id='brief_desc_arab_P009MT']")
	private WebElement briefNameArabSubEconomicSector_CSM;

	public WebElement briefNameArabSubEconomicSector_CSM() {
		return briefNameArabSubEconomicSector_CSM;
	}

	@FindBy(id = "subEconomicSectorMaint_Maint_save_P009MT")
	private WebElement saveButtonInSubEconomicSector_CSM;

	public WebElement saveButtonInSubEconomicSector_CSM() {
		return saveButtonInSubEconomicSector_CSM;
	}

	@FindBy(id = "td_subEconomicSectorList_GridTbl_Id_P009P_1_rifsecVO.SECTOR_CODE")
	private WebElement selectSearchedCodeApproveScreenSubEconomicSector_CSM;

	public WebElement selectSearchedCodeApproveScreenSubEconomicSector_CSM() {
		return selectSearchedCodeApproveScreenSubEconomicSector_CSM;
	}

	@FindBy(id = "subEconomicSectorList_GridTbl_Id_P009P_gs_rifsecVO.SECTOR_CODE")
	private WebElement SearchCodeInApproveScreenSubEconomicSector_CSM;

	public WebElement SearchCodeInApproveScreenSubEconomicSector_CSM() {
		return SearchCodeInApproveScreenSubEconomicSector_CSM;
	}

	@FindBy(id = "lookuptxt_requestFinancingSectorSection_CSMRF00MT")
	private WebElement sectorCodeInrequestForFinancingScreen;

	public WebElement sectorCodeInrequestForFinancingScreen() {
		return sectorCodeInrequestForFinancingScreen;
	}

	@FindBy(id = "lookuptxt_requestFinancingSubSectorSection_CSMRF00MT")
	private WebElement subSectorCodeInrequestForFinancingScreen;

	public WebElement subSectorCodeInrequestForFinancingScreen() {
		return subSectorCodeInrequestForFinancingScreen;
	}

	@FindBy(xpath = "//td[text()='Product Class']")
	private WebElement productClassInDisbursementSublimit;

	public WebElement productClassInDisbursementSublimit() {
		return productClassInDisbursementSublimit;
	}

	@FindBy(xpath = "//input[@id='requestFinancingLimitDetailsClassDesc_CSMRF00MT']")
	private WebElement productClassNameValidationInRepaymentPlan;

	public WebElement productClassNameValidationInRepaymentPlan() {
		return productClassNameValidationInRepaymentPlan;
	}

	@FindBy(xpath = "//*[@id=\"requestFinancingFormId_CSMRF00MT_Repayment_Plan_Key\"]")
	private WebElement repaymentPlanOption;

	public WebElement repaymentPlanOption() {
		return repaymentPlanOption;
	}

	@FindBy(xpath = "//input[@id='No_Of_Payments_CSMRF00MT']")
	private WebElement noOfPaymentsInrepaymentPlan;

	public WebElement noOfPaymentsInrepaymentPlan() {
		return noOfPaymentsInrepaymentPlan;
	}

	@FindBy(xpath = "//input[@id='paym_periodn_nbr_CSMRF00MT']")
	private WebElement payEveryInrepaymentPlan;

	public WebElement payEveryInrepaymentPlan() {
		return payEveryInrepaymentPlan;
	}

	@FindBy(xpath = "//input[@id='maturity_date_CSMRF00MT']")
	private WebElement maturityDateInrepaymentPlan;

	public WebElement maturityDateInrepaymentPlan() {
		return maturityDateInrepaymentPlan;
	}

	@FindBy(xpath = "//span[@id='hdr_runn_date']")
	private WebElement systemDate;

	public WebElement systemDate() {
		return systemDate;
	}

	@FindBy(xpath = "//a[@id='infoBarSearchButton_CSMRF00MT']")
	private WebElement searchIconInMaintenanceRequestForFinancing;

	public WebElement searchIconInMaintenanceRequestForFinancing() {
		return searchIconInMaintenanceRequestForFinancing;
	}

	@FindBy(xpath = "//a[@id='infoBarSearchButton_WIFT001MT']")
	private WebElement searchIconInMaintenanceUnderWifakApplication;

	public WebElement searchIconInMaintenanceUnderWifakApplication() {
		return searchIconInMaintenanceRequestForFinancing;
	}

	@FindBy(xpath = "//input[@id='requestFinancingGridTbl_Id_CSMRF00MT_gs_fmsRequestFinancingVO.CODE']")
	private WebElement searchCodeInMaintenanceRequestForFinancing;

	public WebElement searchCodeInMaintenanceRequestForFinancing() {
		return searchCodeInMaintenanceRequestForFinancing;
	}

	@FindBy(xpath = "//td[@id='td_requestFinancingGridTbl_Id_CSMRF00MT_1_fmsRequestFinancingVO.CODE']")
	private WebElement selectSearchedCodeInMaintenanceRequestForFinancing;

	public WebElement selectSearchedCodeInMaintenanceRequestForFinancing() {
		return selectSearchedCodeInMaintenanceRequestForFinancing;
	}
	// ****************************purpose of
	// financing*****************************************//

	@FindBy(xpath = "//td[text()='Purpose of Financing']//preceding-sibling::td")
	private WebElement purposeOfFinancingSubMenu;

	public WebElement purposeOfFinancingSubMenu() {
		return purposeOfFinancingSubMenu;
	}

	@FindBy(id = "P038MT")
	private WebElement maintenanceInPurposeOfFinancingSubMenu;

	public WebElement maintenanceInPurposeOfFinancingSubMenu() {
		return maintenanceInPurposeOfFinancingSubMenu;
	}

	@FindBy(xpath = "//*[@id='purposefinancingFormIdCode_P038MT']")
	private WebElement codeInMaintenancePurposeOfFinancing;

	public WebElement codeInMaintenancePurposeOfFinancing() {
		return codeInMaintenancePurposeOfFinancing;
	}

	@FindBy(xpath = "//*[@id='purposefinancingFormIdAdditionalNumber_P038MT']")
	private WebElement additionalNumberInMaintenancePurposeOfFinancing;

	public WebElement additionalNumberInMaintenancePurposeOfFinancing() {
		return additionalNumberInMaintenancePurposeOfFinancing;
	}

	@FindBy(xpath = "//input[@id='purposefinancingFormIdDescription_eng_P038MT']")
	private WebElement descriptionInMaintenancePurposeOfFinancing;

	public WebElement descriptionInMaintenancePurposeOfFinancing() {
		return descriptionInMaintenancePurposeOfFinancing;
	}

	@FindBy(xpath = "//*[@id='purposeFinancingProductClassTab_P038MT']/a/span")
	private WebElement productClassInMaintenancePurposeOfFinancing;

	public WebElement productClassInMaintenancePurposeOfFinancing() {
		return productClassInMaintenancePurposeOfFinancing;
	}

	@FindBy(xpath = "//*[@id=\"add_purposeFinancingProductClassGrid_P038MT\"]/div/span")
	private WebElement addProductClassInProductClassOptions;

	public WebElement addProductClassInProductClassOptions() {
		return addProductClassInProductClassOptions;
	}

	@FindBy(xpath = "//*[@id='td_purposeFinancingProductClassGrid_P038MT_1_purposeFinancingProductClassVO.PRODUCTCLASS']//input")
	private WebElement searchProductCodeInProductOptions;

	public WebElement searchProductCodeInProductOptions() {
		return searchProductCodeInProductOptions;
	}

	@FindBy(xpath = "//*[@id='td_purposeFinancingProductClassGrid_P038MT_1_purposeFinancingProductClassVO.PRODUCTCLASS']")
	private WebElement clickToEnterProductCodeInProductOptions;

	public WebElement clickToEnterProductCodeInProductOptions() {
		return clickToEnterProductCodeInProductOptions;
	}

	@FindBy(id = "purposeFinancingMaint_save_P038MT")
	private WebElement saveButtonInMaintenancePurposeOfFinancing;

	public WebElement saveButtonInMaintenancePurposeOfFinancing() {
		return saveButtonInMaintenancePurposeOfFinancing;
	}

	@FindBy(xpath = "//*[@id='td_purposeFinancingProductClassGrid_P038MT_1_productClassdesc']")
	private WebElement productClassNameValidationInPurposeOfFinancing;

	public WebElement productClassNameValidationInPurposeOfFinancing() {
		return productClassNameValidationInPurposeOfFinancing;
	}

	@FindBy(xpath = "//span[text()='Approve']/preceding-sibling::span")
	private WebElement approveSubMenuInPurposeOfFinancing;

	public WebElement approveSubMenuInPurposeOfFinancing() {
		return approveSubMenuInPurposeOfFinancing;
	}

	@FindBy(xpath = "//input[@id='purposeFinancingListGridTbl_Id_P038P_gs_purposeFinancingVO.CODE']")
	private WebElement searchCodeInApproveScreenPurposeOfFinancing;

	public WebElement searchCodeInApproveScreenPurposeOfFinancing() {
		return searchCodeInApproveScreenPurposeOfFinancing;
	}

	@FindBy(xpath = "//td[@id='td_purposeFinancingListGridTbl_Id_P038P_1_purposeFinancingVO.CODE']")
	private WebElement selectSearchedCodeInApproveScreenPurposeOfFinancing;

	public WebElement selectSearchedCodeInApproveScreenPurposeOfFinancing() {
		return selectSearchedCodeInApproveScreenPurposeOfFinancing;
	}

	@FindBy(xpath = "//button[@id='purposeFinancingMaint_approve_P038P']")
	private WebElement approveButtonInApproveScreenPurposeOfFinancing;

	public WebElement approveButtonInApproveScreenPurposeOfFinancing() {
		return approveButtonInApproveScreenPurposeOfFinancing;
	}

	@FindBy(xpath = "//input[@id=\"lookuptxt_requestFinancingLimitDetailsPurposeOfFin_CSMRF00MT\"]")
	private WebElement purposeOfFinancingInLimitDetailsPopUpScreen;

	public WebElement purposeOfFinancingInLimitDetailsPopUpScreen() {
		return purposeOfFinancingInLimitDetailsPopUpScreen;
	}

	@FindBy(id = "requestFinancingLimitDetailsEXCH_RATE_CSMRF00MT")
	private WebElement purposeOfFinancingInLimitDetailsPopUpScreenRandomClick;

	public WebElement purposeOfFinancingInLimitDetailsPopUpScreenRandomClick() {
		return purposeOfFinancingInLimitDetailsPopUpScreenRandomClick;
	}

	@FindBy(id = "requestFinancingLimitDetailsCfPurposeDesc_CSMRF00MT")
	private WebElement purposeOfFinancingInLimitDetailsValidation;

	public WebElement purposeOfFinancingInLimitDetailsValidation() {
		return purposeOfFinancingInLimitDetailsValidation;
	}
	// **************************************************Decimal value
	// validation*********************************************

	@FindBy(xpath = "//*[@id='requestFinancingGridTbl_Id_CSMRF00MT_gs_STATUSDESC']")
	private WebElement searchStatusInMaintenanceRequestForFinancing;

	public WebElement searchStatusInMaintenanceRequestForFinancing() {
		return searchStatusInMaintenanceRequestForFinancing;
	}

	// attribue nbformat
	@FindBy(xpath = "//input[@id='requestFinancingLimitDetails_FLOOR_RATE_PERCENTAGE_CSMRF00MT']")
	private WebElement floorRatePercentageKey;

	public WebElement floorRatePercentageKeyInLimitDetailsPopUpScreen() {
		return floorRatePercentageKey;
	}

	@FindBy(xpath = "//input[@id='requestFinancingLimitDetailsSubLimitLowerLimitPercentage_CSMRF00MT']")
	private WebElement sublimitLowerLimitPercentageKeyInLimitDetailsPopUpScreen;

	public WebElement sublimitLowerLimitPercentageKeyInLimitDetailsPopUpScreen() {
		return sublimitLowerLimitPercentageKeyInLimitDetailsPopUpScreen;
	}

	@FindBy(xpath = "//input[@name='requestFinancingCO.requestFinancingLimitCO.fmsAppLimitDetVO.SUBLIMIT_LOWER_LIMIT_AMT']")
	private WebElement sublimitLowerLimitAmountKeyInLimitDetailsPopUpScreen;

	public WebElement sublimitLowerLimitAmountKeyInLimitDetailsPopUpScreen() {
		return sublimitLowerLimitAmountKeyInLimitDetailsPopUpScreen;
	}

	@FindBy(xpath = "//input[@id='requestFinancingLimitDetailsRfUtilized_CSMRF00MT']")
	private WebElement amountsUtilizedInLimitDetailsPopUpScreen;

	public WebElement amountsUtilizedInLimitDetailsPopUpScreen() {
		return amountsUtilizedInLimitDetailsPopUpScreen;
	}

	@FindBy(xpath = "//input[@id='requestFinancingLimitDetailsCurrentOutstanding_CSMRF00MT']")
	private WebElement currenOutstandingInLimitDetailsPopUpScreen;

	public WebElement currenOutstandingInLimitDetailsPopUpScreen() {
		return currenOutstandingInLimitDetailsPopUpScreen;
	}

	@FindBy(xpath = "//input[@id='requestFinancingLimitDetailsUnUtiliedLimitField_CSMRF00MT']")
	private WebElement unUtilizedInLimitDetailsPopUpScreen;

	public WebElement unUtilizedInLimitDetailsPopUpScreen() {
		return unUtilizedInLimitDetailsPopUpScreen;
	}

	@FindBy(xpath = "//input[@id='requestFinancingLimitDetailsRfNewValue_CSMRF00MT']")
	private WebElement amountsInLimitDetailsPopUpScreen;

	public WebElement amountsInLimitDetailsPopUpScreen() {
		return amountsInLimitDetailsPopUpScreen;
	}

	@FindBy(xpath = "//input[@id='requestFinancingLimitDetailsNewGlobalLimit_CSMRF00MT']")
	private WebElement newGlobalLimitInLimitDetailsPopUpScreen;

	public WebElement newGlobalLimitInLimitDetailsPopUpScreen() {
		return newGlobalLimitInLimitDetailsPopUpScreen;
	}

	@FindBy(xpath = "//input[@id='requestFinancingLimitDetailsRfCfNewAmt_CSMRF00MT']")
	private WebElement totalGlobalLimitInLimitDetailsPopUpScreen;

	public WebElement totalGlobalLimitInLimitDetailsPopUpScreen() {
		return totalGlobalLimitInLimitDetailsPopUpScreen;
	}

	@FindBy(xpath = "//input[@id='requestFinancingLimitDetailsRfNewMargin_CSMRF00MT']")
	private WebElement marginNewInLimitDetailsPopUpScreen;

	public WebElement marginNewInLimitDetailsPopUpScreen() {
		return marginNewInLimitDetailsPopUpScreen;
	}

	@FindBy(xpath = "//input[@id='requestFinancingLimitDetailsMarginRate_CSMRF00MT']")
	private WebElement marginApprovedInLimitDetailsPopUpScreen;

	public WebElement marginApprovedInLimitDetailsPopUpScreen() {
		return marginApprovedInLimitDetailsPopUpScreen;
	}

	@FindBy(xpath = "//input[@id='requestFinancingLimitDetailsTotalExisting_CSMRF00MT']")
	private WebElement totalExistingInLimitDetailsPopUpScreen;

	public WebElement totalExistingInLimitDetailsPopUpScreen() {
		return totalExistingInLimitDetailsPopUpScreen;
	}

	@FindBy(xpath = "//input[@id='requestFinancingLimitDetailsTotalNew_CSMRF00MT']")
	private WebElement totalNewInLimitDetailsPopUpScreen;

	public WebElement totalNewInLimitDetailsPopUpScreen() {
		return totalNewInLimitDetailsPopUpScreen;
	}

	@FindBy(xpath = "//input[@id='requestFinancingLimitDetailsDealYield_CSMRF00MT']")
	private WebElement totalApprovedInLimitDetailsPopUpScreen;

	public WebElement totalApprovedInLimitDetailsPopUpScreen() {
		return totalApprovedInLimitDetailsPopUpScreen;
	}

	@FindBy(xpath = "//input[@id='requestFinancingLimitDetailscvValue_CSMRF00MT']")
	private WebElement cvValueInLimitDetailsPopUpScreen;

	public WebElement cvValueInLimitDetailsPopUpScreen() {
		return cvValueInLimitDetailsPopUpScreen;
	}

	@FindBy(xpath = "//td[@id='td_RequestFinancingLimitDetailsGridId_CSMRF00MT_1_fmsAppLimitDetVO.GENERAL_FACILITY_TYPE']")
	private WebElement openDisbursemnetSublimitProductClassRecord;

	public WebElement openDisbursemnetSublimitProductClassRecord() {
		return openDisbursemnetSublimitProductClassRecord;
	}

	@FindBy(xpath = "//input[@id='requestFinancingLimitDetailsTotalFAcilityValue_CSMRF00MT']")
	private WebElement totalFacilityValueInLimitDetailsPopUpScreen;

	public WebElement totalFacilityValueInLimitDetailsPopUpScreen() {
		return totalFacilityValueInLimitDetailsPopUpScreen;
	}

	@FindBy(xpath = "//input[@id='requestFinancingLimitDetailsDownPaymentPercentage_CSMRF00MT']")
	private WebElement downPaymentPercentageInLimitDetailsPopUpScreen;

	public WebElement downPaymentPercentageInLimitDetailsPopUpScreen() {
		return downPaymentPercentageInLimitDetailsPopUpScreen;
	}

	@FindBy(xpath = "//input[@id='requestFinancingLimitDetailsDownPaymentAmount_CSMRF00MT']")
	private WebElement downPaymentAmountInLimitDetailsPopUpScreen;

	public WebElement downPaymentAmountInLimitDetailsPopUpScreen() {
		return downPaymentAmountInLimitDetailsPopUpScreen;
	}

	@FindBy(xpath = "//input[@id='requestFinanceLimitDetailsDownPaymentToVendorPerc_CSMRF00MT']")
	private WebElement downPaymentToVendorPercentageInLimitDetailsPopUpScreen;

	public WebElement downPaymentToVendorPercentageInLimitDetailsPopUpScreen() {
		return downPaymentToVendorPercentageInLimitDetailsPopUpScreen;
	}

	@FindBy(xpath = "//input[@id='requestFinanceLimitDetailsDownPaymentToVendorAmt_CSMRF00MT']")
	private WebElement downPaymentToVendorAmountInLimitDetailsPopUpScreen;

	public WebElement downPaymentToVendorAmountInLimitDetailsPopUpScreen() {
		return downPaymentToVendorAmountInLimitDetailsPopUpScreen;
	}

	@FindBy(xpath = "//input[@id='requestFinanceLimitDetailsTotalDownPaymentPerc_CSMRF00MT']")
	private WebElement totalDownPaymentPercentageInLimitDetailsPopUpScreen;

	public WebElement totalDownPaymentPercentageInLimitDetailsPopUpScreen() {
		return totalDownPaymentPercentageInLimitDetailsPopUpScreen;
	}

	@FindBy(xpath = "//input[@id='requestFinanceLimitDetailsTotalDownPayment_CSMRF00MT']")
	private WebElement totalDownPaymentAmountInLimitDetailsPopUpScreen;

	public WebElement totalDownPaymentAmountInLimitDetailsPopUpScreen() {
		return totalDownPaymentAmountInLimitDetailsPopUpScreen;
	}
	// ******************************Grading evaluation
	// factor********************************//

	@FindBy(xpath = "//td[text()='Grading Evaluation Factors']//preceding-sibling::td")
	private WebElement gradingEvaluationFactorsSubMenu;

	public WebElement gradingEvaluationFactorsSubMenu() {
		return gradingEvaluationFactorsSubMenu;
	}

	@FindBy(xpath = "//a[@id='P003MT']")
	private WebElement maintenamceScreenIngradingEvaluationFactors;

	public WebElement maintenamceScreenIngradingEvaluationFactors() {
		return maintenamceScreenIngradingEvaluationFactors;
	}

	@FindBy(xpath = "//input[@id='txt_gradingEvalFactors_weight_P003MT']")
	private WebElement weightFieldIngradingEvaluationFactorsMaintenaceScreen;

	public WebElement weightFieldIngradingEvaluationFactorsMaintenaceScreen() {
		return weightFieldIngradingEvaluationFactorsMaintenaceScreen;
	}

	@FindBy(xpath = "//li[@id='applicationFacilityLimitDetailsTabs_WIFT001MT']")
	private WebElement limitDetailsInWIFAKApplication;

	public WebElement limitDetailsInWIFAKApplication() {
		return limitDetailsInWIFAKApplication;
	}

	@FindBy(xpath = "//li[@id='applicationFacilityLimitDetailsTabs_WIFT001AP1']")
	private WebElement limitDetailsInWIFAKApplicationApproveLevel1;

	public WebElement limitDetailsInWIFAKApplicationApproveLevel1() {
		return limitDetailsInWIFAKApplicationApproveLevel1;
	}

	@FindBy(xpath = "//td[@id='add_ApplicationFacilityLimitDetailsGrid_WIFT001MT']")
	private WebElement addButtonInLimitDetailsWIFAKApplication;

	public WebElement addButtonInLimitDetailsWIFAKApplication() {
		return addButtonInLimitDetailsWIFAKApplication;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_applicationfacilityLimitDetailsCLASS_WIFT001MT']")
	private WebElement selectProductClassInLimitDetailsWIFAKApplication;

	public WebElement selectProductClassInLimitDetailsWIFAKApplication() {
		return selectProductClassInLimitDetailsWIFAKApplication;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_applicationfacilityLimitDetailsCLASS_TYPE_WIFT001MT']")
	private WebElement typeInLimitDetailsWIFAKApplication;

	public WebElement typeInLimitDetailsWIFAKApplication() {
		return typeInLimitDetailsWIFAKApplication;
	}

	@FindBy(xpath = "//input[@id='applicationfacilityLimitDetailsCLEAN_FLAG_WIFT001MT']")
	private WebElement cleanCheckBoxInLimitDetailsWIFAKApplication;

	public WebElement cleanCheckBoxInLimitDetailsWIFAKApplication() {
		return cleanCheckBoxInLimitDetailsWIFAKApplication;
	}

	@FindBy(xpath = "//button[@id='applicationfacility_approvelevel1_btn_WIFT001AP1']")
	private WebElement submitButtonInApproveLevel1UnderWifakApplication;

	public WebElement submitButtonInApproveLevel1UnderWifakApplication() {
		return submitButtonInApproveLevel1UnderWifakApplication;
	}

	@FindBy(xpath = "//button[@id='applicationfacility_approvelevel2_btn_WIFT001AP2']")
	private WebElement submitButtonInApproveLevel2UnderWifakApplication;

	public WebElement submitButtonInApproveLevel2UnderWifakApplication() {
		return submitButtonInApproveLevel2UnderWifakApplication;
	}

	@FindBy(xpath = "//button[@id='applicationfacility_approvelevel3_btn_WIFT001AP3']")
	private WebElement submitButtonInApproveLevel3UnderWifakApplication;

	public WebElement submitButtonInApproveLevel3UnderWifakApplication() {
		return submitButtonInApproveLevel3UnderWifakApplication;
	}

	@FindBy(xpath = "//select[@id='applicationFacilityDecision_1_WIFT001AP1']")
	private WebElement selectDecisionInApproveLevel1UnderWifakApplication;

	public WebElement selectDecisionInApproveLevel1UnderWifakApplication() {
		return selectDecisionInApproveLevel1UnderWifakApplication;
	}
	
	@FindBy(xpath = "//select[@id='requestDecisionForward_1_CSMRF00P1']")
	private WebElement selectDecisionInApproveLevel1UnderRequestforfinancingfacilities;

	public WebElement selectDecisionInApproveLevel1UnderRequestforfinancingfacilities() {
		return selectDecisionInApproveLevel1UnderRequestforfinancingfacilities;
	}

	@FindBy(xpath = "//select[@id='applicationFacilityDecision2_WIFT001AP2']")
	private WebElement selectDecisionInApproveLevel2UnderWifakApplication;

	public WebElement selectDecisionInApproveLevel2UnderWifakApplication() {
		return selectDecisionInApproveLevel2UnderWifakApplication;
	}

	@FindBy(xpath = "//select[@id='applicationFacilityDecision3_WIFT001AP3']")
	private WebElement selectDecisionInApproveLevel3UnderWifakApplication;

	public WebElement selectDecisionInApproveLevel3UnderWifakApplication() {
		return selectDecisionInApproveLevel3UnderWifakApplication;
	}

	@FindBy(xpath = "//a[@id='WIFT001AP2']")
	private WebElement ApproveLevel2ScreenUnderWifakApplication;

	public WebElement ApproveLevel2ScreenUnderWifakApplication() {
		return ApproveLevel2ScreenUnderWifakApplication;
	}

	@FindBy(xpath = "//a[@id='WIFT001AP3']")
	private WebElement ApproveLevel3ScreenUnderWifakApplication;

	public WebElement ApproveLevel3creenUnderWifakApplication() {
		return ApproveLevel3ScreenUnderWifakApplication;
	}

	@FindBy(xpath = "//td[text()='Final Approval']")
	private WebElement FinalApprovalValidationUnderWIFAKApplication;

	public WebElement FinalApprovalValidationUnderWIFAKApplication() {
		return FinalApprovalValidationUnderWIFAKApplication;
	}

	@FindBy(xpath = "//select[@id='applicationfacilityLimitDetailsGENERAL_FACILITY_TYPE_WIFT001MT']")
	private WebElement productClassItemDropDownInLimitDetailsWIFAKApplication;

	public WebElement productClassItemDropDownInLimitDetailsWIFAKApplication() {
		return productClassItemDropDownInLimitDetailsWIFAKApplication;
	}
	
	@FindBy(xpath = "//input[@id='applicationfacilityLimitDetailsACC_BR_WIFT001MT']")
	private WebElement productClassAccountBrInLimitDetailsWIFAKApplication;

	public WebElement productClassAccountBrInLimitDetailsWIFAKApplication() {
		return productClassAccountBrInLimitDetailsWIFAKApplication;
	}
	
	@FindBy(xpath = "//input[@id='lookuptxt_applicationfacilityLimitDetailsCLASS_WIFT001MT']")
	private WebElement productClassNameValidationInLimitDetailsWIFAKApplication;

	public WebElement productClassNameValidationInLimitDetailsWIFAKApplication() {
		return productClassNameValidationInLimitDetailsWIFAKApplication;
	}

	@FindBy(xpath = "//input[@id='applicationFacilitylimityielddetrate_WIFT001MT']")
	private WebElement yieldDetailsInLimitDetailsWIFAKApplication;

	public WebElement yieldDetailsInLimitDetailsWIFAKApplication() {
		return yieldDetailsInLimitDetailsWIFAKApplication;
	}

	@FindBy(xpath = "//input[@id='applicationFacilityLimitTotalYield_WIFT001MT']")
	private WebElement totalYieldInLimitDetailsWIFAKApplication;

	public WebElement totalYieldInLimitDetailsWIFAKApplication() {
		return totalYieldInLimitDetailsWIFAKApplication;
	}

	@FindBy(xpath = "//input[@id='applicationfacilityLimitDetailsMARGIN_RATE_WIFT001MT']")
	private WebElement marginRateInLimitDetailsWIFAKApplication;

	public WebElement marginRateInLimitDetailsWIFAKApplication() {
		return marginRateInLimitDetailsWIFAKApplication;
	}

	// ********************************************floating
	// rate***********************************************//

	@FindBy(xpath = "//input[@id='lookuptxt_applicationfacilityLimitDetailsFLOATING_RATE_WIFT001MT']")
	private WebElement floatingRateInLimitDetailsWIFAKApplication;

	public WebElement floatingRateInLimitDetailsWIFAKApplication() {
		return floatingRateInLimitDetailsWIFAKApplication;
	}

	@FindBy(xpath = "//input[@id='applicationfacilityLimitDetailsfloatRateDesc_WIFT001MT']")
	private WebElement floatingRateNameValidationInLimitDetailsWIFAKApplication;

	public WebElement floatingRateNameValidationInLimitDetailsWIFAKApplication() {
		return floatingRateNameValidationInLimitDetailsWIFAKApplication;
	}

	@FindBy(xpath = "//input[@id='applicationFacilitylimityielddetbankprofitshare_WIFT001MT']")
	private WebElement bankProfitShareInLimitDetailsWIFAKApplication;

	public WebElement bankProfitShareInLimitDetailsWIFAKApplication() {
		return bankProfitShareInLimitDetailsWIFAKApplication;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_applicationFacilityRating_WIFT001MT']")
	private WebElement facilityRatingInMainInformationWIFAKApplication;

	public WebElement facilityRatingInMainInformationWIFAKApplication() {
		return facilityRatingInMainInformationWIFAKApplication;
	}

	@FindBy(xpath = "//input[@id='applicationfacilityLimitDetailsFLOAT_RATE_PERIODICITY_NBR_WIFT001MT']")
	private WebElement floatingRatePeriodicityInLimitDetailsWIFAKApplication;

	public WebElement floatingRatePeriodicityInLimitDetailsWIFAKApplication() {
		return floatingRatePeriodicityInLimitDetailsWIFAKApplication;
	}

	@FindBy(xpath = "//select[@id='applicationfacilityLimitDetailsFLOAT_RATE_PERIODICITY_TYPE_WIFT001MT']")
	private WebElement floatingRatePeriodicityTypeInLimitDetailsWIFAKApplication;

	public WebElement floatingRatePeriodicityTypeInLimitDetailsWIFAKApplication() {
		return floatingRatePeriodicityTypeInLimitDetailsWIFAKApplication;
	}

	@FindBy(xpath = "//span[text()='Send Alert']/following-sibling::a//span")
	private WebElement closeIconInSendAlertPopup;

	public WebElement closeIconInSendAlertPopup() {
		return closeIconInSendAlertPopup;
	}

	@FindBy(id = "WIFT001AP1")
	private WebElement approveLevel1InApplicationForFinancialFacilitiesUnderRequestforfinancing;

	public WebElement approveLevel1InApplicationForFinancialFacilitiesUnderRequestforfinancing() {
		return approveLevel1InApplicationForFinancialFacilitiesUnderRequestforfinancing;
	}
	
	@FindBy(xpath = "//span[normalize-space()='Approve Level 1']")
	private WebElement approveLevel1InApplicationForFinancialFacilitiesUnderWIFAKApplication;

	public WebElement approveLevel1InApplicationForFinancialFacilitiesUnderWIFAKApplication() {
		return approveLevel1InApplicationForFinancialFacilitiesUnderWIFAKApplication;
	}

	@FindBy(xpath = "//input[@id='applicationFacilityGridTbl_Id_WIFT001AP1_gs_fmsApplVO.CODE']")
	private WebElement searchCodeInApproveLevel1ApplicationForFinacialFacilitiesUnderWIFAKApplication;

	public WebElement searchCodeInApproveLevel1ApplicationForFinacialFacilitiesUnderWIFAKApplication() {
		return searchCodeInApproveLevel1ApplicationForFinacialFacilitiesUnderWIFAKApplication;
	}
	
	@FindBy(xpath = "//input[@id='requestFinancingGridTbl_Id_CSMRF00P1_gs_fmsRequestFinancingVO.CODE']")
	private WebElement searchCodeInApproveLevel1ApplicationForFinacialFacilitiesUnderRequestforfinancing;

	public WebElement searchCodeInApproveLevel1ApplicationForFinacialFacilitiesUnderRequestforfinancing() {
		return searchCodeInApproveLevel1ApplicationForFinacialFacilitiesUnderRequestforfinancing;
	}

	@FindBy(xpath = "//td[@id='td_applicationFacilityGridTbl_Id_WIFT001AP1_1_fmsApplVO.CODE']")
	private WebElement selectsearchedCodeInApproveLevel1ApplicationForFinacialFacilitiesUnderWIFAKApplication;

	public WebElement selectsearchedCodeInApproveLevel1ApplicationForFinacialFacilitiesUnderWIFAKApplication() {
		return selectsearchedCodeInApproveLevel1ApplicationForFinacialFacilitiesUnderWIFAKApplication;
	}
	
	@FindBy(xpath = "//td[@id='td_requestFinancingGridTbl_Id_CSMRF00P1_1_fmsRequestFinancingVO.CODE']")
	private WebElement selectsearchedCodeInApproveLevel1ApplicationForFinacialFacilitiesUnderRequestforfinancing;

	public WebElement selectsearchedCodeInApproveLevel1ApplicationForFinacialFacilitiesUnderRequestforfinancing() {
		return selectsearchedCodeInApproveLevel1ApplicationForFinacialFacilitiesUnderRequestforfinancing;
	}

	@FindBy(xpath = "//input[@id='applicationFacilityGridTbl_Id_WIFT001MT_gs_fmsApplVO.CODE']")
	private WebElement searchCodeInMaintenanceScreenApplicationForFinacialFacilitiesUnderWIFAKApplication;

	public WebElement searchCodeInMaintenanceScreenApplicationForFinacialFacilitiesUnderWIFAKApplication() {
		return searchCodeInMaintenanceScreenApplicationForFinacialFacilitiesUnderWIFAKApplication;
	}

	@FindBy(xpath = "//td[@id='td_applicationFacilityGridTbl_Id_WIFT001MT_1_fmsApplVO.CODE']")
	private WebElement selectsearchedCodeInMaintenanceScreenApplicationForFinacialFacilitiesUnderWIFAKApplication;

	public WebElement selectsearchedCodeInMaintenanceScreenApplicationForFinacialFacilitiesUnderWIFAKApplication() {
		return selectsearchedCodeInMaintenanceScreenApplicationForFinacialFacilitiesUnderWIFAKApplication;
	}

	@FindBy(xpath = "//input[@id='applicationFacilityGridTbl_Id_WIFT001AP2_gs_fmsApplVO.CODE']")
	private WebElement searchCodeInApproveLevel2ApplicationForFinacialFacilitiesUnderWIFAKApplication;

	public WebElement searchCodeInApproveLevel2ApplicationForFinacialFacilitiesUnderWIFAKApplication() {
		return searchCodeInApproveLevel2ApplicationForFinacialFacilitiesUnderWIFAKApplication;
	}

	@FindBy(xpath = "//td[@id='td_applicationFacilityGridTbl_Id_WIFT001AP3_1_fmsApplVO.CODE']")
	private WebElement selectsearchedCodeInApproveLevel3ApplicationForFinacialFacilitiesUnderWIFAKApplication;

	public WebElement selectsearchedCodeInApproveLevel3ApplicationForFinacialFacilitiesUnderWIFAKApplication() {
		return selectsearchedCodeInApproveLevel3ApplicationForFinacialFacilitiesUnderWIFAKApplication;
	}

	@FindBy(xpath = "//a[text()='WIFAK APPLICATION / WIFAK APPLICATION / Application For Financial Facilities / Maintenance']/parent::td/following-sibling::td")
	private WebElement closeIconMaintenanceScreenWifakApplication;

	public WebElement closeIconMaintenanceScreenWifakApplication() {
		return closeIconMaintenanceScreenWifakApplication;
	}

	@FindBy(xpath = "//a[@id='WIFT005MT']//span[contains(text(),'Issue Facility Offer ')]")
	private WebElement IssueFacilityOfferWifakApplication_482;

	public WebElement IssueFacilityOfferWifakApplication_482() {
		return IssueFacilityOfferWifakApplication_482;
	}

	@FindBy(xpath = "//input[@id='applicationFacilityGridTbl_Id_WIFT005MT_gs_fmsApplVO.CODE']")
	private WebElement searchCodeInIssueFacilityOfferForFinacialFacilitiesUnderWIFAKApplication;

	public WebElement searchCodeInIssueFacilityOfferForFinacialFacilitiesUnderWIFAKApplication() {
		return searchCodeInIssueFacilityOfferForFinacialFacilitiesUnderWIFAKApplication;
	}

	@FindBy(xpath = "//td[@id='td_applicationFacilityGridTbl_Id_WIFT005MT_1_fmsApplVO.CODE']")
	private WebElement selectsearchedCodeInIssueFacilityOfferForFinacialFacilitiesUnderWIFAKApplication;

	public WebElement selectsearchedCodeInIssueFacilityOfferForFinacialFacilitiesUnderWIFAKApplication() {
		return selectsearchedCodeInIssueFacilityOfferForFinacialFacilitiesUnderWIFAKApplication;
	}

	@FindBy(xpath = "//button[@id='applicationfacility_issueoffer_btn_WIFT005MT']")
	private WebElement issueFacilityOfferButtonForFinacialFacilitiesUnderWIFAKApplication;

	public WebElement issueFacilityOfferButtonForFinacialFacilitiesUnderWIFAKApplication() {
		return issueFacilityOfferButtonForFinacialFacilitiesUnderWIFAKApplication;
	}

	@FindBy(xpath = "//input[@id='applicationFacilityGridTbl_Id_WIFT001AP3_gs_fmsApplVO.CODE']")
	private WebElement searchCodeInApproveLevel3ApplicationForFinacialFacilitiesUnderWIFAKApplication;

	public WebElement searchCodeInApproveLevel3ApplicationForFinacialFacilitiesUnderWIFAKApplication() {
		return searchCodeInApproveLevel3ApplicationForFinacialFacilitiesUnderWIFAKApplication;
	}

	@FindBy(xpath = "//td[@id='td_applicationFacilityGridTbl_Id_WIFT001AP2_1_fmsApplVO.CODE']")
	private WebElement selectsearchedCodeInApproveLevel2ApplicationForFinacialFacilitiesUnderWIFAKApplication;

	public WebElement selectsearchedCodeInApproveLevel2ApplicationForFinacialFacilitiesUnderWIFAKApplication() {
		return selectsearchedCodeInApproveLevel2ApplicationForFinacialFacilitiesUnderWIFAKApplication;
	}

	@FindBy(xpath = "//td[@id='td_ApplicationFacilityLimitDetailsGrid_WIFT001AP1_1_fmsAppLimitDetVO.GENERAL_FACILITY_TYPE']")
	private WebElement openProductClassRecordInLimitClassApproveLevel1;

	public WebElement openProductClassRecordInLimitClassApproveLevel1() {
		return openProductClassRecordInLimitClassApproveLevel1;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_applicationfacilityLimitDetailsFLOATING_RATE_WIFT001AP1']")
	private WebElement floatingRateInLimitDealsPopUpApproveLevel1UnderWIFAKApplication;

	public WebElement floatingRateInLimitDealsPopUpApproveLevel1UnderWIFAKApplication() {
		return floatingRateInLimitDealsPopUpApproveLevel1UnderWIFAKApplication;
	}

	@FindBy(xpath = "//input[@id='applicationfacilityLimitDetailsfloatRateDesc_WIFT001AP1']")
	private WebElement floatingRateNameInLimitDealsPopUpApproveLevel1UnderWIFAKApplication;

	public WebElement floatingRateNameInLimitDealsPopUpApproveLevel1UnderWIFAKApplication() {
		return floatingRateNameInLimitDealsPopUpApproveLevel1UnderWIFAKApplication;
	}

	@FindBy(xpath = "//input[@id='applicationfacilityLimitDetailsFLOAT_RATE_PERIODICITY_NBR_WIFT001AP1']")
	private WebElement floatingRatePeriodicityInLimitDealsPopUpApproveLevel1UnderWIFAKApplication;

	public WebElement floatingRatePeriodicityInLimitDealsPopUpApproveLevel1UnderWIFAKApplication() {
		return floatingRatePeriodicityInLimitDealsPopUpApproveLevel1UnderWIFAKApplication;
	}

	@FindBy(xpath = "//select[@id='applicationfacilityLimitDetailsFLOAT_RATE_PERIODICITY_TYPE_WIFT001AP1']")
	private WebElement floatingRatePeriodicityTypeInLimitDealsPopUpApproveLevel1UnderWIFAKApplication;

	public WebElement floatingRatePeriodicityTypeInLimitDealsPopUpApproveLevel1UnderWIFAKApplication() {
		return floatingRatePeriodicityTypeInLimitDealsPopUpApproveLevel1UnderWIFAKApplication;
	}

	@FindBy(xpath = "//input[@id='applicationFacilityofferexpirydate_WIFT001MT']")
	private WebElement offerExpiratioInAdditionalDetails;

	public WebElement offerExpiratioInAdditionalDetails() {
		return offerExpiratioInAdditionalDetails;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_applicationFacilitysolicitor_WIFT001MT']")
	private WebElement solicitorNameInDocumentDetails;

	public WebElement solicitorNameInDocumentDetails() {
		return solicitorNameInDocumentDetails;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_applicationFacilityEstimator_WIFT001MT']")
	private WebElement estimatorNameInDocumentDetails;

	public WebElement estimatorNameInDocumentDetails() {
		return estimatorNameInDocumentDetails;
	}

	@FindBy(xpath = "//input[@id='applicationFacilityAddField_WIFT001MT']")
	private WebElement paymentRandomClickInDocumentDetails;

	public WebElement paymentRandomClickInDocumentDetails() {
		return paymentRandomClickInDocumentDetails;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_applicationFacilityMarketedBy_WIFT001MT']")
	private WebElement marketedByRandomClickInMainInformationTab;

	public WebElement marketedByRandomClickInMainInformationTab() {
		return marketedByRandomClickInMainInformationTab;
	}

	@FindBy(xpath = "//td[@id='add_ApplicationFacilityLimitDetailsGrid_WIFT001MT']")
	private WebElement addIconInLimitDetailsUnderWIFAKApplication;

	public WebElement addIconInLimitDetailsUnderWIFAKApplication() {
		return addIconInLimitDetailsUnderWIFAKApplication;
	}

	@FindBy(xpath = "//li[@id='applicationFacilityDocumentDetailsTabs_WIFT001MT']")
	private WebElement documentDetailsUnderWIFAKApplication;

	public WebElement documentDetailsUnderWIFAKApplication() {
		return documentDetailsUnderWIFAKApplication;
	}

	@FindBy(xpath = "//li[@id='applicationFacilityMainInfoTabs_WIFT001MT']")
	private WebElement mainInformationTabUnderWIFAKApplication;

	public WebElement mainInformationTabUnderWIFAKApplication() {
		return mainInformationTabUnderWIFAKApplication;
	}

	@FindBy(xpath = "//button[@id='applicationfacility_save_as_draft_btn_WIFT001MT']")
	private WebElement saveButtonInWIFAKApplication;

	public WebElement saveButtonInWIFAKApplication() {
		return saveButtonInWIFAKApplication;
	}

	@FindBy(xpath = "//button[@id='applicationfacility_save_btn_WIFT001MT']")
	private WebElement validateButtonInApplicationForFinancialFacilitiesUnderWIFAKApplication;

	public WebElement validateButtonInApplicationForFinancialFacilitiesUnderWIFAKApplication() {
		return validateButtonInApplicationForFinancialFacilitiesUnderWIFAKApplication;
	}

	// prevvalue
	@FindBy(xpath = "//input[@id='lookuptxt_applicationfacilityLimitDetailsFLOATING_RATE_WIFT001AP1']")
	private WebElement validateFloatingrateInWIFAKApplicationApproveLevel1;

	public WebElement validateFloatingrateInWIFAKApplicationApproveLevel1() {
		return validateFloatingrateInWIFAKApplicationApproveLevel1;
	}

	// prevvalue
	@FindBy(xpath = "//input[@id='applicationfacilityLimitDetailsFLOAT_RATE_PERIODICITY_NBR_WIFT001AP1']")
	private WebElement validateFloatingratePeriodicityInWIFAKApplicationApproveLevel1;

	public WebElement validateFloatingratePeriodicityInWIFAKApplicationApproveLevel1() {
		return validateFloatingratePeriodicityInWIFAKApplicationApproveLevel1;
	}

	// prevvalue
	@FindBy(xpath = "//select[@id='applicationfacilityLimitDetailsFLOAT_RATE_PERIODICITY_TYPE_WIFT001AP1']")
	private WebElement validateFloatingratePeriodicityTypeInWIFAKApplicationApproveLevel1;

	public WebElement validateFloatingratePeriodicityTypeInWIFAKApplicationApproveLevel1() {
		return validateFloatingratePeriodicityTypeInWIFAKApplicationApproveLevel1;
	}

	@FindBy(xpath = "//td[text()='Facilities Management']/preceding-sibling::td/span")
	private WebElement facilitiesManagementInWIFAKApplication;

	public WebElement facilitiesManagementInWIFAKApplication() {
		return facilitiesManagementInWIFAKApplication;
	}

	@FindBy(xpath = "//span[text()='Approve/Reject']/preceding-sibling::span")
	private WebElement approveRejectScreenInFacilitiesManagement;

	public WebElement approveRejectScreenInFacilitiesManagement() {
		return approveRejectScreenInFacilitiesManagement;
	}

	@FindBy(xpath = "//input[@id='facilityManagementGridTbl_Id_WIFT008AP_gs_statusDesc']")
	private WebElement searchStatusInApproveRejectScreenInFacilitiesManagementUnderWIFAKApplication;

	public WebElement searchStatusInApproveRejectScreenInFacilitiesManagementUnderWIFAKApplication() {
		return searchStatusInApproveRejectScreenInFacilitiesManagementUnderWIFAKApplication;
	}

	@FindBy(xpath = "//td[@id='td_facilityManagementGridTbl_Id_WIFT008AP_1_fmsFacilityVO.CODE']")
	private WebElement selectSearchedStatusInApproveRejectScreenInFacilitiesManagementUnderWIFAKApplication;

	public WebElement selectSearchedStatusInApproveRejectScreenInFacilitiesManagementUnderWIFAKApplication() {
		return selectSearchedStatusInApproveRejectScreenInFacilitiesManagementUnderWIFAKApplication;
	}

	@FindBy(xpath = "//button[@id='facilityManagement_approve_btn_WIFT008AP']")
	private WebElement approveButtonInApproveRejectScreenInFacilitiesManagementUnderWIFAKApplication;

	public WebElement approveButtonInApproveRejectScreenInFacilitiesManagementUnderWIFAKApplication() {
		return approveButtonInApproveRejectScreenInFacilitiesManagementUnderWIFAKApplication;
	}

	// alert pop up send alert
	@FindBy(xpath = "//input[@id='alertsGrid_Id_WIFT001MT_gs_alertsParamCO.userId']")
	private WebElement searchUserIdInSendAlert;

	public WebElement searchUserIdInSendAlert() {
		return searchUserIdInSendAlert;
	}

	@FindBy(xpath = "//input[@id='alertsGrid_Id_WIFT008MT_gs_alertsParamCO.userId']")
	private WebElement searchUserIdInSendAlert_FacilitiesManagement;

	public WebElement searchUserIdInSendAlert_FacilitiesManagement() {
		return searchUserIdInSendAlert_FacilitiesManagement;
	}

	@FindBy(xpath = "//td[@id='td_alertsGrid_Id_WIFT008MT_1_alertsParamCO.userId']")
	private WebElement selectSearchedUserIdInSendAlert_FacilitiesManagement;

	public WebElement selectSearchedUserIdInSendAlert_FacilitiesManagement() {
		return selectSearchedUserIdInSendAlert_FacilitiesManagement;
	}

	@FindBy(xpath = "//td[@id='td_alertsGrid_Id_WIFT008MT_1_alertsParamCO.userId']")
	private WebElement selectSearchedUserIdInSendAlert;

	public WebElement selectSearchedUserIdInSendAlert() {
		return selectSearchedUserIdInSendAlert;
	}

	@FindBy(xpath = "//a[@id='sendBut_WIFT008MT']")
	private WebElement sendButtonInSendAlert_FacilitiesManagement;

	public WebElement sendButtonInSendAlert_FacilitiesManagement() {
		return sendButtonInSendAlert_FacilitiesManagement;
	}

	@FindBy(xpath = "//a[@id='sendBut_WIFT001MT']")
	private WebElement sendButtonInSendAlert;

	public WebElement sendButtonInSendAlert() {
		return sendButtonInSendAlert;
	}
	// fms parameters

	@FindBy(xpath = "//td[text()='Parameters']/preceding-sibling::td//span/span")
	private WebElement parametersMenuInFSMParam_482;

	public WebElement parametersMenuInFSMParam_482() {
		return parametersMenuInFSMParam_482;
	}

	@FindBy(xpath = "//a[@id='P007P']")
	private WebElement approveScreen_ControlRecordInFSMParam_482;

	public WebElement approveScreen_ControlRecordInFSMParam_482() {
		return approveScreen_ControlRecordInFSMParam_482;
	}

	@FindBy(xpath = "//a[@id='P007UP']")
	private WebElement updateAfterapproveScreen_ControlRecordInFSMParam_482;

	public WebElement updateAfterapproveScreen_ControlRecordInFSMParam_482() {
		return updateAfterapproveScreen_ControlRecordInFSMParam_482;
	}

	@FindBy(xpath = "//td[text()='Control Record']/preceding-sibling::td//span/span")
	private WebElement ControlRecordScrenInFSMParam_482;

	public WebElement ControlRecordScreenInFSMParam_482() {
		return ControlRecordScrenInFSMParam_482;
	}

	// initialvalue checked
	@FindBy(xpath = "//input[@id='FmsCtrlRecord_alertStatus_P007UP']")
	private WebElement enableAlertsCheckBox_482;

	public WebElement enableAlertsCheckBox_482() {
		return enableAlertsCheckBox_482;
	}

	// initialvalue checked
	@FindBy(xpath = "//input[@id='FmsCtrlRecord_autoAlertAfterUpdate_P007UP']")
	private WebElement AutoAlertsCheckBox_482;

	public WebElement AutoAlertsCheckBox_482() {
		return AutoAlertsCheckBox_482;
	}

	@FindBy(xpath = "//button[@id='fmsControlRecordMaint_update_P007UP']")
	private WebElement updateButton_UpdateAfterApproveInControlRecord_482;

	public WebElement updateButton_UpdateAfterApproveInControlRecord_482() {
		return updateButton_UpdateAfterApproveInControlRecord_482;
	}

	@FindBy(xpath = "//button[@id='fmsControlRecordMaint_approve_P007P']")
	private WebElement approveButtonInApproveScreenControlRecord_482;

	public WebElement approveButtonInApproveScreenControlRecord_482() {
		return approveButtonInApproveScreenControlRecord_482;
	}
	
	@FindBy(xpath = "//span//label[@labelkey='approve_key']")
	private WebElement approveButtonInApproveScreen;

	public WebElement approveButtonInApproveScreen() {
		return approveButtonInApproveScreen;
	}
	
	// clear caches

	@FindBy(xpath = "//a[@id='tech_details_icon_id']")
	private WebElement technicalDetails_482;

	public WebElement technicalDetails_482() {
		return technicalDetails_482;
	}

	@FindBy(xpath = "//label[contains(text(),'Clear Cache ')]")
	private WebElement FSM_ClearCacheInTechnicalDetailsIcon;

	public WebElement FSM_ClearCacheInTechnicalDetailsIcon() {
		return FSM_ClearCacheInTechnicalDetailsIcon;
	}

	@FindBy(xpath = "(//a[text()='Open Item'])[1]")
	private WebElement openItemInSendAlert;

	public WebElement openItemInSendAlert() {
		return openItemInSendAlert;
	}

	@FindBy(xpath = "//button[@id='alertsOpenItemApprove_RCVALERT']")
	private WebElement approveButtonInOpenItem;

	public WebElement approveButtonInOpenItem() {
		return approveButtonInOpenItem;
	}

	@FindBy(xpath = "//td[text()='Facilities Management']/preceding-sibling::td/span/span")
	private WebElement facilitiesManagementUnderWIFAK_482;

	public WebElement facilitiesManagementUnderWIFAK_482() {
		return facilitiesManagementUnderWIFAK_482;
	}

	@FindBy(xpath = "//a[@id='WIFT008MT']")
	private WebElement maintenance_facilitiesManagementUnderWIFAK_482;

	public WebElement maintenance_facilitiesManagementUnderWIFAK_482() {
		return maintenance_facilitiesManagementUnderWIFAK_482;
	}

	@FindBy(xpath = "//input[@id='facilityManagementGridTbl_Id_WIFT008MT_gs_fmsFacilityVO.FROM_APPLICATION']")
	private WebElement searchApplicationRefNum_facilitiesManagementUnderWIFAK_482;

	public WebElement searchApplicationRefNum_facilitiesManagementUnderWIFAK_482() {
		return searchApplicationRefNum_facilitiesManagementUnderWIFAK_482;
	}

	@FindBy(xpath = "//td[@id='td_facilityManagementGridTbl_Id_WIFT008MT_1_fmsFacilityVO.CODE']")
	private WebElement selectsearchedApplicationRefNum_facilitiesManagementUnderWIFAK_482;

	public WebElement selectsearchedApplicationRefNum_facilitiesManagementUnderWIFAK_482() {
		return selectsearchedApplicationRefNum_facilitiesManagementUnderWIFAK_482;
	}

	@FindBy(xpath = "//a[@id='infoBarSearchButton_WIFT008MT']")
	private WebElement searchIcon_facilitiesManagementUnderWIFAK_482;

	public WebElement searchIcon_facilitiesManagementUnderWIFAK_482() {
		return searchIcon_facilitiesManagementUnderWIFAK_482;
	}

	@FindBy(xpath = "//li[@id='facilityAdditionalDetailsTab_WIFT008MT']")
	private WebElement additionalDetails_Maintenance_facilitiesManagementUnderWIFAK_482;

	public WebElement additionalDetails_Maintenance_facilitiesManagementUnderWIFAK_482() {
		return additionalDetails_Maintenance_facilitiesManagementUnderWIFAK_482;
	}

	@FindBy(xpath = "//input[@id='facilityMgtAddDetDateEffectiveUntill_WIFT008MT']")
	private WebElement effectiveDateUntil_482;

	public WebElement effectiveDateUntil_482() {
		return effectiveDateUntil_482;
	}

	@FindBy(xpath = "//td[@id='td_FacilityManagementDocumentDetailsGrid_WIFT008MT_1_fmsFacDocumentsVO.SOL_DATE_SENT']")
	private WebElement randomClickDocumentDate_482;

	public WebElement randomClickDocumentDate_482() {
		return randomClickDocumentDate_482;
	}

	@FindBy(xpath = "//td[@id='td_FacilityManagementDocumentDetailsGrid_WIFT008MT_2_fmsFacDocumentsVO.SOL_DATE_SENT']")
	private WebElement randomClickDocumentDate2_482;

	public WebElement randomClickDocumentDate2_482() {
		return randomClickDocumentDate2_482;
	}

	@FindBy(xpath = "//input[@id='1_fmsFacDocumentsVO.SOL_DATE_SENT_FacilityManagementDocumentDetailsGrid_WIFT008MT']")
	private WebElement solicitorDateSent_482;

	public WebElement solicitorDateSent_482() {
		return solicitorDateSent_482;
	}

	@FindBy(xpath = "//input[@id='1_fmsFacDocumentsVO.SOL_DATE_REC_FacilityManagementDocumentDetailsGrid_WIFT008MT']")
	private WebElement solicitorDateReceived_482;

	public WebElement solicitorDateReceived_482() {
		return solicitorDateReceived_482;
	}

	@FindBy(xpath = "//input[@id='1_fmsFacDocumentsVO.EST_DATE_SENT_FacilityManagementDocumentDetailsGrid_WIFT008MT']")
	private WebElement estimatorDateSent_482;

	public WebElement estimatorDateSent_482() {
		return estimatorDateSent_482;
	}

	@FindBy(xpath = "//input[@id='1_fmsFacDocumentsVO.EST_DATE_REC_FacilityManagementDocumentDetailsGrid_WIFT008MT']")
	private WebElement estimatorDateReceived_482;

	public WebElement estimatorDateReceived_482() {
		return estimatorDateReceived_482;
	}

	@FindBy(xpath = "//input[@id='1_fmsFacDocumentsVO.CUSTODIAN_SENT_FacilityManagementDocumentDetailsGrid_WIFT008MT']")
	private WebElement custodianDateSent_482;

	public WebElement custodianDateSent_482() {
		return custodianDateSent_482;
	}

	@FindBy(xpath = "//input[@id='2_fmsFacDocumentsVO.SOL_DATE_SENT_FacilityManagementDocumentDetailsGrid_WIFT008MT']")
	private WebElement solicitorDateSent_Document2_482;

	public WebElement solicitorDateSent_Document2_482() {
		return solicitorDateSent_Document2_482;
	}

	@FindBy(xpath = "//input[@id='2_fmsFacDocumentsVO.SOL_DATE_REC_FacilityManagementDocumentDetailsGrid_WIFT008MT']")
	private WebElement solicitorDateReceived_Document2_482;

	public WebElement solicitorDateReceived_Document2_482() {
		return solicitorDateReceived_Document2_482;
	}

	@FindBy(xpath = "//input[@id='2_fmsFacDocumentsVO.EST_DATE_SENT_FacilityManagementDocumentDetailsGrid_WIFT008MT']")
	private WebElement estimatorDateSent_Document2_482;

	public WebElement estimatorDateSent_Document2_482() {
		return estimatorDateSent_Document2_482;
	}

	@FindBy(xpath = "//input[@id='2_fmsFacDocumentsVO.EST_DATE_REC_FacilityManagementDocumentDetailsGrid_WIFT008MT']")
	private WebElement estimatorDateReceivedDocument2_482;

	public WebElement estimatorDateReceivedDocument2_482() {
		return estimatorDateReceivedDocument2_482;
	}

	@FindBy(xpath = "//input[@id='2_fmsFacDocumentsVO.CUSTODIAN_SENT_FacilityManagementDocumentDetailsGrid_WIFT008MT']")
	private WebElement custodianDateSent_Document2_482;

	public WebElement custodianDateSent_Document2_482() {
		return custodianDateSent_Document2_482;
	}

	@FindBy(id = "facilitymanagement_save_btn_WIFT008MT")
	private WebElement saveButtonFacilitiesManagement_482;

	public WebElement saveButtonFacilitiesManagement_482() {
		return saveButtonFacilitiesManagement_482;
	}

	@FindBy(id = "DocumentDetailsTab_WIFT008MT")
	private WebElement documentDetailsFacilitiesManagement_482;

	public WebElement documentDetailsFacilitiesManagement_482() {
		return documentDetailsFacilitiesManagement_482;
	}

	@FindBy(xpath = "//td[@id='td_facilityManagementGridTbl_Id_WIFT008MT_1_fmsFacilityVO.CODE']")
	private WebElement storeFacilityCode_FacilitiesManagement_482;

	public WebElement storeFacilityCode_FacilitiesManagement_482() {
		return storeFacilityCode_FacilitiesManagement_482;
	}

	@FindBy(xpath = "//td[@id='td_ApplicationFacilityLimitDetailsGrid_WIFT001MT_1_fmsAppLimitDetVO.GENERAL_FACILITY_TYPE']")
	private WebElement productClassSelect_WIFAK_482;

	public WebElement productClassSelect_WIFAK_482() {
		return productClassSelect_WIFAK_482;
	}

	@FindBy(xpath = "//button[@id='applicationfacility_repayplan_btn_WIFT001MT']")
	private WebElement repaymentPlan_WIFAK_482;

	public WebElement repaymentPlan_WIFAK_482() {
		return repaymentPlan_WIFAK_482;
	}

	@FindBy(xpath = "//input[@id='No_Of_Payments_WIFT001MT']")
	private WebElement no_Of_Payments_RepaymentPlan_WIFAK_482;

	public WebElement no_Of_Payments_RepaymentPlan_WIFAK_482() {
		return no_Of_Payments_RepaymentPlan_WIFAK_482;
	}

	@FindBy(xpath = "//*[@id='profit_dist_method_WIFT001MT']")
	private WebElement profitRecognitionMethod_WIFAK_482;

	public WebElement profitRecognitionMethod_WIFAK_482() {
		return profitRecognitionMethod_WIFAK_482;
	}

	@FindBy(xpath = "//*[@id='createSchedule_WIFT001MT']")
	private WebElement createScheduleButton_WIFAK_482;

	public WebElement createScheduleButton_WIFAK_482() {
		return createScheduleButton_WIFAK_482;
	}

	@FindBy(xpath = "//input[@id='total_amt_WIFT001MT']")
	private WebElement totalAmountRepayment_WIFAK_482;

	public WebElement totalAmountRepayment_WIFAK_482() {
		return totalAmountRepayment_WIFAK_482;
	}

	@FindBy(xpath = "//div[@class='jMsgbox-contentWrap']")
	private WebElement Civil_ID_Expiry_Validation_PopUp_WIFAK_482;

	public WebElement CivilIDExpiryValidationPopUp_WIFAK_482() {
		return Civil_ID_Expiry_Validation_PopUp_WIFAK_482;
	}

	@FindBy(xpath = "//input[@id='global_user_run_date']")
	private WebElement Runnning_Date_Feild_WIFAK_482;

	public WebElement RunnningDateFeild_WIFAK_482() {
		return Runnning_Date_Feild_WIFAK_482;
	}

	@FindBy(xpath = "//span[@class='ui-button-text'][normalize-space()='Use']")
	private WebElement Runnning_Date_Use_Btn_WIFAK_482;

	public WebElement RunnningDateUseBtn_WIFAK_482() {
		return Runnning_Date_Use_Btn_WIFAK_482;
	}

//*******************************************App screen****************************************
	@FindBy(xpath = "//td[normalize-space()='App screen']")
	private WebElement fms_App_screen_MainMenu;

	public WebElement AppscreenMainMenu() {
		return fms_App_screen_MainMenu;
	}

	@FindBy(xpath = "//td[normalize-space()='App Screen']")
	private WebElement fms_App_screen_SubMenu;

	public WebElement AppscreenSubMenu() {
		return fms_App_screen_SubMenu;
	}

	@FindBy(xpath = "//*[@id= '_selenuimreqT001']//li//td[contains(text(),'Application For Financial Facilities')]")
	private WebElement fms_ApplicationForFinancialFacilitiesInAppScreenApplicationSubMenu;

	public WebElement fmsApplicationForFinancialFacilitiesInAppScreenApplicationSubMenu() {
		return fms_ApplicationForFinancialFacilitiesInAppScreenApplicationSubMenu;
	}

	@FindBy(id = "reqT001MT")
	// div[@id='_selenuimreqT001MT']\"
	// "//*[@id='_selenuimreqT001MT']//a[@id='reqT001MT']//span[contains(text(),'Maintenance')]"
	private WebElement fms_MaintenanceInApplicationForFinancialFacilitiesAppScreen;

	public WebElement fms_MaintenanceInApplicationForFinancialFacilitiesAppScreen() {
		return fms_MaintenanceInApplicationForFinancialFacilitiesAppScreen;
	}

	@FindBy(xpath = "//select[@id='applicationFacilityApplicationfor_reqT001MT']")
	private WebElement main_application_for_dropdown_App_Screen;

	public WebElement mainApplicationForDropdownAppScreen() {
		return main_application_for_dropdown_App_Screen;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_applicationFacilitycif_reqT001MT']")
	private WebElement main_cif_no_App_Screen;

	public WebElement mainCIFNoAppScreen() {
		return main_cif_no_App_Screen;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_applicationFacilityFacilityType_reqT001MT']")
	private WebElement main_facility_type_App_Screen;

	public WebElement mainFacilityTypeAppScreen() {
		return main_facility_type_App_Screen;
	}

	@FindBy(xpath = "//a[@id='App screen / App Screen / Application For Financial Facilities / Maintenance']")
	private WebElement main_facility_type_App_Maintenance_Screen;

	public WebElement mainFacilityTypeAppMaintenanceScreen() {
		return main_facility_type_App_Maintenance_Screen;
	}
	
	//*********************************************Req Screen***********************************************************

	@FindBy(xpath = "//td[normalize-space()='msdemo']")
	private WebElement fms_Req_screen_MainMenu;

	public WebElement ReqscreenMainMenu() {
		return fms_Req_screen_MainMenu;
	}

	@FindBy(xpath = "//*[@id='_selenuim567']/li/a/table/tbody/tr/td[2]")
	private WebElement fms_Req_screen_SubMenu;

	public WebElement ReqscreenSubMenu() {
		return fms_Req_screen_SubMenu;
	}
	

	@FindBy(xpath = "//*[@id='_selenuim567']//td[normalize-space()='Request For Financing']")
	private WebElement fms_ApplicationForFinancialFacilitiesInReqScreenApplicationSubMenu;

	public WebElement fmsApplicationForFinancialFacilitiesInReqScreenApplicationSubMenu() {
		return fms_ApplicationForFinancialFacilitiesInReqScreenApplicationSubMenu;
	}

	@FindBy(id = "567RF00MT")
	
	private WebElement fms_MaintenanceInApplicationForFinancialFacilitiesReqScreen;

	public WebElement fms_MaintenanceInApplicationForFinancialFacilitiesReqScreen() {
		return fms_MaintenanceInApplicationForFinancialFacilitiesReqScreen;
	}
	
	@FindBy(xpath = "//a[@id='msdemo / msdemo / Request For Financing / Maintenance']")
	private WebElement main_facility_type_Req_Maintenance_Screen;

	public WebElement mainFacilityTypeReqMaintenanceScreen() {
		return main_facility_type_Req_Maintenance_Screen;
	}
	
	
	@FindBy(xpath = "//a[@id='infoBarSearchButton_reqT001MT']")
	private WebElement main_facility_type_App_Screen_Maintenance_Search_Btn;

	public WebElement mainFacilityTypeAppMaintenanceSearchBtn() {
		return main_facility_type_App_Screen_Maintenance_Search_Btn;
	}
	
	//*****************//*[@id="applicationFacilityGridTbl_Id_reqT001MT_gs_fmsApplVO.CODE"]
	@FindBy(xpath = "//div//input[@id='applicationFacilityGridTbl_Id_reqT001MT_gs_fmsApplVO.CODE']")
	private WebElement main_facility_type_App_Screen_Maintenance_Search_CIF_Code_Feild;

	public WebElement mainFacilityTypeAppMaintenanceSearchCIFCodeFeild() {
		return main_facility_type_App_Screen_Maintenance_Search_CIF_Code_Feild;
	}
	
	
	
	@FindBy(xpath = "//*[@id='td_applicationFacilityGridTbl_Id_reqT001MT_1_fmsApplVO.CODE']")
	private WebElement main_facility_type_App_Screen_Maintenance_Searhed_Rec;

	public WebElement mainFacilityTypeAppMaintenanceSearhedRec() {
		return main_facility_type_App_Screen_Maintenance_Searhed_Rec;
	}
	
	@FindBy(xpath = "//a[@title='Limit Details']//span[normalize-space()='Limit Details']")
	private WebElement main_facility_type_App_Screen_Maintenance_Limit_Detail_Tab;

	public WebElement mainFacilityTypeAppMaintenanceLimitDetailTab() {
		return main_facility_type_App_Screen_Maintenance_Limit_Detail_Tab;
	}
	
	@FindBy(xpath = "//td[@id='td_ApplicationFacilityLimitDetailsGrid_reqT001MT_1_fmsAppLimitDetVO.GENERAL_FACILITY_TYPE']")
	private WebElement main_facility_type_App_Screen_Maintenance_Product_Class_Rec;

	public WebElement mainFacilityTypeAppMaintenanceProductClassRec() {
		return main_facility_type_App_Screen_Maintenance_Product_Class_Rec;
	}
	
	@FindBy(xpath = "//label[@id='applicationfacilityFormId_reqT001MT_Fixed_Assets_key']")
	private WebElement main_facility_type_App_Screen_Maintenance_Fixed_Assets_Tab;

	public WebElement mainFacilityTypeAppMaintenanceFixedAssetsTab() {
		return main_facility_type_App_Screen_Maintenance_Fixed_Assets_Tab;
	}
	
	@FindBy(xpath = "//td[@id='add_FmsIjaraFixedAssetsGrid_reqT001MT']//span[@class='ui-icon ui-icon-plus']")
	private WebElement main_facility_type_App_Screen_Maintenance_Fixed_Assets_Key_Add_Icon_Btn;

	public WebElement mainFacilityTypeAppMaintenanceFixedAssetsKeyAddIconBtn() {
		return main_facility_type_App_Screen_Maintenance_Fixed_Assets_Key_Add_Icon_Btn;
	}
	
	@FindBy(xpath = "//td[@id='td_FmsIjaraFixedAssetsGrid_reqT001MT_1_fmsFacilityAssetVO.CATEGORY_CODE']")
	private WebElement main_facility_type_App_Screen_Maintenance_Fixed_Assets_Key_Rec;

	public WebElement mainFacilityTypeAppMaintenanceFixedAssetsKeyRec() {
		return main_facility_type_App_Screen_Maintenance_Fixed_Assets_Key_Rec;
	}
	
	@FindBy(xpath = "//td[@class='liveSearchGridTd']//div//div//input[@role= 'livesearch'][@name='lookupTxt_fmsFacilityAssetVO.CATEGORY_CODE']")
	private WebElement main_facility_type_App_Screen_Maintenance_Fixed_Assets_Key_Rec_CATEGORY_CODE;

	public WebElement mainFacilityTypeAppMaintenanceFixedAssetsKeyRecCATEGORYCODE() {
		return main_facility_type_App_Screen_Maintenance_Fixed_Assets_Key_Rec_CATEGORY_CODE;
	}
	
	@FindBy(xpath = "//td[@class='liveSearchGridTd']//div//div//input[@role= 'livesearch'][@name='lookupTxt_fmsFacilityAssetVO.CLASS_CODE']")
	private WebElement main_facility_type_App_Screen_Maintenance_Fixed_Assets_Key_Rec_CLASS_CODE;

	public WebElement mainFacilityTypeAppMaintenanceFixedAssetsKeyRecCLASSCODE() {
		return main_facility_type_App_Screen_Maintenance_Fixed_Assets_Key_Rec_CLASS_CODE;
	}
	
	@FindBy(xpath = "//td[@tdlabel='Profit Rate']//div//input[@gridid='FmsIjaraFixedAssetsGrid_reqT001MT']")
	private WebElement main_facility_type_App_Screen_Maintenance_Fixed_Assets_Key_Rec_Profit_Rate;

	public WebElement mainFacilityTypeAppMaintenanceFixedAssetsKeyRecProfitRate() {
		return main_facility_type_App_Screen_Maintenance_Fixed_Assets_Key_Rec_Profit_Rate;
	}
	
	@FindBy(xpath = "//span[normalize-space()='OK']")
	private WebElement main_facility_type_App_Screen_Maintenance_Fixed_Assets_Key_Rec_OK_Btn;

	public WebElement mainFacilityTypeAppMaintenanceFixedAssetsKeyRecOKBtn() {
		return main_facility_type_App_Screen_Maintenance_Fixed_Assets_Key_Rec_OK_Btn;
	}
	
	
	@FindBy(xpath = "//div[@class='jMsgbox-contentWrap']")
	private WebElement main_facility_type_App_Screen_Maintenance_Fixed_Assets_Key_Warning_Message;

	public WebElement mainFacilityTypeAppMaintenanceFixedAssetsKeyWarning_Message() {
		return main_facility_type_App_Screen_Maintenance_Fixed_Assets_Key_Warning_Message;
	}
	
	
//************************************************************************************************************
		
	@FindBy(xpath = "//td[normalize-space()='Request']")
	private WebElement Request_Module;

	public WebElement RequestModule() {
		return Request_Module;
	}
	
	@FindBy(xpath = "//td[normalize-space()='Request Financing']")
	private WebElement Request_For_Financing;

	public WebElement RequestForFinancing() {
		return Request_For_Financing;
	}
	
    @FindBy(xpath = "//td[normalize-space()='Request For Financing']")
	private WebElement Sub_Request_For_Financing;

	public WebElement SubRequestForFinancing() {
		return Sub_Request_For_Financing;	
	}
	
	@FindBy(xpath = "//span[normalize-space()='Maintenance']")
	private WebElement Sub_Request_For_Financing_Maintenance;

	public WebElement SubRequestForFinancingMaintenance() {
		return Sub_Request_For_Financing_Maintenance;	
	}	
	
	@FindBy(xpath = "//a[@id='infoBarSearchButton_RFFRF00MT']")
	private WebElement Request_Module_Search_Button;

	public WebElement RequestModuleSearchButton() {
		return Request_Module_Search_Button;	
	}
	
	@FindBy(xpath = "//input[@id='requestFinancingGridTbl_Id_RFFRF00MT_gs_fmsRequestFinancingVO.CODE']")
	private WebElement Request_Module_Search_Code;

	public WebElement RequestModuleSearchCode() {
		return Request_Module_Search_Code;	
	}
	
	@FindBy(xpath = "//*[@id='requestFinancingGridTbl_Id_RFFRF00MT']")
	private WebElement Request_Module_Searched_Retrieved_Rec;

	public WebElement RequestModuleSearchedRetrievedRec() {
		return Request_Module_Searched_Retrieved_Rec;	
	}
	
	@FindBy(xpath = "//span[normalize-space()='Disbursement/Sublimit']")
	private WebElement Request_Module_Disbursement_Tab;

	public WebElement RequestModuleDisbursementTab() {
		return Request_Module_Disbursement_Tab;	
	}
	
	@FindBy(xpath = "//td[@id='td_RequestFinancingLimitDetailsGridId_RFFRF00MT_1_fmsAppLimitDetVO.GENERAL_FACILITY_TYPE']")
	private WebElement Request_Module_Disbursement_Product_Class_Rec;

	public WebElement RequestModuleDisbursementProductClassRec() {
		return Request_Module_Disbursement_Product_Class_Rec;	
	}
	
	//td[@id='td_FacilityChargesGrid_RFFRF00MT_1_fmsapplchargesVO.CHARGES_CODE']
	
	@FindBy(xpath = "//label[@id='requestFinancingFormId_RFFRF00MT_Fees_Charges_Key']")
	private WebElement Request_Module_Fixed_Charge_Btn;

	public WebElement RequestModuleFixedChargeBtn() {
		return Request_Module_Fixed_Charge_Btn;	
	}
	
	@FindBy(xpath = "//td[@id='td_FacilityChargesGrid_RFFRF00MT_1_fmsapplchargesVO.CHARGES_CODE']")
	private WebElement Request_Module_Charge_Code_Rec;

	public WebElement RequestModuleChargeCodeRec() {
		return Request_Module_Charge_Code_Rec;	
	}	
	
	@FindBy(xpath = "//input[@id='1_fmsapplchargesVO.CHARGES_CODE_lookuptxt_FacilityChargesGrid_RFFRF00MT']")
	private WebElement Request_Module_Charge_Code;

	public WebElement RequestModuleChargeCode() {
		return Request_Module_Charge_Code;	
	}
	
	
	@FindBy(xpath = "//span[normalize-space()='Ok']")
	private WebElement Request_Module_Charge_OK_Btn;

	public WebElement RequestModuleChargeOKBtn() {
		return Request_Module_Charge_OK_Btn;	
	}
	
	
	@FindBy(xpath = "//label[@id='requestFinancingFormId_RFFRF00MT_Validate_key']")
	private WebElement Request_Module_Validate_Btn;

	public WebElement RequestModuleValidateBtn() {
		return Request_Module_Validate_Btn;	
	}
	
	
	//@AT_RF_110*************************************************************************************************************

	
	@FindBy(xpath = "//td[.='Johns request']/ancestor::h3")//td[normalize-space()='Johns request']
    private WebElement Johns_Request_Module;
	
	public WebElement johnsRequestModule() {
		return Johns_Request_Module;	
	}
	
	@FindBy(xpath  ="//td[.='Joh reqs']/ancestor::a")
    private WebElement Sub_Johns_Request_Module;
	
	public WebElement SubjohnsRequestModule() {
		return Sub_Johns_Request_Module;	
	}
	
	@FindBy(xpath = "//td[.='Request For Financing']/ancestor::a")
    private WebElement Sub_Johns_Request_For_Financing;
	
	public WebElement SubjohnsRequestForFinancing() {
		return Sub_Johns_Request_For_Financing;	
	}
	
	@FindBy(xpath = "//span[.='Maintenance']/ancestor::a")
    private WebElement Sub_Johns_Request_For_Financing_Maintenance;
	
	public WebElement SubjohnsRequestForFinancingMaintenance() {
		return Sub_Johns_Request_For_Financing_Maintenance;	
	}
		
	@FindBy(xpath = "//select[@id='requestFinancingApplicationFor_333RF00MT']")
    private WebElement Reason_For_Submission_Drop_Down;
	
	public WebElement ReasonForSubmissionDropDown() {
		return Reason_For_Submission_Drop_Down;	
	}
	
	@FindBy(xpath = "//input[@id='requestFinancingInfoCompletionDate_333RF00MT']")
    private WebElement Info_Completion_Date;
	
	public WebElement InfoCompletionDate() {
		return Info_Completion_Date;	
	}
	
	@FindBy(xpath = "//input[@id='lookuptxt_requestFinanacingCif_333RF00MT']")
    private WebElement Customer_CIF;
	
	public WebElement CustomerCIF() {
		return Customer_CIF;	
	}
	
	@FindBy(xpath = "//input[@id='lookuptxt_requestFinancingFacilityType_333RF00MT']")
    private WebElement Facility_Type;
	
	public WebElement FacilityType() {
		return Facility_Type;	
	}
	
	@FindBy(xpath = "//input[@id='requestFinancingFacilityTotalvalue_333RF00MT']")
    private WebElement Total_Limit;
	
	public WebElement TotalLimit() {
		return Total_Limit;	
	}
	
	@FindBy(xpath = "//select[@id='requestFinancingRevolvingOneOff_333RF00MT']")
    private WebElement request_Financing_Revolving_One_Off_Dropdown;
	
	public WebElement requestFinancingRevolvingOneOffDropdown() {
		return request_Financing_Revolving_One_Off_Dropdown;	
	}
	
	
	@FindBy(xpath = "//select[@id='requestFinancingHistorywithITFC_333RF00MT']")
    private WebElement History_with_ITFC;
	
	public WebElement HistorywithITFC() {
		return History_with_ITFC;	
	}
	
	@FindBy(xpath = "//td[@id='add_RequestFinancingLimitDetailsGridId_333RF00MT']//span[@class='ui-icon ui-icon-plus']")
    private WebElement add_Request_Financing_Limit_Details;
	
	public WebElement add_RequestFinancingLimitDetails() {
		return add_Request_Financing_Limit_Details;	
	}
	
	
	@FindBy(xpath = "//input[@id='lookuptxt_requestFinancingLimitDetailsGeneralFacilityProductClass_333RF00MT']")
    private WebElement Product_Class;
	
	public WebElement ProductClass() {
		return Product_Class;	
	}
	
	@FindBy(xpath = "//span[normalize-space()='Add']")
    private WebElement Product_Class_Add;
	
	public WebElement ProductClassAdd() {
		return Product_Class_Add;	
	}
	
	@FindBy(xpath = "//tr[@id = '1']//td[@title = 'Product Class']")
    private WebElement Product_Class_Rec;
	
	public WebElement PricingClassRec() {
		return Product_Class_Rec;	
	}
	
	@FindBy(xpath = "//button[@id='requstFinancing_PricingDetails_btn_333RF00MT']//span[@class='ui-button-text']")
    private WebElement PricingDetails_Btn;
	
	public WebElement PricingDetailsBtn() {
		return PricingDetails_Btn;	
	}
	
	@FindBy(xpath = "//td[@id='add_fmsApprovalcommoditiesDetailsGrid_333RF00MT']//div//span[@class='ui-icon ui-icon-plus']")
    private WebElement PricingDetails_ADD_Btn;
	
	public WebElement PricingDetailsADDBtn() {
		return PricingDetails_ADD_Btn;	
	}
	
	
	@FindBy(xpath = "//td[@tdlabel='Start Date']")
    private WebElement Start_Date;
	
	public WebElement StartDate() {
		return Start_Date;	
	}
	
	@FindBy(xpath = "//td[@id='td_fmsPricingDetailsGrid_333RF00MT_1_fmsApplYieldDetVO.MARGIN_RATE']")
    private WebElement Markup_Spread_Rec;
	
	public WebElement MarkupSpreadRec() {
		return Markup_Spread_Rec;	
	}
	
	@FindBy(xpath = "//td/div/input[@id='new_1697624006290_fmsApplYieldDetVO.MARGIN_RATE']")
    private WebElement Markup_Spread_Input;
	
	public WebElement MarkupSpreadInput() {
		return Markup_Spread_Input;	
	}
	
	
	//@FindBy(css =  "#td_fmsPricingDetailsGrid_333RF00MT_1_fmsApplYieldDetVO\\.MARGIN_RATE")
	@FindBy(xpath = "//*[@id='td_fmsPricingDetailsGrid_333RF00MT_1_fmsApplYieldDetVO.MARGIN_RATE']//input")
    private WebElement Markup_Spread_InputBx;
	
	public WebElement Markup_Spread_InputBx() {
		return Markup_Spread_InputBx;	
	}
	
	//input/ancestor::td[@id='td_fmsPricingDetailsGrid_333RF00MT_1_fmsApplYieldDetVO.NO_OF_MONTHS']
	
	
	@FindBy(xpath = "//td[@id='td_fmsPricingDetailsGrid_333RF00MT_1_fmsApplYieldDetVO.MINIMUM_YIELD']//input")
    private WebElement Floor_Input;
	
	public WebElement FloorInput() {
		return Floor_Input;	
	}
	
	
	@FindBy(xpath = "//td[@id='td_fmsPricingDetailsGrid_333RF00MT_1_fmsApplYieldDetVO.MAXIMUM_YIELD']//input")
    private WebElement Cap_Input;
	
	public WebElement CapInput() {
		return Cap_Input;	
	}
	
	
	@FindBy(xpath = "//span[normalize-space()='OK']")
    private WebElement Pricing_Details_OK_Btn;
	
	public WebElement PricingDetailsOKBtn() {
		return Pricing_Details_OK_Btn;	
	}
	
	
	@FindBy(xpath = "//span[normalize-space()='Funding']")
    private WebElement Funding_Tab;
	
	public WebElement FundingTab() {
		return Funding_Tab;	
	}
	
	
	@FindBy(xpath = "//td[@id='add_RequestFinancingfundlimitsLimitDetailsGrid_333RF00MT']//span[@class='ui-icon ui-icon-plus']")
    private WebElement Funding_Add_Btn;
	
	public WebElement FundingAddBtn() {
		return Funding_Add_Btn;	
	}
	
	
	@FindBy(xpath = "//tr[@added = '1']//td[@tdlabel= 'Fund Code']")
    private WebElement Funding_Fund_Rec;
	
	public WebElement FundingFundRec() {
		return Funding_Fund_Rec;	
	}
	
	
	@FindBy(xpath = "//td[@class = 'liveSearchGridTd']//input[@name='lookupTxt_fmsApplFundLimitDetVO.FUND_CODE']")
    private WebElement Funding_Fund_Code;
	
	public WebElement FundingFundCode() {
		return Funding_Fund_Code;	
	}
	
	@FindBy(xpath = "//span[normalize-space()='Conditions']")
    private WebElement Conditions_Tab;
	
	public WebElement ConditionsTab() {
		return Conditions_Tab;	
	}
	
	@FindBy(xpath = "//input[@id='fmsTimeLimitsDivSignAgreementFromDays_333RF00MT']")
    private WebElement Signing_Agreement_From_Day;
	
	public WebElement SigningAgreementFromDay() {
		return Signing_Agreement_From_Day;	
	}
	
	@FindBy(xpath = "//input[@id='fmsTimeLimitsDivEffectiveFromDays_333RF00MT']")
    private WebElement Effective_From_Days;
	
	public WebElement EffectiveFromDays() {
		return Effective_From_Days;	
	}
	
	@FindBy(xpath = "//input[@id='fmsTimeLimitsDivFirstDisburseFromDays_333RF00MT']")
    private WebElement First_Disburse_From_Days;
	
	public WebElement FirstDisburseFromDays() {
		return First_Disburse_From_Days;	
	}
	
	@FindBy(xpath = "//input[@id='fmsTimeLimitsDivfullUtilizationFromDays_333RF00MT']")
    private WebElement full_Utilization_From_Days;
	
	public WebElement fullUtilizationFromDays() {
		return full_Utilization_From_Days;	
	}
	

	@FindBy(xpath = "//a[@title='Commodities and Security Components']")
    private WebElement Commodities_and_Security_Components;
	
	public WebElement CommoditiesandSecurityComponents() {
		return Commodities_and_Security_Components;	
	}
	
	@FindBy(xpath = "//td[@id='add_fmsApprovalcommoditiesDetailsGrid_333RF00MT']//span[@class='ui-icon ui-icon-plus']")
    private WebElement Add_Commodities_Btn;
	
	public WebElement AddCommoditiesBtn() {
		return Add_Commodities_Btn;	
	}
	
	
	@FindBy(xpath = "//td[@id='td_fmsApprovalcommoditiesDetailsGrid_333RF00MT_1_fmsApprvdCommdtyDetVO.CATEGORY']")
    private WebElement Commodities_New_Rec;
	
	public WebElement CommoditiesNewRec() {
		return Commodities_New_Rec;	
	}
	
	@FindBy(xpath = "//input[@dependency='fmsCommoditesAndsecurityComponenetCO.fmsApprvdCommdtyDetVO.CATEGORY:fmsApprvdCommdtyDetVO.CATEGORY']")
    private WebElement Commodities_Category_Input;
	
	public WebElement CommoditiesCategoryInput() {
		return Commodities_Category_Input;	
	}
	
	@FindBy(xpath = "//input[@dependency='fmsCommoditesAndsecurityComponenetCO.fmsApprvdCommdtyDetVO.SUB_CATEGORY:fmsApprvdCommdtyDetVO.SUB_CATEGORY,fmsCommoditesAndsecurityComponenetCO.subCategoryDesc:subCategoryDesc']")
    private WebElement Commodities_Sub_Category_Code;
	
	public WebElement CommoditiesSubCategoryCode() {
		return Commodities_Sub_Category_Code;	
	}
	
	@FindBy(xpath = "//input[@name='lookupTxt_fmsApprvdCommdtyDetVO.COMMODITY']")
    private WebElement Commodities_Code;
	
	public WebElement CommoditiesCode() {
		return Commodities_Code;	
	}
	
	
	@FindBy(xpath = "//td[@tdlabel='Expected %']//div//input")
    private WebElement Expected_perc;
	
	public WebElement Expectedperc() {
		return Expected_perc;	
	}
	
	@FindBy(xpath = "//span[normalize-space()='Source/Destination']")
    private WebElement Source_Destination_Tab;
	
	public WebElement SourceDestinationTab() {
		return Source_Destination_Tab;	
	}
	
	@FindBy(xpath = "//td[@id='add_fmsSpecificCountriesGrid_333RF00MT']//span[@class='ui-icon ui-icon-plus']")
    private WebElement Source_Destination_Add_Btn;
	
	public WebElement SourceDestinationAddBtn() {
		return Source_Destination_Add_Btn;	
	}
	
	
	@FindBy(xpath = "//td[@id='td_fmsSpecificCountriesGrid_333RF00MT_1_fmsSpecificDetailsVO.COUNTRY_CODE']")
    private WebElement Source_Destination_Specific_Country_Code_Rec;
	
	public WebElement SourceDestinationSpecificCountryCodeRec() {
		return Source_Destination_Specific_Country_Code_Rec;	
	}
	
	@FindBy(xpath = "//td[@id='td_fmsSpecificCountriesGrid_333RF00MT_1_fmsSpecificDetailsVO.COUNTRY_CODE']//input")
    private WebElement Source_Destination_Specific_Country_Code_input;
	
	public WebElement SourceDestinationSpecificCountryCodeinput() {
		return Source_Destination_Specific_Country_Code_input;	
	}
	
	@FindBy(xpath = "//td[@id='td_fmsSpecificCountriesGrid_333RF00MT_1_fmsSpecificDetailsVO.EXPECTED_PERC']//input")
    private WebElement Source_Destination_Specific_Country_EXPECTED_PERC;
	
	public WebElement SourceDestinationSpecificCountryEXPECTEDPERC() {
		return Source_Destination_Specific_Country_EXPECTED_PERC;	
	}
	
	@FindBy(xpath = "//label[@id='requestFinancingFormId_333RF00MT_save_key']")
    private WebElement Save_Btn;
	
	public WebElement SaveBtn() {
		return Save_Btn;	
	}
	
	@FindBy(xpath = "//label[@id='requestFinancingFormId_333RF00MT_Validate_key']")
    private WebElement Validate_Btn;
	
	public WebElement ValidateBtn() {
		return Validate_Btn;	
	}
	
	
	@FindBy(xpath = "//td[normalize-space()='CONSUMER FINANCE']")
    private WebElement CONSUMER_FINANCE;
	
	public WebElement CONSUMERFINANCE() {
		return CONSUMER_FINANCE;	
	}
	
	@FindBy(xpath = "//input[@id='lookuptxt_requestFinanacingCif_333RF00MT']")
	private WebElement Customer_CIF_Feild;

	public WebElement CustomerCIFFeild() {
		return Customer_CIF_Feild;
	}
	
	
	@FindBy(xpath = "//input[@id='//div[@class='jMsgbox-contentWrap']")
	private WebElement Server_Response_Error;

	public WebElement ServerResponseError() {
		return Server_Response_Error;
	}
	
	//td[@id='add_fmsPricingDetailsGrid_333RF00MT']/div/span
	@FindBy(xpath = "//td[@id='add_fmsPricingDetailsGrid_333RF00MT']/div/span")
	private WebElement addIcon_PricingDetails;

	public WebElement addIcon_PricingDetails() {
		return addIcon_PricingDetails;
	}
	
	
	
	@FindBy(xpath = "//div[.='Success']/parent::div/following-sibling::div/div")
	private WebElement Success_full_Pop_up;

	public WebElement SuccessfullPopup() {
		return Success_full_Pop_up;
	}
	
	
	@FindBy(xpath = "//div[@class='jMsgbox-contentWrap']")
	private WebElement Save_full_Pop_up1;

	public WebElement SavefullPopup1() {
		return Save_full_Pop_up1;
	}
	
	@FindBy(xpath = "//span[text()='Approve Level 1']/ancestor::a")
	private WebElement Approve1_Tab;

	public WebElement Approve1Tab() {
		return Approve1_Tab;
	}
	
	@FindBy(xpath = "//*[@id='infoBarSearchButton_333RF00P1']")
	private WebElement Approve1_Search_Btn;

	public WebElement Approve1SearchBtn() {
		return Approve1_Search_Btn;
	}
	
	@FindBy(xpath = "//div/input[@id='requestFinancingGridTbl_Id_333RF00P1_gs_fmsRequestFinancingVO.CODE']")
	private WebElement Approve1_Search_Code_Feild;

	public WebElement Approve1SearchCodeFeild() {
		return Approve1_Search_Code_Feild;
	}
	
	@FindBy(xpath = "//table[@id='requestFinancingGridTbl_Id_333RF00P1']//tr[@id = '1']")
	private WebElement Approve1_Search_Fetch_Rec;

	public WebElement Approve1SearchFetch_Rec() {
		return Approve1_Search_Fetch_Rec;
	}
	
	@FindBy(xpath = "//span[text()='Customer Grading & Recommendations']/parent::a")
	private WebElement Customer_Grading_Tab;

	public WebElement CustomerGradingTab() {
		return Customer_Grading_Tab;
	}
	//label[@id='requestFinancingFormId_CSMRF00MT_Apply_Grade']
	@FindBy(xpath = "//label[@id='requestFinancingFormId_CSMRF00MT_Apply_Grade']")
	private WebElement RFF_Apply_Grading_Btn;

	public WebElement RFF_ApplyGradingBtn() {
		return RFF_Apply_Grading_Btn;
	}
	
	//First Cif Row

	@FindBy(xpath = "//tr[@id = '1']//td[@tdlabel='Grading Line No']")
	private WebElement RFF_First_Cif_Record;

	public WebElement RFF_FirstCifRecord() {
		return RFF_First_Cif_Record;
	}
	
	@FindBy(xpath = "//input[@id='1_custgradedetvo.CUST_GRADE_SCORE_lookuptxt_custGradingDetails_Id_CSMRF00MT']")
	private WebElement RFF_First_Cif_Input_Field;

	public WebElement RFF_FirstCifInputField() {
		return RFF_First_Cif_Input_Field;
	}
	
	
	//Second Cif Row
	
	@FindBy(xpath = "//tr[@id = '2']//td[@tdlabel='Grading Line No']")
	private WebElement RFF_Second_Cif_Record;

	public WebElement RFF_SecondCifRecord() {
		return RFF_Second_Cif_Record;
	}
	
	@FindBy(xpath = "//input[@id='2_custgradedetvo.CUST_GRADE_SCORE_lookuptxt_custGradingDetails_Id_CSMRF00MT']")
	private WebElement RFF_Second_Cif_Input_Field;

	public WebElement RFF_SecondCifInputField() {
		return RFF_Second_Cif_Input_Field;
	}
	
	//Third Cif Row
	@FindBy(xpath = "//tr[@id = '3']//td[@tdlabel='Grading Line No']")
	private WebElement RFF_Third_Cif_Record;

	public WebElement RFF_ThirdCifRecord() {
		return RFF_Third_Cif_Record;
	}
	
	@FindBy(xpath = "//input[@id='3_custgradedetvo.CUST_GRADE_SCORE_lookuptxt_custGradingDetails_Id_CSMRF00MT']")
	private WebElement RFF_Third_Cif_Input_Field;

	public WebElement RFF_ThirdCifInputField() {
		return RFF_Third_Cif_Input_Field;
	}
	
	
	@FindBy(xpath = "//*[@id='requestDecisionForward_1_333RF00P1']")
	private WebElement Approve_Level_1_Drop_Down;

	public WebElement ApproveLevel1DropDown() {
		return Approve_Level_1_Drop_Down;
	}	

	
	@FindBy(xpath = "//label[@id='requestFinancingFormId_333RF00P1_approve_key']")
	private WebElement Approve_BTN;

	public WebElement ApproveBTN() {
		return Approve_BTN;
	}
	
	//****************************************************************************************************************************
		//@AT_RF_108
	
	@FindBy(xpath = "//td[normalize-space()='Facilities Management']")
	private WebElement Facilities_Management_Module;

	public WebElement FacilitiesManagementModule() {
		return Facilities_Management_Module;
	}
	
	@FindBy(xpath = "//a[@id='333T008MT']//span[contains(text(),'Maintenance')]")
	private WebElement Facilities_Management_Maintenance;

	public WebElement FacilitiesManagementMaintenance() {
		return Facilities_Management_Maintenance;
	}
	
	@FindBy(xpath = "//input[@id='facilityManagementGridTbl_Id_333T008MT_gs_fmsFacilityVO.CODE']")
	private WebElement Facilities_Management_Code;

	public WebElement FacilitiesManagementCode() {
		return Facilities_Management_Code;
	}
	
	
	@FindBy(xpath = "//a[@id='infoBarSearchButton_333T008MT']")
	private WebElement infoBar_Search_Button;

	public WebElement infoBarSearchButton() {
		return infoBar_Search_Button;
	}
	
	@FindBy(xpath = "//td[@id='td_facilityManagementGridTbl_Id_333T008MT_1_fmsFacilityVO.CODE']")
	private WebElement Facilities_Management_Retrived_Rec;

	public WebElement FacilitiesManagementRetrivedRec() {
		return Facilities_Management_Retrived_Rec;
	}
	
	
	@FindBy(xpath = "//span[normalize-space()='Additional Details']")
	private WebElement Facilities_Management_Additional_Details_Tab;

	public WebElement FacilitiesManagementAdditional_Details_Tab() {
		return Facilities_Management_Additional_Details_Tab;
	}
	
	@FindBy(xpath = "//label[@id='facilityManagementForm_333T008MT_commodities_and_security_component_key']")
	private WebElement Facilities_Management_commodities_and_security_component_Tab;

	public WebElement FacilitiesManagementCommoditiesandSecurityComponentTab() {
		return Facilities_Management_commodities_and_security_component_Tab;
	}
	
	
	@FindBy(xpath = "//select[@id='requestFinSecurityShipmentCoverage_333T008MT']")
	private WebElement Facilities_Management_Coverage_Type_DropDown;

	public WebElement FacilitiesManagementCoverageTypeDropDown() {
		return Facilities_Management_Coverage_Type_DropDown;
	}
	
	@FindBy(xpath = "//input[@id='requestFinancingShipmentRequiredCoveragePerc_333T008MT']")
	private WebElement Facilities_Management_Required_Coverage_Perc;

	public WebElement FacilitiesManagementRequiredCoveragePerc() {
		return Facilities_Management_Required_Coverage_Perc;
	}
	
	@FindBy(xpath = "//label[@id='requestFinancingFormId_333RF00MT_Document_Checklist_Key']")
	private WebElement Document_Checklist_Key;

	public WebElement DocumentChecklistKey() {
		return Document_Checklist_Key;
	}
	
	
	@FindBy(xpath = "//tr//td[@tdlabel='Document Code']")
	private WebElement Document_Records;

	public WebElement Document_Records() {
		return Document_Records;
	}
	
	@FindBy(xpath = "//button[@id='applicationfacility_documentchecklist_btn_WIFT001MT']//label[@id='applicationfacilityFormId_WIFT001MT_document_checklist_key']")
	private WebElement App_Document_Checklist_Key;

	public WebElement AppDocumentChecklistKey() {
		return App_Document_Checklist_Key;
	}
	
	@FindBy(xpath = "//span[@class = 'ui-button-text'][contains(text(),'Ok')]")
	private WebElement Document_Checklist_OK_Btn;

	public WebElement DocumentChecklist() {
		return Document_Checklist_OK_Btn;
	}
	
	
	@FindBy(xpath = "//span[normalize-space()='Owners/Shareholders']")
	private WebElement Owners_Shareholders_TAB;

	public WebElement OwnersShareholdersTAB() {
		return Owners_Shareholders_TAB;
	}
	
	@FindBy(xpath = "//tr[@added = '1']//td[@aria-describedby=\"RequestFinancingOwnerGridId_CSMRF00MT_rn\"]")
	private WebElement Owners_Shareholders_New_Rec;

	public WebElement OwnersShareholdersNewRec() {
		return Owners_Shareholders_New_Rec;
	}
	
	@FindBy(xpath = "//tr[@added = '1']//td[@tdlabel='Name']//input")
	private WebElement Owners_Shareholders_New_Rec_Name;

	public WebElement OwnersShareholdersNewRecName() {
		return Owners_Shareholders_New_Rec_Name;
	}
	
	@FindBy(xpath = "//tr[@added = '1']//td[@tdlabel='CIF']//input")
	private WebElement Owners_Shareholders_New_Rec_CIF;

	public WebElement OwnersShareholdersNewRecCIF() {
		return Owners_Shareholders_New_Rec_CIF;
	}
	
	@FindBy(xpath = "//td[@id='add_RequestFinancingOwnerGridId_CSMRF00MT']//div//span[@class = 'ui-icon ui-icon-plus']")
	private WebElement Owners_Shareholders_Add_icon;

	public WebElement Owners_ShareholdersAddicon() {
		return Owners_Shareholders_Add_icon;
	}
	
	
	@FindBy(xpath = "//div[@class='displayProgBar']//div[@class = 'progBarContent']")
	private WebElement Progress_Icon;

	public WebElement ProgressIcon() {
		return Progress_Icon;
	}
	
	
	@FindBy(xpath = "//span[@class='displayProgIcon']//img")
	private WebElement displayProgIcon;

	public WebElement displayProgIcon() {
		return displayProgIcon;
	}

	
	@FindBy(xpath = "//a[@id='dismissbut_CSMRF00MT']")
	private WebElement AlertDismissBtn;

	public WebElement AlertDismissBtn() {
		return AlertDismissBtn;
	}
	
	//**************************************************************************************************************
	//@aAT_FM_021
	
	@FindBy(xpath = "//span[contains(text(), 'Approve Level 1/Reject')]")
	private WebElement Aff_Approve_Level_1_Reject;
	public WebElement AffApproveLevel1Reject() {
		return Aff_Approve_Level_1_Reject;
	}
	
	@FindBy(xpath = "//input[@id='applicationFacilityGridTbl_Id_WIFT001AP1_gs_fmsApplVO.CODE']")
	private WebElement Aff_Approve_Level_1_Search_Code;
	public WebElement AffApproveLevel1SearchCode() {
		return Aff_Approve_Level_1_Search_Code;
	}
	
	
	@FindBy(xpath = "//tr[@id = '1']//td[@tdlabel= 'Code'][contains(text(),'5872')]")
	private WebElement Aff_Approve_Level_1_Search_Rec;
	public WebElement AffApproveLevel1SearchRec() {
		return Aff_Approve_Level_1_Search_Rec;
	}
	
	@FindBy(xpath = "//button[@id = 'applicationFacility_submit_btn_WIFT001MT']//span[contains(text(),'Submit')]")
	private WebElement Aff_Approve_Level_1_Submit;
	public WebElement AffApproveLevel1Submit() {
		return Aff_Approve_Level_1_Submit;
	}
	
	
	@FindBy(xpath = "//select[@name='applicationFacilityCO.fmsAppl3BlobsVO.DECISION_P1']")
	private WebElement Aff_Approve_Level_1_Decision1;
	public WebElement AffApproveLevel1Decision1() {
		return Aff_Approve_Level_1_Decision1;
	}
	
	// **************************************************************************************************************************
		//@AT_DDR_084_01


		@FindBy(xpath = "//select[@id='requestFinancingGeneralFacilityType_333RF00MT']")
		private WebElement productClassItemDropDownInLimitDetailsJohnsRequest;

		public WebElement productClassItemDropDownInLimitDetailsJohnsRequest() {
			return productClassItemDropDownInLimitDetailsJohnsRequest;
		}

		@FindBy(xpath = "//input[@id='requestFinancingFacilityTypetFinAccBr_333RF00MT']")
		private WebElement productClassAccountBrInLimitDetailsJohnsRequest;

		public WebElement productClassAccountBrInLimitDetailsJohnsRequest() {
			return productClassAccountBrInLimitDetailsJohnsRequest;
		}
		
		
		@FindBy(xpath = "//span[normalize-space()='Request Details']")
		private WebElement Retail_Details_Tab_JohnsRequest;

		public WebElement RetailDetailsTabJohnsRequest() {
			return Retail_Details_Tab_JohnsRequest;
		}
		
		@FindBy(xpath = "//button[@id='limitDetails_close_btn_333RF00MT']")
		private WebElement productClassCloseBtnInLimitDetailsJohnsRequest;

		public WebElement productClassCloseBtnInLimitDetailsJohnsRequest() {
			return productClassCloseBtnInLimitDetailsJohnsRequest;
		}
}
