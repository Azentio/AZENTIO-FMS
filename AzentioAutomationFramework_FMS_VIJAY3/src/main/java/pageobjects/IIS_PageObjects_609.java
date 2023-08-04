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
}
