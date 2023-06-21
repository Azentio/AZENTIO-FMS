package pageobjects.fms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RequestForFinancingObj {
	WebDriver driver;
	public RequestForFinancingObj(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//td[text()='Baj Application']/preceding-sibling::td")
	private WebElement BajApplicationMainMenu;

	public WebElement BajApplicationMainMenu() {
		return BajApplicationMainMenu;
	}
	
	@FindBy(xpath = "//td[text()='Baj Application']/ancestor::h3/following-sibling::ul//td[text()='Application']/preceding-sibling::td")
	private WebElement applicationSubMenu;

	public WebElement applicationSubMenu() {
		return applicationSubMenu;
	}
	
	@FindBy(xpath = "//td[text()='Application For Financial Facilities']/preceding-sibling::td")
	private WebElement applicationForFinancialFacilitiesSubMenu;

	public WebElement applicationForFinancialFacilitiesSubMenu() {
		return applicationForFinancialFacilitiesSubMenu;
	}
	
	@FindBy(xpath = "//a[@id='BAAT001MT']")
	private WebElement maintenanceScreenInApplicationForFinancialFacilitiesSubMenu;

	public WebElement maintenanceScreenInApplicationForFinancialFacilitiesSubMenu() {
		return maintenanceScreenInApplicationForFinancialFacilitiesSubMenu;
	}
	
	@FindBy(xpath = "//input[@id='applicationFacilityGridTbl_Id_BAAT001MT_gs_fmsApplVO.REQ_NO']")
	private WebElement searchRequestNumberInMaintenanceScreenUnderBajApplication;

	public WebElement searchRequestNumberInMaintenanceScreenUnderBajApplication() {
		return searchRequestNumberInMaintenanceScreenUnderBajApplication;
	}
	
	@FindBy(xpath = "//td[@id='td_applicationFacilityGridTbl_Id_BAAT001MT_1_fmsApplVO.CODE']")
	private WebElement selectSearchedRequestNumberInMaintenanceScreenUnderBajApplication;

	public WebElement selectSearchedRequestNumberInMaintenanceScreenUnderBajApplication() {
		return selectSearchedRequestNumberInMaintenanceScreenUnderBajApplication;
	}
	
	@FindBy(xpath = "//input[@id='applicationFacilityAdditionalReference_BAAT001MT']")
	private WebElement additionalReferenceInMaintenanceScreenUnderBajApplication;

	public WebElement additionalReferenceInMaintenanceScreenUnderBajApplication() {
		return additionalReferenceInMaintenanceScreenUnderBajApplication;
	}
	
	@FindBy(xpath = "//span[contains(text(),'Validate')]/preceding-sibling::span")
	private WebElement validateButtonInMaintenanceScreenUnderBajApplication;

	public WebElement validateButtonInMaintenanceScreenUnderBajApplication() {
		return validateButtonInMaintenanceScreenUnderBajApplication;
	}
	
	@FindBy(xpath = "//input[@id='_popup_path_sol_confirm_ok']")
	private WebElement okButtonInWariningPopUpMaintenanceScreenUnderBajApplication;

	public WebElement okButtonInWariningPopUpMaintenanceScreenUnderBajApplication() {
		return okButtonInWariningPopUpMaintenanceScreenUnderBajApplication;
	}
	
	@FindBy(xpath = "//span[contains(text(),'Yes')]/preceding-sibling::span")
	private WebElement yesButtonInPostApprovalPopUpMaintenanceScreenUnderBajApplication;

	public WebElement yesButtonInPostApprovalPopUpMaintenanceScreenUnderBajApplication() {
		return yesButtonInPostApprovalPopUpMaintenanceScreenUnderBajApplication;
	}
}
