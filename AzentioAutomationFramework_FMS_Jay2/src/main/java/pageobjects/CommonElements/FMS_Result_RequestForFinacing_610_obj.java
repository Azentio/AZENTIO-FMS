package pageobjects.CommonElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FMS_Result_RequestForFinacing_610_obj {

	WebDriver driver;

	public FMS_Result_RequestForFinacing_610_obj(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//td[text()='REQUEST FOR FINANCIN']/preceding-sibling::td/span/span")
	private WebElement requestForFinancingMenu;
	public WebElement requestForFinancingMenu() {
		return requestForFinancingMenu;
	}
	
	@FindBy(xpath = "//td[text()='Request For Financing']/preceding-sibling::td/span/span")
	private WebElement requestForFinancingSubMenu;
	public WebElement requestForFinancingSubMenu() {
		return requestForFinancingSubMenu;
	}
	
	@FindBy(id = "CSMRF00MT")
	private WebElement requestForFinancingMaintenanceScreen;
	public WebElement requestForFinancingMaintenanceScreen() {
		return requestForFinancingMaintenanceScreen;
	}
	
	@FindBy(id = "requestFinancingApplicationFor_CSMRF00MT")
	private WebElement reasonForSubmissionSelect;
	public WebElement reasonForSubmissionSelect() {
		return reasonForSubmissionSelect;
	}

	@FindBy(id = "requestFinancingNewRequestDt_CSMRF00MT")
	private WebElement requestDateValidation;
	public WebElement requestDateValidation() {
		return requestDateValidation;
	}
	
	@FindBy(id = "lookuptxt_requestFinanacingCif_CSMRF00MT")
	private WebElement customerCIF;
	public WebElement customerCIF() {
		return customerCIF;
	}
	
	@FindBy(id = "REQUEST FOR FINANCIN / Request For Financing / Maintenance")
	private WebElement randomClick;
	public WebElement randomClick() {
		return randomClick;
	}

	@FindBy(id = "lookuptxt_requestFinancingFacilityType_CSMRF00MT")
	private WebElement facilityTypeInRequestForFinancingScreen;
	public WebElement facilityTypeInRequestForFinancingScreen() {
		return facilityTypeInRequestForFinancingScreen;
	}
	
	@FindBy(id = "requestFinancingCifShortNameEng_CSMRF00MT")
	private WebElement customerNameValidationInRequestForFinancingScreen;
	public WebElement customerNameValidationInRequestForFinancingScreen() {
		return customerNameValidationInRequestForFinancingScreen;
	}
	
	@FindBy(xpath = "//input[@name='requestFinancingCO.TOTAL_AMOUNT']")
	private WebElement totalLimitInRequestForFinancingScreen;
	public WebElement totalLimitInRequestForFinancingScreen() {
		return totalLimitInRequestForFinancingScreen;
	}
	
	@FindBy(id = "requestFinancingFacilityTypeDesc_CSMRF00MT")
	private WebElement facilityNameValidationInRequestForFinancingScreen;
	public WebElement facilityNameValidationInRequestForFinancingScreen() {
		return facilityNameValidationInRequestForFinancingScreen;
	}
	
	@FindBy(xpath = "requestFinancingCyRate_CSMRF00MT")
	private WebElement cvValueValidationInRequestForFinancingScreen;
	public WebElement cvValueValidationInRequestForFinancingScreen() {
		return cvValueValidationInRequestForFinancingScreen;
	}
	
	@FindBy(xpath ="//*[@id='requestFinancingLimitDtlsTabs_CSMRF00MT']")
	private WebElement disbursementOrSublimitInRequestForFinancingScreen;
	public WebElement disbursementOrSublimitInRequestForFinancingScreen() {
		return disbursementOrSublimitInRequestForFinancingScreen;
	}
	
	@FindBy(xpath = "//*[@id=\"add_RequestFinancingLimitDetailsGridId_CSMRF00MT\"]/div/span")
	private WebElement addIconInDisbursementOrSublimitScreen;
	public WebElement addIconInDisbursementOrSublimitScreen() {
		return addIconInDisbursementOrSublimitScreen;
	}
	
	@FindBy(xpath = "//input[@name='requestFinancingCO.requestFinancingLimitCO.fmsAppLimitDetVO.CLASS']")
	private WebElement productClassInLimitDetailsPopUp;
	public WebElement productClassInLimitDetailsPopUp() {
		return productClassInLimitDetailsPopUp;
	}
	
	@FindBy(id = "lookuptxt_requestFinancingLimitDetailsClassType_CSMRF00MT")
	private WebElement productClassRandomClick;
	public WebElement productClassRandomClick() {
		return productClassRandomClick;
	}
	
	@FindBy(xpath ="//input[@id='requestFinancingLimitDetailsClassDesc_CSMRF00MT']")
	private WebElement productClassNameValidationInRepaymentPlan;
	public WebElement productClassNameValidationInRepaymentPlan() {
		return productClassNameValidationInRepaymentPlan;
	}
	
	@FindBy(xpath = "//input[@id='requestFinancingLimitDetailsRfNewMargin_CSMRF00MT']")
	private WebElement marginValueInLimitDetailsPopUp;
	public WebElement marginValueInLimitDetailsPopUp() {
		return marginValueInLimitDetailsPopUp;
	}
	
	@FindBy(xpath = "//button[@id='limitDetails_add_btn_CSMRF00MT']")
	private WebElement addButtonInLimitDetailsPopUp;
	public WebElement addButtonInLimitDetailsPopUp() {
		return addButtonInLimitDetailsPopUp;
	}
	
	@FindBy(xpath = "//button[@id='limitDetails_add_btn_WIFT001MT']")
	private WebElement addButtonInLimitDetailsPopUpWifakapplication;
	public WebElement addButtonInLimitDetailsPopUpWifakapplication() {
		return addButtonInLimitDetailsPopUpWifakapplication;
	}
	
	@FindBy(xpath = "//*[@id=\"requestFinancingFormId_CSMRF00MT_save_key\"]")
	private WebElement savebuttonInRequestForFinancingScreenMaintenance;
	public WebElement savebuttonInRequestForFinancingScreenMaintenance() {
		return savebuttonInRequestForFinancingScreenMaintenance;
	}
	
	@FindBy(id = "_popup_path_sol_confirm_ok")
	private WebElement okButtonInConfirmationPopUp;
	public WebElement okButtonInConfirmationPopUp() {
		return okButtonInConfirmationPopUp;
	}
	
	@FindBy(id = "_popup_path_sol_ok")
	private WebElement okButtonInSucessPopUp;
	public WebElement okButtonInSucessPopUp() {
		return okButtonInSucessPopUp;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
