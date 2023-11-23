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
	
	
	//*****************************************************************************************************************************
	//@AT_FM_018
	
	@FindBy(xpath = "//td[normalize-space()='Parameters']")
	private WebElement Sads_Parameter_Menu;
	public WebElement SadsParameterMenu() {
		return Sads_Parameter_Menu;
	}
	
	@FindBy(xpath = "//td[normalize-space()='Account Restrictions']")
	private WebElement Rescrict_Account_Module;
	public WebElement RescrictAccountModule() {
		return Rescrict_Account_Module;
	}
	
	@FindBy(xpath = "//a[@id='UR00M']//span[contains(text(),'Maintenance')]")
	private WebElement Rescrict_Account_Maintenance;
	public WebElement RescrictAccountMaintenance() {
		return Rescrict_Account_Maintenance;
	}
	
	@FindBy(xpath = "//div//input[@name=\"ctsRestrictionsVO.CODE\"]")
	private WebElement Rescrict_Code_Feild;
	public WebElement RescrictCodeFeild() {
		return Rescrict_Code_Feild;
	}
	
	@FindBy(xpath = "//input[@id='description_UR00M']")
	private WebElement Rescrict_Account_Description;
	public WebElement RescrictAccountDescription() {
		return Rescrict_Account_Description;
	}
	
	
	@FindBy(xpath = "//td[@id='td_ctsRestOptTreeGridTbl_Id_UR00M_1_progDesc']")
	private WebElement Rescrict_Account_App_Root_Rec;
	public WebElement RescrictAccountAppRecRoot() {
		return Rescrict_Account_App_Root_Rec;
	}
	
	@FindBy(xpath = "//input[@id='ROOT__ROOT_hasRestrictionYN_ctsRestOptTreeGridTbl_Id_UR00M']")
	private WebElement Rescrict_Account_App_Root_Flag;
	public WebElement RescrictAccountAppRootFlag() {
		return Rescrict_Account_App_Root_Flag;
	}
	
	@FindBy(xpath = "//td[@id='td_ctsRestBranchesTreeGridTbl_Id_UR00M_1_progDesc']")
	private WebElement Rescrict_Account_Customer_Root_Rec;
	public WebElement RescrictAccountCustomerRecRoot() {
		return Rescrict_Account_Customer_Root_Rec;
	}
	
	@FindBy(xpath = "//input[@id='ROOT__ROOT__branchGrid_hasRestrictionYN_ctsRestBranchesTreeGridTbl_Id_UR00M']")
	private WebElement Rescrict_Account_Customer_Root_Flag;
	public WebElement RescrictAccountCustomerRootFlag() {
		return Rescrict_Account_Customer_Root_Flag;
	}
	
	@FindBy(xpath = "//input[@id='userGridId_UR00M_gs_usrVO.USER_ID']")
	private WebElement Rescrict_Account_User_Id_Search_Bar;
	public WebElement RescrictAccountUserIdSearchBar() {
		return Rescrict_Account_User_Id_Search_Bar;
	}
	
	@FindBy(xpath = "//td[@id='td_userGridId_UR00M_1_usrVO.USER_ID']")
	private WebElement Rescrict_Account_User_Id_Searched_Rec;
	public WebElement RescrictAccountUserIdSearchedRec() {
		return Rescrict_Account_User_Id_Searched_Rec;
	}
	
	@FindBy(xpath = "//td[@id='add_restrictionsGridTbl_Id_UR00M']//span[@class='ui-icon ui-icon-plus']")
	private WebElement Rescrict_Account_Add_Icon_Btn;
	public WebElement RescrictAccountAddIconBtn() {
		return Rescrict_Account_Add_Icon_Btn;
	}	
	
	@FindBy(xpath = "//select[@id='new_1698819296187_restrictionType']")
	private WebElement Rescrict_Account_Restrict_Type_DropDown;
	public WebElement RescrictAccountRestrictTypeDropDown() {
		return Rescrict_Account_Restrict_Type_DropDown;
	}
	
	@FindBy(xpath = "//span[@class='ui-icon ui-icon-search live-search-ui']")
	private WebElement Rescrict_Account_Gl_Code_Search_Icon;
	public WebElement RescrictAccountGlCodeSearchIcon() {
		return Rescrict_Account_Gl_Code_Search_Icon;
	}
	
	@FindBy(xpath = "//input[@id='gridtab_glCode_no_UR00M_gs_GL_CODE']")
	private WebElement Rescrict_Account_Gl_Code_Search_Feild;
	public WebElement RescrictAccountGlCodeSearchFeild() {
		return Rescrict_Account_Gl_Code_Search_Feild;
	}
	
	@FindBy(xpath = "//td[@title= '805224']")
	private WebElement Rescrict_Account_Gl_Code_Searched_Rec;
	public WebElement RescrictAccountGlCodeSearchedRec() {
		return Rescrict_Account_Gl_Code_Searched_Rec;
	}
	
	@FindBy(xpath = "//label[@id='ctsRestrictionsFormId_UR00M_Save_key']")
	private WebElement Rescrict_Account_Save_key;
	public WebElement RescrictAccountSave_key() {
		return Rescrict_Account_Save_key;
	}
	
	
}
