package pageobjects.CommonElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FMS_Facility_Management_obj {

	WebDriver driver;
	public FMS_Facility_Management_obj(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath =  "//td[text()='Facilities Management']")
	private WebElement Click_Facilities_Management;
	public WebElement Click_Facilities_Management() {
		return Click_Facilities_Management;
	}
	
	@FindBy(xpath =  "//a[@id='WIFT008MT']")
	private WebElement Click_Maintenance_In_Facilities_Management;
	public WebElement Click_Maintenance_In_Facilities_Management() {
		return Click_Maintenance_In_Facilities_Management;
	}
	
	@FindBy(id =  "lookuptxt_facilityMgtMainApplicationRef_WIFT008MT")
	private WebElement Click_Application_Ref;
	public WebElement Click_Application_Ref() {
		return Click_Application_Ref;
	}
	
	@FindBy(id =  "spanLookup_facilityMgtMainApplicationRef_WIFT008MT")
	private WebElement Click_Application_Ref_Search_button;
	public WebElement Click_Application_Ref_Search_button() {
		return Click_Application_Ref_Search_button;
	}
	
	@FindBy(id =  "facilityAdditionalDetailsTab_WIFT008MT")
	private WebElement Click_Additional_Details;
	public WebElement Click_Additional_Details() {
		return Click_Additional_Details;
	}
	
	@FindBy(id =  "facilityLimitDetailsTab_WIFT008MT")
	private WebElement Click_facility_Limit_Details;
	public WebElement Click_facility_Limit_Details() {
		return Click_facility_Limit_Details;
	}
	
	@FindBy(id =  "td_FacilityManagementFacilityLimitDetailsGrid_WIFT008MT_1_fmsFacilityDetVO.GENERAL_FACILITY_TYPE")
	private WebElement DoubleClick_ProductClassIN_facility_Limit_Details;
	public WebElement DoubleClick_ProductClassIN_facility_Limit_Details() {
		return DoubleClick_ProductClassIN_facility_Limit_Details;
	}
	
	@FindBy(id =  "facilityMgtLimitDetailsMATURITY_DATE_WIFT008MT")
	private WebElement Enter_Previous_dataIn_MaturityDate;
	public WebElement Enter_Previous_dataIn_MaturityDate() {
		return Enter_Previous_dataIn_MaturityDate;
	}
}
