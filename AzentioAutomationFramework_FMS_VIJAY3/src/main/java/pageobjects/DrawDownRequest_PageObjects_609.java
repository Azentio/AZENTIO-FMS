package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DrawDownRequest_PageObjects_609 {
	
	WebDriver driver;
	public DrawDownRequest_PageObjects_609(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//a[@id='tech_details_icon_id']")
	private WebElement technicalDetails_609;
	public WebElement technicalDetails_609() {
		return technicalDetails_609; 
	}
	
	@FindBy(xpath = "//label[contains(text(),'Clear Cache ')]")
	private WebElement FSM_ClearCacheInTechnicalDetailsIcon_609;
	public WebElement FSM_ClearCacheInTechnicalDetailsIcon_609() {
        return FSM_ClearCacheInTechnicalDetailsIcon_609;
    }
		
		
	@FindBy(xpath = "//input[@id='applicationFacilitydownpaymentperc_WIFT001MT']")
	private WebElement Applicationforfinancialfacilities_Maintenance_AdditionalDetailsTab_DownPaymentPercentage;
	public WebElement Applicationforfinancialfacilities_Maintenance_AdditionalDetailsTab_DownPaymentPercentage() {
		return Applicationforfinancialfacilities_Maintenance_AdditionalDetailsTab_DownPaymentPercentage;
	}
	
	@FindBy(xpath = "//input[@id='applicationFacilitydownpayment_WIFT001MT']")
	private WebElement Applicationforfinancialfacilities_Maintenance_AdditionalDetailsTab_DownPayment;
	public WebElement Applicationforfinancialfacilities_Maintenance_AdditionalDetailsTab_DownPayment() {
		return Applicationforfinancialfacilities_Maintenance_AdditionalDetailsTab_DownPayment;
	}
	
	@FindBy(xpath = "//input[@id='applicationFacilityDownPaymentToVendorPerc_WIFT001MT']")
	private WebElement Applicationforfinancialfacilities_Maintenance_AdditionalDetailsTab_DownPaymentToVendorPercentage;
	public WebElement Applicationforfinancialfacilities_Maintenance_AdditionalDetailsTab_DownPaymentToVendorPercentage() {
		return Applicationforfinancialfacilities_Maintenance_AdditionalDetailsTab_DownPaymentToVendorPercentage;
	}
	
	@FindBy(xpath = "//input[@id='applFacilityDownPaymentToVendor_WIFT001MT']")
	private WebElement Applicationforfinancialfacilities_Maintenance_AdditionalDetailsTab_DownPaymentToVendor;
	public WebElement Applicationforfinancialfacilities_Maintenance_AdditionalDetailsTab_DownPaymentToVendor() {
		return Applicationforfinancialfacilities_Maintenance_AdditionalDetailsTab_DownPaymentToVendor;
	}
	
	@FindBy(xpath = "//input[@id='applFacilityTotalDownPaymentPerc_WIFT001MT']")
	private WebElement Applicationforfinancialfacilities_Maintenance_AdditionalDetailsTab_TotalDownPaymentPercentage;
	public WebElement Applicationforfinancialfacilities_Maintenance_AdditionalDetailsTab_TotalDownPaymentPercentage() {
		return Applicationforfinancialfacilities_Maintenance_AdditionalDetailsTab_TotalDownPaymentPercentage;
	}
	
	@FindBy(xpath = "//input[@id='applFacilityTotalDownPayment_WIFT001MT']")
	private WebElement Applicationforfinancialfacilities_Maintenance_AdditionalDetailsTab_TotalDownPayment;
	public WebElement Applicationforfinancialfacilities_Maintenance_AdditionalDetailsTab_TotalDownPayment() {
		return Applicationforfinancialfacilities_Maintenance_AdditionalDetailsTab_TotalDownPayment;
	}
	
	
	//***************************************************************************************************//
	
	/*
	
	@FindBy(xpath = "//span[@id='spanLookup_requestFinanacingCif_CSMRF00MT']/span")
	private WebElement REQUESTFORFINANCIN_RequestForFinancing_Maintenance_CustomerSearch;
	public WebElement REQUESTFORFINANCIN_RequestForFinancing_Maintenance_CustomerSearch() {
		return REQUESTFORFINANCIN_RequestForFinancing_Maintenance_CustomerSearch;
	}
	
	@FindBy(xpath = "//input[@id='gridtab_requestFinanacingCif_CSMRF00MT_gs_cifVO.CIF_NO']")
	private WebElement REQUESTFORFINANCIN_RequestForFinancing_Maintenance_Customer;
	public WebElement REQUESTFORFINANCIN_RequestForFinancing_Maintenance_Customer() {
		return REQUESTFORFINANCIN_RequestForFinancing_Maintenance_Customer;
	}
	
	@FindBy(xpath = "//span[@id='spanLookup_requestFinancingFacilityType_CSMRF00MT']/span")
	private WebElement REQUESTFORFINANCIN_RequestForFinancing_Maintenance_FacilityTypeSearch;
	public WebElement REQUESTFORFINANCIN_RequestForFinancing_Maintenance_FacilityTypeSearch() {
		return REQUESTFORFINANCIN_RequestForFinancing_Maintenance_FacilityTypeSearch;
	}
	
	@FindBy(xpath = "//input[@id='gridtab_requestFinancingFacilityType_CSMRF00MT_gs_CODE']")
	private WebElement REQUESTFORFINANCIN_RequestForFinancing_Maintenance_FacilityType;
	public WebElement REQUESTFORFINANCIN_RequestForFinancing_Maintenance_FacilityType() {
		return REQUESTFORFINANCIN_RequestForFinancing_Maintenance_FacilityType;
	}
	
	
*/
	
	@FindBy(xpath = "//input[@id='reqFinancingLimitDownpaymentperc_CSMRF00MT']")
	private WebElement REQUESTFORFINANCIN_Maintenance_DownPaymentPercentage;
	public WebElement REQUESTFORFINANCIN_Maintenance_DownPaymentPercentage() {
		return REQUESTFORFINANCIN_Maintenance_DownPaymentPercentage;
	}
	
	@FindBy(xpath = "//input[@id='reqFinancingLimitDownPaymentToVendorPerc_CSMRF00MT']")
	private WebElement REQUESTFORFINANCIN_Maintenance_DownPaymentToVendorPercentage;
	public WebElement REQUESTFORFINANCIN_Maintenance_DownPaymentToVendorPercentage() {
		return REQUESTFORFINANCIN_Maintenance_DownPaymentToVendorPercentage;
	}
	
	@FindBy(xpath = "//input[@id='requestFinancingFacilityDownpayment_CSMRF00MT']")
	private WebElement REQUESTFORFINANCIN_Maintenance_DownPayment;
	public WebElement REQUESTFORFINANCIN_Maintenance_DownPayment() {
		return REQUESTFORFINANCIN_Maintenance_DownPayment;
	}
	
	@FindBy(xpath = "//input[@id='reqFinancingLimitDownPaymentToVendor_CSMRF00MT']")
	private WebElement REQUESTFORFINANCIN_Maintenance_DownPaymentToVendor;
	public WebElement REQUESTFORFINANCIN_Maintenance_DownPaymentToVendor() {
		return REQUESTFORFINANCIN_Maintenance_DownPaymentToVendor;
	}
	
	@FindBy(xpath = "//input[@id='reqFinancingLimitTotalDownPayment_CSMRF00MT']")
	private WebElement REQUESTFORFINANCIN_RequestForFinancing_Maintenance_TotalDownPayment;
	public WebElement REQUESTFORFINANCIN_RequestForFinancing_Maintenance_TotalDownPayment() {
		return REQUESTFORFINANCIN_RequestForFinancing_Maintenance_TotalDownPayment;
	}
	
	@FindBy(xpath = "//input[@id='reqFinancingLimitTotalDownPaymentPerc_CSMRF00MT']")
	private WebElement REQUESTFORFINANCIN_RequestForFinancing_Maintenance_TotalDownPaymentPercentage;
	public WebElement REQUESTFORFINANCIN_RequestForFinancing_Maintenance_TotalDownPaymentPercentage() {
		return REQUESTFORFINANCIN_RequestForFinancing_Maintenance_TotalDownPaymentPercentage;
	}
	
	
	
	
	
	///****************************************************************************************///
	
	
	@FindBy(xpath = "//td[text()='Control Record']")
	private WebElement Parameters_ControlRecord;
	public WebElement Parameters_ControlRecord() {
		return Parameters_ControlRecord;
	}
	
	@FindBy(xpath = "//span[text()='Update After Approve']")
	private WebElement Parameters_ControlRecord_UpdateAfterApprove;
	public WebElement Parameters_ControlRecord_UpdateAfterApprove() {
		return Parameters_ControlRecord_UpdateAfterApprove;
	}
	
	@FindBy(xpath = "//input[@id='FmsCtrlRecord_cifGenLimit_P007UP']")
	private WebElement Parameters_ControlRecord_UpdateAfterApprove_GeneralLimitCif;
	public WebElement Parameters_ControlRecord_UpdateAfterApprove_GeneralLimitCif() {
		return Parameters_ControlRecord_UpdateAfterApprove_GeneralLimitCif;
	}
	
	
	@FindBy(xpath = "//label[text()='Update ']")
	private WebElement ControlRecord_UpdateAfterApprove_Update;
	public WebElement ControlRecord_UpdateAfterApprove_Update() {
		return ControlRecord_UpdateAfterApprove_Update;
	}
	
	
	@FindBy(xpath = "//span[text()='Approve']")
	private WebElement Parameters_ControlRecord_Approve;
	public WebElement Parameters_ControlRecord_Approve() {
		return Parameters_ControlRecord_Approve;
	}
	
	@FindBy(xpath = "//label[text()='Approve ']")
	private WebElement ControlRecord_Approve_Approve;
	public WebElement ControlRecord_Approve_Approve() {
		return ControlRecord_Approve_Approve;
	}
	
	
	@FindBy(xpath = "//input[@id='applicationFacilityFxSettlementExpiryDate_WIFT001MT']")
	private WebElement Applicationforfinancialfacilities_Maintenance_AdditionalDetails_FXSettlementExpiryDate;
	public WebElement Applicationforfinancialfacilities_Maintenance_AdditionalDetails_FXSettlementExpiryDate() {
		return Applicationforfinancialfacilities_Maintenance_AdditionalDetails_FXSettlementExpiryDate;
	}
}
