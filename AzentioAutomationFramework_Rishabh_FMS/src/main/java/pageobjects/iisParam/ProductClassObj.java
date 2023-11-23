package pageobjects.iisParam;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductClassObj {
	WebDriver driver;

	public ProductClassObj(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Parameter Tab
	@FindBy(xpath = "//td[normalize-space()='Parameters']")
	private WebElement iis_Parameter_tab;

	public WebElement iisParametertab() {
		return iis_Parameter_tab;
	}

	// product Class Module
	@FindBy(xpath = "//td[normalize-space()='Product Class']")
	private WebElement iis_Product_Class_Module;

	public WebElement iisProductClassModule() {
		return iis_Product_Class_Module;
	}

	// Maintenance screen
	@FindBy(xpath = "//span[normalize-space()='Maintenance']")
	private WebElement iis_Product_Class_Maintenance;

	public WebElement iisProductClassMaintenance() {
		return iis_Product_Class_Maintenance;
	}

	// iisProductClassAdditionalInformation_M003MT
	@FindBy(xpath = "//li[@id='iisProductClassAdditionalInformation_M003MT']")
	private WebElement iis_Product_Class_Additional_Information_M003MT;

	public WebElement iisProductClassAdditionalInformation_M003MT() {
		return iis_Product_Class_Additional_Information_M003MT;
	}

	// iisProductClassAdditionalInformationRepaymentPlan_M003MT
	@FindBy(xpath = "//span[normalize-space()='Repayment Plan']")
	private WebElement iis_Product_Class_Additional_Information_Repayment_Plan_M003MT;

	public WebElement iisProductClassAdditionalInformationRepaymentPlan_M003MT() {
		return iis_Product_Class_Additional_Information_Repayment_Plan_M003MT;
	}

	// iisproductclassCO.trsclassVO.GRACE_PERIOD_MAX_NBR
	@FindBy(xpath = "//input[@id='iisProductClassMaxGracePeriod_M003MT']")
	private WebElement iis_product_classCO_trsclassVO_GRACE_PERIOD_MAX_NBR;

	public WebElement iisproductclassCOtrsclassVOGRACE_PERIOD_MAX_NBR() {
		return iis_product_classCO_trsclassVO_GRACE_PERIOD_MAX_NBR;
	}

	// iis_product_classCO_trsclassVO_GRACE_PERIOD_MAX_TYPE
	@FindBy(xpath = "//select[@id='iisProductClassMaxGracePeriod2_M003MT']")
	private WebElement iis_product_classCO_trsclassVO_GRACE_PERIOD_MAX_TYPE;

	public WebElement iisproductclassCOtrsclassVOGRACE_PERIOD_MAX_TYPE() {
		return iis_product_classCO_trsclassVO_GRACE_PERIOD_MAX_TYPE;
	}

	// ------022----

	@FindBy(xpath = "//input[@name='iisproductclassCO.trsclassVO.CODE']")
	private WebElement productclasscode;

	public WebElement productclasscode() {
		return productclasscode;
	}

	@FindBy(xpath = "//input[@name='iisproductclassCO.trsclassVO.LONG_NAME_ENG']")
	private WebElement longdescription;

	public WebElement longdescription() {
		return longdescription;
	}

	@FindBy(xpath = "//input[@name='iisproductclassCO.trsclassVO.BRIEF_NAME_ENG']")
	private WebElement briefdescription;

	public WebElement briefdescription() {
		return briefdescription;

	}

	@FindBy(xpath = "//input[@id='lookuptxt_iisProductClassCategory_M003MT']")
	private WebElement category;

	public WebElement category() {
		return category;

	}

	@FindBy(xpath = "//span[@id='spanLookup_iisProductClassCategory_M003MT']")
	private WebElement categorysearch;

	public WebElement categorysearch() {
		return categorysearch;
	}

	

	@FindBy(xpath = "//input[@name='iisproductclassCO.trsclassVO.EXPOSURE_LIMIT']")
	private WebElement exposurelimit;

	public WebElement exposurelimit() {
		return exposurelimit;
	}

	@FindBy(xpath = "//a[@title='Additional Information (2)']")
	private WebElement additionalinfo;

	public WebElement additionalinfo() {
		return additionalinfo;
	}

	@FindBy(xpath = "//a[@title='Allocation & Others']")
	private WebElement allocationandothers;

	public WebElement allocationandothers() {
		return allocationandothers;

	}

	@FindBy(xpath = "//input[@id='project_finance_deal_M003MTY']")
	private WebElement projectfinance;

	public WebElement projectfinance() {
		return projectfinance;
	}

	@FindBy(xpath = "//label[@id='iisProductClassMaintFormId_M003MT_Save_key']")
	private WebElement productclasssavebutton;

	public WebElement productclasssavebutton() {
		return productclasssavebutton;
	}
	
	@FindBy(xpath = "//label[@id='iisProductClassMaintFormId_M003MT_Save_key']")
	private WebElement iisProduct_General_Information;

	public WebElement iisProductGeneralInformation() {
		return iisProduct_General_Information;
	}
	
	@FindBy(xpath = "//*[@id=\"_popup_path_sol_ok\"]")
	private WebElement Warning_Pop_Up;

	public WebElement WarningPopUp() {
		return Warning_Pop_Up;
	}
	
		
	@FindBy(xpath = "//a[@id='infoBarSearchButton_M003MT']")
	private WebElement iisProduct_Class_Info_Bar_Search_Button_M003MT;

	public WebElement iisProductClassinfoBarSearchButton_M003MT() {
		return iisProduct_Class_Info_Bar_Search_Button_M003MT;
	}
	
	
	
	//*[@id="div__popup_path_sol_ok"]
	
	
	
	@FindBy(xpath = "//input[@id='iISProductClassListGridTbl_Id_M003MT_gs_trsctrlclassVO.CLASS']")
	private WebElement iisProduct_Class_Field;

	public WebElement iisProductClassField() {
		return iisProduct_Class_Field;
	}
	
	@FindBy(xpath = "//tr[@id='1']")
	private WebElement iisProduct_Retrived_Record;

	public WebElement iisProductRetrivedRecord() {
		return iisProduct_Retrived_Record;
	}
	
	@FindBy(xpath = "//a[@title='Profit Calculation']")
	private WebElement profitcalculation;

	public WebElement profitcalculation() {
		return profitcalculation;
	}
	
	@FindBy(xpath = "//input[@id='iisProductClassRecognizeProfitUpFront_M003MT']")
	private WebElement Recognize_Profit_Up_Front_Flag;

	public WebElement RecognizeProfitUpFrontFlag() {
		return Recognize_Profit_Up_Front_Flag;
	}
	
	
	@FindBy(xpath = "//span[normalize-space()='Additional Information (2)']")
	private WebElement iisProduct_Additional_Information_Two;

	public WebElement iisProductAdditionalInformationTwo() {
		return iisProduct_Additional_Information_Two;
	}
	
	
	
	@FindBy(xpath = "//input[@id='iisProductClassDisableReimburseEntryYN_M003MT']")
	private WebElement iis_Product_Class_Disable_Reimburse_Entry_YN_M003MT;

	public WebElement iisProductClassDisableReimburseEntryYN_M003MT() {
		return iis_Product_Class_Disable_Reimburse_Entry_YN_M003MT;
	}
	
	
	@FindBy(xpath = "//label[@id='lbl_iisProductClassDisableReimburseEntryYN_M003MT']")
	private WebElement iis_Product_Class_Disable_Reimburse_Entry_YN_Feild_M003MT;

	public WebElement iisProductClassDisableReimburseEntryYNFeild_M003MT() {
		return iis_Product_Class_Disable_Reimburse_Entry_YN_Feild_M003MT;
	}
	
	@FindBy(xpath = "//label[@id='iisProductClassMaintFormId_M003MT_Save_key']")
	private WebElement iis_Product_Class_Maint_Form_Id_M003MT_Save_key;

	public WebElement iisProductClassMaintFormId_M003MT_Save_key() {
		return iis_Product_Class_Maint_Form_Id_M003MT_Save_key;
	}
	
	@FindBy(xpath = "//*[@id=\"_popup_path_sol_confirm_ok\"]")
	private WebElement iis_Product_Class_Maint_Form_Popup_confirm_Save_Btn;

	public WebElement iisProductClassMaintFormPopupconfirmSaveBtn() {
		return iis_Product_Class_Maint_Form_Popup_confirm_Save_Btn;
	}

	
	
	@FindBy(xpath = "//*[@id=\"_popup_path_sol_ok\"]")
	private WebElement iis_Product_Class_Maint_Form_Popup_Update_confirm_Save_Btn;

	public WebElement iisProductClassMaintFormPopupUpdateconfirmSaveBtn() {
		return iis_Product_Class_Maint_Form_Popup_Update_confirm_Save_Btn;
	}
	
	

	@FindBy(xpath = "//b[normalize-space()='Early Settlement']")
	private WebElement iis_Product_Class_Maint_Early_Settlement;

	public WebElement iisProductClassMaintEarlySettlementFeild() {
		return iis_Product_Class_Maint_Early_Settlement;
	}
	
	//@AT_IISPRM_031_____________________________________________________________________________________________________________________
	
	@FindBy(xpath = "//input[@id='iisProductClassLockPeriodPercentage_M003MT']")
	private WebElement iis_Product_Class_Lock_Period_Percentage_M003MT;

	public WebElement iisProductClassLockPeriodPercentage_M003MT() {
	return iis_Product_Class_Lock_Period_Percentage_M003MT;
	}
	
	
	@FindBy(xpath = "//div[@class='jMsgbox-contentWrap']")
	private WebElement iis_Product_Class_Lock_Period_Percentage_Error_Pop_UpM003MT;

	public WebElement iisProductClassLockPeriodPercentageErrorPopUp_M003MT() {
	return iis_Product_Class_Lock_Period_Percentage_Error_Pop_UpM003MT;
	}
	
	
	@FindBy(xpath = "//input[@id='_popup_path_sol_ok']")
	private WebElement iis_Product_Class_Lock_Period_Percentage_Pop_Up_Ok_Btn_M003MT;

	public WebElement iisProductClassLockPeriodPercentagePopUpBtn_M003MT() {
	return iis_Product_Class_Lock_Period_Percentage_Pop_Up_Ok_Btn_M003MT;
	}
	
	@FindBy(xpath = "//select[@id='iisProductClassLIPCalculationType_M003MT']")
	private WebElement iis_Product_Class_LIP_Calculation_Type_Drop_Down_M003MT;

	public WebElement iisProductClassLIPCalculationTypeDropDown_M003MT() {
	return iis_Product_Class_LIP_Calculation_Type_Drop_Down_M003MT;
	}
	
}


