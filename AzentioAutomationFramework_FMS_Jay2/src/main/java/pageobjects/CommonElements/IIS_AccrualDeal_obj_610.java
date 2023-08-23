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
	
	
	//--------------------------------profit accrual ----------------------------------------------
	

	  @FindBy(xpath = "//td[text()='Periodical Processing']")
	    private WebElement IIS_PeriodicalProcessing_Menu;
	    public WebElement IISperiodicalprocessingmenu_610() {
	        return IIS_PeriodicalProcessing_Menu;
	    }
	    @FindBy(xpath = "//td[text()='Post Accruals']")
	    private WebElement IIS_PeriodicalProcessing_PostAccruals;
	    public WebElement IISperiodicalprocessingpostaccruals_610() {
	        return IIS_PeriodicalProcessing_PostAccruals;
	    }
	    @FindBy(xpath = "//a[@id='T10EMF']")
	    private WebElement IIS_PeriodicalProcessing_PostAccruals_FinalAccruals;
	    public WebElement IISperiodicalprocessingpostaccrualsfinalaccruals_610() {
	        return IIS_PeriodicalProcessing_PostAccruals_FinalAccruals;
	    }
	    @FindBy(xpath = "//input[@id='Specific_deal_T10EMF']")
	    private WebElement IIS_PeriodicalProcessing_PostAccruals_FinalAccruals_Specificdealcheckbox;
	    public WebElement IISperiodicalprocessingpostaccrualsfinalaccrualsspecificdealflagcheckbox_610() {
	        return IIS_PeriodicalProcessing_PostAccruals_FinalAccruals_Specificdealcheckbox;
	    }
	    @FindBy(xpath = "//input[@id='lookuptxt_postChargeAccuralProcessSpecificDeal_T10EMF']")
	    private WebElement IIS_PeriodicalProcessing_PostAccruals_FinalAccruals_dealnumsearchbox;
	    public WebElement IISperiodicalprocessingpostaccrualsfinalaccrualsdealnumsearchbox_610() {
	        return IIS_PeriodicalProcessing_PostAccruals_FinalAccruals_dealnumsearchbox;
	    }
	    @FindBy(xpath = "//input[@id='fromDate_T10EMF']")
	    private WebElement IIS_PeriodicalProcessing_PostAccruals_FinalAccruals_FromDate;
	    public WebElement IISperiodicalprocessingpostaccrualsfinalaccrualsfromdate_610() {
	        return IIS_PeriodicalProcessing_PostAccruals_FinalAccruals_FromDate;
	    }
	    @FindBy(xpath = "//input[@id='toDate_T10EMF']")
	    private WebElement IIS_PeriodicalProcessing_PostAccruals_FinalAccruals_todate;
	    public WebElement IISperiodicalprocessingpostaccrualsfinalaccrualstodate_610() {
	        return IIS_PeriodicalProcessing_PostAccruals_FinalAccruals_todate;
	    }
	    @FindBy(xpath = "//button[@id='postChargeAccrualProcess_trialRun_T10EMF']")
	    private WebElement IIS_PeriodicalProcessing_PostAccruals_FinalAccruals_OKbtn;
	    public WebElement IISperiodicalprocessingpostaccrualsfinalaccrualsokbtn_610() {
	        return IIS_PeriodicalProcessing_PostAccruals_FinalAccruals_OKbtn;
	    }

	//---------------------------------jv-------------------------
	    
	    
	    @FindBy(xpath = "//a[@id='T022MT']")
		private WebElement IIS_investment_deal_without_trade_deal_maintenance_menu;
		public WebElement IISInvestmentDealWithoutTradeDealMaintenanceMenu_610(){
			return IIS_investment_deal_without_trade_deal_maintenance_menu;
		}

        @FindBy(xpath = "//input[@id='_popup_path_sol_confirm_ok']")
		private WebElement CconfirmSave_popup_ok_btn;
		public WebElement CconfirmSave_popup_ok_btn(){
			return CconfirmSave_popup_ok_btn;
		}

        @FindBy(xpath = "(//*[@id='infoBarSearchButton_T022MT'])[1]")
	    private WebElement Click_SearchIn_mainteance_under_InvestmentDealsCombinedWithoutTradDeal;
	    public WebElement Click_SearchIn_mainteance_under_InvestmentDealsCombinedWithoutTradDeal_610() {
	        return Click_SearchIn_mainteance_under_InvestmentDealsCombinedWithoutTradDeal;
	    }
	  
	    @FindBy(xpath = "//*[@id='investmentDealsGridTbl_Id_T022MT_gs_trsdealVO.SERIAL_NO']")
	    private WebElement SearchRecordIn_mainteance_under_InvestmentDealsCombinedWithoutTradDeal;
	    public WebElement SearchRecordIn_mainteance_under_InvestmentDealsCombinedWithoutTradDeal_610() {
	        return SearchRecordIn_mainteance_under_InvestmentDealsCombinedWithoutTradDeal;
	    }
	  
	    @FindBy(xpath = "//*[@id='td_investmentDealsGridTbl_Id_T022MT_1_trsdealVO.SERIAL_NO']")
	    private WebElement SelectRecordIn_mainteance_under_InvestmentDealsCombinedWithoutTradDeal;
	    public WebElement SelectRecordIn_mainteance_under_InvestmentDealsCombinedWithoutTradDeal_610() {
	        return SelectRecordIn_mainteance_under_InvestmentDealsCombinedWithoutTradDeal;
	    }
	  
	    @FindBy(xpath = "//*[@id='pmtInstrBtn_T022MT']")
	    private WebElement Click_PaymentInstruction_In_mainteance_under_InvestmentDealsCombinedWithoutTradDeal;
	    public WebElement Click_PaymentInstruction_In_mainteance_under_InvestmentDealsCombinedWithoutTradDeal_610() {
	        return Click_PaymentInstruction_In_mainteance_under_InvestmentDealsCombinedWithoutTradDeal;
	    }
	  
	    @FindBy(xpath = "//*[@id='showJVD_btn_T022MT']")
	    private WebElement Click_JournalVoucherDetails_InPaymentInstruction_In_mainteance_under_InvestmentDealsCombinedWithoutTradDeal;
	    public WebElement Click_JournalVoucherDetails_InPaymentInstruction_In_mainteance_under_InvestmentDealsCombinedWithoutTradDeal_610() {
	        return Click_JournalVoucherDetails_InPaymentInstruction_In_mainteance_under_InvestmentDealsCombinedWithoutTradDeal;
	    }
	  
	    @FindBy(xpath = "//*[@id='td_transactionAccountJvList_Id_T022MT_3_trsaccountvo.CV_AMOUNT']")
	    private WebElement CheckIncidental_Charges_InJournalVoucherDetails_InPaymentInstruction_In_mainteance_under_InvestmentDealsCombinedWithoutTradDeal;
	    public WebElement CheckIncidental_Charges_InJournalVoucherDetails_InPaymentInstruction_In_mainteance_under_InvestmentDealsCombinedWithoutTradDeal_610() {
	        return CheckIncidental_Charges_InJournalVoucherDetails_InPaymentInstruction_In_mainteance_under_InvestmentDealsCombinedWithoutTradDeal;
	    }
	    
	    
	    //----------------MTS POM ------ Parameters ---------------------------
	    
	   
		@FindBy(xpath = "//td[text()='Parameters']")
		private WebElement MTS_parameter_module;
		public WebElement MTSParameterModule_610() {
			return MTS_parameter_module;
		}
		
		@FindBy(xpath = "//td[text()='Batch']")
		private WebElement MTS_parameter_batch;
		public WebElement MTSParameterBatch_610() {
			return MTS_parameter_batch;
		}
		
		@FindBy(xpath = "//a[@id='P0003MT']")
		private WebElement MTS_parameter_batch_maintenance;
		public WebElement MTSParameterBatchMaintenance_610() {
			return MTS_parameter_batch_maintenance;
		}
		
		@FindBy(xpath = "//input[@id='additionalReference_P0003MT']")
		private WebElement MTS_param_batch_maintenance_additional_ref_nbr;
		public WebElement MTSParamBatchMaintenanceAdditionalRefNbr_610() {
			return MTS_param_batch_maintenance_additional_ref_nbr;
		}
		
		@FindBy(xpath = "//input[@id='briefName_P0003MT']")
		private WebElement MTS_param_batch_maintenance_brief_name;
		public WebElement MTSParamBatchMaintenanceBriefName_610() {
			return MTS_param_batch_maintenance_brief_name;
		}
		
		@FindBy(xpath = "//input[@id='LongName_P0003MT']")
		private WebElement MTS_param_batch_maintenance_long_name;
		public WebElement MTSParamBatchMaintenanceLongName_610() {
			return MTS_param_batch_maintenance_long_name;
		}
		
		@FindBy(xpath = "//input[@id='menuReference_P0003MT']")
		private WebElement MTS_param_batch_maintenance_menu_ref_nbr;
		public WebElement MTSParamBatchMaintenanceMenuRefNbr_610() {
			return MTS_param_batch_maintenance_menu_ref_nbr;
		}
		
		@FindBy(xpath = "//select[@id='batchPeriodicity_P0003MT']")
		private WebElement MTS_param_batch_maintenance_periodicity_dropdown;
		public WebElement MTSParamBatchMaintenancePeriodicityDropdown_610() {
			return MTS_param_batch_maintenance_periodicity_dropdown;
		}
			
		@FindBy(xpath = "//a[contains(text(),'Oracle BAJ')]/preceding-sibling::ins")
		private WebElement MTS_param_batch_main_batch_details_oracle_baj;
		public WebElement MTSParamBatchMainBatchDetailsTabOracleBAJ_610() {
			return MTS_param_batch_main_batch_details_oracle_baj;
		}
		
		@FindBy(xpath = "(//a[contains(text(),'Head Office')]/ins)[1]")
		private WebElement MTS_param_batch_main_batch_details_oracle_baj_head_office;
		public WebElement MTSParamBatchMainBatchDetailsTabOracleBAJHeadOffice_610() {
			return MTS_param_batch_main_batch_details_oracle_baj_head_office;
		}
		
		@FindBy(xpath = "(//a[contains(text(),'Treasury-Invest')]/ins)[1]")
		private WebElement MTS_param_batch_main_batch_details_oracle_baj_ICD_treasury;
		public WebElement MTSParamBatchMainBatchDetailsTabOracleBAJICDTreasury_610() {
			return MTS_param_batch_main_batch_details_oracle_baj_ICD_treasury;
		}
		
		@FindBy(xpath = "//li[@nodecode='Financing And Treasury']/ins")
		private WebElement MTS_param_batch_main_process_financing_treasury;
		public WebElement MTSParamBatchMainProcessFinancingTreasury_610() {
			return MTS_param_batch_main_process_financing_treasury;
		}
		
		@FindBy(xpath = "(//li[@nodecode='16']/a/ins)[1]")
		private WebElement MTS_param_batch_main_process_financing_treasury_create_settlement;
		public WebElement MTSParamBatchMainProcessFinancingTreasuryCreateSettlement_610() {
			return MTS_param_batch_main_process_financing_treasury_create_settlement;
		}
		
		@FindBy(xpath = "(//li[@nodecode='17']/a/ins)[1]")
		private WebElement MTS_param_batch_main_process_financing_treasury_approve_settlement;
		public WebElement MTSParamBatchMainProcessFinancingTreasuryApproveSettlement_610() {
			return MTS_param_batch_main_process_financing_treasury_approve_settlement;
		}
		
		@FindBy(xpath = "(//li[@nodecode='28']/a/ins)[1]")
		private WebElement MTS_param_batch_main_process_financing_treasury_profit_accrual_process;
		public WebElement MTSParamBatchMainProcessFinancingTreasuryProfitAccrualProcess_610() {
			return MTS_param_batch_main_process_financing_treasury_profit_accrual_process;
		}
		
		@FindBy(xpath = "//li[@id='batchControlTabs_P0003MT']")
		private WebElement MTS_param_batch_main_batch_control_tab;
		public WebElement MTSParamBatchMainBatchControlTab_610() {
			return MTS_param_batch_main_batch_control_tab;
		}
		
		@FindBy(xpath = "//select[@id='processBatch2_P0003MT']")
		private WebElement MTS_param_batch_main_batch_control_tab_process_batch_dropdown;
		public WebElement MTSParamBatchMainBatchControlTabProcessBatchDropdown_610() {
			return MTS_param_batch_main_batch_control_tab_process_batch_dropdown;
		}
		
		@FindBy(xpath = "//select[@id='processBatchOpenedBranch_P0003MT']")
		private WebElement MTS_param_batch_main_batch_control_tab_opened_branch_dropdown;
		public WebElement MTSParamBatchMainBatchControlTabOpenedBranchDropdown_610() {
			return MTS_param_batch_main_batch_control_tab_opened_branch_dropdown;
		}
		
		@FindBy(xpath = "//button[@id='batchMaintForm_Save_Btn_P0003MT']")
		private WebElement MTS_param_batch_maintenance_save_btn;
		public WebElement MTSParamBatchMaintenanceSaveBtn_610() {
			return MTS_param_batch_maintenance_save_btn;
		}
		
		@FindBy(xpath = "//a[@id='P0003AP']")
		private WebElement MTS_param_batch_approve_menu;
		public WebElement MTSParamBatchApproveMenu_610() {
			return MTS_param_batch_approve_menu;
		}
		
		@FindBy(xpath = "//input[contains(@id,'ADDITIONAL_REFERENCE')]")
		private WebElement MTS_param_batch_approve_menu_searchgrid_additional_ref_input;
		public WebElement MTSParamBatchApproveMenuSearchgridAdditionalRefInput_610() {
			return MTS_param_batch_approve_menu_searchgrid_additional_ref_input;
		}
		
		@FindBy(xpath = "//td[@id='td_batchGridTbl_Id_P0003AP_1_eodBatchMasterVO.BATCH_CODE']")
		private WebElement MTS_param_batch_approve_menu_searchgrid_row;
		public WebElement MTSParamBatchApproveMenuSearchgridRow_610() {
			return MTS_param_batch_approve_menu_searchgrid_row;
		}
		
		@FindBy(xpath = "//input[@id='additionalReference_P0003AP']")
		private WebElement MTS_param_batch_approve_menu_additional_ref;
		public WebElement MTSParamBatchApproveMenuAdditionalRef_610() {
			return MTS_param_batch_approve_menu_additional_ref;
		}
		
		@FindBy(xpath = "//button[@id='batchMaintForm_Approve_Btn_P0003AP']")
		private WebElement MTS_param_batch_approve_menu_approve_btn;
		public WebElement MTSParamBatchApproveMenuApproveBtn_610() {
			return MTS_param_batch_approve_menu_approve_btn;
		}
		
