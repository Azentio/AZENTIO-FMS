package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IIS_SettlementObj {
	WebDriver driver;

	public IIS_SettlementObj(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="_selenuimT06")
	private WebElement IIS_SettlementSection;
	public WebElement IIS_SettlementSection() {
		return IIS_SettlementSection;
	}
	@FindBy(id="T06MT")
	private WebElement IIS_Settlement_Maintenance;
	public WebElement IIS_Settlement_Maintenance() {
		return IIS_Settlement_Maintenance;
	}
	@FindBy(id="settlementTab1_T06MT")
	private WebElement IIS_Settlement_Maintenance_SettlementDetailsTab;
	public WebElement IIS_Settlement_Maintenance_SettlementDetailsTab() {
		return IIS_Settlement_Maintenance_SettlementDetailsTab;
	}
	@FindBy(id="settlementTab2_T06MT")
	private WebElement IIS_Settlement_Maintenance_SheduleDetailsTab;
	public WebElement IIS_Settlement_Maintenance_SheduleDetailsTab() {
		return IIS_Settlement_Maintenance_SheduleDetailsTab;
	}
	@FindBy(id="lookuptxt_dealNo_T06MT")
	private WebElement IIS_Settlement_Maintenance_DealNbrField;
	public WebElement IIS_Settlement_Maintenance_DealNbrField() {
		return IIS_Settlement_Maintenance_DealNbrField;
	}
	@FindBy(id="crossCyPartyAmount_T06MT")
	private WebElement IIS_Settlement_Maintenance_AmountReceivedFromPartyField;
	public WebElement IIS_Settlement_Maintenance_AmountReceivedFromPartyField() {
		return IIS_Settlement_Maintenance_AmountReceivedFromPartyField;
	}
	@FindBy(id="savebutton_T06MT")
	private WebElement IIS_Settlement_Maintenance_SaveButton;
	public WebElement IIS_Settlement_Maintenance_SaveButton() {
		return IIS_Settlement_Maintenance_SaveButton;
	}
	
	//Approve
	@FindBy(id="T06P")
	private WebElement IIS_Settlement_Approve;
	public WebElement IIS_Settlement_Approve() {
		return IIS_Settlement_Approve;
	}
	@FindBy(id="settlementMgmtGridTbl_Id_T06P_gs_trssetlmtvo.SETTLEMENT_NBR")
	private WebElement IIS_Settlement_Approve_SettlementNbrSearchField;
	public WebElement IIS_Settlement_Approve_SettlementNbrSearchField() {
		return IIS_Settlement_Approve_SettlementNbrSearchField;
	}
	@FindBy(id="td_settlementMgmtGridTbl_Id_T06P_1_trssetlmtvo.SETTLEMENT_NBR")
	private WebElement IIS_Settlement_Approve_FirstRecord;
	public WebElement IIS_Settlement_Approve_FirstRecord() {
		return IIS_Settlement_Approve_FirstRecord;
	}
	@FindBy(id="settlementDefFormId_T06P_approve_key")
	private WebElement IIS_Settlement_Approve_ApproveButton;
	public WebElement IIS_Settlement_Approve_ApproveButton() {
		return IIS_Settlement_Approve_ApproveButton;
	}
	@FindBy(id="settlementMgmtGridTbl_Id_T06P_gs_trssetlmtvo.DEAL_NBR")
	private WebElement IIS_Settlement_Approve_DealNbrSearchField;
	public WebElement IIS_Settlement_Approve_DealNbrSearchField() {
		return IIS_Settlement_Approve_DealNbrSearchField;
	}
	
	// Investment Deals - Combined without trade deal
	@FindBy(id="infoBarSearchButton_T022MT")
	private WebElement IIS_CombinedWithoutTradeDeal_SearchButton;
	public WebElement IIS_CombinedWithoutTradeDeal_SearchButton() {
		return IIS_CombinedWithoutTradeDeal_SearchButton;
	}
	@FindBy(id="investmentDealsGridTbl_Id_T022MT_gs_trsdealVO.SERIAL_NO")
	private WebElement IIS_CombinedWithoutTradeDeal_DealNoSearchField;
	public WebElement IIS_CombinedWithoutTradeDeal_DealNoSearchField() {
		return IIS_CombinedWithoutTradeDeal_DealNoSearchField;
	}
	@FindBy(id="td_investmentDealsGridTbl_Id_T022MT_1_trsdealVO.SERIAL_NO")
	private WebElement IIS_CombinedWithoutTradeDeal_FirstRecord;
	public WebElement IIS_CombinedWithoutTradeDeal_FirstRecord() {
		return IIS_CombinedWithoutTradeDeal_FirstRecord;
	}
	@FindBy(id="pmtInstrBtn_T022MT")
	private WebElement IIS_CombinedWithoutTradeDeal_PaymentInstructionsButton;
	public WebElement IIS_CombinedWithoutTradeDeal_PaymentInstructionsButton() {
		return IIS_CombinedWithoutTradeDeal_PaymentInstructionsButton;
	}
	@FindBy(id="showJVD_btn_T022MT")
	private WebElement IIS_CombinedWithoutTradeDeal_PaymentInstructions_JournalVoucherDetails;
	public WebElement IIS_CombinedWithoutTradeDeal_PaymentInstructions_JournalVoucherDetails() {
		return IIS_CombinedWithoutTradeDeal_PaymentInstructions_JournalVoucherDetails;
	}
	

}
