package pageobjects.iisParam;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SettlementPolicyObj {

	WebDriver driver;

	public SettlementPolicyObj(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//td[normalize-space()='Settlement Policy']")
	private WebElement iis_Settlement_Policy_Module;

	public WebElement iisSettlementPolicyModule() {
		return iis_Settlement_Policy_Module;
	}
	
	@FindBy(xpath = "//a[@id='M024MT']//span[contains(text(),'Maintenance')]")
	private WebElement iis_Settlement_Policy_Maintenence;

	public WebElement iisSettlementPolicyMaintenence() {
		return iis_Settlement_Policy_Maintenence;
	}
	
	@FindBy(xpath = "//input[@id='policy_no_M024MT']")
	private WebElement iis_Settlement_Policy_Maintenence_Policy_No_Feild;

	public WebElement iisSettlementPolicyMaintenencePolicyNoFeild() {
		return iis_Settlement_Policy_Maintenence_Policy_No_Feild;
	}
	
	@FindBy(xpath = "//input[@id='policy_description_M024MT']")
	private WebElement iis_Settlement_Policy_Maintenence_Policy_Description_Feild;

	public WebElement iisSettlementPolicyMaintenencePolicyDescriptionFeild() {
		return iis_Settlement_Policy_Maintenence_Policy_Description_Feild;
	}
	
	@FindBy(xpath = "//div[normalize-space()='INFORMATION']")
	private WebElement iis_Information_PopUp;

	public WebElement iisInformationPopUp() {
		return iis_Information_PopUp;
	}
	
	@FindBy(xpath = "//label[@id='settlementPolicyFormId_M024MT_Save_key']")
	private WebElement iis_Settlement_Policy_Maintenence_Policy_Save_Button;

	public WebElement iisSettlementPolicyMaintenencePolicyNoSaveButton() {
		return iis_Settlement_Policy_Maintenence_Policy_Save_Button;
	}
	
	@FindBy(xpath = "//body[1]/div[@id='div__popup_path_sol_ok']/div[1]/div[2]/a[1]")
	private WebElement iis_Error_Pop_up_Dismiss_Btn;

	public WebElement iisErrorPopupDismissBtn() {
		return iis_Error_Pop_up_Dismiss_Btn;
	}
	
	@FindBy(xpath = "//div[@id='div__popup_path_sol_ok']")
	private WebElement iis_Error_Pop_up;

	public WebElement iisErrorPopup() {
		return iis_Error_Pop_up;
	}
	
	//input[@id='_popup_path_sol_ok']
	@FindBy(xpath = "//div[@id='div__popup_path_sol_ok']")
	private WebElement iis_Error_Pop_Up_Ok_Btn;

	public WebElement iisErrorPopUpOkBtn() {
		return iis_Error_Pop_Up_Ok_Btn;
	}
	
	@FindBy(xpath = "//a[@id='addNewGridRec_M024MT']")
	private WebElement New_Buton;

	public WebElement NewButon() {
		return New_Buton;
	}
	
	@FindBy(xpath = "//a[@id='infoBarSearchButton_M024MT']")
	private WebElement iis_Search_Buton;

	public WebElement iisSearchButon() {
		return iis_Search_Buton;
	}
	
	
	@FindBy(xpath = "//input[@id='settlementPolicyListGridTbl_Id_M024MT_gs_trsSETTLPOLICYVO.SP_NO']")
	private WebElement iis_Grid_Policy_No_Feild;

	public WebElement iisGridPolicyNoFeild() {
		return iis_Grid_Policy_No_Feild;
	}
	
	@FindBy(xpath = "//td[@id='td_settlementPolicyListGridTbl_Id_M024MT_1_trsSETTLPOLICYVO.SP_NO']")
	private WebElement iis_Grid_Retrived_Rec;

	public WebElement iisGridRetrivedRec() {
		return iis_Grid_Retrived_Rec;
	}
	
	@FindBy(xpath = "//td[normalize-space()='Update After Approval']")
	private WebElement iis_Settlement_Policy_Update_After_Approval;

	public WebElement iisSettlementPolicyUpdateAfterApprova() {
		return iis_Settlement_Policy_Update_After_Approval;
	}
	
	@FindBy(xpath = "//span[normalize-space()='Approve']")
	private WebElement iis_Settlement_Policy_Approve ;

	public WebElement iisSettlementPolicyApprove() {
		return iis_Settlement_Policy_Approve;
	}
	
	@FindBy(xpath = "//span[normalize-space()='Suspend']")
	private WebElement iis_Settlement_Policy_Suspend;

	public WebElement iisSettlementPolicySuspend() {
		return iis_Settlement_Policy_Suspend;
	}
	
	@FindBy(xpath = "//span[normalize-space()='Reject']")
	private WebElement iis_Settlement_Policy_Reject;

	public WebElement iisSettlementPolicyReject() {
		return iis_Settlement_Policy_Reject;
	}
	
	@FindBy(xpath = "//span[normalize-space()='Reactivate']")
	private WebElement iis_Settlement_Policy_Reactivate;

	public WebElement iisSettlementPolicyReactivate() {
		return iis_Settlement_Policy_Reactivate;
	}
	
	@FindBy(xpath = "//div[@class='ui-pg-div']//span[@class='ui-icon ui-icon-search']")
	private WebElement iis_Settlement_Policy_Sorting_Icon_Btn;

	public WebElement iisSettlementPolicySortingIconBtn() {
		return iis_Settlement_Policy_Sorting_Icon_Btn;
	}
	
	
	@FindBy(xpath = "//a[@id='fbox_settlementPolicyListGridTbl_Id_M024MT_search']")
	private WebElement iis_Settlement_Policy_Sorting_Find_Icon_Btn;

	public WebElement iisSettlementPolicySortingFindIconBtn() {
		return iis_Settlement_Policy_Sorting_Find_Icon_Btn;
	}
	
	
	@FindBy(xpath = "//input[@id='status_M024MT']")
	private WebElement iis_Settlement_Policy_Current_Status;

	public WebElement iisSettlementPolicyCurrentStatus() {
		return iis_Settlement_Policy_Current_Status;
	}

}
