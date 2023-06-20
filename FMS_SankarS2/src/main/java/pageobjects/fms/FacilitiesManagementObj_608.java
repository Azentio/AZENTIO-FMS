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
	
	@FindBy(xpath = "//input[@id='lookuptxt_facilityMgtMainApplicationRef_WIFT008MT']")
	private WebElement wifak_facilities_management_main_application_ref;
	public WebElement wifakFacilitiesManagementMainApplicationRef_608() {
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
	
	
}
