package pageobjects.iis;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccrualdealOBJ_611 {
	
	WebDriver driver;
	public AccrualdealOBJ_611(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	// Clear cache for IIS Core
	@FindBy(xpath = "//span[@id='tech_details_icon']")
	private WebElement IIS_core_tech_details_icon;
	public WebElement IISCoreTechDetailsIcon_611() {
		return IIS_core_tech_details_icon;
	}
	
	@FindBy(xpath = "//label[@id='clear_cache_key']")
	private WebElement IIS_core_clear_cache_btn;
	public WebElement IISCoreClearCacheBtn_611() {
		return IIS_core_clear_cache_btn;
	}
	@FindBy(xpath = "//input[@id='_popup_path_sol_ok']")
	private WebElement IIS_success_popup_ok_btn;
	public WebElement IIS_SuccessPopupOkBtn_611(){
		return IIS_success_popup_ok_btn;
	}
	
//	Investment Deals -Combined without Trade Deal
	@FindBy(xpath = "//td[text()='Investment Deals -Combined without Trade Deal']")
	private WebElement IIS_investment_deal_without_trade_deal_menu;
	public WebElement IISInvestmentDealWithoutTradeDealMenu_611(){
		return IIS_investment_deal_without_trade_deal_menu;
	}
	
	@FindBy(xpath = "//a[@id='T022MT']")
	private WebElement IIS_investment_deal_without_trade_deal_maintenance_menu;
	public WebElement IISInvestmentDealWithoutTradeDealMaintenanceMenu_611(){
		return IIS_investment_deal_without_trade_deal_maintenance_menu;
	}
	
	@FindBy(xpath = "//input[@id='lookuptxt_investmentDeals_PARTY_T022MT']")
	private WebElement IIS_investment_deal_without_trade_deal_main_party_input;
	public WebElement IISInvestmentDealWithoutTradeDealMainPartyInput_611(){
		return IIS_investment_deal_without_trade_deal_main_party_input;
	}
	
//	Category input ==> Charge code 
	@FindBy(xpath = "//input[@id='lookuptxt_trsdealVO_DEAL_TYPE_T022MT']")
	private WebElement IIS_investment_deal_without_trade_deal_main_category_input;
	public WebElement IISInvestmentDealWithoutTradeDealMainCategoryInput_611(){
		return IIS_investment_deal_without_trade_deal_main_category_input;
	}
	
	@FindBy(xpath = "//input[@id='lookuptxt_investmentDeals_CLASS_T022MT']")
	private WebElement IIS_investment_deal_without_trade_deal_main_product_class_input;
	public WebElement IISInvestmentDealWithoutTradeDealMainProductClassInput_611(){
		return IIS_investment_deal_without_trade_deal_main_product_class_input;
	}
	
	@FindBy(xpath = "//input[@id='lookuptxt_trsdealVO_DD_DEAL_CY_T022MT']")
	private WebElement IIS_investment_deal_without_trade_deal_main_deal_cy_input;
	public WebElement IISInvestmentDealWithoutTradeDealMainDealCYnput_611(){
		return IIS_investment_deal_without_trade_deal_main_deal_cy_input;
	}
	
	@FindBy(xpath = "//input[@id='trsdealVO_DD_DEAL_AMOUNT_T022MT']")
	private WebElement IIS_investment_deal_without_trade_deal_main_amount_input;
	public WebElement IISInvestmentDealWithoutTradeDealMainAmountInput_611(){
		return IIS_investment_deal_without_trade_deal_main_amount_input;
	}
	
	@FindBy(xpath = "//input[@id='trsdealVO_DD_DEAL_EXPECTED_YIELD_T022MT']")
	private WebElement IIS_investment_deal_without_trade_deal_main_yield_margin_input;
	public WebElement IISInvestmentDealWithoutTradeDealMainYieldMarginInput_611(){
		return IIS_investment_deal_without_trade_deal_main_yield_margin_input;
	}
	
	@FindBy(xpath = "//li[@id='investmentDealsMainTabs2_T022MT']")
	private WebElement IIS_investment_deal_without_trade_deal_main_contributor_tab;
	public WebElement IISInvestmentDealWithoutTradeDealMainContributorTab_611(){
		return IIS_investment_deal_without_trade_deal_main_contributor_tab;
	}
	
	@FindBy(xpath = "//td[@id='td_ContributorDetailsGridTbl_Id_T022MT_1_rn']")
	private WebElement IIS_investment_deal_without_trade_deal_main_contributor_tab_row;
	public WebElement IISInvestmentDealWithoutTradeDealMainContributorTabRow_611(){
		return IIS_investment_deal_without_trade_deal_main_contributor_tab_row;
	}
	
	@FindBy(xpath = "//span[@id='spanLookup_nostro_sl_T022MT']")
	private WebElement IIS_investment_deal_without_trade_deal_main_contributor_details_nostro_lookup;
	public WebElement IISInvestmentDealWithoutTradeDealMainContributorDetailsNostroLookup_611(){
		return IIS_investment_deal_without_trade_deal_main_contributor_details_nostro_lookup;
	}
	
	@FindBy(xpath = "//td[@id='td_gridtab_nostro_sl_T022MT_1_amfVO.BRANCH_CODE']")
	private WebElement IIS_investment_deal_without_trade_deal_main_contributor_details_nostro_lookup_row;
	public WebElement IISInvestmentDealWithoutTradeDealMainContributorDetailsNostroLookupRow_611(){
		return IIS_investment_deal_without_trade_deal_main_contributor_details_nostro_lookup_row;
	}
	
	@FindBy(xpath = "//input[@id='nostro_acc_ref_T022MT']")
	private WebElement IIS_investment_deal_without_trade_deal_main_contributor_details_nostro_input;
	public WebElement IISInvestmentDealWithoutTradeDealMainContributorDetailsNostroInput_611(){
		return IIS_investment_deal_without_trade_deal_main_contributor_details_nostro_input;
	}
	
	@FindBy(xpath = "//span[@id='spanLookup_matr_ac_sl_T022MT']")
	private WebElement IIS_investment_deal_without_trade_deal_main_contributor_details_maturity_lookup;
	public WebElement IISInvestmentDealWithoutTradeDealMainContributorDetailsMaturityLookup_611(){
		return IIS_investment_deal_without_trade_deal_main_contributor_details_maturity_lookup;
	}
	
	@FindBy(xpath = "//td[@id='td_gridtab_matr_ac_sl_T022MT_1_amfVO.BRANCH_CODE']")
	private WebElement IIS_investment_deal_without_trade_deal_main_contributor_details_maturity_lookup_row;
	public WebElement IISInvestmentDealWithoutTradeDealMainContributorDetailsMaturityLookupRow_611(){
		return IIS_investment_deal_without_trade_deal_main_contributor_details_maturity_lookup_row;
	}
	
	@FindBy(xpath = "//input[@id='matr_ac_ref_T022MT']")
	private WebElement IIS_investment_deal_without_trade_deal_main_contributor_details_maturity_input;
	public WebElement IISInvestmentDealWithoutTradeDealMainContributorDetailsMaturityInput_611(){
		return IIS_investment_deal_without_trade_deal_main_contributor_details_maturity_input;
	}
	
	@FindBy(xpath = "//button[@id='btnContribDetSave_T022MT']")
	private WebElement IIS_investment_deal_without_trade_deal_main_contributor_details_Ok_btn;
	public WebElement IISInvestmentDealWithoutTradeDealMainContributorDetailsOkBtn_611(){
		return IIS_investment_deal_without_trade_deal_main_contributor_details_Ok_btn;
	}
	
	@FindBy(xpath = "//button[@id='investmentDeals_Save_btn_T022MT']")
	private WebElement IIS_investment_deal_without_trade_deal_main_save_btn;
	public WebElement IISInvestmentDealWithoutTradeDealMainSaveBtn_611(){
		return IIS_investment_deal_without_trade_deal_main_save_btn;
	}
	
	@FindBy(xpath = "//button[@id='repayPlanBtn_T022MT']")
	private WebElement IIS_investment_deal_without_trade_deal_main_repayment_plan_btn;
	public WebElement IISInvestmentDealWithoutTradeDealMainRepaymentPlanBtn_611(){
		return IIS_investment_deal_without_trade_deal_main_repayment_plan_btn;
	}
	
	@FindBy(xpath = "//input[@id='total_amt_T022MT']")
	private WebElement IIS_investment_deal_without_trade_deal_main_repayment_amt_field;
	public WebElement IISInvestmentDealWithoutTradeDealMainRepaymentAmtField_611(){
		return IIS_investment_deal_without_trade_deal_main_repayment_amt_field;
	}
	
	@FindBy(xpath = "//input[@id='No_Of_Payments_T022MT']")
	private WebElement IIS_investment_deal_without_trade_deal_main_repayment_no_of_payment_input;
	public WebElement IISInvestmentDealWithoutTradeDealMainRepaymentNoOfPaymentsInput_611(){
		return IIS_investment_deal_without_trade_deal_main_repayment_no_of_payment_input;
	}
	
	
	@FindBy(xpath = "//input[@id='grace_period_compounding_yn_T022MT']")
	private WebElement IIS_investment_deal_without_trade_deal_main_repayment_grace_period_checkbox;
	public WebElement IISInvestmentDealWithoutTradeDealMainRepaymentGracePeriodCheckbox_611(){
		return IIS_investment_deal_without_trade_deal_main_repayment_grace_period_checkbox;
	}
	
	@FindBy(xpath = "//button[@id='createSchedule_T022MT']")
	private WebElement IIS_investment_deal_without_trade_deal_main_repayment_create_schedule_btn;
	public WebElement IISInvestmentDealWithoutTradeDealMainRepaymentCreateScheduleBtn_611(){
		return IIS_investment_deal_without_trade_deal_main_repayment_create_schedule_btn;
	}
	
	@FindBy(xpath = "//div[@id='gview_repaumentPlanScheduleGridTbl_Id_T022MT']")
	private WebElement IIS_investment_deal_without_trade_deal_main_repayment_schedule_table;
	public WebElement IISInvestmentDealWithoutTradeDealMainRepaymentScheduleTable_611(){
		return IIS_investment_deal_without_trade_deal_main_repayment_schedule_table;
	}
	
	@FindBy(xpath = "//span[@id='ui-dialog-title-RepaymentPlanMaint_combained_Div_T022MT']/parent::div/a")
	private WebElement IIS_investment_deal_without_trade_deal_main_repayment_plan_tab_close_icon;
	public WebElement IISInvestmentDealWithoutTradeDealMainRepaymentPlanTabCloseIcon_611(){
		return IIS_investment_deal_without_trade_deal_main_repayment_plan_tab_close_icon;
	}
	
	@FindBy(xpath = "//button[@id='investmentDeals_Validate_btn_T022MT']")
	private WebElement IIS_investment_deal_without_trade_deal_main_validate_btn;
	public WebElement IISInvestmentDealWithoutTradeDealMainValidateBtn_611(){
		return IIS_investment_deal_without_trade_deal_main_validate_btn;
	}

	@FindBy(xpath = "//a[@id='T022P']")
	private WebElement IIS_investment_deal_without_trade_deal_approve_menu;
	public WebElement IISInvestmentDealWithoutTradeDealApproveMenu_611(){
		return IIS_investment_deal_without_trade_deal_approve_menu;
	}
	
	@FindBy(xpath = "//input[@id='investmentDealsGridTbl_Id_T022P_gs_trsdealVO.SERIAL_NO']")
	private WebElement IIS_investment_deal_without_trade_deal_approve_menu_searchgrid_dealnbr_input;
	public WebElement IISInvestmentDealWithoutTradeDealApproveMenuSearchgridDealNbrInput_611(){
		return IIS_investment_deal_without_trade_deal_approve_menu_searchgrid_dealnbr_input;
	}
	
	@FindBy(xpath = "//td[@id='td_investmentDealsGridTbl_Id_T022P_1_trsdealVO.SERIAL_NO']")
	private WebElement IIS_investment_deal_without_trade_deal_approve_menu_searchgrid_row;
	public WebElement IISInvestmentDealWithoutTradeDealApproveMenuSearchgridRow_611(){
		return IIS_investment_deal_without_trade_deal_approve_menu_searchgrid_row;
	}
	
	@FindBy(xpath = "//input[@id='trsdealVO_SERIAL_NO_T022P']")
	private WebElement IIS_investment_deal_without_trade_deal_approve_menu_dealnbr;
	public WebElement IISInvestmentDealWithoutTradeDealApproveMenuDealNbr_611(){
		return IIS_investment_deal_without_trade_deal_approve_menu_dealnbr;
	}
	
	@FindBy(xpath = "//button[@id='investmentDeals_Approve_btn_T022P']")
	private WebElement IIS_investment_deal_without_trade_deal_approve_menu_approve_btn;
	public WebElement IISInvestmentDealWithoutTradeDealApproveMenuApproveBtn_611(){
		return IIS_investment_deal_without_trade_deal_approve_menu_approve_btn;
	}
	
//	Settlement
	@FindBy(xpath = "//td[text()='Settlement']")
	private WebElement IIS_settlement_menu;
	public WebElement IISSettlementMenu_611() {
		return IIS_settlement_menu;
	}
	
	@FindBy(xpath = "//a[@id='T06MT']")
	private WebElement IIS_settlement_menu_maintenance;
	public WebElement IISSettlementMenuMaintenance_611() {
		return IIS_settlement_menu_maintenance;
	}
	
	@FindBy(xpath = "//input[@id='lookuptxt_dealNo_T06MT']")
	private WebElement IIS_settlement_menu_maintenance_deal_nbr_input;
	public WebElement IISSettlementMenuMaintenanceDealNbrInput_611() {
		return IIS_settlement_menu_maintenance_deal_nbr_input;
	}
	
	@FindBy(xpath = "//input[@id='crossCyPartyAmount_T06MT']")
	private WebElement IIS_settlement_menu_maintenance_party_amt_input;
	public WebElement IISSettlementMenuMaintenancePartyAmtInput_611() {
		return IIS_settlement_menu_maintenance_party_amt_input;
	}
	
	@FindBy(xpath = "//button[@id='automaticAllocationButton_T06MT']")
	private WebElement IIS_settlement_menu_maintenance_auto_allocation_btn;
	public WebElement IISSettlementMenuMaintenanceAutoAllocationBtn_611() {
		return IIS_settlement_menu_maintenance_auto_allocation_btn;
	}
	
	@FindBy(xpath = "//li[@id='settlementTab2_T06MT']")
	private WebElement IIS_settlement_menu_maintenance_schedule_details_tab;
	public WebElement IISSettlementMenuMaintenanceScheduleDetailsTab_611() {
		return IIS_settlement_menu_maintenance_schedule_details_tab;
	}
	
	@FindBy(xpath = "//table[@id='settlementScheduleGridTbl_Id_T06MT']")
	private WebElement IIS_settlement_menu_maintenance_schedule_details_table;
	public WebElement IISSettlementMenuMaintenanceScheduleDetailsTable_611() {
		return IIS_settlement_menu_maintenance_schedule_details_table;
	}
	
	@FindBy(xpath = "//td[@id='td_settlementScheduleGridTbl_Id_T06MT_1_amountPlusVat']")
	private WebElement IIS_settlement_menu_maintenance_schedule_details_row_amt;
	public WebElement IISSettlementMenuMaintenanceScheduleDetailsRowAmt_611() {
		return IIS_settlement_menu_maintenance_schedule_details_row_amt;
	}
	
	@FindBy(xpath = "//button[@id='savebutton_T06MT']")
	private WebElement IIS_settlement_menu_maintenance_save_btn;
	public WebElement IISSettlementMenuMaintenanceSaveBtn_611() {
		return IIS_settlement_menu_maintenance_save_btn;
	}
	
	@FindBy(xpath = "//div[@class='jMsgbox-contentWrap']")
	private WebElement IIS_settlement_menu_maintenance_success_popup_text;
	public WebElement IISSettlementMenuMaintenanceSuccessPopupText_611() {
		return IIS_settlement_menu_maintenance_success_popup_text;
	}
	
	@FindBy(xpath = "//a[@menuvar='T06MT']//parent::td//following-sibling::td//span")
	private WebElement IIS_settlement_maintenance_menu_close_icon;
	public WebElement IISSettlementMaintenanceMenuCloseIcon_611() {
		return IIS_settlement_maintenance_menu_close_icon;
	}
	
	@FindBy(xpath = "//a[@id='T06P']")
	private WebElement IIS_settlement_menu_approve;
	public WebElement IISSettlementMenuApprove_611() {
		return IIS_settlement_menu_approve;
	}
	
	@FindBy(xpath = "//input[@id='settlementMgmtGridTbl_Id_T06P_gs_trssetlmtvo.SETTLEMENT_NBR']")
	private WebElement IIS_settlement_menu_approve_searchgrid_settlement_nbr_input;
	public WebElement IISSettlementMenuApproveSearchgridSettlementNbrInput_611() {
		return IIS_settlement_menu_approve_searchgrid_settlement_nbr_input;
	}
	
	@FindBy(xpath = "//td[@id='td_settlementMgmtGridTbl_Id_T06P_1_trssetlmtvo.SETTLEMENT_NBR']")
	private WebElement IIS_settlement_menu_approve_searchgrid_row;
	public WebElement IISSettlementMenuApproveSearchgridRow_611() {
		return IIS_settlement_menu_approve_searchgrid_row;
	}
	
	@FindBy(xpath = "//input[@id='settlmentNo_T06P']")
	private WebElement IIS_settlement_menu_approve_settlement_nbr;
	public WebElement IISSettlementMenuApproveSettlementNbr_611() {
		return IIS_settlement_menu_approve_settlement_nbr;
	}
	
	@FindBy(xpath = "//button[@id='settlement_Approve_btn_T06P']")
	private WebElement IIS_settlement_approve_menu_approve_btn;
	public WebElement IISSettlementApproveMenuApproveBtn_611() {
		return IIS_settlement_approve_menu_approve_btn;
	}
	
	@FindBy(xpath = "//div[@class='jMsgbox-contentWrap'][contains(text(),'proceed')]")
	private WebElement IIS_approve_menu_confirm_proceed_popup;
	public WebElement IISApproveMenuConfirmPopupProceed_611() {
		return IIS_approve_menu_confirm_proceed_popup;
	}
	
	@FindBy(xpath = "//a[@menuvar='T06P']//parent::td//following-sibling::td//span")
	private WebElement IIS_settlement_approve_menu_close_icon;
	public WebElement IISSettlementApproveMenuCloseIcon_611() {
		return IIS_settlement_approve_menu_close_icon;
	}
	
	@FindBy(xpath = "//a[@id='T06RR']")
	private WebElement IIS_settlement_reverse_menu;
	public WebElement IISSettlementReverseMenu_611() {
		return IIS_settlement_reverse_menu;
	}
	
	@FindBy(xpath = "//input[@id='settlementMgmtGridTbl_Id_T06RR_gs_trssetlmtvo.SETTLEMENT_NBR']")
	private WebElement IIS_settlement_reverse_searchgrid_settlement_nbr_input;
	public WebElement IISSettlementReverseSearchgirdSettlementNbrInput_611() {
		return IIS_settlement_reverse_searchgrid_settlement_nbr_input;
	}
	
	@FindBy(xpath = "//td[@id='td_settlementMgmtGridTbl_Id_T06RR_1_trssetlmtvo.SETTLEMENT_NBR']")
	private WebElement IIS_settlement_reverse_searchgrid_row;
	public WebElement IISSettlementReverseSearchgirdRow_611() {
		return IIS_settlement_reverse_searchgrid_row;
	}
	
	@FindBy(xpath = "//input[@id='settlmentNo_T06RR']")
	private WebElement IIS_settlement_reverse_settlement_nbr;
	public WebElement IISSettlementReverseSettlementNbr_611() {
		return IIS_settlement_reverse_settlement_nbr;
	}
	
	@FindBy(xpath = "//div[@id='settlementToolBar_T06RR']/a")
	private WebElement IIS_settlement_reverse_menu_reverse_btn;
	public WebElement IISSettlementReverseMenuReverseBtn_611() {
		return IIS_settlement_reverse_menu_reverse_btn;
	}
	
	@FindBy(xpath = "//a[@id='T06V']")
	private WebElement IIS_settlement_approve_reverse_menu;
	public WebElement IISSettlementApproveReverseMenu_611() {
		return IIS_settlement_approve_reverse_menu;
	}
	
	@FindBy(xpath = "//input[@id='settlementMgmtGridTbl_Id_T06V_gs_trssetlmtvo.SETTLEMENT_NBR']")
	private WebElement IIS_settlement_approve_reverse_searchgrid_settlement_nbr_input;
	public WebElement IISSettlementApproveReverseSearchgirdSettlementNbrInput_611() {
		return IIS_settlement_approve_reverse_searchgrid_settlement_nbr_input;
	}
	
	@FindBy(xpath = "//td[@id='td_settlementMgmtGridTbl_Id_T06V_1_trssetlmtvo.SETTLEMENT_NBR']")
	private WebElement IIS_settlement_approve_reverse_searchgrid_row;
	public WebElement IISSettlementApproveReverseSearchgirdRow_611() {
		return IIS_settlement_approve_reverse_searchgrid_row;
	}
	
	@FindBy(xpath = "//input[@id='settlmentNo_T06V']")
	private WebElement IIS_settlement_approve_reverse_settlement_nbr;
	public WebElement IISSettlementApproveReverseSettlementNbr_611() {
		return IIS_settlement_approve_reverse_settlement_nbr;
	}
	
	@FindBy(xpath = "//button[@id='settlement_Reverse_btn_T06V']")
	private WebElement IIS_settlement_approve_reverse_menu_reverse_btn;
	public WebElement IISSettlementApproveReverseMenuReverseBtn_611() {
		return IIS_settlement_approve_reverse_menu_reverse_btn;
	}
	@FindBy(xpath = "//input[@id='_popup_path_sol_confirm_ok']")
	private WebElement IIS_confirm_popup_ok_btn;
	public WebElement IIS_ConfirmPopupOkBtn_611(){
		return IIS_confirm_popup_ok_btn;
	}
	@FindBy(xpath = "//input[@id='_popup_path_sol_ok']")
	private WebElement IIS_information_popup_ok_btn;
	public WebElement IIS_InformationPopupOkBtn_611(){
		return IIS_information_popup_ok_btn;
	}
	@FindBy(xpath = "//input[@id='_popup_path_sol_confirm_ok']")
	private WebElement IIS_warning_popup_ok_btn;
	public WebElement IIS_WarningPopupOkBtn_611(){
		return IIS_warning_popup_ok_btn;
	}
	@FindBy(xpath = "//div[contains(text(),'INFORMATION')]")
	private WebElement IIS_information_popup_title;
	public WebElement IIS_InformationPopupTitle_611(){
		return IIS_information_popup_title;
	}
	
	@FindBy(xpath = "//div[@class='jMsgbox-contentWrap'][contains(text(),'Deal No')]")
	private WebElement IIS_information_popup_text_msg;
	public WebElement IIS_InformationPopupTextMsg_611(){
		return IIS_information_popup_text_msg;
	}	
	@FindBy(xpath = "//input[@id='_popup_path_sol_confirm']")
	private WebElement IIS_confirm_popup_cancel_btn;
	public WebElement IIS_ConfirmPopupCancelBtn_611(){
		return IIS_confirm_popup_cancel_btn;
	}
	
	@FindBy(xpath = "//div[@class='jMsgbox-contentWrap'][contains(text(),'continue')]")
    private WebElement IIS_approve_menu_confirm_continue_popup;
    public WebElement IISApproveMenuConfirmContinuePopup_611() {
        return IIS_approve_menu_confirm_continue_popup;
    }
    
    @FindBy(xpath = "//div[@class='jMsgbox-contentWrap'][contains(text(),'Collaterals')]")
    private WebElement IIS_approve_menu_confirm_collateral_popup;
    public WebElement IISApproveMenuConfirmCollateralPopup_611() {
        return IIS_approve_menu_confirm_collateral_popup;
    }
    //@128355/AT_AD_008
    @FindBy(xpath = "//td[text()='Periodical Processing']")
    private WebElement IIS_PeriodicalProcessing_Menu;
    public WebElement IISperiodicalprocessingmenu_611() {
        return IIS_PeriodicalProcessing_Menu;
    }
    @FindBy(xpath = "//td[text()='Post Accruals']")
    private WebElement IIS_PeriodicalProcessing_PostAccruals;
    public WebElement IISperiodicalprocessingpostaccruals_611() {
        return IIS_PeriodicalProcessing_PostAccruals;
    }
    @FindBy(xpath = "//a[@id='T10EMF']")
    private WebElement IIS_PeriodicalProcessing_PostAccruals_FinalAccruals;
    public WebElement IISperiodicalprocessingpostaccrualsfinalaccruals_611() {
        return IIS_PeriodicalProcessing_PostAccruals_FinalAccruals;
    }
    @FindBy(xpath = "//input[@id='Specific_deal_T10EMF']")
    private WebElement IIS_PeriodicalProcessing_PostAccruals_FinalAccruals_Specificdealcheckbox;
    public WebElement IISperiodicalprocessingpostaccrualsfinalaccrualsspecificdealflagcheckbox_611() {
        return IIS_PeriodicalProcessing_PostAccruals_FinalAccruals_Specificdealcheckbox;
    }
    @FindBy(xpath = "//input[@id='lookuptxt_postChargeAccuralProcessSpecificDeal_T10EMF']")
    private WebElement IIS_PeriodicalProcessing_PostAccruals_FinalAccruals_dealnumsearchbox;
    public WebElement IISperiodicalprocessingpostaccrualsfinalaccrualsdealnumsearchbox_611() {
        return IIS_PeriodicalProcessing_PostAccruals_FinalAccruals_dealnumsearchbox;
    }
    @FindBy(xpath = "//input[@id='fromDate_T10EMF']")
    private WebElement IIS_PeriodicalProcessing_PostAccruals_FinalAccruals_FromDate;
    public WebElement IISperiodicalprocessingpostaccrualsfinalaccrualsfromdate_611() {
        return IIS_PeriodicalProcessing_PostAccruals_FinalAccruals_FromDate;
    }
    @FindBy(xpath = "//input[@id='toDate_T10EMF']")
    private WebElement IIS_PeriodicalProcessing_PostAccruals_FinalAccruals_todate;
    public WebElement IISperiodicalprocessingpostaccrualsfinalaccrualstodate_611() {
        return IIS_PeriodicalProcessing_PostAccruals_FinalAccruals_todate;
    }
    @FindBy(xpath = "//button[@id='postChargeAccrualProcess_trialRun_T10EMF']")
    private WebElement IIS_PeriodicalProcessing_PostAccruals_FinalAccruals_OKbtn;
    public WebElement IISperiodicalprocessingpostaccrualsfinalaccrualsokbtn_611() {
        return IIS_PeriodicalProcessing_PostAccruals_FinalAccruals_OKbtn;
    }
    //@128356/AT_AD_009
    @FindBy(xpath = "//td[text()='Advance Principal Settlement']")
    private WebElement IIS_AdvancedPrincipalsettelement_Menu;
    public WebElement IISadvancedprincipalsettelementmenu_611() {
        return IIS_AdvancedPrincipalsettelement_Menu;
    }
    @FindBy(xpath = "//a[@id='T036MT']")
    private WebElement IIS_AdvancedPrincipalsettelement_Maintenance;
    public WebElement IISadvancedprincipalsettelementmaintenance_611() {
        return IIS_AdvancedPrincipalsettelement_Maintenance;
    }
    @FindBy(xpath = "//input[@id='lookuptxt_dealNo_T036MT']")
    private WebElement IIS_AdvancedPrincipalsettelement_Settlementdetails_Dealnum;
    public WebElement IISadvancedprincipalsettelementsettlementdetailsdealnum_611() {
        return IIS_AdvancedPrincipalsettelement_Settlementdetails_Dealnum;
    }
    @FindBy(xpath = "//input[@id='advance_Principal_T036MT']")
    private WebElement IIS_AdvancedPrincipalsettelementsettlementdetails_Advanceprincipalsetteledamount;
    public WebElement IISadvancedprincipalsettelementsettlementdetailsadvanceprincipalsetteledamount_611() {
        return IIS_AdvancedPrincipalsettelementsettlementdetails_Advanceprincipalsetteledamount;
    }
    @FindBy(xpath = "//label[@id='settlementDefFormId_T036MT_Reschedule_And_Allocate_Key']")
    private WebElement IIS_AdvancedPrincipalsettelement_settelementdetails_Rescheduleandallocatekey;
    public WebElement IISadvancedprincipalsettelementsettelementdetailsrescheduleandallocatebtn_611() {
        return IIS_AdvancedPrincipalsettelement_settelementdetails_Rescheduleandallocatekey;
    }
    @FindBy(xpath = "//button[@id='savebutton_T036MT']")
    private WebElement IIS_AdvancedPrincipalsettelement_Scheduledetails_savebtn;
    public WebElement IISadvancedprincipalsettelementscheduledetailssavebtn_611() {
        return IIS_AdvancedPrincipalsettelement_Scheduledetails_savebtn;
    }
    @FindBy(xpath = "//a[@id='T036P']")
	private WebElement IIS_advance_principal_settlement_approve_menu;
	public WebElement IISAdvancePrincipalSettlementApproveMenu_611() {
		return IIS_advance_principal_settlement_approve_menu;
	}
	
	@FindBy(xpath = "//input[@id='settlementMgmtGridTbl_Id_T036P_gs_trssetlmtvo.DEAL_NBR']")
	private WebElement IIS_advance_principal_settlement_approve_searchgrid_deal_nbr_input;
	public WebElement IISAdvancePrincipalSettlementApproveMenuSearchgridDealNbrInput_611() {
		return IIS_advance_principal_settlement_approve_searchgrid_deal_nbr_input;
	}
	
	@FindBy(xpath = "//td[@id='td_settlementMgmtGridTbl_Id_T036P_1_trssetlmtvo.SETTLEMENT_NBR']")
	private WebElement IIS_advance_principal_settlement_approve_searchgrid_row;
	public WebElement IISAdvancePrincipalSettlementApproveMenuSearchgridRow_611() {
		return IIS_advance_principal_settlement_approve_searchgrid_row;
	}
	
	@FindBy(xpath = "//input[@id='lookuptxt_dealNo_T036P']")
	private WebElement IIS_advance_principal_settlement_approve_menu_deal_nbr;
	public WebElement IISAdvancePrincipalSettlementApproveMenuDealNbr_611() {
		return IIS_advance_principal_settlement_approve_menu_deal_nbr;
	}
	
	@FindBy(xpath = "//button[@id='settlement_Approve_btn_T036P']")
	private WebElement IIS_advance_principal_settlement_approve_menu_approveBtn;
	public WebElement IISAdvancePrincipalSettlementApproveMenuApproveBtn_611() {
		return IIS_advance_principal_settlement_approve_menu_approveBtn;
	}
	@FindBy(xpath = "//table[@id='settlementScheduleGridTbl_Id_T036MT']")
	private WebElement IIS_advance_principal_settlement_maintenance_schedule_details_table;
	public WebElement IISAdvancePrincipalSettlementMaintenanceScheduleDetailsTable_611() {
		return IIS_advance_principal_settlement_maintenance_schedule_details_table;
	}
	@FindBy(xpath = "//label[@id='investmentDealsFormId_T022MT_JVD_key']")
	private WebElement IIS_investmentdealwithouttradedealmenu_Maintenance_JournalVocherdetails;
	public WebElement IISinvestmentdealwithouttradedealmenuMaintenanceJournalVocherdetails_611() {
		return IIS_investmentdealwithouttradedealmenu_Maintenance_JournalVocherdetails;
	}
	//131160/AT_AP_013
	@FindBy(xpath = "//button[@id='pmtInstrBtn_T022MT']")
	private WebElement IIS_investmentdealwithouttradedealmenu_Maintenance_Paymentinstruction;
	public WebElement IISinvestmentdealwithouttradedealmenuMaintenancepaymentinstruction_611() {
		return IIS_investmentdealwithouttradedealmenu_Maintenance_Paymentinstruction;
	}
	@FindBy(xpath = "//a[@id='showJVD_btn_T022MT']")
	private WebElement IIS_investmentdealwithouttradedealmenuPaymentinstruction_Jvd;
	public WebElement IISinvestmentdealwithouttradedealmenupaymentinstructionjvd_611() {
		return IIS_investmentdealwithouttradedealmenuPaymentinstruction_Jvd;
	}
	@FindBy(xpath = "//span[@id='ui-dialog-title-JVDetailsId']")
	private WebElement IIS_investmentdealwithouttradedealmenuPaymentinstruction_validateJvd;
	public WebElement IISinvestmentdealwithouttradedealmenupaymentinstructionvalidatejvd_611() {
		return IIS_investmentdealwithouttradedealmenuPaymentinstruction_validateJvd;
	}
//	Calculators Module
	@FindBy(xpath = "//td[text()='Calculators']")
	private WebElement IIS_calculators_module;
	public WebElement IISCalculatorsModule_611() {
		return IIS_calculators_module;
	}
	
	@FindBy(xpath = "//a[@id='M0169']")
	private WebElement IIS_calculators_reschedule_calculator_With_Profit;
	public WebElement IISCalculatorsRescheduleCalculatorWithProfit_611() {
		return IIS_calculators_reschedule_calculator_With_Profit;
	}
	
	@FindBy(xpath = "//input[@id='lookuptxt_trsdealVO_SERIAL_NO_M0169']")
	private WebElement IIS_reschedule_calculator_With_Profit_deal_nbr_input;
	public WebElement IISRescheduleCalculatorWithProfitDealNbrInput_611() {
		return IIS_reschedule_calculator_With_Profit_deal_nbr_input;
	}
	
	@FindBy(xpath = "//div[@id='islamicRescheduleCalc_repaymentdet_collapspanel_M0169']")
	private WebElement IIS_reschedule_calculator_With_Profit_repayment_details_panel;
	public WebElement IISRescheduleCalculatorWithProfitRepaymentDetailsPanel_611() {
		return IIS_reschedule_calculator_With_Profit_repayment_details_panel;
	}
	
	@FindBy(xpath = "//input[@id='gracePeriod_M0169']")
	private WebElement IIS_reschedule_calculator_With_Profit_repayment_details_first_pay_after_input;
	public WebElement IISRescheduleCalculatorWithProfitRepaymentDetailsFirstPayAfterInput_611() {
		return IIS_reschedule_calculator_With_Profit_repayment_details_first_pay_after_input;
	}
	
	@FindBy(xpath = "//input[@id='no_of_payments_M0169']")
	private WebElement IIS_reschedule_calculator_With_Profit_repayment_details_no_of_pay_input;
	public WebElement IISRescheduleCalculatorWithProfitRepaymentDetailsNoOfPayInput_611() {
		return IIS_reschedule_calculator_With_Profit_repayment_details_no_of_pay_input;
	}
	
	@FindBy(xpath = "//button[@id='calculateBtn_M0169']")
	private WebElement IIS_reschedule_calculator_With_Profit_calculate_btn;
	public WebElement IISRescheduleCalculatorWithProfitCalculateBtn_611() {
		return IIS_reschedule_calculator_With_Profit_calculate_btn;
	}
	
	@FindBy(xpath = "//button[@id='rescheduleCalculatorUpdateBtn_M0169']")
	private WebElement IIS_reschedule_calculator_With_Profit_update_btn;
	public WebElement IISRescheduleCalculatorWithProfitUpdateBtn_611() {
		return IIS_reschedule_calculator_With_Profit_update_btn;
	}
	
//	Reschedule Repayment Plan module
	@FindBy(xpath = "//td[text()='Reschedule Repayment Plan']")
	private WebElement IIS_reschedule_repayment_plan_module;
	public WebElement IISRescheduleRepaymentPlanModule_611() {
		return IIS_reschedule_repayment_plan_module;
	}
	
	@FindBy(xpath = "//a[@id='T041P']")
	private WebElement IIS_reschedule_repayment_plan_approve_menu;
	public WebElement IISRescheduleRepaymentPlanApproveMenu_611() {
		return IIS_reschedule_repayment_plan_approve_menu;
	}
	
	@FindBy(xpath = "//input[@id='repaymentPlanMgmtGridTbl_Id_T041P_gs_trspayplanVO.TRX_NBR']")
	private WebElement IIS_reschedule_repayment_plan_approve_searchgrid_deal_input;
	public WebElement IISRescheduleRepaymentPlanApproveSearchgridDealInput_611() {
		return IIS_reschedule_repayment_plan_approve_searchgrid_deal_input;
	}
	
	@FindBy(xpath = "//td[@id='td_repaymentPlanMgmtGridTbl_Id_T041P_1_trspayplanVO.PLAN_NBR']")
	private WebElement IIS_reschedule_repayment_plan_approve_searchgrid_row;
	public WebElement IISRescheduleRepaymentPlanApproveSearchgridRow_611() {
		return IIS_reschedule_repayment_plan_approve_searchgrid_row;
	}
	
	@FindBy(xpath = "//input[@id='trx_nbr_hd_T041P']")
	private WebElement IIS_reschedule_repayment_plan_approve_menu_deal_nbr;
	public WebElement IISRescheduleRepaymentPlanApproveMenuDealNbr_611() {
		return IIS_reschedule_repayment_plan_approve_menu_deal_nbr;
	}
	
	@FindBy(xpath = "//a[@id='approvebutton_T041P']")
	private WebElement IIS_reschedule_repayment_plan_approve_menu_approve_btn;
	public WebElement IISRescheduleRepaymentPlanApproveMenuApproveBtn_611() {
		return IIS_reschedule_repayment_plan_approve_menu_approve_btn;
	}
	
//	MTS - Parameters
	@FindBy(xpath = "//td[text()='Parameters']")
	private WebElement MTS_parameter_module;
	public WebElement MTSParameterModule_611() {
		return MTS_parameter_module;
	}
	
	@FindBy(xpath = "//td[text()='Batch']")
	private WebElement MTS_parameter_batch;
	public WebElement MTSParameterBatch_611() {
		return MTS_parameter_batch;
	}
	
	@FindBy(xpath = "//a[@id='P0003MT']")
	private WebElement MTS_parameter_batch_maintenance;
	public WebElement MTSParameterBatchMaintenance_611() {
		return MTS_parameter_batch_maintenance;
	}
	
	@FindBy(xpath = "//input[@id='additionalReference_P0003MT']")
	private WebElement MTS_param_batch_maintenance_additional_ref_nbr;
	public WebElement MTSParamBatchMaintenanceAdditionalRefNbr_611() {
		return MTS_param_batch_maintenance_additional_ref_nbr;
	}
	
	@FindBy(xpath = "//input[@id='briefName_P0003MT']")
	private WebElement MTS_param_batch_maintenance_brief_name;
	public WebElement MTSParamBatchMaintenanceBriefName_611() {
		return MTS_param_batch_maintenance_brief_name;
	}
	
	@FindBy(xpath = "//input[@id='LongName_P0003MT']")
	private WebElement MTS_param_batch_maintenance_long_name;
	public WebElement MTSParamBatchMaintenanceLongName_611() {
		return MTS_param_batch_maintenance_long_name;
	}
	
	@FindBy(xpath = "//input[@id='menuReference_P0003MT']")
	private WebElement MTS_param_batch_maintenance_menu_ref_nbr;
	public WebElement MTSParamBatchMaintenanceMenuRefNbr_611() {
		return MTS_param_batch_maintenance_menu_ref_nbr;
	}
	
	@FindBy(xpath = "//select[@id='batchPeriodicity_P0003MT']")
	private WebElement MTS_param_batch_maintenance_periodicity_dropdown;
	public WebElement MTSParamBatchMaintenancePeriodicityDropdown_611() {
		return MTS_param_batch_maintenance_periodicity_dropdown;
	}
		
	@FindBy(xpath = "//a[contains(text(),'Oracle BAJ')]/preceding-sibling::ins")
	private WebElement MTS_param_batch_main_batch_details_oracle_baj;
	public WebElement MTSParamBatchMainBatchDetailsTabOracleBAJ_611() {
		return MTS_param_batch_main_batch_details_oracle_baj;
	}
	
	@FindBy(xpath = "(//a[contains(text(),'Head Office')]/ins)[1]")
	private WebElement MTS_param_batch_main_batch_details_oracle_baj_head_office;
	public WebElement MTSParamBatchMainBatchDetailsTabOracleBAJHeadOffice_611() {
		return MTS_param_batch_main_batch_details_oracle_baj_head_office;
	}
	
	@FindBy(xpath = "(//a[contains(text(),'Treasury-Invest')]/ins)[1]")
	private WebElement MTS_param_batch_main_batch_details_oracle_baj_ICD_treasury;
	public WebElement MTSParamBatchMainBatchDetailsTabOracleBAJICDTreasury_611() {
		return MTS_param_batch_main_batch_details_oracle_baj_ICD_treasury;
	}
	
	@FindBy(xpath = "//li[@nodecode='Financing And Treasury']/ins")
	private WebElement MTS_param_batch_main_process_financing_treasury;
	public WebElement MTSParamBatchMainProcessFinancingTreasury_611() {
		return MTS_param_batch_main_process_financing_treasury;
	}
	
	@FindBy(xpath = "(//li[@nodecode='16']/a/ins)[1]")
	private WebElement MTS_param_batch_main_process_financing_treasury_create_settlement;
	public WebElement MTSParamBatchMainProcessFinancingTreasuryCreateSettlement_611() {
		return MTS_param_batch_main_process_financing_treasury_create_settlement;
	}
	
	@FindBy(xpath = "(//li[@nodecode='17']/a/ins)[1]")
	private WebElement MTS_param_batch_main_process_financing_treasury_approve_settlement;
	public WebElement MTSParamBatchMainProcessFinancingTreasuryApproveSettlement_611() {
		return MTS_param_batch_main_process_financing_treasury_approve_settlement;
	}
	
	@FindBy(xpath = "(//li[@nodecode='28']/a/ins)[1]")
	private WebElement MTS_param_batch_main_process_financing_treasury_profit_accrual_process;
	public WebElement MTSParamBatchMainProcessFinancingTreasuryProfitAccrualProcess_611() {
		return MTS_param_batch_main_process_financing_treasury_profit_accrual_process;
	}
	
	@FindBy(xpath = "//li[@id='batchControlTabs_P0003MT']")
	private WebElement MTS_param_batch_main_batch_control_tab;
	public WebElement MTSParamBatchMainBatchControlTab_611() {
		return MTS_param_batch_main_batch_control_tab;
	}
	
	@FindBy(xpath = "//select[@id='processBatch2_P0003MT']")
	private WebElement MTS_param_batch_main_batch_control_tab_process_batch_dropdown;
	public WebElement MTSParamBatchMainBatchControlTabProcessBatchDropdown_611() {
		return MTS_param_batch_main_batch_control_tab_process_batch_dropdown;
	}
	
	@FindBy(xpath = "//select[@id='processBatchOpenedBranch_P0003MT']")
	private WebElement MTS_param_batch_main_batch_control_tab_opened_branch_dropdown;
	public WebElement MTSParamBatchMainBatchControlTabOpenedBranchDropdown_611() {
		return MTS_param_batch_main_batch_control_tab_opened_branch_dropdown;
	}
	
	@FindBy(xpath = "//button[@id='batchMaintForm_Save_Btn_P0003MT']")
	private WebElement MTS_param_batch_maintenance_save_btn;
	public WebElement MTSParamBatchMaintenanceSaveBtn_611() {
		return MTS_param_batch_maintenance_save_btn;
	}
	
	@FindBy(xpath = "//a[@id='P0003AP']")
	private WebElement MTS_param_batch_approve_menu;
	public WebElement MTSParamBatchApproveMenu_611() {
		return MTS_param_batch_approve_menu;
	}
	
	@FindBy(xpath = "//input[contains(@id,'ADDITIONAL_REFERENCE')]")
	private WebElement MTS_param_batch_approve_menu_searchgrid_additional_ref_input;
	public WebElement MTSParamBatchApproveMenuSearchgridAdditionalRefInput_611() {
		return MTS_param_batch_approve_menu_searchgrid_additional_ref_input;
	}
	
	@FindBy(xpath = "//td[@id='td_batchGridTbl_Id_P0003AP_1_eodBatchMasterVO.BATCH_CODE']")
	private WebElement MTS_param_batch_approve_menu_searchgrid_row;
	public WebElement MTSParamBatchApproveMenuSearchgridRow_611() {
		return MTS_param_batch_approve_menu_searchgrid_row;
	}
	
	@FindBy(xpath = "//input[@id='additionalReference_P0003AP']")
	private WebElement MTS_param_batch_approve_menu_additional_ref;
	public WebElement MTSParamBatchApproveMenuAdditionalRef_611() {
		return MTS_param_batch_approve_menu_additional_ref;
	}
	
	@FindBy(xpath = "//button[@id='batchMaintForm_Approve_Btn_P0003AP']")
	private WebElement MTS_param_batch_approve_menu_approve_btn;
	public WebElement MTSParamBatchApproveMenuApproveBtn_611() {
		return MTS_param_batch_approve_menu_approve_btn;
	}
	
//	MTS - Process
	@FindBy(xpath = "//td[text()='Process']")
	private WebElement MTS_process_module;
	public WebElement MTSProcessModule_611() {
		return MTS_process_module;
	}
	
	@FindBy(xpath = "//td[text()='Batch Process']")
	private WebElement MTS_process_batch_process_menu;
	public WebElement MTSProcessBatchProcessMenu_611() {
		return MTS_process_batch_process_menu;
	}	
		
	@FindBy(xpath = "//span[text()='Batch Run']")
	private WebElement MTS_process_batch_process_menu_batch_run;
	public WebElement MTSProcessBatchProcessMenuBatchRun_611() {
		return MTS_process_batch_process_menu_batch_run;
	}
		
	@FindBy(xpath = "//input[contains(@id,'runningDate')]")
	private WebElement MTS_process_batch_process_menu_batch_run_Date;
	public WebElement MTSProcessBatchProcessMenuBatchRunDate_611() {
		return MTS_process_batch_process_menu_batch_run_Date;
	}
	
	@FindBy(xpath = "//button[contains(@id,'batchRun_Btn_Run')]")
	private WebElement MTS_process_batch_process_menu_batch_run_opt_run_btn;
	public WebElement MTSProcessBatchProcessMenuBatchRunOptRunBtn_611() {
		return MTS_process_batch_process_menu_batch_run_opt_run_btn;
	}
	
	//@352413/AT_AP_049
	@FindBy(xpath = "//a[@id='T10EMT']")
	private WebElement IIS_Periodicalprocessing_PostAccruals_TrialAccruals;
	public WebElement iis_periodicalprocessingmenupostaccruals_trialaccruals_611() {
		return IIS_Periodicalprocessing_PostAccruals_TrialAccruals;
	}
	@FindBy(xpath = "//input[@id='Specific_deal_T10EMT']")
	private WebElement IIS_Periodicalprocessing_PostAccruals_TrialAccruals_Flagcheckforspecficdeal;
	public WebElement iis_periodicalprocessingmenupostaccrualstrialaccrualsflagcheckforspecialdeal_611() {
		return IIS_Periodicalprocessing_PostAccruals_TrialAccruals_Flagcheckforspecficdeal;
	}
	@FindBy(xpath = "//input[@id='lookuptxt_postChargeAccuralProcessSpecificDeal_T10EMT']")
	private WebElement IIS_Periodicalprocessing_PostAccruals_TrialAccruals_Dealnumsearchbox;
	public WebElement iis_periodicalprocessingmenupostaccrualstrialaccrualsdealnumsearchbox_611() {
		return IIS_Periodicalprocessing_PostAccruals_TrialAccruals_Dealnumsearchbox;
	}
	@FindBy(xpath = "//input[@id='fromDate_T10EMT']")
	private WebElement IIS_Periodicalprocessing_PostAccruals_TrialAccrual_Fromdate;
	public WebElement iis_periodicalprocessingmenupostaccrualstrialaccrualfromdate_611() {
		return IIS_Periodicalprocessing_PostAccruals_TrialAccrual_Fromdate;
	}
	@FindBy(xpath = "//input[@id='toDate_T10EMT']")
	private WebElement IIS_Periodicalprocessing_PostAccruals_TrialAccrual_Todate;
	public WebElement iis_periodicalprocessingmenupostaccrualstrialaccrualtodate_611() {
		return IIS_Periodicalprocessing_PostAccruals_TrialAccrual_Todate;
	}
	@FindBy(xpath = "//button[@id='postChargeAccrualProcess_trialRun_T10EMT']")
	private WebElement IIS_Periodicalprocessing_PostAccruals_TrialAccrual_okbtn;
	public WebElement iis_periodicalprocessingmenupostaccrualstrialaccrualokbtn_611() {
		return IIS_Periodicalprocessing_PostAccruals_TrialAccrual_okbtn;
	}
	//352415/AT_AP_051
	@FindBy(xpath = "//a[@id='T10MM']")
	private WebElement IIS_PostAccrualsTillMaturityDateMenu;
	public WebElement iispostaccrualstillmaturitydatemenu_611() {
		return IIS_PostAccrualsTillMaturityDateMenu;
	}
	@FindBy(xpath = "//input[@id='lookuptxt_postChargeAccuralProcessSpecificDeal_T10MM']")
	private WebElement IIS_PostAccrualsTillMaturityDateMenu_DealNum;
	public WebElement iispostaccrualstillmaturitydatemenudealnum_611() {
		return IIS_PostAccrualsTillMaturityDateMenu_DealNum;
	}
	@FindBy(xpath = "//button[@id='postChargeAccrualProcess_trialRun_T10MM']")
	private WebElement IIS_PostAccrualsTillMaturityDateMenu_Trialbtn;
	public WebElement iispostaccrualstillmaturitydatemenutrialbtn_611() {
		return IIS_PostAccrualsTillMaturityDateMenu_Trialbtn;
	}
	@FindBy(xpath = "//button[@id='postChargeAccrualProcess_FinalRun_T10MM']")
	private WebElement IIS_PostAccrualsTillMaturityDateMenu_finalbtn;
	public WebElement iispostaccrualstillmaturitydatemenufinalbtn_611() {
		return IIS_PostAccrualsTillMaturityDateMenu_finalbtn;
	}
	//@128354/AT_AD_007
	@FindBy(xpath = "//input[@id='VAT_percentage_T022MT']")
	private WebElement IIS_Repaymentplan_Vatpercentagevalidate;
	public WebElement iisrepaymentplanvatpercentagevalidate_611() {
		return IIS_Repaymentplan_Vatpercentagevalidate;
	}
	
	
}
