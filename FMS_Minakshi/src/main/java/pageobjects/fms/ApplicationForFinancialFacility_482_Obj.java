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
	@FindBy(xpath="//span[contains(text(),' Status Details ')]")
	private WebElement AFFstatusdetails;
	public  WebElement AFFstatusdetails() {
		return AFFstatusdetails;
	}
	@FindBy(xpath="//td[@tdlabel='Date']")
	private WebElement statusdetaildate;
	public WebElement statusdetaildate() {
		return  statusdetaildate;
	}
	@FindBy(id = "CSMRF00MT")
	private WebElement requestForFinancingMaintenanceScreen;

	public WebElement requestForFinancingMaintenanceScreen() {
		return requestForFinancingMaintenanceScreen;
	}

	
	@FindBy(xpath="//input[@name='applicationFacilityCO.fmsAppLimitDetCO.fmsAppLimitDetVO.MARGIN_RATE']")
	private WebElement MARGINRATE;

	public WebElement MARGINRATE() {
		return MARGINRATE;
	}

	
	@FindBy(xpath="//button[@id='applicationfacility_facilityRiskRating_btn_WIFT001MT']//span/following-sibling::span")
	private WebElement applicationfacilityfacilityRiskRatingbtn;

	public WebElement applicationfacilityfacilityRiskRatingbtn() {
		return applicationfacilityfacilityRiskRatingbtn;
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

	@FindBy(xpath = "//*[@id=\"requestFinancingFacilityTotalvalue_CSMRF00MT\"]")
	private WebElement totalLimitInRequestForFinancingScreen;

	public WebElement totalLimitInRequestForFinancingScreen() {
		return totalLimitInRequestForFinancingScreen;
	}
	
	@FindBy(xpath = "requestFinancingCyRate_CSMRF00MT")
	private WebElement cvValueValidationInRequestForFinancingScreen;

	public WebElement cvValueValidationInRequestForFinancingScreen() {
		return cvValueValidationInRequestForFinancingScreen;
	}
	
	@FindBy(xpath ="//*[@id=\"requestFinancingLimitDtlsTabs_CSMRF00MT\"]")
	private WebElement disbursementOrSublimitInRequestForFinancingScreen;

	public WebElement disbursementOrSublimitInRequestForFinancingScreen() {
		return disbursementOrSublimitInRequestForFinancingScreen;
	}
	
	@FindBy(xpath = "//*[@id=\"add_RequestFinancingLimitDetailsGridId_CSMRF00MT\"]/div/span")
	private WebElement addIconInDisbursementOrSublimitScreen;

	public WebElement addIconInDisbursementOrSublimitScreen() {
		return addIconInDisbursementOrSublimitScreen;
	}
	@FindBy(xpath = "")
	private WebElement retrivedatadoubleclick;

	public WebElement retrivedatadoubleclick() {
		return retrivedatadoubleclick;
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

	@FindBy(id = "requestForFinance_save_btn_CSMRF00MT")
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
	
	@FindBy(xpath = "//*[@id=\"lookuptxt_applicationFacilityFacilityType_WIFT001MT\"]")
	private WebElement main_facility_type;
	public WebElement mainFacilityType() {
		return main_facility_type;
	}
	
	@FindBy(xpath = "//label[@id='applicationfacilityFormId_WIFT001MT_FacilityType_key']")
	private WebElement facility_touch;
	public WebElement facilityTouch() {
		return facility_touch;
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
	
	@FindBy(xpath ="//li[@id='applicationFacilityAdditionDetailsTabs_WIFT001MT']")
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
	
	@FindBy(id ="_popup_path_sol_ok")
	private WebElement okbuttonInFacilityValuePopUp;
	public WebElement okbuttonInFacilityValuePopUp() {
		return okbuttonInFacilityValuePopUp;
	}
	
	@FindBy(id ="applicationFacilityfinancedamount_WIFT001MT")
	private WebElement financeAmountRandomClick;
	public WebElement financeAmountRandomClick() {
		return financeAmountRandomClick;
	}
	
	@FindBy(id ="applicationFacilitydownpaymentperc_WIFT001MT")
	private WebElement downPaymentPercentage;
	public WebElement downPaymentPercentage() {
		return downPaymentPercentage;
	}
	
	@FindBy(id ="applicationFacilitydownpayment_WIFT001MT")
	private WebElement downPaymentValue;
	public WebElement downPaymentValue() {
		return downPaymentValue;
	}
	
	@FindBy(id ="applicationFacilityDownPaymentToVendorPerc_WIFT001MT")
	private WebElement downPaymentToVendorPercentage;
	public WebElement downPaymentToVendorPercentage() {
		return downPaymentToVendorPercentage;
	}
	
	@FindBy(id ="applFacilityDownPaymentToVendor_WIFT001MT")
	private WebElement downPaymentToVendorValue;
	public WebElement downPaymentToVendorValue() {
		return downPaymentToVendorValue;
	}
	
	@FindBy(id ="applicationFacilitychargeamount_WIFT001MT")
	private WebElement downPaymentRandomClick;
	public WebElement downPaymentRandomClick() {
		return downPaymentRandomClick;
	}
	
	@FindBy(id ="applFacilityTotalDownPaymentPerc_WIFT001MT")
	private WebElement totalDownPaymentPercentage;
	public WebElement totalDownPaymentPercentage() {
		return totalDownPaymentPercentage;
	}
	
	@FindBy(id ="applFacilityTotalDownPayment_WIFT001MT")
	private WebElement totalDownPaymentValue;
	public WebElement totalDownPaymentValue() {
		return totalDownPaymentValue;
	}
	
	@FindBy(xpath ="//div[contains(text(),'[20190] Down Payment cannot be greater than Total Amount.')]")
	private WebElement downPaymentGreaterThanTotalAmountValidation;
	public WebElement downPaymentGreaterThanTotalAmountValidation() {
		return downPaymentGreaterThanTotalAmountValidation;
	}
	
	@FindBy(id ="_popup_path_sol_ok")
	private WebElement downPaymentPopUpOk;
	public WebElement downPaymentPopUpOk() {
		return downPaymentPopUpOk;
	}
	//**********************economic and sub economic code************************************************************//
	
	
	@FindBy(xpath ="//td[text()='CIF Parameters']//preceding-sibling::td")
	private WebElement CIFparameterSubMenu_CSM;
	public WebElement CIFparameterSubMenu_CSM() {
		return CIFparameterSubMenu_CSM;
	}
	
	@FindBy(xpath ="//td[text()='Parameters']//preceding-sibling::td")
	private WebElement parameterMainMenu_CSM;
	public WebElement parameterMainMenu_CSM() {
		return parameterMainMenu_CSM;
	}
	@FindBy(xpath ="//td[text()='Parameters']//preceding-sibling::td")
	private WebElement parameterMainMenu_FMS;
	public WebElement parameterMainMenu_FMS() {
		return parameterMainMenu_FMS;
	}
	
	@FindBy(xpath ="//td[text()='Economic Sector']/preceding-sibling::td")
	private WebElement economicSectorMenu_CSM;
	public WebElement economicSectorMenu_CSM() {
		return economicSectorMenu_CSM;
	}
	
	@FindBy(xpath ="//td[text()='Sub Economic Sector']/preceding-sibling::td")
	private WebElement subEconomicSectorMenu_CSM;
	public WebElement subEconomicSectorMenu_CSM() {
		return subEconomicSectorMenu_CSM;
	}
	
	@FindBy(id ="P009MT")
	private WebElement maintenanceSubEconomicSector_CSM;
	public WebElement maintenanceSubEconomicSector_CSM() {
		return maintenanceSubEconomicSector_CSM;
	}
	
	@FindBy(id ="P008MT")
	private WebElement maintenanceEconomicSector_CSM;
	public WebElement maintenanceEconomicSector_CSM() {
		return maintenanceEconomicSector_CSM;
	}
	
	@FindBy(id ="sector_code_P008MT")
	private WebElement sectorCodeEconomicSector_CSM;
	public WebElement sectorCodeEconomicSector_CSM() {
		return sectorCodeEconomicSector_CSM;
	}
	@FindBy(xpath ="//input[@id='sector_code_P008MT']")
	private WebElement searchCodeEconomicSector_CSM;
	public WebElement searchCodeEconomicSector_CSM() {
		return searchCodeEconomicSector_CSM;
	}
	
	@FindBy(xpath ="//input[@id='brief_desc_eng_P008MT']")
	private WebElement briefNameEconomicSector_CSM;
	public WebElement briefNameEconomicSector_CSM() {
		return briefNameEconomicSector_CSM;
	}
	
	@FindBy(xpath ="//input[@id='brief_desc_arab_P008MT']")
	private WebElement briefNameArabEconomicSector_CSM;
	public WebElement briefNameArabEconomicSector_CSM() {
		return briefNameArabEconomicSector_CSM;
	}
	
	@FindBy(xpath ="//button[@id='economicSectorMaint_Maint_save_P008MT']")
	private WebElement saveButtonEconomicSector_CSM;
	public WebElement saveButtonEconomicSector_CSM() {
		return saveButtonEconomicSector_CSM;
	}
	
	@FindBy(id ="_popup_path_sol_confirm_ok")
	private WebElement okButtonInConfirmEconomicSector_CSM;
	public WebElement okButtonInConfirmEconomicSector_CSM() {
		return okButtonInConfirmEconomicSector_CSM;
	}
	
	@FindBy(id ="_popup_path_sol_ok")
	private WebElement okButtonInSucessPopUpEconomicSector_CSM;
	public WebElement okButtonInSucessPopUpEconomicSector_CSM() {
		return okButtonInSucessPopUpEconomicSector_CSM;
	}
	
	@FindBy(id ="P008P")
	private WebElement approveScreenEconomicSector_CSM;
	public WebElement approveScreenEconomicSector_CSM() {
		return approveScreenEconomicSector_CSM;
	}
	
	@FindBy(id ="P009P")
	private WebElement approveScreenSubEconomicSector_CSM;
	public WebElement approveScreenSubEconomicSector_CSM() {
		return approveScreenSubEconomicSector_CSM;
	}
	@FindBy(id ="economicSectorList_GridTbl_Id_P008P_gs_ecoSectorsVO.SECTOR_CODE")
	private WebElement searchCodeApproveScreenEconomicSector_CSM;
	public WebElement searchCodeApproveScreenEconomicSector_CSM() {
		return searchCodeApproveScreenEconomicSector_CSM;
	}
	
	@FindBy(id ="td_economicSectorList_GridTbl_Id_P008P_1_ecoSectorsVO.SECTOR_CODE")
	private WebElement selectSearchedCodeApproveScreenEconomicSector_CSM;
	public WebElement selectSearchedCodeApproveScreenEconomicSector_CSM() {
		return selectSearchedCodeApproveScreenEconomicSector_CSM;
	}
	
	@FindBy(xpath ="//label[text()='Approve ']/parent::span/preceding-sibling::span")
	private WebElement approveButtonEconomicSector_CSM;
	public WebElement approveButtonEconomicSector_CSM() {
		return approveButtonEconomicSector_CSM;
	}
	@FindBy(xpath ="//label[text()='Approve ']/parent::span/preceding-sibling::span")
	private WebElement approveButtonSubEconomicSector_CSM;
	public WebElement approveButtonSubEconomicSector_CSM() {
		return approveButtonSubEconomicSector_CSM;
	}
	
	@FindBy(id ="sector_code_P009MT")
	private WebElement selectSectorKeySubEconomicSector_CSM;
	public WebElement selectSectorKeySubEconomicSector_CSM() {
		return selectSectorKeySubEconomicSector_CSM;
	}

	@FindBy(id ="sub_sector_code_P009MT")
	private WebElement subSectorCodeSubEconomicSector_CSM;
	public WebElement subSectorCodeSubEconomicSector_CSM() {
		return subSectorCodeSubEconomicSector_CSM;
	}
	
	@FindBy(id ="brief_desc_eng_P009MT")
	private WebElement briefNameSubEconomicSector_CSM;
	public WebElement briefNameSubEconomicSector_CSM() {
		return briefNameSubEconomicSector_CSM;
	}
	
	@FindBy(xpath ="//input[@id='brief_desc_arab_P009MT']")
	private WebElement briefNameArabSubEconomicSector_CSM;
	public WebElement briefNameArabSubEconomicSector_CSM() {
		return briefNameArabSubEconomicSector_CSM;
	}
	
	@FindBy(id ="subEconomicSectorMaint_Maint_save_P009MT")
	private WebElement saveButtonInSubEconomicSector_CSM;
	public WebElement saveButtonInSubEconomicSector_CSM() {
		return saveButtonInSubEconomicSector_CSM;
	}
	
	@FindBy(id ="td_subEconomicSectorList_GridTbl_Id_P009P_1_rifsecVO.SECTOR_CODE")
	private WebElement selectSearchedCodeApproveScreenSubEconomicSector_CSM;
	public WebElement selectSearchedCodeApproveScreenSubEconomicSector_CSM() {
		return selectSearchedCodeApproveScreenSubEconomicSector_CSM;
	}
	
	@FindBy(id ="subEconomicSectorList_GridTbl_Id_P009P_gs_rifsecVO.SECTOR_CODE")
	private WebElement SearchCodeInApproveScreenSubEconomicSector_CSM;
	public WebElement SearchCodeInApproveScreenSubEconomicSector_CSM() {
		return SearchCodeInApproveScreenSubEconomicSector_CSM;
	}
	
	@FindBy(id ="lookuptxt_requestFinancingSectorSection_CSMRF00MT")
	private WebElement sectorCodeInrequestForFinancingScreen;
	public WebElement sectorCodeInrequestForFinancingScreen() {
		return sectorCodeInrequestForFinancingScreen;
	}
	@FindBy(id ="lookuptxt_requestFinancingSubSectorSection_CSMRF00MT")
	private WebElement subSectorCodeInrequestForFinancingScreen;
	public WebElement subSectorCodeInrequestForFinancingScreen() {
		return subSectorCodeInrequestForFinancingScreen;
	}
	
	@FindBy(xpath ="//td[text()='Product Class']")
	private WebElement productClassInDisbursementSublimit;
	public WebElement productClassInDisbursementSublimit() {
		return productClassInDisbursementSublimit;
	}
	
	@FindBy(xpath ="//input[@id='requestFinancingLimitDetailsClassDesc_CSMRF00MT']")
	private WebElement productClassNameValidationInRepaymentPlan;
	public WebElement productClassNameValidationInRepaymentPlan() {
		return productClassNameValidationInRepaymentPlan;
	}
	
	@FindBy(xpath ="//*[@id=\"requestFinancingFormId_CSMRF00MT_Repayment_Plan_Key\"]")
	private WebElement repaymentPlanOption;
	public WebElement repaymentPlanOption() {
		return repaymentPlanOption;
	}
	
	@FindBy(xpath ="//input[@id='No_Of_Payments_CSMRF00MT']")
	private WebElement noOfPaymentsInrepaymentPlan;
	public WebElement noOfPaymentsInrepaymentPlan() {
		return noOfPaymentsInrepaymentPlan;
	}
	@FindBy(xpath ="//input[@id='paym_periodn_nbr_CSMRF00MT']")
	private WebElement payEveryInrepaymentPlan;
	public WebElement payEveryInrepaymentPlan() {
		return payEveryInrepaymentPlan;
	}
	
	@FindBy(xpath ="//input[@id='maturity_date_CSMRF00MT']")
	private WebElement maturityDateInrepaymentPlan;
	public WebElement maturityDateInrepaymentPlan() {
		return maturityDateInrepaymentPlan;
	}
	
	@FindBy(xpath ="//span[@id='hdr_runn_date']")
	private WebElement systemDate;
	public WebElement systemDate() {
		return systemDate;
	}
	
	@FindBy(xpath ="//a[@id='infoBarSearchButton_CSMRF00MT']")
	private WebElement searchIconInMaintenanceRequestForFinancing;
	public WebElement searchIconInMaintenanceRequestForFinancing() {
		return searchIconInMaintenanceRequestForFinancing;
	}
	
	@FindBy(xpath ="//a[@id='infoBarSearchButton_WIFT001MT']")
	private WebElement searchIconInMaintenanceUnderWifakApplication;
	public WebElement searchIconInMaintenanceUnderWifakApplication() {
		return searchIconInMaintenanceRequestForFinancing;
	}
	
	@FindBy(xpath ="//input[@id='requestFinancingGridTbl_Id_CSMRF00MT_gs_fmsRequestFinancingVO.CODE']")
	private WebElement searchCodeInMaintenanceRequestForFinancing;
	public WebElement searchCodeInMaintenanceRequestForFinancing() {
		return searchCodeInMaintenanceRequestForFinancing;
	}
	
	@FindBy(xpath ="//td[@id='td_requestFinancingGridTbl_Id_CSMRF00MT_1_fmsRequestFinancingVO.CODE']")
	private WebElement selectSearchedCodeInMaintenanceRequestForFinancing;
	public WebElement selectSearchedCodeInMaintenanceRequestForFinancing() {
		return selectSearchedCodeInMaintenanceRequestForFinancing;
	}
	//****************************purpose of financing*****************************************//
	
	@FindBy(xpath ="//td[text()='Purpose of Financing']//preceding-sibling::td")
	private WebElement purposeOfFinancingSubMenu;
	public WebElement purposeOfFinancingSubMenu() {
		return purposeOfFinancingSubMenu;
	}
	
	@FindBy(id ="P038MT")
	private WebElement maintenanceInPurposeOfFinancingSubMenu;
	public WebElement maintenanceInPurposeOfFinancingSubMenu() {
		return maintenanceInPurposeOfFinancingSubMenu;
	}
	
	@FindBy(xpath="//*[@id='purposefinancingFormIdCode_P038MT']")
	private WebElement codeInMaintenancePurposeOfFinancing;
	public WebElement codeInMaintenancePurposeOfFinancing() {
		return codeInMaintenancePurposeOfFinancing;
	}
	
	@FindBy(xpath="//*[@id='purposefinancingFormIdAdditionalNumber_P038MT']")
	private WebElement additionalNumberInMaintenancePurposeOfFinancing;
	public WebElement additionalNumberInMaintenancePurposeOfFinancing() {
		return additionalNumberInMaintenancePurposeOfFinancing;
	}
	
	@FindBy(xpath="//input[@id='purposefinancingFormIdDescription_eng_P038MT']")
	private WebElement descriptionInMaintenancePurposeOfFinancing;
	public WebElement descriptionInMaintenancePurposeOfFinancing() {
		return descriptionInMaintenancePurposeOfFinancing;
	}
	
	@FindBy(xpath="//*[@id='purposeFinancingProductClassTab_P038MT']/a/span")
	private WebElement productClassInMaintenancePurposeOfFinancing;
	public WebElement productClassInMaintenancePurposeOfFinancing() {
		return productClassInMaintenancePurposeOfFinancing;
	}
	
	@FindBy(xpath="//*[@id=\"add_purposeFinancingProductClassGrid_P038MT\"]/div/span")
	private WebElement addProductClassInProductClassOptions;
	public WebElement addProductClassInProductClassOptions() {
		return addProductClassInProductClassOptions;
	}
	
	@FindBy(xpath="//*[@id='td_purposeFinancingProductClassGrid_P038MT_1_purposeFinancingProductClassVO.PRODUCTCLASS']//input")
	private WebElement searchProductCodeInProductOptions;
	public WebElement searchProductCodeInProductOptions() {
		return searchProductCodeInProductOptions;
	}
	
	@FindBy(xpath="//*[@id='td_purposeFinancingProductClassGrid_P038MT_1_purposeFinancingProductClassVO.PRODUCTCLASS']")
	private WebElement clickToEnterProductCodeInProductOptions;
	public WebElement clickToEnterProductCodeInProductOptions() {
		return clickToEnterProductCodeInProductOptions;
	}
	
	@FindBy(id ="purposeFinancingMaint_save_P038MT")
	private WebElement saveButtonInMaintenancePurposeOfFinancing;
	public WebElement saveButtonInMaintenancePurposeOfFinancing() {
		return saveButtonInMaintenancePurposeOfFinancing;
	}
	
	@FindBy(xpath="//*[@id='td_purposeFinancingProductClassGrid_P038MT_1_productClassdesc']")
	private WebElement productClassNameValidationInPurposeOfFinancing;
	public WebElement productClassNameValidationInPurposeOfFinancing() {
		return productClassNameValidationInPurposeOfFinancing;
	}
	
	@FindBy(xpath="//span[text()='Approve']/preceding-sibling::span")
	private WebElement approveSubMenuInPurposeOfFinancing;
	public WebElement approveSubMenuInPurposeOfFinancing() {
		return approveSubMenuInPurposeOfFinancing;
	}
	
	@FindBy(xpath ="//input[@id='purposeFinancingListGridTbl_Id_P038P_gs_purposeFinancingVO.CODE']")
	private WebElement searchCodeInApproveScreenPurposeOfFinancing;
	public WebElement searchCodeInApproveScreenPurposeOfFinancing() {
		return searchCodeInApproveScreenPurposeOfFinancing;
	}
	
	@FindBy(xpath="//td[@id='td_purposeFinancingListGridTbl_Id_P038P_1_purposeFinancingVO.CODE']")
	private WebElement selectSearchedCodeInApproveScreenPurposeOfFinancing;
	public WebElement selectSearchedCodeInApproveScreenPurposeOfFinancing() {
		return selectSearchedCodeInApproveScreenPurposeOfFinancing;
	}
	
	@FindBy(xpath="//button[@id='purposeFinancingMaint_approve_P038P']")
	private WebElement approveButtonInApproveScreenPurposeOfFinancing;
	public WebElement approveButtonInApproveScreenPurposeOfFinancing() {
		return approveButtonInApproveScreenPurposeOfFinancing;
	}
	
	@FindBy(xpath="//input[@id=\"lookuptxt_requestFinancingLimitDetailsPurposeOfFin_CSMRF00MT\"]")
	private WebElement purposeOfFinancingInLimitDetailsPopUpScreen;
	public WebElement purposeOfFinancingInLimitDetailsPopUpScreen() {
		return purposeOfFinancingInLimitDetailsPopUpScreen;
	}
	
	@FindBy(id="requestFinancingLimitDetailsEXCH_RATE_CSMRF00MT")
	private WebElement purposeOfFinancingInLimitDetailsPopUpScreenRandomClick;
	public WebElement purposeOfFinancingInLimitDetailsPopUpScreenRandomClick() {
		return purposeOfFinancingInLimitDetailsPopUpScreenRandomClick;
	}
	
	@FindBy(id="requestFinancingLimitDetailsCfPurposeDesc_CSMRF00MT")
	private WebElement purposeOfFinancingInLimitDetailsValidation;
	public WebElement purposeOfFinancingInLimitDetailsValidation() {
		return purposeOfFinancingInLimitDetailsValidation;
	}
	//**************************************************Decimal value validation*********************************************
	
	@FindBy(xpath="//*[@id='requestFinancingGridTbl_Id_CSMRF00MT_gs_STATUSDESC']")
	private WebElement searchStatusInMaintenanceRequestForFinancing;
	public WebElement searchStatusInMaintenanceRequestForFinancing() {
		return searchStatusInMaintenanceRequestForFinancing; 
	}
    // attribue nbformat
	@FindBy(xpath="//input[@id='requestFinancingLimitDetails_FLOOR_RATE_PERCENTAGE_CSMRF00MT']")
	private WebElement floorRatePercentageKey;
	public WebElement floorRatePercentageKeyInLimitDetailsPopUpScreen() {
		return floorRatePercentageKey; 
	}
	
	@FindBy(xpath="//input[@id='requestFinancingLimitDetailsSubLimitLowerLimitPercentage_CSMRF00MT']")
	private WebElement sublimitLowerLimitPercentageKeyInLimitDetailsPopUpScreen;
	public WebElement sublimitLowerLimitPercentageKeyInLimitDetailsPopUpScreen() {
		return sublimitLowerLimitPercentageKeyInLimitDetailsPopUpScreen; 
	}
	@FindBy(xpath="//input[@name='requestFinancingCO.requestFinancingLimitCO.fmsAppLimitDetVO.SUBLIMIT_LOWER_LIMIT_AMT']")
	private WebElement sublimitLowerLimitAmountKeyInLimitDetailsPopUpScreen;
	public WebElement sublimitLowerLimitAmountKeyInLimitDetailsPopUpScreen() {
		return sublimitLowerLimitAmountKeyInLimitDetailsPopUpScreen; 
	}
	@FindBy(xpath="//input[@id='requestFinancingLimitDetailsRfUtilized_CSMRF00MT']")
	private WebElement amountsUtilizedInLimitDetailsPopUpScreen;
	public WebElement amountsUtilizedInLimitDetailsPopUpScreen() {
		return amountsUtilizedInLimitDetailsPopUpScreen; 
	}
	
	@FindBy(xpath="//input[@id='requestFinancingLimitDetailsCurrentOutstanding_CSMRF00MT']")
	private WebElement currenOutstandingInLimitDetailsPopUpScreen;
	public WebElement currenOutstandingInLimitDetailsPopUpScreen() {
		return currenOutstandingInLimitDetailsPopUpScreen; 
	}
	
	@FindBy(xpath="//input[@id='requestFinancingLimitDetailsUnUtiliedLimitField_CSMRF00MT']")
	private WebElement unUtilizedInLimitDetailsPopUpScreen;
	public WebElement unUtilizedInLimitDetailsPopUpScreen() {
		return unUtilizedInLimitDetailsPopUpScreen; 
	}
	
	@FindBy(xpath="//input[@id='requestFinancingLimitDetailsRfNewValue_CSMRF00MT']")
	private WebElement amountsInLimitDetailsPopUpScreen;
	public WebElement amountsInLimitDetailsPopUpScreen() {
		return amountsInLimitDetailsPopUpScreen; 
	}
	
	@FindBy(xpath="//input[@id='requestFinancingLimitDetailsNewGlobalLimit_CSMRF00MT']")
	private WebElement newGlobalLimitInLimitDetailsPopUpScreen;
	public WebElement newGlobalLimitInLimitDetailsPopUpScreen() {
		return newGlobalLimitInLimitDetailsPopUpScreen; 
	}
	
	@FindBy(xpath="//input[@id='requestFinancingLimitDetailsRfCfNewAmt_CSMRF00MT']")
	private WebElement totalGlobalLimitInLimitDetailsPopUpScreen;
	public WebElement totalGlobalLimitInLimitDetailsPopUpScreen() {
		return totalGlobalLimitInLimitDetailsPopUpScreen; 
	}
	
	@FindBy(xpath="//input[@id='requestFinancingLimitDetailsRfNewMargin_CSMRF00MT']")
	private WebElement marginNewInLimitDetailsPopUpScreen;
	public WebElement marginNewInLimitDetailsPopUpScreen() {
		return marginNewInLimitDetailsPopUpScreen; 
	}
	
	
	@FindBy(xpath="//input[@id='requestFinancingLimitDetailsMarginRate_CSMRF00MT']")
	private WebElement marginApprovedInLimitDetailsPopUpScreen;
	public WebElement marginApprovedInLimitDetailsPopUpScreen() {
		return marginApprovedInLimitDetailsPopUpScreen; 
	}
	
	@FindBy(xpath="//input[@id='requestFinancingLimitDetailsTotalExisting_CSMRF00MT']")
	private WebElement totalExistingInLimitDetailsPopUpScreen;
	public WebElement totalExistingInLimitDetailsPopUpScreen() {
		return totalExistingInLimitDetailsPopUpScreen; 
	}
	
	
	@FindBy(xpath="//input[@id='requestFinancingLimitDetailsTotalNew_CSMRF00MT']")
	private WebElement totalNewInLimitDetailsPopUpScreen;
	public WebElement totalNewInLimitDetailsPopUpScreen() {
		return totalNewInLimitDetailsPopUpScreen; 
	}
	
	@FindBy(xpath="//input[@id='requestFinancingLimitDetailsDealYield_CSMRF00MT']")
	private WebElement totalApprovedInLimitDetailsPopUpScreen;
	public WebElement totalApprovedInLimitDetailsPopUpScreen() {
		return totalApprovedInLimitDetailsPopUpScreen; 
	}
	
	@FindBy(xpath="//input[@id='requestFinancingLimitDetailscvValue_CSMRF00MT']")
	private WebElement cvValueInLimitDetailsPopUpScreen;
	public WebElement cvValueInLimitDetailsPopUpScreen() {
		return cvValueInLimitDetailsPopUpScreen; 
	}
	
	@FindBy(xpath="//td[@id='td_RequestFinancingLimitDetailsGridId_CSMRF00MT_1_fmsAppLimitDetVO.GENERAL_FACILITY_TYPE']")
	private WebElement openDisbursemnetSublimitProductClassRecord;
	public WebElement openDisbursemnetSublimitProductClassRecord() {
		return openDisbursemnetSublimitProductClassRecord; 
	}
	
	@FindBy(xpath="//input[@id='requestFinancingLimitDetailsTotalFAcilityValue_CSMRF00MT']")
	private WebElement totalFacilityValueInLimitDetailsPopUpScreen;
	public WebElement totalFacilityValueInLimitDetailsPopUpScreen() {
		return totalFacilityValueInLimitDetailsPopUpScreen; 
	}
	
	@FindBy(xpath="//input[@id='requestFinancingLimitDetailsDownPaymentPercentage_CSMRF00MT']")
	private WebElement downPaymentPercentageInLimitDetailsPopUpScreen;
	public WebElement downPaymentPercentageInLimitDetailsPopUpScreen() {
		return downPaymentPercentageInLimitDetailsPopUpScreen; 
	}
	
	@FindBy(xpath="//input[@id='requestFinancingLimitDetailsDownPaymentAmount_CSMRF00MT']")
	private WebElement downPaymentAmountInLimitDetailsPopUpScreen;
	public WebElement downPaymentAmountInLimitDetailsPopUpScreen() {
		return downPaymentAmountInLimitDetailsPopUpScreen; 
	}
	
	@FindBy(xpath="//input[@id='requestFinanceLimitDetailsDownPaymentToVendorPerc_CSMRF00MT']")
	private WebElement downPaymentToVendorPercentageInLimitDetailsPopUpScreen;
	public WebElement downPaymentToVendorPercentageInLimitDetailsPopUpScreen() {
		return downPaymentToVendorPercentageInLimitDetailsPopUpScreen; 
	}
	
	@FindBy(xpath="//input[@id='requestFinanceLimitDetailsDownPaymentToVendorAmt_CSMRF00MT']")
	private WebElement downPaymentToVendorAmountInLimitDetailsPopUpScreen;
	public WebElement downPaymentToVendorAmountInLimitDetailsPopUpScreen() {
		return downPaymentToVendorAmountInLimitDetailsPopUpScreen; 
	}
	
	@FindBy(xpath="//input[@id='requestFinanceLimitDetailsTotalDownPaymentPerc_CSMRF00MT']")
	private WebElement totalDownPaymentPercentageInLimitDetailsPopUpScreen;
	public WebElement totalDownPaymentPercentageInLimitDetailsPopUpScreen() {
		return totalDownPaymentPercentageInLimitDetailsPopUpScreen; 
	}
	
	@FindBy(xpath="//input[@id='requestFinanceLimitDetailsTotalDownPayment_CSMRF00MT']")
	private WebElement totalDownPaymentAmountInLimitDetailsPopUpScreen;
	public WebElement totalDownPaymentAmountInLimitDetailsPopUpScreen() {
		return totalDownPaymentAmountInLimitDetailsPopUpScreen; 
	}
	//******************************Grading evaluation factor********************************//
	
	@FindBy(xpath="//td[text()='Grading Evaluation Factors']//preceding-sibling::td")
	private WebElement gradingEvaluationFactorsSubMenu;
	public WebElement gradingEvaluationFactorsSubMenu() {
		return gradingEvaluationFactorsSubMenu; 
	}
	
	@FindBy(xpath="//a[@id='P003MT']")
	private WebElement maintenamceScreenIngradingEvaluationFactors;
	public WebElement maintenamceScreenIngradingEvaluationFactors() {
		return maintenamceScreenIngradingEvaluationFactors; 
	}
	
	@FindBy(xpath="//input[@id='txt_gradingEvalFactors_weight_P003MT']")
	private WebElement weightFieldIngradingEvaluationFactorsMaintenaceScreen;
	public WebElement weightFieldIngradingEvaluationFactorsMaintenaceScreen() {
		return weightFieldIngradingEvaluationFactorsMaintenaceScreen; 
	}
	
	@FindBy(xpath="//li[@id='applicationFacilityLimitDetailsTabs_WIFT001MT']")
	private WebElement limitDetailsInWIFAKApplication;
	public WebElement limitDetailsInWIFAKApplication() {
		return limitDetailsInWIFAKApplication; 
	}
	
	@FindBy(xpath="//li[@id='applicationFacilityLimitDetailsTabs_WIFT001AP1']")
	private WebElement limitDetailsInWIFAKApplicationApproveLevel1;
	public WebElement limitDetailsInWIFAKApplicationApproveLevel1() {
		return limitDetailsInWIFAKApplicationApproveLevel1; 
	}
	
	@FindBy(xpath="//td[@id='add_ApplicationFacilityLimitDetailsGrid_WIFT001MT']")
	private WebElement addButtonInLimitDetailsWIFAKApplication;
	public WebElement addButtonInLimitDetailsWIFAKApplication() {
		return addButtonInLimitDetailsWIFAKApplication; 
	}
	
	@FindBy(xpath="//input[@id='lookuptxt_applicationfacilityLimitDetailsCLASS_WIFT001MT']")
	private WebElement selectProductClassInLimitDetailsWIFAKApplication;
	public WebElement selectProductClassInLimitDetailsWIFAKApplication() {
		return selectProductClassInLimitDetailsWIFAKApplication; 
	}
	
	@FindBy(xpath="//input[@id='lookuptxt_applicationfacilityLimitDetailsCLASS_TYPE_WIFT001MT']")
	private WebElement typeInLimitDetailsWIFAKApplication;
	public WebElement typeInLimitDetailsWIFAKApplication() {
		return typeInLimitDetailsWIFAKApplication; 
	}
	
	@FindBy(xpath="//input[@id='applicationfacilityLimitDetailsCLEAN_FLAG_WIFT001MT']")
	private WebElement cleanCheckBoxInLimitDetailsWIFAKApplication;
	public WebElement cleanCheckBoxInLimitDetailsWIFAKApplication() {
		return cleanCheckBoxInLimitDetailsWIFAKApplication; 
	}
	
	@FindBy(xpath="//button[@id='applicationfacility_approvelevel1_btn_WIFT001AP1']")
	private WebElement submitButtonInApproveLevel1UnderWifakApplication;
	public WebElement submitButtonInApproveLevel1UnderWifakApplication() {
		return submitButtonInApproveLevel1UnderWifakApplication; 
	}
	
	@FindBy(xpath="//button[@id='applicationfacility_approvelevel2_btn_WIFT001AP2']")
	private WebElement submitButtonInApproveLevel2UnderWifakApplication;
	public WebElement submitButtonInApproveLevel2UnderWifakApplication() {
		return submitButtonInApproveLevel2UnderWifakApplication; 
	}
	
	@FindBy(xpath="//button[@id='applicationfacility_approvelevel3_btn_WIFT001AP3']")
	private WebElement submitButtonInApproveLevel3UnderWifakApplication;
	public WebElement submitButtonInApproveLevel3UnderWifakApplication() {
		return submitButtonInApproveLevel3UnderWifakApplication; 
	}
	
	@FindBy(xpath="//select[@id='applicationFacilityDecision_1_WIFT001AP1']")
	private WebElement selectDecisionInApproveLevel1UnderWifakApplication;
	public WebElement selectDecisionInApproveLevel1UnderWifakApplication() {
		return selectDecisionInApproveLevel1UnderWifakApplication; 
	}
	@FindBy(xpath="//select[@id='applicationFacilityDecision2_WIFT001AP2']")
	private WebElement selectDecisionInApproveLevel2UnderWifakApplication;
	public WebElement selectDecisionInApproveLevel2UnderWifakApplication() {
		return selectDecisionInApproveLevel2UnderWifakApplication; 
	}
	@FindBy(xpath="//select[@id='applicationFacilityDecision3_WIFT001AP3']")
	private WebElement selectDecisionInApproveLevel3UnderWifakApplication;
	public WebElement selectDecisionInApproveLevel3UnderWifakApplication() {
		return selectDecisionInApproveLevel3UnderWifakApplication; 
	}

	@FindBy(xpath="//a[@id='WIFT001AP2']")
	private WebElement ApproveLevel2ScreenUnderWifakApplication;
	public WebElement ApproveLevel2ScreenUnderWifakApplication() {
		return ApproveLevel2ScreenUnderWifakApplication; 
	}
	
	@FindBy(xpath="//a[@id='WIFT001AP3']")
	private WebElement ApproveLevel3ScreenUnderWifakApplication;
	public WebElement ApproveLevel3creenUnderWifakApplication() {
		return ApproveLevel3ScreenUnderWifakApplication; 
	}
	
	@FindBy(xpath="//td[text()='Final Approval']")
	private WebElement FinalApprovalValidationUnderWIFAKApplication;
	public WebElement FinalApprovalValidationUnderWIFAKApplication() {
		return FinalApprovalValidationUnderWIFAKApplication; 
	}
	
	
	@FindBy(xpath="//input[@id='lookuptxt_applicationfacilityLimitDetailsCLASS_WIFT001MT']")
	private WebElement productClassNameValidationInLimitDetailsWIFAKApplication;
	public WebElement productClassNameValidationInLimitDetailsWIFAKApplication() {
		return productClassNameValidationInLimitDetailsWIFAKApplication; 
	}
	
	@FindBy(xpath="//input[@id='applicationFacilitylimityielddetrate_WIFT001MT']")
	private WebElement yieldDetailsInLimitDetailsWIFAKApplication;
	public WebElement yieldDetailsInLimitDetailsWIFAKApplication() {
		return yieldDetailsInLimitDetailsWIFAKApplication; 
	}
	
	@FindBy(xpath="//input[@id='applicationFacilityLimitTotalYield_WIFT001MT']")
	private WebElement totalYieldInLimitDetailsWIFAKApplication;
	public WebElement totalYieldInLimitDetailsWIFAKApplication() {
		return totalYieldInLimitDetailsWIFAKApplication; 
	}
	
	@FindBy(xpath="//input[@id='applicationfacilityLimitDetailsMARGIN_RATE_WIFT001MT']")
	private WebElement marginRateInLimitDetailsWIFAKApplication;
	public WebElement marginRateInLimitDetailsWIFAKApplication() {
		return marginRateInLimitDetailsWIFAKApplication; 
	}
	
	//********************************************floating rate***********************************************//
	
	@FindBy(xpath="//input[@id='lookuptxt_applicationfacilityLimitDetailsFLOATING_RATE_WIFT001MT']")
	private WebElement floatingRateInLimitDetailsWIFAKApplication;
	public WebElement floatingRateInLimitDetailsWIFAKApplication() {
		return floatingRateInLimitDetailsWIFAKApplication; 
	}
	
	@FindBy(xpath="//input[@id='applicationfacilityLimitDetailsfloatRateDesc_WIFT001MT']")
	private WebElement floatingRateNameValidationInLimitDetailsWIFAKApplication;
	public WebElement floatingRateNameValidationInLimitDetailsWIFAKApplication() {
		return floatingRateNameValidationInLimitDetailsWIFAKApplication; 
	}
	
	@FindBy(xpath="//input[@id='applicationFacilitylimityielddetbankprofitshare_WIFT001MT']")
	private WebElement bankProfitShareInLimitDetailsWIFAKApplication;
	public WebElement bankProfitShareInLimitDetailsWIFAKApplication() {
		return bankProfitShareInLimitDetailsWIFAKApplication; 
	}
	
	@FindBy(xpath="//input[@id='lookuptxt_applicationFacilityRating_WIFT001MT']")
	private WebElement facilityRatingInMainInformationWIFAKApplication;
	public WebElement facilityRatingInMainInformationWIFAKApplication() {
		return facilityRatingInMainInformationWIFAKApplication; 
	}
	
	@FindBy(xpath="//input[@id='applicationfacilityLimitDetailsFLOAT_RATE_PERIODICITY_NBR_WIFT001MT']")
	private WebElement floatingRatePeriodicityInLimitDetailsWIFAKApplication;
	public WebElement floatingRatePeriodicityInLimitDetailsWIFAKApplication() {
		return floatingRatePeriodicityInLimitDetailsWIFAKApplication; 
	}
	
	@FindBy(xpath="//select[@id='applicationfacilityLimitDetailsFLOAT_RATE_PERIODICITY_TYPE_WIFT001MT']")
	private WebElement floatingRatePeriodicityTypeInLimitDetailsWIFAKApplication;
	public WebElement floatingRatePeriodicityTypeInLimitDetailsWIFAKApplication() {
		return floatingRatePeriodicityTypeInLimitDetailsWIFAKApplication; 
	}
	
	@FindBy(xpath="//span[text()='Send Alert']/following-sibling::a//span")
	private WebElement closeIconInSendAlertPopup;
	public WebElement closeIconInSendAlertPopup() {
		return closeIconInSendAlertPopup; 
	}
	
	
	@FindBy(id="WIFT001AP1")
	private WebElement approveLevel1InApplicationForFinancialFacilitiesUnderWIFAKApplication;
	public WebElement approveLevel1InApplicationForFinancialFacilitiesUnderWIFAKApplication() {
		return approveLevel1InApplicationForFinancialFacilitiesUnderWIFAKApplication; 
	}
	
	@FindBy(xpath="//input[@id='applicationFacilityGridTbl_Id_WIFT001AP1_gs_fmsApplVO.CODE']")
	private WebElement searchCodeInApproveLevel1ApplicationForFinacialFacilitiesUnderWIFAKApplication;
	public WebElement searchCodeInApproveLevel1ApplicationForFinacialFacilitiesUnderWIFAKApplication() {
		return searchCodeInApproveLevel1ApplicationForFinacialFacilitiesUnderWIFAKApplication; 
	}
	
	@FindBy(xpath="//td[@id='td_applicationFacilityGridTbl_Id_WIFT001AP1_1_fmsApplVO.CODE']")
	private WebElement selectsearchedCodeInApproveLevel1ApplicationForFinacialFacilitiesUnderWIFAKApplication;
	public WebElement selectsearchedCodeInApproveLevel1ApplicationForFinacialFacilitiesUnderWIFAKApplication() {
		return selectsearchedCodeInApproveLevel1ApplicationForFinacialFacilitiesUnderWIFAKApplication; 
	}
	
	@FindBy(xpath="//input[@id='applicationFacilityGridTbl_Id_WIFT001MT_gs_fmsApplVO.CODE']")
	private WebElement searchCodeInMaintenanceScreenApplicationForFinacialFacilitiesUnderWIFAKApplication;
	public WebElement searchCodeInMaintenanceScreenApplicationForFinacialFacilitiesUnderWIFAKApplication() {
		return searchCodeInMaintenanceScreenApplicationForFinacialFacilitiesUnderWIFAKApplication; 
	}
	
	@FindBy(xpath="//td[@id='td_applicationFacilityGridTbl_Id_WIFT001MT_1_fmsApplVO.CODE']")
	private WebElement selectsearchedCodeInMaintenanceScreenApplicationForFinacialFacilitiesUnderWIFAKApplication;
	public WebElement selectsearchedCodeInMaintenanceScreenApplicationForFinacialFacilitiesUnderWIFAKApplication() {
		return selectsearchedCodeInMaintenanceScreenApplicationForFinacialFacilitiesUnderWIFAKApplication; 
	}
	
	
	@FindBy(xpath="//input[@id='applicationFacilityGridTbl_Id_WIFT001AP2_gs_fmsApplVO.CODE']")
	private WebElement searchCodeInApproveLevel2ApplicationForFinacialFacilitiesUnderWIFAKApplication;
	public WebElement searchCodeInApproveLevel2ApplicationForFinacialFacilitiesUnderWIFAKApplication() {
		return searchCodeInApproveLevel2ApplicationForFinacialFacilitiesUnderWIFAKApplication; 
	}
	
	@FindBy(xpath="//td[@id='td_applicationFacilityGridTbl_Id_WIFT001AP3_1_fmsApplVO.CODE']")
	private WebElement selectsearchedCodeInApproveLevel3ApplicationForFinacialFacilitiesUnderWIFAKApplication;
	public WebElement selectsearchedCodeInApproveLevel3ApplicationForFinacialFacilitiesUnderWIFAKApplication() {
		return selectsearchedCodeInApproveLevel3ApplicationForFinacialFacilitiesUnderWIFAKApplication; 
	}
	
	@FindBy(xpath="//a[text()='WIFAK APPLICATION / WIFAK APPLICATION / Application For Financial Facilities / Maintenance']/parent::td/following-sibling::td")
	private WebElement closeIconMaintenanceScreenWifakApplication;
	public WebElement closeIconMaintenanceScreenWifakApplication() {
		return closeIconMaintenanceScreenWifakApplication; 
	}
	
	@FindBy(xpath="//a[@id='WIFT005MT']//span[contains(text(),'Issue Facility Offer ')]")
	private WebElement IssueFacilityOfferWifakApplication_482;
	public WebElement IssueFacilityOfferWifakApplication_482() {
		return IssueFacilityOfferWifakApplication_482; 
	}
	
	@FindBy(xpath="//input[@id='applicationFacilityGridTbl_Id_WIFT005MT_gs_fmsApplVO.CODE']")
	private WebElement searchCodeInIssueFacilityOfferForFinacialFacilitiesUnderWIFAKApplication;
	public WebElement searchCodeInIssueFacilityOfferForFinacialFacilitiesUnderWIFAKApplication() {
		return searchCodeInIssueFacilityOfferForFinacialFacilitiesUnderWIFAKApplication; 
	}
	
	@FindBy(xpath="//td[@id='td_applicationFacilityGridTbl_Id_WIFT005MT_1_fmsApplVO.CODE']")
	private WebElement selectsearchedCodeInIssueFacilityOfferForFinacialFacilitiesUnderWIFAKApplication;
	public WebElement selectsearchedCodeInIssueFacilityOfferForFinacialFacilitiesUnderWIFAKApplication() {
		return selectsearchedCodeInIssueFacilityOfferForFinacialFacilitiesUnderWIFAKApplication; 
	}
	
	@FindBy(xpath="//button[@id='applicationfacility_issueoffer_btn_WIFT005MT']")
	private WebElement issueFacilityOfferButtonForFinacialFacilitiesUnderWIFAKApplication;
	public WebElement issueFacilityOfferButtonForFinacialFacilitiesUnderWIFAKApplication() {
		return issueFacilityOfferButtonForFinacialFacilitiesUnderWIFAKApplication; 
	}
	
	@FindBy(xpath="//input[@id='applicationFacilityGridTbl_Id_WIFT001AP3_gs_fmsApplVO.CODE']")
	private WebElement searchCodeInApproveLevel3ApplicationForFinacialFacilitiesUnderWIFAKApplication;
	public WebElement searchCodeInApproveLevel3ApplicationForFinacialFacilitiesUnderWIFAKApplication() {
		return searchCodeInApproveLevel3ApplicationForFinacialFacilitiesUnderWIFAKApplication; 
	}
	
	@FindBy(xpath="//td[@id='td_applicationFacilityGridTbl_Id_WIFT001AP2_1_fmsApplVO.CODE']")
	private WebElement selectsearchedCodeInApproveLevel2ApplicationForFinacialFacilitiesUnderWIFAKApplication;
	public WebElement selectsearchedCodeInApproveLevel2ApplicationForFinacialFacilitiesUnderWIFAKApplication() {
		return selectsearchedCodeInApproveLevel2ApplicationForFinacialFacilitiesUnderWIFAKApplication; 
	}
	
	@FindBy(xpath="//td[@id='td_ApplicationFacilityLimitDetailsGrid_WIFT001AP1_1_fmsAppLimitDetVO.GENERAL_FACILITY_TYPE']")
	private WebElement openProductClassRecordInLimitClassApproveLevel1;
	public WebElement openProductClassRecordInLimitClassApproveLevel1() {
		return openProductClassRecordInLimitClassApproveLevel1; 
	}
	
	@FindBy(xpath="//input[@id='lookuptxt_applicationfacilityLimitDetailsFLOATING_RATE_WIFT001AP1']")
	private WebElement floatingRateInLimitDealsPopUpApproveLevel1UnderWIFAKApplication;
	public WebElement floatingRateInLimitDealsPopUpApproveLevel1UnderWIFAKApplication() {
		return floatingRateInLimitDealsPopUpApproveLevel1UnderWIFAKApplication; 
	}
	
	@FindBy(xpath="//input[@id='applicationfacilityLimitDetailsfloatRateDesc_WIFT001AP1']")
	private WebElement floatingRateNameInLimitDealsPopUpApproveLevel1UnderWIFAKApplication;
	public WebElement floatingRateNameInLimitDealsPopUpApproveLevel1UnderWIFAKApplication() {
		return floatingRateNameInLimitDealsPopUpApproveLevel1UnderWIFAKApplication; 
	}
	
	@FindBy(xpath="//input[@id='applicationfacilityLimitDetailsFLOAT_RATE_PERIODICITY_NBR_WIFT001AP1']")
	private WebElement floatingRatePeriodicityInLimitDealsPopUpApproveLevel1UnderWIFAKApplication;
	public WebElement floatingRatePeriodicityInLimitDealsPopUpApproveLevel1UnderWIFAKApplication() {
		return floatingRatePeriodicityInLimitDealsPopUpApproveLevel1UnderWIFAKApplication; 
	}
	
	@FindBy(xpath="//select[@id='applicationfacilityLimitDetailsFLOAT_RATE_PERIODICITY_TYPE_WIFT001AP1']")
	private WebElement floatingRatePeriodicityTypeInLimitDealsPopUpApproveLevel1UnderWIFAKApplication;
	public WebElement floatingRatePeriodicityTypeInLimitDealsPopUpApproveLevel1UnderWIFAKApplication() {
		return floatingRatePeriodicityTypeInLimitDealsPopUpApproveLevel1UnderWIFAKApplication; 
	}
	
	@FindBy(xpath="//input[@id='applicationFacilityofferexpirydate_WIFT001MT']")
	private WebElement offerExpiratioInAdditionalDetails;
	public WebElement offerExpiratioInAdditionalDetails() {
		return offerExpiratioInAdditionalDetails; 
	}
	
	@FindBy(xpath="//input[@id='lookuptxt_applicationFacilitysolicitor_WIFT001MT']")
	private WebElement solicitorNameInDocumentDetails;
	public WebElement solicitorNameInDocumentDetails() {
		return solicitorNameInDocumentDetails; 
	}
	
	@FindBy(xpath="//input[@id='lookuptxt_applicationFacilityEstimator_WIFT001MT']")
	private WebElement estimatorNameInDocumentDetails;
	public WebElement estimatorNameInDocumentDetails() {
		return estimatorNameInDocumentDetails; 
	}
	
	@FindBy(xpath="//input[@id='applicationFacilityAddField_WIFT001MT']")
	private WebElement paymentRandomClickInDocumentDetails;
	public WebElement paymentRandomClickInDocumentDetails() {
		return paymentRandomClickInDocumentDetails; 
	}
	
	@FindBy(xpath="//input[@id='lookuptxt_applicationFacilityMarketedBy_WIFT001MT']")
	private WebElement marketedByRandomClickInMainInformationTab;
	public WebElement marketedByRandomClickInMainInformationTab() {
		return marketedByRandomClickInMainInformationTab; 
	}
	
	@FindBy(xpath="//td[@id='add_ApplicationFacilityLimitDetailsGrid_WIFT001MT']")
	private WebElement addIconInLimitDetailsUnderWIFAKApplication;
	public WebElement addIconInLimitDetailsUnderWIFAKApplication() {
		return addIconInLimitDetailsUnderWIFAKApplication; 
	}
	
	@FindBy(xpath="//li[@id='applicationFacilityDocumentDetailsTabs_WIFT001MT']")
	private WebElement documentDetailsUnderWIFAKApplication;
	public WebElement documentDetailsUnderWIFAKApplication() {
		return documentDetailsUnderWIFAKApplication; 
	}
	
	@FindBy(xpath="//li[@id='applicationFacilityMainInfoTabs_WIFT001MT']")
	private WebElement mainInformationTabUnderWIFAKApplication;
	public WebElement mainInformationTabUnderWIFAKApplication() {
		return mainInformationTabUnderWIFAKApplication; 
	}
	
	@FindBy(xpath="//button[@id='applicationfacility_save_as_draft_btn_WIFT001MT']")
	private WebElement saveButtonInWIFAKApplication;
	public WebElement saveButtonInWIFAKApplication() {
		return saveButtonInWIFAKApplication; 
	}
	
	@FindBy(xpath="//button[@id='applicationfacility_save_btn_WIFT001MT']")
	private WebElement validateButtonInApplicationForFinancialFacilitiesUnderWIFAKApplication;
	public WebElement validateButtonInApplicationForFinancialFacilitiesUnderWIFAKApplication() {
		return validateButtonInApplicationForFinancialFacilitiesUnderWIFAKApplication; 
	}
	//prevvalue
	@FindBy(xpath="//input[@id='lookuptxt_applicationfacilityLimitDetailsFLOATING_RATE_WIFT001AP1']")
	private WebElement validateFloatingrateInWIFAKApplicationApproveLevel1;
	public WebElement validateFloatingrateInWIFAKApplicationApproveLevel1() {
		return validateFloatingrateInWIFAKApplicationApproveLevel1; 
	}
	
	//prevvalue
	@FindBy(xpath="//input[@id='applicationfacilityLimitDetailsFLOAT_RATE_PERIODICITY_NBR_WIFT001AP1']")
	private WebElement validateFloatingratePeriodicityInWIFAKApplicationApproveLevel1;
	public WebElement validateFloatingratePeriodicityInWIFAKApplicationApproveLevel1() {
		return validateFloatingratePeriodicityInWIFAKApplicationApproveLevel1; 
	}
	
	//prevvalue
	@FindBy(xpath="//select[@id='applicationfacilityLimitDetailsFLOAT_RATE_PERIODICITY_TYPE_WIFT001AP1']")
	private WebElement validateFloatingratePeriodicityTypeInWIFAKApplicationApproveLevel1;
	public WebElement validateFloatingratePeriodicityTypeInWIFAKApplicationApproveLevel1() {
		return validateFloatingratePeriodicityTypeInWIFAKApplicationApproveLevel1; 
	}
	
	@FindBy(xpath="//td[text()='Facilities Management']/preceding-sibling::td/span")
	private WebElement facilitiesManagementInWIFAKApplication;
	public WebElement facilitiesManagementInWIFAKApplication() {
		return facilitiesManagementInWIFAKApplication; 
	}
	
	@FindBy(xpath="//span[text()='Approve/Reject']/preceding-sibling::span")
	private WebElement approveRejectScreenInFacilitiesManagement;
	public WebElement approveRejectScreenInFacilitiesManagement() {
		return approveRejectScreenInFacilitiesManagement; 
	}
	
	@FindBy(xpath="//input[@id='facilityManagementGridTbl_Id_WIFT008AP_gs_statusDesc']")
	private WebElement searchStatusInApproveRejectScreenInFacilitiesManagementUnderWIFAKApplication;
	public WebElement searchStatusInApproveRejectScreenInFacilitiesManagementUnderWIFAKApplication() {
		return searchStatusInApproveRejectScreenInFacilitiesManagementUnderWIFAKApplication; 
	}
	
	@FindBy(xpath="//td[@id='td_facilityManagementGridTbl_Id_WIFT008AP_1_fmsFacilityVO.CODE']")
	private WebElement selectSearchedStatusInApproveRejectScreenInFacilitiesManagementUnderWIFAKApplication;
	public WebElement selectSearchedStatusInApproveRejectScreenInFacilitiesManagementUnderWIFAKApplication() {
		return selectSearchedStatusInApproveRejectScreenInFacilitiesManagementUnderWIFAKApplication; 
	}
	
	@FindBy(xpath="//button[@id='facilityManagement_approve_btn_WIFT008AP']")
	private WebElement approveButtonInApproveRejectScreenInFacilitiesManagementUnderWIFAKApplication;
	public WebElement approveButtonInApproveRejectScreenInFacilitiesManagementUnderWIFAKApplication() {
		return approveButtonInApproveRejectScreenInFacilitiesManagementUnderWIFAKApplication; 
	}
	// alert pop up send alert
	@FindBy(xpath="//input[@id='alertsGrid_Id_WIFT001MT_gs_alertsParamCO.userId']")
	private WebElement searchUserIdInSendAlert;
	public WebElement searchUserIdInSendAlert() {
		return searchUserIdInSendAlert; 
	}
	
	@FindBy(xpath="//input[@id='alertsGrid_Id_WIFT008MT_gs_alertsParamCO.userId']")
	private WebElement searchUserIdInSendAlert_FacilitiesManagement;
	public WebElement searchUserIdInSendAlert_FacilitiesManagement() {
		return searchUserIdInSendAlert_FacilitiesManagement; 
	}
	
	@FindBy(xpath="//td[@id='td_alertsGrid_Id_WIFT008MT_1_alertsParamCO.userId']")
	private WebElement selectSearchedUserIdInSendAlert_FacilitiesManagement;
	public WebElement selectSearchedUserIdInSendAlert_FacilitiesManagement() {
		return selectSearchedUserIdInSendAlert_FacilitiesManagement; 
	}
	@FindBy(xpath="//td[@id='td_alertsGrid_Id_WIFT008MT_1_alertsParamCO.userId']")
	private WebElement selectSearchedUserIdInSendAlert;
	public WebElement selectSearchedUserIdInSendAlert() {
		return selectSearchedUserIdInSendAlert; 
	}
	
	@FindBy(xpath="//a[@id='sendBut_WIFT008MT']")
	private WebElement sendButtonInSendAlert_FacilitiesManagement;
	public WebElement sendButtonInSendAlert_FacilitiesManagement() {
		return sendButtonInSendAlert_FacilitiesManagement; 
	}
	@FindBy(xpath="//a[@id='sendBut_WIFT001MT']")
	private WebElement sendButtonInSendAlert;
	public WebElement sendButtonInSendAlert() {
		return sendButtonInSendAlert; 
	}
	// fms parameters
	
	@FindBy(xpath="//td[text()='Parameters']/preceding-sibling::td//span/span")
	private WebElement parametersMenuInFSMParam_482;
	public WebElement parametersMenuInFSMParam_482() {
		return parametersMenuInFSMParam_482; 
	}
	
	@FindBy(xpath="//a[@id='P007P']")
	private WebElement approveScreen_ControlRecordInFSMParam_482;
	public WebElement approveScreen_ControlRecordInFSMParam_482() {
		return approveScreen_ControlRecordInFSMParam_482; 
	}
	@FindBy(xpath="//a[@id='P007UP']")
	private WebElement updateAfterapproveScreen_ControlRecordInFSMParam_482;
	public WebElement updateAfterapproveScreen_ControlRecordInFSMParam_482() {
		return updateAfterapproveScreen_ControlRecordInFSMParam_482; 
	}
	
	@FindBy(xpath="//td[text()='Control Record']/preceding-sibling::td//span/span")
	private WebElement ControlRecordScrenInFSMParam_482;
	public WebElement ControlRecordScreenInFSMParam_482() {
		return ControlRecordScrenInFSMParam_482; 
	}
	// initialvalue checked
	@FindBy(xpath="//input[@id='FmsCtrlRecord_alertStatus_P007UP']")
	private WebElement enableAlertsCheckBox_482;
	public WebElement enableAlertsCheckBox_482() {
		return enableAlertsCheckBox_482; 
	}
	// initialvalue checked
	@FindBy(xpath="//input[@id='FmsCtrlRecord_autoAlertAfterUpdate_P007UP']")
	private WebElement AutoAlertsCheckBox_482;
	public WebElement AutoAlertsCheckBox_482() {
		return AutoAlertsCheckBox_482; 
	}
	
	@FindBy(xpath="//button[@id='fmsControlRecordMaint_update_P007UP']")
	private WebElement updateButton_UpdateAfterApproveInControlRecord_482;
	public WebElement updateButton_UpdateAfterApproveInControlRecord_482() {
		return updateButton_UpdateAfterApproveInControlRecord_482; 
	}
	
	@FindBy(xpath="//button[@id='fmsControlRecordMaint_approve_P007P']")
	private WebElement approveButtonInApproveScreenControlRecord_482;
	public WebElement approveButtonInApproveScreenControlRecord_482() {
		return approveButtonInApproveScreenControlRecord_482; 
	}
	// clear caches
	
	@FindBy(xpath="//a[@id='tech_details_icon_id']")
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
    
    @FindBy(xpath ="//td[text()='Facilities Management']/preceding-sibling::td/span/span")
	private WebElement facilitiesManagementUnderWIFAK_482;
	public WebElement facilitiesManagementUnderWIFAK_482() {
		return facilitiesManagementUnderWIFAK_482;
	}
	
	@FindBy(xpath ="//a[@id='WIFT008MT']")
	private WebElement maintenance_facilitiesManagementUnderWIFAK_482;
	public WebElement maintenance_facilitiesManagementUnderWIFAK_482() {
		return maintenance_facilitiesManagementUnderWIFAK_482;
	}
	
	@FindBy(xpath ="//input[@id='facilityManagementGridTbl_Id_WIFT008MT_gs_fmsFacilityVO.FROM_APPLICATION']")
	private WebElement searchApplicationRefNum_facilitiesManagementUnderWIFAK_482;
	public WebElement searchApplicationRefNum_facilitiesManagementUnderWIFAK_482() {
		return searchApplicationRefNum_facilitiesManagementUnderWIFAK_482;
	}
	
	@FindBy(xpath ="//td[@id='td_facilityManagementGridTbl_Id_WIFT008MT_1_fmsFacilityVO.CODE']")
	private WebElement selectsearchedApplicationRefNum_facilitiesManagementUnderWIFAK_482;
	public WebElement selectsearchedApplicationRefNum_facilitiesManagementUnderWIFAK_482() {
		return selectsearchedApplicationRefNum_facilitiesManagementUnderWIFAK_482;
	}
	
	@FindBy(xpath ="//a[@id='infoBarSearchButton_WIFT008MT']")
	private WebElement searchIcon_facilitiesManagementUnderWIFAK_482;
	public WebElement searchIcon_facilitiesManagementUnderWIFAK_482() {
		return searchIcon_facilitiesManagementUnderWIFAK_482;
	}
	@FindBy(xpath ="//li[@id='facilityAdditionalDetailsTab_WIFT008MT']")
	private WebElement additionalDetails_Maintenance_facilitiesManagementUnderWIFAK_482;
	public WebElement additionalDetails_Maintenance_facilitiesManagementUnderWIFAK_482() {
		return additionalDetails_Maintenance_facilitiesManagementUnderWIFAK_482;
	}
	
	@FindBy(xpath ="//input[@id='facilityMgtAddDetDateEffectiveUntill_WIFT008MT']")
	private WebElement effectiveDateUntil_482;
	public WebElement effectiveDateUntil_482() {
		return effectiveDateUntil_482;
	}
	
	@FindBy(xpath ="//td[@id='td_FacilityManagementDocumentDetailsGrid_WIFT008MT_1_fmsFacDocumentsVO.SOL_DATE_SENT']")
	private WebElement randomClickDocumentDate_482;
	public WebElement randomClickDocumentDate_482() {
		return randomClickDocumentDate_482;
	}
	
	@FindBy(xpath ="//td[@id='td_FacilityManagementDocumentDetailsGrid_WIFT008MT_2_fmsFacDocumentsVO.SOL_DATE_SENT']")
	private WebElement randomClickDocumentDate2_482;
	public WebElement randomClickDocumentDate2_482() {
		return randomClickDocumentDate2_482;
	}
	
	@FindBy(xpath ="//input[@id='1_fmsFacDocumentsVO.SOL_DATE_SENT_FacilityManagementDocumentDetailsGrid_WIFT008MT']")
	private WebElement solicitorDateSent_482;
	public WebElement solicitorDateSent_482() {
		return solicitorDateSent_482;
	}
	
	@FindBy(xpath ="//input[@id='1_fmsFacDocumentsVO.SOL_DATE_REC_FacilityManagementDocumentDetailsGrid_WIFT008MT']")
	private WebElement solicitorDateReceived_482;
	public WebElement solicitorDateReceived_482() {
		return solicitorDateReceived_482;
	}
	
	@FindBy(xpath ="//input[@id='1_fmsFacDocumentsVO.EST_DATE_SENT_FacilityManagementDocumentDetailsGrid_WIFT008MT']")
	private WebElement estimatorDateSent_482;
	public WebElement estimatorDateSent_482() {
		return estimatorDateSent_482;
	}
	
	@FindBy(xpath ="//input[@id='1_fmsFacDocumentsVO.EST_DATE_REC_FacilityManagementDocumentDetailsGrid_WIFT008MT']")
	private WebElement estimatorDateReceived_482;
	public WebElement estimatorDateReceived_482() {
		return estimatorDateReceived_482;
	}
	
	@FindBy(xpath ="//input[@id='1_fmsFacDocumentsVO.CUSTODIAN_SENT_FacilityManagementDocumentDetailsGrid_WIFT008MT']")
	private WebElement custodianDateSent_482;
	public WebElement custodianDateSent_482() {
		return custodianDateSent_482;
	}
	
	@FindBy(xpath ="//input[@id='2_fmsFacDocumentsVO.SOL_DATE_SENT_FacilityManagementDocumentDetailsGrid_WIFT008MT']")
	private WebElement solicitorDateSent_Document2_482;
	public WebElement solicitorDateSent_Document2_482() {
		return solicitorDateSent_Document2_482;
	}
	
	@FindBy(xpath ="//input[@id='2_fmsFacDocumentsVO.SOL_DATE_REC_FacilityManagementDocumentDetailsGrid_WIFT008MT']")
	private WebElement solicitorDateReceived_Document2_482;
	public WebElement solicitorDateReceived_Document2_482() {
		return solicitorDateReceived_Document2_482;
	}
	
	@FindBy(xpath ="//input[@id='2_fmsFacDocumentsVO.EST_DATE_SENT_FacilityManagementDocumentDetailsGrid_WIFT008MT']")
	private WebElement estimatorDateSent_Document2_482;
	public WebElement estimatorDateSent_Document2_482() {
		return estimatorDateSent_Document2_482;
	}
	
	@FindBy(xpath ="//input[@id='2_fmsFacDocumentsVO.EST_DATE_REC_FacilityManagementDocumentDetailsGrid_WIFT008MT']")
	private WebElement estimatorDateReceivedDocument2_482;
	public WebElement estimatorDateReceivedDocument2_482() {
		return estimatorDateReceivedDocument2_482;
	}
	
	@FindBy(xpath ="//input[@id='2_fmsFacDocumentsVO.CUSTODIAN_SENT_FacilityManagementDocumentDetailsGrid_WIFT008MT']")
	private WebElement custodianDateSent_Document2_482;
	public WebElement custodianDateSent_Document2_482() {
		return custodianDateSent_Document2_482;
	}
	
	@FindBy(id="facilitymanagement_save_btn_WIFT008MT")
	private WebElement saveButtonFacilitiesManagement_482;
	public WebElement saveButtonFacilitiesManagement_482() {
		return saveButtonFacilitiesManagement_482;
	}
	
	@FindBy(id="DocumentDetailsTab_WIFT008MT")
	private WebElement documentDetailsFacilitiesManagement_482;
	public WebElement documentDetailsFacilitiesManagement_482() {
		return documentDetailsFacilitiesManagement_482;
	}
	
	@FindBy(xpath="//td[@id='td_facilityManagementGridTbl_Id_WIFT008MT_1_fmsFacilityVO.CODE']")
	private WebElement storeFacilityCode_FacilitiesManagement_482;
	public WebElement storeFacilityCode_FacilitiesManagement_482() {
		return storeFacilityCode_FacilitiesManagement_482;
	}
	
	
	@FindBy(xpath="//td[@id='td_ApplicationFacilityLimitDetailsGrid_WIFT001MT_1_fmsAppLimitDetVO.GENERAL_FACILITY_TYPE']")
	private WebElement productClassSelect_WIFAK_482;
	public WebElement productClassSelect_WIFAK_482() {
		return productClassSelect_WIFAK_482;
	}
	
	@FindBy(xpath="//button[@id='applicationfacility_repayplan_btn_WIFT001MT']")
	private WebElement repaymentPlan_WIFAK_482;
	public WebElement repaymentPlan_WIFAK_482() {
		return repaymentPlan_WIFAK_482;
	}
	
	@FindBy(xpath="//input[@id='No_Of_Payments_WIFT001MT']")
	private WebElement no_Of_Payments_RepaymentPlan_WIFAK_482;
	public WebElement no_Of_Payments_RepaymentPlan_WIFAK_482() {
		return no_Of_Payments_RepaymentPlan_WIFAK_482;
	}
	
	@FindBy(xpath="//*[@id='profit_dist_method_WIFT001MT']")
	private WebElement profitRecognitionMethod_WIFAK_482;
	public WebElement profitRecognitionMethod_WIFAK_482() {
		return profitRecognitionMethod_WIFAK_482;
	}
	
	@FindBy(xpath="//*[@id='createSchedule_WIFT001MT']")
	private WebElement createScheduleButton_WIFAK_482;
	public WebElement createScheduleButton_WIFAK_482() {
		return createScheduleButton_WIFAK_482;
	}
	
	@FindBy(xpath="//input[@id='total_amt_WIFT001MT']")
	private WebElement totalAmountRepayment_WIFAK_482;
	public WebElement totalAmountRepayment_WIFAK_482() {
		return totalAmountRepayment_WIFAK_482;
	}
	
	@FindBy(xpath="//*[@id=\"spanLookup_applicationfacilityLimitDetailsACC_Add_Det_WIFT001MT\"]/span")
	private WebElement AccountNo;
	public WebElement AccountNo() {
		return AccountNo;
	}
	
	@FindBy(xpath="//*[@id=\"td_gridtab_applicationfacilityLimitDetailsACC_Add_Det_WIFT001MT_1_amfVO.BRANCH_CODE\"]")
	private WebElement AccountNotab;
	public WebElement AccountNotab() {
		return AccountNotab;
	}
	
	@FindBy(xpath="//*[@id=\"applicationfacility_chargesdtls_btn_WIFT001MT\"]")
	private WebElement ChargeDetails;
	public WebElement ChargeDetails() {
		return ChargeDetails;
	}
	
}

