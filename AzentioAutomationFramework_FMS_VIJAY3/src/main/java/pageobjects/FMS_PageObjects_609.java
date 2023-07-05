package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FMS_PageObjects_609 {
	WebDriver driver;
	public FMS_PageObjects_609(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	///*************************************Sprint = 9*************************************///
	///*************************************  718066  *************************************///
	
	@FindBy(xpath = "//td[text()='REQUEST FOR FINANCIN']")
	private WebElement FmsCore_REQUESTFORFINANCIN_609;
	public WebElement FmsCore_REQUESTFORFINANCIN_609() {
		return FmsCore_REQUESTFORFINANCIN_609;
	}
	
	@FindBy(xpath = "//td[text()='Request For Financing']")
	private WebElement REQUESTFORFINANCIN_RequestForFinancing_609;
	public WebElement REQUESTFORFINANCIN_RequestForFinancing_609() {
		return REQUESTFORFINANCIN_RequestForFinancing_609;
	}
	
	@FindBy(xpath = "//a[@id='CSMRF00MT']/span[text()='Maintenance']")
	private WebElement REQUESTFORFINANCIN_RequestForFinancing_Maintenance_609;
	public WebElement REQUESTFORFINANCIN_RequestForFinancing_Maintenance_609() {
		return REQUESTFORFINANCIN_RequestForFinancing_Maintenance_609;
	}
	
	@FindBy(xpath = "//select[@id='requestFinancingApplicationFor_CSMRF00MT']")
	private WebElement REQUESTFORFINANCIN_RequestForFinancing_Maintenance_ReasonForSubmission_609;
	public WebElement REQUESTFORFINANCIN_RequestForFinancing_Maintenance_ReasonForSubmission_609() {
		return REQUESTFORFINANCIN_RequestForFinancing_Maintenance_ReasonForSubmission_609;
	}
	
	@FindBy(xpath = "//span[@id='spanLookup_requestFinanacingCif_CSMRF00MT']/span")
	private WebElement REQUESTFORFINANCIN_RequestForFinancing_Maintenance_Customer_Search_609;
	public WebElement REQUESTFORFINANCIN_RequestForFinancing_Maintenance_Customer_Search_609() {
		return REQUESTFORFINANCIN_RequestForFinancing_Maintenance_Customer_Search_609;
	}
	
	@FindBy(xpath = "//input[@id='gridtab_requestFinanacingCif_CSMRF00MT_gs_cifVO.CIF_NO']")
	private WebElement REQUESTFORFINANCIN_RequestForFinancing_Maintenance_Customer_609;
	public WebElement REQUESTFORFINANCIN_RequestForFinancing_Maintenance_Customer_609() {
		return REQUESTFORFINANCIN_RequestForFinancing_Maintenance_Customer_609;
	}
	
	@FindBy(xpath = "//input[@id='gridtab_requestFinancingFacilityType_CSMRF00MT_gs_CODE']")
	private WebElement REQUESTFORFINANCIN_RequestForFinancing_Maintenance_FacilityType_609;
	public WebElement REQUESTFORFINANCIN_RequestForFinancing_Maintenance_FacilityType_609() {
		return REQUESTFORFINANCIN_RequestForFinancing_Maintenance_FacilityType_609;
	}
	
	@FindBy(xpath = "//span[@id='spanLookup_requestFinancingFacilityType_CSMRF00MT']/span")
	private WebElement REQUESTFORFINANCIN_RequestForFinancing_Maintenance_FacilityTypeSearch_609;
	public WebElement REQUESTFORFINANCIN_RequestForFinancing_Maintenance_FacilityTypeSearch_609() {
		return REQUESTFORFINANCIN_RequestForFinancing_Maintenance_FacilityTypeSearch_609;
	}
	
	@FindBy(xpath= "//input[@id='requestFinancingFacilityTotalvalue_CSMRF00MT']")
	private WebElement REQUESTFORFINANCIN_RequestForFinancing_Maintenance_TotalLimit_609;
	public WebElement REQUESTFORFINANCIN_RequestForFinancing_Maintenance_TotalLimit_609() {
		return REQUESTFORFINANCIN_RequestForFinancing_Maintenance_TotalLimit_609;
	}
	
	@FindBy(xpath = "//li[@id='requestFinancingLimitDtlsTabs_CSMRF00MT']/a/span[text()='Disbursement/Sublimit']")
	private WebElement REQUESTFORFINANCIN_RequestForFinancing_Maintenance_Sublimit_609;
	public WebElement REQUESTFORFINANCIN_RequestForFinancing_Maintenance_Sublimit_609() {
		return REQUESTFORFINANCIN_RequestForFinancing_Maintenance_Sublimit_609;
	}
	
	@FindBy(xpath = "//td[@id='add_RequestFinancingLimitDetailsGridId_CSMRF00MT']/div/span")
	private WebElement REQUESTFORFINANCIN_Sublimit_Addicon_609;
	public WebElement REQUESTFORFINANCIN_Sublimit_Addicon_609() {
		return REQUESTFORFINANCIN_Sublimit_Addicon_609;
	}
	
	@FindBy(xpath = "//span[@id='spanLookup_requestFinancingLimitDetailsGeneralFacilityProductClass_CSMRF00MT']/span")
	private WebElement REQUESTFORFINANCIN_Sublimit_ProductClass_Search_609;
	public WebElement REQUESTFORFINANCIN_Sublimit_ProductClass_Search_609() {
		return REQUESTFORFINANCIN_Sublimit_ProductClass_Search_609;
	}
	
	@FindBy(xpath = "//input[@id='gridtab_requestFinancingLimitDetailsGeneralFacilityProductClass_CSMRF00MT_gs_DESC_ENG']")
	private WebElement REQUESTFORFINANCIN_Sublimit_ProductClass_609;
	public WebElement REQUESTFORFINANCIN_Sublimit_ProductClass_609() {
		return REQUESTFORFINANCIN_Sublimit_ProductClass_609;
	}
	
	
	@FindBy(xpath = "//input[@id='requestFinancingLimitDetailsCleanFlagdChkBox_CSMRF00MT']")
	private WebElement REQUESTFORFINANCIN_Sublimit_ProductClass_Clean_609;
	public WebElement REQUESTFORFINANCIN_Sublimit_ProductClass_Clean_609() {
		return REQUESTFORFINANCIN_Sublimit_ProductClass_Clean_609;
	}
	 
	@FindBy(xpath = "//input[@id='requestFinancingLimitDetailsRfNewMargin_CSMRF00MT']")
	private WebElement REQUESTFORFINANCIN_Sublimit_ProductClass_NewMargin_609;
	public WebElement REQUESTFORFINANCIN_Sublimit_ProductClass_NewMargin_609() {
		return REQUESTFORFINANCIN_Sublimit_ProductClass_NewMargin_609;
	}
	
	@FindBy(xpath = "//button[@id='limitDetails_add_btn_CSMRF00MT']/span[contains(text(),' Add ')]")
	private WebElement REQUESTFORFINANCIN_Sublimit_ProductClass_Add_609;
	public WebElement REQUESTFORFINANCIN_Sublimit_ProductClass_Add_609() {
		return REQUESTFORFINANCIN_Sublimit_ProductClass_Add_609;
	}
	
	
	@FindBy(xpath = "//div[@id='div__popup_path_sol_ok']/div[2]/div")
	private WebElement ApplicationNo_609;
	public WebElement ApplicationNo_609() {
		return ApplicationNo_609;
	}
	
	
	
	@FindBy(id = "_popup_path_sol_confirm_ok")
	private WebElement ConfirmPopUp_609;
	public WebElement ConfirmPopUp_609() {
		return ConfirmPopUp_609;
	}
	
	@FindBy(xpath = "//span[contains(text(),' Dismiss ')]")
	private WebElement SendAlert_609;
	public WebElement SendAlert_609() {
		return SendAlert_609;
	}
}
