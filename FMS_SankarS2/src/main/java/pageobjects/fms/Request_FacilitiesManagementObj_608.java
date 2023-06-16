package pageobjects.fms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Request_FacilitiesManagementObj_608 {
	
	WebDriver driver;
	public Request_FacilitiesManagementObj_608(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//td[text()='Facilities Management']")
	private WebElement request_facilities_management_feature;
	public WebElement requestFacilitiesManagementFeature_608() {
		return request_facilities_management_feature;
	}
	
	@FindBy(xpath = "//a[@id='RFFT008MT']")
	private WebElement request_facilities_management_maintanane;
	public WebElement requestFacilitiesManagementMaintanance_608() {
		return request_facilities_management_main_cif_limit_btn;
	}
	
	@FindBy(xpath = "//a[@id='infoBarSearchButton_RFFT008MT']")
	private WebElement request_facilities_management_main_search_btn;
	public WebElement requestFacilitiesManagementMainSearchBtn_608() {
		return request_facilities_management_main_cif_limit_btn;
	}
	
	@FindBy(xpath = "//input[@id='facilityManagementGridTbl_Id_RFFT008MT_gs_fmsFacilityVO.CIF']")
	private WebElement request_facilities_management_main_search_CIF_input;
	public WebElement requestFacilitiesManagementMainSearchCIFInput_608() {
		return request_facilities_management_main_cif_limit_btn;
	}
	
	@FindBy(xpath = "//td[@id='td_facilityManagementGridTbl_Id_RFFT008MT_1_fmsFacilityVO.CODE']")
	private WebElement request_facilities_management_main_search_row1;
	public WebElement requestFacilitiesManagementMainSearchRow1_608() {
		return request_facilities_management_main_cif_limit_btn;
	}
	
	@FindBy(xpath = "//input[@id='facilityMangementCode_RFFT008MT']")
	private WebElement request_facilities_management_main_code;
	public WebElement requestFacilitiesManagementMainCode_608() {
		return request_facilities_management_main_cif_limit_btn;
	}
	
	@FindBy(xpath = "//button[@id='facilityMgtCifLimitDetails_btn_RFFT008MT']")
	private WebElement request_facilities_management_main_cif_limit_btn;
	public WebElement requestFacilitiesManagementMainCIFLimitBtn_608() {
		return request_facilities_management_main_cif_limit_btn;
	}
	
	
}
