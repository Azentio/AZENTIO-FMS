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
   



}
