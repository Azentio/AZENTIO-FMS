package pageobjects.fms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CollateralManagement_482_Obj {
	WebDriver driver;
	public CollateralManagement_482_Obj(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@id='collateralManagementBriefNameEng_WIFT007MT']")
	private WebElement collateralTypeNameValidation_WF_482;
	public WebElement collateralTypeNameValidation_WF_482() {
		return collateralTypeNameValidation_WF_482;
	}
	
	@FindBy(xpath="//input[@id='lookuptxt_collateralManagementCollateralType_WIFT007MT']")
	private WebElement collateralType_WF_482;
	public WebElement collateralType_WF_482() {
		return collateralType_WF_482;
	}
	
	@FindBy(xpath="//input[@id='fmscollateralValidFrom_WIFT007MT']")
	private WebElement validFromDate_CollateralManagement_WF_482;
	public WebElement validFromDate_CollateralManagement_WF_482() {
		return validFromDate_CollateralManagement_WF_482;
	}
	
	@FindBy(xpath="//span[@id='hdr_runn_date']")
	private WebElement system_RunningDate_482;
	public WebElement system_RunningDate_482() {
		return system_RunningDate_482;
	}
	
	@FindBy(xpath="//input[@id='fmscollateralValidTo_WIFT007MT']")
	private WebElement validToDate_CollateralManagement_WF_482;
	public WebElement validToDate_CollateralManagement_WF_482() {
		return validToDate_CollateralManagement_WF_482;
	}
	
	@FindBy(xpath="//input[@id='fmscollateralBriefNameEng_WIFT007MT']")
	private WebElement briefDescription_CollateralManagement_WF_482;
	public WebElement briefDescription_CollateralManagement_WF_482() {
		return briefDescription_CollateralManagement_WF_482;
	}
	
	@FindBy(xpath="//input[@id='lookuptxt_fmscollateralCurrency_WIFT007MT']")
	private WebElement collateralCurrency_CollateralManagement_WF_482;
	public WebElement collateralCurrency_CollateralManagement_WF_482() {
		return collateralCurrency_CollateralManagement_WF_482;
	}
	
	@FindBy(xpath="//div[@id='_selenuimWIFT007']//td[text()='Collateral Management']")
	private WebElement CollateralManagement_WF_482;
	public WebElement CollateralManagement_WF_482() {
		return CollateralManagement_WF_482;
	}
	
	@FindBy(xpath="//a[@id='WIFT007MT']")
	private WebElement MaintenanceScreen_CollateralManagement_WF_482;
	public WebElement MaintenanceScreen_CollateralManagement_WF_482() {
		return MaintenanceScreen_CollateralManagement_WF_482;
	}
	
	@FindBy(xpath="//input[@id='fmscollateralLongNameEng_WIFT007MT']")
	private WebElement longDescription_CollateralManagement_WF_482;
	public WebElement longDescription_CollateralManagement_WF_482() {
		return longDescription_CollateralManagement_WF_482;
	}
	
	@FindBy(xpath="//input[@id='fmscollateralCurrency_Brief_Desc_Eng_WIFT007MT']")
	private WebElement collateralCurrencyNameValidation_CollateralManagement_WF_482;
	public WebElement collateralCurrencyNameValidation_CollateralManagement_WF_482() {
		return collateralCurrencyNameValidation_CollateralManagement_WF_482;
	}
	
	@FindBy(xpath="//span[text()='Custom Fields']")
	private WebElement customFieldsTab_CollateralManagement_WF_482;
	public WebElement customFieldsTab_CollateralManagement_WF_482() {
	return customFieldsTab_CollateralManagement_WF_482;
	}
	
	@FindBy(xpath="//input[@id='txt_fmsColTypeCustFieldVO_0_WIFT007MT']")
	private WebElement testCustomField_CollateralManagement_WF_482;
	public WebElement testCustomField_CollateralManagement_WF_482() {
		return testCustomField_CollateralManagement_WF_482;
	}
	
	@FindBy(xpath="//li[@id='collateralManagementPropertyDetailsTabs_WIFT007UP']")
	private WebElement propertyOwnerDetails_UpdateAfterApprove_CollateralManagement_WF_482;
	public WebElement propertyOwnerDetails_UpdateAfterApprove_CollateralManagement_WF_482() {
		return propertyOwnerDetails_UpdateAfterApprove_CollateralManagement_WF_482;
	}
	
	@FindBy(xpath="//li[@id='collateralManagementPropertyDetailsTabs_WIFT007MT']")
	private WebElement propertyOwnerDetails_MaintenanceScreen_CollateralManagement_WF_482;
	public WebElement propertyOwnerDetails_MaintenanceScreen_CollateralManagement_WF_482() {
		return propertyOwnerDetails_MaintenanceScreen_CollateralManagement_WF_482;
	}
	
	@FindBy(xpath="//td[@id='td_CollateralManagementPropertyDetailsGrid_WIFT007MT_1_fmsColPrptyDetVO.NAME']")
	private WebElement clickToAddPropertyDetails_Maintenance_CollateralManagement_WF_482;
	public WebElement clickToAddPropertyDetails_Maintenance_CollateralManagement_WF_482() {
		return clickToAddPropertyDetails_Maintenance_CollateralManagement_WF_482;
	}
	
	@FindBy(xpath="(//td[@id='td_CollateralManagementPropertyDetailsGrid_WIFT007UP_1_fmsColPrptyDetVO.NAME'])[2]")
	private WebElement clickToAddPropertyDetails_UpdateAfterApprove_CollateralManagement_WF_482;
	public WebElement clickToAddPropertyDetails_UpdateAfterApprove_CollateralManagement_WF_482() {
		return clickToAddPropertyDetails_UpdateAfterApprove_CollateralManagement_WF_482;
	}
	@FindBy(xpath="(//td[@id='td_CollateralManagementPropertyDetailsGrid_WIFT007UP_1_fmsColPrptyDetVO.NAME'])[3]")
	private WebElement clickToAddPropertyDetails2_UpdateAfterApprove_CollateralManagement_WF_482;
	public WebElement clickToAddPropertyDetails2_UpdateAfterApprove_CollateralManagement_WF_482() {
		return clickToAddPropertyDetails2_UpdateAfterApprove_CollateralManagement_WF_482;
	}
	
	@FindBy(xpath="//input[@name='lookupTxt_fmsColPrptyDetVO.NAME']")
	private WebElement name_PropertyOwnerDetails_WF_482;
	public WebElement name_PropertyOwnerDetails_WF_482() {
		return name_PropertyOwnerDetails_WF_482;
	}
	
	@FindBy(xpath="//input[@name='lookupTxt_fmsColPrptyDetVO.COUNTRY_CODE']")
	private WebElement countryCode_PropertyOwnerDetails_WF_482;
	public WebElement countryCode_PropertyOwnerDetails_WF_482() {
		return countryCode_PropertyOwnerDetails_WF_482;
	}
	
	@FindBy(xpath="//li[@id='collateralManagementAdditionDetailsTabs_WIFT007MT']")
	private WebElement AdditionalDetails_CollateralManagement_WF_482;
	public WebElement AdditionalDetails_CollateralManagement_WF_482() {
		return AdditionalDetails_CollateralManagement_WF_482;
	}
	
	@FindBy(xpath="//input[@id='fmscollateralAcceptValue_WIFT007MT']")
	private WebElement fcValuedsf_AdditionalDetails_WF_482;
	public WebElement fcValuedsf_AdditionalDetails_WF_482() {
		return fcValuedsf_AdditionalDetails_WF_482;
	}
	
	@FindBy(xpath="//input[@id='fmscollateralMarketValue_WIFT007MT']")
	private WebElement marketFCValue_AdditionalDetails_WF_482;
	public WebElement marketFCValue_AdditionalDetails_WF_482() {
		return marketFCValue_AdditionalDetails_WF_482;
	}
	
	@FindBy(xpath="//input[@id='fmscollateralDateAccepted_WIFT007MT']")
	private WebElement dateAccepted_AdditionalDetails_WF_482;
	public WebElement dateAccepted_AdditionalDetails_WF_482() {
		return dateAccepted_AdditionalDetails_WF_482;
	}
	
	@FindBy(xpath="//input[@id='fmscollateralMarketValuationDate_WIFT007MT']")
	private WebElement valuationDate_AdditionalDetails_WF_482;
	public WebElement valuationDate_AdditionalDetails_WF_482() {
		return valuationDate_AdditionalDetails_WF_482;
	}
	
	@FindBy(xpath="//a[text()='WIFAK APPLICATION / WIFAK APPLICATION / Collateral Management / Maintenance']/parent::td/following-sibling::td//span")
	private WebElement closeWIFAKAPPCollateralMaintenance_WF_482;
	public WebElement closeWIFAKAPPCollateralMaintenance_WF_482() {
		return closeWIFAKAPPCollateralMaintenance_WF_482;
	}
	
	@FindBy(xpath="//td[@id='add_CollateralManagementPropertyDetailsGrid_WIFT007UP")
	private WebElement addIcon_PropertyOwnerDetails_UpdateAfterApprove_WF_482;
	public WebElement addIcon_PropertyOwnerDetails_UpdateAfterApprove_WF_482() {
		return addIcon_PropertyOwnerDetails_UpdateAfterApprove_WF_482;
	}
	
	@FindBy(xpath="//td[@id='del_CollateralManagementPropertyDetailsGrid_WIFT007UP']")
	private WebElement deleteIcon_PropertyOwnerDetails_UpdateAfterApprove_WF_482;
	public WebElement deleteIcon_PropertyOwnerDetails_UpdateAfterApprove_WF_482() {
		return deleteIcon_PropertyOwnerDetails_UpdateAfterApprove_WF_482;
	}
	@FindBy(xpath="//td[@id='add_CollateralManagementPropertyDetailsGrid_WIFT007MT']")
	private WebElement addIcon_PropertyOwnerDetails_WF_482;
	public WebElement addIcon_PropertyOwnerDetails_WF_482() {
		return addIcon_PropertyOwnerDetails_WF_482;
	}
	@FindBy(xpath="//input[@id='lookuptxt_fmscollateralCif_WIFT007MT']")
	private WebElement cifNo_CollateralManagement_WF_482;
	public WebElement cifNo_CollateralManagement_WF_482() {
		return cifNo_CollateralManagement_WF_482;
	}
	@FindBy(xpath = "//div[text()='Success']/parent::div/following-sibling::div/div")
	private WebElement getRequestIdInCollateralManagementScreen_WIFAK;
	public WebElement getRequestIdInCollateralManagementScreen_WIFAK() {
		return getRequestIdInCollateralManagementScreen_WIFAK;
	}
	@FindBy(xpath = "//a[@id='WIFT007AP']")
	private WebElement approveScreenInCollateralManagementScreen_WIFAK;

	public WebElement approveScreenInCollateralManagementScreen_WIFAK() {
		return approveScreenInCollateralManagementScreen_WIFAK;
	}
	@FindBy(xpath = "//input[@id='collateralManagementGridTbl_Id_WIFT007AP_gs_fmsCollateralVO.CODE']")
	private WebElement searchCodeInApproveScreen_CollateralManagementScreen_WIFAK;

	public WebElement searchCodeInApproveScreen_CollateralManagementScreen_WIFAK() {
		return searchCodeInApproveScreen_CollateralManagementScreen_WIFAK;
	}
	@FindBy(xpath = "//td[@id='td_collateralManagementGridTbl_Id_WIFT007AP_1_fmsCollateralVO.CODE']")
	private WebElement selectSearchCodeInApproveScreen_CollateralManagementScreen_WIFAK;

	public WebElement selectSearchCodeInApproveScreen_CollateralManagementScreen_WIFAK() {
		return selectSearchCodeInApproveScreen_CollateralManagementScreen_WIFAK;
	}
	@FindBy(xpath = "//button[@id='collateralManagement_approve_btn_WIFT007AP']")
	private WebElement approveButtonInApproveScreen_CollateralManagementScreen_WIFAK;
	public WebElement approveButtonInApproveScreen_CollateralManagementScreen_WIFAK() {
		return approveButtonInApproveScreen_CollateralManagementScreen_WIFAK;
	}
	
	@FindBy(xpath = "//button[@id='collateralManagement_save_btn_WIFT007UP']")
	private WebElement saveButtonInUpdateAfterApproveScreen_CollateralManagementScreen_WIFAK;
	public WebElement saveButtonInUpdateAfterApproveScreen_CollateralManagementScreen_WIFAK() {
		return saveButtonInUpdateAfterApproveScreen_CollateralManagementScreen_WIFAK;
	}
	
	@FindBy(xpath = "//button[@id='collateralManagement_save_btn_WIFT007MT']")
	private WebElement saveButtonInMaintenanceScreen_CollateralManagementScreen_WIFAK;
	public WebElement saveButtonInMaintenanceScreen_CollateralManagementScreen_WIFAK() {
		return saveButtonInMaintenanceScreen_CollateralManagementScreen_WIFAK;
	}
	
	@FindBy(xpath = "//a[@id='WIFT007UP']")
	private WebElement updateAfterApproveScreen_CollateralManagementScreen_WIFAK;
	public WebElement updateAfterApproveScreen_CollateralManagementScreen_WIFAK() {
		return updateAfterApproveScreen_CollateralManagementScreen_WIFAK;
	}
	
	@FindBy(xpath = "//input[@id='collateralManagementGridTbl_Id_WIFT007UP_gs_fmsCollateralVO.CODE']")
	private WebElement searchCodeInUpadateAfterApproveScreen_CollateralManagementScreen_WIFAK;
	public WebElement searchCodeInUpadateAfterApproveScreen_CollateralManagementScreen_WIFAK() {
		return searchCodeInUpadateAfterApproveScreen_CollateralManagementScreen_WIFAK;
	}
	
	@FindBy(xpath = "//td[@id='td_collateralManagementGridTbl_Id_WIFT007UP_1_fmsCollateralVO.CODE']")
	private WebElement selectSearchedCodeInUpadateAfterApproveScreen_CollateralManagementScreen_WIFAK;
	public WebElement selectSearchedCodeInUpadateAfterApproveScreen_CollateralManagementScreen_WIFAK() {
		return selectSearchedCodeInUpadateAfterApproveScreen_CollateralManagementScreen_WIFAK;
	}
	
	@FindBy(xpath = "//input[@id='collateralManagementGridTbl_Id_WIFT007MT_gs_fmsCollateralVO.CODE']")
	private WebElement searchCodeInMaintenanceScreen_CollateralManagementScreen_WIFAK;
	public WebElement searchCodeInMaintenanceScreen_CollateralManagementScreen_WIFAK() {
		return searchCodeInMaintenanceScreen_CollateralManagementScreen_WIFAK;
	}
	
	@FindBy(xpath = "//td[@id='td_collateralManagementGridTbl_Id_WIFT007MT_1_fmsCollateralVO.CODE']")
	private WebElement selectSearchedCodeInMaintenanceScreen_CollateralManagementScreen_WIFAK;
	public WebElement selectSearchedCodeInMaintenanceScreen_CollateralManagementScreen_WIFAK() {
		return selectSearchedCodeInMaintenanceScreen_CollateralManagementScreen_WIFAK;
	}
}
