package pageobjects.MTS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MTS_ApplicationObj_608 {
	
	WebDriver driver;
	public MTS_ApplicationObj_608(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
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
	private WebElement MTS_process_module;
	public WebElement MTSProcessModule_608() {
		return MTS_process_module;
	}
	
	@FindBy(xpath = "//td[text()='Batch Process']")
	private WebElement MTS_process_batch_process_menu;
	public WebElement MTSProcessBatchProcessMenu_608() {
		return MTS_process_batch_process_menu;
	}	
		
	@FindBy(xpath = "//span[text()='Batch Run']")
	private WebElement MTS_process_batch_process_menu_batch_run;
	public WebElement MTSProcessBatchProcessMenuBatchRun_608() {
		return MTS_process_batch_process_menu_batch_run;
	}
		
	@FindBy(xpath = "//input[contains(@id,'runningDate')]")
	private WebElement MTS_process_batch_process_menu_batch_run_Date;
	public WebElement MTSProcessBatchProcessMenuBatchRunDate_608() {
		return MTS_process_batch_process_menu_batch_run_Date;
	}
	
	@FindBy(xpath = "//button[contains(@id,'batchRun_Btn_Run')]")
	private WebElement MTS_process_batch_process_menu_batch_run_opt_run_btn;
	public WebElement MTSProcessBatchProcessMenuBatchRunOptRunBtn_608() {
		return MTS_process_batch_process_menu_batch_run_opt_run_btn;
	}
	
	
	
	
	
}
