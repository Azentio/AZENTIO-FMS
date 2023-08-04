package pageobjects.CommonElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IIS_AccrualDeal_obj_610 {

	WebDriver driver;
	public IIS_AccrualDeal_obj_610(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	// Clear cache for FMS Core
			@FindBy(xpath = "//span[@id='tech_details_icon']")
			private WebElement IIS_core_tech_details_icon;
			public WebElement IISCoreTechDetailsIcon_610() {
				return IIS_core_tech_details_icon;
			}
			
			@FindBy(xpath = "//label[@id='clear_cache_key']")
			private WebElement IIS_core_clear_cache_btn;
			public WebElement IISCoreClearCacheBtn_610() {
				return IIS_core_clear_cache_btn;
			}
	
	@FindBy(xpath = "//td[text()='Investment Deals -Combined without Trade Deal']")
	private WebElement IIS_InvestmentDealWithoutTradeDeal_610;
	public WebElement IIS_InvestmentDealWithoutTradeDeal_610(){
		return IIS_InvestmentDealWithoutTradeDeal_610;
	}
	
	@FindBy(xpath = "//a[@id='T022MT']")
	private WebElement IIS_InvestmentDealWithoutTradeDeal_Maintenance_610;
	public WebElement IIS_InvestmentDealWithoutTradeDeal_Maintenance_610(){
		return IIS_InvestmentDealWithoutTradeDeal_Maintenance_610;
	}
	
	
	@FindBy(xpath = "//span[@id='spanLookup_investmentDeals_PARTY_T022MT']/span")
	private WebElement IIS_InvestmentDealWithoutTradeDeal_Maintenance_PartySearch_610;
	public WebElement IIS_InvestmentDealWithoutTradeDeal_Maintenance_PartySearch_610(){
		return IIS_InvestmentDealWithoutTradeDeal_Maintenance_PartySearch_610;
	}
	
	@FindBy(xpath = "//input[@id='gridtab_investmentDeals_PARTY_T022MT_gs_CIF_NO']")
	private WebElement IIS_InvestmentDealWithoutTradeDeal_Maintenance_Party_610;
	public WebElement IIS_InvestmentDealWithoutTradeDeal_Maintenance_Party_610(){
		return IIS_InvestmentDealWithoutTradeDeal_Maintenance_Party_610;
	}
	
	@FindBy(xpath = "//input[@id='_popup_path_sol_confirm_ok']")
	private WebElement IIS_ConfirmOk_610;
	public WebElement IIS_ConfirmOk_610(){
		return IIS_ConfirmOk_610;
	}
	
	@FindBy(xpath = "//input[@id='_popup_path_sol_confirm']")
	private WebElement IIS_ConfirmCancel_610;
	public WebElement IIS_ConfirmCancel_610(){
		return IIS_ConfirmCancel_610;
	}
	
	
	@FindBy(xpath = "//div[@id='div__popup_path_sol_confirm']/center/input[@id='_popup_path_sol_confirm_ok']")
	private WebElement IIS_ConfirmOk_DealNotCreated_610;
	public WebElement IIS_ConfirmOk_DealNotCreated_610(){
		return IIS_ConfirmOk_DealNotCreated_610;
	}
	
	@FindBy(xpath = "//div[text()='CONFIRM']")
	private WebElement IIS_ConfirmOkPopUp_610;
	public WebElement IIS_ConfirmOkPopUp_610(){
		return IIS_ConfirmOkPopUp_610;
	}
	
	@FindBy(xpath = "//span[@id='spanLookup_trsdealVO_DEAL_TYPE_T022MT']/span")
	private WebElement IIS_InvestmentDealWithoutTradeDeal_Maintenance_CategorySearch_610;
	public WebElement IIS_InvestmentDealWithoutTradeDeal_Maintenance_CategorySearch_610(){
		return IIS_InvestmentDealWithoutTradeDeal_Maintenance_CategorySearch_610;
	}

	@FindBy(xpath = "//input[@id='gridtab_trsdealVO_DEAL_TYPE_T022MT_gs_CATEGORY_CODE']")
	private WebElement IIS_InvestmentDealWithoutTradeDeal_Maintenance_Category_610;
	public WebElement IIS_InvestmentDealWithoutTradeDeal_Maintenance_Category_610(){
		return IIS_InvestmentDealWithoutTradeDeal_Maintenance_Category_610;
	}
	
	@FindBy(xpath = "//div[@id='lookupid_investmentDeals_CLASS_T022MT']/span/span")
	private WebElement IIS_InvestmentDealWithoutTradeDeal_Maintenance_ProductClassSearch_610;
	public WebElement IIS_InvestmentDealWithoutTradeDeal_Maintenance_ProductClassSearch_610(){
		return IIS_InvestmentDealWithoutTradeDeal_Maintenance_ProductClassSearch_610;
	}
	
	@FindBy(xpath = "//input[@id='gridtab_investmentDeals_CLASS_T022MT_gs_CODE']")
	private WebElement IIS_InvestmentDealWithoutTradeDeal_Maintenance_ProductClass_610;
	public WebElement IIS_InvestmentDealWithoutTradeDeal_Maintenance_ProductClass_610(){
		return IIS_InvestmentDealWithoutTradeDeal_Maintenance_ProductClass_610;
	}
	
	@FindBy(xpath = "//input[@id='trsdealVO_DD_DEAL_AMOUNT_T022MT']")
	private WebElement IIS_InvestmentDealWithoutTradeDeal_Maintenance_Amount_610;
	public WebElement IIS_InvestmentDealWithoutTradeDeal_Maintenance_Amount_610(){
		return IIS_InvestmentDealWithoutTradeDeal_Maintenance_Amount_610;
	}
	
	@FindBy(xpath = "//input[@id='trsdealVO_DD_PERIODICITY_NBR_T022MT']")
	private WebElement IIS_InvestmentDealWithoutTradeDeal_Maintenance_Tenure_610;
	public WebElement IIS_InvestmentDealWithoutTradeDeal_Maintenance_Tenure_610(){
		return IIS_InvestmentDealWithoutTradeDeal_Maintenance_Tenure_610;
	}
	
	@FindBy(xpath = "//input[@id='trsdealVO_DD_DEAL_EXPECTED_YIELD_T022MT']")
	private WebElement IIS_InvestmentDealWithoutTradeDeal_Maintenance_Yield_610;
	public WebElement IIS_InvestmentDealWithoutTradeDeal_Maintenance_Yield_610(){
		return IIS_InvestmentDealWithoutTradeDeal_Maintenance_Yield_610;
	}
	
	@FindBy(xpath = "//li[@id='investmentDealsMainTabs2_T022MT']/a/span")
	private WebElement IIS_InvestmentDealWithoutTradeDeal_Maintenance_ContributorDetails_610;
	public WebElement IIS_InvestmentDealWithoutTradeDeal_Maintenance_ContributorDetails_610(){
		return IIS_InvestmentDealWithoutTradeDeal_Maintenance_ContributorDetails_610;
	}
	
	@FindBy(xpath = "//table[@id='ContributorDetailsGridTbl_Id_T022MT']//td[@id='td_ContributorDetailsGridTbl_Id_T022MT_1_rn']")
	private WebElement IIS_InvestmentDealWithoutTradeDeal_Maintenance_ContributorDetails_Select_610;
	public WebElement IIS_InvestmentDealWithoutTradeDeal_Maintenance_ContributorDetails_Select_610(){
		return IIS_InvestmentDealWithoutTradeDeal_Maintenance_ContributorDetails_Select_610;
	}
	
	@FindBy(xpath = "//span[@id='spanLookup_nostro_sl_T022MT']/span")
	private WebElement IIS_InvestmentDealWithoutTradeDeal_Maintenance_ContributorDetails_NostroSearch_610;
	public WebElement IIS_InvestmentDealWithoutTradeDeal_Maintenance_ContributorDetails_NostroSearch_610(){
		return IIS_InvestmentDealWithoutTradeDeal_Maintenance_ContributorDetails_NostroSearch_610;
	}
	
	@FindBy(xpath = "//input[@id='gridtab_nostro_sl_T022MT_gs_amfVO.GL_CODE']")
	private WebElement IIS_InvestmentDealWithoutTradeDeal_Maintenance_ContributorDetails_Nostro_610;
	public WebElement IIS_InvestmentDealWithoutTradeDeal_Maintenance_ContributorDetails_Nostro_610(){
		return IIS_InvestmentDealWithoutTradeDeal_Maintenance_ContributorDetails_Nostro_610;
	}
	
	
	
	
	@FindBy(xpath = "//input[@id='nostro_acc_ref_T022MT']")
	private WebElement IIS_InvestmentDealWithoutTradeDeal_Maintenance_ContributorDetails_NostroInput_610;
	public WebElement IIS_InvestmentDealWithoutTradeDeal_Maintenance_ContributorDetails_NostroInput_610(){
		return IIS_InvestmentDealWithoutTradeDeal_Maintenance_ContributorDetails_NostroInput_610;
	}
	
	
	
	
	
	@FindBy(xpath = "//span[@id='spanLookup_matr_ac_sl_T022MT']/span")
	private WebElement IIS_InvestmentDealWithoutTradeDeal_Maintenance_ContributorDetails_MaturitySearch_610;
	public WebElement IIS_InvestmentDealWithoutTradeDeal_Maintenance_ContributorDetails_MaturitySearch_610(){
		return IIS_InvestmentDealWithoutTradeDeal_Maintenance_ContributorDetails_MaturitySearch_610;
	}
						
	@FindBy(xpath = "//input[@id='gridtab_matr_ac_sl_T022MT_gs_amfVO.GL_CODE']")
	private WebElement IIS_InvestmentDealWithoutTradeDeal_Maintenance_ContributorDetails_Maturity_610;
	public WebElement IIS_InvestmentDealWithoutTradeDeal_Maintenance_ContributorDetails_Maturity_610(){
		return IIS_InvestmentDealWithoutTradeDeal_Maintenance_ContributorDetails_Maturity_610;
	}
	
	@FindBy(xpath = "//input[@id='matr_ac_ref_T022MT']")
	private WebElement IIS_InvestmentDealWithoutTradeDeal_Maintenance_ContributorDetails_MaturityInput_610;
	public WebElement IIS_InvestmentDealWithoutTradeDeal_Maintenance_ContributorDetails_MaturityInput_610(){
		return IIS_InvestmentDealWithoutTradeDeal_Maintenance_ContributorDetails_MaturityInput_610;
	}
	
	@FindBy(xpath = "//button[@id='btnContribDetSave_T022MT']")
	private WebElement IIS_InvestmentDealWithoutTradeDeal_ContributorDetails_Ok_610;
	public WebElement IIS_InvestmentDealWithoutTradeDeal_ContributorDetails_Ok_610(){
		return IIS_InvestmentDealWithoutTradeDeal_ContributorDetails_Ok_610;
	}
	
	@FindBy(xpath = "//button[@id='investmentDeals_Save_btn_T022MT']")
	private WebElement IIS_InvestmentDealWithoutTradeDeal_Save_610;
	public WebElement IIS_InvestmentDealWithoutTradeDeal_Save_610(){
		return IIS_InvestmentDealWithoutTradeDeal_Save_610;
	}
	
	@FindBy(xpath = "//button[@id='repayPlanBtn_T022MT']")
	private WebElement IIS_InvestmentDealWithoutTradeDeal_RepaymentPlan_610;
	public WebElement IIS_InvestmentDealWithoutTradeDeal_RepaymentPlan_610(){
		return IIS_InvestmentDealWithoutTradeDeal_RepaymentPlan_610;
	}
	
	@FindBy(xpath = "//select[@id='SettlementType_T022MT']")
	private WebElement IIS_InvestmentDealWithoutTradeDeal_RepaymentPlan_SettlementType_610;
	public WebElement IIS_InvestmentDealWithoutTradeDeal_RepaymentPlan_SettlementType_610(){
		return IIS_InvestmentDealWithoutTradeDeal_RepaymentPlan_SettlementType_610;
	}
	
	@FindBy(xpath = "//input[@id='include_vat_in_instl_yn_T022MT']")
	private WebElement IIS_InvestmentDealWithoutTradeDeal_RepaymentPlan_VAT_610;
	public WebElement IIS_InvestmentDealWithoutTradeDeal_RepaymentPlan_VAT_610(){
		return IIS_InvestmentDealWithoutTradeDeal_RepaymentPlan_VAT_610;
	}
	
	@FindBy(xpath = "//input[@id='No_Of_Payments_T022MT']")
	private WebElement IIS_InvestmentDealWithoutTradeDeal_RepaymentPlan_NumberofPayments_610;
	public WebElement IIS_InvestmentDealWithoutTradeDeal_RepaymentPlan_NumberofPayments_610(){
		return IIS_InvestmentDealWithoutTradeDeal_RepaymentPlan_NumberofPayments_610;
	}
	
	@FindBy(xpath = "//input[@id='paym_periodn_nbr_T022MT']")
	private WebElement IIS_InvestmentDealWithoutTradeDeal_RepaymentPlan_PayEvery_610;
	public WebElement IIS_InvestmentDealWithoutTradeDeal_RepaymentPlan_PayEvery_610(){
		return IIS_InvestmentDealWithoutTradeDeal_RepaymentPlan_PayEvery_610;
	}
	
	@FindBy(xpath = "//input[@id='rep_grace_period_option_T022MT']")
	private WebElement IIS_InvestmentDealWithoutTradeDeal_RepaymentPlan_Graceperiod_610;
	public WebElement IIS_InvestmentDealWithoutTradeDeal_RepaymentPlan_Graceperiod_610(){
		return IIS_InvestmentDealWithoutTradeDeal_RepaymentPlan_Graceperiod_610;
	}
	
	@FindBy(xpath = "//input[@id='grace_period_compounding_yn_T022MT']")
	private WebElement IIS_InvestmentDealWithoutTradeDeal_RepaymentPlan_CompoundingDuringGraceperiod_610;
	public WebElement IIS_InvestmentDealWithoutTradeDeal_RepaymentPlan_CompoundingDuringGraceperiod_610(){
		return IIS_InvestmentDealWithoutTradeDeal_RepaymentPlan_CompoundingDuringGraceperiod_610;
	}
	
	@FindBy(xpath = "total_amt_T022MT")
	private WebElement IIS_investment_deal_without_trade_deal_main_repayment_amt_field;
	public WebElement IISInvestmentDealWithoutTradeDealMainRepaymentAmtField_610(){
		return IIS_investment_deal_without_trade_deal_main_repayment_amt_field;
	}
	
	
	@FindBy(xpath = "//button[@id='createSchedule_T022MT']")
	private WebElement IIS_InvestmentDealWithoutTradeDeal_RepaymentPlan_CreateScheduleBtn_610;
	public WebElement IIS_InvestmentDealWithoutTradeDeal_RepaymentPlan_CreateScheduleBtn_610(){
		return IIS_InvestmentDealWithoutTradeDeal_RepaymentPlan_CreateScheduleBtn_610;
	}
	
	@FindBy(xpath = "//div[@id='gview_repaumentPlanScheduleGridTbl_Id_T022MT']")
	private WebElement IIS_InvestmentDealWithoutTradeDeal_RepaymentPlan_ScheduleTable_610;
	public WebElement IIS_InvestmentDealWithoutTradeDeal_RepaymentPlan_ScheduleTable_610(){
		return IIS_InvestmentDealWithoutTradeDeal_RepaymentPlan_ScheduleTable_610;
	}
	
	@FindBy(xpath = "//span[@id='ui-dialog-title-RepaymentPlanMaint_combained_Div_T022MT']/parent::div/a")
	private WebElement IIS_InvestmentDealWithoutTradeDeal_RepaymentPlan_CloseBtn_610;
	public WebElement IIS_InvestmentDealWithoutTradeDeal_RepaymentPlan_CloseBtn_610(){
		return IIS_InvestmentDealWithoutTradeDeal_RepaymentPlan_CloseBtn_610;
	}
	
	@FindBy(xpath = "//button[@id='investmentDeals_Validate_btn_T022MT']")
	private WebElement IIS_InvestmentDealWithoutTradeDeal_Validate_610;
	public WebElement IIS_InvestmentDealWithoutTradeDeal_Validate_610(){
		return IIS_InvestmentDealWithoutTradeDeal_Validate_610;
	}

	@FindBy(xpath = "//a[@id='T022P']/span[text()='Approve']")
	private WebElement IIS_InvestmentDealWithoutTradeDeal_Approve_610;
	public WebElement IIS_InvestmentDealWithoutTradeDeal_Approve_610(){
		return IIS_InvestmentDealWithoutTradeDeal_Approve_610;
	}
	
	@FindBy(xpath = "//input[@id='investmentDealsGridTbl_Id_T022P_gs_trsdealVO.SERIAL_NO']")
	private WebElement IIS_InvestmentDealWithoutTradeDeal_Approve_DealNo_610;
	public WebElement IIS_InvestmentDealWithoutTradeDeal_Approve_DealNo_610(){
		return IIS_InvestmentDealWithoutTradeDeal_Approve_DealNo_610;
	}
	
	@FindBy(xpath = "//td[@id='td_investmentDealsGridTbl_Id_T022P_1_trsdealVO.SERIAL_NO']")
	private WebElement IIS_investment_deal_without_trade_deal_approve_menu_searchgrid_row;
	public WebElement IISInvestmentDealWithoutTradeDealApproveMenuSearchgridRow_610(){
		return IIS_investment_deal_without_trade_deal_approve_menu_searchgrid_row;
	}
	
	@FindBy(xpath = "//input[@id='trsdealVO_SERIAL_NO_T022P']")
	private WebElement IIS_InvestmentDealWithoutTradeDeal_Approve_DealNoWait_610;
	public WebElement IIS_InvestmentDealWithoutTradeDeal_Approve_DealNoWait_610(){
		return IIS_InvestmentDealWithoutTradeDeal_Approve_DealNoWait_610;
	}
	
	@FindBy(xpath = "//button[@id='investmentDeals_Approve_btn_T022P']")
	private WebElement IIS_InvestmentDealWithoutTradeDeal_Approve_ApproveBtn_610;
	public WebElement IIS_InvestmentDealWithoutTradeDeal_Approve_ApproveBtn_610(){
		return IIS_InvestmentDealWithoutTradeDeal_Approve_ApproveBtn_610;
	}
	
//	@FindBy(xpath = "//input[@id='_popup_path_sol_confirm_ok']")
//	private WebElement IIS_confirm_popup_ok_btn;
//	public WebElement IIS_ConfirmPopupOkBtn_610(){
//		return IIS_confirm_popup_ok_btn;
//	}
	
		
//	@FindBy(xpath = "//input[@id='_popup_path_sol_confirm_ok']")
//	private WebElement IIS_warning_popup_ok_btn;
//	public WebElement IIS_WarningPopupOkBtn_610(){
//		return IIS_warning_popup_ok_btn;
//	}
	
//	@FindBy(xpath = "//input[@id='_popup_path_sol_ok']")
//	private WebElement IIS_success_popup_ok_btn;
//	public WebElement IIS_SuccessPopupOkBtn_610(){
//		return IIS_success_popup_ok_btn;
//	}
	
	@FindBy(xpath = "//div[contains(text(),'INFORMATION')]")
	private WebElement IIS_Information_PopUp_610;
	public WebElement IIS_Information_PopUp_610(){
		return IIS_Information_PopUp_610;
	}
	
	@FindBy(xpath = "//div[@class='jMsgbox-contentWrap'][contains(text(),'Deal No')]")
	private WebElement IIS_Information_PopUp_TextMsg_610;
	public WebElement IIS_Information_PopUp_TextMsg_610(){
		return IIS_Information_PopUp_TextMsg_610;
	}	
	
	@FindBy(xpath = "//input[@id='_popup_path_sol_ok']")
	private WebElement IIS_Ok_610;
	public WebElement IIS_Ok_610(){
		return IIS_Ok_610;
	}
	
//------------------	Settlement
	
	@FindBy(xpath = "//td[text()='Settlement']")
	private WebElement IIS_settlement_menu;
	public WebElement IISSettlementMenu_610() {
		return IIS_settlement_menu;
	}
	
	@FindBy(xpath = "//a[@id='T06MT']")
	private WebElement IIS_settlement_menu_maintenance;
	public WebElement IISSettlementMenuMaintenance_610() {
		return IIS_settlement_menu_maintenance;
	}
	
	@FindBy(xpath = "//input[@id='lookuptxt_dealNo_T06MT']")
	private WebElement IIS_settlement_menu_maintenance_deal_nbr_input;
	public WebElement IISSettlementMenuMaintenanceDealNbrInput_610() {
		return IIS_settlement_menu_maintenance_deal_nbr_input;
	}
	
	@FindBy(xpath = "//input[@id='crossCyPartyAmount_T06MT']")
	private WebElement IIS_settlement_menu_maintenance_party_amt_input;
	public WebElement IISSettlementMenuMaintenancePartyAmtInput_610() {
		return IIS_settlement_menu_maintenance_party_amt_input;
	}
	
	@FindBy(xpath = "//button[@id='automaticAllocationButton_T06MT']")
	private WebElement IIS_settlement_menu_maintenance_auto_allocation_btn;
	public WebElement IISSettlementMenuMaintenanceAutoAllocationBtn_610() {
		return IIS_settlement_menu_maintenance_auto_allocation_btn;
	}
	
	@FindBy(xpath = "//li[@id='settlementTab2_T06MT']")
	private WebElement IIS_settlement_menu_maintenance_schedule_details_tab;
	public WebElement IISSettlementMenuMaintenanceScheduleDetailsTab_610() {
		return IIS_settlement_menu_maintenance_schedule_details_tab;
	}
	
	@FindBy(xpath = "//table[@id='settlementScheduleGridTbl_Id_T06MT']")
	private WebElement IIS_settlement_menu_maintenance_schedule_details_table;
	public WebElement IISSettlementMenuMaintenanceScheduleDetailsTable_610() {
		return IIS_settlement_menu_maintenance_schedule_details_table;
	}
	
	@FindBy(xpath = "//td[@id='td_settlementScheduleGridTbl_Id_T06MT_1_amountPlusVat']")
	private WebElement IIS_settlement_menu_maintenance_schedule_details_row_amt;
	public WebElement IISSettlementMenuMaintenanceScheduleDetailsRowAmt_610() {
		return IIS_settlement_menu_maintenance_schedule_details_row_amt;
	}
	
	@FindBy(xpath = "//button[@id='savebutton_T06MT']")
	private WebElement IIS_settlement_menu_maintenance_save_btn;
	public WebElement IISSettlementMenuMaintenanceSaveBtn_610() {
		return IIS_settlement_menu_maintenance_save_btn;
	}
	
	@FindBy(xpath = "//div[@class='jMsgbox-contentWrap']")
	private WebElement IIS_settlement_menu_maintenance_success_popup_text;
	public WebElement IISSettlementMenuMaintenanceSuccessPopupText_610() {
		return IIS_settlement_menu_maintenance_success_popup_text;
	}
	
	@FindBy(xpath = "//a[@menuvar='T06MT']//parent::td//following-sibling::td//span")
	private WebElement IIS_settlement_maintenance_menu_close_icon;
	public WebElement IISSettlementMaintenanceMenuCloseIcon_610() {
		return IIS_settlement_maintenance_menu_close_icon;
	}
	
	@FindBy(xpath = "//a[@id='T06P']")
	private WebElement IIS_settlement_menu_approve;
	public WebElement IISSettlementMenuApprove_610() {
		return IIS_settlement_menu_approve;
	}
	
	@FindBy(xpath = "//input[@id='settlementMgmtGridTbl_Id_T06P_gs_trssetlmtvo.SETTLEMENT_NBR']")
	private WebElement IIS_settlement_menu_approve_searchgrid_settlement_nbr_input;
	public WebElement IISSettlementMenuApproveSearchgridSettlementNbrInput_610() {
		return IIS_settlement_menu_approve_searchgrid_settlement_nbr_input;
	}
	
	@FindBy(xpath = "//td[@id='td_settlementMgmtGridTbl_Id_T06P_1_trssetlmtvo.SETTLEMENT_NBR']")
	private WebElement IIS_settlement_menu_approve_searchgrid_row;
	public WebElement IISSettlementMenuApproveSearchgridRow_610() {
		return IIS_settlement_menu_approve_searchgrid_row;
	}
	
	@FindBy(xpath = "//input[@id='settlmentNo_T06P']")
	private WebElement IIS_settlement_menu_approve_settlement_nbr;
	public WebElement IISSettlementMenuApproveSettlementNbr_610() {
		return IIS_settlement_menu_approve_settlement_nbr;
	}
	
	@FindBy(xpath = "//button[@id='settlement_Approve_btn_T06P']")
	private WebElement IIS_settlement_approve_menu_approve_btn;
	public WebElement IISSettlementApproveMenuApproveBtn_610() {
		return IIS_settlement_approve_menu_approve_btn;
	}
	
	@FindBy(xpath = "//div[@class='jMsgbox-contentWrap'][contains(text(),'proceed')]")
	private WebElement IIS_approve_menu_confirm_proceed_popup;
	public WebElement IISApproveMenuConfirmPopupProceed_610() {
		return IIS_approve_menu_confirm_proceed_popup;
	}
	
	@FindBy(xpath = "//a[@menuvar='T06P']//parent::td//following-sibling::td//span")
	private WebElement IIS_settlement_approve_menu_close_icon;
	public WebElement IISSettlementApproveMenuCloseIcon_610() {
		return IIS_settlement_approve_menu_close_icon;
	}
	
	@FindBy(xpath = "//a[@id='T06RR']")
	private WebElement IIS_settlement_reverse_menu;
	public WebElement IISSettlementReverseMenu_610() {
		return IIS_settlement_reverse_menu;
	}
	
	@FindBy(xpath = "//input[@id='settlementMgmtGridTbl_Id_T06RR_gs_trssetlmtvo.SETTLEMENT_NBR']")
	private WebElement IIS_settlement_reverse_searchgrid_settlement_nbr_input;
	public WebElement IISSettlementReverseSearchgirdSettlementNbrInput_610() {
		return IIS_settlement_reverse_searchgrid_settlement_nbr_input;
	}
	
	@FindBy(xpath = "//td[@id='td_settlementMgmtGridTbl_Id_T06RR_1_trssetlmtvo.SETTLEMENT_NBR']")
	private WebElement IIS_settlement_reverse_searchgrid_row;
	public WebElement IISSettlementReverseSearchgirdRow_610() {
		return IIS_settlement_reverse_searchgrid_row;
	}
	
	@FindBy(xpath = "//input[@id='settlmentNo_T06RR']")
	private WebElement IIS_settlement_reverse_settlement_nbr;
	public WebElement IISSettlementReverseSettlementNbr_610() {
		return IIS_settlement_reverse_settlement_nbr;
	}
	
	@FindBy(xpath = "//div[@id='settlementToolBar_T06RR']/a")
	private WebElement IIS_settlement_reverse_menu_reverse_btn;
	public WebElement IISSettlementReverseMenuReverseBtn_610() {
		return IIS_settlement_reverse_menu_reverse_btn;
	}
	
	@FindBy(xpath = "//a[@id='T06V']")
	private WebElement IIS_settlement_approve_reverse_menu;
	public WebElement IISSettlementApproveReverseMenu_610() {
		return IIS_settlement_approve_reverse_menu;
	}
	
	@FindBy(xpath = "//input[@id='settlementMgmtGridTbl_Id_T06V_gs_trssetlmtvo.SETTLEMENT_NBR']")
	private WebElement IIS_settlement_approve_reverse_searchgrid_settlement_nbr_input;
	public WebElement IISSettlementApproveReverseSearchgirdSettlementNbrInput_610() {
		return IIS_settlement_approve_reverse_searchgrid_settlement_nbr_input;
	}
	
	@FindBy(xpath = "//td[@id='td_settlementMgmtGridTbl_Id_T06V_1_trssetlmtvo.SETTLEMENT_NBR']")
	private WebElement IIS_settlement_approve_reverse_searchgrid_row;
	public WebElement IISSettlementApproveReverseSearchgirdRow_610() {
		return IIS_settlement_approve_reverse_searchgrid_row;
	}
	
	@FindBy(xpath = "//input[@id='settlmentNo_T06V']")
	private WebElement IIS_settlement_approve_reverse_settlement_nbr;
	public WebElement IISSettlementApproveReverseSettlementNbr_610() {
		return IIS_settlement_approve_reverse_settlement_nbr;
	}
	
	@FindBy(xpath = "//button[@id='settlement_Reverse_btn_T06V']")
	private WebElement IIS_settlement_approve_reverse_menu_reverse_btn;
	public WebElement IISSettlementApproveReverseMenuReverseBtn_610() {
		return IIS_settlement_approve_reverse_menu_reverse_btn;
	}
	
	//-------------success confirm ok button
	
	@FindBy(xpath = "//input[@id='_popup_path_sol_confirm_ok']")
	private WebElement IIS_confirm_popup_ok_btn;
	public WebElement IIS_ConfirmPopupOkBtn_610(){
		return IIS_confirm_popup_ok_btn;
	}
	
	@FindBy(xpath = "//input[@id='_popup_path_sol_confirm']")
	private WebElement IIS_confirm_popup_cancel_btn;
	public WebElement IIS_ConfirmPopupCancelBtn_610(){
		return IIS_confirm_popup_cancel_btn;
	}
	
	@FindBy(xpath = "//input[@id='_popup_path_sol_confirm_ok']")
	private WebElement IIS_warning_popup_ok_btn;
	public WebElement IIS_WarningPopupOkBtn_610(){
		return IIS_warning_popup_ok_btn;
	}
	
	@FindBy(xpath = "//input[@id='_popup_path_sol_ok']")
	private WebElement IIS_success_popup_ok_btn;
	public WebElement IIS_SuccessPopupOkBtn_610(){
		return IIS_success_popup_ok_btn;
	}
	
	@FindBy(xpath = "//div[contains(text(),'INFORMATION')]")
	private WebElement IIS_information_popup_title;
	public WebElement IIS_InformationPopupTitle_610(){
		return IIS_information_popup_title;
	}
	
	@FindBy(xpath = "//div[@class='jMsgbox-contentWrap'][contains(text(),'Deal No')]")
	private WebElement IIS_information_popup_text_msg;
	public WebElement IIS_InformationPopupTextMsg_610(){
		return IIS_information_popup_text_msg;
	}	
	
	@FindBy(xpath = "//input[@id='_popup_path_sol_ok']")
	private WebElement IIS_information_popup_ok_btn;
	public WebElement IIS_InformationPopupOkBtn_610(){
		return IIS_information_popup_ok_btn;
	}
	
	

	
}
