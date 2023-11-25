
package pageobjects.fms;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

 public class AT_FM_002FACILITYMANAGMENT_OBJ {
		WebDriver driver;

		public AT_FM_002FACILITYMANAGMENT_OBJ(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
		
	@FindBy(xpath = "//*[@id=\"spanLookup_applicationfacilityLimitDetailsACC_Add_Det_WIFT001MT\"]/span")
	private WebElement AccountNo;
	public WebElement AccountNo() {
		return AccountNo;
	}
	@FindBy(xpath = "//*[@id=\"td_gridtab_applicationfacilityLimitDetailsACC_Add_Det_WIFT001MT_1_amfVO.BRANCH_CODE\"]")
	private WebElement AccountField;

	public WebElement AccountField() {
		return AccountField;
	}
	@FindBy(xpath = "//*[@id=\"applicationfacility_chargesdtls_btn_WIFT001MT\"]")
	private WebElement Chargedetail;

	public WebElement Chargedetail() {
		return Chargedetail;
	}
	@FindBy(xpath = "//*[@id=\"td_FacilityChargesGrid_WIFT001MT_0_rn\"]")
	private WebElement Recunderchargedetail;

	public WebElement Recunderchargedetail() {
		return Recunderchargedetail;
	}
	@FindBy(xpath = "//*[@id=\"1_fmsapplchargesVO.COLLECT_AT_FAC_APPROVAL\"]")
	private WebElement CollectAtFac;

	public WebElement CollectAtFac() {
		return CollectAtFac;
	}
	@FindBy(xpath = "//*[@id=\"new_1698468719063_fmsapplchargesVO.ALLOW_MODIFY_TFA_CHARGES_YN\"]")
	private WebElement AllowModifyTfa;

	public WebElement AllowModifyTfa() {
		return AllowModifyTfa;
	}
	@FindBy(xpath = "/html/body/div[34]/div[11]/div/button/span")
	private WebElement okbutton;

	public WebElement okbutton() {
		return okbutton;
	}

	@FindBy(xpath = "//*[@id=\"requestFinancingFormId_CSMRF00MT_save_key\"]")
	private WebElement savebuttonInRequestForFinancingScreenMaintenance;

	public WebElement savebuttonInRequestForFinancingScreenMaintenance() {
		return savebuttonInRequestForFinancingScreenMaintenance;
	}

	@FindBy(id = "_popup_path_sol_confirm_ok")
	private WebElement okButtonInConfirmationPopUp;

	public WebElement okButtonInConfirmationPopUp() {
		return okButtonInConfirmationPopUp;
	}

	@FindBy(id = "_popup_path_sol_confirm_ok")
	private WebElement okButtonInWarningPopUp;

	public WebElement okButtonInWarningPopUp() {
		return okButtonInWarningPopUp;
	}

	@FindBy(xpath = "//div[text()='Success']/parent::div/following-sibling::div/div")
	private WebElement getRequestIdInRequestForFinancingScreen;

	public WebElement getRequestIdInRequestForFinancingScreen() {
		return getRequestIdInRequestForFinancingScreen;
	}

	@FindBy(id = "_popup_path_sol_ok")
	private WebElement okButtonInSucessPopUp;

	public WebElement okButtonInSucessPopUp() {
		return okButtonInSucessPopUp;
	}

	@FindBy(id = "_popup_path_sol_ok")
	private WebElement okButtonInInformationPopUp;

	public WebElement okButtonInInformationPopUp() {
		return okButtonInInformationPopUp;
	}

	@FindBy(id = "requestForFinance_save_btn_CSMRF00MT")
	private WebElement validateButtonInRequestForFinancingScreen;

	public WebElement validateButtonInRequestForFinancingScreen() {
		return validateButtonInRequestForFinancingScreen;
	}

	@FindBy(xpath = "//input[@value='Yes ']")
	private WebElement confirmDoYouWantToProceedYes;

	public WebElement confirmDoYouWantToProceedYes() {
		return confirmDoYouWantToProceedYes;
	}

	@FindBy(id = "requestForFinance_save_btn_CSMRF00MT")
	private WebElement okButtonInSucesssPopUp;

	public WebElement okButtonInSucesssPopUp() {
		return okButtonInSucesssPopUp;
	}

	@FindBy(id = "CSMRF00P1")
	private WebElement approvalLevel1InRequestForFinancingScreen;

	public WebElement approvalLevel1InRequestForFinancingScreen() {
		return approvalLevel1InRequestForFinancingScreen;
	}

	@FindBy(id = "requestFinancingGridTbl_Id_CSMRF00P1_gs_fmsRequestFinancingVO.CODE")
	private WebElement searchApprovedFacilityRecordInApprovalLevel1;

	public WebElement searchApprovedFacilityRecordInApprovalLevel1() {
		return searchApprovedFacilityRecordInApprovalLevel1;
	}

	@FindBy(id = "td_requestFinancingGridTbl_Id_CSMRF00P1_1_fmsRequestFinancingVO.CODE")
	private WebElement selectApprovedFacilityRecordInApprovalLevel1;

	public WebElement selectApprovedFacilityRecordInApprovalLevel1() {
		return selectApprovedFacilityRecordInApprovalLevel1;
	}

	@FindBy(xpath = "//li[@id='customerGradingRecommendationsTab_CSMRF00P1']//child::span")
	private WebElement customerGradingRecommendation;

	public WebElement customerGradingRecommendation() {
		return customerGradingRecommendation;
	}

	@FindBy(xpath = "//label[text()='Decision ']//parent::td//following-sibling::td//Select[@id='requestDecisionForward_1_CSMRF00P1']")
	private WebElement selectDecisionInApprovalLevel1Reccommendation;

	public WebElement selectDecisionInApprovalLevel1Reccommendation() {
		return selectDecisionInApprovalLevel1Reccommendation;
	}

	@FindBy(xpath = "//label[text()='Decision ']//parent::td//following-sibling::td//Select[@id='requestDecisionForwardP1_CSMRF00P1']")
	private WebElement selectDecisionCommitteInApprovalLevel1Reccommendation;

	public WebElement selectDecisionCommitteInApprovalLevel1Reccommendation() {
		return selectDecisionCommitteInApprovalLevel1Reccommendation;
	}

	@FindBy(id = "requestP1approvalCommitte_CSMRF00P1")
	private WebElement selectApprovalCommitteInApprovalLevel1Reccommendation;

	public WebElement selectApprovalCommitteInApprovalLevel1Reccommendation() {
		return selectApprovalCommitteInApprovalLevel1Reccommendation;
	}

	@FindBy(xpath = "//button[@id='requestForFinance_approve_btn_CSMRF00P1']")
	private WebElement approveButtonInApprovalLevel1;

	public WebElement approveButtonInApprovalLevel1() {
		return approveButtonInApprovalLevel1;
	}

	@FindBy(xpath = "//*[@id=\"_selenuimWIFT008\"]/li/a")
	private WebElement FACILITYMANAGMENT;

	public WebElement FACILITYMANAGMENT() {
		return FACILITYMANAGMENT;
	}
	@FindBy(xpath = "//*[@id=\"WIFT008MT\"]")
	private WebElement MAINTANANCEUNDERFACILITYMANAGMENT;

	public WebElement MAINTANANCEUNDERFACILITYMANAGMENT() {
		return MAINTANANCEUNDERFACILITYMANAGMENT;
	}
	@FindBy(xpath = "//*[@id=\"infoBarSearchButton_WIFT008MT\"]")
	private WebElement SEARCHUNDERFACILITYMANAGMENT;

	public WebElement SEARCHUNDERFACILITYMANAGMENT() {
		return SEARCHUNDERFACILITYMANAGMENT;
	}
	
	@FindBy(xpath = "//*[@id=\"facilityManagementGridTbl_Id_WIFT008MT_gs_fmsFacilityVO.FROM_APPLICATION\"]")
	private WebElement Apllicationref;

	public WebElement Apllicationref() {
		return Apllicationref;
	}
	
	@FindBy(xpath = "//*[@id=\"td_facilityManagementGridTbl_Id_WIFT008MT_1_fmsFacilityVO.FROM_APPLICATION\"]")
	private WebElement doubleclick;

	public WebElement doubleclick() {
		return doubleclick;
	}
	@FindBy(xpath = "//*[@id=\"facilityMangementJVDetails_btn_WIFT008MT\"]")
	private WebElement journalvoucher;

	public WebElement journalvoucher() {
		return journalvoucher;
	}
	@FindBy(xpath = "//*[@id=\"gview_facManagementAccountJvList_Id_WIFT008MT\"]/div[3]")
	private WebElement validatedetail;

	public WebElement validatedetail() {
		return validatedetail;
	}
	
}
