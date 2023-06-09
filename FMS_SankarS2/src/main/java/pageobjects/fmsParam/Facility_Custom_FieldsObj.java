package pageobjects.fmsParam;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Facility_Custom_FieldsObj {
	
	WebDriver driver;
	public Facility_Custom_FieldsObj(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
//	@AT_RF_024	
	@FindBy(xpath = "//td[text()='Facility Custom Fields']")
	private WebElement param_facility_custom_fields;
	public WebElement paramFacilityCustomFields() {
		return param_facility_custom_fields;
	}
	
	@FindBy(xpath = "//td[text()='Maintain Facility Custom Fields']")
	private WebElement maintain_facility_custom_fields;
	public WebElement maintainFacilityCustomFields() {
		return maintain_facility_custom_fields;
	}
	
	@FindBy(xpath = "//a[@id='P050FLUP']")
	private WebElement maintain_facility_custom_update_after_approve;
	public WebElement maintainFacilityCustomUpdateAterApprove() {
		return maintain_facility_custom_update_after_approve;
	}
	
	@FindBy(xpath = "//tr[@id='1']")
	private WebElement update_after_approve_search_result;
	public WebElement updateAfterApproveSearchResult() {
		return update_after_approve_search_result;
	}
	
	@FindBy(id = "td_fmsParamMaintainFacilityCustomFieldsDetListGrid_Id_P050FLUP_0_rn")
	private WebElement facility_custom_fields_box;
	public WebElement facilityCustomFieldsBox() {
		return facility_custom_fields_box;
	}
	
	
	
	
	
	
}
