package pageobjects.fms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ApplicationFinancialFacilityObj_608 {
	
	WebDriver driver;
	public ApplicationFinancialFacilityObj_608(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	// Clear cache for FMS Core
	@FindBy(xpath = "//span[@id='tech_details_icon']")
	private WebElement FMS_core_tech_details_icon;
	public WebElement FMSCoreTechDetailsIcon_608() {
		return FMS_core_tech_details_icon;
	}
	
	@FindBy(xpath = "//label[@id='clear_cache_key']")
	private WebElement FMS_core_clear_cache_btn;
	public WebElement FMSCoreClearCacheBtn_608() {
		return FMS_core_clear_cache_btn;
	}
	
		
	
//	@AT_AFF_036
	@FindBy(xpath = "(//td[text()='WIFAK APPLICATION'])[1]")
	private WebElement wifak_application_first;
	public WebElement wifakApplicationFirst_608() {
		return wifak_application_first;
	}
	
	@FindBy(xpath = "(//td[text()='WIFAK APPLICATION'])[2]")
	private WebElement wifak_application_second;
	public WebElement wifakApplicationSecond_608() {
		return wifak_application_second;
	}
	
	@FindBy(xpath = "//td[text()='Application For Financial Facilities']")
	private WebElement wifak_application_child_application_financial_facility;
	public WebElement applicationFinancialFacility_608() {
		return wifak_application_child_application_financial_facility;
	}
	
	@FindBy(xpath = "//a[@id='WIFT001MT']")
	private WebElement app_financial_facility_main;
	public WebElement appFinancialFacilityMaintanance_608() {
		return app_financial_facility_main;
	}
	
	@FindBy(xpath = "//a[@menuvar='WIFT001MT']//parent::td//following-sibling::td//span")
	private WebElement wifak_app_financial_facility_main_close_icon;
	public WebElement wifakAppFinancialFacilityMaintananceCloseIcon_608() {
		return wifak_app_financial_facility_main_close_icon;
	}
	
	@FindBy(xpath = "//input[@id='statusDesc_WIFT001MT']")
	private WebElement wifak_app_financial_facility_main_status;
	public WebElement wifakAppFinancialFacilityMaintananceStatus_608() {
		return wifak_app_financial_facility_main_status;
	}
	
	@FindBy(xpath = "//input[@id='savedAsReopened_WIFT001MT']")
	private WebElement wifak_app_financial_facility_main_reopen_status;
	public WebElement wifakAppFinancialFacilityMaintananceReopenStatus_608() {
		return wifak_app_financial_facility_main_reopen_status;
	}
	
	@FindBy(xpath = "//input[@id='code_WIFT001MT']")
	private WebElement wifak_application_financial_facility_main_application_code;
	public WebElement wifakApplicationFinancialFacilityMainApplicationCode_608() {
		return wifak_application_financial_facility_main_application_code;
	}
	
	@FindBy(xpath = "//select[@id='applicationFacilityApplicationfor_WIFT001MT']")
	private WebElement main_application_for_dropdown;
	public WebElement mainApplicationForDropdown_608() {
		return main_application_for_dropdown;
	}
	
	@FindBy(xpath = "//input[@id='lookuptxt_applicationFacilitycif_WIFT001MT']")
	private WebElement main_cif_no;
	public WebElement mainCIFNo_608() {
		return main_cif_no;
	}
	
	@FindBy(xpath = "//input[@id='lookuptxt_applicationFacilityFacilityType_WIFT001MT']")
	private WebElement main_facility_type;
	public WebElement mainFacilityType_608() {
		return main_facility_type;
	}
	
	@FindBy(xpath = "//input[@id='applicationFacilityFacilityTypeName_WIFT001MT']")
	private WebElement main_facility_type_label;
	public WebElement mainFacilityTypeLabel_608() {
		return main_facility_type_label;
	}
	
	@FindBy(xpath = "//input[@id='lookuptxt_applicationFacilityCountry_WIFT001MT']")
	private WebElement main_country_of_financing;
	public WebElement mainCountryOfFinancing_608() {
		return main_country_of_financing;
	}
	
	@FindBy(xpath = "//input[@id='lookuptxt_applicationFacilityRating_WIFT001MT']")
	private WebElement main_facility_rating;
	public WebElement mainFacilityRating_608() {
		return main_facility_rating;
	}
	
	@FindBy(xpath = "//li[@id='applicationFacilityAdditionDetailsTabs_WIFT001MT']")
	private WebElement main_additional_tab;
	public WebElement mainAdditionalTab_608() {
		return main_additional_tab;
	}
	
	@FindBy(xpath = "//input[@id='applicationFacilitytotalvalue_WIFT001MT']")
	private WebElement main_additional_tab_total_value;
	public WebElement mainAdditionalTabTotalValue_608() {
		return main_additional_tab_total_value;
	}
	
	@FindBy(xpath = "//input[@id='applicationFacilityfxnominallimit_WIFT001MT']")
	private WebElement main_additional_tab_FX_nominal_limit;
	public WebElement mainAdditionalTabFXNominalLimit_608() {
		return main_additional_tab_FX_nominal_limit;
	}
	
	
	@FindBy(xpath = "//input[@id='applicationFacilityofferexpirydate_WIFT001MT']")
	private WebElement additional_tab_expire_date;
	public WebElement additionalTabExpireDate_608() {
		return additional_tab_expire_date;
	}
	
	@FindBy(xpath = "//li[@id='applicationFacilityLimitDetailsTabs_WIFT001MT']")
	private WebElement main_limit_details_tab;
	public WebElement mainLimitDetailsTab_608() {
		return main_limit_details_tab;
	}
	
	@FindBy(xpath = "//td[@id='add_ApplicationFacilityLimitDetailsGrid_WIFT001MT']")
	private WebElement limit_details_tab_add_new_record_btn;
	public WebElement limitDetailsTabAddNewRecordBtn_608() {
		return limit_details_tab_add_new_record_btn;
	}
	
	@FindBy(xpath="//input[@id='lookuptxt_applicationfacilityLimitDetailsCLASS_WIFT001MT']")
	private WebElement limit_details_new_record_product_class;
	public WebElement limitDetailsNewRecordProductClass_608() {
		return limit_details_new_record_product_class;
	}
	
	@FindBy(xpath = "//input[@id='applicationfacilityLimitDetailsCLASSDesc_WIFT001MT']")
	private WebElement limit_details_new_record_product_class_value;
	public WebElement limitDetailsNewRecordProductClassValue_608() {
		return limit_details_new_record_product_class_value;
	}
	
	@FindBy(xpath = "//input[@id='applicationfacilityLimitDetailsFACILITY_VALUE_WIFT001MT']")
	private WebElement limit_details_product_class_tab_facility_value;
	public WebElement limitDetailsProductClassTabFacilityValue_608() {
		return limit_details_product_class_tab_facility_value;
	}
	
	@FindBy(xpath = "//input[@id='applicationfacilityLimitDetailsCLEAN_FLAG_WIFT001MT']")
	private WebElement limit_details_new_record_clean_flag;
	public WebElement limitDetailsNewRecordCleanFlag_608() {
		return limit_details_new_record_clean_flag;
	}
	
	@FindBy(xpath="//input[@id='lookuptxt_applicationfacilityLimitDetailsFLOATING_RATE_WIFT001MT']")
	private WebElement limit_details_floating_rate;
	public WebElement limitDetailsFloatingRate_608() {
		return limit_details_floating_rate;
	}
	
	@FindBy(xpath = "//input[@id='applicationfacilityLimitDetailsfloatRateDesc_WIFT001MT']")
	private WebElement limit_details_floating_rate_label;
	public WebElement limitDetailsFloatingRateLabel_608() {
		return limit_details_floating_rate_label;
	}
	
	@FindBy(xpath = "//input[@id='applicationfacilityLimitDetailsFLOAT_RATE_PERIODICITY_NBR_WIFT001MT']")
	private WebElement limit_details_floating_rate_periodicity_input;
	public WebElement limitDetailsFloatingRatePeriodicityInput_608() {
		return limit_details_floating_rate_periodicity_input;
	}
	
	@FindBy(xpath = "//select[@id='applicationfacilityLimitDetailsFLOAT_RATE_PERIODICITY_TYPE_WIFT001MT']")
	private WebElement limit_details_floating_rate_periodicity_type;
	public WebElement limitDetailsFloatingRatePeriodicityType_608() {
		return limit_details_floating_rate_periodicity_type;
	}
	
	@FindBy(xpath="//input[@id='applicationFacilitylimityielddetrate_WIFT001MT']")
	private WebElement limit_details_yield_details;
	public WebElement limitDetailsYieldDetails_608() {
		return limit_details_yield_details;
	}
	
	
	
	
	
//	@AT_AFF_040
//	@FindBy(xpath = "//a[@id='WIFT001AP1']")
//	private WebElement application_financial_facility_approve1;
//	public WebElement applicationFinancialFacilityApproveLevel1_608() {
//		return application_financial_facility_approve1;
//	}	
	
	@FindBy(xpath = "//div[@id='gbox_applicationFacilityGridTbl_Id_WIFT001MT']")
	private WebElement wifak_application_financial_facility_searchgrid;
	public WebElement wifakApplicationFinancialFacilitySearchGrid_608() {
		return wifak_application_financial_facility_searchgrid;
	}
	
	@FindBy(xpath = "//input[@id='applicationFacilityGridTbl_Id_WIFT001MT_gs_fmsApplVO.CODE']")
	private WebElement application_financial_facility_search_code;
	public WebElement applicationFinancialFacilitySearchCode_608() {
		return application_financial_facility_search_code;
	}
	
	@FindBy(xpath = "//td[@tdlabel='Code']")
	private WebElement application_financial_facility_search_result;
	public WebElement applicationFinancialFacilitySearchResult_608() {
		return application_financial_facility_search_result;
	}
	
	@FindBy(xpath = "//a[@title='History Log']")
	private WebElement application_financial_facility_historylog_tab;
	public WebElement applicationFinancialFacilityHistoryLogTab_608() {
		return application_financial_facility_historylog_tab;
	}
	
	@FindBy(xpath = "//table[@id='fmsApplHistoryLogGridId_WIFT001AP1']")
	private WebElement application_financial_facility_historylog_values;
	public WebElement applicationFinancialFacilityHistoryLogValues_608() {
		return application_financial_facility_historylog_values;
	}
	
	
	
//	@AT_AFF_048
	@FindBy(xpath = "//span[@id='spanLookup_applicationfacilityLimitDetailsACC_SL_NO_WIFT001MT']")
	private WebElement limit_details_account_no_search;
	public WebElement limitDetailsAccountNoSearch_608() {
		return limit_details_account_no_search;
	}
	
	@FindBy(xpath = "(//td[@tdlabel='Branch Code'])[1]")
	private WebElement limit_details_retrive_account_no;
	public WebElement limitDetailsRetrieveAccountNo() {
		return limit_details_retrive_account_no;
	}
	
	@FindBy(xpath = "//input[@id='lookuptxt_applicationfacilityLimitDetailsACC_Add_Det_WIFT001MT']")
	private WebElement limit_details_account_no_input;
	public WebElement limitDetailsAccountNoInput() {
		return limit_details_account_no_input;
	}
	
	@FindBy(xpath = "//*[@id=\"limitDetails_add_btn_WIFT001MT\"]")
	private WebElement limit_details_product_add_btn;
	public WebElement limitDetailsProductAddBtn_608() {
		return limit_details_product_add_btn;
	}
	
	@FindBy(xpath = "//button[@id='applicationfacility_chargesdtls_btn_WIFT001MT']")
	private WebElement limit_details_charges_details_btn;
	public WebElement limitDetailsChargesDetailsBtn_608() {
		return limit_details_charges_details_btn;
	}
	
	@FindBy(xpath = "//*[@id='td_FacilityChargesGrid_WIFT001MT_1_fmsapplchargesVO.CHARGES_CODE']")
	private WebElement charges_details_code_label;
	public WebElement chargesDetailsCodeLabel_608() {
		return charges_details_code_label;
	}
	
	@FindBy(xpath = "//input[@name='lookupTxt_fmsapplchargesVO.CHARGES_CODE']")
	private WebElement charges_details_code;
	public WebElement chargesDetailsCode_608() {
		return charges_details_code;
	}
	
	@FindBy(xpath = "//input[@id='1_fmsapplchargesVO.COLLECT_AT_FAC_APPROVAL_FacilityChargesGrid_WIFT001MT']")
	private WebElement charges_details_collect_fac_approval_flag;
	public WebElement chargesDetailsCollectFacApprovalFlag_608() {
		return charges_details_collect_fac_approval_flag;
	}
	
	@FindBy(xpath = "//span[text()='Ok']")
	private WebElement charges_details_Ok_btn;
	public WebElement chargesDetailsOkBtn_608() {
		return charges_details_Ok_btn;
	}	
	
	@FindBy(xpath = "//li[@id='applicationFacilityDocumentDetailsTabs_WIFT001MT']")
	private WebElement main_document_details_tab;
	public WebElement mainDocumentDetailsTab_608() {
		return main_document_details_tab;
	}
	
	@FindBy(xpath = "//input[@id='lookuptxt_applicationFacilitysolicitor_WIFT001MT']")
	private WebElement document_details_solicitor_name;
	public WebElement documentDetailsSolicitorName_608() {
		return document_details_solicitor_name;
	}
	
	@FindBy(xpath = "//input[@id='lookuptxt_applicationFacilityEstimator_WIFT001MT']")
	private WebElement document_details_estimator_name;
	public WebElement documentDetailsEstimatorName_608() {
		return document_details_estimator_name;
	}	
	
	@FindBy(xpath = "//button[@id='applicationfacility_save_as_draft_btn_WIFT001MT']")
	private WebElement limit_details_save_btn;
	public WebElement limitDetailsSaveBtn_608() {
		return limit_details_save_btn;
	}
	
	@FindBy(xpath = "//input[@id='_popup_path_sol_confirm_ok']")
	private WebElement warning_popup_ok_btn;
	public WebElement WarningPopupOkBtn_608() {
		return warning_popup_ok_btn;
	}
	
	@FindBy(xpath = "//input[@id='_popup_path_sol_ok']")
	private WebElement success_popup_ok_btn;
	public WebElement SuccessPopupOkBtn_608() {
		return success_popup_ok_btn;
	}
	
	@FindBy(xpath = "//button[@id='applicationfacility_save_btn_WIFT001MT']")
	private WebElement limit_details_validate_btn;
	public WebElement limitDetailsValidateBtn_608() {
		return limit_details_validate_btn;
	}
	
	@FindBy(xpath = "//div[text()='CONFIRM']")
	private WebElement confirm_popup;
	public WebElement confirmPopup_608() {
		return confirm_popup;
	}
	
	@FindBy(xpath = "//input[@id='_popup_path_sol_confirm_ok']")
	private WebElement confirm_popup_ok_btn;
	public WebElement ConfirmPopupOkBtn_608() {
		return confirm_popup_ok_btn;
	}
	
	@FindBy(xpath = "//div[@class='jMsgbox-contentWrap']")
	private WebElement facility_already_created_popup_Msg;
	public WebElement facilityAlreadyCreatedPopupMsg_608() {
		return facility_already_created_popup_Msg;
	}
	
	@FindBy(xpath = "//input[@id='_popup_path_sol_confirm_ok']")
	private WebElement facility_already_created_popup;
	public WebElement facilityAlreadyCreatedPopup_608() {
		return facility_already_created_popup;
	}
	
	@FindBy(xpath = "//div[text()='Success']")
	private WebElement success_popup;
	public WebElement successPopup_608() {
		return success_popup;
	}
	
	@FindBy(xpath = "//div[@class='jMsgbox-contentWrap']")
	private WebElement success_popup_msg;
	public WebElement successPopupMessage_608() {
		return success_popup_msg;
	}
	
	@FindBy(xpath = "(//a[@class='ui-dialog-titlebar-close ui-corner-all'])[9]")
	private WebElement send_alert_popup;
	public WebElement sendAlertPopup_608() {
		return send_alert_popup;
	}
	
	@FindBy(xpath = "//a[@id='dismissbut_WIFT001AP3']")
	private WebElement level3_send_alert_popup_dismiss_btn;
	public WebElement level3SendAlertPopupDismissBtn_608() {
		return level3_send_alert_popup_dismiss_btn;
	}
	
	@FindBy(xpath = "//a[@id='dismissbut_WIFT001MT']")
	private WebElement send_alert_popup_dismiss_btn;
	public WebElement sendAlertPopupDismissBtn_608() {
		return send_alert_popup_dismiss_btn;
	}
	
	@FindBy(xpath = "//a[@id='WIFT001AP1']")
	private WebElement application_financial_facility_approve1;
	public WebElement applicationFinancialFacilityApproveLevel1_608() {
		return application_financial_facility_approve1;
	}
	
	@FindBy(xpath = "//input[@id='applicationFacilityGridTbl_Id_WIFT001AP1_gs_fmsApplVO.CODE']")
	private WebElement approve_level1_ref_code_input;
	public WebElement approveLevel1RefCodeInput_608() {
		return approve_level1_ref_code_input;
	}
	
	@FindBy(xpath = "//td[@id='td_applicationFacilityGridTbl_Id_WIFT001AP1_1_fmsApplVO.CODE']")
	private WebElement approve_level1_retrieve_ref_code;
	public WebElement approveLevel1RetrieveCode_608() {
		return approve_level1_retrieve_ref_code;
	}
	
	@FindBy(xpath = "//select[@id='applicationFacilityDecision_1_WIFT001AP1']")
	private WebElement approve_level1_select_decision;
	public WebElement approveLevel1SelectDecision_608() {
		return approve_level1_select_decision;
	}
	
	@FindBy(xpath = "//select[@id='applicationFacilityDecision_1_WIFT001AP1']")
	private WebElement approve_level1_select_decision_forward;
	public WebElement approveLevel1SelectDecisionForward_608() {
		return approve_level1_select_decision_forward;
	}
	
	@FindBy(xpath = "//select[@id='applicationFacilityForwardP1_WIFT001AP1']")
	private WebElement approve_level1_decision_forward_to;
	public WebElement approveLevel1DecisionForwardTo_608() {
		return approve_level1_decision_forward_to;
	}
	
	@FindBy(xpath = "//button[@id='applicationfacility_approvelevel1_btn_WIFT001AP1']")
	private WebElement approve_level1_submit_btn;
	public WebElement approveLevel1SubmitBtn_608() {
		return approve_level1_submit_btn;
	}
	
	@FindBy(xpath = "//a[@menuvar='WIFT001AP1']//parent::td//following-sibling::td//span")
	private WebElement wifak_approve_level1_close_icon;
	public WebElement wifakApproveLevel1CloseIcon_608() {
		return wifak_approve_level1_close_icon;
	}
	
	@FindBy(xpath = "//a[@id='WIFT001AP2']")
	private WebElement application_financial_facility_approve2;
	public WebElement applicationFinancialFacilityApproveLevel2_608() {
		return application_financial_facility_approve2;
	}
	
	@FindBy(xpath = "//input[@id='applicationFacilityGridTbl_Id_WIFT001AP2_gs_fmsApplVO.CODE']")
	private WebElement approve_level2_ref_code_input;
	public WebElement approveLevel2RefCodeInput_608() {
		return approve_level2_ref_code_input;
	}
	
	@FindBy(xpath = "//td[@id='td_applicationFacilityGridTbl_Id_WIFT001AP2_1_fmsApplVO.CODE']")
	private WebElement approve_level2_retrieved_ref_code;
	public WebElement approveLevel2RetrieveRefCode_608() {
		return approve_level2_retrieved_ref_code;
	}
	
	@FindBy(xpath = "//select[@id='applicationFacilityDecision2_WIFT001AP2']")
	private WebElement approve_level2_select_decision;
	public WebElement approveLevel2SelectDecision_608() {
		return approve_level2_select_decision;
	}
	
	@FindBy(xpath = "//button[@id='applicationfacility_approvelevel2_btn_WIFT001AP2']")
	private WebElement approve_level2_submit_btn;
	public WebElement approveLevel2SubmitBtn_608() {
		return approve_level2_submit_btn;
	}	
	
	@FindBy(xpath = "//a[@menuvar='WIFT001AP2']//parent::td//following-sibling::td//span")
	private WebElement wifak_approve_level2_close_icon;
	public WebElement wifakApproveLevel2CloseIcon_608() {
		return wifak_approve_level2_close_icon;
	}
	
	@FindBy(xpath = "//a[@id='WIFT001AP3']")
	private WebElement application_financial_facility_approve3;
	public WebElement applicationFinancialFacilityApproveLevel3_608() {
		return application_financial_facility_approve3;
	}
	
	@FindBy(xpath = "//input[@id='applicationFacilityGridTbl_Id_WIFT001AP3_gs_fmsApplVO.CODE']")
	private WebElement approve_level3_ref_code_input;
	public WebElement approveLevel3RefCodeInput_608() {
		return approve_level3_ref_code_input;
	}
	
	@FindBy(xpath = "//td[@id='td_applicationFacilityGridTbl_Id_WIFT001AP3_1_fmsApplVO.CODE']")
	private WebElement approve_level3_retrieve_ref_code;
	public WebElement approveLevel3RetrieveRefCode_608() {
		return approve_level3_retrieve_ref_code;
	}
	
	@FindBy(xpath = "//select[@id='applicationFacilityDecision3_WIFT001AP3']")
	private WebElement approve_level3_select_decision;
	public WebElement approveLevel3SelectDecision_608() {
		return approve_level3_select_decision;
	}
	
	@FindBy(xpath = "//button[@id='applicationfacility_approvelevel3_btn_WIFT001AP3']")
	private WebElement approve_level3_submit_btn;
	public WebElement approveLevel3SubmitBtn_608() {
		return approve_level3_submit_btn;
	}
	
	@FindBy(xpath = "//a[@menuvar='WIFT001AP3']//parent::td//following-sibling::td//span")
	private WebElement wifak_approve_level3_close_icon;
	public WebElement wifakApproveLevel3CloseIcon_608() {
		return wifak_approve_level3_close_icon;
	}
	
//	@AT_AFF_052	
	@FindBy(xpath = "//div[@id='gbox_applicationFacilityGridTbl_Id_WIFT001AP1']")
	private WebElement approve_level1_search_grid;
	public WebElement approveLevel1SearchGrid_608() {
		return approve_level1_search_grid;
	}
	
	@FindBy(xpath = "//td[text()='Clear']")
	private WebElement approve_level1_clear_btn;
	public WebElement approveLevel1ClearBtn_608() {
		return approve_level1_clear_btn;
	}
	
	@FindBy(xpath = "//tr[@id='1']")
	private WebElement approve_level1_searched_data;
	public WebElement approveLevel1SearchedData_608() {
		return approve_level1_searched_data;
	}
	
	@FindBy(xpath = "//li[@id='applicationFacilityAdditionDetailsTabs_WIFT001AP1']")
	private WebElement approve_level1_additional_details_tab;
	public WebElement approveLevel1AdditionalDetailsTab_608() {
		return approve_level1_additional_details_tab;
	}
	
	@FindBy(xpath = "//button[@id='applicationfacility_bmrecommendations_btn_WIFT001AP1']")
	private WebElement additional_details_BM_recommend_btn;
	public WebElement additionalDetailsBMRecommedBtn_608() {
		return additional_details_BM_recommend_btn;
	}
	
	@FindBy(xpath = "//textarea[@id='applicationFacilityBMRecommendations_WIFT001AP1']")
	private WebElement BM_recommendations_tab;
	public WebElement BMRecommedTab_608() {
		return BM_recommendations_tab;
	}
	
	
	
	
	
	
	
	
	
	// @AT_AFF_098_FMSCore
	@FindBy(xpath = "//input[@id='lookuptxt_applicationFacilityMarketedBy_WIFT001MT']")
	private WebElement main_marketed_by_field_input;
	public WebElement mainMarketedByFieldInput_608() {
		return main_marketed_by_field_input;
	}
	
	@FindBy(xpath = "//span[@id='spanLookup_applicationFacilityMarketedBy_WIFT001MT']")
	private WebElement main_marketed_by_field_search;
	public WebElement mainMarketedByFieldSearch_608() {
		return main_marketed_by_field_search;
	}
		
	@FindBy(id = "td_gridtab_applicationFacilityMarketedBy_WIFT001MT_1_USER_ID")
	private WebElement main_marketed_by_value;
	public WebElement mainMarketedByValue_608() {
		return main_marketed_by_value;
	}
		
		
//  @AT_AFF_098_CSMCore
	@FindBy(xpath = "//td[text()='Transfer Of Entities']")
	private WebElement transfer_of_entities_module;
	public WebElement transferOfEntitiesModule_608() {
		return transfer_of_entities_module;
	}
		
	@FindBy(xpath = "//a[@id='TOE00MT']")
	private WebElement transfer_entities_main;
	public WebElement transferEntitiesMain_608(){
		return transfer_entities_main;
	}
		
	@FindBy(xpath = "//a[@id='infoBarSearchButton_TOE00MT']")
	private WebElement transfer_entities_main_search_btn;
	public WebElement transferEntitiesMainSearchBtn_608(){
		return transfer_entities_main_search_btn;
	}
		
	@FindBy(xpath = "//input[@name='FROM_CODE']")
	private WebElement transfer_entities_main_search_from_CIF;
	public WebElement transferEntitiesMainSearchFromCIF_608(){
		return transfer_entities_main_search_from_CIF;
	}
		
	@FindBy(xpath = "//input[@name='TO_CODE']")
	private WebElement transfer_entities_main_search_to_CIF;
	public WebElement transferEntitiesMainSearchToCIF_608(){
		return transfer_entities_main_search_to_CIF;
	}
	
	
//	@AT_DDR_020
	@FindBy(xpath = "//input[@id='applicationFacilitydownpaymentperc_WIFT001MT']")
	private WebElement additional_tab_down_payment_percent_input;
	public WebElement additionalTabDownPaymentPercentInput_608() {
		return additional_tab_down_payment_percent_input;
	}
	
	@FindBy(xpath = "//input[@id='applicationFacilitydownpayment_WIFT001MT']")
	private WebElement additional_tab_down_payment_amount_input;
	public WebElement additionalTabDownPaymentAmountInput_608() {
		return additional_tab_down_payment_amount_input;
	}	
	
	@FindBy(xpath = "//input[@id='applicationfacilityLimitDetailsDOWN_PAYMENT_PERCENTAGE_WIFT001MT']")
	private WebElement product_class_down_payment_percent_input;
	public WebElement productClassDownPaymentPercentInput_608() {
		return product_class_down_payment_percent_input;
	}
	
	@FindBy(xpath = "//input[@id='facilityMgtMainDownPayment_WIFT008MT']")
	private WebElement wifak_facilities_management_main_down_payment_amount_input;
	public WebElement wifakFacilitiesManagementMainDownPaymentAmountInput_608() {
		return wifak_facilities_management_main_down_payment_amount_input;
	}
	
	@FindBy(xpath = "//input[@id='facilityMgtMainDownPaymentPerc_WIFT008MT']")
	private WebElement wifak_facilities_management_main_down_payment_percent_input;
	public WebElement wifakFacilitiesManagementMainDownPaymentPercentInput_608() {
		return wifak_facilities_management_main_down_payment_percent_input;
	}
	
	@FindBy(xpath = "//td[@id='td_FacilityManagementFacilityLimitDetailsGrid_WIFT008MT_1_fmsFacilityDetVO.GENERAL_FACILITY_TYPE']")
	private WebElement wifak_facilities_management_facility_limit_details_product_class_row;
	public WebElement wifakFacilitiesManagementFacilityLimitDetailsProductClassRow_608() {
		return wifak_facilities_management_facility_limit_details_product_class_row;
	}
	
	@FindBy(xpath = "//input[@id='facilityMgtLimitDetailsDOWN_PAYMENT_PERCENTAGE_WIFT008MT']")
	private WebElement wifak_facilities_management_limit_details_down_payment_percent_input;
	public WebElement wifakFacilitiesManagementLimitDetailsDownPaymentPercentInput_608() {
		return wifak_facilities_management_limit_details_down_payment_percent_input;
	}
	
	@FindBy(xpath = "//input[@id='facilityMgtLimitDetailsDOWN_PAYMENT_AMT_WIFT008MT']")
	private WebElement wifak_facilities_management_limit_details_down_payment_amount_input;
	public WebElement wifakFacilitiesManagementLimitDetailsDownPaymentAmountInput_608() {
		return wifak_facilities_management_limit_details_down_payment_amount_input;
	}
	
	
//	@AT_DDR_022
	@FindBy(xpath = "//input[@id='facilityMangementCode_WIFT008MT']")
	private WebElement wifak_facilities_management_main_code_input;
	public WebElement wifakFacilitiesManagementMainCodeInput_608() {
		return wifak_facilities_management_main_code_input;
	}
	
	@FindBy(xpath = "//input[@id='lookuptxt_facilityMgtLimitDetailsFLOATING_RATE_WIFT008MT']")
	private WebElement wifak_facilities_management_limit_details_floating_rate_input;
	public WebElement wifakFacilitiesManagementLimitDetailsFloatingRateInput_608() {
		return wifak_facilities_management_limit_details_floating_rate_input;
	}
	
	@FindBy(xpath = "//input[@id='facilityMgtLimitDetailsFLOAT_RATE_PERIODICITY_NBR_WIFT008MT']")
	private WebElement wifak_facilities_management_limit_details_floating_rate_periodicity_input;
	public WebElement wifakFacilitiesManagementLimitDetailsFloatingRatePeriodicityInput_608() {
		return wifak_facilities_management_limit_details_floating_rate_periodicity_input;
	}
	
	@FindBy(xpath = "//select[@id='facilityMgtLimitDetailsFLOAT_RATE_PERIODICITY_TYPE_WIFT008MT']//option[@selected='selected']")
	private WebElement wifak_facilities_management_limit_details_floating_rate_periodicity_type_dropdown;
	public WebElement wifakFacilitiesManagementLimitDetailsFloatingRatePeriodicityTypeDropdown_608() {
		return wifak_facilities_management_limit_details_floating_rate_periodicity_type_dropdown;
	}
	
	@FindBy(xpath = "//button[@id='limitDetails_close_btn_WIFT008MT']")
	private WebElement wifak_facilities_management_limit_details_close_btn;
	public WebElement wifakFacilitiesManagementLimitDetailsCloseBtn_608() {
		return wifak_facilities_management_limit_details_close_btn;
	}
	
	@FindBy(xpath = "//input[@id='lookuptxt_floatingRateCode_WIFT009MT']")
	private WebElement wifak_draw_down_request_additional_details_floating_rate;
	public WebElement wifakDrawDownRequestAdditionaltDetailsFloatingRate_608() {
		return wifak_draw_down_request_additional_details_floating_rate;
	}
	
	@FindBy(xpath = "//input[@id='floatingRatePeriodicityNbr_WIFT009MT']")
	private WebElement wifak_draw_down_request_additional_details_floating_rate_periodicity;
	public WebElement wifakDrawDownRequestAdditionaltDetailsFloatingRatePeriodicity_608() {
		return wifak_draw_down_request_additional_details_floating_rate_periodicity;
	}
	
	
	@FindBy(xpath = "//td[@id='facilityManagementGridTbl_Id_WIFT008MT_pager_left']/table/tbody/tr/td[7]")
	private WebElement wifak_facilities_management_maintanance_clear_btn;
	public WebElement wifakFacilitiesManagementMaintananceClearBtn_608() {
		return wifak_facilities_management_maintanance_clear_btn;
	}
	
	/// WIFAK Draw Down Request Menu
	//Draw Down Request Verify Menu
	@FindBy(xpath = "//a[@id='WIFT009VD']")
	private WebElement wifak_draw_down_request_verify_menu;
	public WebElement wifakDrawDownRequestVerifyMenu_608() {
		return wifak_draw_down_request_verify_menu;
	}
	
	@FindBy(xpath = "//input[@id='drawDownRequestGridTbl_Id_WIFT009VD_gs_fmsDrawDownVO.CODE']")
	private WebElement wifak_draw_down_request_verify_menu_searchgrid_code_input;
	public WebElement wifakDrawDownRequestVerifyMenuSearchgridCodeInput_608() {
		return wifak_draw_down_request_verify_menu_searchgrid_code_input;
	}
	
	@FindBy(xpath = "//td[@id='td_drawDownRequestGridTbl_Id_WIFT009VD_1_fmsDrawDownVO.CODE']")
	private WebElement wifak_draw_down_request_verify_menu_searchgrid_code_row1;
	public WebElement wifakDrawDownRequestVerifyMenuSearchgridCodeRow1_608() {
		return wifak_draw_down_request_verify_menu_searchgrid_code_row1;
	}
	
	@FindBy(xpath = "//input[@id='code_WIFT009VD']")
	private WebElement wifak_draw_down_request_verify_menu_code_input;
	public WebElement wifakDrawDownRequestVerifyMenuCodeInput_608() {
		return wifak_draw_down_request_verify_menu_code_input;
	}
	
	@FindBy(xpath = "//button[@id='drawdownrequest_validate_btn_WIFT009VD']")
	private WebElement wifak_draw_down_request_verify_menu_verify_btn;
	public WebElement wifakDrawDownRequestVerifyMenuVerifyBtn_608() {
		return wifak_draw_down_request_verify_menu_verify_btn;
	}
	
	@FindBy(xpath = "//button[@id='drawdownrequest_deny_btn_WIFT009VD']")
	private WebElement wifak_draw_down_request_verify_menu_deny_btn;
	public WebElement wifakDrawDownRequestVerifyMenuDenyBtn_608() {
		return wifak_draw_down_request_verify_menu_deny_btn;
	}
	
	@FindBy(xpath = "//a[@id='dismissbut_WIFT009VD']")
	private WebElement wifak_draw_down_request_verify_menu_send_alert_dismiss_btn;
	public WebElement wifakDrawDownRequestVerifyMenuSendAlertDismissBtn_608() {
		return wifak_draw_down_request_verify_menu_send_alert_dismiss_btn;
	}
	
	
	//Draw Down Request Query Menu 
	@FindBy(xpath = "//a[@id='WIFT009QY']")
	private WebElement wifak_draw_down_request_query_menu;
	public WebElement wifakDrawDownRequestQueryMenu_608() {
		return wifak_draw_down_request_query_menu;
	}
	
	@FindBy(xpath = "//input[@id='drawDownRequestGridTbl_Id_WIFT009QY_gs_fmsDrawDownVO.CODE']")
	private WebElement wifak_draw_down_request_query_menu_searchgrid_code_input;
	public WebElement wifakDrawDownRequestQueryMenuSearchgridCodeInput_608() {
		return wifak_draw_down_request_query_menu_searchgrid_code_input;
	}
	
	@FindBy(xpath = "//td[@id='td_drawDownRequestGridTbl_Id_WIFT009QY_1_fmsDrawDownVO.CODE']")
	private WebElement wifak_draw_down_request_query_menu_searchgrid_code_row1;
	public WebElement wifakDrawDownRequestQueryMenuSearchgridCodeRow1_608() {
		return wifak_draw_down_request_query_menu_searchgrid_code_row1;
	}
	
	@FindBy(xpath = "//input[@id='code_WIFT009QY']")
	private WebElement wifak_draw_down_request_query_menu_code_input;
	public WebElement wifakDrawDownRequestQueryMenuCodeInput_608() {
		return wifak_draw_down_request_query_menu_code_input;
	}
	
	@FindBy(xpath = "//li[@id='drawDownRequestAdditionDetailsTabs_WIFT009QY']")
	private WebElement wifak_draw_down_request_query_menu_additional_details_tab;
	public WebElement wifakDrawDownRequestQueryMenuAdditionalDetailsTab_608() {
		return wifak_draw_down_request_query_menu_additional_details_tab;
	}
	
	
	//Draw Down Request Reverse Menu 
	@FindBy(xpath = "WIFT009RV")
	private WebElement wifak_draw_down_request_reverse_menu;
	public WebElement wifakDrawDownRequestReverseMenu_608() {
		return wifak_draw_down_request_reverse_menu;
	}
	
	@FindBy(xpath = "//input[@id='drawDownRequestGridTbl_Id_WIFT009RV_gs_fmsDrawDownVO.CODE']")
	private WebElement wifak_draw_down_request_reverse_menu_searchgrid_code_input;
	public WebElement wifakDrawDownRequestReverseMenuSearchgridCodeInput_608() {
		return wifak_draw_down_request_reverse_menu_searchgrid_code_input;
	}
	
	@FindBy(xpath = "//td[@id='td_drawDownRequestGridTbl_Id_WIFT009RV_1_fmsDrawDownVO.CODE']")
	private WebElement wifak_draw_down_request_reverse_menu_searchgrid_code_row1;
	public WebElement wifakDrawDownRequestReverseMenuSearchgridCodeRow1_608() {
		return wifak_draw_down_request_reverse_menu_searchgrid_code_row1;
	}
	
	@FindBy(xpath = "//input[@id='code_WIFT009RV']")
	private WebElement wifak_draw_down_request_reverse_menu_code_input;
	public WebElement wifakDrawDownRequestReverseMenuCodeInput_608() {
		return wifak_draw_down_request_reverse_menu_code_input;
	}
	
	@FindBy(xpath = "//button[@id='drawdownrequest_reverse_btn_WIFT009RV']")
	private WebElement wifak_draw_down_request_reverse_menu_reverse_btn;
	public WebElement wifakDrawDownRequestReverseMenuReverseBtn_608() {
		return wifak_draw_down_request_reverse_menu_reverse_btn;
	}
	
	// Draw Down Request Approve/Reject Reverse Menu 
	@FindBy(xpath = "WIFT009RR")
	private WebElement wifak_draw_down_request_approve_or_reject_reverse_menu;
	public WebElement wifakDrawDownRequestApproveOrRejectReverseMenu_608() {
		return wifak_draw_down_request_approve_or_reject_reverse_menu;
	}
	
	@FindBy(xpath = "//input[@id='drawDownRequestGridTbl_Id_WIFT009RR_gs_fmsDrawDownVO.CODE']")
	private WebElement wifak_draw_down_request_approve_or_reject_reverse_menu_searchgrid_code_input;
	public WebElement wifakDrawDownRequestApproveOrRejectReverseMenuSearchgridCodeInput_608() {
		return wifak_draw_down_request_approve_or_reject_reverse_menu_searchgrid_code_input;
	}
	
	@FindBy(xpath = "//td[@id='td_drawDownRequestGridTbl_Id_WIFT009RR_1_fmsDrawDownVO.CODE']")
	private WebElement wifak_draw_down_request_approve_or_reject_reverse_menu_searchgrid_code_row1;
	public WebElement wifakDrawDownRequestApproveOrRejectReverseMenuSearchgridCodeRow1_608() {
		return wifak_draw_down_request_approve_or_reject_reverse_menu_searchgrid_code_row1;
	}
	
	@FindBy(xpath = "//input[@id='code_WIFT009RR']")
	private WebElement wifak_draw_down_request_approve_or_reject_reverse_menu_code_input;
	public WebElement wifakDrawDownRequestApproveOrRejectReverseMenuCodeInput_608() {
		return wifak_draw_down_request_approve_or_reject_reverse_menu_code_input;
	}
	
	@FindBy(xpath = "//button[@id='drawdownrequest_approve_reverse_btn_WIFT009RR']")
	private WebElement wifak_draw_down_request_approve_or_reject_reverse_approve_reverse_btn;
	public WebElement wifakDrawDownRequestApproveOrRejectReverseApproveReverseBtn_608() {
		return wifak_draw_down_request_approve_or_reject_reverse_approve_reverse_btn;
	}
	
	@FindBy(xpath = "//button[@id='drawdownrequest_reject_reverse_btn_WIFT009RR']")
	private WebElement wifak_draw_down_request_approve_or_reject_reverse_reject_reverse_btn;
	public WebElement wifakDrawDownRequestApproveOrRejectReverseRejectReverseBtn_608() {
		return wifak_draw_down_request_approve_or_reject_reverse_reject_reverse_btn;
	}
	
	
	// Draw Down Request List Menu
	@FindBy(xpath = "//a[@id='WIFT009ML']")
	private WebElement wifak_draw_down_request_list_menu;
	public WebElement wifakDrawDownRequestListMenu_608() {
		return wifak_draw_down_request_list_menu;
	}
	
	@FindBy(xpath = "//input[@id='lookuptxt_p_param_RA_FR_CODE_NUMBER_WIFT009ML']")
	private WebElement wifak_draw_down_request_list_menu_from_code_input;
	public WebElement wifakDrawDownRequestListMenuFromCodeInput_608() {
		return wifak_draw_down_request_list_menu_from_code_input;
	}
	
	@FindBy(xpath = "//input[@id='lookuptxt_p_param_RA_TO_CODE_NUMBER_WIFT009ML']")
	private WebElement wifak_draw_down_request_list_menu_to_code_input;
	public WebElement wifakDrawDownRequestListMenuToCodeInput_608() {
		return wifak_draw_down_request_list_menu_to_code_input;
	}
	
	@FindBy(xpath = "//button[@id='retrieveBtn_WIFT009ML']")
	private WebElement wifak_draw_down_request_list_menu_retrieve_btn;
	public WebElement wifakDrawDownRequestListMenurRetrieveBtn_608() {
		return wifak_draw_down_request_list_menu_retrieve_btn;
	}
	
	@FindBy(xpath = "/html/body/table/tbody/tr/td[2]/table/tbody/tr[6]/td[3]/span")
	private WebElement wifak_draw_down_request_list_menu_retrieve_user_text;
	public WebElement wifakDrawDownRequestListMenurRetrieveUserText_608() {
		return wifak_draw_down_request_list_menu_retrieve_user_text;
	}
	
	
	// Draw Down Request Update After Approve Menu
	@FindBy(xpath = "//a[@id='WIFT009UP']")
	private WebElement wifak_draw_down_request_update_after_approve_menu;
	public WebElement wifakDrawDownRequestUpdateAfterApproveMenu_608() {
		return wifak_draw_down_request_update_after_approve_menu;
	}
	
	@FindBy(xpath = "//input[@id='drawDownRequestGridTbl_Id_WIFT009UP_gs_fmsDrawDownVO.FROM_FACILITY']")
	private WebElement wifak_draw_down_request_update_after_approve_menu_searchgrid_from_facility_input;
	public WebElement wifakDrawDownRequestUpdateAfterApproveMenuSearchgridFromFacilityInput_608() {
		return wifak_draw_down_request_update_after_approve_menu_searchgrid_from_facility_input;
	}
	
	@FindBy(xpath = "//td[@id='drawDownRequestGridTbl_Id_WIFT009UP_pager_left']/table/tbody/tr/td[7]")
	private WebElement wifak_draw_down_request_update_after_approve_clear_btn;
	public WebElement wifakDrawDownRequestUpdateAfterApproveClearBtn_608() {
		return wifak_draw_down_request_update_after_approve_clear_btn;
	}
	
	@FindBy(xpath = "//input[@id='drawDownRequestGridTbl_Id_WIFT009UP_gs_fmsDrawDownVO.CODE']")
	private WebElement wifak_draw_down_request_update_after_approve_menu_searchgrid_code_input;
	public WebElement wifakDrawDownRequestUpdateAfterApproveMenuSearchgridCodeInput_608() {
		return wifak_draw_down_request_update_after_approve_menu_searchgrid_code_input;
	}
	
	@FindBy(xpath = "//td[@id='td_drawDownRequestGridTbl_Id_WIFT009UP_1_fmsDrawDownVO.CODE']")
	private WebElement wifak_draw_down_request_update_after_approve_menu_searchgrid_code_row1;
	public WebElement wifakDrawDownRequestUpdateAfterApproveMenuSearchgridCodeRow1_608() {
		return wifak_draw_down_request_update_after_approve_menu_searchgrid_code_row1;
	}
	
	@FindBy(xpath = "//input[@id='code_WIFT009UP']")
	private WebElement wifak_draw_down_request_update_after_approve_menu_code_input;
	public WebElement wifakDrawDownRequestUpdateAfterApproveMenuCodeInput_608() {
		return wifak_draw_down_request_update_after_approve_menu_code_input;
	}
	
	@FindBy(xpath = "//li[@id='drawDownRequestAdditionDetailsTabs_WIFT009UP']")
	private WebElement wifak_draw_down_request_update_after_approve_menu_additional_details_tab;
	public WebElement wifakDrawDownRequestUpdateAfterApproveMenuAdditionalDetailsTab_608() {
		return wifak_draw_down_request_update_after_approve_menu_additional_details_tab;
	}
	
	@FindBy(xpath = "//input[@id='drawDownRequestFC_Amount_WIFT009UP']")
	private WebElement wifak_draw_down_request_update_after_approve_additional_details_tab_FC_amt;
	public WebElement wifakDrawDownRequestUpdateAfterApproveAdditionalDetailsTabFCAmtInput_608() {
		return wifak_draw_down_request_update_after_approve_additional_details_tab_FC_amt;
	}
	
	@FindBy(xpath = "//button[@id='drawdownrequest_save_btn_WIFT009UP']")
	private WebElement wifak_draw_down_request_update_after_approve_menu_save_btn;
	public WebElement wifakDrawDownRequestUpdateAfterApproveMenuSaveBtn_608() {
		return wifak_draw_down_request_update_after_approve_menu_save_btn;
	}
	
	@FindBy(xpath = "//a[@id='dismissbut_WIFT009UP']")
	private WebElement wifak_draw_down_request_update_after_approve_send_alert_popup_dismiss_btn;
	public WebElement wifakDrawDownRequestUpdateAfterApproveSendAlertDismissBtn_608() {
		return wifak_draw_down_request_update_after_approve_send_alert_popup_dismiss_btn;
	}
	
	
	// Draw Down Request Approve/Reject Menu
	@FindBy(xpath = "//a[@id='WIFT009AP']")
	private WebElement wifak_draw_down_request_approve_or_reject_menu;
	public WebElement wifakDrawDownRequestApproveOrRejectMenu_608() {
		return wifak_draw_down_request_approve_or_reject_menu;
	}
	
	@FindBy(xpath = "//input[@id='drawDownRequestGridTbl_Id_WIFT009AP_gs_fmsDrawDownVO.CODE']")
	private WebElement wifak_draw_down_request_approve_or_reject_searchgrid_code_input;
	public WebElement wifakDrawDownRequestApproveOrRejectSearchgridCodeInput_608() {
		return wifak_draw_down_request_approve_or_reject_searchgrid_code_input;
	}
	
	@FindBy(xpath = "//td[@id='td_drawDownRequestGridTbl_Id_WIFT009AP_1_fmsDrawDownVO.CODE']")
	private WebElement wifak_draw_down_request_approve_or_reject_searchgrid_code_row1;
	public WebElement wifakDrawDownRequestApproveOrRejectSearchgridCodeRow1_608() {
		return wifak_draw_down_request_approve_or_reject_searchgrid_code_row1;
	}
	
	@FindBy(xpath = "//input[@id='code_WIFT009AP']")
	private WebElement wifak_draw_down_request_approve_or_reject_code_input;
	public WebElement wifakDrawDownRequestApproveOrRejectCodeInput_608() {
		return wifak_draw_down_request_approve_or_reject_code_input;
	}
	
	@FindBy(xpath = "(//div[@id='dynFileToolbar_WIFT009AP']/div/button)[1]")
	private WebElement wifak_draw_down_request_approve_or_reject_approve_btn;
	public WebElement wifakDrawDownRequestApproveOrRejectApproveBtn_608() {
		return wifak_draw_down_request_approve_or_reject_approve_btn;
	}	
	
	@FindBy(xpath = "//button[@id='applicationfacility_collateralDetails_btn_WIFT001MT']")
	private WebElement limit_details_collateral_details_btn;
	public WebElement limitDetailsCollateralDetailsBtn_608() {
		return limit_details_collateral_details_btn;
	}	
	
	
//	@AT_RF_100
	@FindBy(xpath = "//input[@id='lookuptxt_applicationFacilityExistingFacilityRef_WIFT001MT']")
	private WebElement main_existing_facility_ref;
	public WebElement mainExistingFacilityRef_608() {
		return main_existing_facility_ref;
	}
	
	@FindBy(xpath = "//input[@id='applicationFacilityfinancedamount_WIFT001MT']")
	private WebElement additional_tab_finance_amount;
	public WebElement additionalTabFinanceAmount_608() {
		return additional_tab_finance_amount;
	}
	
	@FindBy(xpath = "//td[@id='td_ApplicationFacilityLimitDetailsGrid_WIFT001MT_1_fmsAppLimitDetVO.FACILITY_VALUE']")
	private WebElement limit_details_product_facility_value;
	public WebElement limitDetailsProductFacilityValue_608() {
		return limit_details_product_facility_value;
	}
	
	@FindBy(xpath = "//td[@id='td_ApplicationFacilityLimitDetailsGrid_WIFT001MT_1_fmsAppLimitDetVO.CV_VALUE']")
	private WebElement limit_details_product_CV_value;
	public WebElement limitDetailsProductCVValue_608() {
		return limit_details_product_CV_value;
	}
	
	@FindBy(xpath = "//button[@id='limitDetails_edit_btn_WIFT001MT']")
	private WebElement limit_details_product_edit_btn;
	public WebElement limitDetailsProductEditBtn_608() {
		return limit_details_product_edit_btn;
	}
	
//  @AT_RF_101_FMSCore
    @FindBy(xpath = "//button[@id='applicationfacility_documentchecklist_btn_WIFT001MT']")
    private WebElement limit_details_document_checklist_btn;
    public WebElement limitDetailsDocumentChecklistBtn_608() {
    	return limit_details_document_checklist_btn;
    }
    
    @FindBy(xpath = "//td[@id='td_FacilityDocumentCheckListGrid_WIFT001MT_1_rn']")
    private WebElement limit_details_document_checklist_second_row;
    public WebElement limitDetailsdocumentChecklistSecondRow_608() {
    	return limit_details_document_checklist_second_row;
    }
    
    @FindBy(xpath = "//td[@id='del_FacilityDocumentCheckListGrid_WIFT001MT']")
    private WebElement limit_details_document_checklist_delete_btn;
    public WebElement limitDetailsDocumentChecklistDeleteBtn_608() {
    	return limit_details_document_checklist_delete_btn;
    }
    
    @FindBy(xpath = "//td[@id='add_FacilityDocumentCheckListGrid_WIFT001MT']")
    private WebElement limit_details_document_checklist_add_btn;
    public WebElement limitDetailsDocumentChecklistAddBtn_608() {
    	return limit_details_document_checklist_add_btn;
    }
    
    @FindBy(xpath = "//input[@name='lookupTxt_DOC_CODE']")
    private WebElement limit_details_document_checklist_document_code_input;
    public WebElement limitDetailsDocumentChecklistDocumentCodeInput_608() {
    	return limit_details_document_checklist_document_code_input;
    }
    
    @FindBy(xpath = "//input[@name='lookupTxt_LINE_NO']")
    private WebElement limit_details_document_checklist_line_no_input;
    public WebElement limitDetailsDocumentChecklistLineNoInput_608() {
    	return limit_details_document_checklist_line_no_input;
    }
       
    @FindBy(xpath = "//span[text()='Ok']")
    private WebElement limit_details_document_checklist_Ok_btn;
    public WebElement limitDetailsDocumentChecklistOkBtn_608() {
    	return limit_details_document_checklist_Ok_btn;
    }
	
    
//	@AT_FM_038_FMSCore	
    @FindBy(xpath = "//input[@id='applicationFacilityGridTbl_Id_WIFT002MT_gs_fmsApplVO.CODE']")
    private WebElement wifak_approval_committee_recommend_searchgrid_code_input;
	public WebElement wifakApprovalCommitteeRecommendationsSearchgridCodeInput_608() {
		return wifak_approval_committee_recommend_searchgrid_code_input;
	}
    
	@FindBy(xpath = "//input[@id='applicationFacilityGridTbl_Id_WIFT002MT_gs_fmsFacilityTypeVO.CODE']")
	private WebElement wifak_approval_committee_recommend_facility_type_input;
	public WebElement wifakApprovalCommitteeRecommendationsFacilityTypeInput_608() {
		return wifak_approval_committee_recommend_facility_type_input;
	}
	
	@FindBy(xpath = "//td[@id='td_applicationFacilityGridTbl_Id_WIFT002MT_1_fmsApplVO.CODE']")
	private WebElement wifak_approval_committee_recommend_retrieved_first_row;
	public WebElement wifakApprovalCommitteeRecommendationsRetrievedFirstRow_608() {
		return wifak_approval_committee_recommend_retrieved_first_row;
	}
	
	@FindBy(xpath = "//input[@id='code_WIFT002MT']")
	private WebElement wifak_approval_committee_recommend_code_input;
	public WebElement wifakApprovalCommitteeRecommendationsCodeInput_608() {
		return wifak_approval_committee_recommend_code_input;
	}
	
	@FindBy(xpath = "//td[@id='td_ApplicationFacilityRecommendationGrid_WIFT002MT_61_fmsApplRecommendVO.RECOMMENDED_BY']")
	private WebElement approval_committee_recommend_by_label_608;
	public WebElement approvalCommitteeRecommendByLabel_608() {
		return approval_committee_recommend_by_label_608;
	}
    
    
    
//  @AT_RF_102
    @FindBy(xpath = "//select[@id='applicationfacilityLimitDetailsGENERAL_FACILITY_TYPE_WIFT001MT']")
    private WebElement limit_details_item;
    public WebElement limitDetailsItem_608() {
    	return limit_details_item;
    }
    
    @FindBy(xpath = "//input[@id='applicationfacilityLimitDetailsMATURITY_DATE_WIFT001MT']/following-sibling::img")
    private WebElement limit_details_maturity_date_calender;
    public WebElement limitDetailsMaturityDateCalender_608() {
    	return limit_details_maturity_date_calender;
    }
    
    @FindBy(xpath = "//*[@id='ui-datepicker-div']/table/tbody/tr[5]/td[6]")
    private WebElement limit_details_maturity_date;
    public WebElement limitDetailsMaturityDate_608() {
    	return limit_details_maturity_date;
    }
    
    @FindBy(xpath = "//input[@id='applicationfacilityLimitDetailsMARGIN_RATE_WIFT001MT']")
    private WebElement limit_details_margin_rate_input;
    public WebElement limitDetailsMarginRateInput_608() {
    	return limit_details_margin_rate_input;
    }
    
    
//    @AT_RF_139
    @FindBy(xpath = "//td[@tdlabel='Critical']//input")
    private WebElement limit_details_document_checklist_critical_check;
    public WebElement limitDetailsDocumentChecklistCriticalCheck_608() {
    	return limit_details_document_checklist_critical_check;
    }
    
    @FindBy(xpath = "//li[@id='applicationFacilityLimitDetailsTabs_WIFT001AP1']")
    private WebElement approve_level1_limit_details_tab;
    public WebElement approveLevel1LimitDetailsTab_608() {
    	return approve_level1_limit_details_tab;
    }
    
    @FindBy(xpath = "//td[@id='td_ApplicationFacilityLimitDetailsGrid_WIFT001AP1_1_fmsAppLimitDetVO.GENERAL_FACILITY_TYPE']")
    private WebElement approve_level1_limit_details_product_row;
    public WebElement approveLevel1LimitDetailsProductRow_608() {
    	return approve_level1_limit_details_product_row;
    }
    
    @FindBy(xpath = "//button[@id='applicationfacility_documentchecklist_btn_WIFT001AP1']")
    private WebElement approve_level1_limit_details_doc_checklist_btn;
    public WebElement approveLevel1LimitDetailsDocChecklistBtn_608() {
    	return approve_level1_limit_details_doc_checklist_btn;
    }
    
    @FindBy(xpath = "//td[@id='td_FacilityDocumentCheckListGrid_WIFT001AP1_1_DOC_CODE']")
    private WebElement approve_level1_limit_details_doc_checklist_row;
    public WebElement approveLevel1LimitDetailsDocChecklistRow_608() {
    	return approve_level1_limit_details_doc_checklist_row;
    }
    
    
//  @AT_RF_140
    @FindBy(xpath = "//td[@id='td_FacilityDocumentCheckListGrid_WIFT001MT_2_DOC_CODE']")
    private WebElement limit_details_document_checklist_row2;
    public WebElement limitDetailsDocumentChecklistRow2_608() {
    	return limit_details_document_checklist_row2;
    }
    
    @FindBy(xpath = "//input[@id='documentFile_WIFT001MT']")
    private WebElement limit_details_document_checklist_choose_file_input;
    public WebElement limitDetailsDocumentChecklistChooseFileInput_608() {
    	return limit_details_document_checklist_choose_file_input;
    }
    
    @FindBy(xpath = "//td[@id='td_FacilityDocumentCheckListGrid_WIFT001MT_2_DOC_ATTACHED_YN']/input")
    private WebElement limit_details_document_checklist_attach_flag;
    public WebElement limitDetailsDocumentChecklistAttachFlag_608() {
    	return limit_details_document_checklist_attach_flag;
    }
    
    @FindBy(xpath = "//a[@id='document_UploadBtn_WIFT001MT']")
    private WebElement limit_details_document_checklist_upload_docs_btn;
    public WebElement limitDetailsDocumentChecklistUploadDocsBtn_608() {
    	return limit_details_document_checklist_upload_docs_btn;
    }    
    //Approve Level1
    @FindBy(xpath = "//td[@id='td_FacilityDocumentCheckListGrid_WIFT001AP1_2_DOC_CODE']")
    private WebElement approve1_limit_details_document_checklist_row2;
    public WebElement approve1LimitDetailsDocumentChecklistRow2_608() {
    	return approve1_limit_details_document_checklist_row2;
    }
    
    @FindBy(xpath = "//a[@id='document_ViewBtn_WIFT001AP1']")
    private WebElement approve1_limit_details_document_checklist_view_btn;
    public WebElement approve1LimitDetailsDocumentChecklistViewBtn_608() {
    	return approve1_limit_details_document_checklist_view_btn;
    }
    
    @FindBy(xpath = "//td[@id='td_FacilityDocumentCheckListViewGrid_WIFT001AP1_0_rn']")
    private WebElement approve1_limit_details_document_checklist_view_row1;
    public WebElement approve1LimitDetailsDocumentChecklistViewRow1_608() {
    	return approve1_limit_details_document_checklist_view_row1;
    }
    
    @FindBy(xpath = "/html/body/div[49]/div[1]/a")
    private WebElement approve1_limit_details_document_checklist_view_close;
    public WebElement approve1LimitDetailsDocumentChecklistViewClose_608() {
    	return approve1_limit_details_document_checklist_view_close;
    }
   
    
//  AT_CA_008_Core
    @FindBy(xpath = "//div[@id='_selenuimWIFT0063']")
    private WebElement wifak_reopen_rejected_applications_menu;
    public WebElement wifakReopenRejectedApplicationsMenu_608() {
    	return wifak_reopen_rejected_applications_menu;
    }
    
    @FindBy(xpath = "//a[@id='WIFT0063MT']")
    private WebElement wifak_reopen_rejected_menu_maintanance;
    public WebElement wifakReopenRejectedMenuMaintanance_608() {
    	return wifak_reopen_rejected_menu_maintanance;
    }
    
    @FindBy(xpath = "//input[@id='applicationFacilityGridTbl_Id_WIFT0063MT_gs_fmsApplVO.CODE']")
    private WebElement wifak_reopen_rejected_maintanance_searchgrid_code_input;
    public WebElement wifakReopenRejectedMaintananceSearchgridCodeInput_608() {
    	return wifak_reopen_rejected_maintanance_searchgrid_code_input;
    }
    
    @FindBy(xpath = "//td[@id='td_applicationFacilityGridTbl_Id_WIFT0063MT_1_fmsApplVO.CODE']")
    private WebElement wifak_reopen_rejected_maintanance_searchgrid_first_row_code;
    public WebElement wifakReopenRejectedMaintananceSearchgridFirstRowCode_608() {
    	return wifak_reopen_rejected_maintanance_searchgrid_first_row_code;
    }
    
    @FindBy(xpath = "//input[@id='code_WIFT0063MT']")
    private WebElement wifak_reopen_rejected_maintanance_code_input;
    public WebElement wifakReopenRejectedMaintananceCodeInput_608() {
    	return wifak_reopen_rejected_maintanance_code_input;
    }
    
    @FindBy(xpath = "//button[@id='applicationfacility_reopenReject_btn_WIFT0063MT']")
    private WebElement wifak_reopen_rejected_maintanance_reopen_btn;
    public WebElement wifakReopenRejectedMaintananceReopenBtn_608() {
    	return wifak_reopen_rejected_maintanance_reopen_btn;
    }
    
    @FindBy(xpath = "//a[@id='WIFT0063AP']")
    private WebElement wifak_reopen_rejected_menu_approve_or_reject;
    public WebElement wifakReopenRejectedMenuApproveOrReject_608() {
    	return wifak_reopen_rejected_menu_approve_or_reject;
    }
    
    @FindBy(xpath = "//input[@id='applicationFacilityGridTbl_Id_WIFT0063AP_gs_fmsApplVO.CODE']")
    private WebElement wifak_reopen_rejected_menu_approve_or_reject_searchgrid_code_input;
    public WebElement wifakReopenRejectedMenuApproveOrRejectSearchgridCodeInput_608() {
    	return wifak_reopen_rejected_menu_approve_or_reject_searchgrid_code_input;
    }
	
    @FindBy(xpath = "//td[@id='td_applicationFacilityGridTbl_Id_WIFT0063AP_1_fmsApplVO.CODE']")
    private WebElement wifak_reopen_rejected_menu_approve_or_reject_searchgrid_first_row_code;
    public WebElement wifakReopenRejectedMenuApproveOrRejectSearchgridFirstRowCode_608() {
    	return wifak_reopen_rejected_menu_approve_or_reject_searchgrid_first_row_code;
    }
    
    @FindBy(xpath = "//input[@id='code_WIFT0063AP']")
    private WebElement wifak_reopen_rejected_menu_approve_or_reject_code_input;
    public WebElement wifakReopenRejectedMenuApproveOrRejectCodeInput_608() {
    	return wifak_reopen_rejected_menu_approve_or_reject_code_input;
    }
    
    @FindBy(xpath = "//button[@id='applicationfacility_approveReopen_btn_WIFT0063AP']")
    private WebElement wifak_reopen_rejected_menu_approve_or_reject_approve_btn;
    public WebElement wifakReopenRejectedMenuApproveOrRejectApproveBtn_608() {
    	return wifak_reopen_rejected_menu_approve_or_reject_approve_btn;
    }
    
//	@AT_FM_059
//	User_608
	@FindBy(xpath = "//input[@name='USER_ID']")
	private WebElement send_alert_search_grid_user_id;
	public WebElement sendAlertSearchGridUserID_608() {
		return send_alert_search_grid_user_id;
	}
	
	@FindBy(xpath = "//td[@id='td_alertsGrid_Id_WIFT001MT_1_alertsParamCO.userId']")
	private WebElement send_alert_search_grid_user_id_row;
	public WebElement sendAlertSearchGridUserIDRow_608() {
		return send_alert_search_grid_user_id_row;
	}
	
	@FindBy(xpath = "//a[@id='sendBut_WIFT001MT']")
	private WebElement send_alert_send_btn;
	public WebElement sendAlertSendBtn_608() {
		return send_alert_send_btn;
	}
	
	// User_VAK
	@FindBy(xpath = "/html/body/div[13]")
	private WebElement User_VAK_alert_popup;
	public WebElement UserVakAlertPopup_608() {
		return User_VAK_alert_popup;
	}
	
	@FindBy(xpath = "//a[text()='Open Item']")
	private WebElement send_alert_open_item_link;
	public WebElement sendAlertOpenItemLink_608() {
		return send_alert_open_item_link;
	}
	
	@FindBy(xpath = "//input[@id='code_WIFT001AP1_ALERT']")
	private WebElement send_alert_approve_item_code;
	public WebElement sendAlertApproveItemCode_608() {
		return send_alert_approve_item_code;
	}
	
	@FindBy(xpath = "//button[@id='alertsOpenItemApprove_RCVALERT']")
	private WebElement send_alert_approve_item_Approve_btn;
	public WebElement sendAlertApproveItemApproveBtn_608() {
		return send_alert_approve_item_Approve_btn;
	}
    
	
//	@AT_AE_010
	@FindBy(id = "config_icon_lookuptxt_applicationFacilityMarketedBy_WIFT001MT")
    private WebElement wifak_financial_facility_main_marketed_by_spanner_icon;
	public WebElement wifakFinancialFacilityMainMarketedBySpannerIcon_608() {
		return wifak_financial_facility_main_marketed_by_spanner_icon;
	}
    
	@FindBy(xpath = "//td[@class='labelTd']/span[text()='Maintenance']")
	private WebElement wifak_financial_facility_main_marketed_by_spanner_maintanance;
	public WebElement wifakFinancialFacilityMainMarketedBySpannerMaintanance_608() {
		return wifak_financial_facility_main_marketed_by_spanner_maintanance;
	}
	
	@FindBy(xpath = "//select[@id='fldcust_requiredFlag_WIFT001MT']")
	private WebElement wifak_financial_facility_main_marketed_by_customize_tab_required_dropdown;
	public WebElement wifakFinancialFacilityMainMarketedByCustomizeTabRequiredDropdown_608() {
		return wifak_financial_facility_main_marketed_by_customize_tab_required_dropdown;
	}
	
	@FindBy(xpath = "//button[@id='fieldCust_saveBtn']")
	private WebElement wifak_financial_facility_main_marketed_by_customize_tab_save_btn;
	public WebElement wifakFinancialFacilityMainMarketedByCustomizeTabSaveBtn_608() {
		return wifak_financial_facility_main_marketed_by_customize_tab_save_btn;
	}
	
	@FindBy(xpath = "//button[@id='fieldCust_closeBtn']")
	private WebElement wifak_financial_facility_main_marketed_by_customize_tab_close_btn;
	public WebElement wifakFinancialFacilityMainMarketedByCustomizeTabCloseBtn_608() {
		return wifak_financial_facility_main_marketed_by_customize_tab_close_btn;
	}
	
	@FindBy(xpath = "//td[@class='labelTd']/span[text()='Approve']")
	private WebElement wifak_financial_facility_main_marketed_by_spanner_approve;
	public WebElement wifakFinancialFacilityMainMarketedBySpannerApprove_608() {
		return wifak_financial_facility_main_marketed_by_spanner_approve;
	}
	
	@FindBy(xpath = "//button[@id='fieldCust_saveBtn']")
	private WebElement wifak_financial_facility_main_marketed_by_customize_tab_approve_btn;
	public WebElement wifakFinancialFacilityMainMarketedByCustomizeTabApproveBtn_608() {
		return wifak_financial_facility_main_marketed_by_customize_tab_approve_btn;
	}
	
	@FindBy(xpath = "//label[@id='advanced_options_key']")
	private WebElement FMS_core_advanced_options_menu;
	public WebElement FMSCoreAdvancedOptionsMenu_608() {
		return FMS_core_advanced_options_menu;
	}
	
	@FindBy(xpath = "//label[@id='settings_key']")
	private WebElement FMS_core_advanced_options_menu_settings;
	public WebElement FMSCoreAdvancedOptionsMenuSettings_608() {
		return FMS_core_advanced_options_menu_settings;
	}
	
	
//	Client Response Feature
//	@AT_CR_005
	@FindBy(xpath = "//a[@id='WIFT006MT']")
	private WebElement wifak_client_response_menu;
	public WebElement wifakClientResponseMenu_608() {
		return wifak_client_response_menu;
	}
    
	@FindBy(xpath = "//input[@id='applicationFacilityGridTbl_Id_WIFT006MT_gs_fmsApplVO.CODE']")
	private WebElement wifak_client_response_menu_searchgrid_code_input;
	public WebElement wifakClientResponseMenuSearchgridCodeInput_608() {
		return wifak_client_response_menu_searchgrid_code_input;
	}
	
	@FindBy(xpath = "//td[@id='td_applicationFacilityGridTbl_Id_WIFT006MT_1_fmsApplVO.CODE']")
	private WebElement wifak_client_response_menu_searchgrid_row;
	public WebElement wifakClientResponseMenuSearchgridRow_608() {
		return wifak_client_response_menu_searchgrid_row;
	}
	
	@FindBy(xpath = "//input[@id='code_WIFT006MT']")
	private WebElement wifak_client_response_menu_code_input;
	public WebElement wifakClientResponseMenuCodeInput_608() {
		return wifak_client_response_menu_code_input;
	}
	
	@FindBy(xpath = "//li[@id='applicationFacilityLimitDetailsTabs_WIFT006MT']")
	private WebElement wifak_client_response_limit_details_tab;
	public WebElement wifakClientResponseLimitDetailsTab_608() {
		return wifak_client_response_limit_details_tab;
	}
	
	@FindBy(xpath = "//td[@id='td_ApplicationFacilityLimitDetailsGrid_WIFT006MT_1_fmsAppLimitDetVO.GENERAL_FACILITY_TYPE']")
	private WebElement wifak_client_response_limit_details_product_class_row;
	public WebElement wifakClientResponseLimitDetailsPrductClassRow_608() {
		return wifak_client_response_limit_details_product_class_row;
	}
	
	@FindBy(xpath = "//input[@id='lookuptxt_applicationfacilityLimitDetailsCLASS_WIFT006MT']")
	private WebElement wifak_client_response_limit_details_product_class_input;
	public WebElement wifakClientResponseLimitDetailsPrductClassInput_608() {
		return wifak_client_response_limit_details_product_class_input;
	}
	
	@FindBy(xpath = "//input[@id='lookuptxt_applicationfacilityLimitDetailsFLOATING_RATE_WIFT006MT']")
	private WebElement wifak_client_response_limit_details_product_class_floating_rate;
	public WebElement wifakClientResponseLimitDetailsPrductClassFloatingRate_608() {
		return wifak_client_response_limit_details_product_class_floating_rate;
	}
	
	@FindBy(xpath = "//input[@id='applicationfacilityLimitDetailsFLOAT_RATE_PERIODICITY_NBR_WIFT006MT']")
	private WebElement wifak_client_response_limit_details_product_class_FR_periodicity;
	public WebElement wifakClientResponseLimitDetailsPrductClassFRPeriodicity_608() {
		return wifak_client_response_limit_details_product_class_FR_periodicity;
	}
	
	@FindBy(xpath = "//select[@id='applicationfacilityLimitDetailsFLOAT_RATE_PERIODICITY_TYPE_WIFT006MT']//option[@selected='selected']")
	private WebElement wifak_client_response_limit_details_product_class_FR_periodicity_type;
	public WebElement wifakClientResponseLimitDetailsPrductClassFRPeriodicityType_608() {
		return wifak_client_response_limit_details_product_class_FR_periodicity_type;
	}
	
	@FindBy(xpath = "//button[@id='applicationfacility_investorReject_btn_WIFT006MT']")
	private WebElement wifak_client_response_menu_reject_btn;
	public WebElement wifakClientResponseMenuRejectBtn_608() {
		return wifak_client_response_menu_reject_btn;
	}
	
	
//	Authorize/Reject Feature
//	@AT_AR_001
	@FindBy(xpath = "//a[@id='WIFT004MT']")
	private WebElement wifak_authorize_or_reject_menu;
	public WebElement wifakAuthorizeOrRejectMenu_608() {
		return wifak_authorize_or_reject_menu;
	}
	
	@FindBy(xpath = "//input[@id='applicationFacilityGridTbl_Id_WIFT004MT_gs_fmsApplVO.CODE']")
	private WebElement wifak_authorize_or_reject_searchgrid_code_input;
	public WebElement wifakAuthorizeOrRejectSearchgridCodeInput_608() {
		return wifak_authorize_or_reject_searchgrid_code_input;
	}
	
	@FindBy(xpath = "//td[@id='td_applicationFacilityGridTbl_Id_WIFT004MT_1_fmsApplVO.CODE']")
	private WebElement wifak_authorize_or_reject_searchgrid_row;
	public WebElement wifakAuthorizeOrRejectSearchgridRow_608() {
		return wifak_authorize_or_reject_searchgrid_row;
	}
	
	@FindBy(xpath = "//input[@id='code_WIFT004MT']")
	private WebElement wifak_authorize_or_reject_code_input;
	public WebElement wifakAuthorizeOrRejectCodeInput_608() {
		return wifak_authorize_or_reject_code_input;
	}
	
	@FindBy(xpath = "//li[@id='applicationFacilityLimitDetailsTabs_WIFT004MT']")
	private WebElement wifak_authorize_or_reject_limit_details_tab;
	public WebElement wifakAuthorizeOrRejectLimitDetailsTab_608() {
		return wifak_authorize_or_reject_limit_details_tab;
	}
	
	@FindBy(xpath = "//td[@id='td_ApplicationFacilityLimitDetailsGrid_WIFT004MT_1_fmsAppLimitDetVO.GENERAL_FACILITY_TYPE']")
	private WebElement wifak_authorize_or_reject_limit_details_tab_product_row;
	public WebElement wifakAuthorizeOrRejectLimitDetailsTabProductRow_608() {
		return wifak_authorize_or_reject_limit_details_tab_product_row;
	}
	
	@FindBy(xpath = "//input[@id='lookuptxt_applicationfacilityLimitDetailsCLASS_WIFT004MT']")
	private WebElement wifak_authorize_or_reject_limit_details_tab_product_class_input;
	public WebElement wifakAuthorizeOrRejectLimitDetailsTabProductClassInput_608() {
		return wifak_authorize_or_reject_limit_details_tab_product_class_input;
	}
	
	@FindBy(xpath = "//input[@id='lookuptxt_applicationfacilityLimitDetailsFLOATING_RATE_WIFT004MT']")
	private WebElement wifak_authorize_or_reject_limit_details_tab_floating_rate_input;
	public WebElement wifakAuthorizeOrRejectLimitDetailsTabFloatingRateInput_608() {
		return wifak_authorize_or_reject_limit_details_tab_floating_rate_input;
	}
	
	@FindBy(xpath = "//input[@id='applicationfacilityLimitDetailsFLOAT_RATE_PERIODICITY_NBR_WIFT004MT']")
	private WebElement wifak_authorize_or_reject_limit_details_tab_FR_periodicity_input;
	public WebElement wifakAuthorizeOrRejectLimitDetailsTabFRPeriodicityInput_608() {
		return wifak_authorize_or_reject_limit_details_tab_FR_periodicity_input;
	}
	
	@FindBy(xpath = "//select[@id='applicationfacilityLimitDetailsFLOAT_RATE_PERIODICITY_TYPE_WIFT004MT']//option[@selected='selected']")
	private WebElement wifak_authorize_or_reject_limit_details_tab_FR_periodicity_type;
	public WebElement wifakAuthorizeOrRejectLimitDetailsTabFRPeriodicityType_608() {
		return wifak_authorize_or_reject_limit_details_tab_FR_periodicity_type;
	}
	
	@FindBy(xpath = "//button[@id='applicationfacility_authorize_btn_WIFT004MT']")
	private WebElement wifak_authorize_or_reject_menu_authorize_btn;
	public WebElement wifakAuthorizeOrRejectMenuAuthorizeBtn_608() {
		return wifak_authorize_or_reject_menu_authorize_btn;
	}
	
	@FindBy(xpath = "//button[@id='applicationfacility_AuthorizeReject_btn_WIFT004MT']")
	private WebElement wifak_authorize_or_reject_menu_reject_btn;
	public WebElement wifakAuthorizeOrRejectMenuRejectBtn_608() {
		return wifak_authorize_or_reject_menu_reject_btn;
	}
	
	
	
	
	
	
}
