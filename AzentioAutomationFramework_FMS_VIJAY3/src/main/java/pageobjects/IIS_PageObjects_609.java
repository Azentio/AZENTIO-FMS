package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IIS_PageObjects_609 {
	WebDriver driver;
	public IIS_PageObjects_609(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	// Clear cache for FMS Core
		@FindBy(xpath = "//span[@id='tech_details_icon']")
		private WebElement IIS_core_tech_details_icon;
		public WebElement IISCoreTechDetailsIcon_609() {
			return IIS_core_tech_details_icon;
		}
		
		@FindBy(xpath = "//label[@id='clear_cache_key']")
		private WebElement IIS_core_clear_cache_btn;
		public WebElement IISCoreClearCacheBtn_609() {
			return IIS_core_clear_cache_btn;
		}
		
//******************************************** Investment Deals - Combined without Trade Deal ******************************************************///
		@FindBy(xpath = "//td[text()='Investment Deals -Combined without Trade Deal']")
		private WebElement IIS_InvestmentDealWithoutTradeDeal_609;
		public WebElement IIS_InvestmentDealWithoutTradeDeal_609(){
			return IIS_InvestmentDealWithoutTradeDeal_609;
		}
		
		@FindBy(xpath = "//a[@id='T022MT']")
		private WebElement IIS_InvestmentDealWithoutTradeDeal_Maintenance_609;
		public WebElement IIS_InvestmentDealWithoutTradeDeal_Maintenance_609(){
			return IIS_InvestmentDealWithoutTradeDeal_Maintenance_609;
		}
		
		
		@FindBy(xpath = "//span[@id='spanLookup_investmentDeals_PARTY_T022MT']/span")
		private WebElement IIS_InvestmentDealWithoutTradeDeal_Maintenance_PartySearch_609;
		public WebElement IIS_InvestmentDealWithoutTradeDeal_Maintenance_PartySearch_609(){
			return IIS_InvestmentDealWithoutTradeDeal_Maintenance_PartySearch_609;
		}
		
		@FindBy(xpath = "//input[@id='gridtab_investmentDeals_PARTY_T022MT_gs_CIF_NO']")
		private WebElement IIS_InvestmentDealWithoutTradeDeal_Maintenance_Party_609;
		public WebElement IIS_InvestmentDealWithoutTradeDeal_Maintenance_Party_609(){
			return IIS_InvestmentDealWithoutTradeDeal_Maintenance_Party_609;
		}
		
		@FindBy(xpath = "//input[@id='_popup_path_sol_confirm_ok']")
		private WebElement IIS_ConfirmOk_609;
		public WebElement IIS_ConfirmOk_609(){
			return IIS_ConfirmOk_609;
		}
		
		@FindBy(xpath = "//input[@id='_popup_path_sol_confirm']")
		private WebElement IIS_ConfirmCancel_609;
		public WebElement IIS_ConfirmCancel_609(){
			return IIS_ConfirmCancel_609;
		}
		
		
		@FindBy(xpath = "//div[@id='div__popup_path_sol_confirm']/center/input[@id='_popup_path_sol_confirm_ok']")
		private WebElement IIS_ConfirmOk_DealNotCreated_609;
		public WebElement IIS_ConfirmOk_DealNotCreated_609(){
			return IIS_ConfirmOk_DealNotCreated_609;
		}
		
		@FindBy(xpath = "//div[text()='CONFIRM']")
		private WebElement IIS_ConfirmOkPopUp_609;
		public WebElement IIS_ConfirmOkPopUp_609(){
			return IIS_ConfirmOkPopUp_609;
		}
		
		@FindBy(xpath = "//span[@id='spanLookup_trsdealVO_DEAL_TYPE_T022MT']/span")
		private WebElement IIS_InvestmentDealWithoutTradeDeal_Maintenance_CategorySearch_609;
		public WebElement IIS_InvestmentDealWithoutTradeDeal_Maintenance_CategorySearch_609(){
			return IIS_InvestmentDealWithoutTradeDeal_Maintenance_CategorySearch_609;
		}

		@FindBy(xpath = "//input[@id='gridtab_trsdealVO_DEAL_TYPE_T022MT_gs_CATEGORY_CODE']")
		private WebElement IIS_InvestmentDealWithoutTradeDeal_Maintenance_Category_609;
		public WebElement IIS_InvestmentDealWithoutTradeDeal_Maintenance_Category_609(){
			return IIS_InvestmentDealWithoutTradeDeal_Maintenance_Category_609;
		}
		
		@FindBy(xpath = "//div[@id='lookupid_investmentDeals_CLASS_T022MT']/span/span")
		private WebElement IIS_InvestmentDealWithoutTradeDeal_Maintenance_ProductClassSearch_609;
		public WebElement IIS_InvestmentDealWithoutTradeDeal_Maintenance_ProductClassSearch_609(){
			return IIS_InvestmentDealWithoutTradeDeal_Maintenance_ProductClassSearch_609;
		}
		
		@FindBy(xpath = "//input[@id='gridtab_investmentDeals_CLASS_T022MT_gs_CODE']")
		private WebElement IIS_InvestmentDealWithoutTradeDeal_Maintenance_ProductClass_609;
		public WebElement IIS_InvestmentDealWithoutTradeDeal_Maintenance_ProductClass_609(){
			return IIS_InvestmentDealWithoutTradeDeal_Maintenance_ProductClass_609;
		}
		
		@FindBy(xpath = "//input[@id='trsdealVO_DD_DEAL_AMOUNT_T022MT']")
		private WebElement IIS_InvestmentDealWithoutTradeDeal_Maintenance_Amount_609;
		public WebElement IIS_InvestmentDealWithoutTradeDeal_Maintenance_Amount_609(){
			return IIS_InvestmentDealWithoutTradeDeal_Maintenance_Amount_609;
		}
		
		@FindBy(xpath = "//input[@id='trsdealVO_DD_PERIODICITY_NBR_T022MT']")
		private WebElement IIS_InvestmentDealWithoutTradeDeal_Maintenance_Tenure_609;
		public WebElement IIS_InvestmentDealWithoutTradeDeal_Maintenance_Tenure_609(){
			return IIS_InvestmentDealWithoutTradeDeal_Maintenance_Tenure_609;
		}
		
		@FindBy(xpath = "//input[@id='trsdealVO_DD_DEAL_EXPECTED_YIELD_T022MT']")
		private WebElement IIS_InvestmentDealWithoutTradeDeal_Maintenance_Yield_609;
		public WebElement IIS_InvestmentDealWithoutTradeDeal_Maintenance_Yield_609(){
			return IIS_InvestmentDealWithoutTradeDeal_Maintenance_Yield_609;
		}
		
		@FindBy(xpath = "//li[@id='investmentDealsMainTabs2_T022MT']/a/span")
		private WebElement IIS_InvestmentDealWithoutTradeDeal_Maintenance_ContributorDetails_609;
		public WebElement IIS_InvestmentDealWithoutTradeDeal_Maintenance_ContributorDetails_609(){
			return IIS_InvestmentDealWithoutTradeDeal_Maintenance_ContributorDetails_609;
		}
		
		@FindBy(xpath = "//table[@id='ContributorDetailsGridTbl_Id_T022MT']//td[@id='td_ContributorDetailsGridTbl_Id_T022MT_1_rn']")
		private WebElement IIS_InvestmentDealWithoutTradeDeal_Maintenance_ContributorDetails_Select_609;
		public WebElement IIS_InvestmentDealWithoutTradeDeal_Maintenance_ContributorDetails_Select_609(){
			return IIS_InvestmentDealWithoutTradeDeal_Maintenance_ContributorDetails_Select_609;
		}
		
		@FindBy(xpath = "//span[@id='spanLookup_nostro_sl_T022MT']/span")
		private WebElement IIS_InvestmentDealWithoutTradeDeal_Maintenance_ContributorDetails_NostroSearch_609;
		public WebElement IIS_InvestmentDealWithoutTradeDeal_Maintenance_ContributorDetails_NostroSearch_609(){
			return IIS_InvestmentDealWithoutTradeDeal_Maintenance_ContributorDetails_NostroSearch_609;
		}
		
		@FindBy(xpath = "//input[@id='gridtab_nostro_sl_T022MT_gs_amfVO.GL_CODE']")
		private WebElement IIS_InvestmentDealWithoutTradeDeal_Maintenance_ContributorDetails_Nostro_609;
		public WebElement IIS_InvestmentDealWithoutTradeDeal_Maintenance_ContributorDetails_Nostro_609(){
			return IIS_InvestmentDealWithoutTradeDeal_Maintenance_ContributorDetails_Nostro_609;
		}
		
		
		
		
		@FindBy(xpath = "//input[@id='nostro_acc_ref_T022MT']")
		private WebElement IIS_InvestmentDealWithoutTradeDeal_Maintenance_ContributorDetails_NostroInput_609;
		public WebElement IIS_InvestmentDealWithoutTradeDeal_Maintenance_ContributorDetails_NostroInput_609(){
			return IIS_InvestmentDealWithoutTradeDeal_Maintenance_ContributorDetails_NostroInput_609;
		}
		
		
		
		
		
		@FindBy(xpath = "//span[@id='spanLookup_matr_ac_sl_T022MT']/span")
		private WebElement IIS_InvestmentDealWithoutTradeDeal_Maintenance_ContributorDetails_MaturitySearch_609;
		public WebElement IIS_InvestmentDealWithoutTradeDeal_Maintenance_ContributorDetails_MaturitySearch_609(){
			return IIS_InvestmentDealWithoutTradeDeal_Maintenance_ContributorDetails_MaturitySearch_609;
		}
							
		@FindBy(xpath = "//input[@id='gridtab_matr_ac_sl_T022MT_gs_amfVO.GL_CODE']")
		private WebElement IIS_InvestmentDealWithoutTradeDeal_Maintenance_ContributorDetails_Maturity_609;
		public WebElement IIS_InvestmentDealWithoutTradeDeal_Maintenance_ContributorDetails_Maturity_609(){
			return IIS_InvestmentDealWithoutTradeDeal_Maintenance_ContributorDetails_Maturity_609;
		}
		
		@FindBy(xpath = "//input[@id='matr_ac_ref_T022MT']")
		private WebElement IIS_InvestmentDealWithoutTradeDeal_Maintenance_ContributorDetails_MaturityInput_609;
		public WebElement IIS_InvestmentDealWithoutTradeDeal_Maintenance_ContributorDetails_MaturityInput_609(){
			return IIS_InvestmentDealWithoutTradeDeal_Maintenance_ContributorDetails_MaturityInput_609;
		}
		
		@FindBy(xpath = "//button[@id='btnContribDetSave_T022MT']")
		private WebElement IIS_InvestmentDealWithoutTradeDeal_ContributorDetails_Ok_609;
		public WebElement IIS_InvestmentDealWithoutTradeDeal_ContributorDetails_Ok_609(){
			return IIS_InvestmentDealWithoutTradeDeal_ContributorDetails_Ok_609;
		}
		
		@FindBy(xpath = "//button[@id='investmentDeals_Save_btn_T022MT']")
		private WebElement IIS_InvestmentDealWithoutTradeDeal_Save_609;
		public WebElement IIS_InvestmentDealWithoutTradeDeal_Save_609(){
			return IIS_InvestmentDealWithoutTradeDeal_Save_609;
		}
		
		@FindBy(xpath = "//button[@id='repayPlanBtn_T022MT']")
		private WebElement IIS_InvestmentDealWithoutTradeDeal_RepaymentPlan_609;
		public WebElement IIS_InvestmentDealWithoutTradeDeal_RepaymentPlan_609(){
			return IIS_InvestmentDealWithoutTradeDeal_RepaymentPlan_609;
		}
		
		@FindBy(xpath = "//select[@id='SettlementType_T022MT']")
		private WebElement IIS_InvestmentDealWithoutTradeDeal_RepaymentPlan_SettlementType_609;
		public WebElement IIS_InvestmentDealWithoutTradeDeal_RepaymentPlan_SettlementType_609(){
			return IIS_InvestmentDealWithoutTradeDeal_RepaymentPlan_SettlementType_609;
		}
		
		@FindBy(xpath = "//input[@id='include_vat_in_instl_yn_T022MT']")
		private WebElement IIS_InvestmentDealWithoutTradeDeal_RepaymentPlan_VAT_609;
		public WebElement IIS_InvestmentDealWithoutTradeDeal_RepaymentPlan_VAT_609(){
			return IIS_InvestmentDealWithoutTradeDeal_RepaymentPlan_VAT_609;
		}
		
		@FindBy(xpath = "//input[@id='No_Of_Payments_T022MT']")
		private WebElement IIS_InvestmentDealWithoutTradeDeal_RepaymentPlan_NumberofPayments_609;
		public WebElement IIS_InvestmentDealWithoutTradeDeal_RepaymentPlan_NumberofPayments_609(){
			return IIS_InvestmentDealWithoutTradeDeal_RepaymentPlan_NumberofPayments_609;
		}
		
		@FindBy(xpath = "//input[@id='paym_periodn_nbr_T022MT']")
		private WebElement IIS_InvestmentDealWithoutTradeDeal_RepaymentPlan_PayEvery_609;
		public WebElement IIS_InvestmentDealWithoutTradeDeal_RepaymentPlan_PayEvery_609(){
			return IIS_InvestmentDealWithoutTradeDeal_RepaymentPlan_PayEvery_609;
		}
		
		
		@FindBy(xpath = "//select[@id='paymPeriodicity_T022MT']")
		private WebElement IIS_InvestmentDealWithoutTradeDeal_RepaymentPlan_PayEveryTimePeriod_609;
		public WebElement IIS_InvestmentDealWithoutTradeDeal_RepaymentPlan_PayEveryTimePeriod_609(){
			return IIS_InvestmentDealWithoutTradeDeal_RepaymentPlan_PayEveryTimePeriod_609;
		}
		
		@FindBy(xpath = "//input[@id='rep_grace_period_option_T022MT']")
		private WebElement IIS_InvestmentDealWithoutTradeDeal_RepaymentPlan_Graceperiod_609;
		public WebElement IIS_InvestmentDealWithoutTradeDeal_RepaymentPlan_Graceperiod_609(){
			return IIS_InvestmentDealWithoutTradeDeal_RepaymentPlan_Graceperiod_609;
		}
		
		@FindBy(xpath = "//input[@id='grace_period_compounding_yn_T022MT']")
		private WebElement IIS_InvestmentDealWithoutTradeDeal_RepaymentPlan_CompoundingDuringGraceperiod_609;
		public WebElement IIS_InvestmentDealWithoutTradeDeal_RepaymentPlan_CompoundingDuringGraceperiod_609(){
			return IIS_InvestmentDealWithoutTradeDeal_RepaymentPlan_CompoundingDuringGraceperiod_609;
		}
		
		@FindBy(xpath = "total_amt_T022MT")
		private WebElement IIS_investment_deal_without_trade_deal_main_repayment_amt_field;
		public WebElement IISInvestmentDealWithoutTradeDealMainRepaymentAmtField_609(){
			return IIS_investment_deal_without_trade_deal_main_repayment_amt_field;
		}
		
		
		@FindBy(xpath = "//button[@id='createSchedule_T022MT']")
		private WebElement IIS_InvestmentDealWithoutTradeDeal_RepaymentPlan_CreateScheduleBtn_609;
		public WebElement IIS_InvestmentDealWithoutTradeDeal_RepaymentPlan_CreateScheduleBtn_609(){
			return IIS_InvestmentDealWithoutTradeDeal_RepaymentPlan_CreateScheduleBtn_609;
		}
		
		@FindBy(xpath = "//div[@id='gview_repaumentPlanScheduleGridTbl_Id_T022MT']")
		private WebElement IIS_InvestmentDealWithoutTradeDeal_RepaymentPlan_ScheduleTable_609;
		public WebElement IIS_InvestmentDealWithoutTradeDeal_RepaymentPlan_ScheduleTable_609(){
			return IIS_InvestmentDealWithoutTradeDeal_RepaymentPlan_ScheduleTable_609;
		}
		
		@FindBy(xpath = "//span[@id='ui-dialog-title-RepaymentPlanMaint_combained_Div_T022MT']/parent::div/a")
		private WebElement IIS_InvestmentDealWithoutTradeDeal_RepaymentPlan_CloseBtn_609;
		public WebElement IIS_InvestmentDealWithoutTradeDeal_RepaymentPlan_CloseBtn_609(){
			return IIS_InvestmentDealWithoutTradeDeal_RepaymentPlan_CloseBtn_609;
		}
		
		@FindBy(xpath = "//button[@id='investmentDeals_Validate_btn_T022MT']")
		private WebElement IIS_InvestmentDealWithoutTradeDeal_Validate_609;
		public WebElement IIS_InvestmentDealWithoutTradeDeal_Validate_609(){
			return IIS_InvestmentDealWithoutTradeDeal_Validate_609;
		}

		@FindBy(xpath = "//a[@id='T022P']/span[text()='Approve']")
		private WebElement IIS_InvestmentDealWithoutTradeDeal_Approve_609;
		public WebElement IIS_InvestmentDealWithoutTradeDeal_Approve_609(){
			return IIS_InvestmentDealWithoutTradeDeal_Approve_609;
		}
		
		@FindBy(xpath = "//input[@id='investmentDealsGridTbl_Id_T022P_gs_trsdealVO.SERIAL_NO']")
		private WebElement IIS_InvestmentDealWithoutTradeDeal_Approve_DealNo_609;
		public WebElement IIS_InvestmentDealWithoutTradeDeal_Approve_DealNo_609(){
			return IIS_InvestmentDealWithoutTradeDeal_Approve_DealNo_609;
		}
		
		@FindBy(xpath = "//td[@id='td_investmentDealsGridTbl_Id_T022P_1_trsdealVO.SERIAL_NO']")
		private WebElement IIS_investment_deal_without_trade_deal_approve_menu_searchgrid_row;
		public WebElement IISInvestmentDealWithoutTradeDealApproveMenuSearchgridRow_609(){
			return IIS_investment_deal_without_trade_deal_approve_menu_searchgrid_row;
		}
		
		@FindBy(xpath = "//input[@id='trsdealVO_SERIAL_NO_T022P']")
		private WebElement IIS_InvestmentDealWithoutTradeDeal_Approve_DealNoWait_609;
		public WebElement IIS_InvestmentDealWithoutTradeDeal_Approve_DealNoWait_609(){
			return IIS_InvestmentDealWithoutTradeDeal_Approve_DealNoWait_609;
		}
		
		@FindBy(xpath = "//button[@id='investmentDeals_Approve_btn_T022P']")
		private WebElement IIS_InvestmentDealWithoutTradeDeal_Approve_ApproveBtn_609;
		public WebElement IIS_InvestmentDealWithoutTradeDeal_Approve_ApproveBtn_609(){
			return IIS_InvestmentDealWithoutTradeDeal_Approve_ApproveBtn_609;
		}
		
//		@FindBy(xpath = "//input[@id='_popup_path_sol_confirm_ok']")
//		private WebElement IIS_confirm_popup_ok_btn;
//		public WebElement IIS_ConfirmPopupOkBtn_609(){
//			return IIS_confirm_popup_ok_btn;
//		}
		
		@FindBy(xpath = "//input[@id='_popup_path_sol_confirm']")
		private WebElement IIS_confirm_popup_cancel_btn;
		public WebElement IIS_ConfirmPopupCancelBtn_609(){
			return IIS_confirm_popup_cancel_btn;
		}
//		
//		@FindBy(xpath = "//input[@id='_popup_path_sol_confirm_ok']")
//		private WebElement IIS_warning_popup_ok_btn;
//		public WebElement IIS_WarningPopupOkBtn_609(){
//			return IIS_warning_popup_ok_btn;
//		}
		
//		@FindBy(xpath = "//input[@id='_popup_path_sol_ok']")
//		private WebElement IIS_success_popup_ok_btn;
//		public WebElement IIS_SuccessPopupOkBtn_609(){
//			return IIS_success_popup_ok_btn;
//		}
		
		@FindBy(xpath = "//div[contains(text(),'INFORMATION')]")
		private WebElement IIS_Information_PopUp_609;
		public WebElement IIS_Information_PopUp_609(){
			return IIS_Information_PopUp_609;
		}
		
		@FindBy(xpath = "//div[@class='jMsgbox-contentWrap'][contains(text(),'Deal No')]")
		private WebElement IIS_Information_PopUp_TextMsg_609;
		public WebElement IIS_Information_PopUp_TextMsg_609(){
			return IIS_Information_PopUp_TextMsg_609;
		}	
		
		@FindBy(xpath = "//input[@id='_popup_path_sol_ok']")
		private WebElement IIS_Ok_609;
		public WebElement IIS_Ok_609(){
			return IIS_Ok_609;
		}

		
		
		@FindBy(xpath = "//a[@id='infoBarSearchButton_T022MT']")
		private WebElement IIS_InvestmentDealWithoutTradeDeal_SearchBtn_609;
		public WebElement IIS_InvestmentDealWithoutTradeDeal_SearchBtn_609(){
			return IIS_InvestmentDealWithoutTradeDeal_SearchBtn_609;
		}
		
		@FindBy(xpath = "//input[@id='investmentDealsGridTbl_Id_T022MT_gs_trsdealVO.SERIAL_NO']")
		private WebElement IIS_InvestmentDealWithoutTradeDeal_Maintenance_DealNumber_609;
		public WebElement IIS_InvestmentDealWithoutTradeDeal_Maintenance_DealNumber_609(){
			return IIS_InvestmentDealWithoutTradeDeal_Maintenance_DealNumber_609;
		}
		
		
		@FindBy(xpath = "//span[text()='Status']")
		private WebElement IIS_InvestmentDealWithoutTradeDeal_Maintenance_StatusBtn_609;
		public WebElement IIS_InvestmentDealWithoutTradeDeal_Maintenance_StatusBtn_609(){
			return IIS_InvestmentDealWithoutTradeDeal_Maintenance_StatusBtn_609;
		}
		
		@FindBy(xpath = "//span[text()='Status List']")
		private WebElement IIS_InvestmentDealWithoutTradeDeal_Maintenance_StatusList_PopUp_609;
		public WebElement IIS_InvestmentDealWithoutTradeDeal_Maintenance_StatusList_PopUp_609(){
			return IIS_InvestmentDealWithoutTradeDeal_Maintenance_StatusList_PopUp_609;
		}
		
		@FindBy(xpath = "//table[@id='statusGridTbl_Id']/tbody/tr/td[text()='Approved']//parent::tr/td[@tdlabel='Server Date']")
		private WebElement IIS_InvestmentDealWithoutTradeDeal_Maintenance_StatusList_ServerDate_609;
		public WebElement IIS_InvestmentDealWithoutTradeDeal_Maintenance_StatusList_ServerDate_609(){
			return IIS_InvestmentDealWithoutTradeDeal_Maintenance_StatusList_ServerDate_609;
		}
		
		
		///*****Deal Charges*****///
		
		@FindBy(xpath = "//label[@id='investmentDealsFormId_T022MT_Deal_Charges_key']")
		private WebElement IIS_InvestmentDealWithoutTradeDeal_DealCharges_609;
		public WebElement IIS_InvestmentDealWithoutTradeDeal_DealCharges_609(){
			return IIS_InvestmentDealWithoutTradeDeal_DealCharges_609;
		}

		@FindBy(xpath = "//span[@id='ui-dialog-title-Deal_Charges_Div_T022MT']")
		private WebElement IIS_InvestmentDealWithoutTradeDeal_DealChargesPopUp_609;
		public WebElement IIS_InvestmentDealWithoutTradeDeal_DealChargesPopUp_609(){
			return IIS_InvestmentDealWithoutTradeDeal_DealChargesPopUp_609;
		}
		
		@FindBy(xpath = "//td[@id='add_dealChargesGridTbl_Id_T022MT']/div/span")
		private WebElement IIS_InvestmentDealWithoutTradeDeal_DealCharges_AddIcon_609;
		public WebElement IIS_InvestmentDealWithoutTradeDeal_DealCharges_AddIcon_609(){
			return IIS_InvestmentDealWithoutTradeDeal_DealCharges_AddIcon_609;
		}
		
//		@FindBy(xpath = "//table[@id='dealChargesGridTbl_Id_T022MT']/tbody/tr[2]/td[1]")
//		private WebElement IIS_InvestmentDealWithoutTradeDeal_DealCharges_Value1_609;
//		public WebElement IIS_InvestmentDealWithoutTradeDeal_DealCharges_Value1_609(){
//			return IIS_InvestmentDealWithoutTradeDeal_DealCharges_Value1_609;
//		}
//		
//		//input[@name='lookupTxt_CHARGES_CODE']//parent::div/span/span 
//		
		@FindBy(xpath = "//input[@name='lookupTxt_CHARGES_CODE']")
		private WebElement IIS_InvestmentDealWithoutTradeDeal_DealCharges_Code_609;
		public WebElement IIS_InvestmentDealWithoutTradeDeal_DealCharges_Code_609(){
			return IIS_InvestmentDealWithoutTradeDeal_DealCharges_Code_609;
		}
		
		
		@FindBy(xpath = "//td[@id='td_dealChargesGridTbl_Id_T022MT_1_CHARGES_AMOUNT']/div/input[@gridid='dealChargesGridTbl_Id_T022MT']")
		private WebElement IIS_InvestmentDealWithoutTradeDeal_DealCharges_DealCY_609;
		public WebElement IIS_InvestmentDealWithoutTradeDeal_DealCharges_DealCY_609(){
			return IIS_InvestmentDealWithoutTradeDeal_DealCharges_DealCY_609;
		}
		
		@FindBy(xpath = "//label[@id='dealChargesFormId_T022MT_OK_key']")
		private WebElement IIS_InvestmentDealWithoutTradeDeal_DealCharges_Ok_609;
		public WebElement IIS_InvestmentDealWithoutTradeDeal_DealCharges_Ok_609(){
			return IIS_InvestmentDealWithoutTradeDeal_DealCharges_Ok_609;
		}
		
	
		
///*************************************************** Settlement ***************************************************************************///
		@FindBy(xpath = "//td[text()='Settlement']")
		private WebElement IIS_Settlement_609;
		public WebElement IIS_Settlement_609(){
			return IIS_Settlement_609;
		}
		
		@FindBy(xpath = "//a[@id='T06MT']/span[text()='Maintenance']")
		private WebElement IIS_Settlement_Maintenance_609;
		public WebElement IIS_Settlement_Maintenance_609(){
			return IIS_Settlement_Maintenance_609;
		}
		
		@FindBy(xpath = "//span[@id='spanLookup_dealNo_T06MT']/span")
		private WebElement IIS_Settlement_Maintenance_DealNumberSearch_609;
		public WebElement IIS_Settlement_Maintenance_DealNumberSearch_609(){
			return IIS_Settlement_Maintenance_DealNumberSearch_609;
		}

		@FindBy(xpath = "//input[@id='gridtab_dealNo_T06MT_gs_trspayplanvo.TRX_NBR']")
		private WebElement IIS_Settlement_Maintenance_DealNumber_609;
		public WebElement IIS_Settlement_Maintenance_DealNumber_609(){
			return IIS_Settlement_Maintenance_DealNumber_609;
		}
		//table[@id='gridtab_dealNo_T06MT']/tbody/tr[2]/td[text()='5462']
		
		
		@FindBy(xpath = "//input[@id='crossCyPartyAmount_T06MT']")
		private WebElement IIS_Settlement_Maintenance_PartyAmount_609;
		public WebElement IIS_Settlement_Maintenance_PartyAmount_609(){
			return IIS_Settlement_Maintenance_PartyAmount_609;
		}
		
		@FindBy(xpath = "//label[@id='settlementDefFormId_T06MT_Automatic_allocation_key']")
		private WebElement IIS_Settlement_Maintenance_AutomaticAllocation_609;
		public WebElement IIS_Settlement_Maintenance_AutomaticAllocation_609(){
			return IIS_Settlement_Maintenance_AutomaticAllocation_609;
		}
		
		@FindBy(xpath = "//div[@id='gview_settlementScheduleGridTbl_Id_T06MT']//span[text()='Schedule Details']")
		private WebElement IIS_Settlement_Maintenance_ScheduleDetailsPopUp_609;
		public WebElement IIS_Settlement_Maintenance_ScheduleDetailsPopUp_609(){
			return IIS_Settlement_Maintenance_ScheduleDetailsPopUp_609;
		}
		
		@FindBy(xpath = "//button[@id='savebutton_T06MT']")
		private WebElement IIS_Settlement_Maintenance_SaveBtn_609;
		public WebElement IIS_Settlement_Maintenance_SaveBtn_609(){
			return IIS_Settlement_Maintenance_SaveBtn_609;
		}
//ok btn
		@FindBy(xpath = "//a[@id='T06P']/span[text()='Approve']")
		private WebElement IIS_Settlement_Approve_609;
		public WebElement IIS_Settlement_Approve_609(){
			return IIS_Settlement_Approve_609;
		}
		
		@FindBy(xpath = "//input[@id='settlementMgmtGridTbl_Id_T06P_gs_trssetlmtvo.DEAL_NBR']")
		private WebElement IIS_Settlement_Approve_DealNumber_609;
		public WebElement IIS_Settlement_Approve_DealNumber_609(){
			return IIS_Settlement_Approve_DealNumber_609;
		}
		//table[@id='settlementMgmtGridTbl_Id_T06P']/tbody/tr[2]/td[text()='000000005462']
		
		@FindBy(xpath = "//label[@id='settlementDefFormId_T06P_approve_key']")
		private WebElement IIS_Settlement_Approve_ApproveBtn_609;
		public WebElement IIS_Settlement_Approve_ApproveBtn_609(){
			return IIS_Settlement_Approve_ApproveBtn_609;
		}
		//confirm ok *3
		//ok btn
		
		@FindBy(xpath = "//a[@id='T06RR']/span[text()='Reverse']")
		private WebElement IIS_Settlement_Reverse_609;
		public WebElement IIS_Settlement_Reverse_609(){
			return IIS_Settlement_Reverse_609;
		}
		
		@FindBy(xpath = "//input[@id='settlementMgmtGridTbl_Id_T06RR_gs_trssetlmtvo.DEAL_NBR']")
		private WebElement IIS_Settlement_Reverse_DealNumber_609;
		public WebElement IIS_Settlement_Reverse_DealNumber_609(){
			return IIS_Settlement_Reverse_DealNumber_609;
		}
		//table[@id='settlementMgmtGridTbl_Id_T06RR']/tbody/tr/td[text()='000000005462']
		
		@FindBy(xpath = "//span[contains(text(),' Reverse ')]")
		private WebElement IIS_Settlement_Reverse_ReverseBtn_609;
		public WebElement IIS_Settlement_Reverse_ReverseBtn_609(){
			return IIS_Settlement_Reverse_ReverseBtn_609;
		}
		//confirm ok
		//ok
		
		
		@FindBy(xpath = "//a[@id='T06V']/span[text()='Approve Reversal']")
		private WebElement IIS_Settlement_ApproveReversal_609;
		public WebElement IIS_Settlement_ApproveReversal_609(){
			return IIS_Settlement_ApproveReversal_609;
		}
		
		@FindBy(xpath = "//input[@id='settlementMgmtGridTbl_Id_T06V_gs_trssetlmtvo.DEAL_NBR']")
		private WebElement IIS_Settlement_ApproveReversal_DealNumber_609;
		public WebElement IIS_Settlement_ApproveReversal_DealNumber_609(){
			return IIS_Settlement_ApproveReversal_DealNumber_609;
		}
		//table[@id='settlementMgmtGridTbl_Id_T06V']/tbody/tr/td[text()='000000005462']
		
		@FindBy(xpath = "//label[text()='Reverse ']")
		private WebElement IIS_Settlement_ApproveReversal_ReverseBtn_609;
		public WebElement IIS_Settlement_ApproveReversal_ReverseBtn_609(){
			return IIS_Settlement_ApproveReversal_ReverseBtn_609;
		}
		
		//confirm ok
		//ok
		
		

///*************************************************** Periodical Processing ****************************************************************///

		@FindBy(xpath = "//td[text()='Periodical Processing']")
		private WebElement IIS_PeriodicalProcessing_609;
		public WebElement IIS_PeriodicalProcessing_609(){
			return IIS_PeriodicalProcessing_609;
		}
		
		@FindBy(xpath = "//td[text()='Post Accruals']")
		private WebElement IIS_PeriodicalProcessing_PostAccruals_609;
		public WebElement IIS_PeriodicalProcessing_PostAccruals_609(){
			return IIS_PeriodicalProcessing_PostAccruals_609;
		}
		
		@FindBy(xpath = "//span[text()='Final Accruals']")
		private WebElement IIS_PeriodicalProcessing_PostAccruals_FinalAccruals_609;
		public WebElement IIS_PeriodicalProcessing_PostAccruals_FinalAccruals_609(){
			return IIS_PeriodicalProcessing_PostAccruals_FinalAccruals_609;
		}
		
		@FindBy(xpath = "//input[@id='Specific_deal_T10EMF']")
		private WebElement IIS_PeriodicalProcessing_PostAccruals_FinalAccruals_SpecificDealFlag_609;
		public WebElement IIS_PeriodicalProcessing_PostAccruals_FinalAccruals_SpecificDealFlag_609(){
			return IIS_PeriodicalProcessing_PostAccruals_FinalAccruals_SpecificDealFlag_609;
		}
		
		@FindBy(xpath = "//span[@id='spanLookup_postChargeAccuralProcessSpecificDeal_T10EMF']/span")
		private WebElement IIS_PeriodicalProcessing_PostAccruals_FinalAccruals_SpecificDealSearch_609;
		public WebElement IIS_PeriodicalProcessing_PostAccruals_FinalAccruals_SpecificDealSearch_609(){
			return IIS_PeriodicalProcessing_PostAccruals_FinalAccruals_SpecificDealSearch_609;
		}
		
		@FindBy(xpath = "//input[@id='gridtab_postChargeAccuralProcessSpecificDeal_T10EMF_gs_trsdealVO.SERIAL_NO']")
		private WebElement IIS_PeriodicalProcessing_PostAccruals_FinalAccruals_SpecificDeal_609;
		public WebElement IIS_PeriodicalProcessing_PostAccruals_FinalAccruals_SpecificDeal_609(){
			return IIS_PeriodicalProcessing_PostAccruals_FinalAccruals_SpecificDeal_609;
		}
		//table[@id='gridtab_postChargeAccuralProcessSpecificDeal_T10EMF']/tbody/tr[2]//td[text()='5464']
		
		@FindBy(xpath = "//input[@id='fromDate_T10EMF']")
		private WebElement IIS_PeriodicalProcessing_PostAccruals_FinalAccruals_FromDate_609;
		public WebElement IIS_PeriodicalProcessing_PostAccruals_FinalAccruals_FromDate_609(){
			return IIS_PeriodicalProcessing_PostAccruals_FinalAccruals_FromDate_609;
		}
		
		@FindBy(xpath = "//input[@id='toDate_T10EMF']")
		private WebElement IIS_PeriodicalProcessing_PostAccruals_FinalAccruals_ToDate_609;
		public WebElement IIS_PeriodicalProcessing_PostAccruals_FinalAccruals_ToDate_609(){
			return IIS_PeriodicalProcessing_PostAccruals_FinalAccruals_ToDate_609;
		}
		
		@FindBy(xpath = "//button[@id='postChargeAccrualProcess_trialRun_T10EMF']")
		private WebElement IIS_PeriodicalProcessing_PostAccruals_FinalAccruals_OkBtn_609;
		public WebElement IIS_PeriodicalProcessing_PostAccruals_FinalAccruals_OkBtn_609(){
			return IIS_PeriodicalProcessing_PostAccruals_FinalAccruals_OkBtn_609;
		}
		//ok 
		
		
///********************************************* Tracking & Incidental Charges **********************************************************************///
		
		@FindBy(xpath = "//td[text()='Tracking & Incidental Charges']")
		private WebElement IIS_TrackingandIncidentalCharges_609;
		public WebElement IIS_TrackingandIncidentalCharges_609(){
			return IIS_TrackingandIncidentalCharges_609;
		}
		
		@FindBy(xpath = "//a[@id='T07MT']/span[text()='Maintenance']")
		private WebElement IIS_TrackingandIncidentalCharges_Maintenance_609;
		public WebElement IIS_TrackingandIncidentalCharges_Maintenance_609(){
			return IIS_TrackingandIncidentalCharges_Maintenance_609;
		}
			
		@FindBy(xpath = "//span[@id='spanLookup_trs_deal_serial_no_T07MT']/span")
		private WebElement IIS_TrackingandIncidentalCharges_Maintenance_DealNoSearch_609;
		public WebElement IIS_TrackingandIncidentalCharges_Maintenance_DealNoSearch_609(){
			return IIS_TrackingandIncidentalCharges_Maintenance_DealNoSearch_609;
		}
		
		@FindBy(xpath = "//input[@id='gridtab_trs_deal_serial_no_T07MT_gs_trspayplanvo.TRX_NBR']")
		private WebElement IIS_TrackingandIncidentalCharges_Maintenance_DealNo_609;
		public WebElement IIS_TrackingandIncidentalCharges_Maintenance_DealNo_609(){
			return IIS_TrackingandIncidentalCharges_Maintenance_DealNo_609;
		}
		
		@FindBy(xpath = "//span[@id='spanLookup_charges_code_T07MT']/span")
		private WebElement IIS_TrackingandIncidentalCharges_Maintenance_ChargeCodeSearch_609;
		public WebElement IIS_TrackingandIncidentalCharges_Maintenance_ChargeCodeSearch_609(){
			return IIS_TrackingandIncidentalCharges_Maintenance_ChargeCodeSearch_609;
		}
		
		@FindBy(xpath = "//input[@id='gridtab_charges_code_T07MT_gs_CODE']")
		private WebElement IIS_TrackingandIncidentalCharges_Maintenance_ChargeCode_609;
		public WebElement IIS_TrackingandIncidentalCharges_Maintenance_ChargeCode_609(){
			return IIS_TrackingandIncidentalCharges_Maintenance_ChargeCode_609;
		}
		
		@FindBy(xpath = "//select[@id='trstrackdetVO_CHARGE_ALLOCATION_CRITERIA_T07MT']")
		private WebElement IIS_TrackingandIncidentalCharges_Maintenance_ChargeAllocationCriteria_609;
		public WebElement IIS_TrackingandIncidentalCharges_Maintenance_ChargeAllocationCriteria_609(){
			return IIS_TrackingandIncidentalCharges_Maintenance_ChargeAllocationCriteria_609;
		}
		
		@FindBy(xpath = "//button[@id='incidentalcharges_save_T07MT']/span[contains(text(),' Save ')]")
		private WebElement IIS_TrackingandIncidentalCharges_Maintenance_Save_609;
		public WebElement IIS_TrackingandIncidentalCharges_Maintenance_Save_609(){
			return IIS_TrackingandIncidentalCharges_Maintenance_Save_609;
		}
		
		
		@FindBy(xpath = "//a[@id='T07P']/span[text()='Approve']")
		private WebElement IIS_TrackingandIncidentalCharges_Approve_609;
		public WebElement IIS_TrackingandIncidentalCharges_Approve_609(){
			return IIS_TrackingandIncidentalCharges_Approve_609;
		}
		
		
		@FindBy(xpath = "//input[@id='IncidentalChargesGridTbl_Id_T07P_gs_trstrackVO.TRS_DEAL_SERIAL_NO']")
		private WebElement IIS_TrackingandIncidentalCharges_Approve_DealNo_609;
		public WebElement IIS_TrackingandIncidentalCharges_Approve_DealNo_609(){
			return IIS_TrackingandIncidentalCharges_Approve_DealNo_609;
		}
		
		@FindBy(xpath = "//div[@id='incidentalchargesMainTabToolBar_T07P']/a/span[contains(text(),' Approve ')]")
		private WebElement IIS_TrackingandIncidentalCharges_Approve_DealNo_ApproveBtn_609;
		public WebElement IIS_TrackingandIncidentalCharges_Approve_DealNo_ApproveBtn_609(){
			return IIS_TrackingandIncidentalCharges_Approve_DealNo_ApproveBtn_609;
		}
		
		
		
///********************************************* Repayment Plan **********************************************************************///
	
	@FindBy(xpath = "//td[text()='Repayment Plan']")
	private WebElement IIS_RepaymentPlan_609;
	public WebElement IIS_RepaymentPlan_609(){
		return IIS_RepaymentPlan_609;
	}
	
	@FindBy(xpath = "//a[@id='T04MT']/span[text()='Maintenance']")
	private WebElement IIS_RepaymentPlan_Maintenance_609;
	public WebElement IIS_RepaymentPlan_Maintenance_609(){
		return IIS_RepaymentPlan_Maintenance_609;
	}
	
	@FindBy(xpath = "//a[@id='infoBarSearchButton_T04MT']")
	private WebElement IIS_RepaymentPlan_Maintenance_SearchBtn_609;
	public WebElement IIS_RepaymentPlan_Maintenance_SearchBtn_609(){
		return IIS_RepaymentPlan_Maintenance_SearchBtn_609;
	}

	@FindBy(xpath = "//input[@id='repaymentPlanMgmtGridTbl_Id_T04MT_gs_trspayplanVO.TRX_NBR']")
	private WebElement IIS_RepaymentPlan_Maintenance_DealNo_609;
	public WebElement IIS_RepaymentPlan_Maintenance_DealNo_609(){
		return IIS_RepaymentPlan_Maintenance_DealNo_609;
	}
	
	
	@FindBy(xpath = "//span[text()='Schedule Details']")
	private WebElement IIS_RepaymentPlan_Maintenance_ScheduleDetails_609;
	public WebElement IIS_RepaymentPlan_Maintenance_ScheduleDetails_609(){
		return IIS_RepaymentPlan_Maintenance_ScheduleDetails_609;
	}
	
	@FindBy(xpath = "(//table[@id='repaumentPlanScheduleGridTbl_Id_T04MT']/tbody/tr/td[@tdlabel='Incidental Charge']/a)[1]")
	private WebElement IIS_RepaymentPlan_Maintenance_ScheduleDetails_IncidentalCharge_609;
	public WebElement IIS_RepaymentPlan_Maintenance_ScheduleDetails_IncidentalCharge_609(){
		return IIS_RepaymentPlan_Maintenance_ScheduleDetails_IncidentalCharge_609;
	}            
	
	@FindBy(xpath = "//span[text()='Incidental Charge']")
	private WebElement IIS_RepaymentPlan_IncidentalCharge_PopUp_609;
	public WebElement IIS_RepaymentPlan_IncidentalCharge_PopUp_609(){
		return IIS_RepaymentPlan_IncidentalCharge_PopUp_609;
	}
	
	@FindBy(xpath = "(//table[@id='incidentalChargesPopupGrid_Id_T04MT']/tbody/tr/td[@tdlabel='Charge Name'])[1]")
	private WebElement IIS_RepaymentPlan_IncidentalCharge_PopUp_ChargeName_609;
	public WebElement IIS_RepaymentPlan_IncidentalCharge_PopUp_ChargeName_609(){
		return IIS_RepaymentPlan_IncidentalCharge_PopUp_ChargeName_609;
	}
	
	@FindBy(xpath = "(//table[@id='incidentalChargesPopupGrid_Id_T04MT']/tbody/tr/td[@tdlabel='Amount'])[1]")
	private WebElement IIS_RepaymentPlan_IncidentalCharge_PopUp_Amount_609;
	public WebElement IIS_RepaymentPlan_IncidentalCharge_PopUp_Amount_609(){
		return IIS_RepaymentPlan_IncidentalCharge_PopUp_Amount_609;
	}
	
	@FindBy(xpath = "//*[@id=\"td_incidentalChargesPopupGrid_Id_T04MT_0_chargeName\"]//parent::tr/td[@tdlabel='Amount']")
	private WebElement IIS_RepaymentPlan_IncidentalCharge_PopUp_Total_609;
	public WebElement IIS_RepaymentPlan_IncidentalCharge_PopUp_Total_609(){
		return IIS_RepaymentPlan_IncidentalCharge_PopUp_Total_609;
	}
	
//	MTS - Parameters
	@FindBy(xpath = "//td[text()='Parameters']")
	private WebElement MTS_parameter_module;
	public WebElement MTSParameterModule_608() {
		return MTS_parameter_module;
	}
	
	@FindBy(xpath = "//td[text()='Batch']")
	private WebElement MTS_parameter_batch;
	public WebElement MTSParameterBatch_608() {
		return MTS_parameter_batch;
	}
	
	@FindBy(xpath = "//a[@id='P0003MT']")
	private WebElement MTS_parameter_batch_maintenance;
	public WebElement MTSParameterBatchMaintenance_608() {
		return MTS_parameter_batch_maintenance;
	}
	
	@FindBy(xpath = "//input[@id='additionalReference_P0003MT']")
	private WebElement MTS_param_batch_maintenance_additional_ref_nbr;
	public WebElement MTSParamBatchMaintenanceAdditionalRefNbr_608() {
		return MTS_param_batch_maintenance_additional_ref_nbr;
	}
	
	@FindBy(xpath = "//input[@id='briefName_P0003MT']")
	private WebElement MTS_param_batch_maintenance_brief_name;
	public WebElement MTSParamBatchMaintenanceBriefName_608() {
		return MTS_param_batch_maintenance_brief_name;
	}
	
	@FindBy(xpath = "//input[@id='LongName_P0003MT']")
	private WebElement MTS_param_batch_maintenance_long_name;
	public WebElement MTSParamBatchMaintenanceLongName_608() {
		return MTS_param_batch_maintenance_long_name;
	}
	
	@FindBy(xpath = "//input[@id='menuReference_P0003MT']")
	private WebElement MTS_param_batch_maintenance_menu_ref_nbr;
	public WebElement MTSParamBatchMaintenanceMenuRefNbr_608() {
		return MTS_param_batch_maintenance_menu_ref_nbr;
	}
	
	@FindBy(xpath = "//select[@id='batchPeriodicity_P0003MT']")
	private WebElement MTS_param_batch_maintenance_periodicity_dropdown;
	public WebElement MTSParamBatchMaintenancePeriodicityDropdown_608() {
		return MTS_param_batch_maintenance_periodicity_dropdown;
	}
		
	@FindBy(xpath = "//a[contains(text(),'Oracle BAJ')]/preceding-sibling::ins")
	private WebElement MTS_param_batch_main_batch_details_oracle_baj;
	public WebElement MTSParamBatchMainBatchDetailsTabOracleBAJ_608() {
		return MTS_param_batch_main_batch_details_oracle_baj;
	}
	
	@FindBy(xpath = "(//a[contains(text(),'Head Office')]/ins)[1]")
	private WebElement MTS_param_batch_main_batch_details_oracle_baj_head_office;
	public WebElement MTSParamBatchMainBatchDetailsTabOracleBAJHeadOffice_608() {
		return MTS_param_batch_main_batch_details_oracle_baj_head_office;
	}
	
	@FindBy(xpath = "(//a[contains(text(),'Treasury-Invest')]/ins)[1]")
	private WebElement MTS_param_batch_main_batch_details_oracle_baj_ICD_treasury;
	public WebElement MTSParamBatchMainBatchDetailsTabOracleBAJICDTreasury_608() {
		return MTS_param_batch_main_batch_details_oracle_baj_ICD_treasury;
	}
	
	@FindBy(xpath = "//li[@nodecode='Financing And Treasury']/ins")
	private WebElement MTS_param_batch_main_process_financing_treasury;
	public WebElement MTSParamBatchMainProcessFinancingTreasury_608() {
		return MTS_param_batch_main_process_financing_treasury;
	}
	
	@FindBy(xpath = "(//li[@nodecode='16']/a/ins)[1]")
	private WebElement MTS_param_batch_main_process_financing_treasury_create_settlement;
	public WebElement MTSParamBatchMainProcessFinancingTreasuryCreateSettlement_608() {
		return MTS_param_batch_main_process_financing_treasury_create_settlement;
	}
	
	@FindBy(xpath = "(//li[@nodecode='17']/a/ins)[1]")
	private WebElement MTS_param_batch_main_process_financing_treasury_approve_settlement;
	public WebElement MTSParamBatchMainProcessFinancingTreasuryApproveSettlement_608() {
		return MTS_param_batch_main_process_financing_treasury_approve_settlement;
	}
	
	@FindBy(xpath = "(//li[@nodecode='28']/a/ins)[1]")
	private WebElement MTS_param_batch_main_process_financing_treasury_profit_accrual_process;
	public WebElement MTSParamBatchMainProcessFinancingTreasuryProfitAccrualProcess_608() {
		return MTS_param_batch_main_process_financing_treasury_profit_accrual_process;
	}
	
	@FindBy(xpath = "//li[@id='batchControlTabs_P0003MT']")
	private WebElement MTS_param_batch_main_batch_control_tab;
	public WebElement MTSParamBatchMainBatchControlTab_608() {
		return MTS_param_batch_main_batch_control_tab;
	}
	
	@FindBy(xpath = "//select[@id='processBatch2_P0003MT']")
	private WebElement MTS_param_batch_main_batch_control_tab_process_batch_dropdown;
	public WebElement MTSParamBatchMainBatchControlTabProcessBatchDropdown_608() {
		return MTS_param_batch_main_batch_control_tab_process_batch_dropdown;
	}
	
	@FindBy(xpath = "//select[@id='processBatchOpenedBranch_P0003MT']")
	private WebElement MTS_param_batch_main_batch_control_tab_opened_branch_dropdown;
	public WebElement MTSParamBatchMainBatchControlTabOpenedBranchDropdown_608() {
		return MTS_param_batch_main_batch_control_tab_opened_branch_dropdown;
	}
	
	@FindBy(xpath = "//button[@id='batchMaintForm_Save_Btn_P0003MT']")
	private WebElement MTS_param_batch_maintenance_save_btn;
	public WebElement MTSParamBatchMaintenanceSaveBtn_608() {
		return MTS_param_batch_maintenance_save_btn;
	}
	
	@FindBy(xpath = "//a[@id='P0003AP']")
	private WebElement MTS_param_batch_approve_menu;
	public WebElement MTSParamBatchApproveMenu_608() {
		return MTS_param_batch_approve_menu;
	}
	
	@FindBy(xpath = "//input[contains(@id,'ADDITIONAL_REFERENCE')]")
	private WebElement MTS_param_batch_approve_menu_searchgrid_additional_ref_input;
	public WebElement MTSParamBatchApproveMenuSearchgridAdditionalRefInput_608() {
		return MTS_param_batch_approve_menu_searchgrid_additional_ref_input;
	}
	
	@FindBy(xpath = "//td[@id='td_batchGridTbl_Id_P0003AP_1_eodBatchMasterVO.BATCH_CODE']")
	private WebElement MTS_param_batch_approve_menu_searchgrid_row;
	public WebElement MTSParamBatchApproveMenuSearchgridRow_608() {
		return MTS_param_batch_approve_menu_searchgrid_row;
	}
	
	@FindBy(xpath = "//input[@id='additionalReference_P0003AP']")
	private WebElement MTS_param_batch_approve_menu_additional_ref;
	public WebElement MTSParamBatchApproveMenuAdditionalRef_608() {
		return MTS_param_batch_approve_menu_additional_ref;
	}
	
	@FindBy(xpath = "//button[@id='batchMaintForm_Approve_Btn_P0003AP']")
	private WebElement MTS_param_batch_approve_menu_approve_btn;
	public WebElement MTSParamBatchApproveMenuApproveBtn_608() {
		return MTS_param_batch_approve_menu_approve_btn;
	}
	
//	MTS - Process
	@FindBy(xpath = "//td[text()='Process']")
	private WebElement MTS_Process_609;
	public WebElement MTS_Process_609() {
		return MTS_Process_609;
	}
	
	@FindBy(xpath = "//td[text()='Batch Process']")
	private WebElement MTS_Process_BatchProcess_609;
	public WebElement MTS_Process_BatchProcess_609() {
		return MTS_Process_BatchProcess_609;
	}	
		
	@FindBy(xpath = "//span[text()='Batch Run']")
	private WebElement MTS_Process_BatchProcess_BatchRun_609;
	public WebElement MTS_Process_BatchProcess_BatchRun_609() {
		return MTS_Process_BatchProcess_BatchRun_609;
	}
		
	@FindBy(xpath = "//input[contains(@id,'runningDate')]")
	private WebElement MTS_Process_BatchProcess_BatchRun_Date_609;
	public WebElement MTS_Process_BatchProcess_BatchRun_Date_609() {
		return MTS_Process_BatchProcess_BatchRun_Date_609;
	}
	
	@FindBy(xpath = "//button[contains(@id,'batchRun_Btn_Run')]")
	private WebElement MTS_Process_BatchProcess_BatchRun_RunBtn_609;
	public WebElement MTS_Process_BatchProcess_BatchRun_RunBtn_609() {
		return MTS_Process_BatchProcess_BatchRun_RunBtn_609;
	}
	
	@FindBy(xpath = "//input[@id='_popup_path_sol_confirm_ok']")
	private WebElement IIS_warning_popup_ok_btn;
	public WebElement IIS_WarningPopupOkBtn_608(){
		return IIS_warning_popup_ok_btn;
	}
	
	@FindBy(xpath = "//input[@id='_popup_path_sol_ok']")
	private WebElement IIS_information_popup_ok_btn;
	public WebElement IIS_InformationPopupOkBtn_608(){
		return IIS_information_popup_ok_btn;
	}

	///********************************** Account Restriction *****************************************///
	//****Account Restrictions ****//
	
	@FindBy(xpath = "//td[text()='Parameters']")
	private WebElement Sads_Parameters_609;
	public WebElement Sads_Parameters_609(){
		return Sads_Parameters_609;
	}
	
	@FindBy(xpath = "//td[text()='Account Restrictions']")
	private WebElement Sads_Parameters_AccountRestrictions_609;
	public WebElement Sads_Parameters_AccountRestrictions_609(){
		return Sads_Parameters_AccountRestrictions_609;
	}
	
	@FindBy(xpath = "//a[@id='UR00M']/span[text()='	Maintenance']")
	private WebElement Sads_Parameters_AccountRestrictions_Maintenance_609;
	public WebElement Sads_Parameters_AccountRestrictions_Maintenance_609(){
		return Sads_Parameters_AccountRestrictions_Maintenance_609;
	}
	
	@FindBy(xpath = "//input[@id='code_UR00M']")
	private WebElement Sads_Parameters_AccountRestrictions_Maintenance_Code_609;
	public WebElement Sads_Parameters_AccountRestrictions_Maintenance_Code_609(){
		return Sads_Parameters_AccountRestrictions_Maintenance_Code_609;
	}
	
	@FindBy(xpath = "//input[@id='description_UR00M']")
	private WebElement Sads_Parameters_AccountRestrictions_Maintenance_Description_609;
	public WebElement Sads_Parameters_AccountRestrictions_Maintenance_Description_609(){
		return Sads_Parameters_AccountRestrictions_Maintenance_Description_609;
	}
	
	@FindBy(xpath = "//td[@id='td_ctsRestOptTreeGridTbl_Id_UR00M_1_progDesc']")
	private WebElement Sads_Parameters_AccountRestrictions_Maintenance_ApplicationOPT_609;
	public WebElement Sads_Parameters_AccountRestrictions_Maintenance_ApplicationOPT_609(){
		return Sads_Parameters_AccountRestrictions_Maintenance_ApplicationOPT_609;
	}
	
	@FindBy(xpath = "//input[@id='ROOT__ROOT_hasRestrictionYN_ctsRestOptTreeGridTbl_Id_UR00M']")
	private WebElement Sads_Parameters_AccountRestrictions_Maintenance_ApplicationOPT_Root_609;
	public WebElement Sads_Parameters_AccountRestrictions_Maintenance_ApplicationOPT_Root_609(){
		return Sads_Parameters_AccountRestrictions_Maintenance_ApplicationOPT_Root_609;
	}
	
	@FindBy(xpath = "//td[@id='td_ctsRestBranchesTreeGridTbl_Id_UR00M_1_progDesc']")
	private WebElement Sads_Parameters_AccountRestrictions_Maintenance_Companies_609;
	public WebElement Sads_Parameters_AccountRestrictions_Maintenance_Companies_609(){
		return Sads_Parameters_AccountRestrictions_Maintenance_Companies_609;
	}
	
	
	@FindBy(xpath = "ROOT__ROOT__branchGrid_hasRestrictionYN_ctsRestBranchesTreeGridTbl_Id_UR00M")
	private WebElement Sads_Parameters_AccountRestrictions_Maintenance_Companies_Root_609;
	public WebElement Sads_Parameters_AccountRestrictions_Maintenance_Companies_Root_609(){
		return Sads_Parameters_AccountRestrictions_Maintenance_Companies_Root_609;
	}
	
	@FindBy(xpath = "//input[@id='userGridId_UR00M_gs_usrVO.USER_ID']")
	private WebElement Sads_Parameters_AccountRestrictions_Maintenance_Userid_609;
	public WebElement Sads_Parameters_AccountRestrictions_Maintenance_Userid_609(){
		return Sads_Parameters_AccountRestrictions_Maintenance_Userid_609;
	}
	//table[@id='userGridId_UR00M']/tbody/tr[2]/td[1]
	
	@FindBy(xpath = "//td[@id='add_restrictionsGridTbl_Id_UR00M']")
	private WebElement Sads_Parameters_AccountRestrictions_Maintenance_AddIcon_609;
	public WebElement Sads_Parameters_AccountRestrictions_Maintenance_AddIcon_609(){
		return Sads_Parameters_AccountRestrictions_Maintenance_AddIcon_609;
	}
	
	@FindBy(xpath = "(//select[@gridid='restrictionsGridTbl_Id_UR00M'])[1]")
	private WebElement Sads_Parameters_AccountRestrictions_Maintenance_RestrictionType_609;
	public WebElement Sads_Parameters_AccountRestrictions_Maintenance_RestrictionType_609(){
		return Sads_Parameters_AccountRestrictions_Maintenance_RestrictionType_609;
	}
	
	@FindBy(xpath = "//span[@id='spanLookup_glCode_no_UR00M']")
	private WebElement Sads_Parameters_AccountRestrictions_Maintenance_GLSearch_609;
	public WebElement Sads_Parameters_AccountRestrictions_Maintenance_GLSearch_609(){
		return Sads_Parameters_AccountRestrictions_Maintenance_GLSearch_609;
	}
	//table[@id='gridtab_glCode_no_UR00M']//tr[2]/td[1]
	
	@FindBy(xpath = "//label[@id='ctsRestrictionsFormId_UR00M_Save_key']")
	private WebElement Sads_Parameters_AccountRestrictions_Maintenance_Save_609;
	public WebElement Sads_Parameters_AccountRestrictions_Maintenance_Save_609(){
		return Sads_Parameters_AccountRestrictions_Maintenance_Save_609;
	}
	
	//ok
	
	@FindBy(xpath = "//a[@id='UR00P']/span[text()='Approve']")
	private WebElement Sads_Parameters_AccountRestrictions_Approve_609;
	public WebElement Sads_Parameters_AccountRestrictions_Approve_609(){
		return Sads_Parameters_AccountRestrictions_Approve_609;
	}
	
	@FindBy(xpath = "//input[@id='ctsRestrictionsListGridTbl_Id_UR00P_gs_code']")
	private WebElement Sads_Parameters_AccountRestrictions_Approve_Code_609;
	public WebElement Sads_Parameters_AccountRestrictions_Approve_Code_609(){
		return Sads_Parameters_AccountRestrictions_Approve_Code_609;
	}
	//table[@id='ctsRestrictionsListGridTbl_Id_UR00P']//tr/td[text()='1254']
	
	@FindBy(xpath = "//label[@id='ctsRestrictionsFormId_UR00P_Approve_key']")
	private WebElement Sads_Parameters_AccountRestrictions_Approve_ApproveBtn_609;
	public WebElement Sads_Parameters_AccountRestrictions_Approve_ApproveBtn_609(){
		return Sads_Parameters_AccountRestrictions_Approve_ApproveBtn_609;
	}
	
	//ok
	
	
	//****Control Record****//
	
	@FindBy(xpath = "//td[text()='Control Record']")
	private WebElement Sads_Parameters_ControlRecord_609;
	public WebElement Sads_Parameters_ControlRecord_609(){
		return Sads_Parameters_ControlRecord_609;
	}
	
	@FindBy(xpath = "//a[@id='C001MT']/span[text()='Maintenance']")
	private WebElement Sads_Parameters_ControlRecord_Maintenance_609;
	public WebElement Sads_Parameters_ControlRecord_Maintenance_609(){
		return Sads_Parameters_ControlRecord_Maintenance_609;
	}
	
	@FindBy(xpath = "//input[@id='ctrlCO_smartFieldMand_C001MT']")
	private WebElement Sads_Parameters_ControlRecord_Maintenance_SMARTAccessPrivileges_609;
	public WebElement Sads_Parameters_ControlRecord_Maintenance_SMARTAccessPrivileges_609(){
		return Sads_Parameters_ControlRecord_Maintenance_SMARTAccessPrivileges_609;
	}
	
	@FindBy(xpath = "//button[@id='saveRecord_C001MT']/span")
	private WebElement Sads_Parameters_ControlRecord_Maintenance_Save_609;
	public WebElement Sads_Parameters_ControlRecord_Maintenance_Save_609(){
		return Sads_Parameters_ControlRecord_Maintenance_Save_609;
	}
	
	//ok button --->_popup_path_sol_ok
	
	
	//****Application****//
	
		@FindBy(xpath = "//td[text()='Application']")
		private WebElement Sads_Parameters_Application_609;
		public WebElement Sads_Parameters_Application_609(){
			return Sads_Parameters_Application_609;
		}
	
		@FindBy(xpath = "//a[@id='P006M']/span[text()='Maintenance']")
		private WebElement Sads_Parameters_Application_Maintenance_609;
		public WebElement Sads_Parameters_Application_Maintenance_609(){
			return Sads_Parameters_Application_Maintenance_609;
		}
		
		@FindBy(xpath = "//a[@id='infoBarSearchButton_P006M']")
		private WebElement Sads_Parameters_Application_Maintenance_SearchBtn_609;
		public WebElement Sads_Parameters_Application_Maintenance_SearchBtn_609(){
			return Sads_Parameters_Application_Maintenance_SearchBtn_609;
		}
		
		@FindBy(xpath = "//input[@id='applicationListGridTbl_Id_P006M_gs_s_appVO.APP_NAME']")
		private WebElement Sads_Parameters_Application_Maintenance_Application_609;
		public WebElement Sads_Parameters_Application_Maintenance_Application_609(){
			return Sads_Parameters_Application_Maintenance_Application_609;
		}
		//table[@id='applicationListGridTbl_Id_P006M']/tbody/tr/td[text()='ACC']
		
		@FindBy(xpath = "//input[@id='optListGridTbl_Id_P006M_gs_optVO.PROG_REF']")
		private WebElement Sads_Parameters_Application_Maintenance_Category_609;
		public WebElement Sads_Parameters_Application_Maintenance_Category_609(){
			return Sads_Parameters_Application_Maintenance_Category_609;
		}
	//	(//table[@id='optListGridTbl_Id_P006M']/tbody/tr/td[text()='C001B'])[1]
				
		@FindBy(xpath = "(//input[@gridid='optListGridTbl_Id_P006M'])[5]")
		private WebElement Sads_Parameters_Application_Maintenance_EnableSmart_609;
		public WebElement Sads_Parameters_Application_Maintenance_EnableSmart_609(){
			return Sads_Parameters_Application_Maintenance_EnableSmart_609;
		}
		
		@FindBy(xpath = "//label[@id='applicationMaintFormId_P006M_Save_key']")
		private WebElement Sads_Parameters_Application_Maintenance_Save_609;
		public WebElement Sads_Parameters_Application_Maintenance_Save_609(){
			return Sads_Parameters_Application_Maintenance_Save_609;
		}
		
	//****SMART****//
	
	@FindBy(xpath = "//td[text()='SMART']")
	private WebElement Sads_Parameters_SMART_609;
	public WebElement Sads_Parameters_SMART_609(){
		return Sads_Parameters_SMART_609;
	}
	
	@FindBy(xpath = "//td[text()='SMART OPTIONS']")
	private WebElement Sads_Parameters_SMART_SMARTOPTIONS_609;
	public WebElement Sads_Parameters_SMART_SMARTOPTIONS_609(){
		return Sads_Parameters_SMART_SMARTOPTIONS_609;
	}
	
	@FindBy(xpath = "//a[@id='M00130M']/span[text()='Maintenance']")
	private WebElement Sads_Parameters_SMART_SMARTOPTIONS_609_Maintenance_609;
	public WebElement Sads_Parameters_SMART_SMARTOPTIONS_609_Maintenance_609(){
		return Sads_Parameters_SMART_SMARTOPTIONS_609_Maintenance_609;
	}
	
	@FindBy(xpath = "//td[text()='SMART OPTIONS TYPES']")
	private WebElement Sads_SMART_SMARTOPTIONSTYPES_609;
	public WebElement Sads_SMART_SMARTOPTIONSTYPES_609(){
		return Sads_SMART_SMARTOPTIONSTYPES_609;
	}
	
	@FindBy(xpath = "//div[@id='_selenuimM00131M']//td[text()='Maintenance']")
	private WebElement Sads_SMART_SMARTOPTIONSTYPES_Maintenance_609;
	public WebElement Sads_SMART_SMARTOPTIONSTYPES_Maintenance_609(){
		return Sads_SMART_SMARTOPTIONSTYPES_Maintenance_609;
	}
	
	///****************************************** Advance Principal Settlement **************************************************************///
	
	@FindBy(xpath = "//td[contains(text(),'Advance Principal Settlement')]")
	private WebElement IIS_AdvancePrincipalSettlement_609;
	public WebElement IIS_AdvancePrincipalSettlement_609() {
		return IIS_AdvancePrincipalSettlement_609;
	}
	
	@FindBy(xpath = "//a[@id='T036MT']/span[text()='Maintenance']")
	private WebElement IIS_AdvancePrincipalSettlement_Maintenance_609;
	public WebElement IIS_AdvancePrincipalSettlement_Maintenance_609() {
		return IIS_AdvancePrincipalSettlement_Maintenance_609;
	}

	
	@FindBy(xpath = "//span[@id='spanLookup_dealNo_T036MT']/span")
	private WebElement IIS_AdvancePrincipalSettlement_Maintenance_DealNoSearch_609;
	public WebElement IIS_AdvancePrincipalSettlement_Maintenance_DealNoSearch_609() {
		return IIS_AdvancePrincipalSettlement_Maintenance_DealNoSearch_609;
	}
	
	@FindBy(xpath = "//input[@id='gridtab_dealNo_T036MT_gs_trspayplanvo.TRX_NBR']")
	private WebElement IIS_AdvancePrincipalSettlement_Maintenance_DealNo_609;
	public WebElement IIS_AdvancePrincipalSettlement_Maintenance_DealNo_609() {
		return IIS_AdvancePrincipalSettlement_Maintenance_DealNo_609;
	}
	
	@FindBy(xpath = "//input[@id='advance_Principal_T036MT']")
	private WebElement IIS_AdvancePrincipalSettlement_Maintenance_AdvancePrincipal_609;
	public WebElement IIS_AdvancePrincipalSettlement_Maintenance_AdvancePrincipal_609() {
		return IIS_AdvancePrincipalSettlement_Maintenance_AdvancePrincipal_609;
	}
	
//	@FindBy(xpath = "//li[@id='settlementTab2_T036MT']/a/span[text()='Schedule Details']")
//	private WebElement IIS_AdvancePrincipalSettlement_Maintenance_ScheduleDetails_609;
//	public WebElement IIS_AdvancePrincipalSettlement_Maintenance_ScheduleDetails_609() {
//		return IIS_AdvancePrincipalSettlement_Maintenance_ScheduleDetails_609;
//	}
	
	
	
	
	
	
	
	@FindBy(xpath = "//button[@id='automaticAllocationButton_T036MT']")
	private WebElement IIS_AdvancePrincipalSettlement_Maintenance_RescheduleAllocateBtn_609;
	public WebElement IIS_AdvancePrincipalSettlement_Maintenance_RescheduleAllocateBtn_609() {
		return IIS_AdvancePrincipalSettlement_Maintenance_RescheduleAllocateBtn_609;
	}
	
	@FindBy(xpath = "//table[@id='settlementScheduleGridTbl_Id_T036MT']")
	private WebElement IIS_AdvancePrincipalSettlement_Maintenance_ScheduleDetailsTable_609;
	public WebElement IIS_AdvancePrincipalSettlement_Maintenance_ScheduleDetailsTable_609() {
		return IIS_AdvancePrincipalSettlement_Maintenance_ScheduleDetailsTable_609;
	}
	
	@FindBy(xpath = "//button[@id='savebutton_T036MT']")
	private WebElement IIS_AdvancePrincipalSettlement_Maintenance_Save_609;
	public WebElement IIS_AdvancePrincipalSettlement_Maintenance_Save_609() {
		return IIS_AdvancePrincipalSettlement_Maintenance_Save_609;
	}
	
	@FindBy(xpath = "//div[contains(text(),'Active Settlement Exists')]")
	private WebElement IIS_settlement_exists_popup;
	public WebElement IISSettlementExistsPopup_608() {
		return IIS_settlement_exists_popup;
	}
	
	@FindBy(xpath = "//a[@id='T036P']/span[text()='Approve']")
	private WebElement IIS_AdvancePrincipalSettlement_Approve_609;
	public WebElement IIS_AdvancePrincipalSettlement_Approve_609() {
		return IIS_AdvancePrincipalSettlement_Approve_609;
	}
	
	@FindBy(xpath = "//input[@id='settlementMgmtGridTbl_Id_T036P_gs_trssetlmtvo.DEAL_NBR']")
	private WebElement IIS_AdvancePrincipalSettlement_Approve_DealNbr_609;
	public WebElement IIS_AdvancePrincipalSettlement_Approve_DealNbr_609() {
		return IIS_AdvancePrincipalSettlement_Approve_DealNbr_609;
	}
	
	@FindBy(xpath = "//td[@id='td_settlementMgmtGridTbl_Id_T036P_1_trssetlmtvo.SETTLEMENT_NBR']")
	private WebElement IIS_advance_principal_settlement_approve_searchgrid_row;
	public WebElement IISAdvancePrincipalSettlementApproveMenuSearchgridRow_608() {
		return IIS_advance_principal_settlement_approve_searchgrid_row;
	}
	
	@FindBy(xpath = "//input[@id='lookuptxt_dealNo_T036P']")
	private WebElement IIS_advance_principal_settlement_approve_menu_deal_nbr;
	public WebElement IISAdvancePrincipalSettlementApproveMenuDealNbr_608() {
		return IIS_advance_principal_settlement_approve_menu_deal_nbr;
	}
	
	@FindBy(xpath = "//button[@id='settlement_Approve_btn_T036P']")
	private WebElement IIS_AdvancePrincipalSettlement_Approve_ApproveBtn_609;
	public WebElement IIS_AdvancePrincipalSettlement_Approve_ApproveBtn_609() {
		return IIS_AdvancePrincipalSettlement_Approve_ApproveBtn_609;
	}	
}
