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
	
	
//	@AT_AFF_040
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
	private WebElement application_financial_facility_historylog;
	public WebElement applicationFinancialFacilityHistoryLog_608() {
		return application_financial_facility_historylog;
	}
	
	
//	@AT_RF_098_User_VAK
	@FindBy(xpath = "//a[@id='WIFT002MT']")
	private WebElement wifak_application_child_approval_committee_recommend_menu;
	public WebElement wifakApprovalCommitteeRecommendationsMenu_608() {
		return wifak_application_child_approval_committee_recommend_menu;
	}
	
	@FindBy(xpath = "//*[@id='applicationFacilityGridTbl_Id_WIFT002MT_pager_left']/table/tbody/tr/td[7]")
	private WebElement wifak_approval_committee_clear_btn;
	public WebElement wifakApprovalCommitteeClearBtn() {
		return wifak_approval_committee_clear_btn;
	}
	
	@FindBy(xpath = "//tr[@id='2']")
	private WebElement wifak_approval_committee_select_row;
	public WebElement wifakApprovalCommitteeSelectRow() {
		return wifak_approval_committee_select_row;
	}
	
	@FindBy(xpath = "//input[@id='code_WIFT002MT']")
	private WebElement wifak_approval_committee_recommend_code;
	public WebElement wifakApprovalCommitteeRecommendationsCode() {
		return wifak_approval_committee_recommend_code;
	}
	
	@FindBy(xpath = "//button[@id='applicationfacility_recommend_btn_WIFT002MT']")
	private WebElement wifak_approval_committee_recommendations_recommend_btn;
	public WebElement wifakApprovalCommitteeRecommendationsRecommendBtn_608() {
		return wifak_approval_committee_recommendations_recommend_btn;
	}
	
	@FindBy(xpath = "//span[text()='OK']")
	private WebElement wifak_approval_committee_recommendations_user_popup_OK_btn;
	public WebElement wifakApprovalCommitteeRecommendationsUserPopupOkBtn_608() {
		return wifak_approval_committee_recommendations_user_popup_OK_btn;
	}	
	
	@FindBy(xpath = "//td[text()='VAK']")
	private WebElement wifak_approval_committee_recommend_by_label;
	public WebElement wifakApprovalCommitteeRecommendByLabel_VAK() {
		return wifak_approval_committee_recommend_by_label;
	}
	
	@FindBy(xpath = "//select[@gridid='ApplicationFacilityRecommendationGrid_WIFT002MT']")
	private WebElement wifak_approval_committee_recommendation_dropdown;
	public WebElement wifakApprovalCommitteeRecommendationDropdown_608() {
		return wifak_approval_committee_recommendation_dropdown;
	}
		
	@FindBy(xpath = "//*[@id='23_fmsApplRecommendVO.RECOMMENDATION_ApplicationFacilityRecommendationGrid_WIFT002MT']/option[1]")
	private WebElement wifak_approval_committee_recommendation_dropdown_option;
	public WebElement wifakApprovalCommitteeRecommendationDropdownOption_608() {
		return wifak_approval_committee_recommendation_dropdown_option;
	}
	
	@FindBy(xpath = "//*[@id='23_fmsApplRecommendVO.COMMENT_CODE_spanLookup_ApplicationFacilityRecommendationGrid_WIFT002MT']/span")
	private WebElement wifak_approval_committee_comment_code_lookup;
	public WebElement approvalCommitteeCommentCodeLookup_608() {
		return wifak_approval_committee_comment_code_lookup;
	}
	
	@FindBy(xpath = "//*[@id='td_gridtab_23_fmsApplRecommendVO_COMMENT_CODE_ApplicationFacilityRecommendationGrid_WIFT002MT_1_CODE']")
	private WebElement wifak_approval_committee_comment_code_lookup_first_row;
	public WebElement wifakApprovalCommitteeCommentCodeLookupFirstRow_608() {
		return wifak_approval_committee_comment_code_lookup_first_row;
	}
	
	@FindBy(xpath = "//button[@id='more_comments_btn_WIFT002MT']")
	private WebElement wifak_approval_committee_more_comments_btn;
	public WebElement wifakApprovalCommitteeMoreCommentsBtn_608() {
		return wifak_approval_committee_more_comments_btn;
	}
	
	@FindBy(xpath = "//textarea[@id='more_comments_WIFT002MT']")
	private WebElement wifak_approval_committee_more_comments_input;
	public WebElement wifakApprovalCommitteeMoreCommentsInput_608() {
		return wifak_approval_committee_more_comments_input;
	}
	
	@FindBy(xpath = "(//span[text()='OK'])[2]")
	private WebElement wifak_approval_committee_more_comments_Ok_btn;
	public WebElement wifakApprovalCommitteeMoreCommentsOkBtn_608() {
		return wifak_approval_committee_more_comments_Ok_btn;
	}
	
	@FindBy(xpath = "(//span[text()='OK'])[1]")
	private WebElement wifak_approval_committee_Ok_btn;
	public WebElement wifakApprovalCommitteeOkBtn_608() {
		return wifak_approval_committee_Ok_btn;
	}

	
