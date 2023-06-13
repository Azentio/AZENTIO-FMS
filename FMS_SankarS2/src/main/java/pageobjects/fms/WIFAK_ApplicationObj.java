package pageobjects.fms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WIFAK_ApplicationObj {
	
	WebDriver driver;
	public WIFAK_ApplicationObj(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
//	@AT_AFF_040
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
	
//	@AT_AFF_036	
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
	
	@FindBy(xpath = "//input[@id='lookuptxt_applicationFacilityFacilityType_WIFT001MT']")
	private WebElement main_facility_type;
	public WebElement mainFacilityType() {
		return main_facility_type;
	}
	
	@FindBy(xpath = "//input[@id='applicationFacilityFacilityTypeName_WIFT001MT']")
	private WebElement main_facility_type_label;
	public WebElement mainFacilityTypeLabel() {
		return main_facility_type_label;
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
	
	@FindBy(xpath = "//input[@id='applicationFacilitytotalvalue_WIFT001MT']")
	private WebElement main_additional_tab_total_value;
	public WebElement mainAdditionalTabTotalValue() {
		return main_additional_tab_total_value;
	}
	
	@FindBy(xpath = "//input[@id='applicationFacilityofferexpirydate_WIFT001MT']")
	private WebElement additional_tab_expire_date;
	public WebElement additionalTabExpireDate() {
		return additional_tab_expire_date;
	}
	
//	@FindBy(xpath = "//*[@id=\"applicationFacilityDateDetailssection_WIFT001MT\"]/table/tbody/tr[3]/td[2]/div/img")
//	private WebElement additional_tab_expire_calender;
//	public WebElement additionalTabExpireCalender() {
//		return additional_tab_expire_calender;
//	}
//	
//	@FindBy(xpath = "//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[5]/td[4]")
//	private WebElement additional_tab_expire_date;
//	public WebElement additionalTabExpireDate() {
//		return additional_tab_expire_date;
//	}
	
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
	
	@FindBy(xpath="//input[@id='lookuptxt_applicationfacilityLimitDetailsCLASS_WIFT001MT']")
	private WebElement limit_details_new_record_product_class;
	public WebElement limitDetailsNewRecordProductClass() {
		return limit_details_new_record_product_class;
	}
	
	@FindBy(xpath = "//input[@id='applicationfacilityLimitDetailsCLEAN_FLAG_WIFT001MT']")
	private WebElement limit_details_new_record_clean_flag;
	public WebElement limitDetailsNewRecordCleanFlag() {
		return limit_details_new_record_clean_flag;
	}
	
	@FindBy(xpath="//input[@id='lookuptxt_applicationfacilityLimitDetailsFLOATING_RATE_WIFT001MT']")
	private WebElement limit_details_floating_rate;
	public WebElement limitDetailsFloatingRate() {
		return limit_details_floating_rate;
	}
	
	@FindBy(xpath="//input[@id='applicationFacilitylimityielddetrate_WIFT001MT']")
	private WebElement limit_details_yield_details;
	public WebElement limitDetailsYieldDetails() {
		return limit_details_yield_details;
	}
	
	
//	@AT_AFF_048
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
	
	@FindBy(id="_popup_path_sol_ok")
	private WebElement ServerRequestNotComplete_OKButton;
	public WebElement ServerRequestNotComplete_OKButton() {
		return ServerRequestNotComplete_OKButton;
	 }
	
	@FindBy(xpath = "//*[@id=\"limitDetails_add_btn_WIFT001MT\"]")
	private WebElement clicks_add_btn;
	public WebElement clickAddBtn() {
		return clicks_add_btn;
	}
	
	@FindBy(xpath = "//button[@id='applicationfacility_collateralDetails_btn_WIFT001MT']")
	private WebElement limit_details_collateral_details_btn;
	public WebElement limitDetailsCollateralDetailsBtn() {
		return limit_details_collateral_details_btn;
	}	
	
	@FindBy(xpath = "//button[@id='applicationfacility_chargesdtls_btn_WIFT001MT']")
	private WebElement limit_details_charges_details_btn;
	public WebElement limitDetailsChargesDetailsBtn() {
		return limit_details_charges_details_btn;
	}
	
	@FindBy(xpath = "//*[@id='td_FacilityChargesGrid_WIFT001MT_1_fmsapplchargesVO.CHARGES_CODE']")
	private WebElement charges_details_code_label;
	public WebElement chargesDetailsCodeLabel() {
		return charges_details_code_label;
	}
	
	@FindBy(xpath = "//input[@name='lookupTxt_fmsapplchargesVO.CHARGES_CODE']")
	private WebElement charges_details_code;
	public WebElement chargesDetailsCode() {
		return charges_details_code;
	}
	
	@FindBy(xpath = "//input[@id='1_fmsapplchargesVO.COLLECT_AT_FAC_APPROVAL_FacilityChargesGrid_WIFT001MT']")
	private WebElement charges_details_check_fac_approval;
	public WebElement chargesDetailsCheckFacApproval() {
		return charges_details_check_fac_approval;
	}
	
	@FindBy(xpath = "//span[text()='Ok']")
	private WebElement charges_details_Ok_btn;
	public WebElement chargesDetailsOkBtn() {
		return charges_details_Ok_btn;
	}
	
	@FindBy(xpath = "//li[@id='applicationFacilityDocumentDetailsTabs_WIFT001MT']")
	private WebElement main_document_details_tab;
	public WebElement mainDocumentDetailsTab() {
		return main_document_details_tab;
	}
	
	@FindBy(xpath = "//input[@id='lookuptxt_applicationFacilitysolicitor_WIFT001MT']")
	private WebElement document_details_solicitor_name;
	public WebElement documentDetailsSolicitorName() {
		return document_details_solicitor_name;
	}
	
	@FindBy(xpath = "//input[@id='lookuptxt_applicationFacilityEstimator_WIFT001MT']")
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
	private WebElement warning_popup_ok_btn;
	public WebElement WarningPopupOkBtn() {
		return warning_popup_ok_btn;
	}
	
	@FindBy(xpath = "//input[@id='_popup_path_sol_ok']")
	private WebElement success_popup_ok_btn;
	public WebElement SuccessPopupOkBtn() {
		return success_popup_ok_btn;
	}
	
	@FindBy(xpath = "//button[@id='applicationfacility_save_btn_WIFT001MT']")
	private WebElement limit_details_validate_btn;
	public WebElement limitDetailsValidateBtn() {
		return limit_details_validate_btn;
	}
	
	@FindBy(xpath = "//div[text()='CONFIRM']")
	private WebElement confirm_popup;
	public WebElement confirmPopup() {
		return confirm_popup;
	}
	
	@FindBy(xpath = "//div[@class='jMsgbox-contentWrap']")
	private WebElement facility_already_created_popup_Msg;
	public WebElement facilityAlreadyCreatedPopupMsg() {
		return facility_already_created_popup_Msg;
	}
	
	@FindBy(xpath = "//input[@id='_popup_path_sol_confirm_ok']")
	private WebElement facility_already_created_popup;
	public WebElement facilityAlreadyCreatedPopup() {
		return facility_already_created_popup;
	}
	
	@FindBy(xpath = "//div[text()='Success']")
	private WebElement success_popup;
	public WebElement successPopup() {
		return success_popup;
	}
	
	@FindBy(xpath = "//div[@class='jMsgbox-contentWrap']")
	private WebElement success_popup_msg;
	public WebElement successPopupMessage() {
		return success_popup_msg;
	}
	
	@FindBy(xpath = "(//a[@class='ui-dialog-titlebar-close ui-corner-all'])[9]")
	private WebElement send_alert_popup;
	public WebElement sendAlertPopup() {
		return send_alert_popup;
	}
	
	@FindBy(xpath = "/html/body/div[70]/div[1]/a")
	private WebElement level3_send_alert_popup;
	public WebElement level3SendAlertPopup() {
		return level3_send_alert_popup;
	}
	
	@FindBy(xpath = "//a[@id='dismissbut_WIFT001MT']")
	private WebElement send_alert_popup_dismiss_btn;
	public WebElement sendAlertPopupDismissBtn() {
		return send_alert_popup_dismiss_btn;
	}
	
	@FindBy(xpath = "//a[@id='WIFT001AP1']")
	private WebElement application_financial_facility_approve1;
	public WebElement applicationFinancialFacilityApproveLevel1() {
		return application_financial_facility_approve1;
	}
	
	@FindBy(xpath = "//input[@id='applicationFacilityGridTbl_Id_WIFT001AP1_gs_fmsApplVO.CODE']")
	private WebElement approve_level1_code_input;
	public WebElement approveLevel1CodeInput() {
		return approve_level1_code_input;
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
	private WebElement approve_level1_select_devision;
	public WebElement approveLevel1SelectDevision() {
		return approve_level1_select_devision;
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
	
	@FindBy(xpath = "//input[@id='applicationFacilityGridTbl_Id_WIFT001AP2_gs_fmsApplVO.CODE']")
	private WebElement approve_level2_code_input;
	public WebElement approveLevel2CodeInput() {
		return approve_level2_code_input;
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
	public WebElement approveLevel2SelectDevision() {
		return approve_level2_select_devision;
	}
	
	@FindBy(xpath = "//button[@id='applicationfacility_approvelevel2_btn_WIFT001AP2']")
	private WebElement approve_level2_submit_btn;
	public WebElement approveLevel2SubmitBtn() {
		return approve_level2_submit_btn;
	}	
	
	@FindBy(xpath = "//a[@id='WIFT001AP3']")
	private WebElement application_financial_facility_approve3;
	public WebElement applicationFinancialFacilityApproveLevel3() {
		return application_financial_facility_approve3;
	}
	
	@FindBy(xpath = "//input[@id='applicationFacilityGridTbl_Id_WIFT001AP3_gs_fmsApplVO.CODE']")
	private WebElement approve_level3_code_input;
	public WebElement approveLevel3CodeInput() {
		return approve_level3_code_input;
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
	public WebElement approveLevel3SelectDevision() {
		return approve_level3_select_devision;
	}
	
	@FindBy(xpath = "//button[@id='applicationfacility_approvelevel3_btn_WIFT001AP3']")
	private WebElement approve_level3_submit_btn;
	public WebElement approveLevel3SubmitBtn() {
		return approve_level3_submit_btn;
	}	
	
	
//	@AT_AFF_052	
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
	
	@FindBy(xpath = "//li[@id='applicationFacilityAdditionDetailsTabs_WIFT001AP1']")
	private WebElement approve_level1_additional_details_tab;
	public WebElement approveLevel1AdditionalDetailsTab() {
		return approve_level1_additional_details_tab;
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
	
	
	
//	@640861
	@FindBy(xpath = "//input[@id='applicationFacilitydownpaymentperc_WIFT001MT']")
	private WebElement additional_tab_down_pay_percent;
	public WebElement additionalTabDownPayPercent() {
		return additional_tab_down_pay_percent;
	}
	
	@FindBy(xpath = "//input[@id='applicationFacilityDownPaymentToVendorPerc_WIFT001MT']")
	private WebElement additional_tab_down_pay_to_vendor;
	public WebElement additionalTabDownPayToVendor() {
		return additional_tab_down_pay_to_vendor;
	}
	
	@FindBy(xpath = "//input[@id='lookuptxt_applicationfacilityLimitDetailsACC_Add_Det_WIFT001MT']")
	private WebElement limit_details_acc_no_input;
	public WebElement limitDetailsAccNoInput() {
		return limit_details_acc_no_input;
	}
	
	@FindBy(xpath = "//input[@id='lookuptxt_applicationfacilityLimitDetailsFUND_TRANSFER_RATE_WIFT001MT']")
	private WebElement limit_details_fund_transfer_rate_input;
	public WebElement limitDetailsFundTransferRateInput() {
		return limit_details_fund_transfer_rate_input;
	}
	
	
//	@583893_User1
	@FindBy(xpath = "//a[@id='WIFT002MT']")
	private WebElement wifak_application_child_approval_committee_recommend;
	public WebElement approvalCommitteeRecommendations() {
		return wifak_application_child_approval_committee_recommend;
	}
	
	@FindBy(xpath = "//*[@id='applicationFacilityGridTbl_Id_WIFT002MT_pager_left']/table/tbody/tr/td[7]")
	private WebElement approval_committee_clear_btn;
	public WebElement approvalCommitteeClearBtn() {
		return approval_committee_clear_btn;
	}
	
	@FindBy(xpath = "//tr[@id='2']")
	private WebElement approval_committee_select_row;
	public WebElement approvalCommitteeSelectRow() {
		return approval_committee_select_row;
	}
	
	@FindBy(xpath = "//input[@id='code_WIFT002MT']")
	private WebElement approval_committee_code;
	public WebElement approvalCommitteeCode() {
		return approval_committee_code;
	}
	
	
	@FindBy(xpath = "//button[@id='applicationfacility_recommend_btn_WIFT002MT']")
	private WebElement approval_committee_recommend_btn;
	public WebElement approvalCommitteeRecommendBtn() {
		return approval_committee_recommend_btn;
	}
	
	@FindBy(xpath = "//td[text()='VAK']")
	private WebElement approval_committee_recommend_by_label;
	public WebElement approvalCommitteeRecommendByLabel() {
		return approval_committee_recommend_by_label;
	}
	
	@FindBy(xpath = "//select[@gridid='ApplicationFacilityRecommendationGrid_WIFT002MT']")
	private WebElement approval_committee_recommendation_dropdown;
	public WebElement approvalCommitteeRecommendationDropdown() {
		return approval_committee_recommendation_dropdown;
	}
	
	@FindBy(xpath = "//*[@id='23_fmsApplRecommendVO.RECOMMENDATION_ApplicationFacilityRecommendationGrid_WIFT002MT']/option[1]")
	private WebElement approval_committee_recommendation_dropdown_option;
	public WebElement approvalCommitteeRecommendationDropdownOption() {
		return approval_committee_recommendation_dropdown_option;
	}
	
	@FindBy(xpath = "//*[@id='23_fmsApplRecommendVO.COMMENT_CODE_spanLookup_ApplicationFacilityRecommendationGrid_WIFT002MT']/span")
	private WebElement approval_committee_comment_code_lookup;
	public WebElement approvalCommitteeCommentCodeLookup() {
		return approval_committee_comment_code_lookup;
	}
	
	@FindBy(xpath = "//*[@id='td_gridtab_23_fmsApplRecommendVO_COMMENT_CODE_ApplicationFacilityRecommendationGrid_WIFT002MT_1_CODE']")
	private WebElement approval_committee_comment_code_lookup_first_row;
	public WebElement approvalCommitteeCommentCodeLookupFirstRow() {
		return approval_committee_comment_code_lookup_first_row;
	}
	
	@FindBy(xpath = "//button[@id='more_comments_btn_WIFT002MT']")
	private WebElement approval_committee_more_comments_btn;
	public WebElement approvalCommitteeMoreCommentsBtn() {
		return approval_committee_more_comments_btn;
	}
	
	@FindBy(xpath = "//textarea[@id='more_comments_WIFT002MT']")
	private WebElement approval_committee_more_comments_input;
	public WebElement approvalCommitteeMoreCommentsInput() {
		return approval_committee_more_comments_input;
	}
	
	@FindBy(xpath = "(//span[text()='OK'])[2]")
	private WebElement approval_committee_more_comments_Ok_btn;
	public WebElement approvalCommitteeMoreCommentsOkBtn() {
		return approval_committee_more_comments_Ok_btn;
	}
	
	@FindBy(xpath = "(//span[text()='OK'])[1]")
	private WebElement approval_committee_Ok_btn;
	public WebElement approvalCommitteeOkBtn() {
		return approval_committee_Ok_btn;
	}
	
	
//	@583893_User2	
	@FindBy(xpath = "//a[@id='infoBarSearchButton_WIFT001MT']")
	private WebElement application_financial_facility_search_btn;
	public WebElement applicationFinancialFacilitySearchBtn() {
		return application_financial_facility_search_btn;
	}
	
	@FindBy(xpath = "//button[@id='applicationfacility_approvalcommittiee_btn_WIFT001MT']")
	private WebElement application_financial_facility_approval_committiee_btn;
	public WebElement applicationFinancialFacilityApprovalCommittieeBtn() {
		return application_financial_facility_approval_committiee_btn;
	}
	
	@FindBy(xpath = "//td[@id='td_ApplicationFacilityRecommendationGrid_WIFT001MT_23_fmsApplRecommendVO.RECOMMENDED_BY']")
	private WebElement application_financial_facility_approval_committiee_recommend_by_label;
	public WebElement applicationFinancialFacilityApprovalCommittieeRecommendByLabel() {
		return application_financial_facility_approval_committiee_recommend_by_label;
	}
	
	@FindBy(xpath = "//button[@id='more_comments_btn_WIFT001MT']")
	private WebElement application_financial_facility_approval_committiee_more_comments_btn;
	public WebElement applicationFinancialFacilityApprovalCommittieeMoreCommentsBtn() {
		return application_financial_facility_approval_committiee_more_comments_btn;
	}
	
	@FindBy(xpath = "//textarea[@id='more_comments_WIFT001MT']")
	private WebElement application_financial_facility_approval_committiee_more_comments_text;
	public WebElement applicationFinancialFacilityApprovalCommittieeMoreCommentsText() {
		return application_financial_facility_approval_committiee_more_comments_text;
	}
	
	
//	@AT_RF_100
	@FindBy(xpath = "//input[@id='lookuptxt_applicationFacilityExistingFacilityRef_WIFT001MT']")
	private WebElement main_existing_facility_ref;
	public WebElement mainExistingFacilityRef() {
		return main_existing_facility_ref;
	}
	
	@FindBy(xpath = "//input[@id='applicationFacilityfinancedamount_WIFT001MT']")
	private WebElement additional_tab_finance_amount;
	public WebElement additionalTabFinanceAmount() {
		return additional_tab_finance_amount;
	}
	
	@FindBy(xpath = "//td[@id='td_ApplicationFacilityLimitDetailsGrid_WIFT001MT_1_fmsAppLimitDetVO.FACILITY_VALUE']")
	private WebElement limit_details_product_facility_value;
	public WebElement limitDetailsProductFacilityValue() {
		return limit_details_product_facility_value;
	}
	
	@FindBy(xpath = "//td[@id='td_ApplicationFacilityLimitDetailsGrid_WIFT001MT_1_fmsAppLimitDetVO.CV_VALUE']")
	private WebElement limit_details_product_CV_value;
	public WebElement limitDetailsProductCVValue() {
		return limit_details_product_CV_value;
	}
	
	@FindBy(xpath = "//button[@id='limitDetails_edit_btn_WIFT001MT']")
	private WebElement limit_details_product_edit_btn;
	public WebElement limitDetailsProductEditBtn() {
		return limit_details_product_edit_btn;
	}
	
	
	
//  @AT_RF_102
    @FindBy(xpath = "//select[@id='applicationfacilityLimitDetailsGENERAL_FACILITY_TYPE_WIFT001MT']")
    private WebElement limit_details_item;
    public WebElement limitDetailsItem() {
    	return limit_details_item;
    }
    
    @FindBy(xpath = "//input[@id='applicationfacilityLimitDetailsMATURITY_DATE_WIFT001MT']/following-sibling::img")
    private WebElement limit_details_maturity_date_calender;
    public WebElement limitDetailsMaturityDateCalender() {
    	return limit_details_maturity_date_calender;
    }
    
    @FindBy(xpath = "//*[@id='ui-datepicker-div']/table/tbody/tr[5]/td[6]")
    private WebElement limit_details_maturity_date;
    public WebElement limitDetailsMaturityDate() {
    	return limit_details_maturity_date;
    }
    
    @FindBy(xpath = "//input[@id='applicationfacilityLimitDetailsMARGIN_RATE_WIFT001MT']")
    private WebElement limit_details_margin_rate_input;
    public WebElement limitDetailsMarginRateInput() {
    	return limit_details_margin_rate_input;
    }
	
    
//  @AT_RF_157
    @FindBy(xpath = "//td[text()='Draw Down Request']")
    private WebElement wifak_application_draw_down_request;
    public WebElement wifakApplicationDrawDownRequest() {
    	return wifak_application_draw_down_request;
    }
    
    @FindBy(xpath = "//a[@id='WIFT009MT']")
    private WebElement draw_down_request_maintanance;
    public WebElement drawDownRequestMaintanance() {
    	return draw_down_request_maintanance;
    }
    
    @FindBy(xpath = "//input[@id='lookuptxt_drawDownRequestFacilityReference_WIFT009MT']")
    private WebElement drawdown_main_facility_ref;
    public WebElement drawdownMainFacilityRef() {
    	return drawdown_main_facility_ref;
    }
    
    @FindBy(xpath = "//span[contains(text(),'Yes')]//parent::button")
    private WebElement drawdown_post_approval_yes_btn;
    public WebElement drawdownPostApprovalYesBtn() {
    	return drawdown_post_approval_yes_btn;
    }
    
    @FindBy(xpath = "//span[@id='spanLookup_drawDownRequestDrawDownType_WIFT009MT']")
    private WebElement drawdown_main_drawdown_type_lookup;
    public WebElement drawdownMainDrawDownTypeLookup() {
    	return drawdown_main_drawdown_type_lookup;
    }
    
    @FindBy(xpath = "//td[text()='Sukuk/Equity'][1]")
    private WebElement drawdown_main_drawdown_type_value;
    public WebElement drawdownMainDrawdownTypeValue() {
    	return drawdown_main_drawdown_type_value;
    }
    
    @FindBy(xpath = "//input[@id='drawDownRequestLongNameEnglish_WIFT009MT']")
    private WebElement drawdown_main_description;
    public WebElement drawdownMainDescription() {
    	return drawdown_main_description;
    }
    
    @FindBy(xpath = "//input[@id='drawDownRequestDateSubmitted_WIFT009MT']")
    private WebElement drawdown_main_date_submitted;
    public WebElement drawdownMainDateSubmitted() {
    	return drawdown_main_date_submitted;
    }
    
    @FindBy(xpath = "//li[@id='drawDownRequestMainInfoTabs_WIFT009MT']")
    private WebElement drawdown_main_info_tab;
    public WebElement drawdownMainInfoTab() {
    	return drawdown_main_info_tab;
    }
    
    @FindBy(xpath = "//input[@id='drawDownRequestValueDate_WIFT009MT']")
    private WebElement drawdown_main_value_date;
    public WebElement drawdownMainValueDate() {
    	return drawdown_main_value_date;
    }
    
    @FindBy(xpath = "//li[@id='drawDownRequestAdditionDetailsTabs_WIFT009MT']")
    private WebElement drawdown_additional_details_tab;
    public WebElement drawdownAdditionalDetailsTab() {
    	return drawdown_additional_details_tab;
    }
    
    @FindBy(xpath = "//input[@id='lookuptxt_drawDownRequestProduct_Class_WIFT009MT']")
    private WebElement drawdown_additional_product_class;
    public WebElement drawdownAdditionalProductClass() {
    	return drawdown_additional_product_class;
    }
    
    @FindBy(xpath = "//span[@id='spanLookup_drawDownRequestProduct_Class_WIFT009MT']")
    private WebElement drawdown_additional_product_class_lookup;
    public WebElement drawdownAdditionalProductClassLookup() {
    	return drawdown_additional_product_class_lookup;
    }
    
    @FindBy(xpath = "//td[@id='td_gridtab_drawDownRequestProduct_Class_WIFT009MT_1_viewDrawDownClassVO.CODE']")
    private WebElement drawdown_additional_product_class_code;
    public WebElement drawdownAdditionalProductClassCode() {
    	return drawdown_additional_product_class_code;
    }
    
    @FindBy(xpath = "//input[@id='drawDownRequestFC_Amount_WIFT009MT']")
    private WebElement drawdown_additional_FC_amount;
    public WebElement drawdownAdditionalFCAmount() {
    	return drawdown_additional_FC_amount;
    }
    
    @FindBy(xpath = "//button[@id='drawdownrequest_save_btn_WIFT009MT']")
    private WebElement drawdown_main_save_btn;
    public WebElement drawdownMainSaveBtn() {
    	return drawdown_main_save_btn;
    }
    
    @FindBy(xpath = "//a[@id='WIFT009VD']")
    private WebElement draw_down_request_verify;
    public WebElement drawDownRequestVerify() {
    	return draw_down_request_verify;
    }
    
    @FindBy(xpath = "//td[@id='drawDownRequestGridTbl_Id_WIFT009VD_pager_left']/table/tbody/tr/td[7]")
    private WebElement drawdown_verify_clear_btn;
    public WebElement drawdownVerifyClearBtn() {
    	return drawdown_verify_clear_btn;
    }
    
    @FindBy(xpath = "//td[@id='td_drawDownRequestGridTbl_Id_WIFT009VD_1_fmsDrawDownVO.CODE']")
    private WebElement drawdown_verify_code;
    public WebElement drawdownVerifyCode() {
    	return drawdown_verify_code;
    }
    
    @FindBy(xpath = "//span[contains(text(),'Verify')]//parent::button")
    private WebElement draw_down_request_verify_btn;
    public WebElement drawDownRequestVerifyBtn() {
    	return draw_down_request_verify_btn;
    }
    
    @FindBy(xpath = "/html/body/div[24]/div[1]/a")
	private WebElement drawdown_verify_send_alert_popup;
	public WebElement drawdownVerifySendAlertPopup() {
		return drawdown_verify_send_alert_popup;
	}
    
    @FindBy(xpath = "//a[@id='WIFT009AP']")
    private WebElement draw_down_request_Approve;
    public WebElement drawDownRequestApprove() {
    	return draw_down_request_Approve;
    }
    
    @FindBy(xpath = "//td[@id='drawDownRequestGridTbl_Id_WIFT009AP_pager_left']/table/tbody/tr/td[7]")
    private WebElement drawdown_approve_clear_btn;
    public WebElement drawdownApproveClearBtn() {
    	return drawdown_approve_clear_btn;
    }
    
    @FindBy(xpath = "//td[@id='td_drawDownRequestGridTbl_Id_WIFT009AP_1_fmsDrawDownVO.CODE']")
    private WebElement drawdown_approve_code;
    public WebElement drawdownApproveCode() {
    	return drawdown_approve_code;
    }
    
    @FindBy(xpath = "//span[contains(text(),'Approve')]//parent::button")
    private WebElement draw_down_request_approve_btn;
    public WebElement drawDownRequestApproveBtn() {
    	return draw_down_request_approve_btn;
    }
    
    @FindBy(xpath = "//a[@id='infoBarSearchButton_WIFT009MT']")
    private WebElement drawdown_main_search_btn;
    public WebElement drawdownMainSearchBtn() {
    	return drawdown_main_search_btn;
    }
    
    @FindBy(xpath = "//td[@id='drawDownRequestGridTbl_Id_WIFT009MT_pager_left']/table/tbody/tr/td[7]")
    private WebElement drawdown_main_clear_btn;
    public WebElement drawdownMainClearBtn() {
    	return drawdown_main_clear_btn;
    }
    
    @FindBy(xpath = "//td[@id='td_drawDownRequestGridTbl_Id_WIFT009MT_1_fmsDrawDownVO.CODE']")
    private WebElement drawdown_main_code;
    public WebElement drawdownMainCode() {
    	return drawdown_main_code;
    }
  
    @FindBy(xpath = "//span[contains(text(),'Status Details')]//parent::a")
    private WebElement drawdown_main_status_details_btn;
    public WebElement drawdownMainStatusDetailsBtn() {
    	return drawdown_main_status_details_btn;
    }
    
    @FindBy(xpath = "//div[@id='fms_status_div_WIFT009MT']")
    private WebElement drawdown_main_status_details_tab;
    public WebElement drawdownMainStatusDetailsTab() {
    	return drawdown_main_status_details_tab;
    }
    
    @FindBy(xpath = "//td[@id='td_fmsStatusGridTbl_Id_1_userName']")
    private WebElement drawdown_main_status_details_user_name;
    public WebElement drawdownMainStatusDetailsUserName() {
    	return drawdown_main_status_details_user_name;
    }
    
    //Facility Closure Request
    @FindBy(xpath = "//td[text()='Facility Closure Request']")
    private WebElement wifak_application_facility_closure_request;
    public WebElement wifakApplicationFacilityClosureRequest() {
    	return wifak_application_facility_closure_request;
    }
    
    @FindBy(xpath = "//a[@id='WIFT010MT']")
    private WebElement facility_closure_request_maintanance;
    public WebElement facilityClosureRequestMaintanance() {
    	return facility_closure_request_maintanance;
    }
    
    @FindBy(xpath = "//input[@id='lookuptxt_facilityClosureRequestFacilityReference_WIFT010MT']")
    private WebElement facility_closure_main_facility_ref;
    public WebElement facilityClosureMainFacilityRef() {
    	return facility_closure_main_facility_ref;
    }
    
    @FindBy(xpath = "//input[@id='facilityClosureRequest_Closure_Reason_WIFT010MT']")
    private WebElement facility_closure_main_closure_reason;
    public WebElement facilityClosureMainClosureReason() {
    	return facility_closure_main_closure_reason;
    }
    
    @FindBy(xpath = "//button[@id='facilityClosureRequestSave_WIFT010MT']")
    private WebElement facility_closure_main_save_btn;
    public WebElement facilityClosureMainSaveBtn() {
    	return facility_closure_main_save_btn;
    }
    
    @FindBy(xpath = "/html/body/div[16]/div[1]/a")
    private WebElement facility_closure_main_send_alert_popup;
    public WebElement facilityClosureMainSendAlertPopup() {
    	return facility_closure_main_send_alert_popup;
    }
    
    @FindBy(xpath = "//a[@id='WIFT010AP']")
    private WebElement facility_closure_request_approve;
    public WebElement facilityClosureRequestApprove() {
    	return facility_closure_request_approve;
    }
    
    @FindBy(xpath = "//td[@id='facilityClosureRequestGridTbl_Id_WIFT010AP_pager_left']/table/tbody/tr/td[7]")
    private WebElement facility_closure_approve_clear_btn;
    public WebElement facilityClosureApproveClearBtn() {
    	return facility_closure_approve_clear_btn;
    }
    
    @FindBy(xpath = "//td[@id='td_facilityClosureRequestGridTbl_Id_WIFT010AP_1_fmsFacilityClosureVO.CODE']")
    private WebElement facility_closure_approve_code;
    public WebElement facilityClosureApproveCode() {
    	return facility_closure_approve_code;
    }
    
    @FindBy(xpath = "//button[@id='facilityClosureRequest_approve_btn_WIFT010AP']")
    private WebElement facility_closure_approve_btn;
    public WebElement facilityClosureApproveBtn() {
    	return facility_closure_approve_btn;
    }
    
    @FindBy(xpath = "//a[@id='infoBarSearchButton_WIFT010MT']")
    private WebElement facility_closure_main_search_btn;
    public WebElement facilityClosureMainSearchBtn() {
    	return facility_closure_main_search_btn;
    }
    
    @FindBy(xpath = "//td[@id='td_facilityClosureRequestGridTbl_Id_WIFT010MT_1_fmsFacilityClosureVO.CODE']")
    private WebElement facility_closure_main_code;
    public WebElement facilityClosureMainCode() {
    	return facility_closure_main_code;
    }
    
    @FindBy(xpath = "(//span[contains(text(),'Status')]//parent::a)[2]")
    private WebElement facility_closure_main_status_details_btn;
    public WebElement facilityClosureMainStatusDetailsBtn() {
    	return facility_closure_main_status_details_btn;
    }
    
    @FindBy(xpath = "//div[@id='gview_fmsStatusGridTbl_Id']")
    private WebElement facility_closure_main_status_details_tab;
    public WebElement facilityClosureMainStatusDetailsTab() {
    	return facility_closure_main_status_details_tab;
    }
    
    
//    @AT_RF_139
    @FindBy(xpath = "//td[@tdlabel='Critical']//input")
    private WebElement limit_details_document_checklist_critical_check;
    public WebElement limitDetailsDocumentChecklistCriticalCheck() {
    	return limit_details_document_checklist_critical_check;
    }
    
    @FindBy(xpath = "//li[@id='applicationFacilityLimitDetailsTabs_WIFT001AP1']")
    private WebElement approve_level1_limit_details_tab;
    public WebElement approveLevel1LimitDetailsTab() {
    	return approve_level1_limit_details_tab;
    }
    
    @FindBy(xpath = "//td[@id='td_ApplicationFacilityLimitDetailsGrid_WIFT001AP1_1_fmsAppLimitDetVO.GENERAL_FACILITY_TYPE']")
    private WebElement approve_level1_limit_details_product_row;
    public WebElement approveLevel1LimitDetailsProductRow() {
    	return approve_level1_limit_details_product_row;
    }
    
    @FindBy(xpath = "//button[@id='applicationfacility_documentchecklist_btn_WIFT001AP1']")
    private WebElement approve_level1_limit_details_doc_checklist_btn;
    public WebElement approveLevel1LimitDetailsDocChecklistBtn() {
    	return approve_level1_limit_details_doc_checklist_btn;
    }
    
    @FindBy(xpath = "//td[@id='td_FacilityDocumentCheckListGrid_WIFT001AP1_1_DOC_CODE']")
    private WebElement approve_level1_limit_details_doc_checklist_row;
    public WebElement approveLevel1LimitDetailsDocChecklistRow() {
    	return approve_level1_limit_details_doc_checklist_row;
    }
    
    @FindBy(xpath = "//span[text()='Ok']")
    private WebElement limit_details_document_checklist_Ok_btn;
    public WebElement limitDetailsDocumentChecklistOkBtn () {
    	return limit_details_document_checklist_Ok_btn;
    }       
    
    
// //  @AT_RF_140
    @FindBy(xpath = "//td[@id='td_FacilityDocumentCheckListGrid_WIFT001MT_2_DOC_CODE']")
    private WebElement limit_details_document_checklist_row2;
    public WebElement limitDetailsDocumentChecklistRow2 () {
    	return limit_details_document_checklist_row2;
    }
    
    @FindBy(xpath = "//input[@id='documentFile_WIFT001MT']")
    private WebElement limit_details_document_checklist_choose_file_input;
    public WebElement limitDetailsDocumentChecklistChooseFileInput () {
    	return limit_details_document_checklist_choose_file_input;
    }
    
    @FindBy(xpath = "//td[@id='td_FacilityDocumentCheckListGrid_WIFT001MT_2_DOC_ATTACHED_YN']/input")
    private WebElement limit_details_document_checklist_attach_flag;
    public WebElement limitDetailsDocumentChecklistAttachFlag () {
    	return limit_details_document_checklist_attach_flag;
    }
    
    @FindBy(xpath = "//a[@id='document_UploadBtn_WIFT001MT']")
    private WebElement limit_details_document_checklist_upload_docs_btn;
    public WebElement limitDetailsDocumentChecklistUploadDocsBtn () {
    	return limit_details_document_checklist_upload_docs_btn;
    }    
    //Approve Level1
    @FindBy(xpath = "//td[@id='td_FacilityDocumentCheckListGrid_WIFT001AP1_2_DOC_CODE']")
    private WebElement approve1_limit_details_document_checklist_row2;
    public WebElement approve1LimitDetailsDocumentChecklistRow2 () {
    	return approve1_limit_details_document_checklist_row2;
    }
    
    @FindBy(xpath = "//a[@id='document_ViewBtn_WIFT001AP1']")
    private WebElement approve1_limit_details_document_checklist_view_btn;
    public WebElement approve1LimitDetailsDocumentChecklistViewBtn () {
    	return approve1_limit_details_document_checklist_view_btn;
    }
    
    @FindBy(xpath = "//td[@id='td_FacilityDocumentCheckListViewGrid_WIFT001AP1_0_rn']")
    private WebElement approve1_limit_details_document_checklist_view_row1;
    public WebElement approve1LimitDetailsDocumentChecklistViewRow1 () {
    	return approve1_limit_details_document_checklist_view_row1;
    }
    
    @FindBy(xpath = "/html/body/div[49]/div[1]/a")
    private WebElement approve1_limit_details_document_checklist_view_close;
    public WebElement approve1LimitDetailsDocumentChecklistViewClose () {
    	return approve1_limit_details_document_checklist_view_close;
    }
    
}