//		MTS - Process
		@FindBy(xpath = "//td[text()='Process']")
		private WebElement MTS_process_module;
		public WebElement MTSProcessModule_610() {
			return MTS_process_module;
		}
		
		@FindBy(xpath = "//td[text()='Batch Process']")
		private WebElement MTS_process_batch_process_menu;
		public WebElement MTSProcessBatchProcessMenu_610() {
			return MTS_process_batch_process_menu;
		}	
			
		@FindBy(xpath = "//span[text()='Batch Run']")
		private WebElement MTS_process_batch_process_menu_batch_run;
		public WebElement MTSProcessBatchProcessMenuBatchRun_610() {
			return MTS_process_batch_process_menu_batch_run;
		}
			
		@FindBy(xpath = "//input[contains(@id,'runningDate')]")
		private WebElement MTS_process_batch_process_menu_batch_run_Date;
		public WebElement MTSProcessBatchProcessMenuBatchRunDate_610() {
			return MTS_process_batch_process_menu_batch_run_Date;
		}
		
		@FindBy(xpath = "//button[contains(@id,'batchRun_Btn_Run')]")
		private WebElement MTS_process_batch_process_menu_batch_run_opt_run_btn;
		public WebElement MTSProcessBatchProcessMenuBatchRunOptRunBtn_610() {
			return MTS_process_batch_process_menu_batch_run_opt_run_btn;
		}
		
		 //----------------MTS POM end------ Parameters ---------------------------
		
		
		//---------IIS Params ----------------------------------------
		
		@FindBy(xpath = "//td[text()='Parameters']")
		private WebElement IIS_parameter_feature;
		public WebElement IISParameterFeature_610() {
			return IIS_parameter_feature;
		}
		
		@FindBy(xpath = "//td[text()='Product Class']")
		private WebElement IIS_parameter_product_class_module;
		public WebElement IISParameterProductClassModule_610() {
			return IIS_parameter_product_class_module;
		}
		
		@FindBy(xpath = "//a[@id='M003MT']")
		private WebElement IIS_product_class_maintanance;
		public WebElement IISProductClassMaintanance_610() {
			return IIS_product_class_maintanance;
		}
	        
	        @FindBy(xpath = "//a[@id='infoBarSearchButton_M003MT']")
		private WebElement IIS_product_class_maintenance_search_btn;
		public WebElement IISProductClassMaintenanceSearchBtn_610() {
			return IIS_product_class_maintenance_search_btn;
		}
		
		@FindBy(xpath = "//input[@id='iISProductClassListGridTbl_Id_M003MT_gs_trsctrlclassVO.CLASS']")
		private WebElement IIS_product_class_main_searchgrid_class_input;
		public WebElement IISProductClassMainSearchgridClassInput_610() {
			return IIS_product_class_main_searchgrid_class_input;
		}
		
		@FindBy(xpath = "//td[@id='td_iISProductClassListGridTbl_Id_M003MT_1_trsctrlclassVO.CLASS']")
		private WebElement IIS_product_class_main_searchgrid_row;
		public WebElement IISProductClassMainSearchgridRow_610() {
			return IIS_product_class_main_searchgrid_row;
		}
		
		
		@FindBy(xpath = "//td[contains(@id,'td_iISProductClassListGridTbl_Id_M003MT') and @title='0160']")
		private WebElement IIS_product_class_main_search_result_row;
		public WebElement IISProductClassMainSearchResultRow_610() {
			return IIS_product_class_main_search_result_row;
		}
		
		@FindBy(xpath = "//input[@id='iisProductClassCategoryNameEng_M003MT']")
		private WebElement IIS_product_class_maintenance_category_name;
		public WebElement IISProductClassMaintenanceCategoryName_610() {
			return IIS_product_class_maintenance_category_name;
		}
		
		@FindBy(xpath = "//li[@id='iisProductClassAdditionalInformation_M003MT']")
		private WebElement IIS_product_class_main_additional_information_tab;
		public WebElement IISProductClassMainAdditionalInformationTab_610() {
			return IIS_product_class_main_additional_information_tab;
		}	
		
		@FindBy(xpath = "//button[@id='iISProductClassMaint_save_M003MT']")
		private WebElement IIS_product_class_maintenance_save_btn;
		public WebElement IISProductClassMaintenanceSaveBtn_610() {
			return IIS_product_class_maintenance_save_btn;
		}
		
		@FindBy(xpath = "//input[@id='iisProductClassDefaultAssetsFromFmsYN_M003MT']")
		private WebElement IIS_product_class_main_additional_info_tab_default_asset_from_fms_checkbox;
		public WebElement IISProductClassMainAdditionalInfoTabDefaultAssetFromFMSCheckbox_610() {
			return IIS_product_class_main_additional_info_tab_default_asset_from_fms_checkbox;
		}
		

		//------------------Set Fiscal implication 
		
		@FindBy(xpath = "//label[@id='iisProductClassMaintFormId_M003MT_set_fiscal_implication_key']")
		private WebElement setFiscalImplicationKey_InGeneralInformation_610;
		public WebElement setFiscalImplicationKey_InGeneralInformation_610() {
			return setFiscalImplicationKey_InGeneralInformation_610;
		}
		
		@FindBy(xpath = "//span[@id='ui-dialog-title-FiscalImplicationDiv_M003MT']")
		private WebElement FiscalImplication_Popup_UndersetFiscalImplication_610;
		public WebElement FiscalImplication_Popup_UndersetFiscalImplication_610() {
			return FiscalImplication_Popup_UndersetFiscalImplication_610;
		}
		
		@FindBy(xpath = "//b[text()='Asset Management Screen']")
		private WebElement AssetManagementScreen_UndersetFiscalImplication_610;
		public WebElement AssetManagementScreen_UndersetFiscalImplication_610() {
			return AssetManagementScreen_UndersetFiscalImplication_610;
		}
		
		//---------------------Asset Repossession Screen
		
		
		@FindBy(xpath = "//legend[@id=\"legend\"]/b[text()='Asset Repossession Screen']")
		private WebElement AssetRepossessionScreen_UndersetFiscalImplication_610;
		public WebElement AssetRepossessionScreen_UndersetFiscalImplication_610() {
			return AssetRepossessionScreen_UndersetFiscalImplication_610;
		}
		
//		@FindBy(xpath = "//legend[@id=\"legend\"]/b[text()='Asset Repossession Screen']")
//		private WebElement AssetRepossessionScreen_UndersetFiscalImplication_610;
//		public WebElement AssetRepossessionScreen_UndersetFiscalImplication_610() {
//			return AssetRepossessionScreen_UndersetFiscalImplication_610;
//		}
//		
		
}