//	@AT_RF_098_User_608
	@FindBy(xpath = "//a[@id='infoBarSearchButton_WIFT001MT']")
	private WebElement application_financial_facility_search_btn;
	public WebElement applicationFinancialFacilitySearchBtn_608() {
		return application_financial_facility_search_btn;
	}
	
	@FindBy(xpath = "//button[@id='applicationfacility_approvalcommittiee_btn_WIFT001MT']")
	private WebElement application_financial_facility_approval_committiee_btn;
	public WebElement applicationFinancialFacilityApprovalCommittieeBtn_608() {
		return application_financial_facility_approval_committiee_btn;
	}
	
	@FindBy(xpath = "//td[@id='td_ApplicationFacilityRecommendationGrid_WIFT001MT_23_fmsApplRecommendVO.RECOMMENDED_BY']")
	private WebElement application_financial_facility_approval_committiee_recommend_by_label;
	public WebElement applicationFinancialFacilityApprovalCommittieeRecommendByLabel_608() {
		return application_financial_facility_approval_committiee_recommend_by_label;
	}
	
	@FindBy(xpath = "//button[@id='more_comments_btn_WIFT001MT']")
	private WebElement application_financial_facility_approval_committiee_more_comments_btn;
	public WebElement applicationFinancialFacilityApprovalCommittieeMoreCommentsBtn_608() {
		return application_financial_facility_approval_committiee_more_comments_btn;
	}
	
	@FindBy(xpath = "//textarea[@id='more_comments_WIFT001MT']")
	private WebElement application_financial_facility_approval_committiee_more_comments_text;
	public WebElement applicationFinancialFacilityApprovalCommittieeMoreCommentsText_608() {
		return application_financial_facility_approval_committiee_more_comments_text;
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
	
	
	
//	@AT_FM_058
	@FindBy(xpath = "//td[@id='td_ApplicationFacilityLimitDetailsGrid_WIFT001MT_1_fmsAppLimitDetVO.GENERAL_FACILITY_TYPE']")
	private WebElement wifak_limit_details_product_class_row;
	public WebElement WifakLimitDetailsProductClassRow_608() {
		return wifak_limit_details_product_class_row;
	}
	
	@FindBy(xpath = "//button[@id='applicationfacility_repayplan_btn_WIFT001MT']")
	private WebElement wifak_limit_details_repayment_plan_btn;
	public WebElement WifakLimitDetailsRepaymentPlanBtn_608() {
		return wifak_limit_details_repayment_plan_btn;
	}
	
	@FindBy(xpath = "//input[@id='No_Of_Payments_WIFT001MT']")
	private WebElement wifak_limit_details_repayment_plan_tab_no_of_payments_input;
	public WebElement WifakLimitDetailsRepaymentPlanTabNoOfPaymentsInput_608() {
		return wifak_limit_details_repayment_plan_tab_no_of_payments_input;
	}
	
	@FindBy(xpath = "//button[@id='createSchedule_WIFT001MT']")
	private WebElement wifak_limit_details_repayment_plan_tab_create_schedule_btn;
	public WebElement WifakLimitDetailsRepaymentPlanTabCreateSheduleBtn_608() {
		return wifak_limit_details_repayment_plan_tab_create_schedule_btn;
	}
	
	@FindBy(xpath = "//div[@id='jqgh_repaumentPlanScheduleGridTbl_Id_WIFT001MT_VAT_AND_INSTALLMENT_AMOUNT']")
	private WebElement wifak_limit_details_repayment_plan_tab_installment_vat_amt;
	public WebElement WifakLimitDetailsRepaymentPlanTabInstallmentVatAmt_608() {
		return wifak_limit_details_repayment_plan_tab_installment_vat_amt;
	}
	
	@FindBy(xpath = "//button[@id='savebutton_WIFT001MT']")
	private WebElement wifak_limit_details_repayment_plan_tab_save_btn;
	public WebElement WifakLimitDetailsRepaymentPlanTabSaveBtn_608() {
		return wifak_limit_details_repayment_plan_tab_save_btn;
	}
	
	@FindBy(xpath = "(//td[text()='Facilities Management'])[2]")
	private WebElement wifak_facilities_management_menu;
	public WebElement wifakFacilitiesManagementMenu_608() {
		return wifak_facilities_management_menu;
	}
	
	@FindBy(xpath = "//a[@id='WIFT008MT']")
	private WebElement wifak_facilities_management_maintanance;
	public WebElement wifakFacilitiesManagementMaintanance_608() {
		return wifak_facilities_management_maintanance;
	}
	
	@FindBy(xpath = "//a[@id='infoBarSearchButton_WIFT008MT']")
	private WebElement wifak_facilities_management_main_search_btn;
	public WebElement wifakFacilitiesManagementMainSearchBtn_608() {
		return wifak_facilities_management_main_search_btn;
	}
	
	@FindBy(xpath = "//input[@id='facilityManagementGridTbl_Id_WIFT008MT_gs_fmsFacilityVO.FROM_APPLICATION']")
	private WebElement wifak_facilities_management_main_search_app_ref_input;
	public WebElement wifakFacilitiesManagementMainSearchApplicationRefInput_608() {
		return wifak_facilities_management_main_search_app_ref_input;
	}
	
	@FindBy(xpath = "//td[@id='td_facilityManagementGridTbl_Id_WIFT008MT_1_fmsFacilityVO.CODE']")
	private WebElement wifak_facilities_management_main_search_result_row;
	public WebElement wifakFacilitiesManagementMainSearchResultRow_608() {
		return wifak_facilities_management_main_search_result_row;
	}
	
	@FindBy(xpath = "//li[@id='facilityLimitDetailsTab_WIFT008MT']")
	private WebElement wifak_facilities_management_main_facility_limit_details_tab;
	public WebElement wifakFacilitiesManagementMainFacilityLimitDetailsTab_608() {
		return wifak_facilities_management_main_facility_limit_details_tab;
	}
	
	@FindBy(xpath = "//td[@id='td_FacilityManagementFacilityLimitDetailsGrid_WIFT008MT_1_fmsFacilityDetVO.GENERAL_FACILITY_TYPE']")
	private WebElement wifak_facilities_management_main_facility_limit_details_product_class_row;
	public WebElement wifakFacilitiesManagementMainFacilityLimitDetailsProductClassRow_608() {
		return wifak_facilities_management_main_facility_limit_details_product_class_row;
	}
	
	@FindBy(xpath = "//button[@id='facilityManagement_repayplan_btn_WIFT008MT']")
	private WebElement wifak_facilities_management_main_facility_limit_details_repaymentplan_btn;
	public WebElement wifakFacilitiesManagementMainFacilityLimitDetailsRepaymentplanBtn_608() {
		return wifak_facilities_management_main_facility_limit_details_repaymentplan_btn;
	}
	
	@FindBy(xpath = "//li[@id='rePaymentPlanMainTab2_WIFT008MT']")
	private WebElement wifak_facilities_management_main_facility_limit_repaymentplan_schedule_details_tab;
	public WebElement wifakFacilitiesManagementMainFacilityLimitRepaymentplanScheduleDetailsTab_608() {
		return wifak_facilities_management_main_facility_limit_repaymentplan_schedule_details_tab;
	}
	
	@FindBy(xpath = "//div[@id='jqgh_repaumentPlanScheduleGridTbl_Id_WIFT008MT_VAT_AND_INSTALLMENT_AMOUNT']")
	private WebElement wifak_facilities_management_main_facility_limit_repaymentplan_schedule_details_installment_vat_amt;
	public WebElement wifakFacilitiesManagementMainFacilityLimitRepaymentplanScheduleDetailsInstallVatAmt_608() {
		return wifak_facilities_management_main_facility_limit_repaymentplan_schedule_details_installment_vat_amt;
	}
	
	
	
	
	
}
