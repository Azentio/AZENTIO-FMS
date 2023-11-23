package pageobjects.iisParam;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ControlRecordObj {
	WebDriver driver;

	public ControlRecordObj(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// parameter menu tab
	@FindBy(xpath = "//td[normalize-space()='Parameters']")
	private WebElement iis_Parameter_tab;

	public WebElement iisParametertab() {
		return iis_Parameter_tab;
	}

	// control record module
	@FindBy(xpath = "//td[normalize-space()='Control Record']")
	private WebElement iis_Control_Record_module;

	public WebElement iisControlRecordmodule() {
		return iis_Control_Record_module;
	}

	// control record maintenance
	@FindBy(xpath = "//span[normalize-space()='CONTROL RECORD MAINTENANCE']")
	private WebElement iis_Control_Record_maintenance;

	public WebElement iisControlRecordmaintenance() {
		return iis_Control_Record_maintenance;
	}

	// JV and printing tab || iisControlRecordJVAndPrinting_C00MT
	@FindBy(xpath = "//span[normalize-space()='JV and Printing']")
	private WebElement iis_Control_Record_JV_And_Printing_C00MT;

	public WebElement iisControlRecordJVAndPrinting_C00MT() {
		return iis_Control_Record_JV_And_Printing_C00MT;
	}

	// customize JV description button ||
	// iiSControlRecordCustomizedJVDescription_C00MT
	@FindBy(xpath = "//label[@id='iISControlRecordMaintFormId_C00MT_customized_jv_desc_key']")
	private WebElement iis_Control_Record_Customized_JV_Description_C00MT;

	public WebElement iisControlRecordCustomizedJVDescription_C00MT() {
		return iis_Control_Record_Customized_JV_Description_C00MT;
	}

	// add btn\icon ||
	//td[@id='add_iISControlRecordJvAndPrintCustomizedJVDescGrid_Id_C00MT']//span
	@FindBy(xpath = "//td[@id='add_iISControlRecordJvAndPrintCustomizedJVDescGrid_Id_C00MT']//span")
	private WebElement add_iis_Control_Record_Jv_And_Print_Customized_JV_Desc_Grid_Id_C00MT;

	public WebElement add_iisControlRecordJvAndPrintCustomizedJVDescGrid_Id_C00MT() {
		return add_iis_Control_Record_Jv_And_Print_Customized_JV_Desc_Grid_Id_C00MT;
	}

	// settlement JV description input field || new added row
	@FindBy(xpath = "//tr[@added=\"1\"]//td[@id='td_iISControlRecordJvAndPrintCustomizedJVDescGrid_Id_C00MT_1_iisctrlJvDescriptionsVO.TRS_TYPE']")
	private WebElement iis_Control_Record_Jv_And_Print_Customized_JV_Desc_Grid_Id_C00MT;

	public WebElement iisControlRecordJvAndPrintCustomizedJVDescGrid_Id_C00MT() {
		return iis_Control_Record_Jv_And_Print_Customized_JV_Desc_Grid_Id_C00MT;
	}

	// ok button
	@FindBy(xpath = "//span[normalize-space()='OK']")
	private WebElement iis_jv_And_Print_Customized_JV_Desc_save_btn_C00MT;

	public WebElement iisjvAndPrintCustomizedJVDesc_save_btn_C00MT() {
		return iis_jv_And_Print_Customized_JV_Desc_save_btn_C00MT;
	}

	//JV description table 
	
	@FindBy(xpath = "//table[@id='iISControlRecordJvAndPrintCustomizedJVDescGrid_Id_C00MT']//tbody")
	private WebElement iis_Control_Record_Jv_And_Print_Customized_JV_Desc_Grid_Id_Table_C00MT;

	public WebElement iisControlRecordJvAndPrintCustomizedJVDescGrid_Id_Table_C00MT() {
		return iis_Control_Record_Jv_And_Print_Customized_JV_Desc_Grid_Id_Table_C00MT;
	}
	
	//TRX DropDown
	@FindBy(xpath = "//tr[@added='1']//td[@id='td_iISControlRecordJvAndPrintCustomizedJVDescGrid_Id_C00MT_1_iisctrlJvDescriptionsVO.TRS_TYPE']//select")
	private WebElement iis_Control_Record_Jv_And_Print_Customized_JV_Desc_Grid_Id_DropDown_C00MT;

	public WebElement iisControlRecordJvAndPrintCustomizedJVDescGrid_Id_DropDown_C00MT() {
		return iis_Control_Record_Jv_And_Print_Customized_JV_Desc_Grid_Id_DropDown_C00MT;
	}
	
    //Description input field
	
	@FindBy(xpath = "//tr[@added='1']//descendant::td[5]/descendant::input")
	private WebElement iis_Control_Record_Jv_And_Print_Customized_JV_Desc_Grid_Id_C00MT_iisctrlJvDescriptionsVO_DESCRIPTION;

	public WebElement iisControlRecordJvAndPrintCustomizedJVDescGrid_Id_C00MT_iisctrlJvDescriptionsVO_DESCRIPTION() {
		return iis_Control_Record_Jv_And_Print_Customized_JV_Desc_Grid_Id_C00MT_iisctrlJvDescriptionsVO_DESCRIPTION;
	}
	
	//AT_IISPRM_023-----------------------------------------------------------------------------------------------------------------------
	
	//General Tab
	@FindBy(xpath = "//span[normalize-space()='General Information']")
	private WebElement iis_Product_Class_General_Information_M003MT;

	public WebElement iisProductClassGeneralInformation_M003MT() {
		return iis_Product_Class_General_Information_M003MT;
	}
	
	//Profit Calculation
	@FindBy(xpath = "//span[normalize-space()='Profit Calculation']")
	private WebElement iis_Product_Class_General_Information_Profit_Calculation_M003MT;

	public WebElement iisProductClassGeneralInformationProfitCalculation_M003MT() {
		return iis_Product_Class_General_Information_Profit_Calculation_M003MT;
	}
	
	//Checkbox Class Recognize Profit Up Front
	@FindBy(xpath = "//input[@id='iisProductClassRecognizeProfitUpFront_M003MT']")
	private WebElement iis_Product_Class_Recognize_Profit_Up_Front_M003MT;

	public WebElement iisProductClassRecognizeProfitUpFront_M003MT() {
		return iis_Product_Class_Recognize_Profit_Up_Front_M003MT;
	}
	
	
}
