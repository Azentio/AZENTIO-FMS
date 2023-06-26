package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Application_Financial_Facility_Pageobjects {
	WebDriver driver;
	public Application_Financial_Facility_Pageobjects(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
//-----------------@861963---------------------//
	
	@FindBy(xpath = "//td[text()='Parameters']")
	private WebElement FmsParametersMenu;
	public WebElement Fms_ParametersMenu() {
		return FmsParametersMenu;
	}
	
	@FindBy(xpath = "//td[text()='Facility Type']")
	private WebElement FacilityTypeSubmenu;
	public WebElement FacilityType_Submenu() {
		return FacilityTypeSubmenu;
	}
	
	/*
	 * @FindBy(id = "P008UP") private WebElement FacilityTypeUpdateafterapprove;
	 * public WebElement FacilityType_Updateafterapprove() { return
	 * FacilityTypeUpdateafterapprove; }
	 */
	
	@FindBy(id =  "fmsFacilityTypeListGridTbl_Id_P008UP_gs_CODE")
	private WebElement FacilityTypeCode;
	public WebElement FacilityType_Code() {
		return FacilityTypeCode;
	}
	
	@FindBy(id =  "td_fmsFacilityTypeListGridTbl_Id_P008UP_1_CODE and")
	private WebElement FacilityTypeSelectCode;
	public WebElement FacilityType_SelectCode() {
		return FacilityTypeSelectCode;
	}
	
	@FindBy(xpath = "//span[text()='Facility Details']//ancestor::li[@id='fmsFacilityTypeDetailsTab_P008UP']")
	private WebElement FacilityTypeFacilitydetails;
	public WebElement FacilityType_Facilitydetails() {
		return FacilityTypeFacilitydetails;
	}
	
	@FindBy(xpath = "//span[text()='STP Facility Requirements']")
	private WebElement FacilityTypeFacilitydetailsSTPFacilityRequirements;
	public WebElement FacilityType_Facilitydetails_STPFacilityRequirements() {
		return FacilityTypeFacilitydetailsSTPFacilityRequirements;
	}
	
	@FindBy(xpath = "//label[text()='Customer Grading ']//parent::td/input[1]")
	private WebElement FacilityTypeCustomerGrading;
	public WebElement FacilityType_CustomerGrading() {
		return FacilityTypeCustomerGrading;
	}
	
	@FindBy(xpath = "//label[text()='Overwrite Grading ']//parent::td/input[1]")
	private WebElement FacilityTypeOverwriteGrading;
	public WebElement FacilityType_OverwriteGrading() {
		return FacilityTypeOverwriteGrading;
	}
	
	@FindBy(xpath = "//label[text()='Committee Approval ']//parent::td/input[1]")
	private WebElement FacilityTypeCommitteeApproval;
	public WebElement FacilityType_CommitteeApproval() {
		return FacilityTypeCommitteeApproval;
	}
	
	@FindBy(xpath = "//label[text()='Credit Authorization ']//parent::td/input[1]")
	private WebElement FacilityTypeCreditAuthorization;
	public WebElement FacilityType_CreditAuthorization() {
		return FacilityTypeCreditAuthorization;
	}
	
	@FindBy(xpath = "//label[text()='Client Response ']//parent::td/input[1]")
	private WebElement FacilityTypeClientResponse ;
	public WebElement FacilityType_ClientResponse () {
		return FacilityTypeClientResponse ;
	}
	
	@FindBy(xpath = "//label[text()='Final Approval ']//parent::td/input[1]")
	private WebElement FacilityTypeFinalApproval ;
	public WebElement FacilityType_FinalApproval () {
		return FacilityTypeFinalApproval ;
	}
	
	@FindBy(xpath = "//label[text()='Automatically Approve Facility If Within Limits ']//parent::td/input[1]")
	private WebElement FacilityTypeAutomaticallyApproveFacilityIfWithinLimits  ;
	public WebElement FacilityType_AutomaticallyApproveFacilityIfWithinLimits  () {
		return FacilityTypeAutomaticallyApproveFacilityIfWithinLimits  ;
	}
	
	@FindBy(xpath = "//label[text()='Credit Review ']//parent::td/input[1]")
	private WebElement FacilityTypeCreditReview ;
	public WebElement FacilityType_CreditReview () {
		return FacilityTypeCreditReview ;
	}
	
	@FindBy(xpath = "//label[text()='Issue Facility Offer ']//parent::td/input[1]")
	private WebElement FacilityTypeIssueFacilityOffer;
	public WebElement FacilityType_IssueFacilityOffer() {
		return FacilityTypeIssueFacilityOffer;
	}
	
	@FindBy(xpath = "//label[text()='Document Validation ']//parent::td/input[1]")
	private WebElement FacilityTypeDocumentValidation ;
	public WebElement FacilityType_DocumentValidation () {
		return FacilityTypeDocumentValidation ;
	}
	
	@FindBy(xpath = "//label[text()='Create Active Facility If Within Limits ']//parent::td/input[1]")
	private WebElement FacilityTypeCreateActiveFacilityIfWithinLimits ;
	public WebElement FacilityType_CreateActiveFacilityIfWithinLimits () {
		return FacilityTypeCreateActiveFacilityIfWithinLimits ;
	}
			      
	@FindBy(id = "fmsFacilityTypeMaintFormId_P008UP_Update_key")
	private WebElement FacilityTypeupdate;
	public WebElement FacilityType_update() {
		return FacilityTypeupdate;
	}
	
	@FindBy(xpath = "//a[@id='P008P']/span[2][text()='Approve']")
	private WebElement FacilityTypeApprovescreen;
	public WebElement FacilityType_Approvescreen() {
		return FacilityTypeApprovescreen;
	}
					 		  
	@FindBy(xpath = "//input[@id='fmsFacilityTypeListGridTbl_Id_P008P_gs_CODE']")
	private WebElement FacilityTypeApproveCode;
	public WebElement FacilityType_Approve_Code() {
		return FacilityTypeApproveCode;
	}
	/*
	@FindBy(id = "d_fmsFacilityTypeListGridTbl_Id_P008P_1_CODE")
	private WebElement FacilityTypeApproveSelectcode;
	public WebElement FacilityType_Approve_Selectcode() {
		return FacilityTypeApproveSelectcode;
	}
	*/
	
	@FindBy(xpath = "//label[@id='fmsFacilityTypeMaintFormId_P008P_approve_key' and text()='Approve ']")
	private WebElement FacilityTypeApproveApprove;
	public WebElement FacilityType_Approve_Approve() {
		return FacilityTypeApproveApprove;
	}
	
	//********************TestCase = @293656**************************//
	
	@FindBy(xpath = "//span[text()='Approval Committee']")
	private WebElement FacilityTypeUpdateAfterApproveApprovalcommittee;
	public WebElement FacilityType_UpdateAfterApprove_Approvalcommittee() {
		return FacilityTypeUpdateAfterApproveApprovalcommittee;
	}
	
	@FindBy(xpath = "//td[@id='add_FmsFacilityTypeApprovalcommitteeGrid_P008UP']/div/span")
	private WebElement FacilityTypeUpdateAfterApproveApprovalcommitteeAddnewrow;
	public WebElement Facilitytype_UpdateAfterApprove_Approvalcommittee_Addnewrow() {
		return FacilityTypeUpdateAfterApproveApprovalcommitteeAddnewrow;
	}
	
	@FindBy(id = "td_FmsFacilityTypeApprovalcommitteeGrid_P008UP_1_fmsFacilityTypeCommitteeVO.COMMITTE")
	private WebElement FacilityTypeUpdateAfterApproveApprovalcommitteeAddnewrowValue1;
	public WebElement Facilitytype_UpdateAfterApprove_Approvalcommittee_Addnewrow_Value1() {
		return FacilityTypeUpdateAfterApproveApprovalcommitteeAddnewrowValue1;
	}
	
	@FindBy(id = "new_1684484727867_fmsFacilityTypeCommitteeVO.COMMITTE_lookuptxt_FmsFacilityTypeApprovalcommitteeGrid_P008UP")
	private WebElement FacilityTypeUpdateAfterApproveApprovalcommitteeAddnewrowValue2;
	public WebElement Facilitytype_UpdateAfterApprove_Approvalcommittee_Addnewrow_Value2() {
		return FacilityTypeUpdateAfterApproveApprovalcommitteeAddnewrowValue2;
	}
	
	
	
	/*
	@FindBy(xpath = "(//td[@id='td_FmsFacilityTypeApprovalcommitteeGrid_P008UP_1_fmsFacilityTypeCommitteeVO.COMMITTE'])[1]")
	private WebElement FacilitytypeApprovalcommitteefield1;
	public WebElement Facilitytype_Approvalcommitteefield1() {
		return FacilitytypeApprovalcommitteefield1;
	}
	
	@FindBy(xpath = "(//td[@id='td_FmsFacilityTypeApprovalcommitteeGrid_P008UP_1_fmsFacilityTypeCommitteeVO.COMMITTE'])[1]")
	private WebElement FacilitytypeApprovalcommitteefieldAddvalue1;
	public WebElement Facilitytype_Approvalcommitteefield_Addvalue1() {
		return FacilitytypeApprovalcommitteefieldAddvalue1;
	}
	
	@FindBy(xpath = "(//td[@id='td_FmsFacilityTypeApprovalcommitteeGrid_P008UP_1_fmsFacilityTypeCommitteeVO.COMMITTE'])[2]")
	private WebElement FacilitytypeApprovalcommitteefield2;
	public WebElement Facilitytype_Approvalcommitteefield2() {
		return FacilitytypeApprovalcommitteefield2;
	}
	
	@FindBy(xpath = "(//td[@id='td_FmsFacilityTypeApprovalcommitteeGrid_P008UP_1_fmsFacilityTypeCommitteeVO.COMMITTE'])[2]")
	private WebElement FacilitytypeApprovalcommitteefieldAddvalue2;
	public WebElement Facilitytype_Approvalcommitteefield_Addvalue2() {
		return FacilitytypeApprovalcommitteefieldAddvalue2;
	}
	*/
	
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
	
	//-------------------------@293656_01-----------------------//
	
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
	private WebElement Applicationforfinancialfacilities;
	public WebElement Applicationforfinancialfacilities() {
		return Applicationforfinancialfacilities;
	}
	
	@FindBy(xpath = "//a[@id='WIFT001MT']//span[text()='Maintenance']")
	private WebElement Applicationforfinancialfacilities_maintenanace;
	public WebElement Applicationforfinancialfacilities_maintenanace() {
		return Applicationforfinancialfacilities_maintenanace;
	}
	
	@FindBy(id = "applicationFacilityApplicationfor_WIFT001MT")
	private WebElement MaintenanaceApplicationfor;
	public WebElement Maintenanace_Applicationfor() {
		return MaintenanaceApplicationfor;
	}
	
	@FindBy(id = "lookuptxt_applicationFacilitycif_WIFT001MT")
	private WebElement CifdetailsCifno;
	public WebElement Cifdetails_Cifno() {
		return CifdetailsCifno;
	}
	
	@FindBy(id = "lookuptxt_applicationFacilityFacilityType_WIFT001MT")
	private WebElement FacilitytypedetailsFacilitytype;
	public WebElement Facilitytypedetails_Facilitytype() {
		return FacilitytypedetailsFacilitytype;
	}
	
	@FindBy(id = "lookuptxt_applicationFacilityCountry_WIFT001MT")
	private WebElement FacilitytypedetailsCountryoffinancing;
	public WebElement Facilitytypedetails_Countryoffinancing() {
		return FacilitytypedetailsCountryoffinancing;
	}
	
	@FindBy(xpath = "//span[text()='Approval Committees']")
	private WebElement MaintenanceApprovalcommittees;
	public WebElement Maintenance_Approvalcommittees() {
		return MaintenanceApprovalcommittees;
	}
	//----------127780---------//
	
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
	private WebElement FacilityTypeUpdateAfterApproveCode;
	public WebElement FacilityType_UpdateAfterApprove_Code() {
		return FacilityTypeUpdateAfterApproveCode;
	}
	/*
	@FindBy(xpath = "//td[@id='td_fmsFacilityTypeListGridTbl_Id_P008UP_2_CODE' and text()='221']")
	private WebElement FacilityTypeUpdateAfterApproveSelectCode;
	public WebElement FacilityType_UpdateAfterApprove_SelectCode() {
		return FacilityTypeUpdateAfterApproveSelectCode;
	}
	*/
	@FindBy(xpath = "//li[@id='fmsFacilityTypeDetailsTab_P008UP']/a/span[text()='Facility Details']")
	private WebElement FacilityTypeUpdateAfterApproveFacilityDetails;
	public WebElement FacilityType_UpdateAfterApprove_FacilityDetails() {
		return FacilityTypeUpdateAfterApproveFacilityDetails;
	}
	
	@FindBy(xpath = "//span[text()='Application Requirements And Details']")
	private WebElement FacilityTypeUpdateAfterApproveFacilityDetailsApplicationRequirementsandDetails;
	public WebElement FacilityType_UpdateAfterApprove_FacilityDetails_ApplicationRequirementsandDetails() {
		return FacilityTypeUpdateAfterApproveFacilityDetailsApplicationRequirementsandDetails;
	}
	
	
	
	@FindBy(id = "fmsFacilityType_apply_corp_pkg_P008UP")
	private WebElement FacilityTypeUpdateAfterApproveFacilityDetailsApplicationRequirementsandDetailsApplyCorporatePackage;
	public WebElement FacilityType_UpdateAfterApprove_FacilityDetails_ApplicationRequirementsandDetails_ApplyCorporatePackage() {
		return FacilityTypeUpdateAfterApproveFacilityDetailsApplicationRequirementsandDetailsApplyCorporatePackage;
	}
	
	@FindBy(id = "fmsFacilityType_corp_pkg_allow_edit_at_app_P008UP")
	private WebElement FacilityTypeUpdateAfterApproveFacilityDetailsApplicationRequirementsandDetailsAllowtoEditApplication;
	public WebElement FacilityType_UpdateAfterApprove_FacilityDetails_ApplicationRequirementsandDetails_AllowtoEditApplication() {
		return FacilityTypeUpdateAfterApproveFacilityDetailsApplicationRequirementsandDetailsAllowtoEditApplication;
	}
	
	@FindBy(id = "fmsFacilityType_corp_pkg_allow_edit_rate_csm_P008UP")
	private WebElement FacilityTypeUpdateAfterApproveFacilityDetailsApplicationRequirementsandDetailsAllowtoeditCorporatePackageRate;
	public WebElement FacilityType_UpdateAfterApprove_FacilityDetails_ApplicationRequirementsandDetails_AllowtoeditCorporatePackageRate() {
		return FacilityTypeUpdateAfterApproveFacilityDetailsApplicationRequirementsandDetailsAllowtoeditCorporatePackageRate;
	}
	
	@FindBy(xpath = "//label[text()='Update ']")
	private WebElement ScrolltoUpdate;
	public WebElement ScrolltoUpdate() {
		return ScrolltoUpdate;
	}
	
	//**********************TestCase = @402668***************************//
	
	@FindBy(xpath = "//select[@name='fmsFacilityTypeCO.fmsFacilityTypeVO.REVOLVING_ONEOFF']")
	private WebElement FacilityTypeUpdateAfterApproveRevolvingOneOff ;
	public WebElement FacilityType_UpdateAfterApprove_RevolvingOneOff() {
		return FacilityTypeUpdateAfterApproveRevolvingOneOff;
	}
	
	@FindBy(xpath = "//input[@name='fmsFacilityTypeCO.fmsFacilityTypeVO.APPLY_REVOLVING_CONTROLS_YN']")
	private WebElement FacilityTypeUpdateAfterApproveApplyRevolvingControls ;
	public WebElement FacilityType_UpdateAfterApprove_ApplyRevolvingControls() {
		return FacilityTypeUpdateAfterApproveApplyRevolvingControls;
	}
		
	@FindBy(id = "fmsFacilityTypeMaxRevolvingTimes_P008UP")
	private WebElement FacilityTypeUpdateAfterApproveMaxRevolvingTimes ;
	public WebElement FacilityType_UpdateAfterApprove_MaxRevolvingTimes() {
		return FacilityTypeUpdateAfterApproveMaxRevolvingTimes;
	}
	
	@FindBy(id = "fmsFacilityTypeManualMinUtilPerc_P008UP")
	private WebElement FacilityTypeUpdateAfterApproveManualRevolvingMinimumUtilization ;
	public WebElement FacilityType_UpdateAfterApprove_ManualRevolvingMinimumUtilization() {
		return FacilityTypeUpdateAfterApproveManualRevolvingMinimumUtilization;
	}
	
	@FindBy(xpath = "//input[@name='fmsFacilityTypeCO.fmsFacilityTypeVO.SUBJECT_FULL_REPAYMENT_YN']")
	private WebElement FacilityTypeUpdateAfterApproveSubjecttoFullRepayment ;
	public WebElement FacilityType_UpdateAfterApprove_SubjecttoFullRepayment() {
		return FacilityTypeUpdateAfterApproveSubjecttoFullRepayment;
	}
	
	@FindBy(xpath = "//td[@id='td_fmsFacilityTypeListGridTbl_Id_P008P_1_CODE' and text()='221']")
	private WebElement FacilityTypeApproveSelectCode;
	public WebElement FacilityType_Approve_SelectCode() {
		return FacilityTypeApproveSelectCode;
	}
	
	//**********************TestCase = @402668_01***************************//
	
	@FindBy(xpath = "//td[text()='REQUEST FOR FINANCIN']")
	private WebElement FmsCoreREQUESTFORFINANCIN;
	public WebElement FmsCore_REQUESTFORFINANCIN() {
		return FmsCoreREQUESTFORFINANCIN;
	}
	
	@FindBy(xpath = "//td[text()='Request For Financing']")
	private WebElement FmsCoreREQUESTFORFINANCINRequestForFinancing;
	public WebElement FmsCore_REQUESTFORFINANCIN_RequestForFinancing() {
		return FmsCoreREQUESTFORFINANCINRequestForFinancing;
	}
	
	@FindBy(xpath = "//a[@id='CSMRF00MT']/span[text()='Maintenance']")
	private WebElement FmsCoreREQUESTFORFINANCINRequestForFinancingMaintenance;
	public WebElement FmsCore_REQUESTFORFINANCIN_RequestForFinancing_Maintenance() {
		return FmsCoreREQUESTFORFINANCINRequestForFinancingMaintenance;
	}
	
	@FindBy(id = "requestFinancingApplicationFor_CSMRF00MT")
	private WebElement FmsCoreREQUESTFORFINANCINRequestForFinancingMaintenanceReasonForSubmission;
	public WebElement FmsCore_REQUESTFORFINANCIN_RequestForFinancing_Maintenance_ReasonForSubmission() {
		return FmsCoreREQUESTFORFINANCINRequestForFinancingMaintenanceReasonForSubmission;
	}
	
	@FindBy(id = "lookuptxt_requestFinanacingCif_CSMRF00MT")
	private WebElement FmsCoreREQUESTFORFINANCINRequestForFinancingMaintenanceCustomer;
	public WebElement FmsCore_REQUESTFORFINANCIN_RequestForFinancing_Maintenance_Customer() {
		return FmsCoreREQUESTFORFINANCINRequestForFinancingMaintenanceCustomer;
	}
	
	@FindBy(xpath = "//span[@id='spanLookup_requestFinanacingCif_CSMRF00MT']/span")
	private WebElement FmsCoreREQUESTFORFINANCINRequestForFinancingMaintenanceCustomerSearch;
	public WebElement FmsCore_REQUESTFORFINANCIN_RequestForFinancing_Maintenance_Customer_Search() {
		return FmsCoreREQUESTFORFINANCINRequestForFinancingMaintenanceCustomerSearch;
	}
	
	@FindBy(id = "lookuptxt_requestFinancingFacilityType_CSMRF00MT")
	private WebElement FmsCoreREQUESTFORFINANCINRequestForFinancingMaintenanceFacilityType;
	public WebElement FmsCore_REQUESTFORFINANCIN_RequestForFinancing_Maintenance_FacilityType() {
		return FmsCoreREQUESTFORFINANCINRequestForFinancingMaintenanceFacilityType;
	}
	
	@FindBy(xpath = "//span[@id='spanLookup_requestFinancingFacilityType_CSMRF00MT']/span")
	private WebElement FmsCoreREQUESTFORFINANCINRequestForFinancingMaintenanceFacilityTypeSearch;
	public WebElement FmsCore_REQUESTFORFINANCIN_RequestForFinancing_Maintenance_FacilityTypeSearch() {
		return FmsCoreREQUESTFORFINANCINRequestForFinancingMaintenanceFacilityTypeSearch;
	}
	
	@FindBy(id = "requestFinancingRevolvingOneOff_CSMRF00MT")
	private WebElement FmsCoreREQUESTFORFINANCINRequestForFinancingMaintenanceRevolvingOneOff;
	public WebElement FmsCore_REQUESTFORFINANCIN_RequestForFinancing_Maintenance_RevolvingOneOff() {
		return FmsCoreREQUESTFORFINANCINRequestForFinancingMaintenanceRevolvingOneOff;
	}
	
	@FindBy(id = "requestFinancingMaxRevolvingTimes_CSMRF00MT")
	private WebElement FmsCoreREQUESTFORFINANCINRequestForFinancingMaintenanceMaxRevolvingTimes;
	public WebElement FmsCore_REQUESTFORFINANCIN_RequestForFinancing_Maintenance_MaxRevolvingTimes() {
		return FmsCoreREQUESTFORFINANCINRequestForFinancingMaintenanceMaxRevolvingTimes;
	}
	
	@FindBy(id = "requestFinancingSubjectFullRepaymentYN_CSMRF00MT")
	private WebElement FmsCoreREQUESTFORFINANCINRequestForFinancingMaintenanceSubjecttoFullRepayment;
	public WebElement FmsCore_REQUESTFORFINANCIN_RequestForFinancing_Maintenance_SubjecttoFullRepayment() {
		return FmsCoreREQUESTFORFINANCINRequestForFinancingMaintenanceSubjecttoFullRepayment;
	}
	
	@FindBy(id = "requestFinancingCurrentUtilization_CSMRF00MT")
	private WebElement FmsCoreREQUESTFORFINANCINRequestForFinancingMaintenanceCurrentUtilization;
	public WebElement FmsCore_REQUESTFORFINANCIN_RequestForFinancing_Maintenance_CurrentUtilization() {
		return FmsCoreREQUESTFORFINANCINRequestForFinancingMaintenanceCurrentUtilization;
	}
	
	@FindBy(id = "requestFinancingTotalApprovals_CSMRF00MT")
	private WebElement FmsCoreREQUESTFORFINANCINRequestForFinancingMaintenanceTotalApprovals;
	public WebElement FmsCore_REQUESTFORFINANCIN_RequestForFinancing_Maintenance_TotalApprovals() {
		return FmsCoreREQUESTFORFINANCINRequestForFinancingMaintenanceTotalApprovals;
	}
	
	//******************TestCase = @300125**************************//
	
	@FindBy(xpath = "//td[text()='Facilities Management']")
	private WebElement WifakapplictionWifakapplictionSubmenuFacilitiesManagement;
	public WebElement Wifakappliction_WifakapplictionSubmenu_FacilitiesManagement() {
		return WifakapplictionWifakapplictionSubmenuFacilitiesManagement;
	}
	
	@FindBy(xpath = "//span[text()='Query']")
	private WebElement WifakapplictionWifakapplictionSubmenuFacilitiesManagementQuery;
	public WebElement Wifakappliction_WifakapplictionSubmenu_FacilitiesManagement_Query() {
		return WifakapplictionWifakapplictionSubmenuFacilitiesManagementQuery;
	}
	
	@FindBy(xpath = "//input[@id='facilityManagementGridTbl_Id_WIFT008QY_gs_fmsFacilityVO.CODE']")
	private WebElement WifakapplictionWifakapplictionSubmenuFacilitiesManagementQueryCode;
	public WebElement Wifakappliction_WifakapplictionSubmenu_FacilitiesManagement_Query_Code() {
		return WifakapplictionWifakapplictionSubmenuFacilitiesManagementQueryCode;
	}
	
	@FindBy(xpath = "//td[@id='td_facilityManagementGridTbl_Id_WIFT008QY_1_fmsFacilityVO.CODE']")
	private WebElement WifakapplictionWifakapplictionSubmenuFacilitiesManagementQuerySelectCode;
	public WebElement Wifakappliction_WifakapplictionSubmenu_FacilitiesManagement_Query_SelectCode() {
		return WifakapplictionWifakapplictionSubmenuFacilitiesManagementQuerySelectCode;
	}
	
	@FindBy(xpath = "//span[text()='Facility Drawdown Details']")
	private WebElement WifakapplictionWifakapplictionSubmenuFacilitiesManagementQueryFacilityDrawdownDetails;
	public WebElement Wifakappliction_WifakapplictionSubmenu_FacilitiesManagement_Query_FacilityDrawdownDetails() {
		return WifakapplictionWifakapplictionSubmenuFacilitiesManagementQueryFacilityDrawdownDetails;
	}
	
	@FindBy(id = "facilityMgtDrowdawnUnutlizedAmtMmTotal_WIFT008QY")
	private WebElement WifakapplictionWifakapplictionSubmenuFacilitiesManagementQueryFacilityDrawdownDetailsUnutilizedAmount;
	public WebElement Wifakappliction_WifakapplictionSubmenu_FacilitiesManagement_Query_FacilityDrawdownDetails_UnutilizedAmount() {
		return WifakapplictionWifakapplictionSubmenuFacilitiesManagementQueryFacilityDrawdownDetailsUnutilizedAmount;
	}

}
