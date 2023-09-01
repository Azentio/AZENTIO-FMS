package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IIS_ApplicationObj {
	
	WebDriver driver;
	public IIS_ApplicationObj(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	// Clear cache for FMS Core
	@FindBy(xpath = "//span[@id='tech_details_icon']")
	private WebElement IIS_core_tech_details_icon;
	public WebElement IISCoreTechDetailsIcon() {
		return IIS_core_tech_details_icon;
	}
	
	@FindBy(xpath = "//label[@id='clear_cache_key']")
	private WebElement IIS_core_clear_cache_btn;
	public WebElement IISCoreClearCacheBtn() {
		return IIS_core_clear_cache_btn;
	}
	
//	Investment Deals -Combined without Trade Deal
	@FindBy(xpath = "//td[text()='Investment Deals -Combined without Trade Deal']")
	private WebElement IIS_investment_deal_without_trade_deal_menu;
	public WebElement IISInvestmentDealWithoutTradeDealMenu(){
		return IIS_investment_deal_without_trade_deal_menu;
	}
	
	@FindBy(xpath = "//a[@id='T022MT']")
	private WebElement IIS_investment_deal_without_trade_deal_maintenance_menu;
	public WebElement IISInvestmentDealWithoutTradeDealMaintenanceMenu(){
		return IIS_investment_deal_without_trade_deal_maintenance_menu;
	}
	
	@FindBy(xpath = "//input[@id='lookuptxt_investmentDeals_PARTY_T022MT']")
	private WebElement IIS_investment_deal_without_trade_deal_main_party_input;
	public WebElement IISInvestmentDealWithoutTradeDealMainPartyInput(){
		return IIS_investment_deal_without_trade_deal_main_party_input;
	}
	
//	Category input ==> Charge code 
	@FindBy(xpath = "//input[@id='lookuptxt_trsdealVO_DEAL_TYPE_T022MT']")
	private WebElement IIS_investment_deal_without_trade_deal_main_category_input;
	public WebElement IISInvestmentDealWithoutTradeDealMainCategoryInput(){
		return IIS_investment_deal_without_trade_deal_main_category_input;
	}
	
	@FindBy(xpath = "//input[@id='lookuptxt_investmentDeals_CLASS_T022MT']")
	private WebElement IIS_investment_deal_without_trade_deal_main_product_class_input;
	public WebElement IISInvestmentDealWithoutTradeDealMainProductClassInput(){
		return IIS_investment_deal_without_trade_deal_main_product_class_input;
	}
	
	@FindBy(xpath = "//input[@id='lookuptxt_trsdealVO_DD_DEAL_CY_T022MT']")
	private WebElement IIS_investment_deal_without_trade_deal_main_deal_cy_input;
	public WebElement IISInvestmentDealWithoutTradeDealMainDealCYnput(){
		return IIS_investment_deal_without_trade_deal_main_deal_cy_input;
	}
	
	@FindBy(xpath = "//input[@id='trsdealVO_DD_DEAL_AMOUNT_T022MT']")
	private WebElement IIS_investment_deal_without_trade_deal_main_amount_input;
	public WebElement IISInvestmentDealWithoutTradeDealMainAmountInput(){
		return IIS_investment_deal_without_trade_deal_main_amount_input;
	}
	
	@FindBy(xpath = "//input[@id='trsdealVO_DD_PERIODICITY_NBR_T022MT']")
	private WebElement IIS_investment_deal_without_trade_deal_main_tenure_input;
	public WebElement IISInvestmentDealWithoutTradeDealMainTenureInput(){
		return IIS_investment_deal_without_trade_deal_main_tenure_input;
	}
	
	@FindBy(xpath = "//input[@id='_popup_path_sol_confirm_ok']")                         //newly added
	private WebElement IIS_investment_deal_without_trade_deal_main_tenure_input_popup;
	public WebElement IIS_investment_deal_without_trade_deal_main_tenure_input_popup(){
		return IIS_investment_deal_without_trade_deal_main_tenure_input_popup;
	}
	
	
	
	@FindBy(xpath = "//select[@id='trsdealVO_DD_PERIODICITY_TYPE_T022MT']")
	private WebElement IIS_investment_deal_without_trade_deal_main_tenure_dropdown;
	public WebElement IISInvestmentDealWithoutTradeDealMainTenureDropdown(){
		return IIS_investment_deal_without_trade_deal_main_tenure_dropdown;
	}
	
	@FindBy(xpath = "//input[@id='trsdealVO_DD_DEAL_EXPECTED_YIELD_T022MT']")
	private WebElement IIS_investment_deal_without_trade_deal_main_yield_margin_input;
	public WebElement IISInvestmentDealWithoutTradeDealMainYieldMarginInput(){
		return IIS_investment_deal_without_trade_deal_main_yield_margin_input;
	}
	
	@FindBy(xpath = "//li[@id='investmentDealsMainTabs2_T022MT']")
	private WebElement IIS_investment_deal_without_trade_deal_main_contributor_tab;
	public WebElement IISInvestmentDealWithoutTradeDealMainContributorTab(){
		return IIS_investment_deal_without_trade_deal_main_contributor_tab;
	}
	
	@FindBy(xpath = "//td[@id='td_ContributorDetailsGridTbl_Id_T022MT_1_rn']")
	private WebElement IIS_investment_deal_without_trade_deal_main_contributor_tab_row;
	public WebElement IISInvestmentDealWithoutTradeDealMainContributorTabRow(){
		return IIS_investment_deal_without_trade_deal_main_contributor_tab_row;
	}
	
	@FindBy(xpath = "//span[@id='spanLookup_nostro_sl_T022MT']")
	private WebElement IIS_investment_deal_without_trade_deal_main_contributor_details_nostro_lookup;
	public WebElement IISInvestmentDealWithoutTradeDealMainContributorDetailsNostroLookup(){
		return IIS_investment_deal_without_trade_deal_main_contributor_details_nostro_lookup;
	}
	
	@FindBy(xpath = "//td[@id='td_gridtab_nostro_sl_T022MT_1_amfVO.BRANCH_CODE']")
	private WebElement IIS_investment_deal_without_trade_deal_main_contributor_details_nostro_lookup_row;
	public WebElement IISInvestmentDealWithoutTradeDealMainContributorDetailsNostroLookupRow(){
		return IIS_investment_deal_without_trade_deal_main_contributor_details_nostro_lookup_row;
	}
	
	@FindBy(xpath = "//input[@id='nostro_acc_ref_T022MT']")
	private WebElement IIS_investment_deal_without_trade_deal_main_contributor_details_nostro_input;
	public WebElement IISInvestmentDealWithoutTradeDealMainContributorDetailsNostroInput(){
		return IIS_investment_deal_without_trade_deal_main_contributor_details_nostro_input;
	}
	
	@FindBy(xpath = "//span[@id='spanLookup_matr_ac_sl_T022MT']")
	private WebElement IIS_investment_deal_without_trade_deal_main_contributor_details_maturity_lookup;
	public WebElement IISInvestmentDealWithoutTradeDealMainContributorDetailsMaturityLookup(){
		return IIS_investment_deal_without_trade_deal_main_contributor_details_maturity_lookup;
	}
	
	@FindBy(xpath = "//td[@id='td_gridtab_matr_ac_sl_T022MT_1_amfVO.BRANCH_CODE']")
	private WebElement IIS_investment_deal_without_trade_deal_main_contributor_details_maturity_lookup_row;
	public WebElement IISInvestmentDealWithoutTradeDealMainContributorDetailsMaturityLookupRow(){
		return IIS_investment_deal_without_trade_deal_main_contributor_details_maturity_lookup_row;
	}
	
	@FindBy(xpath = "//input[@id='matr_ac_ref_T022MT']")
	private WebElement IIS_investment_deal_without_trade_deal_main_contributor_details_maturity_input;
	public WebElement IISInvestmentDealWithoutTradeDealMainContributorDetailsMaturityInput(){
		return IIS_investment_deal_without_trade_deal_main_contributor_details_maturity_input;
	}
	
	@FindBy(xpath = "//button[@id='btnContribDetSave_T022MT']")
	private WebElement IIS_investment_deal_without_trade_deal_main_contributor_details_Ok_btn;
	public WebElement IISInvestmentDealWithoutTradeDealMainContributorDetailsOkBtn(){
		return IIS_investment_deal_without_trade_deal_main_contributor_details_Ok_btn;
	}
	
	@FindBy(xpath = "//button[@id='investmentDeals_Save_btn_T022MT']")
	private WebElement IIS_investment_deal_without_trade_deal_main_save_btn;
	public WebElement IISInvestmentDealWithoutTradeDealMainSaveBtn(){
		return IIS_investment_deal_without_trade_deal_main_save_btn;
	}
	
	@FindBy(xpath = "//button[@id='repayPlanBtn_T022MT']")
	private WebElement IIS_investment_deal_without_trade_deal_main_repayment_plan_btn;
	public WebElement IISInvestmentDealWithoutTradeDealMainRepaymentPlanBtn(){
		return IIS_investment_deal_without_trade_deal_main_repayment_plan_btn;
	}
	
	@FindBy(xpath = "//input[@id='total_amt_T022MT']")
	private WebElement IIS_investment_deal_without_trade_deal_main_repayment_amt_field;
	public WebElement IISInvestmentDealWithoutTradeDealMainRepaymentAmtField(){
		return IIS_investment_deal_without_trade_deal_main_repayment_amt_field;
	}
	
	@FindBy(xpath = "//input[@id='No_Of_Payments_T022MT']")
	private WebElement IIS_investment_deal_without_trade_deal_main_repayment_no_of_payment_input;
	public WebElement IISInvestmentDealWithoutTradeDealMainRepaymentNoOfPaymentsInput(){
		return IIS_investment_deal_without_trade_deal_main_repayment_no_of_payment_input;
	}
	
	@FindBy(xpath = "//input[@id='grace_period_T022MT']")
	private WebElement IIS_investment_deal_without_trade_deal_main_repayment_grace_period_input;
	public WebElement IISInvestmentDealWithoutTradeDealMainRepaymentGracePeriodInput(){
		return IIS_investment_deal_without_trade_deal_main_repayment_grace_period_input;
	}
	
	@FindBy(xpath = "//select[@id='gracePeriodicity_T022MT']")
	private WebElement IIS_investment_deal_without_trade_deal_main_repayment_grace_period_dropdown;
	public WebElement IISInvestmentDealWithoutTradeDealMainRepaymentGracePeriodDropdown(){
		return IIS_investment_deal_without_trade_deal_main_repayment_grace_period_dropdown;
	}
	
	@FindBy(xpath = "//select[@id='profit_calculation_method_T022MT']")
	private WebElement IIS_investment_deal_without_trade_deal_main_repayment_profit_calculation_method_dropdown;
	public WebElement IISInvestmentDealWithoutTradeDealMainRepaymentProfitCalculationMethodDropdown(){
		return IIS_investment_deal_without_trade_deal_main_repayment_profit_calculation_method_dropdown;
	}
	
	@FindBy(xpath = "//select[@id='profit_dist_method_T022MT']")
	private WebElement IIS_investment_deal_without_trade_deal_main_repayment_profit_recog_method_dropdown;
	public WebElement IISInvestmentDealWithoutTradeDealMainRepaymentProfitRecogMethodDropdown(){
		return IIS_investment_deal_without_trade_deal_main_repayment_profit_recog_method_dropdown;
	}
	
	@FindBy(xpath = "//input[@id='grace_period_compounding_yn_T022MT']")
	private WebElement IIS_investment_deal_without_trade_deal_main_repayment_grace_period_checkbox;
	public WebElement IISInvestmentDealWithoutTradeDealMainRepaymentGracePeriodCheckbox(){
		return IIS_investment_deal_without_trade_deal_main_repayment_grace_period_checkbox;
	}
	
	@FindBy(xpath = "//button[@id='createSchedule_T022MT']")
	private WebElement IIS_investment_deal_without_trade_deal_main_repayment_create_schedule_btn;
	public WebElement IISInvestmentDealWithoutTradeDealMainRepaymentCreateScheduleBtn(){
		return IIS_investment_deal_without_trade_deal_main_repayment_create_schedule_btn;
	}
	
	@FindBy(xpath = "//div[@id='gview_repaumentPlanScheduleGridTbl_Id_T022MT']")
	private WebElement IIS_investment_deal_without_trade_deal_main_repayment_schedule_table;
	public WebElement IISInvestmentDealWithoutTradeDealMainRepaymentScheduleTable(){
		return IIS_investment_deal_without_trade_deal_main_repayment_schedule_table;
	}
	
	@FindBy(xpath = "//span[@id='ui-dialog-title-RepaymentPlanMaint_combained_Div_T022MT']/parent::div/a")
	private WebElement IIS_investment_deal_without_trade_deal_main_repayment_plan_tab_close_icon;
	public WebElement IISInvestmentDealWithoutTradeDealMainRepaymentPlanTabCloseIcon(){
		return IIS_investment_deal_without_trade_deal_main_repayment_plan_tab_close_icon;
	}
	
	@FindBy(xpath = "//button[@id='investmentDeals_Validate_btn_T022MT']")
	private WebElement IIS_investment_deal_without_trade_deal_main_validate_btn;
	public WebElement IISInvestmentDealWithoutTradeDealMainValidateBtn(){
		return IIS_investment_deal_without_trade_deal_main_validate_btn;
	}

	@FindBy(xpath = "//a[@id='T022P']")
	private WebElement IIS_investment_deal_without_trade_deal_approve_menu;
	public WebElement IISInvestmentDealWithoutTradeDealApproveMenu(){
		return IIS_investment_deal_without_trade_deal_approve_menu;
	}
	
	@FindBy(xpath = "//input[@id='investmentDealsGridTbl_Id_T022P_gs_trsdealVO.SERIAL_NO']")
	private WebElement IIS_investment_deal_without_trade_deal_approve_menu_searchgrid_dealnbr_input;
	public WebElement IISInvestmentDealWithoutTradeDealApproveMenuSearchgridDealNbrInput(){
		return IIS_investment_deal_without_trade_deal_approve_menu_searchgrid_dealnbr_input;
	}
	
	@FindBy(xpath = "//td[@id='td_investmentDealsGridTbl_Id_T022P_1_trsdealVO.SERIAL_NO']")
	private WebElement IIS_investment_deal_without_trade_deal_approve_menu_searchgrid_row;
	public WebElement IISInvestmentDealWithoutTradeDealApproveMenuSearchgridRow(){
		return IIS_investment_deal_without_trade_deal_approve_menu_searchgrid_row;
	}
	
	@FindBy(xpath = "//input[@id='trsdealVO_SERIAL_NO_T022P']")
	private WebElement IIS_investment_deal_without_trade_deal_approve_menu_dealnbr;
	public WebElement IISInvestmentDealWithoutTradeDealApproveMenuDealNbr(){
		return IIS_investment_deal_without_trade_deal_approve_menu_dealnbr;
	}
	
	@FindBy(xpath = "//button[@id='investmentDeals_Approve_btn_T022P']")
	private WebElement IIS_investment_deal_without_trade_deal_approve_menu_approve_btn;
	public WebElement IISInvestmentDealWithoutTradeDealApproveMenuApproveBtn(){
		return IIS_investment_deal_without_trade_deal_approve_menu_approve_btn;
	}	
	
//	Tracking & Incidental Charges
//	@AT_IC_010
	@FindBy(xpath = "//td[contains(text(),'Incidental')]")
	private WebElement IIS_tracking_incidental_charges_menu;
	public WebElement IISTrackingIncidentalChargesMenu(){
		return IIS_tracking_incidental_charges_menu;
	}
	
	@FindBy(xpath = "//a[@id='T07MT']")
	private WebElement IIS_tracking_incidental_charges_maintenance_menu;
	public WebElement IISTrackingIncidentalChargesMaintenanceMenu(){
		return IIS_tracking_incidental_charges_maintenance_menu;
	}
	
	@FindBy(xpath = "//input[@id='lookuptxt_trs_deal_serial_no_T07MT']")
	private WebElement IIS_tracking_incidental_charges_maintenance_deal_nbr_input;
	public WebElement IISTrackingIncidentalChargesMaintenanceDealNbrInput(){
		return IIS_tracking_incidental_charges_maintenance_deal_nbr_input;
	}
	
	@FindBy(xpath = "//input[@id='lookuptxt_charges_code_T07MT']")
	private WebElement IIS_tracking_incidental_charges_maintenance_charges_code_input;
	public WebElement IISTrackingIncidentalChargesMaintenanceChargesCodeInput(){
		return IIS_tracking_incidental_charges_maintenance_charges_code_input;
	}
	
	@FindBy(xpath = "//select[@id='trstrackdetVO_CHARGE_ALLOCATION_CRITERIA_T07MT']")
	private WebElement IIS_tracking_incidental_charges_maintenance_charge_allocation_dropdown;
	public WebElement IISTrackingIncidentalChargesMaintenanceChargeAllocationDropdown(){
		return IIS_tracking_incidental_charges_maintenance_charge_allocation_dropdown;
	}
	
	@FindBy(xpath = "//input[@id='drAcc_gl_T07MT']")
	private WebElement IIS_tracking_incidental_charges_maintenance_dr_account_input;
	public WebElement IISTrackingIncidentalChargesMaintenanceDrAccountInput(){
		return IIS_tracking_incidental_charges_maintenance_dr_account_input;
	}

	@FindBy(xpath = "//span[@id='spanLookup_drAcc_sl_T07MT']")
	private WebElement IIS_tracking_incidental_charges_maintenance_dr_account_lookup;
	public WebElement IISTrackingIncidentalChargesMaintenanceDrAccountLookup(){
		return IIS_tracking_incidental_charges_maintenance_dr_account_lookup;
	}
	
	@FindBy(xpath = "//td[@id='td_gridtab_drAcc_sl_T07MT_1_amfVO.BRANCH_CODE']")
	private WebElement IIS_tracking_incidental_charges_maintenance_dr_account_lookup_row;
	public WebElement IISTrackingIncidentalChargesMaintenanceDrAccountLookupRow(){
		return IIS_tracking_incidental_charges_maintenance_dr_account_lookup_row;
	}
	
	@FindBy(xpath = "//button[@id='incidentalcharges_save_T07MT']")
	private WebElement IIS_tracking_incidental_charges_maintenance_save_btn;
	public WebElement IISTrackingIncidentalChargesMaintenanceSaveBtn(){
		return IIS_tracking_incidental_charges_maintenance_save_btn;
	}	
	
	@FindBy(xpath = "//a[@id='T07P']")
	private WebElement IIS_tracking_incidental_charges_approve_menu;
	public WebElement IISTrackingIncidentalChargesApproveMenu(){
		return IIS_tracking_incidental_charges_approve_menu;
	}
	
	@FindBy(xpath = "//input[@id='IncidentalChargesGridTbl_Id_T07P_gs_trstrackVO.TRS_DEAL_SERIAL_NO']")
	private WebElement IIS_tracking_incidental_charges_approve_menu_searchgrid_deal_nbr_input;
	public WebElement IISTrackingIncidentalChargesApproveMenuSearchgridDealNbrInput(){
		return IIS_tracking_incidental_charges_approve_menu_searchgrid_deal_nbr_input;
	}
	
	@FindBy(xpath = "//td[@id='td_IncidentalChargesGridTbl_Id_T07P_1_trstrackVO.TRACK_NBR']")
	private WebElement IIS_tracking_incidental_charges_approve_menu_searchgrid_row;
	public WebElement IISTrackingIncidentalChargesApproveMenuSearchgridRow(){
		return IIS_tracking_incidental_charges_approve_menu_searchgrid_row;
	}
	
	@FindBy(xpath = "//input[@id='lookuptxt_trs_deal_serial_no_T07P']")
	private WebElement IIS_tracking_incidental_charges_approve_menu_deal_nbr;
	public WebElement IISTrackingIncidentalChargesApproveMenuDealNbr(){
		return IIS_tracking_incidental_charges_approve_menu_deal_nbr;
	}
	
	@FindBy(xpath = "//div[@id='incidentalchargesMainTabToolBar_T07P']/a")
	private WebElement IIS_tracking_incidental_charges_approve_menu_approve_btn;
	public WebElement IISTrackingIncidentalChargesApproveMenuApproveBtn(){
		return IIS_tracking_incidental_charges_approve_menu_approve_btn;
	}
		
	@FindBy(xpath = "//a[@id='T07RR']")
	private WebElement IIS_tracking_incidental_charges_menu_reverse;
	public WebElement IISTrackingIncidentalChargesReverseMenu(){
		return IIS_tracking_incidental_charges_menu_reverse;
	}
	
	@FindBy(xpath = "//input[@id='IncidentalChargesGridTbl_Id_T07RR_gs_trstrackVO.TRACK_NBR']")
	private WebElement IIS_incidental_charges_reverse_menu_searchgrid_track_nbr_input;
	public WebElement IISIncidentalChargesReverseMenuSearchgridTrackNbrInput(){
		return IIS_incidental_charges_reverse_menu_searchgrid_track_nbr_input;
	}
	
	@FindBy(xpath = "//input[@id='IncidentalChargesGridTbl_Id_T07RR_gs_statusDesc']")
	private WebElement IIS_incidental_charges_reverse_menu_searchgrid_status_input;
	public WebElement IISIncidentalChargesReverseMenuSearchgridStatusInput(){
		return IIS_incidental_charges_reverse_menu_searchgrid_status_input;
	}
	
	@FindBy(xpath = "//td[@id='td_IncidentalChargesGridTbl_Id_T07RR_1_trstrackVO.TRACK_NBR']")
	private WebElement IIS_incidental_charges_reverse_menu_searchgrid_row;
	public WebElement IISIncidentalChargesReverseMenuSearchgridRow(){
		return IIS_incidental_charges_reverse_menu_searchgrid_row;
	}
	
	@FindBy(xpath = "//input[@id='trstrackVO_TRACK_NBR_T07RR']")
	private WebElement IIS_incidental_charges_reverse_menu_track_nbr;
	public WebElement IISIncidentalChargesReverseMenuTrackNbr(){
		return IIS_incidental_charges_reverse_menu_track_nbr;
	}
	
	@FindBy(xpath = "//span[contains(text(),'Reverse')]//parent::a[starts-with(@id,'anchor_')]")
	private WebElement IIS_incidental_charges_reverse_menu_reverse_btn;
	public WebElement IISIncidentalChargesReverseMenuReverseBtn(){
		return IIS_incidental_charges_reverse_menu_reverse_btn;
	}
	
	@FindBy(xpath = "//input[@id='_popup_path_sol_confirm_ok']")
	private WebElement IIS_confirm_popup_ok_btn;
	public WebElement IIS_ConfirmPopupOkBtn(){
		return IIS_confirm_popup_ok_btn;
	}
	
	@FindBy(xpath = "//input[@id='_popup_path_sol_confirm']")
	private WebElement IIS_confirm_popup_cancel_btn;
	public WebElement IIS_ConfirmPopupCancelBtn(){
		return IIS_confirm_popup_cancel_btn;
	}
	
	@FindBy(xpath = "//input[@id='_popup_path_sol_confirm_ok']")
	private WebElement IIS_warning_popup_ok_btn;
	public WebElement IIS_WarningPopupOkBtn(){
		return IIS_warning_popup_ok_btn;
	}
	
	@FindBy(xpath = "//input[@id='_popup_path_sol_ok']")
	private WebElement IIS_success_popup_ok_btn;
	public WebElement IIS_SuccessPopupOkBtn(){
		return IIS_success_popup_ok_btn;
	}
	
	@FindBy(xpath = "//div[contains(text(),'INFORMATION')]")
	private WebElement IIS_information_popup_title;
	public WebElement IIS_InformationPopupTitle(){
		return IIS_information_popup_title;
	}
	
	@FindBy(xpath = "//div[@class='jMsgbox-contentWrap'][contains(text(),'Deal No')]")
	private WebElement IIS_information_popup_text_msg;
	public WebElement IIS_InformationPopupTextMsg(){
		return IIS_information_popup_text_msg;
	}	
	
	@FindBy(xpath = "//input[@id='_popup_path_sol_ok']")
	private WebElement IIS_information_popup_ok_btn;
	public WebElement IIS_InformationPopupOkBtn(){
		return IIS_information_popup_ok_btn;
	}

	@FindBy(xpath = "//a[@id='T07V']")
	private WebElement IIS_tracking_incidental_charges_approve_reverse_menu;
	public WebElement IISTrackingIncidentalChargesApproveReverseMenu(){
		return IIS_tracking_incidental_charges_approve_reverse_menu;
	}
	
	@FindBy(xpath = "//input[@id='IncidentalChargesGridTbl_Id_T07V_gs_trstrackVO.TRACK_NBR']")
	private WebElement IIS_incidental_charges_approve_reverse_searchgrid_track_nbr_input;
	public WebElement IISIncidentalChargesApproveReverseSearchgridTrackNbrInput(){
		return IIS_incidental_charges_approve_reverse_searchgrid_track_nbr_input;
	}
	
	@FindBy(xpath = "//td[@id='td_IncidentalChargesGridTbl_Id_T07V_1_trstrackVO.TRACK_NBR']")
	private WebElement IIS_incidental_charges_approve_reverse_searchgrid_row;
	public WebElement IISIncidentalChargesApproveReverseSearchgridRow(){
		return IIS_incidental_charges_approve_reverse_searchgrid_row;
	}
	
	@FindBy(xpath = "//input[@id='trstrackVO_TRACK_NBR_T07V']")
	private WebElement IIS_incidental_charges_approve_reverse_track_nbr;
	public WebElement IISIncidentalChargesApproveReverseTrackNbr(){
		return IIS_incidental_charges_approve_reverse_track_nbr;
	}
	
	@FindBy(xpath = "//div[@id='incidentalchargesMainTabToolBar_T07V']/a")
	private WebElement IIS_incidental_charges_approve_reverse_menu_reverse_btn;
	public WebElement IISIncidentalChargesApproveReverseMenuReverseBtn(){
		return IIS_incidental_charges_approve_reverse_menu_reverse_btn;
	}
		
	
//	Settlement
	@FindBy(xpath = "//td[text()='Settlement']")
	private WebElement IIS_settlement_menu;
	public WebElement IISSettlementMenu() {
		return IIS_settlement_menu;
	}
	
	@FindBy(xpath = "//a[@id='T06MT']")
	private WebElement IIS_settlement_menu_maintenance;
	public WebElement IISSettlementMenuMaintenance() {
		return IIS_settlement_menu_maintenance;
	}
	
	@FindBy(xpath = "//input[@id='lookuptxt_dealNo_T06MT']")
	private WebElement IIS_settlement_menu_maintenance_deal_nbr_input;
	public WebElement IISSettlementMenuMaintenanceDealNbrInput() {
		return IIS_settlement_menu_maintenance_deal_nbr_input;
	}
	
	@FindBy(xpath = "//input[@id='crossCyPartyAmount_T06MT']")
	private WebElement IIS_settlement_menu_maintenance_party_amt_input;
	public WebElement IISSettlementMenuMaintenancePartyAmtInput() {
		return IIS_settlement_menu_maintenance_party_amt_input;
	}
	
	@FindBy(xpath = "//button[@id='automaticAllocationButton_T06MT']")
	private WebElement IIS_settlement_menu_maintenance_auto_allocation_btn;
	public WebElement IISSettlementMenuMaintenanceAutoAllocationBtn() {
		return IIS_settlement_menu_maintenance_auto_allocation_btn;
	}
	
	@FindBy(xpath = "//li[@id='settlementTab2_T06MT']")
	private WebElement IIS_settlement_menu_maintenance_schedule_details_tab;
	public WebElement IISSettlementMenuMaintenanceScheduleDetailsTab() {
		return IIS_settlement_menu_maintenance_schedule_details_tab;
	}
	
	@FindBy(xpath = "//table[@id='settlementScheduleGridTbl_Id_T06MT']")
	private WebElement IIS_settlement_menu_maintenance_schedule_details_table;
	public WebElement IISSettlementMenuMaintenanceScheduleDetailsTable() {
		return IIS_settlement_menu_maintenance_schedule_details_table;
	}
	
	@FindBy(xpath = "//td[@id='td_settlementScheduleGridTbl_Id_T06MT_1_amountPlusVat']")
	private WebElement IIS_settlement_menu_maintenance_schedule_details_row_amt;
	public WebElement IISSettlementMenuMaintenanceScheduleDetailsRowAmt() {
		return IIS_settlement_menu_maintenance_schedule_details_row_amt;
	}
	
	@FindBy(xpath = "//button[@id='savebutton_T06MT']")
	private WebElement IIS_settlement_menu_maintenance_save_btn;
	public WebElement IISSettlementMenuMaintenanceSaveBtn() {
		return IIS_settlement_menu_maintenance_save_btn;
	}
	
	@FindBy(xpath = "//div[@class='jMsgbox-contentWrap']")
	private WebElement IIS_settlement_menu_maintenance_success_popup_text;
	public WebElement IISSettlementMenuMaintenanceSuccessPopupText() {
		return IIS_settlement_menu_maintenance_success_popup_text;
	}
	
	@FindBy(xpath = "//a[@menuvar='T06MT']//parent::td//following-sibling::td//span")
	private WebElement IIS_settlement_maintenance_menu_close_icon;
	public WebElement IISSettlementMaintenanceMenuCloseIcon() {
		return IIS_settlement_maintenance_menu_close_icon;
	}
	
	@FindBy(xpath = "//a[@id='T06P']")
	private WebElement IIS_settlement_menu_approve;
	public WebElement IISSettlementMenuApprove() {
		return IIS_settlement_menu_approve;
	}
	
	@FindBy(xpath = "//input[@id='settlementMgmtGridTbl_Id_T06P_gs_trssetlmtvo.SETTLEMENT_NBR']")
	private WebElement IIS_settlement_menu_approve_searchgrid_settlement_nbr_input;
	public WebElement IISSettlementMenuApproveSearchgridSettlementNbrInput() {
		return IIS_settlement_menu_approve_searchgrid_settlement_nbr_input;
	}
	
	@FindBy(xpath = "//td[@id='td_settlementMgmtGridTbl_Id_T06P_1_trssetlmtvo.SETTLEMENT_NBR']")
	private WebElement IIS_settlement_menu_approve_searchgrid_row;
	public WebElement IISSettlementMenuApproveSearchgridRow() {
		return IIS_settlement_menu_approve_searchgrid_row;
	}
	
	@FindBy(xpath = "//input[@id='settlmentNo_T06P']")
	private WebElement IIS_settlement_menu_approve_settlement_nbr;
	public WebElement IISSettlementMenuApproveSettlementNbr() {
		return IIS_settlement_menu_approve_settlement_nbr;
	}
	
	@FindBy(xpath = "//button[@id='settlement_Approve_btn_T06P']")
	private WebElement IIS_settlement_approve_menu_approve_btn;
	public WebElement IISSettlementApproveMenuApproveBtn() {
		return IIS_settlement_approve_menu_approve_btn;
	}
	
	@FindBy(xpath = "//div[@class='jMsgbox-contentWrap'][contains(text(),'Collaterals')]")
	private WebElement IIS_approve_menu_confirm_collateral_popup;
	public WebElement IISApproveMenuConfirmCollateralPopup() {
		return IIS_approve_menu_confirm_collateral_popup;
	}
	
	@FindBy(xpath = "//div[@class='jMsgbox-contentWrap'][contains(text(),'continue')]")
	private WebElement IIS_approve_menu_confirm_continue_popup;
	public WebElement IISApproveMenuConfirmContinuePopup() {
		return IIS_approve_menu_confirm_continue_popup;
	}
	
	@FindBy(xpath = "//div[@class='jMsgbox-contentWrap'][contains(text(),'proceed')]")
	private WebElement IIS_approve_menu_confirm_proceed_popup;
	public WebElement IISApproveMenuConfirmPopupProceed() {
		return IIS_approve_menu_confirm_proceed_popup;
	}
	
	@FindBy(xpath = "//a[@menuvar='T06P']//parent::td//following-sibling::td//span")
	private WebElement IIS_settlement_approve_menu_close_icon;
	public WebElement IISSettlementApproveMenuCloseIcon() {
		return IIS_settlement_approve_menu_close_icon;
	}
	
	@FindBy(xpath = "//a[@id='T06RR']")
	private WebElement IIS_settlement_reverse_menu;
	public WebElement IISSettlementReverseMenu() {
		return IIS_settlement_reverse_menu;
	}
	
	@FindBy(xpath = "//input[@id='settlementMgmtGridTbl_Id_T06RR_gs_trssetlmtvo.SETTLEMENT_NBR']")
	private WebElement IIS_settlement_reverse_searchgrid_settlement_nbr_input;
	public WebElement IISSettlementReverseSearchgirdSettlementNbrInput() {
		return IIS_settlement_reverse_searchgrid_settlement_nbr_input;
	}
	
	@FindBy(xpath = "//td[@id='td_settlementMgmtGridTbl_Id_T06RR_1_trssetlmtvo.SETTLEMENT_NBR']")
	private WebElement IIS_settlement_reverse_searchgrid_row;
	public WebElement IISSettlementReverseSearchgirdRow() {
		return IIS_settlement_reverse_searchgrid_row;
	}
	
	@FindBy(xpath = "//input[@id='settlmentNo_T06RR']")
	private WebElement IIS_settlement_reverse_settlement_nbr;
	public WebElement IISSettlementReverseSettlementNbr() {
		return IIS_settlement_reverse_settlement_nbr;
	}
	
	@FindBy(xpath = "//div[@id='settlementToolBar_T06RR']/a")
	private WebElement IIS_settlement_reverse_menu_reverse_btn;
	public WebElement IISSettlementReverseMenuReverseBtn() {
		return IIS_settlement_reverse_menu_reverse_btn;
	}
	
	@FindBy(xpath = "//a[@id='T06V']")
	private WebElement IIS_settlement_approve_reverse_menu;
	public WebElement IISSettlementApproveReverseMenu() {
		return IIS_settlement_approve_reverse_menu;
	}
	
	@FindBy(xpath = "//input[@id='settlementMgmtGridTbl_Id_T06V_gs_trssetlmtvo.SETTLEMENT_NBR']")
	private WebElement IIS_settlement_approve_reverse_searchgrid_settlement_nbr_input;
	public WebElement IISSettlementApproveReverseSearchgirdSettlementNbrInput() {
		return IIS_settlement_approve_reverse_searchgrid_settlement_nbr_input;
	}
	
	@FindBy(xpath = "//td[@id='td_settlementMgmtGridTbl_Id_T06V_1_trssetlmtvo.SETTLEMENT_NBR']")
	private WebElement IIS_settlement_approve_reverse_searchgrid_row;
	public WebElement IISSettlementApproveReverseSearchgirdRow() {
		return IIS_settlement_approve_reverse_searchgrid_row;
	}
	
	@FindBy(xpath = "//input[@id='settlmentNo_T06V']")
	private WebElement IIS_settlement_approve_reverse_settlement_nbr;
	public WebElement IISSettlementApproveReverseSettlementNbr() {
		return IIS_settlement_approve_reverse_settlement_nbr;
	}
	
	@FindBy(xpath = "//button[@id='settlement_Reverse_btn_T06V']")
	private WebElement IIS_settlement_approve_reverse_menu_reverse_btn;
	public WebElement IISSettlementApproveReverseMenuReverseBtn() {
		return IIS_settlement_approve_reverse_menu_reverse_btn;
	}
	
	
	
	
	
	
	
	
	
	
//	Repayment Plan
	@FindBy(xpath = "//td[text()='Repayment Plan']")
	private WebElement IIS_repayment_plan_module;
	public WebElement IISRepaymentPlanModule() {
		return IIS_repayment_plan_module;
	}
	
	@FindBy(xpath = "//a[@id='T04MT']")
	private WebElement IIS_repayment_plan_maintenance;
	public WebElement IISRepaymentPlanMaintenance() {
		return IIS_repayment_plan_maintenance;
	}
	
	@FindBy(xpath = "//a[@id='infoBarSearchButton_T04MT']")
	private WebElement IIS_repayment_plan_maintenance_search_btn;
	public WebElement IISRepaymentPlanMaintenanceSearchBtn() {
		return IIS_repayment_plan_maintenance_search_btn;
	}
	
	@FindBy(xpath = "//input[@id='repaymentPlanMgmtGridTbl_Id_T04MT_gs_trspayplanVO.TRX_NBR']")
	private WebElement IIS_repayment_plan_maintenance_searchgrid_deal_nbr_input;
	public WebElement IISRepaymentPlanMaintenanceSearchgridDealNbrInput() {
		return IIS_repayment_plan_maintenance_searchgrid_deal_nbr_input;
	}
	
	@FindBy(xpath = "//td[@id='td_repaymentPlanMgmtGridTbl_Id_T04MT_1_trspayplanVO.PLAN_NBR']")
	private WebElement IIS_repayment_plan_maintenance_searchgrid_row;
	public WebElement IISRepaymentPlanMaintenanceSearchgridRow() {
		return IIS_repayment_plan_maintenance_searchgrid_row;
	}
	
	@FindBy(xpath = "//li[@id='rePaymentPlanMainTab2_T04MT']")
	private WebElement IIS_repayment_plan_maintenance_schedule_details_tab;
	public WebElement IISRepaymentPlanMaintenanceScheduleDetailsTab() {
		return IIS_repayment_plan_maintenance_schedule_details_tab;
	}
	
	@FindBy(xpath = "//td[@id='td_repaumentPlanScheduleGridTbl_Id_T04MT_0_rn'][text()='1']")
	private WebElement IIS_repayment_plan_maintenance_schedule_details_row;
	public WebElement IISRepaymentPlanMaintenanceScheduleDetailsRow() {
		return IIS_repayment_plan_maintenance_schedule_details_row;
	}
	
	@FindBy(xpath = "//td[@id='td_repaumentPlanScheduleGridTbl_Id_T04MT_1_incidentalCharge']/a")
	private WebElement IIS_repayment_plan_maintenance_schedule_details_row_incidental_charge;
	public WebElement IISRepaymentPlanMaintenanceScheduleDetailsRowIncidentalCharge() {
		return IIS_repayment_plan_maintenance_schedule_details_row_incidental_charge;
	}
	
	
//	Advance Principal Settlement module
	@FindBy(xpath = "//td[contains(text(),'Advance Principal Settlement')]")
	private WebElement IIS_advance_principal_settlement_module;
	public WebElement IISAdvancePrincipalSettlementModule() {
		return IIS_advance_principal_settlement_module;
	}
	
	@FindBy(xpath = "//a[@id='T036MT']")
	private WebElement IIS_advance_principal_settlement_maintenance;
	public WebElement IISAdvancePrincipalSettlementMaintenance() {
		return IIS_advance_principal_settlement_maintenance;
	}
	
	@FindBy(xpath = "//input[@id='lookuptxt_dealNo_T036MT']")
	private WebElement IIS_advance_principal_settlement_maintenance_deal_nbr_input;
	public WebElement IISAdvancePrincipalSettlementMaintenanceDealNbrInput() {
		return IIS_advance_principal_settlement_maintenance_deal_nbr_input;
	}
	
	@FindBy(xpath = "//input[@id='advance_Principal_T036MT']")
	private WebElement IIS_advance_principal_settlement_maintenance_advance_principal_input;
	public WebElement IISAdvancePrincipalSettlementMaintenanceAdvancePrincipalInput() {
		return IIS_advance_principal_settlement_maintenance_advance_principal_input;
	}
	
	@FindBy(xpath = "//button[@id='automaticAllocationButton_T036MT']")
	private WebElement IIS_advance_principal_settlement_maintenance_reschedule_allocate_btn;
	public WebElement IISAdvancePrincipalSettlementMaintenanceRescheduleAllocateBtn() {
		return IIS_advance_principal_settlement_maintenance_reschedule_allocate_btn;
	}
	
	@FindBy(xpath = "//table[@id='settlementScheduleGridTbl_Id_T036MT']")
	private WebElement IIS_advance_principal_settlement_maintenance_schedule_details_table;
	public WebElement IISAdvancePrincipalSettlementMaintenanceScheduleDetailsTable() {
		return IIS_advance_principal_settlement_maintenance_schedule_details_table;
	}
	
	@FindBy(xpath = "//button[@id='savebutton_T036MT']")
	private WebElement IIS_advance_principal_settlement_maintenance_save_btn;
	public WebElement IISAdvancePrincipalSettlementMaintenanceSaveBtn() {
		return IIS_advance_principal_settlement_maintenance_save_btn;
	}
	
	@FindBy(xpath = "//a[@id='T036P']")
	private WebElement IIS_advance_principal_settlement_approve_menu;
	public WebElement IISAdvancePrincipalSettlementApproveMenu() {
		return IIS_advance_principal_settlement_approve_menu;
	}
	
	@FindBy(xpath = "//input[@id='settlementMgmtGridTbl_Id_T036P_gs_trssetlmtvo.DEAL_NBR']")
	private WebElement IIS_advance_principal_settlement_approve_searchgrid_deal_nbr_input;
	public WebElement IISAdvancePrincipalSettlementApproveMenuSearchgridDealNbrInput() {
		return IIS_advance_principal_settlement_approve_searchgrid_deal_nbr_input;
	}
	
	@FindBy(xpath = "//td[@id='td_settlementMgmtGridTbl_Id_T036P_1_trssetlmtvo.SETTLEMENT_NBR']")
	private WebElement IIS_advance_principal_settlement_approve_searchgrid_row;
	public WebElement IISAdvancePrincipalSettlementApproveMenuSearchgridRow() {
		return IIS_advance_principal_settlement_approve_searchgrid_row;
	}
	
	@FindBy(xpath = "//input[@id='lookuptxt_dealNo_T036P']")
	private WebElement IIS_advance_principal_settlement_approve_menu_deal_nbr;
	public WebElement IISAdvancePrincipalSettlementApproveMenuDealNbr() {
		return IIS_advance_principal_settlement_approve_menu_deal_nbr;
	}
	
	@FindBy(xpath = "//button[@id='settlement_Approve_btn_T036P']")
	private WebElement IIS_advance_principal_settlement_approve_menu_approveBtn;
	public WebElement IISAdvancePrincipalSettlementApproveMenuApproveBtn() {
		return IIS_advance_principal_settlement_approve_menu_approveBtn;
	}
	
	
//	Periodical Processing
	@FindBy(xpath = "//td[text()='Periodical Processing']")
	private WebElement IIS_periodical_processing_module;
	public WebElement IISPeriodicalProcessingModule() {
		return IIS_periodical_processing_module;
	}
	
	@FindBy(xpath = "//td[text()='Post Accruals']")
	private WebElement IIS_post_accruals_menu;
	public WebElement IISPostAccrualsMenu() {
		return IIS_post_accruals_menu;
	}
	
	@FindBy(xpath = "//a[@id='T10EMF']")
	private WebElement IIS_final_accruals_submenu;
	public WebElement IISFinalAccrualsSubMenu() {
		return IIS_final_accruals_submenu;
	}
	
	@FindBy(xpath = "//input[@id='Specific_deal_T10EMF']")
	private WebElement IIS_final_accruals_specific_deal_checkbox;
	public WebElement IISFinalAccrualsSpecificDealCheckbox() {
		return IIS_final_accruals_specific_deal_checkbox;
	}
	
	@FindBy(xpath = "//input[@id='lookuptxt_postChargeAccuralProcessSpecificDeal_T10EMF']")
	private WebElement IIS_final_accruals_specific_deal_input;
	public WebElement IISFinalAccrualsSpecificDealInput() {
		return IIS_final_accruals_specific_deal_input;
	}
	
	@FindBy(xpath = "//input[@id='fromDate_T10EMF']")
	private WebElement IIS_final_accruals_from_date_input;
	public WebElement IISFinalAccrualsFromDateInput() {
		return IIS_final_accruals_from_date_input;
	}
	
	@FindBy(xpath = "//input[@id='toDate_T10EMF']")
	private WebElement IIS_final_accruals_to_date_input;
	public WebElement IISFinalAccrualsToDateInput() {
		return IIS_final_accruals_to_date_input;
	}
	
	@FindBy(xpath = "//button[@id='postChargeAccrualProcess_trialRun_T10EMF']")
	private WebElement IIS_final_accruals_Ok_btn;
	public WebElement IISFinalAccrualsOkBtn() {
		return IIS_final_accruals_Ok_btn;
	}
	
	
//	Calculators Module
	@FindBy(xpath = "//td[text()='Calculators']")
	private WebElement IIS_calculators_module;
	public WebElement IISCalculatorsModule() {
		return IIS_calculators_module;
	}
	
	@FindBy(xpath = "//a[@id='M0169']")
	private WebElement IIS_calculators_reschedule_calculator_With_Profit;
	public WebElement IISCalculatorsRescheduleCalculatorWithProfit() {
		return IIS_calculators_reschedule_calculator_With_Profit;
	}
	
	@FindBy(xpath = "//input[@id='lookuptxt_trsdealVO_SERIAL_NO_M0169']")
	private WebElement IIS_reschedule_calculator_With_Profit_deal_nbr_input;
	public WebElement IISRescheduleCalculatorWithProfitDealNbrInput() {
		return IIS_reschedule_calculator_With_Profit_deal_nbr_input;
	}
	
	@FindBy(xpath = "//div[@id='islamicRescheduleCalc_repaymentdet_collapspanel_M0169']")
	private WebElement IIS_reschedule_calculator_With_Profit_repayment_details_panel;
	public WebElement IISRescheduleCalculatorWithProfitRepaymentDetailsPanel() {
		return IIS_reschedule_calculator_With_Profit_repayment_details_panel;
	}
	
	@FindBy(xpath = "//input[@id='gracePeriod_M0169']")
	private WebElement IIS_reschedule_calculator_With_Profit_repayment_details_first_pay_after_input;
	public WebElement IISRescheduleCalculatorWithProfitRepaymentDetailsFirstPayAfterInput() {
		return IIS_reschedule_calculator_With_Profit_repayment_details_first_pay_after_input;
	}
	
	@FindBy(xpath = "//input[@id='no_of_payments_M0169']")
	private WebElement IIS_reschedule_calculator_With_Profit_repayment_details_no_of_pay_input;
	public WebElement IISRescheduleCalculatorWithProfitRepaymentDetailsNoOfPayInput() {
		return IIS_reschedule_calculator_With_Profit_repayment_details_no_of_pay_input;
	}
	
	@FindBy(xpath = "//button[@id='calculateBtn_M0169']")
	private WebElement IIS_reschedule_calculator_With_Profit_calculate_btn;
	public WebElement IISRescheduleCalculatorWithProfitCalculateBtn() {
		return IIS_reschedule_calculator_With_Profit_calculate_btn;
	}
	
	@FindBy(xpath = "//button[@id='rescheduleCalculatorUpdateBtn_M0169']")
	private WebElement IIS_reschedule_calculator_With_Profit_update_btn;
	public WebElement IISRescheduleCalculatorWithProfitUpdateBtn() {
		return IIS_reschedule_calculator_With_Profit_update_btn;
	}
	
//	Reschedule Repayment Plan module
	@FindBy(xpath = "//td[text()='Reschedule Repayment Plan']")
	private WebElement IIS_reschedule_repayment_plan_module;
	public WebElement IISRescheduleRepaymentPlanModule() {
		return IIS_reschedule_repayment_plan_module;
	}
	
	@FindBy(xpath = "//a[@id='T041P']")
	private WebElement IIS_reschedule_repayment_plan_approve_menu;
	public WebElement IISRescheduleRepaymentPlanApproveMenu() {
		return IIS_reschedule_repayment_plan_approve_menu;
	}
	
	@FindBy(xpath = "//input[@id='repaymentPlanMgmtGridTbl_Id_T041P_gs_trspayplanVO.TRX_NBR']")
	private WebElement IIS_reschedule_repayment_plan_approve_searchgrid_deal_input;
	public WebElement IISRescheduleRepaymentPlanApproveSearchgridDealInput() {
		return IIS_reschedule_repayment_plan_approve_searchgrid_deal_input;
	}
	
	@FindBy(xpath = "//td[@id='td_repaymentPlanMgmtGridTbl_Id_T041P_1_trspayplanVO.PLAN_NBR']")
	private WebElement IIS_reschedule_repayment_plan_approve_searchgrid_row;
	public WebElement IISRescheduleRepaymentPlanApproveSearchgridRow() {
		return IIS_reschedule_repayment_plan_approve_searchgrid_row;
	}
	
	@FindBy(xpath = "//input[@id='trx_nbr_hd_T041P']")
	private WebElement IIS_reschedule_repayment_plan_approve_menu_deal_nbr;
	public WebElement IISRescheduleRepaymentPlanApproveMenuDealNbr() {
		return IIS_reschedule_repayment_plan_approve_menu_deal_nbr;
	}
	
	@FindBy(xpath = "//a[@id='approvebutton_T041P']")
	private WebElement IIS_reschedule_repayment_plan_approve_menu_approve_btn;
	public WebElement IISRescheduleRepaymentPlanApproveMenuApproveBtn() {
		return IIS_reschedule_repayment_plan_approve_menu_approve_btn;
	}
	
}
