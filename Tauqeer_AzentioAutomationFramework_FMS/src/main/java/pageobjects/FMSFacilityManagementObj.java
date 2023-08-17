package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FMSFacilityManagementObj {
	WebDriver driver;

	public FMSFacilityManagementObj(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	
	
	@FindBy(xpath="//td[text()='Facilities Management']")
	private WebElement facilitiesManagement;

	public WebElement facilitiesManagement() {
		return facilitiesManagement;
	}
	
	@FindBy(xpath="//span[text()='Update After Approve']")
	private WebElement facilitiesManagement_UpdateAfterApprove;

	public WebElement facilitiesManagement_UpdateAfterApprove() {
		return facilitiesManagement_UpdateAfterApprove;
	}
	
	@FindBy(xpath="//td[text()='Clear']")
	private WebElement facilitiesManagement_UpdateAfterApprove_clear;

	public WebElement facilitiesManagement_UpdateAfterApprove_clear() {
		return facilitiesManagement_UpdateAfterApprove_clear;
	}
	
	@FindBy(xpath="//td[@id='td_facilityManagementGridTbl_Id_WIFT008UP_1_fmsFacilityVO.CODE']")
	private WebElement facilitiesManagement_UpdateAfterApprove_firstRecord;

	public WebElement facilitiesManagement_UpdateAfterApprove_firstRecord() {
		return facilitiesManagement_UpdateAfterApprove_firstRecord;
	}
	
	@FindBy(xpath="//span[text()='Additional Details']")
	private WebElement facilitiesManagement_UpdateAfterApprove_AdditionalDetails;

	public WebElement facilitiesManagement_UpdateAfterApprove_AdditionalDetails() {
		return facilitiesManagement_UpdateAfterApprove_AdditionalDetails;
	}
	
	@FindBy(xpath="//input[@id='facilityMgtAddDetDateEffectiveUntill_WIFT008UP']")
	private WebElement facilitiesManagement_UpdateAfterApprove_EffectiveUntil;

	public WebElement facilitiesManagement_UpdateAfterApprove_EffectiveUntil() {
		return facilitiesManagement_UpdateAfterApprove_EffectiveUntil;
	}
	
}
