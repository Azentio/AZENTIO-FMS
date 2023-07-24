package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Collateral_ManagementObj {
	
	WebDriver driver;
	public Collateral_ManagementObj(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
//	@AT_RF_035
	@FindBy(xpath = "//label[@id='language_key']")
	private WebElement FMS_core_language_btn;
	public WebElement FMSCoreLanguageBtn() {
		return FMS_core_language_btn;
	}
	
	@FindBy(xpath = "//a[@id='ar']")
	private WebElement arabic_language;
	public WebElement arabicLanguage() {
		return arabic_language;
	}

	@FindBy(xpath = "//td[text()='إدارة الرهن']")
	private WebElement arabic_mortgage_management_module;
	public WebElement arabicMortgageManagementModule() {
		return arabic_mortgage_management_module;
	}
	
	@FindBy(xpath = "//a[@id='T014MT']")	
	private WebElement mortgage_management_main;
	public WebElement mortgageManagementMain() {
		return mortgage_management_main;
	}
	
	@FindBy(xpath = "//label[@id='collateralmanagementFormId_T014MT_Collateral_Type_key']")
	private WebElement mortgage_management_main_label;
	public WebElement mortgageManagementMainLabel() {
		return mortgage_management_main_label;
	}
	
	@FindBy(xpath = "//button[@id='collateralManagement_save_btn_T014MT']")
	private WebElement mortgage_management_main_end;
	public WebElement mortgageManagementMainEnd() {
		return mortgage_management_main_end;
	}
	
	
//	@AT_RF_158_Param - Collateral Type
	@FindBy(xpath = "//td[text()='Collateral Type']")
	private WebElement parameter_collateral_type;
	public WebElement parameterCollateralType() {
		return parameter_collateral_type;
	}
	
	@FindBy(xpath = "//a[@id='P002MT']")
	private WebElement collateral_type_maintanance;
	public WebElement collateralTypeMaintanance() {
		return collateral_type_maintanance;
	}
	
	@FindBy(xpath = "//input[@id='txt_code_P002MT']")
	private WebElement collateral_type_main_code;
	public WebElement collateralTypeMainCode() {
		return collateral_type_main_code;
	}
	
	@FindBy(xpath = "//input[@id='txt_brief_description_eng_P002MT']")
	private WebElement collateral_type_main_brief_descrip;
	public WebElement collateralTypeMainBriefDescrip() {
		return collateral_type_main_brief_descrip;
	}
	
	@FindBy(xpath = "//input[@id='txt_long_description_eng_P002MT']")
	private WebElement collateral_type_main_long_descrip;
	public WebElement collateralTypeMainLongDescrip() {
		return collateral_type_main_long_descrip;
	}
	
	@FindBy(xpath = "//select[@id='txt_asset_type_P002MT']")
	private WebElement collateral_type_main_asset_type_dropdown;
	public WebElement collateralTypeMainAssetTypeDropdown() {
		return collateral_type_main_asset_type_dropdown;
	}
	
	@FindBy(xpath = "//button[@id='collateralTypeMaint_save_P002MT']")
	private WebElement collateral_type_main_save_btn;
	public WebElement collateralTypeMainSaveBtn() {
		return collateral_type_main_save_btn;
	}
	
	@FindBy(xpath = "//a[@id='P002P']")
	private WebElement collateral_type_approve;
	public WebElement collateralTypeApprove() {
		return collateral_type_approve;
	}
	
	@FindBy(xpath = "//input[@id='collateralTypeListGridTbl_Id_P002P_gs_fmsColatTypeVo.CODE']")
	private WebElement collateral_type_approve_code;
	public WebElement collateralTypeApproveCode() {
		return collateral_type_approve_code;
	}
	
	@FindBy(linkText = "//*[@id='1']")
	private WebElement collateral_type_approve_code_row1;
	public WebElement collateralTypeApproveCodeRow1() {
		return collateral_type_approve_code_row1;
	}
	
	@FindBy(xpath = "//button[@id='collateralTypeMaint_approve_P002P']")
	private WebElement collateral_type_approve_btn;
	public WebElement collateralTypeApproveBtn() {
		return collateral_type_approve_btn;
	}
	
	
	
	
//	@AT_RF_158_Core
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
	@FindBy(xpath = "//li[@id='collateralManagementAdditionDetailsTabs_T014MT']")
	private WebElement collateral_management_AdditionalDetailsTab;
	public WebElement collateral_management_AdditionalDetailsTab() {
		return collateral_management_AdditionalDetailsTab;
	}
	@FindBy(xpath = "//label[@id='advanced_options_key']")
	private WebElement collateral_management_AdvancedOptions;
	public WebElement collateral_management_AdvancedOptions() {
		return collateral_management_AdvancedOptions;
	}
	@FindBy(xpath = "//label[@id='settings_key']")
	private WebElement collateral_management_SettingsOption;
	public WebElement collateral_management_SettingsOption() {
		return collateral_management_SettingsOption;
	}
	@FindBy(xpath = "//span[@id='lbl_trans_icon_lbl_fmscollateralMarketValue_T014MT']")
	private WebElement collateral_management_FCValueFieldInMarketValueSection;
	public WebElement collateral_management_FCValueFieldInMarketValueSection() {
		return collateral_management_FCValueFieldInMarketValueSection;
	}
	@FindBy(xpath = "//td[@id='td_labelTransTbl_IdL_2_lblValueTrans']")
	private WebElement collateral_management_LabelTranslation;
	public WebElement collateral_management_LabelTranslation() {
		return collateral_management_LabelTranslation;
	}
	@FindBy(xpath = "(//span[contains(text(),'Save')])[2]")
	private WebElement collateral_management_LabelTranslation_SaveButton;
	public WebElement collateral_management_LabelTranslation_SaveButton() {
		return collateral_management_LabelTranslation_SaveButton;
	}
	@FindBy(xpath = "//input[@id='_popup_path_sol_ok']")
	private WebElement collateral_management_OKButtoninRecordUpdatedPopup;
	public WebElement collateral_management_OKButtoninRecordUpdatedPopup() {
		return collateral_management_OKButtoninRecordUpdatedPopup;
	}
	@FindBy(xpath = "//span[contains(text(),'close')]")
	private WebElement collateral_management_Labeling_Closeicon;
	public WebElement collateral_management_Labeling_Closeicon() {
		return collateral_management_Labeling_Closeicon;
	}
	@FindBy(xpath = "//input[@id='_popup_path_sol_confirm_ok']")
	private WebElement collateral_management_OKButtonInReloadPopup;
	public WebElement collateral_management_OKButtonInReloadPopup() {
		return collateral_management_OKButtonInReloadPopup;
	}
	@FindBy(xpath = "//label[contains(text(),'Market FC Value ')]")
	private WebElement collateral_management_MarketFCValueField;
	public WebElement collateral_management_MarketFCValueField() {
		return collateral_management_MarketFCValueField;
	}
	@FindBy(xpath = "//a[@id='GLBVIEW001']")
	private WebElement FMS_360DegreesViewButton;
	public WebElement FMS_360DegreesViewButton() {
		return FMS_360DegreesViewButton;
	} 
	@FindBy(xpath = "//input[@id='lookuptxt_cif_no_GLBVIEW001']")
	private WebElement FMS_360Degrees_CIFNoField;
	public WebElement FMS_360Degrees_CIFNoField() {
		return FMS_360Degrees_CIFNoField;
	} 
	@FindBy(xpath = "//label[@id='View_Grid_key']")
	private WebElement FMS_360Degrees_ViewGridButton;
	public WebElement FMS_360Degrees_ViewGridButton() {
		return FMS_360Degrees_ViewGridButton;
	} 
	@FindBy(xpath = "//td[@id='td_finAppAndAprvdLinesGridTbl_Id_GLBVIEW001_1_collaterals']")
	private WebElement FMS_360Degrees_CollateralsLink;
	public WebElement FMS_360Degrees_CollateralsLink() {
		return FMS_360Degrees_CollateralsLink;
	} 
	@FindBy(xpath = "(//span[@class='ui-icon ui-icon-circle-triangle-s'])[1]")
	private WebElement FMS_360Degrees_CY840USDLink;
	public WebElement FMS_360Degrees_CY840USDLink() {
		return FMS_360Degrees_CY840USDLink;
	} 
	@FindBy(xpath = "(//a[@class='fg-button ui-state-default  ui-corner-all fg-button-icon-left'])[1]")
	private WebElement FMS_360Degrees_QueryLink;
	public WebElement FMS_360Degrees_QueryLink() {
		return FMS_360Degrees_QueryLink;
	} 
	@FindBy(xpath = "//label[@id='collateralmanagementFormId_T014QY_Show_Details_key']")
	private WebElement FMS_360Degrees_ShowDetailsButton;
	public WebElement FMS_360Degrees_ShowDetailsButton() {
		return FMS_360Degrees_ShowDetailsButton;
	} 
	@FindBy(xpath = "//button[@id='collateralManagement_JVDetails_btn_T014QY']")
	private WebElement FMS_360Degrees_JVDetailsButton;
	public WebElement FMS_360Degrees_JVDetailsButton() {
		return FMS_360Degrees_JVDetailsButton;
	} 
	@FindBy(xpath = "(//span[@class='ui-icon ui-icon-closethick'])[1]")
	private WebElement FMS_360Degrees_CloseIconInViewMemoPopup;
	public WebElement FMS_360Degrees_CloseIconInViewMemoPopup() {
		return FMS_360Degrees_CloseIconInViewMemoPopup;
	} 
	
	@FindBy(xpath = "//td[contains(text(),'000000001055')]")
	private WebElement FMS_360Degrees_RespectiveCollateralId;
	public WebElement FMS_360Degrees_RespectiveCollateralId() {
		return FMS_360Degrees_RespectiveCollateralId;
	} 
	@FindBy(xpath = "//td[contains(text(),'Linked Collaterals')]")
	private WebElement FMS_360Degrees_LinkedCollateralText;
	public WebElement FMS_360Degrees_LinkedCollateralText() {
		return FMS_360Degrees_LinkedCollateralText;
	} 
	@FindBy(xpath = "///td[contains(text(),'Unlinked Collaterals')]")
	private WebElement FMS_360Degrees_UnLinkedCollateralText;
	public WebElement FMS_360Degrees_UnLinkedCollateralText() {
		return FMS_360Degrees_UnLinkedCollateralText;
	} 

	
}
