package pageobjects.iisParam;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TargetMaintenanceObj {
	WebDriver driver;

	public TargetMaintenanceObj(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//td[normalize-space()='Target Maintenance']")
	private WebElement iis_Target_Maintenance_Module;

	public WebElement iisTargetMaintenanceModule() {
		return iis_Target_Maintenance_Module;
	}
	
	@FindBy(xpath = "//a[@id='M04MT']//span[contains(text(),'Maintenance')]")
	private WebElement iis_Target_Maintenance_Module_Maintenance;

	public WebElement iisTargetMaintenanceModuleMaintenance() {
		return iis_Target_Maintenance_Module_Maintenance;
	}
	
	@FindBy(xpath = "//input[@id='lookuptxt_trs_TargetVO_CLASS_M04MT']")
	private WebElement iis_Target_Maintenance_Policy_No_Feild;

	public WebElement iisTargetMaintenancePolicyNoFeild() {
		return iis_Target_Maintenance_Policy_No_Feild;
	}
	
	@FindBy(xpath = "//input[@id='lookuptxt_trs_TargetVO_COUNTRY_M04MT']")
	private WebElement iis_Target_Maintenance_Country_Feild;

	public WebElement iisTargetMaintenanceCountryFeild() {
		return iis_Target_Maintenance_Country_Feild;
	}
	
	@FindBy(xpath = "//input[@id='trs_TargetVO_YEAR_M04MT']")
	private WebElement iis_Target_Maintenance_Year_Feild;

	public WebElement iisTargetMaintenanceYearFeild() {
		return iis_Target_Maintenance_Year_Feild;
	}
	
	@FindBy(xpath = "//span//label[@id='trsTargetMaintenanceFormId_M04MT_Save_key']")
	private WebElement iis_Target_Maintenance_Save_Btn;

	public WebElement iisTargetMaintenancesaveBtn() {
		return iis_Target_Maintenance_Save_Btn;
	}
	
	@FindBy(xpath = "//*[@id='_popup_path_sol_confirm_ok']")
	private WebElement iis_Target_Maintenance_Confirm_Ok_Btn;

	public WebElement iisTargetMaintenanceConfirmOkBtn() {
		return iis_Target_Maintenance_Confirm_Ok_Btn;
	}
	
	
	
	@FindBy(xpath = "//*[@id=\"_popup_path_sol_ok\"]")
	private WebElement iis_Target_Maintenance_Succesfull_Ok_Btn;

	public WebElement iisTargetMaintenanceSuccesfullOkBtn() {
		return iis_Target_Maintenance_Succesfull_Ok_Btn;
	}
	
	
	
	@FindBy(xpath = "//*[@id='trsTargetMaintenanceFormId_M04MT_Update_key']")
	private WebElement iis_Target_Maintenance_Update_Succesfull;

	public WebElement iisTargetMaintenanceUpdateSuccesfull() {
		return iis_Target_Maintenance_Update_Succesfull;
	}
	
	@FindBy(xpath = "//a[@id='infoBarSearchButton_M04MT']")
	private WebElement iis_Target_Maintenance_Search_Btn;

	public WebElement iisTargetMaintenanceSearchBtn() {
		return iis_Target_Maintenance_Search_Btn;
	}
	
	
	@FindBy(xpath = "//input[@id='tRSTargetMaintenanceListGridTbl_Id_M04MT_gs_trs_TargetVO.CLASS']")
	private WebElement iis_Target_Maintenance_Class_Code_Feild;

	public WebElement iisTargetMaintenanceClassCodeFeild() {
		return iis_Target_Maintenance_Class_Code_Feild;
	}
	
	
	@FindBy(xpath = "//td[@id='td_tRSTargetMaintenanceListGridTbl_Id_M04MT_1_trs_TargetVO.CLASS']")
	private WebElement iis_Target_Maintenance_Class_Rec;

	public WebElement iisTargetMaintenanceClassRec() {
		return iis_Target_Maintenance_Class_Rec;
	}
	
	@FindBy(xpath = "//*[@id=\"trsTargetMaintenanceFormId_M04MT_Update_key\"]")
	private WebElement iis_Target_Maintenance_Update_Btn;

	public WebElement iisTargetMaintenanceUpdateBtn() {
		return iis_Target_Maintenance_Update_Btn;
	}
	
	
	
	@FindBy(xpath = "//label[@id='trsTargetMaintenanceFormId_M04MT_Delete_key']")
	private WebElement iis_Target_Maintenance_Delete_Btn;

	public WebElement iisTargetMaintenanceDeleteBtn() {
		return iis_Target_Maintenance_Delete_Btn;
	}
	
	
	@FindBy(xpath = "//tbody//td[@id='td_tRSTargetMaintenanceListGridTbl_Id_M04MT_1_trs_TargetVO.CLASS']")
	////tr[@class='ui-widget-content jqgrow ui-row-ltr']/td
	private WebElement iis_Target_Maintenance_policy_Rec;

	public WebElement iisTemplateMaintenancePolicyRec() {
		return iis_Target_Maintenance_policy_Rec;
	}
	//input[@id='_popup_path_sol_ok']
	@FindBy(xpath = "//input[@id='_popup_path_sol_ok']")
	private WebElement iis_Target_Maintenenace_Error_Pop_Up_Ok_btn;

	public WebElement iisTargetMaintenenaceErrorPopUpOkBtn() {
		return iis_Target_Maintenenace_Error_Pop_Up_Ok_btn;
	}
	
	
	
	@FindBy(xpath = "//span[normalize-space()='List']")
	private WebElement iis_Target_Maintenenace_List;

	public WebElement iisTargetMaintenenaceList() {
		return iis_Target_Maintenenace_List;
	}
	
	
	@FindBy(xpath = "//span[normalize-space()='Approve']")
	private WebElement iis_Target_Maintenenace_Approve;

	public WebElement iisTargetMaintenenaceApprove() {
		return iis_Target_Maintenenace_Approve;
	}
	
	//span[@class='ui-icon ui-icon-close ui-icon-close-tabs-custom']
}
