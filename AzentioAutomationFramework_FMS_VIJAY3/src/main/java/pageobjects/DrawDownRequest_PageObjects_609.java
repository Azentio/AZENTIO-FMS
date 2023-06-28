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
	
		
	@FindBy(xpath = "//input[@id='applicationFacilitydownpaymentperc_WIFT001MT']")
	private WebElement Applicationforfinancialfacilities_Maintenance_AdditionalDetailsTab_DownPaymentPercantage;
	public WebElement Applicationforfinancialfacilities_Maintenance_AdditionalDetailsTab_DownPaymentPercantage() {
		return Applicationforfinancialfacilities_Maintenance_AdditionalDetailsTab_DownPaymentPercantage;
	}
	
	@FindBy(xpath = "//input[@id='applicationFacilitydownpayment_WIFT001MT']")
	private WebElement Applicationforfinancialfacilities_Maintenance_AdditionalDetailsTab_DownPayment;
	public WebElement Applicationforfinancialfacilities_Maintenance_AdditionalDetailsTab_DownPayment() {
		return Applicationforfinancialfacilities_Maintenance_AdditionalDetailsTab_DownPayment;
	}
	
	@FindBy(xpath = "applicationFacilityDownPaymentToVendorPerc_WIFT001MT")
	private WebElement Applicationforfinancialfacilities_Maintenance_AdditionalDetailsTab_DownPaymentToVendorPercentage;
	public WebElement Applicationforfinancialfacilities_Maintenance_AdditionalDetailsTab_DownPaymentToVendorPercentage() {
		return Applicationforfinancialfacilities_Maintenance_AdditionalDetailsTab_DownPaymentToVendorPercentage;
	}
	
	@FindBy(xpath = "//input[@id='applFacilityDownPaymentToVendor_WIFT001MT']")
	private WebElement Applicationforfinancialfacilities_Maintenance_AdditionalDetailsTab_DownPaymentToVendor;
	public WebElement Applicationforfinancialfacilities_Maintenance_AdditionalDetailsTab_DownPaymentToVendor() {
		return Applicationforfinancialfacilities_Maintenance_AdditionalDetailsTab_DownPaymentToVendor;
	}
	
	@FindBy(xpath = "")
	private WebElement Applicationforfinancialfacilities_Maintenance_AdditionalDetailsTab_TotalDownPaymentPercentage;
	public WebElement Applicationforfinancialfacilities_Maintenance_AdditionalDetailsTab_TotalDownPaymentPercentage() {
		return Applicationforfinancialfacilities_Maintenance_AdditionalDetailsTab_TotalDownPaymentPercentage;
	}
	
	@FindBy(xpath = "")
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
	
	@FindBy(xpath = "reqFinancingLimitDownPaymentToVendor_CSMRF00MT")
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
}
