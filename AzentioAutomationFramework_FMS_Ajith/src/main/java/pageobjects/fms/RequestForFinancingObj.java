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
	
	
	@FindBy(xpath = "//td[text()='Clear']")
	private WebElement clearSearchInGrid_482;
	public WebElement clearSearchInGrid_482() {
		return clearSearchInGrid_482;
	}
	
	@FindBy(xpath = "//div[@id='_selenuimT014']//td[text()='Collateral Management']")
	private WebElement collateralManagement_482;
	public WebElement collateralManagement_482() {
		return collateralManagement_482;
	}
	
	@FindBy(xpath = "//a[@id='T014UP']//span[text()='Update After Approve']")
	private WebElement updateAfterApproveScreen_CollateralManagement_482;
	public WebElement updateAfterApproveScreen_CollateralManagement_482() {
		return updateAfterApproveScreen_CollateralManagement_482;
	}
	
	@FindBy(xpath = "//*[@id='collateralManagementGridTbl_Id_T014UP_gs_fmsCollateralVO.CODE']")
	private WebElement searchCodeInUpdateAfterApproveScreenUnderCollateralManagement_482;
	public WebElement searchCodeInUpdateAfterApproveScreenUnderCollateralManagement_482() {
		return searchCodeInUpdateAfterApproveScreenUnderCollateralManagement_482;
	}
	
	@FindBy(xpath = "//td[@id='td_collateralManagementGridTbl_Id_T014UP_1_fmsCollateralVO.CODE']")
	private WebElement firstRecord_UpdateAfterApproveCollateralManagement_482;
	public WebElement firstRecord_UpdateAfterApproveCollateralManagement_482() {
		return firstRecord_UpdateAfterApproveCollateralManagement_482;
	}
	
	@FindBy(xpath = "//input[@id='fmscollateralApprovedCoverage_T014UP']")
	private WebElement approveCoverageCollateralManagement_482;
	public WebElement approveCoverageCollateralManagement_482() {
		return approveCoverageCollateralManagement_482;
	}
	
	@FindBy(xpath = "//input[@id='lookuptxt_fmscollateralParentCountryCode_T014UP']")
	private WebElement country_CollateralManagement_482;
	public WebElement country_CollateralManagement_482() {
		return country_CollateralManagement_482;
	}
	
	@FindBy(xpath = "//button[@id='collateralManagement_save_btn_T014UP']")
	private WebElement saveButttonUpdateAfterApprove_CollateralManagement_482;
	public WebElement saveButttonUpdateAfterApprove_CollateralManagement_482() {
		return saveButttonUpdateAfterApprove_CollateralManagement_482;
	}
	@FindBy(xpath="//*[@id='T014AP']")
	private WebElement approveScreen_Collateral_482;
	public WebElement approveScreen_Collateral_482() {
		return approveScreen_Collateral_482;
	}
	
	@FindBy(xpath="//*[@id='T014MT']")
	private WebElement maintenanceScreen_CollateralManagement_482;
	public WebElement maintenanceScreen_CollateralManagement_482() {
		return maintenanceScreen_CollateralManagement_482;
	}
	
	@FindBy(xpath="//*[@id='infoBarSearchButton_T014MT']")
	private WebElement searchIconMaintenance_CollateralManagement_482;
	public WebElement searchIconMaintenance_CollateralManagement_482() {
		return searchIconMaintenance_CollateralManagement_482;
	}
	
	
	@FindBy(xpath = "//input[@id='collateralManagementGridTbl_Id_T014MT_gs_fmsCollateralVO.CODE']")
	private WebElement searchCodeInMaintenanceScreenUnderCollateralManagement_482;

	public WebElement searchCodeInMaintenanceScreenUnderCollateralManagement_482() {
		return searchCodeInMaintenanceScreenUnderCollateralManagement_482;
	}
	
	@FindBy(xpath = "//*[@id='td_collateralManagementGridTbl_Id_T014MT_1_fmsCollateralVO.CODE']")
	private WebElement selectSearchedCodeInMaintenanceScreenUnderCollateralManagement_482;
	public WebElement selectSearchedCodeInMaintenanceScreenUnderCollateralManagement_482() {
		return selectSearchedCodeInMaintenanceScreenUnderCollateralManagement_482;
	}
	
	@FindBy(xpath = "//*[@id='auditButton_T014MT']")
	private WebElement auditOptionInMaintenanceScreenUnderCollateralManagement_482;
	public WebElement auditOptionInMaintenanceScreenUnderCollateralManagement_482() {
		return auditOptionInMaintenanceScreenUnderCollateralManagement_482;
	}
	
	@FindBy(xpath = "//*[@id='last_auditActionsGrid_Id_pager']")
	private WebElement lastPageauditPageInMaintenanceScreenUnderCollateralManagement_482;
	public WebElement lastPageauditPageInMaintenanceScreenUnderCollateralManagement_482() {
		return lastPageauditPageInMaintenanceScreenUnderCollateralManagement_482;
	}
	
	@FindBy(xpath = "//input[@id='collateralManagementGridTbl_Id_T014AP_gs_fmsCollateralVO.CODE']")
	private WebElement searchCodeInApproveScreenUnderCollateralManagement_482;
	public WebElement searchCodeInApproveScreenUnderCollateralManagement_482() {
		return searchCodeInApproveScreenUnderCollateralManagement_482;
	}
	
	@FindBy(xpath = "//*[@id='td_collateralManagementGridTbl_Id_T014AP_1_fmsCollateralVO.CODE']")
	private WebElement selectSearchedCodeInApproveScreenUnderCollateralManagement_482;
	public WebElement selectSearchedCodeInApproveScreenUnderCollateralManagement_482() {
		return selectSearchedCodeInApproveScreenUnderCollateralManagement_482;
	}
	
	@FindBy(xpath = "//*[@id='collateralManagement_approve_btn_T014AP']")
	private WebElement approveButtonInApproveScreenUnderCollateralManagement_482;
	public WebElement approveButtonInApproveScreenUnderCollateralManagement_482() {
		return approveButtonInApproveScreenUnderCollateralManagement_482;
	}

}