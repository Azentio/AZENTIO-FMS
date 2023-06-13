package pageobjects.fms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacilitiesManagementObj_608 {
	
	WebDriver driver;
	public FacilitiesManagementObj_608(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//td[text()='Facilities Management']")
	private WebElement facilities_management_feature;
	public WebElement facilitiesManagementFeature_608() {
		return facilities_management_feature;
	}
	
	@FindBy(xpath = "//a[@id='RFFT008MT']")
	private WebElement facilities_management_maintanane;
	public WebElement facilitiesManagementMaintanance_608() {
		return facilities_management_maintanane;
	}
	
	@FindBy(xpath = "//a[@id='infoBarSearchButton_RFFT008MT']")
	private WebElement facilities_management_main_search_btn;
	public WebElement facilitiesManagementMainSearchBtn_608() {
		return facilities_management_main_search_btn;
	}
	
	@FindBy(xpath = "//input[@id='facilityManagementGridTbl_Id_RFFT008MT_gs_fmsFacilityVO.CIF']")
	private WebElement facilities_management_main_search_CIF_input;
	public WebElement facilitiesManagementMainSearchCIFInput_608() {
		return facilities_management_main_search_CIF_input;
	}
	
	@FindBy(xpath = "//td[@id='td_facilityManagementGridTbl_Id_RFFT008MT_1_fmsFacilityVO.CODE']")
	private WebElement facilities_management_main_search_row1;
	public WebElement facilitiesManagementMainSearchRow1_608() {
		return facilities_management_main_search_row1;
	}
	
	@FindBy(xpath = "//input[@id='facilityMangementCode_RFFT008MT']")
	private WebElement facilities_management_main_code;
	public WebElement facilitiesManagementMainCode() {
		return facilities_management_main_code;
	}
	
	@FindBy(xpath = "//button[@id='facilityMgtCifLimitDetails_btn_RFFT008MT']")
	private WebElement facilities_management_main_cif_limit_btn;
	public WebElement facilitiesManagementMainCIFLimitBtn() {
		return facilities_management_main_cif_limit_btn;
	}
	
	
}
