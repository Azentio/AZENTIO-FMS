package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Incidental_Charges_Obj {

	WebDriver driver;

	public Incidental_Charges_Obj(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	// Clear cache for IIS Core
		@FindBy(xpath = "//span[@id='tech_details_icon']")
		private WebElement IIS_core_tech_details_icon;
		public WebElement IISCoreTechDetailsIcon_607() {
			return IIS_core_tech_details_icon;
		}
		
		@FindBy(xpath = "//label[@id='clear_cache_key']")
		private WebElement IIS_core_clear_cache_btn;
		public WebElement IISCoreClearCacheBtn_607() {
			return IIS_core_clear_cache_btn;
		}
		
//		Investment Deals -Combined without Trade Deal
		@FindBy(xpath = "//td[text()='Investment Deals -Combined without Trade Deal']")
		private WebElement IIS_investment_deal_without_trade_deal_menu;
		public WebElement IISInvestmentDealWithoutTradeDealMenu_607(){
			return IIS_investment_deal_without_trade_deal_menu;
		}
		
		@FindBy(xpath = "//a[@id='T022MT']")
		private WebElement IIS_investment_deal_without_trade_deal_maintenance_menu;
		public WebElement IISInvestmentDealWithoutTradeDealMaintenanceMenu_607(){
			return IIS_investment_deal_without_trade_deal_maintenance_menu;
		}
		
		@FindBy(xpath = "//input[@id='lookuptxt_investmentDeals_PARTY_T022MT']")
		private WebElement IIS_investment_deal_without_trade_deal_main_party_input;
		public WebElement IISInvestmentDealWithoutTradeDealMainPartyInput_607(){
			return IIS_investment_deal_without_trade_deal_main_party_input;
		}
		
//		Category input ==> Charge code 
		@FindBy(xpath = "//input[@id='lookuptxt_trsdealVO_DEAL_TYPE_T022MT']")
		private WebElement IIS_investment_deal_without_trade_deal_main_category_input;
		public WebElement IISInvestmentDealWithoutTradeDealMainCategoryInput_607(){
			return IIS_investment_deal_without_trade_deal_main_category_input;
		}
		
		@FindBy(xpath = "//input[@id='lookuptxt_investmentDeals_CLASS_T022MT']")
		private WebElement IIS_investment_deal_without_trade_deal_main_product_class_input;
		public WebElement IISInvestmentDealWithoutTradeDealMainProductClassInput_607(){
			return IIS_investment_deal_without_trade_deal_main_product_class_input;
		}
		
		@FindBy(xpath = "//input[@id='trsdealVO_DD_DEAL_AMOUNT_T022MT']")
		private WebElement IIS_investment_deal_without_trade_deal_main_amount_input;
		public WebElement IISInvestmentDealWithoutTradeDealMainAmountInput_607(){
			return IIS_investment_deal_without_trade_deal_main_amount_input;
		}
		
		@FindBy(xpath = "//li[@id='investmentDealsMainTabs2_T022MT']")
		private WebElement IIS_investment_deal_without_trade_deal_main_contributor_tab;
		public WebElement IISInvestmentDealWithoutTradeDealMainContributorTab_607(){
			return IIS_investment_deal_without_trade_deal_main_contributor_tab;
		}
		
		@FindBy(xpath = "//td[@id='td_ContributorDetailsGridTbl_Id_T022MT_1_rn']")
		private WebElement IIS_investment_deal_without_trade_deal_main_contributor_tab_row;
		public WebElement IISInvestmentDealWithoutTradeDealMainContributorTabRow_607(){
			return IIS_investment_deal_without_trade_deal_main_contributor_tab_row;
		}
		
		@FindBy(xpath = "//span[@id='spanLookup_nostro_sl_T022MT']")
		private WebElement IIS_investment_deal_without_trade_deal_main_contributor_details_nostro_lookup;
		public WebElement IISInvestmentDealWithoutTradeDealMainContributorDetailsNostroLookup_607(){
			return IIS_investment_deal_without_trade_deal_main_contributor_details_nostro_lookup;
		}
		
		@FindBy(xpath = "//td[@id='td_gridtab_nostro_sl_T022MT_1_amfVO.BRANCH_CODE']")
		private WebElement IIS_investment_deal_without_trade_deal_main_contributor_details_nostro_lookup_row;
		public WebElement IISInvestmentDealWithoutTradeDealMainContributorDetailsNostroLookupRow_607(){
			return IIS_investment_deal_without_trade_deal_main_contributor_details_nostro_lookup_row;
		}
		
		@FindBy(xpath = "//input[@id='nostro_acc_ref_T022MT']")
		private WebElement IIS_investment_deal_without_trade_deal_main_contributor_details_nostro_input;
		public WebElement IISInvestmentDealWithoutTradeDealMainContributorDetailsNostroInput_607(){
			return IIS_investment_deal_without_trade_deal_main_contributor_details_nostro_input;
		}
		
		@FindBy(xpath = "//span[@id='spanLookup_matr_ac_sl_T022MT']")
		private WebElement IIS_investment_deal_without_trade_deal_main_contributor_details_maturity_lookup;
		public WebElement IISInvestmentDealWithoutTradeDealMainContributorDetailsMaturityLookup_607(){
			return IIS_investment_deal_without_trade_deal_main_contributor_details_maturity_lookup;
		}
		
		@FindBy(xpath = "//td[@id='td_gridtab_matr_ac_sl_T022MT_1_amfVO.BRANCH_CODE']")
		private WebElement IIS_investment_deal_without_trade_deal_main_contributor_details_maturity_lookup_row;
		public WebElement IISInvestmentDealWithoutTradeDealMainContributorDetailsMaturityLookupRow_607(){
			return IIS_investment_deal_without_trade_deal_main_contributor_details_maturity_lookup_row;
		}
		
		@FindBy(xpath = "//input[@id='matr_ac_ref_T022MT']")
		private WebElement IIS_investment_deal_without_trade_deal_main_contributor_details_maturity_input;
		public WebElement IISInvestmentDealWithoutTradeDealMainContributorDetailsMaturityInput_607(){
			return IIS_investment_deal_without_trade_deal_main_contributor_details_maturity_input;
		}
		
		@FindBy(xpath = "//button[@id='btnContribDetSave_T022MT']")
		private WebElement IIS_investment_deal_without_trade_deal_main_contributor_details_Ok_btn;
		public WebElement IISInvestmentDealWithoutTradeDealMainContributorDetailsOkBtn_607(){
			return IIS_investment_deal_without_trade_deal_main_contributor_details_Ok_btn;
		}
		
		@FindBy(xpath = "//button[@id='investmentDeals_Save_btn_T022MT']")
		private WebElement IIS_investment_deal_without_trade_deal_main_save_btn;
		public WebElement IISInvestmentDealWithoutTradeDealMainSaveBtn_607(){
			return IIS_investment_deal_without_trade_deal_main_save_btn;
		}
		
		@FindBy(xpath = "//button[@id='repayPlanBtn_T022MT']")
		private WebElement IIS_investment_deal_without_trade_deal_main_repayment_plan_btn;
		public WebElement IISInvestmentDealWithoutTradeDealMainRepaymentPlanBtn_607(){
			return IIS_investment_deal_without_trade_deal_main_repayment_plan_btn;
		}
		
		@FindBy(xpath = "total_amt_T022MT")
		private WebElement IIS_investment_deal_without_trade_deal_main_repayment_amt_field;
		public WebElement IISInvestmentDealWithoutTradeDealMainRepaymentAmtField_607(){
			return IIS_investment_deal_without_trade_deal_main_repayment_amt_field;
		}
		
		@FindBy(xpath = "//input[@id='grace_period_compounding_yn_T022MT']")
		private WebElement IIS_investment_deal_without_trade_deal_main_repayment_grace_period_checkbox;
		public WebElement IISInvestmentDealWithoutTradeDealMainRepaymentGracePeriodCheckbox_607(){
			return IIS_investment_deal_without_trade_deal_main_repayment_grace_period_checkbox;
		}
		
		@FindBy(xpath = "//button[@id='createSchedule_T022MT']")
		private WebElement IIS_investment_deal_without_trade_deal_main_repayment_create_schedule_btn;
		public WebElement IISInvestmentDealWithoutTradeDealMainRepaymentCreateScheduleBtn_607(){
			return IIS_investment_deal_without_trade_deal_main_repayment_create_schedule_btn;
		}
		
		@FindBy(xpath = "//div[@id='gview_repaumentPlanScheduleGridTbl_Id_T022MT']")
		private WebElement IIS_investment_deal_without_trade_deal_main_repayment_schedule_table;
		public WebElement IISInvestmentDealWithoutTradeDealMainRepaymentScheduleTable_607(){
			return IIS_investment_deal_without_trade_deal_main_repayment_schedule_table;
		}
		
		@FindBy(xpath = "//span[@id='ui-dialog-title-RepaymentPlanMaint_combained_Div_T022MT']/parent::div/a")
		private WebElement IIS_investment_deal_without_trade_deal_main_repayment_plan_tab_close_icon;
		public WebElement IISInvestmentDealWithoutTradeDealMainRepaymentPlanTabCloseIcon_607(){
			return IIS_investment_deal_without_trade_deal_main_repayment_plan_tab_close_icon;
		}
		
		@FindBy(xpath = "//button[@id='investmentDeals_Validate_btn_T022MT']")
		private WebElement IIS_investment_deal_without_trade_deal_main_validate_btn;
		public WebElement IISInvestmentDealWithoutTradeDealMainValidateBtn_607(){
			return IIS_investment_deal_without_trade_deal_main_validate_btn;
		}

		@FindBy(xpath = "//a[@id='T022P']")
		private WebElement IIS_investment_deal_without_trade_deal_approve_menu;
		public WebElement IISInvestmentDealWithoutTradeDealApproveMenu_607(){
			return IIS_investment_deal_without_trade_deal_approve_menu;
		}
		
		@FindBy(xpath = "//input[@id='investmentDealsGridTbl_Id_T022P_gs_trsdealVO.SERIAL_NO']")
		private WebElement IIS_investment_deal_without_trade_deal_approve_menu_searchgrid_dealnbr_input;
		public WebElement IISInvestmentDealWithoutTradeDealApproveMenuSearchgridDealNbrInput_607(){
			return IIS_investment_deal_without_trade_deal_approve_menu_searchgrid_dealnbr_input;
		}
		
		@FindBy(xpath = "//td[@id='td_investmentDealsGridTbl_Id_T022P_1_trsdealVO.SERIAL_NO']")
		private WebElement IIS_investment_deal_without_trade_deal_approve_menu_searchgrid_row;
		public WebElement IISInvestmentDealWithoutTradeDealApproveMenuSearchgridRow_607(){
			return IIS_investment_deal_without_trade_deal_approve_menu_searchgrid_row;
		}
		
		@FindBy(xpath = "//input[@id='trsdealVO_SERIAL_NO_T022P']")
		private WebElement IIS_investment_deal_without_trade_deal_approve_menu_dealnbr;
		public WebElement IISInvestmentDealWithoutTradeDealApproveMenuDealNbr_607(){
			return IIS_investment_deal_without_trade_deal_approve_menu_dealnbr;
		}
		
		@FindBy(xpath = "//button[@id='investmentDeals_Approve_btn_T022P']")
		private WebElement IIS_investment_deal_without_trade_deal_approve_menu_approve_btn;
		public WebElement IISInvestmentDealWithoutTradeDealApproveMenuApproveBtn_607(){
			return IIS_investment_deal_without_trade_deal_approve_menu_approve_btn;
		}
		
		
		
//		Tracking & Incidental Charges
//		@AT_IC_010
		@FindBy(xpath = "//td[contains(text(),'Incidental')]")
		private WebElement IIS_tracking_incidental_charges_menu;
		public WebElement IISTrackingIncidentalChargesMenu_607(){
			return IIS_tracking_incidental_charges_menu;
		}
		
		@FindBy(xpath = "//a[@id='T07MT']")
		private WebElement IIS_tracking_incidental_charges_maintenance_menu;
		public WebElement IISTrackingIncidentalChargesMaintenanceMenu_607(){
			return IIS_tracking_incidental_charges_maintenance_menu;
		}
		
		
		@FindBy(xpath = "//a[@id='T07RR']")
		private WebElement IIS_tracking_incidental_charges_menu_reverse;
		public WebElement IISTrackingIncidentalChargesReverseMenu_607(){
			return IIS_tracking_incidental_charges_menu_reverse;
		}
		
		@FindBy(xpath = "//input[@id='IncidentalChargesGridTbl_Id_T07RR_gs_trstrackVO.TRACK_NBR']")
		private WebElement IIS_incidental_charges_reverse_menu_searchgrid_track_nbr_input;
		public WebElement IISIncidentalChargesReverseMenuSearchgridTrackNbrInput_607(){
			return IIS_incidental_charges_reverse_menu_searchgrid_track_nbr_input;
		}
		
		@FindBy(xpath = "//input[@id='IncidentalChargesGridTbl_Id_T07RR_gs_statusDesc']")
		private WebElement IIS_incidental_charges_reverse_menu_searchgrid_status_input;
		public WebElement IISIncidentalChargesReverseMenuSearchgridStatusInput_607(){
			return IIS_incidental_charges_reverse_menu_searchgrid_status_input;
		}
		
		@FindBy(xpath = "//td[@id='td_IncidentalChargesGridTbl_Id_T07RR_1_trstrackVO.TRACK_NBR']")
		private WebElement IIS_incidental_charges_reverse_menu_searchgrid_row;
		public WebElement IISIncidentalChargesReverseMenuSearchgridRow_607(){
			return IIS_incidental_charges_reverse_menu_searchgrid_row;
		}
		
		@FindBy(xpath = "//input[@id='trstrackVO_TRACK_NBR_T07RR']")
		private WebElement IIS_incidental_charges_reverse_menu_track_nbr;
		public WebElement IISIncidentalChargesReverseMenuTrackNbr_607(){
			return IIS_incidental_charges_reverse_menu_track_nbr;
		}
		
		@FindBy(xpath = "//span[contains(text(),'Reverse')]//parent::a[starts-with(@id,'anchor_')]")
		private WebElement IIS_incidental_charges_reverse_menu_reverse_btn;
		public WebElement IISIncidentalChargesReverseMenuReverseBtn_607(){
			return IIS_incidental_charges_reverse_menu_reverse_btn;
		}
		
		@FindBy(xpath = "//input[@id='_popup_path_sol_confirm_ok']")
		private WebElement IIS_confirm_popup_ok_btn;
		public WebElement IIS_ConfirmPopupOkBtn_607(){
			return IIS_confirm_popup_ok_btn;
		}
		
		@FindBy(xpath = "//input[@id='_popup_path_sol_confirm_ok']")
		private WebElement CconfirmSave_popup_ok_btn;
		public WebElement CconfirmSave_popup_ok_btn(){
			return CconfirmSave_popup_ok_btn;
		}
		
		@FindBy(xpath = "//input[@id='_popup_path_sol_confirm']")
		private WebElement IIS_confirm_popup_cancel_btn;
		public WebElement IIS_ConfirmPopupCancelBtn_607(){
			return IIS_confirm_popup_cancel_btn;
		}
		
		@FindBy(xpath = "//input[@id='_popup_path_sol_confirm_ok']")
		private WebElement IIS_warning_popup_ok_btn;
		public WebElement IIS_WarningPopupOkBtn_607(){
			return IIS_warning_popup_ok_btn;
		}
		
		@FindBy(xpath = "//input[@id='_popup_path_sol_ok']")
		private WebElement IIS_success_popup_ok_btn;
		public WebElement IIS_SuccessPopupOkBtn_607(){
			return IIS_success_popup_ok_btn;
		}
		
		@FindBy(xpath = "//div[contains(text(),'INFORMATION')]")
		private WebElement IIS_information_popup_title;
		public WebElement IIS_InformationPopupTitle_607(){
			return IIS_information_popup_title;
		}
		
		@FindBy(xpath = "//div[@class='jMsgbox-contentWrap'][contains(text(),'Deal No')]")
		private WebElement IIS_information_popup_text_msg;
		public WebElement IIS_InformationPopupTextMsg_607(){
			return IIS_information_popup_text_msg;
		}	
		
		@FindBy(xpath = "//input[@id='_popup_path_sol_ok']")
		private WebElement IIS_information_popup_ok_btn;
		public WebElement IIS_InformationPopupOkBtn_607(){
			return IIS_information_popup_ok_btn;
		}
		
		@FindBy(xpath = "//input[@id='_popup_path_sol_ok']")
		private WebElement SuccessFully_Saved_popup_ok_btn;
		public WebElement SuccessFully_Saved_popup_ok_btn_607(){
			return SuccessFully_Saved_popup_ok_btn;
		}
		

		@FindBy(xpath = "//a[@id='T07V']")
		private WebElement IIS_tracking_incidental_charges_approve_reverse_menu;
		public WebElement IISTrackingIncidentalChargesApproveReverseMenu_607(){
			return IIS_tracking_incidental_charges_approve_reverse_menu;
		}
		
		@FindBy(xpath = "//input[@id='IncidentalChargesGridTbl_Id_T07V_gs_trstrackVO.TRACK_NBR']")
		private WebElement IIS_incidental_charges_approve_reverse_searchgrid_track_nbr_input;
		public WebElement IISIncidentalChargesApproveReverseSearchgridTrackNbrInput_607(){
			return IIS_incidental_charges_approve_reverse_searchgrid_track_nbr_input;
		}
		
		@FindBy(xpath = "//td[@id='td_IncidentalChargesGridTbl_Id_T07V_1_trstrackVO.TRACK_NBR']")
		private WebElement IIS_incidental_charges_approve_reverse_searchgrid_row;
		public WebElement IISIncidentalChargesApproveReverseSearchgridRow_607(){
			return IIS_incidental_charges_approve_reverse_searchgrid_row;
		}
		
		@FindBy(xpath = "//input[@id='trstrackVO_TRACK_NBR_T07V']")
		private WebElement IIS_incidental_charges_approve_reverse_track_nbr;
		public WebElement IISIncidentalChargesApproveReverseTrackNbr_607(){
			return IIS_incidental_charges_approve_reverse_track_nbr;
		}
		
		@FindBy(xpath = "//div[@id='incidentalchargesMainTabToolBar_T07V']/a")
		private WebElement IIS_incidental_charges_approve_reverse_menu_reverse_btn;
		public WebElement IISIncidentalChargesApproveReverseMenuReverseBtn_607(){
			return IIS_incidental_charges_approve_reverse_menu_reverse_btn;
		}
		
		
		//126187
		
		@FindBy(xpath = "//*[@id='dealChargesBtn_T022MT']")
		private WebElement Click_DealCharge_btn_InmainteanceUnder_InvestmentDeals_withoutTradingDeal;
		public WebElement Click_DealCharge_btn_InmainteanceUnder_InvestmentDeals_withoutTradingDeal_607(){
			return Click_DealCharge_btn_InmainteanceUnder_InvestmentDeals_withoutTradingDeal;
		}
		
		@FindBy(xpath = "//*[@id='td_dealChargesGridTbl_Id_T022MT_1_CHARGES_CODE']")
		private WebElement SelectFirstLine_InDealCharge_InmainteanceUnder_InvestmentDeals_withoutTradingDeal;
		public WebElement SelectFirstLine_InDealCharge_InmainteanceUnder_InvestmentDeals_withoutTradingDeal_607(){
			return SelectFirstLine_InDealCharge_InmainteanceUnder_InvestmentDeals_withoutTradingDeal;
		}
		
		@FindBy(xpath = "//*[@id='1_CREATE_INCIDENTAL_CHARGE_YN_dealChargesGridTbl_Id_T022MT']")
		private WebElement Click_CreateInidentalCharhe_CheckBox_InDealCharge_InmainteanceUnder_InvestmentDeals_withoutTradingDeal;
		public WebElement Click_CreateInidentalCharhe_CheckBox_InDealCharge_InmainteanceUnder_InvestmentDeals_withoutTradingDeal_607(){
			return Click_CreateInidentalCharhe_CheckBox_InDealCharge_InmainteanceUnder_InvestmentDeals_withoutTradingDeal;
		}
		
		@FindBy(xpath = "//*[@id='1_INCIDENTAL_CHARGE_COLLECT_IND_dealChargesGridTbl_Id_T022MT']")
		private WebElement ScrollTo_CreateInidentalCharhe_CheckBox_InDealCharge_InmainteanceUnder_InvestmentDeals_withoutTradingDeal;
		public WebElement ScrollTo_CreateInidentalCharhe_CheckBox_InDealCharge_InmainteanceUnder_InvestmentDeals_withoutTradingDeal_607(){
			return ScrollTo_CreateInidentalCharhe_CheckBox_InDealCharge_InmainteanceUnder_InvestmentDeals_withoutTradingDeal;
		}
		
		@FindBy(xpath = "//*[@id='1_INCIDENTAL_CHARGE_COLLECT_IND_dealChargesGridTbl_Id_T022MT']")
		private WebElement Select_Collect_InDealCharge_InmainteanceUnder_InvestmentDeals_withoutTradingDeal;
		public WebElement Select_Collect_InDealCharge_InmainteanceUnder_InvestmentDeals_withoutTradingDeal_607(){
			return Select_Collect_InDealCharge_InmainteanceUnder_InvestmentDeals_withoutTradingDeal;
		}
		
		@FindBy(xpath = "//*[@id='dealChargeOKBtn_T022MT']")
		private WebElement ClickOK_Btn_InDealCharge_InmainteanceUnder_InvestmentDeals_withoutTradingDeal;
		public WebElement ClickOK_Btn_InDealCharge_InmainteanceUnder_InvestmentDeals_withoutTradingDeal_607(){
			return ClickOK_Btn_InDealCharge_InmainteanceUnder_InvestmentDeals_withoutTradingDeal;
		}
		
		@FindBy(xpath = "//td[text()='Settlement']")
		private WebElement Click_Settlement_Under_Menu;
		public WebElement Click_Settlement_Under_Menu_607(){
			return Click_Settlement_Under_Menu;
		}
		
		@FindBy(xpath = "//*[@id='T06MT']")
		private WebElement Click_Mainteance_UnderSettlement;
		public WebElement Click_Mainteance_UnderSettlement_607(){
			return Click_Mainteance_UnderSettlement;
		}
		
		
		
		
		@FindBy(xpath = "//td[text()='Repayment Plan']")
		private WebElement Click_Repayment_Plan_Under_Menu;
		public WebElement Click_Repayment_Plan_Under_Menu_607(){
			return Click_Repayment_Plan_Under_Menu;
		}
		
		@FindBy(xpath = "//*[@id='T04MT']")
		private WebElement Click_Mainteance_Under_Repayment_Plan;
		public WebElement Click_Mainteance_Under_Repayment_Plan_607(){
			return Click_Mainteance_Under_Repayment_Plan;
		}
		
		@FindBy(xpath = "//*[@id='infoBarSearchButton_T04MT']")
		private WebElement Click_Search_InMainteance_Under_Repayment_Plan;
		public WebElement Click_Search_InMainteance_Under_Repayment_Plan_607(){
			return Click_Search_InMainteance_Under_Repayment_Plan;
		}
		
		@FindBy(xpath = "//*[@id='repaymentPlanMgmtGridTbl_Id_T04MT_gs_trspayplanVO.TRX_NBR']")
		private WebElement SearchDealRecord_InMainteance_Under_Repayment_Plan;
		public WebElement SearchDealRecord_InMainteance_Under_Repayment_Plan_607(){
			return SearchDealRecord_InMainteance_Under_Repayment_Plan;
		}
		
		@FindBy(xpath = "//*[@id='td_repaymentPlanMgmtGridTbl_Id_T04MT_1_trspayplanVO.PLAN_NBR']")
		private WebElement SelectRecord_InMainteance_Under_Repayment_Plan;
		public WebElement SelectRecord_InMainteance_Under_Repayment_Plan_607(){
			return SelectRecord_InMainteance_Under_Repayment_Plan;
		}
		
		@FindBy(xpath = "//*[@id='rePaymentPlanMainTab2_T04MT']")
		private WebElement Click_ScheduleDetails_InMainteance_Under_Repayment_Plan;
		public WebElement Click_ScheduleDetails_InMainteance_Under_Repayment_Plan_607(){
			return Click_ScheduleDetails_InMainteance_Under_Repayment_Plan;
		}
		
		@FindBy(xpath = "//*[@id='td_repaumentPlanScheduleGridTbl_Id_T04MT_1_incidentalCharge']")
		private WebElement getIncidentalCharge_InMainteance_Under_Repayment_Plan;
		public WebElement getIncidentalCharge_InMainteance_Under_Repayment_Plan_607(){
			return getIncidentalCharge_InMainteance_Under_Repayment_Plan;
		}
		
		@FindBy(xpath = "//*[@id='lookuptxt_dealNo_T06MT']")
		private WebElement DealNbr_InSettlementDetailsTab_InMainteance_UnderSettlement;
		public WebElement DealNbr_InSettlementDetailsTab_InMainteance_UnderSettlement_607(){
			return DealNbr_InSettlementDetailsTab_InMainteance_UnderSettlement;
		}
		
		@FindBy(xpath = "//*[@id='settlementTab2_T06MT']")
		private WebElement Click_ScheduleDetailsTab_InMainteance_UnderSettlement;
		public WebElement Click_ScheduleDetailsTab_InMainteance_UnderSettlement_607(){
			return Click_ScheduleDetailsTab_InMainteance_UnderSettlement;
		}
		
		@FindBy(xpath = "//*[@id=\"td_settlementScheduleGridTbl_Id_T06MT_1_trspayplandetvo.CAPITAL_AMT\"]")
		private WebElement Principal_Charge_InsuranceAmt_InScheduleDetails_InMainteance_UnderSettlement;
		public WebElement Principal_Charge_InsuranceAmt_InScheduleDetails_InMainteance_UnderSettlement_607(){
			return Principal_Charge_InsuranceAmt_InScheduleDetails_InMainteance_UnderSettlement;
		}
		
		@FindBy(xpath = "//*[@id='crossCyPartyAmount_T06MT']")
		private WebElement EnterAmount_Received_FromParty_InSettlementDetailsTab_InMainteance_UnderSettlement;
		public WebElement EnterAmount_Received_FromParty_InSettlementDetailsTab_InMainteance_UnderSettlement_607(){
			return EnterAmount_Received_FromParty_InSettlementDetailsTab_InMainteance_UnderSettlement;
		}
		
		@FindBy(xpath = "//*[@id='td_settlementScheduleGridTbl_Id_T06MT_1_trssetlmtdetvo.LINE_NBR']")
		private WebElement SelectFirstLine_BeforeEnterSettlement_InScheduleDetailstab_InMainteance_UnderSettlement;
		public WebElement SelectFirstLine_BeforeEnterSettlement_InScheduleDetailstab_InMainteance_UnderSettlement_607(){
			return SelectFirstLine_BeforeEnterSettlement_InScheduleDetailstab_InMainteance_UnderSettlement;
		}
		
		@FindBy(xpath = "//*[@id='1_trssetlmtdetvo.SETTLEMENT_AMOUNT_settlementScheduleGridTbl_Id_T06MT']")
		private WebElement EnterSettlement_InScheduleDetailstab_InMainteance_UnderSettlement;
		public WebElement EnterSettlement_InScheduleDetailstab_InMainteance_UnderSettlement_607(){
			return EnterSettlement_InScheduleDetailstab_InMainteance_UnderSettlement;
		}
		
		@FindBy(xpath = "//*[@id='settlementTab1_T06MT']")
		private WebElement Click_settlementDetailsTab_InMainteance_UnderSettlement;
		public WebElement Click_settlementDetailsTab_InMainteance_UnderSettlement_607(){
			return Click_settlementDetailsTab_InMainteance_UnderSettlement;
		}
		
		@FindBy(xpath = "//*[@id='savebutton_T06MT']")
		private WebElement ClickSavebtn_InMainteance_UnderSettlement;
		public WebElement ClickSavebtn_InMainteance_UnderSettlement_607(){
			return ClickSavebtn_InMainteance_UnderSettlement;
		}
		
		@FindBy(xpath = "//*[@id='T06P']")
		private WebElement ClickApprove_UnderSettlement;
		public WebElement ClickApprove_UnderSettlement_607(){
			return ClickApprove_UnderSettlement;
		}
		
		@FindBy(xpath = "//*[@id='settlementMgmtGridTbl_Id_T06P_gs_trssetlmtvo.DEAL_NBR']")
		private WebElement SearchDeal_InApprove_UnderSettlement;
		public WebElement SearchDeal_InApprove_UnderSettlement_607(){
			return SearchDeal_InApprove_UnderSettlement;
		}
		
		@FindBy(xpath = "//*[@id='td_settlementMgmtGridTbl_Id_T06P_1_trssetlmtvo.SETTLEMENT_NBR']")
		private WebElement SelectRecord_InApprove_UnderSettlement;
		public WebElement SelectRecord_InApprove_UnderSettlement_607(){
			return SelectRecord_InApprove_UnderSettlement;
		}
		
		@FindBy(xpath = "//*[@id='settlement_Approve_btn_T06P']")
		private WebElement ClickApproveBtn_InApprove_UnderSettlement;
		public WebElement ClickApproveBtn_InApprove_UnderSettlement_607(){
			return ClickApproveBtn_InApprove_UnderSettlement;
		}
		
		//126188
		
		@FindBy(xpath = "//*[@id='td_settlementScheduleGridTbl_Id_T06MT_2_trssetlmtdetvo.LINE_NBR']")
		private WebElement SelectSecondLine_BeforeEnterSettlement_InScheduleDetailstab_InMainteance_UnderSettlement;
		public WebElement SelectSecondLine_BeforeEnterSettlement_InScheduleDetailstab_InMainteance_UnderSettlement_607(){
			return SelectSecondLine_BeforeEnterSettlement_InScheduleDetailstab_InMainteance_UnderSettlement;
		}
		
		@FindBy(xpath = "//*[@id='2_trssetlmtdetvo.SETTLEMENT_AMOUNT_settlementScheduleGridTbl_Id_T06MT']")
		private WebElement EnterSecondSettlement_InScheduleDetailstab_InMainteance_UnderSettlement;
		public WebElement EnterSecondSettlement_InScheduleDetailstab_InMainteance_UnderSettlement_607(){
			return EnterSecondSettlement_InScheduleDetailstab_InMainteance_UnderSettlement;
		}
		
		
		//126189
		
		@FindBy(xpath = "//*[@id='td_settlementScheduleGridTbl_Id_T06MT_3_trssetlmtdetvo.LINE_NBR']")
		private WebElement SelectThirdLine_BeforeEnterSettlement_InScheduleDetailstab_InMainteance_UnderSettlement;
		public WebElement SelectThirdLine_BeforeEnterSettlement_InScheduleDetailstab_InMainteance_UnderSettlement_607(){
			return SelectThirdLine_BeforeEnterSettlement_InScheduleDetailstab_InMainteance_UnderSettlement;
		}
		
		@FindBy(xpath = "//*[@id='3_trssetlmtdetvo.SETTLEMENT_AMOUNT_settlementScheduleGridTbl_Id_T06MT']")
		private WebElement EnterThirdSettlement_InScheduleDetailstab_InMainteance_UnderSettlement;
		public WebElement EnterThirdSettlement_InScheduleDetailstab_InMainteance_UnderSettlement_607(){
			return EnterThirdSettlement_InScheduleDetailstab_InMainteance_UnderSettlement;
		}
		
		//130739
		
		@FindBy(xpath = "//td[text()='Tracking & Incidental Charges']")
		private WebElement Click_Tracking_Incidental_Charges_under_menu;
		public WebElement Click_Tracking_Incidental_Charges_under_menu_607(){
			return Click_Tracking_Incidental_Charges_under_menu;
		}
		
		@FindBy(xpath = "//*[@id='T07MT']")
		private WebElement Click_Mainteance_Under_Tracking_Incidental_Charges_under_menu;
		public WebElement Click_Mainteance_Under_Tracking_Incidental_Charges_under_menu_607(){
			return Click_Mainteance_Under_Tracking_Incidental_Charges_under_menu;
		}
		
		@FindBy(xpath = "//*[@id=\"lookuptxt_trs_deal_serial_no_T07MT\"]")
		private WebElement EnterDealNbr_InMainteance_Under_Tracking_Incidental_Charges_under_menu;
		public WebElement EnterDealNbr_InMainteance_Under_Tracking_Incidental_Charges_under_menu_607(){
			return EnterDealNbr_InMainteance_Under_Tracking_Incidental_Charges_under_menu;
		}
		
		@FindBy(xpath = "//*[@id='lookuptxt_charges_code_T07MT']")
		private WebElement EnterChargeCode_InMainteance_Under_Tracking_Incidental_Charges_under_menu;
		public WebElement EnterChargeCode_InMainteance_Under_Tracking_Incidental_Charges_under_menu_607(){
			return EnterChargeCode_InMainteance_Under_Tracking_Incidental_Charges_under_menu;
		}
		
		@FindBy(xpath = "//*[@id='trstrackdetVO_CHARGE_ALLOCATION_CRITERIA_T07MT']")
		private WebElement Select_ChargeAllocationCriteria_InMainteance_Under_Tracking_Incidental_Charges_under_menu;
		public WebElement Select_ChargeAllocationCriteria_InMainteance_Under_Tracking_Incidental_Charges_under_menu_607(){
			return Select_ChargeAllocationCriteria_InMainteance_Under_Tracking_Incidental_Charges_under_menu;
		}
		
		@FindBy(xpath = "//*[@id='spanLookup_drAcc_sl_T07MT']")
		private WebElement ClickSearch_BtnInAccounts_InMainteance_Under_Tracking_Incidental_Charges_under_menu;
		public WebElement ClickSearch_BtnInAccounts_InMainteance_Under_Tracking_Incidental_Charges_under_menu_607(){
			return ClickSearch_BtnInAccounts_InMainteance_Under_Tracking_Incidental_Charges_under_menu;
		}
		
		@FindBy(xpath = "//*[@id='td_gridtab_drAcc_sl_T07MT_1_amfVO.BRANCH_CODE']")
		private WebElement SelectGLCode_InAccounts_InMainteance_Under_Tracking_Incidental_Charges_under_menu;
		public WebElement SelectGLCode_InAccounts_InMainteance_Under_Tracking_Incidental_Charges_under_menu_607(){
			return SelectGLCode_InAccounts_InMainteance_Under_Tracking_Incidental_Charges_under_menu;
		}
		
		@FindBy(xpath = "//*[@id='incidentalcharges_save_T07MT']")
		private WebElement ClickSave_Btn_InMainteance_Under_Tracking_Incidental_Charges_under_menu;
		public WebElement ClickSave_Btn_InMainteance_Under_Tracking_Incidental_Charges_under_menu_607(){
			return ClickSave_Btn_InMainteance_Under_Tracking_Incidental_Charges_under_menu;
		}
		
		@FindBy(xpath = "//*[@id='T07P']")
		private WebElement ClickApprove_Under_Tracking_Incidental_Charges_under_menu;
		public WebElement ClickApprove_Under_Tracking_Incidental_Charges_under_menu_607(){
			return ClickApprove_Under_Tracking_Incidental_Charges_under_menu;
		}
		
		@FindBy(xpath = "//*[@id='IncidentalChargesGridTbl_Id_T07P_gs_trstrackVO.TRS_DEAL_SERIAL_NO']")
		private WebElement SearchDealnbr_InApprove_Under_Tracking_Incidental_Charges_under_menu;
		public WebElement SearchDealnbr_InApprove_Under_Tracking_Incidental_Charges_under_menu_607(){
			return SearchDealnbr_InApprove_Under_Tracking_Incidental_Charges_under_menu;
		}
		
		@FindBy(xpath = "//*[@id='td_IncidentalChargesGridTbl_Id_T07P_1_trstrackVO.TRACK_NBR']")
		private WebElement SelectRecord_InApprove_Under_Tracking_Incidental_Charges_under_menu;
		public WebElement SelectRecord_InApprove_Under_Tracking_Incidental_Charges_under_menu_607(){
			return SelectRecord_InApprove_Under_Tracking_Incidental_Charges_under_menu;
		}
		
		@FindBy(xpath = "//*[@id='incidentalchargesMainTabToolBar_T07P']//a")
		private WebElement ClickApproveBtn_InApprove_Under_Tracking_Incidental_Charges_under_menu;
		public WebElement ClickApproveBtn_InApprove_Under_Tracking_Incidental_Charges_under_menu_607(){
			return ClickApproveBtn_InApprove_Under_Tracking_Incidental_Charges_under_menu;
		}
		
		@FindBy(xpath = "//*[@id='_popup_path_sol_confirm']")
		private WebElement ClickCancel_in_ReportGeneration;
		public WebElement ClickCancel_in_ReportGeneration_607(){
			return ClickCancel_in_ReportGeneration;
		}
		
		@FindBy(xpath = "//div[@class='jMsgbox-contentWrap'][contains(text(),'continue')]")
	    private WebElement IIS_approve_menu_confirm_continue_popup;
	    public WebElement IISApproveMenuConfirmContinuePopup_607() {
	        return IIS_approve_menu_confirm_continue_popup;
	    }

	    @FindBy(xpath = "//div[@class='jMsgbox-contentWrap'][contains(text(),'proceed')]")
	    private WebElement IIS_approve_menu_confirm_proceed_popup;
	    public WebElement IISApproveMenuConfirmPopupProceed_607() {
	        return IIS_approve_menu_confirm_proceed_popup;
	    }
	    
	    @FindBy(xpath = "//div[@class='jMsgbox-contentWrap'][contains(text(),'Collaterals')]")
	    private WebElement IIS_approve_menu_confirm_collateral_popup;
	    public WebElement IISApproveMenuConfirmCollateralPopup_607() {
	        return IIS_approve_menu_confirm_collateral_popup;
	    }
	  
	
	    //130740
	  
	    @FindBy(xpath = "(//*[@id='infoBarSearchButton_T022MT'])[1]")
	    private WebElement Click_SearchIn_mainteance_under_InvestmentDealsCombinedWithoutTradDeal;
	    public WebElement Click_SearchIn_mainteance_under_InvestmentDealsCombinedWithoutTradDeal_607() {
	        return Click_SearchIn_mainteance_under_InvestmentDealsCombinedWithoutTradDeal;
	    }
	  
	    @FindBy(xpath = "//*[@id='investmentDealsGridTbl_Id_T022MT_gs_trsdealVO.SERIAL_NO']")
	    private WebElement SearchRecordIn_mainteance_under_InvestmentDealsCombinedWithoutTradDeal;
	    public WebElement SearchRecordIn_mainteance_under_InvestmentDealsCombinedWithoutTradDeal_607() {
	        return SearchRecordIn_mainteance_under_InvestmentDealsCombinedWithoutTradDeal;
	    }
	  
	    @FindBy(xpath = "//*[@id='td_investmentDealsGridTbl_Id_T022MT_1_trsdealVO.SERIAL_NO']")
	    private WebElement SelectRecordIn_mainteance_under_InvestmentDealsCombinedWithoutTradDeal;
	    public WebElement SelectRecordIn_mainteance_under_InvestmentDealsCombinedWithoutTradDeal_607() {
	        return SelectRecordIn_mainteance_under_InvestmentDealsCombinedWithoutTradDeal;
	    }
	  
	    @FindBy(xpath = "//*[@id='pmtInstrBtn_T022MT']")
	    private WebElement Click_PaymentInstruction_In_mainteance_under_InvestmentDealsCombinedWithoutTradDeal;
	    public WebElement Click_PaymentInstruction_In_mainteance_under_InvestmentDealsCombinedWithoutTradDeal_607() {
	        return Click_PaymentInstruction_In_mainteance_under_InvestmentDealsCombinedWithoutTradDeal;
	    }
	  
	    @FindBy(xpath = "//*[@id='showJVD_btn_T022MT']")
	    private WebElement Click_JournalVoucherDetails_InPaymentInstruction_In_mainteance_under_InvestmentDealsCombinedWithoutTradDeal;
	    public WebElement Click_JournalVoucherDetails_InPaymentInstruction_In_mainteance_under_InvestmentDealsCombinedWithoutTradDeal_607() {
	        return Click_JournalVoucherDetails_InPaymentInstruction_In_mainteance_under_InvestmentDealsCombinedWithoutTradDeal;
	    }
	  
	    @FindBy(xpath = "//*[@id='td_transactionAccountJvList_Id_T022MT_3_trsaccountvo.CV_AMOUNT']")
	    private WebElement CheckIncidental_Charges_InJournalVoucherDetails_InPaymentInstruction_In_mainteance_under_InvestmentDealsCombinedWithoutTradDeal;
	    public WebElement CheckIncidental_Charges_InJournalVoucherDetails_InPaymentInstruction_In_mainteance_under_InvestmentDealsCombinedWithoutTradDeal_607() {
	        return CheckIncidental_Charges_InJournalVoucherDetails_InPaymentInstruction_In_mainteance_under_InvestmentDealsCombinedWithoutTradDeal;
	    }
	    
	    
	    
	    
	  //130877

	    @FindBy(xpath = "//td[text()='Periodical Processing']")
	    private WebElement IIS_PeriodicalProcessing_Menu;
	    public WebElement IISperiodicalprocessingmenu_607() {
	        return IIS_PeriodicalProcessing_Menu;
	    }
	    @FindBy(xpath = "//td[text()='Post Accruals']")
	    private WebElement IIS_PeriodicalProcessing_PostAccruals;
	    public WebElement IISperiodicalprocessingpostaccruals_607() {
	        return IIS_PeriodicalProcessing_PostAccruals;
	    }
	    @FindBy(xpath = "//a[@id='T10EMF']")
	    private WebElement IIS_PeriodicalProcessing_PostAccruals_FinalAccruals;
	    public WebElement IISperiodicalprocessingpostaccrualsfinalaccruals_607() {
	        return IIS_PeriodicalProcessing_PostAccruals_FinalAccruals;
	    }
	    @FindBy(xpath = "//input[@id='Specific_deal_T10EMF']")
	    private WebElement IIS_PeriodicalProcessing_PostAccruals_FinalAccruals_Specificdealcheckbox;
	    public WebElement IISperiodicalprocessingpostaccrualsfinalaccrualsspecificdealflagcheckbox_607() {
	        return IIS_PeriodicalProcessing_PostAccruals_FinalAccruals_Specificdealcheckbox;
	    }
	    @FindBy(xpath = "//input[@id='lookuptxt_postChargeAccuralProcessSpecificDeal_T10EMF']")
	    private WebElement IIS_PeriodicalProcessing_PostAccruals_FinalAccruals_dealnumsearchbox;
	    public WebElement IISperiodicalprocessingpostaccrualsfinalaccrualsdealnumsearchbox_607() {
	        return IIS_PeriodicalProcessing_PostAccruals_FinalAccruals_dealnumsearchbox;
	    }
	    @FindBy(xpath = "//input[@id='fromDate_T10EMF']")
	    private WebElement IIS_PeriodicalProcessing_PostAccruals_FinalAccruals_FromDate;
	    public WebElement IISperiodicalprocessingpostaccrualsfinalaccrualsfromdate_607() {
	        return IIS_PeriodicalProcessing_PostAccruals_FinalAccruals_FromDate;
	    }
	    @FindBy(xpath = "//input[@id='toDate_T10EMF']")
	    private WebElement IIS_PeriodicalProcessing_PostAccruals_FinalAccruals_todate;
	    public WebElement IISperiodicalprocessingpostaccrualsfinalaccrualstodate_607() {
	        return IIS_PeriodicalProcessing_PostAccruals_FinalAccruals_todate;
	    }
	    @FindBy(xpath = "//button[@id='postChargeAccrualProcess_trialRun_T10EMF']")
	    private WebElement IIS_PeriodicalProcessing_PostAccruals_FinalAccruals_OKbtn;
	    public WebElement IISperiodicalprocessingpostaccrualsfinalaccrualsokbtn_607() {
	        return IIS_PeriodicalProcessing_PostAccruals_FinalAccruals_OKbtn;
	    }

//		Calculators Module
		@FindBy(xpath = "//td[text()='Calculators']")
		private WebElement IIS_calculators_module;
		public WebElement IISCalculatorsModule_607() {
			return IIS_calculators_module;
		}
		
		@FindBy(xpath = "//a[@id='M0169']")
		private WebElement IIS_calculators_reschedule_calculator_With_Profit;
		public WebElement IISCalculatorsRescheduleCalculatorWithProfit_607() {
			return IIS_calculators_reschedule_calculator_With_Profit;
		}
		
		@FindBy(xpath = "//input[@id='lookuptxt_trsdealVO_SERIAL_NO_M0169']")
		private WebElement IIS_reschedule_calculator_With_Profit_deal_nbr_input;
		public WebElement IISRescheduleCalculatorWithProfitDealNbrInput_607() {
			return IIS_reschedule_calculator_With_Profit_deal_nbr_input;
		}
		
		@FindBy(xpath = "//div[@id='islamicRescheduleCalc_repaymentdet_collapspanel_M0169']")
		private WebElement IIS_reschedule_calculator_With_Profit_repayment_details_panel;
		public WebElement IISRescheduleCalculatorWithProfitRepaymentDetailsPanel_607() {
			return IIS_reschedule_calculator_With_Profit_repayment_details_panel;
		}
		
		@FindBy(xpath = "//input[@id='gracePeriod_M0169']")
		private WebElement IIS_reschedule_calculator_With_Profit_repayment_details_first_pay_after_input;
		public WebElement IISRescheduleCalculatorWithProfitRepaymentDetailsFirstPayAfterInput_607() {
			return IIS_reschedule_calculator_With_Profit_repayment_details_first_pay_after_input;
		}
		
		@FindBy(xpath = "//input[@id='no_of_payments_M0169']")
		private WebElement IIS_reschedule_calculator_With_Profit_repayment_details_no_of_pay_input;
		public WebElement IISRescheduleCalculatorWithProfitRepaymentDetailsNoOfPayInput_607() {
			return IIS_reschedule_calculator_With_Profit_repayment_details_no_of_pay_input;
		}
		
		@FindBy(xpath = "//button[@id='calculateBtn_M0169']")
		private WebElement IIS_reschedule_calculator_With_Profit_calculate_btn;
		public WebElement IISRescheduleCalculatorWithProfitCalculateBtn_607() {
			return IIS_reschedule_calculator_With_Profit_calculate_btn;
		}
		
		@FindBy(xpath = "//button[@id='rescheduleCalculatorUpdateBtn_M0169']")
		private WebElement IIS_reschedule_calculator_With_Profit_update_btn;
		public WebElement IISRescheduleCalculatorWithProfitUpdateBtn_607() {
			return IIS_reschedule_calculator_With_Profit_update_btn;
		}
		
//		Reschedule Repayment Plan module
		@FindBy(xpath = "//td[text()='Reschedule Repayment Plan']")
		private WebElement IIS_reschedule_repayment_plan_module;
		public WebElement IISRescheduleRepaymentPlanModule_607() {
			return IIS_reschedule_repayment_plan_module;
		}
		
		@FindBy(xpath = "//a[@id='T041P']")
		private WebElement IIS_reschedule_repayment_plan_approve_menu;
		public WebElement IISRescheduleRepaymentPlanApproveMenu_607() {
			return IIS_reschedule_repayment_plan_approve_menu;
		}
		
		@FindBy(xpath = "//input[@id='repaymentPlanMgmtGridTbl_Id_T041P_gs_trspayplanVO.TRX_NBR']")
		private WebElement IIS_reschedule_repayment_plan_approve_searchgrid_deal_input;
		public WebElement IISRescheduleRepaymentPlanApproveSearchgridDealInput_607() {
			return IIS_reschedule_repayment_plan_approve_searchgrid_deal_input;
		}
		
		@FindBy(xpath = "//td[@id='td_repaymentPlanMgmtGridTbl_Id_T041P_1_trspayplanVO.PLAN_NBR']")
		private WebElement IIS_reschedule_repayment_plan_approve_searchgrid_row;
		public WebElement IISRescheduleRepaymentPlanApproveSearchgridRow_607() {
			return IIS_reschedule_repayment_plan_approve_searchgrid_row;
		}
		
		@FindBy(xpath = "//input[@id='trx_nbr_hd_T041P']")
		private WebElement IIS_reschedule_repayment_plan_approve_menu_deal_nbr;
		public WebElement IISRescheduleRepaymentPlanApproveMenuDealNbr_607() {
			return IIS_reschedule_repayment_plan_approve_menu_deal_nbr;
		}
		
		@FindBy(xpath = "//a[@id='approvebutton_T041P']")
		private WebElement IIS_reschedule_repayment_plan_approve_menu_approve_btn;
		public WebElement IISRescheduleRepaymentPlanApproveMenuApproveBtn_607() {
			return IIS_reschedule_repayment_plan_approve_menu_approve_btn;
		}
	    
		//1376676
		
		
		@FindBy(xpath = "//*[@id='trsdealVO_DD_PERIODICITY_NBR_T022MT']")
		private WebElement Tenure_dateIn_mainteance_Under_investment_deal_without_trade_deal_menu;
		public WebElement Tenure_dateIn_mainteance_Under_investment_deal_without_trade_deal_menu_607() {
			return Tenure_dateIn_mainteance_Under_investment_deal_without_trade_deal_menu;
		}
		
		@FindBy(xpath = "//*[@id='trsdealVO_DD_PERIODICITY_TYPE_T022MT']")
		private WebElement Tenure_monthIn_mainteance_Under_investment_deal_without_trade_deal_menu;
		public WebElement Tenure_monthIn_mainteance_Under_investment_deal_without_trade_deal_menu_607() {
			return Tenure_monthIn_mainteance_Under_investment_deal_without_trade_deal_menu;
		}
		
		
		@FindBy(xpath = "//*[@id='No_Of_Payments_T022MT']")
		private WebElement No_Of_Payments_InRepaymentPlan_In_mainteance_Under_investment_deal_without_trade_deal_menu;
		public WebElement No_Of_Payments_InRepaymentPlan_In_mainteance_Under_investment_deal_without_trade_deal_menu_607() {
			return No_Of_Payments_InRepaymentPlan_In_mainteance_Under_investment_deal_without_trade_deal_menu;
		}
		
		
		
		//@1222687
		
		@FindBy(xpath = "//td[text()='Advance Repayment']")
		private WebElement Click_AdvanceRepayment_Under_MenuOptions;
		public WebElement Click_AdvanceRepayment_Under_MenuOptions_607() {
			return Click_AdvanceRepayment_Under_MenuOptions;
		}
		
		
		@FindBy(xpath = "//*[@id='T049MT']")
		private WebElement Click_Mainteance_Under_AdvanceRepayment;
		public WebElement Click_Mainteance_Under_AdvanceRepayment() {
			return Click_Mainteance_Under_AdvanceRepayment;
		}
		
		@FindBy(xpath = "//*[@id='lookuptxt_dealNo_T049MT']")
		private WebElement Enter_DealNbrIn_Mainteance_Under_AdvanceRepayment;
		public WebElement Enter_DealNbrIn_Mainteance_Under_AdvanceRepayment_607() {
			return Enter_DealNbrIn_Mainteance_Under_AdvanceRepayment;
		}
		
		@FindBy(xpath = "//*[@id='generate_Repay_Plan_Based_On_label']")
		private WebElement Check_generate_Repay_Plan_Based_On_label_In_Mainteance_Under_AdvanceRepayment;
		public WebElement Check_generate_Repay_Plan_Based_On_label_In_Mainteance_Under_AdvanceRepayment_607() {
			return Check_generate_Repay_Plan_Based_On_label_In_Mainteance_Under_AdvanceRepayment;
		}
	    
	    //1357287
		
		@FindBy(xpath = "//td[text()='Investment Deals']")
		private WebElement Click_Investment_Deals_MenuOptions;
		public WebElement Click_Investment_Deals_MenuOptions_607() {
			return Click_Investment_Deals_MenuOptions;
		}
		
		@FindBy(xpath = "//*[@id='T02MT']")
		private WebElement Click_Mainteance_Under_Investment_Deals;
		public WebElement Click_Mainteance_Under_Investment_Deals_607() {
			return Click_Mainteance_Under_Investment_Deals;
		}
		
		@FindBy(xpath = "//*[@id='investmentDealsMainTabs3_T022MT']")
		private WebElement Click_Additional_DetailsTab_InMainteance_Under_Investment_Deals;
		public WebElement Click_Additional_DetailsTab_InMainteance_Under_Investment_Deals_607() {
			return Click_Additional_DetailsTab_InMainteance_Under_Investment_Deals;
		}
		
		@FindBy(xpath = "//*[@id='advancePaymentBtn_T022MT']")
		private WebElement ClickadvancePaymentBtn_InAdditional_DetailsTab_InMainteance_Under_Investment_Deals;
		public WebElement ClickadvancePaymentBtn_InAdditional_DetailsTab_InMainteance_Under_Investment_Deals_607() {
			return ClickadvancePaymentBtn_InAdditional_DetailsTab_InMainteance_Under_Investment_Deals;
		}
		
		@FindBy(xpath = "//*[@id='trsdealAdvancePaymentVO_payment_type_T022MT']")
		private WebElement PaymentTypeDropDown_InAdvancePayment_InAdditional_DetailsTab_InMainteance_Under_Investment_Deals;
		public WebElement PaymentTypeDropDown_InAdvancePayment_InAdditional_DetailsTab_InMainteance_Under_Investment_Deals_607() {
			return PaymentTypeDropDown_InAdvancePayment_InAdditional_DetailsTab_InMainteance_Under_Investment_Deals;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	    
}
