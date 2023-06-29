package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Facilities_Management_PageObjects_609 {

	WebDriver driver;
	public Facilities_Management_PageObjects_609(WebDriver driver) {
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
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@FindBy(xpath = "//span[@id='spanLookup_requestFinanacingCif_CSMRF00MT']/span")
	private WebElement REQUESTFORFINANCINRequestForFinancingMaintenanceCustomerSearch;
	public WebElement REQUESTFORFINANCIN_RequestForFinancing_Maintenance_Customer_Search() {
		return REQUESTFORFINANCINRequestForFinancingMaintenanceCustomerSearch;
	}
	
	@FindBy(xpath = "//input[@id='gridtab_requestFinanacingCif_CSMRF00MT_gs_cifVO.CIF_NO']")
	private WebElement REQUESTFORFINANCINRequestForFinancingMaintenanceCustomer;
	public WebElement REQUESTFORFINANCIN_RequestForFinancing_Maintenance_Customer() {
		return REQUESTFORFINANCINRequestForFinancingMaintenanceCustomer;
	}
	
	@FindBy(xpath = "//input[@id='gridtab_requestFinancingFacilityType_CSMRF00MT_gs_CODE']")
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
	
	
	
	
	
	
	@FindBy(xpath= "//input[@id='requestFinancingFacilityTotalvalue_CSMRF00MT']")
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
	
	
	
	
	//**************************569729**************************//
	
	
	
	@FindBy(xpath = "//span[text()='Maintenance']")
	private WebElement ParametersFacilityTypeMaintenance;
	public WebElement Parameters_FacilityType_Maintenance() {
		return ParametersFacilityTypeMaintenance;
	}
	
	@FindBy(xpath = "//span[text()='Facility Details']//ancestor::li[@id='fmsFacilityTypeDetailsTab_P008MT']")
	private WebElement ParametersFacilityTypeMaintenanceFacilityDetails;
	public WebElement Parameters_FacilityType_Maintenance_FacilityDetails() {
		return ParametersFacilityTypeMaintenanceFacilityDetails;
	}
	
	@FindBy(xpath = "")
	private WebElement ParametersFacilityTypeMaintenanceFacilityDetailsApplyGlobalLimit;
	public WebElement Parameters_FacilityType_Maintenance_FacilityDetails_ApplyGlobalLimit() {
		return ParametersFacilityTypeMaintenanceFacilityDetailsApplyGlobalLimit;
	}
	
	//*****************************570687****************************//
	
	@FindBy(xpath = "//input[@name='applicationFacilityCO.fmsApplVO.GLOBAL_LIMIT_CODE']")
	private WebElement ApplicationforfinancialfacilitiesMaintenanceAdditionalDetailsTabGlobalLimitCode;
	public WebElement Applicationforfinancialfacilities_Maintenance_AdditionalDetailsTab_GlobalLimitCode() {
		return ApplicationforfinancialfacilitiesMaintenanceAdditionalDetailsTabGlobalLimitCode;
	}
	
	@FindBy(xpath = "//input[@name='applicationFacilityCO.fmsApplVO.ACTUAL_LIMIT_UTILIZED']")
	private WebElement ApplicationforfinancialfacilitiesMaintenanceAdditionalDetailsTabActualLimitUtilized;
	public WebElement Applicationforfinancialfacilities_Maintenance_AdditionalDetailsTab_ActualLimitUtilized() {
		return ApplicationforfinancialfacilitiesMaintenanceAdditionalDetailsTabActualLimitUtilized;
	}
	
	
	//******************586385*******************//
	
	@FindBy(xpath = "//td[text()='Suspend Reasons']")
	private WebElement ParametersSuspendReasons;
	public WebElement Parameters_SuspendReasons() {
		return ParametersSuspendReasons;
	}
	
	@FindBy(xpath = "//span[text()='Maintenance']")
	private WebElement ParametersSuspendReasonsMaintenance;
	public WebElement Parameters_SuspendReasons_Maintenance() {
		return ParametersSuspendReasonsMaintenance;
	}
	
	@FindBy(xpath = "//input[@name='paramSuspendReasonCO.fmsSuspendReasonVO.CODE']")
	private WebElement ParametersSuspendReasonsMaintenanceCode;
	public WebElement Parameters_SuspendReasons_Maintenance_Code() {
		return ParametersSuspendReasonsMaintenanceCode;
	}
	
	@FindBy(xpath = "//input[@name='paramSuspendReasonCO.fmsSuspendReasonVO.BRIEF_NAME_ENG']")
	private WebElement ParametersSuspendReasonsMaintenanceBriefDescription;
	public WebElement Parameters_SuspendReasons_Maintenance_BriefDescription() {
		return ParametersSuspendReasonsMaintenanceBriefDescription;
	}
	
	@FindBy(xpath = "//input[@name='paramSuspendReasonCO.fmsSuspendReasonVO.LONG_NAME_ENG']")
	private WebElement ParametersSuspendReasonsMaintenanceLongDescription;
	public WebElement Parameters_SuspendReasons_Maintenance_LongDescription() {
		return ParametersSuspendReasonsMaintenanceLongDescription;
	}
	
	
	@FindBy(xpath = "//input[@name='paramSuspendReasonCO.fmsSuspendReasonVO.BRIEF_NAME_ARAB']")
	private WebElement ParametersSuspendReasonsMaintenanceBriefDescriptionArab;
	public WebElement Parameters_SuspendReasons_Maintenance_BriefDescriptionArab() {
		return ParametersSuspendReasonsMaintenanceBriefDescriptionArab;
	}
	
	@FindBy(xpath = "//input[@name='paramSuspendReasonCO.fmsSuspendReasonVO.LONG_NAME_ARAB']")
	private WebElement ParametersSuspendReasonsMaintenanceLongDescriptionArab;
	public WebElement Parameters_SuspendReasons_Maintenance_LongDescriptionArab() {
		return ParametersSuspendReasonsMaintenanceLongDescriptionArab;
	}
	
	@FindBy(xpath = "//label[text()='Save ']")
	private WebElement ParametersSuspendReasonsMaintenanceSave;
	public WebElement Parameters_SuspendReasons_Maintenance_Save() {
		return ParametersSuspendReasonsMaintenanceSave;
	}
	
	@FindBy(xpath = "//span[text()='Approve']")
	private WebElement ParametersSuspendReasonsApprove;
	public WebElement Parameters_SuspendReasons_Approve() {
		return ParametersSuspendReasonsApprove;
	}
	
	
	@FindBy(xpath = "//input[@name='CODE' and @id='paramSuspendReasonListGridTbl_Id_P011P_gs_fmsSuspendReasonVO.CODE']")
	private WebElement ParametersSuspendReasonsApproveCode;
	public WebElement Parameters_SuspendReasons_Approve_Code() {
		return ParametersSuspendReasonsApproveCode;
	}
	
	@FindBy(xpath = "//label[text()='Approve ' and @id='paramSuspendReasonFormId_P011P_Approve_key']")
	private WebElement ParametersSuspendReasonsApproveApproveBtn;
	public WebElement Parameters_SuspendReasons_Approve_ApproveBtn() {
		return ParametersSuspendReasonsApproveApproveBtn;
	}
	
	
	//******************************586385_01*********************************//
	
	@FindBy(xpath = "//td[text()='Facilities Management']")
	private WebElement WifakapplictionSubmenuFacilitiesManagement;
	public WebElement WifakapplictionSubmenu_FacilitiesManagement() {
		return WifakapplictionSubmenuFacilitiesManagement;
	}
	
	@FindBy(xpath = "//span[text()='Suspend']")
	private WebElement WifakapplictionSubmenuFacilitiesManagementSuspend;
	public WebElement WifakapplictionSubmenu_FacilitiesManagement_Suspend() {
		return WifakapplictionSubmenuFacilitiesManagementSuspend;
	}
	
	
	@FindBy(xpath = "//td[text()='Clear']")
	private WebElement WifakapplictionSubmenuFacilitiesManagementSuspendClearBtn;
	public WebElement WifakapplictionSubmenu_FacilitiesManagement_Suspend_ClearBtn() {
		return WifakapplictionSubmenuFacilitiesManagementSuspendClearBtn;
	}
	
	@FindBy(xpath = "//table[@id='facilityManagementGridTbl_Id_WIFT008SP']/tbody/tr[@id='1']/td")
	private WebElement WifakapplictionSubmenuFacilitiesManagementSuspendSelectRecord;
	public WebElement WifakapplictionSubmenu_FacilitiesManagement_Suspend_SelectRecord() {
		return WifakapplictionSubmenuFacilitiesManagementSuspendSelectRecord;
	}
	
	
	@FindBy(xpath = "//span[@id='spanLookup_facilityMgtMainSuspendReason_WIFT008SP']/span")
	private WebElement WifakapplictionSubmenuFacilitiesManagementSuspendSuspendReasonSearch;
	public WebElement WifakapplictionSubmenu_FacilitiesManagement_Suspend_SuspendReasonSearch() {
		return WifakapplictionSubmenuFacilitiesManagementSuspendSuspendReasonSearch;
	}
	
	@FindBy(xpath = "//input[@name='suspendReasonVO.CODE']")
	private WebElement WifakapplictionSubmenuFacilitiesManagementSuspendSuspendReasonCode;
	public WebElement WifakapplictionSubmenu_FacilitiesManagement_Suspend_SuspendReasonCode() {
		return WifakapplictionSubmenuFacilitiesManagementSuspendSuspendReasonCode;
	}
	
	@FindBy(xpath = "")
	private WebElement WifakapplictionSubmenuFacilitiesManagementSuspendSuspendReasonSelect;
	public WebElement WifakapplictionSubmenu_FacilitiesManagement_Suspend_SuspendReasonSelect() {
		return WifakapplictionSubmenuFacilitiesManagementSuspendSuspendReasonSelect;
	}
	
	@FindBy(xpath = "//input[@name='facilityManagementCO.suspendReasonDesc']")
	private WebElement WifakapplictionSubmenuFacilitiesManagementSuspendSuspendReasonDescription;
	public WebElement WifakapplictionSubmenu_FacilitiesManagement_Suspend_SuspendReasonDescription() {
		return WifakapplictionSubmenuFacilitiesManagementSuspendSuspendReasonDescription;
	}
	
	
	
	
	
	@FindBy(xpath = "//button[@id='facilityManagement_suspend_btn_WIFT008SP']/span[contains(text(),' Suspend ')]")
	private WebElement FacilitiesManagementSuspendBtn;
	public WebElement FacilitiesManagement_SuspendBtn() {
		return FacilitiesManagementSuspendBtn;
	}
	
	
	@FindBy(xpath = "//div[@id='div__popup_path_sol_ok']/div[1]/div")
	private WebElement FacilitiesManagementSuspendReasonCannotProceed;
	public WebElement FacilitiesManagement_SuspendReasonCannotProceed() {
		return FacilitiesManagementSuspendReasonCannotProceed;
	}
	
	
	
	@FindBy(xpath = "//input[@id='_popup_path_sol_ok']")
	private WebElement FacilitiesManagementSuspendReasonCannotProceedOK;
	public WebElement FacilitiesManagement_SuspendReasonCannotProceed_Ok() {
		return FacilitiesManagementSuspendReasonCannotProceedOK;
	}
	
	//*************************************535114************************************//
	
	@FindBy(xpath = "//span[text()='Application Requirements And Details']")
	private WebElement FacilityTypeFacilitydetailsApplicationRequirementsAndDetails;
	public WebElement FacilityType_Facilitydetails_ApplicationRequirementsAndDetails() {
		return FacilityTypeFacilitydetailsApplicationRequirementsAndDetails;
	}
	
	@FindBy(xpath = "//input[@name='fmsFacilityTypeCO.fmsFacilityTypeVO.ALLOW_MUL_GROUP_IN_SUBLIMIT_YN']")
	private WebElement ApplicationRequirementsAndDetailsAllowtoaddsublimitinmultiplegroups ;
	public WebElement ApplicationRequirementsAndDetails_Allowtoaddsublimitinmultiplegroups () {
		return ApplicationRequirementsAndDetailsAllowtoaddsublimitinmultiplegroups;
	}
	
	@FindBy(xpath = "//select[@name='fmsFacilityTypeCO.fmsFacilityTypeVO.REVOLVING_ONEOFF']")
	private WebElement FacilityTypeMaindetailsRevolvingOneOff;
	public WebElement FacilityType_Maindetails_RevolvingOneOff () {
		return FacilityTypeMaindetailsRevolvingOneOff;
	}
	
	
	@FindBy(xpath = "//label[text()='Group Limit ']")
	private WebElement ApplicationforfinancialfacilitiesMaintenanceLimitDetailsTabGroupLimit;
	public WebElement Applicationforfinancialfacilities_Maintenance_LimitDetailsTab_GroupLimit() {
		return ApplicationforfinancialfacilitiesMaintenanceLimitDetailsTabGroupLimit;
	}
	
	
	
	@FindBy(xpath = "//td[@id='add_FacilityGroupLimit_WIFT001MT']/div/span")
	private WebElement LimitDetailsGroupLimitAddicon;
	public WebElement LimitDetails_GroupLimit_Addicon() {
		return LimitDetailsGroupLimitAddicon;
	}
	
	
	@FindBy(xpath = "//table[@id='FacilityGroupLimit_WIFT001MT']/tbody/tr[2]/td[text()='1']")
	private WebElement LimitDetailsGroupLimitSelectRow1;
	public WebElement LimitDetails_GroupLimit_SelectRow1() {
		return LimitDetailsGroupLimitSelectRow1;
	}
	
	
	
	
	@FindBy(xpath = "//td[@id='td_FacilityGroupLimit_WIFT001MT_1_fmsAppLimitDetGroupVO.GROUP_ID']/div/input")
	private WebElement LimitDetailsGroupLimitGroupId1;
	public WebElement LimitDetails_GroupLimit_GroupId1() {
		return LimitDetailsGroupLimitGroupId1;
	}
	
	@FindBy(xpath = "//td[@id='td_FacilityGroupLimit_WIFT001MT_1_fmsAppLimitDetGroupVO.GROUP_NAME']/input")
	private WebElement LimitDetailsGroupLimitGroupName1;
	public WebElement LimitDetails_GroupLimit_GroupName1() {
		return LimitDetailsGroupLimitGroupName1;
	}
	
	@FindBy(xpath = "//td[@id='td_FacilityGroupLimit_WIFT001MT_1_fmsAppLimitDetGroupVO.GROUP_LIMIT']/div/input")
	private WebElement LimitDetailsGroupLimitGroupLimit1;
	public WebElement LimitDetails_GroupLimit_GroupLimit1() {
		return LimitDetailsGroupLimitGroupLimit1;
	}
	
	@FindBy(xpath = "//table[@id='FacilityGroupLimit_WIFT001MT']/tbody/tr/td[text()='2']")
	private WebElement LimitDetailsGroupLimitSelectRow2;
	public WebElement LimitDetails_GroupLimit_SelectRow2() {
		return LimitDetailsGroupLimitSelectRow2;
	}
	
	@FindBy(xpath = "(//td[@id='td_FacilityGroupLimit_WIFT001MT_1_fmsAppLimitDetGroupVO.GROUP_ID'])[2]/div/input")
	private WebElement LimitDetailsGroupLimitGroupId2;
	public WebElement LimitDetails_GroupLimit_GroupId2() {
		return LimitDetailsGroupLimitGroupId2;
	}
	
	@FindBy(xpath = "(//td[@id='td_FacilityGroupLimit_WIFT001MT_1_fmsAppLimitDetGroupVO.GROUP_NAME'])[2]/input")
	private WebElement LimitDetailsGroupLimitGroupName2;
	public WebElement LimitDetails_GroupLimit_GroupName2() {
		return LimitDetailsGroupLimitGroupName2;
	}
	
	@FindBy(xpath = "(//td[@id='td_FacilityGroupLimit_WIFT001MT_1_fmsAppLimitDetGroupVO.GROUP_LIMIT'])[2]/div/input")
	private WebElement LimitDetailsGroupLimitGroupLimit2;
	public WebElement LimitDetails_GroupLimit_GroupLimit2() {
		return LimitDetailsGroupLimitGroupLimit2;
	}
	
	
	@FindBy(xpath = "//span[text()='OK']")
	private WebElement LimitDetailsGroupLimitOK;
	public WebElement LimitDetails_GroupLimit_Ok() {
		return LimitDetailsGroupLimitOK;
	}
	
	@FindBy(xpath = "//label[text()='Group ID ']")
	private WebElement LimitDetailsGroupId;
	public WebElement LimitDetails_GroupId() {
		return LimitDetailsGroupId;
	}
	
	@FindBy(xpath = "//table[@id='FacilityGroupID_WIFT001MT']/tbody/tr[2]/td[2]")
	private WebElement LimitDetailsGroupIdField1;
	public WebElement LimitDetails_GroupId_Field1() {
		return LimitDetailsGroupIdField1;
	}
	
	@FindBy(xpath = "//table[@id='FacilityGroupID_WIFT001MT']/tbody/tr[3]/td[2]")
	private WebElement LimitDetailsGroupIdField2;
	public WebElement LimitDetails_GroupId_Field2() {
		return LimitDetailsGroupIdField2;
	}
	
	
	@FindBy(xpath = "//table[@id='FacilityGroupID_WIFT001MT']/tbody/tr[2]/td[2]/input")
	private WebElement LimitDetailsGroupIdflag1;
	public WebElement LimitDetails_GroupId_flag1() {
		return LimitDetailsGroupIdflag1;
	}
	
	@FindBy(xpath = "//table[@id='FacilityGroupID_WIFT001MT']/tbody/tr[3]/td[2]/input")
	private WebElement LimitDetailsGroupIdflag2;
	public WebElement LimitDetails_GroupId_flag2() {
		return LimitDetailsGroupIdflag2;
	}
	
	
	@FindBy(xpath = "//div[@id='facilityGroupIDPopupDiv_id_WIFT001MT']//following::span[text()='OK']")
	private WebElement GroupIdOk;
	public WebElement GroupId_Ok() {
		return GroupIdOk;
	}
	
	@FindBy(xpath = "")
	private WebElement ConfirmAlert_Ok;
	public WebElement ConfirmAlert_Ok() {
		return ConfirmAlert_Ok;
	}
	
	@FindBy(xpath = "")
	private WebElement SendAlert_Ok;
	public WebElement SendAlert_Ok() {
		return SendAlert_Ok;
	}
	
	
	
	@FindBy(xpath = "//span[text()='Approve Level 1/Reject']")
	private WebElement ApproveLevel1;
	public WebElement ApproveLevel1() {
		return ApproveLevel1;
	}
	
	@FindBy(xpath = "//input[@id='applicationFacilityGridTbl_Id_WIFT001AP1_gs_fmsApplVO.CODE']")
	private WebElement ApproveLevel1_Code;
	public WebElement ApproveLevel1_Code() {
		return ApproveLevel1_Code;
	}
	
	
	@FindBy(xpath = "//select[@id='applicationFacilityDecision_1_WIFT001AP1']")
	private WebElement ApproveLevel1_Decision;
	public WebElement ApproveLevel1_Decision() {
		return ApproveLevel1_Decision;
	}
	
	@FindBy(xpath = "//select[@id='applicationFacilityForwardP1_WIFT001AP1']")
	private WebElement ApproveLevel1_ForwardDecision;
	public WebElement ApproveLevel1_ForwardDecision() {
		return ApproveLevel1_ForwardDecision;
	}
	
	
	
	@FindBy(xpath = "//button[@id='applicationfacility_approvelevel1_btn_WIFT001AP1']/span[contains(text(),' Submit ')]")
	private WebElement ApproveLevel1_Submit;
	public WebElement ApproveLevel1_Submit() {
		return ApproveLevel1_Submit;
	}
	
	
	
	@FindBy(xpath = "//span[text()='Approve Level 3/Reject']")
	private WebElement ApproveLevel3;
	public WebElement ApproveLevel3() {
		return ApproveLevel3;
	}
	
	@FindBy(xpath = "//input[@id='applicationFacilityGridTbl_Id_WIFT001AP3_gs_fmsApplVO.CODE']")
	private WebElement ApproveLevel3_Code;
	public WebElement ApproveLevel3_Code() {
		return ApproveLevel3_Code;
	}
	
	
	@FindBy(xpath = "//select[@id='applicationFacilityDecision3_WIFT001AP3']")
	private WebElement ApproveLevel3_Decision;
	public WebElement ApproveLevel3_Decision() {
		return ApproveLevel3_Decision;
	}
	
	
	@FindBy(xpath = "//button[@id='applicationfacility_approvelevel3_btn_WIFT001AP3']/span[contains(text(),' Submit ')]")
	private WebElement ApproveLevel3_Submit;
	public WebElement ApproveLevel3_Submit() {
		return ApproveLevel3_Submit;
	}
	
	@FindBy(xpath = "//td[text()='Facilities Management']")
	private WebElement FacilitiesManagement;
	public WebElement FacilitiesManagement() {
		return FacilitiesManagement;
	}
	
	@FindBy(xpath = "//a[@id='WIFT009MT']/span[text()='Maintenance']")
	private WebElement WifakapplictionSubmenu_FacilitiesManagement_Maintenance;
	public WebElement WifakapplictionSubmenu_FacilitiesManagement_Maintenance() {
		return WifakapplictionSubmenu_FacilitiesManagement_Maintenance;
	}
	
	
	@FindBy(xpath = "//a[contains(text(),' Search ') and @id='infoBarSearchButton_WIFT008MT']")
	private WebElement SearchButton;
	public WebElement SearchButton() {
		return SearchButton;
	}
	
	@FindBy(xpath = "//a[contains(text(),' Search ') and @id='infoBarSearchButton_WIFT008MT']")
	private WebElement ClearButton;
	public WebElement ClearButton() {
		return ClearButton;
	}
	
	@FindBy(xpath = "//input[@id='facilityManagementGridTbl_Id_WIFT008MT_gs_fmsFacilityVO.FROM_APPLICATION']")
	private WebElement FacilitiesManagement_Maintenance_ApplicationRef;
	public WebElement FacilitiesManagement_Maintenance_ApplicationRef() {
		return FacilitiesManagement_Maintenance_ApplicationRef;
	}
	
	
	
	@FindBy(xpath = "//input[@id='facilityMangementCode_WIFT008MT']")
	private WebElement FacilitiesManagement_Maintenance_ExtractCode;
	public WebElement FacilitiesManagement_Maintenance_ExtractCode() {
		return FacilitiesManagement_Maintenance_ExtractCode;
	}
	
	
	@FindBy(xpath = "//button[@id='facilitymanagement_save_btn_WIFT008MT']/span[contains(text(),' Save ')]")
	private WebElement FacilitiesManagement_Save;
	public WebElement FacilitiesManagement_Save() {
		return FacilitiesManagement_Save;
	}
	
	/*
	@FindBy(xpath = "//span[text()='Approval Committee Recommendations ']")
	private WebElement WifakapplictionSubmenu_ApprovalCommitteeRecommendations;
	public WebElement WifakapplictionSubmenu_ApprovalCommitteeRecommendations() {
		return WifakapplictionSubmenu_ApprovalCommitteeRecommendations;
	}
	*/
	
	@FindBy(xpath = "//td[text()='Draw Down Request']")
	private WebElement WifakapplictionSubmenu_DrawDownRequest;
	public WebElement WifakapplictionSubmenu_DrawDownRequest() {
		return WifakapplictionSubmenu_DrawDownRequest;
	}
	
	@FindBy(xpath = "//a[@id='WIFT009MT']/span[text()='Maintenance']")
	private WebElement DrawDownRequest_Maintenanace;
	public WebElement DrawDownRequest_Maintenanace() {
		return DrawDownRequest_Maintenanace;
	}
	
	
	
	
	
	
	
	
	
	
	@FindBy(xpath = "//span[@id='spanLookup_drawDownRequestFacility_Branch_WIFT009MT']/span")
	private WebElement DrawDownRequest_Maintenanace_FacilityReferenceSearch;
	public WebElement DrawDownRequest_Maintenanace_FacilityReferenceSearch() {
		return DrawDownRequest_Maintenanace_FacilityReferenceSearch;
	}
	
	@FindBy(xpath = "//input[@id='gridtab_drawDownRequestFacility_Branch_WIFT009MT_gs_branchesVO.BRANCH_CODE']")
	private WebElement DrawDownRequest_Maintenanace_FacilityReference ;
	public WebElement DrawDownRequest_Maintenanace_FacilityReference() {
		return DrawDownRequest_Maintenanace_FacilityReference;
	}
	
	@FindBy(xpath = "//span[@id='spanLookup_drawDownRequestDrawDownType_WIFT009MT']/span")
	private WebElement DrawDownRequest_Maintenanace_DrawdownTypeSearch;
	public WebElement DrawDownRequest_Maintenanace_DrawdownTypeSearch() {
		return DrawDownRequest_Maintenanace_DrawdownTypeSearch;
	}
	
	@FindBy(xpath = "//input[@id='gridtab_drawDownRequestDrawDownType_WIFT009MT_gs_drawDownTypeVO.CODE']")
	private WebElement DrawDownRequest_Maintenanace_DrawdownType;
	public WebElement DrawDownRequest_Maintenanace_DrawdownType() {
		return DrawDownRequest_Maintenanace_DrawdownType;
	}
	
	
	@FindBy(xpath = "//input[@id='drawDownRequestLongNameEnglish_WIFT009MT']")
	private WebElement DrawDownRequest_Maintenanace_DescriptionEnglish;
	public WebElement DrawDownRequest_Maintenanace_DescriptionEnglish() {
		return DrawDownRequest_Maintenanace_DescriptionEnglish;
	}
	
	@FindBy(xpath = "//input[@id='drawDownRequestLongNameArab_WIFT009MT']")
	private WebElement DrawDownRequest_Maintenanace_DescriptionArab;
	public WebElement DrawDownRequest_Maintenanace_DescriptionArab() {
		return DrawDownRequest_Maintenanace_DescriptionArab;
	}
	
	@FindBy(xpath = "//input[@id='drawDownRequestDateSubmitted_WIFT009MT']")
	private WebElement DrawDownRequest_Maintenanace_DateSubmitted;
	public WebElement DrawDownRequest_Maintenanace_DateSubmitted() {
		return DrawDownRequest_Maintenanace_DateSubmitted;
	}
	
	@FindBy(xpath = "//input[@id='drawDownRequestValueDate_WIFT009MT']")
	private WebElement DrawDownRequest_Maintenanace_ValueDate;
	public WebElement DrawDownRequest_Maintenanace_ValueDate() {
		return DrawDownRequest_Maintenanace_ValueDate;
	}
	
	@FindBy(xpath = "//span[text()='Drawdown Additional Details']")
	private WebElement DrawDownRequest_Maintenanace_DrawdownAdditionalDetails;
	public WebElement DrawDownRequest_Maintenanace_DrawdownAdditionalDetails() {
		return DrawDownRequest_Maintenanace_DrawdownAdditionalDetails;
	}
	
	@FindBy(xpath = "//span[@id='spanLookup_drawDownRequestProduct_Class_WIFT009MT']/span")
	private WebElement DrawDownRequest_Maintenanace_DrawdownAdditionalDetails_ProductClassLNSearch;
	public WebElement DrawDownRequest_Maintenanace_DrawdownAdditionalDetails_ProductClassLNSearch() {
		return DrawDownRequest_Maintenanace_DrawdownAdditionalDetails_ProductClassLNSearch;
	}
	
	@FindBy(xpath = "//input[@id='gridtab_drawDownRequestProduct_Class_WIFT009MT_gs_viewDrawDownClassVO.CODE']")
	private WebElement DrawDownRequest_Maintenanace_DrawdownAdditionalDetails_ProductClassLN;
	public WebElement DrawDownRequest_Maintenanace_DrawdownAdditionalDetails_ProductClassLN() {
		return DrawDownRequest_Maintenanace_DrawdownAdditionalDetails_ProductClassLN;
	}
	
	@FindBy(xpath = "//label[text()='Save ']")
	private WebElement DrawDownRequest_Maintenanace_Save;
	public WebElement DrawDownRequest_Maintenanace_Save() {
		return DrawDownRequest_Maintenanace_Save;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//table[@id='applicationFacilityGridTbl_Id_WIFT001AP1']/tbody/tr/td[text()='0000004447']
	
	
}

