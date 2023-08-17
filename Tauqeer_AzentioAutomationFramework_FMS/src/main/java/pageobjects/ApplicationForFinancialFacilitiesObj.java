package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ApplicationForFinancialFacilitiesObj {
	WebDriver driver;
	public ApplicationForFinancialFacilitiesObj(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "(//td[text()='WIFAK APPLICATION'])[1]")
	private WebElement wifak_application_first;
	public WebElement wifakApplicationFirst() {
		return wifak_application_first;
	}
	
	@FindBy(xpath = "(//td[text()='WIFAK APPLICATION'])[2]")
	private WebElement wifak_application_second;
	public WebElement wifakApplicationSecond() {
		return wifak_application_second;
	}
	
	@FindBy(xpath = "//td[text()='Application For Financial Facilities']")
	private WebElement wifak_application_child_application_financial_facility;
	public WebElement applicationFinancialFacility() {
		return wifak_application_child_application_financial_facility;
	}
	@FindBy(xpath = "(//span[text()='Update After Approve'])[2]")
	private WebElement application_financial_facility_updateAfterApproval;
	public WebElement application_financial_facility_updateAfterApproval() {
		return application_financial_facility_updateAfterApproval;
	}
	@FindBy(xpath = "//a[@id='WIFT001AP1']")
	private WebElement application_financial_facility_updateAfterApproval_Maintenance;
	public WebElement application_financial_facility_updateAfterApproval_Maintenance() {
		return application_financial_facility_updateAfterApproval_Maintenance;
	}
	@FindBy(xpath = "//a[@id='WIFT001AP1']")
	private WebElement application_financial_facility_approve1;
	public WebElement applicationFinancialFacilityApproveLevel1() {
		return application_financial_facility_approve1;
	}
	
	@FindBy(xpath = "//input[@name='fmsApplVO.CODE']")
	private WebElement application_financial_facility_search_code;
	public WebElement applicationFinancialFacilitySearchCode() {
		return application_financial_facility_search_code;
	}
	
	@FindBy(xpath = "//td[@tdlabel='Code']")
	private WebElement application_financial_facility_search_result;
	public WebElement applicationFinancialFacilitySearchResult() {
		return application_financial_facility_search_result;
	}
	
	@FindBy(xpath = "//a[@title='History Log']")
	private WebElement application_financial_facility_historylog;
	public WebElement applicationFinancialFacilityHistoryLog() {
		return application_financial_facility_historylog;
	}
	
	// 843959	
	@FindBy(xpath = "//a[@id='WIFT001MT']")
	private WebElement app_financial_facility_main;
	public WebElement appFinancialFacilityMaintanance() {
		return app_financial_facility_main;
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
	
	@FindBy(xpath = "//input[@id='applicationFacilitydownpaymentperc_WIFT001MT']")
	private WebElement main_additional_tab_DownPayment;
	public WebElement mainAdditionalTabDownPayment() {
		return main_additional_tab_DownPayment;
	}
	
	@FindBy(xpath = "//input[@id='applicationFacilityDownPaymentToVendorPerc_WIFT001MT']")
	private WebElement main_additional_tab_DownPayment_ToVendor;
	public WebElement mainAdditionalTabDownPaymentToVendor() {
		return main_additional_tab_DownPayment_ToVendor;
	}
	
	
	@FindBy(xpath = "//input[@id='applicationFacilitycvvalue_WIFT001MT']")
	private WebElement main_additional_tab_CV_Value;
	public WebElement main_additional_tab_CV_Value() {
		return main_additional_tab_CV_Value;
	}
	
	
	@FindBy(xpath = "//input[@id='applicationfacilityLimitDetailsFACILITY_VALUE_WIFT001MT']")
	private WebElement main_LimitDetails_tab_FACILITY_VALUE;
	public WebElement main_LimitDetails_tab_FACILITY_VALUE() {
		return main_LimitDetails_tab_FACILITY_VALUE;
	}
	
	@FindBy(xpath = "//input[@id='applicationfacilityLimitDetailsDOWN_PAYMENT_PERCENTAGE_WIFT001MT']")
	private WebElement main_LimitDetails_tab_DOWN_PAYMENT_PERCENTAGE;
	public WebElement main_LimitDetails_tab_DOWN_PAYMENT_PERCENTAGE() {
		return main_LimitDetails_tab_DOWN_PAYMENT_PERCENTAGE;
	}
	
	@FindBy(xpath = "//input[@id='applicationFacilityLimitDetailsDownPaymentToVendorPerc_WIFT001MT']")
	private WebElement main_LimitDetails_tab_DownPaymentToVendorPerc;
	public WebElement main_LimitDetails_tab_DownPaymentToVendorPerc() {
		return main_LimitDetails_tab_DownPaymentToVendorPerc;
	}
	
	
	
	
	
	@FindBy(id="_popup_path_sol_ok")
	private WebElement ServerRequestNotComplete_OKButton;

	public WebElement ServerRequestNotComplete_OKButton() {
		return ServerRequestNotComplete_OKButton;
	}
	
	
	@FindBy(xpath = "//input[@id='applicationFacilityofferexpirydate_WIFT001MT']")
	private WebElement additional_tab_expire_date;
	public WebElement additionalTabExpireDate() {
		return additional_tab_expire_date;
	}
	
	@FindBy(xpath = "//li[@id='applicationFacilityLimitDetailsTabs_WIFT001MT']")
	private WebElement main_limit_details_tab;
	public WebElement mainLimitDetailsTab() {
		return main_limit_details_tab;
	}
	
	@FindBy(xpath = "//td[@id='add_ApplicationFacilityLimitDetailsGrid_WIFT001MT']")
	private WebElement limit_details_tab_add_new_record_btn;
	public WebElement limitDetailsTabAddNewRecordBtn() {
		return limit_details_tab_add_new_record_btn;
	}
	@FindBy(xpath="//select[@id='applicationfacilityLimitDetailsGENERAL_FACILITY_TYPE_WIFT001MT']")
	private WebElement limit_details_new_record_Item;
	public WebElement limitDetailsNewRecordItem() {
		return limit_details_new_record_Item;
	}
	@FindBy(xpath="//input[@id='lookuptxt_applicationfacilityLimitDetailsCLASS_TYPE_WIFT001MT']")
	private WebElement limit_details_new_record_Type;
	public WebElement limitDetailsNewRecordType() {
		return limit_details_new_record_Type;
	}
	@FindBy(xpath="//input[@id='applicationfacilityLimitDetailsMATURITY_DATE_WIFT001MT']")
	private WebElement limit_details_new_record_MaturityDate;
	public WebElement limitDetailsNewRecordMaturityDate() {
		return limit_details_new_record_MaturityDate;
	}
	@FindBy(xpath="//input[@id='applicationfacilityLimitDetailsCLEAN_FLAG_WIFT001MT']")
	private WebElement limit_details_new_record_CleanFlag;
	public WebElement limitDetailsNewRecordCleanFlag() {
		return limit_details_new_record_CleanFlag;
	}
	@FindBy(xpath="//input[@id='lookuptxt_applicationfacilityLimitDetailsCLASS_WIFT001MT']")
	private WebElement limit_details_new_record_product_class;
	public WebElement limitDetailsNewRecordProductClass() {
		return limit_details_new_record_product_class;
	}
	
	@FindBy(xpath="//input[@id='lookuptxt_applicationfacilityLimitDetailsECO_SECTOR_WIFT001MT']")
	private WebElement limit_details_new_record_EcoSector;
	public WebElement limitDetailsNewRecordEcoSector() {
		return limit_details_new_record_EcoSector;
	}
	@FindBy(xpath = "//label[@id='applicationfacilityLimitPopupFormId_WIFT001MT_ProductClass_key']")
	private WebElement limit_details_new_record_screen;
	public WebElement limitDetailsNewRecordScreenTouch() {
		return limit_details_new_record_screen;
	}
	
	@FindBy(xpath="//input[@id='lookuptxt_applicationfacilityLimitDetailsFLOATING_RATE_WIFT001MT']")
	private WebElement limit_details_floating_rate;
	public WebElement limitDetailsFloatingRate() {
		return limit_details_floating_rate;
	}
	
	@FindBy(xpath="//input[@id='applicationFacilityLimitTotalYield_WIFT001MT']")
	private WebElement limit_details_yield_details;
	public WebElement limitDetailsYieldDetails() {
		return limit_details_yield_details;
	}
	
	
	// 296063
	@FindBy(xpath = "//span[@id='spanLookup_applicationfacilityLimitDetailsACC_SL_NO_WIFT001MT']")
	private WebElement account_no_search;
	public WebElement accountNoSearch() {
		return account_no_search;
	}
	
	@FindBy(xpath = "(//td[@tdlabel='Branch Code'])[1]")
	private WebElement retrive_account_no;
	public WebElement retriveAccountNo() {
		return retrive_account_no;
	}
	
	@FindBy(xpath = "//button[@id='limitDetails_add_btn_WIFT001MT']")
	private WebElement clicks_add_btn;
	public WebElement clickAddBtn() {
		return clicks_add_btn;
	}
	
	@FindBy(xpath = "//button[@id='applicationfacility_chargesdtls_btn_WIFT001MT']")
	private WebElement limit_details_charges_details_btn;
	public WebElement limitDetailsChargesDetailsBtn() {
		return limit_details_charges_details_btn;
	}
	
	@FindBy(xpath = "//td[@id='add_FacilityChargesGrid_WIFT001MT']")
	private WebElement charges_details_add_new_btn;
	public WebElement chargesDetailsAddNewBtn() {
		return charges_details_add_new_btn;
	}
	
	@FindBy(xpath = "(//td[@tdlabel='Code'])[5")
	private WebElement charges_details_code_label;
	public WebElement chargesDetailsCodeLabel() {
		return charges_details_code_label;
	}
	
	@FindBy(xpath = "//input[@name='lookupTxt_fmsapplchargesVO.CHARGES_CODE']")
	private WebElement charges_details_code;
	public WebElement chargesDetailsCode() {
		return charges_details_code;
	}
	
	@FindBy(xpath = "//input[@id=\"new_1683877339032_fmsapplchargesVO.COLLECT_AT_FAC_APPROVAL\"]")
	private WebElement charges_details_check_fac_approval;
	public WebElement chargesDetailsCheckFacApproval() {
		return charges_details_check_fac_approval;
	}
	
	@FindBy(xpath = "//span[text()='Ok']")
	private WebElement charges_details_Ok_btn;
	public WebElement chargesDetailsOkBtn() {
		return charges_details_Ok_btn;
	}
	
	@FindBy(xpath = "//label[@id='applicationfacilityFormId_WIFT001MT_Collateral_Details_key']")
	private WebElement Collateral_details_tab;
	public WebElement Collateral_details_tab() {
		return Collateral_details_tab;
	}
	@FindBy(xpath = "//td[@id='add_FacilityCollateralGrid_WIFT001MT']")
	private WebElement Collateral_details_add;
	public WebElement Collateral_details_add() {
		return Collateral_details_add;
	}
	
	@FindBy(xpath = "//li[@id='applicationFacilityDocumentDetailsTabs_WIFT001MT']")
	private WebElement main_document_details_tab;
	public WebElement mainDocumentDetailsTab() {
		return main_document_details_tab;
	}
	
	@FindBy(xpath = "//span[@id='spanLookup_applicationFacilitysolicitor_WIFT001AP1']")
	private WebElement document_details_solicitor_search;
	public WebElement documentDetailsSolicitorSearch() {
		return document_details_solicitor_search;
	}	
	
	@FindBy(id="lookuptxt_applicationFacilitysolicitor_WIFT001MT")
	private WebElement document_details_solicitor_name;
	public WebElement documentDetailsSolicitorName() {
		return document_details_solicitor_name;
	}
	
	@FindBy(xpath = "//span[@id='spanLookup_applicationFacilityEstimator_WIFT001AP1']")
	private WebElement document_details_estimator_search;
	public WebElement documentDetailsEstimatorSearch() {
		return document_details_estimator_search;
	}
	
	@FindBy(id="lookuptxt_applicationFacilityEstimator_WIFT001MT")
	private WebElement document_details_estimator_name;
	public WebElement documentDetailsEstimatorName() {
		return document_details_estimator_name;
	}	
	
	@FindBy(xpath = "//button[@id='applicationfacility_save_as_draft_btn_WIFT001MT']")
	private WebElement limit_details_save_btn;
	public WebElement limitDetailsSaveBtn() {
		return limit_details_save_btn;
	}
	
	@FindBy(xpath = "//input[@id='_popup_path_sol_confirm_ok']")
	private WebElement button_confirm_ok;
	public WebElement ButtonConfirmOk() {
		return button_confirm_ok;
	}
	
	@FindBy(xpath = "//body/div[@id='div__popup_path_sol_ok']/div[2]")
	private WebElement button_success_Message;
	public WebElement ButtonSuccessMessage() {
		return button_success_Message;
	}
	
	@FindBy(xpath = "(//input[@value='Ok'])[2]")
	private WebElement button_success_ok;
	public WebElement ButtonSuccessOk() {
		return button_success_ok;
	}
	
	@FindBy(xpath = "//button[@id='applicationfacility_save_btn_WIFT001MT']")
	private WebElement limit_details_validate_btn;
	public WebElement limitDetailsValidateBtn() {
		return limit_details_validate_btn;
	}
	
	@FindBy(xpath = "//span[text()='Approve Level 1/Reject']")
	private WebElement Approval_Level1;
	public WebElement Approval_Level1() {
		return Approval_Level1;
	}
	@FindBy(xpath = "//body[1]/div[3]/div[1]/div[2]/div[2]/div[5]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[7]")
	private WebElement Approval_Level1_Clear;
	public WebElement Approval_Level1_Clear() {
		return Approval_Level1_Clear;
	}
	@FindBy(xpath = "//input[@id='applicationFacilityGridTbl_Id_WIFT001AP1_gs_fmsApplVO.CODE']")
	private WebElement Approval_Level1_Code;
	public WebElement Approval_Level1_Code() {
		return Approval_Level1_Code;
	}
	@FindBy(xpath = "//td[@id='td_applicationFacilityGridTbl_Id_WIFT001AP1_1_fmsApplVO.CODE']")
	private WebElement Approval_Level1_FirstRecord;
	public WebElement Approval_Level1_FirstRecord() {
		return Approval_Level1_FirstRecord;
	}
	
	@FindBy(xpath = "//select[@id='applicationFacilityDecision_1_WIFT001AP1']")
	private WebElement Approval_Level1_Decision;
	public WebElement Approval_Level1_Decision() {
		return Approval_Level1_Decision;
	}
	
	@FindBy(xpath = "//button[@id='applicationfacility_approvelevel1_btn_WIFT001AP1']")
	private WebElement Approval_Level1_Submit;
	public WebElement Approval_Level1_Submit() {
		return Approval_Level1_Submit;
	}
	
	@FindBy(xpath = "//input[@id='_popup_path_sol_confirm_ok']")
	private WebElement Approval_Level1_Submit_confrim;
	public WebElement Approval_Level1_Submit_confrim() {
		return Approval_Level1_Submit_confrim;
	}
	
	@FindBy(xpath = "//input[@id='_popup_path_sol_ok']")
	private WebElement Approval_Level1_Submit_Success;
	public WebElement Approval_Level1_Submit_Success() {
		return Approval_Level1_Submit_Success;
	}
	
	
	@FindBy(xpath = "//td[text()='Facility Closure Request']")
	private WebElement Facility_Closure_Request;
	public WebElement Facility_Closure_Request() {
		return Facility_Closure_Request;
	}
	
	
	
	@FindBy(xpath = "//a[@id='WIFT010MT']")
	private WebElement Facility_Closure_Request_Maintenance;
	public WebElement Facility_Closure_Request_Maintenance() {
		return Facility_Closure_Request_Maintenance;
	}
	
	@FindBy(xpath = "//input[@id='lookuptxt_facilityClosureRequestFacilityReference_WIFT010MT']")
	private WebElement Facility_Closure_Request_FacilityReference;
	public WebElement Facility_Closure_Request_FacilityReference() {
		return Facility_Closure_Request_FacilityReference;
	}
	
	@FindBy(xpath = "//label[@id='facilityClosureRequestId_WIFT010MT_save_key']")
	private WebElement Facility_Closure_Request_Save;
	public WebElement Facility_Closure_Request_Save() {
		return Facility_Closure_Request_Save;
	}
	
	@FindBy(xpath = "//input[@id='_popup_path_sol_ok']")
	private WebElement Facility_Closure_Request_SaveSuccessPopUp;
	public WebElement Facility_Closure_Request_SaveSuccessPopUp() {
		return Facility_Closure_Request_SaveSuccessPopUp;
	}
	@FindBy(xpath = "//a[@id='WIFT010AP']")
	private WebElement Facility_Closure_Request_Approve;
	public WebElement Facility_Closure_Request_Approve() {
		return Facility_Closure_Request_Approve;
	}
	
	@FindBy(xpath = "//input[@id='facilityClosureRequestGridTbl_Id_WIFT010AP_gs_fmsFacilityClosureVO.CODE']")
	private WebElement Facility_Closure_Request_Approve_code;
	public WebElement Facility_Closure_Request_Approve_code() {
		return Facility_Closure_Request_Approve_code;
	}
	@FindBy(xpath = "//td[@id='td_facilityClosureRequestGridTbl_Id_WIFT010AP_1_fmsFacilityClosureVO.CODE']")
	private WebElement Facility_Closure_Request_Approve_FirstRecord;
	public WebElement Facility_Closure_Request_Approve_FirstRecord() {
		return Facility_Closure_Request_Approve_FirstRecord;
	}
	
	@FindBy(xpath = "//button[@id='facilityClosureRequest_approve_btn_WIFT010AP']")
	private WebElement Facility_Closure_Request_Approve_button;
	public WebElement Facility_Closure_Request_Approve_button() {
		return Facility_Closure_Request_Approve_button;
	}
	
	@FindBy(xpath = "//input[@id='_popup_path_sol_confirm_ok']")
	private WebElement Facility_Closure_Request_Approve_button_confirm;
	public WebElement Facility_Closure_Request_Approve_button_confirm() {
		return Facility_Closure_Request_Approve_button_confirm;
	}
	@FindBy(xpath = "//input[@id='_popup_path_sol_ok']")
	private WebElement Facility_Closure_Request_Approve_button_success;
	public WebElement Facility_Closure_Request_Approve_button_success() {
		return Facility_Closure_Request_Approve_button_success;
	}
	@FindBy(xpath = "//span[@id='hdr_runn_date']")
	private WebElement application_financial_facility_RunDate;
	public WebElement applicationfinancialfacilityRunDate() {
		return application_financial_facility_RunDate;
	}
	
	@FindBy(xpath = "//input[@id='global_user_run_date']")
	private WebElement application_financial_facility_UserRunDate;
	public WebElement applicationfinancialfacilityUserRunDate() {
		return application_financial_facility_UserRunDate;
	}
	
	@FindBy(xpath = "//a[@id='WIFT001AP2']")
	private WebElement application_financial_facility_approve2;
	public WebElement applicationFinancialFacilityApproveLevel2() {
		return application_financial_facility_approve2;
	}
	
	@FindBy(xpath = "//a[@id='WIFT001AP3']")
	private WebElement application_financial_facility_approve3;
	public WebElement applicationFinancialFacilityApproveLevel3() {
		return application_financial_facility_approve3;
	}
	@FindBy(xpath = "//a[@id='WIFT001AP1']")
	private WebElement application_Financial_Facilites_ApproveLevel1;

	public WebElement applicationFinancialFacilitesApproveLevel1() {
		return application_Financial_Facilites_ApproveLevel1;
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
	@FindBy(xpath = "(//td[text()='Clear'])[1]")
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
	private WebElement approve_level1_select_devision;
	public WebElement approveLevel1SelectDevision() {
		return approve_level1_select_devision;
	}
	
	@FindBy(xpath = "//button[@id='applicationfacility_approvelevel1_btn_WIFT001AP1']")
	private WebElement approve_level1_submit_btn;
	public WebElement approveLevel1SubmitBtn() {
		return approve_level1_submit_btn;
	}
	
	@FindBy(xpath = "(//td[text()='Clear'])[3]")
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
	public WebElement approveLevel2SelectDevision() {
		return approve_level2_select_devision;
	}
	
	@FindBy(xpath = "//button[@id='applicationfacility_approvelevel2_btn_WIFT001AP2']")
	private WebElement approve_level2_submit_btn;
	public WebElement approveLevel2SubmitBtn() {
		return approve_level2_submit_btn;
	}	
	
	@FindBy(xpath = "(//td[text()='Clear'])[4]")
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
	public WebElement approveLevel3SelectDevision() {
		return approve_level3_select_devision;
	}
	
	@FindBy(xpath = "//button[@id='applicationfacility_approvelevel3_btn_WIFT001AP3']")
	private WebElement approve_level3_submit_btn;
	public WebElement approveLevel3SubmitBtn() {
		return approve_level3_submit_btn;
	}	
	
	
//	@294466
	
	@FindBy(xpath = "//tr[@id='1']")
	private WebElement searched_data;
	public WebElement searchedData() {
		return searched_data;
	}
	
	
	@FindBy(xpath = "//td[text()='Clear']")
	private WebElement clear_btn;
	public WebElement clearBtn() {
		return clear_btn;
	}
	
	@FindBy(xpath = "//button[@id='applicationfacility_bmrecommendations_btn_WIFT001AP1']")
	private WebElement additional_details_BM_recommend_btn;
	public WebElement additionalDetailsBMRecommedBtn() {
		return additional_details_BM_recommend_btn;
	}
	
	@FindBy(xpath = "//textarea[@id='applicationFacilityBMRecommendations_WIFT001AP1']")
	private WebElement BM_recommendations_tab;
	public WebElement BMRecommedTab() {
		return BM_recommendations_tab;
	}
	@FindBy(id="lblapplicationFacilityDocdetailsSolictorssectionC_WIFT001MT")
	private WebElement SolicitorEstimatorHeader;
	public WebElement SolicitorEstimatorHeader() {
		return SolicitorEstimatorHeader;
	}
	@FindBy(xpath="//input[@value='Yes ']")
	private WebElement FacilityAlreadyExistPopup;
	public WebElement FacilityAlreadyExistPopup() {
		return FacilityAlreadyExistPopup;
	}
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

	@FindBy(id = "advanced_options_key")
	private WebElement fms_AdvancedOptionsInMaintenanceScreen;

	public WebElement fmsAdvancedOptionsInMaintenanceScreen() {
		return fms_AdvancedOptionsInMaintenanceScreen;
	}

	@FindBy(id = "settings_key")
	private WebElement fms_SettingsInAdvancedOptions;

	public WebElement fmsSettingsInAdvancedOptions() {
		return fms_SettingsInAdvancedOptions;
	}

	@FindBy(id = "config_icon_lookuptxt_applicationFacilityRating_WIFT001MT")
	private WebElement fms_IconInFacilityRatingUnderSettings;

	public WebElement fmsIconInFacilityRatingUnderSettings() {
		return fms_IconInFacilityRatingUnderSettings;
	}

	@FindBy(xpath = "//div[@id='customization_options_div']//span[text()='Maintenance']")
	private WebElement fms_MaintenanceInIcon;

	public WebElement fmsMaintenanceInIcon() {
		return fms_MaintenanceInIcon;
	}

	@FindBy(id = "fldcust_requiredFlag_WIFT001MT")
	private WebElement fms_RequiredFieldInCustomizationDetailsForFacilityRatingPopUpMenu;

	public WebElement fmsRequiredFieldInCustomizationDetailsForFacilityRatingPopUpMenu() {
		return fms_RequiredFieldInCustomizationDetailsForFacilityRatingPopUpMenu;
	}

	@FindBy(xpath = "//option[text()='Required']")
	private WebElement fms_SelectTheRequiredOptionInTheRequiredField;

	public WebElement fmsSelectTheRequiredOptionInTheRequiredField() {
		return fms_SelectTheRequiredOptionInTheRequiredField;
	}

	// ***********************************************
	@FindBy(xpath = "//option[text()='Not Required']")
	private WebElement fms_SelectTheNotRequiredOptioInTheRequiredField;

	public WebElement fmsSelectTheNotRequiredOptioInTheRequiredField() {
		return fms_SelectTheNotRequiredOptioInTheRequiredField;
	}

	// ***********************************************************

	@FindBy(id = "fieldCust_saveBtn")
	private WebElement fms_SaveButtonInPopUpMenu;

	public WebElement fmsSaveButtonInPopUpMenu() {
		return fms_SaveButtonInPopUpMenu;
	}

	@FindBy(id = "_popup_path_sol_ok")
	private WebElement fms_OkButtonInInformationPopUpMenu;

	public WebElement fmsOkButtonInInformationPopUpMenu() {
		return fms_OkButtonInInformationPopUpMenu;
	}

	@FindBy(id = "fieldCust_closeBtn")
	private WebElement fms_CloseButtonInPopUpMenu;

	public WebElement fmsCloseButtonInPopUpMenu() {
		return fms_CloseButtonInPopUpMenu;
	}
	
	
	@FindBy(xpath = "//span[text()='Approve']")
	private WebElement fms_ApproveInIconUnderSettingsScreen;

	public WebElement fmsApproveInIconUnderSettingsScreen() {
		return fms_ApproveInIconUnderSettingsScreen;
	}
	
	@FindBy(id="fieldCust_saveBtn")
	private WebElement fms_ApproveInCustomizationDetailsForFacilityRatingPopUpMenu;

	public WebElement fmsApproveInCustomizationDetailsForFacilityRatingPopUpMenu() {
		return fms_ApproveInCustomizationDetailsForFacilityRatingPopUpMenu;
	}
	
	@FindBy(id="_popup_path_sol_ok")
	private WebElement fms_OkButtonInformationPopUpMenu;

	public WebElement fmsOkButtonInformationPopUpMenu() {
		return fms_OkButtonInformationPopUpMenu;
	}
	
	@FindBy(id="fieldCust_closeBtn")
	private WebElement fms_CloseButtonInCustomizationDetailsForFacilityRatingPopUpMenu;

	public WebElement fmsCloseButtonInCustomizationDetailsForFacilityRatingPopUpMenu() {
		return fms_CloseButtonInCustomizationDetailsForFacilityRatingPopUpMenu;
	}
	
	@FindBy(id="_popup_path_sol_confirm_ok")
	private WebElement fms_OkButtonInWarningPopUpMenu;

	public WebElement fmsOkButtonInWarningPopUpMenu() {
		return fms_OkButtonInWarningPopUpMenu;
	}
	
	@FindBy(xpath="//label[text()='Facility Rating ']")
	private WebElement fms_ValidateTheFacilityRatingFieldisRequired;

	public WebElement fmsValidateTheFacilityRatingFieldisRequired() {
		return fms_ValidateTheFacilityRatingFieldisRequired;
	}
	@FindBy(id="lookuptxt_applicationFacilityMarketedBy_WIFT001MT")
	private WebElement FMS_MarketedByField;

	public WebElement FMS_MarketedByField() {
		return FMS_MarketedByField;
	}
//---------------------------------//
	
	

	
	
	@FindBy(xpath="//label[@id='applicationfacilityFormId_WIFT001MT_Fixed_Assets_key']")
	private WebElement Fixed_Assets_key;

	public WebElement Fixed_Assets_key() {
		return Fixed_Assets_key;
	}
	
	@FindBy(xpath="//td[@id='add_FmsIjaraFixedAssetsGrid_WIFT001MT']")
	private WebElement Fixed_Assets_key_addIcon;

	public WebElement Fixed_Assets_key_addIcon() {
		return Fixed_Assets_key_addIcon;
	}
	
	
	@FindBy(xpath="//input[@id='new_1689857536453_fmsFacilityAssetVO.CATEGORY_CODE_lookuptxt_FmsIjaraFixedAssetsGrid_WIFT001MT']")
	private WebElement Fixed_Assets_key_CATEGORY;

	public WebElement Fixed_Assets_key_CATEGORY() {
		return Fixed_Assets_key_CATEGORY;
	}
	
	
	@FindBy(xpath="//input[@id='new_1689857536453_fmsFacilityAssetVO.CLASS_CODE_lookuptxt_FmsIjaraFixedAssetsGrid_WIFT001MT']")
	private WebElement Fixed_Assets_key_CLASS;

	public WebElement Fixed_Assets_key_CLASS() {
		return Fixed_Assets_key_CLASS;
	}
	
	@FindBy(xpath="//td[@id='td_FmsIjaraFixedAssetsGrid_WIFT001MT_1_fmsFacilityAssetVO.CIF_NO']")
	private WebElement Fixed_Assets_key_VENDOR;

	public WebElement Fixed_Assets_key_VENDOR() {
		return Fixed_Assets_key_VENDOR;
	}
	@FindBy(xpath="//input[@id='new_1689858453154_fmsFacilityAssetVO.QUANTITY']")
	private WebElement Fixed_Assets_key_Quantity;

	public WebElement Fixed_Assets_key_Quantity() {
		return Fixed_Assets_key_Quantity;
	}
	
	@FindBy(xpath="//input[@id='new_1689858453154_fmsFacilityAssetVO.UNIT']")
	private WebElement Fixed_Assets_key_Unit;

	public WebElement Fixed_Assets_key_Unit() {
		return Fixed_Assets_key_Unit;
	}
	
	@FindBy(xpath="//input[@id='new_1689858453154_fmsFacilityAssetVO.CURRENCY_lookuptxt_FmsIjaraFixedAssetsGrid_WIFT001MT']")
	private WebElement Fixed_Assets_key_CURRENCY;

	public WebElement Fixed_Assets_key_CURRENCY() {
		return Fixed_Assets_key_CURRENCY;
	}
	
	@FindBy(xpath="//input[@id='new_1689858453154_fmsFacilityAssetVO.UNIT_COST']")
	private WebElement Fixed_Assets_key_UNIT_COST;

	public WebElement Fixed_Assets_key_UNIT_COST() {
		return Fixed_Assets_key_UNIT_COST;
	}
}
