package pageobjects.fms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacilityModificationObj_482 {
	WebDriver driver;

	public FacilityModificationObj_482(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//td[text()='Request']")
	private WebElement FMS_core_request_module_482;

	public WebElement FMS_core_request_module_482() {
		return FMS_core_request_module_482;
	}

	@FindBy(xpath = "//td[text()='Request Financing']")
	private WebElement request_financing_feature_482;

	public WebElement request_financing_feature_482() {
		return request_financing_feature_482;
	}

	@FindBy(xpath = "//div[@id='_selenuimRFFRF00']//td[contains(text(),'Request')]")
	private WebElement request_for_financing_feature_482;

	public WebElement request_for_financing_feature_482() {
		return request_for_financing_feature_482;
	}

	@FindBy(xpath = "//a[@id='RFFRF00MT']")
	private WebElement request_for_financing_maintanance_482;

	public WebElement request_for_financing_maintanance_482() {
		return request_for_financing_maintanance_482;
	}

	@FindBy(xpath = "//select[@id='requestFinancingApplicationFor_RFFRF00MT']")
	private WebElement request_for_financing_main_reason_for_dropdown_482;

	public WebElement request_for_financing_main_reason_for_dropdown_482() {
		return request_for_financing_main_reason_for_dropdown_482;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_fmsFacilityFromFacility_RFFRF00MT']")
	private WebElement RequestForFinancing_ExistingFacilityNoField_482;

	public WebElement RequestForFinancing_ExistingFacilityNoField_482() {
		return RequestForFinancing_ExistingFacilityNoField_482;
	}

	@FindBy(xpath = "//input[@id='requestFinancingFacilityTotalvalue_RFFRF00MT']")
	private WebElement request_for_financing_main_total_limit_input_482;

	public WebElement request_for_financing_main_total_limit_input_482() {
		return request_for_financing_main_total_limit_input_482;
	}

	@FindBy(xpath = "///*[@id='lookuptxt_requestFinanacingCif_RFFRF00MT']")
	private WebElement cif_Request_Application_482;

	public WebElement cif_Request_Application_482() {
		return cif_Request_Application_482;
	}

	@FindBy(xpath = "//*[@id='lookuptxt_requestFinancingFacilityType_RFFRF00MT']")
	private WebElement facilityType_Request_Application_482;

	public WebElement facilityType_Request_Application_482() {
		return facilityType_Request_Application_482;
	}

	@FindBy(xpath = "//*[@id='requestFinancingFacilityTotalvalue_RFFRF00MT']")
	private WebElement totalLimit_Request_Application_482;

	public WebElement totalLimit_Request_Application_482() {
		return totalLimit_Request_Application_482;
	}

	@FindBy(xpath = "//*[@id='requestFinancingMainTab_RFFRF00MT']")
	private WebElement disbursementLimit_Request_Application_482;

	public WebElement disbursementLimit_Request_Application_482() {
		return disbursementLimit_Request_Application_482;
	}

	@FindBy(xpath = "//*[@id='add_RequestFinancingLimitDetailsGridId_RFFRF00MT']")
	private WebElement addIconDisburseMentLimit_Request_Application_482;

	public WebElement addIconDisburseMentLimit_Request_Application_482() {
		return addIconDisburseMentLimit_Request_Application_482;
	}

	@FindBy(xpath = "//*[@id='lookuptxt_requestFinancingLimitDetailsGeneralFacilityProductClass_RFFRF00MT']")
	private WebElement productClass_LimitDetails_Request_Application_482;

	public WebElement productClass_LimitDetails_Request_Application_482() {
		return productClass_LimitDetails_Request_Application_482;
	}

	@FindBy(xpath = "//*[@id='requestFinancingLimitDetailsCleanFlagdChkBox_RFFRF00MT']")
	private WebElement cleanFlag_LimitDetails_Request_Application_482;

	public WebElement cleanFlag_LimitDetails_Request_Application_482() {
		return cleanFlag_LimitDetails_Request_Application_482;
	}

	@FindBy(xpath = "//*[@id='limitDetails_add_btn_RFFRF00MT']")
	private WebElement addIcon_LimitDetails_Request_Application_482;

	public WebElement addIcon_LimitDetails_Request_Application_482() {
		return addIcon_LimitDetails_Request_Application_482;
	}

	@FindBy(xpath = "//*[@id='requestForFinance_save_as_draft_btn_RFFRF00MT']")
	private WebElement saveButton_LimitDetails_Request_Application_482;

	public WebElement saveButton_LimitDetails_Request_Application_482() {
		return saveButton_LimitDetails_Request_Application_482;
	}

	@FindBy(xpath = "//div[text()='Success']/parent::div/following-sibling::div/div")
	private WebElement getRequestIdInRequestApplication;

	public WebElement getRequestIdInRequestApplication() {
		return getRequestIdInRequestApplication;
	}

	@FindBy(xpath = "//*[@id='requestForFinance_save_btn_RFFRF00MT']")
	private WebElement validateButton_LimitDetails_Request_Application_482;

	public WebElement validateButton_LimitDetails_Request_Application_482() {
		return validateButton_LimitDetails_Request_Application_482;
	}

	
	@FindBy(xpath = "//*[@id='RFFRF00P1']")
	private WebElement approveLevel1Screen_Request_Application_482;

	public WebElement approveLevel1Screen_Request_Application_482() {
		return approveLevel1Screen_Request_Application_482;
	}
	
	@FindBy(xpath = "//*[@id='requestForFinance_approve_btn_RFFRF00P1']")
	private WebElement approveButton_ApproveLevel1Screen_Request_Application_482;
	public WebElement approveButton_ApproveLevel1Screen_Request_Application_482() {
		return approveButton_ApproveLevel1Screen_Request_Application_482;
	}
	
	@FindBy(xpath = "//*[@id='customerGradingRecommendationsTab_RFFRF00P1']")
	private WebElement customerGrading_ApproveLevel1Screen_Request_Application_482;
	public WebElement customerGrading_ApproveLevel1Screen_Request_Application_482() {
		return customerGrading_ApproveLevel1Screen_Request_Application_482;
	}
	
	@FindBy(xpath = "//*[@id='requestDecisionForward_1_RFFRF00P1']")
	private WebElement selectDecision_ApproveLevel1Screen_Request_Application_482;
	public WebElement selectDecision_ApproveLevel1Screen_Request_Application_482() {
		return selectDecision_ApproveLevel1Screen_Request_Application_482;
	}
	
	@FindBy(xpath = "//*[@id='td_requestFinancingGridTbl_Id_RFFRF00P1_1_fmsRequestFinancingVO.CODE']")
	private WebElement selectSearchedCode_ApproveLevel1Screen_Request_Application_482;
	public WebElement selectSearchedCode_ApproveLevel1Screen_Request_Application_482() {
		return selectSearchedCode_ApproveLevel1Screen_Request_Application_482;
	}
	
	@FindBy(xpath = "//*[@id='requestFinancingGridTbl_Id_RFFRF00P1_gs_fmsRequestFinancingVO.CODE']")
	private WebElement searchedCode_ApproveLevel1Screen_Request_Application_482;
	public WebElement searchedCode_ApproveLevel1Screen_Request_Application_482() {
		return searchedCode_ApproveLevel1Screen_Request_Application_482;
	}
	
	@FindBy(xpath = "//*[@id='RFFRF00AC']")
	private WebElement approvalCommiteeRecommendationsScreen_Request_Application_482;
	public WebElement approvalCommiteeRecommendationsScreen_Request_Application_482() {
		return approvalCommiteeRecommendationsScreen_Request_Application_482;
	}

	@FindBy(xpath = "//*[@id='requestFinancingGridTbl_Id_RFFRF00AC_gs_fmsRequestFinancingVO.CODE']")
	private WebElement searchCode_approvalCommiteeRecommendationsScreen_Request_Application_482;
	public WebElement searchCode_approvalCommiteeRecommendationsScreen_Request_Application_482() {
		return searchCode_approvalCommiteeRecommendationsScreen_Request_Application_482;
	}
	
	@FindBy(xpath = "//*[@id='td_requestFinancingGridTbl_Id_RFFRF00AC_1_fmsRequestFinancingVO.CODE']")
	private WebElement selectSearchedCode_approvalCommiteeRecommendationsScreen_Request_Application_482;
	public WebElement selectSearchedCode_approvalCommiteeRecommendationsScreen_Request_Application_482() {
		return selectSearchedCode_approvalCommiteeRecommendationsScreen_Request_Application_482;
	}
	
	@FindBy(xpath = "//*[@id='creditCommitteeRecommendationsTab_RFFRF00AC']")
	private WebElement creditCommitteRecomendationsTab_Request_Application_482;
	public WebElement creditCommitteRecomendationsTab_Request_Application_482() {
		return creditCommitteRecomendationsTab_Request_Application_482;
	}
	
	@FindBy(xpath = "//*[@id='requestFinancingCreditReviewRecommandations_RFFRF00AC']")
	private WebElement recommendationsTab_Request_Application_482;
	public WebElement recommendationsTab_Request_Application_482() {
		return recommendationsTab_Request_Application_482;
	}
	
	@FindBy(xpath = "//*[@id='RequestFinancingRecommendationsGridId_RFFRF00ACghead_0']//span")
	private WebElement addIcon_RecommendationsTab_Request_Application_482;
	public WebElement addIcon_RecommendationsTab_Request_Application_482() {
		return addIcon_RecommendationsTab_Request_Application_482;
	}
	
	@FindBy(xpath = "//*[@id='td_RequestFinancingRecommendationsGridId_RFFRF00AC_1_fmsApplRecommendVO.RECOMMENDATION']")
	private WebElement randomClick_RecommendationsTab_Request_Application_482;
	public WebElement randomClick_RecommendationsTab_Request_Application_482() {
		return randomClick_RecommendationsTab_Request_Application_482;
	}
	
	@FindBy(xpath = "//*[@id='1_fmsApplRecommendVO.RECOMMENDATION_RequestFinancingRecommendationsGridId_RFFRF00AC']")
	private WebElement selectRecommendation_Request_Application_482;
	public WebElement selectRecommendation_Request_Application_482() {
		return selectRecommendation_Request_Application_482;
	}
	
	@FindBy(xpath = "//*[@id='requestFinancing_recommend_Review_btn_RFFRF00AC']")
	private WebElement recommendButton_Request_Application_482;
	public WebElement recommendButton_Request_Application_482() {
		return recommendButton_Request_Application_482;
	}
	
	
	
}
