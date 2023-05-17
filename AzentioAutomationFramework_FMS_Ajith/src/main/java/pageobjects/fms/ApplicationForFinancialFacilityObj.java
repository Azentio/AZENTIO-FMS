package pageobjects.fms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ApplicationForFinancialFacilityObj {
	WebDriver driver;

	public ApplicationForFinancialFacilityObj(WebDriver driver) {
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

	@FindBy(xpath = "//input[@name='requestFinancingCO.TOTAL_AMOUNT']")
	private WebElement totalLimitInRequestForFinancingScreen;

	public WebElement totalLimitInRequestForFinancingScreen() {
		return totalLimitInRequestForFinancingScreen;
	}

	@FindBy(xpath = "//span[text()='Disbursement/Sublimit']")
	private WebElement disbursementOrSublimitInRequestForFinancingScreen;

	public WebElement disbursementOrSublimitInRequestForFinancingScreen() {
		return disbursementOrSublimitInRequestForFinancingScreen;
	}

	@FindBy(id = "add_RequestFinancingLimitDetailsGridId_CSMRF00MT")
	private WebElement addIconInDisbursementOrSublimitScreen;

	public WebElement addIconInDisbursementOrSublimitScreen() {
		return addIconInDisbursementOrSublimitScreen;
	}

	@FindBy(xpath = "//input[@name='requestFinancingCO.requestFinancingLimitCO.fmsAppLimitDetVO.CLASS']")
	private WebElement productClassInLimitDetailsPopUp;

	public WebElement productClassInLimitDetailsPopUp() {
		return productClassInLimitDetailsPopUp;
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

	@FindBy(xpath = "//button[@id='requestForFinance_save_as_draft_btn_CSMRF00MT']")
	private WebElement savebuttonInRequestForFinancingScreenMaintenance;

	public WebElement savebuttonInRequestForFinancingScreenMaintenance() {
		return savebuttonInRequestForFinancingScreenMaintenance;
	}

	@FindBy(id = "_popup_path_sol_confirm_ok")
	private WebElement okButtonInConfirmationPopUp;

	public WebElement okButtonInConfirmationPopUp() {
		return okButtonInConfirmationPopUp;
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

	@FindBy(xpath = "//label[text()='Product Class ']")
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
	
	@FindBy(xpath = "//span[text()='Additional Details']")
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

}
