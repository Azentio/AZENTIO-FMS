package pageobjects.fmsParam;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Control_RecordsObj {
	
//	@AT_AFF_075
	WebDriver driver;
	public Control_RecordsObj(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//td[text()='Parameters']")
	private WebElement fms_param_parameter;
	public WebElement fmsParamParameter() {
		return fms_param_parameter;
	}
	
	@FindBy(xpath = "//td[text()='Control Record']")
	private WebElement param_control_records;
	public WebElement paramControlRecords() {
		return param_control_records;
	}
	
	@FindBy(xpath = "//a[@id='P007UP']")
	private WebElement control_records_update_after_approve;
	public WebElement controlRecordsUpdateAfterApprove() {
		return control_records_update_after_approve;
	}

	@FindBy(xpath = "//input[@id='officer_assigned_required_P007UP']")
	private WebElement main_info_officer_assign_req_check;
	public WebElement mainInfoOfficerAssignReqCheck() {
		return main_info_officer_assign_req_check;
	}
	
	@FindBy(xpath = "//label[@id='fmsControlRecordMaintFormId_P007UP_officer_assigned_required_key']")
	private WebElement main_info_officer_assign_req_label;
	public WebElement mainInfoOfficerAssignReqLabel() {
		return main_info_officer_assign_req_label;
	}
	
	
	@FindBy(xpath = "//input[@id='enable_markup_type_P007UP']")
	private WebElement main_info_enable_markup_check;
	public WebElement mainInfoEnableMarkupCheck() {
		return main_info_enable_markup_check;
	}
	
	@FindBy(xpath = "//label[@id='lbl_enable_markup_type_P007UP']")
	private WebElement main_info_enable_markup_label;
	public WebElement mainInfoEnableMarkupLabel() {
		return main_info_enable_markup_label;
	}
	
	@FindBy(xpath = "//li[@id='controlRecordOfficerAssignedTabs_P007UP']")
	private WebElement update_after_role_of_officers_assigned;
	public WebElement updateAfterRoleOfOfficersAssigned() {
		return update_after_role_of_officers_assigned;
	}
	
	@FindBy(xpath = "//li[@id='controlRecordPartysRecordWithCompanyTabs_P007UP']")
	private WebElement update_after_partys_history;
	public WebElement updateAfterPartysHistory() {
		return update_after_partys_history;
	}
	
	@FindBy(xpath = "//li[@id='controlRecordMemberPartyTabs_P007UP']")
	private WebElement update_after_memeber_countries;
	public WebElement updateAferMemberCountries() {
		return update_after_memeber_countries;
	}
	
	@FindBy(xpath = "//button[@id='fmsControlRecordMaint_update_P007UP']")
	private WebElement update_after_update_btn;
	public WebElement updateAfterUpdateBtn() {
		return update_after_update_btn;
	}
	
	@FindBy(xpath = "//input[@id='_popup_path_sol_confirm_ok']")
	private WebElement button_confirm_ok;
	public WebElement ButtonConfirmOk() {
		return button_confirm_ok;
	}
	
	@FindBy(xpath = "//input[@id='_popup_path_sol_ok']")
	private WebElement button_success_ok;
	public WebElement ButtonSuccessOk() {
		return button_success_ok;
	}
	
	@FindBy(xpath = "//a[@id='P007P']")
	private WebElement control_records_approve;
	public WebElement controlRecordsApprove() {
		return control_records_approve;
	}
	
	@FindBy(xpath = "//button[@id='fmsControlRecordMaint_approve_P007P']" )
	private WebElement approve_button;
	public WebElement approveButton() {
		return approve_button;
	}
	
	// @AT_AFF_074
	@FindBy(xpath = "//td[@id='add_FMSControlRecordMemberCountryGrid_P007UP']")
	private WebElement memeber_coutries_add_new_row_btn;
	public WebElement memberCountriesAddNewRowBtn() {
		return memeber_coutries_add_new_row_btn;
	}
	
	@FindBy(xpath = "(//td[@id='td_FMSControlRecordMemberCountryGrid_P007UP_1_fmsCtrlDetVO.COUNTRY_CODE'])[2]")
	private WebElement country_code_label;
	public WebElement countryCodeLabel() {
		return country_code_label;
	}
	
	@FindBy(xpath = "//input[@name='lookupTxt_fmsCtrlDetVO.COUNTRY_CODE']")
	private WebElement country_code;
	public WebElement countryCode() {
		return country_code;
	}
	
	@FindBy(xpath = "(//td[@id='td_FMSControlRecordMemberCountryGrid_P007UP_1_membershipType'])[2]")
	private WebElement membership_type_label;
	public WebElement membershipTypeLabel() {
		return membership_type_label;
	}
	
	@FindBy(xpath = "//select[@id='new_1684297250771_membershipType']")
	private WebElement membership_type_dropdown;
	public WebElement membershipTypeDropDown() {
		return membership_type_dropdown;
	}

	
}
