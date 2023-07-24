package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Facility_TypeObj_608 {
	
	WebDriver driver;
	public Facility_TypeObj_608(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
//	@AT_AFF_098_FMSParam	
	@FindBy(xpath = "//td[text()='Parameters']")
	private WebElement fms_param_parameter;
	public WebElement fmsParamParameter_608() {
		return fms_param_parameter;
	}
	
	@FindBy(xpath = "//td[text()='Facility Type']")
	private WebElement param_facility_type;
	public WebElement paramFacilityType_608() {
		return param_facility_type;
	}
	
	@FindBy(xpath = "//a[@id='P008UP']")
	private WebElement facility_type_update_after_approve;
	public WebElement facilityTypeUpdateAfterApprove_608() {
		return facility_type_update_after_approve;
	}
	
	@FindBy(id = "fmsFacilityTypeListGridTbl_Id_P008UP_gs_CODE")
	private WebElement facility_type_search_code;
	public WebElement facilityTypeSearchCode_608() {
		return facility_type_search_code;
	}
	
	@FindBy(id = "td_fmsFacilityTypeListGridTbl_Id_P008UP_1_CODE")
	private WebElement facility_type_search_code_result;
	public WebElement facilityTypeSearchCodeResult_608() {
		return facility_type_search_code_result;
	}
	
	@FindBy(xpath = "//li[@id='fmsFacilityTypeDetailsTab_P008UP']")
	private WebElement facilty_type_facility_details;
	public WebElement facilityTypeFacilityDetails_608() {
		return facilty_type_facility_details;
	}
	
	@FindBy(id = "Fms_facility_type_stp_facility_requirments_Div_P008UP")
	private WebElement STP_facility_req;
	public WebElement STPFacilityReq_608() {
		return STP_facility_req;
	}
	
	@FindBy(xpath = "//input[@id='fmsFacilityType_customer_grading_P008UP']")
	private WebElement customer_grading_flag;
	public WebElement customerGradingFlag_608() {
		return customer_grading_flag;
	}
	
	@FindBy(xpath = "//input[@id='fmsFacilityType_grade_overwrite_P008UP']")
	private WebElement overwrite_grading_flag;
	public WebElement OverwriteGradingFlag_608() {
		return overwrite_grading_flag;
	}
	
	@FindBy(xpath = "//input[@id='fmsFacilityType_credit_review_P008UP']")
	private WebElement credit_review_flag;
	public WebElement creditReviewFlag_608() {
		return credit_review_flag;
	}
	
	@FindBy(xpath = "//input[@id='fmsFacilityType_committee_approval_P008UP']")
	private WebElement committee_approval_flag;
	public WebElement committeeApprovalFlag_608() {
		return committee_approval_flag;
	}
	
	@FindBy(xpath = "//select[@id='fmsFacilityType_members_number_P008UP']")
	private WebElement committee_approval_flag_member_dropdown;
	public WebElement committeeApprovalFlagMemberDropdown_608() {
		return committee_approval_flag_member_dropdown;
	}
	
	@FindBy(xpath = "//input[@id='fmsFacilityType_credit_authorize_P008UP']")
	private WebElement credit_authorzie_flag;
	public WebElement creditAuthorzieFlag_608() {
		return credit_authorzie_flag;
	}
	
	@FindBy(xpath = "//input[@id='fmsFacilityType_issue_offer_P008UP']")
	private WebElement issue_facility_offer_flag;
	public WebElement issueFacilityOfferFlag_608() {
		return issue_facility_offer_flag;
	}

	@FindBy(xpath = "//input[@id='fmsFacilityType_client_response_P008UP']")
	private WebElement client_response_flag;
	public WebElement clientResponseFlag_608() {
		return client_response_flag;
	}
	
	@FindBy(xpath = "//input[@id='fmsFacilityType_document_validation_yn_P008UP']")
	private WebElement document_validation_flag;
	public WebElement documentValidationFlag_608() {
		return document_validation_flag;
	}
	
	@FindBy(xpath = "//input[@id='fmsFacilityType_final_approval_P008UP']")
	private WebElement final_approval_flag;
	public WebElement finalApprovalFlag_608() {
		return final_approval_flag;
	}
		
	@FindBy(xpath = "//input[@id='fmsFacilityType_active_facility_P008UP']")
	private WebElement create_active_facility_flag;
	public WebElement createActiveFacilityFlag_608() {
		return create_active_facility_flag;
	}	
	
	@FindBy(xpath = "//input[@id='fmsFacilityType_auto_approve_P008UP']")
	private WebElement auto_appprove_facility_flag;
	public WebElement autoApproveFacilityFlag_608() {
		return auto_appprove_facility_flag;
	}
	
	@FindBy(xpath = "//button[@id='fmsFacilityTypeMaint_update_P008UP']")
	private WebElement update_after_approve_update_btn;
	public WebElement updateAfterApproveUpdateBtn_608() {
		return update_after_approve_update_btn;
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
	
	@FindBy(xpath = "//a[@id='P008P']")
	private WebElement facility_type_approve_menu;
	public WebElement facilityTypeApproveMenu_608() {
		return facility_type_approve_menu;
	}
	
	@FindBy(xpath = "//input[@id='fmsFacilityTypeListGridTbl_Id_P008P_gs_CODE']")
	private WebElement approve_search_code;
	public WebElement approveSearchCode_608() {
		return approve_search_code;
	}
	
	@FindBy(xpath = "//td[@id='td_fmsFacilityTypeListGridTbl_Id_P008P_1_CODE']")
	private WebElement approve_search_code_result;
	public WebElement approveSearchCodeResult_608() {
		return approve_search_code_result;
	}
	
	@FindBy(xpath = "//input[@id='fmsFacilityType_code_P008P']")
	private WebElement facility_type_approve_menu_code;
	public WebElement facilityTypeApproveMenuCode_608() {
		return facility_type_approve_menu_code;
	}
	
	@FindBy(xpath = "//*[@id=\"fmsFacilityTypeMaint_approve_P008P\"]")
	private WebElement facility_type_approve_btn;
	public WebElement facilityTypeApproveBtn_608() {
		return facility_type_approve_btn;
	}
	
	
//	@AT_RF_034_FMSParam
	@FindBy(xpath = "//li[@id='fmsFacilityTypeReportTab_P008UP']")
	private WebElement facility_type_facility_reports;
	public WebElement facilityTypeFacilityReports_608() {
		return facility_type_facility_reports;
	}
	
	@FindBy(xpath = "//span[@id='spanLookup_fmsFacilityType_issue_facility_off_report_id_P008UP']")
	private WebElement facility_reports_issue_facility_offer_lookup;
	public WebElement facilityReportsIssueFacilityOfferLookup_608() {
		return facility_reports_issue_facility_offer_lookup;
	}
	
	@FindBy(xpath = "(//*[@id='4'])[2]")
	private WebElement facility_reports_issue_facility_offer_lookup_data;
	public WebElement facilityReportsIssueFacilityOfferLookupData_608() {
		return facility_reports_issue_facility_offer_lookup_data;
	}
	
	@FindBy(xpath = "//input[@id='fmsFacilityType_issue_facility_off_auto_print_P008UP']")
	private WebElement facility_reports_issue_facility_offer_auto_print_flag;
	public WebElement facilityReportsIssueFacilityOfferAutoPrintFlag_608() {
		return facility_reports_issue_facility_offer_auto_print_flag;
	}
	
//	@AT_RF_099_FMSParam
	@FindBy(xpath = "//div[@id='Fms_facility_type_app_requirments_details_Div_P008UP']")
	private WebElement application_req_details;
	public WebElement applicationReqDetails_608() {
		return application_req_details;
	}
	
	@FindBy(xpath = "//select[@id='fmsFacilityType_collateral_P008UP']")
	private WebElement select_collateral;
	public WebElement selectCollateral_608() {
		return select_collateral;
	}
	
	@FindBy(xpath = "//select[@id='fmsFacilityType_coll_defined_level_P008UP']")
	private WebElement select_collateral_defined_level;
	public WebElement selectCollateralDefinedLevel_608() {
		return select_collateral_defined_level;
	}
	
	@FindBy(xpath = "//input[@id='fmsFacilityType_chek_collat_valid_at_facility_P008UP']")
	private WebElement check_collateral_facility;
	public WebElement checkCollateralFacility_608() {
		return check_collateral_facility;
	}
	
	
//  @AT_RF_101_FMSParam
	@FindBy(xpath = "//td[text()='Document Checklist']")
	private WebElement param_document_checklist;
	public WebElement paramDocumentChecklist_608() {
		return param_document_checklist;
	}
	
	@FindBy(xpath = "//a[@id='P0031UP']")
	private WebElement document_checklist_update_after_approve;
	public WebElement documentChecklistUpdateAfterApprove_608() {
		return document_checklist_update_after_approve;
	}
	
	@FindBy(xpath = "//td[@id='td_fmsDocumentChecklistParamListGridTbl_Id_P0031UP_2_CODE']")
	private WebElement document_checklist_code;
	public WebElement documentChecklistCode_608() {
		return document_checklist_code;
	}
	
	@FindBy(xpath = "//td[@id='add_fmsParamDocChecklistGridTbl_Id_P0031UP']")
	private WebElement document_checklist_add_new_btn;
	public WebElement documentChecklistAddNewBtn_608() {
		return document_checklist_add_new_btn;
	}
	
	@FindBy(xpath = "//td[@id='del_fmsParamDocChecklistGridTbl_Id_P0031UP']")
	private WebElement document_checklist_delete_btn;
	public WebElement documentChecklistDeleteBtn_608() {
		return document_checklist_delete_btn;
	}	
	
	@FindBy(xpath = "//td[@id='td_fmsParamDocChecklistGridTbl_Id_P0031UP_1_rn']")
	private WebElement document_checklist_row2;
	public WebElement documentChecklistRow2_608() {
		return document_checklist_row2;
	}
	
	@FindBy(xpath = "//td[@id='td_fmsParamDocChecklistGridTbl_Id_P0031UP_1_fmsdocchecklist_DETVO.DOC_TYPE']//input")
	private WebElement document_checklist_doctype_input;
	public WebElement documentChecklistDoctypeInput_608() {
		return document_checklist_doctype_input;
	}
	
	@FindBy(xpath = "//td[@id='td_fmsParamDocChecklistGridTbl_Id_P0031UP_1_fmsdocchecklist_DETVO.DOC_TITLE']/input")
	private WebElement document_checklist_doctitle_input;
	public WebElement documentChecklistDoctitleInput_608() {
		return document_checklist_doctitle_input;
	}
	
	@FindBy(xpath = "//button[@id='fmsDocumentChecklistParamMaint_update_P0031UP']")
	private WebElement document_checklist_update_btn;
	public WebElement documentChecklistUpdateBtn_608() {
		return document_checklist_update_btn;
	}
	
	@FindBy(xpath = "//a[@id='P0031P']")
	private WebElement document_checklist_approve_menu;
	public WebElement documentChecklistApproveMenu_608() {
		return document_checklist_approve_menu;
	}
	
	@FindBy(xpath = "//td[@id='td_fmsDocumentChecklistParamListGridTbl_Id_P0031P_1_CODE']")
	private WebElement document_checklist_approve_code;
	public WebElement documentChecklistApproveCode_608() {
		return document_checklist_approve_code;
	}
	
	@FindBy(xpath = "//button[@id='fmsDocumentChecklistParamMaint_approve_P0031P']")
	private WebElement document_checklist_approve_btn;
	public WebElement documentChecklistApproveBtn_608() {
		return document_checklist_approve_btn;
	}
	
	
	@FindBy(xpath = "//li[@id='fmsFacilityTypeDocManagementTab_P008UP']")
	private WebElement facility_type_Doc_management_tab;
	public WebElement facilityTypeDocManagementTab_608() {
		return facility_type_Doc_management_tab;
	}
	
	@FindBy(xpath = "//td[@id='td_FmsFacilityTypeDocManagementGrid_P008UP_1_screenReference']")
	private WebElement application_creation_label;
	public WebElement applicationCreationLabel_608() {
		return application_creation_label;
	}
	
	@FindBy(xpath = "//input[@gridid='FmsFacilityTypeDocManagementGrid_P008UP']")
	private WebElement application_creation_checkbox;
	public WebElement applicationCreationCheckbox_608() {
		return application_creation_checkbox;
	}
	

}
