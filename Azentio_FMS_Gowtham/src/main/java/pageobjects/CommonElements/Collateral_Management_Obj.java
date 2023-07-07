package pageobjects.CommonElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Collateral_Management_Obj {
	WebDriver driver;

	public Collateral_Management_Obj(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//127727
//	@FindBy(xpath = "//td[text()='Financial Indicators']")
//	private WebElement Click_FinancialIndicators_under_Parameters;
//	public WebElement Click_FinancialIndicators_under_Parameters_607() {
//		return Click_FinancialIndicators_under_Parameters;
//	}
//	
//	@FindBy(xpath = "//span[text()='Maintenance']")
//	private WebElement Click_Mainteance_Under_FinancialIndicators;
//	public WebElement Click_Mainteance_Under_FinancialIndicators_607() {
//		return Click_Mainteance_Under_FinancialIndicators;
//	}
//	
//	@FindBy(xpath = "//*[@id='financialindicatorFormIdCode_P001MT']")
//	private WebElement Enter_Code_InMainteance_Under_FinancialIndicators;
//	public WebElement Enter_Code_InMainteance_Under_FinancialIndicators_607() {
//		return Enter_Code_InMainteance_Under_FinancialIndicators;
//	}
	
	
	@FindBy(xpath = "//td[text()='Collateral Type']")
	private WebElement Click_Collateral_Type_under_Parameters;
	public WebElement Click_Collateral_Type_under_Parameters_607() {
		return Click_Collateral_Type_under_Parameters;
	}
	
	@FindBy(xpath = "//span[text()='Maintenance']")
	private WebElement Click_Maintenance_under_Collateral_Type;
	public WebElement Click_Maintenance_under_Collateral_Type_607() {
		return Click_Maintenance_under_Collateral_Type;
	}
	
	@FindBy(xpath = "//*[@id='txt_code_P002MT']")
	private WebElement enter_Code_InMaintenance_under_Collateral_Type;
	public WebElement enter_Code_InMaintenance_under_Collateral_Type_607() {
		return enter_Code_InMaintenance_under_Collateral_Type;
	}
	
	@FindBy(xpath = "//*[@id='txt_brief_description_eng_P002MT']")
	private WebElement enter_Brief_Description_InMaintenance_under_Collateral_Type;
	public WebElement enter_Brief_Description_InMaintenance_under_Collateral_Type_607() {
		return enter_Brief_Description_InMaintenance_under_Collateral_Type;
	}
	
	@FindBy(xpath = "//*[@id='txt_long_description_eng_P002MT']")
	private WebElement enter_Long_Description_InMaintenance_under_Collateral_Type;
	public WebElement enter_Long_Description_InMaintenance_under_Collateral_Type_607() {
		return enter_Long_Description_InMaintenance_under_Collateral_Type;
	}
	
	@FindBy(xpath = "//*[@name='collateralTypeCO.fmsColatTypeVo.BRIEF_NAME_ARAB']")
	private WebElement enter_FirstEmpty_Field_InMaintenance_under_Collateral_Type;
	public WebElement enter_FirstEmpty_Field_InMaintenance_under_Collateral_Type_607() {
		return enter_FirstEmpty_Field_InMaintenance_under_Collateral_Type;
	}
	
	@FindBy(xpath = "//*[@name='collateralTypeCO.fmsColatTypeVo.LONG_NAME_ARAB']")
	private WebElement enter_SecondEmpty_Field_InMaintenance_under_Collateral_Type;
	public WebElement enter_SecondEmpty_Field_InMaintenance_under_Collateral_Type_607() {
		return enter_SecondEmpty_Field_InMaintenance_under_Collateral_Type;
	}
	
	@FindBy(xpath = "//*[@id='chk_box_apply_favoring_party_P002MT']")
	private WebElement Apply_Favoring_PartyCheckbox_InMaintenance_under_Collateral_Type;
	public WebElement Apply_Favoring_PartyCheckbox_InMaintenance_under_Collateral_Type_607() {
		return Apply_Favoring_PartyCheckbox_InMaintenance_under_Collateral_Type;
	}
	
	@FindBy(xpath = "//*[@id='txt_asset_type_P002MT']")
	private WebElement SelectAsset_Type_InMaintenance_under_Collateral_Type;
	public WebElement SelectAsset_Type_InMaintenance_under_Collateral_Type_607() {
		return SelectAsset_Type_InMaintenance_under_Collateral_Type;
	}
	
	@FindBy(xpath = "//*[@id='collateralTypeMaint_save_P002MT']")
	private WebElement ClickSave_btn_InMaintenance_under_Collateral_Type;
	public WebElement ClickSave_btn_InMaintenance_under_Collateral_Type_607() {
		return ClickSave_btn_InMaintenance_under_Collateral_Type;
	}
	
	@FindBy(xpath = "//span[text()='Approve']")
	private WebElement Click_Approve_under_Collateral_Type;
	public WebElement Click_Approve_under_Collateral_Type_607() {
		return Click_Approve_under_Collateral_Type;
	}
	
	@FindBy(xpath = "//*[@id='collateralTypeListGridTbl_Id_P002P_gs_fmsColatTypeVo.CODE']")
	private WebElement SearchRecord_in_Approve_under_Collateral_Type;
	public WebElement SearchRecord_in_Approve_under_Collateral_Type_607() {
		return SearchRecord_in_Approve_under_Collateral_Type;
	}
	
	@FindBy(xpath = "//*[@id='td_collateralTypeListGridTbl_Id_P002P_1_fmsColatTypeVo.CODE']")
	private WebElement Select_firstRecord_in_approve_under_Collateral_Type;
	public WebElement Select_firstRecord_in_approve_under_Collateral_Type_607() {
		return Select_firstRecord_in_approve_under_Collateral_Type;
	}
	
	@FindBy(xpath = "//*[@id='collateralTypeMaint_approve_P002P']")
	private WebElement ApproveRecord_in_approve_under_Collateral_Type;
	public WebElement ApproveRecord_in_approve_under_Collateral_Type_607() {
		return ApproveRecord_in_approve_under_Collateral_Type;
	}
	
	@FindBy(xpath = "//span[text()='Update after Approve']")
	private WebElement Click_Update_after_Approve_under_Collateral_Type;
	public WebElement Click_Update_after_Approve_under_Collateral_Type_607() {
		return Click_Update_after_Approve_under_Collateral_Type;
	}
	
	@FindBy(xpath = "//*[@id='collateralTypeListGridTbl_Id_P002UP_gs_fmsColatTypeVo.CODE']")
	private WebElement SearchRecord_in_Update_after_Approve_under_Collateral_Type;
	public WebElement SearchRecord_in_Update_after_Approve_under_Collateral_Type_607() {
		return SearchRecord_in_Update_after_Approve_under_Collateral_Type;
	}
	
	@FindBy(xpath = "//*[@id='td_collateralTypeListGridTbl_Id_P002UP_1_fmsColatTypeVo.CODE']")
	private WebElement Select_firstRecord_in_Update_after_Approve_under_Collateral_Type;
	public WebElement Select_firstRecord_in_Update_after_Approve_under_Collateral_Type_607() {
		return Select_firstRecord_in_Update_after_Approve_under_Collateral_Type;
	}
	
	@FindBy(xpath = "//*[@id='txt_brief_description_eng_P002UP']")
	private WebElement edit_Brief_Description_in_Update_after_Approve_under_Collateral_Type;
	public WebElement edit_Brief_Description_in_Update_after_Approve_under_Collateral_Type_607() {
		return edit_Brief_Description_in_Update_after_Approve_under_Collateral_Type;
	}
	
	@FindBy(xpath = "//*[@id='collateralTypeMaint_save_P002UP']")
	private WebElement saveRecord_in_Update_after_Approve_under_Collateral_Type;
	public WebElement saveRecord_in_Update_after_Approve_under_Collateral_Type_607() {
		return saveRecord_in_Update_after_Approve_under_Collateral_Type;
	}
	
	@FindBy(xpath = "//input[@id='_popup_path_sol_confirm_ok']")
	private WebElement Confirmsave_popup_okbutton;
	public WebElement confirmsavepopupokbutton() {
		return Confirmsave_popup_okbutton;
	}

	@FindBy(xpath = "//input[@id='_popup_path_sol_ok']")
	private WebElement Confirmsave_Successfully_popup;
	public WebElement confirmsavesuccessfullypopup() {
		return Confirmsave_Successfully_popup;
	}
	
	@FindBy(xpath="//a[@id='dismissbut_CSMRF00MT']/span")
    private WebElement SendAlert_pop;
    public WebElement SendAlert_pop() {
      return SendAlert_pop;
    }

	//127734
	
	
	@FindBy(xpath = "//td[text()='Collateral Management']")
	private WebElement click_Collateral_Management_under_menu;
	public WebElement click_Collateral_Management_under_menu_607() {
		return click_Collateral_Management_under_menu;
	}

	@FindBy(xpath = "//span[text()='Query']")
	private WebElement click_Query_under_Collateral_Management;
	public WebElement click_Query_under_Collateral_Management_607() {
		return click_Query_under_Collateral_Management;
	}
	
	@FindBy(xpath = "//*[@id='collateralManagementGridTbl_Id_T014QY_pager_left']/table/tbody/tr/td[7]")
	private WebElement click_ClearSearch_InQuery_under_Collateral_Management;
	public WebElement click_ClearSearch_InQuery_under_Collateral_Management_607() {
		return click_ClearSearch_InQuery_under_Collateral_Management;
	}
	
	
	@FindBy(xpath = "//*[@id='td_collateralManagementGridTbl_Id_T014QY_1_fmsCollateralVO.CODE']")
	private WebElement Select_firstRecord_InQuery_under_Collateral_Management;
	public WebElement Select_firstRecord_InQuery_under_Collateral_Management_607() {
		return Select_firstRecord_InQuery_under_Collateral_Management;
	}
	
	@FindBy(xpath = "//*[@id='lookuptxt_collateralManagementCollateralType_T014QY']")
	private WebElement Check_CollateralType_InQuery_under_Collateral_Management;
	public WebElement Check_CollateralType_InQuery_under_Collateral_Management_607() {
		return Check_CollateralType_InQuery_under_Collateral_Management;
	}
	@FindBy(xpath = "//input[@id='_popup_path_sol_ok']")
	private WebElement ServerLoding_pop;
	public WebElement ServerLoding_pop() {
		return ServerLoding_pop;
	}
	
	
	//127735
	@FindBy(xpath = "//td[text()='Collateral Management']")
	private WebElement FMS_collateral_management;
	public WebElement FMSCollateralManagement() {
		return FMS_collateral_management;
	}
	
	@FindBy(xpath = "//a[@id='T014MT']")
	private WebElement collateral_management_maintanance;
	public WebElement collateralManagementMaintanance() {
		return collateral_management_maintanance;
	}
	
	@FindBy(xpath = "//input[@id='lookuptxt_collateralManagementCollateralType_T014MT']")
	private WebElement main_info_collateral_type;
	public WebElement mainInfoCollateralType() {
		return main_info_collateral_type;
	}
	
	@FindBy(xpath = "//input[@id='fmscollateralValidFrom_T014MT']//following-sibling::img")
	private WebElement main_info_valid_from_date_calender;
	public WebElement mainInfoValidFromDateCalender() {
		return main_info_valid_from_date_calender;
	}
	
	@FindBy(xpath = "//input[@id='fmscollateralValidFrom_T014MT']")
	private WebElement main_info_valid_from_date;
	public WebElement mainInfoValidFromDate() {
		return main_info_valid_from_date;
	}
	
	@FindBy(xpath = "//input[@id='fmscollateralValidTo_T014MT']")
	private WebElement main_info_valid_to_date;
	public WebElement mainInfoValidToDate() {
		return main_info_valid_to_date;
	}
	
	@FindBy(xpath = "//input[@id='fmscollateralBriefNameEng_T014MT']")
	private WebElement main_info_brief_descrip;
	public WebElement mainInfoBriefDescrip() {
		return main_info_brief_descrip;
	}
	
	@FindBy(xpath = "//input[@id='fmscollateralLongNameEng_T014MT']")
	private WebElement main_info_long_descrip;
	public WebElement mainInfoLongDescrip() {
		return main_info_long_descrip;
	}
	
	@FindBy(xpath = "//input[@id='lookuptxt_fmscollateralCurrency_T014MT']")
	private WebElement main_info_collateral_currency;
	public WebElement mainInfoCollateralCurrency() {
		return main_info_collateral_currency;
	}
	
	@FindBy(xpath = "//input[@id='fmscollateralCurrency_Brief_Desc_Eng_T014MT']")
	private WebElement main_info_collateral_currency_label;
	public WebElement mainInfoCollateralCurrencyLabel() {
		return main_info_collateral_currency_label;
	}
	
	@FindBy(xpath = "//li[@id='collateralManagementCashGuaranteeDetailsTabs_T014MT']")
	private WebElement collateral_cash_details_tab;
	public WebElement CollateralCashDetailsTab() {
		return collateral_cash_details_tab;
	}
	
	@FindBy(xpath = "//td[@id='add_CollateralManagementCashGuarantorGrid_T014MT']")
	private WebElement collateral_cash_details_add_icon;
	public WebElement CollateralCashDetailsAddIcon() {
		return collateral_cash_details_add_icon;
	}
	
	@FindBy(xpath = "//input[@name='lookupTxt_accAdditionalRef']/following-sibling::span")
	private WebElement collateral_cash_details_additional_ref_lookup;
	public WebElement CollateralCashDetailsAdditionalRefLookup() {
		return collateral_cash_details_additional_ref_lookup;
	}
	
	@FindBy(xpath = "//*[@id='1']")
	private WebElement collateral_cash_details_additional_ref_row1;
	public WebElement CollateralCashDetailsAdditionalRefRow1() {
		return collateral_cash_details_additional_ref_row1;
	}
	
	@FindBy(xpath = "//*[@id='1']/td[2]")
	private WebElement collateral_cash_details_additional_ref_cy;
	public WebElement CollateralCashDetailsAdditionalRefCy() {
		return collateral_cash_details_additional_ref_cy;
	}

	@FindBy(xpath = "//td[@id='td_CollateralManagementCashGuarantorGrid_T014MT_1_fmsCollateralDetVO.AMOUNT']/div/input")
	private WebElement collateral_cash_details_amount;
	public WebElement CollateralCashDetailsAmount() {
		return collateral_cash_details_amount;
	}

	@FindBy(xpath = "//button[@id='collateralManagement_save_btn_T014MT']")
	private WebElement collateral_management_maintanance_save_btn;
	public WebElement collateralManagementMaintananceSaveBtn() {
		return collateral_management_maintanance_save_btn;
	}
	
	@FindBy(xpath = "//input[@id='_popup_path_sol_confirm_ok']")
	private WebElement warning_popup_ok_btn;
	public WebElement warningPopupOkBtn() {
		return warning_popup_ok_btn;
	}
	
	@FindBy(xpath = "//div[@class='jMsgbox-titleWrap']")
	private WebElement confirm_popup_title;
	public WebElement confirmPopupTitle() {
		return confirm_popup_title;
	}
	
	@FindBy(xpath = "//input[@id='_popup_path_sol_confirm_ok']")
	private WebElement confirm_popup_ok_btn;
	public WebElement confirmPopupOkBtn() {
		return confirm_popup_ok_btn;
	}
	
	@FindBy(xpath = "//div[text()='Success']")
	private WebElement success_popup_title;
	public WebElement successPopupTitle() {
		return success_popup_title;
	}
	
	@FindBy(xpath = "//*[@id='_popup_path_sol_ok']")
	private WebElement success_popup_ok_btn;
	public WebElement SuccessPopupOkBtn() {
		return success_popup_ok_btn;
	}
	
	@FindBy(xpath = "//span[text()='Send Alert']")
	private WebElement send_alert_popup;
	public WebElement sendAlertPopup() {
		return send_alert_popup;
	}
	
	@FindBy(xpath = "/html/body/div[22]/div[1]/a/span")
	private WebElement send_alert_popup_close;
	public WebElement sendAlertPopupClose() {
		return send_alert_popup_close;
	}
	
	@FindBy(xpath = "//a[@id='T014AP']")
	private WebElement collateral_management_approve;
	public WebElement collateralManagementApprove() {
		return collateral_management_approve;
	}
	
	@FindBy(xpath = "//*[@id='collateralManagementGridTbl_Id_T014AP_pager_left']/table/tbody/tr/td[7]")
	private WebElement collateral_management_approve_clear_btn;
	public WebElement collateralManagementApproveClearBtn() {
		return collateral_management_approve_clear_btn;
	}
	
	@FindBy(xpath = "//td[@id='td_collateralManagementGridTbl_Id_T014AP_1_fmsCollateralVO.CODE']")
	private WebElement collateral_management_approve_first_row;
	public WebElement collateralManagementApproveFirstRow() {
		return collateral_management_approve_first_row;
	}
	
	@FindBy(xpath = "//button[@id='collateralManagement_approve_btn_T014AP']")
	private WebElement collateral_management_approve_btn;
	public WebElement collateralManagementApproveBtn() {
		return collateral_management_approve_btn;
	}
	
	@FindBy(xpath = "//*[@id='facilityLimitDetailsTab_WIFT008MT']")
	private WebElement Click_facilityLimitDetails;
	public WebElement Close_Approval_Committee_Recommendations_tab_607() {
		return Close_Approval_Committee_Recommendations_tab;
	}
	
	@FindBy(xpath = "//a[text()='WIFAK APPLICATION / WIFAK APPLICATION / Approval Committee Recommendations ']/parent::td/following-sibling::td//span")
	private WebElement Close_Approval_Committee_Recommendations_tab;
	public WebElement Click_facilityLimitDetails_607() {
		return Click_facilityLimitDetails;
	}
	
	@FindBy(xpath = "//*[@id='facilityManagement_collateralDetails_btn_WIFT008MT']")
	private WebElement Click_collateralDetails_in_mainteance_under_FacilityManagement;
	public WebElement Click_collateralDetails_in_mainteance_under_FacilityManagement_607() {
		return Click_collateralDetails_in_mainteance_under_FacilityManagement;
	}
	
	@FindBy(xpath = "//*[@id='td_FacilityManagementFacilityLimitDetailsGrid_WIFT008MT_0_rn']")
	private WebElement selectRow_InfacilityLimitDetailsTabin_mainteance_under_FacilityManagement;
	public WebElement selectRow_InfacilityLimitDetailsTabin_mainteance_under_FacilityManagement_607() {
		return selectRow_InfacilityLimitDetailsTabin_mainteance_under_FacilityManagement;
	}
	
	@FindBy(xpath = "//*[@id='td_FacilityCollateralGrid_WIFT008MT_0_rn']")
	private WebElement selectRow_InCollateralDetails_mainteance_under_FacilityManagement;
	public WebElement selectRow_InCollateralDetails_mainteance_under_FacilityManagement_607() {
		return selectRow_InCollateralDetails_mainteance_under_FacilityManagement;
	}
	
	@FindBy(xpath = "//*[@id='collateral_query_btn_WIFT008MT']")
	private WebElement ClickQuerybtn_InCollateralDetails_mainteance_under_FacilityManagement;
	public WebElement ClickQuerybtn_InCollateralDetails_mainteance_under_FacilityManagement_607() {
		return ClickQuerybtn_InCollateralDetails_mainteance_under_FacilityManagement;
	}
	
	@FindBy(xpath = "//*[@id='collateralCode_WIFT008MT']")
	private WebElement CheckCode_InCollateralDetails_mainteance_under_FacilityManagement;
	public WebElement CheckCode_InCollateralDetails_mainteance_under_FacilityManagement_607() {
		return CheckCode_InCollateralDetails_mainteance_under_FacilityManagement;
	}
	
	//127765
	
	
	@FindBy(xpath = "//*[@id='lookuptxt_facilityMgtMainApplicationRef_WIFT008MT']")
	private WebElement SearchApplication_Ref_Inmainteance_under_FacilityManagement;
	public WebElement SearchApplication_Ref_Inmainteance_under_FacilityManagement_607() {
		return SearchApplication_Ref_Inmainteance_under_FacilityManagement;
	}
	
	
	@FindBy(xpath = "//*[@id='facilityMgtMainCif_WIFT008MT']")
	private WebElement CheckCIFno_Inmainteance_under_FacilityManagement;
	public WebElement CheckCIFno_Inmainteance_under_FacilityManagement_607() {
		return CheckCIFno_Inmainteance_under_FacilityManagement;
	}
	
	@FindBy(xpath = "//*[@id='facilityAdditionalDetailsTab_WIFT008MT']")
	private WebElement ClickAdditionalDetailTab_Inmainteance_under_FacilityManagement;
	public WebElement ClickAdditionalDetailTab_Inmainteance_under_FacilityManagement_607() {
		return ClickAdditionalDetailTab_Inmainteance_under_FacilityManagement;
	}
	
	@FindBy(xpath = "//*[@id='facilityMgtAddDetDateEffectiveUntill_WIFT008MT']")
	private WebElement ChangeEffective_UntilInAdditionalDetailTab_Inmainteance_under_FacilityManagement;
	public WebElement ChangeEffective_UntilInAdditionalDetailTab_Inmainteance_under_FacilityManagement_607() {
		return ChangeEffective_UntilInAdditionalDetailTab_Inmainteance_under_FacilityManagement;
	}
	
	
	@FindBy(xpath = "//*[@id='facilityMgtAddDetUnutilizedExpiryDate_WIFT008MT']")
	private WebElement ChangeUnutilized_Expiry_DateInAdditionalDetailTab_Inmainteance_under_FacilityManagement;
	public WebElement ChangeUnutilized_Expiry_DateInAdditionalDetailTab_Inmainteance_under_FacilityManagement_607() {
		return ChangeUnutilized_Expiry_DateInAdditionalDetailTab_Inmainteance_under_FacilityManagement;
	}
	
	@FindBy(xpath = "//*[@id='facilityLimitDetailsTab_WIFT008MT']")
	private WebElement facilityLimitDetailsTab_Inmainteance_under_FacilityManagement;
	public WebElement facilityLimitDetailsTab_Inmainteance_under_FacilityManagement_607() {
		return facilityLimitDetailsTab_Inmainteance_under_FacilityManagement;
	}
	
	@FindBy(xpath = "//*[@id='td_FacilityManagementFacilityLimitDetailsGrid_WIFT008MT_0_rn']")
	private WebElement SelectproductClass_InfacilityLimitDetailsTab_Inmainteance_under_FacilityManagement;
	public WebElement SelectproductClass_InfacilityLimitDetailsTab_Inmainteance_under_FacilityManagement_607() {
		return SelectproductClass_InfacilityLimitDetailsTab_Inmainteance_under_FacilityManagement;
	}
	
	@FindBy(xpath = "//*[@id='facilityManagement_collateralDetails_btn_WIFT008MT']")
	private WebElement ClickcollateralDetails_btn_InfacilityLimitDetailsTab_Inmainteance_under_FacilityManagement;
	public WebElement ClickcollateralDetails_btn_InfacilityLimitDetailsTab_Inmainteance_under_FacilityManagement_607() {
		return ClickcollateralDetails_btn_InfacilityLimitDetailsTab_Inmainteance_under_FacilityManagement;
	}
	
	@FindBy(xpath = "//*[@id='add_FacilityCollateralGrid_WIFT008MT']/div/span")
	private WebElement ClickAddbtn_IncollateralDetails_InfacilityLimitDetailsTab_Inmainteance_under_FacilityManagement;
	public WebElement ClickAddbtn_IncollateralDetails_InfacilityLimitDetailsTab_Inmainteance_under_FacilityManagement_607() {
		return ClickAddbtn_IncollateralDetails_InfacilityLimitDetailsTab_Inmainteance_under_FacilityManagement;
	}
	
	@FindBy(xpath = "//*[@id='td_FacilityCollateralGrid_WIFT008MT_1_fmsAppcollateralsVO.COLLATERAL']")
	private WebElement SelectFirstLine_IncollateralDetails_InfacilityLimitDetailsTab_Inmainteance_under_FacilityManagement;
	public WebElement SelectFirstLine_IncollateralDetails_InfacilityLimitDetailsTab_Inmainteance_under_FacilityManagement_607() {
		return SelectFirstLine_IncollateralDetails_InfacilityLimitDetailsTab_Inmainteance_under_FacilityManagement;
	}
	
	@FindBy(xpath = "//*[@name=\"lookupTxt_fmsAppcollateralsVO.COLLATERAL\"]")
	private WebElement EnterCodeInFirstLine_IncollateralDetails_InfacilityLimitDetailsTab_Inmainteance_under_FacilityManagement;
	public WebElement EnterCodeInFirstLine_IncollateralDetails_InfacilityLimitDetailsTab_Inmainteance_under_FacilityManagement_607() {
		return EnterCodeInFirstLine_IncollateralDetails_InfacilityLimitDetailsTab_Inmainteance_under_FacilityManagement;
	}
	
	@FindBy(xpath = "//span[text()='Ok']")
	private WebElement ClickOk_IncollateralDetails_InfacilityLimitDetailsTab_Inmainteance_under_FacilityManagement;
	public WebElement ClickOk_IncollateralDetails_InfacilityLimitDetailsTab_Inmainteance_under_FacilityManagement_607() {
		return ClickOk_IncollateralDetails_InfacilityLimitDetailsTab_Inmainteance_under_FacilityManagement;
	}
	
	@FindBy(xpath = "//*[@id='facilitymanagement_save_btn_WIFT008MT']")
	private WebElement ClickSave_btn_Inmainteance_under_FacilityManagement;
	public WebElement ClickSave_btn_Inmainteance_under_FacilityManagement_607() {
		return ClickSave_btn_Inmainteance_under_FacilityManagement;
	}
	
	
	@FindBy(xpath = "//*[@id='WIFT008AP']")
	private WebElement Click_approveReject_under_FacilityManagement;
	public WebElement Click_approveReject_under_FacilityManagement_607() {
		return Click_approveReject_under_FacilityManagement;
	}
	
	
	@FindBy(xpath = "//*[@id='facilityManagementGridTbl_Id_WIFT008AP_pager_left']/table/tbody/tr/td[7]")
	private WebElement Click_ClearSearch_approveReject_under_FacilityManagement;
	public WebElement Click_ClearSearch_approveReject_under_FacilityManagement_607() {
		return Click_ClearSearch_approveReject_under_FacilityManagement;
	}
	
	@FindBy(xpath = "//*[@id='td_facilityManagementGridTbl_Id_WIFT008AP_1_fmsFacilityVO.CODE']")
	private WebElement SelectRecord_InapproveReject_under_FacilityManagement;
	public WebElement SelectRecord_InapproveReject_under_FacilityManagement_607() {
		return SelectRecord_InapproveReject_under_FacilityManagement;
	}
	
	@FindBy(xpath = "//*[@id='facilityManagement_approve_btn_WIFT008AP']")
	private WebElement ClickApproveBtn_InapproveReject_under_FacilityManagement;
	public WebElement ClickApproveBtn_InapproveReject_under_FacilityManagement_607() {
		return ClickApproveBtn_InapproveReject_under_FacilityManagement;
	}
	
	@FindBy(xpath = "//a[text()='WIFAK APPLICATION / WIFAK APPLICATION / Facilities Management / Maintenance']//following::span[text()='Remove Tab']")
	private WebElement Cloce_WIFAKAPPLICATION_WIFAKAPPLICATION_FacilitiesManagement_Maintenance_tab;
	public WebElement Cloce_WIFAKAPPLICATION_WIFAKAPPLICATION_FacilitiesManagement_Maintenance_tab_607() {
		return Cloce_WIFAKAPPLICATION_WIFAKAPPLICATION_FacilitiesManagement_Maintenance_tab;
	}
	
	//127773
	
	@FindBy(xpath = "//*[@id='infoBarSearchButton_WIFT008MT']")
	private WebElement Click_search_in_mainteance_Under_facilitiesMainteance;
	public WebElement Click_search_in_mainteance_Under_facilitiesMainteance_607() {
		return Click_search_in_mainteance_Under_facilitiesMainteance;
	}
	
	@FindBy(xpath = "//*[@id='facilityManagementGridTbl_Id_WIFT008MT_pager_left']/table/tbody/tr/td[7]")
	private WebElement Click_Clearsearch_in_mainteance_Under_facilitiesMainteance;
	public WebElement Click_Clearsearch_in_mainteance_Under_facilitiesMainteance_607() {
		return Click_Clearsearch_in_mainteance_Under_facilitiesMainteance;
	}
	
	@FindBy(xpath = "//*[@id='facilityManagementGridTbl_Id_WIFT008MT_gs_fmsFacilityVO.CODE']")
	private WebElement searchCode_in_mainteance_Under_facilitiesMainteance;
	public WebElement searchCode_in_mainteance_Under_facilitiesMainteance_607() {
		return searchCode_in_mainteance_Under_facilitiesMainteance;
	}
	
	@FindBy(xpath = "//*[@id='td_facilityManagementGridTbl_Id_WIFT008MT_1_fmsFacilityVO.CODE']")
	private WebElement SelectRecord_in_mainteance_Under_facilitiesMainteance;
	public WebElement SelectRecord_in_mainteance_Under_facilitiesMainteance_607() {
		return SelectRecord_in_mainteance_Under_facilitiesMainteance;
	}
	
}
