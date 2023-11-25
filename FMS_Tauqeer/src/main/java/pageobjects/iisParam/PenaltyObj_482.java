package pageobjects.iisParam;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PenaltyObj_482 {
	WebDriver driver;
	public PenaltyObj_482(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//div[@id='_selenuimM00']//td[contains(text(),'Parameters')]")
	private WebElement IIS_Params_Menu;
	public WebElement IIS_Params_Menu() {
		return IIS_Params_Menu;
	}
	
	@FindBy(xpath = "//div[@id='_selenuimM068']//td[contains(text(),'Penalty')]")
	private WebElement iis_penalty_Sub_Menu;
	public WebElement iis_penalty_Sub_Menu() {
		return iis_penalty_Sub_Menu;
	}
	
	@FindBy(xpath = "//select[@id='penaltyType_M068MT']")
	private WebElement iis_Select_Penalty_Type;
	public WebElement iis_Select_Penalty_Type() {
		return iis_Select_Penalty_Type;
	}
	
	@FindBy(xpath = "//a[@id='M068MT']")
	private WebElement iis_Penalty_Maintenance;
	public WebElement iis_Penalty_Maintenance() {
		return iis_Penalty_Maintenance;
	}
	
	@FindBy(xpath = "//input[@id='applyYieldRateInAdditionToPenaltyRate_M068MT']")
	private WebElement iis_Penalty_Apply_Yield_Rate_In_Addition_To_Panalty_Rate;
	public WebElement iis_Penalty_Apply_Yield_Rate_In_Addition_To_Panalty_Rate() {
		return iis_Penalty_Apply_Yield_Rate_In_Addition_To_Panalty_Rate;
	}
	
	@FindBy(xpath = "//input[@id='gracePeriodDaysForPenaltyDue_M068MT']")
	private WebElement iis_Grace_Period_Days_For_Penalty_Due;
	public WebElement iis_Grace_Period_Days_For_Penalty_Due() {
		return iis_Grace_Period_Days_For_Penalty_Due;
	}
	
	@FindBy(xpath = "//a[@id='Settlement / Maintenance']/parent::td/following::td/span")
	private WebElement iis_Settlement_Close_Icon;
	public WebElement iis_Settlement_Close_Icon() {
		return iis_Settlement_Close_Icon;
	}
	
	@FindBy(xpath = "//a[@id='infoBarSearchButton_T06MT']")
	private WebElement iis_Settlement_Maintenance_SearchInfoBar;
	public WebElement iis_Settlement_Maintenance_SearchInfoBar() {
		return iis_Settlement_Maintenance_SearchInfoBar;
	}
	
	@FindBy(xpath = "//*[@id='lookuptxt_dealNo_T06MT']")
	private WebElement iis_Settlement_SearchDealNo;
	public WebElement iis_Settlement_SearchDealNo() {
		return iis_Settlement_SearchDealNo;
	}
	
	@FindBy(xpath = "//*[@id='allowSettlePenaltyOnlyYN_T06MT']")
	private WebElement iis_Settlement_AllowToSettlePenalty;
	public WebElement iis_Settlement_AllowToSettlePenalty() {
		return iis_Settlement_AllowToSettlePenalty;
	}
	//required tag
	//readonly tag
	@FindBy(xpath = "//*[@id='crossCyPartyAmount_T06MT']")
	private WebElement iis_Settlement_AmountReceivedFromParty;
	public WebElement iis_Settlement_AmountReceivedFromParty() {
		return iis_Settlement_AmountReceivedFromParty;
	}
	
	// Settlement Charges Tab
	// aria-disabled tag 
	@FindBy(xpath = "//*[@id='settlementChargeButton_T06MT']")
	private WebElement iis_Settlement_SettlementChargesTab;
	public WebElement iis_Settlement_SettlementChargesTab() {
		return iis_Settlement_SettlementChargesTab;
	}
}
