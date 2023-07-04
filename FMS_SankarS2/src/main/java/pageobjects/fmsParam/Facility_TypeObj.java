package pageobjects.fmsParam;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Facility_TypeObj {
	
	WebDriver driver;
	public Facility_TypeObj(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
//	@AT_AFF_098_FMSParam	
	@FindBy(xpath = "//td[text()='Parameters']")
	private WebElement fms_param_parameter;
	public WebElement fmsParamParameter() {
		return fms_param_parameter;
	}
	
	@FindBy(xpath = "//td[text()='Facility Type']")
	private WebElement param_facility_type;
	public WebElement paramFacilityType() {
		return param_facility_type;
	}
	
	@FindBy(xpath = "//a[@id='P008UP']")
	private WebElement facility_type_update_after_approve;
	public WebElement facilityTypeUpdateAfterApprove() {
		return facility_type_update_after_approve;
	}
	
	@FindBy(id = "fmsFacilityTypeListGridTbl_Id_P008UP_gs_CODE")
	private WebElement facility_type_search_code;
	public WebElement facilityTypeSearchCode() {
		return facility_type_search_code;
	}
	
	@FindBy(id = "td_fmsFacilityTypeListGridTbl_Id_P008UP_1_CODE")
	private WebElement facility_type_code;
	public WebElement facilityTypeCode() {
		return facility_type_code;
	}
	
	@FindBy(xpath = "//li[@id='fmsFacilityTypeDetailsTab_P008UP']")
	private WebElement facilty_type_facility_details;
	public WebElement facilityTypeFacilityDetails() {
		return facilty_type_facility_details;
	}
	
	@FindBy(id = "Fms_facility_type_stp_facility_requirments_Div_P008UP")
	private WebElement STP_facility_req;
	public WebElement STPFacilityReq() {
		return STP_facility_req;
	}
	
	@FindBy(xpath = "//input[@id='fmsFacilityType_customer_grading_P008UP']")
	private WebElement customer_grading_flag;
	public WebElement customerGradingFlag() {
		return customer_grading_flag;
	}
	
	@FindBy(xpath = "//input[@id='fmsFacilityType_grade_overwrite_P008UP']")
	private WebElement overwrite_grading_flag;
	public WebElement OverwriteGradingFlag() {
		return overwrite_grading_flag;
	}
	
	@FindBy(xpath = "//input[@id='fmsFacilityType_credit_review_P008UP']")
	private WebElement credit_review_flag;
	public WebElement creditReviewFlag() {
		return credit_review_flag;
	}
	
	@FindBy(xpath = "//input[@id='fmsFacilityType_committee_approval_P008UP']")
	private WebElement committee_approval_flag;
	public WebElement committeeApprovalFlag() {
		return committee_approval_flag;
	}
	
	@FindBy(xpath = "//select[@id='fmsFacilityType_members_number_P008UP']")
	private WebElement committee_approval_flag_member_dropdown;
	public WebElement committeeApprovalFlagMemberDropdown() {
		return committee_approval_flag_member_dropdown;
	}
	
	@FindBy(xpath = "//input[@id='fmsFacilityType_credit_authorize_P008UP']")
	private WebElement credit_authorzie_flag;
	public WebElement creditAuthorzieFlag() {
		return credit_authorzie_flag;
	}
	
	@FindBy(xpath = "//input[@id='fmsFacilityType_issue_offer_P008UP']")
	private WebElement issue_facility_offer_flag;
	public WebElement issueFacilityOfferFlag() {
		return issue_facility_offer_flag;
	}

	@FindBy(xpath = "//input[@id='fmsFacilityType_client_response_P008UP']")
	private WebElement client_response_flag;
	public WebElement clientResponseFlag() {
		return client_response_flag;
	}
	
	@FindBy(xpath = "//input[@id='fmsFacilityType_document_validation_yn_P008UP']")
	private WebElement document_validation_flag;
	public WebElement documentValidationFlag() {
		return document_validation_flag;
	}
	
	@FindBy(xpath = "//input[@id='fmsFacilityType_final_approval_P008UP']")
	private WebElement final_approval_flag;
	public WebElement finalApprovalFlag() {
		return final_approval_flag;
	}
		
	@FindBy(xpath = "//input[@id='fmsFacilityType_active_facility_P008UP']")
	private WebElement create_active_facility_flag;
	public WebElement createActiveFacilityFlag() {
		return create_active_facility_flag;
	}	
	
	@FindBy(xpath = "//input[@id='fmsFacilityType_auto_approve_P008UP']")
	private WebElement auto_appprove_facility_flag;
	public WebElement autoApproveFacilityFlag() {
		return auto_appprove_facility_flag;
	}
	
	@FindBy(xpath = "//button[@id='fmsFacilityTypeMaint_update_P008UP']")
	private WebElement update_after_approve_update_btn;
	public WebElement updateAfterApproveUpdateBtn() {
		return update_after_approve_update_btn;
	}
	
	@FindBy(xpath = "//input[@id='_popup_path_sol_confirm_ok']")
	private WebElement button_confirm_ok;
	public WebElement ButtonConfirmOk() {
		return button_confirm_ok;
	}
	
	@FindBy(xpath = "//input[@id='_popup_path_sol_ok']")
	private WebElement button_success_ok;
	public WebElement ButtonSuccessOk() {
		return button_success_ok;
	}
	
	@FindBy(xpath = "//a[@id='P008P']")
	private WebElement facility_type_approve_menu;
	public WebElement facilityTypeApproveMenu() {
		return facility_type_approve_menu;
	}
	
	@FindBy(xpath = "//input[@id='fmsFacilityTypeListGridTbl_Id_P008P_gs_CODE']")
	private WebElement approve_search_code;
	public WebElement approveSearchCode() {
		return approve_search_code;
	}
	
	@FindBy(xpath = "//td[@id='td_fmsFacilityTypeListGridTbl_Id_P008P_1_CODE']")
	private WebElement approve_code;
	public WebElement approveCode() {
		return approve_code;
	}
	
	@FindBy(xpath = "//*[@id=\"fmsFacilityTypeMaint_approve_P008P\"]")
	private WebElement approve_approve_btn;
	public WebElement approveApproveBtn() {
		return approve_approve_btn;
	}
	
	
	
	
////	@AT_RF_034_FMSParam
//	@FindBy(xpath = "//li[@id='fmsFacilityTypeReportTab_P008UP']")
//	private WebElement facility_type_facility_reports;
//	public WebElement facilityTypeFacilityReports() {
//		return facility_type_facility_reports;
//	}
//	
//	@FindBy(xpath = "//span[@id='spanLookup_fmsFacilityType_issue_facility_off_report_id_P008UP']")
//	private WebElement facility_reports_issue_facility_offer_lookup;
//	public WebElement facilityReportsIssueFacilityOfferLookup() {
//		return facility_reports_issue_facility_offer_lookup;
//	}
//	
//	@FindBy(xpath = "(//*[@id='4'])[2]")
//	private WebElement facility_reports_issue_facility_offer_lookup_data;
//	public WebElement facilityReportsIssueFacilityOfferLookupData() {
//		return facility_reports_issue_facility_offer_lookup_data;
//	}
//	
//	@FindBy(xpath = "//input[@id='fmsFacilityType_issue_facility_off_auto_print_P008UP']")
//	private WebElement facility_reports_issue_facility_offer_auto_print_flag;
//	public WebElement facilityReportsIssueFacilityOfferAutoPrintFlag() {
//		return facility_reports_issue_facility_offer_auto_print_flag;
//	}
	
////	@AT_RF_034_FMSCore
//	@FindBy(xpath = "//a[@id='WIFT005MT']")
//	private WebElement WIFAK_app_issue_facility_offer;
//	public WebElement WIFAKAppIssueFacilityOffer() {
//		return WIFAK_app_issue_facility_offer;
//	}
//	
//	@FindBy(xpath = "//input[@id='applicationFacilityGridTbl_Id_WIFT005MT_gs_fmsApplVO.CODE']")
//	private WebElement issue_facility_offer_search_code;
//	public WebElement issueFacilityOfferSearchCode() {
//		return issue_facility_offer_search_code;
//	}
//	
//	@FindBy(xpath = "//td[@id='td_applicationFacilityGridTbl_Id_WIFT005MT_1_fmsApplVO.CODE']")
//	private WebElement issue_facility_offer_search_result;
//	public WebElement issueFacilityOfferSearchResult() {
//		return issue_facility_offer_search_result;
//	}
//	
//	@FindBy(xpath = "//button[@id='applicationfacility_issueoffer_btn_WIFT005MT']")
//	private WebElement issue_facility_offer_issue_offer_btn;
//	public WebElement issueFacilityOfferIssueOfferBtn() {
//		return issue_facility_offer_issue_offer_btn;
//	}

		
	

	

    
    
    
}
