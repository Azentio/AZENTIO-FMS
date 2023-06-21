package pageobjects.fmsparams;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ApplicationForFinancialFacilityParamObj {
	WebDriver driver;

	public ApplicationForFinancialFacilityParamObj(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//td[text()='Parameters']")
	private WebElement parametersMainMenu;

	public WebElement parametersMainMenu() {
		return parametersMainMenu;
	}
	
	@FindBy(xpath ="//td[text()='Facility Type']//preceding-sibling::td")
	private WebElement facilityTypeSubMenu;
	public WebElement facilityTypeSubMenu() {
		return facilityTypeSubMenu;
	}
	
	@FindBy(xpath ="//a[@id='P008UP']")
	private WebElement updateAfterApprove_FacilityType;
	public WebElement updateAfterApprove_FacilityType() {
		return updateAfterApprove_FacilityType;
	}
	
	@FindBy(xpath ="//input[@id='fmsFacilityTypeListGridTbl_Id_P008UP_gs_CODE']")
	private WebElement searchFacilityTypeInUdateAfterApproveScreen;
	public WebElement searchFacilityTypeInUdateAfterApproveScreen() {
		return searchFacilityTypeInUdateAfterApproveScreen;
	}
	
	@FindBy(xpath ="//td[@id='td_fmsFacilityTypeListGridTbl_Id_P008UP_1_CODE']")
	private WebElement selectSearchedFacilityTypeInUdateAfterApproveScreen;
	public WebElement selectSearchedFacilityTypeInUdateAfterApproveScreen() {
		return selectSearchedFacilityTypeInUdateAfterApproveScreen;
	}
	
	@FindBy(xpath ="//li[@id='fmsFacilityTypeDetailsTab_P008UP']")
	private WebElement facilityDetailsTab;
	public WebElement facilityDetailsTab() {
		return facilityDetailsTab;
	}
	
	@FindBy(xpath ="//span[text()='STP Facility Requirements']/following-sibling::span")
	private WebElement StpFacilityRequirementsOption;
	public WebElement StpFacilityRequirementsOption() {
		return StpFacilityRequirementsOption;
	}
	
	@FindBy(xpath ="//input[@id='fmsFacilityType_committee_approval_P008UP']")
	private WebElement checkBoxApprovalCommittee;
	public WebElement checkBoxApprovalCommittee() {
		return checkBoxApprovalCommittee;
	}
	
	@FindBy(xpath ="//button[@id='fmsFacilityTypeMaint_update_P008UP']")
	private WebElement updateButtonInUpdateAfterApproveSubMenu;
	public WebElement updateButtonInUpdateAfterApproveSubMenu() {
		return updateButtonInUpdateAfterApproveSubMenu;
	}
	
	@FindBy(xpath ="//a[@id='P008P']")
	private WebElement approveScreenInFacilityType;
	public WebElement approveScreenInFacilityType() {
		return approveScreenInFacilityType;
	}
	 
	@FindBy(xpath ="//input[@id='fmsFacilityTypeListGridTbl_Id_P008P_gs_CODE']")
	private WebElement searchFacilityTypeInApproveScreen;
	public WebElement searchFacilityTypeInApproveScreen() {
		return searchFacilityTypeInApproveScreen;
	}
	
	@FindBy(xpath ="//td[@id='td_fmsFacilityTypeListGridTbl_Id_P008P_1_CODE']")
	private WebElement selectSearchedFacilityTypeInApproveScreen;
	public WebElement selectSearchedFacilityTypeInApproveScreen() {
		return selectSearchedFacilityTypeInApproveScreen;
	}
	
	@FindBy(xpath ="//button[@id='fmsFacilityTypeMaint_approve_P008P']")
	private WebElement aprroveButtonInApproveScreen;
	public WebElement aprroveButtonInApproveScreen() {
		return aprroveButtonInApproveScreen;
	}
}
