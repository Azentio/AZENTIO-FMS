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
	
	@FindBy(xpath ="//input[@id='fmsFacilityType_customer_grading_P008UP']")
	private WebElement customerGradingCheckbox_482;
	public WebElement customerGradingCheckbox_482() {
		return customerGradingCheckbox_482;
	}
	
	@FindBy(xpath ="//input[@id='fmsFacilityType_grade_overwrite_P008UP']")
	private WebElement overWriteGradingCheckbox_482;
	public WebElement overWriteGradingCheckbox_482() {
		return overWriteGradingCheckbox_482;
	}
	
	@FindBy(xpath ="//input[@id='fmsFacilityType_committee_approval_P008UP']")
	private WebElement checkBoxApprovalCommittee;
	public WebElement checkBoxApprovalCommittee() {
		return checkBoxApprovalCommittee;
	}
	
	@FindBy(xpath ="//input[@id='fmsFacilityType_credit_authorize_P008UP']")
	private WebElement checkBoxCreditAuthorization;
	public WebElement checkBoxCreditAuthorization() {
		return checkBoxCreditAuthorization;
	}
	
	@FindBy(xpath ="//input[@id='fmsFacilityType_credit_review_P008UP']")
	private WebElement checkBoxCreditReview_482;
	public WebElement checkBoxCreditReview_482() {
		return checkBoxCreditReview_482;
	}
	
	@FindBy(xpath ="//input[@id='fmsFacilityType_credit_authorize_P008UP']")
	private WebElement checkBoxCreditAuthorization_482;
	public WebElement checkBoxCreditAuthorization_482() {
		return checkBoxCreditAuthorization_482;
	}
	
	@FindBy(xpath ="//input[@id='fmsFacilityType_issue_offer_P008UP']")
	private WebElement checkBoxIssueFacilityOffer_482;
	public WebElement checkBoxIssueFacilityOffer_482() {
		return checkBoxIssueFacilityOffer_482;
	}
	
	@FindBy(xpath ="//input[@id='fmsFacilityType_client_response_P008UP']")
	private WebElement checkBoxClientResponse_482;
	public WebElement checkBoxClientResponse_482() {
		return checkBoxClientResponse_482;
	}
	
	@FindBy(xpath ="//input[@id='fmsFacilityType_document_validation_yn_P008UP']")
	private WebElement checkBoxDocumentValidation_482;
	public WebElement checkBoxDocumentValidation_482() {
		return checkBoxDocumentValidation_482;
	}
	
	@FindBy(xpath ="//input[@id='fmsFacilityType_final_approval_P008UP']")
	private WebElement checkBoxFinalApproval_482;
	public WebElement checkBoxFinalApproval_482() {
		return checkBoxFinalApproval_482;
	}
	
	@FindBy(xpath ="//input[@id='fmsFacilityType_active_facility_P008UP']")
	private WebElement checkBoxCreateActiveFacilityIfWithinLimit_482;
	public WebElement checkBoxCreateActiveFacilityIfWithinLimit_482() {
		return checkBoxCreateActiveFacilityIfWithinLimit_482;
	}
	
	@FindBy(xpath ="//input[@id='fmsFacilityType_auto_approve_P008UP']")
	private WebElement checkBoxAutomaticallyApproveFacilityIfWithinLimits_482;
	public WebElement checkBoxAutomaticallyApproveFacilityIfWithinLimits_482() {
		return checkBoxAutomaticallyApproveFacilityIfWithinLimits_482;
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
	private WebElement approveButtonInApproveScreen;
	public WebElement approveButtonInApproveScreen() {
		return approveButtonInApproveScreen;
	}
	
	
	@FindBy(xpath ="//td[text()='Facilities Management']/preceding-sibling::td/span/span")
	private WebElement facilitiesManagementUnderWIFAK_482;
	public WebElement facilitiesManagementUnderWIFAK_482() {
		return facilitiesManagementUnderWIFAK_482;
	}
	
	@FindBy(xpath ="//a[@id='WIFT008MT']")
	private WebElement Maintenance_facilitiesManagementUnderWIFAK_482;
	public WebElement Maintenance_facilitiesManagementUnderWIFAK_482() {
		return Maintenance_facilitiesManagementUnderWIFAK_482;
	}
}
