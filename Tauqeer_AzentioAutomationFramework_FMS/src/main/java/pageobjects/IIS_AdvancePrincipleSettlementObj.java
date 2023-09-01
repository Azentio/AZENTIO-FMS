package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IIS_AdvancePrincipleSettlementObj {
	WebDriver driver;
	public IIS_AdvancePrincipleSettlementObj(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//td[contains(text(),'Advance Principal Settlement')]")
	private WebElement IISAdvancePrincipleSettlementModule;
	public WebElement IISAdvancePrincipleSettlementModule() {
		return IISAdvancePrincipleSettlementModule;
	}
	
	@FindBy(xpath = "//span[contains(text(),'Maintenance')]")
	private WebElement IISAdvancePrincipleSettlement_Maintainence;
	public WebElement IISAdvancePrincipleSettlement_Maintainence() {
		return IISAdvancePrincipleSettlement_Maintainence;
	}
	
	@FindBy(xpath = "//input[@id='lookuptxt_dealNo_T036MT']")
	private WebElement IISAdvancePrincipleSettlement_DealNbr;
	public WebElement IISAdvancePrincipleSettlement_DealNbr() {
		return IISAdvancePrincipleSettlement_DealNbr;
	}
	
	@FindBy(xpath = "//button[@id='savebutton_T036MT']")
	private WebElement IISAdvancePrincipleSettlement_SaveBtn;
	public WebElement IISAdvancePrincipleSettlement_SaveBtn() {
		return IISAdvancePrincipleSettlement_SaveBtn;
	}
	
	@FindBy(xpath = "//span[text()='Approve']")
	private WebElement IISAdvancePrincipleSettlement_ApproveModule;
	public WebElement IISAdvancePrincipleSettlement_ApproveModule() {
		return IISAdvancePrincipleSettlement_ApproveModule;
	}
	
	@FindBy(xpath = "//input[@id='settlementMgmtGridTbl_Id_T036MT_gs_trssetlmtvo.SETTLEMENT_NBR']")
	private WebElement IISAdvancePrincipleSettlement_Approve_SearchSettlementNumber;
	public WebElement IISAdvancePrincipleSettlement_Approve_SearchSettlementNumber() {
		return IISAdvancePrincipleSettlement_Approve_SearchSettlementNumber;
	}
	
	@FindBy(xpath = "")        //pending xpath
	private WebElement IISAdvancePrincipleSettlement_Approve_ClickSettlementNumber;
	public WebElement IISAdvancePrincipleSettlement_Approve_ClickSettlementNumber() {
		return IISAdvancePrincipleSettlement_Approve_ClickSettlementNumber;
	}
	
	@FindBy(xpath = "//label[@id='settlementDefFormId_T036P_approve_key']")       //pending
	private WebElement IISAdvancePrincipleSettlement_Approve_ApproveSettlemenntNumberBtn;         //
	public WebElement IISAdvancePrincipleSettlement_Approve_ApproveSettlemenntNumberBtn() {
		return IISAdvancePrincipleSettlement_Approve_ApproveSettlemenntNumberBtn;
	}
	
	@FindBy(xpath = "//span[text()='Approve Reversal']")
	private WebElement IISAdvancePrincipleSettlement_ReversalModule;
	public WebElement IISAdvancePrincipleSettlement_ReversalModule() {
		return IISAdvancePrincipleSettlement_ReversalModule;
	}
	
	@FindBy(xpath = "//input[@id='settlementMgmtGridTbl_Id_T036MT_gs_trssetlmtvo.SETTLEMENT_NBR']")
	private WebElement IISAdvancePrincipleSettlement_Reversal_SearchSettlementNumber;
	public WebElement IISAdvancePrincipleSettlement_Reversal_SearchSettlementNumber() {
		return IISAdvancePrincipleSettlement_Reversal_SearchSettlementNumber;
	}
	
	@FindBy(xpath = "//tr[@id='1' and @tabindex='0']") //review
	private WebElement IISAdvancePrincipleSettlement_Reversal_ClickSettlementNumber;
	public WebElement IISAdvancePrincipleSettlement_Reversal_ClickSettlementNumber() {
		return IISAdvancePrincipleSettlement_Reversal_ClickSettlementNumber;
	}
	
	@FindBy(xpath = "//label[@id='settlementDefFormId_T036V_reverse_key']")
	private WebElement IISAdvancePrincipleSettlement_Reversal_ReverseSettlementNumberBtn;
	public WebElement IISAdvancePrincipleSettlement_Reversal_ReverseSettlementNumberBtn() {
		return IISAdvancePrincipleSettlement_Reversal_ReverseSettlementNumberBtn;
	}
	
	
	//Periodical process
	@FindBy(xpath = "//td[text()='Periodical Processing']")
	private WebElement IIS_periodical_processing_module;
	public WebElement IISPeriodicalProcessingModule() {
		return IIS_periodical_processing_module;
	}
	
	@FindBy(xpath = "//td[text()='Post Accruals']")
	private WebElement IIS_post_accruals_menu;
	public WebElement IISPostAccrualsMenu() {
		return IIS_post_accruals_menu;
	}
	
	@FindBy(xpath = "//a[@id='T10EMF']")
	private WebElement IIS_final_accruals_submenu;
	public WebElement IISFinalAccrualsSubMenu() {
		return IIS_final_accruals_submenu;
	}
	
	@FindBy(xpath = "//input[@id='Specific_deal_T10EMF']")
	private WebElement IIS_final_accruals_specific_deal_checkbox;
	public WebElement IISFinalAccrualsSpecificDealCheckbox() {
		return IIS_final_accruals_specific_deal_checkbox;
	}
	
	@FindBy(xpath = "//input[@id='lookuptxt_postChargeAccuralProcessSpecificDeal_T10EMF']")
	private WebElement IIS_final_accruals_specific_deal_input;
	public WebElement IISFinalAccrualsSpecificDealInput() {
		return IIS_final_accruals_specific_deal_input;
	}
	
	@FindBy(xpath = "//button[@id='postChargeAccrualProcess_trialRun_T10EMF']")
	private WebElement IIS_final_accruals_Ok_btn;
	public WebElement IISFinalAccrualsOkBtn() {
		return IIS_final_accruals_Ok_btn;
	}
	@FindBy(xpath = "//input[@id='_popup_path_sol_ok']")
	private WebElement IIS_success_popup_ok_btn;
	public WebElement IIS_SuccessPopupOkBtn(){
		return IIS_success_popup_ok_btn;
	}

}




















