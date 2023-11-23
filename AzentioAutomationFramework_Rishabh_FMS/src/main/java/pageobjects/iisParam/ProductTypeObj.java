package pageobjects.iisParam;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductTypeObj {

	WebDriver driver;

	public ProductTypeObj(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//td[normalize-space()='Product Type']")
	private WebElement iis_Product_Type_Module;

	public WebElement iisProductTypeModule() {
		return iis_Product_Type_Module;
	}
	
	@FindBy(xpath = "//a[@id='M030MT']//span[contains(text(),'Maintenance')]")
	private WebElement iis_Product_Type_Module_Maintenanace;

	public WebElement iisProductTypeModuleMaintenance() {
		return iis_Product_Type_Module_Maintenanace;
	}
	
	@FindBy(xpath = "//a[@id='M030L']//span[contains(text(),'List')]")
	private WebElement iis_Product_Type_Module_Maintenanace_List;

	public WebElement iisProductTypeModuleMaintenanceList() {
		return iis_Product_Type_Module_Maintenanace_List;
	}
	
	@FindBy(xpath = "//a[@id='M030P']//span[contains(text(),'Approve')]")
	private WebElement iis_Product_Type_Module_Maintenanace_Approve;

	public WebElement iisProductTypeModuleMaintenanceApprove() {
		return iis_Product_Type_Module_Maintenanace_Approve;
	}
	
	@FindBy(xpath = "//a//span[normalize-space()='Update After Authorize']")
	private WebElement iis_Product_Type_Module_Maintenanace_Update_And_Authorize;

	public WebElement iisProductTypeModuleMaintenanceUpdateAndAuthorize() {
		return iis_Product_Type_Module_Maintenanace_Update_And_Authorize;
	}
	
	@FindBy(xpath = "//a//span[normalize-space()='Reject']")
	private WebElement iis_Product_Type_Module_Maintenanace_Reject;

	public WebElement iisProductTypeModuleMaintenanceReject() {
		return iis_Product_Type_Module_Maintenanace_Reject;
	}
	
	@FindBy(xpath = "//div//input[@id='type_code_M030MT']")
	private WebElement iis_Product_Type_Module_Maintenanace_Code;

	public WebElement iisProductTypeModuleMaintenanceCode() {
		return iis_Product_Type_Module_Maintenanace_Code;
	}
	
	
	@FindBy(xpath = "//td//input[@id='brief_desc_eng_M030MT']")
	private WebElement iis_Product_Type_Module_Maintenanace_Brief_Description;

	public WebElement iisProductTypeModuleMaintenanceBriefDescription() {
		return iis_Product_Type_Module_Maintenanace_Brief_Description;
	}
	
	@FindBy(xpath = "//td//input[@id='long_desc_eng_M030MT']")
	private WebElement iis_Product_Type_Module_Maintenanace_Long_Description;

	public WebElement iisProductTypeModuleMaintenanceLongDescription() {
		return iis_Product_Type_Module_Maintenanace_Long_Description;
	}
	
	@FindBy(xpath = "//label[@id='productTypeFormId_M030MT_Save_key']")
	private WebElement iis_Product_Type_Module_Maintenanace_Save_Button;

	public WebElement iisProductTypeModuleMaintenanceSaveButton() {
		return iis_Product_Type_Module_Maintenanace_Save_Button;
	}
	
	@FindBy(xpath = "//label[@id='productTypeFormId_M030MT_Delete_key']")
	private WebElement iis_Delete_Btn;

	public WebElement iisDeleteBtn() {
		return iis_Delete_Btn;
	}
	
	@FindBy(xpath = "//a[@id='infoBarSearchButton_M030MT']")
	private WebElement iis_Search_Btn;

	public WebElement iisSearchBtn() {
		return iis_Search_Btn;
	}
	
	@FindBy(xpath = "//a[@id='infoBarSearchButton_M030MT']")
	private WebElement iis_Update_Btn;

	public WebElement iisUpdateBtn() {
		return iis_Update_Btn;
	}
	
	@FindBy(xpath = "//td[@id='td_trsProductTypeListGridTbl_Id_M030UP_1_trsProductTypeVO.TYPE_CODE']")
	private WebElement iis_URetrived_Rec;

	public WebElement iisURetrivedRec() {
		return iis_URetrived_Rec;
	}
	
	@FindBy(xpath = "//td[@id='td_trsProductTypeListGridTbl_Id_M030MT_1_trsProductTypeVO.TYPE_CODE']")
	private WebElement iis_Retrived_Rec;

	public WebElement iisRetrivedRec() {
		return iis_Retrived_Rec;
	}
	
	@FindBy(xpath = "//input[@id='trsProductTypeListGridTbl_Id_M030MT_gs_trsProductTypeVO.TYPE_CODE']")
	private WebElement iis_Type_Code_Feild;

	public WebElement iisTypecodeFeild() {
		return iis_Type_Code_Feild;
	}
	
	@FindBy(xpath = "//input[@id='trsProductTypeListGridTbl_Id_M030UP_gs_trsProductTypeVO.TYPE_CODE']")
	private WebElement iis_UType_Code_Feild;

	public WebElement iisUTypecodeFeild() {
		return iis_UType_Code_Feild;
	}
	
	
	
	@FindBy(xpath = "//a[@id='fbox_trsProductTypeListGridTbl_Id_M030MT_search']//span[@class='ui-icon ui-icon-search']")
	private WebElement iis_Sort_Find_Icon_Btn;

	public WebElement iisSortFindIconBtn() {
		return iis_Sort_Find_Icon_Btn;
	}
	
	

	
}
