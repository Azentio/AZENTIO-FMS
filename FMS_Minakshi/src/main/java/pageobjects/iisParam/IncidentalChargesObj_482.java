package pageobjects.iisParam;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IncidentalChargesObj_482 {
	
	WebDriver driver;
	public IncidentalChargesObj_482(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	// Clear cache for FMS Core
	@FindBy(xpath = "//span[@id='tech_details_icon']")
	private WebElement IIS_core_tech_details_icon;
	public WebElement IISCoreTechDetailsIcon_482() {
		return IIS_core_tech_details_icon;
	}
	
	@FindBy(xpath = "//label[@id='clear_cache_key']")
	private WebElement IIS_core_clear_cache_btn;
	public WebElement IISCoreClearCacheBtn_482() {
		return IIS_core_clear_cache_btn;
	}
	
//	Investment Deals -Combined without Trade Deal
	@FindBy(xpath = "//td[text()='Investment Deals -Combined without Trade Deal']")
	private WebElement IIS_investment_deal_without_trade_deal_menu;
	public WebElement IISInvestmentDealWithoutTradeDealMenu_482(){
		return IIS_investment_deal_without_trade_deal_menu;
	}
	
	@FindBy(xpath = "//a[@id='T022MT']")
	private WebElement IIS_investment_deal_without_trade_deal_maintenance_menu;
	public WebElement IISInvestmentDealWithoutTradeDealMaintenanceMenu_482(){
		return IIS_investment_deal_without_trade_deal_maintenance_menu;
	}
	
	@FindBy(xpath = "//input[@id='lookuptxt_investmentDeals_PARTY_T022MT']")
	private WebElement IIS_investment_deal_without_trade_deal_main_party_input;
	public WebElement IISInvestmentDealWithoutTradeDealMainPartyInput_482(){
		return IIS_investment_deal_without_trade_deal_main_party_input;
	}
	
//	Category input ==> Charge code 
	@FindBy(xpath = "//input[@id='lookuptxt_trsdealVO_DEAL_TYPE_T022MT']")
	private WebElement IIS_investment_deal_without_trade_deal_main_category_input;
	public WebElement IISInvestmentDealWithoutTradeDealMainCategoryInput_482(){
		return IIS_investment_deal_without_trade_deal_main_category_input;
	}
	
	@FindBy(xpath = "//input[@id='lookuptxt_investmentDeals_CLASS_T022MT']")
	private WebElement IIS_investment_deal_without_trade_deal_main_product_class_input;
	public WebElement IISInvestmentDealWithoutTradeDealMainProductClassInput_482(){
		return IIS_investment_deal_without_trade_deal_main_product_class_input;
	}
	
	@FindBy(xpath = "//input[@id='trsdealVO_DD_DEAL_AMOUNT_T022MT']")
	private WebElement IIS_investment_deal_without_trade_deal_main_amount_input;
	public WebElement IISInvestmentDealWithoutTradeDealMainAmountInput_482(){
		return IIS_investment_deal_without_trade_deal_main_amount_input;
	}
	
	@FindBy(xpath = "//li[@id='investmentDealsMainTabs2_T022MT']")
	private WebElement IIS_investment_deal_without_trade_deal_main_contributor_tab;
	public WebElement IISInvestmentDealWithoutTradeDealMainContributorTab_482(){
		return IIS_investment_deal_without_trade_deal_main_contributor_tab;
	}
	
	

	@FindBy(xpath = "//*[@id=\"investmentDealsFormId_T022MT_Link_key\"]")
	private WebElement linkkey;
	public WebElement linkkey(){
		return linkkey;
	}
	
	
	
	@FindBy(xpath = "//td[@id='td_ContributorDetailsGridTbl_Id_T022MT_1_rn']")
	private WebElement IIS_investment_deal_without_trade_deal_main_contributor_tab_row;
	public WebElement IISInvestmentDealWithoutTradeDealMainContributorTabRow_482(){
		return IIS_investment_deal_without_trade_deal_main_contributor_tab_row;
	}
	
	@FindBy(xpath = "//span[@id='spanLookup_nostro_sl_T022MT']")
	private WebElement IIS_investment_deal_without_trade_deal_main_contributor_details_nostro_lookup;
	public WebElement IISInvestmentDealWithoutTradeDealMainContributorDetailsNostroLookup_482(){
		return IIS_investment_deal_without_trade_deal_main_contributor_details_nostro_lookup;
	}
	
	@FindBy(xpath = "//td[@id='td_gridtab_nostro_sl_T022MT_1_amfVO.BRANCH_CODE']")
	private WebElement IIS_investment_deal_without_trade_deal_main_contributor_details_nostro_lookup_row;
	public WebElement IISInvestmentDealWithoutTradeDealMainContributorDetailsNostroLookupRow_482(){
		return IIS_investment_deal_without_trade_deal_main_contributor_details_nostro_lookup_row;
	}
	
	@FindBy(xpath = "//input[@id='nostro_acc_ref_T022MT']")
	private WebElement IIS_investment_deal_without_trade_deal_main_contributor_details_nostro_input;
	public WebElement IISInvestmentDealWithoutTradeDealMainContributorDetailsNostroInput_482(){
		return IIS_investment_deal_without_trade_deal_main_contributor_details_nostro_input;
	}
	
	@FindBy(xpath = "//span[@id='spanLookup_matr_ac_sl_T022MT']")
	private WebElement IIS_investment_deal_without_trade_deal_main_contributor_details_maturity_lookup;
	public WebElement IISInvestmentDealWithoutTradeDealMainContributorDetailsMaturityLookup_482(){
		return IIS_investment_deal_without_trade_deal_main_contributor_details_maturity_lookup;
	}
	
	@FindBy(xpath = "//td[@id='td_gridtab_matr_ac_sl_T022MT_1_amfVO.BRANCH_CODE']")
	private WebElement IIS_investment_deal_without_trade_deal_main_contributor_details_maturity_lookup_row;
	public WebElement IISInvestmentDealWithoutTradeDealMainContributorDetailsMaturityLookupRow_482(){
		return IIS_investment_deal_without_trade_deal_main_contributor_details_maturity_lookup_row;
	}
	
	@FindBy(xpath = "//input[@id='matr_ac_ref_T022MT']")
	private WebElement IIS_investment_deal_without_trade_deal_main_contributor_details_maturity_input;
	public WebElement IISInvestmentDealWithoutTradeDealMainContributorDetailsMaturityInput_482(){
		return IIS_investment_deal_without_trade_deal_main_contributor_details_maturity_input;
	}
	
	@FindBy(xpath = "//button[@id='btnContribDetSave_T022MT']")
	private WebElement IIS_investment_deal_without_trade_deal_main_contributor_details_Ok_btn;
	public WebElement IISInvestmentDealWithoutTradeDealMainContributorDetailsOkBtn_482(){
		return IIS_investment_deal_without_trade_deal_main_contributor_details_Ok_btn;
	}
	
	@FindBy(xpath = "//button[@id='investmentDeals_Save_btn_T022MT']")
	private WebElement IIS_investment_deal_without_trade_deal_main_save_btn;
	public WebElement IISInvestmentDealWithoutTradeDealMainSaveBtn_482(){
		return IIS_investment_deal_without_trade_deal_main_save_btn;
	}
	
	@FindBy(xpath = "//button[@id='repayPlanBtn_T022MT']")
	private WebElement IIS_investment_deal_without_trade_deal_main_repayment_plan_btn;
	public WebElement IISInvestmentDealWithoutTradeDealMainRepaymentPlanBtn_482(){
		return IIS_investment_deal_without_trade_deal_main_repayment_plan_btn;
	}
	
	@FindBy(xpath = "total_amt_T022MT")
	private WebElement IIS_investment_deal_without_trade_deal_main_repayment_amt_field;
	public WebElement IISInvestmentDealWithoutTradeDealMainRepaymentAmtField_482(){
		return IIS_investment_deal_without_trade_deal_main_repayment_amt_field;
	}
	
	@FindBy(xpath = "//input[@id='grace_period_compounding_yn_T022MT']")
	private WebElement IIS_investment_deal_without_trade_deal_main_repayment_grace_period_checkbox;
	public WebElement IISInvestmentDealWithoutTradeDealMainRepaymentGracePeriodCheckbox_482(){
		return IIS_investment_deal_without_trade_deal_main_repayment_grace_period_checkbox;
	}
	
	@FindBy(xpath = "//button[@id='createSchedule_T022MT']")
	private WebElement IIS_investment_deal_without_trade_deal_main_repayment_create_schedule_btn;
	public WebElement IISInvestmentDealWithoutTradeDealMainRepaymentCreateScheduleBtn_482(){
		return IIS_investment_deal_without_trade_deal_main_repayment_create_schedule_btn;
	}
	
	@FindBy(xpath = "//div[@id='gview_repaumentPlanScheduleGridTbl_Id_T022MT']")
	private WebElement IIS_investment_deal_without_trade_deal_main_repayment_schedule_table;
	public WebElement IISInvestmentDealWithoutTradeDealMainRepaymentScheduleTable_482(){
		return IIS_investment_deal_without_trade_deal_main_repayment_schedule_table;
	}
	
	@FindBy(xpath = "//span[@id='ui-dialog-title-RepaymentPlanMaint_combained_Div_T022MT']/parent::div/a")
	private WebElement IIS_investment_deal_without_trade_deal_main_repayment_plan_tab_close_icon;
	public WebElement IISInvestmentDealWithoutTradeDealMainRepaymentPlanTabCloseIcon_482(){
		return IIS_investment_deal_without_trade_deal_main_repayment_plan_tab_close_icon;
	}
	
	@FindBy(xpath = "//button[@id='investmentDeals_Validate_btn_T022MT']")
	private WebElement IIS_investment_deal_without_trade_deal_main_validate_btn;
	public WebElement IISInvestmentDealWithoutTradeDealMainValidateBtn_482(){
		return IIS_investment_deal_without_trade_deal_main_validate_btn;
	}

	@FindBy(xpath = "//*[@id='T022P']//span[text()='Approve']")
	private WebElement IIS_investment_deal_without_trade_deal_approve_menu;
	public WebElement IISInvestmentDealWithoutTradeDealApproveMenu_482(){
		return IIS_investment_deal_without_trade_deal_approve_menu;
	}
	
	@FindBy(xpath = "//input[@id='investmentDealsGridTbl_Id_T022P_gs_trsdealVO.SERIAL_NO']")
	private WebElement IIS_investment_deal_without_trade_deal_approve_menu_searchgrid_dealnbr_input;
	public WebElement IISInvestmentDealWithoutTradeDealApproveMenuSearchgridDealNbrInput_482(){
		return IIS_investment_deal_without_trade_deal_approve_menu_searchgrid_dealnbr_input;
	}
	
	@FindBy(xpath = "//td[@id='td_investmentDealsGridTbl_Id_T022P_1_trsdealVO.SERIAL_NO']")
	private WebElement IIS_investment_deal_without_trade_deal_approve_menu_searchgrid_row;
	public WebElement IISInvestmentDealWithoutTradeDealApproveMenuSearchgridRow_482(){
		return IIS_investment_deal_without_trade_deal_approve_menu_searchgrid_row;
	}
	
	@FindBy(xpath = "//input[@id='trsdealVO_SERIAL_NO_T022P']")
	private WebElement IIS_investment_deal_without_trade_deal_approve_menu_dealnbr;
	public WebElement IISInvestmentDealWithoutTradeDealApproveMenuDealNbr_482(){
		return IIS_investment_deal_without_trade_deal_approve_menu_dealnbr;
	}
	
	@FindBy(xpath = "//button[@id='investmentDeals_Approve_btn_T022P']")
	private WebElement IIS_investment_deal_without_trade_deal_approve_menu_approve_btn;
	public WebElement IISInvestmentDealWithoutTradeDealApproveMenuApproveBtn_482(){
		return IIS_investment_deal_without_trade_deal_approve_menu_approve_btn;
	}
	
	
	
	
	
	
//	Tracking & Incidental Charges
//	@AT_IC_010
	@FindBy(xpath = "//td[contains(text(),'Incidental')]")
	private WebElement IIS_tracking_incidental_charges_menu;
	public WebElement IISTrackingIncidentalChargesMenu_482(){
		return IIS_tracking_incidental_charges_menu;
	}
	
	@FindBy(xpath = "//a[@id='T07MT']")
	private WebElement IIS_tracking_incidental_charges_maintenance_menu;
	public WebElement IISTrackingIncidentalChargesMaintenanceMenu_482(){
		return IIS_tracking_incidental_charges_maintenance_menu;
	}
	
	
	@FindBy(xpath = "//a[@id='T07RR']")
	private WebElement IIS_tracking_incidental_charges_menu_reverse;
	public WebElement IISTrackingIncidentalChargesReverseMenu_482(){
		return IIS_tracking_incidental_charges_menu_reverse;
	}
	
	@FindBy(xpath = "//input[@id='IncidentalChargesGridTbl_Id_T07RR_gs_trstrackVO.TRACK_NBR']")
	private WebElement IIS_incidental_charges_reverse_menu_searchgrid_track_nbr_input;
	public WebElement IISIncidentalChargesReverseMenuSearchgridTrackNbrInput_482(){
		return IIS_incidental_charges_reverse_menu_searchgrid_track_nbr_input;
	}
	
	@FindBy(xpath = "//input[@id='IncidentalChargesGridTbl_Id_T07RR_gs_statusDesc']")
	private WebElement IIS_incidental_charges_reverse_menu_searchgrid_status_input;
	public WebElement IISIncidentalChargesReverseMenuSearchgridStatusInput_482(){
		return IIS_incidental_charges_reverse_menu_searchgrid_status_input;
	}
	
	@FindBy(xpath = "//td[@id='td_IncidentalChargesGridTbl_Id_T07RR_1_trstrackVO.TRACK_NBR']")
	private WebElement IIS_incidental_charges_reverse_menu_searchgrid_row;
	public WebElement IISIncidentalChargesReverseMenuSearchgridRow_482(){
		return IIS_incidental_charges_reverse_menu_searchgrid_row;
	}
	
	@FindBy(xpath = "//input[@id='trstrackVO_TRACK_NBR_T07RR']")
	private WebElement IIS_incidental_charges_reverse_menu_track_nbr;
	public WebElement IISIncidentalChargesReverseMenuTrackNbr_482(){
		return IIS_incidental_charges_reverse_menu_track_nbr;
	}
	
	@FindBy(xpath = "//span[contains(text(),'Reverse')]//parent::a[starts-with(@id,'anchor_')]")
	private WebElement IIS_incidental_charges_reverse_menu_reverse_btn;
	public WebElement IISIncidentalChargesReverseMenuReverseBtn_482(){
		return IIS_incidental_charges_reverse_menu_reverse_btn;
	}
	// amount exceeds pop up
	// confirm ok
	@FindBy(xpath = "//input[@id='_popup_path_sol_confirm_ok']")
	private WebElement IIS_confirm_popup_Yes_btn;
	public WebElement IIS_ConfirmPopupYesBtn_482(){
		return IIS_confirm_popup_Yes_btn;
	}
	
	@FindBy(xpath = "//input[@id='_popup_path_sol_confirm']")
	private WebElement IIS_confirm_popup_cancel_btn;
	public WebElement IIS_ConfirmPopupCancelBtn_482(){
		return IIS_confirm_popup_cancel_btn;
	}
	// cancel
	@FindBy(xpath = "//input[@id='_popup_path_sol_confirm_ok']")
	private WebElement IIS_warning_popup_ok_btn;
	public WebElement IIS_WarningPopupOkBtn_482(){
		return IIS_warning_popup_ok_btn;
	}
	
	//success ok
	@FindBy(xpath = "//input[@id='_popup_path_sol_ok']")
	private WebElement IIS_success_popup_ok_btn;
	public WebElement IIS_SuccessPopupOkBtn_482(){
		return IIS_success_popup_ok_btn;
	}
	
	@FindBy(xpath = "//div[contains(text(),'INFORMATION')]")
	private WebElement IIS_information_popup_title;
	public WebElement IIS_InformationPopupTitle_482(){
		return IIS_information_popup_title;
	}
	
	@FindBy(xpath = "//div[@class='jMsgbox-contentWrap'][contains(text(),'Deal No')]")
	private WebElement IIS_information_popup_text_msg;
	public WebElement IIS_InformationPopupTextMsg_482(){
		return IIS_information_popup_text_msg;
	}	
	//info ok
	@FindBy(xpath = "//input[@id='_popup_path_sol_ok']")
	private WebElement IIS_information_popup_ok_btn;
	public WebElement IIS_InformationPopupOkBtn_482(){
		return IIS_information_popup_ok_btn;
	}

	@FindBy(xpath = "//a[@id='T07V']")
	private WebElement IIS_tracking_incidental_charges_approve_reverse_menu;
	public WebElement IISTrackingIncidentalChargesApproveReverseMenu_482(){
		return IIS_tracking_incidental_charges_approve_reverse_menu;
	}
	
	@FindBy(xpath = "//input[@id='IncidentalChargesGridTbl_Id_T07V_gs_trstrackVO.TRACK_NBR']")
	private WebElement IIS_incidental_charges_approve_reverse_searchgrid_track_nbr_input;
	public WebElement IISIncidentalChargesApproveReverseSearchgridTrackNbrInput_482(){
		return IIS_incidental_charges_approve_reverse_searchgrid_track_nbr_input;
	}
	
	@FindBy(xpath = "//td[@id='td_IncidentalChargesGridTbl_Id_T07V_1_trstrackVO.TRACK_NBR']")
	private WebElement IIS_incidental_charges_approve_reverse_searchgrid_row;
	public WebElement IISIncidentalChargesApproveReverseSearchgridRow_482(){
		return IIS_incidental_charges_approve_reverse_searchgrid_row;
	}
	
	@FindBy(xpath = "//input[@id='trstrackVO_TRACK_NBR_T07V']")
	private WebElement IIS_incidental_charges_approve_reverse_track_nbr;
	public WebElement IISIncidentalChargesApproveReverseTrackNbr_482(){
		return IIS_incidental_charges_approve_reverse_track_nbr;
	}
	
	@FindBy(xpath = "//div[@id='incidentalchargesMainTabToolBar_T07V']/a")
	private WebElement IIS_incidental_charges_approve_reverse_menu_reverse_btn;
	public WebElement IISIncidentalChargesApproveReverseMenuReverseBtn_482(){
		return IIS_incidental_charges_approve_reverse_menu_reverse_btn;
	}
	
	@FindBy(xpath = "//*[@id='_selenuimT07']//td[text()='Tracking & Incidental Charges']")
	private WebElement IIS_trackingIncidentalCharges;
	public WebElement IIS_trackingIncidentalCharges(){
		return IIS_trackingIncidentalCharges;
	}
	
	@FindBy(xpath = "//*[@id='T07MT']//span[text()='Maintenance']")
	private WebElement IIS_trackingIncidentalCharges_MaintenanceScreen;
	public WebElement IIS_trackingIncidentalCharges_MaintenanceScreen(){
		return IIS_trackingIncidentalCharges_MaintenanceScreen;
	}
	@FindBy(xpath="//*[@id='IncidentalChargesGridTbl_Id_T07MT_gs_trstrackVO.TRS_DEAL_SERIAL_NO']")
    private WebElement IIS_trackingIncidentalCharges_SearchDealNoInMaintenanceScreen_482;
    public WebElement IIS_trackingIncidentalCharges_SearchDealNoInMaintenanceScreen_482() {
        return IIS_trackingIncidentalCharges_SearchDealNoInMaintenanceScreen_482;
    }
  
    @FindBy(xpath="//*[@id='td_IncidentalChargesGridTbl_Id_T07MT_1_trstrackVO.TRS_DEAL_SERIAL_NO']")
    private WebElement IIS_trackingIncidentalCharges_SelectSearchedDealNoInMaintenanceScreen_482;
    public WebElement IIS_trackingIncidentalCharges_SelectSearchedDealNoInMaintenanceScreen_482() {
        return IIS_trackingIncidentalCharges_SelectSearchedDealNoInMaintenanceScreen_482;
    }
	@FindBy(xpath = "//*[@id='lookuptxt_trs_deal_serial_no_T07MT']")
	private WebElement IIS_trackingIncidentalCharges_MaintenanceScreen_DealNo;
	public WebElement IIS_trackingIncidentalCharges_MaintenanceScreen_DealNo(){
		return IIS_trackingIncidentalCharges_MaintenanceScreen_DealNo;
	}
	//Immediate Payment
	//Next Installment
	@FindBy(xpath = "//select[@id='trstrackdetVO_CHARGE_ALLOCATION_CRITERIA_T07MT']")
	private WebElement IIS_trackingIncidentalCharges_MaintenanceScreen_ChargeAllocationCriteria;
	public WebElement IIS_trackingIncidentalCharges_MaintenanceScreen_ChargeAllocationCriteria(){
		return IIS_trackingIncidentalCharges_MaintenanceScreen_ChargeAllocationCriteria;
	}
	
	@FindBy(xpath = "//*[@id='incidentalcharges_save_T07MT']")
	private WebElement IIS_trackingIncidentalCharges_MaintenanceScreen_SaveButton;
	public WebElement IIS_trackingIncidentalCharges_MaintenanceScreen_SaveButton(){
		return IIS_trackingIncidentalCharges_MaintenanceScreen_SaveButton;
	}
	// approve
	@FindBy(xpath = "//*[@id='T07P']")
	private WebElement IIS_trackingIncidentalCharges_ApproveScreen_482;
	public WebElement IIS_trackingIncidentalCharges_ApproveScreen_482(){
		return IIS_trackingIncidentalCharges_ApproveScreen_482;
	}
	
	@FindBy(xpath = "//*[@id='lookuptxt_charges_code_T07MT']")
	private WebElement IIS_trackingIncidentalCharges_MaintenanceScreen_ChargesCode;
	public WebElement IIS_trackingIncidentalCharges_MaintenanceScreen_ChargesCode(){
		return IIS_trackingIncidentalCharges_MaintenanceScreen_ChargesCode;
	}
	
	@FindBy(xpath = "//div[contains(text(),'Success')]")
	private WebElement transactionNumberSaved_TrackingAndIncidentalCharges;
	public WebElement transactionNumberSaved_TrackingAndIncidentalCharges(){
		return transactionNumberSaved_TrackingAndIncidentalCharges;
	}
	
	@FindBy(xpath = "//*[@id='IncidentalChargesGridTbl_Id_T07P_gs_trstrackVO.TRS_DEAL_SERIAL_NO']")
	private WebElement searchCodeApproveScreen_TrackingAndIncidentalCharges;
	public WebElement searchCodeApproveScreen_TrackingAndIncidentalCharges(){
		return searchCodeApproveScreen_TrackingAndIncidentalCharges;
	}
	
	@FindBy(xpath = "//*[@id='td_IncidentalChargesGridTbl_Id_T07P_1_trstrackVO.TRACK_NBR']")
	private WebElement selectSearchedCodeApproveScreen_TrackingAndIncidentalCharges;
	public WebElement selectSearchedCodeApproveScreen_TrackingAndIncidentalCharges(){
		return selectSearchedCodeApproveScreen_TrackingAndIncidentalCharges;
	}
	//*[@id='incidentalchargesMainTabToolBar_T07P']//span
	@FindBy(xpath = "//*[@id='td_IncidentalChargesGridTbl_Id_T07P_1_trstrackVO.TRACK_NBR']")
	private WebElement approveButtonApproveScreen_TrackingAndIncidentalCharges;
	public WebElement approveButtonApproveScreen_TrackingAndIncidentalCharges(){
		return approveButtonApproveScreen_TrackingAndIncidentalCharges;
	}
	
	// tracking and incidental charges
	
	
	@FindBy(id="_selenuimT06")
    private WebElement IIS_SettlementSection_482;
    public WebElement IIS_SettlementSection_482() {
        return IIS_SettlementSection_482;
    }
    @FindBy(id="T06MT")
    private WebElement IIS_Settlement_Maintenance_482;
    public WebElement IIS_Settlement_Maintenance_482() {
        return IIS_Settlement_Maintenance_482;
    }
    @FindBy(id="settlementTab1_T06MT")
    private WebElement IIS_Settlement_Maintenance_SettlementDetailsTab_482;
    public WebElement IIS_Settlement_Maintenance_SettlementDetailsTab_482() {
        return IIS_Settlement_Maintenance_SettlementDetailsTab_482;
    }
    @FindBy(id="settlementTab2_T06MT")
    private WebElement IIS_Settlement_Maintenance_SheduleDetailsTab_482;
    public WebElement IIS_Settlement_Maintenance_SheduleDetailsTab_482() {
        return IIS_Settlement_Maintenance_SheduleDetailsTab_482;
    }
  
    @FindBy(xpath="//*[@id='td_settlementScheduleGridTbl_Id_T06MT_1_trspayplandetvo.CAPITAL_AMT']")
    private WebElement IIS_Settlement_GetFirstSettlementAmount_482;
    public WebElement IIS_Settlement_GetFirstSettlementAmount_482() {
        return IIS_Settlement_GetFirstSettlementAmount_482;
    }
    @FindBy(id="lookuptxt_dealNo_T06MT")
    private WebElement IIS_Settlement_Maintenance_DealNbrField_482;
    public WebElement IIS_Settlement_Maintenance_DealNbrField_482() {
        return IIS_Settlement_Maintenance_DealNbrField_482;
    }
    @FindBy(id="crossCyPartyAmount_T06MT")
    private WebElement IIS_Settlement_Maintenance_AmountReceivedFromPartyField_482;
    public WebElement IIS_Settlement_Maintenance_AmountReceivedFromPartyField_482() {
        return IIS_Settlement_Maintenance_AmountReceivedFromPartyField_482;
    }
    @FindBy(id="savebutton_T06MT")
    private WebElement IIS_Settlement_Maintenance_SaveButton_482;
    public WebElement IIS_Settlement_Maintenance_SaveButton_482() {
        return IIS_Settlement_Maintenance_SaveButton_482;
    }
  
    @FindBy(xpath="//button[@id='automaticAllocationButton_T06MT']")
    private WebElement IIS_Settlement_Maintenance_AutomaticAollacationButton_482;
    public WebElement IIS_Settlement_Maintenance_AutomaticAollacationButton_482() {
        return IIS_Settlement_Maintenance_AutomaticAollacationButton_482;
    }
    //Approve
    @FindBy(id="T06P")
    private WebElement IIS_Settlement_Approve_482;
    public WebElement IIS_Settlement_Approve_482() {
        return IIS_Settlement_Approve_482;
    }
    @FindBy(id="settlementMgmtGridTbl_Id_T06P_gs_trssetlmtvo.SETTLEMENT_NBR")
    private WebElement IIS_Settlement_Approve_SettlementNbrSearchField_482;
    public WebElement IIS_Settlement_Approve_SettlementNbrSearchField_482() {
        return IIS_Settlement_Approve_SettlementNbrSearchField_482;
    }
    @FindBy(id="td_settlementMgmtGridTbl_Id_T06P_1_trssetlmtvo.SETTLEMENT_NBR")
    private WebElement IIS_Settlement_Approve_FirstRecord_482;
    public WebElement IIS_Settlement_Approve_FirstRecord_482() {
        return IIS_Settlement_Approve_FirstRecord_482;
    }
    @FindBy(id="settlementDefFormId_T06P_approve_key")
    private WebElement IIS_Settlement_Approve_ApproveButton_482;
    public WebElement IIS_Settlement_Approve_ApproveButton_482() {
        return IIS_Settlement_Approve_ApproveButton_482;
    }
    @FindBy(id="settlementMgmtGridTbl_Id_T06P_gs_trssetlmtvo.DEAL_NBR")
    private WebElement IIS_Settlement_Approve_DealNbrSearchField_482;
    public WebElement IIS_Settlement_Approve_DealNbrSearchField_482() {
        return IIS_Settlement_Approve_DealNbrSearchField_482;
    }
    
    // Investment Deals - Combined without trade deal
    
    @FindBy(id="infoBarSearchButton_T022MT")
    private WebElement IIS_CombinedWithoutTradeDeal_SearchButton_482;
    public WebElement IIS_CombinedWithoutTradeDeal_SearchButton_482() {
        return IIS_CombinedWithoutTradeDeal_SearchButton_482;
    }
    @FindBy(id="investmentDealsGridTbl_Id_T022MT_gs_trsdealVO.SERIAL_NO")
    private WebElement IIS_CombinedWithoutTradeDeal_DealNoSearchField_482;
    public WebElement IIS_CombinedWithoutTradeDeal_DealNoSearchField_482() {
        return IIS_CombinedWithoutTradeDeal_DealNoSearchField_482;
    }
    @FindBy(id="td_investmentDealsGridTbl_Id_T022MT_1_trsdealVO.SERIAL_NO")
    private WebElement IIS_CombinedWithoutTradeDeal_FirstRecord_482;
    public WebElement IIS_CombinedWithoutTradeDeal_FirstRecord_482() {
        return IIS_CombinedWithoutTradeDeal_FirstRecord_482;
    }
    @FindBy(id="pmtInstrBtn_T022MT")
    private WebElement IIS_CombinedWithoutTradeDeal_PaymentInstructionsButton_482;
    public WebElement IIS_CombinedWithoutTradeDeal_PaymentInstructionsButton_482() {
        return IIS_CombinedWithoutTradeDeal_PaymentInstructionsButton_482;
    }
    @FindBy(id="showJVD_btn_T022MT")
    private WebElement IIS_CombinedWithoutTradeDeal_PaymentInstructions_JournalVoucherDetails_482;
    public WebElement IIS_CombinedWithoutTradeDeal_PaymentInstructions_JournalVoucherDetails_482() {
        return IIS_CombinedWithoutTradeDeal_PaymentInstructions_JournalVoucherDetails_482;
    }
  
    
	
	
}
