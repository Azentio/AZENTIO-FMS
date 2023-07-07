package pageobjects.fmsParam;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RequestForFinancingObj_608 {
	
	WebDriver driver;
	public RequestForFinancingObj_608(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
//	AT_RF_014_IISParam
	@FindBy(xpath = "//td[text()='Parameters']")
	private WebElement IIS_parameter_feature;
	public WebElement IISParameterFeature_608() {
		return IIS_parameter_feature;
	}
	
	@FindBy(xpath = "//td[text()='Product Class']")
	private WebElement parameter_product_class_module;
	public WebElement parameterProductClassModule_608() {
		return parameter_product_class_module;
	}
	
	@FindBy(xpath = "//a[@id='M003MT']")
	private WebElement product_class_maintanance;
	public WebElement productClassMaintanance_608() {
		return product_class_maintanance;
	}
	
	@FindBy(xpath = "//a[@id='infoBarSearchButton_M003MT']")
	private WebElement product_class_main_search_btn;
	public WebElement productClassMainSearchBtn_608() {
		return product_class_main_search_btn;
	}
	
	@FindBy(xpath = "//input[@id='iISProductClassListGridTbl_Id_M003MT_gs_trsctrlclassVO.CLASS']")
	private WebElement product_class_main_search_class;
	public WebElement productClassMainSearchClass_608() {
		return product_class_main_search_class;
	}
	
	@FindBy(xpath = "//td[text()='Ijara']")
	private WebElement product_class_main_search_row_label;
	public WebElement productClassMainSearchRowLabel_608() {
		return product_class_main_search_row_label;
	}
	
	@FindBy(xpath = "//td[@id='td_iISProductClassListGridTbl_Id_M003MT_1_trsctrlclassVO.CLASS']")
	private WebElement product_class_main_searched_row;
	public WebElement productClassMainSearchedRow_608() {
		return product_class_main_searched_row;
	}
	
	@FindBy(xpath = "//li[@id='iisProductClassAdditionalInformation_M003MT']")
	private WebElement product_class_main_additional_info_tab;
	public WebElement productClassMainAdditionalInfoTab_608() {
		return product_class_main_additional_info_tab;
	}
	
	@FindBy(xpath = "//li[@id='iisProductClassAdditionalInformationRepaymentPlan_M003MT']")
	private WebElement main_additional_info_repayment_plan_tab;
	public WebElement mainAdditionalInfoRepaymentTab_608() {
		return main_additional_info_repayment_plan_tab;
	}
	
	@FindBy(xpath = "//input[@id='iisProductClassNumberOfPayments_M003MT']")
	private WebElement repayment_plan_no_of_payments_input;
	public WebElement repaymentTabNoOfPaymentInput_608() {
		return repayment_plan_no_of_payments_input;
	}
	
	@FindBy(xpath = "//select[@id='iisProductClassRoundingFactor_M003MT']")
	private WebElement repayment_plan_no_of_payments_dropdown;
	public WebElement repaymentTabNoOfPaymentDropdown_608() {
		return repayment_plan_no_of_payments_dropdown;
	}
	
	@FindBy(xpath = "//button[@id='iISProductClassMaint_save_M003MT']")
	private WebElement product_class_main_save_btn;
	public WebElement productClassMainSaveBtn_608() {
		return product_class_main_save_btn;
	}
	
	@FindBy(xpath = "//input[@id='_popup_path_sol_confirm_ok']")
	private WebElement confirm_popup_ok_btn;
	public WebElement confirmPopupOkBtn_608() {
		return confirm_popup_ok_btn;
	}
	
	@FindBy(xpath = "//input[@id='_popup_path_sol_ok']")
	private WebElement success_popup_ok_btn;
	public WebElement successPopupOkBtn_608() {
		return success_popup_ok_btn;
	}
	
//	AT_RF_014_FMSCore
	@FindBy(xpath = "//td[@id='td_ApplicationFacilityLimitDetailsGrid_WIFT001MT_1_rn']")
	private WebElement limit_details_first_row;
	public WebElement limitDetailsFirstRow_608() {
		return limit_details_first_row;
	}
	
	@FindBy(xpath = "//button[@id='applicationfacility_repayplan_btn_WIFT001MT']")
	private WebElement limit_details_repayment_plan_btn;
	public WebElement limitDetailsRepaymentPlanBtn_608() {
		return limit_details_repayment_plan_btn;
	}
	
	@FindBy(xpath = "//select[@id='Rounding_Factor_WIFT001MT']")
	private WebElement fms_repayment_plan_rounding_factor_dropdown;
	public WebElement fmsRepaymentPlanRoundingfactorDropdown_608() {
		return fms_repayment_plan_rounding_factor_dropdown;
	}
	
	@FindBy(xpath = "//input[@id='No_Of_Payments_WIFT001MT']")
	private WebElement fms_repayment_plan_no_of_payments_input;
	public WebElement fmsRepaymentPlanNoOfPaymentsInput_608() {
		return fms_repayment_plan_no_of_payments_input;
	}
	
	
	
//	@AT_RF_024 -- FMS Param
	@FindBy(xpath = "//td[text()='Facility Custom Fields']")
	private WebElement param_facility_custom_fields;
	public WebElement paramFacilityCustomFields_608() {
		return param_facility_custom_fields;
	}
	
	@FindBy(xpath = "//td[text()='Maintain Facility Custom Fields']")
	private WebElement maintain_facility_custom_fields;
	public WebElement maintainFacilityCustomFields_608() {
		return maintain_facility_custom_fields;
	}
	
	@FindBy(xpath = "//a[@id='P050FLUP']")
	private WebElement maintain_facility_custom_update_after_approve;
	public WebElement maintainFacilityCustomUpdateAterApprove_608() {
		return maintain_facility_custom_update_after_approve;
	}
	
	@FindBy(xpath = "//tr[@id='1']")
	private WebElement update_after_approve_search_result;
	public WebElement updateAfterApproveSearchResult_608() {
		return update_after_approve_search_result;
	}
	
	@FindBy(id = "td_fmsParamMaintainFacilityCustomFieldsDetListGrid_Id_P050FLUP_0_rn")
	private WebElement facility_custom_fields_box;
	public WebElement facilityCustomFieldsBox_608() {
		return facility_custom_fields_box;
	}
	
//	@AT_RF_034_FMSCore
	@FindBy(xpath = "//a[@id='WIFT005MT']")
	private WebElement WIFAK_app_issue_facility_offer;
	public WebElement WIFAKAppIssueFacilityOffer_608() {
		return WIFAK_app_issue_facility_offer;
	}
	
	@FindBy(xpath = "//input[@id='applicationFacilityGridTbl_Id_WIFT005MT_gs_fmsApplVO.CODE']")
	private WebElement issue_facility_offer_search_code;
	public WebElement issueFacilityOfferSearchCode_608() {
		return issue_facility_offer_search_code;
	}
	
	@FindBy(xpath = "//td[@id='td_applicationFacilityGridTbl_Id_WIFT005MT_1_fmsApplVO.CODE']")
	private WebElement issue_facility_offer_search_result;
	public WebElement issueFacilityOfferSearchResult_608() {
		return issue_facility_offer_search_result;
	}
	
	@FindBy(xpath = "//input[@id='code_WIFT005MT']")
	private WebElement issue_facility_offer_code;
	public WebElement issueFacilityOfferCode_608() {
		return issue_facility_offer_code;
	}
	
	@FindBy(xpath = "//button[@id='applicationfacility_issueoffer_btn_WIFT005MT']")
	private WebElement issue_facility_offer_issue_offer_btn;
	public WebElement issueFacilityOfferIssueOfferBtn_608() {
		return issue_facility_offer_issue_offer_btn;
	}
	
	
//	@AT_RF_035
	@FindBy(xpath = "//td[text()='إدارة الرهن']")
	private WebElement arabic_mortgage_management_module;
	public WebElement arabicMortgageManagementModule_608() {
		return arabic_mortgage_management_module;
	}
	
	@FindBy(xpath = "//a[@id='T014MT']")	
	private WebElement mortgage_management_main;
	public WebElement mortgageManagementMain_608() {
		return mortgage_management_main;
	}
	
	@FindBy(xpath = "//label[@id='collateralmanagementFormId_T014MT_Collateral_Type_key']")
	private WebElement mortgage_management_main_label;
	public WebElement mortgageManagementMainLabel_608() {
		return mortgage_management_main_label;
	}
	
	@FindBy(xpath = "//button[@id='collateralManagement_save_btn_T014MT']")
	private WebElement mortgage_management_main_end;
	public WebElement mortgageManagementMainEnd_608() {
		return mortgage_management_main_end;
	}
	
	
//	@AT_RF_040
	@FindBy(xpath = "//input[@id='applicationFacilitydownpaymentperc_WIFT001MT']")
	private WebElement additional_tab_down_pay_percent;
	public WebElement additionalTabDownPayPercent_608() {
		return additional_tab_down_pay_percent;
	}
	
	@FindBy(xpath = "//input[@id='applicationFacilityDownPaymentToVendorPerc_WIFT001MT']")
	private WebElement additional_tab_down_pay_to_vendor;
	public WebElement additionalTabDownPayToVendor_608() {
		return additional_tab_down_pay_to_vendor;
	}
	
	@FindBy(xpath = "//input[@id='lookuptxt_applicationfacilityLimitDetailsACC_Add_Det_WIFT001MT']")
	private WebElement limit_details_acc_no_input;
	public WebElement limitDetailsAccNoInput_608() {
		return limit_details_acc_no_input;
	}
	
	@FindBy(xpath = "//input[@id='lookuptxt_applicationfacilityLimitDetailsFUND_TRANSFER_RATE_WIFT001MT']")
	private WebElement limit_details_fund_transfer_rate_input;
	public WebElement limitDetailsFundTransferRateInput_608() {
		return limit_details_fund_transfer_rate_input;
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
	
	
	
	
//  @AT_RF_157
    @FindBy(xpath = "//td[text()='Draw Down Request']")
    private WebElement wifak_application_draw_down_request;
    public WebElement wifakApplicationDrawDownRequest_608() {
    	return wifak_application_draw_down_request;
    }
    
    @FindBy(xpath = "//a[@id='WIFT009MT']")
    private WebElement draw_down_request_maintanance;
    public WebElement drawDownRequestMaintanance_608() {
    	return draw_down_request_maintanance;
    }
    
    @FindBy(xpath = "//input[@id='lookuptxt_drawDownRequestFacilityReference_WIFT009MT']")
    private WebElement drawdown_main_facility_ref;
    public WebElement drawdownMainFacilityRef_608() {
    	return drawdown_main_facility_ref;
    }
    
    @FindBy(xpath = "//span[contains(text(),'Yes')]//parent::button")
    private WebElement drawdown_post_approval_yes_btn;
    public WebElement drawdownPostApprovalYesBtn_608() {
    	return drawdown_post_approval_yes_btn;
    }
    
    @FindBy(xpath = "//span[@id='spanLookup_drawDownRequestDrawDownType_WIFT009MT']")
    private WebElement drawdown_main_drawdown_type_lookup;
    public WebElement drawdownMainDrawDownTypeLookup_608() {
    	return drawdown_main_drawdown_type_lookup;
    }
    
    @FindBy(xpath = "//td[text()='Sukuk/Equity'][1]")
    private WebElement drawdown_main_drawdown_type_value;
    public WebElement drawdownMainDrawdownTypeValue_608() {
    	return drawdown_main_drawdown_type_value;
    }
    
    @FindBy(xpath = "//input[@id='drawDownRequestLongNameEnglish_WIFT009MT']")
    private WebElement drawdown_main_description;
    public WebElement drawdownMainDescription_608() {
    	return drawdown_main_description;
    }
    
    @FindBy(xpath = "//input[@id='drawDownRequestDateSubmitted_WIFT009MT']")
    private WebElement drawdown_main_date_submitted;
    public WebElement drawdownMainDateSubmitted_608() {
    	return drawdown_main_date_submitted;
    }
    
    @FindBy(xpath = "//li[@id='drawDownRequestMainInfoTabs_WIFT009MT']")
    private WebElement drawdown_main_info_tab;
    public WebElement drawdownMainInfoTab_608() {
    	return drawdown_main_info_tab;
    }
    
    @FindBy(xpath = "//input[@id='drawDownRequestValueDate_WIFT009MT']")
    private WebElement drawdown_main_value_date;
    public WebElement drawdownMainValueDate_608() {
    	return drawdown_main_value_date;
    }
    
    @FindBy(xpath = "//li[@id='drawDownRequestAdditionDetailsTabs_WIFT009MT']")
    private WebElement drawdown_additional_details_tab;
    public WebElement drawdownAdditionalDetailsTab_608() {
    	return drawdown_additional_details_tab;
    }
    
    @FindBy(xpath = "//input[@id='lookuptxt_drawDownRequestProduct_Class_WIFT009MT']")
    private WebElement drawdown_additional_product_class;
    public WebElement drawdownAdditionalProductClass_608() {
    	return drawdown_additional_product_class;
    }
    
    @FindBy(xpath = "//span[@id='spanLookup_drawDownRequestProduct_Class_WIFT009MT']")
    private WebElement drawdown_additional_product_class_lookup;
    public WebElement drawdownAdditionalProductClassLookup_608() {
    	return drawdown_additional_product_class_lookup;
    }
    
    @FindBy(xpath = "//td[@id='td_gridtab_drawDownRequestProduct_Class_WIFT009MT_1_viewDrawDownClassVO.CODE']")
    private WebElement drawdown_additional_product_class_code;
    public WebElement drawdownAdditionalProductClassCode_608() {
    	return drawdown_additional_product_class_code;
    }
    
    @FindBy(xpath = "//input[@id='drawDownRequestFC_Amount_WIFT009MT']")
    private WebElement drawdown_additional_FC_amount;
    public WebElement drawdownAdditionalFCAmount_608() {
    	return drawdown_additional_FC_amount;
    }
    
    @FindBy(xpath = "//button[@id='drawdownrequest_save_btn_WIFT009MT']")
    private WebElement drawdown_main_save_btn;
    public WebElement drawdownMainSaveBtn_608() {
    	return drawdown_main_save_btn;
    }
    
    @FindBy(xpath = "//div[@id='div__popup_path_sol_ok']/div[2]/div")
    private WebElement drawdown_main_success_popup_msg;
    public WebElement drawdownMainSuccessPopupMsg_608() {
    	return drawdown_main_success_popup_msg;
    }
    
    @FindBy(xpath = "/html/body/div[20]/div[1]/a/span")
    private WebElement drawdown_main_send_alert_popup_close;
    public WebElement drawdownMainSendAlertPopupClose_608() {
    	return drawdown_main_send_alert_popup_close;
    }
    
    @FindBy(xpath = "//a[@id='WIFT009VD']")
    private WebElement draw_down_request_verify;
    public WebElement drawDownRequestVerify_608() {
    	return draw_down_request_verify;
    }
    
    @FindBy(xpath = "//td[@id='drawDownRequestGridTbl_Id_WIFT009VD_pager_left']/table/tbody/tr/td[7]")
    private WebElement drawdown_verify_clear_btn;
    public WebElement drawdownVerifyClearBtn_608() {
    	return drawdown_verify_clear_btn;
    }
    
    @FindBy(xpath = "//td[@id='td_drawDownRequestGridTbl_Id_WIFT009VD_1_fmsDrawDownVO.CODE']")
    private WebElement drawdown_verify_code;
    public WebElement drawdownVerifyCode_608() {
    	return drawdown_verify_code;
    }
    
    @FindBy(xpath = "//span[contains(text(),'Verify')]//parent::button")
    private WebElement draw_down_request_verify_btn;
    public WebElement drawDownRequestVerifyBtn_608() {
    	return draw_down_request_verify_btn;
    }
    
    @FindBy(xpath = "/html/body/div[24]/div[1]/a")
	private WebElement drawdown_verify_send_alert_popup;
	public WebElement drawdownVerifySendAlertPopup_608() {
		return drawdown_verify_send_alert_popup;
	}
    
    @FindBy(xpath = "//a[@id='WIFT009AP']")
    private WebElement draw_down_request_Approve;
    public WebElement drawDownRequestApprove_608() {
    	return draw_down_request_Approve;
    }
    
    @FindBy(xpath = "//td[@id='drawDownRequestGridTbl_Id_WIFT009AP_pager_left']/table/tbody/tr/td[7]")
    private WebElement drawdown_approve_clear_btn;
    public WebElement drawdownApproveClearBtn_608() {
    	return drawdown_approve_clear_btn;
    }
    
    @FindBy(xpath = "//td[@id='td_drawDownRequestGridTbl_Id_WIFT009AP_1_fmsDrawDownVO.CODE']")
    private WebElement drawdown_approve_code;
    public WebElement drawdownApproveCode_608() {
    	return drawdown_approve_code;
    }
    
    @FindBy(xpath = "//span[contains(text(),'Approve')]//parent::button")
    private WebElement draw_down_request_approve_btn;
    public WebElement drawDownRequestApproveBtn_608() {
    	return draw_down_request_approve_btn;
    }
    
    @FindBy(xpath = "//a[@id='infoBarSearchButton_WIFT009MT']")
    private WebElement drawdown_main_search_btn;
    public WebElement drawdownMainSearchBtn_608() {
    	return drawdown_main_search_btn;
    }
    
    @FindBy(xpath = "//td[@id='drawDownRequestGridTbl_Id_WIFT009MT_pager_left']/table/tbody/tr/td[7]")
    private WebElement drawdown_main_clear_btn;
    public WebElement drawdownMainClearBtn_608() {
    	return drawdown_main_clear_btn;
    }
    
    @FindBy(xpath = "//td[@id='td_drawDownRequestGridTbl_Id_WIFT009MT_1_fmsDrawDownVO.CODE']")
    private WebElement drawdown_main_code;
    public WebElement drawdownMainCode_608() {
    	return drawdown_main_code;
    }
  
    @FindBy(xpath = "//span[contains(text(),'Status Details')]//parent::a")
    private WebElement drawdown_main_status_details_btn;
    public WebElement drawdownMainStatusDetailsBtn_608() {
    	return drawdown_main_status_details_btn;
    }
    
    @FindBy(xpath = "//div[@id='fms_status_div_WIFT009MT']")
    private WebElement drawdown_main_status_details_tab;
    public WebElement drawdownMainStatusDetailsTab_608() {
    	return drawdown_main_status_details_tab;
    }
    
    @FindBy(xpath = "//td[@id='td_fmsStatusGridTbl_Id_1_userName']")
    private WebElement drawdown_main_status_details_user_name;
    public WebElement drawdownMainStatusDetailsUserName_608() {
    	return drawdown_main_status_details_user_name;
    }
    
    //Facility Closure Request
    @FindBy(xpath = "//td[text()='Facility Closure Request']")
    private WebElement wifak_application_facility_closure_request;
    public WebElement wifakApplicationFacilityClosureRequest_608() {
    	return wifak_application_facility_closure_request;
    }
    
    @FindBy(xpath = "//a[@id='WIFT010MT']")
    private WebElement facility_closure_request_maintanance;
    public WebElement facilityClosureRequestMaintanance_608() {
    	return facility_closure_request_maintanance;
    }
    
    @FindBy(xpath = "//input[@id='lookuptxt_facilityClosureRequestFacilityReference_WIFT010MT']")
    private WebElement facility_closure_main_facility_ref;
    public WebElement facilityClosureMainFacilityRef_608() {
    	return facility_closure_main_facility_ref;
    }
    
    @FindBy(xpath = "//input[@id='facilityClosureRequest_Closure_Reason_WIFT010MT']")
    private WebElement facility_closure_main_closure_reason;
    public WebElement facilityClosureMainClosureReason_608() {
    	return facility_closure_main_closure_reason;
    }
    
    @FindBy(xpath = "//button[@id='facilityClosureRequestSave_WIFT010MT']")
    private WebElement facility_closure_main_save_btn;
    public WebElement facilityClosureMainSaveBtn_608() {
    	return facility_closure_main_save_btn;
    }
    
    @FindBy(xpath = "/html/body/div[16]/div[1]/a")
    private WebElement facility_closure_main_send_alert_popup;
    public WebElement facilityClosureMainSendAlertPopup_608() {
    	return facility_closure_main_send_alert_popup;
    }
    
    @FindBy(xpath = "//a[@id='WIFT010AP']")
    private WebElement facility_closure_request_approve;
    public WebElement facilityClosureRequestApprove_608() {
    	return facility_closure_request_approve;
    }
    
    @FindBy(xpath = "//td[@id='facilityClosureRequestGridTbl_Id_WIFT010AP_pager_left']/table/tbody/tr/td[7]")
    private WebElement facility_closure_approve_clear_btn;
    public WebElement facilityClosureApproveClearBtn_608() {
    	return facility_closure_approve_clear_btn;
    }
    
    @FindBy(xpath = "//td[@id='td_facilityClosureRequestGridTbl_Id_WIFT010AP_1_fmsFacilityClosureVO.CODE']")
    private WebElement facility_closure_approve_code;
    public WebElement facilityClosureApproveCode_608() {
    	return facility_closure_approve_code;
    }
    
    @FindBy(xpath = "//button[@id='facilityClosureRequest_approve_btn_WIFT010AP']")
    private WebElement facility_closure_approve_btn;
    public WebElement facilityClosureApproveBtn_608() {
    	return facility_closure_approve_btn;
    }
    
    @FindBy(xpath = "//a[@id='infoBarSearchButton_WIFT010MT']")
    private WebElement facility_closure_main_search_btn;
    public WebElement facilityClosureMainSearchBtn_608() {
    	return facility_closure_main_search_btn;
    }
    
    @FindBy(xpath = "//td[@id='td_facilityClosureRequestGridTbl_Id_WIFT010MT_1_fmsFacilityClosureVO.CODE']")
    private WebElement facility_closure_main_code;
    public WebElement facilityClosureMainCode_608() {
    	return facility_closure_main_code;
    }
    
    @FindBy(xpath = "(//span[contains(text(),'Status')]//parent::a)[2]")
    private WebElement facility_closure_main_status_details_btn;
    public WebElement facilityClosureMainStatusDetailsBtn_608() {
    	return facility_closure_main_status_details_btn;
    }
    
    @FindBy(xpath = "//div[@id='gview_fmsStatusGridTbl_Id']")
    private WebElement facility_closure_main_status_details_tab;
    public WebElement facilityClosureMainStatusDetailsTab_608() {
    	return facility_closure_main_status_details_tab;
    }
    
	
	
	
	
	
	
	
	
	
	
	
	
	
//	@AT_FM_043_FMSParam		
	@FindBy(xpath = "//input[@id='_popup_path_sol_confirm_ok']")
	private WebElement button_confirm_ok;
	public WebElement ButtonConfirmOk_608() {
		return button_confirm_ok;
	}
	
	@FindBy(xpath = "//div[text()='CONFIRM']")
	private WebElement confirm_popup;
	public WebElement confirmPopup_608() {
		return confirm_popup;
	}
	
	@FindBy(xpath = "//div[text()='Success']")
	private WebElement success_popup;
	public WebElement successPopup_608() {
		return success_popup;
	}
	
	@FindBy(xpath = "//input[@id='_popup_path_sol_confirm_ok']")
	private WebElement facility_already_created_popup_ok_btn;
	public WebElement facilityAlreadyCreatedPopupOkBtn_608() {
		return facility_already_created_popup_ok_btn;
	}
	
	@FindBy(xpath = "//input[@id='_popup_path_sol_ok']")
	private WebElement button_success_ok;
	public WebElement ButtonSuccessOk_608() {
		return button_success_ok;
	}
	
	
	
//	@AT_RF_141
	@FindBy(xpath = "//a[@id='infoBarSearchButton_RFFRF00MT']")
	private WebElement request_for_financing_maintanance_search_btn;
	public WebElement requestForFinancingMaintananceSearchBtn_608() {
		return request_for_financing_maintanance_search_btn;
	}
	
	@FindBy(xpath = "//td[@id='requestFinancingGridTbl_Id_RFFRF00MT_pager_left']/table/tbody/tr/td[7]")
	private WebElement request_for_financing_maintanance_clear_btn;
	public WebElement requestForFinancingMaintananceClearBtn_608() {
		return request_for_financing_maintanance_clear_btn;
	}
	
	@FindBy(xpath = "//div[@id='jqgh_requestFinancingGridTbl_Id_RFFRF00MT_cifVO.SHORT_NAME_ENG']")
	private WebElement request_for_financing_main_CIF_short_name_title;
	public WebElement requestForFinancingMainCIFShortNameTitle_608() {
		return request_for_financing_main_CIF_short_name_title;
	}
	
	@FindBy(xpath = "//td[@id='td_requestFinancingGridTbl_Id_RFFRF00MT_1_cifVO.SHORT_NAME_ENG']")
	private WebElement request_for_financing_main_CIF_short_name_value;
	public WebElement requestForFinancingMainCIFShortNameValue_608() {
		return request_for_financing_main_CIF_short_name_value;
	}
	
	@FindBy(xpath = "//div[@id='jqgh_requestFinancingGridTbl_Id_RFFRF00MT_cifVO.LONG_NAME_ENG']")
	private WebElement request_for_financing_main_CIF_long_name_title;
	public WebElement requestForFinancingMainCIFLongNameTitle_608() {
		return request_for_financing_main_CIF_long_name_title;
	}
	
	@FindBy(xpath = "//td[@id='td_requestFinancingGridTbl_Id_RFFRF00MT_1_cifVO.LONG_NAME_ENG']")
	private WebElement request_for_financing_main_CIF_long_name_value;
	public WebElement requestForFinancingMainCIFLongNameValue_608() {
		return request_for_financing_main_CIF_long_name_value;
	}
	
	
//	@AT_RF_141_arabic
	@FindBy(xpath = "//label[@id='language_key']")
	private WebElement FMS_core_language_btn;
	public WebElement FMSCoreLanguageBtn_608() {
		return FMS_core_language_btn;
	}
	
	@FindBy(xpath = "//a[@id='ar']")
	private WebElement arabic_language;
	public WebElement arabicLanguage_608() {
		return arabic_language;
	}
	
	@FindBy(xpath = "//td[text()='طلب تمويل ']")
	private WebElement arabic_funding_request;
	public WebElement arabicFundingRequest_608() {
		return arabic_funding_request;
	}
	
	@FindBy(xpath = "//td[text()='طلب']")
	private WebElement arabic_request;
	public WebElement arabicRequest_608() {
		return arabic_request;
	}
	
	@FindBy(xpath = "//td[text()='طلب تمويل']")
	private WebElement arabic_request_funding_request;
	public WebElement arabicRequestFundingRequest_608() {
		return arabic_request_funding_request;
	}
	
	@FindBy(xpath = "//a[@id='RFFRF00AC']")
	private WebElement arabic_funding_request_approval_committee;
	public WebElement arabicFundingRequestApprovalCommittee_608() {
		return arabic_funding_request_approval_committee;
	}
	
	@FindBy(xpath = "//div[@id='jqgh_requestFinancingGridTbl_Id_RFFRF00AC_cifVO.SHORT_NAME_ENG']")
	private WebElement arabic_approval_committee_Searchgrid;
	public WebElement arabicApprovalCommitteeSearchGrid_608() {
		return arabic_approval_committee_Searchgrid;
	}

	
	
	
//	@AT_FM_043_FMSCore
	@FindBy(xpath = "//td[text()='Request']")
	private WebElement FMS_core_request_module;
	public WebElement FMSCoreRequestModule_608() {
		return FMS_core_request_module;
	}
	
	@FindBy(xpath = "//td[text()='Request Financing']")
	private WebElement request_financing_feature;
	public WebElement requestFinancingFeature_608() {
		return request_financing_feature;
	}
	
	@FindBy(xpath = "//div[@id='_selenuimRFFRF00']//td[contains(text(),'Request')]")
	private WebElement request_for_financing_feature;
	public WebElement requestForFinancingFeature_608() {
		return request_for_financing_feature;
	}
	
	@FindBy(xpath = "//a[@id='RFFRF00MT']")
	private WebElement request_for_financing_maintanance;
	public WebElement requestForFinancingMaintanance_608() {
		return request_for_financing_maintanance;
	}
	
	@FindBy(xpath = "//select[@id='requestFinancingApplicationFor_RFFRF00MT']")
	private WebElement request_for_financing_main_reason_for_dropdown;
	public WebElement requestForFinancingMainReasonForDropdown_608() {
		return request_for_financing_main_reason_for_dropdown;
	}
	
	@FindBy(xpath = "//input[@id='lookuptxt_requestFinanacingCif_RFFRF00MT']")
	private WebElement request_for_financing_main_customer_input;
	public WebElement requestForFinancingMainCustomerInput_608() {
		return request_for_financing_main_customer_input;
	}
	
	@FindBy(xpath = "(//input[@id='requestFinancingCifShortNameEng_RFFRF00MT'])[1]")
	private WebElement request_for_financing_short_name_input;
	public WebElement requestForFinancingMainShortNameInput_608() {
		return request_for_financing_short_name_input;
	}
	
	@FindBy(xpath = "//input[@id='lookuptxt_requestFinancingFacilityType_RFFRF00MT']")
	private WebElement request_for_financing_main_facility_type_input;
	public WebElement requestForFinancingMainFacilityTypeInput_608() {
		return request_for_financing_main_facility_type_input;
	}
	
	@FindBy(xpath = "//input[@id='lookuptxt_requestFinancingFacilityCurrency_RFFRF00MT']")
	private WebElement request_for_financing_main_CY_input;
	public WebElement requestForFinancingMainCYInput_608() {
		return request_for_financing_main_CY_input;
	}
	
	@FindBy(xpath = "//input[@id='requestFinancingFacilityTotalvalue_RFFRF00MT']")
	private WebElement request_for_financing_main_total_limit_input;
	public WebElement requestForFinancingMainTotalLimitInput_608() {
		return request_for_financing_main_total_limit_input;
	}
	
	@FindBy(xpath = "//li[@id='requestFinancingLimitDtlsTabs_RFFRF00MT']")
	private WebElement request_for_financing_main_sublimit_tab;
	public WebElement requestForFinancingMainSublimitTab_608() {
		return request_for_financing_main_sublimit_tab;
	}
	
	@FindBy(xpath = "//td[@id='add_RequestFinancingLimitDetailsGridId_RFFRF00MT']")
	private WebElement request_for_financing_main_sublimit_tab_add_new_btn;
	public WebElement requestForFinancingMainSublimitTabAddNewBtn_608() {
		return request_for_financing_main_sublimit_tab_add_new_btn;
	}
	
	@FindBy(xpath = "//input[@id='lookuptxt_requestFinancingLimitDetailsGeneralFacilityProductClass_RFFRF00MT']")
	private WebElement request_for_financing_main_sublimit_tab_product_class_input;
	public WebElement requestForFinancingMainSublimitTabProductClassInput_608() {
		return request_for_financing_main_sublimit_tab_product_class_input;
	}
	
	@FindBy(xpath = "//input[@id='requestFinancingLimitDetailsClassDesc_RFFRF00MT']")
	private WebElement request_for_financing_main_sublimit_tab_product_class_label;
	public WebElement requestForFinancingMainSublimitTabProductClassLabel_608() {
		return request_for_financing_main_sublimit_tab_product_class_label;
	}
	
	@FindBy(xpath = "//input[@id='requestFinancingLimitDetailsRfNewMargin_RFFRF00MT']")
	private WebElement request_for_financing_main_sublimit_tab_margin_input;
	public WebElement requestForFinancingMainSublimitTabAddNewMarginInput_608() {
		return request_for_financing_main_sublimit_tab_margin_input;
	}
	
	@FindBy(xpath = "//button[@id='limitDetails_add_btn_RFFRF00MT']")
	private WebElement request_for_financing_main_sublimit_tab_add_btn;
	public WebElement requestForFinancingMainSublimitTabAddBtn_608() {
		return request_for_financing_main_sublimit_tab_add_btn;
	}
	
	@FindBy(xpath = "//button[@id='requestForFinance_save_as_draft_btn_RFFRF00MT']")
	private WebElement request_for_financing_main_save_btn;
	public WebElement requestForFinancingMainSaveBtn_608() {
		return request_for_financing_main_save_btn;
	}
	
	@FindBy(xpath = "//button[@id='requestForFinance_save_btn_RFFRF00MT']")
	private WebElement request_for_financing_main_validate_btn;
	public WebElement requestForFinancingMainValidateBtn_608() {
		return request_for_financing_main_validate_btn;
	}
	
	@FindBy(xpath = "//div[@id='div__popup_path_sol_ok']/div[2]/div")
	private WebElement success_popup_msg;
	public WebElement successPopupMsg_608() {
		return success_popup_msg;
	}	
	
	@FindBy(xpath = "/html/body/div[46]/div")
	private WebElement request_send_alert_popup;
	public WebElement RequestSendAlertPopup_608() {
		return request_send_alert_popup;
	}
	
	@FindBy(xpath = "/html/body/div[46]/div[1]/a/span")
	private WebElement request_send_alert_popup_close;
	public WebElement RequestSendAlertPopupClose_608() {
		return request_send_alert_popup_close;
	}	
	
	@FindBy(xpath = "//a[@id='dismissbut_RFFRF00MT']")
	private WebElement request_send_alert_popup_dismiss_btn;
	public WebElement requestSendAlertPopupDismissBtn_608() {
		return request_send_alert_popup_dismiss_btn;
	}
	
	@FindBy(xpath = "//a[@id='RFFRF00P1']")
	private WebElement request_for_financing_approve_level1;
	public WebElement requestForFinancingApproveLevel1_608() {
		return request_for_financing_approve_level1;
	}
	
	@FindBy(xpath = "//input[@id='requestFinancingGridTbl_Id_RFFRF00P1_gs_fmsRequestFinancingVO.CODE']")
	private WebElement request_for_financing_approve_level1_code;
	public WebElement requestForFinancingApproveLevel1Code_608() {
		return request_for_financing_approve_level1_code;
	}
	
	@FindBy(xpath = "//td[@id='td_requestFinancingGridTbl_Id_RFFRF00P1_1_fmsRequestFinancingVO.CODE']")
	private WebElement request_for_financing_approve_level1_first_row;
	public WebElement requestForFinancingApproveLevel1FirstRow_608() {
		return request_for_financing_approve_level1_first_row;
	}
	
	@FindBy(xpath = "//li[@id='customerGradingRecommendationsTab_RFFRF00P1']")
	private WebElement approve_level1_customer_grading_tab;
	public WebElement approveLevel1CustomerGradingTab_608() {
		return approve_level1_customer_grading_tab;
	}
	
	@FindBy(xpath = "//select[@id='requestDecisionForward_1_RFFRF00P1']")
	private WebElement approve_level1_customer_grading_approve_decision;
	public WebElement approveLevel1CustomerGradingApproveDecision_608() {
		return approve_level1_customer_grading_approve_decision;
	}
	
	@FindBy(xpath = "//select[@id='requestDecisionForwardP1_RFFRF00P1']")
	private WebElement approve_level1_customer_grading_approve_forward_to;
	public WebElement approveLevel1CustomerGradingApproveForwardTo_608() {
		return approve_level1_customer_grading_approve_forward_to;
	}
	
	@FindBy(xpath = "//select[@id='requestP1approvalCommitte_RFFRF00P1']")
	private WebElement approve_level1_customer_grading_approve_committee;
	public WebElement approveLevel1CustomerGradingApproveCommittee_608() {
		return approve_level1_customer_grading_approve_committee;
	}
	
	@FindBy(xpath = "//button[@id='requestForFinance_approve_btn_RFFRF00P1']")
	private WebElement request_for_financing_approve_level1_approve_Btn;
	public WebElement requestForFinancingApproveLevel1ApproveBtn_608() {
		return request_for_financing_approve_level1_approve_Btn;
	}	
	
	@FindBy(xpath = "//a[@id='RFFRF00AC']")
	private WebElement request_for_financing_approval_committee_recom;
	public WebElement requestForFinancingApprovalCommitteeRecom_608() {
		return request_for_financing_approval_committee_recom;
	}
	
	@FindBy(xpath = "//input[@id='requestFinancingGridTbl_Id_RFFRF00AC_gs_fmsRequestFinancingVO.CODE']")
	private WebElement request_for_financing_approval_committee_recom_code;
	public WebElement requestForFinancingApprovalCommitteeRecomCode_608() {
		return request_for_financing_approval_committee_recom_code;
	}
	
	@FindBy(xpath = "//td[@id='td_requestFinancingGridTbl_Id_RFFRF00AC_1_fmsRequestFinancingVO.CODE']")
	private WebElement request_for_financing_approval_committee_recom_row1;
	public WebElement requestForFinancingApprovalCommitteeRecomRow1_608() {
		return request_for_financing_approval_committee_recom_row1;
	}
	
	@FindBy(xpath = "//li[@id='creditCommitteeRecommendationsTab_RFFRF00AC']")
	private WebElement approval_committee_credit_committee_tab;
	public WebElement approvalCommitteeCreditCommitteeTab_608() {
		return approval_committee_credit_committee_tab;
	}
	
	@FindBy(xpath = "//div[@id='requestFinancingCreditReviewRecommandations_RFFRF00AC']/div")
	private WebElement approval_committee_credit_committee_recomm_div;
	public WebElement approvalCommitteeCreditCommitteeRecommDiv_608() {
		return approval_committee_credit_committee_recomm_div;
	}
	
	@FindBy(xpath = "//tr[@id='RequestFinancingRecommendationsGridId_RFFRF00ACghead_0']/td/span")
	private WebElement approval_committee_credit_committee_recomm_plus_icon;
	public WebElement approvalCommitteeCreditCommitteeRecommPlusIcon_608() {
		return approval_committee_credit_committee_recomm_plus_icon;
	}
	
	@FindBy(xpath = "//td[@id='td_RequestFinancingRecommendationsGridId_RFFRF00AC_1_fmsApplRecommendVO.RECOMMENDATION']")
	private WebElement approval_committee_credit_committee_recomm_label;
	public WebElement approvalCommitteeCreditCommitteeRecommLabel_608() {
		return approval_committee_credit_committee_recomm_label;
	}
	
	@FindBy(xpath = "//select[@gridid='RequestFinancingRecommendationsGridId_RFFRF00AC']")
	private WebElement approval_committee_credit_committee_recomm_dropdown;
	public WebElement approvalCommitteeCreditCommitteeRecommDropdown_608() {
		return approval_committee_credit_committee_recomm_dropdown;
	}
	
	@FindBy(xpath = "//button[@id='requestFinancing_recommend_Review_btn_RFFRF00AC']")
	private WebElement approval_committee_recommedation_btn;
	public WebElement approvalCommitteeRecommendationBtn_608() {
		return approval_committee_recommedation_btn;
	}
	
	
//	@AT_DDR_021
	@FindBy(xpath = "//input[@id='reqFinancingLimitDownpaymentperc_RFFRF00MT']")
	private WebElement request_for_financing_main_down_payment_percent_input;
	public WebElement requestForFinancingMainDownPaymentPercentInput_608() {
		return request_for_financing_main_down_payment_percent_input;
	}

	@FindBy(xpath = "//input[@id='requestFinancingLimitDetailsDownPaymentPercentage_RFFRF00MT']")
	private WebElement request_for_financing_main_sublimit_tab_DownPayment_percent_input;
	public WebElement requestForFinancingMainSublimitTabDownPaymentPercentInput_608() {
		return request_for_financing_main_sublimit_tab_DownPayment_percent_input;
	}
	
	@FindBy(xpath = "//input[@id='reqFinancingLimitDownpaymentperc_RFFRF00P1']")
	private WebElement request_for_financing_approve_level1_down_payment_percent_input;
	public WebElement requestForFinancingApproveLevel1DownPaymentPercentInput_608() {
		return request_for_financing_approve_level1_down_payment_percent_input;
	}
	
	
	
//	@AT_RF_158_Param - Collateral Type
	@FindBy(xpath = "//td[text()='Collateral Type']")
	private WebElement parameter_collateral_type;
	public WebElement parameterCollateralType_608() {
		return parameter_collateral_type;
	}
	
	@FindBy(xpath = "//a[@id='P002MT']")
	private WebElement collateral_type_maintanance;
	public WebElement collateralTypeMaintanance_608() {
		return collateral_type_maintanance;
	}
	
	@FindBy(xpath = "//input[@id='txt_code_P002MT']")
	private WebElement collateral_type_main_code;
	public WebElement collateralTypeMainCode_608() {
		return collateral_type_main_code;
	}
	
	@FindBy(xpath = "//input[@id='txt_brief_description_eng_P002MT']")
	private WebElement collateral_type_main_brief_descrip;
	public WebElement collateralTypeMainBriefDescrip_608() {
		return collateral_type_main_brief_descrip;
	}
	
	@FindBy(xpath = "//input[@id='txt_long_description_eng_P002MT']")
	private WebElement collateral_type_main_long_descrip;
	public WebElement collateralTypeMainLongDescrip_608() {
		return collateral_type_main_long_descrip;
	}
	
	@FindBy(xpath = "//select[@id='txt_asset_type_P002MT']")
	private WebElement collateral_type_main_asset_type_dropdown;
	public WebElement collateralTypeMainAssetTypeDropdown_608() {
		return collateral_type_main_asset_type_dropdown;
	}
	
	@FindBy(xpath = "//button[@id='collateralTypeMaint_save_P002MT']")
	private WebElement collateral_type_main_save_btn;
	public WebElement collateralTypeMainSaveBtn_608() {
		return collateral_type_main_save_btn;
	}
	
	@FindBy(xpath = "//a[@id='P002P']")
	private WebElement collateral_type_approve;
	public WebElement collateralTypeApprove_608() {
		return collateral_type_approve;
	}
	
	@FindBy(xpath = "//input[@id='collateralTypeListGridTbl_Id_P002P_gs_fmsColatTypeVo.CODE']")
	private WebElement collateral_type_approve_code;
	public WebElement collateralTypeApproveCode_608() {
		return collateral_type_approve_code;
	}
	
	@FindBy(linkText = "//*[@id='1']")
	private WebElement collateral_type_approve_code_row1;
	public WebElement collateralTypeApproveCodeRow1_608() {
		return collateral_type_approve_code_row1;
	}
	
	@FindBy(xpath = "//button[@id='collateralTypeMaint_approve_P002P']")
	private WebElement collateral_type_approve_btn;
	public WebElement collateralTypeApproveBtn_608() {
		return collateral_type_approve_btn;
	}
	
	
//	@AT_RF_158_Core
	@FindBy(xpath = "//td[text()='Collateral Management']")
	private WebElement FMS_collateral_management;
	public WebElement FMSCollateralManagement_608() {
		return FMS_collateral_management;
	}
	
	@FindBy(xpath = "//a[@id='T014MT']")
	private WebElement collateral_management_maintanance;
	public WebElement collateralManagementMaintanance_608() {
		return collateral_management_maintanance;
	}
	
	@FindBy(xpath = "//input[@id='lookuptxt_collateralManagementCollateralType_T014MT']")
	private WebElement main_info_collateral_type;
	public WebElement mainInfoCollateralType_608() {
		return main_info_collateral_type;
	}
	
	@FindBy(xpath = "//input[@id='fmscollateralValidFrom_T014MT']//following-sibling::img")
	private WebElement main_info_valid_from_date_calender;
	public WebElement mainInfoValidFromDateCalender_608() {
		return main_info_valid_from_date_calender;
	}
	
	@FindBy(xpath = "//input[@id='fmscollateralValidFrom_T014MT']")
	private WebElement main_info_valid_from_date;
	public WebElement mainInfoValidFromDate_608() {
		return main_info_valid_from_date;
	}
	
	@FindBy(xpath = "//input[@id='fmscollateralValidTo_T014MT']")
	private WebElement main_info_valid_to_date;
	public WebElement mainInfoValidToDate_608() {
		return main_info_valid_to_date;
	}
	
	@FindBy(xpath = "//input[@id='fmscollateralBriefNameEng_T014MT']")
	private WebElement main_info_brief_descrip;
	public WebElement mainInfoBriefDescrip_608() {
		return main_info_brief_descrip;
	}
	
	@FindBy(xpath = "//input[@id='fmscollateralLongNameEng_T014MT']")
	private WebElement main_info_long_descrip;
	public WebElement mainInfoLongDescrip_608() {
		return main_info_long_descrip;
	}
	
	@FindBy(xpath = "//input[@id='lookuptxt_fmscollateralCurrency_T014MT']")
	private WebElement main_info_collateral_currency;
	public WebElement mainInfoCollateralCurrency_608() {
		return main_info_collateral_currency;
	}
	
	@FindBy(xpath = "//input[@id='fmscollateralCurrency_Brief_Desc_Eng_T014MT']")
	private WebElement main_info_collateral_currency_label;
	public WebElement mainInfoCollateralCurrencyLabel_608() {
		return main_info_collateral_currency_label;
	}
	
	@FindBy(xpath = "//li[@id='collateralManagementCashGuaranteeDetailsTabs_T014MT']")
	private WebElement collateral_cash_details_tab;
	public WebElement CollateralCashDetailsTab_608() {
		return collateral_cash_details_tab;
	}
	
	@FindBy(xpath = "//td[@id='add_CollateralManagementCashGuarantorGrid_T014MT']")
	private WebElement collateral_cash_details_add_icon;
	public WebElement CollateralCashDetailsAddIcon_608() {
		return collateral_cash_details_add_icon;
	}
	
	@FindBy(xpath = "//input[@name='lookupTxt_accAdditionalRef']")
	private WebElement collateral_cash_details_additional_ref_input;
	public WebElement CollateralCashDetailsAdditionalRefInput_608() {
		return collateral_cash_details_additional_ref_input;
	}
	
	@FindBy(xpath = "//input[@name='lookupTxt_accAdditionalRef']/following-sibling::span")
	private WebElement collateral_cash_details_additional_ref_lookup;
	public WebElement CollateralCashDetailsAdditionalRefLookup_608() {
		return collateral_cash_details_additional_ref_lookup;
	}
	
	@FindBy(xpath = "//*[@id='1']")
	private WebElement collateral_cash_details_additional_ref_row1;
	public WebElement CollateralCashDetailsAdditionalRefRow1_608() {
		return collateral_cash_details_additional_ref_row1;
	}
	
	@FindBy(xpath = "//*[@id='1']/td[2]")
	private WebElement collateral_cash_details_additional_ref_cy;
	public WebElement CollateralCashDetailsAdditionalRefCy_608() {
		return collateral_cash_details_additional_ref_cy;
	}

	@FindBy(xpath = "//td[@id='td_CollateralManagementCashGuarantorGrid_T014MT_1_fmsCollateralDetVO.AMOUNT']/div/input")
	private WebElement collateral_cash_details_amount;
	public WebElement CollateralCashDetailsAmount_608() {
		return collateral_cash_details_amount;
	}

	@FindBy(xpath = "//button[@id='collateralManagement_save_btn_T014MT']")
	private WebElement collateral_management_maintanance_save_btn;
	public WebElement collateralManagementMaintananceSaveBtn_608() {
		return collateral_management_maintanance_save_btn;
	}
	
	@FindBy(xpath = "//input[@id='_popup_path_sol_confirm_ok']")
	private WebElement warning_popup_ok_btn;
	public WebElement warningPopupOkBtn_608() {
		return warning_popup_ok_btn;
	}
	
	@FindBy(xpath = "//div[text()='Success']")
	private WebElement success_popup_title;
	public WebElement successPopupTitle_608() {
		return success_popup_title;
	}
	
	@FindBy(xpath = "//div[@id='div__popup_path_sol_ok']/div[2]/div")
	private WebElement collateral_success_popup_msg;
	public WebElement collateralSuccessPopupMsg_608() {
		return collateral_success_popup_msg;
	}
	
	
	@FindBy(xpath = "//span[text()='Send Alert']")
	private WebElement send_alert_popup;
	public WebElement sendAlertPopup_608() {
		return send_alert_popup;
	}
	
	@FindBy(xpath = "//a[@id='dismissbut_T014MT']")
	private WebElement collateral_send_alert_popup_dismiss_btn;
	public WebElement collateralSendAlertPopupDismissBtn_608() {
		return collateral_send_alert_popup_dismiss_btn;
	}
	
	@FindBy(xpath = "//a[@id='T014AP']")
	private WebElement collateral_management_approve;
	public WebElement collateralManagementApprove_608() {
		return collateral_management_approve;
	}
	                          
	@FindBy(xpath = "//input[@id='collateralManagementGridTbl_Id_T014AP_gs_fmsCollateralVO.CODE']")
	private WebElement collateral_management_approve_menu_searchgrid_code_input;
	public WebElement collateralManagementApproveMenuSearchgridCodeInput_608() {		       
		return collateral_management_approve_menu_searchgrid_code_input;
	}
	
	@FindBy(xpath = "//td[@id='td_collateralManagementGridTbl_Id_T014AP_1_fmsCollateralVO.CODE']")
	private WebElement collateral_management_approve_menu_searchgrid_row1;
	public WebElement collateralManagementApproveMenuSearchgridRow1_608() {
		return collateral_management_approve_menu_searchgrid_row1;
	}
	
	@FindBy(xpath = "//input[@id='collateralCode_T014AP']")
	private WebElement collateral_management_approve_menu_Code;
	public WebElement collateralManagementApproveMenuCode_608() {
		return collateral_management_approve_menu_Code;
	}
	
	
	@FindBy(xpath = "//*[@id='collateralManagementGridTbl_Id_T014AP_pager_left']/table/tbody/tr/td[7]")
	private WebElement collateral_management_approve_clear_btn;
	public WebElement collateralManagementApproveClearBtn_608() {
		return collateral_management_approve_clear_btn;
	}
	
	@FindBy(xpath = "//td[@id='td_collateralManagementGridTbl_Id_T014AP_1_fmsCollateralVO.CODE']")
	private WebElement collateral_management_approve_first_row;
	public WebElement collateralManagementApproveFirstRow_608() {
		return collateral_management_approve_first_row;
	}
	
	@FindBy(xpath = "//button[@id='collateralManagement_approve_btn_T014AP']")
	private WebElement collateral_management_approve_btn;
	public WebElement collateralManagementApproveBtn_608() {
		return collateral_management_approve_btn;
	}
	
	
//	@AT_DDR_025
	// [2968] CIF Already BlackListed, Do You Want To Proceed? BlackList Nbr: 12 ,Blacklist Type : 0-,Source : 0-
	@FindBy(xpath = "//div[@class='jMsgbox-contentWrap']")
	private WebElement cif_blaklist_popup_msg ;
	public WebElement CIFBlacklistPopupMsg_608() {
		return cif_blaklist_popup_msg;
	}
	
	@FindBy(xpath = "//input[@id='_popup_path_sol_confirm']")
	private WebElement cif_blaklist_popup_cancel_btn ;
	public WebElement CIFBlacklistPopupCancelBtn_608() {
		return cif_blaklist_popup_cancel_btn;
	}
	
	@FindBy(xpath = "//input[@id='lookuptxt_fmscollateralCif_T014MT']")
	private WebElement collateral_management_main_info_cif_no;
	public WebElement CollateralManagementMainInfoCIFNoInput_608() {
		return collateral_management_main_info_cif_no;
	}
	
	
	//AT_CM_043
	@FindBy(xpath = "//input[@id='facilityManagementGridTbl_Id_WIFT008MT_gs_statusDesc']")
	private WebElement wifak_facilities_management_main_searchgrid_status_input;
	public WebElement wifakFacilitiesManagementMainSearchgridStatusInput_608() {
		return wifak_facilities_management_main_searchgrid_status_input;
	}
	
	@FindBy(xpath = "//td[@id='td_facilityManagementGridTbl_Id_WIFT008MT_2_fmsFacilityVO.CODE']")
	private WebElement wifak_facilities_management_main_searchgrid_rows;
	public WebElement wifakFacilitiesManagementMainSearchgridRow_608() {
		return wifak_facilities_management_main_searchgrid_rows;
	}
	
	@FindBy(xpath = "//button[@id='facilityManagement_collateralDetails_btn_WIFT008MT']")
	private WebElement wifak_facilities_management_main_limit_details_tab_collateral_details_btn;
	public WebElement wifakFacilitiesManagementMainLimitDetailsTabCollateralDetailsBtn_608() {
		return wifak_facilities_management_main_limit_details_tab_collateral_details_btn;
	}
	
	@FindBy(xpath = "//div[@id='facilitySubLimitCollateralDetailsDiv_id_WIFT008MT']")
	private WebElement wifak_facilities_management_main_collateral_details_tab;
	public WebElement wifakFacilitiesManagementMainCollateralDetailsTab_608() {
		return wifak_facilities_management_main_collateral_details_tab;
	}
	
	@FindBy(xpath = "//td[@id='add_FacilityCollateralGrid_WIFT008MT']/div/span")
	private WebElement wifak_facilities_management_main_collateral_details_tab_add_icon;
	public WebElement wifakFacilitiesManagementMainCollateralDetailsTabAddIcon_608() {
		return wifak_facilities_management_main_collateral_details_tab_add_icon;
	}
	
	@FindBy(xpath = "//td[@id='td_FacilityCollateralGrid_WIFT008MT_1_rn']")
	private WebElement wifak_facilities_management_main_collateral_details_tab_first_row;
	public WebElement wifakFacilitiesManagementMainCollateralDetailsTabFirstRow_608() {
		return wifak_facilities_management_main_collateral_details_tab_first_row;
	}
	
	@FindBy(xpath = "//input[@name='lookupTxt_fmsAppcollateralsVO.COLLATERAL']")
	private WebElement wifak_facilities_management_main_collateral_details_tab_first_row_collateral_input;
	public WebElement wifakFacilitiesManagementMainCollateralDetailsTabFirstRowCollateralInput_608() {
		return wifak_facilities_management_main_collateral_details_tab_first_row_collateral_input;
	}	
	
	@FindBy(xpath = "//span[text()='Ok']")
	private WebElement wifak_facilities_management_main_collateral_details_tab_Ok_btn;
	public WebElement wifakFacilitiesManagementMainCollateralDetailsTabOkBtn_608() {
		return wifak_facilities_management_main_collateral_details_tab_Ok_btn;
	}
	
	
	//AT_CM_044
	@FindBy(xpath = "//li[@id='facilityAdditionalDetailsTab_WIFT008MT']")
	private WebElement wifak_facilities_management_main_additional_details_tab;
	public WebElement wifakFacilitiesManagementMainAdditionalDetailsTab_608() {
		return wifak_facilities_management_main_additional_details_tab;
	}
	
	@FindBy(xpath = "//input[@id='facilityMgtAddDetDateEffectiveFrom_WIFT008MT']")
	private WebElement wifak_facilities_management_main_additional_details_tab_effective_date_from_input;
	public WebElement wifakFacilitiesManagementMainAdditionalDetailsTabEffectiveDateFromInput_608() {
		return wifak_facilities_management_main_additional_details_tab_effective_date_from_input;
	}
	
	@FindBy(xpath = "//input[@id='facilityMgtAddDetDateEffectiveUntill_WIFT008MT']")
	private WebElement wifak_facilities_management_main_additional_details_tab_effective_until_input;
	public WebElement wifakFacilitiesManagementMainAdditionalDetailsTabEffectivenUntilInput_608() {
		return wifak_facilities_management_main_additional_details_tab_effective_until_input;
	}
	
	@FindBy(xpath = "//input[@id='facilityMgtAddDetUnutilizedExpiryDate_WIFT008MT']")
	private WebElement wifak_facilities_management_main_additional_details_tab_unutilize_expire_date_input;
	public WebElement wifakFacilitiesManagementMainAdditionalDetailsTabUnutilizeExpireDateInput_608() {
		return wifak_facilities_management_main_additional_details_tab_unutilize_expire_date_input;
	}

	@FindBy(xpath = "//a[@id='dismissbut_WIFT008MT']")
	private WebElement wifak_facilities_management_main_send_alert_popup_dismiss_btn;
	public WebElement wifakFacilitiesManagementMainSendAlertPopupDismissBtn_608() {
		return wifak_facilities_management_main_send_alert_popup_dismiss_btn;
	}
	
	
	
}
