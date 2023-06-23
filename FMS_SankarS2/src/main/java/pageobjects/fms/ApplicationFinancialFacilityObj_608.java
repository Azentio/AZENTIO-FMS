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
	
	@FindBy(xpath = "//input[@name='fmsApplVO.CODE']")
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
	
	@FindBy(xpath = "/html/body/div[70]/div[1]/a")
	private WebElement level3_send_alert_popup;
	public WebElement level3SendAlertPopup_608() {
		return level3_send_alert_popup;
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
	
	
	// @AT_AFF_056
	@FindBy(xpath = "//td[text()='Parameters']")
	private WebElement fms_param_parameter;
	public WebElement fmsParamParameter_608() {
		return fms_param_parameter;
	}
			
	@FindBy(xpath = "//td[text()='Facility Category']")
	private WebElement parameter_facility_category;
	public WebElement parameterFacilityCategory_608() {
		return parameter_facility_category;
	}
			
	@FindBy(xpath = "//a[@id='P009MT']")
	private WebElement facility_category_maintanance;
	public WebElement facilityCategoryMaintanance_608() {
		return facility_category_maintanance;
	}
			
	@FindBy(xpath = "//a[@id='infoBarSearchButton_P009MT']")
	private WebElement facility_category_main_search_btn;
	public WebElement facilityCategoryMainSearchBtn_608() {
		return facility_category_main_search_btn;
	}
			
	@FindBy(xpath = "(//td[text()='Treasury'])[1]")
	private WebElement facility_category_main_search_result;
	public WebElement facilityCategoryMainSearchResult() {
		return facility_category_main_search_result;
	}
			
	@FindBy(xpath = "//input[@id='lookuptxt_cif_type_P009MT']")
	private WebElement facility_category_main_cif_input;
	public WebElement facilityCategoryMainCIFInput() {
		return facility_category_main_cif_input;
	}
			
	@FindBy(xpath = "//span[@id='spanLookup_cif_type_P009MT']")
	private WebElement facility_category_main_cif_type_search_option;
	public WebElement facilityCategoryMainCIFTypeSearchOption() {
		return facility_category_main_cif_type_search_option;
	}
			
	@FindBy(id = "td_gridtab_cif_type_P009MT_5_TYPE_CODE")
	private WebElement facility_category_main_cif_type_data;
	public WebElement facilityCategoryMainCIFTypeData() {
		return facility_category_main_cif_type_data;
	}
			
	@FindBy(xpath = "//button[@id='facilitycategory_save_btn_P009MT']")
	private WebElement facility_category_main_save_btn;
	public WebElement facilityCategoryMainSaveBtn() {
		return facility_category_main_save_btn;
	}
	
		
//	@AT_AFF_075	
	@FindBy(xpath = "//td[text()='Control Record']")
	private WebElement parameter_control_records;
	public WebElement parameterControlRecords_608() {
		return parameter_control_records;
	}
	
	@FindBy(xpath = "//a[@id='P007UP']")
	private WebElement control_records_update_after_approve;
	public WebElement controlRecordsUpdateAfterApprove_608() {
		return control_records_update_after_approve;
	}

	@FindBy(xpath = "//input[@id='officer_assigned_required_P007UP']")
	private WebElement control_records_main_info_officer_assign_req_check;
	public WebElement controlRecordsMainInfoOfficerAssignReqCheck_608() {
		return control_records_main_info_officer_assign_req_check;
	}
	
	@FindBy(xpath = "//label[@id='fmsControlRecordMaintFormId_P007UP_officer_assigned_required_key']")
	private WebElement control_records_main_info_officer_assign_req_label;
	public WebElement controlRecordsMainInfoOfficerAssignReqLabel_608() {
		return control_records_main_info_officer_assign_req_label;
	}
	
	
	@FindBy(xpath = "//input[@id='enable_markup_type_P007UP']")
	private WebElement control_records_main_info_enable_markup_check;
	public WebElement controlRecordsMainInfoEnableMarkupCheck_608() {
		return control_records_main_info_enable_markup_check;
	}
	
	@FindBy(xpath = "//label[@id='lbl_enable_markup_type_P007UP']")
	private WebElement control_records_main_info_enable_markup_label;
	public WebElement controlRecordsMainInfoEnableMarkupLabel() {
		return control_records_main_info_enable_markup_label;
	}
	
	@FindBy(xpath = "//li[@id='controlRecordOfficerAssignedTabs_P007UP']")
	private WebElement control_records_update_after_role_of_officers_assigned;
	public WebElement controlRecordsUpdateAfterRoleOfOfficersAssigned_608() {
		return control_records_update_after_role_of_officers_assigned;
	}
	
	@FindBy(xpath = "//li[@id='controlRecordPartysRecordWithCompanyTabs_P007UP']")
	private WebElement control_records_update_after_partys_history;
	public WebElement controlRecordsUpdateAfterPartysHistory_608() {
		return control_records_update_after_partys_history;
	}
	
	@FindBy(xpath = "//li[@id='controlRecordMemberPartyTabs_P007UP']")
	private WebElement control_records_update_after_memeber_countries;
	public WebElement controlRecordsUpdateAferMemberCountries_608() {
		return control_records_update_after_memeber_countries;
	}
	
	@FindBy(xpath = "//button[@id='fmsControlRecordMaint_update_P007UP']")
	private WebElement control_records_update_after_update_btn;
	public WebElement controlRecordsUpdateAfterUpdateBtn_608() {
		return control_records_update_after_update_btn;
	}
	
	@FindBy(xpath = "//a[@id='P007P']")
	private WebElement control_records_approve_menu;
	public WebElement controlRecordsApproveMenu_608() {
		return control_records_approve_menu;
	}
	
	@FindBy(xpath = "//button[@id='fmsControlRecordMaint_approve_P007P']" )
	private WebElement control_records_approve_button;
	public WebElement controlRecordsApproveButton_608() {
		return control_records_approve_button;
	}
	
	// @AT_AFF_074
	@FindBy(xpath = "//td[@id='add_FMSControlRecordMemberCountryGrid_P007UP']")
	private WebElement control_records_memeber_coutries_add_new_row_btn;
	public WebElement controlRecordsMemberCountriesAddNewRowBtn_608() {
		return control_records_memeber_coutries_add_new_row_btn;
	}
	
	@FindBy(xpath = "//td[@id='td_FMSControlRecordMemberCountryGrid_P007UP_1_rn']")
	private WebElement control_records_memeber_coutries_country_code_label;
	public WebElement controlRecordsMemberCountriesCountryCodeLabel_608() {
		return control_records_memeber_coutries_country_code_label;
	}
	
	@FindBy(xpath = "//input[@name='lookupTxt_fmsCtrlDetVO.COUNTRY_CODE']")
	private WebElement control_records_memeber_coutries_country_code;
	public WebElement controlRecordsMemberCountriesCountryCode_608() {
		return control_records_memeber_coutries_country_code;
	}
	
	@FindBy(xpath = "//td[@id='td_FMSControlRecordMemberCountryGrid_P007UP_1_membershipType']")
	private WebElement control_records_memeber_coutries_membership_type_label;
	public WebElement controlRecordsMemberCountriesMembershipTypeLabel_608() {
		return control_records_memeber_coutries_membership_type_label;
	}
	
	@FindBy(xpath = "//select[@gridid='FMSControlRecordMemberCountryGrid_P007UP']")
	private WebElement control_records_memeber_coutries_membership_type_dropdown;
	public WebElement controlRecordsMemberCountriesMembershipTypeDropDown_608() {
		return control_records_memeber_coutries_membership_type_dropdown;
	}
	
	
	// @AT_AFF_098_FMSCore
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
	
	
	
	
}
