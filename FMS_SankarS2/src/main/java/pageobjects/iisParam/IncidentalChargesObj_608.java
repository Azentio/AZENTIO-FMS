package pageobjects.iisParam;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IncidentalChargesObj_608 {
	
	WebDriver driver;
	public IncidentalChargesObj_608(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	// Clear cache for FMS Core
	@FindBy(xpath = "//span[@id='tech_details_icon']")
	private WebElement IIS_core_tech_details_icon;
	public WebElement IISCoreTechDetailsIcon_608() {
		return IIS_core_tech_details_icon;
	}
	
	@FindBy(xpath = "//label[@id='clear_cache_key']")
	private WebElement IIS_core_clear_cache_btn;
	public WebElement IISCoreClearCacheBtn_608() {
		return IIS_core_clear_cache_btn;
	}
	
//	Investment Deals -Combined without Trade Deal
	@FindBy(xpath = "//td[text()='Investment Deals -Combined without Trade Deal']")
	private WebElement IIS_investment_deal_without_trade_deal_menu;
	public WebElement IISInvestmentDealWithoutTradeDealMenu_608(){
		return IIS_investment_deal_without_trade_deal_menu;
	}
	
	@FindBy(xpath = "//a[@id='T022MT']")
	private WebElement IIS_investment_deal_without_trade_deal_maintenance_menu;
	public WebElement IISInvestmentDealWithoutTradeDealMaintenanceMenu_608(){
		return IIS_investment_deal_without_trade_deal_maintenance_menu;
	}
	
	@FindBy(xpath = "//input[@id='lookuptxt_investmentDeals_PARTY_T022MT']")
	private WebElement IIS_investment_deal_without_trade_deal_main_party_input;
	public WebElement IISInvestmentDealWithoutTradeDealMainPartyInput_608(){
		return IIS_investment_deal_without_trade_deal_main_party_input;
	}
	
//	Category input ==> Charge code 
	@FindBy(xpath = "//input[@id='lookuptxt_trsdealVO_DEAL_TYPE_T022MT']")
	private WebElement IIS_investment_deal_without_trade_deal_main_category_input;
	public WebElement IISInvestmentDealWithoutTradeDealMainCategoryInput_608(){
		return IIS_investment_deal_without_trade_deal_main_category_input;
	}
	
	@FindBy(xpath = "//input[@id='lookuptxt_investmentDeals_CLASS_T022MT']")
	private WebElement IIS_investment_deal_without_trade_deal_main_product_class_input;
	public WebElement IISInvestmentDealWithoutTradeDealMainProductClassInput_608(){
		return IIS_investment_deal_without_trade_deal_main_product_class_input;
	}
	
	@FindBy(xpath = "//input[@id='trsdealVO_DD_DEAL_AMOUNT_T022MT']")
	private WebElement IIS_investment_deal_without_trade_deal_main_amount_input;
	public WebElement IISInvestmentDealWithoutTradeDealMainAmountInput_608(){
		return IIS_investment_deal_without_trade_deal_main_amount_input;
	}
	
	@FindBy(xpath = "//li[@id='investmentDealsMainTabs2_T022MT']")
	private WebElement IIS_investment_deal_without_trade_deal_main_contributor_tab;
	public WebElement IISInvestmentDealWithoutTradeDealMainContributorTab_608(){
		return IIS_investment_deal_without_trade_deal_main_contributor_tab;
	}
	
	@FindBy(xpath = "//td[@id='td_ContributorDetailsGridTbl_Id_T022MT_1_rn']")
	private WebElement IIS_investment_deal_without_trade_deal_main_contributor_tab_row;
	public WebElement IISInvestmentDealWithoutTradeDealMainContributorTabRow_608(){
		return IIS_investment_deal_without_trade_deal_main_contributor_tab_row;
	}
	
	@FindBy(xpath = "//span[@id='spanLookup_nostro_sl_T022MT']")
	private WebElement IIS_investment_deal_without_trade_deal_main_contributor_details_nostro_lookup;
	public WebElement IISInvestmentDealWithoutTradeDealMainContributorDetailsNostroLookup_608(){
		return IIS_investment_deal_without_trade_deal_main_contributor_details_nostro_lookup;
	}
	
	@FindBy(xpath = "//td[@id='td_gridtab_nostro_sl_T022MT_1_amfVO.BRANCH_CODE']")
	private WebElement IIS_investment_deal_without_trade_deal_main_contributor_details_nostro_lookup_row;
	public WebElement IISInvestmentDealWithoutTradeDealMainContributorDetailsNostroLookupRow_608(){
		return IIS_investment_deal_without_trade_deal_main_contributor_details_nostro_lookup_row;
	}
	
	@FindBy(xpath = "//input[@id='nostro_acc_ref_T022MT']")
	private WebElement IIS_investment_deal_without_trade_deal_main_contributor_details_nostro_input;
	public WebElement IISInvestmentDealWithoutTradeDealMainContributorDetailsNostroInput_608(){
		return IIS_investment_deal_without_trade_deal_main_contributor_details_nostro_input;
	}
	
	@FindBy(xpath = "//span[@id='spanLookup_matr_ac_sl_T022MT']")
	private WebElement IIS_investment_deal_without_trade_deal_main_contributor_details_maturity_lookup;
	public WebElement IISInvestmentDealWithoutTradeDealMainContributorDetailsMaturityLookup_608(){
		return IIS_investment_deal_without_trade_deal_main_contributor_details_maturity_lookup;
	}
	
	@FindBy(xpath = "//td[@id='td_gridtab_matr_ac_sl_T022MT_1_amfVO.BRANCH_CODE']")
	private WebElement IIS_investment_deal_without_trade_deal_main_contributor_details_maturity_lookup_row;
	public WebElement IISInvestmentDealWithoutTradeDealMainContributorDetailsMaturityLookupRow_608(){
		return IIS_investment_deal_without_trade_deal_main_contributor_details_maturity_lookup_row;
	}
	
	@FindBy(xpath = "//input[@id='matr_ac_ref_T022MT']")
	private WebElement IIS_investment_deal_without_trade_deal_main_contributor_details_maturity_input;
	public WebElement IISInvestmentDealWithoutTradeDealMainContributorDetailsMaturityInput_608(){
		return IIS_investment_deal_without_trade_deal_main_contributor_details_maturity_input;
	}
	
	@FindBy(xpath = "//button[@id='btnContribDetSave_T022MT']")
	private WebElement IIS_investment_deal_without_trade_deal_main_contributor_details_Ok_btn;
	public WebElement IISInvestmentDealWithoutTradeDealMainContributorDetailsOkBtn_608(){
		return IIS_investment_deal_without_trade_deal_main_contributor_details_Ok_btn;
	}
	
	@FindBy(xpath = "//button[@id='investmentDeals_Save_btn_T022MT']")
	private WebElement IIS_investment_deal_without_trade_deal_main_save_btn;
	public WebElement IISInvestmentDealWithoutTradeDealMainSaveBtn_608(){
		return IIS_investment_deal_without_trade_deal_main_save_btn;
	}
	
	@FindBy(xpath = "//button[@id='repayPlanBtn_T022MT']")
	private WebElement IIS_investment_deal_without_trade_deal_main_repayment_plan_btn;
	public WebElement IISInvestmentDealWithoutTradeDealMainRepaymentPlanBtn_608(){
		return IIS_investment_deal_without_trade_deal_main_repayment_plan_btn;
	}
	
	@FindBy(xpath = "total_amt_T022MT")
	private WebElement IIS_investment_deal_without_trade_deal_main_repayment_amt_field;
	public WebElement IISInvestmentDealWithoutTradeDealMainRepaymentAmtField_608(){
		return IIS_investment_deal_without_trade_deal_main_repayment_amt_field;
	}
	
	@FindBy(xpath = "//input[@id='grace_period_compounding_yn_T022MT']")
	private WebElement IIS_investment_deal_without_trade_deal_main_repayment_grace_period_checkbox;
	public WebElement IISInvestmentDealWithoutTradeDealMainRepaymentGracePeriodCheckbox_608(){
		return IIS_investment_deal_without_trade_deal_main_repayment_grace_period_checkbox;
	}
	
	@FindBy(xpath = "//button[@id='createSchedule_T022MT']")
	private WebElement IIS_investment_deal_without_trade_deal_main_repayment_create_schedule_btn;
	public WebElement IISInvestmentDealWithoutTradeDealMainRepaymentCreateScheduleBtn_608(){
		return IIS_investment_deal_without_trade_deal_main_repayment_create_schedule_btn;
	}
	
	@FindBy(xpath = "//div[@id='gview_repaumentPlanScheduleGridTbl_Id_T022MT']")
	private WebElement IIS_investment_deal_without_trade_deal_main_repayment_schedule_table;
	public WebElement IISInvestmentDealWithoutTradeDealMainRepaymentScheduleTable_608(){
		return IIS_investment_deal_without_trade_deal_main_repayment_schedule_table;
	}
	
	@FindBy(xpath = "//span[@id='ui-dialog-title-RepaymentPlanMaint_combained_Div_T022MT']/parent::div/a")
	private WebElement IIS_investment_deal_without_trade_deal_main_repayment_plan_tab_close_icon;
	public WebElement IISInvestmentDealWithoutTradeDealMainRepaymentPlanTabCloseIcon_608(){
		return IIS_investment_deal_without_trade_deal_main_repayment_plan_tab_close_icon;
	}
	
	@FindBy(xpath = "//button[@id='investmentDeals_Validate_btn_T022MT']")
	private WebElement IIS_investment_deal_without_trade_deal_main_validate_btn;
	public WebElement IISInvestmentDealWithoutTradeDealMainValidateBtn_608(){
		return IIS_investment_deal_without_trade_deal_main_validate_btn;
	}

	@FindBy(xpath = "//a[@id='T022P']")
	private WebElement IIS_investment_deal_without_trade_deal_approve_menu;
	public WebElement IISInvestmentDealWithoutTradeDealApproveMenu_608(){
		return IIS_investment_deal_without_trade_deal_approve_menu;
	}
	
	@FindBy(xpath = "//input[@id='investmentDealsGridTbl_Id_T022P_gs_trsdealVO.SERIAL_NO']")
	private WebElement IIS_investment_deal_without_trade_deal_approve_menu_searchgrid_dealnbr_input;
	public WebElement IISInvestmentDealWithoutTradeDealApproveMenuSearchgridDealNbrInput_608(){
		return IIS_investment_deal_without_trade_deal_approve_menu_searchgrid_dealnbr_input;
	}
	
	@FindBy(xpath = "//td[@id='td_investmentDealsGridTbl_Id_T022P_1_trsdealVO.SERIAL_NO']")
	private WebElement IIS_investment_deal_without_trade_deal_approve_menu_searchgrid_row;
	public WebElement IISInvestmentDealWithoutTradeDealApproveMenuSearchgridRow_608(){
		return IIS_investment_deal_without_trade_deal_approve_menu_searchgrid_row;
	}
	
	@FindBy(xpath = "//input[@id='trsdealVO_SERIAL_NO_T022P']")
	private WebElement IIS_investment_deal_without_trade_deal_approve_menu_dealnbr;
	public WebElement IISInvestmentDealWithoutTradeDealApproveMenuDealNbr_608(){
		return IIS_investment_deal_without_trade_deal_approve_menu_dealnbr;
	}
	
	@FindBy(xpath = "//button[@id='investmentDeals_Approve_btn_T022P']")
	private WebElement IIS_investment_deal_without_trade_deal_approve_menu_approve_btn;
	public WebElement IISInvestmentDealWithoutTradeDealApproveMenuApproveBtn_608(){
		return IIS_investment_deal_without_trade_deal_approve_menu_approve_btn;
	}
	
	
	
	
	
	
//	Tracking & Incidental Charges
//	@AT_IC_010
	@FindBy(xpath = "//td[contains(text(),'Incidental')]")
	private WebElement IIS_tracking_incidental_charges_menu;
	public WebElement IISTrackingIncidentalChargesMenu_608(){
		return IIS_tracking_incidental_charges_menu;
	}
	
	@FindBy(xpath = "//a[@id='T07MT']")
	private WebElement IIS_tracking_incidental_charges_maintenance_menu;
	public WebElement IISTrackingIncidentalChargesMaintenanceMenu_608(){
		return IIS_tracking_incidental_charges_maintenance_menu;
	}
	
	@FindBy(xpath = "//input[@id='lookuptxt_trs_deal_serial_no_T07MT']")
	private WebElement IIS_tracking_incidental_charges_maintenance_deal_nbr_input;
	public WebElement IISTrackingIncidentalChargesMaintenanceDealNbrInput_608(){
		return IIS_tracking_incidental_charges_maintenance_deal_nbr_input;
	}
	
	@FindBy(xpath = "//input[@id='lookuptxt_charges_code_T07MT']")
	private WebElement IIS_tracking_incidental_charges_maintenance_charges_code_input;
	public WebElement IISTrackingIncidentalChargesMaintenanceChargesCodeInput_608(){
		return IIS_tracking_incidental_charges_maintenance_charges_code_input;
	}
	
	@FindBy(xpath = "//select[@id='trstrackdetVO_CHARGE_ALLOCATION_CRITERIA_T07MT']")
	private WebElement IIS_tracking_incidental_charges_maintenance_charge_allocation_dropdown;
	public WebElement IISTrackingIncidentalChargesMaintenanceChargeAllocationDropdown_608(){
		return IIS_tracking_incidental_charges_maintenance_charge_allocation_dropdown;
	}
	
	@FindBy(xpath = "//input[@id='drAcc_gl_T07MT']")
	private WebElement IIS_tracking_incidental_charges_maintenance_dr_account_input;
	public WebElement IISTrackingIncidentalChargesMaintenanceDrAccountInput_608(){
		return IIS_tracking_incidental_charges_maintenance_dr_account_input;
	}

	@FindBy(xpath = "//span[@id='spanLookup_drAcc_sl_T07MT']")
	private WebElement IIS_tracking_incidental_charges_maintenance_dr_account_lookup;
	public WebElement IISTrackingIncidentalChargesMaintenanceDrAccountLookup_608(){
		return IIS_tracking_incidental_charges_maintenance_dr_account_lookup;
	}
	
	@FindBy(xpath = "//td[@id='td_gridtab_drAcc_sl_T07MT_1_amfVO.BRANCH_CODE']")
	private WebElement IIS_tracking_incidental_charges_maintenance_dr_account_lookup_row;
	public WebElement IISTrackingIncidentalChargesMaintenanceDrAccountLookupRow_608(){
		return IIS_tracking_incidental_charges_maintenance_dr_account_lookup_row;
	}
	
	@FindBy(xpath = "//button[@id='incidentalcharges_save_T07MT']")
	private WebElement IIS_tracking_incidental_charges_maintenance_save_btn;
	public WebElement IISTrackingIncidentalChargesMaintenanceSaveBtn_608(){
		return IIS_tracking_incidental_charges_maintenance_save_btn;
	}	
	
	@FindBy(xpath = "//a[@id='T07P']")
	private WebElement IIS_tracking_incidental_charges_approve_menu;
	public WebElement IISTrackingIncidentalChargesApproveMenu_608(){
		return IIS_tracking_incidental_charges_approve_menu;
	}
	
	@FindBy(xpath = "//input[@id='IncidentalChargesGridTbl_Id_T07P_gs_trstrackVO.TRS_DEAL_SERIAL_NO']")
	private WebElement IIS_tracking_incidental_charges_approve_menu_searchgrid_deal_nbr_input;
	public WebElement IISTrackingIncidentalChargesApproveMenuSearchgridDealNbrInput_608(){
		return IIS_tracking_incidental_charges_approve_menu_searchgrid_deal_nbr_input;
	}
	
	@FindBy(xpath = "//td[@id='td_IncidentalChargesGridTbl_Id_T07P_1_trstrackVO.TRACK_NBR']")
	private WebElement IIS_tracking_incidental_charges_approve_menu_searchgrid_row;
	public WebElement IISTrackingIncidentalChargesApproveMenuSearchgridRow_608(){
		return IIS_tracking_incidental_charges_approve_menu_searchgrid_row;
	}
	
	@FindBy(xpath = "//input[@id='lookuptxt_trs_deal_serial_no_T07P']")
	private WebElement IIS_tracking_incidental_charges_approve_menu_deal_nbr;
	public WebElement IISTrackingIncidentalChargesApproveMenuDealNbr_608(){
		return IIS_tracking_incidental_charges_approve_menu_deal_nbr;
	}
	
	@FindBy(xpath = "//div[@id='incidentalchargesMainTabToolBar_T07P']/a")
	private WebElement IIS_tracking_incidental_charges_approve_menu_approve_btn;
	public WebElement IISTrackingIncidentalChargesApproveMenuApproveBtn_608(){
		return IIS_tracking_incidental_charges_approve_menu_approve_btn;
	}
		
	@FindBy(xpath = "//a[@id='T07RR']")
	private WebElement IIS_tracking_incidental_charges_menu_reverse;
	public WebElement IISTrackingIncidentalChargesReverseMenu_608(){
		return IIS_tracking_incidental_charges_menu_reverse;
	}
	
	@FindBy(xpath = "//input[@id='IncidentalChargesGridTbl_Id_T07RR_gs_trstrackVO.TRACK_NBR']")
	private WebElement IIS_incidental_charges_reverse_menu_searchgrid_track_nbr_input;
	public WebElement IISIncidentalChargesReverseMenuSearchgridTrackNbrInput_608(){
		return IIS_incidental_charges_reverse_menu_searchgrid_track_nbr_input;
	}
	
	@FindBy(xpath = "//input[@id='IncidentalChargesGridTbl_Id_T07RR_gs_statusDesc']")
	private WebElement IIS_incidental_charges_reverse_menu_searchgrid_status_input;
	public WebElement IISIncidentalChargesReverseMenuSearchgridStatusInput_608(){
		return IIS_incidental_charges_reverse_menu_searchgrid_status_input;
	}
	
	@FindBy(xpath = "//td[@id='td_IncidentalChargesGridTbl_Id_T07RR_1_trstrackVO.TRACK_NBR']")
	private WebElement IIS_incidental_charges_reverse_menu_searchgrid_row;
	public WebElement IISIncidentalChargesReverseMenuSearchgridRow_608(){
		return IIS_incidental_charges_reverse_menu_searchgrid_row;
	}
	
	@FindBy(xpath = "//input[@id='trstrackVO_TRACK_NBR_T07RR']")
	private WebElement IIS_incidental_charges_reverse_menu_track_nbr;
	public WebElement IISIncidentalChargesReverseMenuTrackNbr_608(){
		return IIS_incidental_charges_reverse_menu_track_nbr;
	}
	
	@FindBy(xpath = "//span[contains(text(),'Reverse')]//parent::a[starts-with(@id,'anchor_')]")
	private WebElement IIS_incidental_charges_reverse_menu_reverse_btn;
	public WebElement IISIncidentalChargesReverseMenuReverseBtn_608(){
		return IIS_incidental_charges_reverse_menu_reverse_btn;
	}
	
	@FindBy(xpath = "//input[@id='_popup_path_sol_confirm_ok']")
	private WebElement IIS_confirm_popup_ok_btn;
	public WebElement IIS_ConfirmPopupOkBtn_608(){
		return IIS_confirm_popup_ok_btn;
	}
	
	@FindBy(xpath = "//input[@id='_popup_path_sol_confirm']")
	private WebElement IIS_confirm_popup_cancel_btn;
	public WebElement IIS_ConfirmPopupCancelBtn_608(){
		return IIS_confirm_popup_cancel_btn;
	}
	
	@FindBy(xpath = "//input[@id='_popup_path_sol_confirm_ok']")
	private WebElement IIS_warning_popup_ok_btn;
	public WebElement IIS_WarningPopupOkBtn_608(){
		return IIS_warning_popup_ok_btn;
	}
	
	@FindBy(xpath = "//input[@id='_popup_path_sol_ok']")
	private WebElement IIS_success_popup_ok_btn;
	public WebElement IIS_SuccessPopupOkBtn_608(){
		return IIS_success_popup_ok_btn;
	}
	
	@FindBy(xpath = "//div[contains(text(),'INFORMATION')]")
	private WebElement IIS_information_popup_title;
	public WebElement IIS_InformationPopupTitle_608(){
		return IIS_information_popup_title;
	}
	
	@FindBy(xpath = "//div[@class='jMsgbox-contentWrap'][contains(text(),'Deal No')]")
	private WebElement IIS_information_popup_text_msg;
	public WebElement IIS_InformationPopupTextMsg_608(){
		return IIS_information_popup_text_msg;
	}	
	
	@FindBy(xpath = "//input[@id='_popup_path_sol_ok']")
	private WebElement IIS_information_popup_ok_btn;
	public WebElement IIS_InformationPopupOkBtn_608(){
		return IIS_information_popup_ok_btn;
	}

	@FindBy(xpath = "//a[@id='T07V']")
	private WebElement IIS_tracking_incidental_charges_approve_reverse_menu;
	public WebElement IISTrackingIncidentalChargesApproveReverseMenu_608(){
		return IIS_tracking_incidental_charges_approve_reverse_menu;
	}
	
	@FindBy(xpath = "//input[@id='IncidentalChargesGridTbl_Id_T07V_gs_trstrackVO.TRACK_NBR']")
	private WebElement IIS_incidental_charges_approve_reverse_searchgrid_track_nbr_input;
	public WebElement IISIncidentalChargesApproveReverseSearchgridTrackNbrInput_608(){
		return IIS_incidental_charges_approve_reverse_searchgrid_track_nbr_input;
	}
	
	@FindBy(xpath = "//td[@id='td_IncidentalChargesGridTbl_Id_T07V_1_trstrackVO.TRACK_NBR']")
	private WebElement IIS_incidental_charges_approve_reverse_searchgrid_row;
	public WebElement IISIncidentalChargesApproveReverseSearchgridRow_608(){
		return IIS_incidental_charges_approve_reverse_searchgrid_row;
	}
	
	@FindBy(xpath = "//input[@id='trstrackVO_TRACK_NBR_T07V']")
	private WebElement IIS_incidental_charges_approve_reverse_track_nbr;
	public WebElement IISIncidentalChargesApproveReverseTrackNbr_608(){
		return IIS_incidental_charges_approve_reverse_track_nbr;
	}
	
	@FindBy(xpath = "//div[@id='incidentalchargesMainTabToolBar_T07V']/a")
	private WebElement IIS_incidental_charges_approve_reverse_menu_reverse_btn;
	public WebElement IISIncidentalChargesApproveReverseMenuReverseBtn_608(){
		return IIS_incidental_charges_approve_reverse_menu_reverse_btn;
	}
		
	
//	Settlement
	@FindBy(xpath = "//td[text()='Settlement']")
	private WebElement IIS_settlement_menu;
	public WebElement IISSettlementMenu_608() {
		return IIS_settlement_menu;
	}
	
	@FindBy(xpath = "//a[@id='T06MT']")
	private WebElement IIS_settlement_menu_maintenance;
	public WebElement IISSettlementMenuMaintenance_608() {
		return IIS_settlement_menu_maintenance;
	}
	
	@FindBy(xpath = "//input[@id='lookuptxt_dealNo_T06MT']")
	private WebElement IIS_settlement_menu_maintenance_deal_nbr_input;
	public WebElement IISSettlementMenuMaintenanceDealNbrInput_608() {
		return IIS_settlement_menu_maintenance_deal_nbr_input;
	}
	
	@FindBy(xpath = "//input[@id='crossCyPartyAmount_T06MT']")
	private WebElement IIS_settlement_menu_maintenance_party_amt_input;
	public WebElement IISSettlementMenuMaintenancePartyAmtInput_608() {
		return IIS_settlement_menu_maintenance_party_amt_input;
	}
	
	@FindBy(xpath = "//button[@id='automaticAllocationButton_T06MT']")
	private WebElement IIS_settlement_menu_maintenance_auto_allocation_btn;
	public WebElement IISSettlementMenuMaintenanceAutoAllocationBtn_608() {
		return IIS_settlement_menu_maintenance_auto_allocation_btn;
	}
	
	@FindBy(xpath = "//li[@id='settlementTab2_T06MT']")
	private WebElement IIS_settlement_menu_maintenance_schedule_details_tab;
	public WebElement IISSettlementMenuMaintenanceScheduleDetailsTab_608() {
		return IIS_settlement_menu_maintenance_schedule_details_tab;
	}
	
	@FindBy(xpath = "//table[@id='settlementScheduleGridTbl_Id_T06MT']")
	private WebElement IIS_settlement_menu_maintenance_schedule_details_table;
	public WebElement IISSettlementMenuMaintenanceScheduleDetailsTable_608() {
		return IIS_settlement_menu_maintenance_schedule_details_table;
	}
	
	@FindBy(xpath = "//td[@id='td_settlementScheduleGridTbl_Id_T06MT_1_amountPlusVat']")
	private WebElement IIS_settlement_menu_maintenance_schedule_details_row_amt;
	public WebElement IISSettlementMenuMaintenanceScheduleDetailsRowAmt_608() {
		return IIS_settlement_menu_maintenance_schedule_details_row_amt;
	}
	
	@FindBy(xpath = "//button[@id='savebutton_T06MT']")
	private WebElement IIS_settlement_menu_maintenance_save_btn;
	public WebElement IISSettlementMenuMaintenanceSaveBtn_608() {
		return IIS_settlement_menu_maintenance_save_btn;
	}
	
	@FindBy(xpath = "//div[@class='jMsgbox-contentWrap']")
	private WebElement IIS_settlement_menu_maintenance_success_popup_text;
	public WebElement IISSettlementMenuMaintenanceSuccessPopupText_608() {
		return IIS_settlement_menu_maintenance_success_popup_text;
	}
	
	@FindBy(xpath = "//a[@id='T06P']")
	private WebElement IIS_settlement_menu_approve;
	public WebElement IISSettlementMenuApprove_608() {
		return IIS_settlement_menu_approve;
	}
	
	@FindBy(xpath = "//input[@id='settlementMgmtGridTbl_Id_T06P_gs_trssetlmtvo.SETTLEMENT_NBR']")
	private WebElement IIS_settlement_menu_approve_searchgrid_settlement_nbr_input;
	public WebElement IISSettlementMenuApproveSearchgridSettlementNbrInput_608() {
		return IIS_settlement_menu_approve_searchgrid_settlement_nbr_input;
	}
	
	@FindBy(xpath = "//td[@id='td_settlementMgmtGridTbl_Id_T06P_1_trssetlmtvo.SETTLEMENT_NBR']")
	private WebElement IIS_settlement_menu_approve_searchgrid_row;
	public WebElement IISSettlementMenuApproveSearchgridRow_608() {
		return IIS_settlement_menu_approve_searchgrid_row;
	}
	
	@FindBy(xpath = "//input[@id='settlmentNo_T06P']")
	private WebElement IIS_settlement_menu_approve_settlement_nbr;
	public WebElement IISSettlementMenuApproveSettlementNbr_608() {
		return IIS_settlement_menu_approve_settlement_nbr;
	}
	
	@FindBy(xpath = "//button[@id='settlement_Approve_btn_T06P']")
	private WebElement IIS_settlement_approve_menu_approve_btn;
	public WebElement IISSettlementApproveMenuApproveBtn_608() {
		return IIS_settlement_approve_menu_approve_btn;
	}
	
	@FindBy(xpath = "//div[@class='jMsgbox-contentWrap'][contains(text(),'proceed')]")
	private WebElement IIS_settlement_approve_menu_confirm_proceed_popup;
	public WebElement IISApproveMenuConfirmPopupProceed_608() {
		return IIS_settlement_approve_menu_confirm_proceed_popup;
	}
	
	
//	Repayment Plan
	@FindBy(xpath = "//td[text()='Repayment Plan']")
	private WebElement IIS_repayment_plan_module;
	public WebElement IISRepaymentPlanModule_608() {
		return IIS_repayment_plan_module;
	}
	
	@FindBy(xpath = "//a[@id='T04MT']")
	private WebElement IIS_repayment_plan_maintenance;
	public WebElement IISRepaymentPlanMaintenance_608() {
		return IIS_repayment_plan_maintenance;
	}
	
	@FindBy(xpath = "//a[@id='infoBarSearchButton_T04MT']")
	private WebElement IIS_repayment_plan_maintenance_search_btn;
	public WebElement IISRepaymentPlanMaintenanceSearchBtn_608() {
		return IIS_repayment_plan_maintenance_search_btn;
	}
	
	@FindBy(xpath = "//input[@id='repaymentPlanMgmtGridTbl_Id_T04MT_gs_trspayplanVO.TRX_NBR']")
	private WebElement IIS_repayment_plan_maintenance_searchgrid_deal_nbr_input;
	public WebElement IISRepaymentPlanMaintenanceSearchgridDealNbrInput_608() {
		return IIS_repayment_plan_maintenance_searchgrid_deal_nbr_input;
	}
	
	@FindBy(xpath = "//td[@id='td_repaymentPlanMgmtGridTbl_Id_T04MT_1_trspayplanVO.PLAN_NBR']")
	private WebElement IIS_repayment_plan_maintenance_searchgrid_row;
	public WebElement IISRepaymentPlanMaintenanceSearchgridRow_608() {
		return IIS_repayment_plan_maintenance_searchgrid_row;
	}
	
	@FindBy(xpath = "//li[@id='rePaymentPlanMainTab2_T04MT']")
	private WebElement IIS_repayment_plan_maintenance_schedule_details_tab;
	public WebElement IISRepaymentPlanMaintenanceScheduleDetailsTab_608() {
		return IIS_repayment_plan_maintenance_schedule_details_tab;
	}
	
	@FindBy(xpath = "//td[@id='td_repaumentPlanScheduleGridTbl_Id_T04MT_0_rn'][text()='1']")
	private WebElement IIS_repayment_plan_maintenance_schedule_details_row;
	public WebElement IISRepaymentPlanMaintenanceScheduleDetailsRow_608() {
		return IIS_repayment_plan_maintenance_schedule_details_row;
	}
	
	@FindBy(xpath = "//td[@id='td_repaumentPlanScheduleGridTbl_Id_T04MT_1_incidentalCharge']/a")
	private WebElement IIS_repayment_plan_maintenance_schedule_details_row_incidental_charge;
	public WebElement IISRepaymentPlanMaintenanceScheduleDetailsRowIncidentalCharge_608() {
		return IIS_repayment_plan_maintenance_schedule_details_row_incidental_charge;
	}
	
	
	
	
	
	
	
	
}
