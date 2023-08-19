package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FMSCollateralManagementObj {
	WebDriver driver;

	public FMSCollateralManagementObj(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	
	
	@FindBy(xpath="//td[text()='Collateral Management']")
	private WebElement fms_CollateralManagement;

	public WebElement fms_CollateralManagement() {
		return fms_CollateralManagement;
	}
	
	@FindBy(xpath="//td[text()='Revaluation']")
	private WebElement fms_Revaluation;

	public WebElement fms_Revaluation() {
		return fms_Revaluation;
	}
	
	@FindBy(xpath = "//td[text()='Revaluation Reports']")
	private WebElement fms_RevaluationReports;

	public WebElement fms_RevaluationReports() {
		return fms_RevaluationReports;
	}

	@FindBy(xpath = "//a[@id='T014PRRD']")
	private WebElement fms_DealCollateralValuationReport;

	public WebElement fms_DealCollateralValuationReport() {
		return fms_DealCollateralValuationReport;
	}
	
	@FindBy(xpath="//input[@id='_popup_path_sol_confirm_ok']")
	private WebElement fms_WarningPopup;

	public WebElement fms_WarningPopup() {
		return fms_WarningPopup;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_p_param_RA_CODE_FR_NUMBER_T014PRRD']")
	private WebElement fms_CodeFrom;

	public WebElement fms_CodeFrom() {
		return fms_CodeFrom;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_p_param_RA_CODE_TO_NUMBER_T014PRRD']")
	private WebElement fms_CodeTo;

	public WebElement fms_CodeTo() {
		return fms_CodeTo;
	}
	
	@FindBy(xpath = "//label[@id='retrieve_key']")
	private WebElement fms_Retrieve;

	public WebElement fms_Retrieve() {
		return fms_Retrieve;
	}

	
	
	@FindBy(xpath="//span[contains(text(),'User ID  PRIYANKA')]")
	private WebElement fms_ReportVaildation;

	public WebElement fms_ReportVaildation() {
		return fms_ReportVaildation;
	}


	
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
	
	@FindBy(xpath = "//input[@id='lookuptxt_fmscollateralCif_T014MT']")
	private WebElement main_info_collateral_Cif;
	public WebElement mainInfoCollateralCif() {
		return main_info_collateral_Cif;
	}
	
	
	@FindBy(xpath = "//input[@id='_popup_path_sol_confirm_ok']")
	private WebElement main_info_collateral_CifPopUp;
	public WebElement mainInfoCollateralCifPopUp() {
		return main_info_collateral_CifPopUp;
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
	@FindBy(xpath = "//li[@id='collateralManagementAdditionDetailsTabs_T014MT']")
	private WebElement collateral_Additional_Details_Tab;
	public WebElement collateral_Additional_Details_Tab() {
		return collateral_Additional_Details_Tab;
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
	@FindBy(xpath = "//span[text()='Verify']")
	private WebElement collateral_management_verify;
	public WebElement collateral_management_verify() {
		return collateral_management_verify;
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
	
	@FindBy(xpath = "//span[text()='close']")
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
	
	
	@FindBy(xpath = "//input[@id='collateralCode_T014AP']")
	private WebElement collateral_management_approve_code;
	public WebElement collateralManagementApproveCode() {
		return collateral_management_approve_code;
	}
	@FindBy(xpath = "//button[@id='collateralManagement_approve_btn_T014AP']")
	private WebElement collateral_management_approve_btn;
	public WebElement collateralManagementApproveBtn() {
		return collateral_management_approve_btn;
	}
	
	//--------------------------------//
	@FindBy(xpath = "//span[text()='Update After Approve']")
	private WebElement collateral_management_updateAfterApproval;
	public WebElement collateral_management_updateAfterApproval() {
		return collateral_management_updateAfterApproval;
	}
	
	@FindBy(xpath = "//input[@id='collateralManagementGridTbl_Id_T014UP_gs_fmsCollateralVO.CODE']")
	private WebElement updateAfterApproval_searchCODE;
	public WebElement updateAfterApproval_searchCODE() {
		return updateAfterApproval_searchCODE;
	}
	
	
	@FindBy(xpath = "//span[contains(text(),'Collateral Cash Details')]")
	private WebElement updateAfterApproval_cash_details_tab;
	public WebElement updateAfterApproval_cash_details_tab() {
		return updateAfterApproval_cash_details_tab;
	}
	@FindBy(xpath = "//td[@id='td_CollateralManagementCashGuarantorGrid_T014UP_1_fmsCollateralDetVO.AMOUNT']")
	private WebElement updateAfterApproval_amount;
	public WebElement updateAfterApproval_amount() {
		return updateAfterApproval_amount;
	}
	@FindBy(xpath = "//span[contains(text(),'Save')]")
	private WebElement updateAfterApproval_save;
	public WebElement updateAfterApproval_save() {
		return updateAfterApproval_save;
	}
	//-----------------//
	@FindBy(xpath = "//input[@id='collateralManagementGridTbl_Id_T014AP_gs_fmsCollateralVO.CODE']")
	private WebElement Approval_searchcode;
	public WebElement Approval_searchcode() {
		return Approval_searchcode;
	}
}
