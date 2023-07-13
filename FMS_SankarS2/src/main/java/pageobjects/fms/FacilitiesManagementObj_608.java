package pageobjects.fms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacilitiesManagementObj_608 {
	
	WebDriver driver;
	public FacilitiesManagementObj_608(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
//	@AT_FM_035
	@FindBy(xpath = "//td[text()='Facilities Management']")
	private WebElement request_facilities_management_feature;
	public WebElement requestFacilitiesManagementFeature_608() {
		return request_facilities_management_feature;
	}
	
	@FindBy(xpath = "//a[@id='RFFT008MT']")
	private WebElement request_facilities_management_maintanane;
	public WebElement requestFacilitiesManagementMaintanance_608() {
		return request_facilities_management_main_cif_limit_btn;
	}
	
	@FindBy(xpath = "//a[@id='infoBarSearchButton_RFFT008MT']")
	private WebElement request_facilities_management_main_search_btn;
	public WebElement requestFacilitiesManagementMainSearchBtn_608() {
		return request_facilities_management_main_cif_limit_btn;
	}
	
	@FindBy(xpath = "//input[@id='facilityManagementGridTbl_Id_RFFT008MT_gs_fmsFacilityVO.CIF']")
	private WebElement request_facilities_management_main_search_CIF_input;
	public WebElement requestFacilitiesManagementMainSearchCIFInput_608() {
		return request_facilities_management_main_cif_limit_btn;
	}
	
	@FindBy(xpath = "//td[@id='td_facilityManagementGridTbl_Id_RFFT008MT_1_fmsFacilityVO.CODE']")
	private WebElement request_facilities_management_main_search_row1;
	public WebElement requestFacilitiesManagementMainSearchRow1_608() {
		return request_facilities_management_main_cif_limit_btn;
	}
	
	@FindBy(xpath = "//input[@id='facilityMangementCode_RFFT008MT']")
	private WebElement request_facilities_management_main_code;
	public WebElement requestFacilitiesManagementMainCode_608() {
		return request_facilities_management_main_cif_limit_btn;
	}
	
	@FindBy(xpath = "//button[@id='facilityMgtCifLimitDetails_btn_RFFT008MT']")
	private WebElement request_facilities_management_main_cif_limit_btn;
	public WebElement requestFacilitiesManagementMainCIFLimitBtn_608() {
		return request_facilities_management_main_cif_limit_btn;
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
	
	@FindBy(xpath = "//label[@id='lbl_No_Of_Payments_WIFT001MT']")
	private WebElement wifak_limit_details_repayment_plan_tab_no_of_payments_label;
	public WebElement WifakLimitDetailsRepaymentPlanTabNoOfPaymentsLabel_608() {
		return wifak_limit_details_repayment_plan_tab_no_of_payments_label;
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
	
	@FindBy(xpath = "//div[@id='_selenuimWIFT008']/li/a/table/tbody/tr/td[2]")
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
	
	@FindBy(xpath = "//input[@id='facilityMangementCode_WIFT008MT']")
	private WebElement wifak_facilities_management_maintanance_code_input;
	public WebElement wifakFacilitiesManagementMaintananceCodeInput_608() {
		return wifak_facilities_management_maintanance_code_input;
	}
	
	@FindBy(xpath = "//input[@id='lookuptxt_facilityMgtMainApplicationRef_WIFT008MT']")
	private WebElement wifak_facilities_management_main_application_ref_input;
	public WebElement wifakFacilitiesManagementMainApplicationRefInput_608() {
		return wifak_facilities_management_main_application_ref_input;
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
	
	
//	@AT_FM_102	
	@FindBy(xpath = "//input[@id='1_fmsapplchargesVO.CHARGE_AMT_PER_INST_YN_FacilityChargesGrid_WIFT001MT']")
	private WebElement charges_details_collect_chgs_per_inst_approve_flag;
	public WebElement chargesDetailsCollectChgsPerInstApproveFlag_608() {
		return charges_details_collect_chgs_per_inst_approve_flag;
	}
	
	@FindBy(xpath = "//input[@id='1_fmsapplchargesVO.COLLECT_CHARGE_AT_DEAL_YN_FacilityChargesGrid_WIFT001MT']")
	private WebElement charges_details_collect_chgs_on_deal_approve_flag;
	public WebElement chargesDetailsCollectChgsOnDealApproveFlag_608() {
		return charges_details_collect_chgs_on_deal_approve_flag;
	}
	
	
//	@AT_FM_103
	@FindBy(xpath = "//input[@id='No_Of_Payments_WIFT008MT']")
	private WebElement wifak_facilities_management_main_facility_limit_details_repaymentplan_no_of_payments_input;
	public WebElement wifakFacilitiesManagementFacilityLimitDetailsRepaymentplanNoOfPaymentsInput_608() {
		return wifak_facilities_management_main_facility_limit_details_repaymentplan_no_of_payments_input;
	}
	
	@FindBy(xpath = "//table[@id='repaumentPlanScheduleGridTbl_Id_WIFT008MT']")
	private WebElement wifak_facilities_management_main_facility_limit_details_repaymentplan_schedule_table;
	public WebElement wifakFacilitiesManagementFacilityLimitDetailsRepaymentplanScheduleTable_608() {
		return wifak_facilities_management_main_facility_limit_details_repaymentplan_schedule_table;
	}
	
	@FindBy(xpath = "//span[text()='close']")
	private WebElement wifak_facilities_management_main_facility_limit_details_repaymentplan_close_icon;
	public WebElement wifakFacilitiesManagementFacilityLimitDetailsRepaymentplanCloseIcon_608() {
		return wifak_facilities_management_main_facility_limit_details_repaymentplan_close_icon;
	}
	
	@FindBy(xpath = "//button[@id='facilityManagement_chargesdtls_btn_WIFT008MT']")
	private WebElement wifak_facilities_management_main_facility_limit_details_charges_details_btn;
	public WebElement wifakFacilitiesManagementFacilityLimitDetailsChargesDetailsBtn_608() {
		return wifak_facilities_management_main_facility_limit_details_charges_details_btn;
	}
	
	@FindBy(xpath = "//td[@id='td_FacilityChargesGrid_WIFT008MT_0_rn']")
	private WebElement wifak_facilities_management_main_facility_limit_details_charges_details_row;
	public WebElement wifakFacilitiesManagementFacilityLimitDetailsChargesDetailsRow_608() {
		return wifak_facilities_management_main_facility_limit_details_charges_details_row;
	}
	
	@FindBy(xpath = "//input[@id='1_fmsapplchargesVO.COLLECT_AT_FAC_APPROVAL']")
	private WebElement wifak_facilities_management_main_facility_limit_details_charges_details_collect_fac_approval_flag;
	public WebElement wifakFacilitiesManagementFacilityLimitDetailsChargesDetailsCollectFacApprovalFlag_608() {
		return wifak_facilities_management_main_facility_limit_details_charges_details_collect_fac_approval_flag;
	}
	
	@FindBy(xpath = "//input[@id='1_fmsapplchargesVO.CHARGE_AMT_PER_INST_YN']")
	private WebElement wifak_facilities_management_main_facility_limit_details_charges_details_collect_chgs_per_PI_approve_flag;
	public WebElement wifakFacilitiesManagementFacilityLimitDetailsChargesDetailsCollectChgsPerPIApproveFlag_608() {
		return wifak_facilities_management_main_facility_limit_details_charges_details_collect_chgs_per_PI_approve_flag;
	}
	
	@FindBy(xpath = "//input[@id='1_fmsapplchargesVO.COLLECT_CHARGE_AT_DEAL_YN']")
	private WebElement wifak_facilities_management_main_facility_limit_details_charges_details_collect_chgs_deal_approve_flag;
	public WebElement wifakFacilitiesManagementFacilityLimitDetailsChargesDetailsCollectChgsDealApproveFlag_608() {
		return wifak_facilities_management_main_facility_limit_details_charges_details_collect_chgs_deal_approve_flag;
	}
	
	
	
//	@AT_FM_104
	@FindBy(xpath = "//button[@id='facilityMangementJVDetails_btn_WIFT008MT']")
	private WebElement wifak_facilities_management_main_journal_voucher_details_btn;
	public WebElement wifakFacilitiesManagementMaintananceJournalVoucherDetailsBtn_608() {
		return wifak_facilities_management_main_journal_voucher_details_btn;
	}
	
	@FindBy(xpath = "//table[@id='facManagementAccountJvList_Id_WIFT008MT']")
	private WebElement wifak_facilities_management_main_jv_details_tab_account_details;
	public WebElement wifakFacilitiesManagementMaintananceJVDetailsTabAccountDetails_608() {
		return wifak_facilities_management_main_jv_details_tab_account_details;
	}
	
	@FindBy(xpath = "//input[@id='on_bs_total_debit_WIFT008MT']")
	private WebElement wifak_facilities_management_main_jv_details_tab_total_debit_value;
	public WebElement wifakFacilitiesManagementMaintananceJVDetailsTabTotalDebitValue_608() {
		return wifak_facilities_management_main_jv_details_tab_total_debit_value;
	}
	
	@FindBy(xpath = "//input[@id='on_bs_total_credit_WIFT008MT']")
	private WebElement wifak_facilities_management_main_jv_details_tab_total_credit_value;
	public WebElement wifakFacilitiesManagementMaintananceJVDetailsTabTotalCreditValue_608() {
		return wifak_facilities_management_main_jv_details_tab_total_credit_value;
	}
	
	
//	@AT_FM_105
	@FindBy(xpath = "//input[@id='facilityMgtMainCif_WIFT008MT']")
	private WebElement wifak_facilities_management_main_CIF_no;
	public WebElement wifakFacilitiesManagementMainCIFNo_608() {
		return wifak_facilities_management_main_CIF_no;
	}
	
	@FindBy(xpath = "//li[@id='DocumentDetailsTab_WIFT008MT']")
	private WebElement wifak_facilities_management_main_Documents_details_tab;
	public WebElement wifakFacilitiesManagementMainDocumentsDetailsTab_608() {
		return wifak_facilities_management_main_Documents_details_tab;
	}
	
	// Documents Details Tab First row
	@FindBy(xpath = "//td[@id='td_FacilityManagementDocumentDetailsGrid_WIFT008MT_0_rn']")
	private WebElement wifak_facilities_management_main_Documents_details_first_row;
	public WebElement wifakFacilitiesManagementMainDocumentsDetailsFirstRow_608() {
		return wifak_facilities_management_main_Documents_details_first_row;
	}
	
	@FindBy(xpath = "//input[@id='1_fmsFacDocumentsVO.SOL_DATE_SENT_FacilityManagementDocumentDetailsGrid_WIFT008MT']" )
	private WebElement wifak_facilities_management_main_solicitor_date_sent_row1;
	public WebElement wifakFacilitiesManagementMainSolicitorDateSentRow1_608() {
		return wifak_facilities_management_main_solicitor_date_sent_row1;
	}
	
	@FindBy(xpath = "//input[@id='1_fmsFacDocumentsVO.SOL_DATE_REC_FacilityManagementDocumentDetailsGrid_WIFT008MT']" )
	private WebElement wifak_facilities_management_main_solicitor_date_received_row1;
	public WebElement wifakFacilitiesManagementMainSolicitorDateReceivedRow1_608() {
		return wifak_facilities_management_main_solicitor_date_received_row1;
	}
	
	@FindBy(xpath = "//input[@id='1_fmsFacDocumentsVO.EST_DATE_SENT_FacilityManagementDocumentDetailsGrid_WIFT008MT']")
	private WebElement wifak_facilities_management_main_estimator_date_sent_row1;
	public WebElement wifakFacilitiesManagementMainEstimatorDateSentRow1_608() {
		return wifak_facilities_management_main_estimator_date_sent_row1;
	}
	
	@FindBy(xpath = "//input[@id='1_fmsFacDocumentsVO.EST_DATE_REC_FacilityManagementDocumentDetailsGrid_WIFT008MT']")
	private WebElement wifak_facilities_management_main_estimator_date_received_row1;
	public WebElement wifakFacilitiesManagementMainEstimatorDateReceivedRow1_608() {
		return wifak_facilities_management_main_estimator_date_received_row1;
	}
	
	@FindBy(xpath = "//input[@id='1_fmsFacDocumentsVO.CUSTODIAN_SENT_FacilityManagementDocumentDetailsGrid_WIFT008MT']")
	private WebElement wifak_facilities_management_main_custodian_date_sent_row1;
	public WebElement wifakFacilitiesManagementMainCustodianDateSentRow1_608() {
		return wifak_facilities_management_main_custodian_date_sent_row1;
	}
	
	// Documents Details Tab Second Row
	@FindBy(xpath = "//td[@id='td_FacilityManagementDocumentDetailsGrid_WIFT008MT_1_rn']")
	private WebElement wifak_facilities_management_main_Documents_details_second_row;
	public WebElement wifakFacilitiesManagementMainDocumentsDetailsSecondRow_608() {
		return wifak_facilities_management_main_Documents_details_second_row;
	}
	
	@FindBy(xpath = "//input[@id='2_fmsFacDocumentsVO.SOL_DATE_SENT_FacilityManagementDocumentDetailsGrid_WIFT008MT']" )
	private WebElement wifak_facilities_management_main_solicitor_date_sent_row2;
	public WebElement wifakFacilitiesManagementMainSolicitorDateSentRow2_608() {
		return wifak_facilities_management_main_solicitor_date_sent_row2;
	}
	
	@FindBy(xpath = "//input[@id='2_fmsFacDocumentsVO.SOL_DATE_REC_FacilityManagementDocumentDetailsGrid_WIFT008MT']" )
	private WebElement wifak_facilities_management_main_solicitor_date_received_row2;
	public WebElement wifakFacilitiesManagementMainSolicitorDateReceivedRow2_608() {
		return wifak_facilities_management_main_solicitor_date_received_row2;
	}
	
	@FindBy(xpath = "//input[@id='2_fmsFacDocumentsVO.EST_DATE_SENT_FacilityManagementDocumentDetailsGrid_WIFT008MT']")
	private WebElement wifak_facilities_management_main_estimator_date_sent_row2;
	public WebElement wifakFacilitiesManagementMainEstimatorDateSentRow2_608() {
		return wifak_facilities_management_main_estimator_date_sent_row2;
	}
	
	@FindBy(xpath = "//input[@id='2_fmsFacDocumentsVO.EST_DATE_REC_FacilityManagementDocumentDetailsGrid_WIFT008MT']")
	private WebElement wifak_facilities_management_main_estimator_date_received_row2;
	public WebElement wifakFacilitiesManagementMainEstimatorDateReceivedRow2_608() {
		return wifak_facilities_management_main_estimator_date_received_row2;
	}
	
	@FindBy(xpath = "//input[@id='2_fmsFacDocumentsVO.CUSTODIAN_SENT_FacilityManagementDocumentDetailsGrid_WIFT008MT']")
	private WebElement wifak_facilities_management_main_custodian_date_sent_row2;
	public WebElement wifakFacilitiesManagementMainCustodianDateSentRow2_608() {
		return wifak_facilities_management_main_custodian_date_sent_row2;
	}
	
	
	@FindBy(xpath = "//button[@id='facilitymanagement_save_btn_WIFT008MT']")
	private WebElement wifak_facilities_management_maintanance_save_btn;
	public WebElement wifakFacilitiesManagementMaintananceSaveBtn_608() {
		return wifak_facilities_management_maintanance_save_btn;
	}
	
	@FindBy(xpath = "//div[@id='div__popup_path_sol_ok']//div[contains(text(),'Facility')]")
	private WebElement wifak_facilities_management_save_message;
	public WebElement wifakFacilitiesManagementSaveMessage_608() {
		return wifak_facilities_management_save_message;
	}
	
	@FindBy(xpath = "/html/body/div[28]/div[1]/a/span")
	private WebElement wifak_facilities_management_send_alert_popup;
	public WebElement wifakFacilitiesManagementSendAlertPopup_608() {
		return wifak_facilities_management_send_alert_popup;
	}
	
	// WIFAK Facilities Management Approve/Reject
	@FindBy(xpath = "//a[@id='WIFT008AP']")
	private WebElement wifak_facilities_management_approve_menu;
	public WebElement wifakFacilitiesManagementApproveMenu_608() {
		return wifak_facilities_management_approve_menu;
	}
	
	@FindBy(xpath = "//input[@id='facilityManagementGridTbl_Id_WIFT008AP_gs_fmsFacilityVO.FROM_APPLICATION']")
	private WebElement wifak_facilities_management_approve_search_app_ref_input;
	public WebElement wifakFacilitiesManagementApproveSearchAppRefInput_608() {
		return wifak_facilities_management_approve_search_app_ref_input;
	}
	
	@FindBy(xpath = "//td[@id='td_facilityManagementGridTbl_Id_WIFT008AP_1_fmsFacilityVO.CODE']")
	private WebElement wifak_facilities_management_approve_search_grid_first_row;
	public WebElement wifakFacilitiesManagementApproveSearchGridFirstRow_608() {
		return wifak_facilities_management_approve_search_grid_first_row;
	}
	
	@FindBy(xpath = "//input[@id='facilityMgtMainCif_WIFT008AP']")
	private WebElement wifak_facilities_management_approve_CIFNo_input;
	public WebElement wifakFacilitiesManagementApproveCIFNoInput_608() {
		return wifak_facilities_management_approve_CIFNo_input;
	}
	
	@FindBy(xpath = "//button[@id='facilityManagement_approve_btn_WIFT008AP']")
	private WebElement wifak_facilities_management_approve_menu_approve_btn;
	public WebElement wifakFacilitiesManagementApproveMenuApproveBtn_608() {
		return wifak_facilities_management_approve_menu_approve_btn;
	}
	
	// WIFAK Facilities Management Update after approve
	@FindBy(xpath = "//a[@id='WIFT008UP']")
	private WebElement wifak_facilities_management_update_after_approve_menu;
	public WebElement wifakFacilitiesManagementUpdateAfterApproveMenu_608() {
		return wifak_facilities_management_update_after_approve_menu;
	}
	
	@FindBy(xpath = "//input[@id='facilityManagementGridTbl_Id_WIFT008UP_gs_fmsFacilityVO.FROM_APPLICATION']")
	private WebElement wifak_facilities_management_update_after_approve_search_app_ref_input;
	public WebElement wifakFacilitiesManagementUpdateAfterApproveSearchAppRefInput_608() {
		return wifak_facilities_management_update_after_approve_search_app_ref_input;
	}
	
	@FindBy(xpath = "//td[@id='td_facilityManagementGridTbl_Id_WIFT008UP_1_fmsFacilityVO.CODE']")
	private WebElement wifak_facilities_management_update_after_approve_search_grid_first_row;
	public WebElement wifakFacilitiesManagementUpdateAfterApproveSearchGridFirstRow_608() {
		return wifak_facilities_management_update_after_approve_search_grid_first_row;
	}
	
	@FindBy(xpath = "//input[@id='facilityMgtMainCif_WIFT008UP']")
	private WebElement wifak_facilities_management_update_after_approve_CIFNo_input;
	public WebElement wifakFacilitiesManagementUpdateAfterApproveCIFNoInput_608() {
		return wifak_facilities_management_update_after_approve_CIFNo_input;
	}
	
	@FindBy(xpath = "//li[@id='facilityApplicationDetailsTab_WIFT008UP']")
	private WebElement wifak_facilities_management_update_after_approve_facility_app_details_tab;
	public WebElement wifakFacilitiesManagementUpdateAfterApproveFacilityAppDetailsTab_608() {
		return wifak_facilities_management_update_after_approve_facility_app_details_tab;
	}
	
	@FindBy(xpath = "//input[@id='lookuptxt_applicationFacilityRating_WIFT008UP']")
	private WebElement wifak_facilities_management_update_after_approve_facility_app_details_tab_facility_Rating;
	public WebElement wifakFacilitiesManagementUpdateAfterApproveFacilityAppDetailsTabFacilityRatingInput_608() {
		return wifak_facilities_management_update_after_approve_facility_app_details_tab_facility_Rating;
	}
	
	@FindBy(xpath = "//button[@id='facilitymanagement_save_btn_WIFT008UP']")
	private WebElement wifak_facilities_management_update_after_approve_Save_btn;
	public WebElement wifakFacilitiesManagementUpdateAfterApproveSaveBtn_608() {
		return wifak_facilities_management_update_after_approve_Save_btn;
	}
	
	@FindBy(xpath = "/html/body/div[22]/div[1]/a/span")
	private WebElement wifak_facilities_management_update_after_approve_send_alert_popup;
	public WebElement wifakFacilitiesManagementUpdateAfterApproveSendAlertPopup_608() {
		return wifak_facilities_management_update_after_approve_send_alert_popup;
	}
	
	//WIFAK Facilities Management Query menu
	@FindBy(xpath = "//a[@id='WIFT008QY']")
	private WebElement wifak_facilities_management_query_menu;
	public WebElement wifakFacilitiesManagementQueryMenu_608() {
		return wifak_facilities_management_query_menu;
	}
	
	@FindBy(xpath = "//input[@id='facilityManagementGridTbl_Id_WIFT008QY_gs_fmsFacilityVO.FROM_APPLICATION']")
	private WebElement wifak_facilities_management_query_search_app_ref_input;
	public WebElement wifakFacilitiesManagementQuerySearchAppRefInput_608() {
		return wifak_facilities_management_query_search_app_ref_input;
	}
	
	@FindBy(xpath = "//td[@id='td_facilityManagementGridTbl_Id_WIFT008QY_1_fmsFacilityVO.CODE']")
	private WebElement wifak_facilities_management_query_search_grid_first_row;
	public WebElement wifakFacilitiesManagementQuerySearchGridFirstRow_608() {
		return wifak_facilities_management_query_search_grid_first_row;
	}
	
	@FindBy(xpath = "//input[@id='facilityMgtMainCif_WIFT008QY']")
	private WebElement wifak_facilities_management_query_CIFNo_input;
	public WebElement wifakFacilitiesManagementQueryCIFNoInput_608() {
		return wifak_facilities_management_query_CIFNo_input;
	}
	
	@FindBy(xpath = "//input[@id='statusDesc_WIFT008QY']")
	private WebElement wifak_facilities_management_query_status;
	public WebElement wifakFacilitiesManagementQueryStatus_608() {
		return wifak_facilities_management_query_status;
	}
	
	// WIFAK Facilities Management Approve and Suspend menu
	@FindBy(xpath = "//a[@id='WIFT008SP']")
	private WebElement wifak_facilities_management_suspend_menu;
	public WebElement wifakFacilitiesManagementSuspendMenu_608() {
		return wifak_facilities_management_suspend_menu;
	}
	
	@FindBy(xpath = "//input[@id='facilityManagementGridTbl_Id_WIFT008SP_gs_fmsFacilityVO.FROM_APPLICATION']")
	private WebElement wifak_facilities_management_suspend_search_app_ref_input;
	public WebElement wifakFacilitiesManagementSuspendSearchAppRefInput_608() {
		return wifak_facilities_management_suspend_search_app_ref_input;
	}
	
	@FindBy(xpath = "//td[@id='td_facilityManagementGridTbl_Id_WIFT008SP_1_fmsFacilityVO.CODE']")
	private WebElement wifak_facilities_management_suspend_search_grid_first_row;
	public WebElement wifakFacilitiesManagementSuspendSearchGridFirstRow_608() {
		return wifak_facilities_management_suspend_search_grid_first_row;
	}
	
	@FindBy(xpath = "//input[@id='facilityMgtMainCif_WIFT008SP']")
	private WebElement wifak_facilities_management_suspend_CIFNo_input;
	public WebElement wifakFacilitiesManagementSuspendCIFNoInput_608() {
		return wifak_facilities_management_suspend_CIFNo_input;
	}
	
	@FindBy(xpath = "//input[@id='lookuptxt_facilityMgtMainSuspendReason_WIFT008SP']")
	private WebElement wifak_facilities_management_suspend_reason_input;
	public WebElement wifakFacilitiesManagementSuspendReasonInput_608() {
		return wifak_facilities_management_suspend_reason_input;
	}
	
	@FindBy(xpath = "//input[@id='suspendReasonDesc_WIFT008SP']")
	private WebElement wifak_facilities_management_suspend_reason_input_label;
	public WebElement wifakFacilitiesManagementSuspendReasonInputLabel_608() {
		return wifak_facilities_management_suspend_reason_input_label;
	}
	
	@FindBy(xpath = "//button[@id='facilityManagement_suspend_btn_WIFT008SP']")
	private WebElement wifak_facilities_management_suspend_menu_suspend_btn;
	public WebElement wifakFacilitiesManagementSuspendMenuSuspendBtn_608() {
		return wifak_facilities_management_suspend_menu_suspend_btn;
	}
	
	
	// WIFAK Facilities Management Reactive menu
	@FindBy(xpath = "//a[@id='WIFT008RA']")
	private WebElement wifak_facilities_management_reactivate_menu;
	public WebElement wifakFacilitiesManagementReactivateMenu_608() {
		return wifak_facilities_management_reactivate_menu;
	}
	
	@FindBy(xpath = "//input[@id='facilityManagementGridTbl_Id_WIFT008RA_gs_fmsFacilityVO.FROM_APPLICATION']")
	private WebElement wifak_facilities_management_reactivate_search_app_ref_input;
	public WebElement wifakFacilitiesManagementReactivateSearchAppRefInput_608() {
		return wifak_facilities_management_reactivate_search_app_ref_input;
	}
	
	@FindBy(xpath = "//td[@id='td_facilityManagementGridTbl_Id_WIFT008RA_1_fmsFacilityVO.CODE']")
	private WebElement wifak_facilities_management_reactivate_search_grid_first_row;
	public WebElement wifakFacilitiesManagementReactivateSearchGridFirstRow_608() {
		return wifak_facilities_management_reactivate_search_grid_first_row;
	}
	
	@FindBy(xpath = "//input[@id='facilityMgtMainCif_WIFT008RA']")
	private WebElement wifak_facilities_management_reactivate_CIFNo_input;
	public WebElement wifakFacilitiesManagementReactivateCIFNoInput_608() {
		return wifak_facilities_management_reactivate_CIFNo_input;
	}
	
	@FindBy(xpath = "//button[@id='facilityManagement_reactivate_btn_WIFT008RA']")
	private WebElement wifak_facilities_management_reactivate_menu_reactivate_btn;
	public WebElement wifakFacilitiesManagementReactivateReactivateBtn_608() {
		return wifak_facilities_management_reactivate_menu_reactivate_btn;
	}
	
	// WIFAK Facilities Management Reverse menu
	@FindBy(xpath = "//a[@id='WIFT008RV']")
	private WebElement wifak_facilities_management_reverse_menu;
	public WebElement wifakFacilitiesManagementReverseMenu_608() {
		return wifak_facilities_management_reverse_menu;
	}
	
	@FindBy(xpath = "//input[@id='facilityManagementGridTbl_Id_WIFT008RV_gs_fmsFacilityVO.FROM_APPLICATION']")
	private WebElement wifak_facilities_management_reverse_search_app_ref_input;
	public WebElement wifakFacilitiesManagementReverseSearchAppRefInput_608() {
		return wifak_facilities_management_reverse_search_app_ref_input;
	}
	
	@FindBy(xpath = "//td[@id='td_facilityManagementGridTbl_Id_WIFT008RV_1_fmsFacilityVO.CODE']")
	private WebElement wifak_facilities_management_reverse_search_grid_first_row;
	public WebElement wifakFacilitiesManagementReverseSearchGridFirstRow_608() {
		return wifak_facilities_management_reverse_search_grid_first_row;
	}
	
	@FindBy(xpath = "//input[@id='facilityMgtMainCif_WIFT008RV']")
	private WebElement wifak_facilities_management_reverse_CIFNo_input;
	public WebElement wifakFacilitiesManagementReverseCIFNoInput_608() {
		return wifak_facilities_management_reverse_CIFNo_input;
	}
	
	@FindBy(xpath = "//button[@id='facilityManagement_reverse_btn_WIFT008RV']")
	private WebElement wifak_facilities_management_reverse_menu_reverse_btn;
	public WebElement wifakFacilitiesManagementReverseMenuReverseBtn_608() {
		return wifak_facilities_management_reverse_menu_reverse_btn;
	}
	
	// WIFAK Facilities Management Approve/Reject Reverse menu
	@FindBy(xpath = "//a[@id='WIFT008RR']")	
	private WebElement wifak_facilities_management_approve_reverse_menu;
	public WebElement wifakFacilitiesManagementApproveReverseMenu_608() {
		return wifak_facilities_management_approve_reverse_menu;
	}
	
	@FindBy(xpath = "//input[@id='facilityManagementGridTbl_Id_WIFT008RR_gs_fmsFacilityVO.FROM_APPLICATION']")
	private WebElement wifak_facilities_management_approve_reverse_search_app_ref_input;
	public WebElement wifakFacilitiesManagementApproveReverseSearchAppRefInput_608() {
		return wifak_facilities_management_approve_reverse_search_app_ref_input;
	}
	
	@FindBy(xpath = "//td[@id='td_facilityManagementGridTbl_Id_WIFT008RR_1_fmsFacilityVO.CODE']")
	private WebElement wifak_facilities_management_approve_reverse_search_grid_first_row;
	public WebElement wifakFacilitiesManagementApproveReverseSearchGridFirstRow_608() {
		return wifak_facilities_management_approve_reverse_search_grid_first_row;
	}
	
	@FindBy(xpath = "//input[@id='facilityMgtMainCif_WIFT008RR']")
	private WebElement wifak_facilities_management_approve_reverse_CIFNo_input;
	public WebElement wifakFacilitiesManagementApproveReverseCIFNoInput_608() {
		return wifak_facilities_management_approve_reverse_CIFNo_input;
	}
	
	@FindBy(xpath = "//button[@id='facilityManagement_approve_reverse_btn_WIFT008RR']")
	private WebElement wifak_facilities_management_approve_reverse_menu_approve_reverse_btn;
	public WebElement wifakFacilitiesManagementApproveReverseMenuApproveReverseBtn_608() {
		return wifak_facilities_management_approve_reverse_menu_approve_reverse_btn;
	}
	
	@FindBy(xpath = "//button[@id='facilityManagement_reject_reverse_btn_WIFT008RR']")
	private WebElement wifak_facilities_management_approve_reverse_menu_reject_reverse_btn;
	public WebElement wifakFacilitiesManagementApproveReverseMenuRejectReverseBtn_608() {
		return wifak_facilities_management_approve_reverse_menu_reject_reverse_btn;
	}
	
	
	//WIFAK Facilities Management Cancel menu
	@FindBy(xpath = "//a[@id='WIFT008CN']")
	private WebElement wifak_facilities_management_cancel_reverse_menu;
	public WebElement wifakFacilitiesManagementCancelMenu_608() {
		return wifak_facilities_management_cancel_reverse_menu;
	}
	
	@FindBy(xpath = "//input[@id='facilityManagementGridTbl_Id_WIFT008CN_gs_fmsFacilityVO.FROM_APPLICATION']")
	private WebElement wifak_facilities_management_cancel_search_app_ref_input;
	public WebElement wifakFacilitiesManagementCancelSearchAppRefInput_608() {
		return wifak_facilities_management_cancel_search_app_ref_input;
	}
	
	@FindBy(xpath = "//td[@id='td_facilityManagementGridTbl_Id_WIFT008CN_1_fmsFacilityVO.CODE']")
	private WebElement wifak_facilities_management_cancel_search_grid_first_row;
	public WebElement wifakFacilitiesManagementCancelSearchGridFirstRow_608() {
		return wifak_facilities_management_cancel_search_grid_first_row;
	}
	
	@FindBy(xpath = "//input[@id='facilityMgtMainCif_WIFT008CN']")
	private WebElement wifak_facilities_management_cancel_CIFNo_input;
	public WebElement wifakFacilitiesManagementCancelCIFNoInput_608() {
		return wifak_facilities_management_cancel_CIFNo_input;
	}
	
	@FindBy(xpath = "//button[@id='facilityManagement_cancel_btn_WIFT008CN']")
	private WebElement wifak_facilities_management_cancel_menu_cancel_btn;
	public WebElement wifakFacilitiesManagementCancelMenuCancelBtn_608() {
		return wifak_facilities_management_cancel_menu_cancel_btn;
	}
	
	//WIFAK Facilities Management Approve/Reject Cancel menu
	@FindBy(xpath = "//a[@id='WIFT008CR']")
	private WebElement wifak_facilities_management_approve_cancel_menu;
	public WebElement wifakFacilitiesManagementApproveCancelMenu_608() {
		return wifak_facilities_management_approve_cancel_menu;
	}
	
	@FindBy(xpath = "//input[@id='facilityManagementGridTbl_Id_WIFT008CR_gs_fmsFacilityVO.FROM_APPLICATION']")
	private WebElement wifak_facilities_management_approve_cancel_search_app_ref_input;
	public WebElement wifakFacilitiesManagementApproveCancelSearchAppRefInput_608() {
		return wifak_facilities_management_approve_cancel_search_app_ref_input;
	}
	
	@FindBy(xpath = "//td[@id='td_facilityManagementGridTbl_Id_WIFT008CR_1_fmsFacilityVO.CODE']")
	private WebElement wifak_facilities_management_approve_cancel_search_grid_first_row;
	public WebElement wifakFacilitiesManagementApproveCancelSearchGridFirstRow_608() {
		return wifak_facilities_management_approve_cancel_search_grid_first_row;
	}
	
	@FindBy(xpath = "//input[@id='facilityMgtMainCif_WIFT008CR']")
	private WebElement wifak_facilities_management_approve_cancel_CIFNo_input;
	public WebElement wifakFacilitiesManagementApproveCancelCIFNoInput_608() {
		return wifak_facilities_management_approve_cancel_CIFNo_input;
	}
	
	@FindBy(xpath = "//button[@id='facilityManagement_approve_cancel_btn_WIFT008CR']")
	private WebElement wifak_facilities_management_approve_cancel_menu_approve_reverse_btn;
	public WebElement wifakFacilitiesManagementApproveCancelMenuApproveCancelBtn_608() {
		return wifak_facilities_management_approve_cancel_menu_approve_reverse_btn;
	}
	
	
	
	
}
