package pageobjects.CommonElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FMS_Result_RequestForFinacing_610_obj {

	WebDriver driver;

	public FMS_Result_RequestForFinacing_610_obj(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//td[text()='Request']")
	private WebElement FMS_core_request_module;
	public WebElement FMSCoreRequestModule_610() {
		return FMS_core_request_module;
	}
	
	@FindBy(xpath = "//td[text()='Request Financing']")
	private WebElement request_financing_feature;
	public WebElement requestFinancingFeature_610() {
		return request_financing_feature;
	}
	
	@FindBy(xpath = "//div[@id='_selenuimRFFRF00']//td[contains(text(),'Request')]")
	private WebElement request_for_financing_feature;
	public WebElement requestForFinancingFeature_610() {
		return request_for_financing_feature;
	}
	
	@FindBy(xpath = "//a[@id='RFFRF00MT']")
	private WebElement request_for_financing_maintanance;
	public WebElement requestForFinancingMaintanance_610() {
		return request_for_financing_maintanance;
	}
	
	@FindBy(xpath = "//select[@id='requestFinancingApplicationFor_RFFRF00MT']")
	private WebElement request_for_financing_main_reason_for_dropdown;
	public WebElement requestForFinancingMainReasonForDropdown_610() {
		return request_for_financing_main_reason_for_dropdown;
	}
	
	@FindBy(xpath = "//input[@id='lookuptxt_requestFinanacingCif_RFFRF00MT']")
	private WebElement request_for_financing_main_customer_input;
	public WebElement requestForFinancingMainCustomerInput_610() {
		return request_for_financing_main_customer_input;
	}
	
	@FindBy(xpath = "(//input[@id='requestFinancingCifShortNameEng_RFFRF00MT'])[1]")
	private WebElement request_for_financing_short_name_input;
	public WebElement requestForFinancingMainShortNameInput_610() {
		return request_for_financing_short_name_input;
	}
	
	@FindBy(xpath = "//input[@id='lookuptxt_requestFinancingFacilityType_RFFRF00MT']")
	private WebElement request_for_financing_main_facility_type_input;
	public WebElement requestForFinancingMainFacilityTypeInput_610() {
		return request_for_financing_main_facility_type_input;
	}
	
	@FindBy(xpath = "//input[@id='lookuptxt_requestFinancingFacilityCurrency_RFFRF00MT']")
	private WebElement request_for_financing_main_CY_input;
	public WebElement requestForFinancingMainCYInput_610() {
		return request_for_financing_main_CY_input;
	}
	
	@FindBy(xpath = "//input[@id='requestFinancingFacilityTotalvalue_RFFRF00MT']")
	private WebElement request_for_financing_main_total_limit_input;
	public WebElement requestForFinancingMainTotalLimitInput_610() {
		return request_for_financing_main_total_limit_input;
	}
	
	@FindBy(xpath = "//li[@id='requestFinancingLimitDtlsTabs_RFFRF00MT']")
	private WebElement request_for_financing_main_sublimit_tab;
	public WebElement requestForFinancingMainSublimitTab_610() {
		return request_for_financing_main_sublimit_tab;
	}
	
	@FindBy(xpath = "//td[@id='add_RequestFinancingLimitDetailsGridId_RFFRF00MT']")
	private WebElement request_for_financing_main_sublimit_tab_add_new_btn;
	public WebElement requestForFinancingMainSublimitTabAddNewBtn_610() {
		return request_for_financing_main_sublimit_tab_add_new_btn;
	}
	
	@FindBy(xpath = "//input[@id='lookuptxt_requestFinancingLimitDetailsGeneralFacilityProductClass_RFFRF00MT']")
	private WebElement request_for_financing_main_sublimit_tab_productclass_input;
	public WebElement requestForFinancingMainSublimitTabAddNewProductClassInput_610() {
		return request_for_financing_main_sublimit_tab_productclass_input;
	}
	
	@FindBy(xpath = "//input[@id='requestFinancingLimitDetailsRfNewMargin_RFFRF00MT']")
	private WebElement request_for_financing_main_sublimit_tab_margin_input;
	public WebElement requestForFinancingMainSublimitTabAddNewMarginInput_610() {
		return request_for_financing_main_sublimit_tab_margin_input;
	}
	
	@FindBy(xpath = "//button[@id='limitDetails_add_btn_RFFRF00MT']")
	private WebElement request_for_financing_main_sublimit_tab_add_btn;
	public WebElement requestForFinancingMainSublimitTabAddBtn_610() {
		return request_for_financing_main_sublimit_tab_add_btn;
	}
	
	@FindBy(xpath = "//button[@id='requestForFinance_save_as_draft_btn_RFFRF00MT']")
	private WebElement request_for_financing_main_save_btn;
	public WebElement requestForFinancingMainSaveBtn_610() {
		return request_for_financing_main_save_btn;
	}
	
	@FindBy(xpath = "//button[@id='requestForFinance_save_btn_RFFRF00MT']")
	private WebElement request_for_financing_main_validate_btn;
	public WebElement requestForFinancingMainValidateBtn_610() {
		return request_for_financing_main_validate_btn;
	}
	
	@FindBy(xpath = "//div[@id='div__popup_path_sol_ok']/div[2]/div")
	private WebElement success_popup_msg;
	public WebElement successPopupMsg_610() {
		return success_popup_msg;
	}	
	
	@FindBy(xpath = "/html/body/div[46]/div")
	private WebElement request_send_alert_popup;
	public WebElement RequestSendAlertPopup_610() {
		return request_send_alert_popup;
	}
	
	@FindBy(xpath = "/html/body/div[46]/div[1]/a/span")
	private WebElement request_send_alert_popup_close;
	public WebElement RequestSendAlertPopupClose_610() {
		return request_send_alert_popup_close;
	}	
	
	@FindBy(xpath = "//a[@id='dismissbut_RFFRF00MT']")
	private WebElement request_send_alert_popup_dismiss_btn;
	public WebElement requestSendAlertPopupDismissBtn_610() {
		return request_send_alert_popup_dismiss_btn;
	}
	
	@FindBy(xpath = "//a[@id='RFFRF00P1']")
	private WebElement request_for_financing_approve_level1;
	public WebElement requestForFinancingApproveLevel1_610() {
		return request_for_financing_approve_level1;
	}
	
	@FindBy(xpath = "//input[@id='requestFinancingGridTbl_Id_RFFRF00P1_gs_fmsRequestFinancingVO.CODE']")
	private WebElement request_for_financing_approve_level1_code;
	public WebElement requestForFinancingApproveLevel1Code_610() {
		return request_for_financing_approve_level1_code;
	}
	
	@FindBy(xpath = "//td[@id='td_requestFinancingGridTbl_Id_RFFRF00P1_1_fmsRequestFinancingVO.CODE']")
	private WebElement request_for_financing_approve_level1_first_row;
	public WebElement requestForFinancingApproveLevel1FirstRow_610() {
		return request_for_financing_approve_level1_first_row;
	}
	
	@FindBy(xpath = "//li[@id='customerGradingRecommendationsTab_RFFRF00P1']")
	private WebElement approve_level1_customer_grading_tab;
	public WebElement approveLevel1CustomerGradingTab_610() {
		return approve_level1_customer_grading_tab;
	}
	
	@FindBy(xpath = "//select[@id='requestDecisionForward_1_RFFRF00P1']")
	private WebElement approve_level1_customer_grading_approve_decision;
	public WebElement approveLevel1CustomerGradingApproveDecision_610() {
		return approve_level1_customer_grading_approve_decision;
	}
	
	@FindBy(xpath = "//select[@id='requestDecisionForwardP1_RFFRF00P1']")
	private WebElement approve_level1_customer_grading_approve_forward_to;
	public WebElement approveLevel1CustomerGradingApproveForwardTo_610() {
		return approve_level1_customer_grading_approve_forward_to;
	}
	
	@FindBy(xpath = "//select[@id='requestP1approvalCommitte_RFFRF00P1']")
	private WebElement approve_level1_customer_grading_approve_committee;
	public WebElement approveLevel1CustomerGradingApproveCommittee_610() {
		return approve_level1_customer_grading_approve_committee;
	}
	
	@FindBy(xpath = "//button[@id='requestForFinance_approve_btn_RFFRF00P1']")
	private WebElement request_for_financing_approve_level1_approve_Btn;
	public WebElement requestForFinancingApproveLevel1ApproveBtn_610() {
		return request_for_financing_approve_level1_approve_Btn;
	}	
	
	@FindBy(xpath = "//a[@id='RFFRF00AC']")
	private WebElement request_for_financing_approval_committee_recom;
	public WebElement requestForFinancingApprovalCommitteeRecom_610() {
		return request_for_financing_approval_committee_recom;
	}
	
	@FindBy(xpath = "//input[@id='requestFinancingGridTbl_Id_RFFRF00AC_gs_fmsRequestFinancingVO.CODE']")
	private WebElement request_for_financing_approval_committee_recom_code;
	public WebElement requestForFinancingApprovalCommitteeRecomCode_610() {
		return request_for_financing_approval_committee_recom_code;
	}
	
	@FindBy(xpath = "//td[@id='td_requestFinancingGridTbl_Id_RFFRF00AC_1_fmsRequestFinancingVO.CODE']")
	private WebElement request_for_financing_approval_committee_recom_row1;
	public WebElement requestForFinancingApprovalCommitteeRecomRow1_610() {
		return request_for_financing_approval_committee_recom_row1;
	}
	
	//---common steps
	
	@FindBy(xpath = "//a[@id='RFFRF00AC']")
	private WebElement ButtonConfirmOk_610;
	public WebElement ButtonConfirmOk_610() {
		return ButtonConfirmOk_610;
	}
	
	@FindBy(xpath = "//a[@id='RFFRF00AC']")
	private WebElement confirmPopup_610;
	public WebElement confirmPopup_610() {
		return confirmPopup_610;
	}
	
	@FindBy(xpath = "//a[@id='RFFRF00AC']")
	private WebElement facilityAlreadyCreatedPopup_610;
	public WebElement facilityAlreadyCreatedPopup_610() {
		return facilityAlreadyCreatedPopup_610;
	}
	
	@FindBy(xpath = "//a[@id='RFFRF00AC']")
	private WebElement successPopup_610;
	public WebElement successPopup_610() {
		return successPopup_610;
	}
	
	@FindBy(xpath = "//a[@id='RFFRF00AC']")
	private WebElement ButtonSuccessOk_610;
	public WebElement ButtonSuccessOk_610() {
		return ButtonSuccessOk_610;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
