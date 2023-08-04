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
		public WebElement IISCoreTechDetailsIcon_608() {
			return IIS_core_tech_details_icon;
		}
		
		@FindBy(xpath = "//label[@id='clear_cache_key']")
		private WebElement IIS_core_clear_cache_btn;
		public WebElement IISCoreClearCacheBtn_608() {
			return IIS_core_clear_cache_btn;
		}
		
//		Investment Deals -Combined without Trade Deal
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
		
//		Category input ==> Charge code 
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
		
		
		
//		Tracking & Incidental Charges
//		@AT_IC_010
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
		
		@FindBy(xpath = "//input[@id='_popup_path_sol_confirm_ok']")
		private WebElement CconfirmSave_popup_ok_btn;
		public WebElement CconfirmSave_popup_ok_btn(){
			return CconfirmSave_popup_ok_btn;
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
		
		@FindBy(xpath = "//input[@id='_popup_path_sol_ok']")
		private WebElement SuccessFully_Saved_popup_ok_btn;
		public WebElement SuccessFully_Saved_popup_ok_btn_607(){
			return SuccessFully_Saved_popup_ok_btn;
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
	    public WebElement IISApproveMenuConfirmContinuePopup_608() {
	        return IIS_approve_menu_confirm_continue_popup;
	    }

	    @FindBy(xpath = "//div[@class='jMsgbox-contentWrap'][contains(text(),'proceed')]")
	    private WebElement IIS_approve_menu_confirm_proceed_popup;
	    public WebElement IISApproveMenuConfirmPopupProceed_608() {
	        return IIS_approve_menu_confirm_proceed_popup;
	    }
	    
	    @FindBy(xpath = "//div[@class='jMsgbox-contentWrap'][contains(text(),'Collaterals')]")
	    private WebElement IIS_approve_menu_confirm_collateral_popup;
	    public WebElement IISApproveMenuConfirmCollateralPopup_608() {
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
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
}
