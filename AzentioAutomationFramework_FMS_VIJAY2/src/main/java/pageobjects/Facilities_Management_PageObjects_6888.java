package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Facilities_Management_PageObjects_6888 {

	WebDriver driver;
	public Facilities_Management_PageObjects_6888(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
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
	
	@FindBy(xpath = "//div[@id='gview_fmsFacilityTypeListGridTbl_Id_P008UP']//following::input[@name='CODE'][1]")
	private WebElement FacilityTypeUpdateAfterApproveCode;
	public WebElement FacilityType_UpdateAfterApprove_Code() {
		return FacilityTypeUpdateAfterApproveCode;
	}
	
	
	
	@FindBy(xpath = "//input[@id='fmsFacilityTypeListGridTbl_Id_P008UP_gs_CODE']")
	private WebElement FacilityTypeUpdateAfterApproveSearchCode;
	public WebElement FacilityType_UpdateAfterApprove_SearchCode() {
		return FacilityTypeUpdateAfterApproveSearchCode;
	}
	
	@FindBy(xpath = "//td[text()='19']")
	private WebElement FacilityTypeUpdateAfterApproveSelectCode;
	public WebElement FacilityType_UpdateAfterApprove_SelectCode() {
		return FacilityTypeUpdateAfterApproveSelectCode;
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
	private WebElement FacilityType_ApproveScreen_Searchcode;
	public WebElement FacilityType_ApproveScreen_Searchcode() {
		return FacilityType_ApproveScreen_Searchcode;
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
	private WebElement Confirmok;
	public WebElement Confirmok() {
		return Confirmok;
	}
	
	@FindBy(id = "_popup_path_sol_ok")
	private WebElement Ok;
	public WebElement Ok() {
		return Ok;
	}
	

	
	
////////////////////////////////////////////////////////////////////////////////////////////////////////
	@FindBy(xpath = "//td[text()='REQUEST FOR FINANCIN']")
	private WebElement FmsCoreREQUESTFORFINANCIN;
	public WebElement FmsCore_REQUESTFORFINANCIN() {
		return FmsCoreREQUESTFORFINANCIN;
	}
	
	@FindBy(xpath = "//td[text()='Request For Financing']")
	private WebElement REQUESTFORFINANCINRequestForFinancing;
	public WebElement REQUESTFORFINANCIN_RequestForFinancing() {
		return REQUESTFORFINANCINRequestForFinancing;
	}
	
	@FindBy(xpath = "//a[@id='CSMRF00MT']/span[text()='Maintenance']")
	private WebElement REQUESTFORFINANCINRequestForFinancingMaintenance;
	public WebElement REQUESTFORFINANCIN_RequestForFinancing_Maintenance() {
		return REQUESTFORFINANCINRequestForFinancingMaintenance;
	}
	
	@FindBy(xpath = "//select[@name='requestFinancingCO.fmsRequestFinancingVO.APPLICATION_FOR']")
	private WebElement REQUESTFORFINANCINRequestForFinancingMaintenanceReasonForSubmission;
	public WebElement REQUESTFORFINANCIN_RequestForFinancing_Maintenance_ReasonForSubmission() {
		return REQUESTFORFINANCINRequestForFinancingMaintenanceReasonForSubmission;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	@FindBy(xpath = "//input[@name='requestFinancingCO.fmsRequestFinancingVO.CIF']")
	private WebElement REQUESTFORFINANCINRequestForFinancingMaintenanceCustomer;
	public WebElement REQUESTFORFINANCIN_RequestForFinancing_Maintenance_Customer() {
		return REQUESTFORFINANCINRequestForFinancingMaintenanceCustomer;
	}
	
	@FindBy(xpath = "//span[@id='spanLookup_requestFinanacingCif_CSMRF00MT']/span")
	private WebElement REQUESTFORFINANCINRequestForFinancingMaintenanceCustomerSearch;
	public WebElement REQUESTFORFINANCIN_RequestForFinancing_Maintenance_Customer_Search() {
		return REQUESTFORFINANCINRequestForFinancingMaintenanceCustomerSearch;
	}
	
	@FindBy(xpath = "//input[@name='requestFinancingCO.fmsRequestFinancingVO.LOAN_TYPE']")
	private WebElement REQUESTFORFINANCINRequestForFinancingMaintenanceFacilityType;
	public WebElement REQUESTFORFINANCIN_RequestForFinancing_Maintenance_FacilityType() {
		return REQUESTFORFINANCINRequestForFinancingMaintenanceFacilityType;
	}
	
	@FindBy(xpath = "//span[@id='spanLookup_requestFinancingFacilityType_CSMRF00MT']/span")
	private WebElement REQUESTFORFINANCINRequestForFinancingMaintenanceFacilityTypeSearch;
	public WebElement REQUESTFORFINANCIN_RequestForFinancing_Maintenance_FacilityTypeSearch() {
		return REQUESTFORFINANCINRequestForFinancingMaintenanceFacilityTypeSearch;
	}
	
	@FindBy(xpath= "//select[@name='requestFinancingCO.fmsRequestFinancingVO.REVOLVING_ONEOFF']")
	private WebElement REQUESTFORFINANCINRequestForFinancingMaintenanceRevolvingOneOff;
	public WebElement REQUESTFORFINANCIN_RequestForFinancing_Maintenance_RevolvingOneOff() {
		return REQUESTFORFINANCINRequestForFinancingMaintenanceRevolvingOneOff;
	}
	
	
	
	
	
	
	@FindBy(xpath= "//input[@name='requestFinancingCO.TOTAL_AMOUNT']")
	private WebElement REQUESTFORFINANCINRequestForFinancingMaintenanceTotalLimit;
	public WebElement REQUESTFORFINANCIN_RequestForFinancing_Maintenance_TotalLimit() {
		return REQUESTFORFINANCINRequestForFinancingMaintenanceTotalLimit;
	}
	
	
	@FindBy(xpath = "//span[text()='Disbursement/Sublimit']")
	private WebElement REQUESTFORFINANCINRequestForFinancingMaintenanceDisbursementSublimittab;
	public WebElement REQUESTFORFINANCIN_RequestForFinancing_Maintenance_DisbursementSublimittab() {
		return REQUESTFORFINANCINRequestForFinancingMaintenanceDisbursementSublimittab;
	}
	
	
	
	@FindBy(xpath = "//td[@id='add_RequestFinancingLimitDetailsGridId_CSMRF00MT']/div/span")
	private WebElement REQUESTFORFINANCINAddnewrow;
	public WebElement REQUESTFORFINANCIN_Addnewrow() {
		return REQUESTFORFINANCINAddnewrow;
	}
	
	@FindBy(xpath = "//input[@name='requestFinancingCO.requestFinancingLimitCO.fmsAppLimitDetVO.CLASS']")
	private WebElement REQUESTFORFINANCINLimitDetailsProductClass;
	public WebElement REQUESTFORFINANCIN_LimitDetails_ProductClass() {
		return REQUESTFORFINANCINLimitDetailsProductClass;
	}
	
	@FindBy(xpath = "//input[@name='requestFinancingCO.requestFinancingLimitCO.fmsAppLimitDetVO.RF_NEW_MARGIN']")
	private WebElement REQUESTFORFINANCINLimitDetailsNewMargin;
	public WebElement REQUESTFORFINANCIN_LimitDetails_NewMargin() {
		return REQUESTFORFINANCINLimitDetailsNewMargin;
	}
	/*
	@FindBy(xpath = "//span[contains(text(),' Add ')]")
	private WebElement REQUESTFORFINANCINLimitDetailsAdd;
	public WebElement REQUESTFORFINANCIN_LimitDetails_Add() {
		return REQUESTFORFINANCINLimitDetailsAdd;
	}
	*/
	
	
	
	@FindBy(xpath = "//label[text()='Save ']")
	private WebElement REQUESTFORFINANCINSave;
	public WebElement REQUESTFORFINANCIN_Save(){
		return REQUESTFORFINANCINSave;
	}
	
	@FindBy(xpath = "")
	private WebElement REQUESTFORFINANCINValidate;
	public WebElement REQUESTFORFINANCIN_Validate() {
		return REQUESTFORFINANCINValidate;
	}
	
	
	
	@FindBy(xpath = "//div[text()='CONFIRM']")
	private WebElement REQUESTFORFINANCINAlreadyExistsPopUp;
	public WebElement REQUESTFORFINANCIN_AlreadyExistsPopUp() {
		return REQUESTFORFINANCINAlreadyExistsPopUp;
	}
	
	//get application no --  //div[@class='jMsgbox-contentWrap']"
	
	@FindBy(xpath = "//span[text()='Send Alert']")
	private WebElement REQUESTFORFINANCINSendAlert;
	public WebElement REQUESTFORFINANCIN_SendAlert() {
		return REQUESTFORFINANCINSendAlert;
	}
	
	@FindBy(xpath = "//span[contains(text(),' Dismiss ')]")
	private WebElement REQUESTFORFINANCINSendAlertDismiss;
	public WebElement REQUESTFORFINANCIN_SendAlert_Dismiss() {
		return REQUESTFORFINANCINSendAlertDismiss;
	}
	
	@FindBy(xpath = "//span[text()='Approve Level 1']")
	private WebElement REQUESTFORFINANCINRequestForFinancingApproveLevel1;
	public WebElement REQUESTFORFINANCIN_RequestForFinancing__ApproveLevel1() {
		return REQUESTFORFINANCINRequestForFinancingApproveLevel1;
	}
	
	@FindBy(xpath = "(//input[@name='fmsRequestFinancingVO.CODE'])[2]")
	private WebElement REQUESTFORFINANCINRequestForFinancingApproveLevel1Code;
	public WebElement REQUESTFORFINANCIN_RequestForFinancing__ApproveLevel1_Code() {
		return REQUESTFORFINANCINRequestForFinancingApproveLevel1Code;
	}
	
	
	@FindBy(xpath = "//table[@id='requestFinancingGridTbl_Id_CSMRF00P1']/tbody/tr[2]/td[1]")
	private WebElement REQUESTFORFINANCINRequestForFinancingApproveLevel1SelectCode;
	public WebElement REQUESTFORFINANCIN_RequestForFinancing__ApproveLevel1_SelectCode() {
		return REQUESTFORFINANCINRequestForFinancingApproveLevel1SelectCode;
	}
	
	
	@FindBy(xpath = "//span[text()='Customer Grading & Recommendations']//ancestor::li[@id='customerGradingRecommendationsTab_CSMRF00P1']")
	private WebElement REQUESTFORFINANCINRequestForFinancingApproveLevel1CustomerGradingRecommendations;
	public WebElement REQUESTFORFINANCIN_RequestForFinancing__ApproveLevel1_CustomerGradingRecommendations() {
		return REQUESTFORFINANCINRequestForFinancingApproveLevel1CustomerGradingRecommendations;
	}
	
	@FindBy(xpath = "//select[@name='requestFinancingCO.fmsAppl3BlobsVO.DECISION_P1' and @id='requestDecisionForward_1_CSMRF00P1']")
	private WebElement REQUESTFORFINANCINRequestForFinancingApproveLevel1CustomerGradingRecommendationsDecision;
	public WebElement REQUESTFORFINANCIN_RequestForFinancing__ApproveLevel1_CustomerGradingRecommendations_Decision() {
		return REQUESTFORFINANCINRequestForFinancingApproveLevel1CustomerGradingRecommendationsDecision;
	}
	
	@FindBy(xpath = "//select[@name='requestFinancingCO.fmsAppl3BlobsVO.FORWARD_P1']//parent::td[@id='lbl_requestDecisionForward_P1_CSMRF00P1']")
	private WebElement REQUESTFORFINANCINRequestForFinancingApproveLevel1CustomerGradingRecommendationsDecisionMoreRecommendations;
	public WebElement REQUESTFORFINANCIN_RequestForFinancing__ApproveLevel1_CustomerGradingRecommendations_Decision_MoreRecommendations() {
		return REQUESTFORFINANCINRequestForFinancingApproveLevel1CustomerGradingRecommendationsDecisionMoreRecommendations;
	}
	
	@FindBy(xpath = "//select[@id='requestP1approvalCommitte_CSMRF00P1']")
	private WebElement REQUESTFORFINANCINRequestForFinancingApproveLevel1CustomerGradingRecommendationsApprovalCommittee;
	public WebElement REQUESTFORFINANCIN_RequestForFinancing__ApproveLevel1_CustomerGradingRecommendations_ApprovalCommittee() {
		return REQUESTFORFINANCINRequestForFinancingApproveLevel1CustomerGradingRecommendationsApprovalCommittee;
	}
	
	@FindBy(xpath = "//label[text()='Approve ']")
	private WebElement REQUESTFORFINANCINApprove;
	public WebElement REQUESTFORFINANCIN_Approve() {
		return REQUESTFORFINANCINApprove;
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
	
	@FindBy(xpath = "")
	private WebElement REQUESTFORFINANCINRequestForFinancingApprovalCommitteeRecommendationsSelectCode;
	public WebElement REQUESTFORFINANCIN_RequestForFinancing_ApprovalCommitteeRecommendations_SelectCode() {
		return REQUESTFORFINANCINRequestForFinancingApprovalCommitteeRecommendationsSelectCode;
	}
	
	@FindBy(xpath = "//li[@id='creditCommitteeRecommendationsTab_CSMRF00AC']/a/span[text()='Credit Committee Recommendations']")
	private WebElement REQUESTFORFINANCINRequestForFinancingApprovalCreditCommitteeRecommendations;
	public WebElement REQUESTFORFINANCIN_RequestForFinancing_Approval_CreditCommitteeRecommendations() {
		return REQUESTFORFINANCINRequestForFinancingApprovalCreditCommitteeRecommendations;
	}
	
	@FindBy(xpath = "//span[text()='Recommendations']")
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
	public WebElement REQUESTFORFINANCIN_RequestForFinancing_ApprovalCommitteeRecommendationsField() {
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
}
