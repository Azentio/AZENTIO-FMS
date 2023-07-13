package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FMS_PageObjects_609 {
	WebDriver driver;
	public FMS_PageObjects_609(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
///***************************************************FMS_PARAMS******************************************************************************///
	@FindBy(xpath = "//td[text()='Parameters']")
	private WebElement Parameters;
	public WebElement Parameters() {
		return Parameters;
	}
	
	@FindBy(xpath = "//td[text()='Facility Type']")
	private WebElement ParametersFacilityType;
	public WebElement Parameters_FacilityType() {
		return ParametersFacilityType;
	}

	@FindBy(xpath = "//span[text()='Update After Approve']")
	private WebElement FacilityTypeUpdateAfterApprove;
	public WebElement FacilityType_UpdateAfterApprove() {
		return FacilityTypeUpdateAfterApprove;
	}
	
	@FindBy(xpath = "//input[@id='fmsFacilityTypeListGridTbl_Id_P008UP_gs_CODE']")
	private WebElement FacilityType_UpdateAfterApprove_Code;
	public WebElement FacilityType_UpdateAfterApprove_Code() {
		return FacilityType_UpdateAfterApprove_Code;
	}
	
	@FindBy(xpath = "//li[@id='fmsFacilityTypeDetailsTab_P008UP']/a/span[text()='Facility Details']")
	private WebElement FacilityTypeUpdateAfterApproveFacilityDetails;
	public WebElement FacilityType_UpdateAfterApprove_FacilityDetails() {
		return FacilityTypeUpdateAfterApproveFacilityDetails;
	}

	@FindBy(xpath = "//span[text()='STP Facility Requirements']")
	private WebElement FacilityTypeFacilitydetailsSTPFacilityRequirements;
	public WebElement FacilityType_Facilitydetails_STPFacilityRequirements() {
		return FacilityTypeFacilitydetailsSTPFacilityRequirements;
	}
	
	@FindBy(xpath = "//input[@name='fmsFacilityTypeCO.fmsFacilityTypeVO.MANDATORY_GRADING']")
	private WebElement STPFacilityRequirementsMandatoryCustomerGrading;
	public WebElement STPFacilityRequirements_Mandatory_Customer_Grading() {
		return STPFacilityRequirementsMandatoryCustomerGrading;
	}
	
	@FindBy(xpath = "//label[text()='Customer Grading ']//parent::td/input[1]")
	private WebElement STPFacilityRequirementsCustomerGrading;
	public WebElement STPFacilityRequirements_CustomerGrading() {
		return STPFacilityRequirementsCustomerGrading;
	}
	
	@FindBy(xpath = "//label[text()='Overwrite Grading ']//parent::td/input[1]")
	private WebElement STPFacilityRequirementsOverwriteGrading;
	public WebElement STPFacilityRequirements_OverwriteGrading() {
		return STPFacilityRequirementsOverwriteGrading;
	}
	
	@FindBy(xpath = "//label[text()='Committee Approval ']//parent::td/input[1]")
	private WebElement STPFacilityRequirementsCommitteeApproval;
	public WebElement STPFacilityRequirements_CommitteeApproval() {
		return STPFacilityRequirementsCommitteeApproval;
	}
	
	@FindBy(xpath = "//label[text()='Credit Review ']//parent::td/input[1]")
	private WebElement STPFacilityRequirementsCreditReview ;
	public WebElement STPFacilityRequirements_CreditReview () {
		return STPFacilityRequirementsCreditReview ;
	}
	
	@FindBy(xpath = "//label[text()='Credit Authorization ']//parent::td/input[1]")
	private WebElement STPFacilityRequirementsCreditAuthorization;
	public WebElement STPFacilityRequirements_CreditAuthorization() {
		return STPFacilityRequirementsCreditAuthorization;
	}
	
	@FindBy(xpath = "//label[text()='Issue Facility Offer ']//parent::td/input[1]")
	private WebElement STPFacilityRequirementsIssueFacilityOffer;
	public WebElement STPFacilityRequirements_IssueFacilityOffer() {
		return STPFacilityRequirementsIssueFacilityOffer;
	}
	
	@FindBy(xpath = "//label[text()='Client Response ']//parent::td/input[1]")
	private WebElement STPFacilityRequirementsClientResponse ;
	public WebElement STPFacilityRequirements_ClientResponse () {
		return STPFacilityRequirementsClientResponse ;
	}
	
	@FindBy(xpath = "//label[text()='Document Validation ']//parent::td/input[1]")
	private WebElement STPFacilityRequirementsDocumentValidation ;
	public WebElement STPFacilityRequirements_DocumentValidation () {
		return STPFacilityRequirementsDocumentValidation ;
	}
	
	@FindBy(xpath = "//label[text()='Final Approval ']//parent::td/input[1]")
	private WebElement STPFacilityRequirementsFinalApproval ;
	public WebElement STPFacilityRequirements_FinalApproval () {
		return STPFacilityRequirementsFinalApproval ;
	}
	
	@FindBy(xpath = "//label[text()='Create Active Facility If Within Limits ']//parent::td/input[1]")
	private WebElement STPFacilityRequirementsCreateActiveFacilityIfWithinLimits ;
	public WebElement STPFacilityRequirements_CreateActiveFacilityIfWithinLimits () {
		return STPFacilityRequirementsCreateActiveFacilityIfWithinLimits ;
	}
	
	@FindBy(xpath = "//label[text()='Automatically Approve Facility If Within Limits ']//parent::td/input[1]")
	private WebElement STPFacilityRequirementsAutomaticallyApproveFacilityIfWithinLimits  ;
	public WebElement STPFacilityRequirements_AutomaticallyApproveFacilityIfWithinLimits  () {
		return STPFacilityRequirementsAutomaticallyApproveFacilityIfWithinLimits  ;
	}
			      
	@FindBy(xpath = "//label[text()='Update ' and @id='fmsFacilityTypeMaintFormId_P008UP_Update_key']")
	private WebElement FacilityTypeUpdate;
	public WebElement FacilityType_Update() {
		return FacilityTypeUpdate;
	}
	
	@FindBy(xpath = "//a[@id='P008P']/span[2][text()='Approve']")
	private WebElement FacilityTypeApprovescreen;
	public WebElement FacilityType_Approvescreen() {
		return FacilityTypeApprovescreen;
	}
	
	@FindBy(xpath = "//input[@name='CODE' and @id='fmsFacilityTypeListGridTbl_Id_P008P_gs_CODE']")
	private WebElement FacilityType_ApproveScreen_Code;
	public WebElement FacilityType_ApproveScreen_Code() {
		return FacilityType_ApproveScreen_Code;
	}
	
	@FindBy(xpath = "//td[text()='19']")
	private WebElement FacilityTypeApproveScreenSelectcode;
	public WebElement FacilityType_ApproveScreen_Selectcode() {
		return FacilityTypeApproveScreenSelectcode;
	}
	
	@FindBy(xpath = "//label[@id='fmsFacilityTypeMaintFormId_P008P_approve_key' and text()='Approve ']")
	private WebElement FacilityTypeApproveScreenApprove;
	public WebElement FacilityType_ApproveScreen_Approve() {
		return FacilityTypeApproveScreenApprove;
	}
				
	@FindBy(id = "_popup_path_sol_confirm_ok")
	private WebElement Application_Confirmok;
	public WebElement Application_Confirmok() {
		return Application_Confirmok;
	}
	/*
	@FindBy(id = "_popup_path_sol_ok")
	private WebElement Ok;
	public WebElement Ok() {
		return Ok;
	}
	*/

	@FindBy(id = "_popup_path_sol_ok")
	private WebElement Application_Ok;
	public WebElement Application_Ok() {
		return Application_Ok;
	}
	
	@FindBy(xpath = "//input[@id='_popup_path_sol_confirm_ok']")
	private WebElement ConfirmAlert_Ok;
	public WebElement ConfirmAlert_Ok() {
		return ConfirmAlert_Ok;
	}
	
	@FindBy(xpath = "//div[text()='CONFIRM']")
    private WebElement confirmPopup_609;
    public WebElement confirmPopup_609() {
        return confirmPopup_609;
    }
	
	///*************************************Sprint = 9*************************************///
	///*************************************  718066  *************************************///
	
	@FindBy(xpath = "//td[text()='REQUEST FOR FINANCIN']")
	private WebElement FmsCore_REQUESTFORFINANCIN_609;
	public WebElement FmsCore_REQUESTFORFINANCIN_609() {
		return FmsCore_REQUESTFORFINANCIN_609;
	}
	
	@FindBy(xpath = "//td[text()='Request For Financing']")
	private WebElement REQUESTFORFINANCIN_RequestForFinancing_609;
	public WebElement REQUESTFORFINANCIN_RequestForFinancing_609() {
		return REQUESTFORFINANCIN_RequestForFinancing_609;
	}
	
	@FindBy(xpath = "//a[@id='CSMRF00MT']/span[text()='Maintenance']")
	private WebElement REQUESTFORFINANCIN_RequestForFinancing_Maintenance_609;
	public WebElement REQUESTFORFINANCIN_RequestForFinancing_Maintenance_609() {
		return REQUESTFORFINANCIN_RequestForFinancing_Maintenance_609;
	}
	
	@FindBy(xpath = "//select[@id='requestFinancingApplicationFor_CSMRF00MT']")
	private WebElement REQUESTFORFINANCIN_RequestForFinancing_Maintenance_ReasonForSubmission_609;
	public WebElement REQUESTFORFINANCIN_RequestForFinancing_Maintenance_ReasonForSubmission_609() {
		return REQUESTFORFINANCIN_RequestForFinancing_Maintenance_ReasonForSubmission_609;
	}
	
	@FindBy(xpath = "//span[@id='spanLookup_requestFinanacingCif_CSMRF00MT']/span")
	private WebElement REQUESTFORFINANCIN_RequestForFinancing_Maintenance_Customer_Search_609;
	public WebElement REQUESTFORFINANCIN_RequestForFinancing_Maintenance_Customer_Search_609() {
		return REQUESTFORFINANCIN_RequestForFinancing_Maintenance_Customer_Search_609;
	}
	
	@FindBy(xpath = "//input[@id='gridtab_requestFinanacingCif_CSMRF00MT_gs_cifVO.CIF_NO']")
	private WebElement REQUESTFORFINANCIN_RequestForFinancing_Maintenance_Customer_609;
	public WebElement REQUESTFORFINANCIN_RequestForFinancing_Maintenance_Customer_609() {
		return REQUESTFORFINANCIN_RequestForFinancing_Maintenance_Customer_609;
	}
	
	@FindBy(xpath = "//input[@id='gridtab_requestFinancingFacilityType_CSMRF00MT_gs_CODE']")
	private WebElement REQUESTFORFINANCIN_RequestForFinancing_Maintenance_FacilityType_609;
	public WebElement REQUESTFORFINANCIN_RequestForFinancing_Maintenance_FacilityType_609() {
		return REQUESTFORFINANCIN_RequestForFinancing_Maintenance_FacilityType_609;
	}
	
	@FindBy(xpath = "//span[@id='spanLookup_requestFinancingFacilityType_CSMRF00MT']/span")
	private WebElement REQUESTFORFINANCIN_RequestForFinancing_Maintenance_FacilityTypeSearch_609;
	public WebElement REQUESTFORFINANCIN_RequestForFinancing_Maintenance_FacilityTypeSearch_609() {
		return REQUESTFORFINANCIN_RequestForFinancing_Maintenance_FacilityTypeSearch_609;
	}
	
	@FindBy(xpath= "//input[@id='requestFinancingFacilityTotalvalue_CSMRF00MT']")
	private WebElement REQUESTFORFINANCIN_RequestForFinancing_Maintenance_TotalLimit_609;
	public WebElement REQUESTFORFINANCIN_RequestForFinancing_Maintenance_TotalLimit_609() {
		return REQUESTFORFINANCIN_RequestForFinancing_Maintenance_TotalLimit_609;
	}
	
	@FindBy(xpath = "//li[@id='requestFinancingLimitDtlsTabs_CSMRF00MT']/a/span[text()='Disbursement/Sublimit']")
	private WebElement REQUESTFORFINANCIN_RequestForFinancing_Maintenance_Sublimit_609;
	public WebElement REQUESTFORFINANCIN_RequestForFinancing_Maintenance_Sublimit_609() {
		return REQUESTFORFINANCIN_RequestForFinancing_Maintenance_Sublimit_609;
	}
	
	@FindBy(xpath = "//td[@id='add_RequestFinancingLimitDetailsGridId_CSMRF00MT']/div/span")
	private WebElement REQUESTFORFINANCIN_Sublimit_Addicon_609;
	public WebElement REQUESTFORFINANCIN_Sublimit_Addicon_609() {
		return REQUESTFORFINANCIN_Sublimit_Addicon_609;
	}
	
	@FindBy(xpath = "//span[@id='spanLookup_requestFinancingLimitDetailsGeneralFacilityProductClass_CSMRF00MT']/span")
	private WebElement REQUESTFORFINANCIN_Sublimit_ProductClass_Search_609;
	public WebElement REQUESTFORFINANCIN_Sublimit_ProductClass_Search_609() {
		return REQUESTFORFINANCIN_Sublimit_ProductClass_Search_609;
	}
	
	@FindBy(xpath = "//select[@id='requestFinancingGeneralFacilityType_RFFRF00MT']")
	private WebElement REQUESTFORFINANCIN_Sublimit_Item_609;
	public WebElement REQUESTFORFINANCIN_Sublimit_Item_609() {
		return REQUESTFORFINANCIN_Sublimit_Item_609;
	}
	
	@FindBy(xpath = "//input[@id='gridtab_requestFinancingLimitDetailsGeneralFacilityProductClass_CSMRF00MT_gs_DESC_ENG']")
	private WebElement REQUESTFORFINANCIN_Sublimit_ProductClass_609;
	public WebElement REQUESTFORFINANCIN_Sublimit_ProductClass_609() {
		return REQUESTFORFINANCIN_Sublimit_ProductClass_609;
	}
	
	@FindBy(xpath = "//span[@id='spanLookup_requestFinancingLimitDetailsClassType_RFFRF00MT']/span")
	private WebElement REQUESTFORFINANCIN_Sublimit_Type_Search_609;
	public WebElement REQUESTFORFINANCIN_Sublimit_Type_Search_609() {
		return REQUESTFORFINANCIN_Sublimit_Type_Search_609;
	}
	
	@FindBy(xpath = "//input[@id='gridtab_requestFinancingLimitDetailsClassType_RFFRF00MT_gs_CODE']")
	private WebElement REQUESTFORFINANCIN_Sublimit_Type_609;
	public WebElement REQUESTFORFINANCIN_Sublimit_Type_609() {
		return REQUESTFORFINANCIN_Sublimit_Type_609;
	}
	
	
	
	
	
	
	
	@FindBy(xpath = "//input[@id='requestFinancingLimitDetailsCleanFlagdChkBox_CSMRF00MT']")
	private WebElement REQUESTFORFINANCIN_Sublimit_ProductClass_Clean_609;
	public WebElement REQUESTFORFINANCIN_Sublimit_ProductClass_Clean_609() {
		return REQUESTFORFINANCIN_Sublimit_ProductClass_Clean_609;
	}
	
	@FindBy(xpath = "//input[@id='requestFinancingLimitDetailsPeriodicityNbr_RFFRF00MT']")
	private WebElement REQUESTFORFINANCIN_Sublimit_ProductClass_Tenure_609;
	public WebElement REQUESTFORFINANCIN_Sublimit_ProductClass_Tenure_609() {
		return REQUESTFORFINANCIN_Sublimit_ProductClass_Tenure_609;
	}
	 
	@FindBy(xpath = "//input[@id='requestFinancingLimitDetailsRfNewMargin_CSMRF00MT']")
	private WebElement REQUESTFORFINANCIN_Sublimit_ProductClass_NewMargin_609;
	public WebElement REQUESTFORFINANCIN_Sublimit_ProductClass_NewMargin_609() {
		return REQUESTFORFINANCIN_Sublimit_ProductClass_NewMargin_609;
	}
	
	@FindBy(xpath = "//button[@id='limitDetails_add_btn_CSMRF00MT']/span[contains(text(),' Add ')]")
	private WebElement REQUESTFORFINANCIN_Sublimit_ProductClass_Add_609;
	public WebElement REQUESTFORFINANCIN_Sublimit_ProductClass_Add_609() {
		return REQUESTFORFINANCIN_Sublimit_ProductClass_Add_609;
	}
	
	
	@FindBy(xpath = "//div[@id='div__popup_path_sol_ok']/div[2]/div")
	private WebElement ApplicationNo_609;
	public WebElement ApplicationNo_609() {
		return ApplicationNo_609;
	}
	
	
	
	@FindBy(id = "_popup_path_sol_confirm_ok")
	private WebElement ConfirmPopUp_609;
	public WebElement ConfirmPopUp_609() {
		return ConfirmPopUp_609;
	}
	
	@FindBy(xpath = "//a[@id='dismissbut_WIFT001MT']/span")
	private WebElement SendAlert_Ok_609;
	public WebElement SendAlert_Ok_609() {
		return SendAlert_Ok_609;
	}
	
	@FindBy(xpath = "//a[@id='dismissbut_WIFT001AP3']")
    private WebElement sendAlertPopup1_609;
    public WebElement sendAlertPopup1_609() {
        return sendAlertPopup1_609;
    }
    
    @FindBy(xpath = "//a[@id='dismissbut_WIFT003MT']")
    private WebElement Grading_sendAlertPopup_609;
    public WebElement Grading_sendAlertPopup_609() {
        return Grading_sendAlertPopup_609;
    }
	
	
	@FindBy(xpath = "//span[text()='Approve Level 1']")
	private WebElement REQUESTFORFINANCIN_RequestForFinancing_ApproveLevel1_609;
	public WebElement REQUESTFORFINANCIN_RequestForFinancing_ApproveLevel1_609() {
		return REQUESTFORFINANCIN_RequestForFinancing_ApproveLevel1_609;
	}
	
	@FindBy(xpath = "//td[@id='requestFinancingGridTbl_Id_CSMRF00P1_pager_left']//td[text()='Clear']")
	private WebElement REQUESTFORFINANCIN_RequestForFinancing_ApproveLevel1_Clear_609;
	public WebElement REQUESTFORFINANCIN_RequestForFinancing_ApproveLevel1_Clear_609() {
		return REQUESTFORFINANCIN_RequestForFinancing_ApproveLevel1_Clear_609;
	}
	
	@FindBy(xpath = "//input[@id='requestFinancingGridTbl_Id_CSMRF00P1_gs_fmsRequestFinancingVO.CODE']")
	private WebElement REQUESTFORFINANCIN_RequestForFinancing_ApproveLevel1_Code_609;
	public WebElement REQUESTFORFINANCIN_RequestForFinancing_ApproveLevel1_Code_609() {
		return REQUESTFORFINANCIN_RequestForFinancing_ApproveLevel1_Code_609;
	}
	
	@FindBy(xpath = "//li[@id='customerGradingRecommendationsTab_CSMRF00P1']/a/span[text()='Customer Grading & Recommendations']")
	private WebElement REQUESTFORFINANCIN_RequestForFinancing_ApproveLevel1_CustomerGradingRecommendations_609;
	public WebElement REQUESTFORFINANCIN_RequestForFinancing_ApproveLevel1_CustomerGradingRecommendations_609() {
		return REQUESTFORFINANCIN_RequestForFinancing_ApproveLevel1_CustomerGradingRecommendations_609;
	}
	

	
	
	
	
	
	
	
	@FindBy(xpath = "//select[@id='requestDecisionForward_1_CSMRF00P1']")
	private WebElement REQUESTFORFINANCIN_RequestForFinancing__ApproveLevel1_CustomerGradingRecommendations_Decision_609;
	public WebElement REQUESTFORFINANCIN_RequestForFinancing__ApproveLevel1_CustomerGradingRecommendations_Decision_609() {
		return REQUESTFORFINANCIN_RequestForFinancing__ApproveLevel1_CustomerGradingRecommendations_Decision_609;
	}
	
	
	
	
	
	@FindBy(xpath = "//select[@name='requestFinancingCO.fmsAppl3BlobsVO.FORWARD_P1']//parent::td[@id='lbl_requestDecisionForward_P1_CSMRF00P1']")
	private WebElement REQUESTFORFINANCIN_RequestForFinancing__ApproveLevel1_CustomerGradingRecommendations_Decision_MoreRecommendations_609;
	public WebElement REQUESTFORFINANCIN_RequestForFinancing__ApproveLevel1_CustomerGradingRecommendations_Decision_MoreRecommendations_609() {
		return REQUESTFORFINANCIN_RequestForFinancing__ApproveLevel1_CustomerGradingRecommendations_Decision_MoreRecommendations_609;
	}
	
	@FindBy(xpath = "//select[@id='requestP1approvalCommitte_CSMRF00P1']")
	private WebElement REQUESTFORFINANCIN_RequestForFinancing__ApproveLevel1_CustomerGradingRecommendations_ApprovalCommittee_609;
	public WebElement REQUESTFORFINANCIN_RequestForFinancing__ApproveLevel1_CustomerGradingRecommendations_ApprovalCommittee_609() {
		return REQUESTFORFINANCIN_RequestForFinancing__ApproveLevel1_CustomerGradingRecommendations_ApprovalCommittee_609;
	}
	
	@FindBy(xpath = "//label[text()='Approve ']")
	private WebElement REQUESTFORFINANCIN_Approve_609;
	public WebElement REQUESTFORFINANCIN_Approve_609() {
		return REQUESTFORFINANCIN_Approve_609;
	}
	
	@FindBy(xpath = "//span[text()='Approval Committee Recommendations ']")
	private WebElement REQUESTFORFINANCINRequestForFinancingApprovalCommitteeRecommendations;
	public WebElement REQUESTFORFINANCIN_RequestForFinancing_ApprovalCommitteeRecommendations() {
		return REQUESTFORFINANCINRequestForFinancingApprovalCommitteeRecommendations;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	@FindBy(xpath = "//input[@id='requestFinancingGridTbl_Id_CSMRF00AC_gs_fmsRequestFinancingVO.CODE']")
	private WebElement REQUESTFORFINANCINRequestForFinancingApprovalCommitteeRecommendationsCode;
	public WebElement REQUESTFORFINANCIN_RequestForFinancing_ApprovalCommitteeRecommendations_Code() {
		return REQUESTFORFINANCINRequestForFinancingApprovalCommitteeRecommendationsCode;
	}
	
	
	//     (//table[@id='requestFinancingGridTbl_Id_CSMRF00AC']/tbody/tr[2]/td)[1][text()='0000003973']  =>code
	
	
	@FindBy(xpath = "//li[@id='creditCommitteeRecommendationsTab_CSMRF00AC']/a/span[text()='Credit Committee Recommendations']")
	private WebElement REQUESTFORFINANCINRequestForFinancingApprovalCreditCommitteeRecommendations;
	public WebElement REQUESTFORFINANCIN_RequestForFinancing_Approval_CreditCommitteeRecommendations() {
		return REQUESTFORFINANCINRequestForFinancingApprovalCreditCommitteeRecommendations;
	}
	
	@FindBy(xpath = "//div[@id='requestFinancingCreditReviewRecommandations_CSMRF00AC']/div/span[text()='Recommendations']")
	private WebElement REQUESTFORFINANCINRequestForFinancingApprovalCommitteeRecommendationsRecommendationsLabel;
	public WebElement REQUESTFORFINANCIN_RequestForFinancing_ApprovalCommitteeRecommendations_RecommendationsLabel() {
		return REQUESTFORFINANCINRequestForFinancingApprovalCommitteeRecommendationsRecommendationsLabel;
	}
	
	
	
	
	
	
	@FindBy(xpath = "//tr[@id='RequestFinancingRecommendationsGridId_RFFRF00ACghead_0']/td/span")
	private WebElement REQUESTFORFINANCINRequestForFinancingApprovalCommitteeRecommendationsRecommendationsicon;
	public WebElement REQUESTFORFINANCIN_RequestForFinancing_ApprovalCommitteeRecommendations_Recommendationsicon() {
		return REQUESTFORFINANCINRequestForFinancingApprovalCommitteeRecommendationsRecommendationsicon;
	}
	
	@FindBy(xpath = "//td[@id='td_RequestFinancingRecommendationsGridId_RFFRF00AC_1_fmsApplRecommendVO.RECOMMENDATION']")
	private WebElement REQUESTFORFINANCINRequestForFinancingApprovalCommitteeRecommendationsField;
	public WebElement REQUESTFORFINANCIN_RequestForFinancing_ApprovalCommitteeRecommendations_Field() {
		return REQUESTFORFINANCINRequestForFinancingApprovalCommitteeRecommendationsField;
	}
	
	@FindBy(xpath = "//td[@id='td_RequestFinancingRecommendationsGridId_RFFRF00AC_1_fmsApplRecommendVO.RECOMMENDATION']/select")
	private WebElement REQUESTFORFINANCINRequestForFinancingApprovalCommitteeRecommendationsRecommendationsSelect;
	public WebElement REQUESTFORFINANCIN_RequestForFinancing_ApprovalCommitteeRecommendations_RecommendationsSelect() {
		return REQUESTFORFINANCINRequestForFinancingApprovalCommitteeRecommendationsRecommendationsSelect;
	}
	
	@FindBy(xpath = "//label[@id='requestFinancingFormId_RFFRF00AC_Recommendation_key']")
	private WebElement REQUESTFORFINANCINRequestForFinancingApprovalCommitteeRecommendationsRecommendationsApproveBtn;
	public WebElement REQUESTFORFINANCIN_RequestForFinancing_ApprovalCommitteeRecommendations_RecommendationsApproveBtn() {
		return REQUESTFORFINANCINRequestForFinancingApprovalCommitteeRecommendationsRecommendationsApproveBtn;
	}
	
	
	@FindBy(xpath = "//a[@id='infoBarSearchButton_RFFRF00MT']/span")
	private WebElement REQUESTFORFINANCINSearch;
	public WebElement REQUESTFORFINANCINSearch() {
		return REQUESTFORFINANCINSearch;
	}
	
	
	@FindBy(xpath = "//td[text()='Clear']//ancestor::td[@id='requestFinancingGridTbl_Id_RFFRF00P1_pager_left']")
	private WebElement REQUESTFORFINANCINClear;
	public WebElement REQUESTFORFINANCIN_Clear() {
		return REQUESTFORFINANCINClear;
	}
	
	
	
	
	
	@FindBy(xpath = "//input[@name='applicationFacilityCO.fmsAppLimitDetCO.fmsAppLimitDetVO.CLEAN_FLAG']")
	private WebElement ApplicationforfinancialfacilitiesMaintenanceLimitDetailsTabClean;
	public WebElement Applicationforfinancialfacilities_Maintenance_LimitDetailsTab_Clean() {
		return ApplicationforfinancialfacilitiesMaintenanceLimitDetailsTabClean;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@FindBy(xpath = "//td[text()='WIFAK APPLICATION']//ancestor::div[@id='_selenuimAPPLICATION']/h3/table/tbody/tr/td[2]")
	private WebElement FmsWifakappliction;
	public WebElement Fms_Wifakappliction() {
		return FmsWifakappliction;
	}
	
	@FindBy(xpath = "//td[text()='WIFAK APPLICATION']//ancestor::div[@id='_selenuimWIF']/li/a/table/tbody/tr/td[2]")
	private WebElement WifakapplictionWifakapplictionSubmenu;
	public WebElement Wifakappliction_WifakapplictionSubmenu() {
		return WifakapplictionWifakapplictionSubmenu;
	}
	
	@FindBy(xpath = "//td[text()='Application For Financial Facilities']")
	private WebElement WifakapplictionSubmenuApplicationforfinancialfacilities;
	public WebElement WifakapplictionSubmenu_Applicationforfinancialfacilities() {
		return WifakapplictionSubmenuApplicationforfinancialfacilities;
	}
	
	@FindBy(xpath = "//a[@id='WIFT001MT']//span[text()='Maintenance']")
	private WebElement WifakapplictionSubmenuApplicationforfinancialfacilitiesMaintenance;
	public WebElement WifakapplictionSubmenu_Applicationforfinancialfacilities_Maintenance() {
		return WifakapplictionSubmenuApplicationforfinancialfacilitiesMaintenance;
	}
	
	@FindBy(xpath = "//select[@id='applicationFacilityApplicationfor_WIFT001MT']")
	private WebElement ApplicationforfinancialfacilitiesMaintenanceApplicationfor;
	public WebElement Applicationforfinancialfacilities_Maintenance_Applicationfor() {
		return ApplicationforfinancialfacilitiesMaintenanceApplicationfor;
	}
	
	@FindBy(xpath = "//div[@id='lookupid_applicationFacilitycif_WIFT001MT']/span/span")
	private WebElement  ApplicationforfinancialfacilitiesMaintenanceCifnoSearch;
	public WebElement Applicationforfinancialfacilities_Maintenance_CifnoSearch() {
		return  ApplicationforfinancialfacilitiesMaintenanceCifnoSearch;
	}
	
	@FindBy(xpath = "//input[@id='gridtab_applicationFacilitycif_WIFT001MT_gs_cifVO.CIF_NO']")
	private WebElement  ApplicationforfinancialfacilitiesMaintenanceCifno;
	public WebElement Applicationforfinancialfacilities_Maintenance_Cifno() {
		return  ApplicationforfinancialfacilitiesMaintenanceCifno;
	}
	
	
	@FindBy(xpath = "//td[@id='next_pagerid_applicationFacilitycif_WIFT001MT']/span")
	private WebElement  CifnoGridNext;
	public WebElement CifnoGridNext() {
		return  CifnoGridNext;
	}
	
	
	
	
	@FindBy(xpath =  "//span[@id='spanLookup_applicationFacilityFacilityType_WIFT001MT']/span")
	private WebElement ApplicationforfinancialfacilitiesMaintenanceFacilitytypeSearch;
	public WebElement Applicationforfinancialfacilities_Maintenance_FacilitytypeSearch() {
		return ApplicationforfinancialfacilitiesMaintenanceFacilitytypeSearch;
	}
	
	@FindBy(xpath =  "//input[@id='gridtab_applicationFacilityFacilityType_WIFT001MT_gs_CODE']")
	private WebElement ApplicationforfinancialfacilitiesMaintenanceFacilitytype;
	public WebElement Applicationforfinancialfacilities_Maintenance_Facilitytype() {
		return ApplicationforfinancialfacilitiesMaintenanceFacilitytype;
	}
	
	
	@FindBy(xpath = "//td[@id='next_pagerid_applicationFacilityFacilityType_WIFT001MT']/span")
	private WebElement  FacilityTypeGridNext;
	public WebElement FacilityTypeGridNext() {
		return  FacilityTypeGridNext;
	}
	
	
	@FindBy(xpath = "//span[@id='spanLookup_applicationFacilityCountry_WIFT001MT']/span")
	private WebElement ApplicationforfinancialfacilitiesMaintenanceCountryoffinancingSearch;
	public WebElement Applicationforfinancialfacilities_Maintenance_CountryoffinancingSearch() {
		return ApplicationforfinancialfacilitiesMaintenanceCountryoffinancingSearch;
	}
	
	@FindBy(xpath =  "//input[@name='COUNTRY_CODE']")
	private WebElement ApplicationforfinancialfacilitiesMaintenanceCountryoffinancing;
	public WebElement Applicationforfinancialfacilities_Maintenance_Countryoffinancing() {
		return ApplicationforfinancialfacilitiesMaintenanceCountryoffinancing;
	}
	
	@FindBy(xpath = "//td[@id='next_pagerid_applicationFacilityCountry_WIFT001MT']/span")
	private WebElement  CountryoffinancingGridNext;
	public WebElement CountryoffinancingGridNext() {
		return  CountryoffinancingGridNext;
	}
	/*
	@FindBy(xpath =  "//input[@name='applicationFacilityCO.fmsApplVO.FIN_COUNTRY']")
	private WebElement ApplicationforfinancialfacilitiesMaintenanceCountryoffinancing;
	public WebElement Applicationforfinancialfacilities_Maintenance_Countryoffinancing() {
		return ApplicationforfinancialfacilitiesMaintenanceCountryoffinancing;
	}
	
	@FindBy(xpath =  "//table[@id='gridtab_applicationFacilityCountry_WIFT001MT']/tbody/tr[2]/td")
	private WebElement ApplicationforfinancialfacilitiesMaintenanceCountryoffinancingSelect;
	public WebElement Applicationforfinancialfacilities_Maintenance_CountryoffinancingSelect() {
		return ApplicationforfinancialfacilitiesMaintenanceCountryoffinancingSelect;
	}
	*/
	@FindBy(xpath = "//span[@id='spanLookup_applicationFacilityRating_WIFT001MT']/span")
	private WebElement ApplicationforfinancialfacilitiesMaintenanceFacilityRatingSearch;
	public WebElement Applicationforfinancialfacilities_Maintenance_FacilityRatingSearch() {
		return ApplicationforfinancialfacilitiesMaintenanceFacilityRatingSearch;
	}

	
	
	
	//@FindBy(xpath =  "//td[@id='td_gridtab_applicationFacilityRating_WIFT001MT_1_LINE_NBR']")
	@FindBy(xpath = "//input[@id='gridtab_applicationFacilityRating_WIFT001MT_gs_FRR_RATING']")
	private WebElement ApplicationforfinancialfacilitiesMaintenanceFacilityRating;
	public WebElement Applicationforfinancialfacilities_Maintenance_FacilityRating() {
		return ApplicationforfinancialfacilitiesMaintenanceFacilityRating;
	}
	
	@FindBy(xpath = "//td[@id='next_pagerid_applicationFacilityRating_WIFT001MT']/span")
	private WebElement  FacilityRatingGridNext;
	public WebElement FacilityRatingGridNext() {
		return  FacilityRatingGridNext;
	}
	
	@FindBy(xpath =  "//span[@id='spanLookup_applicationFacilityMarketedBy_WIFT001MT']/span")
	private WebElement ApplicationforfinancialfacilitiesMaintenanceMarketedBySearch;
	public WebElement Applicationforfinancialfacilities_Maintenance_MarketedBySearch() {
		return ApplicationforfinancialfacilitiesMaintenanceMarketedBySearch;
	}
	
	@FindBy(xpath = "//input[@name='applicationFacilityCO.fmsApplVO.MARKETED_BY']")
	private WebElement ApplicationforfinancialfacilitiesMaintenanceMarketedBy;
	public WebElement Applicationforfinancialfacilities_Maintenance_MarketedBy() {
		return ApplicationforfinancialfacilitiesMaintenanceMarketedBy;
	}
	
	
	@FindBy(xpath = "//input[@id='gridtab_applicationFacilityMarketedBy_WIFT001MT_gs_USER_ID']")
	private WebElement ApplicationforfinancialfacilitiesMaintenanceMarketedByFind;
	public WebElement Applicationforfinancialfacilities_Maintenance_MarketedByFind() {
		return ApplicationforfinancialfacilitiesMaintenanceMarketedByFind;
	}
	
	@FindBy(xpath =  "//table[@id='gridtab_applicationFacilityMarketedBy_WIFT001MT']/tbody/tr[2]")
	private WebElement ApplicationforfinancialfacilitiesMaintenanceMarketedBySelect;
	public WebElement Applicationforfinancialfacilities_Maintenance_MarketedBySelect() {
		return ApplicationforfinancialfacilitiesMaintenanceMarketedBySelect;
	}
	
	@FindBy(xpath = "//li[@id='applicationFacilityAdditionDetailsTabs_WIFT001MT']/a/span[text()='Additional Details']")
	private WebElement ApplicationforfinancialfacilitiesMaintenanceAdditionalDetailsTab;
	public WebElement Applicationforfinancialfacilities_Maintenance_AdditionalDetailsTab() {
		return ApplicationforfinancialfacilitiesMaintenanceAdditionalDetailsTab;
	}
	
	@FindBy(xpath = "//span[@id='spanLookup_applicationFacilitylimitcurrency_WIFT001MT']/span")
	private WebElement ApplicationforfinancialfacilitiesMaintenanceAdditionalDetailsTabCurrencyCodeSearch;
	public WebElement Applicationforfinancialfacilities_Maintenance_AdditionalDetailsTab_CurrencyCodeSearch() {
		return ApplicationforfinancialfacilitiesMaintenanceAdditionalDetailsTabCurrencyCodeSearch;
	}
	
	@FindBy(xpath = "//input[@id='gridtab_applicationFacilitylimitcurrency_WIFT001MT_gs_CURRENCY_CODE']")
	private WebElement ApplicationforfinancialfacilitiesMaintenanceAdditionalDetailsTabCurrencyCode;
	public WebElement Applicationforfinancialfacilities_Maintenance_AdditionalDetailsTab_CurrencyCode() {
		return ApplicationforfinancialfacilitiesMaintenanceAdditionalDetailsTabCurrencyCode;
	}
	
	@FindBy(xpath = "//td[@id='next_pagerid_applicationFacilitylimitcurrency_WIFT001MT']/span")
	private WebElement  CurrencyCodeGridNext;
	public WebElement CurrencyCodeGridNext() {
		return  CurrencyCodeGridNext;
	}
	
	@FindBy(xpath = "//input[@name='applicationFacilityCO.TOTAL_AMOUNT']")
	private WebElement ApplicationforfinancialfacilitiesMaintenanceAdditionalDetailsTabTotalValue;
	public WebElement Applicationforfinancialfacilities_Maintenance_AdditionalDetailsTab_TotalValue() {
		return ApplicationforfinancialfacilitiesMaintenanceAdditionalDetailsTabTotalValue;
	}
	
	@FindBy(xpath = "//input[@id='applicationFacilityofferexpirydate_WIFT001MT']")
	private WebElement ApplicationforfinancialfacilitiesMaintenanceAdditionalDetailsTabOfferExpiration;
	public WebElement Applicationforfinancialfacilities_Maintenance_AdditionalDetailsTab_OfferExpiration() {
		return ApplicationforfinancialfacilitiesMaintenanceAdditionalDetailsTabOfferExpiration;
	}
	
	@FindBy(xpath = "//li[@id='applicationFacilityLimitDetailsTabs_WIFT001MT']/a/span")
	private WebElement ApplicationforfinancialfacilitiesMaintenanceLimitDetailsTab;
	public WebElement Applicationforfinancialfacilities_Maintenance_LimitDetailsTab() {
		return ApplicationforfinancialfacilitiesMaintenanceLimitDetailsTab;
	}
	
	@FindBy(xpath = "//td[@id='add_ApplicationFacilityLimitDetailsGrid_WIFT001MT']/div/span")
	private WebElement ApplicationforfinancialfacilitiesMaintenanceLimitDetailsTabAddIcon;
	public WebElement Applicationforfinancialfacilities_Maintenance_LimitDetailsTab_AddIcon() {
		return ApplicationforfinancialfacilitiesMaintenanceLimitDetailsTabAddIcon;
	}
	
	@FindBy(xpath = "//span[@id='spanLookup_applicationfacilityLimitDetailsCLASS_WIFT001MT']/span")
	private WebElement ApplicationforfinancialfacilitiesMaintenanceLimitDetailsTabProductClassSearch;
	public WebElement Applicationforfinancialfacilities_Maintenance_LimitDetailsTab_ProductClass_Search() {
		return ApplicationforfinancialfacilitiesMaintenanceLimitDetailsTabProductClassSearch;
	}
	
	@FindBy(xpath = "//input[@id='gridtab_applicationfacilityLimitDetailsCLASS_WIFT001MT_gs_CODE']")
	private WebElement ApplicationforfinancialfacilitiesMaintenanceLimitDetailsTabProductClass;
	public WebElement Applicationforfinancialfacilities_Maintenance_LimitDetailsTab_ProductClass() {
		return ApplicationforfinancialfacilitiesMaintenanceLimitDetailsTabProductClass;
	}
	
	@FindBy(xpath = "//td[@id='next_pagerid_applicationfacilityLimitDetailsCLASS_WIFT001MT']/span")
	private WebElement  ProductClassGridNext;
	public WebElement ProductClassGridNext() {
		return  ProductClassGridNext;
	}
	
	
	
	@FindBy(xpath = "//span[@id='spanLookup_applicationfacilityLimitDetailsPURPOSE_OF_FIN_WIFT001MT']/span")
	private WebElement ApplicationforfinancialfacilitiesMaintenanceLimitDetailsTabPurposeOfFinancing;
	public WebElement Applicationforfinancialfacilities_Maintenance_LimitDetailsTab_PurposeOfFinancing() {
		return ApplicationforfinancialfacilitiesMaintenanceLimitDetailsTabPurposeOfFinancing;
	}
	
	@FindBy(xpath = "//td[@id='td_gridtab_applicationfacilityLimitDetailsPURPOSE_OF_FIN_WIFT001MT_4_CODE' and text()='9827']")
	private WebElement ApplicationforfinancialfacilitiesMaintenanceLimitDetailsTabPurposeOfFinancingValue;
	public WebElement Applicationforfinancialfacilities_Maintenance_LimitDetailsTab_PurposeOfFinancingValue() {
		return ApplicationforfinancialfacilitiesMaintenanceLimitDetailsTabPurposeOfFinancingValue;
	}
	
	@FindBy(xpath = "//button[@id='limitDetails_add_btn_WIFT001MT']")
	private WebElement ApplicationforfinancialfacilitiesMaintenanceLimitDetailsTabAdd;
	public WebElement Applicationforfinancialfacilities_Maintenance_LimitDetailsTab_Add() {
		return ApplicationforfinancialfacilitiesMaintenanceLimitDetailsTabAdd;
	}
	
	
	
	@FindBy(xpath = "//span[contains(text(),'Document Details')]")
	private WebElement ApplicationforfinancialfacilitiesMaintenanceDocumentDetailsTab;
	public WebElement Applicationforfinancialfacilities_Maintenance_DocumentDetailsTab() {
		return ApplicationforfinancialfacilitiesMaintenanceDocumentDetailsTab;
	}
	
	
	@FindBy(xpath = "//span[@id='spanLookup_applicationFacilitysolicitor_WIFT001MT']/span")
	private WebElement ApplicationforfinancialfacilitiesMaintenanceDocumentDetailsTabSolicitorNameSearch;
	public WebElement Applicationforfinancialfacilities_Maintenance_DocumentDetailsTab_SolicitorName_Search() {
		return ApplicationforfinancialfacilitiesMaintenanceDocumentDetailsTabSolicitorNameSearch;
	}
	
	@FindBy(xpath = "//input[@id='gridtab_applicationFacilitysolicitor_WIFT001MT_gs_CODE']")
	private WebElement ApplicationforfinancialfacilitiesMaintenanceDocumentDetailsTabSolicitorName;
	public WebElement Applicationforfinancialfacilities_Maintenance_DocumentDetailsTab_SolicitorName() {
		return ApplicationforfinancialfacilitiesMaintenanceDocumentDetailsTabSolicitorName;
	}
	
	@FindBy(xpath = "//td[@id='next_pagerid_applicationFacilitysolicitor_WIFT001MT']/span")
	private WebElement SolicitorNameGridNext;
	public WebElement SolicitorNameGridNext() {
		return SolicitorNameGridNext;
	}
	
	@FindBy(xpath = "//span[@id='spanLookup_applicationFacilityEstimator_WIFT001MT']/span")
	private WebElement ApplicationforfinancialfacilitiesMaintenanceDocumentDetailsTabEstimatorNameSearch;
	public WebElement Applicationforfinancialfacilities_Maintenance_DocumentDetailsTab_EstimatorName_Search() {
		return ApplicationforfinancialfacilitiesMaintenanceDocumentDetailsTabEstimatorNameSearch;
	}
	
	@FindBy(xpath = "//input[@id='gridtab_applicationFacilityEstimator_WIFT001MT_gs_CODE']")
	private WebElement ApplicationforfinancialfacilitiesMaintenanceDocumentDetailsTabEstimatorName;
	public WebElement Applicationforfinancialfacilities_Maintenance_DocumentDetailsTab_EstimatorName() {
		return ApplicationforfinancialfacilitiesMaintenanceDocumentDetailsTabEstimatorName;
	}
	
	@FindBy(xpath = "//td[@id='next_pagerid_applicationFacilityEstimator_WIFT001MT']/span")
	private WebElement EstimatorNameGridNext;
	public WebElement EstimatorNameGridNext() {
		return EstimatorNameGridNext;
	}
	
	
	
	@FindBy(xpath = "//button[@id='applicationfacility_save_as_draft_btn_WIFT001MT']/span[2]")
	private WebElement save;
	public WebElement save() {
		return save;
	}
	
	@FindBy(xpath = "//span[contains(text(),' Validate ')]")
	private WebElement validate;
	public WebElement validate() {
		return validate;
	}

	
	@FindBy(id = "_popup_path_sol_confirm_ok")
	private WebElement Confirmok;
	public WebElement Confirmok() {
		return Confirmok;
	}
	
	@FindBy(id = "_popup_path_sol_ok")
	private WebElement Ok;
	public WebElement Ok() {
		return Ok;
	}
	
	
	
	
	
	
	
	
	@FindBy(xpath = "//a[@id='WIFT001AP1']")
    private WebElement application_financial_facility_approve1;
    public WebElement applicationFinancialFacilityApproveLevel1() {
        return application_financial_facility_approve1;
    }
	@FindBy(xpath = "//*[@id=\"applicationFacilityGridTbl_Id_WIFT001AP1_pager_left\"]/table/tbody/tr/td[7]")
	private WebElement approve1_clear_btn;
	public WebElement approve1ClearBtn() {
		return approve1_clear_btn;
	}
	
	@FindBy(xpath = "//td[@id='td_applicationFacilityGridTbl_Id_WIFT001AP1_1_fmsApplVO.CODE']")
	private WebElement approve_level1_retrive_data;
	public WebElement approveLevel1RetriveData() {
		return approve_level1_retrive_data;
	}
	
	@FindBy(xpath = "//select[@id='applicationFacilityDecision_1_WIFT001AP1']")
	private WebElement approve_level1_select_decision;
	public WebElement approveLevel1SelectDecision() {
		return approve_level1_select_decision;
	}
	
	@FindBy(xpath = "//button[@id='applicationfacility_approvelevel1_btn_WIFT001AP1']")
	private WebElement approve_level1_submit_btn;
	public WebElement approveLevel1SubmitBtn() {
		return approve_level1_submit_btn;
	}
@FindBy(xpath = "//a[@id='WIFT001AP2']")
	private WebElement application_financial_facility_approve2;
	public WebElement applicationFinancialFacilityApproveLevel2() {
		return application_financial_facility_approve2;
	}
@FindBy(xpath = "//*[@id=\"applicationFacilityGridTbl_Id_WIFT001AP2_pager_left\"]/table/tbody/tr/td[7]")
	private WebElement approve2_clear_btn;
	public WebElement approve2ClearBtn() {
		return approve2_clear_btn;
	} 
	
	@FindBy(xpath = "//td[@id='td_applicationFacilityGridTbl_Id_WIFT001AP2_1_fmsApplVO.CODE']")
	private WebElement approve_level2_retrive_data;
	public WebElement approveLevel2RetriveData() {
		return approve_level2_retrive_data;
	}
	
	@FindBy(xpath = "//select[@id='applicationFacilityDecision2_WIFT001AP2']")
	private WebElement approve_level2_select_devision;
	public WebElement approveLevel2SelectDecision() {
		return approve_level2_select_devision;
	}
	
	@FindBy(xpath = "//button[@id='applicationfacility_approvelevel2_btn_WIFT001AP2']")
	private WebElement approve_level2_submit_btn;
	public WebElement approveLevel2SubmitBtn() {
		return approve_level2_submit_btn;
	}
	@FindBy(xpath = "//input[@id='_popup_path_sol_confirm_ok']")
	private WebElement button_confirm_ok;
	public WebElement ButtonConfirmOk1() {
		return button_confirm_ok;
	}
	
	@FindBy(xpath = "//*[@id='_popup_path_sol_ok']")
	private WebElement button_success_ok;
	public WebElement ButtonSuccessOk1() {
		return button_success_ok;
	}


	/*
	@FindBy(xpath = "")
	private WebElement ;
	public WebElement () {
		return ;
	}
	
	@FindBy(xpath = "")
	private WebElement ;
	public WebElement () {
		return ;
	}
	
	@FindBy(xpath = "")
	private WebElement ;
	public WebElement () {
		return ;
	}
	*/
	
	
	
	
	
	
	
	@FindBy(xpath = "//span[text()='Approve Level 1/Reject']")
	private WebElement WifakApplication_ApproveLevel1;
	public WebElement WifakApplication_ApproveLevel1() {
		return WifakApplication_ApproveLevel1;
	}
	
	@FindBy(xpath = "//input[@id='applicationFacilityGridTbl_Id_WIFT001AP1_gs_fmsApplVO.CODE']")
	private WebElement WifakApplication_ApproveLevel1_Code;
	public WebElement WifakApplication_ApproveLevel1_Code() {
		return WifakApplication_ApproveLevel1_Code;
	}
	
	
	@FindBy(xpath = "//select[@id='applicationFacilityDecision_1_WIFT001AP1']")
	private WebElement WifakApplication_ApproveLevel1_Decision;
	public WebElement WifakApplication_ApproveLevel1_Decision() {
		return WifakApplication_ApproveLevel1_Decision;
	}
	
	@FindBy(xpath = "//select[@id='applicationFacilityForwardP1_WIFT001AP1']")
	private WebElement WifakApplication_ApproveLevel1_MoreDecision;
	public WebElement WifakApplication_ApproveLevel1_MoreDecision() {
		return WifakApplication_ApproveLevel1_MoreDecision;
	}
	
	@FindBy(xpath = "//select[@id='applicationFacilityForwardP1_WIFT001AP1']")
	private WebElement WifakApplication_ApproveLevel1_ForwardDecision;
	public WebElement WifakApplication_ApproveLevel1_ForwardDecision() {
		return WifakApplication_ApproveLevel1_ForwardDecision;
	}
	
	
	
	@FindBy(xpath = "//button[@id='applicationfacility_approvelevel1_btn_WIFT001AP1']/span[contains(text(),' Submit ')]")
	private WebElement WifakApplication_ApproveLevel1_Submit;
	public WebElement WifakApplication_ApproveLevel1_Submit() {
		return WifakApplication_ApproveLevel1_Submit;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@FindBy(xpath = "//span[text()='Approve Level 2/Reject']")
	private WebElement WifakApplication_ApproveLevel2;
	public WebElement WifakApplication_ApproveLevel2() {
		return WifakApplication_ApproveLevel2;
	}
	
	@FindBy(xpath = "//input[@id='applicationFacilityGridTbl_Id_WIFT001AP2_gs_fmsApplVO.CODE']")
	private WebElement WifakApplication_ApproveLevel2_Code;
	public WebElement WifakApplication_ApproveLevel2_Code() {
		return WifakApplication_ApproveLevel2_Code;
	}
	
	@FindBy(xpath = "//select[@id='applicationFacilityDecision2_WIFT001AP2']")
	private WebElement WifakApplication_ApproveLevel2_Decision;
	public WebElement WifakApplication_ApproveLevel2_Decision() {
		return WifakApplication_ApproveLevel2_Decision;
	}
	
	
	@FindBy(xpath = "//button[@id='applicationfacility_approvelevel2_btn_WIFT001AP2']/span[contains(text(),' Submit ')]")
	private WebElement WifakApplication_ApproveLevel2_Submit;
	public WebElement WifakApplication_ApproveLevel2_Submit() {
		return WifakApplication_ApproveLevel2_Submit;
	}

	
	
	
	
	
	
	
	
	@FindBy(xpath = "//span[text()='Approve Level 3/Reject']")
	private WebElement WifakApplication_ApproveLevel3;
	public WebElement WifakApplication_ApproveLevel3() {
		return WifakApplication_ApproveLevel3;
	}
	
	@FindBy(xpath = "//input[@id='applicationFacilityGridTbl_Id_WIFT001AP3_gs_fmsApplVO.CODE']")
	private WebElement WifakApplication_ApproveLevel3_Code;
	public WebElement WifakApplication_ApproveLevel3_Code() {
		return WifakApplication_ApproveLevel3_Code;
	}
	
	
	
	
	@FindBy(xpath = "//select[@id='applicationFacilityDecision3_WIFT001AP3']")
	private WebElement WifakApplication_ApproveLevel3_Decision;
	public WebElement WifakApplication_ApproveLevel3_Decision() {
		return WifakApplication_ApproveLevel3_Decision;
	}
	
	@FindBy(xpath = "//select[@id='applicationFacilityForwardP3_WIFT001AP3']")
	private WebElement WifakApplication_ApproveLevel3_MoreDecision;
	public WebElement WifakApplication_ApproveLevel3_MoreDecision() {
		return WifakApplication_ApproveLevel3_MoreDecision;
	}
	
	
	@FindBy(xpath = "//button[@id='applicationfacility_approvelevel3_btn_WIFT001AP3']/span[contains(text(),' Submit ')]")
	private WebElement WifakApplication_ApproveLevel3_Submit;
	public WebElement WifakApplication_ApproveLevel3_Submit() {
		return WifakApplication_ApproveLevel3_Submit;
	}
	
	
	
	
	
	
	
	
	
	
	@FindBy(xpath = "//span[contains(text(),'Approval Committee Recommendations ')]")
	private WebElement WifakApplication_ApprovalCommitteeRecommendations;
	public WebElement WifakApplication_ApprovalCommitteeRecommendations() {
		return WifakApplication_ApprovalCommitteeRecommendations;
	}
	
	@FindBy(xpath = "//input[@id='applicationFacilityGridTbl_Id_WIFT002MT_gs_fmsApplVO.CODE']")
	private WebElement WifakApplication_ApprovalCommitteeRecommendations_Code;
	public WebElement WifakApplication_ApprovalCommitteeRecommendations_Code() {
		return WifakApplication_ApprovalCommitteeRecommendations_Code;
	}
	
	@FindBy(xpath = "//span[contains(text(),' Recommend ')]")
	private WebElement WifakApplication_ApprovalCommitteeRecommendations_Recommend;
	public WebElement WifakApplication_ApprovalCommitteeRecommendations_Recommend() {
		return WifakApplication_ApprovalCommitteeRecommendations_Recommend;
	}
	
	
	@FindBy(xpath = "//span[@id='ui-dialog-title-applicationfacilityRecommendationDiv_id_WIFT002MT']")
    private WebElement ApprovalCommitteesRecommendation_Popup_609;
    public WebElement ApprovalCommitteesRecommendation_Popup_609() {
        return ApprovalCommitteesRecommendation_Popup_609;
    }

	@FindBy(xpath = "//select[@gridid='ApplicationFacilityRecommendationGrid_WIFT002MT']")
	private WebElement WifakApplication_ApprovalCommitteeRecommendations_Recommend_Recommendation;
	public WebElement WifakApplication_ApprovalCommitteeRecommendations_Recommend_Recommendation() {
		return WifakApplication_ApprovalCommitteeRecommendations_Recommend_Recommendation;
	}
	
	@FindBy(xpath = "//span[text()='OK']")
	private WebElement WifakApplication_ApprovalCommitteeRecommendations_Recommend_Recommendation_Ok;
	public WebElement WifakApplication_ApprovalCommitteeRecommendations_Recommend_Recommendation_Ok() {
		return WifakApplication_ApprovalCommitteeRecommendations_Recommend_Recommendation_Ok;
	}
///****************************************************Grading**********************************************************************///

	@FindBy(xpath = "//td[text()='Grading']")
	private WebElement WifakApplication_Grading_609;
	public WebElement WifakApplication_Grading_609() {
		return WifakApplication_Grading_609;
	}
	
	@FindBy(xpath = "//a[@id='WIFT003MT']/span[text()='Maintenance']")
	private WebElement WifakApplication_Grading_Maintenance_609;
	public WebElement WifakApplication_Grading_Maintenance_609() {
		return WifakApplication_Grading_Maintenance_609;
	}
	
	@FindBy(xpath = "//span[@id='spanLookup_Application_Ref_WIFT003MT']/span")
	private WebElement WifakApplication_Grading_Maintenance_SearchCode_609;
	public WebElement WifakApplication_Grading_Maintenance_SearchCode_609() {
		return WifakApplication_Grading_Maintenance_SearchCode_609;
	}
	
	@FindBy(xpath = "//input[@id='gridtab_Application_Ref_WIFT003MT_gs_fmsApplVo.CODE']")
	private WebElement WifakApplication_Grading_Maintenance_Code_609;
	public WebElement WifakApplication_Grading_Maintenance_Code_609() {
		return WifakApplication_Grading_Maintenance_Code_609;
	}
	
	@FindBy(xpath = "//label[@id='customergradingmaintenanceId_WIFT003MT_save_key']")
	private WebElement WifakApplication_Grading_Maintenance_Save_609;
	public WebElement WifakApplication_Grading_Maintenance_Save_609() {
		return WifakApplication_Grading_Maintenance_Save_609;
	}
	
	@FindBy(xpath = "//a[@id='WIFT003AP']/span[text()='Approve']")
	private WebElement WifakApplication_Grading_Approvee_609;
	public WebElement WifakApplication_Grading_Approvee_609() {
		return WifakApplication_Grading_Approvee_609;
	}
	
	@FindBy(xpath = "//input[@id='cust_grade_maint_WIFT003AP_gs_custgradevo.APP_REF']")
	private WebElement WifakApplication_Grading_Approve_Code_609;
	public WebElement WifakApplication_Grading_Approve_Code_609() {
		return WifakApplication_Grading_Approve_Code_609;
	}
	
	@FindBy(xpath = "//label[@id='customergradingmaintenanceId_WIFT003AP_approve_key']")
	private WebElement WifakApplication_Grading_Approve_ApproveButton_609;
	public WebElement WifakApplication_Grading_Approve_ApproveButton_609() {
		return WifakApplication_Grading_Approve_ApproveButton_609;
	}

	@FindBy(xpath = "//input[@id='_popup_path_sol_ok']")
	private WebElement Grading_Ok;
	public WebElement Grading_Ok() {
		return Grading_Ok;
	}
	
///******************************************************************************************************************************///
	
	
	@FindBy(xpath = "//td[text()='Corporate jk']")
	private WebElement CorporateJK_609;
	public WebElement CorporateJK_609() {
		return CorporateJK_609;
	}
	
	@FindBy(xpath = "//td[text()='Corporate fin']")
	private WebElement CorporateJK_CorporateFin_609;
	public WebElement CorporateJK_CorporateFin_609() {
		return CorporateJK_CorporateFin_609;
	}
	
	@FindBy(xpath = "//td[text()='Request For Financing']")
	private WebElement CorporateJK_CorporateFin_RequestForFinancing_609;
	public WebElement CorporateJK_CorporateFin_RequestForFinancing_609() {
		return CorporateJK_CorporateFin_RequestForFinancing_609;
	}
	
	@FindBy(xpath = "//a[@id='CFIRF00MT']/span[text()='Maintenance']")
	private WebElement CorporateJK_CorporateFin_RequestForFinancing_Maintenance_609;
	public WebElement CorporateJK_CorporateFin_RequestForFinancing_Maintenance_609() {
		return CorporateJK_CorporateFin_RequestForFinancing_Maintenance_609;
	}
	
	@FindBy(xpath = "//span[@id='spanLookup_requestFinanacingCif_CFIRF00MT']/span")
	private WebElement CorporateJK__RequestForFinancing_Maintenance_CustomerSearch_609;
	public WebElement CorporateJK__RequestForFinancing_Maintenance_CustomerSearch_609() {
		return CorporateJK__RequestForFinancing_Maintenance_CustomerSearch_609;
	}
	
	@FindBy(xpath = "//input[@id='gridtab_requestFinanacingCif_CFIRF00MT_gs_cifVO.CIF_NO']")
	private WebElement CorporateJK__RequestForFinancing_Maintenance_Customer_609;
	public WebElement CorporateJK__RequestForFinancing_Maintenance_Customer_609() {
		return CorporateJK__RequestForFinancing_Maintenance_Customer_609;
	}
	
	
	
	@FindBy(xpath = "//span[@id='spanLookup_requestFinancingFacilityType_CFIRF00MT']/span")
	private WebElement CorporateJK__RequestForFinancing_Maintenance_FacilityTypeSearch_609;
	public WebElement CorporateJK__RequestForFinancing_Maintenance_FacilityTypeSearch_609() {
		return CorporateJK__RequestForFinancing_Maintenance_FacilityTypeSearch_609;
	}
	
	@FindBy(xpath = "//input[@id='gridtab_requestFinancingFacilityType_CFIRF00MT_gs_CODE']")
	private WebElement CorporateJK__RequestForFinancing_Maintenance_FacilityType_609;
	public WebElement CorporateJK__RequestForFinancing_Maintenance_FacilityType_609() {
		return CorporateJK__RequestForFinancing_Maintenance_FacilityType_609;
	}
	
	@FindBy(xpath = "//input[@id='requestFinancingFacilityTotalvalue_CFIRF00MT']")
	private WebElement CorporateJK__RequestForFinancing_Maintenance_TotalLimit_609;
	public WebElement CorporateJK__RequestForFinancing_Maintenance_TotalLimit_609() {
		return CorporateJK__RequestForFinancing_Maintenance_TotalLimit_609;
	}
	
	@FindBy(xpath = "//li[@id='requestFinancingLimitDtlsTabs_CFIRF00MT']/a/span[text()='Disbursement/Sublimit']")
	private WebElement CorporateJK__RequestForFinancing_Maintenance_SublimitTab_609;
	public WebElement CorporateJK__RequestForFinancing_Maintenance_SublimitTab_609() {
		return CorporateJK__RequestForFinancing_Maintenance_SublimitTab_609;
	}
	
	@FindBy(xpath = "//td[@id='add_RequestFinancingLimitDetailsGridId_CFIRF00MT']/div/span")
	private WebElement CorporateJK_RequestForFinancing_SublimitTab_AddIcon_609;
	public WebElement CorporateJK_RequestForFinancing_SublimitTab_AddIcon_609() {
		return CorporateJK_RequestForFinancing_SublimitTab_AddIcon_609;
	}
	
	@FindBy(xpath = "//span[@id='spanLookup_requestFinancingLimitDetailsGeneralFacilityProductClass_CFIRF00MT']/span")
	private WebElement CorporateJK_RequestForFinancing_SublimitTab_ProductClassSearch_609;
	public WebElement CorporateJK_RequestForFinancing_SublimitTab_ProductClassSearch_609() {
		return CorporateJK_RequestForFinancing_SublimitTab_ProductClassSearch_609;
	}
	
	@FindBy(xpath = "//input[@id='gridtab_requestFinancingLimitDetailsGeneralFacilityProductClass_CFIRF00MT_gs_CODE']")
	private WebElement CorporateJK_RequestForFinancing_SublimitTab_ProductClass_609;
	public WebElement CorporateJK_RequestForFinancing_SublimitTab_ProductClass_609() {
		return CorporateJK_RequestForFinancing_SublimitTab_ProductClass_609;
	}
	
	@FindBy(xpath = "//input[@id='requestFinancingLimitDetailsCleanFlagdChkBox_CFIRF00MT']")
	private WebElement CorporateJK_RequestForFinancing_SublimitTab_Clean_609;
	public WebElement CorporateJK_RequestForFinancing_SublimitTab_Clean_609() {
		return CorporateJK_RequestForFinancing_SublimitTab_Clean_609;
	}
	
	@FindBy(xpath = "//input[@id='requestFinancingLimitDetailsRfNewMargin_CFIRF00MT']")
	private WebElement CorporateJK_RequestForFinancing_SublimitTab_NewMargin_609;
	public WebElement CorporateJK_RequestForFinancing_SublimitTab_NewMargin_609() {
		return CorporateJK_RequestForFinancing_SublimitTab_NewMargin_609;
	}
	
	@FindBy(xpath = "//button[@id='limitDetails_add_btn_CFIRF00MT']/span[contains(text(),' Add ')]")
	private WebElement CorporateJK_RequestForFinancing_SublimitTab_AddButton_609;
	public WebElement CorporateJK_RequestForFinancing_SublimitTab_AddButton_609() {
		return CorporateJK_RequestForFinancing_SublimitTab_AddButton_609;
	}
	
	@FindBy(xpath = "//label[@id='requestFinancingFormId_CFIRF00MT_save_key']")
	private WebElement CorporateJK_RequestForFinancing_Save_609;
	public WebElement CorporateJK_RequestForFinancing_Save_609() {
		return CorporateJK_RequestForFinancing_Save_609;
	}
	
	@FindBy(xpath = "//label[@id='requestFinancingFormId_CFIRF00MT_Validate_key']")
	private WebElement CorporateJK_RequestForFinancing_Validate_609;
	public WebElement CorporateJK_RequestForFinancing_Validate_609() {
		return CorporateJK_RequestForFinancing_Validate_609;
	}
	
	@FindBy(xpath = "//a[@id='dismissbut_CFIRF00MT']/span")
	private WebElement CorporateJK_RequestForFinancing_DismissPopUp_609;
	public WebElement CorporateJK_RequestForFinancing_DismissPopUp_609() {
		return CorporateJK_RequestForFinancing_DismissPopUp_609;
	}
	
	
	@FindBy(xpath = "//a[@id='dismissbut_RFFRF00MT']/span")
	private WebElement Request_RequestForFinancing_DismissPopUp_609;
	public WebElement Request_RequestForFinancing_DismissPopUp_609() {
		return Request_RequestForFinancing_DismissPopUp_609;
	}
	
	@FindBy(xpath = "//a[@id='dismissbut_RFFRF00P1']/span")
	private WebElement Request_RequestForFinancing_ApproveLevel1_DismissPopUp_609;
	public WebElement Request_RequestForFinancing_ApproveLevel1_DismissPopUp_609() {
		return Request_RequestForFinancing_ApproveLevel1_DismissPopUp_609;
	}
	
	
	@FindBy(xpath = "//span[text()='Approve Level 1']")
	private WebElement CorporateJK_RequestForFinancing_ApproveLevel1_609;
	public WebElement CorporateJK_RequestForFinancing_ApproveLevel1_609() {
		return CorporateJK_RequestForFinancing_ApproveLevel1_609;
	}

	
	@FindBy(xpath = "//input[@id='requestFinancingGridTbl_Id_CFIRF00P1_gs_fmsRequestFinancingVO.CODE']")
	private WebElement CorporateJK_RequestForFinancing_ApproveLevel1_Code_609;
	public WebElement CorporateJK_RequestForFinancing_ApproveLevel1_Code_609() {
		return CorporateJK_RequestForFinancing_ApproveLevel1_Code_609;
	}
	
	@FindBy(xpath = "//span[text()='Customer Grading & Recommendations']")
	private WebElement CorporateJK__RequestForFinancing_Maintenance_CustomerGradingandRecommendationsTab_609;
	public WebElement CorporateJK__RequestForFinancing_Maintenance_CustomerGradingandRecommendationsTab_609() {
		return CorporateJK__RequestForFinancing_Maintenance_CustomerGradingandRecommendationsTab_609;
	}
	
	@FindBy(xpath = "//select[@id='requestDecisionForward_1_CFIRF00P1']")
	private WebElement CorporateJK_RequestForFinancing_ApproveLevel1_Decision_609;
	public WebElement CorporateJK_RequestForFinancing_ApproveLevel1_Decision_609() {
		return CorporateJK_RequestForFinancing_ApproveLevel1_Decision_609;
	}
	
	@FindBy(xpath = "//select[@id='requestDecisionForwardP1_CFIRF00P1']")
	private WebElement CorporateJK_RequestForFinancing_ApproveLevel1_ForwardDecision_609;
	public WebElement CorporateJK_RequestForFinancing_ApproveLevel1_ForwardDecision_609() {
		return CorporateJK_RequestForFinancing_ApproveLevel1_ForwardDecision_609;
	}
	
	@FindBy(xpath = "//label[@id='requestFinancingFormId_CFIRF00P1_approve_key']")
	private WebElement CorporateJK_RequestForFinancing_ApproveLevel1_Approve_609;
	public WebElement CorporateJK_RequestForFinancing_ApproveLevel1_Approve_609() {
		return CorporateJK_RequestForFinancing_ApproveLevel1_Approve_609;
	}
	
	@FindBy(xpath = "//a[@id='dismissbut_CFIRF00P1']/span")
	private WebElement CorporateJK_RequestForFinancing_ApproveLevel1_SendAlertPopUp_609;
	public WebElement CorporateJK_RequestForFinancing_ApproveLevel1_SendAlertPopUp_609() {
		return CorporateJK_RequestForFinancing_ApproveLevel1_SendAlertPopUp_609;
	}
	
	
	
	
	
	
	
	
	
	@FindBy(xpath = "//span[text()='Approve Level 3']")
	private WebElement CorporateJK_RequestForFinancing_ApproveLevel3_609;
	public WebElement CorporateJK_RequestForFinancing_ApproveLevel3_609() {
		return CorporateJK_RequestForFinancing_ApproveLevel3_609;
	}

	
	@FindBy(xpath = "//input[@id='requestFinancingGridTbl_Id_CFIRF00P3_gs_fmsRequestFinancingVO.CODE']")
	private WebElement CorporateJK_RequestForFinancing_ApproveLevel3_Code_609;
	public WebElement CorporateJK_RequestForFinancing_ApproveLevel3_Code_609() {
		return CorporateJK_RequestForFinancing_ApproveLevel3_Code_609;
	}

	@FindBy(xpath = "//select[@id='requestDecisionForward3_CFIRF00P3']")
	private WebElement CorporateJK_RequestForFinancing_ApproveLevel3_Decision_609;
	public WebElement CorporateJK_RequestForFinancing_ApproveLevel3_Decision_609() {
		return CorporateJK_RequestForFinancing_ApproveLevel3_Decision_609;
	}
	
	@FindBy(xpath = "//label[@id='requestFinancingFormId_CFIRF00P3_approve_key']")
	private WebElement CorporateJK_RequestForFinancing_ApproveLevel3_Approve_609;
	public WebElement CorporateJK_RequestForFinancing_ApproveLevel3_Approve_609() {
		return CorporateJK_RequestForFinancing_ApproveLevel3_Approve_609;
	}
	
	@FindBy(xpath = "//a[@id='dismissbut_CFIRF00P3']/span")
	private WebElement CorporateJK_RequestForFinancing_ApproveLevel3_SendAlertPopUp_609;
	public WebElement CorporateJK_RequestForFinancing_ApproveLevel3_SendAlertPopUp_609() {
		return CorporateJK_RequestForFinancing_ApproveLevel3_SendAlertPopUp_609;
	}
	
	@FindBy(xpath = "//a[@id='CFIRF00CV']/span[text()='Credit Review']")
	private WebElement CorporateJK_RequestForFinancing_CreditReview_609;
	public WebElement CorporateJK_RequestForFinancing_CreditReview_609() {
		return CorporateJK_RequestForFinancing_CreditReview_609;
	}
	
	@FindBy(xpath = "//input[@id='requestFinancingGridTbl_Id_CFIRF00CV_gs_fmsRequestFinancingVO.CODE']")
	private WebElement CorporateJK_RequestForFinancing_CreditReview_Code_609;
	public WebElement CorporateJK_RequestForFinancing_CreditReview_Code_609() {
		return CorporateJK_RequestForFinancing_CreditReview_Code_609;
	}

	
	@FindBy(xpath = "//li[@id='creditCommitteeRecommendationsTab_CFIRF00MT']/a/span[text()='Credit Committee Recommendations']")
	private WebElement CorporateJK_RequestForFinancing_CreditReview_CreditCommitteeRecommendations_609;
	public WebElement CorporateJK_RequestForFinancing_CreditReview_CreditCommitteeRecommendations_609() {
		return CorporateJK_RequestForFinancing_CreditReview_CreditCommitteeRecommendations_609;
	}
	
	@FindBy(xpath = "//div[@id='requestFinancingCreditReviewRecommandations_CFIRF00CV']/div/span[text()='Recommendations']")
	private WebElement CorporateJK_RequestForFinancing_CreditReview_CreditCommitteeRecommendations_Recommendations_609;
	public WebElement CorporateJK_RequestForFinancing_CreditReview_CreditCommitteeRecommendations_Recommendations_609() {
		return CorporateJK_RequestForFinancing_CreditReview_CreditCommitteeRecommendations_Recommendations_609;
	}
	
	@FindBy(xpath = "//tr[@id='RequestFinancingRecommendationsGridId_CFIRF00CVghead_0']//td/span")
	private WebElement CorporateJK_RequestForFinancing_CreditReview_CreditCommitteeRecommendations_Recommendations_AddIcon_609;
	public WebElement CorporateJK_RequestForFinancing_CreditReview_CreditCommitteeRecommendations_Recommendations_AddIcon_609() {
		return CorporateJK_RequestForFinancing_CreditReview_CreditCommitteeRecommendations_Recommendations_AddIcon_609;
	}
	
//	@FindBy(xpath = "")
//	private WebElement CorporateJK_RequestForFinancing_CreditReview_CreditCommitteeRecommendations_Recommendations_RecommendedBy_609;
//	public WebElement CorporateJK_RequestForFinancing_CreditReview_CreditCommitteeRecommendations_Recommendations_RecommendedBy_609() {
//		return CorporateJK_RequestForFinancing_CreditReview_CreditCommitteeRecommendations_Recommendations_RecommendedBy_609;
//	}
//	
	@FindBy(xpath = "//table[@id='RequestFinancingRecommendationsGridId_CFIRF00CV']/tbody/tr/td[@tdlabel='CR Recommendation']/select")
	private WebElement CorporateJK_RequestForFinancing_CreditReview_CreditCommitteeRecommendations_Recommendations_CRRecommendation_609;
	public WebElement CorporateJK_RequestForFinancing_CreditReview_CreditCommitteeRecommendations_Recommendations_CRRecommendation_609() {
		return CorporateJK_RequestForFinancing_CreditReview_CreditCommitteeRecommendations_Recommendations_CRRecommendation_609;
	}
	
	@FindBy(xpath = "//label[@id='requestFinancingFormId_CFIRF00CV_Credit_Review_Key']")
	private WebElement CorporateJK_CreditReview_CreditReviewbutton_609;
	public WebElement CorporateJK_CreditReview_CreditReviewbutton_609() {
		return CorporateJK_CreditReview_CreditReviewbutton_609;
	}

	@FindBy(xpath = "//a[@id='dismissbut_CFIRF00CV']/span")
	private WebElement CorporateJK_RequestForFinancing_CreditReview__SendAlertPopUp_609;
	public WebElement CorporateJK_RequestForFinancing_CreditReview__SendAlertPopUp_609() {
		return CorporateJK_RequestForFinancing_CreditReview__SendAlertPopUp_609;
	}
	
	@FindBy(xpath = "//select[@id='requestFinancingApplicationFor_CFIRF00MT']")
	private WebElement CorporateJK__RequestForFinancing_Maintenance_ReasonforSubmission_609;
	public WebElement CorporateJK__RequestForFinancing_Maintenance_ReasonforSubmission_609() {
		return CorporateJK__RequestForFinancing_Maintenance_ReasonforSubmission_609;
	}
	
	@FindBy(xpath = "//td[text()='Request']")
	private WebElement Request_609;
	public WebElement Request_609() {
		return Request_609;
	}
}

