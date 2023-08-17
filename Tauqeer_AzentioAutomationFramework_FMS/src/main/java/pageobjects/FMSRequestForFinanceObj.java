package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FMSRequestForFinanceObj {
	WebDriver driver;

	public FMSRequestForFinanceObj(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	
	
	@FindBy(xpath="//td[text()='Request']")
	private WebElement Request;

	public WebElement Request() {
		return Request;
	}
	@FindBy(xpath="//td[text()='Request Financing']")
	private WebElement RequestFinance;

	public WebElement RequestFinance() {
		return RequestFinance;
	}
	
	@FindBy(xpath="//td[text()='Request For Financing']")
	private WebElement RequestForFinance;

	public WebElement RequestForFinance() {
		return RequestForFinance;
	}
	
	@FindBy(xpath="//span[text()='Maintenance']")
	private WebElement RequestForFinance_Maintenance;

	public WebElement RequestForFinance_Maintenance() {
		return RequestForFinance_Maintenance;
	}
	
	@FindBy(xpath="//select[@id='requestFinancingApplicationFor_RFFRF00MT']")
	private WebElement RequestForFinance_ReasonForSubmission;

	public WebElement RequestForFinance_ReasonForSubmission() {
		return RequestForFinance_ReasonForSubmission;
	}
	
	@FindBy(xpath="//input[@id='lookuptxt_requestFinanacingCif_RFFRF00MT']")
	private WebElement RequestForFinance_Customer;

	public WebElement RequestForFinance_Customer() {
		return RequestForFinance_Customer;
	}

	@FindBy(xpath="//input[@id='lookuptxt_requestFinancingFacilityType_RFFRF00MT']")
	private WebElement RequestForFinance_FacilityType;

	public WebElement RequestForFinance_FacilityType() {
		return RequestForFinance_FacilityType;
	}
	@FindBy(xpath="//span[@id='spanLookup_requestFinancingFacilityType_RFFRF00MT']")
	private WebElement RequestForFinance_FacilityTypeSearch;

	public WebElement RequestForFinance_FacilityTypeSearch() {
		return RequestForFinance_FacilityTypeSearch;
	}
	@FindBy(xpath="//input[@id='requestFinancingFacilityTotalvalue_RFFRF00MT']")
	private WebElement RequestForFinance_TotalLimit;

	public WebElement RequestForFinance_TotalLimit() {
		return RequestForFinance_TotalLimit;
	}
	@FindBy(xpath="//input[@id='reqFinancingLimitDownpaymentperc_RFFRF00MT']")
	private WebElement RequestForFinance_Downpayment;

	public WebElement RequestForFinance_Downpayment() {
		return RequestForFinance_Downpayment;
	}
	@FindBy(xpath="//span[text()='Disbursement/Sublimit']")
	private WebElement RequestForFinance_DisbursmentSubmit;

	public WebElement RequestForFinance_DisbursmentSubmit() {
		return RequestForFinance_DisbursmentSubmit;
	}
	@FindBy(xpath="//td[@id='add_RequestFinancingLimitDetailsGridId_RFFRF00MT']")
	private WebElement RequestForFinance_AddNewRow;

	public WebElement RequestForFinance_AddNewRow() {
		return RequestForFinance_AddNewRow;
	}
	
	@FindBy(xpath="//input[@id='lookuptxt_requestFinancingLimitDetailsGeneralFacilityProductClass_RFFRF00MT']")
	private WebElement RequestForFinance_ProductClass;

	public WebElement RequestForFinance_ProductClass() {
		return RequestForFinance_ProductClass;
	}
	
	@FindBy(xpath="//input[@id='requestFinancingLimitDetailsRfNewMargin_RFFRF00MT']")
	private WebElement RequestForFinance_Yield;

	public WebElement RequestForFinance_Yield() {
		return RequestForFinance_Yield;
	}
	
	@FindBy(xpath = "//label[@id='requestFinancingFormId_RFFRF00MT_save_key']")
	private WebElement RequestForFinance_Save  ;

	public WebElement RequestForFinance_Save() {
		return RequestForFinance_Save;
	}
	@FindBy(xpath = "//input[@id='_popup_path_sol_confirm_ok']")
	private WebElement RequestForFinance_Save_ConfrimationPopUp  ;

	public WebElement RequestForFinance_Save_ConfrimationPopUp() {
		return RequestForFinance_Save_ConfrimationPopUp;
	}
	
	@FindBy(xpath = "//input[@id='_popup_path_sol_ok']")
	private WebElement RequestForFinance_Save_successnPopUp  ;

	public WebElement RequestForFinance_Save_successnPopUp() {
		return RequestForFinance_Save_successnPopUp;
	}
	@FindBy(xpath = "//label[@id='requestFinancingFormId_RFFRF00MT_Validate_key']")
	private WebElement RequestForFinance_Validate  ;

	public WebElement RequestForFinance_Validate() {
		return RequestForFinance_Validate;
	}
	@FindBy(xpath="//button[@id='limitDetails_add_btn_CSMRF00MT']")
	private WebElement RequestForFinance_AddIt;

	public WebElement RequestForFinance_AddIt() {
		return RequestForFinance_AddIt;
	}
	
	
	@FindBy(xpath="//span[text()='Approve Level 1']")
	private WebElement RequestForFinance_ApproveLevel1;

	public WebElement RequestForFinance_ApproveLevel1() {
		return RequestForFinance_ApproveLevel1;
	}
	@FindBy(xpath="//td[text()='Clear']")
	private WebElement RequestForFinance_ApproveLevel1_clear;

	public WebElement RequestForFinance_ApproveLevel1_clear() {
		return RequestForFinance_ApproveLevel1_clear;
	}
	@FindBy(xpath="//td[@id='td_requestFinancingGridTbl_Id_RFFRF00P1_1_fmsRequestFinancingVO.CODE']")
	private WebElement RequestForFinance_ApproveLevel1_Firstrecord;

	public WebElement RequestForFinance_ApproveLevel1_Firstrecord() {
		return RequestForFinance_ApproveLevel1_Firstrecord;
	}
	
	@FindBy(xpath="(//span[text()='Customer Grading & Recommendations'])[1]")
	private WebElement RequestForFinance_ApproveLevel1_CustomerGradingRecommendations;

	public WebElement RequestForFinance_ApproveLevel1_CustomerGradingRecommendations() {
		return RequestForFinance_ApproveLevel1_CustomerGradingRecommendations;
	}
	//Forward 
	
	@FindBy(xpath="//select[@id='requestDecisionForward_1_RFFRF00P1']")
	private WebElement RequestForFinance_Decision;

	public WebElement RequestForFinance_Decision() {
		return RequestForFinance_Decision;
	}
	
	@FindBy(xpath="//select[@id='requestDecisionForwardP1_RFFRF00P1']")
	private WebElement RequestForFinance_Decision_LimitCreation;

	public WebElement RequestForFinance_Decision_LimitCreation() {
		return RequestForFinance_Decision_LimitCreation;
	}
	
	@FindBy(xpath="//label[@id='requestFinancingFormId_RFFRF00P1_approve_key']")
	private WebElement RequestForFinance_ApproveButton;

	public WebElement RequestForFinance_ApproveButton() {
		return RequestForFinance_ApproveButton;
	}
	
	@FindBy(xpath="//input[@id='_popup_path_sol_confirm_ok']")
	private WebElement RequestForFinance_Approveconfirm_ok;

	public WebElement RequestForFinance_Approveconfirm_ok() {
		return RequestForFinance_Approveconfirm_ok;
	}
	
	@FindBy(xpath="//span[contains(text(),'Limit Creation')]")
	private WebElement RequestForFinance_LimitCreation;

	public WebElement RequestForFinance_LimitCreation() {
		return RequestForFinance_LimitCreation;
	}
	
	@FindBy(xpath="(//td[text()='Clear'])[3]")
	private WebElement RequestForFinance_LimitCreation_Clear;

	public WebElement RequestForFinance_LimitCreation_Clear() {
		return RequestForFinance_LimitCreation_Clear;
	}
	@FindBy(xpath="//td[@id='td_requestFinancingGridTbl_Id_RFFRF00LC_1_fmsRequestFinancingVO.CODE']")
	private WebElement RequestForFinance_LimitCreation_FirstRecord;

	public WebElement RequestForFinance_LimitCreation_FirstRecord() {
		return RequestForFinance_LimitCreation_FirstRecord;
	}
	
	@FindBy(xpath="//label[@id='requestFinancingFormId_RFFRF00LC_Limit_Create_key']")
	private WebElement RequestForFinance_LimitCreateButton;

	public WebElement RequestForFinance_LimitCreateButton() {
		return RequestForFinance_LimitCreateButton;
	}
	@FindBy(xpath="//input[@id='_popup_path_sol_confirm_ok']")
	private WebElement RequestForFinance_LimitCreate_confrimPopUp;

	public WebElement RequestForFinance_LimitCreate_confrimPopUp() {
		return RequestForFinance_LimitCreate_confrimPopUp;
	}
	
	@FindBy(xpath="//input[@id='_popup_path_sol_ok']")
	private WebElement RequestForFinance_LimitCreate_successPopUp;

	public WebElement RequestForFinance_LimitCreate_successPopUp() {
		return RequestForFinance_LimitCreate_successPopUp;
	}
	

}
