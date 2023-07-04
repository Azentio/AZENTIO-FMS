package pageobjects.fms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WIFAK_ApplicationObj_608 {
	
	WebDriver driver;
	public WIFAK_ApplicationObj_608(WebDriver driver) {
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
	
	@FindBy(xpath = "//input[@id='applicationfacilityLimitDetailsFacilityRiskRatingValueDate_WIFT001MT']")
	private WebElement limit_details_new_record_product_class_FRR_value_date;
	public WebElement limitDetailsNewRecordProductClassFRRValueDate_608() {
		return limit_details_new_record_product_class_FRR_value_date;
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
	
	@FindBy(xpath="//input[@id='applicationFacilitylimityielddetrate_WIFT001MT']")
	private WebElement limit_details_yield_details;
	public WebElement limitDetailsYieldDetails_608() {
		return limit_details_yield_details;
	}
	
	
////	@AT_AFF_040
//	@FindBy(xpath = "//input[@name='fmsApplVO.CODE']")
//	private WebElement application_financial_facility_search_code;
//	public WebElement applicationFinancialFacilitySearchCode_608() {
//		return application_financial_facility_search_code;
//	}
//	
//	@FindBy(xpath = "//td[@tdlabel='Code']")
//	private WebElement application_financial_facility_search_result;
//	public WebElement applicationFinancialFacilitySearchResult_608() {
//		return application_financial_facility_search_result;
//	}
//	
//	@FindBy(xpath = "//a[@title='History Log']")
//	private WebElement application_financial_facility_historylog;
//	public WebElement applicationFinancialFacilityHistoryLog_608() {
//		return application_financial_facility_historylog;
//	}
	
	

	
	

	
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
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	////////////
	@FindBy(xpath = "//*[@id=\"limitDetails_add_btn_WIFT001MT\"]")
	private WebElement limit_details_product_add_btn;
	public WebElement limitDetailsProductAddBtn_608() {
		return limit_details_product_add_btn;
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
	
	
//	@AT_FM_038_FMSCore	
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
	
	
	@FindBy(xpath = "//td[text()='SANKAR']")
	private WebElement approval_committee_recommend_by_label_608;
	public WebElement approvalCommitteeRecommendByLabel_608() {
		return approval_committee_recommend_by_label_608;
	}
	
	
	

	
	
//	@AT_FM_059
//	User_608
	@FindBy(xpath = "//input[@name='USER_ID']")
	private WebElement send_alert_search_grid_user_id;
	public WebElement sendAlertSearchGridUserID() {
		return send_alert_search_grid_user_id;
	}
	
	@FindBy(xpath = "//td[@id='td_alertsGrid_Id_WIFT001MT_1_alertsParamCO.userId']")
	private WebElement send_alert_search_grid_user_id_row;
	public WebElement sendAlertSearchGridUserIDRow() {
		return send_alert_search_grid_user_id_row;
	}
	
	@FindBy(xpath = "//a[@id='sendBut_WIFT001MT']")
	private WebElement send_alert_send_btn;
	public WebElement sendAlertSendBtn() {
		return send_alert_send_btn;
	}
	
	// User_VAK
	@FindBy(xpath = "/html/body/div[13]")
	private WebElement User_VAK_alert_popup;
	public WebElement UserVakAlertPopup() {
		return User_VAK_alert_popup;
	}
	
	@FindBy(xpath = "//a[text()='Open Item']")
	private WebElement send_alert_open_item_link;
	public WebElement sendAlertOpenItemLink() {
		return send_alert_open_item_link;
	}
	
	@FindBy(xpath = "//input[@id='code_WIFT001AP1_ALERT']")
	private WebElement send_alert_approve_item_code;
	public WebElement sendAlertApproveItemCode() {
		return send_alert_approve_item_code;
	}
	
	@FindBy(xpath = "//button[@id='alertsOpenItemApprove_RCVALERT']")
	private WebElement send_alert_approve_item_Approve_btn;
	public WebElement sendAlertApproveItemApproveBtn() {
		return send_alert_approve_item_Approve_btn;
	}
	
	
	
	
	
}
